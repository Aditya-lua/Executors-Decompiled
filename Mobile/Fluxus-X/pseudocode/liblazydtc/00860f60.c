/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00860f60
 */

bool FUN_00860f60(long param_1,uint param_2)

{
  uint uVar1;
  
  uVar1 = *(uint *)(param_1 + 0x90);
  param_2 = param_2 & 0xff;
  if (uVar1 == param_2) {
    FUN_00858f2c();
  }
  else {
    FUN_0086e3b4(param_1,param_2);
  }
  return uVar1 == param_2;
}

