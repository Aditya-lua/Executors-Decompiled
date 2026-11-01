
undefined8 FUN_0077aed0(void)

{
  int iVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  
  if ((((*(int *)(unaff_x23 + 0x4a8) != 0xc) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
    func_0x0073d0f4();
  }
  *(undefined4 *)(unaff_x23 + 0x4a8) = 0xc;
  if (*(int *)(unaff_x20 + 0x4a8) != 0) {
    do {
      iVar1 = func_0x0076dfc0();
    } while (*(int *)(unaff_x20 + 0x4a8) != 0 && iVar1 == 0);
  }
  func_0x0076e6b0();
  func_0x00093e00();
  (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x20 + 0x4b0));
  *(undefined8 *)(unaff_x20 + 0x4b0) = 0;
  if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b580 < 1) {
        return 0;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b580 < 1) {
      return 0;
    }
    func_0x0073d0f4();
  }
  return 0;
}

