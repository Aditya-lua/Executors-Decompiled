
undefined8 FUN_00797964(long param_1)

{
  bool bVar1;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x23;
  long unaff_x24;
  
  (**(code **)(param_1 + 0x5f0))();
  *(undefined8 *)(unaff_x20 + 0x30) = 0;
  *(undefined8 *)(unaff_x20 + 0x38) = 0;
  *(undefined4 *)(unaff_x20 + 0x18) = 0;
  *(undefined8 *)(unaff_x20 + 0x10) = 0;
  (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x20 + 0x20));
  *(undefined8 *)(unaff_x20 + 0x20) = 0;
  (*pcRam0000000000a2b5f0)();
  if ((int)unaff_x23 != 0) {
    func_0x0073c9e4();
    goto code_r0x00797a9c;
  }
  if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (0 < iRam0000000000a2b590) goto code_r0x00797a20;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8) < 1;
      if ((!bVar1 && iRam0000000000a2b590 != 0) && (bVar1 || -1 < iRam0000000000a2b590)) {
code_r0x00797a20:
        if (unaff_x24 != 0) {
          func_0x006f4058(unaff_x24 + 0x20);
        }
        func_0x0073d22c();
      }
    }
  }
  unaff_x23 = 0;
code_r0x00797a9c:
  if ((*(long *)(unaff_x19 + 0xe0) != 0) &&
     ((*(byte *)(*(long *)(unaff_x19 + 0xe0) + 4) >> 4 & 1) != 0)) {
    func_0x00779d40();
  }
  return unaff_x23;
}

