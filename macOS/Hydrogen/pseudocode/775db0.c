
undefined8 FUN_00775db0(void)

{
  long lVar1;
  bool bVar2;
  long unaff_x20;
  long *unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long lStack0000000000000008;
  ulong uStack0000000000000010;
  
  *unaff_x21 = unaff_x23;
  lVar1 = *(long *)(unaff_x24 + 0x30) + unaff_x23;
  bVar2 = lVar1 == *(long *)(unaff_x24 + 0x28);
  *(long *)(unaff_x24 + 0x30) = lVar1;
  *(bool *)unaff_x22 = bVar2;
  if ((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (iRam0000000000a2b550 < 1) {
        return 0;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8) < 1 || iRam0000000000a2b550 < 1) {
      return 0;
    }
    lStack0000000000000008 = *unaff_x21;
    uStack0000000000000010 = (ulong)bVar2;
    func_0x0073cd4c();
  }
  return 0;
}

