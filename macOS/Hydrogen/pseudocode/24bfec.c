
void FUN_0024bfec(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  bool bVar6;
  long *plVar7;
  long in_x9;
  long lVar8;
  ulong in_x10;
  ulong in_x11;
  long lVar9;
  ulong uVar10;
  ulong in_x12;
  long in_x13;
  ulong uVar11;
  long in_x14;
  ulong in_x15;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  long lVar17;
  ulong uVar18;
  long lVar19;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x25;
  
  auVar4._8_8_ = 0;
  auVar4._0_8_ = in_x11;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = in_x15 & 0xffffffffffff0000 | 0xaaab;
  uVar12 = SUB168(auVar4 * auVar5,8) >> 4;
  if (in_x11 < 0x60) {
    lVar9 = 0;
    uVar14 = 0;
LAB_0024c174:
    lVar13 = uVar14 - uVar12;
    plVar7 = (long *)(in_x13 * 0x18 + uVar14 * 0x18 + in_x14 * -0x18 + in_x9 + 0x10);
    do {
      lVar9 = *plVar7 + lVar9;
      bVar6 = lVar13 != -1;
      lVar13 = lVar13 + 1;
      plVar7 = plVar7 + 3;
    } while (bVar6);
  }
  else {
    lVar9 = 0;
    lVar13 = 0;
    lVar8 = 0;
    lVar15 = 0;
    uVar14 = uVar12 & 0xffffffffffffffc;
    plVar7 = (long *)(in_x13 * 0x18 + in_x14 * -0x18 + in_x9 + 0x40);
    uVar11 = uVar14;
    do {
      lVar9 = plVar7[-6] + lVar9;
      lVar13 = plVar7[-3] + lVar13;
      lVar8 = *plVar7 + lVar8;
      lVar15 = plVar7[3] + lVar15;
      plVar7 = plVar7 + 0xc;
      uVar11 = uVar11 - 4;
    } while (uVar11 != 0);
    lVar9 = lVar15 + lVar8 + lVar13 + lVar9;
    if (uVar12 != uVar14) goto LAB_0024c174;
  }
  if (in_x10 < param_1) {
    if (in_x12 < 4) {
      uVar11 = 0;
    }
    else {
      lVar13 = 0;
      lVar8 = 0;
      lVar15 = 0;
      uVar11 = in_x12 & 0xfffffffffffffffc;
      plVar7 = (long *)(in_x9 + 0x40);
      uVar12 = uVar11;
      do {
        lVar9 = plVar7[-6] + lVar9;
        lVar13 = plVar7[-3] + lVar13;
        lVar8 = *plVar7 + lVar8;
        lVar15 = plVar7[3] + lVar15;
        plVar7 = plVar7 + 0xc;
        uVar12 = uVar12 - 4;
      } while (uVar12 != 0);
      lVar9 = lVar15 + lVar8 + lVar13 + lVar9;
      if (in_x12 == uVar11) goto LAB_0024c23c;
    }
    uVar12 = param_1;
    if (in_x10 <= param_1) {
      uVar12 = in_x10;
    }
    lVar13 = (uVar11 + uVar12) - param_1;
    plVar7 = (long *)(in_x9 + uVar11 * 0x18 + 0x10);
    do {
      lVar9 = *plVar7 + lVar9;
      bVar6 = lVar13 != -1;
      lVar13 = lVar13 + 1;
      plVar7 = plVar7 + 3;
    } while (bVar6);
  }
LAB_0024c23c:
  uVar12 = *(ulong *)(unaff_x20 + 0x78);
  if (uVar12 == 0) {
    lVar13 = 0;
    goto LAB_0024c3ec;
  }
  lVar13 = 0;
  lVar8 = *(long *)(unaff_x20 + 0x68);
  uVar2 = *(ulong *)(unaff_x20 + 0x70);
  uVar14 = *(ulong *)(unaff_x20 + 0x60);
  uVar11 = 0;
  if (uVar14 <= uVar2) {
    uVar11 = uVar14;
  }
  lVar15 = uVar2 - uVar11;
  uVar10 = uVar14 - lVar15;
  if (uVar12 <= uVar10) {
    uVar14 = lVar15 + uVar12;
  }
  uVar1 = 0;
  if (uVar10 <= uVar12) {
    uVar1 = uVar12 - uVar10;
  }
  if (uVar14 - lVar15 != 0) {
    uVar14 = (uVar14 - lVar15) * 0x18;
    uVar16 = uVar14 / 0x18;
    if (uVar14 < 0x60) {
      lVar13 = 0;
      uVar18 = 0;
    }
    else {
      lVar13 = 0;
      lVar15 = 0;
      lVar17 = 0;
      lVar19 = 0;
      uVar18 = uVar16 & 0xffffffffffffffc;
      plVar7 = (long *)(uVar2 * 0x18 + uVar11 * -0x18 + lVar8 + 0x40);
      uVar14 = uVar18;
      do {
        lVar13 = plVar7[-6] + lVar13;
        lVar15 = plVar7[-3] + lVar15;
        lVar17 = *plVar7 + lVar17;
        lVar19 = plVar7[3] + lVar19;
        plVar7 = plVar7 + 0xc;
        uVar14 = uVar14 - 4;
      } while (uVar14 != 0);
      lVar13 = lVar19 + lVar17 + lVar15 + lVar13;
      if (uVar16 == uVar18) goto LAB_0024c350;
    }
    lVar15 = uVar18 - uVar16;
    plVar7 = (long *)(uVar2 * 0x18 + uVar18 * 0x18 + uVar11 * -0x18 + lVar8 + 0x10);
    do {
      lVar13 = *plVar7 + lVar13;
      bVar6 = lVar15 != -1;
      lVar15 = lVar15 + 1;
      plVar7 = plVar7 + 3;
    } while (bVar6);
  }
LAB_0024c350:
  if (uVar10 < uVar12) {
    if (uVar1 < 4) {
      uVar14 = 0;
    }
    else {
      lVar15 = 0;
      lVar17 = 0;
      lVar19 = 0;
      uVar14 = uVar1 & 0xfffffffffffffffc;
      plVar7 = (long *)(lVar8 + 0x40);
      uVar11 = uVar14;
      do {
        lVar13 = plVar7[-6] + lVar13;
        lVar15 = plVar7[-3] + lVar15;
        lVar17 = *plVar7 + lVar17;
        lVar19 = plVar7[3] + lVar19;
        plVar7 = plVar7 + 0xc;
        uVar11 = uVar11 - 4;
      } while (uVar11 != 0);
      lVar13 = lVar19 + lVar17 + lVar15 + lVar13;
      if (uVar1 == uVar14) goto LAB_0024c3ec;
    }
    uVar11 = uVar12;
    if (uVar10 <= uVar12) {
      uVar11 = uVar10;
    }
    lVar15 = (uVar14 + uVar11) - uVar12;
    plVar7 = (long *)(lVar8 + uVar14 * 0x18 + 0x10);
    do {
      lVar13 = *plVar7 + lVar13;
      bVar6 = lVar15 != -1;
      lVar15 = lVar15 + 1;
      plVar7 = plVar7 + 3;
    } while (bVar6);
  }
LAB_0024c3ec:
  lVar8 = *(long *)(unaff_x20 + 0x80);
  uVar3 = *(undefined1 *)(unaff_x20 + 0x337);
  unaff_x19[1] = lVar9 - *(long *)(unaff_x20 + 0xb8);
  unaff_x19[2] = lVar13 - lVar8;
  *(undefined1 *)(unaff_x19 + 3) = uVar3;
  *unaff_x19 = unaff_x25;
  return;
}

