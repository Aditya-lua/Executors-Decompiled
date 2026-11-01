
undefined8 FUN_0077a8c4(void)

{
  char cVar1;
  undefined8 uVar2;
  long unaff_x19;
  char *unaff_x20;
  long lVar3;
  long unaff_x25;
  undefined8 *unaff_x26;
  
  uVar2 = func_0x0076e34c();
  (*(code *)*unaff_x26)();
  (*(code *)*unaff_x26)();
  (*(code *)*unaff_x26)();
  if ((int)uVar2 == 0) {
    lVar3 = *(long *)(unaff_x19 + 0x18);
    if (((((unaff_x19 != 0) && (*(int *)(lVar3 + 0x4a8) != 8)) && (*(char *)(unaff_x25 + 3) < '\0'))
        && ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar3 + 0x4a8) = 8;
    lVar3 = *(long *)(unaff_x19 + 0x18);
    uVar2 = func_0x0076dfc0();
    *unaff_x20 = *(int *)(lVar3 + 0x4a8) == 0;
    func_0x00731574(*(undefined8 *)(unaff_x19 + 0x18),0);
    cVar1 = *(char *)(unaff_x25 + 3);
  }
  else {
    cVar1 = *(char *)(unaff_x25 + 3);
  }
  if (((cVar1 < '\0') &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
    func_0x0073d0f4();
  }
  if ((((int)uVar2 == 0) && (*unaff_x20 != '\0')) && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
    func_0x00783c98();
  }
  if (((*(char *)(unaff_x25 + 3) < '\0') &&
      (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) + 8) < 1)) ||
       ((iRam0000000000a2b580 < 1 || (func_0x0073d0f4(), *(char *)(unaff_x25 + 3) < '\0')))))) &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)))) {
    func_0x0073d0f4();
  }
  return uVar2;
}

