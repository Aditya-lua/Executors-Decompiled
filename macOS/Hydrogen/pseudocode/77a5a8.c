
undefined8 FUN_0077a5a8(long param_1)

{
  undefined8 uVar1;
  char *pcVar2;
  long in_x9;
  long unaff_x19;
  byte *unaff_x20;
  long unaff_x21;
  long lVar3;
  long unaff_x25;
  undefined8 uStack0000000000000000;
  char *pcStack0000000000000008;
  
  uStack0000000000000000 = *(undefined8 *)(in_x9 + 0x768 + param_1 * 8);
  pcStack0000000000000008 = "MAIL";
  func_0x0073d0f4();
  *(undefined4 *)(unaff_x21 + 0x4a8) = 8;
  lVar3 = *(long *)(unaff_x19 + 0x18);
  uVar1 = func_0x0076dfc0();
  *unaff_x20 = *(int *)(lVar3 + 0x4a8) == 0;
  pcVar2 = (char *)func_0x00731574(*(undefined8 *)(unaff_x19 + 0x18),0);
  if ((*(char *)(unaff_x25 + 3) < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)))) {
    uStack0000000000000000 = uVar1;
    pcStack0000000000000008 = pcVar2;
    func_0x0073d0f4();
  }
  if ((((int)uVar1 == 0) && (*unaff_x20 != 0)) && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
    func_0x00783c98();
  }
  if (*(char *)(unaff_x25 + 3) < '\0') {
    if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)) {
      pcStack0000000000000008 = (char *)(ulong)*unaff_x20;
      uStack0000000000000000 = uVar1;
      func_0x0073d0f4();
      if (-1 < *(char *)(unaff_x25 + 3)) {
        return uVar1;
      }
    }
    if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)) {
      pcStack0000000000000008 = (char *)(ulong)*unaff_x20;
      uStack0000000000000000 = uVar1;
      func_0x0073d0f4();
    }
  }
  return uVar1;
}

