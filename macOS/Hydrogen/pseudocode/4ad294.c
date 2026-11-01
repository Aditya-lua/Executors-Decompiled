
void FUN_004ad294(long param_1,undefined8 *param_2)

{
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long lStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  _uStack0000000000000008 = param_1 + 8;
  *(undefined1 **)(unaff_x29 + -0x10) = &uStack0000000000000008;
  *(undefined **)(unaff_x29 + -8) = &DAT_004a3804;
  _uStack0000000000000010 = &UNK_009e4068;
  uStack0000000000000018 = 1;
  uStack0000000000000030 = 0;
  lStack0000000000000020 = unaff_x29 + -0x10;
  uStack0000000000000028 = 1;
  func_0x0046849c(*param_2,param_2[1],&uStack0000000000000010);
  return;
}

