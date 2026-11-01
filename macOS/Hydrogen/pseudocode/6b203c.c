
void FUN_006b203c(undefined8 param_1,long param_2,undefined8 param_3,int param_4)

{
  undefined4 *puVar1;
  uint uVar2;
  bool in_ZR;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined4 uVar6;
  undefined4 *in_x9;
  uint *puVar7;
  undefined4 *puVar8;
  long in_x10;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  uint *puVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar16;
  uint *puVar17;
  undefined4 *puVar18;
  undefined4 *unaff_x21;
  uint *puVar19;
  undefined4 *puVar20;
  undefined8 unaff_x22;
  uint *puVar21;
  long unaff_x23;
  long lVar22;
  long unaff_x24;
  long unaff_x26;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined1 auVar30 [12];
  
  if (!in_ZR) {
    if ((0x3b < in_x10 - 4U) && (0x3f < (ulong)((unaff_x23 - param_2) - unaff_x26))) {
      uVar9 = (in_x10 - 4U >> 2) + 1;
      uVar10 = uVar9 & 0x7ffffffffffffff0;
      unaff_x21 = (undefined4 *)(unaff_x23 + uVar10 * -4);
      in_x9 = in_x9 + -uVar10;
      puVar12 = (undefined8 *)(unaff_x23 + -0x20);
      puVar14 = (undefined8 *)(param_2 + unaff_x24 * 4 + -0x20);
      uVar15 = uVar10;
      do {
        uVar25 = *puVar12;
        uVar24 = puVar12[3];
        uVar23 = puVar12[2];
        uVar29 = puVar12[-3];
        uVar28 = puVar12[-4];
        uVar27 = puVar12[-1];
        uVar26 = puVar12[-2];
        puVar14[1] = puVar12[1];
        *puVar14 = uVar25;
        puVar14[3] = uVar24;
        puVar14[2] = uVar23;
        puVar14[-3] = uVar29;
        puVar14[-4] = uVar28;
        puVar14[-1] = uVar27;
        puVar14[-2] = uVar26;
        puVar12 = puVar12 + -8;
        puVar14 = puVar14 + -8;
        uVar15 = uVar15 - 0x10;
      } while (uVar15 != 0);
      if (uVar9 == uVar10) goto LAB_006b20bc;
    }
    do {
      unaff_x21 = unaff_x21 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *unaff_x21;
    } while (unaff_x21 != unaff_x20);
  }
LAB_006b20bc:
  *(undefined4 **)(unaff_x19 + 0x28) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x30) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x38) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x30) = unaff_x22;
  puVar1 = *(undefined4 **)(unaff_x19 + 0x48);
  if (puVar1 < *(undefined4 **)(unaff_x19 + 0x50)) {
    puVar18 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(unaff_x19 + 0x1b8);
    goto LAB_006b21f8;
  }
  puVar16 = *(undefined4 **)(unaff_x19 + 0x40);
  lVar22 = (long)puVar1 - (long)puVar16 >> 2;
  uVar9 = lVar22 + 1;
  if (uVar9 >> 0x3e == 0) {
    uVar10 = (long)*(undefined4 **)(unaff_x19 + 0x50) - (long)puVar16;
    uVar15 = (long)uVar10 >> 1;
    if (uVar15 <= uVar9) {
      uVar15 = uVar9;
    }
    if (0x7ffffffffffffffb < uVar10) {
      uVar15 = 0x3fffffffffffffff;
    }
    if (uVar15 == 0) {
      lVar3 = 0;
    }
    else {
      if (uVar15 >> 0x3e != 0) {
        func_0x00017514();
        func_0x00017f90();
        goto LAB_006b221c;
      }
      lVar3 = __Znwm(uVar15 << 2);
    }
    puVar8 = (undefined4 *)(lVar3 + lVar22 * 4);
    puVar18 = puVar8 + 1;
    *puVar8 = *(undefined4 *)(unaff_x19 + 0x1b8);
    if ((long)puVar1 - (long)puVar16 != 0) {
      uVar9 = ((long)puVar1 - (long)puVar16) - 4;
      puVar20 = puVar1;
      if ((0x3b < uVar9) &&
         (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar16) - lVar3)))) {
        uVar9 = (uVar9 >> 2) + 1;
        uVar11 = uVar9 & 0x7ffffffffffffff0;
        puVar20 = puVar1 + -uVar11;
        puVar8 = puVar8 + -uVar11;
        puVar12 = (undefined8 *)(puVar1 + -8);
        puVar14 = (undefined8 *)(lVar3 + lVar22 * 4 + -0x20);
        uVar10 = uVar11;
        do {
          uVar25 = *puVar12;
          uVar24 = puVar12[3];
          uVar23 = puVar12[2];
          uVar29 = puVar12[-3];
          uVar28 = puVar12[-4];
          uVar27 = puVar12[-1];
          uVar26 = puVar12[-2];
          puVar14[1] = puVar12[1];
          *puVar14 = uVar25;
          puVar14[3] = uVar24;
          puVar14[2] = uVar23;
          puVar14[-3] = uVar29;
          puVar14[-4] = uVar28;
          puVar14[-1] = uVar27;
          puVar14[-2] = uVar26;
          puVar12 = puVar12 + -8;
          puVar14 = puVar14 + -8;
          uVar10 = uVar10 - 0x10;
        } while (uVar10 != 0);
        if (uVar9 == uVar11) goto code_r0x006b21e4;
      }
      do {
        puVar20 = puVar20 + -1;
        puVar8 = puVar8 + -1;
        *puVar8 = *puVar20;
      } while (puVar20 != puVar16);
    }
code_r0x006b21e4:
    *(undefined4 **)(unaff_x19 + 0x40) = puVar8;
    *(undefined4 **)(unaff_x19 + 0x48) = puVar18;
    *(ulong *)(unaff_x19 + 0x50) = lVar3 + uVar15 * 4;
    if (puVar16 != (undefined4 *)0x0) {
      __ZdlPv(puVar16);
    }
LAB_006b21f8:
    *(undefined4 **)(unaff_x19 + 0x48) = puVar18;
    return;
  }
LAB_006b221c:
  auVar30 = func_0x00017f90();
  lVar22 = auVar30._0_8_;
  uVar2 = auVar30._8_4_ | param_4 << 8;
  puVar13 = *(uint **)(lVar22 + 0x30);
  if (puVar13 < *(uint **)(lVar22 + 0x38)) {
    puVar21 = puVar13 + 1;
    *puVar13 = uVar2;
LAB_006b2374:
    *(uint **)(lVar22 + 0x30) = puVar21;
    puVar1 = *(undefined4 **)(lVar22 + 0x48);
    if (puVar1 < *(undefined4 **)(lVar22 + 0x50)) {
      puVar18 = puVar1 + 1;
      *puVar1 = *(undefined4 *)(lVar22 + 0x1b8);
      goto LAB_006b249c;
    }
    puVar16 = *(undefined4 **)(lVar22 + 0x40);
    lVar3 = (long)puVar1 - (long)puVar16 >> 2;
    uVar9 = lVar3 + 1;
    if (uVar9 >> 0x3e == 0) {
      uVar10 = (long)*(undefined4 **)(lVar22 + 0x50) - (long)puVar16;
      uVar15 = (long)uVar10 >> 1;
      if (uVar15 <= uVar9) {
        uVar15 = uVar9;
      }
      if (0x7ffffffffffffffb < uVar10) {
        uVar15 = 0x3fffffffffffffff;
      }
      if (uVar15 == 0) {
        lVar4 = 0;
      }
      else {
        if (uVar15 >> 0x3e != 0) goto LAB_006b24b8;
        lVar4 = __Znwm(uVar15 << 2);
      }
      puVar8 = (undefined4 *)(lVar4 + lVar3 * 4);
      puVar18 = puVar8 + 1;
      *puVar8 = *(undefined4 *)(lVar22 + 0x1b8);
      if ((long)puVar1 - (long)puVar16 != 0) {
        uVar9 = ((long)puVar1 - (long)puVar16) - 4;
        puVar20 = puVar1;
        if ((0x3b < uVar9) &&
           (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar16) - lVar4)))) {
          uVar9 = (uVar9 >> 2) + 1;
          uVar11 = uVar9 & 0x7ffffffffffffff0;
          puVar20 = puVar1 + -uVar11;
          puVar8 = puVar8 + -uVar11;
          puVar12 = (undefined8 *)(puVar1 + -8);
          puVar14 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
          uVar10 = uVar11;
          do {
            uVar25 = *puVar12;
            uVar24 = puVar12[3];
            uVar23 = puVar12[2];
            uVar29 = puVar12[-3];
            uVar28 = puVar12[-4];
            uVar27 = puVar12[-1];
            uVar26 = puVar12[-2];
            puVar14[1] = puVar12[1];
            *puVar14 = uVar25;
            puVar14[3] = uVar24;
            puVar14[2] = uVar23;
            puVar14[-3] = uVar29;
            puVar14[-4] = uVar28;
            puVar14[-1] = uVar27;
            puVar14[-2] = uVar26;
            puVar12 = puVar12 + -8;
            puVar14 = puVar14 + -8;
            uVar10 = uVar10 - 0x10;
          } while (uVar10 != 0);
          if (uVar9 == uVar11) goto LAB_006b2488;
        }
        do {
          puVar20 = puVar20 + -1;
          puVar8 = puVar8 + -1;
          *puVar8 = *puVar20;
        } while (puVar20 != puVar16);
      }
LAB_006b2488:
      *(undefined4 **)(lVar22 + 0x40) = puVar8;
      *(undefined4 **)(lVar22 + 0x48) = puVar18;
      *(ulong *)(lVar22 + 0x50) = lVar4 + uVar15 * 4;
      if (puVar16 != (undefined4 *)0x0) {
        __ZdlPv(puVar16);
      }
LAB_006b249c:
      *(undefined4 **)(lVar22 + 0x48) = puVar18;
      return;
    }
  }
  else {
    puVar17 = *(uint **)(lVar22 + 0x28);
    lVar3 = (long)puVar13 - (long)puVar17 >> 2;
    uVar9 = lVar3 + 1;
    if (uVar9 >> 0x3e == 0) {
      uVar10 = (long)*(uint **)(lVar22 + 0x38) - (long)puVar17;
      uVar15 = (long)uVar10 >> 1;
      if (uVar15 <= uVar9) {
        uVar15 = uVar9;
      }
      if (0x7ffffffffffffffb < uVar10) {
        uVar15 = 0x3fffffffffffffff;
      }
      if (uVar15 == 0) {
        lVar5 = 0;
        puVar7 = (uint *)(lVar3 * 4);
        lVar4 = 0;
        *puVar7 = uVar2;
joined_r0x006b22e0:
        puVar21 = puVar7 + 1;
        if ((long)puVar13 - (long)puVar17 != 0) {
          uVar9 = ((long)puVar13 - (long)puVar17) - 4;
          puVar19 = puVar13;
          if ((0x3b < uVar9) &&
             (0x3f < (ulong)((long)puVar13 - (((long)puVar13 - (long)puVar17) + lVar5)))) {
            uVar9 = (uVar9 >> 2) + 1;
            uVar10 = uVar9 & 0x7ffffffffffffff0;
            puVar19 = puVar13 + -uVar10;
            puVar7 = puVar7 + -uVar10;
            puVar13 = puVar13 + -8;
            puVar12 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar15 = uVar10;
            do {
              uVar25 = *(undefined8 *)puVar13;
              uVar24 = *(undefined8 *)(puVar13 + 6);
              uVar23 = *(undefined8 *)(puVar13 + 4);
              uVar29 = *(undefined8 *)(puVar13 + -6);
              uVar28 = *(undefined8 *)(puVar13 + -8);
              uVar27 = *(undefined8 *)(puVar13 + -2);
              uVar26 = *(undefined8 *)(puVar13 + -4);
              puVar12[1] = *(undefined8 *)(puVar13 + 2);
              *puVar12 = uVar25;
              puVar12[3] = uVar24;
              puVar12[2] = uVar23;
              puVar12[-3] = uVar29;
              puVar12[-4] = uVar28;
              puVar12[-1] = uVar27;
              puVar12[-2] = uVar26;
              puVar13 = puVar13 + -0x10;
              puVar12 = puVar12 + -8;
              uVar15 = uVar15 - 0x10;
            } while (uVar15 != 0);
            if (uVar9 == uVar10) goto LAB_006b2360;
          }
          do {
            puVar19 = puVar19 + -1;
            puVar7 = puVar7 + -1;
            *puVar7 = *puVar19;
          } while (puVar19 != puVar17);
        }
LAB_006b2360:
        *(uint **)(lVar22 + 0x28) = puVar7;
        *(uint **)(lVar22 + 0x30) = puVar21;
        *(long *)(lVar22 + 0x38) = lVar4;
        if (puVar17 != (uint *)0x0) {
          __ZdlPv(puVar17);
        }
        goto LAB_006b2374;
      }
      if (uVar15 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar15 << 2);
        puVar7 = (uint *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar15 * 4;
        *puVar7 = uVar2;
        goto joined_r0x006b22e0;
      }
LAB_006b24b8:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar30 = func_0x00017f90();
  uVar6 = auVar30._8_4_;
  lVar22 = auVar30._0_8_;
  puVar1 = *(undefined4 **)(lVar22 + 0x30);
  if (*(undefined4 **)(lVar22 + 0x38) <= puVar1) {
    puVar18 = *(undefined4 **)(lVar22 + 0x28);
    lVar3 = (long)puVar1 - (long)puVar18 >> 2;
    uVar9 = lVar3 + 1;
    if (uVar9 >> 0x3e == 0) {
      uVar10 = (long)*(undefined4 **)(lVar22 + 0x38) - (long)puVar18;
      uVar15 = (long)uVar10 >> 1;
      if (uVar15 <= uVar9) {
        uVar15 = uVar9;
      }
      if (0x7ffffffffffffffb < uVar10) {
        uVar15 = 0x3fffffffffffffff;
      }
      if (uVar15 == 0) {
        lVar5 = 0;
        puVar16 = (undefined4 *)(lVar3 * 4);
        lVar4 = 0;
        *puVar16 = uVar6;
joined_r0x006b2584:
        puVar8 = puVar16 + 1;
        if ((long)puVar1 - (long)puVar18 != 0) {
          uVar9 = ((long)puVar1 - (long)puVar18) - 4;
          puVar20 = puVar1;
          if ((0x3b < uVar9) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar18) - lVar5)))) {
            uVar9 = (uVar9 >> 2) + 1;
            uVar10 = uVar9 & 0x7ffffffffffffff0;
            puVar20 = puVar1 + -uVar10;
            puVar16 = puVar16 + -uVar10;
            puVar12 = (undefined8 *)(puVar1 + -8);
            puVar14 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar15 = uVar10;
            do {
              uVar25 = *puVar12;
              uVar24 = puVar12[3];
              uVar23 = puVar12[2];
              uVar29 = puVar12[-3];
              uVar28 = puVar12[-4];
              uVar27 = puVar12[-1];
              uVar26 = puVar12[-2];
              puVar14[1] = puVar12[1];
              *puVar14 = uVar25;
              puVar14[3] = uVar24;
              puVar14[2] = uVar23;
              puVar14[-3] = uVar29;
              puVar14[-4] = uVar28;
              puVar14[-1] = uVar27;
              puVar14[-2] = uVar26;
              puVar12 = puVar12 + -8;
              puVar14 = puVar14 + -8;
              uVar15 = uVar15 - 0x10;
            } while (uVar15 != 0);
            if (uVar9 == uVar10) goto LAB_006b2604;
          }
          do {
            puVar20 = puVar20 + -1;
            puVar16 = puVar16 + -1;
            *puVar16 = *puVar20;
          } while (puVar20 != puVar18);
        }
LAB_006b2604:
        *(undefined4 **)(lVar22 + 0x28) = puVar16;
        *(undefined4 **)(lVar22 + 0x30) = puVar8;
        *(long *)(lVar22 + 0x38) = lVar4;
        if (puVar18 != (undefined4 *)0x0) {
          __ZdlPv(puVar18);
        }
        goto LAB_006b2618;
      }
      if (uVar15 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar15 << 2);
        puVar16 = (undefined4 *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar15 * 4;
        *puVar16 = uVar6;
        goto joined_r0x006b2584;
      }
LAB_006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
LAB_006b2764:
    lVar22 = func_0x00017f90();
    *(long *)(lVar22 + 0x30) = *(long *)(lVar22 + 0x30) + -4;
    *(long *)(lVar22 + 0x48) = *(long *)(lVar22 + 0x48) + -4;
    return;
  }
  puVar8 = puVar1 + 1;
  *puVar1 = uVar6;
LAB_006b2618:
  *(undefined4 **)(lVar22 + 0x30) = puVar8;
  puVar1 = *(undefined4 **)(lVar22 + 0x48);
  if (puVar1 < *(undefined4 **)(lVar22 + 0x50)) {
    puVar18 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(lVar22 + 0x1b8);
    goto LAB_006b2740;
  }
  puVar16 = *(undefined4 **)(lVar22 + 0x40);
  lVar3 = (long)puVar1 - (long)puVar16 >> 2;
  uVar9 = lVar3 + 1;
  if (uVar9 >> 0x3e != 0) goto LAB_006b2764;
  uVar10 = (long)*(undefined4 **)(lVar22 + 0x50) - (long)puVar16;
  uVar15 = (long)uVar10 >> 1;
  if (uVar15 <= uVar9) {
    uVar15 = uVar9;
  }
  if (0x7ffffffffffffffb < uVar10) {
    uVar15 = 0x3fffffffffffffff;
  }
  if (uVar15 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar15 >> 0x3e != 0) goto LAB_006b275c;
    lVar4 = __Znwm(uVar15 << 2);
  }
  puVar8 = (undefined4 *)(lVar4 + lVar3 * 4);
  puVar18 = puVar8 + 1;
  *puVar8 = *(undefined4 *)(lVar22 + 0x1b8);
  if ((long)puVar1 - (long)puVar16 != 0) {
    uVar9 = ((long)puVar1 - (long)puVar16) - 4;
    puVar20 = puVar1;
    if ((0x3b < uVar9) && (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar16) - lVar4)))
       ) {
      uVar9 = (uVar9 >> 2) + 1;
      uVar11 = uVar9 & 0x7ffffffffffffff0;
      puVar20 = puVar1 + -uVar11;
      puVar8 = puVar8 + -uVar11;
      puVar12 = (undefined8 *)(puVar1 + -8);
      puVar14 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
      uVar10 = uVar11;
      do {
        uVar25 = *puVar12;
        uVar24 = puVar12[3];
        uVar23 = puVar12[2];
        uVar29 = puVar12[-3];
        uVar28 = puVar12[-4];
        uVar27 = puVar12[-1];
        uVar26 = puVar12[-2];
        puVar14[1] = puVar12[1];
        *puVar14 = uVar25;
        puVar14[3] = uVar24;
        puVar14[2] = uVar23;
        puVar14[-3] = uVar29;
        puVar14[-4] = uVar28;
        puVar14[-1] = uVar27;
        puVar14[-2] = uVar26;
        puVar12 = puVar12 + -8;
        puVar14 = puVar14 + -8;
        uVar10 = uVar10 - 0x10;
      } while (uVar10 != 0);
      if (uVar9 == uVar11) goto code_r0x006b272c;
    }
    do {
      puVar20 = puVar20 + -1;
      puVar8 = puVar8 + -1;
      *puVar8 = *puVar20;
    } while (puVar20 != puVar16);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar22 + 0x40) = puVar8;
  *(undefined4 **)(lVar22 + 0x48) = puVar18;
  *(ulong *)(lVar22 + 0x50) = lVar4 + uVar15 * 4;
  if (puVar16 != (undefined4 *)0x0) {
    __ZdlPv(puVar16);
  }
LAB_006b2740:
  *(undefined4 **)(lVar22 + 0x48) = puVar18;
  return;
}

