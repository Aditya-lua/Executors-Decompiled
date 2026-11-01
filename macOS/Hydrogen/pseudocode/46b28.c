
void FUN_00046b28(long param_1)

{
  ulong uVar1;
  long unaff_x19;
  
  func_0x00044258(param_1 + -0x38);
  *(undefined **)(unaff_x19 + 0x38) = &UNK_009f8528;
  *(undefined **)(unaff_x19 + 0x40) = &UNK_009f85d0;
  uVar1 = *(ulong *)(
                    "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
                    + unaff_x19 + 8);
  if (*(ulong *)(
                "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
                + unaff_x19 + 0x10) <=
      *(ulong *)(
                "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
                + unaff_x19 + 8)) {
    uVar1 = *(ulong *)(
                      "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
                      + unaff_x19 + 0x10);
  }
  "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
  [unaff_x19 + 1] = '\0';
  if (*(long *)(
               "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
               + unaff_x19 + 0x18) == unaff_x19 + 0xb0 && uVar1 != 0) {
    do {
      *(undefined4 *)(unaff_x19 + 0xac + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  uVar1 = *(ulong *)(unaff_x19 + 0x98);
  if (*(ulong *)(unaff_x19 + 0xa0) <= *(ulong *)(unaff_x19 + 0x98)) {
    uVar1 = *(ulong *)(unaff_x19 + 0xa0);
  }
  *(undefined1 *)(unaff_x19 + 0x91) = 0;
  if ((*(long *)(unaff_x19 + 0xa8) == unaff_x19 + 0x48) && (uVar1 != 0)) {
    do {
      *(undefined4 *)(unaff_x19 + 0x44 + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  return;
}

