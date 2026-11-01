
void FUN_00710360(void)

{
  ulong uVar1;
  bool in_ZR;
  bool in_CY;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar12;
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
  
  if (!in_CY || in_ZR) {
    puVar13 = *(undefined8 **)(unaff_x19 + 0x1f8);
    lVar2 = __Znwm(0x80);
    uVar11 = (long)puVar13 - (long)unaff_x23;
    puVar12 = (undefined8 *)(lVar2 + (uVar11 & 0xfffffffffffffff8));
    puVar5 = puVar12;
    if (uVar11 != 0) {
      puVar14 = puVar13;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar2)))
      {
        uVar1 = (uVar11 - 8 >> 3) + 1;
        uVar8 = uVar1 & 0x3ffffffffffffff8;
        puVar14 = puVar13 + -uVar8;
        puVar5 = puVar12 + -uVar8;
        puVar13 = puVar13 + -4;
        puVar9 = (undefined8 *)(lVar2 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar8;
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
        if (uVar1 == uVar8) goto LAB_0071041c;
      }
      do {
        puVar14 = puVar14 + -1;
        puVar5 = puVar5 + -1;
        *puVar5 = *puVar14;
      } while (puVar14 != unaff_x23);
    }
LAB_0071041c:
    *(undefined8 **)(unaff_x19 + 0x1f0) = puVar5;
    *(undefined8 **)(unaff_x19 + 0x1f8) = puVar12;
    *(long *)(unaff_x19 + 0x200) = lVar2 + 0x80;
    if (unaff_x23 != (undefined8 *)0x0) {
      __ZdlPv();
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x238);
  if ((ulong)(*(long *)(unaff_x19 + 0x248) - (long)puVar12) < 0x80) {
    puVar14 = *(undefined8 **)(unaff_x19 + 0x240);
    lVar2 = __Znwm(0x80);
    uVar11 = (long)puVar14 - (long)puVar12;
    puVar5 = (undefined8 *)(lVar2 + (uVar11 & 0xfffffffffffffff8));
    puVar13 = puVar5;
    if (uVar11 != 0) {
      puVar9 = puVar14;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar14 + (-(uVar11 & 0xfffffffffffffff8) - lVar2)))
      {
        uVar1 = (uVar11 - 8 >> 3) + 1;
        uVar8 = uVar1 & 0x3ffffffffffffff8;
        puVar9 = puVar14 + -uVar8;
        puVar13 = puVar5 + -uVar8;
        puVar14 = puVar14 + -4;
        puVar10 = (undefined8 *)(lVar2 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar8;
        do {
          uVar17 = *puVar14;
          uVar18 = puVar14[3];
          uVar16 = puVar14[2];
          uVar22 = puVar14[-3];
          uVar21 = puVar14[-4];
          uVar20 = puVar14[-1];
          uVar19 = puVar14[-2];
          puVar10[1] = puVar14[1];
          *puVar10 = uVar17;
          puVar10[3] = uVar18;
          puVar10[2] = uVar16;
          puVar10[-3] = uVar22;
          puVar10[-4] = uVar21;
          puVar10[-1] = uVar20;
          puVar10[-2] = uVar19;
          puVar14 = puVar14 + -8;
          puVar10 = puVar10 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar1 == uVar8) goto LAB_007104fc;
      }
      do {
        puVar9 = puVar9 + -1;
        puVar13 = puVar13 + -1;
        *puVar13 = *puVar9;
      } while (puVar9 != puVar12);
    }
LAB_007104fc:
    *(undefined8 **)(unaff_x19 + 0x238) = puVar13;
    *(undefined8 **)(unaff_x19 + 0x240) = puVar5;
    *(long *)(unaff_x19 + 0x248) = lVar2 + 0x80;
    if (puVar12 != (undefined8 *)0x0) {
      __ZdlPv(puVar12);
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x2b0);
  if (0x7f < (ulong)(*(long *)(unaff_x19 + 0x2c0) - (long)puVar12)) goto code_r0x007105f8;
  puVar14 = *(undefined8 **)(unaff_x19 + 0x2b8);
  lVar2 = __Znwm(0x80);
  uVar11 = (long)puVar14 - (long)puVar12;
  puVar5 = (undefined8 *)(lVar2 + (uVar11 & 0xfffffffffffffff8));
  puVar13 = puVar5;
  if (uVar11 != 0) {
    puVar9 = puVar14;
    if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar14 + (-(uVar11 & 0xfffffffffffffff8) - lVar2))) {
      uVar1 = (uVar11 - 8 >> 3) + 1;
      uVar8 = uVar1 & 0x3ffffffffffffff8;
      puVar9 = puVar14 + -uVar8;
      puVar13 = puVar5 + -uVar8;
      puVar14 = puVar14 + -4;
      puVar10 = (undefined8 *)(lVar2 + ((long)uVar11 >> 3) * 8 + -0x20);
      uVar11 = uVar8;
      do {
        uVar17 = *puVar14;
        uVar18 = puVar14[3];
        uVar16 = puVar14[2];
        uVar22 = puVar14[-3];
        uVar21 = puVar14[-4];
        uVar20 = puVar14[-1];
        uVar19 = puVar14[-2];
        puVar10[1] = puVar14[1];
        *puVar10 = uVar17;
        puVar10[3] = uVar18;
        puVar10[2] = uVar16;
        puVar10[-3] = uVar22;
        puVar10[-4] = uVar21;
        puVar10[-1] = uVar20;
        puVar10[-2] = uVar19;
        puVar14 = puVar14 + -8;
        puVar10 = puVar10 + -8;
        uVar11 = uVar11 - 8;
      } while (uVar11 != 0);
      if (uVar1 == uVar8) goto code_r0x007105e0;
    }
    do {
      puVar9 = puVar9 + -1;
      puVar13 = puVar13 + -1;
      *puVar13 = *puVar9;
    } while (puVar9 != puVar12);
  }
code_r0x007105e0:
  *(undefined8 **)(unaff_x19 + 0x2b0) = puVar13;
  *(undefined8 **)(unaff_x19 + 0x2b8) = puVar5;
  *(long *)(unaff_x19 + 0x2c0) = lVar2 + 0x80;
  if (puVar12 != (undefined8 *)0x0) {
    __ZdlPv(puVar12);
  }
code_r0x007105f8:
  lVar2 = *(long *)(unaff_x19 + 0x298);
  if ((ulong)((*(long *)(unaff_x19 + 0x2a8) - lVar2 >> 3) * -0x3333333333333333) < 0x10) {
    lVar15 = *(long *)(unaff_x19 + 0x2a0);
    lVar3 = __Znwm(0x280);
    lVar4 = lVar3 + ((lVar15 - lVar2) / 0x28) * 0x28;
    lVar7 = lVar4;
    if (lVar15 - lVar2 != 0) {
      lVar6 = lVar4;
      do {
        uVar18 = *(undefined8 *)(lVar15 + -0x20);
        uVar16 = *(undefined8 *)(lVar15 + -0x28);
        uVar19 = *(undefined8 *)(lVar15 + -0x10);
        uVar17 = *(undefined8 *)(lVar15 + -0x18);
        puVar12 = (undefined8 *)(lVar15 + -8);
        lVar15 = lVar15 + -0x28;
        lVar7 = lVar6 + -0x28;
        *(undefined8 *)(lVar6 + -8) = *puVar12;
        *(undefined8 *)(lVar6 + -0x10) = uVar19;
        *(undefined8 *)(lVar6 + -0x18) = uVar17;
        *(undefined8 *)(lVar6 + -0x20) = uVar18;
        *(undefined8 *)(lVar6 + -0x28) = uVar16;
        lVar6 = lVar7;
      } while (lVar15 != lVar2);
    }
    *(long *)(unaff_x19 + 0x298) = lVar7;
    *(long *)(unaff_x19 + 0x2a0) = lVar4;
    *(long *)(unaff_x19 + 0x2a8) = lVar3 + 0x280;
    if (lVar2 != 0) {
      __ZdlPv(lVar2);
    }
  }
  if (*(char *)(unaff_x22 + 0x50) != '\0') {
    if (in_stack_00000018 != (long *)(unaff_x22 + 8)) {
      uVar18 = *(undefined8 *)(unaff_x22 + 0x20);
      uVar16 = *(undefined8 *)(unaff_x22 + 0x18);
      if (*(long *)(unaff_x22 + 0x10) == 0) {
        lVar2 = 0;
        lVar7 = 0;
        lVar3 = *in_stack_00000018;
      }
      else {
        lVar7 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar2 = *(long *)(unaff_x22 + 0x10);
        if (lVar2 != 0) {
          lVar3 = 0;
          lVar15 = *(long *)(unaff_x22 + 8);
          lVar4 = lVar2;
          do {
            puVar12 = (undefined8 *)(lVar15 + lVar3);
            uVar17 = *puVar12;
            ((undefined8 *)(lVar7 + lVar3))[1] = puVar12[1];
            *(undefined8 *)(lVar7 + lVar3) = uVar17;
            lVar3 = lVar3 + 0x10;
            lVar4 = lVar4 + -1;
          } while (lVar4 != 0);
        }
        lVar3 = *in_stack_00000018;
      }
      if (lVar3 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar7;
      *(long *)(unaff_x19 + 0x170) = lVar2;
      *(undefined8 *)(unaff_x28 + 0x44) = uVar18;
      *(undefined8 *)(unaff_x28 + 0x3c) = uVar16;
    }
    if (unaff_x20 != unaff_x22 + 0x30) {
      func_0x006d0234();
    }
  }
  return;
}

