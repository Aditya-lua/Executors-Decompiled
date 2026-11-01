
void FUN_006b22fc(undefined8 param_1,long param_2)

{
  undefined4 *puVar1;
  bool in_CY;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined4 uVar5;
  undefined4 *in_x9;
  undefined4 *puVar6;
  ulong in_x10;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar13;
  undefined4 *puVar14;
  undefined4 *unaff_x21;
  undefined4 *puVar15;
  undefined8 unaff_x22;
  long unaff_x23;
  long lVar16;
  long unaff_x24;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined1 auVar24 [12];
  
  if (in_CY) {
    uVar7 = (in_x10 >> 2) + 1;
    uVar8 = uVar7 & 0x7ffffffffffffff0;
    unaff_x21 = (undefined4 *)(unaff_x23 + uVar8 * -4);
    in_x9 = in_x9 + -uVar8;
    puVar10 = (undefined8 *)(unaff_x23 + -0x20);
    puVar11 = (undefined8 *)(param_2 + unaff_x24 * 4 + -0x20);
    uVar12 = uVar8;
    do {
      uVar19 = *puVar10;
      uVar18 = puVar10[3];
      uVar17 = puVar10[2];
      uVar23 = puVar10[-3];
      uVar22 = puVar10[-4];
      uVar21 = puVar10[-1];
      uVar20 = puVar10[-2];
      puVar11[1] = puVar10[1];
      *puVar11 = uVar19;
      puVar11[3] = uVar18;
      puVar11[2] = uVar17;
      puVar11[-3] = uVar23;
      puVar11[-4] = uVar22;
      puVar11[-1] = uVar21;
      puVar11[-2] = uVar20;
      puVar10 = puVar10 + -8;
      puVar11 = puVar11 + -8;
      uVar12 = uVar12 - 0x10;
    } while (uVar12 != 0);
    if (uVar7 != uVar8) goto LAB_006b2350;
  }
  else {
LAB_006b2350:
    do {
      unaff_x21 = unaff_x21 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *unaff_x21;
    } while (unaff_x21 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x28) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x30) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x38) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x30) = unaff_x22;
  puVar1 = *(undefined4 **)(unaff_x19 + 0x48);
  if (puVar1 < *(undefined4 **)(unaff_x19 + 0x50)) {
    puVar14 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(unaff_x19 + 0x1b8);
    goto LAB_006b249c;
  }
  puVar13 = *(undefined4 **)(unaff_x19 + 0x40);
  lVar16 = (long)puVar1 - (long)puVar13 >> 2;
  uVar7 = lVar16 + 1;
  if (uVar7 >> 0x3e == 0) {
    uVar8 = (long)*(undefined4 **)(unaff_x19 + 0x50) - (long)puVar13;
    uVar12 = (long)uVar8 >> 1;
    if (uVar12 <= uVar7) {
      uVar12 = uVar7;
    }
    if (0x7ffffffffffffffb < uVar8) {
      uVar12 = 0x3fffffffffffffff;
    }
    if (uVar12 == 0) {
      lVar2 = 0;
    }
    else {
      if (uVar12 >> 0x3e != 0) {
        func_0x00017514();
        func_0x00017f90();
        goto code_r0x006b24c0;
      }
      lVar2 = __Znwm(uVar12 << 2);
    }
    puVar6 = (undefined4 *)(lVar2 + lVar16 * 4);
    puVar14 = puVar6 + 1;
    *puVar6 = *(undefined4 *)(unaff_x19 + 0x1b8);
    if ((long)puVar1 - (long)puVar13 != 0) {
      uVar7 = ((long)puVar1 - (long)puVar13) - 4;
      puVar15 = puVar1;
      if ((0x3b < uVar7) &&
         (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar13) - lVar2)))) {
        uVar7 = (uVar7 >> 2) + 1;
        uVar9 = uVar7 & 0x7ffffffffffffff0;
        puVar15 = puVar1 + -uVar9;
        puVar6 = puVar6 + -uVar9;
        puVar10 = (undefined8 *)(puVar1 + -8);
        puVar11 = (undefined8 *)(lVar2 + lVar16 * 4 + -0x20);
        uVar8 = uVar9;
        do {
          uVar19 = *puVar10;
          uVar18 = puVar10[3];
          uVar17 = puVar10[2];
          uVar23 = puVar10[-3];
          uVar22 = puVar10[-4];
          uVar21 = puVar10[-1];
          uVar20 = puVar10[-2];
          puVar11[1] = puVar10[1];
          *puVar11 = uVar19;
          puVar11[3] = uVar18;
          puVar11[2] = uVar17;
          puVar11[-3] = uVar23;
          puVar11[-4] = uVar22;
          puVar11[-1] = uVar21;
          puVar11[-2] = uVar20;
          puVar10 = puVar10 + -8;
          puVar11 = puVar11 + -8;
          uVar8 = uVar8 - 0x10;
        } while (uVar8 != 0);
        if (uVar7 == uVar9) goto LAB_006b2488;
      }
      do {
        puVar15 = puVar15 + -1;
        puVar6 = puVar6 + -1;
        *puVar6 = *puVar15;
      } while (puVar15 != puVar13);
    }
LAB_006b2488:
    *(undefined4 **)(unaff_x19 + 0x40) = puVar6;
    *(undefined4 **)(unaff_x19 + 0x48) = puVar14;
    *(ulong *)(unaff_x19 + 0x50) = lVar2 + uVar12 * 4;
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
    uVar7 = lVar2 + 1;
    if (uVar7 >> 0x3e == 0) {
      uVar8 = (long)*(undefined4 **)(lVar16 + 0x38) - (long)puVar14;
      uVar12 = (long)uVar8 >> 1;
      if (uVar12 <= uVar7) {
        uVar12 = uVar7;
      }
      if (0x7ffffffffffffffb < uVar8) {
        uVar12 = 0x3fffffffffffffff;
      }
      if (uVar12 == 0) {
        lVar3 = 0;
        puVar13 = (undefined4 *)(lVar2 * 4);
        lVar4 = 0;
        *puVar13 = uVar5;
joined_r0x006b2584:
        puVar6 = puVar13 + 1;
        if ((long)puVar1 - (long)puVar14 != 0) {
          uVar7 = ((long)puVar1 - (long)puVar14) - 4;
          puVar15 = puVar1;
          if ((0x3b < uVar7) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar14) - lVar3)))) {
            uVar7 = (uVar7 >> 2) + 1;
            uVar8 = uVar7 & 0x7ffffffffffffff0;
            puVar15 = puVar1 + -uVar8;
            puVar13 = puVar13 + -uVar8;
            puVar10 = (undefined8 *)(puVar1 + -8);
            puVar11 = (undefined8 *)(lVar3 + lVar2 * 4 + -0x20);
            uVar12 = uVar8;
            do {
              uVar19 = *puVar10;
              uVar18 = puVar10[3];
              uVar17 = puVar10[2];
              uVar23 = puVar10[-3];
              uVar22 = puVar10[-4];
              uVar21 = puVar10[-1];
              uVar20 = puVar10[-2];
              puVar11[1] = puVar10[1];
              *puVar11 = uVar19;
              puVar11[3] = uVar18;
              puVar11[2] = uVar17;
              puVar11[-3] = uVar23;
              puVar11[-4] = uVar22;
              puVar11[-1] = uVar21;
              puVar11[-2] = uVar20;
              puVar10 = puVar10 + -8;
              puVar11 = puVar11 + -8;
              uVar12 = uVar12 - 0x10;
            } while (uVar12 != 0);
            if (uVar7 == uVar8) goto LAB_006b2604;
          }
          do {
            puVar15 = puVar15 + -1;
            puVar13 = puVar13 + -1;
            *puVar13 = *puVar15;
          } while (puVar15 != puVar14);
        }
LAB_006b2604:
        *(undefined4 **)(lVar16 + 0x28) = puVar13;
        *(undefined4 **)(lVar16 + 0x30) = puVar6;
        *(long *)(lVar16 + 0x38) = lVar4;
        if (puVar14 != (undefined4 *)0x0) {
          __ZdlPv(puVar14);
        }
        goto LAB_006b2618;
      }
      if (uVar12 >> 0x3e == 0) {
        lVar3 = __Znwm(uVar12 << 2);
        puVar13 = (undefined4 *)(lVar3 + lVar2 * 4);
        lVar4 = lVar3 + uVar12 * 4;
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
  puVar6 = puVar1 + 1;
  *puVar1 = uVar5;
LAB_006b2618:
  *(undefined4 **)(lVar16 + 0x30) = puVar6;
  puVar1 = *(undefined4 **)(lVar16 + 0x48);
  if (puVar1 < *(undefined4 **)(lVar16 + 0x50)) {
    puVar14 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(lVar16 + 0x1b8);
    goto LAB_006b2740;
  }
  puVar13 = *(undefined4 **)(lVar16 + 0x40);
  lVar2 = (long)puVar1 - (long)puVar13 >> 2;
  uVar7 = lVar2 + 1;
  if (uVar7 >> 0x3e != 0) goto LAB_006b2764;
  uVar8 = (long)*(undefined4 **)(lVar16 + 0x50) - (long)puVar13;
  uVar12 = (long)uVar8 >> 1;
  if (uVar12 <= uVar7) {
    uVar12 = uVar7;
  }
  if (0x7ffffffffffffffb < uVar8) {
    uVar12 = 0x3fffffffffffffff;
  }
  if (uVar12 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar12 >> 0x3e != 0) goto LAB_006b275c;
    lVar4 = __Znwm(uVar12 << 2);
  }
  puVar6 = (undefined4 *)(lVar4 + lVar2 * 4);
  puVar14 = puVar6 + 1;
  *puVar6 = *(undefined4 *)(lVar16 + 0x1b8);
  if ((long)puVar1 - (long)puVar13 != 0) {
    uVar7 = ((long)puVar1 - (long)puVar13) - 4;
    puVar15 = puVar1;
    if ((0x3b < uVar7) && (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar13) - lVar4)))
       ) {
      uVar7 = (uVar7 >> 2) + 1;
      uVar9 = uVar7 & 0x7ffffffffffffff0;
      puVar15 = puVar1 + -uVar9;
      puVar6 = puVar6 + -uVar9;
      puVar10 = (undefined8 *)(puVar1 + -8);
      puVar11 = (undefined8 *)(lVar4 + lVar2 * 4 + -0x20);
      uVar8 = uVar9;
      do {
        uVar19 = *puVar10;
        uVar18 = puVar10[3];
        uVar17 = puVar10[2];
        uVar23 = puVar10[-3];
        uVar22 = puVar10[-4];
        uVar21 = puVar10[-1];
        uVar20 = puVar10[-2];
        puVar11[1] = puVar10[1];
        *puVar11 = uVar19;
        puVar11[3] = uVar18;
        puVar11[2] = uVar17;
        puVar11[-3] = uVar23;
        puVar11[-4] = uVar22;
        puVar11[-1] = uVar21;
        puVar11[-2] = uVar20;
        puVar10 = puVar10 + -8;
        puVar11 = puVar11 + -8;
        uVar8 = uVar8 - 0x10;
      } while (uVar8 != 0);
      if (uVar7 == uVar9) goto code_r0x006b272c;
    }
    do {
      puVar15 = puVar15 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *puVar15;
    } while (puVar15 != puVar13);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar16 + 0x40) = puVar6;
  *(undefined4 **)(lVar16 + 0x48) = puVar14;
  *(ulong *)(lVar16 + 0x50) = lVar4 + uVar12 * 4;
  if (puVar13 != (undefined4 *)0x0) {
    __ZdlPv(puVar13);
  }
LAB_006b2740:
  *(undefined4 **)(lVar16 + 0x48) = puVar14;
  return;
}

