# Reproduction tools

The native exports were generated with the two Ghidra headless scripts in this
directory's `tools` subfolder. `DecompileAllFunctions.java` exports every
recognized non-external function as C-like pseudocode. `ExportAssembly.java`
exports every recognized instruction with its address and raw bytes.

The APK was decoded with Apktool and decompiled with JADX. No source file in
this repository should be mistaken for vendor-authored source.

