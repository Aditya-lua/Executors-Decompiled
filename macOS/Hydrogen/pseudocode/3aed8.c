
void FUN_0003aed8(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x21;
  undefined8 uVar2;
  
  lVar1 = func_0x006f6ef8();
  *(long *)(unaff_x21 + 0x60) = lVar1 - (unaff_x21 + 0x60);
  *(long *)(unaff_x21 + 0x68) = unaff_x21 + 0x68;
  *(long *)(unaff_x21 + 0x70) = unaff_x21 + 0x70;
  *(long *)(unaff_x21 + 0x78) =
       ((unaff_x21 + 0x78) - (unaff_x19 + 0x78)) + *(long *)(unaff_x19 + 0x78);
  *(undefined8 *)(unaff_x21 + 0x80) = *(undefined8 *)(unaff_x19 + 0x80);
  *(undefined8 *)(unaff_x21 + 0x88) = *(undefined8 *)(unaff_x19 + 0x88);
  *(undefined4 *)(unaff_x21 + 0x90) = *(undefined4 *)(unaff_x19 + 0x90);
  *(undefined4 *)(unaff_x21 + 0x94) = 0;
  uVar2 = *(undefined8 *)(unaff_x19 + 0x98);
  *(undefined8 *)(unaff_x21 + 0xa0) = *(undefined8 *)(unaff_x19 + 0xa0);
  *(undefined8 *)(unaff_x21 + 0x98) = uVar2;
  *(undefined4 *)(unaff_x21 + 0xa8) = *(undefined4 *)(unaff_x19 + 0xa8);
  *(undefined4 *)(unaff_x21 + 0xac) = 0;
  return;
}

