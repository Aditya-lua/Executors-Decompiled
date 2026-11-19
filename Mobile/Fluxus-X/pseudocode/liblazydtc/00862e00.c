/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00862e00
 */

undefined8 FUN_00862e00(long param_1,uint param_2,undefined8 param_3,uint param_4)

{
  undefined8 uVar1;
  
  if (*(uint *)(param_1 + 0x90) == (param_2 & 0xff)) {
    FUN_00858f2c();
    return 1;
  }
  FUN_0086b5f8(param_1,param_2 & 0xff,param_3,0);
  uVar1 = FUN_0086e434(param_1,param_2,param_3,param_4 & 1);
  return uVar1;
}

