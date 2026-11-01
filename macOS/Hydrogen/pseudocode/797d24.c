
void FUN_00797d24(void)

{
  long unaff_x19;
  long *unaff_x22;
  long unaff_x24;
  long unaff_x25;
  
  if ((*(long *)(unaff_x19 + 0xe0) != 0) &&
     ((*(byte *)(*(long *)(unaff_x19 + 0xe0) + 4) >> 4 & 1) != 0)) {
    func_0x00779d40();
  }
  if (unaff_x25 == 0) {
    if (-1 < *(char *)(unaff_x19 + 0xa1d)) {
      return;
    }
    if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) != 0) &&
       (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) + 8) < 1)) {
      return;
    }
    if (iRam0000000000a2b590 < 1) {
      return;
    }
  }
  else {
    *unaff_x22 = unaff_x25;
    if (-1 < *(char *)(unaff_x19 + 0xa1d)) {
      return;
    }
    if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) != 0) &&
       (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) + 8) < 1)) {
      return;
    }
    if (iRam0000000000a2b590 < 1) {
      return;
    }
    func_0x006f4058(unaff_x24 + 0x20);
  }
  func_0x0073d22c();
  return;
}

