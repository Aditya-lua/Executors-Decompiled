
void FUN_00239ca8(long param_1)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 in_x3;
  undefined8 *in_x4;
  undefined2 in_w5;
  undefined2 in_w6;
  undefined8 in_x7;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x23;
  long unaff_x26;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000080;
  long lStack_1b8;
  long lStack_1b0;
  long lStack_1a8;
  undefined1 uStack_1a0;
  long lStack_198;
  long lStack_190;
  long lStack_188;
  long lStack_180;
  long lStack_178;
  long lStack_170;
  long lStack_168;
  undefined8 uStack_160;
  long lStack_158;
  long lStack_150;
  long lStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined2 uStack_f8;
  undefined2 uStack_f4;
  undefined2 uStack_f2;
  undefined1 uStack_f0;
  undefined1 uStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  
  uVar4 = 2;
  func_0x00187bd4(*(undefined8 *)(unaff_x26 + 8),param_1 << 2,2);
  if ((unaff_x23 & 1) != 0) {
    lVar1 = **(long **)(unaff_x19 + 0x50);
    **(long **)(unaff_x19 + 0x50) = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa1d4();
    }
    func_0x00230538(in_stack_00000080);
  }
  if ((unaff_x20 & 1) != 0) {
    func_0x002314e0();
  }
  __Unwind_Resume();
  auVar5 = func_0x007a2668();
  plVar2 = auVar5._0_8_;
  lStack_1b8 = 0;
  lStack_1b0 = 8;
  lStack_1a8 = 0;
  uStack_1a0 = 0;
  func_0x001fcc48(&lStack_198,&lStack_1b8,uVar4,in_x3,in_stack_00000000,in_stack_00000008,
                  in_stack_00000010,in_stack_00000020);
  if (lStack_198 == -0x7fffffffffffffd9) {
    func_0x001fdaa8(&lStack_1b8,uVar4,in_stack_00000008,in_x7);
    uStack_138 = *(undefined8 *)(in_stack_00000018 + 0x28);
    uStack_140 = *(undefined8 *)(in_stack_00000018 + 0x20);
    uStack_128 = *(undefined8 *)(in_stack_00000018 + 0x38);
    uStack_130 = *(undefined8 *)(in_stack_00000018 + 0x30);
    lStack_b8 = lStack_1b0;
    lStack_c0 = lStack_1b8;
    uStack_118 = in_x4[1];
    uStack_120 = *in_x4;
    uStack_108 = in_x4[3];
    uStack_110 = in_x4[2];
    uStack_100 = in_x4[4];
    lStack_b0 = lStack_1a8;
    uStack_c8 = 2;
    uStack_160 = 0x8000000000000002;
    lStack_148 = lStack_1a8;
    lStack_150 = lStack_1b0;
    lStack_158 = lStack_1b8;
    uStack_f8 = 4;
    uStack_f0 = 0;
    uStack_f4 = in_w5;
    uStack_f2 = in_w6;
    uStack_a8 = uStack_140;
    uStack_a0 = uStack_138;
    uStack_98 = uStack_130;
    uStack_90 = uStack_128;
    uStack_88 = uStack_120;
    uStack_80 = uStack_118;
    uStack_78 = uStack_110;
    uStack_70 = uStack_108;
    uStack_68 = uStack_100;
    func_0x0024a370(auVar5._8_8_,&uStack_160);
    *(undefined1 *)(plVar2 + 1) = uStack_1a0;
    *plVar2 = -0x7fffffffffffffd9;
  }
  else {
    plVar2[1] = lStack_190;
    *plVar2 = lStack_198;
    plVar2[3] = lStack_180;
    plVar2[2] = lStack_188;
    plVar2[5] = lStack_170;
    plVar2[4] = lStack_178;
    plVar2[6] = lStack_168;
    lVar1 = lStack_1a8 + 1;
    lVar3 = lStack_1b0;
    while (lVar1 = lVar1 + -1, lVar1 != 0) {
      func_0x0016abd8(lVar3);
      lVar3 = lVar3 + 0x28;
    }
    if (lStack_1b8 != 0) {
      func_0x00187bd4(lStack_1b0,lStack_1b8 * 0x28,8);
    }
  }
  return;
}

