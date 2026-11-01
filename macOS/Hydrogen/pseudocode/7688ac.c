
void FUN_007688ac(undefined8 param_1,long param_2)

{
  int iVar1;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  func_0x00768c00(param_2);
  iVar1 = func_0x0076ab7c(param_1,param_2);
  if (iVar1 == 0) {
    *(undefined8 *)(param_2 + 0xa8) = in_stack_00000008;
    *(undefined8 *)(param_2 + 0xa0) = in_stack_00000000;
    *(undefined8 *)(param_2 + 0xb8) = in_stack_00000018;
    *(undefined8 *)(param_2 + 0xb0) = in_stack_00000010;
    return;
  }
  return;
}

