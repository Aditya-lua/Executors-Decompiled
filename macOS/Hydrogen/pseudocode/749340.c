
void FUN_00749340(void)

{
  int iVar1;
  uint in_w9;
  long unaff_x19;
  int unaff_w20;
  long lVar2;
  long unaff_x22;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if ((in_w9 >> 6 & 1) != 0) {
    in_stack_00000018 = 0xffffffffffffffff;
  }
  if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  if (((unaff_w20 != 0x1f) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  *(char *)(unaff_x22 + 0x4f7) = (char)unaff_w20;
  *(undefined8 *)(unaff_x22 + 0x4c8) = in_stack_00000018;
  if (*(char *)(unaff_x19 + 0xa1b) < '\0') {
    iVar1 = func_0x007311c4();
    if (iVar1 != 0) {
      return;
    }
    if (in_stack_00000010._7_1_ == '\0') {
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      lVar2 = *(long *)(unaff_x19 + 0x18);
      if (((*(char *)(lVar2 + 0x4f6) != '\0') && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
        func_0x0073cfbc();
      }
      *(undefined1 *)(lVar2 + 0x4f6) = 0;
      *(byte *)(unaff_x22 + 0x4fa) = *(byte *)(unaff_x22 + 0x4fa) | 0x20;
      func_0x0074b3f8();
      return;
    }
    *(byte *)(unaff_x22 + 0x4fa) = *(byte *)(unaff_x22 + 0x4fa) & 0xdf;
  }
  func_0x0074b660();
  return;
}

