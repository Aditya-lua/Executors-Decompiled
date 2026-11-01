
void thunk_FUN_001bcea4(undefined8 param_1)

{
  undefined2 in_w9;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x22;
  undefined2 unaff_w23;
  undefined8 *unaff_x24;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined4 uStack0000000000000060;
  undefined8 uStack0000000000000064;
  
  *(undefined8 *)((long)unaff_x24 + 0x3c) = in_stack_00000038;
  *(undefined8 *)((long)unaff_x24 + 0x34) = in_stack_00000030;
  *(undefined8 *)((long)unaff_x24 + 0x4c) = in_stack_00000048;
  *(undefined8 *)((long)unaff_x24 + 0x44) = in_stack_00000040;
  *(undefined8 *)((long)unaff_x24 + 0x5c) = in_stack_00000058;
  *(undefined8 *)((long)unaff_x24 + 0x54) = in_stack_00000050;
  unaff_x24[0xd] = uStack0000000000000064;
  unaff_x24[0xc] = CONCAT44(uStack0000000000000060,in_stack_00000058._4_4_);
  *unaff_x24 = param_1;
  unaff_x24[1] = unaff_x22;
  unaff_x24[2] = unaff_x20;
  unaff_x24[3] = unaff_x19;
  *(undefined2 *)(unaff_x24 + 4) = in_w9;
  *(undefined2 *)((long)unaff_x24 + 0x22) = unaff_w23;
  *(undefined8 *)((long)unaff_x24 + 0x2c) = in_stack_00000028;
  *(undefined8 *)((long)unaff_x24 + 0x24) = in_stack_00000020;
  return;
}

