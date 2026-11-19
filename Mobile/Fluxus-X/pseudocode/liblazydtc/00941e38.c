/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941e38
 */

long FUN_00941e38(long param_1,int param_2,long param_3,int param_4)

{
  param_1 = param_1 - param_3;
  if (0x8637bd05af5 < param_1) {
    return 0x7fffffffffffffff;
  }
  if (param_1 < -0x8637bd05af5) {
    return -0x8000000000000000;
  }
  return (param_1 * 1000000 + (long)param_2) - (long)param_4;
}

