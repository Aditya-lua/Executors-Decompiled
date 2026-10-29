# Native payload recovery

`libzstd-jni-1.5.7-6.so` is not merely the upstream zstd JNI library. It also
contains the Arceus native payload, including Luau/runtime strings and the JNI
bridge used by `com.axjava`. Its public JNI declarations are dynamically
registered, which is why `Java_com_axjava_*` symbols do not appear in the ELF
dynamic symbol table.

## Artifacts

- `ghidra-pseudocode.c` — C-like output for 899 functions recognized by Ghidra
  12.2; 898 returned a decompiler result and one failed.
- `ghidra-assembly.txt` — 32,183 AArch64 instructions recognized during
  analysis, with addresses and bytes.
- `strings.txt` — all printable strings of at least four characters.
- `elf-symbols.txt` — dynamic and regular symbol-table output.
- `elf-relocations.txt` — ELF relocation inventory.
- `elf-header.txt` and `elf-sections.txt` — architecture and section layout.

The binary is protected/obfuscated. Ghidra reports many invalid or deliberately
hostile instruction paths, and several exported entry stubs—including
`JNI_OnLoad`—resolve to truncated bad-instruction flows in static analysis.
Accordingly, the pseudocode is evidence and a starting point, not compilable
source. The APK's exact smali and Java/native method declarations remain the
reliable boundary specification.

