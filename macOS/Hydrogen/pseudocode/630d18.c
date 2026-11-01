
void FUN_00630d18(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  bool bVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  undefined8 extraout_x8;
  ulong uVar7;
  ulong unaff_x21;
  ulong uVar8;
  undefined8 unaff_x22;
  undefined1 auVar9 [16];
  undefined1 auVar10 [12];
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000060;
  undefined *apuStack_148 [2];
  ulong uStack_138;
  ulong uStack_130;
  long lStack_128;
  ulong uStack_118;
  ulong uStack_110;
  long lStack_108;
  long lStack_f8;
  long lStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  ulong uStack_d8;
  long lStack_d0;
  undefined8 uStack_c8;
  undefined1 *puStack_c0;
  undefined *puStack_b8;
  undefined4 uStack_a8;
  undefined1 auStack_a4 [3];
  undefined1 uStack_a1;
  undefined *puStack_a0;
  undefined *puStack_98;
  long lStack_48;
  undefined1 auStack_6 [6];
  
  func_0x00613f64(&uStack0000000000000060);
  uVar2 = __Unwind_Resume(param_1);
  func_0x0062ec4c(&uStack0000000000000008);
  func_0x00613f64(&uStack0000000000000060);
  auVar10 = __Unwind_Resume(uVar2);
  if (auVar10._8_4_ == 0) {
    __Unwind_Resume(auVar10._0_8_);
  }
  uVar2 = func_0x0001753c(auVar10._0_8_);
  func_0x00613f64(&uStack0000000000000060);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00613f64(&uStack0000000000000060);
  auVar9 = __Unwind_Resume(uVar2);
  lVar3 = auVar9._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x006129a4(&puStack_a0,param_3,0x30);
  puStack_a0 = &UNK_009f6108;
  puStack_98 = &UNK_009f6298;
  uStack_a8 = 0;
  auStack_a4[0] = 1;
  uStack_a1 = 2;
  func_0x00698dbc(&puStack_a0,&uStack_a1,1,0,1);
  func_0x00611648(&puStack_a0,1);
  lVar6 = 1;
  (**(code **)(puStack_a0 + 0x38))(&puStack_a0,auStack_a4,1,0,1);
  func_0x00602890(lVar3 + 0x60,&puStack_a0);
  lVar4 = *(long *)(lVar3 + 0x90);
  if (*(long *)(lVar3 + 0x98) != lVar4) {
    unaff_x22 = 0x50;
    uVar7 = 0;
    uVar8 = 1;
    do {
      lVar6 = lVar4 + uVar7 * 0x50;
      (**(code **)(*auVar9._8_8_ + 0x38))(auVar9._8_8_,&puStack_a0,lVar6);
      lVar4 = *(long *)(lVar3 + 0x90);
      unaff_x21 = (ulong)((int)uVar8 + 1);
      bVar1 = uVar8 < (ulong)((*(long *)(lVar3 + 0x98) - lVar4 >> 4) * -0x3333333333333333);
      uVar7 = uVar8;
      uVar8 = unaff_x21;
    } while (bVar1);
  }
  func_0x00612b0c(&puStack_a0);
  func_0x006143a8(&puStack_a0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return;
  }
  ___stack_chk_fail();
  uVar2 = __Unwind_Resume();
  func_0x006143a8(&puStack_a0);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x006143a8(&puStack_a0);
  auVar9 = __Unwind_Resume(uVar2);
  plVar5 = auVar9._8_8_;
  lVar4 = auVar9._0_8_;
  puStack_b8 = &DAT_00630f6c;
  lStack_f8 = 0;
  lStack_f0 = 0;
  uStack_e8 = 0;
  uStack_e0 = unaff_x22;
  uStack_d8 = unaff_x21;
  lStack_d0 = lVar3;
  uStack_c8 = uVar2;
  puStack_c0 = auStack_6 + -10;
  func_0x006310fc(&lStack_f8,
                  (*(long *)(lVar4 + 0x98) - *(long *)(lVar4 + 0x90) >> 4) * -0x3333333333333333);
  func_0x0063120c(lVar4,plVar5,&lStack_f8,lVar6);
  uVar2 = (**(code **)(*plVar5 + 0x28))(plVar5);
  func_0x00631618(apuStack_148,uVar2,lStack_f8,lStack_f0);
  (**(code **)(*plVar5 + 0x20))(extraout_x8,plVar5,apuStack_148);
  apuStack_148[0] = &UNK_00a09a70;
  if (uStack_110 <= uStack_118) {
    uStack_118 = uStack_110;
  }
  if (lStack_108 != 0) {
    if (uStack_118 != 0) {
      do {
        *(undefined8 *)(lStack_108 + -8 + uStack_118 * 8) = 0;
        uStack_118 = uStack_118 - 1;
      } while (uStack_118 != 0);
    }
    func_0x00611644();
  }
  if (uStack_130 <= uStack_138) {
    uStack_138 = uStack_130;
  }
  if (lStack_128 != 0) {
    if (uStack_138 != 0) {
      do {
        *(undefined8 *)(lStack_128 + -8 + uStack_138 * 8) = 0;
        uStack_138 = uStack_138 - 1;
      } while (uStack_138 != 0);
    }
    func_0x00611644();
  }
  lVar3 = lStack_f8;
  lVar4 = lStack_f0;
  if (lStack_f8 != 0) {
    for (; lVar4 != lVar3; lVar4 = func_0x00650db0(lVar4 + -0x80)) {
    }
    lStack_f0 = lVar3;
    __ZdlPv(lStack_f8);
  }
  return;
}

