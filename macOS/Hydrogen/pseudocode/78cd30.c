
undefined4 thunk_FUN_0078cd3c(void)

{
  long unaff_x19;
  
  func_0x0073c9e4();
  if ((int)*(undefined8 *)(unaff_x19 + 0xa1a) < 0) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b5a0 < 1) {
        return 0x37;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b5a0 < 1) {
      return 0x37;
    }
    func_0x0073d364();
  }
  return 0x37;
}

