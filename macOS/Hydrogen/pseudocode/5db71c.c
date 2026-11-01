
undefined8 FUN_005db71c(undefined8 param_1)

{
  undefined8 uVar1;
  char *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  char in_wzr;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 *puStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined *puStack0000000000000050;
  long lStack0000000000000058;
  undefined *puStack0000000000000060;
  long lStack0000000000000068;
  undefined *puStack0000000000000070;
  undefined *puStack0000000000000080;
  
  lStack0000000000000058 = unaff_x21 + 0x40;
  lStack0000000000000068 = unaff_x21 + 0x80;
  puStack0000000000000050 =
       &__ZN50__LT_ast__RValue_u20_as_u20_core__fmt__Display_GT_3fmt17hcb2e6e3d9540154aE;
  puStack0000000000000060 =
       &__ZN50__LT_ast__RValue_u20_as_u20_core__fmt__Display_GT_3fmt17hcb2e6e3d9540154aE;
  puStack0000000000000070 =
       &__ZN50__LT_ast__RValue_u20_as_u20_core__fmt__Display_GT_3fmt17hcb2e6e3d9540154aE;
  puStack0000000000000080 = &DAT_005da390;
  _uStack0000000000000008 = &UNK_009f3188;
  uStack0000000000000010 = 6;
  puStack0000000000000018 = &uStack0000000000000038;
  uStack0000000000000020 = 5;
  uStack0000000000000028 = 0;
  uStack0000000000000040 = param_1;
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
  return uVar1;
}

