/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e35d0
 */

void FUN_008e35d0(long param_1)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar3 = **(undefined8 **)(param_1 + 0x10);
  uVar2 = (**(code **)(**(long **)(param_1 + 0x28) + 0x38))();
  uVar1 = (**(code **)(**(long **)(param_1 + 0x28) + 0x20))(*(long **)(param_1 + 0x28));
  CodePatch(uVar3,uVar2,uVar1);
  return;
}

