
undefined8 FUN_0077adb8(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined8 unaff_x21;
  long unaff_x22;
  
  uVar2 = func_0x0076dfc0(param_1,unaff_x22 + 1000,0,0);
  iVar1 = *(int *)(unaff_x22 + 0x4a8);
  *(bool *)unaff_x21 = iVar1 == 0;
  if (((int)uVar2 == 0 && iVar1 == 0) && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
    func_0x00783c98();
  }
  if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b580 < 1) {
        return uVar2;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b580 < 1) {
      return uVar2;
    }
    func_0x0073d0f4();
  }
  return uVar2;
}

