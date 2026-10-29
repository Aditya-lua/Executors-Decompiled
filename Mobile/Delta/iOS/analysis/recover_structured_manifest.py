#!/usr/bin/env python3
"""Rebuild the structured-lift manifest from durable per-function outputs."""

from __future__ import annotations
import argparse, json, re
from pathlib import Path


def main() -> int:
    p = argparse.ArgumentParser(); p.add_argument("--inventory", required=True)
    p.add_argument("--functions", required=True); p.add_argument("--output", required=True)
    p.add_argument("--max-size", type=lambda x:int(x,0), default=0x4000)
    a = p.parse_args(); rec=json.loads(Path(a.inventory).read_text())["records"][0]
    starts=[int(x,16) for x in rec["function_starts"]]
    text=next(s for s in rec["sections"] if s["section"]=="__text")
    text_end=int(text["address"],16)+int(text["size"]); root=Path(a.functions)
    items=[]
    for index,(start,end) in enumerate(zip(starts,starts[1:]+[text_end])):
        size=end-start
        if size>a.max_size:
            items.append({"index":index,"start":f"0x{start:x}","end":f"0x{end:x}",
                          "size":size,"status":"size-fallback"}); continue
        rel=Path(f"{start >> 20:02x}")/f"sub_{start:08x}.c"; path=root/rel
        base={"index":index,"start":f"0x{start:x}","end":f"0x{end:x}",
              "size":size,"path":str(rel)}
        if not path.is_file():
            base.update(status="error", error="structured timeout cutoff after bulk pass")
        else:
            text_value=path.read_text(errors="replace")
            if text_value.startswith("/* Structured decompilation failed"):
                match=re.search(r"^ \* reason: (.*)$",text_value,re.MULTILINE)
                base.update(status="error",error=match.group(1) if match else "structured decompilation failed")
            else:
                base.update(status="ok",output_bytes=path.stat().st_size)
        items.append(base)
    summary={"format":"Delta ARM64 structured pseudocode manifest v1 (recovered)",
             "max_structured_size":a.max_size,"selected":len(items),
             "structured_ok":sum(x["status"]=="ok" for x in items),
             "structured_failed":sum(x["status"]=="error" for x in items),
             "size_fallback":sum(x["status"]=="size-fallback" for x in items),
             "functions":items}
    Path(a.output).write_text(json.dumps(summary,indent=2)+"\n")
    print(json.dumps({k:summary[k] for k in ("selected","structured_ok","structured_failed","size_fallback")},indent=2))
    missing=[x["start"] for x in items if x.get("error","").startswith("structured timeout")]
    print("timeout addresses:"," ".join(missing))
    return 0


if __name__ == "__main__": raise SystemExit(main())
