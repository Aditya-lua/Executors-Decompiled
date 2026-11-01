
undefined8 FUN_0077535c(long param_1)

{
  long in_x9;
  undefined1 *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x24;
  long lStack0000000000000008;
  
  if (in_x9 < param_1) {
    lStack0000000000000008 = param_1;
    func_0x0073c9e4();
    return 0x1a;
  }
  *unaff_x21 = 0;
  *unaff_x19 = 1;
  *(byte *)(unaff_x24 + 0x44) = *(byte *)(unaff_x24 + 0x44) | 1;
  if ((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (iRam0000000000a2b550 < 1) {
        return 0;
      }
    }
    else {
      if (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x20 + 0x18) + 8) < 1) {
        return 0;
      }
      if (iRam0000000000a2b550 < 1) {
        return 0;
      }
    }
    lStack0000000000000008 = *(undefined8 *)(unaff_x24 + 0x30);
    func_0x0073cd4c();
  }
  return 0;
}

