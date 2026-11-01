
undefined8 FUN_0074b1ec(long param_1)

{
  long unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000000;
  char *pcStack0000000000000008;
  
  if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto LAB_0074b240;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto LAB_0074b240;
    uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + param_1 * 8);
    pcStack0000000000000008 = "STOR_PREQUOTE";
    func_0x0073cfbc();
  }
LAB_0074b240:
  *(undefined1 *)(unaff_x20 + 0x4f6) = 0xe;
  return 0;
}

