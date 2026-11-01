
undefined8 FUN_00775dc4(void)

{
  byte in_ZR;
  long unaff_x20;
  undefined8 *unaff_x21;
  byte *unaff_x22;
  undefined8 uStack0000000000000008;
  ulong uStack0000000000000010;
  
  *unaff_x22 = in_ZR;
  if ((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (iRam0000000000a2b550 < 1) {
        return 0;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8) < 1 || iRam0000000000a2b550 < 1) {
      return 0;
    }
    uStack0000000000000008 = *unaff_x21;
    uStack0000000000000010 = (ulong)in_ZR;
    func_0x0073cd4c();
  }
  return 0;
}

