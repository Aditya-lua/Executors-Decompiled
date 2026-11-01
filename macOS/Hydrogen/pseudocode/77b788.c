
undefined8 FUN_0077b788(long param_1)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  long lVar5;
  long unaff_x25;
  char *pcStack0000000000000000;
  undefined8 in_stack_00000020;
  
  if ((in_x9 & 1) == 0) {
    pcStack0000000000000000 = (char *)(ulong)*(uint *)(param_1 + 0x18);
    func_0x0073c9e4();
    uVar4 = 0x37;
  }
  else {
    pcStack0000000000000000 = "DATA";
    uVar4 = func_0x0076e34c();
    if ((int)uVar4 == 0) {
      lVar5 = *(long *)(unaff_x19 + 0x18);
      uVar2 = *(uint *)(lVar5 + 0x4a8);
      if ((((uVar2 != 10) && (*(char *)(unaff_x25 + 3) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
        pcStack0000000000000000 = *(char **)(&UNK_00a1f768 + (ulong)uVar2 * 8);
        func_0x0073d0f4();
      }
      *(undefined4 *)(lVar5 + 0x4a8) = 10;
      while ((*(int *)(unaff_x20 + 0x4a8) != 0 && (uVar3 = func_0x0076e6e0(), (uVar3 & 1) != 0))) {
        uVar4 = func_0x0076e374();
        if ((int)uVar4 != 0) goto code_r0x0077bb50;
        iVar1 = *(int *)(unaff_x20 + 0x4a8);
        if (iVar1 != 0xc && in_stack_00000020._4_4_ != 1) {
          *(int *)(&UNK_00001350 + unaff_x19) = in_stack_00000020._4_4_;
        }
        if (in_stack_00000020._4_4_ == 0) break;
        uVar2 = iVar1 - 1;
        if (uVar2 < 0xb) {
                    /* WARNING: Could not recover jumptable at 0x0077b1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar4 = (*(code *)(&UNK_0077b1ec + (ulong)*(byte *)(unaff_x23 + (ulong)uVar2) * 4))();
          return uVar4;
        }
        lVar5 = *(long *)(unaff_x19 + 0x18);
        if ((((unaff_x19 != 0) && (uVar2 = *(uint *)(lVar5 + 0x4a8), uVar2 != 0)) &&
            (*(char *)(unaff_x25 + 3) < '\0')) &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)))) {
          pcStack0000000000000000 = *(char **)(&UNK_00a1f768 + (ulong)uVar2 * 8);
          func_0x0073d0f4();
        }
        *(undefined4 *)(lVar5 + 0x4a8) = 0;
      }
      uVar4 = 0;
    }
  }
code_r0x0077bb50:
  return uVar4;
}

