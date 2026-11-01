
undefined8
FUN_00663ea0(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,ulong param_5)

{
  int iVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  undefined1 *puVar7;
  long in_x9;
  long *plVar8;
  undefined1 auVar9 [16];
  undefined1 auStack_158 [8];
  ulong uStack_150;
  ulong uStack_148;
  long lStack_140;
  undefined1 auStack_138 [8];
  ulong uStack_130;
  ulong uStack_128;
  long lStack_120;
  byte bStack_111;
  long alStack_e0 [7];
  long lStack_a8;
  undefined1 auStack_70 [56];
  long lStack_38;
  
  if (in_x9 == param_1) {
    return param_2;
  }
  ___stack_chk_fail();
  uVar2 = __Unwind_Resume();
  func_0x006143a8();
  auVar9 = __Unwind_Resume(uVar2);
  puVar7 = auStack_70;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x0060ecc4(auStack_70,param_4,param_5);
  uVar2 = (**(code **)(*auVar9._0_8_ + 0x80))(auVar9._0_8_,auVar9._8_8_,auStack_70);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return uVar2;
  }
  ___stack_chk_fail();
  auVar9 = __Unwind_Resume();
  plVar8 = alStack_e0;
  lStack_a8 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x0060ecc4(alStack_e0,puVar7,param_5);
  plVar3 = (long *)(auVar9._0_8_ + -8);
  uVar2 = (**(code **)(*plVar3 + 0x80))(plVar3,auVar9._8_8_);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_a8) {
    return uVar2;
  }
  ___stack_chk_fail();
  auVar9 = __Unwind_Resume();
  lVar6 = auVar9._8_8_;
  plVar3 = auVar9._0_8_;
  if (param_5 == 0) {
    return 0;
  }
  lVar4 = (**(code **)(*plVar8 + 0xa8))(plVar8,&bStack_111);
  uVar2 = 0;
  if (lVar4 != 0) {
    if (bStack_111 - 2 < 2) {
      uVar5 = (**(code **)(*plVar3 + 0x78))(plVar3,1);
      if ((uVar5 & 0xffffffff) != param_5) {
        return 0;
      }
      *(undefined1 *)(lVar6 + 0x48) = 0;
      lVar4 = lVar6 + 8;
      func_0x00676a24(lVar4,plVar8,(ulong)*(uint *)(plVar3[2] + 0x90) + 7 >> 3);
      iVar1 = func_0x006787a4(lVar4);
      if (iVar1 == 0) {
        uVar2 = (**(code **)(*(long *)plVar3[2] + 0x90))((long *)plVar3[2],lVar4);
        func_0x00675bac(auStack_138,uVar2);
        plVar8 = (long *)plVar3[2];
        uVar2 = (**(code **)(*plVar8 + 0x20))(plVar8,lVar4,plVar3 + 3);
        uVar2 = (**(code **)(*plVar8 + 0x80))(plVar8,auStack_138,uVar2);
        uVar2 = (**(code **)(*plVar8 + 0x20))(plVar8,uVar2,plVar3 + 7);
        uVar2 = (**(code **)(*plVar8 + 0x98))(plVar8,uVar2,auStack_138);
        lVar6 = lVar6 + 0x28;
        func_0x00677180(lVar6,uVar2);
        func_0x0067a01c(auStack_158,plVar3[2],lVar6);
        func_0x00677180(auStack_138,auStack_158);
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
        func_0x00675e78(auStack_138,0,bStack_111 & 1);
        uVar2 = (**(code **)(*(long *)plVar3[2] + 0x80))((long *)plVar3[2],auStack_138,lVar4);
        func_0x00677180(lVar6,uVar2);
        if (uStack_128 <= uStack_130) {
          uStack_130 = uStack_128;
        }
        if (lStack_120 != 0) {
          if (uStack_130 != 0) {
            do {
              *(undefined8 *)(lStack_120 + -8 + uStack_130 * 8) = 0;
              uStack_130 = uStack_130 - 1;
            } while (uStack_130 != 0);
          }
          func_0x00611644();
        }
      }
      else {
        func_0x00679e30(auStack_138,plVar3[2],plVar3 + 7);
        func_0x00677180(lVar6 + 0x28,auStack_138);
        if (uStack_128 <= uStack_130) {
          uStack_130 = uStack_128;
        }
        if (lStack_120 != 0) {
          if (uStack_130 != 0) {
            do {
              *(undefined8 *)(lStack_120 + -8 + uStack_130 * 8) = 0;
              uStack_130 = uStack_130 - 1;
            } while (uStack_130 != 0);
          }
          func_0x00611644();
        }
      }
      return 1;
    }
    if (bStack_111 == 4) {
      uVar5 = (**(code **)(*plVar3 + 0x78))(plVar3,0);
      uVar2 = 0;
      if ((uVar5 & 0xffffffff) == param_5) {
        uVar5 = (ulong)*(uint *)(plVar3[2] + 0x90) + 7 >> 3;
        *(undefined1 *)(lVar6 + 0x48) = 0;
        func_0x00676a24(lVar6 + 8,plVar8,uVar5);
        func_0x00676a24(lVar6 + 0x28,plVar8,uVar5);
        return 1;
      }
    }
    else {
      if (bStack_111 != 0) {
        return 0;
      }
      uVar2 = 1;
      *(undefined1 *)(lVar6 + 0x48) = 1;
    }
  }
  return uVar2;
}

