/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e43b8
 */

undefined8 * FUN_008e43b8(long *param_1)

{
  undefined4 uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  puVar2 = operator_new(0x20);
  uVar1 = (**(code **)(*param_1 + 0x28))(param_1);
  *puVar2 = &PTR_LAB_00c4e410;
  FUN_008e50a4(puVar2,uVar1);
  *puVar2 = &PTR_LAB_00c4e338;
  uVar3 = (**(code **)(*param_1 + 0x38))(param_1);
  uVar1 = FUN_008e44a4(*param_1,param_1);
  FUN_008e444c(puVar2,uVar3,uVar1);
  return puVar2;
}

