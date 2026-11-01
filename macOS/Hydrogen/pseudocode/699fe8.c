
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_00699fe8(undefined *param_1,undefined *param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  undefined1 auVar8 [16];
  ulong uStack_1a0;
  undefined *puStack_198;
  undefined *puStack_190;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  long lStack_168;
  undefined *puStack_160;
  undefined *puStack_158;
  long lStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  char cStack_122;
  char cStack_121;
  long lStack_120;
  undefined *puStack_118;
  undefined *puStack_110;
  undefined *puStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined *puStack_d0;
  undefined *puStack_c8;
  undefined *puStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined *puStack_88;
  undefined *puStack_80;
  char *pcStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  uStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  plVar3 = *(long **)(param_1 + 0x18);
  if (plVar3 == (long *)0x0) {
    lVar4 = *(long *)(param_1 + 0x30);
    plVar3 = *(long **)(param_2 + 0x18);
    if (plVar3 != (long *)0x0) goto LAB_0069a04c;
LAB_0069a08c:
    if (lVar4 != *(long *)(param_2 + 0x30)) goto LAB_0069a200;
  }
  else {
    lVar4 = 0;
    do {
      lVar4 = (plVar3[6] + lVar4) - plVar3[5];
      plVar3 = (long *)*plVar3;
    } while (plVar3 != (long *)0x0);
    lVar4 = *(long *)(param_1 + 0x30) + lVar4;
    plVar3 = *(long **)(param_2 + 0x18);
    if (plVar3 == (long *)0x0) goto LAB_0069a08c;
LAB_0069a04c:
    lVar7 = 0;
    do {
      lVar7 = (plVar3[6] + lVar7) - plVar3[5];
      plVar3 = (long *)*plVar3;
    } while (plVar3 != (long *)0x0);
    if (lVar4 != *(long *)(param_2 + 0x30) + lVar7) goto LAB_0069a200;
  }
  func_0x005edf2c(&puStack_d0,0);
  uVar1 = uRam0000000000a33570;
  puStack_d0 = &UNK_00a14d10;
  puStack_c8 = &UNK_00a14ea0;
  uStack_a8 = 0;
  uStack_b0 = 0;
  uStack_98 = 0;
  uStack_a0 = 0;
  uStack_90 = 0;
  puStack_b8 = param_1;
  func_0x005f0510(&puStack_d0,uRam0000000000a33570,0xffffffff);
  func_0x005edf2c(&puStack_118,0);
  puStack_118 = &UNK_00a14d10;
  puStack_110 = &UNK_00a14ea0;
  uStack_f0 = 0;
  uStack_f8 = 0;
  uStack_e0 = 0;
  uStack_e8 = 0;
  uStack_d8 = 0;
  puStack_100 = param_2;
  func_0x005f0510(&puStack_118,uVar1,0xffffffff);
  param_1 = &UNK_00a0e1b8;
  uStack_138 = _UNK_007fc128;
  uStack_140 = _UNK_007fc120;
  param_2 = &UNK_008ba5c8;
  do {
    func_0x005edf2c(&puStack_88,0);
    puStack_88 = &UNK_00a0e1c8;
    puStack_80 = &UNK_00a0e358;
    uStack_60 = uStack_138;
    uStack_68 = uStack_140;
    lStack_120 = 1;
    pcStack_70 = &cStack_121;
    (**(code **)(puStack_d0 + 0x118))(&puStack_d0,&puStack_88,&lStack_120,&UNK_008ba5c8,1);
    if (lStack_120 == 0) {
LAB_0069a238:
      uVar1 = 1;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == uStack_58) {
        return 1;
      }
      goto LAB_0069a254;
    }
    func_0x005edf2c(&puStack_88,0);
    puStack_88 = &UNK_00a0e1c8;
    puStack_80 = &UNK_00a0e358;
    uStack_60 = uStack_138;
    uStack_68 = uStack_140;
    lStack_120 = 1;
    pcStack_70 = &cStack_122;
    (**(code **)(puStack_118 + 0x118))(&puStack_118,&puStack_88,&lStack_120,&UNK_008ba5c8,1);
    if (lStack_120 == 0) goto LAB_0069a238;
  } while (cStack_121 == cStack_122);
LAB_0069a200:
  uVar1 = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == uStack_58) {
    return 0;
  }
LAB_0069a254:
  ___stack_chk_fail(uVar1);
  auVar8 = __Unwind_Resume();
  uStack_148 = 0x69a25c;
  lStack_168 = *(long *)PTR____stack_chk_guard_009b01e8;
  puStack_160 = param_1;
  puStack_158 = param_2;
  lStack_150 = (long)register0x00000008 + -0x10;
  func_0x005edf2c(&puStack_198,0);
  puStack_198 = &UNK_00a0e1c8;
  puStack_190 = &UNK_00a0e358;
  uStack_170 = _UNK_007fc128;
  uStack_178 = _UNK_007fc120;
  uStack_1a0 = 1;
  uStack_180 = auVar8._8_8_;
  (**(code **)(*auVar8._0_8_ + 0x118))(auVar8._0_8_,&puStack_198,&uStack_1a0,&UNK_008ba5c8,1);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_168) {
    return uStack_1a0;
  }
  ___stack_chk_fail(uStack_1a0);
  auVar8 = __Unwind_Resume();
  uVar6 = auVar8._8_8_;
  plVar3 = *(long **)(auVar8._0_8_ + 0x18);
  uVar2 = uVar6;
  if (plVar3 != (long *)0x0) {
    do {
      uVar5 = plVar3[6] - plVar3[5];
      uVar6 = uVar2 - uVar5;
      if (uVar2 < uVar5) {
        return (ulong)*(byte *)(plVar3[4] + plVar3[5] + uVar2);
      }
      plVar3 = (long *)*plVar3;
      uVar2 = uVar6;
    } while (plVar3 != (long *)0x0);
  }
  return (ulong)*(byte *)(*(long *)(auVar8._0_8_ + 0x28) + uVar6);
}

