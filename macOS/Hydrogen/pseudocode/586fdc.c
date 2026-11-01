
void FUN_00586fdc(undefined8 param_1,long *param_2)

{
  long unaff_x29;
  undefined8 uStack0000000000000000;
  long lStack0000000000000008;
  undefined *puStack0000000000000010;
  undefined *puStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  undefined *puStack0000000000000030;
  
  lStack0000000000000008 = *param_2;
  *(long *)(unaff_x29 + -8) = lStack0000000000000008 + 0x18;
  puStack0000000000000030 = &UNK_009f0a30;
  lStack0000000000000028 = unaff_x29 + -8;
  uStack0000000000000020 = 9;
  puStack0000000000000010 = &UNK_009f0ae0;
  puStack0000000000000018 = &UNK_008ad36d;
  uStack0000000000000000 = 6;
  func_0x00469450(param_1,&UNK_008ad427,10,&UNK_008ad368,5,lStack0000000000000008 + 0x30,
                  &UNK_009f0a10,&UNK_008ad431);
  return;
}

