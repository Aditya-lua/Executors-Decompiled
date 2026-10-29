#!/usr/bin/env python3
"""Conservative constant propagation for strings assembled before ARM64 calls."""

from __future__ import annotations
import argparse, json
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_MEM, ARM64_OP_REG

MASK=(1<<64)-1; STACK=0x7fff00000000


def reg(md, rid):
    name=md.reg_name(rid)
    if name=="wsp": return "sp"
    return "x"+name[1:] if name.startswith("w") and name[1:].isdigit() else name


def value(md, op, regs):
    if op.type==ARM64_OP_IMM: result=op.imm & MASK
    elif op.type==ARM64_OP_REG:
        name=reg(md,op.reg)
        if name in {"xzr","wzr"}: result=0
        elif name in regs: result=regs[name]
        else: return None
    else: return None
    shift=getattr(getattr(op,"shift",None),"value",0) & 63
    kind=int(getattr(getattr(op,"shift",None),"type",0))
    if shift:
        if kind==1: result <<= shift
        elif kind==3: result >>= shift
    return result & MASK


def cstring(memory, address, limit=256):
    out=bytearray()
    for off in range(limit):
        pos=address+off
        byte=(memory[pos] if isinstance(memory,(bytes,bytearray)) and 0<=pos<len(memory)
              else memory.get(pos) if isinstance(memory,dict) else None)
        if byte is None: return None
        if byte==0: break
        if byte not in b"\t\r\n" and not 0x20<=byte<=0x7e: return None
        out.append(byte)
    else: return None
    return out.decode("ascii") if len(out)>=3 else None


def main() -> int:
    p=argparse.ArgumentParser(); p.add_argument("binary",type=Path); p.add_argument("inventory",type=Path)
    p.add_argument("output",type=Path); p.add_argument("--min-address",type=lambda x:int(x,0),default=0)
    p.add_argument("--max-address",type=lambda x:int(x,0),default=(1<<64)-1)
    a=p.parse_args(); image=a.binary.read_bytes(); rec=json.loads(a.inventory.read_text())["records"][0]
    starts=[int(x,16) for x in rec["function_starts"]]
    text=next(x for x in rec["sections"] if x["section"]=="__text")
    text_end=int(text["address"],16)+int(text["size"])
    md=Cs(CS_ARCH_ARM64,CS_MODE_ARM); md.detail=True; md.skipdata=True
    records=[]; seen=set(); processed=0
    for start,end in zip(starts,starts[1:]+[text_end]):
        if not a.min_address<=start<a.max_address: continue
        processed+=1; regs={"sp":STACK}; stack={}
        for insn in md.disasm(image[start:end],start):
            if insn.mnemonic==".byte": continue
            ops=insn.operands; produced=None; m=insn.mnemonic
            if m in {"adr","adrp"} and len(ops)>=2 and ops[0].type==ARM64_OP_REG and ops[1].type==ARM64_OP_IMM:
                produced=(reg(md,ops[0].reg),ops[1].imm&MASK)
            elif m in {"mov","movz","movn"} and len(ops)>=2 and ops[0].type==ARM64_OP_REG:
                v=value(md,ops[1],regs)
                if v is not None: produced=(reg(md,ops[0].reg),(~v if m=="movn" else v)&MASK)
            elif m=="movk" and len(ops)>=2 and ops[0].type==ARM64_OP_REG:
                name=reg(md,ops[0].reg); old=regs.get(name)
                if old is not None and ops[1].type==ARM64_OP_IMM:
                    shift=getattr(getattr(ops[1],"shift",None),"value",0)&63; mask=0xffff<<shift
                    produced=(name,(old&~mask)|((ops[1].imm&0xffff)<<shift))
            elif m in {"add","sub","eor","orr","and","mul","lsl","lsr"} and len(ops)>=3 and ops[0].type==ARM64_OP_REG:
                l=value(md,ops[1],regs); r=value(md,ops[2],regs)
                if l is not None and r is not None:
                    v={"add":lambda:l+r,"sub":lambda:l-r,"eor":lambda:l^r,"orr":lambda:l|r,
                       "and":lambda:l&r,"mul":lambda:l*r,"lsl":lambda:l<<(r&63),"lsr":lambda:l>>(r&63)}[m]()
                    produced=(reg(md,ops[0].reg),v&MASK)
            elif m.startswith("ldr") and len(ops)>=2 and ops[0].type==ARM64_OP_REG and ops[1].type==ARM64_OP_MEM:
                base=regs.get(reg(md,ops[1].mem.base))
                if base is not None:
                    addr=(base+ops[1].mem.disp)&MASK; width=4 if md.reg_name(ops[0].reg).startswith("w") else 8
                    raw=(bytes(stack.get(addr+i,0) for i in range(width)) if STACK-0x100000<=addr<STACK+0x100000
                         else image[addr:addr+width].ljust(width,b"\0") if addr<len(image) else b"\0"*width)
                    produced=(reg(md,ops[0].reg),int.from_bytes(raw,"little"))
            if m in {"str","strb","strh"} and len(ops)>=2 and ops[1].type==ARM64_OP_MEM:
                v=value(md,ops[0],regs); base=regs.get(reg(md,ops[1].mem.base))
                if v is not None and base is not None:
                    addr=(base+ops[1].mem.disp)&MASK
                    width=1 if m=="strb" else 2 if m=="strh" else 4 if ops[0].type==ARM64_OP_REG and md.reg_name(ops[0].reg).startswith("w") else 8
                    for i,b in enumerate(v.to_bytes(8,"little")[:width]): stack[addr+i]=b
            if m in {"bl","blr"}:
                for arg in range(8):
                    ptr=regs.get(f"x{arg}")
                    if ptr is None: continue
                    source="stack" if STACK-0x100000<=ptr<STACK+0x100000 else "image" if ptr<len(image) else ""
                    text_value=cstring(stack if source=="stack" else image,ptr) if source else None
                    key=(start,insn.address,arg,text_value)
                    if text_value and key not in seen:
                        seen.add(key); records.append({"function":f"0x{start:x}","callsite":f"0x{insn.address:x}",
                            "argument":arg,"source":source,"value":text_value})
            try: _,written=insn.regs_access()
            except Exception: written=[]
            keep=produced[0] if produced else None
            for rid in written:
                name=reg(md,rid)
                if name!=keep: regs.pop(name,None)
            if produced: regs[produced[0]]=produced[1]
        if processed%200==0: print(f"[{processed}] candidates={len(records)}",flush=True)
    a.output.write_text(json.dumps({"format":"Delta transient call-argument strings v1",
        "range":[f"0x{a.min_address:x}",f"0x{a.max_address:x}"],"function_count":processed,
        "count":len(records),"records":records},indent=2)+"\n")
    print(json.dumps({"functions":processed,"candidates":len(records)},indent=2)); return 0


if __name__=="__main__": raise SystemExit(main())
