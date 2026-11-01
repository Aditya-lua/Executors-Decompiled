
undefined8 FUN_00775de8(ulong param_1)

{
  uint in_w9;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uStack0000000000000008;
  ulong uStack0000000000000010;
  
  if ((in_w9 >> 7 & 1) != 0) {
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
    uStack0000000000000010 = param_1 & 0xffffffff;
    func_0x0073cd4c();
  }
  return 0;
}

