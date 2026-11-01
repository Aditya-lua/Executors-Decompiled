
long * FUN_0049bec4(undefined8 param_1,undefined8 param_2)

{
  long *plVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long *plVar4;
  undefined8 uVar5;
  ulong *puVar6;
  long *extraout_x8;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  undefined1 auVar19 [16];
  
  func_0x00187bd4(param_1,param_2,1);
  puVar3 = (undefined8 *)__Unwind_Resume();
  puVar9 = *(undefined8 **)*puVar3;
  *(undefined8 *)*puVar3 = 0;
  if (puVar9 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009e2aa8);
  }
  else {
    plVar4 = (long *)func_0x00187bd0(3,1);
    if (plVar4 != (long *)0x0) {
      *(undefined1 *)plVar4 = 0x31;
      *puVar9 = 3;
      puVar9[1] = plVar4;
      puVar9[2] = 1;
      return plVar4;
    }
  }
  puVar3 = (undefined8 *)func_0x007a1f00(1,3,&UNK_009e2b40);
  puVar9 = *(undefined8 **)*puVar3;
  *(undefined8 *)*puVar3 = 0;
  if (puVar9 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009e2aa8);
  }
  else {
    plVar4 = (long *)func_0x00187bd0(3,1);
    if (plVar4 != (long *)0x0) {
      *(undefined1 *)plVar4 = 0x31;
      *puVar9 = 3;
      puVar9[1] = plVar4;
      puVar9[2] = 1;
      return plVar4;
    }
  }
  puVar3 = (undefined8 *)func_0x007a1f00(1,3,&UNK_009e2b40);
  plVar4 = (long *)(*(code *)*puVar3)(0);
  if (plVar4 != (long *)0x0) {
    plVar1 = (long *)*plVar4;
    *plVar4 = (long)plVar1 + 1;
    return plVar1;
  }
  auVar19 = func_0x007a02f0(&UNK_009e2ac0);
  puVar6 = auVar19._8_8_;
  plVar4 = (long *)(*(code *)*auVar19._0_8_)(0);
  if (plVar4 == (long *)0x0) {
    if (1 < *puVar6) {
      func_0x004a4fa4(puVar6 + 1);
    }
  }
  else {
    if (*plVar4 != 0) {
      func_0x007a2334(&UNK_009e2c30);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x49c0b0);
      (*pcVar2)();
    }
    lVar7 = plVar4[1];
    lVar12 = plVar4[3];
    lVar10 = plVar4[2];
    lVar16 = plVar4[5];
    lVar14 = plVar4[4];
    lVar8 = plVar4[6];
    uVar18 = puVar6[2];
    uVar13 = puVar6[5];
    uVar11 = puVar6[4];
    uVar17 = puVar6[1];
    uVar15 = *puVar6;
    plVar4[4] = puVar6[3];
    plVar4[3] = uVar18;
    plVar4[6] = uVar13;
    plVar4[5] = uVar11;
    plVar4[2] = uVar17;
    plVar4[1] = uVar15;
    if (lVar7 != 4) {
      *extraout_x8 = lVar7;
      extraout_x8[2] = lVar12;
      extraout_x8[1] = lVar10;
      extraout_x8[4] = lVar16;
      extraout_x8[3] = lVar14;
      extraout_x8[5] = lVar8;
      return plVar4;
    }
  }
  uVar5 = func_0x007a02f0(&UNK_009e2ac0);
  if (1 < *puVar6) {
    func_0x004a4fa4(puVar6 + 1);
  }
  __Unwind_Resume(uVar5);
  auVar19 = func_0x007a2668();
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  plVar4 = (long *)(**(code **)(auVar19._8_8_[1] + 0x18))
                             (*auVar19._8_8_,
                              *(undefined8 *)(&UNK_009e2c48 + (ulong)*(byte *)*auVar19._0_8_ * 8),
                              *(undefined8 *)(&UNK_0089f798 + (ulong)*(byte *)*auVar19._0_8_ * 8));
  return plVar4;
}

