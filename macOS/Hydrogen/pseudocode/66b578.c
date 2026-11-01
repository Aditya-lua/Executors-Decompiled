
void FUN_0066b578(void)

{
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  
  if (unaff_x22 <= unaff_x19 && unaff_x19 - unaff_x22 != 0) {
    _memcpy(*(undefined8 *)(unaff_x20 + 0x18),unaff_x21 + unaff_x22,unaff_x19 - unaff_x22);
  }
  *(ulong *)(unaff_x20 + 0x30) = *(long *)(unaff_x20 + 0x30) + unaff_x19;
  return;
}

