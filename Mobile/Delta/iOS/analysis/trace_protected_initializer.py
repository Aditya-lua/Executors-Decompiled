#!/usr/bin/env python3
"""Trace one protected Mach-O initializer with inert import shims.

The target runs only in Unicorn.  Imports are redirected to local shims; no
host syscall, Objective-C runtime, network, filesystem, or Security API is
invoked.  The tracer is intended to expose internal call/branch structure and
decoded writable state, not to reproduce the app's runtime environment.
"""

from __future__ import annotations

import argparse
import json
from pathlib import Path

from unicorn import (
    Uc, UcError, UC_ARCH_ARM64, UC_HOOK_CODE, UC_HOOK_MEM_INVALID, UC_MODE_ARM,
)
from unicorn.arm64_const import (
    UC_ARM64_REG_LR, UC_ARM64_REG_PC, UC_ARM64_REG_SP,
    UC_ARM64_REG_X0, UC_ARM64_REG_X1, UC_ARM64_REG_X2,
    UC_ARM64_REG_X3, UC_ARM64_REG_X4, UC_ARM64_REG_X5,
    UC_ARM64_REG_X6, UC_ARM64_REG_X7,
)


PAGE = 0x1000
STACK = 0x2000000
STACK_SIZE = 0x200000
SENTINEL = 0x2200000
SHIMS = 0x2300000
SHIM_SIZE = 0x10000
HEAP = 0x3000000
HEAP_SIZE = 0x2000000


def integer(value: int | str) -> int:
    return int(value, 0) if isinstance(value, str) else value


def down(value: int) -> int:
    return value & ~(PAGE - 1)


def up(value: int) -> int:
    return (value + PAGE - 1) & ~(PAGE - 1)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("binary", type=Path)
    parser.add_argument("inventory", type=Path)
    parser.add_argument("address", type=lambda v: int(v, 0))
    parser.add_argument("output_prefix", type=Path)
    parser.add_argument("--data-const", type=Path)
    parser.add_argument("--data", type=Path)
    parser.add_argument("--max-instructions", type=int, default=10_000_000)
    args = parser.parse_args()

    binary = args.binary.read_bytes()
    record = json.loads(args.inventory.read_text())["records"][0]
    uc = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
    mapped = []
    for segment in record["segments"]:
        vmaddr = integer(segment["vmaddr"])
        vmsize = integer(segment["vmsize"])
        fileoff = integer(segment["fileoff"])
        filesize = integer(segment["filesize"])
        if not vmsize:
            continue
        start, end = down(vmaddr), up(vmaddr + vmsize)
        if not any(start < e and end > s for s, e in mapped):
            uc.mem_map(start, end - start)
            mapped.append((start, end))
        if filesize:
            uc.mem_write(vmaddr, binary[fileoff:fileoff + filesize])

    if args.data_const:
        uc.mem_write(0xE5C000, args.data_const.read_bytes())
    if args.data:
        uc.mem_write(0xF00000, args.data.read_bytes())

    uc.mem_map(STACK, STACK_SIZE)
    uc.mem_map(SENTINEL, PAGE)
    uc.mem_map(SHIMS, SHIM_SIZE)
    uc.mem_map(HEAP, HEAP_SIZE)
    uc.mem_write(SENTINEL, b"\xc0\x03\x5f\xd6")
    uc.reg_write(UC_ARM64_REG_SP, STACK + STACK_SIZE - PAGE)

    function_starts = {integer(v) for v in record["function_starts"]}
    direct_stubs = {integer(v["address"]): v["symbol"] for v in record["stubs"]}
    got_entries = record.get("indirect_pointers", [])
    shim_symbols = {}
    for index, item in enumerate(got_entries):
        shim = SHIMS + index * 0x10
        symbol = item["symbol"]
        shim_symbols[shim] = symbol
        uc.mem_write(shim, b"\xc0\x03\x5f\xd6")
        uc.mem_write(integer(item["address"]), shim.to_bytes(8, "little"))

    heap_cursor = HEAP

    def allocate(size: int, alignment: int = 16) -> int:
        nonlocal heap_cursor
        size = max(size, 1)
        heap_cursor = (heap_cursor + alignment - 1) & -alignment
        result = heap_cursor
        heap_cursor += size
        if heap_cursor > HEAP + HEAP_SIZE:
            raise RuntimeError("emulated heap exhausted")
        return result

    fake_image_paths = []
    for raw in (
        b"/private/var/containers/Bundle/Application/APP/Delta.app/Roblox\0",
        b"/System/Library/Frameworks/Foundation.framework/Foundation\0",
        b"/private/var/containers/Bundle/Application/APP/Delta.app/libgloop.dylib\0",
        b"/private/var/containers/Bundle/Application/APP/Delta.app/Frameworks/RobloxLib.framework/RobloxLib\0",
    ):
        pointer = allocate(len(raw))
        uc.mem_write(pointer, raw)
        fake_image_paths.append(pointer)

    calls = []
    entries = []
    import_counts: dict[str, int] = {}
    invalid = []
    stopped_reason = None
    instruction_count = 0
    argument_registers = (
        UC_ARM64_REG_X0, UC_ARM64_REG_X1, UC_ARM64_REG_X2, UC_ARM64_REG_X3,
        UC_ARM64_REG_X4, UC_ARM64_REG_X5, UC_ARM64_REG_X6, UC_ARM64_REG_X7,
    )

    def read_cstring(local_uc: Uc, pointer: int, limit: int = 256) -> str | None:
        if not pointer:
            return None
        try:
            raw = bytearray()
            for offset in range(limit):
                value = bytes(local_uc.mem_read(pointer + offset, 1))
                if value == b"\0":
                    break
                byte = value[0]
                if byte not in b"\t\r\n" and not 0x20 <= byte < 0x7f:
                    return None
                raw.append(byte)
            else:
                return None
            return raw.decode("ascii") if len(raw) >= 3 else None
        except UcError:
            return None

    def capture_arguments(local_uc: Uc) -> tuple[list[int], dict[str, str]]:
        values = [local_uc.reg_read(item) for item in argument_registers]
        strings = {}
        for index, pointer in enumerate(values):
            decoded = read_cstring(local_uc, pointer)
            if decoded is not None:
                strings[f"x{index}"] = decoded
        return values, strings

    def return_from_import(local_uc: Uc) -> None:
        local_uc.reg_write(UC_ARM64_REG_PC, local_uc.reg_read(UC_ARM64_REG_LR))

    def handle_import(local_uc: Uc, symbol: str) -> None:
        nonlocal stopped_reason
        import_counts[symbol] = import_counts.get(symbol, 0) + 1
        x0 = local_uc.reg_read(UC_ARM64_REG_X0)
        x1 = local_uc.reg_read(UC_ARM64_REG_X1)
        x2 = local_uc.reg_read(UC_ARM64_REG_X2)
        try:
            if symbol == "__dyld_image_count":
                local_uc.reg_write(UC_ARM64_REG_X0, len(fake_image_paths))
            elif symbol == "__dyld_get_image_name":
                index = x0
                local_uc.reg_write(UC_ARM64_REG_X0,
                                   fake_image_paths[index] if index < len(fake_image_paths) else 0)
            elif symbol == "__dyld_get_image_vmaddr_slide":
                local_uc.reg_write(UC_ARM64_REG_X0, 0)
            elif symbol == "__dyld_get_image_header":
                local_uc.reg_write(UC_ARM64_REG_X0, 0x4000 if x0 == 2 else 0)
            elif symbol in {"___chkstk_darwin", "___cxa_atexit", "___cxa_guard_release",
                          "___cxa_guard_abort", "_free", "__ZdlPv", "__ZdaPv"}:
                if symbol == "___cxa_atexit":
                    local_uc.reg_write(UC_ARM64_REG_X0, 0)
            elif symbol == "___cxa_guard_acquire":
                local_uc.reg_write(UC_ARM64_REG_X0, 1)
            elif symbol in {"_malloc", "__Znwm", "__Znam", "__ZnwmRKSt9nothrow_t",
                            "__ZnwmSt11align_val_t"}:
                local_uc.reg_write(UC_ARM64_REG_X0, allocate(x0))
            elif symbol == "_mmap":
                pointer = allocate(x1, PAGE)
                local_uc.mem_write(pointer, b"\0" * x1)
                local_uc.reg_write(UC_ARM64_REG_X0, pointer)
            elif symbol in {"_mprotect", "_munmap"}:
                local_uc.reg_write(UC_ARM64_REG_X0, 0)
            elif symbol == "_calloc":
                ptr = allocate(x0 * x1)
                local_uc.mem_write(ptr, b"\0" * (x0 * x1))
                local_uc.reg_write(UC_ARM64_REG_X0, ptr)
            elif symbol == "_realloc":
                ptr = allocate(x1)
                if x0:
                    local_uc.mem_write(ptr, bytes(local_uc.mem_read(x0, x1)))
                local_uc.reg_write(UC_ARM64_REG_X0, ptr)
            elif symbol in {"_memcpy", "_memmove", "___memcpy_chk", "___memmove_chk"}:
                local_uc.mem_write(x0, bytes(local_uc.mem_read(x1, x2)))
            elif symbol in {"_memset", "___memset_chk"}:
                local_uc.mem_write(x0, bytes([x1 & 0xFF]) * x2)
            elif symbol == "_bzero":
                local_uc.mem_write(x0, b"\0" * x1)
            elif symbol == "_strlen":
                length = 0
                while local_uc.mem_read(x0 + length, 1) != b"\0":
                    length += 1
                    if length > 0x100000:
                        raise RuntimeError("unbounded emulated strlen")
                local_uc.reg_write(UC_ARM64_REG_X0, length)
            elif symbol == "___stack_chk_fail":
                stopped_reason = "stack check failed"
                local_uc.emu_stop()
                return
            else:
                # Inert object/syscall shim. Returning a unique valid pointer is
                # more useful for constructors than returning NULL.
                local_uc.reg_write(UC_ARM64_REG_X0, allocate(0x100))
        except (UcError, RuntimeError) as exc:
            stopped_reason = f"import {symbol} failed: {exc}"
            local_uc.emu_stop()
            return
        return_from_import(local_uc)

    def code_hook(local_uc: Uc, address: int, size: int, _: object) -> None:
        nonlocal instruction_count, stopped_reason
        instruction_count += 1
        if address == SENTINEL:
            stopped_reason = "returned"
            local_uc.emu_stop()
            return
        symbol = direct_stubs.get(address) or shim_symbols.get(address)
        if symbol is not None:
            registers, cstrings = capture_arguments(local_uc)
            calls.append({
                "at_instruction": instruction_count,
                "target": f"0x{address:x}",
                "symbol": symbol,
                "arguments": [f"0x{value:x}" for value in registers],
                "cstring_arguments": cstrings,
            })
            handle_import(local_uc, symbol)
            return
        if address in function_starts:
            if not entries or entries[-1]["address"] != f"0x{address:x}":
                registers, cstrings = capture_arguments(local_uc)
                entry = {
                    "at_instruction": instruction_count,
                    "address": f"0x{address:x}",
                    "arguments": [f"0x{value:x}" for value in registers],
                    "cstring_arguments": cstrings,
                }
                entries.append(entry)

    def invalid_hook(local_uc: Uc, access: int, address: int, size: int, value: int, _: object) -> bool:
        nonlocal stopped_reason
        pc = local_uc.reg_read(UC_ARM64_REG_PC)
        invalid.append({"pc": f"0x{pc:x}", "address": f"0x{address:x}", "size": size, "access": access})
        stopped_reason = "invalid memory access"
        return False

    uc.hook_add(UC_HOOK_CODE, code_hook)
    uc.hook_add(UC_HOOK_MEM_INVALID, invalid_hook)
    uc.reg_write(UC_ARM64_REG_LR, SENTINEL)
    error = None
    try:
        uc.emu_start(args.address, 0, count=args.max_instructions)
    except UcError as exc:
        error = str(exc)
    if stopped_reason is None:
        stopped_reason = "instruction limit" if instruction_count >= args.max_instructions else "stopped"

    data_dump = bytes(uc.mem_read(0xF00000, 0x18000))
    data_path = args.output_prefix.with_name(args.output_prefix.name + "-data.bin")
    data_path.write_bytes(data_dump)
    heap_dump = bytes(uc.mem_read(HEAP, heap_cursor - HEAP))
    heap_path = args.output_prefix.with_name(args.output_prefix.name + "-heap.bin")
    heap_path.write_bytes(heap_dump)
    report = {
        "target": f"0x{args.address:x}",
        "stopped_reason": stopped_reason,
        "unicorn_error": error,
        "instruction_count": instruction_count,
        "heap_used": heap_cursor - HEAP,
        "function_entries": entries,
        "import_calls": calls,
        "import_counts": import_counts,
        "invalid_accesses": invalid,
        "data_dump": str(data_path),
        "heap_dump": str(heap_path),
    }
    report_path = args.output_prefix.with_suffix(".json")
    report_path.write_text(json.dumps(report, indent=2) + "\n")
    print(json.dumps({
        "target": report["target"],
        "stopped_reason": stopped_reason,
        "unicorn_error": error,
        "instruction_count": instruction_count,
        "heap_used": report["heap_used"],
        "function_entries": len(entries),
        "import_counts": import_counts,
        "invalid_accesses": invalid[-3:],
        "report": str(report_path),
    }, indent=2))


if __name__ == "__main__":
    main()
