
void FUN_004b1310(long *param_1,undefined8 param_2)

{
  long unaff_x29;
  undefined8 uStack0000000000000000;
  long lStack0000000000000008;
  undefined *puStack0000000000000010;
  undefined *puStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  undefined *puStack0000000000000030;
  undefined *puStack0000000000000038;
  undefined8 uStack0000000000000040;
  long lStack0000000000000048;
  undefined *puStack0000000000000050;
  
  lStack0000000000000008 = *param_1;
  lStack0000000000000028 = lStack0000000000000008 + 0x48;
  *(long *)(unaff_x29 + -8) = lStack0000000000000008 + 0x18;
  puStack0000000000000050 = &UNK_009e4c70;
  lStack0000000000000048 = unaff_x29 + -8;
  uStack0000000000000040 = 4;
  puStack0000000000000030 = &UNK_009e4c50;
  puStack0000000000000038 = &UNK_0089f350;
  uStack0000000000000020 = 0xb;
  puStack0000000000000010 = &UNK_009e4c30;
  puStack0000000000000018 = &UNK_008a1542;
  uStack0000000000000000 = 10;
  func_0x0046957c(param_2,&UNK_008a1598,8,&UNK_00828cf0,4,lStack0000000000000008 + 0x30,
                  &UNK_009e4c10,&UNK_008a1538);
  return;
}

