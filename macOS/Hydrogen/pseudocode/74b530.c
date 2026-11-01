
undefined4 FUN_0074b530(int param_1)

{
  undefined4 uVar1;
  long unaff_x19;
  long unaff_x21;
  undefined8 in_stack_00000010;
  
  if (param_1 != 0xe2) {
    func_0x00746324();
    if ((*(char *)(unaff_x21 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    uVar1 = 10;
    if (in_stack_00000010._4_4_ < 400) {
      uVar1 = 8;
    }
    return uVar1;
  }
  if (-1 < *(char *)(unaff_x21 + 3)) {
    return 0;
  }
  if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0) ||
     (0 < *(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8))) {
    func_0x0073cab8();
  }
  return 0;
}

