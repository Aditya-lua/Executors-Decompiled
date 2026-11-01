
/* WARNING: Removing unreachable block (ram,0x001e212c) */

undefined1  [16]
FUN_001e20a8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 unaff_x20;
  undefined8 unaff_x22;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000008;
  
  auVar3 = func_0x00270068(param_1,param_2,param_5);
  uStack0000000000000008 = unaff_x22;
  if ((auVar3._0_8_ & 1) != 0) {
    unaff_x20 = 0;
    goto LAB_001e2158;
  }
  auVar4 = func_0x00276008();
  uVar2 = auVar4._8_8_;
  if ((auVar4._0_8_ & 1) == 0) {
    iVar1 = func_0x002dae38(uVar2);
    if ((iVar1 == 1) && (iVar1 = func_0x002dae90(uVar2,auVar3._8_8_), iVar1 == 1)) {
      uStack0000000000000008 = 0x42;
      iVar1 = func_0x002db0bc(uVar2);
      if (iVar1 != 1) goto LAB_001e2144;
    }
    else {
LAB_001e2144:
      unaff_x20 = 0;
      uStack0000000000000008 = unaff_x22;
    }
    func_0x002d8d08(uVar2);
  }
  else {
    unaff_x20 = 0;
  }
  func_0x002d8de8(auVar3._8_8_);
LAB_001e2158:
  auVar3._8_8_ = uStack0000000000000008;
  auVar3._0_8_ = unaff_x20;
  return auVar3;
}

