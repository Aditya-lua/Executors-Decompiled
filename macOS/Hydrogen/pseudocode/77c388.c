
undefined8 FUN_0077c388(code *param_1)

{
  long unaff_x19;
  long lVar1;
  undefined8 unaff_x21;
  
  (*param_1)();
  if ((int)unaff_x21 != 0) {
    return unaff_x21;
  }
  lVar1 = *(long *)(unaff_x19 + 0x18);
  if ((((*(int *)(lVar1 + 0x4a8) != 9) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
    func_0x0073d0f4();
  }
  *(undefined4 *)(lVar1 + 0x4a8) = 9;
  return 0;
}

