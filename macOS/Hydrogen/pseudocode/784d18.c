
undefined8 FUN_00784d18(void)

{
  int iVar1;
  char in_NG;
  bool in_ZR;
  char in_OV;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  
  if (in_ZR || in_NG != in_OV) {
    lVar2 = func_0x00782dc4();
    if ((*(long *)(unaff_x19 + 0x2e8) == 0) ||
       (lVar2 = SUB168(SEXT816(lVar2) * SEXT816(unaff_x23),8),
       (lVar2 >> 7) - (lVar2 >> 0x3f) <= *(long *)(unaff_x19 + 0x2e8))) {
      if (*(long *)(*(long *)(unaff_x20 + 0x3a0) + 0x78) == 0) {
        func_0x00768a04();
        uVar3 = func_0x0073204c();
        func_0x0076891c();
        if ((uVar3 & 1) != 0) {
          return 0;
        }
      }
      else {
        func_0x00768a04();
        uVar3 = (**(code **)(*(long *)(unaff_x20 + 0x3a0) + 0x78))();
        func_0x0076891c();
        if ((uVar3 & 1) == 0) {
          return 0;
        }
      }
      goto LAB_00784e28;
    }
    if (-1 < *(char *)(unaff_x19 + 0xa1d)) goto LAB_00784e28;
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) != 0) {
      iVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8);
      goto joined_r0x00784d90;
    }
  }
  else {
    if (-1 < *(char *)(unaff_x19 + 0xa1d)) goto LAB_00784e28;
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) != 0) {
      iVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8);
joined_r0x00784d90:
      if (iVar1 < 1) goto LAB_00784e28;
    }
  }
  func_0x0073cab8();
LAB_00784e28:
  if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  return 1;
}

