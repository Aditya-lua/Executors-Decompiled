
undefined8 FUN_007958d8(void)

{
  int iVar1;
  long unaff_x19;
  
  iVar1 = _memcmp();
  if (iVar1 != 0) {
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

