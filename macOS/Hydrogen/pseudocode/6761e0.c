
void FUN_006761e0(undefined8 param_1)

{
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x24;
  long unaff_x25;
  
  *(undefined8 *)(unaff_x19 + 8) = param_1;
  *(ulong *)(unaff_x24 + unaff_x25 * 8) =
       *(ulong *)(unaff_x24 + unaff_x25 * 8) | 1L << (unaff_x20 & 0x3f);
  return;
}

