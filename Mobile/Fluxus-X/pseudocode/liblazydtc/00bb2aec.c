/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2aec
 */

undefined8 ZSTD_DCtx_setFormat(long param_1,uint param_2)

{
  if (*(int *)(param_1 + 0x761c) != 0) {
    return 0xffffffffffffffc4;
  }
  if (param_2 < 2) {
    *(uint *)(param_1 + 0x7598) = param_2;
    return 0;
  }
  return 0xffffffffffffffd6;
}

