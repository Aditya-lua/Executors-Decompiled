
void FUN_00676498(void)

{
  ulong unaff_x19;
  long unaff_x23;
  long unaff_x24;
  
  *(ulong *)(unaff_x23 + unaff_x24 * 8) =
       *(ulong *)(unaff_x23 + unaff_x24 * 8) | 1L << (unaff_x19 & 0x3f);
  return;
}

