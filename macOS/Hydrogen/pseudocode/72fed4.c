
void FUN_0072fed4(void)

{
  long lVar1;
  long unaff_x29;
  undefined1 auVar2 [12];
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  func_0x0073cbdc();
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

