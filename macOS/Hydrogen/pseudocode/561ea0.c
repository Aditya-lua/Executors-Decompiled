
void FUN_00561ea0(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 unaff_x19;
  undefined8 *puStack0000000000000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  puStack0000000000000000 = param_1;
  func_0x007a7a14(param_2,1,param_4,1);
  *puStack0000000000000000 = in_stack_00000018;
  puStack0000000000000000[1] = unaff_x19;
  *(undefined4 *)(puStack0000000000000000 + 2) = in_stack_00000008._4_4_;
  puStack0000000000000000[3] = in_stack_00000010;
  return;
}

