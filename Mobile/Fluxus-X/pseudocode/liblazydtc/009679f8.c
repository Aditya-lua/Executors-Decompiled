/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009679f8
 */

void FUN_009679f8(long param_1,long param_2,uint param_3)

{
  if ((param_3 & 1) == 0) {
    FUN_00967a14(param_1 + 0x530,param_2 + 0x2a0);
    return;
  }
  FUN_00967a14(param_1 + 0x5f8,param_2 + 800);
  return;
}

