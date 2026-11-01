# Analysis

## 1. Delivery

`https://www.hydrogen.lat/install` returns a 2 KB bash script. It contains no
logic beyond downloading two payloads and running them:

```bash
HYDROGEN_INSTALLER_URL="https://0ai4bbbahf.ufs.sh/f/4fzhZqSSYIjmt8OGDr546yzQVkLwJsKXF8Y7eoi1cUprDjC2"
HYDROGEN_M_URL="https://0ai4bbbahf.ufs.sh/f/4fzhZqSSYIjmwLOYvnLyRu4HmMXkvGhDw8SctAIPEs3BrTpU"
ROBLOX_URL_ARM="https://setup.rbxcdn.com/mac/arm64/version-b29f0194bebd445b-RobloxPlayer.zip"
```

The first is a 8.9 MB Mach-O installer written in Rust, the second is a 24.6 MB
zip holding `Hydrogen.app`. Roblox version pinned at `version-b29f0194bebd445b`.

The installer kills running processes, removes the previous app, downloads
Roblox, and patches it.

## 2. Binary inventory

| Binary | Size | Slices | Imports | Exports | Signed |
|---|---|---|---|---|---|
| Hydrogen | 31,871,264 | x86_64, arm64 | 753 | 6,702 | no |
| Hydrogen-arm.dylib | 11,853,136 | arm64 | 987 | 6,583 | yes |
| Hydrogen-intel.dylib | 13,584,320 | x86_64 | 1,006 | 6,729 | no |
| insert_dylib | 27,328 | x86_64 | 37 | 15 | no |

`__text` sizes: 6.9 MB, 8.0 MB, 9.8 MB. The dylibs load `@rpath/Hydrogen.dylib`,
which means the arm and intel variants are drop in replacements for each other.

## 3. Rust fingerprints

687 occurrences of `/Users/x0rch/`, with the toolchain path
`/Users/x0rch/.rustup/toolchains/nightly-aarch64-apple-darwin/`. Crates visible
in the build include `clap_builder 4.5.36`, `rustls`, `curl`, and a local
workspace at `/Users/x0rch/hydrogen-m/`.

The workspace tree, reconstructed from embedded source paths:

```
hydrogen-m/decompiler/server/src/medal/luau-lifter/src/lib.rs
hydrogen-m/decompiler/server/src/medal/luau-lifter/src/deserializer/bytecode.rs
hydrogen-m/decompiler/server/src/medal/ast/src/lib.rs
hydrogen-m/decompiler/server/src/medal/cfg/src/block.rs
hydrogen-m/decompiler/server/src/medal/cfg/src/function.rs
hydrogen-m/src/lua/libs/misc.h
```

So `medal` is their own decompiler project, and `src/lua/libs/` is where the
executor functions are defined.

## 4. Bytecode decompiler

Two separate implementations ship: a Rust one in the dylib and a standalone
`Decompiler` binary in the Opiumware package of all places, which Hydrogen does
not use. The Rust one exposes a CLI:

```
decompile_bytecode
  --paths      input bytecode files
  --threads    number of threads, 0 = automatic
  --key        op = op * key % 256
               For Roblox client bytecode, use 203
  --recursive
  --verbose
```

The key transformation is multiplication modulo 256, which is how the shipped
Luau bytecode obfuscates its opcode byte. Key 203 is named as the Roblox client
default.

Internal stage names like `got past loop`, `did ssa construct`, `checkpoint 1`,
`checkpoint 2`, `link_upvalues`, plus `Unsupported bytecode version` confirm the
pipeline is deserialize, build SSA, lift to AST, then emit.

## 5. Script API

The `src/lua/libs/misc.h` file contributes a large block of null separated
strings. Grouped, they describe the runtime:

| Group | Names |
|---|---|
| environment | getgenv, getrenv, getreg, gettenv |
| scripts | loadstring, getscriptbytecode_internal, getscriptclosure_internal, getthreadscript, getcallingscript, getfunctionhash |
| metatables | getrawmetatable, setrawmetatable, isreadonly, setreadonly |
| instance access | getinstances, getinstancetable, compareinstances, getconnections, gethiddenproperty, sethiddenproperty, isscriptable, setscriptable |
| interaction | firetouchinterest, fireclickdetector, fireproximityprompt |
| thread | setthreadidentity, getthreadidentity, setthreadcontext, getthreadcontext, setnamecallmethod, getnamecallmethod |
| queue | queue_on_teleport, queueonteleport |
| flags | getfflag, setfflag |
| cache | cache_replace, cache_invalidate, cache_iscached |
| console | consoleprint, consolewarn, consoleerror, consoleinput, rconsoleprint, rconsolewarn, rconsoleerror, rconsoleinput, rconsoledestroy, rconsoleclear, rconsolecreate, rconsolename |
| network | http_get, request |
| misc | isrbxactive, isgameactive, setclipboard, toclipboard, messagebox, setfpscap, get_hwid, gethwid |

`convert_windows_msgbox_flags` and `/usr/bin/pbcopy` show small platform shims.

## 6. Bridge

```
/secret
/ready
Listening on localhost:%d
0.0.0.0
workspace
```

Two endpoints only, unlike the browser style bridge in the Windows build of this
family. A shared secret path suggests a token is passed by the UI rather than a
header.

## 7. Hardware identity

Adjacent strings:

```
sha384
LOP_SKID
_QWWSZSADJASUDOPI
get_hwid
gethwid
key.txt
```

Three fixed strings sit just before this block:

```
jGGnuHjzsvQrlVQWeRksnFNlo
kEFvkfAKCppFHeAcDZoOwmkrMr
NGCEBBNXvvDcHTlORGKDDsRCcR
```

The presence of `sha384` next to `get_hwid` means the identifiers are mixed into
a 384 bit digest. Those three strings are stable, so they are salts rather than
per user values. `key.txt` is read from `~/Library/Application Support`.

## 8. Where the code lives

Ghidra output is keyed by address, so knowing which address matters is half the
work. The table below comes from `data/functions.tsv`, sorted by number of string
references, then imports.

| Function | Bytes | Strings | Imports | Why it matters |
|---|---|---|---|---|
| `0x1893c` | 34,004 | 168 | 40 | the Lua library registrar, owns `getgenv`, `loadstring`, `getscriptbytecode_internal`, `firetouchinterest`, `get_hwid`, `sha384` |
| `0x634f34` | 1,888 | 82 | 4 | Rust error formatting around the lifter stages |
| `0x6d272c` | 4,548 | 75 | 2 | Luau compiler flag table, 30 plus `Luau*` feature names |
| `0x77fd54` | 9,492 | 63 | 11 | teleport and queue handling, `queue_on_teleport` |
| `0x67b70` | 1,800 | 47 | 8 | environment table setup, `getreg` and friends |
| `0x22348` | 4,424 | 18 | 20 | `firetouchinterest`, touch interest flipping |
| `0xb6ab0` | 33,680 | 14 | 17 | instance reflection, `getinstances`, `getconnections` |
| `0x411720` | 7,308 | 14 | 10 | `fork` and `execvp` user, process relaunch path |
| `0x1989c4` | - | 3 | 6 | the only caller of `AuthorizationExecuteWithPrivileges` |
| `0x437c10` | - | 6 | 3 | `dlsym` resolver, one of four |

`0x1893c` alone holds 168 string references, and its C file is 62 KB.

## 9. Import surface

The dylib binds 3,256 lazy symbols across 698 `__stubs` slots, which
`macho_map.py` resolves through the `LC_DYLD_INFO_ONLY` bind opcodes rather than
guessing by stub order. Grouped by capability:

| Capability | Symbols |
|---|---|
| process control | `_fork`, `_execvp`, `_posix_spawn`, `_AuthorizationExecuteWithPrivileges` |
| memory | `_mmap`, `_mprotect`, `_mach_vm_region` |
| dynamic loading | `_dlsym`, `_dlopen` |
| Apple frameworks | `_objc_msgSend`, `_CFRelease`, `_CFUserNotificationDisplayNotice`, `_SecTransformExecute` |
| crypto | `_CC_SHA256_*`, aws-lc `awslc_0_24_0_SHA384_*` |

No `task_for_pid` and no `mach_vm_write` at any call site, so the payload does
not patch foreign processes by hand. The one elevated path is
`AuthorizationExecuteWithPrivileges` at `0x1989c4`, used during install.

## 10. Not done

The intel dylib and the launcher were not lifted to C, only mapped. The arm
dylib is at 1,534 functions and rising. The reason for any gap is the 1.9 GB
analysis box, not the tooling. Details and per function status are in
`docs/coverage.md` and `data/pseudocode_index.tsv`.
