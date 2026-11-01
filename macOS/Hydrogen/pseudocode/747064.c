
undefined8 FUN_00747064(void)

{
  char *pcVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x20;
  
  pcVar1 = (char *)func_0x00740a58();
  if ((*(long *)(unaff_x20 + 0x4d0) == 0) && (*pcVar1 != '/')) {
    uVar2 = func_0x0076e34c();
    if ((int)uVar2 != 0) {
      (*pcRam0000000000a2b5f0)(pcVar1);
      return uVar2;
    }
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x20 + 0x498));
    *(char **)(unaff_x20 + 0x498) = pcVar1;
    if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
      pcVar1 = *(char **)(unaff_x20 + 0x498);
    }
    *(char **)(
              "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
              + unaff_x19 + 0x50) = pcVar1;
    func_0x007466c4();
  }
  else {
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x20 + 0x498));
    *(char **)(unaff_x20 + 0x498) = pcVar1;
    if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
      pcVar1 = *(char **)(unaff_x20 + 0x498);
    }
    *(char **)(
              "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
              + unaff_x19 + 0x50) = pcVar1;
    func_0x007466c4();
    if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) {
        if (iRam0000000000a2b570 < 1) {
          return 0;
        }
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1) {
        return 0;
      }
      func_0x0073cfbc();
    }
  }
  return 0;
}

