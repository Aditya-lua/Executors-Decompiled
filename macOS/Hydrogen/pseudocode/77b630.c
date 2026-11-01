
undefined8 FUN_0077b630(void)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  long lVar4;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar5;
  int unaff_w28;
  undefined8 in_stack_00000020;
  
  *(undefined4 *)(unaff_x24 + 0x4a8) = 0;
  if (unaff_w28 == 0xfa) {
    while ((*(int *)(unaff_x20 + 0x4a8) != 0 && (uVar3 = func_0x0076e6e0(), (uVar3 & 1) != 0))) {
      uVar5 = func_0x0076e374();
      if ((int)uVar5 != 0) {
        return uVar5;
      }
      iVar1 = *(int *)(unaff_x20 + 0x4a8);
      if (iVar1 != 0xc && in_stack_00000020._4_4_ != 1) {
        *(int *)(&UNK_00001350 + unaff_x19) = in_stack_00000020._4_4_;
      }
      if (in_stack_00000020._4_4_ == 0) break;
      uVar2 = iVar1 - 1;
      if (uVar2 < 0xb) {
                    /* WARNING: Could not recover jumptable at 0x0077b1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar5 = (*(code *)(&UNK_0077b1ec + (ulong)*(byte *)(unaff_x23 + (ulong)uVar2) * 4))();
        return uVar5;
      }
      lVar4 = *(long *)(unaff_x19 + 0x18);
      if ((((unaff_x19 != 0) && (*(int *)(lVar4 + 0x4a8) != 0)) && (*(char *)(unaff_x25 + 3) < '\0')
          ) && (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580))))
      {
        func_0x0073d0f4();
      }
      *(undefined4 *)(lVar4 + 0x4a8) = 0;
    }
    uVar5 = 0;
  }
  else {
    uVar5 = 8;
  }
  return uVar5;
}

