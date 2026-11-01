
int FUN_0078cd64(int param_1)

{
  int iVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  int unaff_w28;
  int in_stack_00000058;
  
  if (param_1 == 0) {
    if ((unaff_x20 != 0) || (unaff_w28 != 0)) {
      func_0x0073c9e4();
      return 0x2b;
    }
    if (*(long *)(*(long *)(unaff_x19 + 0x18) + 1000) == 0) {
      func_0x0073c9e4();
      in_stack_00000058 = 0x37;
    }
    else if (unaff_x22 == 0) {
      in_stack_00000058 = 0;
    }
    else {
      iVar1 = func_0x0076bb00();
      if (iVar1 == 0) {
        in_stack_00000058 = func_0x0078d2d4();
        if (in_stack_00000058 != 0) goto LAB_0078d210;
        in_stack_00000058 = func_0x00742068();
      }
      else {
        in_stack_00000058 = func_0x0078d2d4();
        if (in_stack_00000058 != 0) goto LAB_0078d210;
        in_stack_00000058 = func_0x0078dd70();
      }
      if ((*(char *)(unaff_x21 + 3) < '\0') &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b5a0)))) {
        func_0x0073d364();
      }
    }
  }
LAB_0078d210:
  if ((int)*(undefined8 *)(unaff_x19 + 0xa1a) < 0) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b5a0 < 1) {
        return in_stack_00000058;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b5a0 < 1) {
      return in_stack_00000058;
    }
    func_0x0073d364();
  }
  return in_stack_00000058;
}

