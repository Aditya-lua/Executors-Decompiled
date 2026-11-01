
undefined8 FUN_007750ac(long param_1)

{
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x22;
  undefined8 unaff_x23;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  
  if (0 < *(int *)(param_1 + 8)) {
    func_0x0073ce84();
  }
  if ((int)unaff_x23 == 0) {
    *(ulong *)(unaff_x19 + 0xf8) = *(long *)(unaff_x19 + 0xf8) + unaff_x22;
    unaff_x23 = func_0x0077093c();
    if ((int)unaff_x23 == 0) {
      if (unaff_x27 == 0) {
        if ((unaff_x22 < unaff_x20) && ((*(byte *)(unaff_x26 + 1) >> 2 & 1) == 0)) {
          func_0x0073c9e4();
          return 0x3f;
        }
      }
      else if ((*(byte *)(unaff_x26 + 1) >> 2 & 1) == 0) {
        if ((*(char *)(unaff_x25 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x00734f74(*(undefined8 *)(unaff_x19 + 0x18),1);
      }
      unaff_x23 = 0;
    }
  }
  return unaff_x23;
}

