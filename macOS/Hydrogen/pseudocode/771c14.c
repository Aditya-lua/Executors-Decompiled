
undefined8 FUN_00771c14(void)

{
  uint *puVar1;
  undefined4 in_w8;
  int iVar2;
  long unaff_x19;
  undefined4 *unaff_x20;
  
  *unaff_x20 = in_w8;
  *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) & 0xffffffd5;
  puVar1 = (uint *)(unaff_x19 + 0x1c1);
  *puVar1 = *puVar1 | 0x100;
  *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) & 0xffffffbd;
  func_0x007706e4();
  func_0x00774d50();
  if ((*puVar1 >> 9 & 1) == 0) {
    if (*(long *)(unaff_x19 + 0x100) == 0) {
      if ((((*puVar1 >> 3 & 1) != 0) || (-1 < *(char *)(unaff_x19 + 0xa1d))) ||
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0 &&
          (*(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8) < 1)))) goto DAT_007842a0;
      func_0x00774c24();
    }
    else {
      if (-1 < *(char *)(unaff_x19 + 0xa1d)) goto DAT_007842a0;
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) != 0) {
        iVar2 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
        goto joined_r0x00771bac;
      }
    }
  }
  else {
    func_0x00729888(unaff_x19 + 0x150);
    iVar2 = (int)*(undefined8 *)(unaff_x19 + 0xa1a);
    if (*(long *)(unaff_x19 + 0x100) == 0) {
      if (-1 < iVar2) goto DAT_007842a0;
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) != 0) {
        iVar2 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
        goto joined_r0x00771bac;
      }
    }
    else {
      if (-1 < iVar2) goto DAT_007842a0;
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) != 0) {
        iVar2 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
joined_r0x00771bac:
        if (iVar2 < 1) goto DAT_007842a0;
      }
    }
  }
  func_0x0073cab8();
DAT_007842a0:
  func_0x00731e20();
  return 0;
}

