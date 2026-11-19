/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0730
 */

long ZSTD_insertBlock(long param_1,long param_2,long param_3)

{
  ZSTD_checkContinuity();
  *(long *)(param_1 + 0x74c0) = param_2 + param_3;
  return param_3;
}

