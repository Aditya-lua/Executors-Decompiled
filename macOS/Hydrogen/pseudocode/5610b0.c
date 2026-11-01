
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005610b0(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *extraout_x8;
  int in_w9;
  undefined8 extraout_x9;
  undefined8 extraout_x10;
  code *unaff_x20;
  undefined1 auVar4 [16];
  
  if (in_w9 == 1) {
    (*unaff_x20)();
  }
  else {
    func_0x0042b2b8();
    auVar4 = (*unaff_x20)(param_1);
    *auVar4._0_8_ = 1;
    auVar4._0_8_[2] = auVar4._8_8_;
  }
  auVar4 = (*unaff_x20)();
  *(undefined8 *)(auVar4._0_8_ + 8) = extraout_x10;
  extraout_x8[4] = extraout_x9;
  extraout_x8[5] = auVar4._8_8_;
  uVar3 = _UNK_009ee250;
  uVar2 = _UNK_009ee248;
  uVar1 = _UNK_009ee238;
  extraout_x8[1] = _UNK_009ee240;
  *extraout_x8 = uVar1;
  extraout_x8[3] = uVar3;
  extraout_x8[2] = uVar2;
  return;
}

