
void FUN_006c58f4(void)

{
  undefined4 *puVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined4 uVar6;
  int iVar7;
  int iVar8;
  ulong uVar9;
  uint *puVar10;
  undefined4 *puVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  uint *puVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  undefined4 *puVar18;
  uint *puVar19;
  undefined4 *puVar20;
  long *unaff_x20;
  uint *puVar21;
  undefined4 *puVar22;
  uint *puVar23;
  long lVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined1 auVar32 [12];
  
  lVar5 = *unaff_x20;
  iVar8 = 0;
  iVar7 = 0;
  puVar1 = *(undefined4 **)(lVar5 + 0x30);
  if (puVar1 < *(undefined4 **)(lVar5 + 0x38)) {
    puVar11 = puVar1 + 1;
    *puVar1 = 0x17;
    iVar7 = 0;
code_r0x006b20d0:
    *(undefined4 **)(lVar5 + 0x30) = puVar11;
    puVar1 = *(undefined4 **)(lVar5 + 0x48);
    if (puVar1 < *(undefined4 **)(lVar5 + 0x50)) {
      puVar20 = puVar1 + 1;
      *puVar1 = *(undefined4 *)(lVar5 + 0x1b8);
      goto code_r0x006b21f8;
    }
    puVar18 = *(undefined4 **)(lVar5 + 0x40);
    lVar24 = (long)puVar1 - (long)puVar18 >> 2;
    uVar12 = lVar24 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar9 = (long)*(undefined4 **)(lVar5 + 0x50) - (long)puVar18;
      uVar13 = (long)uVar9 >> 1;
      if (uVar13 <= uVar12) {
        uVar13 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar9) {
        uVar13 = 0x3fffffffffffffff;
      }
      if (uVar13 == 0) {
        lVar3 = 0;
      }
      else {
        if (uVar13 >> 0x3e != 0) goto code_r0x006b2214;
        lVar3 = __Znwm(uVar13 << 2);
      }
      puVar11 = (undefined4 *)(lVar3 + lVar24 * 4);
      puVar20 = puVar11 + 1;
      *puVar11 = *(undefined4 *)(lVar5 + 0x1b8);
      if ((long)puVar1 - (long)puVar18 != 0) {
        uVar12 = ((long)puVar1 - (long)puVar18) - 4;
        puVar22 = puVar1;
        if ((0x3b < uVar12) &&
           (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar18) - lVar3)))) {
          uVar12 = (uVar12 >> 2) + 1;
          uVar14 = uVar12 & 0x7ffffffffffffff0;
          puVar22 = puVar1 + -uVar14;
          puVar11 = puVar11 + -uVar14;
          puVar16 = (undefined8 *)(puVar1 + -8);
          puVar17 = (undefined8 *)(lVar3 + lVar24 * 4 + -0x20);
          uVar9 = uVar14;
          do {
            uVar27 = *puVar16;
            uVar26 = puVar16[3];
            uVar25 = puVar16[2];
            uVar31 = puVar16[-3];
            uVar30 = puVar16[-4];
            uVar29 = puVar16[-1];
            uVar28 = puVar16[-2];
            puVar17[1] = puVar16[1];
            *puVar17 = uVar27;
            puVar17[3] = uVar26;
            puVar17[2] = uVar25;
            puVar17[-3] = uVar31;
            puVar17[-4] = uVar30;
            puVar17[-1] = uVar29;
            puVar17[-2] = uVar28;
            puVar16 = puVar16 + -8;
            puVar17 = puVar17 + -8;
            uVar9 = uVar9 - 0x10;
          } while (uVar9 != 0);
          if (uVar12 == uVar14) goto code_r0x006b21e4;
        }
        do {
          puVar22 = puVar22 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar22;
        } while (puVar22 != puVar18);
      }
code_r0x006b21e4:
      *(undefined4 **)(lVar5 + 0x40) = puVar11;
      *(undefined4 **)(lVar5 + 0x48) = puVar20;
      *(ulong *)(lVar5 + 0x50) = lVar3 + uVar13 * 4;
      if (puVar18 != (undefined4 *)0x0) {
        __ZdlPv(puVar18);
      }
code_r0x006b21f8:
      *(undefined4 **)(lVar5 + 0x48) = puVar20;
      return;
    }
  }
  else {
    puVar20 = *(undefined4 **)(lVar5 + 0x28);
    lVar24 = (long)puVar1 - (long)puVar20 >> 2;
    uVar12 = lVar24 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar9 = (long)*(undefined4 **)(lVar5 + 0x38) - (long)puVar20;
      uVar13 = (long)uVar9 >> 1;
      if (uVar13 <= uVar12) {
        uVar13 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar9) {
        uVar13 = 0x3fffffffffffffff;
      }
      if (uVar13 == 0) {
        lVar4 = 0;
        puVar18 = (undefined4 *)(lVar24 * 4);
        lVar3 = 0;
        *puVar18 = 0x17;
        iVar7 = 0;
joined_r0x006b203c:
        puVar11 = puVar18 + 1;
        if ((long)puVar1 - (long)puVar20 != 0) {
          uVar12 = ((long)puVar1 - (long)puVar20) - 4;
          puVar22 = puVar1;
          if ((0x3b < uVar12) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar20) - lVar4)))) {
            uVar12 = (uVar12 >> 2) + 1;
            uVar9 = uVar12 & 0x7ffffffffffffff0;
            puVar22 = puVar1 + -uVar9;
            puVar18 = puVar18 + -uVar9;
            puVar16 = (undefined8 *)(puVar1 + -8);
            puVar17 = (undefined8 *)(lVar4 + lVar24 * 4 + -0x20);
            uVar13 = uVar9;
            do {
              uVar27 = *puVar16;
              uVar26 = puVar16[3];
              uVar25 = puVar16[2];
              uVar31 = puVar16[-3];
              uVar30 = puVar16[-4];
              uVar29 = puVar16[-1];
              uVar28 = puVar16[-2];
              puVar17[1] = puVar16[1];
              *puVar17 = uVar27;
              puVar17[3] = uVar26;
              puVar17[2] = uVar25;
              puVar17[-3] = uVar31;
              puVar17[-4] = uVar30;
              puVar17[-1] = uVar29;
              puVar17[-2] = uVar28;
              puVar16 = puVar16 + -8;
              puVar17 = puVar17 + -8;
              uVar13 = uVar13 - 0x10;
            } while (uVar13 != 0);
            if (uVar12 == uVar9) goto code_r0x006b20bc;
          }
          do {
            puVar22 = puVar22 + -1;
            puVar18 = puVar18 + -1;
            *puVar18 = *puVar22;
          } while (puVar22 != puVar20);
        }
code_r0x006b20bc:
        *(undefined4 **)(lVar5 + 0x28) = puVar18;
        *(undefined4 **)(lVar5 + 0x30) = puVar11;
        *(long *)(lVar5 + 0x38) = lVar3;
        if (puVar20 != (undefined4 *)0x0) {
          __ZdlPv(puVar20);
        }
        goto code_r0x006b20d0;
      }
      iVar7 = 0;
      if (uVar13 >> 0x3e == 0) {
        lVar4 = __Znwm(uVar13 << 2);
        puVar18 = (undefined4 *)(lVar4 + lVar24 * 4);
        lVar3 = lVar4 + uVar13 * 4;
        *puVar18 = 0x17;
        iVar7 = iVar8;
        goto joined_r0x006b203c;
      }
code_r0x006b2214:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar32 = func_0x00017f90();
  lVar5 = auVar32._0_8_;
  uVar2 = auVar32._8_4_ | iVar7 << 8;
  puVar15 = *(uint **)(lVar5 + 0x30);
  if (puVar15 < *(uint **)(lVar5 + 0x38)) {
    puVar23 = puVar15 + 1;
    *puVar15 = uVar2;
code_r0x006b2374:
    *(uint **)(lVar5 + 0x30) = puVar23;
    puVar1 = *(undefined4 **)(lVar5 + 0x48);
    if (puVar1 < *(undefined4 **)(lVar5 + 0x50)) {
      puVar20 = puVar1 + 1;
      *puVar1 = *(undefined4 *)(lVar5 + 0x1b8);
      goto code_r0x006b249c;
    }
    puVar18 = *(undefined4 **)(lVar5 + 0x40);
    lVar24 = (long)puVar1 - (long)puVar18 >> 2;
    uVar12 = lVar24 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar9 = (long)*(undefined4 **)(lVar5 + 0x50) - (long)puVar18;
      uVar13 = (long)uVar9 >> 1;
      if (uVar13 <= uVar12) {
        uVar13 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar9) {
        uVar13 = 0x3fffffffffffffff;
      }
      if (uVar13 == 0) {
        lVar3 = 0;
      }
      else {
        if (uVar13 >> 0x3e != 0) goto code_r0x006b24b8;
        lVar3 = __Znwm(uVar13 << 2);
      }
      puVar11 = (undefined4 *)(lVar3 + lVar24 * 4);
      puVar20 = puVar11 + 1;
      *puVar11 = *(undefined4 *)(lVar5 + 0x1b8);
      if ((long)puVar1 - (long)puVar18 != 0) {
        uVar12 = ((long)puVar1 - (long)puVar18) - 4;
        puVar22 = puVar1;
        if ((0x3b < uVar12) &&
           (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar18) - lVar3)))) {
          uVar12 = (uVar12 >> 2) + 1;
          uVar14 = uVar12 & 0x7ffffffffffffff0;
          puVar22 = puVar1 + -uVar14;
          puVar11 = puVar11 + -uVar14;
          puVar16 = (undefined8 *)(puVar1 + -8);
          puVar17 = (undefined8 *)(lVar3 + lVar24 * 4 + -0x20);
          uVar9 = uVar14;
          do {
            uVar27 = *puVar16;
            uVar26 = puVar16[3];
            uVar25 = puVar16[2];
            uVar31 = puVar16[-3];
            uVar30 = puVar16[-4];
            uVar29 = puVar16[-1];
            uVar28 = puVar16[-2];
            puVar17[1] = puVar16[1];
            *puVar17 = uVar27;
            puVar17[3] = uVar26;
            puVar17[2] = uVar25;
            puVar17[-3] = uVar31;
            puVar17[-4] = uVar30;
            puVar17[-1] = uVar29;
            puVar17[-2] = uVar28;
            puVar16 = puVar16 + -8;
            puVar17 = puVar17 + -8;
            uVar9 = uVar9 - 0x10;
          } while (uVar9 != 0);
          if (uVar12 == uVar14) goto code_r0x006b2488;
        }
        do {
          puVar22 = puVar22 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar22;
        } while (puVar22 != puVar18);
      }
code_r0x006b2488:
      *(undefined4 **)(lVar5 + 0x40) = puVar11;
      *(undefined4 **)(lVar5 + 0x48) = puVar20;
      *(ulong *)(lVar5 + 0x50) = lVar3 + uVar13 * 4;
      if (puVar18 != (undefined4 *)0x0) {
        __ZdlPv(puVar18);
      }
code_r0x006b249c:
      *(undefined4 **)(lVar5 + 0x48) = puVar20;
      return;
    }
  }
  else {
    puVar19 = *(uint **)(lVar5 + 0x28);
    lVar24 = (long)puVar15 - (long)puVar19 >> 2;
    uVar12 = lVar24 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar9 = (long)*(uint **)(lVar5 + 0x38) - (long)puVar19;
      uVar13 = (long)uVar9 >> 1;
      if (uVar13 <= uVar12) {
        uVar13 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar9) {
        uVar13 = 0x3fffffffffffffff;
      }
      if (uVar13 == 0) {
        lVar4 = 0;
        puVar10 = (uint *)(lVar24 * 4);
        lVar3 = 0;
        *puVar10 = uVar2;
joined_r0x006b22e0:
        puVar23 = puVar10 + 1;
        if ((long)puVar15 - (long)puVar19 != 0) {
          uVar12 = ((long)puVar15 - (long)puVar19) - 4;
          puVar21 = puVar15;
          if ((0x3b < uVar12) &&
             (0x3f < (ulong)((long)puVar15 - (((long)puVar15 - (long)puVar19) + lVar4)))) {
            uVar12 = (uVar12 >> 2) + 1;
            uVar9 = uVar12 & 0x7ffffffffffffff0;
            puVar21 = puVar15 + -uVar9;
            puVar10 = puVar10 + -uVar9;
            puVar15 = puVar15 + -8;
            puVar16 = (undefined8 *)(lVar4 + lVar24 * 4 + -0x20);
            uVar13 = uVar9;
            do {
              uVar27 = *(undefined8 *)puVar15;
              uVar26 = *(undefined8 *)(puVar15 + 6);
              uVar25 = *(undefined8 *)(puVar15 + 4);
              uVar31 = *(undefined8 *)(puVar15 + -6);
              uVar30 = *(undefined8 *)(puVar15 + -8);
              uVar29 = *(undefined8 *)(puVar15 + -2);
              uVar28 = *(undefined8 *)(puVar15 + -4);
              puVar16[1] = *(undefined8 *)(puVar15 + 2);
              *puVar16 = uVar27;
              puVar16[3] = uVar26;
              puVar16[2] = uVar25;
              puVar16[-3] = uVar31;
              puVar16[-4] = uVar30;
              puVar16[-1] = uVar29;
              puVar16[-2] = uVar28;
              puVar15 = puVar15 + -0x10;
              puVar16 = puVar16 + -8;
              uVar13 = uVar13 - 0x10;
            } while (uVar13 != 0);
            if (uVar12 == uVar9) goto code_r0x006b2360;
          }
          do {
            puVar21 = puVar21 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar21;
          } while (puVar21 != puVar19);
        }
code_r0x006b2360:
        *(uint **)(lVar5 + 0x28) = puVar10;
        *(uint **)(lVar5 + 0x30) = puVar23;
        *(long *)(lVar5 + 0x38) = lVar3;
        if (puVar19 != (uint *)0x0) {
          __ZdlPv(puVar19);
        }
        goto code_r0x006b2374;
      }
      if (uVar13 >> 0x3e == 0) {
        lVar4 = __Znwm(uVar13 << 2);
        puVar10 = (uint *)(lVar4 + lVar24 * 4);
        lVar3 = lVar4 + uVar13 * 4;
        *puVar10 = uVar2;
        goto joined_r0x006b22e0;
      }
code_r0x006b24b8:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar32 = func_0x00017f90();
  uVar6 = auVar32._8_4_;
  lVar5 = auVar32._0_8_;
  puVar1 = *(undefined4 **)(lVar5 + 0x30);
  if (*(undefined4 **)(lVar5 + 0x38) <= puVar1) {
    puVar20 = *(undefined4 **)(lVar5 + 0x28);
    lVar24 = (long)puVar1 - (long)puVar20 >> 2;
    uVar12 = lVar24 + 1;
    if (uVar12 >> 0x3e == 0) {
      uVar9 = (long)*(undefined4 **)(lVar5 + 0x38) - (long)puVar20;
      uVar13 = (long)uVar9 >> 1;
      if (uVar13 <= uVar12) {
        uVar13 = uVar12;
      }
      if (0x7ffffffffffffffb < uVar9) {
        uVar13 = 0x3fffffffffffffff;
      }
      if (uVar13 == 0) {
        lVar4 = 0;
        puVar18 = (undefined4 *)(lVar24 * 4);
        lVar3 = 0;
        *puVar18 = uVar6;
joined_r0x006b2584:
        puVar11 = puVar18 + 1;
        if ((long)puVar1 - (long)puVar20 != 0) {
          uVar12 = ((long)puVar1 - (long)puVar20) - 4;
          puVar22 = puVar1;
          if ((0x3b < uVar12) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar20) - lVar4)))) {
            uVar12 = (uVar12 >> 2) + 1;
            uVar9 = uVar12 & 0x7ffffffffffffff0;
            puVar22 = puVar1 + -uVar9;
            puVar18 = puVar18 + -uVar9;
            puVar16 = (undefined8 *)(puVar1 + -8);
            puVar17 = (undefined8 *)(lVar4 + lVar24 * 4 + -0x20);
            uVar13 = uVar9;
            do {
              uVar27 = *puVar16;
              uVar26 = puVar16[3];
              uVar25 = puVar16[2];
              uVar31 = puVar16[-3];
              uVar30 = puVar16[-4];
              uVar29 = puVar16[-1];
              uVar28 = puVar16[-2];
              puVar17[1] = puVar16[1];
              *puVar17 = uVar27;
              puVar17[3] = uVar26;
              puVar17[2] = uVar25;
              puVar17[-3] = uVar31;
              puVar17[-4] = uVar30;
              puVar17[-1] = uVar29;
              puVar17[-2] = uVar28;
              puVar16 = puVar16 + -8;
              puVar17 = puVar17 + -8;
              uVar13 = uVar13 - 0x10;
            } while (uVar13 != 0);
            if (uVar12 == uVar9) goto code_r0x006b2604;
          }
          do {
            puVar22 = puVar22 + -1;
            puVar18 = puVar18 + -1;
            *puVar18 = *puVar22;
          } while (puVar22 != puVar20);
        }
code_r0x006b2604:
        *(undefined4 **)(lVar5 + 0x28) = puVar18;
        *(undefined4 **)(lVar5 + 0x30) = puVar11;
        *(long *)(lVar5 + 0x38) = lVar3;
        if (puVar20 != (undefined4 *)0x0) {
          __ZdlPv(puVar20);
        }
        goto code_r0x006b2618;
      }
      if (uVar13 >> 0x3e == 0) {
        lVar4 = __Znwm(uVar13 << 2);
        puVar18 = (undefined4 *)(lVar4 + lVar24 * 4);
        lVar3 = lVar4 + uVar13 * 4;
        *puVar18 = uVar6;
        goto joined_r0x006b2584;
      }
code_r0x006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
code_r0x006b2764:
    lVar5 = func_0x00017f90();
    *(long *)(lVar5 + 0x30) = *(long *)(lVar5 + 0x30) + -4;
    *(long *)(lVar5 + 0x48) = *(long *)(lVar5 + 0x48) + -4;
    return;
  }
  puVar11 = puVar1 + 1;
  *puVar1 = uVar6;
code_r0x006b2618:
  *(undefined4 **)(lVar5 + 0x30) = puVar11;
  puVar1 = *(undefined4 **)(lVar5 + 0x48);
  if (puVar1 < *(undefined4 **)(lVar5 + 0x50)) {
    puVar20 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(lVar5 + 0x1b8);
    goto code_r0x006b2740;
  }
  puVar18 = *(undefined4 **)(lVar5 + 0x40);
  lVar24 = (long)puVar1 - (long)puVar18 >> 2;
  uVar12 = lVar24 + 1;
  if (uVar12 >> 0x3e != 0) goto code_r0x006b2764;
  uVar9 = (long)*(undefined4 **)(lVar5 + 0x50) - (long)puVar18;
  uVar13 = (long)uVar9 >> 1;
  if (uVar13 <= uVar12) {
    uVar13 = uVar12;
  }
  if (0x7ffffffffffffffb < uVar9) {
    uVar13 = 0x3fffffffffffffff;
  }
  if (uVar13 == 0) {
    lVar3 = 0;
  }
  else {
    if (uVar13 >> 0x3e != 0) goto code_r0x006b275c;
    lVar3 = __Znwm(uVar13 << 2);
  }
  puVar11 = (undefined4 *)(lVar3 + lVar24 * 4);
  puVar20 = puVar11 + 1;
  *puVar11 = *(undefined4 *)(lVar5 + 0x1b8);
  if ((long)puVar1 - (long)puVar18 != 0) {
    uVar12 = ((long)puVar1 - (long)puVar18) - 4;
    puVar22 = puVar1;
    if ((0x3b < uVar12) &&
       (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar18) - lVar3)))) {
      uVar12 = (uVar12 >> 2) + 1;
      uVar14 = uVar12 & 0x7ffffffffffffff0;
      puVar22 = puVar1 + -uVar14;
      puVar11 = puVar11 + -uVar14;
      puVar16 = (undefined8 *)(puVar1 + -8);
      puVar17 = (undefined8 *)(lVar3 + lVar24 * 4 + -0x20);
      uVar9 = uVar14;
      do {
        uVar27 = *puVar16;
        uVar26 = puVar16[3];
        uVar25 = puVar16[2];
        uVar31 = puVar16[-3];
        uVar30 = puVar16[-4];
        uVar29 = puVar16[-1];
        uVar28 = puVar16[-2];
        puVar17[1] = puVar16[1];
        *puVar17 = uVar27;
        puVar17[3] = uVar26;
        puVar17[2] = uVar25;
        puVar17[-3] = uVar31;
        puVar17[-4] = uVar30;
        puVar17[-1] = uVar29;
        puVar17[-2] = uVar28;
        puVar16 = puVar16 + -8;
        puVar17 = puVar17 + -8;
        uVar9 = uVar9 - 0x10;
      } while (uVar9 != 0);
      if (uVar12 == uVar14) goto code_r0x006b272c;
    }
    do {
      puVar22 = puVar22 + -1;
      puVar11 = puVar11 + -1;
      *puVar11 = *puVar22;
    } while (puVar22 != puVar18);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar5 + 0x40) = puVar11;
  *(undefined4 **)(lVar5 + 0x48) = puVar20;
  *(ulong *)(lVar5 + 0x50) = lVar3 + uVar13 * 4;
  if (puVar18 != (undefined4 *)0x0) {
    __ZdlPv(puVar18);
  }
code_r0x006b2740:
  *(undefined4 **)(lVar5 + 0x48) = puVar20;
  return;
}

