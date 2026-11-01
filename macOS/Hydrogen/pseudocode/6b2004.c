
void FUN_006b2004(undefined8 param_1,undefined8 param_2,int param_3)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined4 uVar6;
  ulong uVar7;
  undefined4 *puVar8;
  uint *puVar9;
  undefined4 *puVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  uint *puVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar17;
  uint *puVar18;
  undefined4 *puVar19;
  undefined4 *unaff_x21;
  uint *puVar20;
  undefined4 *puVar21;
  long unaff_x22;
  uint *puVar22;
  long unaff_x23;
  long unaff_x24;
  undefined4 unaff_w25;
  long unaff_x26;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined1 auVar30 [12];
  
  lVar2 = __Znwm();
  puVar8 = (undefined4 *)(lVar2 + unaff_x24 * 4);
  puVar19 = puVar8 + 1;
  *puVar8 = unaff_w25;
  if (unaff_x23 - (long)unaff_x20 != 0) {
    uVar11 = (unaff_x23 - (long)unaff_x20) - 4;
    if ((0x3b < uVar11) && (0x3f < (ulong)((unaff_x23 - lVar2) - unaff_x26))) {
      uVar11 = (uVar11 >> 2) + 1;
      uVar7 = uVar11 & 0x7ffffffffffffff0;
      unaff_x21 = (undefined4 *)(unaff_x23 + uVar7 * -4);
      puVar8 = puVar8 + -uVar7;
      puVar15 = (undefined8 *)(unaff_x23 + -0x20);
      puVar16 = (undefined8 *)(lVar2 + unaff_x24 * 4 + -0x20);
      uVar12 = uVar7;
      do {
        uVar25 = *puVar15;
        uVar24 = puVar15[3];
        uVar23 = puVar15[2];
        uVar29 = puVar15[-3];
        uVar28 = puVar15[-4];
        uVar27 = puVar15[-1];
        uVar26 = puVar15[-2];
        puVar16[1] = puVar15[1];
        *puVar16 = uVar25;
        puVar16[3] = uVar24;
        puVar16[2] = uVar23;
        puVar16[-3] = uVar29;
        puVar16[-4] = uVar28;
        puVar16[-1] = uVar27;
        puVar16[-2] = uVar26;
        puVar15 = puVar15 + -8;
        puVar16 = puVar16 + -8;
        uVar12 = uVar12 - 0x10;
      } while (uVar12 != 0);
      if (uVar11 == uVar7) goto LAB_006b20bc;
    }
    do {
      unaff_x21 = unaff_x21 + -1;
      puVar8 = puVar8 + -1;
      *puVar8 = *unaff_x21;
    } while (unaff_x21 != unaff_x20);
  }
LAB_006b20bc:
  *(undefined4 **)(unaff_x19 + 0x28) = puVar8;
  *(undefined4 **)(unaff_x19 + 0x30) = puVar19;
  *(long *)(unaff_x19 + 0x38) = lVar2 + unaff_x22 * 4;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined4 **)(unaff_x19 + 0x30) = puVar19;
  puVar8 = *(undefined4 **)(unaff_x19 + 0x48);
  if (puVar8 < *(undefined4 **)(unaff_x19 + 0x50)) {
    puVar19 = puVar8 + 1;
    *puVar8 = *(undefined4 *)(unaff_x19 + 0x1b8);
    goto LAB_006b21f8;
  }
  puVar17 = *(undefined4 **)(unaff_x19 + 0x40);
  lVar2 = (long)puVar8 - (long)puVar17 >> 2;
  uVar11 = lVar2 + 1;
  if (uVar11 >> 0x3e == 0) {
    uVar7 = (long)*(undefined4 **)(unaff_x19 + 0x50) - (long)puVar17;
    uVar12 = (long)uVar7 >> 1;
    if (uVar12 <= uVar11) {
      uVar12 = uVar11;
    }
    if (0x7ffffffffffffffb < uVar7) {
      uVar12 = 0x3fffffffffffffff;
    }
    if (uVar12 == 0) {
      lVar3 = 0;
    }
    else {
      if (uVar12 >> 0x3e != 0) {
        func_0x00017514();
        func_0x00017f90();
        goto LAB_006b221c;
      }
      lVar3 = __Znwm(uVar12 << 2);
    }
    puVar10 = (undefined4 *)(lVar3 + lVar2 * 4);
    puVar19 = puVar10 + 1;
    *puVar10 = *(undefined4 *)(unaff_x19 + 0x1b8);
    if ((long)puVar8 - (long)puVar17 != 0) {
      uVar11 = ((long)puVar8 - (long)puVar17) - 4;
      puVar21 = puVar8;
      if ((0x3b < uVar11) &&
         (0x3f < (ulong)((long)puVar8 + (-((long)puVar8 - (long)puVar17) - lVar3)))) {
        uVar11 = (uVar11 >> 2) + 1;
        uVar13 = uVar11 & 0x7ffffffffffffff0;
        puVar21 = puVar8 + -uVar13;
        puVar10 = puVar10 + -uVar13;
        puVar15 = (undefined8 *)(puVar8 + -8);
        puVar16 = (undefined8 *)(lVar3 + lVar2 * 4 + -0x20);
        uVar7 = uVar13;
        do {
          uVar25 = *puVar15;
          uVar24 = puVar15[3];
          uVar23 = puVar15[2];
          uVar29 = puVar15[-3];
          uVar28 = puVar15[-4];
          uVar27 = puVar15[-1];
          uVar26 = puVar15[-2];
          puVar16[1] = puVar15[1];
          *puVar16 = uVar25;
          puVar16[3] = uVar24;
          puVar16[2] = uVar23;
          puVar16[-3] = uVar29;
          puVar16[-4] = uVar28;
          puVar16[-1] = uVar27;
          puVar16[-2] = uVar26;
          puVar15 = puVar15 + -8;
          puVar16 = puVar16 + -8;
          uVar7 = uVar7 - 0x10;
        } while (uVar7 != 0);
        if (uVar11 == uVar13) goto code_r0x006b21e4;
      }
      do {
        puVar21 = puVar21 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar21;
      } while (puVar21 != puVar17);
    }
code_r0x006b21e4:
    *(undefined4 **)(unaff_x19 + 0x40) = puVar10;
    *(undefined4 **)(unaff_x19 + 0x48) = puVar19;
    *(ulong *)(unaff_x19 + 0x50) = lVar3 + uVar12 * 4;
    if (puVar17 != (undefined4 *)0x0) {
      __ZdlPv(puVar17);
    }
LAB_006b21f8:
    *(undefined4 **)(unaff_x19 + 0x48) = puVar19;
    return;
  }
LAB_006b221c:
  auVar30 = func_0x00017f90();
  lVar2 = auVar30._0_8_;
  uVar1 = auVar30._8_4_ | param_3 << 8;
  puVar14 = *(uint **)(lVar2 + 0x30);
  if (puVar14 < *(uint **)(lVar2 + 0x38)) {
    puVar22 = puVar14 + 1;
    *puVar14 = uVar1;
LAB_006b2374:
    *(uint **)(lVar2 + 0x30) = puVar22;
    puVar8 = *(undefined4 **)(lVar2 + 0x48);
    if (puVar8 < *(undefined4 **)(lVar2 + 0x50)) {
      puVar19 = puVar8 + 1;
      *puVar8 = *(undefined4 *)(lVar2 + 0x1b8);
      goto LAB_006b249c;
    }
    puVar17 = *(undefined4 **)(lVar2 + 0x40);
    lVar3 = (long)puVar8 - (long)puVar17 >> 2;
    uVar11 = lVar3 + 1;
    if (uVar11 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(lVar2 + 0x50) - (long)puVar17;
      uVar12 = (long)uVar7 >> 1;
      if (uVar12 <= uVar11) {
        uVar12 = uVar11;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar12 = 0x3fffffffffffffff;
      }
      if (uVar12 == 0) {
        lVar4 = 0;
      }
      else {
        if (uVar12 >> 0x3e != 0) goto LAB_006b24b8;
        lVar4 = __Znwm(uVar12 << 2);
      }
      puVar10 = (undefined4 *)(lVar4 + lVar3 * 4);
      puVar19 = puVar10 + 1;
      *puVar10 = *(undefined4 *)(lVar2 + 0x1b8);
      if ((long)puVar8 - (long)puVar17 != 0) {
        uVar11 = ((long)puVar8 - (long)puVar17) - 4;
        puVar21 = puVar8;
        if ((0x3b < uVar11) &&
           (0x3f < (ulong)((long)puVar8 + (-((long)puVar8 - (long)puVar17) - lVar4)))) {
          uVar11 = (uVar11 >> 2) + 1;
          uVar13 = uVar11 & 0x7ffffffffffffff0;
          puVar21 = puVar8 + -uVar13;
          puVar10 = puVar10 + -uVar13;
          puVar15 = (undefined8 *)(puVar8 + -8);
          puVar16 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
          uVar7 = uVar13;
          do {
            uVar25 = *puVar15;
            uVar24 = puVar15[3];
            uVar23 = puVar15[2];
            uVar29 = puVar15[-3];
            uVar28 = puVar15[-4];
            uVar27 = puVar15[-1];
            uVar26 = puVar15[-2];
            puVar16[1] = puVar15[1];
            *puVar16 = uVar25;
            puVar16[3] = uVar24;
            puVar16[2] = uVar23;
            puVar16[-3] = uVar29;
            puVar16[-4] = uVar28;
            puVar16[-1] = uVar27;
            puVar16[-2] = uVar26;
            puVar15 = puVar15 + -8;
            puVar16 = puVar16 + -8;
            uVar7 = uVar7 - 0x10;
          } while (uVar7 != 0);
          if (uVar11 == uVar13) goto LAB_006b2488;
        }
        do {
          puVar21 = puVar21 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar21;
        } while (puVar21 != puVar17);
      }
LAB_006b2488:
      *(undefined4 **)(lVar2 + 0x40) = puVar10;
      *(undefined4 **)(lVar2 + 0x48) = puVar19;
      *(ulong *)(lVar2 + 0x50) = lVar4 + uVar12 * 4;
      if (puVar17 != (undefined4 *)0x0) {
        __ZdlPv(puVar17);
      }
LAB_006b249c:
      *(undefined4 **)(lVar2 + 0x48) = puVar19;
      return;
    }
  }
  else {
    puVar18 = *(uint **)(lVar2 + 0x28);
    lVar3 = (long)puVar14 - (long)puVar18 >> 2;
    uVar11 = lVar3 + 1;
    if (uVar11 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(lVar2 + 0x38) - (long)puVar18;
      uVar12 = (long)uVar7 >> 1;
      if (uVar12 <= uVar11) {
        uVar12 = uVar11;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar12 = 0x3fffffffffffffff;
      }
      if (uVar12 == 0) {
        lVar5 = 0;
        puVar9 = (uint *)(lVar3 * 4);
        lVar4 = 0;
        *puVar9 = uVar1;
joined_r0x006b22e0:
        puVar22 = puVar9 + 1;
        if ((long)puVar14 - (long)puVar18 != 0) {
          uVar11 = ((long)puVar14 - (long)puVar18) - 4;
          puVar20 = puVar14;
          if ((0x3b < uVar11) &&
             (0x3f < (ulong)((long)puVar14 - (((long)puVar14 - (long)puVar18) + lVar5)))) {
            uVar11 = (uVar11 >> 2) + 1;
            uVar7 = uVar11 & 0x7ffffffffffffff0;
            puVar20 = puVar14 + -uVar7;
            puVar9 = puVar9 + -uVar7;
            puVar14 = puVar14 + -8;
            puVar15 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar12 = uVar7;
            do {
              uVar25 = *(undefined8 *)puVar14;
              uVar24 = *(undefined8 *)(puVar14 + 6);
              uVar23 = *(undefined8 *)(puVar14 + 4);
              uVar29 = *(undefined8 *)(puVar14 + -6);
              uVar28 = *(undefined8 *)(puVar14 + -8);
              uVar27 = *(undefined8 *)(puVar14 + -2);
              uVar26 = *(undefined8 *)(puVar14 + -4);
              puVar15[1] = *(undefined8 *)(puVar14 + 2);
              *puVar15 = uVar25;
              puVar15[3] = uVar24;
              puVar15[2] = uVar23;
              puVar15[-3] = uVar29;
              puVar15[-4] = uVar28;
              puVar15[-1] = uVar27;
              puVar15[-2] = uVar26;
              puVar14 = puVar14 + -0x10;
              puVar15 = puVar15 + -8;
              uVar12 = uVar12 - 0x10;
            } while (uVar12 != 0);
            if (uVar11 == uVar7) goto LAB_006b2360;
          }
          do {
            puVar20 = puVar20 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar20;
          } while (puVar20 != puVar18);
        }
LAB_006b2360:
        *(uint **)(lVar2 + 0x28) = puVar9;
        *(uint **)(lVar2 + 0x30) = puVar22;
        *(long *)(lVar2 + 0x38) = lVar4;
        if (puVar18 != (uint *)0x0) {
          __ZdlPv(puVar18);
        }
        goto LAB_006b2374;
      }
      if (uVar12 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar12 << 2);
        puVar9 = (uint *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar12 * 4;
        *puVar9 = uVar1;
        goto joined_r0x006b22e0;
      }
LAB_006b24b8:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar30 = func_0x00017f90();
  uVar6 = auVar30._8_4_;
  lVar2 = auVar30._0_8_;
  puVar8 = *(undefined4 **)(lVar2 + 0x30);
  if (*(undefined4 **)(lVar2 + 0x38) <= puVar8) {
    puVar19 = *(undefined4 **)(lVar2 + 0x28);
    lVar3 = (long)puVar8 - (long)puVar19 >> 2;
    uVar11 = lVar3 + 1;
    if (uVar11 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(lVar2 + 0x38) - (long)puVar19;
      uVar12 = (long)uVar7 >> 1;
      if (uVar12 <= uVar11) {
        uVar12 = uVar11;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar12 = 0x3fffffffffffffff;
      }
      if (uVar12 == 0) {
        lVar5 = 0;
        puVar17 = (undefined4 *)(lVar3 * 4);
        lVar4 = 0;
        *puVar17 = uVar6;
joined_r0x006b2584:
        puVar10 = puVar17 + 1;
        if ((long)puVar8 - (long)puVar19 != 0) {
          uVar11 = ((long)puVar8 - (long)puVar19) - 4;
          puVar21 = puVar8;
          if ((0x3b < uVar11) &&
             (0x3f < (ulong)((long)puVar8 + (-((long)puVar8 - (long)puVar19) - lVar5)))) {
            uVar11 = (uVar11 >> 2) + 1;
            uVar7 = uVar11 & 0x7ffffffffffffff0;
            puVar21 = puVar8 + -uVar7;
            puVar17 = puVar17 + -uVar7;
            puVar15 = (undefined8 *)(puVar8 + -8);
            puVar16 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar12 = uVar7;
            do {
              uVar25 = *puVar15;
              uVar24 = puVar15[3];
              uVar23 = puVar15[2];
              uVar29 = puVar15[-3];
              uVar28 = puVar15[-4];
              uVar27 = puVar15[-1];
              uVar26 = puVar15[-2];
              puVar16[1] = puVar15[1];
              *puVar16 = uVar25;
              puVar16[3] = uVar24;
              puVar16[2] = uVar23;
              puVar16[-3] = uVar29;
              puVar16[-4] = uVar28;
              puVar16[-1] = uVar27;
              puVar16[-2] = uVar26;
              puVar15 = puVar15 + -8;
              puVar16 = puVar16 + -8;
              uVar12 = uVar12 - 0x10;
            } while (uVar12 != 0);
            if (uVar11 == uVar7) goto LAB_006b2604;
          }
          do {
            puVar21 = puVar21 + -1;
            puVar17 = puVar17 + -1;
            *puVar17 = *puVar21;
          } while (puVar21 != puVar19);
        }
LAB_006b2604:
        *(undefined4 **)(lVar2 + 0x28) = puVar17;
        *(undefined4 **)(lVar2 + 0x30) = puVar10;
        *(long *)(lVar2 + 0x38) = lVar4;
        if (puVar19 != (undefined4 *)0x0) {
          __ZdlPv(puVar19);
        }
        goto LAB_006b2618;
      }
      if (uVar12 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar12 << 2);
        puVar17 = (undefined4 *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar12 * 4;
        *puVar17 = uVar6;
        goto joined_r0x006b2584;
      }
LAB_006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
LAB_006b2764:
    lVar2 = func_0x00017f90();
    *(long *)(lVar2 + 0x30) = *(long *)(lVar2 + 0x30) + -4;
    *(long *)(lVar2 + 0x48) = *(long *)(lVar2 + 0x48) + -4;
    return;
  }
  puVar10 = puVar8 + 1;
  *puVar8 = uVar6;
LAB_006b2618:
  *(undefined4 **)(lVar2 + 0x30) = puVar10;
  puVar8 = *(undefined4 **)(lVar2 + 0x48);
  if (puVar8 < *(undefined4 **)(lVar2 + 0x50)) {
    puVar19 = puVar8 + 1;
    *puVar8 = *(undefined4 *)(lVar2 + 0x1b8);
    goto LAB_006b2740;
  }
  puVar17 = *(undefined4 **)(lVar2 + 0x40);
  lVar3 = (long)puVar8 - (long)puVar17 >> 2;
  uVar11 = lVar3 + 1;
  if (uVar11 >> 0x3e != 0) goto LAB_006b2764;
  uVar7 = (long)*(undefined4 **)(lVar2 + 0x50) - (long)puVar17;
  uVar12 = (long)uVar7 >> 1;
  if (uVar12 <= uVar11) {
    uVar12 = uVar11;
  }
  if (0x7ffffffffffffffb < uVar7) {
    uVar12 = 0x3fffffffffffffff;
  }
  if (uVar12 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar12 >> 0x3e != 0) goto LAB_006b275c;
    lVar4 = __Znwm(uVar12 << 2);
  }
  puVar10 = (undefined4 *)(lVar4 + lVar3 * 4);
  puVar19 = puVar10 + 1;
  *puVar10 = *(undefined4 *)(lVar2 + 0x1b8);
  if ((long)puVar8 - (long)puVar17 != 0) {
    uVar11 = ((long)puVar8 - (long)puVar17) - 4;
    puVar21 = puVar8;
    if ((0x3b < uVar11) &&
       (0x3f < (ulong)((long)puVar8 + (-((long)puVar8 - (long)puVar17) - lVar4)))) {
      uVar11 = (uVar11 >> 2) + 1;
      uVar13 = uVar11 & 0x7ffffffffffffff0;
      puVar21 = puVar8 + -uVar13;
      puVar10 = puVar10 + -uVar13;
      puVar15 = (undefined8 *)(puVar8 + -8);
      puVar16 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
      uVar7 = uVar13;
      do {
        uVar25 = *puVar15;
        uVar24 = puVar15[3];
        uVar23 = puVar15[2];
        uVar29 = puVar15[-3];
        uVar28 = puVar15[-4];
        uVar27 = puVar15[-1];
        uVar26 = puVar15[-2];
        puVar16[1] = puVar15[1];
        *puVar16 = uVar25;
        puVar16[3] = uVar24;
        puVar16[2] = uVar23;
        puVar16[-3] = uVar29;
        puVar16[-4] = uVar28;
        puVar16[-1] = uVar27;
        puVar16[-2] = uVar26;
        puVar15 = puVar15 + -8;
        puVar16 = puVar16 + -8;
        uVar7 = uVar7 - 0x10;
      } while (uVar7 != 0);
      if (uVar11 == uVar13) goto code_r0x006b272c;
    }
    do {
      puVar21 = puVar21 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar21;
    } while (puVar21 != puVar17);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar2 + 0x40) = puVar10;
  *(undefined4 **)(lVar2 + 0x48) = puVar19;
  *(ulong *)(lVar2 + 0x50) = lVar4 + uVar12 * 4;
  if (puVar17 != (undefined4 *)0x0) {
    __ZdlPv(puVar17);
  }
LAB_006b2740:
  *(undefined4 **)(lVar2 + 0x48) = puVar19;
  return;
}

