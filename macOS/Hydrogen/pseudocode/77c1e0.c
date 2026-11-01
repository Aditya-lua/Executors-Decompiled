
undefined8 FUN_0077c1e0(void)

{
  undefined8 uVar1;
  long unaff_x19;
  long lVar2;
  
  uVar1 = func_0x0076e34c();
  (*pcRam0000000000a2b5f0)();
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  lVar2 = *(long *)(unaff_x19 + 0x18);
  if ((*(int *)(lVar2 + 0x4a8) != 7) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b580 < 1) goto LAB_0077c268;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b580 < 1)
    goto LAB_0077c268;
    func_0x0073d0f4();
  }
LAB_0077c268:
  *(undefined4 *)(lVar2 + 0x4a8) = 7;
  return 0;
}

