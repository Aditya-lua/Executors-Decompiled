
void FUN_004a6f44(void)

{
  undefined1 auVar1 [16];
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 *extraout_x8;
  undefined8 uVar5;
  undefined8 uVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000150;
  long lStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  long lStack_140;
  undefined8 uStack_138;
  long lStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  long lStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  
  lVar2 = **(long **)(unaff_x29 + -0xc0);
  **(long **)(unaff_x29 + -0xc0) = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00525414(unaff_x29 + -0xc0);
  }
  func_0x004a8a78(&uStack0000000000000150);
  __Unwind_Resume();
  func_0x007a2668();
  uVar3 = func_0x007a2668();
  func_0x0049f9a0(&lStack_140);
  uVar4 = uStack_138;
  lVar2 = lStack_140;
  if (lStack_130 != 2) {
    uStack_168 = uStack_e8;
    uStack_170 = uStack_f0;
    uStack_158 = uStack_d8;
    uStack_160 = uStack_e0;
    uStack_150 = uStack_d0;
    uStack_1a8 = uStack_128;
    lStack_1b0 = lStack_130;
    uStack_198 = uStack_118;
    uStack_1a0 = uStack_120;
    uStack_188 = uStack_108;
    uStack_190 = uStack_110;
    uStack_178 = uStack_f8;
    uStack_180 = uStack_100;
    uVar5 = 0x903e3ba23bf85d1f;
    auVar7 = func_0x00512f18(&lStack_1b0,0x903e3ba23bf85d1f,0xf6e7117fccbed14e);
    auVar1._8_8_ = uStack_198;
    auVar1._0_8_ = uStack_1a0;
    uVar6 = 0xf6e7117fccbed14e;
    if ((auVar7._0_8_ != -0x6fc1c45dc407a2e1) || (auVar7._8_8_ != -0x918ee8033412eb2)) {
      uStack_f8 = uStack_168;
      uStack_100 = uStack_170;
      uStack_e8 = uStack_158;
      uStack_f0 = uStack_160;
      uStack_e0 = uStack_150;
      uStack_138 = uStack_1a8;
      lStack_140 = lStack_1b0;
      uStack_128 = uStack_198;
      lStack_130 = uStack_1a0;
      uStack_118 = uStack_188;
      uStack_120 = uStack_190;
      uStack_108 = uStack_178;
      uStack_110 = uStack_180;
      func_0x0049fb7c(&lStack_c8,uVar3,lVar2,uVar4,&lStack_140);
      if (lStack_c8 != 2) {
        func_0x004a9838(&lStack_c8);
      }
      uStack_1a8 = 0;
code_r0x004a7138:
      *(undefined1 (*) [16])(extraout_x8 + 2) = auVar7;
      extraout_x8[4] = uVar5;
      extraout_x8[5] = uVar6;
      *extraout_x8 = 1;
      extraout_x8[1] = uStack_1a8;
      return;
    }
    if (lStack_1b0 != 2) {
      uVar5 = uStack_190;
      uVar6 = uStack_188;
      auVar7 = auVar1;
      if (lStack_1b0 == 3) goto code_r0x004a7138;
      uStack_90 = uStack_178;
      uStack_98 = uStack_180;
      uStack_80 = uStack_168;
      uStack_88 = uStack_170;
      uStack_70 = uStack_158;
      uStack_78 = uStack_160;
      uStack_68 = uStack_150;
      lStack_c8 = lStack_1b0;
      uStack_c0 = uStack_1a8;
      uStack_b8 = uStack_1a0;
      uStack_b0 = uStack_198;
      uStack_a8 = uStack_190;
      uStack_a0 = uStack_188;
      uVar4 = func_0x00512da0(&lStack_c8);
      uStack_f8 = uStack_80;
      uStack_100 = uStack_88;
      uStack_e8 = uStack_70;
      uStack_f0 = uStack_78;
      uStack_e0 = uStack_68;
      uStack_138 = uStack_c0;
      lStack_140 = lStack_c8;
      uStack_128 = uStack_b0;
      lStack_130 = uStack_b8;
      uStack_118 = uStack_a0;
      uStack_120 = uStack_a8;
      uStack_108 = uStack_90;
      uStack_110 = uStack_98;
      func_0x005129bc(extraout_x8 + 2,&lStack_140);
      extraout_x8[0xe] = uVar4;
      extraout_x8[1] = &DAT_004a7194;
      goto LAB_004a6fc0;
    }
  }
  extraout_x8[1] = 0;
LAB_004a6fc0:
  *extraout_x8 = 0;
  return;
}

