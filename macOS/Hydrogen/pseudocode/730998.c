
void FUN_00730998(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long unaff_x19;
  long unaff_x21;
  
  iVar1 = _setsockopt(param_1,6,0x102,param_4,4);
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

