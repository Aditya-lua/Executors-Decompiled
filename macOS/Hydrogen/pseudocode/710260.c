
void FUN_00710260(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
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
  
  func_0x0070ba3c();
  func_0x00710d48();
  *(undefined1 *)(unaff_x19 + 0x110) = 0;
  puVar12 = *(undefined8 **)(unaff_x19 + 400);
  if ((ulong)(*(long *)(unaff_x19 + 0x1a0) - (long)puVar12) < 0x80) {
    puVar13 = *(undefined8 **)(unaff_x19 + 0x198);
    lVar3 = __Znwm(0x80);
    uVar11 = (long)puVar13 - (long)puVar12;
    puVar2 = (undefined8 *)(lVar3 + (uVar11 & 0xfffffffffffffff8));
    puVar6 = puVar2;
    if (uVar11 != 0) {
      puVar14 = puVar13;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar3)))
      {
        uVar1 = (uVar11 - 8 >> 3) + 1;
        uVar9 = uVar1 & 0x3ffffffffffffff8;
        puVar14 = puVar13 + -uVar9;
        puVar6 = puVar2 + -uVar9;
        puVar13 = puVar13 + -4;
        puVar10 = (undefined8 *)(lVar3 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar9;
        do {
          uVar17 = *puVar13;
          uVar18 = puVar13[3];
          uVar16 = puVar13[2];
          uVar22 = puVar13[-3];
          uVar21 = puVar13[-4];
          uVar20 = puVar13[-1];
          uVar19 = puVar13[-2];
          puVar10[1] = puVar13[1];
          *puVar10 = uVar17;
          puVar10[3] = uVar18;
          puVar10[2] = uVar16;
          puVar10[-3] = uVar22;
          puVar10[-4] = uVar21;
          puVar10[-1] = uVar20;
          puVar10[-2] = uVar19;
          puVar13 = puVar13 + -8;
          puVar10 = puVar10 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar1 == uVar9) goto LAB_0071033c;
      }
      do {
        puVar14 = puVar14 + -1;
        puVar6 = puVar6 + -1;
        *puVar6 = *puVar14;
      } while (puVar14 != puVar12);
    }
LAB_0071033c:
    *(undefined8 **)(unaff_x19 + 400) = puVar6;
    *(undefined8 **)(unaff_x19 + 0x198) = puVar2;
    *(long *)(unaff_x19 + 0x1a0) = lVar3 + 0x80;
    if (puVar12 != (undefined8 *)0x0) {
      __ZdlPv(puVar12);
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x1f0);
  if ((ulong)(*(long *)(unaff_x19 + 0x200) - (long)puVar12) < 0x80) {
    puVar13 = *(undefined8 **)(unaff_x19 + 0x1f8);
    lVar3 = __Znwm(0x80);
    uVar11 = (long)puVar13 - (long)puVar12;
    puVar2 = (undefined8 *)(lVar3 + (uVar11 & 0xfffffffffffffff8));
    puVar6 = puVar2;
    if (uVar11 != 0) {
      puVar14 = puVar13;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar3)))
      {
        uVar1 = (uVar11 - 8 >> 3) + 1;
        uVar9 = uVar1 & 0x3ffffffffffffff8;
        puVar14 = puVar13 + -uVar9;
        puVar6 = puVar2 + -uVar9;
        puVar13 = puVar13 + -4;
        puVar10 = (undefined8 *)(lVar3 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar9;
        do {
          uVar17 = *puVar13;
          uVar18 = puVar13[3];
          uVar16 = puVar13[2];
          uVar22 = puVar13[-3];
          uVar21 = puVar13[-4];
          uVar20 = puVar13[-1];
          uVar19 = puVar13[-2];
          puVar10[1] = puVar13[1];
          *puVar10 = uVar17;
          puVar10[3] = uVar18;
          puVar10[2] = uVar16;
          puVar10[-3] = uVar22;
          puVar10[-4] = uVar21;
          puVar10[-1] = uVar20;
          puVar10[-2] = uVar19;
          puVar13 = puVar13 + -8;
          puVar10 = puVar10 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar1 == uVar9) goto LAB_0071041c;
      }
      do {
        puVar14 = puVar14 + -1;
        puVar6 = puVar6 + -1;
        *puVar6 = *puVar14;
      } while (puVar14 != puVar12);
    }
LAB_0071041c:
    *(undefined8 **)(unaff_x19 + 0x1f0) = puVar6;
    *(undefined8 **)(unaff_x19 + 0x1f8) = puVar2;
    *(long *)(unaff_x19 + 0x200) = lVar3 + 0x80;
    if (puVar12 != (undefined8 *)0x0) {
      __ZdlPv(puVar12);
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x238);
  if ((ulong)(*(long *)(unaff_x19 + 0x248) - (long)puVar12) < 0x80) {
    puVar13 = *(undefined8 **)(unaff_x19 + 0x240);
    lVar3 = __Znwm(0x80);
    uVar11 = (long)puVar13 - (long)puVar12;
    puVar2 = (undefined8 *)(lVar3 + (uVar11 & 0xfffffffffffffff8));
    puVar6 = puVar2;
    if (uVar11 != 0) {
      puVar14 = puVar13;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar3)))
      {
        uVar1 = (uVar11 - 8 >> 3) + 1;
        uVar9 = uVar1 & 0x3ffffffffffffff8;
        puVar14 = puVar13 + -uVar9;
        puVar6 = puVar2 + -uVar9;
        puVar13 = puVar13 + -4;
        puVar10 = (undefined8 *)(lVar3 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar9;
        do {
          uVar17 = *puVar13;
          uVar18 = puVar13[3];
          uVar16 = puVar13[2];
          uVar22 = puVar13[-3];
          uVar21 = puVar13[-4];
          uVar20 = puVar13[-1];
          uVar19 = puVar13[-2];
          puVar10[1] = puVar13[1];
          *puVar10 = uVar17;
          puVar10[3] = uVar18;
          puVar10[2] = uVar16;
          puVar10[-3] = uVar22;
          puVar10[-4] = uVar21;
          puVar10[-1] = uVar20;
          puVar10[-2] = uVar19;
          puVar13 = puVar13 + -8;
          puVar10 = puVar10 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar1 == uVar9) goto LAB_007104fc;
      }
      do {
        puVar14 = puVar14 + -1;
        puVar6 = puVar6 + -1;
        *puVar6 = *puVar14;
      } while (puVar14 != puVar12);
    }
LAB_007104fc:
    *(undefined8 **)(unaff_x19 + 0x238) = puVar6;
    *(undefined8 **)(unaff_x19 + 0x240) = puVar2;
    *(long *)(unaff_x19 + 0x248) = lVar3 + 0x80;
    if (puVar12 != (undefined8 *)0x0) {
      __ZdlPv(puVar12);
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x2b0);
  if (0x7f < (ulong)(*(long *)(unaff_x19 + 0x2c0) - (long)puVar12)) goto code_r0x007105f8;
  puVar13 = *(undefined8 **)(unaff_x19 + 0x2b8);
  lVar3 = __Znwm(0x80);
  uVar11 = (long)puVar13 - (long)puVar12;
  puVar2 = (undefined8 *)(lVar3 + (uVar11 & 0xfffffffffffffff8));
  puVar6 = puVar2;
  if (uVar11 != 0) {
    puVar14 = puVar13;
    if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar3))) {
      uVar1 = (uVar11 - 8 >> 3) + 1;
      uVar9 = uVar1 & 0x3ffffffffffffff8;
      puVar14 = puVar13 + -uVar9;
      puVar6 = puVar2 + -uVar9;
      puVar13 = puVar13 + -4;
      puVar10 = (undefined8 *)(lVar3 + ((long)uVar11 >> 3) * 8 + -0x20);
      uVar11 = uVar9;
      do {
        uVar17 = *puVar13;
        uVar18 = puVar13[3];
        uVar16 = puVar13[2];
        uVar22 = puVar13[-3];
        uVar21 = puVar13[-4];
        uVar20 = puVar13[-1];
        uVar19 = puVar13[-2];
        puVar10[1] = puVar13[1];
        *puVar10 = uVar17;
        puVar10[3] = uVar18;
        puVar10[2] = uVar16;
        puVar10[-3] = uVar22;
        puVar10[-4] = uVar21;
        puVar10[-1] = uVar20;
        puVar10[-2] = uVar19;
        puVar13 = puVar13 + -8;
        puVar10 = puVar10 + -8;
        uVar11 = uVar11 - 8;
      } while (uVar11 != 0);
      if (uVar1 == uVar9) goto code_r0x007105e0;
    }
    do {
      puVar14 = puVar14 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *puVar14;
    } while (puVar14 != puVar12);
  }
code_r0x007105e0:
  *(undefined8 **)(unaff_x19 + 0x2b0) = puVar6;
  *(undefined8 **)(unaff_x19 + 0x2b8) = puVar2;
  *(long *)(unaff_x19 + 0x2c0) = lVar3 + 0x80;
  if (puVar12 != (undefined8 *)0x0) {
    __ZdlPv(puVar12);
  }
code_r0x007105f8:
  lVar3 = *(long *)(unaff_x19 + 0x298);
  if ((ulong)((*(long *)(unaff_x19 + 0x2a8) - lVar3 >> 3) * -0x3333333333333333) < 0x10) {
    lVar15 = *(long *)(unaff_x19 + 0x2a0);
    lVar4 = __Znwm(0x280);
    lVar5 = lVar4 + ((lVar15 - lVar3) / 0x28) * 0x28;
    lVar8 = lVar5;
    if (lVar15 - lVar3 != 0) {
      lVar7 = lVar5;
      do {
        uVar18 = *(undefined8 *)(lVar15 + -0x20);
        uVar16 = *(undefined8 *)(lVar15 + -0x28);
        uVar19 = *(undefined8 *)(lVar15 + -0x10);
        uVar17 = *(undefined8 *)(lVar15 + -0x18);
        puVar12 = (undefined8 *)(lVar15 + -8);
        lVar15 = lVar15 + -0x28;
        lVar8 = lVar7 + -0x28;
        *(undefined8 *)(lVar7 + -8) = *puVar12;
        *(undefined8 *)(lVar7 + -0x10) = uVar19;
        *(undefined8 *)(lVar7 + -0x18) = uVar17;
        *(undefined8 *)(lVar7 + -0x20) = uVar18;
        *(undefined8 *)(lVar7 + -0x28) = uVar16;
        lVar7 = lVar8;
      } while (lVar15 != lVar3);
    }
    *(long *)(unaff_x19 + 0x298) = lVar8;
    *(long *)(unaff_x19 + 0x2a0) = lVar5;
    *(long *)(unaff_x19 + 0x2a8) = lVar4 + 0x280;
    if (lVar3 != 0) {
      __ZdlPv(lVar3);
    }
  }
  if (*(char *)(unaff_x22 + 0x50) != '\0') {
    if (in_stack_00000018 != (long *)(unaff_x22 + 8)) {
      uVar18 = *(undefined8 *)(unaff_x22 + 0x20);
      uVar16 = *(undefined8 *)(unaff_x22 + 0x18);
      if (*(long *)(unaff_x22 + 0x10) == 0) {
        lVar3 = 0;
        lVar8 = 0;
        lVar4 = *in_stack_00000018;
      }
      else {
        lVar8 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar3 = *(long *)(unaff_x22 + 0x10);
        if (lVar3 != 0) {
          lVar4 = 0;
          lVar15 = *(long *)(unaff_x22 + 8);
          lVar5 = lVar3;
          do {
            puVar12 = (undefined8 *)(lVar15 + lVar4);
            uVar17 = *puVar12;
            ((undefined8 *)(lVar8 + lVar4))[1] = puVar12[1];
            *(undefined8 *)(lVar8 + lVar4) = uVar17;
            lVar4 = lVar4 + 0x10;
            lVar5 = lVar5 + -1;
          } while (lVar5 != 0);
        }
        lVar4 = *in_stack_00000018;
      }
      if (lVar4 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar8;
      *(long *)(unaff_x19 + 0x170) = lVar3;
      *(undefined8 *)(unaff_x28 + 0x44) = uVar18;
      *(undefined8 *)(unaff_x28 + 0x3c) = uVar16;
    }
    if (unaff_x20 != unaff_x22 + 0x30) {
      func_0x006d0234();
    }
  }
  return;
}

