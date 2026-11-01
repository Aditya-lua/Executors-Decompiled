
undefined8 FUN_00744708(undefined8 param_1)

{
  long unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  *(undefined8 *)(unaff_x19 + 0x4d8) = 0xffffffffffffffff;
  *(undefined1 *)(unaff_x19 + 0x4f8) = *(undefined1 *)(unaff_x20 + 0xa14);
  *(undefined1 *)(unaff_x19 + 0x4f9) = *(undefined1 *)(unaff_x20 + 0x6be);
  if (-1 < *(char *)(unaff_x20 + 0xa1d)) {
    return param_1;
  }
  if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
               unaff_x20 + 0x18) == 0) {
    if (iRam0000000000a2b570 < 1) {
      return 0;
    }
  }
  else {
    if (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x20 + 0x18) + 8) < 1) {
      return 0;
    }
    if (iRam0000000000a2b570 < 1) {
      return 0;
    }
  }
  uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x19 + 0x4f6) * 8);
  uStack0000000000000008 = 0;
  func_0x0073cfbc();
  return 0;
}

