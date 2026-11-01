
void FUN_00444750(void)

{
  long lVar1;
  undefined8 *puVar2;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x23;
  long unaff_x24;
  short unaff_w25;
  long unaff_x26;
  long unaff_x28;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  
  uStack0000000000000048 = unaff_x21[9];
  uStack0000000000000040 = unaff_x21[8];
  uStack0000000000000058 = unaff_x21[0xb];
  uStack0000000000000050 = unaff_x21[10];
  uStack0000000000000068 = unaff_x21[0xd];
  uStack0000000000000060 = unaff_x21[0xc];
  uStack0000000000000008 = unaff_x21[1];
  uStack0000000000000000 = *unaff_x21;
  uStack0000000000000018 = unaff_x21[3];
  uStack0000000000000010 = unaff_x21[2];
  uStack0000000000000028 = unaff_x21[5];
  uStack0000000000000020 = unaff_x21[4];
  uStack0000000000000038 = unaff_x21[7];
  uStack0000000000000030 = unaff_x21[6];
  _memmove(unaff_x23 + unaff_x26 * 0x70,unaff_x23 + unaff_x24 * 0x70,unaff_x28 * 0x70);
  puVar2 = (undefined8 *)(unaff_x23 + unaff_x24 * 0x70);
  puVar2[9] = uStack0000000000000048;
  puVar2[8] = uStack0000000000000040;
  puVar2[0xb] = uStack0000000000000058;
  puVar2[10] = uStack0000000000000050;
  puVar2[0xd] = uStack0000000000000068;
  puVar2[0xc] = uStack0000000000000060;
  puVar2[1] = uStack0000000000000008;
  *puVar2 = uStack0000000000000000;
  puVar2[3] = uStack0000000000000018;
  puVar2[2] = uStack0000000000000010;
  puVar2[5] = uStack0000000000000028;
  puVar2[4] = uStack0000000000000020;
  puVar2[7] = uStack0000000000000038;
  puVar2[6] = uStack0000000000000030;
  *(short *)(unaff_x23 + 0x532) = unaff_w25 + 1;
  lVar1 = *(long *)(unaff_x20 + 8);
  *unaff_x19 = unaff_x23;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = unaff_x24;
  return;
}

