
ulong FUN_007306c0(uint param_1)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  long *unaff_x19;
  long unaff_x20;
  long lVar4;
  long lVar5;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar6 [12];
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  uVar1 = 7;
  if (param_1 != 1) {
    uVar1 = param_1;
  }
  iVar2 = *(int *)(unaff_x26 + 0x98);
  if (iVar2 != -1) {
    lVar4 = unaff_x19[3];
    if ((lVar4 == 0) || (lVar5 = *(long *)(lVar4 + 0x20), func_0x0076b038(), lVar5 == 0)) {
      _close(iVar2);
    }
    else {
      func_0x0076bad4();
      (**(code **)(lVar4 + 0x20))(*(undefined8 *)(lVar4 + 0x28),iVar2);
      func_0x0076bad4();
    }
    *(undefined4 *)(unaff_x26 + 0x98) = 0xffffffff;
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
    return (ulong)uVar1;
  }
  auVar6 = ___stack_chk_fail();
  lVar4 = auVar6._0_8_;
  if (auVar6._8_4_ == 0) {
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

