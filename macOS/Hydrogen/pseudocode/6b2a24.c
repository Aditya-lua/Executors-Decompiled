
ulong FUN_006b2a24(long param_1,ulong param_2)

{
  long *plVar1;
  long lVar2;
  bool in_CY;
  ulong uVar3;
  undefined4 uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined4 *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar12;
  undefined4 unaff_w22;
  undefined4 *puVar13;
  undefined4 unaff_w23;
  undefined1 unaff_w24;
  undefined4 *puVar14;
  undefined4 unaff_w25;
  undefined4 *puVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined1 auVar24 [12];
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined5 uStack_80;
  undefined2 uStack_7b;
  char cStack_79;
  undefined4 uStack_78;
  undefined1 uStack_74;
  undefined4 *puStack_70;
  ulong uStack_68;
  undefined1 *puStack_60;
  undefined *puStack_58;
  undefined4 *puStack_50;
  undefined1 auStack_6 [6];
  
  if (!in_CY) {
    *unaff_x20 = unaff_w25;
    *(undefined1 *)(unaff_x20 + 1) = unaff_w24;
    puVar14 = unaff_x20 + 4;
    unaff_x20[2] = unaff_w23;
    unaff_x20[3] = unaff_w22;
    goto LAB_006b2ae8;
  }
  plVar1 = (long *)(unaff_x19 + 0x1f0);
  puVar15 = (undefined4 *)*plVar1;
  lVar16 = (long)unaff_x20 - (long)puVar15 >> 4;
  uVar3 = lVar16 + 1;
  if (uVar3 >> 0x3c == 0) {
    uVar8 = param_1 - (long)puVar15 >> 3;
    if (uVar8 <= uVar3) {
      uVar8 = uVar3;
    }
    if (0x7fffffffffffffef < (ulong)(param_1 - (long)puVar15)) {
      uVar8 = 0xfffffffffffffff;
    }
    if (uVar8 == 0) {
      param_2 = 0;
    }
    else {
      if (uVar8 >> 0x3c != 0) goto LAB_006b2b10;
      param_2 = __Znwm(uVar8 << 4);
    }
    puVar12 = (undefined4 *)(param_2 + lVar16 * 0x10);
    *puVar12 = unaff_w25;
    *(undefined1 *)(puVar12 + 1) = unaff_w24;
    puVar12[2] = unaff_w23;
    puVar12[3] = unaff_w22;
    puVar14 = puVar12 + 4;
    if (unaff_x20 != puVar15) {
      do {
        puVar6 = (undefined8 *)(unaff_x20 + -2);
        uVar17 = *(undefined8 *)(unaff_x20 + -4);
        unaff_x20 = unaff_x20 + -4;
        *(undefined8 *)(puVar12 + -2) = *puVar6;
        *(undefined8 *)(puVar12 + -4) = uVar17;
        puVar12 = puVar12 + -4;
      } while (unaff_x20 != puVar15);
      unaff_x20 = (undefined4 *)*plVar1;
    }
    *(undefined4 **)(unaff_x19 + 0x1f0) = puVar12;
    *(undefined4 **)(unaff_x19 + 0x1f8) = puVar14;
    *(ulong *)(unaff_x19 + 0x200) = param_2 + uVar8 * 0x10;
    if (unaff_x20 != (undefined4 *)0x0) {
      param_2 = __ZdlPv(unaff_x20);
    }
LAB_006b2ae8:
    *(undefined4 **)(unaff_x19 + 0x1f8) = puVar14;
    return param_2;
  }
  func_0x00017f90(plVar1);
LAB_006b2b10:
  auVar24 = func_0x00017514();
  uVar4 = auVar24._8_4_;
  uVar3 = auVar24._0_8_;
  puVar14 = *(undefined4 **)(uVar3 + 0x210);
  if (puVar14 < *(undefined4 **)(uVar3 + 0x218)) {
    puVar15 = puVar14 + 1;
    *puVar14 = uVar4;
    uVar8 = uVar3;
    goto LAB_006b2c70;
  }
  puVar12 = *(undefined4 **)(uVar3 + 0x208);
  lVar16 = (long)puVar14 - (long)puVar12 >> 2;
  uVar8 = lVar16 + 1;
  puStack_50 = puVar15;
  if (uVar8 >> 0x3e != 0) {
    func_0x00017f90();
LAB_006b2c90:
    lVar16 = func_0x00017514();
    puStack_58 = &DAT_006b2c94;
    uStack_90 = 0;
    uStack_88 = 0;
    uStack_78 = 0;
    uStack_74 = 0;
    uStack_80 = 0;
    uStack_7b = 0;
    cStack_79 = '\0';
    puStack_70 = puVar12;
    uStack_68 = uVar3;
    puStack_60 = auStack_6 + -10;
    func_0x0002a730(&uStack_90);
    puVar6 = *(undefined8 **)(lVar16 + 0x228);
    if (puVar6 < *(undefined8 **)(lVar16 + 0x230)) {
      puVar6[2] = CONCAT17(cStack_79,CONCAT25(uStack_7b,uStack_80));
      puVar6[1] = uStack_88;
      *puVar6 = uStack_90;
      *(undefined1 *)((long)puVar6 + 0x1c) = uStack_74;
      *(undefined4 *)(puVar6 + 3) = uStack_78;
      puVar6 = puVar6 + 4;
      *(undefined8 **)(lVar16 + 0x228) = puVar6;
      lVar16 = *(long *)(lVar16 + 0x220);
    }
    else {
      puVar6 = (undefined8 *)func_0x006b7730(lVar16 + 0x220,&uStack_90);
      *(undefined8 **)(lVar16 + 0x228) = puVar6;
      lVar16 = *(long *)(lVar16 + 0x220);
      if (cStack_79 < '\0') {
        __ZdlPv(uStack_90);
      }
    }
    return (ulong)((int)((ulong)((long)puVar6 - lVar16) >> 5) - 1);
  }
  uVar5 = (long)*(undefined4 **)(uVar3 + 0x218) - (long)puVar12;
  uVar9 = (long)uVar5 >> 1;
  if (uVar9 <= uVar8) {
    uVar9 = uVar8;
  }
  if (0x7ffffffffffffffb < uVar5) {
    uVar9 = 0x3fffffffffffffff;
  }
  if (uVar9 == 0) {
    uVar8 = 0;
    puVar7 = (undefined4 *)(lVar16 * 4);
    lVar2 = 0;
    *puVar7 = uVar4;
  }
  else {
    if (uVar9 >> 0x3e != 0) goto LAB_006b2c90;
    uVar8 = __Znwm(uVar9 << 2);
    puVar7 = (undefined4 *)(uVar8 + lVar16 * 4);
    lVar2 = uVar8 + uVar9 * 4;
    *puVar7 = uVar4;
  }
  puVar15 = puVar7 + 1;
  if ((long)puVar14 - (long)puVar12 != 0) {
    uVar9 = ((long)puVar14 - (long)puVar12) - 4;
    puVar13 = puVar14;
    if ((0x3b < uVar9) && (0x3f < (long)puVar14 + (-((long)puVar14 - (long)puVar12) - uVar8))) {
      uVar9 = (uVar9 >> 2) + 1;
      uVar10 = uVar9 & 0x7ffffffffffffff0;
      puVar13 = puVar14 + -uVar10;
      puVar7 = puVar7 + -uVar10;
      puVar6 = (undefined8 *)(puVar14 + -8);
      puVar11 = (undefined8 *)(uVar8 + lVar16 * 4 + -0x20);
      uVar5 = uVar10;
      do {
        uVar19 = *puVar6;
        uVar18 = puVar6[3];
        uVar17 = puVar6[2];
        uVar23 = puVar6[-3];
        uVar22 = puVar6[-4];
        uVar21 = puVar6[-1];
        uVar20 = puVar6[-2];
        puVar11[1] = puVar6[1];
        *puVar11 = uVar19;
        puVar11[3] = uVar18;
        puVar11[2] = uVar17;
        puVar11[-3] = uVar23;
        puVar11[-4] = uVar22;
        puVar11[-1] = uVar21;
        puVar11[-2] = uVar20;
        puVar6 = puVar6 + -8;
        puVar11 = puVar11 + -8;
        uVar5 = uVar5 - 0x10;
      } while (uVar5 != 0);
      if (uVar9 == uVar10) goto LAB_006b2c58;
    }
    do {
      puVar13 = puVar13 + -1;
      puVar7 = puVar7 + -1;
      *puVar7 = *puVar13;
    } while (puVar13 != puVar12);
  }
LAB_006b2c58:
  *(undefined4 **)(uVar3 + 0x208) = puVar7;
  *(undefined4 **)(uVar3 + 0x210) = puVar15;
  *(long *)(uVar3 + 0x218) = lVar2;
  if (puVar12 != (undefined4 *)0x0) {
    uVar8 = __ZdlPv(puVar12);
  }
LAB_006b2c70:
  *(undefined4 **)(uVar3 + 0x210) = puVar15;
  return uVar8;
}

