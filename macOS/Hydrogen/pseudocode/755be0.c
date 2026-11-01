
undefined8 FUN_00755be0(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x22;
  long unaff_x27;
  
  iVar1 = func_0x00750940(param_1,*(undefined8 *)(unaff_x22 + 0x68));
  if (((iVar1 != 0) && (*(char *)(unaff_x27 + 3) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  if (((*(byte *)(*(long *)(unaff_x22 + 0x3a0) + 0x96) >> 2 & 1) == 0) ||
     (uVar2 = func_0x00772898(), (int)uVar2 == 0)) {
    func_0x0073c8fc();
    uVar2 = func_0x007738a0();
    if ((int)uVar2 == 0) {
      uVar2 = func_0x00754e80();
    }
  }
  return uVar2;
}

