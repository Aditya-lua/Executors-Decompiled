
void FUN_00630bac(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  undefined8 extraout_x8;
  undefined **ppuVar9;
  long unaff_x19;
  long *unaff_x20;
  undefined **unaff_x21;
  undefined **ppuVar10;
  undefined8 unaff_x22;
  undefined8 unaff_x24;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 auVar12 [12];
  undefined1 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined1 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  undefined1 in_stack_00000050;
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
  undefined **ppuStack_d8;
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
  
  while( true ) {
    *(undefined8 **)(unaff_x19 + 0x98) = param_1;
    uVar3 = in_stack_00000038;
    if (in_stack_00000040 <= in_stack_00000038) {
      uVar3 = in_stack_00000040;
    }
    if (in_stack_00000048 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(in_stack_00000048 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    uVar3 = in_stack_00000018;
    if (in_stack_00000020 <= in_stack_00000018) {
      uVar3 = in_stack_00000020;
    }
    if (in_stack_00000028 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(in_stack_00000028 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    uVar3 = func_0x006129e8(&uStack0000000000000060);
    if ((uVar3 & 1) != 0) break;
    (**(code **)(*unaff_x20 + 0x30))(apuStack_148 + 0x2a);
    param_1 = *(undefined8 **)(unaff_x19 + 0x98);
    if (param_1 < *(undefined8 **)(unaff_x19 + 0xa0)) {
      *param_1 = unaff_x24;
      func_0x00675bac(param_1 + 1);
      func_0x00675bac(param_1 + 5);
      *(undefined1 *)(param_1 + 9) = in_stack_00000050;
      param_1 = param_1 + 10;
      *(undefined8 **)(unaff_x19 + 0x98) = param_1;
    }
    else {
      param_1 = (undefined8 *)func_0x006507d4();
    }
  }
  if ((*(long *)(unaff_x19 + 0x90) != *(long *)(unaff_x19 + 0x98)) &&
     (iVar2 = (**(code **)(*unaff_x20 + 0x10))(), iVar2 != 0)) {
    unaff_x21 = apuStack_148 + 0x2a;
    (**(code **)(*unaff_x20 + 0x20))(apuStack_148 + 0x2a);
    func_0x00677180(unaff_x19 + 0x10,&uStack0000000000000010);
    func_0x00677180(unaff_x19 + 0x30,&uStack0000000000000030);
    *(undefined1 *)(unaff_x19 + 0x50) = in_stack_00000050;
    uVar3 = in_stack_00000038;
    if (in_stack_00000040 <= in_stack_00000038) {
      uVar3 = in_stack_00000040;
    }
    if (in_stack_00000048 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(in_stack_00000048 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    uVar3 = in_stack_00000018;
    if (in_stack_00000020 <= in_stack_00000018) {
      uVar3 = in_stack_00000020;
    }
    if (in_stack_00000028 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(in_stack_00000028 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
  }
  func_0x00612a40(&uStack0000000000000060);
  func_0x00613f64(&uStack0000000000000060);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  auVar12 = ___stack_chk_fail();
  if (auVar12._8_4_ == 0) {
    __Unwind_Resume(auVar12._0_8_);
  }
  uVar4 = func_0x0001753c(auVar12._0_8_);
  func_0x00613f64(&uStack0000000000000060);
  uVar4 = __Unwind_Resume(uVar4);
  func_0x00613f64(&uStack0000000000000060);
  auVar11 = __Unwind_Resume(uVar4);
  lVar5 = auVar11._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x006129a4(&puStack_a0,param_3,0x30);
  puStack_a0 = &UNK_009f6108;
  puStack_98 = &UNK_009f6298;
  uStack_a8 = 0;
  auStack_a4[0] = 1;
  uStack_a1 = 2;
  func_0x00698dbc(&puStack_a0,&uStack_a1,1,0,1);
  func_0x00611648(&puStack_a0,1);
  lVar8 = 1;
  (**(code **)(puStack_a0 + 0x38))(&puStack_a0,auStack_a4,1,0,1);
  func_0x00602890(lVar5 + 0x60,&puStack_a0);
  lVar6 = *(long *)(lVar5 + 0x90);
  if (*(long *)(lVar5 + 0x98) != lVar6) {
    unaff_x22 = 0x50;
    ppuVar9 = (undefined **)0x0;
    ppuVar10 = (undefined **)0x1;
    do {
      lVar8 = lVar6 + (long)ppuVar9 * 0x50;
      (**(code **)(*auVar11._8_8_ + 0x38))(auVar11._8_8_,&puStack_a0,lVar8);
      lVar6 = *(long *)(lVar5 + 0x90);
      unaff_x21 = (undefined **)(ulong)((int)ppuVar10 + 1);
      bVar1 = ppuVar10 <
              (undefined **)((*(long *)(lVar5 + 0x98) - lVar6 >> 4) * -0x3333333333333333);
      ppuVar9 = ppuVar10;
      ppuVar10 = unaff_x21;
    } while (bVar1);
  }
  func_0x00612b0c(&puStack_a0);
  func_0x006143a8(&puStack_a0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return;
  }
  ___stack_chk_fail();
  uVar4 = __Unwind_Resume();
  func_0x006143a8(&puStack_a0);
  uVar4 = __Unwind_Resume(uVar4);
  func_0x006143a8(&puStack_a0);
  auVar11 = __Unwind_Resume(uVar4);
  plVar7 = auVar11._8_8_;
  lVar6 = auVar11._0_8_;
  puStack_b8 = &DAT_00630f6c;
  lStack_f8 = 0;
  lStack_f0 = 0;
  uStack_e8 = 0;
  uStack_e0 = unaff_x22;
  ppuStack_d8 = unaff_x21;
  lStack_d0 = lVar5;
  uStack_c8 = uVar4;
  puStack_c0 = auStack_6 + -10;
  func_0x006310fc(&lStack_f8,
                  (*(long *)(lVar6 + 0x98) - *(long *)(lVar6 + 0x90) >> 4) * -0x3333333333333333);
  func_0x0063120c(lVar6,plVar7,&lStack_f8,lVar8);
  uVar4 = (**(code **)(*plVar7 + 0x28))(plVar7);
  func_0x00631618(apuStack_148,uVar4,lStack_f8,lStack_f0);
  (**(code **)(*plVar7 + 0x20))(extraout_x8,plVar7,apuStack_148);
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
  lVar5 = lStack_f8;
  lVar6 = lStack_f0;
  if (lStack_f8 != 0) {
    for (; lVar6 != lVar5; lVar6 = func_0x00650db0(lVar6 + -0x80)) {
    }
    lStack_f0 = lVar5;
    __ZdlPv(lStack_f8);
  }
  return;
}

