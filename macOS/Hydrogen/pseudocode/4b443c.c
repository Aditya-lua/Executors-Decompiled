
void FUN_004b443c(undefined8 param_1,undefined8 *param_2)

{
  long unaff_x29;
  undefined *puStack0000000000000000;
  undefined8 uStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  *(undefined8 *)(unaff_x29 + -0x10) = param_1;
  *(undefined **)(unaff_x29 + -8) = &DAT_004b37a8;
  puStack0000000000000000 = &UNK_009e52b8;
  uStack0000000000000008 = 2;
  lStack0000000000000010 = unaff_x29 + -0x10;
  uStack0000000000000018 = 1;
  uStack0000000000000020 = 0;
  func_0x0046849c(*param_2,param_2[1]);
  return;
}

