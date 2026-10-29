#!/usr/bin/env python3
"""Bulk structured pseudocode lift for Delta's ARM64 Mach-O."""

from __future__ import annotations
import argparse, json, logging, multiprocessing as mp, os, traceback
from pathlib import Path

_PROJECT = None


def worker_init(binary: str) -> None:
    global _PROJECT
    import angr
    logging.getLogger().setLevel(logging.CRITICAL)
    for name in ("angr", "cle", "pyvex"):
        logging.getLogger(name).setLevel(logging.CRITICAL)
    _PROJECT = angr.Project(binary, auto_load_libs=False)


def decompile_one(task: tuple[int, int, int, str]) -> dict:
    index, start, end, out_dir = task
    size = end - start
    rel = Path(f"{start >> 20:02x}") / f"sub_{start:08x}.c"
    dst = Path(out_dir) / rel
    result = {"index": index, "start": f"0x{start:x}", "end": f"0x{end:x}",
              "size": size, "path": str(rel), "status": "error"}
    try:
        cfg = _PROJECT.analyses.CFGFast(
            regions=[(start, end)], function_starts=[start], start_at_entry=False,
            symbols=False, function_prologues=False, force_complete_scan=False,
            resolve_indirect_jumps=False, data_references=False, normalize=True,
            exceptions=False, eh_frame=False, eh_frame_boundaries=False,
            detect_tail_calls=False)
        function = cfg.functions.get(start)
        if function is None:
            raise RuntimeError("CFG did not create the requested function")
        decomp = _PROJECT.analyses.Decompiler(function, cfg=cfg.model)
        if decomp.codegen is None or not decomp.codegen.text:
            raise RuntimeError("structured code generator returned no text")
        header = ("/*\n * Machine-reconstructed pseudocode; not original vendor source.\n"
                  f" * Mach-O extent: 0x{start:x}..0x{end:x} ({size} bytes).\n"
                  " * Function and variable names are synthetic unless documented elsewhere.\n */\n\n")
        dst.parent.mkdir(parents=True, exist_ok=True)
        dst.write_text(header + decomp.codegen.text.rstrip() + "\n", encoding="utf-8")
        result.update(status="ok", blocks=len(list(function.blocks)),
                      cyclomatic_complexity=function.cyclomatic_complexity,
                      output_bytes=dst.stat().st_size)
    except BaseException as exc:
        dst.parent.mkdir(parents=True, exist_ok=True)
        detail = "".join(traceback.format_exception_only(type(exc), exc)).strip()
        dst.write_text("/* Structured decompilation failed for this extent.\n"
                       f" * address: 0x{start:x}..0x{end:x}\n * reason: {detail}\n"
                       " * Consult lifted-src/low-level for the instruction-faithful form.\n */\n")
        result.update(error=detail, output_bytes=dst.stat().st_size)
    return result


def integer(value: str) -> int:
    return int(value, 0)


def main() -> int:
    p = argparse.ArgumentParser()
    p.add_argument("--binary", required=True); p.add_argument("--inventory", required=True)
    p.add_argument("--output", required=True); p.add_argument("--manifest", required=True)
    p.add_argument("--jobs", type=int, default=max(1, min(6, os.cpu_count() or 1)))
    p.add_argument("--min-address", type=integer, default=0)
    p.add_argument("--max-address", type=integer, default=(1 << 64) - 1)
    p.add_argument("--max-size", type=integer, default=0x4000)
    p.add_argument("--limit", type=int)
    args = p.parse_args()
    record = json.loads(Path(args.inventory).read_text())["records"][0]
    starts = [int(x, 16) for x in record["function_starts"]]
    text = next(s for s in record["sections"] if s["section"] == "__text")
    text_end = int(text["address"], 16) + int(text["size"])
    tasks, skipped = [], []
    for index, (start, end) in enumerate(zip(starts, starts[1:] + [text_end])):
        if not args.min_address <= start < args.max_address: continue
        if end - start > args.max_size:
            skipped.append({"index": index, "start": f"0x{start:x}", "end": f"0x{end:x}",
                            "size": end-start, "status": "size-fallback"})
        else: tasks.append((index, start, end, args.output))
    if args.limit is not None: tasks = tasks[:args.limit]
    Path(args.output).mkdir(parents=True, exist_ok=True)
    results = []
    with mp.get_context("spawn").Pool(args.jobs, initializer=worker_init,
                                       initargs=(args.binary,)) as pool:
        for n, result in enumerate(pool.imap_unordered(decompile_one, tasks, chunksize=1), 1):
            results.append(result)
            if n == 1 or n % 100 == 0 or n == len(tasks):
                ok = sum(x["status"] == "ok" for x in results)
                print(f"[{n}/{len(tasks)}] structured={ok} failed={n-ok}", flush=True)
    results.extend(skipped); results.sort(key=lambda x: int(x["start"], 16))
    summary = {"format": "Delta ARM64 structured pseudocode manifest v1",
               "binary": str(Path(args.binary)),
               "range": [f"0x{args.min_address:x}", f"0x{args.max_address:x}"],
               "max_structured_size": args.max_size, "selected": len(results),
               "structured_ok": sum(x["status"] == "ok" for x in results),
               "structured_failed": sum(x["status"] == "error" for x in results),
               "size_fallback": sum(x["status"] == "size-fallback" for x in results),
               "functions": results}
    Path(args.manifest).write_text(json.dumps(summary, indent=2) + "\n")
    return 0


if __name__ == "__main__": raise SystemExit(main())
