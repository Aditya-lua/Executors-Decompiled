
void FUN_004376d0(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  long in_x9;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  *(undefined8 *)(unaff_x29 + -0x20) = param_1;
  *(long *)(unaff_x29 + -0x18) = in_x9 + 0x52c;
  *(undefined1 **)(unaff_x29 + -0x10) = &uStack0000000000000010;
  *(undefined **)(unaff_x29 + -8) = &DAT_003f40f4;
  _uStack0000000000000020 = &UNK_009dc1a0;
  uStack0000000000000028 = 2;
  uStack0000000000000040 = 0;
  lStack0000000000000030 = unaff_x29 + -0x20;
  uStack0000000000000038 = 2;
  func_0x0046849c(*param_3,param_3[1],&uStack0000000000000020);
  return;
}

