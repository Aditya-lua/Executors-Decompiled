
ulong FUN_006b1b0c(ulong param_1,undefined8 param_2,undefined8 param_3,int param_4,int param_5,
                  int param_6)

{
  long lVar1;
  undefined4 *puVar2;
  uint uVar3;
  long lVar4;
  undefined4 uVar5;
  ulong uVar6;
  ulong uVar7;
  long in_x9;
  int *piVar8;
  uint *puVar9;
  undefined4 *puVar10;
  ulong in_x10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  uint *puVar15;
  int iVar16;
  int *piVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  ulong uVar20;
  long unaff_x19;
  int unaff_w20;
  undefined4 *puVar21;
  uint *puVar22;
  undefined4 *puVar23;
  ulong *unaff_x21;
  int *piVar24;
  uint *puVar25;
  undefined4 *puVar26;
  int *piVar27;
  uint *puVar28;
  short unaff_w23;
  int *piVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined1 auVar37 [12];
  
  iVar16 = *(int *)(in_x9 + param_1 * 8);
  if (iVar16 != *(int *)(unaff_x19 + 0x1b0)) {
    lVar14 = 1;
    do {
      if (iVar16 == unaff_w20) goto LAB_006b1b5c;
      param_1 = param_1 + lVar14 & in_x10;
      iVar16 = *(int *)(in_x9 + param_1 * 8);
      lVar14 = lVar14 + 1;
    } while (iVar16 != *(int *)(unaff_x19 + 0x1b0));
  }
  *(int *)(in_x9 + param_1 * 8) = unaff_w20;
  *(long *)(unaff_x19 + 0x1a8) = *(long *)(unaff_x19 + 0x1a8) + 1;
LAB_006b1b5c:
  *(short *)(in_x9 + param_1 * 8 + 4) = unaff_w23;
  piVar17 = *(int **)(unaff_x19 + 0x78);
  if (piVar17 < *(int **)(unaff_x19 + 0x80)) {
    piVar24 = piVar17 + 1;
    *piVar17 = unaff_w20;
    goto LAB_006b1ca0;
  }
  piVar27 = (int *)*unaff_x21;
  lVar14 = (long)piVar17 - (long)piVar27 >> 2;
  uVar11 = lVar14 + 1;
  if (uVar11 >> 0x3e == 0) {
    uVar6 = (long)*(int **)(unaff_x19 + 0x80) - (long)piVar27;
    uVar12 = (long)uVar6 >> 1;
    if (uVar12 <= uVar11) {
      uVar12 = uVar11;
    }
    if (0x7ffffffffffffffb < uVar6) {
      uVar12 = 0x3fffffffffffffff;
    }
    if (uVar12 == 0) {
      lVar4 = 0;
      piVar8 = (int *)(lVar14 * 4);
      lVar1 = 0;
      *piVar8 = unaff_w20;
    }
    else {
      if (uVar12 >> 0x3e != 0) goto LAB_006b1cc8;
      lVar4 = __Znwm(uVar12 << 2);
      piVar8 = (int *)(lVar4 + lVar14 * 4);
      lVar1 = lVar4 + uVar12 * 4;
      *piVar8 = unaff_w20;
    }
    piVar24 = piVar8 + 1;
    if ((long)piVar17 - (long)piVar27 != 0) {
      uVar11 = ((long)piVar17 - (long)piVar27) - 4;
      piVar29 = piVar17;
      if ((0x3b < uVar11) &&
         (0x3f < (ulong)((long)piVar17 + (-((long)piVar17 - (long)piVar27) - lVar4)))) {
        uVar11 = (uVar11 >> 2) + 1;
        uVar6 = uVar11 & 0x7ffffffffffffff0;
        piVar29 = piVar17 + -uVar6;
        piVar8 = piVar8 + -uVar6;
        piVar17 = piVar17 + -8;
        puVar18 = (undefined8 *)(lVar4 + lVar14 * 4 + -0x20);
        uVar12 = uVar6;
        do {
          uVar32 = *(undefined8 *)piVar17;
          uVar31 = *(undefined8 *)(piVar17 + 6);
          uVar30 = *(undefined8 *)(piVar17 + 4);
          uVar36 = *(undefined8 *)(piVar17 + -6);
          uVar35 = *(undefined8 *)(piVar17 + -8);
          uVar34 = *(undefined8 *)(piVar17 + -2);
          uVar33 = *(undefined8 *)(piVar17 + -4);
          puVar18[1] = *(undefined8 *)(piVar17 + 2);
          *puVar18 = uVar32;
          puVar18[3] = uVar31;
          puVar18[2] = uVar30;
          puVar18[-3] = uVar36;
          puVar18[-4] = uVar35;
          puVar18[-1] = uVar34;
          puVar18[-2] = uVar33;
          piVar17 = piVar17 + -0x10;
          puVar18 = puVar18 + -8;
          uVar12 = uVar12 - 0x10;
        } while (uVar12 != 0);
        if (uVar11 == uVar6) goto LAB_006b1c8c;
      }
      do {
        piVar29 = piVar29 + -1;
        piVar8 = piVar8 + -1;
        *piVar8 = *piVar29;
      } while (piVar29 != piVar27);
    }
LAB_006b1c8c:
    *(int **)(unaff_x19 + 0x70) = piVar8;
    *(int **)(unaff_x19 + 0x78) = piVar24;
    *(long *)(unaff_x19 + 0x80) = lVar1;
    if (piVar27 != (int *)0x0) {
      __ZdlPv(piVar27);
    }
LAB_006b1ca0:
    *(int **)(unaff_x19 + 0x78) = piVar24;
    return (ulong)(uint)(int)unaff_w23;
  }
  func_0x00017f90();
LAB_006b1cc8:
  auVar37 = func_0x00017514();
  uVar11 = auVar37._0_8_;
  uVar3 = auVar37._8_4_ | param_4 << 8 | param_5 << 0x10 | param_6 << 0x18;
  puVar15 = *(uint **)(uVar11 + 0x30);
  if (puVar15 < *(uint **)(uVar11 + 0x38)) {
    puVar28 = puVar15 + 1;
    *puVar15 = uVar3;
    uVar12 = uVar11;
code_r0x006b1e28:
    *(uint **)(uVar11 + 0x30) = puVar28;
    puVar2 = *(undefined4 **)(uVar11 + 0x48);
    if (puVar2 < *(undefined4 **)(uVar11 + 0x50)) {
      puVar23 = puVar2 + 1;
      *puVar2 = *(undefined4 *)(uVar11 + 0x1b8);
      goto code_r0x006b1f50;
    }
    puVar21 = *(undefined4 **)(uVar11 + 0x40);
    lVar14 = (long)puVar2 - (long)puVar21 >> 2;
    uVar12 = lVar14 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(uVar11 + 0x50) - (long)puVar21;
      uVar6 = (long)uVar7 >> 1;
      if (uVar6 <= uVar12) {
        uVar6 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar6 = 0x3fffffffffffffff;
      }
      if (uVar6 == 0) {
        uVar12 = 0;
      }
      else {
        if (uVar6 >> 0x3e != 0) goto code_r0x006b1f6c;
        uVar12 = __Znwm(uVar6 << 2);
      }
      puVar10 = (undefined4 *)(uVar12 + lVar14 * 4);
      puVar23 = puVar10 + 1;
      *puVar10 = *(undefined4 *)(uVar11 + 0x1b8);
      if ((long)puVar2 - (long)puVar21 != 0) {
        uVar7 = ((long)puVar2 - (long)puVar21) - 4;
        puVar26 = puVar2;
        if ((0x3b < uVar7) && (0x3f < (long)puVar2 + (-((long)puVar2 - (long)puVar21) - uVar12))) {
          uVar7 = (uVar7 >> 2) + 1;
          uVar13 = uVar7 & 0x7ffffffffffffff0;
          puVar26 = puVar2 + -uVar13;
          puVar10 = puVar10 + -uVar13;
          puVar18 = (undefined8 *)(puVar2 + -8);
          puVar19 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
          uVar20 = uVar13;
          do {
            uVar32 = *puVar18;
            uVar31 = puVar18[3];
            uVar30 = puVar18[2];
            uVar36 = puVar18[-3];
            uVar35 = puVar18[-4];
            uVar34 = puVar18[-1];
            uVar33 = puVar18[-2];
            puVar19[1] = puVar18[1];
            *puVar19 = uVar32;
            puVar19[3] = uVar31;
            puVar19[2] = uVar30;
            puVar19[-3] = uVar36;
            puVar19[-4] = uVar35;
            puVar19[-1] = uVar34;
            puVar19[-2] = uVar33;
            puVar18 = puVar18 + -8;
            puVar19 = puVar19 + -8;
            uVar20 = uVar20 - 0x10;
          } while (uVar20 != 0);
          if (uVar7 == uVar13) goto code_r0x006b1f3c;
        }
        do {
          puVar26 = puVar26 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar26;
        } while (puVar26 != puVar21);
      }
code_r0x006b1f3c:
      *(undefined4 **)(uVar11 + 0x40) = puVar10;
      *(undefined4 **)(uVar11 + 0x48) = puVar23;
      *(ulong *)(uVar11 + 0x50) = uVar12 + uVar6 * 4;
      if (puVar21 != (undefined4 *)0x0) {
        uVar12 = __ZdlPv(puVar21);
      }
code_r0x006b1f50:
      *(undefined4 **)(uVar11 + 0x48) = puVar23;
      return uVar12;
    }
  }
  else {
    puVar22 = *(uint **)(uVar11 + 0x28);
    lVar14 = (long)puVar15 - (long)puVar22 >> 2;
    uVar12 = lVar14 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(uVar11 + 0x38) - (long)puVar22;
      uVar6 = (long)uVar7 >> 1;
      if (uVar6 <= uVar12) {
        uVar6 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar6 = 0x3fffffffffffffff;
      }
      if (uVar6 == 0) {
        uVar12 = 0;
        puVar9 = (uint *)(lVar14 * 4);
        lVar1 = 0;
        *puVar9 = uVar3;
joined_r0x006b1d94:
        puVar28 = puVar9 + 1;
        if ((long)puVar15 - (long)puVar22 != 0) {
          uVar6 = ((long)puVar15 - (long)puVar22) - 4;
          puVar25 = puVar15;
          if ((0x3b < uVar6) && (0x3f < (long)puVar15 - (((long)puVar15 - (long)puVar22) + uVar12)))
          {
            uVar6 = (uVar6 >> 2) + 1;
            uVar20 = uVar6 & 0x7ffffffffffffff0;
            puVar25 = puVar15 + -uVar20;
            puVar9 = puVar9 + -uVar20;
            puVar15 = puVar15 + -8;
            puVar18 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
            uVar7 = uVar20;
            do {
              uVar32 = *(undefined8 *)puVar15;
              uVar31 = *(undefined8 *)(puVar15 + 6);
              uVar30 = *(undefined8 *)(puVar15 + 4);
              uVar36 = *(undefined8 *)(puVar15 + -6);
              uVar35 = *(undefined8 *)(puVar15 + -8);
              uVar34 = *(undefined8 *)(puVar15 + -2);
              uVar33 = *(undefined8 *)(puVar15 + -4);
              puVar18[1] = *(undefined8 *)(puVar15 + 2);
              *puVar18 = uVar32;
              puVar18[3] = uVar31;
              puVar18[2] = uVar30;
              puVar18[-3] = uVar36;
              puVar18[-4] = uVar35;
              puVar18[-1] = uVar34;
              puVar18[-2] = uVar33;
              puVar15 = puVar15 + -0x10;
              puVar18 = puVar18 + -8;
              uVar7 = uVar7 - 0x10;
            } while (uVar7 != 0);
            if (uVar6 == uVar20) goto code_r0x006b1e14;
          }
          do {
            puVar25 = puVar25 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar25;
          } while (puVar25 != puVar22);
        }
code_r0x006b1e14:
        *(uint **)(uVar11 + 0x28) = puVar9;
        *(uint **)(uVar11 + 0x30) = puVar28;
        *(long *)(uVar11 + 0x38) = lVar1;
        if (puVar22 != (uint *)0x0) {
          uVar12 = __ZdlPv(puVar22);
        }
        goto code_r0x006b1e28;
      }
      if (uVar6 >> 0x3e == 0) {
        uVar12 = __Znwm(uVar6 << 2);
        puVar9 = (uint *)(uVar12 + lVar14 * 4);
        lVar1 = uVar12 + uVar6 * 4;
        *puVar9 = uVar3;
        goto joined_r0x006b1d94;
      }
code_r0x006b1f6c:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar37 = func_0x00017f90();
  uVar11 = auVar37._0_8_;
  uVar3 = auVar37._8_4_ | param_4 << 8 | param_5 << 0x10;
  puVar15 = *(uint **)(uVar11 + 0x30);
  if (puVar15 < *(uint **)(uVar11 + 0x38)) {
    puVar28 = puVar15 + 1;
    *puVar15 = uVar3;
    uVar12 = uVar11;
LAB_006b20d0:
    *(uint **)(uVar11 + 0x30) = puVar28;
    puVar2 = *(undefined4 **)(uVar11 + 0x48);
    if (puVar2 < *(undefined4 **)(uVar11 + 0x50)) {
      puVar23 = puVar2 + 1;
      *puVar2 = *(undefined4 *)(uVar11 + 0x1b8);
      goto LAB_006b21f8;
    }
    puVar21 = *(undefined4 **)(uVar11 + 0x40);
    lVar14 = (long)puVar2 - (long)puVar21 >> 2;
    uVar12 = lVar14 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(uVar11 + 0x50) - (long)puVar21;
      uVar6 = (long)uVar7 >> 1;
      if (uVar6 <= uVar12) {
        uVar6 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar6 = 0x3fffffffffffffff;
      }
      if (uVar6 == 0) {
        uVar12 = 0;
      }
      else {
        if (uVar6 >> 0x3e != 0) goto LAB_006b2214;
        uVar12 = __Znwm(uVar6 << 2);
      }
      puVar10 = (undefined4 *)(uVar12 + lVar14 * 4);
      puVar23 = puVar10 + 1;
      *puVar10 = *(undefined4 *)(uVar11 + 0x1b8);
      if ((long)puVar2 - (long)puVar21 != 0) {
        uVar7 = ((long)puVar2 - (long)puVar21) - 4;
        puVar26 = puVar2;
        if ((0x3b < uVar7) && (0x3f < (long)puVar2 + (-((long)puVar2 - (long)puVar21) - uVar12))) {
          uVar7 = (uVar7 >> 2) + 1;
          uVar13 = uVar7 & 0x7ffffffffffffff0;
          puVar26 = puVar2 + -uVar13;
          puVar10 = puVar10 + -uVar13;
          puVar18 = (undefined8 *)(puVar2 + -8);
          puVar19 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
          uVar20 = uVar13;
          do {
            uVar32 = *puVar18;
            uVar31 = puVar18[3];
            uVar30 = puVar18[2];
            uVar36 = puVar18[-3];
            uVar35 = puVar18[-4];
            uVar34 = puVar18[-1];
            uVar33 = puVar18[-2];
            puVar19[1] = puVar18[1];
            *puVar19 = uVar32;
            puVar19[3] = uVar31;
            puVar19[2] = uVar30;
            puVar19[-3] = uVar36;
            puVar19[-4] = uVar35;
            puVar19[-1] = uVar34;
            puVar19[-2] = uVar33;
            puVar18 = puVar18 + -8;
            puVar19 = puVar19 + -8;
            uVar20 = uVar20 - 0x10;
          } while (uVar20 != 0);
          if (uVar7 == uVar13) goto code_r0x006b21e4;
        }
        do {
          puVar26 = puVar26 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar26;
        } while (puVar26 != puVar21);
      }
code_r0x006b21e4:
      *(undefined4 **)(uVar11 + 0x40) = puVar10;
      *(undefined4 **)(uVar11 + 0x48) = puVar23;
      *(ulong *)(uVar11 + 0x50) = uVar12 + uVar6 * 4;
      if (puVar21 != (undefined4 *)0x0) {
        uVar12 = __ZdlPv(puVar21);
      }
LAB_006b21f8:
      *(undefined4 **)(uVar11 + 0x48) = puVar23;
      return uVar12;
    }
  }
  else {
    puVar22 = *(uint **)(uVar11 + 0x28);
    lVar14 = (long)puVar15 - (long)puVar22 >> 2;
    uVar12 = lVar14 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(uVar11 + 0x38) - (long)puVar22;
      uVar6 = (long)uVar7 >> 1;
      if (uVar6 <= uVar12) {
        uVar6 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar6 = 0x3fffffffffffffff;
      }
      if (uVar6 == 0) {
        uVar12 = 0;
        puVar9 = (uint *)(lVar14 * 4);
        lVar1 = 0;
        *puVar9 = uVar3;
joined_r0x006b203c:
        puVar28 = puVar9 + 1;
        if ((long)puVar15 - (long)puVar22 != 0) {
          uVar6 = ((long)puVar15 - (long)puVar22) - 4;
          puVar25 = puVar15;
          if ((0x3b < uVar6) && (0x3f < (long)puVar15 + (-((long)puVar15 - (long)puVar22) - uVar12))
             ) {
            uVar6 = (uVar6 >> 2) + 1;
            uVar20 = uVar6 & 0x7ffffffffffffff0;
            puVar25 = puVar15 + -uVar20;
            puVar9 = puVar9 + -uVar20;
            puVar15 = puVar15 + -8;
            puVar18 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
            uVar7 = uVar20;
            do {
              uVar32 = *(undefined8 *)puVar15;
              uVar31 = *(undefined8 *)(puVar15 + 6);
              uVar30 = *(undefined8 *)(puVar15 + 4);
              uVar36 = *(undefined8 *)(puVar15 + -6);
              uVar35 = *(undefined8 *)(puVar15 + -8);
              uVar34 = *(undefined8 *)(puVar15 + -2);
              uVar33 = *(undefined8 *)(puVar15 + -4);
              puVar18[1] = *(undefined8 *)(puVar15 + 2);
              *puVar18 = uVar32;
              puVar18[3] = uVar31;
              puVar18[2] = uVar30;
              puVar18[-3] = uVar36;
              puVar18[-4] = uVar35;
              puVar18[-1] = uVar34;
              puVar18[-2] = uVar33;
              puVar15 = puVar15 + -0x10;
              puVar18 = puVar18 + -8;
              uVar7 = uVar7 - 0x10;
            } while (uVar7 != 0);
            if (uVar6 == uVar20) goto LAB_006b20bc;
          }
          do {
            puVar25 = puVar25 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar25;
          } while (puVar25 != puVar22);
        }
LAB_006b20bc:
        *(uint **)(uVar11 + 0x28) = puVar9;
        *(uint **)(uVar11 + 0x30) = puVar28;
        *(long *)(uVar11 + 0x38) = lVar1;
        if (puVar22 != (uint *)0x0) {
          uVar12 = __ZdlPv(puVar22);
        }
        goto LAB_006b20d0;
      }
      if (uVar6 >> 0x3e == 0) {
        uVar12 = __Znwm(uVar6 << 2);
        puVar9 = (uint *)(uVar12 + lVar14 * 4);
        lVar1 = uVar12 + uVar6 * 4;
        *puVar9 = uVar3;
        goto joined_r0x006b203c;
      }
LAB_006b2214:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar37 = func_0x00017f90();
  uVar11 = auVar37._0_8_;
  uVar3 = auVar37._8_4_ | param_4 << 8;
  puVar15 = *(uint **)(uVar11 + 0x30);
  if (puVar15 < *(uint **)(uVar11 + 0x38)) {
    puVar28 = puVar15 + 1;
    *puVar15 = uVar3;
    uVar12 = uVar11;
LAB_006b2374:
    *(uint **)(uVar11 + 0x30) = puVar28;
    puVar2 = *(undefined4 **)(uVar11 + 0x48);
    if (puVar2 < *(undefined4 **)(uVar11 + 0x50)) {
      puVar23 = puVar2 + 1;
      *puVar2 = *(undefined4 *)(uVar11 + 0x1b8);
      goto LAB_006b249c;
    }
    puVar21 = *(undefined4 **)(uVar11 + 0x40);
    lVar14 = (long)puVar2 - (long)puVar21 >> 2;
    uVar12 = lVar14 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(uVar11 + 0x50) - (long)puVar21;
      uVar6 = (long)uVar7 >> 1;
      if (uVar6 <= uVar12) {
        uVar6 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar6 = 0x3fffffffffffffff;
      }
      if (uVar6 == 0) {
        uVar12 = 0;
      }
      else {
        if (uVar6 >> 0x3e != 0) goto LAB_006b24b8;
        uVar12 = __Znwm(uVar6 << 2);
      }
      puVar10 = (undefined4 *)(uVar12 + lVar14 * 4);
      puVar23 = puVar10 + 1;
      *puVar10 = *(undefined4 *)(uVar11 + 0x1b8);
      if ((long)puVar2 - (long)puVar21 != 0) {
        uVar7 = ((long)puVar2 - (long)puVar21) - 4;
        puVar26 = puVar2;
        if ((0x3b < uVar7) && (0x3f < (long)puVar2 + (-((long)puVar2 - (long)puVar21) - uVar12))) {
          uVar7 = (uVar7 >> 2) + 1;
          uVar13 = uVar7 & 0x7ffffffffffffff0;
          puVar26 = puVar2 + -uVar13;
          puVar10 = puVar10 + -uVar13;
          puVar18 = (undefined8 *)(puVar2 + -8);
          puVar19 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
          uVar20 = uVar13;
          do {
            uVar32 = *puVar18;
            uVar31 = puVar18[3];
            uVar30 = puVar18[2];
            uVar36 = puVar18[-3];
            uVar35 = puVar18[-4];
            uVar34 = puVar18[-1];
            uVar33 = puVar18[-2];
            puVar19[1] = puVar18[1];
            *puVar19 = uVar32;
            puVar19[3] = uVar31;
            puVar19[2] = uVar30;
            puVar19[-3] = uVar36;
            puVar19[-4] = uVar35;
            puVar19[-1] = uVar34;
            puVar19[-2] = uVar33;
            puVar18 = puVar18 + -8;
            puVar19 = puVar19 + -8;
            uVar20 = uVar20 - 0x10;
          } while (uVar20 != 0);
          if (uVar7 == uVar13) goto LAB_006b2488;
        }
        do {
          puVar26 = puVar26 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar26;
        } while (puVar26 != puVar21);
      }
LAB_006b2488:
      *(undefined4 **)(uVar11 + 0x40) = puVar10;
      *(undefined4 **)(uVar11 + 0x48) = puVar23;
      *(ulong *)(uVar11 + 0x50) = uVar12 + uVar6 * 4;
      if (puVar21 != (undefined4 *)0x0) {
        uVar12 = __ZdlPv(puVar21);
      }
LAB_006b249c:
      *(undefined4 **)(uVar11 + 0x48) = puVar23;
      return uVar12;
    }
  }
  else {
    puVar22 = *(uint **)(uVar11 + 0x28);
    lVar14 = (long)puVar15 - (long)puVar22 >> 2;
    uVar12 = lVar14 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(uVar11 + 0x38) - (long)puVar22;
      uVar6 = (long)uVar7 >> 1;
      if (uVar6 <= uVar12) {
        uVar6 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar6 = 0x3fffffffffffffff;
      }
      if (uVar6 == 0) {
        uVar12 = 0;
        puVar9 = (uint *)(lVar14 * 4);
        lVar1 = 0;
        *puVar9 = uVar3;
joined_r0x006b22e0:
        puVar28 = puVar9 + 1;
        if ((long)puVar15 - (long)puVar22 != 0) {
          uVar6 = ((long)puVar15 - (long)puVar22) - 4;
          puVar25 = puVar15;
          if ((0x3b < uVar6) && (0x3f < (long)puVar15 - (((long)puVar15 - (long)puVar22) + uVar12)))
          {
            uVar6 = (uVar6 >> 2) + 1;
            uVar20 = uVar6 & 0x7ffffffffffffff0;
            puVar25 = puVar15 + -uVar20;
            puVar9 = puVar9 + -uVar20;
            puVar15 = puVar15 + -8;
            puVar18 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
            uVar7 = uVar20;
            do {
              uVar32 = *(undefined8 *)puVar15;
              uVar31 = *(undefined8 *)(puVar15 + 6);
              uVar30 = *(undefined8 *)(puVar15 + 4);
              uVar36 = *(undefined8 *)(puVar15 + -6);
              uVar35 = *(undefined8 *)(puVar15 + -8);
              uVar34 = *(undefined8 *)(puVar15 + -2);
              uVar33 = *(undefined8 *)(puVar15 + -4);
              puVar18[1] = *(undefined8 *)(puVar15 + 2);
              *puVar18 = uVar32;
              puVar18[3] = uVar31;
              puVar18[2] = uVar30;
              puVar18[-3] = uVar36;
              puVar18[-4] = uVar35;
              puVar18[-1] = uVar34;
              puVar18[-2] = uVar33;
              puVar15 = puVar15 + -0x10;
              puVar18 = puVar18 + -8;
              uVar7 = uVar7 - 0x10;
            } while (uVar7 != 0);
            if (uVar6 == uVar20) goto LAB_006b2360;
          }
          do {
            puVar25 = puVar25 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar25;
          } while (puVar25 != puVar22);
        }
LAB_006b2360:
        *(uint **)(uVar11 + 0x28) = puVar9;
        *(uint **)(uVar11 + 0x30) = puVar28;
        *(long *)(uVar11 + 0x38) = lVar1;
        if (puVar22 != (uint *)0x0) {
          uVar12 = __ZdlPv(puVar22);
        }
        goto LAB_006b2374;
      }
      if (uVar6 >> 0x3e == 0) {
        uVar12 = __Znwm(uVar6 << 2);
        puVar9 = (uint *)(uVar12 + lVar14 * 4);
        lVar1 = uVar12 + uVar6 * 4;
        *puVar9 = uVar3;
        goto joined_r0x006b22e0;
      }
LAB_006b24b8:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar37 = func_0x00017f90();
  uVar5 = auVar37._8_4_;
  uVar11 = auVar37._0_8_;
  puVar2 = *(undefined4 **)(uVar11 + 0x30);
  if (*(undefined4 **)(uVar11 + 0x38) <= puVar2) {
    puVar23 = *(undefined4 **)(uVar11 + 0x28);
    lVar14 = (long)puVar2 - (long)puVar23 >> 2;
    uVar12 = lVar14 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(uVar11 + 0x38) - (long)puVar23;
      uVar6 = (long)uVar7 >> 1;
      if (uVar6 <= uVar12) {
        uVar6 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar6 = 0x3fffffffffffffff;
      }
      if (uVar6 == 0) {
        uVar12 = 0;
        puVar21 = (undefined4 *)(lVar14 * 4);
        lVar1 = 0;
        *puVar21 = uVar5;
joined_r0x006b2584:
        puVar10 = puVar21 + 1;
        if ((long)puVar2 - (long)puVar23 != 0) {
          uVar6 = ((long)puVar2 - (long)puVar23) - 4;
          puVar26 = puVar2;
          if ((0x3b < uVar6) && (0x3f < (long)puVar2 + (-((long)puVar2 - (long)puVar23) - uVar12)))
          {
            uVar6 = (uVar6 >> 2) + 1;
            uVar20 = uVar6 & 0x7ffffffffffffff0;
            puVar26 = puVar2 + -uVar20;
            puVar21 = puVar21 + -uVar20;
            puVar18 = (undefined8 *)(puVar2 + -8);
            puVar19 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
            uVar7 = uVar20;
            do {
              uVar32 = *puVar18;
              uVar31 = puVar18[3];
              uVar30 = puVar18[2];
              uVar36 = puVar18[-3];
              uVar35 = puVar18[-4];
              uVar34 = puVar18[-1];
              uVar33 = puVar18[-2];
              puVar19[1] = puVar18[1];
              *puVar19 = uVar32;
              puVar19[3] = uVar31;
              puVar19[2] = uVar30;
              puVar19[-3] = uVar36;
              puVar19[-4] = uVar35;
              puVar19[-1] = uVar34;
              puVar19[-2] = uVar33;
              puVar18 = puVar18 + -8;
              puVar19 = puVar19 + -8;
              uVar7 = uVar7 - 0x10;
            } while (uVar7 != 0);
            if (uVar6 == uVar20) goto LAB_006b2604;
          }
          do {
            puVar26 = puVar26 + -1;
            puVar21 = puVar21 + -1;
            *puVar21 = *puVar26;
          } while (puVar26 != puVar23);
        }
LAB_006b2604:
        *(undefined4 **)(uVar11 + 0x28) = puVar21;
        *(undefined4 **)(uVar11 + 0x30) = puVar10;
        *(long *)(uVar11 + 0x38) = lVar1;
        if (puVar23 != (undefined4 *)0x0) {
          uVar12 = __ZdlPv(puVar23);
        }
        goto LAB_006b2618;
      }
      if (uVar6 >> 0x3e == 0) {
        uVar12 = __Znwm(uVar6 << 2);
        puVar21 = (undefined4 *)(uVar12 + lVar14 * 4);
        lVar1 = uVar12 + uVar6 * 4;
        *puVar21 = uVar5;
        goto joined_r0x006b2584;
      }
LAB_006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
LAB_006b2764:
    uVar11 = func_0x00017f90();
    *(long *)(uVar11 + 0x30) = *(long *)(uVar11 + 0x30) + -4;
    *(long *)(uVar11 + 0x48) = *(long *)(uVar11 + 0x48) + -4;
    return uVar11;
  }
  puVar10 = puVar2 + 1;
  *puVar2 = uVar5;
  uVar12 = uVar11;
LAB_006b2618:
  *(undefined4 **)(uVar11 + 0x30) = puVar10;
  puVar2 = *(undefined4 **)(uVar11 + 0x48);
  if (puVar2 < *(undefined4 **)(uVar11 + 0x50)) {
    puVar23 = puVar2 + 1;
    *puVar2 = *(undefined4 *)(uVar11 + 0x1b8);
    goto LAB_006b2740;
  }
  puVar21 = *(undefined4 **)(uVar11 + 0x40);
  lVar14 = (long)puVar2 - (long)puVar21 >> 2;
  uVar12 = lVar14 + 1;
  if (uVar12 >> 0x3e != 0) goto LAB_006b2764;
  uVar7 = (long)*(undefined4 **)(uVar11 + 0x50) - (long)puVar21;
  uVar6 = (long)uVar7 >> 1;
  if (uVar6 <= uVar12) {
    uVar6 = uVar12;
  }
  if (0x7ffffffffffffffb < uVar7) {
    uVar6 = 0x3fffffffffffffff;
  }
  if (uVar6 == 0) {
    uVar12 = 0;
  }
  else {
    if (uVar6 >> 0x3e != 0) goto LAB_006b275c;
    uVar12 = __Znwm(uVar6 << 2);
  }
  puVar10 = (undefined4 *)(uVar12 + lVar14 * 4);
  puVar23 = puVar10 + 1;
  *puVar10 = *(undefined4 *)(uVar11 + 0x1b8);
  if ((long)puVar2 - (long)puVar21 != 0) {
    uVar7 = ((long)puVar2 - (long)puVar21) - 4;
    puVar26 = puVar2;
    if ((0x3b < uVar7) && (0x3f < (long)puVar2 + (-((long)puVar2 - (long)puVar21) - uVar12))) {
      uVar7 = (uVar7 >> 2) + 1;
      uVar13 = uVar7 & 0x7ffffffffffffff0;
      puVar26 = puVar2 + -uVar13;
      puVar10 = puVar10 + -uVar13;
      puVar18 = (undefined8 *)(puVar2 + -8);
      puVar19 = (undefined8 *)(uVar12 + lVar14 * 4 + -0x20);
      uVar20 = uVar13;
      do {
        uVar32 = *puVar18;
        uVar31 = puVar18[3];
        uVar30 = puVar18[2];
        uVar36 = puVar18[-3];
        uVar35 = puVar18[-4];
        uVar34 = puVar18[-1];
        uVar33 = puVar18[-2];
        puVar19[1] = puVar18[1];
        *puVar19 = uVar32;
        puVar19[3] = uVar31;
        puVar19[2] = uVar30;
        puVar19[-3] = uVar36;
        puVar19[-4] = uVar35;
        puVar19[-1] = uVar34;
        puVar19[-2] = uVar33;
        puVar18 = puVar18 + -8;
        puVar19 = puVar19 + -8;
        uVar20 = uVar20 - 0x10;
      } while (uVar20 != 0);
      if (uVar7 == uVar13) goto code_r0x006b272c;
    }
    do {
      puVar26 = puVar26 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar26;
    } while (puVar26 != puVar21);
  }
code_r0x006b272c:
  *(undefined4 **)(uVar11 + 0x40) = puVar10;
  *(undefined4 **)(uVar11 + 0x48) = puVar23;
  *(ulong *)(uVar11 + 0x50) = uVar12 + uVar6 * 4;
  if (puVar21 != (undefined4 *)0x0) {
    uVar12 = __ZdlPv(puVar21);
  }
LAB_006b2740:
  *(undefined4 **)(uVar11 + 0x48) = puVar23;
  return uVar12;
}

