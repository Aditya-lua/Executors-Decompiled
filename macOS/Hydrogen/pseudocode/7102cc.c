
void FUN_007102cc(undefined8 param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long in_x9;
  long lVar3;
  undefined8 *in_x10;
  long lVar4;
  long in_x11;
  long lVar5;
  ulong in_x12;
  ulong uVar6;
  ulong in_x13;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar12;
  undefined8 *unaff_x24;
  undefined8 *puVar13;
  undefined8 *puVar14;
  long lVar15;
  long unaff_x28;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  long *in_stack_00000018;
  
  puVar12 = unaff_x24;
  if (in_x13 < 0x40) {
LAB_0071032c:
    do {
      puVar12 = puVar12 + -1;
      in_x10 = in_x10 + -1;
      *in_x10 = *puVar12;
    } while (puVar12 != unaff_x23);
  }
  else {
    uVar11 = (in_x12 >> 3) + 1;
    uVar6 = uVar11 & 0x3ffffffffffffff8;
    puVar12 = unaff_x24 + -uVar6;
    in_x10 = (undefined8 *)(in_x9 + uVar6 * -8);
    puVar7 = unaff_x24 + -4;
    puVar8 = (undefined8 *)(param_2 + (in_x11 >> 3) * 8 + -0x20);
    uVar10 = uVar6;
    do {
      uVar17 = *puVar7;
      uVar18 = puVar7[3];
      uVar16 = puVar7[2];
      uVar22 = puVar7[-3];
      uVar21 = puVar7[-4];
      uVar20 = puVar7[-1];
      uVar19 = puVar7[-2];
      puVar8[1] = puVar7[1];
      *puVar8 = uVar17;
      puVar8[3] = uVar18;
      puVar8[2] = uVar16;
      puVar8[-3] = uVar22;
      puVar8[-4] = uVar21;
      puVar8[-1] = uVar20;
      puVar8[-2] = uVar19;
      puVar7 = puVar7 + -8;
      puVar8 = puVar8 + -8;
      uVar10 = uVar10 - 8;
    } while (uVar10 != 0);
    if (uVar11 != uVar6) goto LAB_0071032c;
  }
  *(undefined8 **)(unaff_x19 + 400) = in_x10;
  *(long *)(unaff_x19 + 0x198) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x1a0) = param_1;
  if (unaff_x23 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x1f0);
  if ((ulong)(*(long *)(unaff_x19 + 0x200) - (long)puVar12) < 0x80) {
    puVar13 = *(undefined8 **)(unaff_x19 + 0x1f8);
    lVar1 = __Znwm(0x80);
    uVar11 = (long)puVar13 - (long)puVar12;
    puVar7 = (undefined8 *)(lVar1 + (uVar11 & 0xfffffffffffffff8));
    puVar8 = puVar7;
    if (uVar11 != 0) {
      puVar14 = puVar13;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar1)))
      {
        uVar10 = (uVar11 - 8 >> 3) + 1;
        uVar6 = uVar10 & 0x3ffffffffffffff8;
        puVar14 = puVar13 + -uVar6;
        puVar8 = puVar7 + -uVar6;
        puVar13 = puVar13 + -4;
        puVar9 = (undefined8 *)(lVar1 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar6;
        do {
          uVar17 = *puVar13;
          uVar18 = puVar13[3];
          uVar16 = puVar13[2];
          uVar22 = puVar13[-3];
          uVar21 = puVar13[-4];
          uVar20 = puVar13[-1];
          uVar19 = puVar13[-2];
          puVar9[1] = puVar13[1];
          *puVar9 = uVar17;
          puVar9[3] = uVar18;
          puVar9[2] = uVar16;
          puVar9[-3] = uVar22;
          puVar9[-4] = uVar21;
          puVar9[-1] = uVar20;
          puVar9[-2] = uVar19;
          puVar13 = puVar13 + -8;
          puVar9 = puVar9 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar10 == uVar6) goto LAB_0071041c;
      }
      do {
        puVar14 = puVar14 + -1;
        puVar8 = puVar8 + -1;
        *puVar8 = *puVar14;
      } while (puVar14 != puVar12);
    }
LAB_0071041c:
    *(undefined8 **)(unaff_x19 + 0x1f0) = puVar8;
    *(undefined8 **)(unaff_x19 + 0x1f8) = puVar7;
    *(long *)(unaff_x19 + 0x200) = lVar1 + 0x80;
    if (puVar12 != (undefined8 *)0x0) {
      __ZdlPv(puVar12);
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x238);
  if ((ulong)(*(long *)(unaff_x19 + 0x248) - (long)puVar12) < 0x80) {
    puVar13 = *(undefined8 **)(unaff_x19 + 0x240);
    lVar1 = __Znwm(0x80);
    uVar11 = (long)puVar13 - (long)puVar12;
    puVar7 = (undefined8 *)(lVar1 + (uVar11 & 0xfffffffffffffff8));
    puVar8 = puVar7;
    if (uVar11 != 0) {
      puVar14 = puVar13;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar1)))
      {
        uVar10 = (uVar11 - 8 >> 3) + 1;
        uVar6 = uVar10 & 0x3ffffffffffffff8;
        puVar14 = puVar13 + -uVar6;
        puVar8 = puVar7 + -uVar6;
        puVar13 = puVar13 + -4;
        puVar9 = (undefined8 *)(lVar1 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar6;
        do {
          uVar17 = *puVar13;
          uVar18 = puVar13[3];
          uVar16 = puVar13[2];
          uVar22 = puVar13[-3];
          uVar21 = puVar13[-4];
          uVar20 = puVar13[-1];
          uVar19 = puVar13[-2];
          puVar9[1] = puVar13[1];
          *puVar9 = uVar17;
          puVar9[3] = uVar18;
          puVar9[2] = uVar16;
          puVar9[-3] = uVar22;
          puVar9[-4] = uVar21;
          puVar9[-1] = uVar20;
          puVar9[-2] = uVar19;
          puVar13 = puVar13 + -8;
          puVar9 = puVar9 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar10 == uVar6) goto LAB_007104fc;
      }
      do {
        puVar14 = puVar14 + -1;
        puVar8 = puVar8 + -1;
        *puVar8 = *puVar14;
      } while (puVar14 != puVar12);
    }
LAB_007104fc:
    *(undefined8 **)(unaff_x19 + 0x238) = puVar8;
    *(undefined8 **)(unaff_x19 + 0x240) = puVar7;
    *(long *)(unaff_x19 + 0x248) = lVar1 + 0x80;
    if (puVar12 != (undefined8 *)0x0) {
      __ZdlPv(puVar12);
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x2b0);
  if (0x7f < (ulong)(*(long *)(unaff_x19 + 0x2c0) - (long)puVar12)) goto code_r0x007105f8;
  puVar13 = *(undefined8 **)(unaff_x19 + 0x2b8);
  lVar1 = __Znwm(0x80);
  uVar11 = (long)puVar13 - (long)puVar12;
  puVar7 = (undefined8 *)(lVar1 + (uVar11 & 0xfffffffffffffff8));
  puVar8 = puVar7;
  if (uVar11 != 0) {
    puVar14 = puVar13;
    if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar1))) {
      uVar10 = (uVar11 - 8 >> 3) + 1;
      uVar6 = uVar10 & 0x3ffffffffffffff8;
      puVar14 = puVar13 + -uVar6;
      puVar8 = puVar7 + -uVar6;
      puVar13 = puVar13 + -4;
      puVar9 = (undefined8 *)(lVar1 + ((long)uVar11 >> 3) * 8 + -0x20);
      uVar11 = uVar6;
      do {
        uVar17 = *puVar13;
        uVar18 = puVar13[3];
        uVar16 = puVar13[2];
        uVar22 = puVar13[-3];
        uVar21 = puVar13[-4];
        uVar20 = puVar13[-1];
        uVar19 = puVar13[-2];
        puVar9[1] = puVar13[1];
        *puVar9 = uVar17;
        puVar9[3] = uVar18;
        puVar9[2] = uVar16;
        puVar9[-3] = uVar22;
        puVar9[-4] = uVar21;
        puVar9[-1] = uVar20;
        puVar9[-2] = uVar19;
        puVar13 = puVar13 + -8;
        puVar9 = puVar9 + -8;
        uVar11 = uVar11 - 8;
      } while (uVar11 != 0);
      if (uVar10 == uVar6) goto code_r0x007105e0;
    }
    do {
      puVar14 = puVar14 + -1;
      puVar8 = puVar8 + -1;
      *puVar8 = *puVar14;
    } while (puVar14 != puVar12);
  }
code_r0x007105e0:
  *(undefined8 **)(unaff_x19 + 0x2b0) = puVar8;
  *(undefined8 **)(unaff_x19 + 0x2b8) = puVar7;
  *(long *)(unaff_x19 + 0x2c0) = lVar1 + 0x80;
  if (puVar12 != (undefined8 *)0x0) {
    __ZdlPv(puVar12);
  }
code_r0x007105f8:
  lVar1 = *(long *)(unaff_x19 + 0x298);
  if ((ulong)((*(long *)(unaff_x19 + 0x2a8) - lVar1 >> 3) * -0x3333333333333333) < 0x10) {
    lVar15 = *(long *)(unaff_x19 + 0x2a0);
    lVar2 = __Znwm(0x280);
    lVar3 = lVar2 + ((lVar15 - lVar1) / 0x28) * 0x28;
    lVar5 = lVar3;
    if (lVar15 - lVar1 != 0) {
      lVar4 = lVar3;
      do {
        uVar18 = *(undefined8 *)(lVar15 + -0x20);
        uVar16 = *(undefined8 *)(lVar15 + -0x28);
        uVar19 = *(undefined8 *)(lVar15 + -0x10);
        uVar17 = *(undefined8 *)(lVar15 + -0x18);
        puVar12 = (undefined8 *)(lVar15 + -8);
        lVar15 = lVar15 + -0x28;
        lVar5 = lVar4 + -0x28;
        *(undefined8 *)(lVar4 + -8) = *puVar12;
        *(undefined8 *)(lVar4 + -0x10) = uVar19;
        *(undefined8 *)(lVar4 + -0x18) = uVar17;
        *(undefined8 *)(lVar4 + -0x20) = uVar18;
        *(undefined8 *)(lVar4 + -0x28) = uVar16;
        lVar4 = lVar5;
      } while (lVar15 != lVar1);
    }
    *(long *)(unaff_x19 + 0x298) = lVar5;
    *(long *)(unaff_x19 + 0x2a0) = lVar3;
    *(long *)(unaff_x19 + 0x2a8) = lVar2 + 0x280;
    if (lVar1 != 0) {
      __ZdlPv(lVar1);
    }
  }
  if (*(char *)(unaff_x22 + 0x50) != '\0') {
    if (in_stack_00000018 != (long *)(unaff_x22 + 8)) {
      uVar18 = *(undefined8 *)(unaff_x22 + 0x20);
      uVar16 = *(undefined8 *)(unaff_x22 + 0x18);
      if (*(long *)(unaff_x22 + 0x10) == 0) {
        lVar1 = 0;
        lVar5 = 0;
        lVar2 = *in_stack_00000018;
      }
      else {
        lVar5 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar1 = *(long *)(unaff_x22 + 0x10);
        if (lVar1 != 0) {
          lVar2 = 0;
          lVar15 = *(long *)(unaff_x22 + 8);
          lVar3 = lVar1;
          do {
            puVar12 = (undefined8 *)(lVar15 + lVar2);
            uVar17 = *puVar12;
            ((undefined8 *)(lVar5 + lVar2))[1] = puVar12[1];
            *(undefined8 *)(lVar5 + lVar2) = uVar17;
            lVar2 = lVar2 + 0x10;
            lVar3 = lVar3 + -1;
          } while (lVar3 != 0);
        }
        lVar2 = *in_stack_00000018;
      }
      if (lVar2 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar5;
      *(long *)(unaff_x19 + 0x170) = lVar1;
      *(undefined8 *)(unaff_x28 + 0x44) = uVar18;
      *(undefined8 *)(unaff_x28 + 0x3c) = uVar16;
    }
    if (unaff_x20 != unaff_x22 + 0x30) {
      func_0x006d0234();
    }
  }
  return;
}

