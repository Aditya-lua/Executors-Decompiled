
undefined8 FUN_0074938c(void)

{
  long unaff_x19;
  long lVar1;
  
  func_0x0073c9e4();
  lVar1 = *(long *)(unaff_x19 + 0x18);
  if (((unaff_x19 != 0) && (*(char *)(lVar1 + 0x4f6) != '\0')) &&
     (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto LAB_007493f8;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto LAB_007493f8;
    func_0x0073cfbc();
  }
LAB_007493f8:
  *(undefined1 *)(lVar1 + 0x4f6) = 0;
  return 0x19;
}

