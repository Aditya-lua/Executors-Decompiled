#!/usr/bin/env python3
"""Emulate Madius.Updater.exe while neutralizing its deliberate process exit.

This does not execute native target code on the host. Speakeasy interprets the
Windows instructions with Unicorn and supplies synthetic Win32 APIs.
"""

import json
import logging
from pathlib import Path

import speakeasy
from speakeasy import Speakeasy


ROOT = Path(__file__).resolve().parents[1]
TARGET = ROOT / "targets" / "madius_updater" / "Madius.Updater.exe"
OUT_DIR = ROOT / "targets" / "madius_updater" / "speakeasy"


def ignored_exit(emu, api_name, original, argv):
    print(f"[bypass] {api_name}({', '.join(hex(v) for v in argv)}) at {emu.get_pc():#x}")
    return 0


def logged_messagebox(emu, api_name, original, argv):
    text = emu.read_mem_string(argv[1], width=2) if argv[1] else ""
    title = emu.read_mem_string(argv[2], width=2) if argv[2] else ""
    print(f"[messagebox] title={title!r} text={text!r} caller={emu.get_ret_address():#x}")
    return 2


def dynamic_code(memory_map):
    print(
        f"[dynamic-code] {memory_map.get_tag()} "
        f"base={memory_map.get_base():#x} size={memory_map.get_size():#x}"
    )


def main():
    OUT_DIR.mkdir(parents=True, exist_ok=True)
    default_config = (
        Path(speakeasy.__file__).resolve().parent / "configs" / "default.json"
    )
    config = json.loads(default_config.read_text())
    config["timeout"] = 600
    config["max_api_count"] = 300000
    config["os_ver"] = {
        "name": "windows",
        "major": 10,
        "minor": 0,
        "release": 1703,
        "build": 15063,
    }
    config["command_line"] = f'"{TARGET}"'

    logger = logging.getLogger("speakeasy-bypass")
    logger.addHandler(logging.StreamHandler())
    logger.setLevel(logging.INFO)

    emu = Speakeasy(config=config, logger=logger)
    emu.add_api_hook(ignored_exit, module="kernel32", api_name="ExitProcess")
    emu.add_api_hook(logged_messagebox, module="user32", api_name="MessageBoxW")
    emu.add_dyn_code_hook(dynamic_code)

    module = emu.load_module(str(TARGET))
    emu.run_module(module, all_entrypoints=True)

    (OUT_DIR / "bypass-report.json").write_text(emu.get_json_report())
    (OUT_DIR / "bypass-memory.zip").write_bytes(emu.create_memdump_archive())
    dropped = emu.create_file_archive()
    if dropped:
        (OUT_DIR / "bypass-dropped.zip").write_bytes(dropped)


if __name__ == "__main__":
    main()
