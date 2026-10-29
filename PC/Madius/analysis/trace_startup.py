#!/usr/bin/env python3
"""Capture the executed startup path immediately before the protector aborts."""

import json
import logging
from collections import deque
from pathlib import Path

import speakeasy
from speakeasy import Speakeasy


ROOT = Path(__file__).resolve().parents[1]
TARGET = ROOT / "targets" / "madius_updater" / "Madius.Updater.exe"
OUT = ROOT / "targets" / "madius_updater" / "speakeasy" / "startup-trace.json"
TRACE = deque(maxlen=200_000)


def trace_code(emu, address, size, context):
    TRACE.append(address)


def stop_at_messagebox(emu, api_name, original, argv):
    text = emu.read_mem_string(argv[1], width=2) if argv[1] else ""
    payload = {
        "api": api_name,
        "message": text,
        "pc": hex(emu.get_pc()),
        "return_address": hex(emu.get_ret_address()),
        "trace": [hex(v) for v in TRACE],
    }
    OUT.parent.mkdir(parents=True, exist_ok=True)
    OUT.write_text(json.dumps(payload, indent=2))
    print(f"captured {len(TRACE)} instructions before {text!r}")
    emu.stop()
    return 2


def main():
    cfg_path = Path(speakeasy.__file__).resolve().parent / "configs" / "default.json"
    config = json.loads(cfg_path.read_text())
    config["timeout"] = 300
    config["max_api_count"] = 150_000
    config["command_line"] = f'"{TARGET}"'

    logger = logging.getLogger("startup-trace")
    logger.addHandler(logging.StreamHandler())
    logger.setLevel(logging.WARNING)

    emu = Speakeasy(config=config, logger=logger)
    emu.add_code_hook(trace_code)
    emu.add_api_hook(stop_at_messagebox, module="user32", api_name="MessageBoxW")
    module = emu.load_module(str(TARGET))
    emu.run_module(module)


if __name__ == "__main__":
    main()
