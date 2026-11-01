
void FUN_0071ae4c(ulong param_1)

{
  undefined4 *puVar1;
  ulong uVar2;
  int iVar3;
  long lVar4;
  bool in_CY;
  undefined4 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long *plVar10;
  undefined1 uVar11;
  long *extraout_x8;
  ulong uVar12;
  undefined1 *puVar13;
  undefined8 *puVar14;
  ulong uVar15;
  undefined8 *puVar16;
  byte bVar17;
  ulong in_x10;
  undefined1 *puVar18;
  long lVar19;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined1 auVar27 [16];
  
  if (in_CY) {
    in_x10 = param_1;
  }
  if (in_x10 == 0) {
    lVar6 = 0;
LAB_0071ae70:
    puVar14 = (undefined8 *)(lVar6 + unaff_x24 * 0x38);
    uVar20 = *unaff_x22;
    uVar22 = unaff_x22[3];
    uVar21 = unaff_x22[2];
    puVar14[1] = unaff_x22[1];
    *puVar14 = uVar20;
    puVar14[3] = uVar22;
    puVar14[2] = uVar21;
    uVar20 = unaff_x22[4];
    puVar14[5] = unaff_x22[5];
    puVar14[4] = uVar20;
    puVar14[6] = unaff_x22[6];
    puVar16 = puVar14 + 7;
    if (unaff_x21 != unaff_x23) {
      do {
        uVar21 = *(undefined8 *)(unaff_x21 + -0x30);
        uVar20 = *(undefined8 *)(unaff_x21 + -0x38);
        uVar23 = *(undefined8 *)(unaff_x21 + -0x20);
        uVar22 = *(undefined8 *)(unaff_x21 + -0x28);
        uVar25 = *(undefined8 *)(unaff_x21 + -0x10);
        uVar24 = *(undefined8 *)(unaff_x21 + -0x18);
        puVar1 = (undefined4 *)(unaff_x21 + -8);
        unaff_x21 = unaff_x21 + -0x38;
        *(undefined4 *)(puVar14 + -1) = *puVar1;
        puVar14[-2] = uVar25;
        puVar14[-3] = uVar24;
        puVar14[-4] = uVar23;
        puVar14[-5] = uVar22;
        puVar14[-6] = uVar21;
        puVar14[-7] = uVar20;
        puVar14 = puVar14 + -7;
      } while (unaff_x21 != unaff_x23);
      unaff_x21 = *unaff_x20;
    }
    *unaff_x20 = (long)puVar14;
    unaff_x20[1] = (long)puVar16;
    unaff_x20[2] = lVar6 + in_x10 * 0x38;
    if (unaff_x21 != 0) {
      __ZdlPv(unaff_x21);
    }
    unaff_x20[1] = (long)puVar16;
    *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
    return;
  }
  if (in_x10 <= param_1) {
    lVar6 = __Znwm(in_x10 * 0x38);
    goto LAB_0071ae70;
  }
  auVar27 = func_0x00017514();
  plVar10 = auVar27._8_8_;
  lVar7 = auVar27._0_8_;
  lVar6 = lVar7 + 0x400;
  uVar20 = *(undefined8 *)(lVar7 + 0x98);
  uVar5 = func_0x0070aa6c((int *)(lVar7 + 0x80));
  func_0x0002a5d4(lVar6,uVar20,uVar5);
  if (plVar10 != (long *)0x0) {
    bVar17 = *(byte *)(lVar7 + 0x417);
    uVar12 = (ulong)bVar17;
    uVar15 = *(ulong *)(lVar7 + 0x408);
    uVar9 = uVar15;
    lVar4 = *(long *)(lVar7 + 0x400);
    if (-1 < (char)bVar17) {
      uVar9 = uVar12;
      lVar4 = lVar6;
    }
    uVar2 = uVar9 + 1;
    if (uVar9 == 0xffffffffffffffff) {
      lVar8 = 0;
    }
    else {
      lVar8 = func_0x00704c24(*(undefined8 *)(lVar7 + 0xd8),uVar2);
      uVar15 = 0;
      if ((uVar2 < 8) || ((ulong)(lVar8 - lVar4) < 0x40)) {
code_r0x0071b030:
        lVar19 = (uVar9 - uVar15) + 1;
        puVar13 = (undefined1 *)(lVar8 + uVar15);
        puVar18 = (undefined1 *)(lVar4 + uVar15);
        do {
          *puVar13 = *puVar18;
          lVar19 = lVar19 + -1;
          puVar13 = puVar13 + 1;
          puVar18 = puVar18 + 1;
        } while (lVar19 != 0);
      }
      else if (uVar2 < 0x40) {
        uVar12 = 0;
code_r0x0071b004:
        uVar15 = uVar2 & 0xfffffffffffffff8;
        lVar19 = uVar12 - uVar15;
        puVar16 = (undefined8 *)(lVar8 + uVar12);
        puVar14 = (undefined8 *)(lVar4 + uVar12);
        do {
          *puVar16 = *puVar14;
          lVar19 = lVar19 + 8;
          puVar16 = puVar16 + 1;
          puVar14 = puVar14 + 1;
        } while (lVar19 != 0);
        if (uVar2 != uVar15) goto code_r0x0071b030;
      }
      else {
        uVar15 = uVar2 & 0xffffffffffffffc0;
        puVar16 = (undefined8 *)(lVar4 + 0x20);
        puVar14 = (undefined8 *)(lVar8 + 0x20);
        uVar12 = uVar15;
        do {
          uVar20 = puVar16[-4];
          uVar22 = puVar16[-1];
          uVar21 = puVar16[-2];
          uVar24 = puVar16[1];
          uVar23 = *puVar16;
          uVar26 = puVar16[3];
          uVar25 = puVar16[2];
          puVar14[-3] = puVar16[-3];
          puVar14[-4] = uVar20;
          puVar14[-1] = uVar22;
          puVar14[-2] = uVar21;
          puVar14[1] = uVar24;
          *puVar14 = uVar23;
          puVar14[3] = uVar26;
          puVar14[2] = uVar25;
          uVar12 = uVar12 - 0x40;
          puVar16 = puVar16 + 8;
          puVar14 = puVar14 + 8;
        } while (uVar12 != 0);
        if (uVar2 != uVar15) {
          uVar12 = uVar15;
          if ((uVar2 & 0x38) == 0) goto code_r0x0071b030;
          goto code_r0x0071b004;
        }
      }
      bVar17 = *(byte *)(lVar7 + 0x417);
      uVar12 = (ulong)bVar17;
      uVar15 = *(ulong *)(lVar7 + 0x408);
    }
    if (-1 < (char)bVar17) {
      uVar15 = uVar12;
    }
    *plVar10 = lVar8;
    plVar10[1] = uVar15;
  }
  iVar3 = *(int *)(lVar7 + 0x80);
  if ((iVar3 == 0x117) || (iVar3 == 0x10d)) {
    uVar9 = func_0x0070d658(lVar6);
    if ((uVar9 & 1) == 0) {
      func_0x00710d48(lVar7);
      uVar11 = 0;
      *(undefined1 *)extraout_x8 = 0;
      goto code_r0x0071b1b8;
    }
  }
  else {
    func_0x0070deec(lVar6);
  }
  bVar17 = *(byte *)(lVar7 + 0x417);
  uVar12 = (ulong)bVar17;
  uVar15 = *(ulong *)(lVar7 + 0x408);
  uVar9 = uVar15;
  lVar4 = *(long *)(lVar7 + 0x400);
  if (-1 < (char)bVar17) {
    uVar9 = uVar12;
    lVar4 = lVar6;
  }
  uVar2 = uVar9 + 1;
  if (uVar9 == 0xffffffffffffffff) {
    lVar6 = 0;
  }
  else {
    lVar6 = func_0x00704c24(*(undefined8 *)(lVar7 + 0xd8),uVar2);
    uVar15 = 0;
    if ((uVar2 < 8) || ((ulong)(lVar6 - lVar4) < 0x40)) {
code_r0x0071b170:
      lVar8 = (uVar9 - uVar15) + 1;
      puVar13 = (undefined1 *)(lVar6 + uVar15);
      puVar18 = (undefined1 *)(lVar4 + uVar15);
      do {
        *puVar13 = *puVar18;
        lVar8 = lVar8 + -1;
        puVar13 = puVar13 + 1;
        puVar18 = puVar18 + 1;
      } while (lVar8 != 0);
    }
    else if (uVar2 < 0x40) {
      uVar12 = 0;
code_r0x0071b144:
      uVar15 = uVar2 & 0xfffffffffffffff8;
      lVar8 = uVar12 - uVar15;
      puVar16 = (undefined8 *)(lVar6 + uVar12);
      puVar14 = (undefined8 *)(lVar4 + uVar12);
      do {
        *puVar16 = *puVar14;
        lVar8 = lVar8 + 8;
        puVar16 = puVar16 + 1;
        puVar14 = puVar14 + 1;
      } while (lVar8 != 0);
      if (uVar2 != uVar15) goto code_r0x0071b170;
    }
    else {
      uVar15 = uVar2 & 0xffffffffffffffc0;
      puVar16 = (undefined8 *)(lVar4 + 0x20);
      puVar14 = (undefined8 *)(lVar6 + 0x20);
      uVar12 = uVar15;
      do {
        uVar20 = puVar16[-4];
        uVar22 = puVar16[-1];
        uVar21 = puVar16[-2];
        uVar24 = puVar16[1];
        uVar23 = *puVar16;
        uVar26 = puVar16[3];
        uVar25 = puVar16[2];
        puVar14[-3] = puVar16[-3];
        puVar14[-4] = uVar20;
        puVar14[-1] = uVar22;
        puVar14[-2] = uVar21;
        puVar14[1] = uVar24;
        *puVar14 = uVar23;
        puVar14[3] = uVar26;
        puVar14[2] = uVar25;
        uVar12 = uVar12 - 0x40;
        puVar16 = puVar16 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar12 != 0);
      if (uVar2 != uVar15) {
        uVar12 = uVar15;
        if ((uVar2 & 0x38) == 0) goto code_r0x0071b170;
        goto code_r0x0071b144;
      }
    }
    bVar17 = *(byte *)(lVar7 + 0x417);
    uVar12 = (ulong)bVar17;
    uVar15 = *(ulong *)(lVar7 + 0x408);
  }
  if (-1 < (char)bVar17) {
    uVar15 = uVar12;
  }
  func_0x00710d48(lVar7);
  *extraout_x8 = lVar6;
  extraout_x8[1] = uVar15;
  uVar11 = 1;
code_r0x0071b1b8:
  *(undefined1 *)(extraout_x8 + 2) = uVar11;
  return;
}

