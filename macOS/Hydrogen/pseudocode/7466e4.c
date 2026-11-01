
void FUN_007466e4(long param_1,long param_2)

{
  uint unaff_w19;
  long unaff_x20;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  if (((uint)param_1 != unaff_w19) && (*(char *)(param_2 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 param_2 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto LAB_00746738;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_2 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto LAB_00746738;
    uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + param_1 * 8);
    uStack0000000000000008 = *(undefined8 *)(&UNK_00a1e570 + (ulong)unaff_w19 * 8);
    func_0x0073cfbc(param_2,"[%s] -> [%s]");
  }
LAB_00746738:
  *(char *)(unaff_x20 + 0x4f6) = (char)unaff_w19;
  return;
}

