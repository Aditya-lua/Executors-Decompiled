
void FUN_004ff528(void)

{
  undefined8 in_x9;
  undefined8 in_x10;
  long unaff_x29;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  *(undefined8 *)(unaff_x29 + -0x20) = in_x9;
  *(undefined8 *)(unaff_x29 + -0x18) = in_x10;
  *(BADSPACEBASE **)(unaff_x29 + -0x10) = register0x00000008;
  *(undefined8 *)(unaff_x29 + -8) = in_x10;
  _uStack0000000000000020 = &UNK_009e8b18;
  uStack0000000000000028 = 3;
  lStack0000000000000030 = unaff_x29 + -0x20;
  uStack0000000000000038 = 2;
  uStack0000000000000040 = 0;
  func_0x00459f08(&uStack0000000000000020);
  return;
}

