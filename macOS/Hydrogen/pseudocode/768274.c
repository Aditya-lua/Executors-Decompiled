
undefined8 FUN_00768274(void)

{
  byte bVar1;
  int iVar2;
  long unaff_x19;
  
  if (-1 < *(long *)(unaff_x19 + 0x248)) {
    *(undefined8 *)(unaff_x19 + 0x250) = 0;
    *(undefined8 *)(unaff_x19 + 600) = 0;
    *(undefined8 *)(unaff_x19 + 0x248) = 0xffffffffffffffff;
    *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) | 4;
    iVar2 = (**(code **)(unaff_x19 + 0x238))();
    bVar1 = *(byte *)(unaff_x19 + 0x271) & 0xfb;
    *(byte *)(unaff_x19 + 0x271) = bVar1;
    if (iVar2 == -1) {
      *(byte *)(unaff_x19 + 0x271) = bVar1 | 8;
      return 0xb;
    }
  }
  return 0;
}

