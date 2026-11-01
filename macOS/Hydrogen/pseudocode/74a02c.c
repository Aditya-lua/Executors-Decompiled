
undefined8 FUN_0074a02c(long param_1)

{
  long unaff_x19;
  uint unaff_w20;
  long unaff_x21;
  undefined1 unaff_w22;
  long unaff_x23;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
               unaff_x19 + 0x18) == 0) {
    if (iRam0000000000a2b570 < 1) goto LAB_0074a074;
  }
  else if (*(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
  goto LAB_0074a074;
  uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + param_1 * 8);
  uStack0000000000000008 = *(undefined8 *)(&UNK_00a1e570 + (ulong)unaff_w20 * 8);
  func_0x0073cfbc();
LAB_0074a074:
  *(char *)(unaff_x23 + 0x4f6) = (char)unaff_w20;
  *(undefined1 *)(unaff_x21 + 0x4c0) = unaff_w22;
  return 0;
}

