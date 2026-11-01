
long FUN_001d8ddc(void)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  long lVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  undefined8 uVar8;
  ulong *in_x3;
  ulong uVar9;
  ulong uVar10;
  undefined1 auVar11 [16];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  int aiStack_1e0 [2];
  ulong uStack_1d8;
  long lStack_1d0;
  ulong uStack_1c8;
  undefined8 uStack_1c0;
  long lStack_1b8;
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
  ulong uStack_40;
  ulong uStack_38;
  
  auVar11 = func_0x007a1f00(in_stack_00000008,in_stack_00000010);
  auVar11._8_8_ = auVar11._8_8_;
  auVar11._0_8_ = auVar11._0_8_;
  uVar9 = *auVar11._0_8_;
  uVar10 = uVar9 * 2;
  if (uVar10 < 9) {
    uVar10 = 8;
  }
  if ((long)uVar10 < 0) {
    func_0x007a1f00(0,auVar11._8_8_,auVar11._8_8_);
  }
  else {
    if (uVar9 != 0) {
      uStack_48 = auVar11._0_8_[1];
      uStack_38 = uVar9;
    }
    uStack_40 = (ulong)(uVar9 != 0);
    in_x3 = &uStack_48;
    lVar4 = func_0x0079a108(aiStack_60,1,uVar10);
    if (aiStack_60[0] != 1) {
      *auVar11._0_8_ = uVar10;
      auVar11._0_8_[1] = uStack_58;
      return lVar4;
    }
  }
  auVar11 = func_0x007a1f00(uStack_58,uStack_50,auVar11._8_8_);
  auVar11._8_8_ = auVar11._8_8_;
  auVar11._0_8_ = auVar11._0_8_;
  uVar9 = *auVar11._0_8_;
  uVar10 = uVar9 * 2;
  if (uVar10 < 5) {
    uVar10 = 4;
  }
  auVar11._8_8_ = 0;
  auVar11._0_8_ = uVar10;
  if (SUB168(auVar11 * ZEXT816(0x70),8) == 0) {
    uVar6 = 0;
    uVar8 = auVar11._8_8_;
    if (uVar10 * 0x70 < 0x7ffffffffffffff9) {
      uStack_a0 = 0;
      if (uVar9 != 0) {
        uStack_a8 = auVar11._0_8_[1];
        lStack_98 = uVar9 * 0x70;
        uStack_a0 = 8;
      }
      in_x3 = &uStack_a8;
      lVar4 = func_0x0079a108(aiStack_c0,8);
      if (aiStack_c0[0] != 1) {
        *auVar11._0_8_ = uVar10;
        auVar11._0_8_[1] = uStack_b8;
        return lVar4;
      }
      goto LAB_001d8f40;
    }
  }
  else {
    func_0x007a1f00(0,auVar11._8_8_,auVar11._8_8_);
LAB_001d8f40:
    uVar6 = uStack_b8;
    uVar8 = uStack_b0;
  }
  auVar11 = func_0x007a1f00(uVar6,uVar8,auVar11._8_8_);
  auVar11._8_8_ = auVar11._8_8_;
  auVar11._0_8_ = auVar11._0_8_;
  uVar9 = *auVar11._0_8_;
  uVar10 = uVar9 * 2;
  if (uVar10 < 5) {
    uVar10 = 4;
  }
  auVar1._8_8_ = 0;
  auVar1._0_8_ = uVar10;
  if (SUB168(auVar1 * ZEXT816(0x48),8) == 0) {
    uVar6 = 0;
    uVar8 = auVar11._8_8_;
    if (uVar10 * 0x48 < 0x7ffffffffffffff9) {
      uStack_100 = 0;
      if (uVar9 != 0) {
        uStack_108 = auVar11._0_8_[1];
        lStack_f8 = uVar9 * 0x48;
        uStack_100 = 8;
      }
      in_x3 = &uStack_108;
      lVar4 = func_0x0079a108(aiStack_120,8);
      if (aiStack_120[0] != 1) {
        *auVar11._0_8_ = uVar10;
        auVar11._0_8_[1] = uStack_118;
        return lVar4;
      }
      goto LAB_001d9004;
    }
  }
  else {
    func_0x007a1f00(0,auVar11._8_8_,auVar11._8_8_);
LAB_001d9004:
    uVar6 = uStack_118;
    uVar8 = uStack_110;
  }
  auVar11 = func_0x007a1f00(uVar6,uVar8,auVar11._8_8_);
  auVar11._8_8_ = auVar11._8_8_;
  auVar11._0_8_ = auVar11._0_8_;
  uVar9 = *auVar11._0_8_;
  uVar10 = uVar9 * 2;
  if (uVar10 < 5) {
    uVar10 = 4;
  }
  auVar2._8_8_ = 0;
  auVar2._0_8_ = uVar10;
  if (SUB168(auVar2 * ZEXT816(0x28),8) == 0) {
    uVar6 = 0;
    uVar8 = auVar11._8_8_;
    if (uVar10 * 0x28 < 0x7ffffffffffffff9) {
      uStack_160 = 0;
      if (uVar9 != 0) {
        uStack_168 = auVar11._0_8_[1];
        lStack_158 = uVar9 * 0x28;
        uStack_160 = 8;
      }
      in_x3 = &uStack_168;
      lVar4 = func_0x0079a108(aiStack_180,8);
      if (aiStack_180[0] != 1) {
        *auVar11._0_8_ = uVar10;
        auVar11._0_8_[1] = uStack_178;
        return lVar4;
      }
      goto LAB_001d90c8;
    }
  }
  else {
    func_0x007a1f00(0,auVar11._8_8_,auVar11._8_8_);
LAB_001d90c8:
    uVar6 = uStack_178;
    uVar8 = uStack_170;
  }
  auVar11 = func_0x007a1f00(uVar6,uVar8,auVar11._8_8_);
  lVar4 = auVar11._8_8_;
  auVar11._0_8_ = auVar11._0_8_;
  uVar9 = *auVar11._0_8_;
  uVar10 = uVar9 * 2;
  if (uVar10 < 5) {
    uVar10 = 4;
  }
  auVar3._8_8_ = 0;
  auVar3._0_8_ = uVar10;
  if (SUB168(auVar3 * ZEXT816(0x30),8) == 0) {
    uVar6 = 0;
    lVar5 = lVar4;
    if (0x7ffffffffffffff8 < uVar10 * 0x30) goto LAB_001d9190;
    uStack_1c0 = 0;
    if (uVar9 != 0) {
      uStack_1c8 = auVar11._0_8_[1];
      lStack_1b8 = uVar9 * 0x30;
      uStack_1c0 = 8;
    }
    in_x3 = &uStack_1c8;
    lVar5 = func_0x0079a108(aiStack_1e0,8);
    if (aiStack_1e0[0] != 1) {
      *auVar11._0_8_ = uVar10;
      auVar11._0_8_[1] = uStack_1d8;
      return lVar5;
    }
  }
  else {
    func_0x007a1f00(0,lVar4,lVar4);
  }
  uVar6 = uStack_1d8;
  lVar5 = lStack_1d0;
LAB_001d9190:
  auVar11 = func_0x007a1f00(uVar6,lVar5);
  plVar7 = auVar11._0_8_;
  if ((in_x3 != (ulong *)0x0) && (*plVar7 != 0)) {
    if (auVar11._8_8_ == 0) {
      func_0x00187bd4(plVar7[1],*plVar7 * (long)in_x3);
      lVar5 = lVar4;
    }
    else {
      lVar5 = func_0x00187bd8();
      if (lVar5 == 0) {
        return lVar4;
      }
    }
    *plVar7 = auVar11._8_8_;
    plVar7[1] = lVar5;
  }
  return -0x7fffffffffffffff;
}

