/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb29e8
 */

ulong ZSTD_initDStream_usingDDict(long param_1)

{
  ulong uVar1;
  
  *(undefined4 *)(param_1 + 0x761c) = 0;
  *(undefined4 *)(param_1 + 0x766c) = 0;
  *(undefined4 *)(param_1 + 0x75e0) = 1;
  uVar1 = ZSTD_DCtx_refDDict();
  if ((uVar1 < 0xffffffffffffff89) && (uVar1 = 5, *(int *)(param_1 + 0x7598) != 0)) {
    uVar1 = 1;
  }
  return uVar1;
}

