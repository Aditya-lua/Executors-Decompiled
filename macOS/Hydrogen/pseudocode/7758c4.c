
undefined8 FUN_007758c4(void)

{
  long unaff_x19;
  int unaff_w20;
  
  func_0x0076bad4();
  if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b550 < 1) goto LAB_00775908;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b550 < 1)
    goto LAB_00775908;
    func_0x0073cd4c();
  }
LAB_00775908:
  if (unaff_w20 == 0) {
    return 0;
  }
  func_0x0073c9e4();
  return 0x41;
}

