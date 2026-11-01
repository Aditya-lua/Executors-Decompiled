
void FUN_006b1dcc(undefined8 param_1,long param_2,undefined8 param_3,int param_4,int param_5)

{
  undefined4 *puVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined4 uVar6;
  ulong uVar7;
  undefined4 *in_x9;
  uint *puVar8;
  undefined4 *puVar9;
  long in_x10;
  ulong uVar10;
  long in_x11;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  uint *puVar14;
  undefined8 *puVar15;
  long lVar16;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar17;
  uint *puVar18;
  undefined4 *puVar19;
  undefined4 *unaff_x21;
  uint *puVar20;
  undefined4 *puVar21;
  undefined8 unaff_x22;
  uint *puVar22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined1 auVar30 [12];
  
  puVar13 = (undefined8 *)(unaff_x23 + -0x20);
  puVar15 = (undefined8 *)(param_2 + unaff_x24 * 4 + -0x20);
  lVar16 = in_x11;
  do {
    uVar25 = *puVar13;
    uVar24 = puVar13[3];
    uVar23 = puVar13[2];
    uVar29 = puVar13[-3];
    uVar28 = puVar13[-4];
    uVar27 = puVar13[-1];
    uVar26 = puVar13[-2];
    puVar15[1] = puVar13[1];
    *puVar15 = uVar25;
    puVar15[3] = uVar24;
    puVar15[2] = uVar23;
    puVar15[-3] = uVar29;
    puVar15[-4] = uVar28;
    puVar15[-1] = uVar27;
    puVar15[-2] = uVar26;
    puVar13 = puVar13 + -8;
    puVar15 = puVar15 + -8;
    lVar16 = lVar16 + -0x10;
  } while (lVar16 != 0);
  if (in_x10 != in_x11) {
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
    puVar19 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(unaff_x19 + 0x1b8);
    goto LAB_006b1f50;
  }
  puVar17 = *(undefined4 **)(unaff_x19 + 0x40);
  lVar16 = (long)puVar1 - (long)puVar17 >> 2;
  uVar10 = lVar16 + 1;
  if (uVar10 >> 0x3e == 0) {
    uVar7 = (long)*(undefined4 **)(unaff_x19 + 0x50) - (long)puVar17;
    uVar11 = (long)uVar7 >> 1;
    if (uVar11 <= uVar10) {
      uVar11 = uVar10;
    }
    if (0x7ffffffffffffffb < uVar7) {
      uVar11 = 0x3fffffffffffffff;
    }
    if (uVar11 == 0) {
      lVar3 = 0;
    }
    else {
      if (uVar11 >> 0x3e != 0) {
        func_0x00017514();
        func_0x00017f90();
        goto LAB_006b1f74;
      }
      lVar3 = __Znwm(uVar11 << 2);
    }
    puVar9 = (undefined4 *)(lVar3 + lVar16 * 4);
    puVar19 = puVar9 + 1;
    *puVar9 = *(undefined4 *)(unaff_x19 + 0x1b8);
    if ((long)puVar1 - (long)puVar17 != 0) {
      uVar10 = ((long)puVar1 - (long)puVar17) - 4;
      puVar21 = puVar1;
      if ((0x3b < uVar10) &&
         (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar17) - lVar3)))) {
        uVar10 = (uVar10 >> 2) + 1;
        uVar12 = uVar10 & 0x7ffffffffffffff0;
        puVar21 = puVar1 + -uVar12;
        puVar9 = puVar9 + -uVar12;
        puVar13 = (undefined8 *)(puVar1 + -8);
        puVar15 = (undefined8 *)(lVar3 + lVar16 * 4 + -0x20);
        uVar7 = uVar12;
        do {
          uVar25 = *puVar13;
          uVar24 = puVar13[3];
          uVar23 = puVar13[2];
          uVar29 = puVar13[-3];
          uVar28 = puVar13[-4];
          uVar27 = puVar13[-1];
          uVar26 = puVar13[-2];
          puVar15[1] = puVar13[1];
          *puVar15 = uVar25;
          puVar15[3] = uVar24;
          puVar15[2] = uVar23;
          puVar15[-3] = uVar29;
          puVar15[-4] = uVar28;
          puVar15[-1] = uVar27;
          puVar15[-2] = uVar26;
          puVar13 = puVar13 + -8;
          puVar15 = puVar15 + -8;
          uVar7 = uVar7 - 0x10;
        } while (uVar7 != 0);
        if (uVar10 == uVar12) goto LAB_006b1f3c;
      }
      do {
        puVar21 = puVar21 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar21;
      } while (puVar21 != puVar17);
    }
LAB_006b1f3c:
    *(undefined4 **)(unaff_x19 + 0x40) = puVar9;
    *(undefined4 **)(unaff_x19 + 0x48) = puVar19;
    *(ulong *)(unaff_x19 + 0x50) = lVar3 + uVar11 * 4;
    if (puVar17 != (undefined4 *)0x0) {
      __ZdlPv(puVar17);
    }
LAB_006b1f50:
    *(undefined4 **)(unaff_x19 + 0x48) = puVar19;
    return;
  }
LAB_006b1f74:
  auVar30 = func_0x00017f90();
  lVar16 = auVar30._0_8_;
  uVar2 = auVar30._8_4_ | param_4 << 8 | param_5 << 0x10;
  puVar14 = *(uint **)(lVar16 + 0x30);
  if (puVar14 < *(uint **)(lVar16 + 0x38)) {
    puVar22 = puVar14 + 1;
    *puVar14 = uVar2;
LAB_006b20d0:
    *(uint **)(lVar16 + 0x30) = puVar22;
    puVar1 = *(undefined4 **)(lVar16 + 0x48);
    if (puVar1 < *(undefined4 **)(lVar16 + 0x50)) {
      puVar19 = puVar1 + 1;
      *puVar1 = *(undefined4 *)(lVar16 + 0x1b8);
      goto LAB_006b21f8;
    }
    puVar17 = *(undefined4 **)(lVar16 + 0x40);
    lVar3 = (long)puVar1 - (long)puVar17 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(lVar16 + 0x50) - (long)puVar17;
      uVar11 = (long)uVar7 >> 1;
      if (uVar11 <= uVar10) {
        uVar11 = uVar10;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar11 = 0x3fffffffffffffff;
      }
      if (uVar11 == 0) {
        lVar4 = 0;
      }
      else {
        if (uVar11 >> 0x3e != 0) goto LAB_006b2214;
        lVar4 = __Znwm(uVar11 << 2);
      }
      puVar9 = (undefined4 *)(lVar4 + lVar3 * 4);
      puVar19 = puVar9 + 1;
      *puVar9 = *(undefined4 *)(lVar16 + 0x1b8);
      if ((long)puVar1 - (long)puVar17 != 0) {
        uVar10 = ((long)puVar1 - (long)puVar17) - 4;
        puVar21 = puVar1;
        if ((0x3b < uVar10) &&
           (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar17) - lVar4)))) {
          uVar10 = (uVar10 >> 2) + 1;
          uVar12 = uVar10 & 0x7ffffffffffffff0;
          puVar21 = puVar1 + -uVar12;
          puVar9 = puVar9 + -uVar12;
          puVar13 = (undefined8 *)(puVar1 + -8);
          puVar15 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
          uVar7 = uVar12;
          do {
            uVar25 = *puVar13;
            uVar24 = puVar13[3];
            uVar23 = puVar13[2];
            uVar29 = puVar13[-3];
            uVar28 = puVar13[-4];
            uVar27 = puVar13[-1];
            uVar26 = puVar13[-2];
            puVar15[1] = puVar13[1];
            *puVar15 = uVar25;
            puVar15[3] = uVar24;
            puVar15[2] = uVar23;
            puVar15[-3] = uVar29;
            puVar15[-4] = uVar28;
            puVar15[-1] = uVar27;
            puVar15[-2] = uVar26;
            puVar13 = puVar13 + -8;
            puVar15 = puVar15 + -8;
            uVar7 = uVar7 - 0x10;
          } while (uVar7 != 0);
          if (uVar10 == uVar12) goto LAB_006b21e4;
        }
        do {
          puVar21 = puVar21 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar21;
        } while (puVar21 != puVar17);
      }
LAB_006b21e4:
      *(undefined4 **)(lVar16 + 0x40) = puVar9;
      *(undefined4 **)(lVar16 + 0x48) = puVar19;
      *(ulong *)(lVar16 + 0x50) = lVar4 + uVar11 * 4;
      if (puVar17 != (undefined4 *)0x0) {
        __ZdlPv(puVar17);
      }
LAB_006b21f8:
      *(undefined4 **)(lVar16 + 0x48) = puVar19;
      return;
    }
  }
  else {
    puVar18 = *(uint **)(lVar16 + 0x28);
    lVar3 = (long)puVar14 - (long)puVar18 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(lVar16 + 0x38) - (long)puVar18;
      uVar11 = (long)uVar7 >> 1;
      if (uVar11 <= uVar10) {
        uVar11 = uVar10;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar11 = 0x3fffffffffffffff;
      }
      if (uVar11 == 0) {
        lVar5 = 0;
        puVar8 = (uint *)(lVar3 * 4);
        lVar4 = 0;
        *puVar8 = uVar2;
joined_r0x006b203c:
        puVar22 = puVar8 + 1;
        if ((long)puVar14 - (long)puVar18 != 0) {
          uVar10 = ((long)puVar14 - (long)puVar18) - 4;
          puVar20 = puVar14;
          if ((0x3b < uVar10) &&
             (0x3f < (ulong)((long)puVar14 + (-((long)puVar14 - (long)puVar18) - lVar5)))) {
            uVar10 = (uVar10 >> 2) + 1;
            uVar7 = uVar10 & 0x7ffffffffffffff0;
            puVar20 = puVar14 + -uVar7;
            puVar8 = puVar8 + -uVar7;
            puVar14 = puVar14 + -8;
            puVar13 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar11 = uVar7;
            do {
              uVar25 = *(undefined8 *)puVar14;
              uVar24 = *(undefined8 *)(puVar14 + 6);
              uVar23 = *(undefined8 *)(puVar14 + 4);
              uVar29 = *(undefined8 *)(puVar14 + -6);
              uVar28 = *(undefined8 *)(puVar14 + -8);
              uVar27 = *(undefined8 *)(puVar14 + -2);
              uVar26 = *(undefined8 *)(puVar14 + -4);
              puVar13[1] = *(undefined8 *)(puVar14 + 2);
              *puVar13 = uVar25;
              puVar13[3] = uVar24;
              puVar13[2] = uVar23;
              puVar13[-3] = uVar29;
              puVar13[-4] = uVar28;
              puVar13[-1] = uVar27;
              puVar13[-2] = uVar26;
              puVar14 = puVar14 + -0x10;
              puVar13 = puVar13 + -8;
              uVar11 = uVar11 - 0x10;
            } while (uVar11 != 0);
            if (uVar10 == uVar7) goto code_r0x006b20bc;
          }
          do {
            puVar20 = puVar20 + -1;
            puVar8 = puVar8 + -1;
            *puVar8 = *puVar20;
          } while (puVar20 != puVar18);
        }
code_r0x006b20bc:
        *(uint **)(lVar16 + 0x28) = puVar8;
        *(uint **)(lVar16 + 0x30) = puVar22;
        *(long *)(lVar16 + 0x38) = lVar4;
        if (puVar18 != (uint *)0x0) {
          __ZdlPv(puVar18);
        }
        goto LAB_006b20d0;
      }
      if (uVar11 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar11 << 2);
        puVar8 = (uint *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar11 * 4;
        *puVar8 = uVar2;
        goto joined_r0x006b203c;
      }
LAB_006b2214:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar30 = func_0x00017f90();
  lVar16 = auVar30._0_8_;
  uVar2 = auVar30._8_4_ | param_4 << 8;
  puVar14 = *(uint **)(lVar16 + 0x30);
  if (puVar14 < *(uint **)(lVar16 + 0x38)) {
    puVar22 = puVar14 + 1;
    *puVar14 = uVar2;
code_r0x006b2374:
    *(uint **)(lVar16 + 0x30) = puVar22;
    puVar1 = *(undefined4 **)(lVar16 + 0x48);
    if (puVar1 < *(undefined4 **)(lVar16 + 0x50)) {
      puVar19 = puVar1 + 1;
      *puVar1 = *(undefined4 *)(lVar16 + 0x1b8);
      goto code_r0x006b249c;
    }
    puVar17 = *(undefined4 **)(lVar16 + 0x40);
    lVar3 = (long)puVar1 - (long)puVar17 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(lVar16 + 0x50) - (long)puVar17;
      uVar11 = (long)uVar7 >> 1;
      if (uVar11 <= uVar10) {
        uVar11 = uVar10;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar11 = 0x3fffffffffffffff;
      }
      if (uVar11 == 0) {
        lVar4 = 0;
      }
      else {
        if (uVar11 >> 0x3e != 0) goto code_r0x006b24b8;
        lVar4 = __Znwm(uVar11 << 2);
      }
      puVar9 = (undefined4 *)(lVar4 + lVar3 * 4);
      puVar19 = puVar9 + 1;
      *puVar9 = *(undefined4 *)(lVar16 + 0x1b8);
      if ((long)puVar1 - (long)puVar17 != 0) {
        uVar10 = ((long)puVar1 - (long)puVar17) - 4;
        puVar21 = puVar1;
        if ((0x3b < uVar10) &&
           (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar17) - lVar4)))) {
          uVar10 = (uVar10 >> 2) + 1;
          uVar12 = uVar10 & 0x7ffffffffffffff0;
          puVar21 = puVar1 + -uVar12;
          puVar9 = puVar9 + -uVar12;
          puVar13 = (undefined8 *)(puVar1 + -8);
          puVar15 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
          uVar7 = uVar12;
          do {
            uVar25 = *puVar13;
            uVar24 = puVar13[3];
            uVar23 = puVar13[2];
            uVar29 = puVar13[-3];
            uVar28 = puVar13[-4];
            uVar27 = puVar13[-1];
            uVar26 = puVar13[-2];
            puVar15[1] = puVar13[1];
            *puVar15 = uVar25;
            puVar15[3] = uVar24;
            puVar15[2] = uVar23;
            puVar15[-3] = uVar29;
            puVar15[-4] = uVar28;
            puVar15[-1] = uVar27;
            puVar15[-2] = uVar26;
            puVar13 = puVar13 + -8;
            puVar15 = puVar15 + -8;
            uVar7 = uVar7 - 0x10;
          } while (uVar7 != 0);
          if (uVar10 == uVar12) goto code_r0x006b2488;
        }
        do {
          puVar21 = puVar21 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar21;
        } while (puVar21 != puVar17);
      }
code_r0x006b2488:
      *(undefined4 **)(lVar16 + 0x40) = puVar9;
      *(undefined4 **)(lVar16 + 0x48) = puVar19;
      *(ulong *)(lVar16 + 0x50) = lVar4 + uVar11 * 4;
      if (puVar17 != (undefined4 *)0x0) {
        __ZdlPv(puVar17);
      }
code_r0x006b249c:
      *(undefined4 **)(lVar16 + 0x48) = puVar19;
      return;
    }
  }
  else {
    puVar18 = *(uint **)(lVar16 + 0x28);
    lVar3 = (long)puVar14 - (long)puVar18 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(lVar16 + 0x38) - (long)puVar18;
      uVar11 = (long)uVar7 >> 1;
      if (uVar11 <= uVar10) {
        uVar11 = uVar10;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar11 = 0x3fffffffffffffff;
      }
      if (uVar11 == 0) {
        lVar5 = 0;
        puVar8 = (uint *)(lVar3 * 4);
        lVar4 = 0;
        *puVar8 = uVar2;
joined_r0x006b22e0:
        puVar22 = puVar8 + 1;
        if ((long)puVar14 - (long)puVar18 != 0) {
          uVar10 = ((long)puVar14 - (long)puVar18) - 4;
          puVar20 = puVar14;
          if ((0x3b < uVar10) &&
             (0x3f < (ulong)((long)puVar14 - (((long)puVar14 - (long)puVar18) + lVar5)))) {
            uVar10 = (uVar10 >> 2) + 1;
            uVar7 = uVar10 & 0x7ffffffffffffff0;
            puVar20 = puVar14 + -uVar7;
            puVar8 = puVar8 + -uVar7;
            puVar14 = puVar14 + -8;
            puVar13 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar11 = uVar7;
            do {
              uVar25 = *(undefined8 *)puVar14;
              uVar24 = *(undefined8 *)(puVar14 + 6);
              uVar23 = *(undefined8 *)(puVar14 + 4);
              uVar29 = *(undefined8 *)(puVar14 + -6);
              uVar28 = *(undefined8 *)(puVar14 + -8);
              uVar27 = *(undefined8 *)(puVar14 + -2);
              uVar26 = *(undefined8 *)(puVar14 + -4);
              puVar13[1] = *(undefined8 *)(puVar14 + 2);
              *puVar13 = uVar25;
              puVar13[3] = uVar24;
              puVar13[2] = uVar23;
              puVar13[-3] = uVar29;
              puVar13[-4] = uVar28;
              puVar13[-1] = uVar27;
              puVar13[-2] = uVar26;
              puVar14 = puVar14 + -0x10;
              puVar13 = puVar13 + -8;
              uVar11 = uVar11 - 0x10;
            } while (uVar11 != 0);
            if (uVar10 == uVar7) goto code_r0x006b2360;
          }
          do {
            puVar20 = puVar20 + -1;
            puVar8 = puVar8 + -1;
            *puVar8 = *puVar20;
          } while (puVar20 != puVar18);
        }
code_r0x006b2360:
        *(uint **)(lVar16 + 0x28) = puVar8;
        *(uint **)(lVar16 + 0x30) = puVar22;
        *(long *)(lVar16 + 0x38) = lVar4;
        if (puVar18 != (uint *)0x0) {
          __ZdlPv(puVar18);
        }
        goto code_r0x006b2374;
      }
      if (uVar11 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar11 << 2);
        puVar8 = (uint *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar11 * 4;
        *puVar8 = uVar2;
        goto joined_r0x006b22e0;
      }
code_r0x006b24b8:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar30 = func_0x00017f90();
  uVar6 = auVar30._8_4_;
  lVar16 = auVar30._0_8_;
  puVar1 = *(undefined4 **)(lVar16 + 0x30);
  if (*(undefined4 **)(lVar16 + 0x38) <= puVar1) {
    puVar19 = *(undefined4 **)(lVar16 + 0x28);
    lVar3 = (long)puVar1 - (long)puVar19 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(lVar16 + 0x38) - (long)puVar19;
      uVar11 = (long)uVar7 >> 1;
      if (uVar11 <= uVar10) {
        uVar11 = uVar10;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar11 = 0x3fffffffffffffff;
      }
      if (uVar11 == 0) {
        lVar5 = 0;
        puVar17 = (undefined4 *)(lVar3 * 4);
        lVar4 = 0;
        *puVar17 = uVar6;
joined_r0x006b2584:
        puVar9 = puVar17 + 1;
        if ((long)puVar1 - (long)puVar19 != 0) {
          uVar10 = ((long)puVar1 - (long)puVar19) - 4;
          puVar21 = puVar1;
          if ((0x3b < uVar10) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar19) - lVar5)))) {
            uVar10 = (uVar10 >> 2) + 1;
            uVar7 = uVar10 & 0x7ffffffffffffff0;
            puVar21 = puVar1 + -uVar7;
            puVar17 = puVar17 + -uVar7;
            puVar13 = (undefined8 *)(puVar1 + -8);
            puVar15 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar11 = uVar7;
            do {
              uVar25 = *puVar13;
              uVar24 = puVar13[3];
              uVar23 = puVar13[2];
              uVar29 = puVar13[-3];
              uVar28 = puVar13[-4];
              uVar27 = puVar13[-1];
              uVar26 = puVar13[-2];
              puVar15[1] = puVar13[1];
              *puVar15 = uVar25;
              puVar15[3] = uVar24;
              puVar15[2] = uVar23;
              puVar15[-3] = uVar29;
              puVar15[-4] = uVar28;
              puVar15[-1] = uVar27;
              puVar15[-2] = uVar26;
              puVar13 = puVar13 + -8;
              puVar15 = puVar15 + -8;
              uVar11 = uVar11 - 0x10;
            } while (uVar11 != 0);
            if (uVar10 == uVar7) goto code_r0x006b2604;
          }
          do {
            puVar21 = puVar21 + -1;
            puVar17 = puVar17 + -1;
            *puVar17 = *puVar21;
          } while (puVar21 != puVar19);
        }
code_r0x006b2604:
        *(undefined4 **)(lVar16 + 0x28) = puVar17;
        *(undefined4 **)(lVar16 + 0x30) = puVar9;
        *(long *)(lVar16 + 0x38) = lVar4;
        if (puVar19 != (undefined4 *)0x0) {
          __ZdlPv(puVar19);
        }
        goto code_r0x006b2618;
      }
      if (uVar11 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar11 << 2);
        puVar17 = (undefined4 *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar11 * 4;
        *puVar17 = uVar6;
        goto joined_r0x006b2584;
      }
code_r0x006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
code_r0x006b2764:
    lVar16 = func_0x00017f90();
    *(long *)(lVar16 + 0x30) = *(long *)(lVar16 + 0x30) + -4;
    *(long *)(lVar16 + 0x48) = *(long *)(lVar16 + 0x48) + -4;
    return;
  }
  puVar9 = puVar1 + 1;
  *puVar1 = uVar6;
code_r0x006b2618:
  *(undefined4 **)(lVar16 + 0x30) = puVar9;
  puVar1 = *(undefined4 **)(lVar16 + 0x48);
  if (puVar1 < *(undefined4 **)(lVar16 + 0x50)) {
    puVar19 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(lVar16 + 0x1b8);
    goto code_r0x006b2740;
  }
  puVar17 = *(undefined4 **)(lVar16 + 0x40);
  lVar3 = (long)puVar1 - (long)puVar17 >> 2;
  uVar10 = lVar3 + 1;
  if (uVar10 >> 0x3e != 0) goto code_r0x006b2764;
  uVar7 = (long)*(undefined4 **)(lVar16 + 0x50) - (long)puVar17;
  uVar11 = (long)uVar7 >> 1;
  if (uVar11 <= uVar10) {
    uVar11 = uVar10;
  }
  if (0x7ffffffffffffffb < uVar7) {
    uVar11 = 0x3fffffffffffffff;
  }
  if (uVar11 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar11 >> 0x3e != 0) goto code_r0x006b275c;
    lVar4 = __Znwm(uVar11 << 2);
  }
  puVar9 = (undefined4 *)(lVar4 + lVar3 * 4);
  puVar19 = puVar9 + 1;
  *puVar9 = *(undefined4 *)(lVar16 + 0x1b8);
  if ((long)puVar1 - (long)puVar17 != 0) {
    uVar10 = ((long)puVar1 - (long)puVar17) - 4;
    puVar21 = puVar1;
    if ((0x3b < uVar10) &&
       (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar17) - lVar4)))) {
      uVar10 = (uVar10 >> 2) + 1;
      uVar12 = uVar10 & 0x7ffffffffffffff0;
      puVar21 = puVar1 + -uVar12;
      puVar9 = puVar9 + -uVar12;
      puVar13 = (undefined8 *)(puVar1 + -8);
      puVar15 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
      uVar7 = uVar12;
      do {
        uVar25 = *puVar13;
        uVar24 = puVar13[3];
        uVar23 = puVar13[2];
        uVar29 = puVar13[-3];
        uVar28 = puVar13[-4];
        uVar27 = puVar13[-1];
        uVar26 = puVar13[-2];
        puVar15[1] = puVar13[1];
        *puVar15 = uVar25;
        puVar15[3] = uVar24;
        puVar15[2] = uVar23;
        puVar15[-3] = uVar29;
        puVar15[-4] = uVar28;
        puVar15[-1] = uVar27;
        puVar15[-2] = uVar26;
        puVar13 = puVar13 + -8;
        puVar15 = puVar15 + -8;
        uVar7 = uVar7 - 0x10;
      } while (uVar7 != 0);
      if (uVar10 == uVar12) goto code_r0x006b272c;
    }
    do {
      puVar21 = puVar21 + -1;
      puVar9 = puVar9 + -1;
      *puVar9 = *puVar21;
    } while (puVar21 != puVar17);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar16 + 0x40) = puVar9;
  *(undefined4 **)(lVar16 + 0x48) = puVar19;
  *(ulong *)(lVar16 + 0x50) = lVar4 + uVar11 * 4;
  if (puVar17 != (undefined4 *)0x0) {
    __ZdlPv(puVar17);
  }
code_r0x006b2740:
  *(undefined4 **)(lVar16 + 0x48) = puVar19;
  return;
}

