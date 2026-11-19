/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00917b54
 */

void FUN_00917b54(long param_1,undefined8 *param_2)

{
  long lVar1;
  
  if (param_1 == 0) {
    lVar1 = param_2[2];
    param_2[2] = lVar1 + -1;
    if (lVar1 + -1 == 0) {
      FUN_0090f270(*param_2);
      (*(code *)PTR_free_00cc4678)(param_2);
      return;
    }
  }
  else {
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f628(param_1,3,2);
    }
    lVar1 = param_2[2];
    param_2[2] = lVar1 + -1;
    if (lVar1 + -1 == 0) {
      FUN_0090f270(*param_2);
      (*(code *)PTR_free_00cc4678)(param_2);
      lVar1 = *(long *)(param_1 + 0xd0);
    }
    else {
      lVar1 = *(long *)(param_1 + 0xd0);
    }
    if (lVar1 != 0) {
      FUN_0093f680(param_1,3);
      return;
    }
  }
  return;
}

