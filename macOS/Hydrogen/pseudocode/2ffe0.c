
void FUN_0002ffe0(void)

{
  uint in_w8;
  undefined8 uVar1;
  undefined4 uVar2;
  long unaff_x20;
  undefined4 *unaff_x24;
  
  if (in_w8 == *(byte *)(unaff_x20 + 0xa8)) {
    uVar1 = 0;
    uVar2 = 0xfffffc1f;
  }
  else {
    *(long *)(unaff_x24 + 4) = *(long *)(unaff_x24 + 4) + 2;
    uVar1 = *(undefined8 *)(unaff_x20 + 8);
    uVar2 = 0xfffffc1d;
  }
  *unaff_x24 = uVar2;
  *(undefined8 *)(unaff_x24 + 0x14) = uVar1;
  return;
}

