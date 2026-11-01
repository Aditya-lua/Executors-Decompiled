
void FUN_006e4d48(void)

{
  long unaff_x19;
  int unaff_w20;
  uint unaff_w21;
  long lStack0000000000000000;
  
  lStack0000000000000000 = *(long *)(unaff_x19 + 8) + (long)(int)~unaff_w21 * 0x10;
  func_0x006eefcc();
  if (unaff_w20 == -1) {
    if (*(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) <= *(ulong *)(unaff_x19 + 8)) {
      *(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) = *(ulong *)(unaff_x19 + 8);
      return;
    }
  }
  return;
}

