
void FUN_006b2250(void)

{
  undefined4 *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined4 uVar5;
  ulong uVar6;
  undefined4 *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long unaff_x19;
  undefined4 *puVar13;
  undefined4 *puVar14;
  undefined4 *unaff_x21;
  undefined4 *puVar15;
  long lVar16;
  undefined4 unaff_w25;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined1 auVar24 [12];
  
  *unaff_x21 = unaff_w25;
  *(undefined4 **)(unaff_x19 + 0x30) = unaff_x21 + 1;
  puVar1 = *(undefined4 **)(unaff_x19 + 0x48);
  if (puVar1 < *(undefined4 **)(unaff_x19 + 0x50)) {
    puVar14 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(unaff_x19 + 0x1b8);
    goto LAB_006b249c;
  }
  puVar13 = *(undefined4 **)(unaff_x19 + 0x40);
  lVar16 = (long)puVar1 - (long)puVar13 >> 2;
  uVar8 = lVar16 + 1;
  if (uVar8 >> 0x3e == 0) {
    uVar6 = (long)*(undefined4 **)(unaff_x19 + 0x50) - (long)puVar13;
    uVar9 = (long)uVar6 >> 1;
    if (uVar9 <= uVar8) {
      uVar9 = uVar8;
    }
    if (0x7ffffffffffffffb < uVar6) {
      uVar9 = 0x3fffffffffffffff;
    }
    if (uVar9 == 0) {
      lVar2 = 0;
    }
    else {
      if (uVar9 >> 0x3e != 0) {
        func_0x00017514();
        func_0x00017f90();
        goto code_r0x006b24c0;
      }
      lVar2 = __Znwm(uVar9 << 2);
    }
    puVar7 = (undefined4 *)(lVar2 + lVar16 * 4);
    puVar14 = puVar7 + 1;
    *puVar7 = *(undefined4 *)(unaff_x19 + 0x1b8);
    if ((long)puVar1 - (long)puVar13 != 0) {
      uVar8 = ((long)puVar1 - (long)puVar13) - 4;
      puVar15 = puVar1;
      if ((0x3b < uVar8) &&
         (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar13) - lVar2)))) {
        uVar8 = (uVar8 >> 2) + 1;
        uVar10 = uVar8 & 0x7ffffffffffffff0;
        puVar15 = puVar1 + -uVar10;
        puVar7 = puVar7 + -uVar10;
        puVar11 = (undefined8 *)(puVar1 + -8);
        puVar12 = (undefined8 *)(lVar2 + lVar16 * 4 + -0x20);
        uVar6 = uVar10;
        do {
          uVar19 = *puVar11;
          uVar18 = puVar11[3];
          uVar17 = puVar11[2];
          uVar23 = puVar11[-3];
          uVar22 = puVar11[-4];
          uVar21 = puVar11[-1];
          uVar20 = puVar11[-2];
          puVar12[1] = puVar11[1];
          *puVar12 = uVar19;
          puVar12[3] = uVar18;
          puVar12[2] = uVar17;
          puVar12[-3] = uVar23;
          puVar12[-4] = uVar22;
          puVar12[-1] = uVar21;
          puVar12[-2] = uVar20;
          puVar11 = puVar11 + -8;
          puVar12 = puVar12 + -8;
          uVar6 = uVar6 - 0x10;
        } while (uVar6 != 0);
        if (uVar8 == uVar10) goto LAB_006b2488;
      }
      do {
        puVar15 = puVar15 + -1;
        puVar7 = puVar7 + -1;
        *puVar7 = *puVar15;
      } while (puVar15 != puVar13);
    }
LAB_006b2488:
    *(undefined4 **)(unaff_x19 + 0x40) = puVar7;
    *(undefined4 **)(unaff_x19 + 0x48) = puVar14;
    *(ulong *)(unaff_x19 + 0x50) = lVar2 + uVar9 * 4;
    if (puVar13 != (undefined4 *)0x0) {
      __ZdlPv(puVar13);
    }
LAB_006b249c:
    *(undefined4 **)(unaff_x19 + 0x48) = puVar14;
    return;
  }
code_r0x006b24c0:
  auVar24 = func_0x00017f90();
  uVar5 = auVar24._8_4_;
  lVar16 = auVar24._0_8_;
  puVar1 = *(undefined4 **)(lVar16 + 0x30);
  if (*(undefined4 **)(lVar16 + 0x38) <= puVar1) {
    puVar14 = *(undefined4 **)(lVar16 + 0x28);
    lVar2 = (long)puVar1 - (long)puVar14 >> 2;
    uVar8 = lVar2 + 1;
    if (uVar8 >> 0x3e == 0) {
      uVar6 = (long)*(undefined4 **)(lVar16 + 0x38) - (long)puVar14;
      uVar9 = (long)uVar6 >> 1;
      if (uVar9 <= uVar8) {
        uVar9 = uVar8;
      }
      if (0x7ffffffffffffffb < uVar6) {
        uVar9 = 0x3fffffffffffffff;
      }
      if (uVar9 == 0) {
        lVar3 = 0;
        puVar13 = (undefined4 *)(lVar2 * 4);
        lVar4 = 0;
        *puVar13 = uVar5;
joined_r0x006b2584:
        puVar7 = puVar13 + 1;
        if ((long)puVar1 - (long)puVar14 != 0) {
          uVar8 = ((long)puVar1 - (long)puVar14) - 4;
          puVar15 = puVar1;
          if ((0x3b < uVar8) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar14) - lVar3)))) {
            uVar8 = (uVar8 >> 2) + 1;
            uVar6 = uVar8 & 0x7ffffffffffffff0;
            puVar15 = puVar1 + -uVar6;
            puVar13 = puVar13 + -uVar6;
            puVar11 = (undefined8 *)(puVar1 + -8);
            puVar12 = (undefined8 *)(lVar3 + lVar2 * 4 + -0x20);
            uVar9 = uVar6;
            do {
              uVar19 = *puVar11;
              uVar18 = puVar11[3];
              uVar17 = puVar11[2];
              uVar23 = puVar11[-3];
              uVar22 = puVar11[-4];
              uVar21 = puVar11[-1];
              uVar20 = puVar11[-2];
              puVar12[1] = puVar11[1];
              *puVar12 = uVar19;
              puVar12[3] = uVar18;
              puVar12[2] = uVar17;
              puVar12[-3] = uVar23;
              puVar12[-4] = uVar22;
              puVar12[-1] = uVar21;
              puVar12[-2] = uVar20;
              puVar11 = puVar11 + -8;
              puVar12 = puVar12 + -8;
              uVar9 = uVar9 - 0x10;
            } while (uVar9 != 0);
            if (uVar8 == uVar6) goto LAB_006b2604;
          }
          do {
            puVar15 = puVar15 + -1;
            puVar13 = puVar13 + -1;
            *puVar13 = *puVar15;
          } while (puVar15 != puVar14);
        }
LAB_006b2604:
        *(undefined4 **)(lVar16 + 0x28) = puVar13;
        *(undefined4 **)(lVar16 + 0x30) = puVar7;
        *(long *)(lVar16 + 0x38) = lVar4;
        if (puVar14 != (undefined4 *)0x0) {
          __ZdlPv(puVar14);
        }
        goto LAB_006b2618;
      }
      if (uVar9 >> 0x3e == 0) {
        lVar3 = __Znwm(uVar9 << 2);
        puVar13 = (undefined4 *)(lVar3 + lVar2 * 4);
        lVar4 = lVar3 + uVar9 * 4;
        *puVar13 = uVar5;
        goto joined_r0x006b2584;
      }
LAB_006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
LAB_006b2764:
    lVar16 = func_0x00017f90();
    *(long *)(lVar16 + 0x30) = *(long *)(lVar16 + 0x30) + -4;
    *(long *)(lVar16 + 0x48) = *(long *)(lVar16 + 0x48) + -4;
    return;
  }
  puVar7 = puVar1 + 1;
  *puVar1 = uVar5;
LAB_006b2618:
  *(undefined4 **)(lVar16 + 0x30) = puVar7;
  puVar1 = *(undefined4 **)(lVar16 + 0x48);
  if (puVar1 < *(undefined4 **)(lVar16 + 0x50)) {
    puVar14 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(lVar16 + 0x1b8);
    goto LAB_006b2740;
  }
  puVar13 = *(undefined4 **)(lVar16 + 0x40);
  lVar2 = (long)puVar1 - (long)puVar13 >> 2;
  uVar8 = lVar2 + 1;
  if (uVar8 >> 0x3e != 0) goto LAB_006b2764;
  uVar6 = (long)*(undefined4 **)(lVar16 + 0x50) - (long)puVar13;
  uVar9 = (long)uVar6 >> 1;
  if (uVar9 <= uVar8) {
    uVar9 = uVar8;
  }
  if (0x7ffffffffffffffb < uVar6) {
    uVar9 = 0x3fffffffffffffff;
  }
  if (uVar9 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar9 >> 0x3e != 0) goto LAB_006b275c;
    lVar4 = __Znwm(uVar9 << 2);
  }
  puVar7 = (undefined4 *)(lVar4 + lVar2 * 4);
  puVar14 = puVar7 + 1;
  *puVar7 = *(undefined4 *)(lVar16 + 0x1b8);
  if ((long)puVar1 - (long)puVar13 != 0) {
    uVar8 = ((long)puVar1 - (long)puVar13) - 4;
    puVar15 = puVar1;
    if ((0x3b < uVar8) && (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar13) - lVar4)))
       ) {
      uVar8 = (uVar8 >> 2) + 1;
      uVar10 = uVar8 & 0x7ffffffffffffff0;
      puVar15 = puVar1 + -uVar10;
      puVar7 = puVar7 + -uVar10;
      puVar11 = (undefined8 *)(puVar1 + -8);
      puVar12 = (undefined8 *)(lVar4 + lVar2 * 4 + -0x20);
      uVar6 = uVar10;
      do {
        uVar19 = *puVar11;
        uVar18 = puVar11[3];
        uVar17 = puVar11[2];
        uVar23 = puVar11[-3];
        uVar22 = puVar11[-4];
        uVar21 = puVar11[-1];
        uVar20 = puVar11[-2];
        puVar12[1] = puVar11[1];
        *puVar12 = uVar19;
        puVar12[3] = uVar18;
        puVar12[2] = uVar17;
        puVar12[-3] = uVar23;
        puVar12[-4] = uVar22;
        puVar12[-1] = uVar21;
        puVar12[-2] = uVar20;
        puVar11 = puVar11 + -8;
        puVar12 = puVar12 + -8;
        uVar6 = uVar6 - 0x10;
      } while (uVar6 != 0);
      if (uVar8 == uVar10) goto code_r0x006b272c;
    }
    do {
      puVar15 = puVar15 + -1;
      puVar7 = puVar7 + -1;
      *puVar7 = *puVar15;
    } while (puVar15 != puVar13);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar16 + 0x40) = puVar7;
  *(undefined4 **)(lVar16 + 0x48) = puVar14;
  *(ulong *)(lVar16 + 0x50) = lVar4 + uVar9 * 4;
  if (puVar13 != (undefined4 *)0x0) {
    __ZdlPv(puVar13);
  }
LAB_006b2740:
  *(undefined4 **)(lVar16 + 0x48) = puVar14;
  return;
}

