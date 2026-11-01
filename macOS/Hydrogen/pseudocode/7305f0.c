
undefined8 FUN_007305f0(void)

{
  int iVar1;
  undefined4 *puVar2;
  long *unaff_x19;
  long unaff_x20;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long unaff_x24;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar6 [16];
  undefined1 auVar7 [12];
  undefined8 in_stack_00000040;
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  func_0x0073cab8();
  *(ulong *)(unaff_x24 + 0x398) = *(ulong *)(unaff_x24 + 0x398) | 0x100000;
  iVar1 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
  if (iVar1 < 0) {
    puVar2 = (undefined4 *)___error();
    *(undefined4 *)(unaff_x26 + 0x130) = *puVar2;
    uVar3 = 1;
    iVar1 = *(int *)(unaff_x26 + 0x98);
    if (iVar1 != -1) {
      lVar4 = unaff_x19[3];
      if ((lVar4 == 0) || (lVar5 = *(long *)(lVar4 + 0x20), func_0x0076b038(), lVar5 == 0)) {
        _close(iVar1);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar4 + 0x20))(*(undefined8 *)(lVar4 + 0x28),iVar1);
        func_0x0076bad4();
      }
      *(undefined4 *)(unaff_x26 + 0x98) = 0xffffffff;
    }
  }
  else {
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (in_stack_00000040._4_4_ == 0) {
      uVar3 = 0;
    }
    else {
      func_0x0072fadc(unaff_x19[2]);
      auVar6 = func_0x00782d28();
      uVar3 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar6;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
    }
  }
  if (*(char *)(unaff_x20 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (unaff_x19 == (long *)0x0) goto code_r0x0072fed8;
    }
    else if ((unaff_x19 == (long *)0x0) ||
            (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8) < 1)) goto code_r0x0072fed8;
    if (0 < *(int *)(*unaff_x19 + 0xc)) {
      func_0x0073cbdc();
    }
  }
code_r0x0072fed8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar3;
  }
  auVar7 = ___stack_chk_fail();
  lVar4 = auVar7._0_8_;
  if (auVar7._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar3 = (*(code *)PTR__connect_00a24cd0)
                      (*(undefined4 *)(lVar4 + 0x98),lVar4 + 0x18,*(undefined4 *)(lVar4 + 0x14));
    return uVar3;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar4 + 0x18;
  uStack_18 = *(undefined4 *)(lVar4 + 0x14);
  uVar3 = _connectx(*(undefined4 *)(lVar4 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar3;
}

