
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0049dbd0(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int *piVar4;
  undefined8 extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 extraout_x9;
  undefined8 extraout_x10;
  undefined8 *unaff_x19;
  code *pcVar5;
  undefined1 auVar6 [16];
  
  pcVar5 = (code *)*unaff_x19;
  piVar4 = (int *)(*pcVar5)();
  if (*piVar4 == 1) {
    (*pcVar5)();
  }
  else {
    func_0x0042b2b8();
    auVar6 = (*pcVar5)(extraout_x8);
    *auVar6._0_8_ = 1;
    auVar6._0_8_[2] = auVar6._8_8_;
  }
  auVar6 = (*pcVar5)();
  *(undefined8 *)(auVar6._0_8_ + 8) = extraout_x10;
  extraout_x8_00[4] = extraout_x9;
  extraout_x8_00[5] = auVar6._8_8_;
  uVar3 = _UNK_009e2cb8;
  uVar2 = _UNK_009e2cb0;
  uVar1 = _UNK_009e2ca0;
  extraout_x8_00[1] = _UNK_009e2ca8;
  *extraout_x8_00 = uVar1;
  extraout_x8_00[3] = uVar3;
  extraout_x8_00[2] = uVar2;
  return;
}

