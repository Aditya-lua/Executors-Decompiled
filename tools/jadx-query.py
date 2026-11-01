#!/usr/bin/env python3
"""Query the modern JADX engine (jadx-mcp) over its MCP stdio transport.

The 1.1.0 JADX CLI bundled for bulk export is old; the ``jadx-mcp`` fat JAR
carries a current JADX core and exposes it as MCP tools. This script drives
that server from a plain terminal so classes, methods, smali, manifest and
resources can be read without a GUI or an MCP client.

Examples
--------
    ./jadx-query.py target.apk list --package com.axjava
    ./jadx-query.py target.apk search "System.loadLibrary" --in code
    ./jadx-query.py target.apk class com.axjava.Main
    ./jadx-query.py target.apk method com.axjava.Main Start
    ./jadx-query.py target.apk manifest
    ./jadx-query.py target.apk export --out work/jadx-modern

Environment: ``RE_JADX_MCP_JAR`` (or ``$HOME/.local/re/lib/jadx-mcp.jar``)
and ``JAVA_HOME``/``java`` on PATH.
"""

from __future__ import annotations

import argparse
import json
import os
import queue
import shutil
import subprocess
import sys
import threading
from pathlib import Path

DEFAULT_JAR = Path(os.environ.get("RE_JADX_MCP_JAR", "")) if os.environ.get("RE_JADX_MCP_JAR") else None
FALLBACK_JAR = Path.home() / ".local" / "re" / "lib" / "jadx-mcp.jar"


def find_java() -> str:
    java_home = os.environ.get("JAVA_HOME")
    if java_home:
        candidate = Path(java_home) / "bin" / "java"
        if candidate.exists():
            return str(candidate)
    found = shutil.which("java")
    if not found:
        sys.exit("java not found: set JAVA_HOME or put java on PATH (source tools/env.sh)")
    return found


def find_jar() -> Path:
    jar = DEFAULT_JAR or FALLBACK_JAR
    if not jar.exists():
        sys.exit(f"jadx-mcp jar not found at {jar}; set RE_JADX_MCP_JAR")
    return jar


class JadxMcp:
    """Minimal newline-delimited JSON-RPC client for the jadx-mcp server."""

    def __init__(self, apk: Path) -> None:
        self.proc = subprocess.Popen(
            [find_java(), "-jar", str(find_jar()), "--file", str(apk), "--transport", "stdio"],
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True,
            bufsize=1,
        )
        self._id = 0
        self._responses: "queue.Queue[dict]" = queue.Queue()
        self._stderr: list[str] = []
        threading.Thread(target=self._reader, daemon=True).start()
        threading.Thread(target=self._err_reader, daemon=True).start()
        self._request(
            "initialize",
            {
                "protocolVersion": "2024-11-05",
                "capabilities": {},
                "clientInfo": {"name": "re-jadx-query", "version": "1"},
            },
        )
        self._notify("notifications/initialized", {})

    def _reader(self) -> None:
        assert self.proc.stdout is not None
        for line in self.proc.stdout:
            line = line.strip()
            if not line:
                continue
            try:
                self._responses.put(json.loads(line))
            except json.JSONDecodeError:
                continue  # server logs occasionally land here

    def _err_reader(self) -> None:
        assert self.proc.stderr is not None
        for line in self.proc.stderr:
            self._stderr.append(line)
            del self._stderr[:-400]

    def _send(self, payload: dict) -> None:
        assert self.proc.stdin is not None
        self.proc.stdin.write(json.dumps(payload) + "\n")
        self.proc.stdin.flush()

    def _notify(self, method: str, params: dict) -> None:
        self._send({"jsonrpc": "2.0", "method": method, "params": params})

    def _request(self, method: str, params: dict) -> dict:
        self._id += 1
        self._send({"jsonrpc": "2.0", "id": self._id, "method": method, "params": params})
        while True:
            msg = self._responses.get(timeout=600)
            if msg.get("id") == self._id:
                if "error" in msg:
                    raise RuntimeError(msg["error"].get("message") or msg["error"])
                return msg.get("result", {})

    def tool(self, name: str, **arguments) -> str:
        result = self._request("tools/call", {"name": name, "arguments": arguments})
        chunks = []
        for item in result.get("content", []):
            if item.get("type") == "text":
                chunks.append(item.get("text", ""))
            else:
                chunks.append(json.dumps(item))
        text = "\n".join(chunks)
        if result.get("isError"):
            raise RuntimeError(text)
        return text

    def close(self) -> None:
        self.proc.kill()
        self.proc.wait(timeout=10)

    def __enter__(self) -> "JadxMcp":
        return self

    def __exit__(self, *_exc) -> None:
        self.close()


def package_path(class_name: str) -> Path:
    parts = class_name.split(".")
    return Path(*parts[:-1]) / f"{parts[-1]}.java"


def cmd_list(client: JadxMcp, args) -> None:
    offset = 0
    out: list[str] = []
    while True:
        text = client.tool(
            "list_classes",
            package=args.package or "",
            query=args.search or "",
            limit=args.limit,
            offset=offset,
        )
        out.append(text)
        if args.once:
            break
        if text.count("\n") + 1 < args.limit:
            break
        offset += args.limit
    print("\n".join(out))


def cmd_export(client: JadxMcp, args) -> None:
    out_dir = Path(args.out)
    out_dir.mkdir(parents=True, exist_ok=True)
    offset = 0
    written = failed = 0
    while True:
        listing = client.tool(
            "list_classes",
            package=args.package or "",
            query="",
            limit=args.batch,
            offset=offset,
        )
        names = [
            line.strip()
            for line in listing.splitlines()
            if line.strip() and " " not in line.strip() and "." in line and not line.strip().startswith("#")
        ]
        if not names:
            break
        for name in names:
            try:
                source = client.tool("get_class_source", **{"class": name})
            except Exception as exc:  # noqa: BLE001 - per-class failures are recorded, not fatal
                failed += 1
                (out_dir / "_failures.txt").open("a").write(f"{name}\t{exc}\n")
                continue
            target = out_dir / package_path(name)
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_text(source)
            written += 1
            if written % 100 == 0:
                print(f"  {written} classes -> {out_dir}", file=sys.stderr)
        offset += args.batch
        if len(names) < args.batch:
            break
    print(f"exported {written} classes ({failed} failed) to {out_dir}", file=sys.stderr)


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    parser.add_argument("apk", type=Path)
    sub = parser.add_subparsers(dest="command", required=True)

    p_list = sub.add_parser("list", help="list classes")
    p_list.add_argument("--package", default="")
    p_list.add_argument("--search", default="")
    p_list.add_argument("--limit", type=int, default=200)
    p_list.add_argument("--once", action="store_true", help="single page only")
    p_list.set_defaults(func=cmd_list)

    p_search = sub.add_parser("search", help="search class/method/field/code/comment")
    p_search.add_argument("query")
    p_search.add_argument("--in", dest="search_in", default="code",
                          help="class,method,field,code,comment (comma-separated)")
    p_search.add_argument("--package", default="")
    p_search.add_argument("--limit", type=int, default=40)

    p_class = sub.add_parser("class", help="decompiled source of one class")
    p_class.add_argument("name")
    p_class.add_argument("--smali", action="store_true")

    p_method = sub.add_parser("method", help="decompiled body of one method")
    p_method.add_argument("name")
    p_method.add_argument("method_name")

    p_methods = sub.add_parser("methods", help="methods declared by a class")
    p_methods.add_argument("name")

    p_fields = sub.add_parser("fields", help="fields declared by a class")
    p_fields.add_argument("name")

    p_xrefs = sub.add_parser("xrefs", help="references to a class, method or field")
    p_xrefs.add_argument("--class", dest="cls", default="")
    p_xrefs.add_argument("--method", default="")
    p_xrefs.add_argument("--field", default="")

    sub.add_parser("manifest", help="decoded AndroidManifest.xml")
    sub.add_parser("info", help="decompiler information")

    p_strings = sub.add_parser("strings", help="res/values/strings.xml")
    p_strings.add_argument("--limit", type=int, default=4000)

    p_export = sub.add_parser("export", help="bulk-export decompiled sources")
    p_export.add_argument("--out", required=True)
    p_export.add_argument("--package", default="")
    p_export.add_argument("--batch", type=int, default=500)
    p_export.set_defaults(func=cmd_export)

    args = parser.parse_args()

    with JadxMcp(args.apk) as client:
        if args.command == "search":
            print(client.tool("search_code", query=args.query, search_in=args.search_in,
                              package=args.package, limit=args.limit))
        elif args.command == "class":
            tool = "get_smali_of_class" if args.smali else "get_class_source"
            print(client.tool(tool, **{"class": args.name}))
        elif args.command == "method":
            print(client.tool("get_method_code", **{"class": args.name, "method": args.method_name}))
        elif args.command == "methods":
            print(client.tool("get_methods_of_class", **{"class": args.name}))
        elif args.command == "fields":
            print(client.tool("get_fields_of_class", **{"class": args.name}))
        elif args.command == "xrefs":
            if args.cls:
                print(client.tool("get_xrefs_to_class", **{"class": args.cls}))
            elif args.method:
                cls, _, meth = args.method.partition("#")
                print(client.tool("get_xrefs_to_method", **{"class": cls, "method": meth}))
            elif args.field:
                cls, _, fld = args.field.partition("#")
                print(client.tool("get_xrefs_to_field", **{"class": cls, "field": fld}))
            else:
                parser.error("xrefs needs --class, --method or --field")
        elif args.command == "manifest":
            print(client.tool("get_manifest"))
        elif args.command == "info":
            print(client.tool("get_info"))
        elif args.command == "strings":
            print(client.tool("get_strings", limit=args.limit, offset=0))
        else:
            args.func(client, args)


if __name__ == "__main__":
    try:
        main()
    except RuntimeError as error:
        sys.exit(str(error))
    except KeyboardInterrupt:
        sys.exit(130)
