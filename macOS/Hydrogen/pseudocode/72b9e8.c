
void FUN_0072b9e8(void)

{
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  
  if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))) {
    func_0x0073cbdc();
  }
  func_0x007406b0();
  func_0x007406b0(unaff_x21 + 0x20);
  *(undefined4 *)(unaff_x21 + 0xa8) = 0;
  *(undefined4 *)(unaff_x21 + 0x98) = 1;
  *(undefined8 *)(unaff_x21 + 0xa0) = 0;
  *(byte *)(unaff_x21 + 0xac) = *(byte *)(unaff_x21 + 0xac) & 0xfd;
  if ((long *)unaff_x20[1] == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0072ba6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)unaff_x20[1] + 0x20))();
  return;
}

