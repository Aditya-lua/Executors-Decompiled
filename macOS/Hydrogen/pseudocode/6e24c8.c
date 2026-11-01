
bool FUN_006e24c8(void)

{
  long lVar1;
  ulong in_x10;
  ulong unaff_x19;
  long unaff_x20;
  
  if (unaff_x19 < in_x10) {
    lVar1 = __dyld_get_image_header(0);
    if (unaff_x19 != lVar1 + unaff_x20) goto LAB_006e251c;
  }
  else {
    lVar1 = __dyld_get_image_header(0);
    unaff_x19 = lVar1 + unaff_x20;
    lVar1 = __dyld_get_image_header(0);
    if (unaff_x19 != lVar1 + unaff_x20) {
LAB_006e251c:
      return *(int *)(unaff_x19 + 0xc) == 5 || *(int *)(unaff_x19 + 0xc) == 3;
    }
  }
  return false;
}

