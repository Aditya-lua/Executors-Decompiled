/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2a58
 */

undefined8 ZSTD_DCtx_setMaxWindowSize(long param_1,long param_2)

{
  if (*(int *)(param_1 + 0x761c) != 0) {
    return 0xffffffffffffffc4;
  }
  if (param_2 - 0x80000001U < 0xffffffff800003ff) {
    return 0xffffffffffffffd6;
  }
  *(long *)(param_1 + 0x7638) = param_2;
  return 0;
}

