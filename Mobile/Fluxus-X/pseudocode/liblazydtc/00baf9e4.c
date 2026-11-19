/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baf9e4
 */

long ZSTD_sizeof_DCtx(long param_1)

{
  long lVar1;
  
  lVar1 = 0;
  if (param_1 != 0) {
    lVar1 = ZSTD_sizeof_DDict(*(undefined8 *)(param_1 + 0x75e8));
    lVar1 = lVar1 + *(long *)(param_1 + 0x7628) + *(long *)(param_1 + 0x7648) + 0x176e8;
  }
  return lVar1;
}

