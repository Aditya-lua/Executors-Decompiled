
undefined8 FUN_007465fc(undefined8 param_1)

{
  int in_w8;
  long unaff_x19;
  long lVar1;
  
  if (in_w8 != 0x1a5) {
    return param_1;
  }
  if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  lVar1 = *(long *)(unaff_x19 + 0x18);
  if ((*(char *)(lVar1 + 0x4f6) != '\0') && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto LAB_00746694;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto LAB_00746694;
    func_0x0073cfbc();
  }
LAB_00746694:
  *(undefined1 *)(lVar1 + 0x4f6) = 0;
  return 0x1c;
}

