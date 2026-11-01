
void FUN_0024c988(ulong param_1)

{
  undefined1 uVar1;
  bool bVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  long in_x11;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x25;
  
  lVar8 = *(long *)(unaff_x20 + 0xa0);
  uVar9 = *(ulong *)(unaff_x20 + 0xa8);
  uVar7 = *(ulong *)(unaff_x20 + 0x98);
  uVar4 = 0;
  if (uVar7 <= uVar9) {
    uVar4 = uVar7;
  }
  lVar10 = uVar9 - uVar4;
  uVar5 = uVar7 - lVar10;
  if (param_1 <= uVar5) {
    uVar7 = lVar10 + param_1;
  }
  uVar6 = 0;
  if (uVar5 <= param_1) {
    uVar6 = param_1 - uVar5;
  }
  if (uVar7 - lVar10 != 0) {
    uVar7 = (uVar7 - lVar10) * 0x18;
    uVar11 = uVar7 / 0x18;
    if (uVar7 < 0x60) {
      in_x11 = 0;
      uVar12 = 0;
    }
    else {
      lVar10 = 0;
      lVar13 = 0;
      lVar14 = 0;
      lVar16 = 0;
      uVar12 = uVar11 & 0xffffffffffffffc;
      plVar3 = (long *)(uVar9 * 0x18 + uVar4 * -0x18 + lVar8 + 0x40);
      uVar7 = uVar12;
      do {
        lVar10 = plVar3[-6] + lVar10;
        lVar13 = plVar3[-3] + lVar13;
        lVar14 = *plVar3 + lVar14;
        lVar16 = plVar3[3] + lVar16;
        plVar3 = plVar3 + 0xc;
        uVar7 = uVar7 - 4;
      } while (uVar7 != 0);
      in_x11 = lVar16 + lVar14 + lVar13 + lVar10;
      if (uVar11 == uVar12) goto LAB_0024cb7c;
    }
    lVar10 = uVar12 - uVar11;
    plVar3 = (long *)(uVar9 * 0x18 + uVar12 * 0x18 + uVar4 * -0x18 + lVar8 + 0x10);
    do {
      in_x11 = *plVar3 + in_x11;
      bVar2 = lVar10 != -1;
      lVar10 = lVar10 + 1;
      plVar3 = plVar3 + 3;
    } while (bVar2);
  }
LAB_0024cb7c:
  if (uVar5 < param_1) {
    if (uVar6 < 4) {
      uVar7 = 0;
    }
    else {
      lVar10 = 0;
      lVar13 = 0;
      lVar14 = 0;
      uVar7 = uVar6 & 0xfffffffffffffffc;
      plVar3 = (long *)(lVar8 + 0x40);
      uVar4 = uVar7;
      do {
        in_x11 = plVar3[-6] + in_x11;
        lVar10 = plVar3[-3] + lVar10;
        lVar13 = *plVar3 + lVar13;
        lVar14 = plVar3[3] + lVar14;
        plVar3 = plVar3 + 0xc;
        uVar4 = uVar4 - 4;
      } while (uVar4 != 0);
      in_x11 = lVar14 + lVar13 + lVar10 + in_x11;
      if (uVar6 == uVar7) goto code_r0x0024cc18;
    }
    uVar4 = param_1;
    if (uVar5 <= param_1) {
      uVar4 = uVar5;
    }
    lVar10 = (uVar7 + uVar4) - param_1;
    plVar3 = (long *)(lVar8 + uVar7 * 0x18 + 0x10);
    do {
      in_x11 = *plVar3 + in_x11;
      bVar2 = lVar10 != -1;
      lVar10 = lVar10 + 1;
      plVar3 = plVar3 + 3;
    } while (bVar2);
  }
code_r0x0024cc18:
  uVar4 = *(ulong *)(unaff_x20 + 0x78);
  if (uVar4 == 0) {
    lVar8 = 0;
    goto code_r0x0024cdc8;
  }
  lVar8 = 0;
  lVar10 = *(long *)(unaff_x20 + 0x68);
  uVar5 = *(ulong *)(unaff_x20 + 0x70);
  uVar9 = *(ulong *)(unaff_x20 + 0x60);
  uVar7 = 0;
  if (uVar9 <= uVar5) {
    uVar7 = uVar9;
  }
  lVar13 = uVar5 - uVar7;
  uVar6 = uVar9 - lVar13;
  if (uVar4 <= uVar6) {
    uVar9 = lVar13 + uVar4;
  }
  uVar11 = 0;
  if (uVar6 <= uVar4) {
    uVar11 = uVar4 - uVar6;
  }
  if (uVar9 - lVar13 != 0) {
    uVar9 = (uVar9 - lVar13) * 0x18;
    uVar12 = uVar9 / 0x18;
    if (uVar9 < 0x60) {
      lVar8 = 0;
      uVar15 = 0;
    }
    else {
      lVar8 = 0;
      lVar13 = 0;
      lVar14 = 0;
      lVar16 = 0;
      uVar15 = uVar12 & 0xffffffffffffffc;
      plVar3 = (long *)(uVar5 * 0x18 + uVar7 * -0x18 + lVar10 + 0x40);
      uVar9 = uVar15;
      do {
        lVar8 = plVar3[-6] + lVar8;
        lVar13 = plVar3[-3] + lVar13;
        lVar14 = *plVar3 + lVar14;
        lVar16 = plVar3[3] + lVar16;
        plVar3 = plVar3 + 0xc;
        uVar9 = uVar9 - 4;
      } while (uVar9 != 0);
      lVar8 = lVar16 + lVar14 + lVar13 + lVar8;
      if (uVar12 == uVar15) goto code_r0x0024cd2c;
    }
    lVar13 = uVar15 - uVar12;
    plVar3 = (long *)(uVar5 * 0x18 + uVar15 * 0x18 + uVar7 * -0x18 + lVar10 + 0x10);
    do {
      lVar8 = *plVar3 + lVar8;
      bVar2 = lVar13 != -1;
      lVar13 = lVar13 + 1;
      plVar3 = plVar3 + 3;
    } while (bVar2);
  }
code_r0x0024cd2c:
  if (uVar6 < uVar4) {
    if (uVar11 < 4) {
      uVar9 = 0;
    }
    else {
      lVar13 = 0;
      lVar14 = 0;
      lVar16 = 0;
      uVar9 = uVar11 & 0xfffffffffffffffc;
      plVar3 = (long *)(lVar10 + 0x40);
      uVar7 = uVar9;
      do {
        lVar8 = plVar3[-6] + lVar8;
        lVar13 = plVar3[-3] + lVar13;
        lVar14 = *plVar3 + lVar14;
        lVar16 = plVar3[3] + lVar16;
        plVar3 = plVar3 + 0xc;
        uVar7 = uVar7 - 4;
      } while (uVar7 != 0);
      lVar8 = lVar16 + lVar14 + lVar13 + lVar8;
      if (uVar11 == uVar9) goto code_r0x0024cdc8;
    }
    uVar7 = uVar4;
    if (uVar6 <= uVar4) {
      uVar7 = uVar6;
    }
    lVar13 = (uVar9 + uVar7) - uVar4;
    plVar3 = (long *)(lVar10 + uVar9 * 0x18 + 0x10);
    do {
      lVar8 = *plVar3 + lVar8;
      bVar2 = lVar13 != -1;
      lVar13 = lVar13 + 1;
      plVar3 = plVar3 + 3;
    } while (bVar2);
  }
code_r0x0024cdc8:
  lVar10 = *(long *)(unaff_x20 + 0x80);
  uVar1 = *(undefined1 *)(unaff_x20 + 0x337);
  unaff_x19[1] = in_x11 - *(long *)(unaff_x20 + 0xb8);
  unaff_x19[2] = lVar8 - lVar10;
  *(undefined1 *)(unaff_x19 + 3) = uVar1;
  *unaff_x19 = unaff_x25;
  return;
}

