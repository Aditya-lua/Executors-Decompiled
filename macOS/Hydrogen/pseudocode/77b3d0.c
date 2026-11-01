
/* WARNING: Removing unreachable block (ram,0x0077b0c4) */
/* WARNING: Removing unreachable block (ram,0x0077b10c) */
/* WARNING: Removing unreachable block (ram,0x0077b11c) */
/* WARNING: Removing unreachable block (ram,0x0077b124) */
/* WARNING: Removing unreachable block (ram,0x0077bb20) */
/* WARNING: Removing unreachable block (ram,0x0077bb34) */
/* WARNING: Removing unreachable block (ram,0x0077b12c) */
/* WARNING: Removing unreachable block (ram,0x0077b138) */
/* WARNING: Removing unreachable block (ram,0x0077b14c) */
/* WARNING: Removing unreachable block (ram,0x0077b174) */

undefined8 FUN_0077b3d0(void)

{
  uint uVar1;
  ulong uVar2;
  undefined8 uVar3;
  int iVar4;
  long unaff_x19;
  long unaff_x20;
  long lVar5;
  undefined *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 in_stack_00000020;
  
  if (0 < iRam0000000000a2b580) {
    func_0x0073d0f4();
  }
  *(undefined4 *)(unaff_x24 + 0x4a8) = 5;
  iVar4 = *(int *)(unaff_x20 + 0x4a8);
  if (iVar4 != 5) goto code_r0x0077b71c;
  lVar5 = *(long *)(unaff_x19 + 0x18);
  uVar2 = func_0x007315f4(lVar5,0);
  if ((uVar2 & 1) == 0) {
    uVar3 = func_0x00794ee8();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    *(undefined **)(lVar5 + 0x3a0) = &UNK_00a1f688;
    *(ulong *)(lVar5 + 0x398) = *(ulong *)(lVar5 + 0x398) | 0x8000000;
  }
  uVar3 = func_0x007311c4();
  if ((int)uVar3 != 0) {
    return uVar3;
  }
  if (*(int *)(unaff_x20 + 0x4a8) != 5) {
    if (*(long *)(unaff_x20 + 0x400) != 0) {
      uVar3 = func_0x0076e5ec();
      return uVar3;
    }
    unaff_x23 = &UNK_008ce389;
    while( true ) {
      uVar3 = func_0x0076e374();
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      iVar4 = *(int *)(unaff_x20 + 0x4a8);
      if (iVar4 != 0xc && in_stack_00000020._4_4_ != 1) {
        *(int *)(&UNK_00001350 + unaff_x19) = in_stack_00000020._4_4_;
      }
      if (in_stack_00000020._4_4_ == 0) break;
      uVar1 = iVar4 - 1;
      if (uVar1 < 0xb) {
                    /* WARNING: Could not recover jumptable at 0x0077b1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar3 = (*(code *)(&UNK_0077b1ec + (ulong)(byte)unaff_x23[uVar1] * 4))();
        return uVar3;
      }
      lVar5 = *(long *)(unaff_x19 + 0x18);
      if ((((unaff_x19 != 0) && (*(int *)(lVar5 + 0x4a8) != 0)) && (*(char *)(unaff_x25 + 3) < '\0')
          ) && (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580))))
      {
        func_0x0073d0f4();
      }
      *(undefined4 *)(lVar5 + 0x4a8) = 0;
      iVar4 = *(int *)(unaff_x20 + 0x4a8);
code_r0x0077b71c:
      if (iVar4 == 0) {
        return 0;
      }
      uVar2 = func_0x0076e6e0();
      if ((uVar2 & 1) == 0) {
        return 0;
      }
    }
  }
  return 0;
}

