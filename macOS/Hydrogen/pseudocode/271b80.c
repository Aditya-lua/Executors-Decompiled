
undefined1  [16] FUN_00271b80(int param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 unaff_x20;
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000008;
  
  if (param_1 == 1) {
    uStack0000000000000008 = 0;
    iVar2 = func_0x002db358();
    lVar1 = uStack0000000000000008;
    func_0x002d8d08();
    lVar3 = 0;
    if ((iVar2 != 1) || (lVar1 == 0)) goto LAB_00271bf0;
    uStack0000000000000008 = lVar1;
    auVar4 = func_0x00275e94(&uStack0000000000000008,0);
    lVar3 = auVar4._0_8_;
    if (lVar3 != 0) {
      func_0x002d8de8(lVar1);
      unaff_x20 = auVar4._8_8_;
      goto LAB_00271bf0;
    }
    func_0x002d8de8(lVar1);
  }
  else {
    func_0x002d8d08();
  }
  lVar3 = 0;
LAB_00271bf0:
  auVar4._8_8_ = unaff_x20;
  auVar4._0_8_ = lVar3;
  return auVar4;
}

