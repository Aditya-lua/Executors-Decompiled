
undefined8 FUN_005dc820(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 in_x9;
  char *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x29;
  char in_wzr;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined *in_stack_00000040;
  long in_stack_00000048;
  undefined *in_stack_00000050;
  long in_stack_00000058;
  undefined *in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000070;
  
  *(undefined8 *)(unaff_x29 + -0x30) = param_1;
  *(undefined8 *)(unaff_x29 + -0x28) = in_x9;
  func_0x005d2d40(unaff_x29 + -0x48,unaff_x29 + -0x30,&UNK_008b639c,2);
  uStack0000000000000038 = &uStack0000000000000068;
  in_stack_00000040 = &DAT_005da390;
  in_stack_00000048 = unaff_x29 + -0x70;
  in_stack_00000050 = &DAT_005da390;
  in_stack_00000060 = &DAT_005da390;
  uStack0000000000000008 = &UNK_009f32c0;
  in_stack_00000010 = 4;
  in_stack_00000018 = &uStack0000000000000038;
  in_stack_00000020 = 3;
  in_stack_00000028 = 0;
  in_stack_00000058 = unaff_x29 + -0x48;
  uVar1 = func_0x0046849c(*unaff_x20,unaff_x20[1],&uStack0000000000000008);
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x40),*(long *)(unaff_x29 + -0x48),1);
  }
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  if (*(long *)(unaff_x29 + -0x70) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68),*(long *)(unaff_x29 + -0x70),1);
  }
  if (uStack0000000000000068 != 0) {
    func_0x00187bd4(in_stack_00000070,uStack0000000000000068,1);
  }
  return uVar1;
}

