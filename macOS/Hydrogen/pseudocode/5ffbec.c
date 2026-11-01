
void FUN_005ffbec(void)

{
  ulong uVar1;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  _memcpy();
  if (unaff_x24 != 0) {
    do {
      *(undefined8 *)(unaff_x22 + -8 + unaff_x24 * 8) = 0;
      unaff_x24 = unaff_x24 + -1;
    } while (unaff_x24 != 0);
  }
  func_0x00611644();
  *(long *)(unaff_x20 + 0x20) = unaff_x23;
  _bzero(unaff_x23 + *(long *)(unaff_x20 + 0x18) * 8,(unaff_x21 - *(long *)(unaff_x20 + 0x18)) * 8);
  *(long *)(unaff_x20 + 0x18) = unaff_x21;
  *(undefined8 *)(unaff_x20 + 0x10) = 0x1fffffffffffffff;
  uVar1 = unaff_x19 >> 3 & 0x1ffffffffffffff8;
  *(ulong *)(*(long *)(unaff_x20 + 0x20) + uVar1) =
       *(ulong *)(*(long *)(unaff_x20 + 0x20) + uVar1) | 1L << (unaff_x19 & 0x3f);
  return;
}

