
undefined8 * FUN_0071e454(long param_1)

{
  ulong uVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long *extraout_x8;
  long *plVar5;
  ulong uVar6;
  ulong in_x9;
  long lVar7;
  long extraout_x9;
  long lVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong in_x10;
  undefined8 *in_x11;
  ulong uVar11;
  long in_x12;
  undefined8 *puVar12;
  long unaff_x19;
  undefined8 unaff_x20;
  ulong *puVar13;
  undefined8 *unaff_x22;
  undefined8 *puVar14;
  undefined8 *puVar15;
  long unaff_x29;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined1 auVar23 [16];
  
  while( true ) {
    puVar12 = *(undefined8 **)(param_1 + in_x9 * 0x10);
    in_x12 = in_x12 + 1;
    if (puVar12 == in_x11) break;
    if (puVar12 == unaff_x22) goto code_r0x0071e47c;
    in_x9 = in_x9 + in_x12 & in_x10;
  }
  *(undefined8 **)(param_1 + in_x9 * 0x10) = unaff_x22;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x0071e47c:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x20;
  plVar5 = *(long **)(unaff_x29 + -0xa8);
  lVar7 = *plVar5 + *(long *)(unaff_x29 + -0xa0) * 0x40;
  if (lVar7 != plVar5[1]) {
    plVar5[1] = lVar7;
  }
  plVar5 = *(long **)(unaff_x29 + -0x90);
  lVar7 = *plVar5 + *(long *)(unaff_x29 + -0x88) * 0x38;
  if (lVar7 != plVar5[1]) {
    plVar5[1] = lVar7;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return unaff_x22;
  }
  ___stack_chk_fail();
  plVar5 = *(long **)(unaff_x29 + -0xa8);
  lVar7 = *plVar5 + *(long *)(unaff_x29 + -0xa0) * 0x40;
  if (lVar7 != plVar5[1]) goto LAB_0071e718;
  plVar5 = *(long **)(unaff_x29 + -0x90);
  lVar7 = *plVar5 + *(long *)(unaff_x29 + -0x88) * 0x38;
  if (lVar7 == plVar5[1]) {
    do {
      __Unwind_Resume();
      plVar5 = extraout_x8;
      lVar7 = extraout_x9;
LAB_0071e718:
      plVar5[1] = lVar7;
      plVar5 = *(long **)(unaff_x29 + -0x90);
      lVar7 = *plVar5 + *(long *)(unaff_x29 + -0x88) * 0x38;
    } while (lVar7 == plVar5[1]);
  }
  plVar5[1] = lVar7;
  auVar23 = __Unwind_Resume();
  puVar14 = auVar23._8_8_;
  puVar3 = auVar23._0_8_;
  puVar13 = (ulong *)*puVar3;
  puVar12 = (undefined8 *)puVar13[1];
  if (puVar12 < (undefined8 *)puVar13[2]) {
    uVar17 = puVar14[1];
    uVar16 = *puVar14;
    uVar19 = puVar14[3];
    uVar18 = puVar14[2];
    uVar21 = puVar14[5];
    uVar20 = puVar14[4];
    puVar12[6] = puVar14[6];
    puVar12[3] = uVar19;
    puVar12[2] = uVar18;
    puVar12[5] = uVar21;
    puVar12[4] = uVar20;
    puVar12[1] = uVar17;
    *puVar12 = uVar16;
    puVar14 = puVar12 + 7;
    puVar4 = puVar3;
    goto LAB_0071e89c;
  }
  puVar15 = (undefined8 *)*puVar13;
  lVar7 = (long)puVar12 - (long)puVar15 >> 3;
  uVar1 = lVar7 * 0x6db6db6db6db6db7 + 1;
  if (uVar1 < 0x492492492492493) {
    lVar8 = (long)puVar13[2] - (long)puVar15 >> 3;
    uVar11 = lVar8 * -0x2492492492492492;
    if (uVar11 <= uVar1) {
      uVar11 = uVar1;
    }
    if (0x249249249249248 < (ulong)(lVar8 * 0x6db6db6db6db6db7)) {
      uVar11 = 0x492492492492492;
    }
    if (uVar11 == 0) {
      puVar4 = (undefined8 *)0x0;
    }
    else {
      if (0x492492492492492 < uVar11) goto LAB_0071e8cc;
      puVar4 = (undefined8 *)__Znwm(uVar11 * 0x38);
    }
    puVar10 = puVar4 + lVar7;
    uVar16 = *puVar14;
    uVar18 = puVar14[3];
    uVar17 = puVar14[2];
    puVar10[1] = puVar14[1];
    *puVar10 = uVar16;
    puVar10[3] = uVar18;
    puVar10[2] = uVar17;
    uVar16 = puVar14[4];
    puVar10[5] = puVar14[5];
    puVar10[4] = uVar16;
    puVar10[6] = puVar14[6];
    puVar14 = puVar10 + 7;
    if (puVar12 != puVar15) {
      do {
        uVar17 = puVar12[-6];
        uVar16 = puVar12[-7];
        uVar19 = puVar12[-4];
        uVar18 = puVar12[-5];
        uVar21 = puVar12[-2];
        uVar20 = puVar12[-3];
        puVar9 = puVar12 + -1;
        puVar12 = puVar12 + -7;
        puVar10[-1] = *puVar9;
        puVar10[-2] = uVar21;
        puVar10[-3] = uVar20;
        puVar10[-4] = uVar19;
        puVar10[-5] = uVar18;
        puVar10[-6] = uVar17;
        puVar10[-7] = uVar16;
        puVar10 = puVar10 + -7;
      } while (puVar12 != puVar15);
      puVar12 = (undefined8 *)*puVar13;
    }
    *puVar13 = (ulong)puVar10;
    puVar13[1] = (ulong)puVar14;
    puVar13[2] = (ulong)(puVar4 + uVar11 * 7);
    if (puVar12 != (undefined8 *)0x0) {
      puVar4 = (undefined8 *)__ZdlPv(puVar12);
    }
LAB_0071e89c:
    puVar13[1] = (ulong)puVar14;
    puVar3[2] = puVar3[2] + 1;
    return puVar4;
  }
  func_0x00017f90(puVar13);
LAB_0071e8cc:
  auVar23 = func_0x00017514();
  puVar14 = auVar23._8_8_;
  puVar3 = auVar23._0_8_;
  puVar13 = (ulong *)*puVar3;
  puVar12 = (undefined8 *)puVar13[1];
  if (puVar12 < (undefined8 *)puVar13[2]) {
    uVar17 = puVar14[1];
    uVar16 = *puVar14;
    uVar19 = puVar14[3];
    uVar18 = puVar14[2];
    uVar20 = puVar14[4];
    uVar22 = puVar14[7];
    uVar21 = puVar14[6];
    puVar12[5] = puVar14[5];
    puVar12[4] = uVar20;
    puVar12[7] = uVar22;
    puVar12[6] = uVar21;
    puVar12[1] = uVar17;
    *puVar12 = uVar16;
    puVar12[3] = uVar19;
    puVar12[2] = uVar18;
    puVar14 = puVar12 + 8;
    puVar15 = puVar3;
  }
  else {
    puVar4 = (undefined8 *)*puVar13;
    lVar7 = (long)puVar12 - (long)puVar4 >> 6;
    uVar1 = lVar7 + 1;
    if (uVar1 >> 0x3a != 0) {
      func_0x00017f90(puVar13);
code_r0x0071e9f8:
      lVar7 = func_0x00017514();
      iVar2 = *(int *)(lVar7 + 0x80);
      uVar1 = 0x100000000;
      if (iVar2 != 0x3b) {
        uVar1 = 0;
      }
      uVar11 = 0x100000000;
      if (iVar2 != 0x2c) {
        uVar11 = uVar1;
      }
      uVar1 = 0;
      if (iVar2 != 0x2c) {
        uVar1 = (ulong)(iVar2 == 0x3b);
      }
      return (undefined8 *)(uVar1 | uVar11);
    }
    uVar6 = (long)puVar13[2] - (long)puVar4;
    uVar11 = (long)uVar6 >> 5;
    if (uVar11 <= uVar1) {
      uVar11 = uVar1;
    }
    if (0x7fffffffffffffbf < uVar6) {
      uVar11 = 0x3ffffffffffffff;
    }
    if (uVar11 == 0) {
      puVar15 = (undefined8 *)0x0;
    }
    else {
      if (uVar11 >> 0x3a != 0) goto code_r0x0071e9f8;
      puVar15 = (undefined8 *)__Znwm(uVar11 << 6);
    }
    puVar10 = puVar15 + lVar7 * 8;
    uVar16 = *puVar14;
    uVar18 = puVar14[3];
    uVar17 = puVar14[2];
    puVar10[1] = puVar14[1];
    *puVar10 = uVar16;
    puVar10[3] = uVar18;
    puVar10[2] = uVar17;
    uVar16 = puVar14[4];
    uVar18 = puVar14[7];
    uVar17 = puVar14[6];
    puVar10[5] = puVar14[5];
    puVar10[4] = uVar16;
    puVar10[7] = uVar18;
    puVar10[6] = uVar17;
    puVar14 = puVar10 + 8;
    puVar9 = puVar10;
    if (puVar12 != puVar4) {
      do {
        uVar17 = puVar12[-7];
        uVar16 = puVar12[-8];
        uVar19 = puVar12[-5];
        uVar18 = puVar12[-6];
        puVar10 = puVar12 + -3;
        uVar20 = puVar12[-4];
        uVar22 = puVar12[-1];
        uVar21 = puVar12[-2];
        puVar12 = puVar12 + -8;
        puVar9[-3] = *puVar10;
        puVar9[-4] = uVar20;
        puVar9[-1] = uVar22;
        puVar9[-2] = uVar21;
        puVar10 = puVar9 + -8;
        puVar9[-7] = uVar17;
        *puVar10 = uVar16;
        puVar9[-5] = uVar19;
        puVar9[-6] = uVar18;
        puVar9 = puVar10;
      } while (puVar12 != puVar4);
      puVar12 = (undefined8 *)*puVar13;
    }
    *puVar13 = (ulong)puVar10;
    puVar13[1] = (ulong)puVar14;
    puVar13[2] = (ulong)(puVar15 + uVar11 * 8);
    if (puVar12 != (undefined8 *)0x0) {
      puVar15 = (undefined8 *)__ZdlPv(puVar12);
    }
  }
  puVar13[1] = (ulong)puVar14;
  puVar3[2] = puVar3[2] + 1;
  return puVar15;
}

