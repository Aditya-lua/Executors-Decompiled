
void FUN_0077a63c(undefined8 param_1)

{
  long unaff_x19;
  byte *unaff_x20;
  int unaff_w23;
  long unaff_x25;
  ulong uStack0000000000000008;
  ulong uStack0000000000000010;
  
  uStack0000000000000010 = (ulong)*unaff_x20;
  uStack0000000000000008 = param_1;
  func_0x0073d0f4();
  if (((unaff_w23 == 0) && (*unaff_x20 != 0)) && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
    func_0x00783c98();
  }
  if (*(char *)(unaff_x25 + 3) < '\0') {
    if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)) {
      uStack0000000000000008 = (ulong)*unaff_x20;
      func_0x0073d0f4();
      if (-1 < *(char *)(unaff_x25 + 3)) {
        return;
      }
    }
    if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)) {
      uStack0000000000000008 = (ulong)*unaff_x20;
      func_0x0073d0f4();
    }
  }
  return;
}

