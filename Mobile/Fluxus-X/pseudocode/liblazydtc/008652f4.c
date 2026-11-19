/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008652f4
 */

undefined8 FUN_008652f4(long param_1,undefined8 *param_2)

{
  undefined4 uVar1;
  undefined8 uVar2;
  
  if (*(int *)(param_1 + 0x90) != 0x3a) {
    if (*(int *)(param_1 + 0x90) != 0x107) {
      return 0;
    }
    FUN_00860ecc(param_1,param_1 + 0x94,
                 "Function return type annotations are written after \':\' instead of \'->\'");
  }
  if (param_2 != (undefined8 *)0x0) {
    *param_2 = *(undefined8 *)(param_1 + 0x94);
  }
  FUN_00858f2c(param_1);
  uVar1 = *(undefined4 *)(param_1 + 0x124);
  uVar2 = FUN_008665f0(param_1);
  if (*(int *)(param_1 + 0x90) == 0x2c) {
    FUN_00860ecc(param_1,param_1 + 0x94,
                 "Expected a statement, got \',\'; did you forget to wrap the list of return types in parentheses?"
                );
    FUN_00858f2c(param_1);
  }
  *(undefined4 *)(param_1 + 0x124) = uVar1;
  return uVar2;
}

