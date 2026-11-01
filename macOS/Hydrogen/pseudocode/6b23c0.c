
void FUN_006b23c0(ulong param_1)

{
  bool in_ZR;
  bool in_CY;
  long lVar1;
  long lVar2;
  long lVar3;
  undefined4 uVar4;
  ulong in_x9;
  undefined4 *puVar5;
  undefined4 *puVar6;
  ulong in_x10;
  ulong uVar7;
  ulong in_x11;
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
  
  if (!in_CY || in_ZR) {
    in_x11 = in_x9;
  }
  if (in_x10 <= param_1) {
    in_x11 = 0x3fffffffffffffff;
  }
  if (in_x11 == 0) {
    lVar1 = 0;
  }
  else {
    if (in_x11 >> 0x3e != 0) {
      func_0x00017514();
      func_0x00017f90();
      auVar24 = func_0x00017f90();
      uVar4 = auVar24._8_4_;
      lVar1 = auVar24._0_8_;
      puVar5 = *(undefined4 **)(lVar1 + 0x30);
      if (*(undefined4 **)(lVar1 + 0x38) <= puVar5) {
        puVar13 = *(undefined4 **)(lVar1 + 0x28);
        lVar16 = (long)puVar5 - (long)puVar13 >> 2;
        uVar7 = lVar16 + 1;
        if (uVar7 >> 0x3e == 0) {
          uVar8 = (long)*(undefined4 **)(lVar1 + 0x38) - (long)puVar13;
          uVar12 = (long)uVar8 >> 1;
          if (uVar12 <= uVar7) {
            uVar12 = uVar7;
          }
          if (0x7ffffffffffffffb < uVar8) {
            uVar12 = 0x3fffffffffffffff;
          }
          if (uVar12 == 0) {
            lVar2 = 0;
            puVar14 = (undefined4 *)(lVar16 * 4);
            lVar3 = 0;
            *puVar14 = uVar4;
joined_r0x006b2584:
            puVar6 = puVar14 + 1;
            if ((long)puVar5 - (long)puVar13 != 0) {
              uVar7 = ((long)puVar5 - (long)puVar13) - 4;
              puVar15 = puVar5;
              if ((0x3b < uVar7) &&
                 (0x3f < (ulong)((long)puVar5 + (-((long)puVar5 - (long)puVar13) - lVar2)))) {
                uVar7 = (uVar7 >> 2) + 1;
                uVar8 = uVar7 & 0x7ffffffffffffff0;
                puVar15 = puVar5 + -uVar8;
                puVar14 = puVar14 + -uVar8;
                puVar10 = (undefined8 *)(puVar5 + -8);
                puVar11 = (undefined8 *)(lVar2 + lVar16 * 4 + -0x20);
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
                puVar14 = puVar14 + -1;
                *puVar14 = *puVar15;
              } while (puVar15 != puVar13);
            }
LAB_006b2604:
            *(undefined4 **)(lVar1 + 0x28) = puVar14;
            *(undefined4 **)(lVar1 + 0x30) = puVar6;
            *(long *)(lVar1 + 0x38) = lVar3;
            if (puVar13 != (undefined4 *)0x0) {
              __ZdlPv(puVar13);
            }
            goto LAB_006b2618;
          }
          if (uVar12 >> 0x3e == 0) {
            lVar2 = __Znwm(uVar12 << 2);
            puVar14 = (undefined4 *)(lVar2 + lVar16 * 4);
            lVar3 = lVar2 + uVar12 * 4;
            *puVar14 = uVar4;
            goto joined_r0x006b2584;
          }
LAB_006b275c:
          func_0x00017514();
        }
        func_0x00017f90();
LAB_006b2764:
        lVar1 = func_0x00017f90();
        *(long *)(lVar1 + 0x30) = *(long *)(lVar1 + 0x30) + -4;
        *(long *)(lVar1 + 0x48) = *(long *)(lVar1 + 0x48) + -4;
        return;
      }
      puVar6 = puVar5 + 1;
      *puVar5 = uVar4;
LAB_006b2618:
      *(undefined4 **)(lVar1 + 0x30) = puVar6;
      puVar5 = *(undefined4 **)(lVar1 + 0x48);
      if (puVar5 < *(undefined4 **)(lVar1 + 0x50)) {
        puVar13 = puVar5 + 1;
        *puVar5 = *(undefined4 *)(lVar1 + 0x1b8);
        goto LAB_006b2740;
      }
      puVar14 = *(undefined4 **)(lVar1 + 0x40);
      lVar16 = (long)puVar5 - (long)puVar14 >> 2;
      uVar7 = lVar16 + 1;
      if (uVar7 >> 0x3e != 0) goto LAB_006b2764;
      uVar8 = (long)*(undefined4 **)(lVar1 + 0x50) - (long)puVar14;
      uVar12 = (long)uVar8 >> 1;
      if (uVar12 <= uVar7) {
        uVar12 = uVar7;
      }
      if (0x7ffffffffffffffb < uVar8) {
        uVar12 = 0x3fffffffffffffff;
      }
      if (uVar12 == 0) {
        lVar3 = 0;
      }
      else {
        if (uVar12 >> 0x3e != 0) goto LAB_006b275c;
        lVar3 = __Znwm(uVar12 << 2);
      }
      puVar6 = (undefined4 *)(lVar3 + lVar16 * 4);
      puVar13 = puVar6 + 1;
      *puVar6 = *(undefined4 *)(lVar1 + 0x1b8);
      if ((long)puVar5 - (long)puVar14 != 0) {
        uVar7 = ((long)puVar5 - (long)puVar14) - 4;
        puVar15 = puVar5;
        if ((0x3b < uVar7) &&
           (0x3f < (ulong)((long)puVar5 + (-((long)puVar5 - (long)puVar14) - lVar3)))) {
          uVar7 = (uVar7 >> 2) + 1;
          uVar9 = uVar7 & 0x7ffffffffffffff0;
          puVar15 = puVar5 + -uVar9;
          puVar6 = puVar6 + -uVar9;
          puVar10 = (undefined8 *)(puVar5 + -8);
          puVar11 = (undefined8 *)(lVar3 + lVar16 * 4 + -0x20);
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
        } while (puVar15 != puVar14);
      }
code_r0x006b272c:
      *(undefined4 **)(lVar1 + 0x40) = puVar6;
      *(undefined4 **)(lVar1 + 0x48) = puVar13;
      *(ulong *)(lVar1 + 0x50) = lVar3 + uVar12 * 4;
      if (puVar14 != (undefined4 *)0x0) {
        __ZdlPv(puVar14);
      }
LAB_006b2740:
      *(undefined4 **)(lVar1 + 0x48) = puVar13;
      return;
    }
    lVar1 = __Znwm(in_x11 << 2);
  }
  puVar5 = (undefined4 *)(lVar1 + unaff_x23 * 4);
  puVar13 = puVar5 + 1;
  *puVar5 = *(undefined4 *)(unaff_x19 + 0x1b8);
  if ((long)unaff_x21 - (long)unaff_x20 != 0) {
    uVar7 = ((long)unaff_x21 - (long)unaff_x20) - 4;
    puVar14 = unaff_x21;
    if ((0x3b < uVar7) && (0x3f < (ulong)((long)unaff_x21 + (-unaff_x24 - lVar1)))) {
      uVar7 = (uVar7 >> 2) + 1;
      uVar8 = uVar7 & 0x7ffffffffffffff0;
      puVar14 = unaff_x21 + -uVar8;
      puVar5 = puVar5 + -uVar8;
      puVar10 = (undefined8 *)(unaff_x21 + -8);
      puVar11 = (undefined8 *)(lVar1 + unaff_x23 * 4 + -0x20);
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
      if (uVar7 == uVar8) goto LAB_006b2488;
    }
    do {
      puVar14 = puVar14 + -1;
      puVar5 = puVar5 + -1;
      *puVar5 = *puVar14;
    } while (puVar14 != unaff_x20);
  }
LAB_006b2488:
  *(undefined4 **)(unaff_x19 + 0x40) = puVar5;
  *(undefined4 **)(unaff_x19 + 0x48) = puVar13;
  *(ulong *)(unaff_x19 + 0x50) = lVar1 + in_x11 * 4;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined4 **)(unaff_x19 + 0x48) = puVar13;
  return;
}

