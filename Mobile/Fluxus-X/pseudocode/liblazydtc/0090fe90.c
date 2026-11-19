/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fe90
 */

void FUN_0090fe90(long param_1,undefined8 param_2,ulong param_3)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 0xc38);
  if ((param_3 & 1) == 0) {
    FUN_0090ff1c(uVar1,param_2);
    return;
  }
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f628(param_1,5,2);
  }
  FUN_0090ff1c(uVar1,param_2);
  if (*(long *)(param_1 + 0xd0) == 0) {
    return;
  }
  FUN_0093f680(param_1,5);
  return;
}

