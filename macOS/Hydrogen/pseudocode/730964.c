
void FUN_00730964(void)

{
  char in_NG;
  char in_OV;
  int iVar1;
  long unaff_x19;
  long unaff_x21;
  undefined4 uStack000000000000001c;
  
  if (in_NG == in_OV) {
    ___error();
    func_0x0073cab8();
  }
  uStack000000000000001c = func_0x0078bbd8((long)*(int *)(unaff_x19 + 0x9b4));
  iVar1 = _setsockopt();
  if (((iVar1 < 0) && (*(char *)(unaff_x21 + 3) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    ___error();
    func_0x0073cab8();
    return;
  }
  return;
}

