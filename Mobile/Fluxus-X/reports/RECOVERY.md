# Recovery and behavior

## Identity and processing layers

The input is a 159,619,130-byte Android APK containing 2,261 ZIP entries, four
DEX files, and nine ARM64 native libraries. Its Android identity is
`com.roblox.client` / `2.747.1486` / `21686`. Two added classes in `classes4.dex`
use the `com.lazyexec.exe` namespace. Native constant recovery independently
produced the executor name `Fluxus X`, version `1.0.0`, and the string `FluxusZ`.
These observations identify this sample's contents; they do not authenticate its
publisher or establish an official Roblox build baseline.

The observed layers are:

1. APK ZIP container, binary manifest/resources, and four ordinary DEX files.
2. Java activity integration loading the ARM64 `liblazydtc.so` library.
3. Directly analyzable ARM64 code with C++ static constructors and XOR-obfuscated
   string constants. No whole-image unpacking was performed.
4. Embedded UTF-8 Lua source recovered from constructor-written memory buffers.
5. Native engine integration, Lua runtime/compiler code, hooks, and linked
   third-party implementations such as OpenSSL, IXWebSocket, and LZ4.

## Java entry and storage behavior

`com.roblox.client.ActivityNativeMain.onCreate` invokes
`com.lazyexec.exe.MainActivity.Start(this)` before the existing activity setup.
`Start` loads `lazydtc`, calls `nativeInit(activity)`, and requests storage access.

`PermSender` requests Android's all-files access UI on SDK 30+, or read/write
external-storage permissions on older versions. It creates an external-storage
directory named by `MainActivity.getExec()` and a `Workspace` subdirectory.
The recovered native name makes these paths `/sdcard/Fluxus X` and
`/sdcard/Fluxus X/Workspace` on the usual external-storage mount. The actual mount
and permission outcome depend on the device and were not tested.

JADX's expression for `MainActivity.onCreate` assigns an animator resource ID to
`setContentView`; the smali retains the literal `0x7f020000`. This artifact was
preserved rather than corrected into a guessed original layout.

## Native startup and callback recovery

All addresses in the ELF column below are relative virtual addresses in the
original shared object. Ghidra loaded it at `0x100000`, so its listing addresses
and filenames add `0x100000`. The function index includes both address forms.

| ELF address | Observed role | Evidence |
| --- | --- | --- |
| `0x6ff608` | JNI `nativeInit`: obtains the Java VM and retains a global activity reference | [007ff608.c](../pseudocode/liblazydtc/007ff608.c) |
| `0x6ff658` | JNI `getExec`: creates a Java string from the recovered executor-name global | [007ff658.c](../pseudocode/liblazydtc/007ff658.c) |
| `0x6fdafc` | Static constructor creates and detaches a C++ startup thread | [007fdafc.c](../pseudocode/liblazydtc/007fdafc.c) |
| `0x6ff484` | `pthread_create` trampoline invokes the saved callback | [007ff484.c](../pseudocode/liblazydtc/007ff484.c) |
| `0x6fdb84` | Startup callback waits for the target module and JNI globals, then initializes engine addresses and installs hooks | [007fdb84.c](../pseudocode/liblazydtc/007fdb84.c) |
| `0x6fe1ec` | Finds a module base by reading process mappings and parsing matching address text | [007fe1ec.c](../pseudocode/liblazydtc/007fe1ec.c) |
| `0x7068b4` | Initializes pointers relative to the recovered target-module base | [008068b4.c](../pseudocode/liblazydtc/008068b4.c) |
| `0x6fce48` | Installs three Dobby callbacks and a code patch in the target module | [007fce48.c](../pseudocode/liblazydtc/007fce48.c) |
| `0x6fd0d4` | Main state/setup callback, including Lua state and execution setup | [007fd0d4.c](../pseudocode/liblazydtc/007fd0d4.c) |
| `0x72112c` | Pushes update-related constant values into a Lua-facing table | [0082112c.c](../pseudocode/liblazydtc/0082112c.c) |

The JNI virtual-table offsets are consistent with `GetJavaVM` (`0x6d8`),
`NewGlobalRef` (`0xa8`), and `NewStringUTF` (`0x538`) on ARM64. Ghidra did not
automatically assign every indirect function-pointer target a function boundary.
`RecoverThreadEntries.java` marks the observed startup and hook callback code
pointers, allowing them to be exported as functions with synthetic names.

The native update constants name
`https://raw.githubusercontent.com/kingkm00/FluxusZ-Updates` and `Fluxus.lua`.
An adjacent initialized value matches a GitHub fine-grained PAT format. Its
value and reconstruction initializer were withheld. No request authenticated
with this value was made, and no remotely supplied update was executed.

The tiny `libtrampoline.so` is observed to load a supplied library, resolve
`CrashpadHandlerMain`, and invoke it. Its strings identify `crashpad_trampoline`;
it is not evidence of a separate executor engine.

## Embedded source recovery

The initializer at ELF `0x70536c` writes four source buffers. Bounded ARM64
evaluation recovered their full UTF-8 contents, including the UI's non-ASCII
characters. They were not recreated from screenshots or handwritten substitutes.
Descriptive filenames were assigned during this recovery.

| Recovered file | Bytes | Memory destination | Observed content |
| --- | ---: | --- | --- |
| [recovered_ui.lua](../decompiled/decoded/recovered_ui.lua) | 295,418 | `0xbcb230` | UI/bootstrap, editor, saved scripts, autoexec controls, ScriptBlox search, console, and Lua helpers |
| [recovered_gc_cache.lua](../decompiled/decoded/recovered_gc_cache.lua) | 1,843 | `0xc13438` | GC caching and search helpers |
| [recovered_drawing.lua](../decompiled/decoded/recovered_drawing.lua) | 27,581 | `0xc13b78` | Drawing implementation and render-property helpers |
| [recovered_bit_compat.lua](../decompiled/decoded/recovered_bit_compat.lua) | 2,075 | `0xc1a740` | Bit-library compatibility |

All four pass the Luau 0.747 parser. This proves syntax acceptance, not correct
operation in a Roblox executor. Original and recovered runtime behavior was not
differentially tested.

The evaluator maps ELF segments and relocations inside Unicorn, independently
evaluates 175 application-region constructors, and supports explicit in-memory
allocation/string and C++ guard-registration surrogates. It permits no host
system calls or network operations. Of these evaluations, 173 returned; the
startup-thread constructor stopped at `pthread_create`, and the constructor at
`0x7073dc` reached the instruction/time bound. These stops remain recorded in
[initializer-evaluation.json](../data/constants/initializer-evaluation.json).
The recovered short-string list is a candidate corpus, not proof that every
runtime-generated string has been decoded.

## Validation and limits

The verification script compares the set of every DEX class descriptor against
the published smali, checks each DEX SHA-1/Adler-32 header, parses published XML
and recovered Lua, resolves native index artifact paths, checks native address
mapping, and scans the publication set for credentials, binary files, and files
over 8 MiB. Results are in [verification.json](verification.json).

JADX reported 114 errors. The retained source contains 144 error/placeholder
diagnostic lines; these counts measure different things. The complete smali is
provided for the affected classes. Java output is not a verified compilable
reconstruction of the application.

Ghidra produced C-like output for 19,964 core entries and 19 support entries.
One core initializer reconstructing a credential is intentionally absent from
the publication set. Ghidra warnings about indirect calls, merged types, and
unresolved constructs remain in the exported output. Export completion proves
neither complete native-function discovery nor original-source equivalence.

The other seven native libraries, including `libroblox.so`, have structural
metadata only. Runtime-selected addresses, external update contents, and
Android-specific execution remain unverified. No runnable APK or original
vendor build project is claimed.
