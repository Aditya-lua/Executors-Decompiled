/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941dc4
 */

long FUN_00941dc4(long param_1,int param_2,long param_3,int param_4)

{
  param_1 = param_1 - param_3;
  if (0x20c49ba5e353f6 < param_1) {
    return 0x7fffffffffffffff;
  }
  if (param_1 < -0x20c49ba5e353f6) {
    return -0x8000000000000000;
  }
  return param_1 * 1000 + (long)(((param_2 + 999) - param_4) / 1000);
}

