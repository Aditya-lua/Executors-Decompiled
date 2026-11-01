
void FUN_005ed1fc(undefined8 *param_1)

{
  undefined1 uVar1;
  undefined1 *unaff_x19;
  long unaff_x29;
  undefined *puStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  puStack0000000000000018 = &UNK_009f4348;
  param_1 = (undefined8 *)*param_1;
  *(long *)(unaff_x29 + -0x20) = (long)register0x00000008 + 0x10;
  *(undefined **)(unaff_x29 + -0x18) = &DAT_005eca24;
  _uStack0000000000000020 = &UNK_007fc120;
  uStack0000000000000028 = 1;
  uStack0000000000000038 = 1;
  uStack0000000000000040 = 0;
  lStack0000000000000030 = unaff_x29 + -0x20;
  uVar1 = func_0x0046849c(*param_1,param_1[1],&uStack0000000000000020);
  *unaff_x19 = uVar1;
  return;
}

