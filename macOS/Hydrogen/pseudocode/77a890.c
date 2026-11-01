
undefined8 FUN_0077a890(char *param_1)

{
  char cVar1;
  char *pcVar2;
  char *pcVar3;
  undefined8 uVar4;
  char *in_x9;
  ulong in_x10;
  long unaff_x19;
  byte *unaff_x20;
  long lVar5;
  long unaff_x25;
  undefined8 *unaff_x26;
  int unaff_w28;
  char *pcStack0000000000000008;
  ulong uStack0000000000000010;
  char *pcStack0000000000000028;
  
  pcStack0000000000000028 = " SMTPUTF8";
  if (unaff_w28 == 0) {
    pcStack0000000000000028 = in_x9;
  }
  pcStack0000000000000008 = param_1;
  uStack0000000000000010 = in_x10;
  uVar4 = func_0x0076e34c();
  (*(code *)*unaff_x26)();
  (*(code *)*unaff_x26)();
  (*(code *)*unaff_x26)();
  if ((int)uVar4 == 0) {
    lVar5 = *(long *)(unaff_x19 + 0x18);
    if (((((unaff_x19 != 0) && (*(int *)(lVar5 + 0x4a8) != 8)) && (*(char *)(unaff_x25 + 3) < '\0'))
        && ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
      pcStack0000000000000008 = "MAIL";
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar5 + 0x4a8) = 8;
    lVar5 = *(long *)(unaff_x19 + 0x18);
    uVar4 = func_0x0076dfc0();
    *unaff_x20 = *(int *)(lVar5 + 0x4a8) == 0;
    pcVar3 = (char *)func_0x00731574(*(undefined8 *)(unaff_x19 + 0x18),0);
    cVar1 = *(char *)(unaff_x25 + 3);
    pcVar2 = pcStack0000000000000008;
  }
  else {
    cVar1 = *(char *)(unaff_x25 + 3);
    pcVar3 = (char *)0x0;
    pcVar2 = pcStack0000000000000008;
  }
  pcStack0000000000000008 = pcVar3;
  if (((cVar1 < '\0') &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
    uStack0000000000000010 = (ulong)*unaff_x20;
    func_0x0073d0f4();
    pcVar2 = pcStack0000000000000008;
  }
  pcStack0000000000000008 = pcVar2;
  if ((((int)uVar4 == 0) && (*unaff_x20 != 0)) && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
    func_0x00783c98();
  }
  if (*(char *)(unaff_x25 + 3) < '\0') {
    if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)) {
      pcStack0000000000000008 = (char *)(ulong)*unaff_x20;
      func_0x0073d0f4();
      if (-1 < *(char *)(unaff_x25 + 3)) {
        return uVar4;
      }
    }
    if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)) {
      pcStack0000000000000008 = (char *)(ulong)*unaff_x20;
      func_0x0073d0f4();
    }
  }
  return uVar4;
}

