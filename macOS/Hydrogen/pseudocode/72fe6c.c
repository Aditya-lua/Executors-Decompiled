
void FUN_0072fe6c(void)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar2 [12];
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  func_0x0076bad4();
  *(undefined4 *)(unaff_x26 + 0x98) = 0xffffffff;
  if (*(char *)(unaff_x20 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (unaff_x19 == (long *)0x0) goto LAB_0072fed8;
    }
    else if ((unaff_x19 == (long *)0x0) ||
            (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8) < 1)) goto LAB_0072fed8;
    if (0 < *(int *)(*unaff_x19 + 0xc)) {
      func_0x0073cbdc();
    }
  }
LAB_0072fed8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return;
  }
  auVar2 = ___stack_chk_fail();
  lVar1 = auVar2._0_8_;
  if (auVar2._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__connect_00a24cd0)
              (*(undefined4 *)(lVar1 + 0x98),lVar1 + 0x18,*(undefined4 *)(lVar1 + 0x14));
    return;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar1 + 0x18;
  uStack_18 = *(undefined4 *)(lVar1 + 0x14);
  _connectx(*(undefined4 *)(lVar1 + 0x98),auStack_38,0,3,0,0,0,0);
  return;
}

