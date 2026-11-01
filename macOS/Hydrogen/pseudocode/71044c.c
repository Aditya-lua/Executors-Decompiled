
void FUN_0071044c(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar13;
  undefined8 *unaff_x24;
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
  
  lVar2 = __Znwm();
  uVar12 = (long)unaff_x24 - (long)unaff_x23;
  puVar13 = (undefined8 *)(lVar2 + (uVar12 & 0xfffffffffffffff8));
  puVar5 = puVar13;
  if (uVar12 != 0) {
    puVar6 = unaff_x24;
    if ((0x57 < uVar12 - 8) && (0x3f < (long)unaff_x24 + (-(uVar12 & 0xfffffffffffffff8) - lVar2)))
    {
      uVar1 = (uVar12 - 8 >> 3) + 1;
      uVar9 = uVar1 & 0x3ffffffffffffff8;
      puVar6 = unaff_x24 + -uVar9;
      puVar5 = puVar13 + -uVar9;
      puVar14 = unaff_x24 + -4;
      puVar10 = (undefined8 *)(lVar2 + ((long)uVar12 >> 3) * 8 + -0x20);
      uVar12 = uVar9;
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
        uVar12 = uVar12 - 8;
      } while (uVar12 != 0);
      if (uVar1 == uVar9) goto LAB_007104fc;
    }
    do {
      puVar6 = puVar6 + -1;
      puVar5 = puVar5 + -1;
      *puVar5 = *puVar6;
    } while (puVar6 != unaff_x23);
  }
LAB_007104fc:
  *(undefined8 **)(unaff_x19 + 0x238) = puVar5;
  *(undefined8 **)(unaff_x19 + 0x240) = puVar13;
  *(long *)(unaff_x19 + 0x248) = lVar2 + 0x80;
  if (unaff_x23 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  puVar13 = *(undefined8 **)(unaff_x19 + 0x2b0);
  if (0x7f < (ulong)(*(long *)(unaff_x19 + 0x2c0) - (long)puVar13)) goto code_r0x007105f8;
  puVar14 = *(undefined8 **)(unaff_x19 + 0x2b8);
  lVar2 = __Znwm(0x80);
  uVar12 = (long)puVar14 - (long)puVar13;
  puVar5 = (undefined8 *)(lVar2 + (uVar12 & 0xfffffffffffffff8));
  puVar6 = puVar5;
  if (uVar12 != 0) {
    puVar10 = puVar14;
    if ((0x57 < uVar12 - 8) && (0x3f < (long)puVar14 + (-(uVar12 & 0xfffffffffffffff8) - lVar2))) {
      uVar1 = (uVar12 - 8 >> 3) + 1;
      uVar9 = uVar1 & 0x3ffffffffffffff8;
      puVar10 = puVar14 + -uVar9;
      puVar6 = puVar5 + -uVar9;
      puVar14 = puVar14 + -4;
      puVar11 = (undefined8 *)(lVar2 + ((long)uVar12 >> 3) * 8 + -0x20);
      uVar12 = uVar9;
      do {
        uVar17 = *puVar14;
        uVar18 = puVar14[3];
        uVar16 = puVar14[2];
        uVar22 = puVar14[-3];
        uVar21 = puVar14[-4];
        uVar20 = puVar14[-1];
        uVar19 = puVar14[-2];
        puVar11[1] = puVar14[1];
        *puVar11 = uVar17;
        puVar11[3] = uVar18;
        puVar11[2] = uVar16;
        puVar11[-3] = uVar22;
        puVar11[-4] = uVar21;
        puVar11[-1] = uVar20;
        puVar11[-2] = uVar19;
        puVar14 = puVar14 + -8;
        puVar11 = puVar11 + -8;
        uVar12 = uVar12 - 8;
      } while (uVar12 != 0);
      if (uVar1 == uVar9) goto code_r0x007105e0;
    }
    do {
      puVar10 = puVar10 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *puVar10;
    } while (puVar10 != puVar13);
  }
code_r0x007105e0:
  *(undefined8 **)(unaff_x19 + 0x2b0) = puVar6;
  *(undefined8 **)(unaff_x19 + 0x2b8) = puVar5;
  *(long *)(unaff_x19 + 0x2c0) = lVar2 + 0x80;
  if (puVar13 != (undefined8 *)0x0) {
    __ZdlPv(puVar13);
  }
code_r0x007105f8:
  lVar2 = *(long *)(unaff_x19 + 0x298);
  if ((ulong)((*(long *)(unaff_x19 + 0x2a8) - lVar2 >> 3) * -0x3333333333333333) < 0x10) {
    lVar15 = *(long *)(unaff_x19 + 0x2a0);
    lVar3 = __Znwm(0x280);
    lVar4 = lVar3 + ((lVar15 - lVar2) / 0x28) * 0x28;
    lVar8 = lVar4;
    if (lVar15 - lVar2 != 0) {
      lVar7 = lVar4;
      do {
        uVar18 = *(undefined8 *)(lVar15 + -0x20);
        uVar16 = *(undefined8 *)(lVar15 + -0x28);
        uVar19 = *(undefined8 *)(lVar15 + -0x10);
        uVar17 = *(undefined8 *)(lVar15 + -0x18);
        puVar13 = (undefined8 *)(lVar15 + -8);
        lVar15 = lVar15 + -0x28;
        lVar8 = lVar7 + -0x28;
        *(undefined8 *)(lVar7 + -8) = *puVar13;
        *(undefined8 *)(lVar7 + -0x10) = uVar19;
        *(undefined8 *)(lVar7 + -0x18) = uVar17;
        *(undefined8 *)(lVar7 + -0x20) = uVar18;
        *(undefined8 *)(lVar7 + -0x28) = uVar16;
        lVar7 = lVar8;
      } while (lVar15 != lVar2);
    }
    *(long *)(unaff_x19 + 0x298) = lVar8;
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
        lVar8 = 0;
        lVar3 = *in_stack_00000018;
      }
      else {
        lVar8 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar2 = *(long *)(unaff_x22 + 0x10);
        if (lVar2 != 0) {
          lVar3 = 0;
          lVar15 = *(long *)(unaff_x22 + 8);
          lVar4 = lVar2;
          do {
            puVar13 = (undefined8 *)(lVar15 + lVar3);
            uVar17 = *puVar13;
            ((undefined8 *)(lVar8 + lVar3))[1] = puVar13[1];
            *(undefined8 *)(lVar8 + lVar3) = uVar17;
            lVar3 = lVar3 + 0x10;
            lVar4 = lVar4 + -1;
          } while (lVar4 != 0);
        }
        lVar3 = *in_stack_00000018;
      }
      if (lVar3 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar8;
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

