
void FUN_004baae4(ulong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long unaff_x29;
  undefined4 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  
  *(undefined8 *)(unaff_x29 + -0x18) = param_4;
  func_0x004b8778(&uStack0000000000000018,unaff_x29 + -0x18,param_2);
  if (uStack0000000000000018 != 1) {
    param_1[4] = in_stack_00000038;
    param_1[3] = in_stack_00000030;
    param_1[5] = in_stack_00000040;
  }
  else {
    param_1[4] = in_stack_00000038;
    param_1[3] = in_stack_00000030;
  }
  param_1[1] = in_stack_00000020;
  param_1[2] = in_stack_00000028;
  *param_1 = (ulong)(uStack0000000000000018 == 1);
  return;
}

