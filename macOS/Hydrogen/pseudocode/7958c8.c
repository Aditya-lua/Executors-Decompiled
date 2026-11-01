
undefined8 FUN_007958c8(void)

{
  int iVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x21;
  
  lVar2 = _strlen();
  if ((lVar2 != unaff_x21) || (iVar1 = _memcmp(), iVar1 != 0)) {
    func_0x0073c9e4();
    return 0x23;
  }
  if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  return 0;
}

