
undefined8 FUN_0029d7b8(ulong param_1,long param_2,ulong param_3)

{
  uint uVar1;
  long *plVar2;
  uint uVar3;
  uint uVar4;
  ulong in_x9;
  undefined1 *puVar5;
  ulong uVar6;
  ulong uVar7;
  char in_w12;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined1 (*pauVar11) [16];
  ulong uVar12;
  long lVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  
  if (in_w12 != '\0') {
    plVar2 = (long *)func_0x0079dae0();
    uVar1 = *(uint *)(plVar2 + 1);
    uVar6 = (ulong)uVar1;
    lVar13 = uVar6 * 8;
    do {
      lVar13 = lVar13 + -8;
      uVar4 = (uint)uVar6;
      uVar6 = (ulong)(uVar4 - 1);
      uVar3 = uVar1 & (int)uVar1 >> 0x1f;
      if ((int)uVar4 < 1) goto code_r0x0029d910;
    } while (*(long *)(*plVar2 + lVar13) == 0);
    uVar3 = uVar4;
code_r0x0029d910:
    if (uVar3 == 0) {
      return 0;
    }
    if (uVar3 == 1) {
      return *(undefined8 *)*plVar2;
    }
    return 0xffffffffffffffff;
  }
  uVar6 = param_1;
  if (param_3 <= param_1) {
    uVar6 = param_3;
  }
  if (uVar6 == 0) goto LAB_0029d828;
  if ((uVar6 < 8) || (param_2 + (param_3 - uVar6) < in_x9 + uVar6 && in_x9 < param_2 + param_3)) {
    uVar7 = 0;
  }
  else {
    if (uVar6 < 0x40) {
      uVar12 = 0;
    }
    else {
      uVar7 = uVar6 & 0xffffffffffffffc0;
      puVar8 = (undefined8 *)(param_3 + param_2 + -0x20);
      pauVar11 = (undefined1 (*) [16])(in_x9 + 0x20);
      uVar12 = uVar7;
      do {
        auVar16 = *pauVar11;
        auVar18 = pauVar11[1];
        auVar15 = NEON_rev64(pauVar11[-2],1);
        auVar15 = NEON_ext(auVar15,auVar15,8,1);
        auVar17 = NEON_rev64(pauVar11[-1],1);
        auVar17 = NEON_ext(auVar17,auVar17,8,1);
        puVar8[1] = auVar17._8_8_;
        *puVar8 = auVar17._0_8_;
        puVar8[3] = auVar15._8_8_;
        puVar8[2] = auVar15._0_8_;
        auVar16 = NEON_rev64(auVar16,1);
        auVar16 = NEON_ext(auVar16,auVar16,8,1);
        auVar18 = NEON_rev64(auVar18,1);
        auVar18 = NEON_ext(auVar18,auVar18,8,1);
        puVar8[-3] = auVar18._8_8_;
        puVar8[-4] = auVar18._0_8_;
        puVar8[-1] = auVar16._8_8_;
        puVar8[-2] = auVar16._0_8_;
        puVar8 = puVar8 + -8;
        uVar12 = uVar12 - 0x40;
        pauVar11 = pauVar11 + 4;
      } while (uVar12 != 0);
      if (uVar6 == uVar7) goto LAB_0029d828;
      uVar12 = uVar7;
      if ((uVar6 & 0x38) == 0) goto LAB_0029d804;
    }
    uVar7 = uVar6 & 0xfffffffffffffff8;
    puVar8 = (undefined8 *)((param_3 - uVar12) + param_2);
    lVar13 = uVar12 - uVar7;
    puVar9 = (undefined8 *)(in_x9 + uVar12);
    do {
      puVar8 = puVar8 + -1;
      uVar14 = NEON_rev64(*puVar9,1);
      *puVar8 = uVar14;
      lVar13 = lVar13 + 8;
      puVar9 = puVar9 + 1;
    } while (lVar13 != 0);
    if (uVar6 == uVar7) goto LAB_0029d828;
  }
LAB_0029d804:
  lVar13 = uVar6 - uVar7;
  puVar5 = (undefined1 *)(in_x9 + uVar7);
  puVar10 = (undefined1 *)(param_2 + param_3 + ~uVar7);
  do {
    *puVar10 = *puVar5;
    lVar13 = lVar13 + -1;
    puVar5 = puVar5 + 1;
    puVar10 = puVar10 + -1;
  } while (lVar13 != 0);
LAB_0029d828:
  if (param_1 < param_3) {
    _bzero(param_2,param_3 - uVar6);
  }
  return 1;
}

