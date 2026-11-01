
undefined8 FUN_0074a45c(void)

{
  undefined8 uVar1;
  long unaff_x19;
  long lVar2;
  long unaff_x21;
  
  uVar1 = func_0x0076e34c();
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  lVar2 = *(long *)(unaff_x19 + 0x18);
  if ((((*(char *)(lVar2 + 0x4f6) != '\x1d') && (*(char *)(unaff_x21 + 3) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
    func_0x0073cfbc();
  }
  *(undefined1 *)(lVar2 + 0x4f6) = 0x1d;
  return 0;
}

