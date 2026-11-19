/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4354
 */

void FUN_008e4354(long *param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  int iVar2;
  
  iVar2 = (**(code **)(*param_1 + 0x20))();
  FUN_008e43ac(*param_1,iVar2,iVar2 + 8);
  puVar1 = (undefined8 *)FUN_008e439c();
  *puVar1 = param_2;
  param_1[2] = param_1[2] + 8;
  return;
}

