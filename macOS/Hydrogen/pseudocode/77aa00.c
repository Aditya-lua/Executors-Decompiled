
undefined8 FUN_0077aa00(undefined8 param_1)

{
  undefined1 in_ZR;
  long unaff_x19;
  long unaff_x22;
  undefined4 *unaff_x25;
  
  while ((bool)in_ZR) {
    param_1 = func_0x0076dfc0();
    in_ZR = false;
    if (*(int *)(unaff_x22 + 0x4a8) != 0) {
      in_ZR = (int)param_1 == 0;
    }
  }
  *unaff_x25 = 0;
  if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b580 < 1) {
        return param_1;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b580 < 1) {
      return param_1;
    }
    func_0x0073d0f4();
  }
  return param_1;
}

