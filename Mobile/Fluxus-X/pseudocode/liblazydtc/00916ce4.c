/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916ce4
 */

long FUN_00916ce4(long param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f628(param_1,3,2);
  }
  lVar1 = FUN_00916d64(param_1,param_2,param_3);
  if (lVar1 != 0) {
    *(long *)(lVar1 + 0x10) = *(long *)(lVar1 + 0x10) + 1;
  }
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f680(param_1,3);
  }
  return lVar1;
}

