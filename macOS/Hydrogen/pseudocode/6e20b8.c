
void FUN_006e20b8(void)

{
  long unaff_x19;
  int unaff_w20;
  
  if (((unaff_w20 < -0x2712) && (4 < *(int *)(*(long *)(unaff_x19 + 8) + -4))) &&
     ((*(byte *)(**(long **)(*(long *)(unaff_x19 + 0x20) + 8) + 1) >> 2 & 1) != 0)) {
    if ((*(byte *)(*(long *)(*(long *)(unaff_x19 + 8) + -0x10) + 1) & 3) != 0) {
      func_0x006f0d48();
      *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
      return;
    }
  }
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return;
}

