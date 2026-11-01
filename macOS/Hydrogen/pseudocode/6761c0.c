
void FUN_006761c0(void)

{
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  
  *(long *)(unaff_x19 + 0x18) = unaff_x24;
  _bzero(unaff_x24 + *(long *)(unaff_x19 + 0x10) * 8,(unaff_x23 - *(long *)(unaff_x19 + 0x10)) * 8);
  *(long *)(unaff_x19 + 0x10) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 8) = 0x1fffffffffffffff;
  *(ulong *)(unaff_x24 + unaff_x25 * 8) =
       *(ulong *)(unaff_x24 + unaff_x25 * 8) | 1L << (unaff_x20 & 0x3f);
  return;
}

