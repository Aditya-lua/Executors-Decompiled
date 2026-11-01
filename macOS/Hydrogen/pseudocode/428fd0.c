
void FUN_00428fd0(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  undefined8 *unaff_x19;
  undefined8 uStack0000000000000000;
  undefined4 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined4 in_stack_00000020;
  
  uStack0000000000000000 = param_2;
  uStack0000000000000008 = param_3;
  func_0x0043065c(&uStack0000000000000010);
  *(undefined4 *)(unaff_x19 + 2) = in_stack_00000020;
  unaff_x19[1] = in_stack_00000018;
  *unaff_x19 = uStack0000000000000010;
  return;
}

