
void FUN_006e4d14(void)

{
  bool in_CY;
  long unaff_x19;
  int unaff_w20;
  
  if (in_CY) {
    __dyld_get_image_header(0);
  }
  func_0x006eefcc();
  if (unaff_w20 == -1) {
    if (*(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) <= *(ulong *)(unaff_x19 + 8)) {
      *(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) = *(ulong *)(unaff_x19 + 8);
      return;
    }
  }
  return;
}

