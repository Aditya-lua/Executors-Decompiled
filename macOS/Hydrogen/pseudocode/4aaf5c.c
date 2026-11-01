
void FUN_004aaf5c(undefined8 param_1)

{
  undefined1 auVar1 [16];
  ulong uVar2;
  long *plVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined1 auVar7 [16];
  int in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  int aiStack_180 [2];
  ulong uStack_178;
  undefined8 uStack_170;
  ulong uStack_168;
  undefined8 uStack_160;
  long lStack_158;
  int aiStack_120 [2];
  ulong uStack_118;
  undefined8 uStack_110;
  ulong uStack_108;
  undefined8 uStack_100;
  long lStack_f8;
  int aiStack_c0 [2];
  ulong uStack_b8;
  undefined8 uStack_b0;
  ulong uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  int aiStack_60 [2];
  ulong uStack_58;
  undefined8 uStack_50;
  ulong uStack_48;
  undefined8 uStack_40;
  long lStack_38;
  
  uStack0000000000000020 = 8;
  uStack0000000000000028 = param_1;
  func_0x0079a108();
  if (in_stack_00000000 != 1) {
    *unaff_x20 = unaff_x21;
    unaff_x20[1] = in_stack_00000008;
    return;
  }
  auVar7 = func_0x007a1f00(in_stack_00000008,in_stack_00000010);
  auVar7._8_8_ = auVar7._8_8_;
  auVar7._0_8_ = auVar7._0_8_;
  uVar5 = *auVar7._0_8_;
  uVar6 = uVar5 * 2;
  if (uVar6 < 5) {
    uVar6 = 4;
  }
  if (uVar5 >> 0x3d == 0 && uVar6 * 4 < 0x7ffffffffffffffd) {
    uStack_40 = 0;
    if (uVar5 != 0) {
      uStack_48 = auVar7._0_8_[1];
      lStack_38 = uVar5 << 2;
      uStack_40 = 4;
    }
    func_0x0079a108(aiStack_60,4,uVar6 * 4,&uStack_48);
    if (aiStack_60[0] != 1) {
      *auVar7._0_8_ = uVar6;
      auVar7._0_8_[1] = uStack_58;
      return;
    }
  }
  else {
    func_0x007a1f00(0,auVar7._8_8_,auVar7._8_8_);
  }
  auVar7 = func_0x007a1f00(uStack_58,uStack_50,auVar7._8_8_);
  auVar7._8_8_ = auVar7._8_8_;
  auVar7._0_8_ = auVar7._0_8_;
  uVar5 = *auVar7._0_8_;
  uVar6 = uVar5 * 2;
  if (uVar6 < 5) {
    uVar6 = 4;
  }
  if (uVar5 >> 0x3b == 0 && uVar6 * 0x10 < 0x7ffffffffffffff9) {
    uStack_a0 = 0;
    if (uVar5 != 0) {
      uStack_a8 = auVar7._0_8_[1];
      lStack_98 = uVar5 << 4;
      uStack_a0 = 8;
    }
    func_0x0079a108(aiStack_c0,8,uVar6 * 0x10,&uStack_a8);
    if (aiStack_c0[0] != 1) {
      *auVar7._0_8_ = uVar6;
      auVar7._0_8_[1] = uStack_b8;
      return;
    }
  }
  else {
    func_0x007a1f00(0,auVar7._8_8_,auVar7._8_8_);
  }
  auVar7 = func_0x007a1f00(uStack_b8,uStack_b0,auVar7._8_8_);
  auVar7._8_8_ = auVar7._8_8_;
  auVar7._0_8_ = auVar7._0_8_;
  uVar5 = *auVar7._0_8_;
  uVar6 = uVar5 * 2;
  if (uVar6 < 5) {
    uVar6 = 4;
  }
  auVar7._8_8_ = 0;
  auVar7._0_8_ = uVar6;
  if (SUB168(auVar7 * ZEXT816(0xb0),8) == 0) {
    uVar2 = 0;
    uVar4 = auVar7._8_8_;
    if (uVar6 * 0xb0 < 0x7ffffffffffffff9) {
      uStack_100 = 0;
      if (uVar5 != 0) {
        uStack_108 = auVar7._0_8_[1];
        lStack_f8 = uVar5 * 0xb0;
        uStack_100 = 8;
      }
      func_0x0079a108(aiStack_120,8,uVar6 * 0xb0,&uStack_108);
      if (aiStack_120[0] != 1) {
        *auVar7._0_8_ = uVar6;
        auVar7._0_8_[1] = uStack_118;
        return;
      }
      goto LAB_004ab1d4;
    }
  }
  else {
    func_0x007a1f00(0,auVar7._8_8_,auVar7._8_8_);
LAB_004ab1d4:
    uVar2 = uStack_118;
    uVar4 = uStack_110;
  }
  auVar7 = func_0x007a1f00(uVar2,uVar4,auVar7._8_8_);
  auVar7._8_8_ = auVar7._8_8_;
  auVar7._0_8_ = auVar7._0_8_;
  uVar5 = *auVar7._0_8_;
  uVar6 = uVar5 * 2;
  if (uVar6 < 5) {
    uVar6 = 4;
  }
  auVar1._8_8_ = 0;
  auVar1._0_8_ = uVar6;
  if (SUB168(auVar1 * ZEXT816(0xc),8) == 0) {
    uVar2 = 0;
    uVar4 = auVar7._8_8_;
    if (0x7ffffffffffffffc < uVar6 * 0xc) goto LAB_004ab29c;
    uStack_160 = 0;
    if (uVar5 != 0) {
      uStack_168 = auVar7._0_8_[1];
      lStack_158 = uVar5 * 0xc;
      uStack_160 = 4;
    }
    func_0x0079a108(aiStack_180,4,uVar6 * 0xc,&uStack_168);
    if (aiStack_180[0] != 1) {
      *auVar7._0_8_ = uVar6;
      auVar7._0_8_[1] = uStack_178;
      return;
    }
  }
  else {
    func_0x007a1f00(0,auVar7._8_8_,auVar7._8_8_);
  }
  uVar2 = uStack_178;
  uVar4 = uStack_170;
LAB_004ab29c:
  plVar3 = (long *)func_0x007a1f00(uVar2,uVar4,auVar7._8_8_);
  if (*plVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar3[1],*plVar3 * 600,8);
  return;
}

