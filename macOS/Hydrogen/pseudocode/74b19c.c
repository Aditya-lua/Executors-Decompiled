
undefined8 FUN_0074b19c(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long unaff_x19;
  long lVar3;
  undefined8 uStack0000000000000000;
  
  uVar1 = func_0x0076e34c();
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  uVar2 = (ulong)*(byte *)(lVar3 + 0x4f6);
  if ((uVar2 != 0xe) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto LAB_0074b240;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto LAB_0074b240;
    uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + uVar2 * 8);
    func_0x0073cfbc();
  }
LAB_0074b240:
  *(undefined1 *)(lVar3 + 0x4f6) = 0xe;
  return 0;
}

