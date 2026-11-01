
void FUN_00632790(undefined8 param_1,int param_2,undefined8 param_3)

{
  bool bVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  undefined8 extraout_x8;
  ulong uVar7;
  ulong unaff_x21;
  ulong uVar8;
  undefined8 unaff_x22;
  undefined1 auVar9 [16];
  undefined1 uStack0000000000000080;
  undefined *puStack_168;
  undefined *puStack_160;
  ulong uStack_150;
  ulong uStack_148;
  long lStack_140;
  undefined *puStack_130;
  ulong uStack_120;
  ulong uStack_118;
  long lStack_110;
  long lStack_f8;
  long lStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  ulong uStack_d8;
  long lStack_d0;
  undefined8 uStack_c8;
  undefined1 *puStack_c0;
  undefined8 uStack_b8;
  undefined4 uStack_a8;
  undefined1 auStack_a4 [3];
  undefined1 uStack_a1;
  undefined *puStack_a0;
  undefined *puStack_98;
  long lStack_48;
  undefined1 auStack_6 [6];
  
  if (param_2 == 0) {
    __Unwind_Resume(param_1);
  }
  uVar2 = func_0x0001753c(param_1);
  func_0x00613f64(&uStack0000000000000080);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00613f64(&uStack0000000000000080);
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
  lVar5 = 1;
  (**(code **)(puStack_a0 + 0x38))(&puStack_a0,auStack_a4,1,0,1);
  func_0x00602890(lVar3 + 0x80,&puStack_a0);
  lVar6 = *(long *)(lVar3 + 0xb0);
  if (*(long *)(lVar3 + 0xb8) != lVar6) {
    unaff_x22 = 0x70;
    uVar7 = 0;
    uVar8 = 1;
    do {
      lVar5 = lVar6 + uVar7 * 0x70;
      (**(code **)(*auVar9._8_8_ + 0x38))(auVar9._8_8_,&puStack_a0,lVar5);
      lVar6 = *(long *)(lVar3 + 0xb0);
      unaff_x21 = (ulong)((int)uVar8 + 1);
      bVar1 = uVar8 < (ulong)((*(long *)(lVar3 + 0xb8) - lVar6 >> 4) * 0x6db6db6db6db6db7);
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
  plVar4 = auVar9._8_8_;
  lVar6 = auVar9._0_8_;
  uStack_b8 = 0x632958;
  lStack_f8 = 0;
  lStack_f0 = 0;
  uStack_e8 = 0;
  uStack_e0 = unaff_x22;
  uStack_d8 = unaff_x21;
  lStack_d0 = lVar3;
  uStack_c8 = uVar2;
  puStack_c0 = auStack_6 + -10;
  func_0x00632b44(&lStack_f8,
                  (*(long *)(lVar6 + 0xb8) - *(long *)(lVar6 + 0xb0) >> 4) * 0x6db6db6db6db6db7);
  func_0x00632c7c(lVar6,plVar4,&lStack_f8,lVar5);
  uVar2 = (**(code **)(*plVar4 + 0x28))(plVar4);
  func_0x00633274(&puStack_168,uVar2,lStack_f8,lStack_f0);
  (**(code **)(*plVar4 + 0x20))(extraout_x8,plVar4,&puStack_168);
  puStack_168 = &UNK_00a09a40;
  puStack_130 = &UNK_009f5d60;
  if (uStack_118 <= uStack_120) {
    uStack_120 = uStack_118;
  }
  if (lStack_110 != 0) {
    if (uStack_120 != 0) {
      do {
        *(undefined8 *)(lStack_110 + -8 + uStack_120 * 8) = 0;
        uStack_120 = uStack_120 - 1;
      } while (uStack_120 != 0);
    }
    func_0x00611644();
  }
  puStack_160 = &UNK_009f5d60;
  if (uStack_148 <= uStack_150) {
    uStack_150 = uStack_148;
  }
  if (lStack_140 != 0) {
    if (uStack_150 != 0) {
      do {
        *(undefined8 *)(lStack_140 + -8 + uStack_150 * 8) = 0;
        uStack_150 = uStack_150 - 1;
      } while (uStack_150 != 0);
    }
    func_0x00611644();
  }
  lVar3 = lStack_f8;
  lVar6 = lStack_f0;
  if (lStack_f8 != 0) {
    while (lVar6 != lVar3) {
      *(undefined **)(lVar6 + -0x30) = &UNK_009f5d60;
      lVar5 = *(long *)(lVar6 + -0x10);
      uVar7 = *(ulong *)(lVar6 + -0x20);
      if (*(ulong *)(lVar6 + -0x18) <= *(ulong *)(lVar6 + -0x20)) {
        uVar7 = *(ulong *)(lVar6 + -0x18);
      }
      if (lVar5 != 0) {
        if (uVar7 != 0) {
          do {
            *(undefined8 *)(lVar5 + -8 + uVar7 * 8) = 0;
            uVar7 = uVar7 - 1;
          } while (uVar7 != 0);
        }
        func_0x00611644();
      }
      func_0x0064f6d0(lVar6 + -0xa0);
      lVar6 = lVar6 + -0xa0;
    }
    lStack_f0 = lVar3;
    __ZdlPv(lStack_f8);
  }
  return;
}

