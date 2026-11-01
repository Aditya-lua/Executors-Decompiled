
void FUN_006c68c0(long param_1,uint param_2,int param_3,int param_4)

{
  undefined4 *puVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined4 uVar6;
  ulong uVar7;
  uint *puVar8;
  undefined4 *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  uint *puVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined4 *puVar16;
  uint *puVar17;
  undefined4 *puVar18;
  uint *puVar19;
  undefined4 *puVar20;
  uint *puVar21;
  long lVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined1 auVar30 [12];
  
  uVar2 = param_2 | param_3 << 8 | param_4 << 0x10;
  puVar13 = *(uint **)(param_1 + 0x30);
  if (puVar13 < *(uint **)(param_1 + 0x38)) {
    puVar21 = puVar13 + 1;
    *puVar13 = uVar2;
code_r0x006b20d0:
    *(uint **)(param_1 + 0x30) = puVar21;
    puVar1 = *(undefined4 **)(param_1 + 0x48);
    if (puVar1 < *(undefined4 **)(param_1 + 0x50)) {
      puVar18 = puVar1 + 1;
      *puVar1 = *(undefined4 *)(param_1 + 0x1b8);
      goto code_r0x006b21f8;
    }
    puVar16 = *(undefined4 **)(param_1 + 0x40);
    lVar22 = (long)puVar1 - (long)puVar16 >> 2;
    uVar10 = lVar22 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(param_1 + 0x50) - (long)puVar16;
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
        if (uVar11 >> 0x3e != 0) goto code_r0x006b2214;
        lVar3 = __Znwm(uVar11 << 2);
      }
      puVar9 = (undefined4 *)(lVar3 + lVar22 * 4);
      puVar18 = puVar9 + 1;
      *puVar9 = *(undefined4 *)(param_1 + 0x1b8);
      if ((long)puVar1 - (long)puVar16 != 0) {
        uVar10 = ((long)puVar1 - (long)puVar16) - 4;
        puVar20 = puVar1;
        if ((0x3b < uVar10) &&
           (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar16) - lVar3)))) {
          uVar10 = (uVar10 >> 2) + 1;
          uVar12 = uVar10 & 0x7ffffffffffffff0;
          puVar20 = puVar1 + -uVar12;
          puVar9 = puVar9 + -uVar12;
          puVar14 = (undefined8 *)(puVar1 + -8);
          puVar15 = (undefined8 *)(lVar3 + lVar22 * 4 + -0x20);
          uVar7 = uVar12;
          do {
            uVar25 = *puVar14;
            uVar24 = puVar14[3];
            uVar23 = puVar14[2];
            uVar29 = puVar14[-3];
            uVar28 = puVar14[-4];
            uVar27 = puVar14[-1];
            uVar26 = puVar14[-2];
            puVar15[1] = puVar14[1];
            *puVar15 = uVar25;
            puVar15[3] = uVar24;
            puVar15[2] = uVar23;
            puVar15[-3] = uVar29;
            puVar15[-4] = uVar28;
            puVar15[-1] = uVar27;
            puVar15[-2] = uVar26;
            puVar14 = puVar14 + -8;
            puVar15 = puVar15 + -8;
            uVar7 = uVar7 - 0x10;
          } while (uVar7 != 0);
          if (uVar10 == uVar12) goto code_r0x006b21e4;
        }
        do {
          puVar20 = puVar20 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar20;
        } while (puVar20 != puVar16);
      }
code_r0x006b21e4:
      *(undefined4 **)(param_1 + 0x40) = puVar9;
      *(undefined4 **)(param_1 + 0x48) = puVar18;
      *(ulong *)(param_1 + 0x50) = lVar3 + uVar11 * 4;
      if (puVar16 != (undefined4 *)0x0) {
        __ZdlPv(puVar16);
      }
code_r0x006b21f8:
      *(undefined4 **)(param_1 + 0x48) = puVar18;
      return;
    }
  }
  else {
    puVar17 = *(uint **)(param_1 + 0x28);
    lVar22 = (long)puVar13 - (long)puVar17 >> 2;
    uVar10 = lVar22 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(param_1 + 0x38) - (long)puVar17;
      uVar11 = (long)uVar7 >> 1;
      if (uVar11 <= uVar10) {
        uVar11 = uVar10;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar11 = 0x3fffffffffffffff;
      }
      if (uVar11 == 0) {
        lVar4 = 0;
        puVar8 = (uint *)(lVar22 * 4);
        lVar3 = 0;
        *puVar8 = uVar2;
joined_r0x006b203c:
        puVar21 = puVar8 + 1;
        if ((long)puVar13 - (long)puVar17 != 0) {
          uVar10 = ((long)puVar13 - (long)puVar17) - 4;
          puVar19 = puVar13;
          if ((0x3b < uVar10) &&
             (0x3f < (ulong)((long)puVar13 + (-((long)puVar13 - (long)puVar17) - lVar4)))) {
            uVar10 = (uVar10 >> 2) + 1;
            uVar7 = uVar10 & 0x7ffffffffffffff0;
            puVar19 = puVar13 + -uVar7;
            puVar8 = puVar8 + -uVar7;
            puVar13 = puVar13 + -8;
            puVar14 = (undefined8 *)(lVar4 + lVar22 * 4 + -0x20);
            uVar11 = uVar7;
            do {
              uVar25 = *(undefined8 *)puVar13;
              uVar24 = *(undefined8 *)(puVar13 + 6);
              uVar23 = *(undefined8 *)(puVar13 + 4);
              uVar29 = *(undefined8 *)(puVar13 + -6);
              uVar28 = *(undefined8 *)(puVar13 + -8);
              uVar27 = *(undefined8 *)(puVar13 + -2);
              uVar26 = *(undefined8 *)(puVar13 + -4);
              puVar14[1] = *(undefined8 *)(puVar13 + 2);
              *puVar14 = uVar25;
              puVar14[3] = uVar24;
              puVar14[2] = uVar23;
              puVar14[-3] = uVar29;
              puVar14[-4] = uVar28;
              puVar14[-1] = uVar27;
              puVar14[-2] = uVar26;
              puVar13 = puVar13 + -0x10;
              puVar14 = puVar14 + -8;
              uVar11 = uVar11 - 0x10;
            } while (uVar11 != 0);
            if (uVar10 == uVar7) goto code_r0x006b20bc;
          }
          do {
            puVar19 = puVar19 + -1;
            puVar8 = puVar8 + -1;
            *puVar8 = *puVar19;
          } while (puVar19 != puVar17);
        }
code_r0x006b20bc:
        *(uint **)(param_1 + 0x28) = puVar8;
        *(uint **)(param_1 + 0x30) = puVar21;
        *(long *)(param_1 + 0x38) = lVar3;
        if (puVar17 != (uint *)0x0) {
          __ZdlPv(puVar17);
        }
        goto code_r0x006b20d0;
      }
      if (uVar11 >> 0x3e == 0) {
        lVar4 = __Znwm(uVar11 << 2);
        puVar8 = (uint *)(lVar4 + lVar22 * 4);
        lVar3 = lVar4 + uVar11 * 4;
        *puVar8 = uVar2;
        goto joined_r0x006b203c;
      }
code_r0x006b2214:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar30 = func_0x00017f90();
  lVar22 = auVar30._0_8_;
  uVar2 = auVar30._8_4_ | param_3 << 8;
  puVar13 = *(uint **)(lVar22 + 0x30);
  if (puVar13 < *(uint **)(lVar22 + 0x38)) {
    puVar21 = puVar13 + 1;
    *puVar13 = uVar2;
code_r0x006b2374:
    *(uint **)(lVar22 + 0x30) = puVar21;
    puVar1 = *(undefined4 **)(lVar22 + 0x48);
    if (puVar1 < *(undefined4 **)(lVar22 + 0x50)) {
      puVar18 = puVar1 + 1;
      *puVar1 = *(undefined4 *)(lVar22 + 0x1b8);
      goto code_r0x006b249c;
    }
    puVar16 = *(undefined4 **)(lVar22 + 0x40);
    lVar3 = (long)puVar1 - (long)puVar16 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(lVar22 + 0x50) - (long)puVar16;
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
      puVar18 = puVar9 + 1;
      *puVar9 = *(undefined4 *)(lVar22 + 0x1b8);
      if ((long)puVar1 - (long)puVar16 != 0) {
        uVar10 = ((long)puVar1 - (long)puVar16) - 4;
        puVar20 = puVar1;
        if ((0x3b < uVar10) &&
           (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar16) - lVar4)))) {
          uVar10 = (uVar10 >> 2) + 1;
          uVar12 = uVar10 & 0x7ffffffffffffff0;
          puVar20 = puVar1 + -uVar12;
          puVar9 = puVar9 + -uVar12;
          puVar14 = (undefined8 *)(puVar1 + -8);
          puVar15 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
          uVar7 = uVar12;
          do {
            uVar25 = *puVar14;
            uVar24 = puVar14[3];
            uVar23 = puVar14[2];
            uVar29 = puVar14[-3];
            uVar28 = puVar14[-4];
            uVar27 = puVar14[-1];
            uVar26 = puVar14[-2];
            puVar15[1] = puVar14[1];
            *puVar15 = uVar25;
            puVar15[3] = uVar24;
            puVar15[2] = uVar23;
            puVar15[-3] = uVar29;
            puVar15[-4] = uVar28;
            puVar15[-1] = uVar27;
            puVar15[-2] = uVar26;
            puVar14 = puVar14 + -8;
            puVar15 = puVar15 + -8;
            uVar7 = uVar7 - 0x10;
          } while (uVar7 != 0);
          if (uVar10 == uVar12) goto code_r0x006b2488;
        }
        do {
          puVar20 = puVar20 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar20;
        } while (puVar20 != puVar16);
      }
code_r0x006b2488:
      *(undefined4 **)(lVar22 + 0x40) = puVar9;
      *(undefined4 **)(lVar22 + 0x48) = puVar18;
      *(ulong *)(lVar22 + 0x50) = lVar4 + uVar11 * 4;
      if (puVar16 != (undefined4 *)0x0) {
        __ZdlPv(puVar16);
      }
code_r0x006b249c:
      *(undefined4 **)(lVar22 + 0x48) = puVar18;
      return;
    }
  }
  else {
    puVar17 = *(uint **)(lVar22 + 0x28);
    lVar3 = (long)puVar13 - (long)puVar17 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(uint **)(lVar22 + 0x38) - (long)puVar17;
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
        puVar21 = puVar8 + 1;
        if ((long)puVar13 - (long)puVar17 != 0) {
          uVar10 = ((long)puVar13 - (long)puVar17) - 4;
          puVar19 = puVar13;
          if ((0x3b < uVar10) &&
             (0x3f < (ulong)((long)puVar13 - (((long)puVar13 - (long)puVar17) + lVar5)))) {
            uVar10 = (uVar10 >> 2) + 1;
            uVar7 = uVar10 & 0x7ffffffffffffff0;
            puVar19 = puVar13 + -uVar7;
            puVar8 = puVar8 + -uVar7;
            puVar13 = puVar13 + -8;
            puVar14 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar11 = uVar7;
            do {
              uVar25 = *(undefined8 *)puVar13;
              uVar24 = *(undefined8 *)(puVar13 + 6);
              uVar23 = *(undefined8 *)(puVar13 + 4);
              uVar29 = *(undefined8 *)(puVar13 + -6);
              uVar28 = *(undefined8 *)(puVar13 + -8);
              uVar27 = *(undefined8 *)(puVar13 + -2);
              uVar26 = *(undefined8 *)(puVar13 + -4);
              puVar14[1] = *(undefined8 *)(puVar13 + 2);
              *puVar14 = uVar25;
              puVar14[3] = uVar24;
              puVar14[2] = uVar23;
              puVar14[-3] = uVar29;
              puVar14[-4] = uVar28;
              puVar14[-1] = uVar27;
              puVar14[-2] = uVar26;
              puVar13 = puVar13 + -0x10;
              puVar14 = puVar14 + -8;
              uVar11 = uVar11 - 0x10;
            } while (uVar11 != 0);
            if (uVar10 == uVar7) goto code_r0x006b2360;
          }
          do {
            puVar19 = puVar19 + -1;
            puVar8 = puVar8 + -1;
            *puVar8 = *puVar19;
          } while (puVar19 != puVar17);
        }
code_r0x006b2360:
        *(uint **)(lVar22 + 0x28) = puVar8;
        *(uint **)(lVar22 + 0x30) = puVar21;
        *(long *)(lVar22 + 0x38) = lVar4;
        if (puVar17 != (uint *)0x0) {
          __ZdlPv(puVar17);
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
  lVar22 = auVar30._0_8_;
  puVar1 = *(undefined4 **)(lVar22 + 0x30);
  if (*(undefined4 **)(lVar22 + 0x38) <= puVar1) {
    puVar18 = *(undefined4 **)(lVar22 + 0x28);
    lVar3 = (long)puVar1 - (long)puVar18 >> 2;
    uVar10 = lVar3 + 1;
    if (uVar10 >> 0x3e == 0) {
      uVar7 = (long)*(undefined4 **)(lVar22 + 0x38) - (long)puVar18;
      uVar11 = (long)uVar7 >> 1;
      if (uVar11 <= uVar10) {
        uVar11 = uVar10;
      }
      if (0x7ffffffffffffffb < uVar7) {
        uVar11 = 0x3fffffffffffffff;
      }
      if (uVar11 == 0) {
        lVar5 = 0;
        puVar16 = (undefined4 *)(lVar3 * 4);
        lVar4 = 0;
        *puVar16 = uVar6;
joined_r0x006b2584:
        puVar9 = puVar16 + 1;
        if ((long)puVar1 - (long)puVar18 != 0) {
          uVar10 = ((long)puVar1 - (long)puVar18) - 4;
          puVar20 = puVar1;
          if ((0x3b < uVar10) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar18) - lVar5)))) {
            uVar10 = (uVar10 >> 2) + 1;
            uVar7 = uVar10 & 0x7ffffffffffffff0;
            puVar20 = puVar1 + -uVar7;
            puVar16 = puVar16 + -uVar7;
            puVar14 = (undefined8 *)(puVar1 + -8);
            puVar15 = (undefined8 *)(lVar5 + lVar3 * 4 + -0x20);
            uVar11 = uVar7;
            do {
              uVar25 = *puVar14;
              uVar24 = puVar14[3];
              uVar23 = puVar14[2];
              uVar29 = puVar14[-3];
              uVar28 = puVar14[-4];
              uVar27 = puVar14[-1];
              uVar26 = puVar14[-2];
              puVar15[1] = puVar14[1];
              *puVar15 = uVar25;
              puVar15[3] = uVar24;
              puVar15[2] = uVar23;
              puVar15[-3] = uVar29;
              puVar15[-4] = uVar28;
              puVar15[-1] = uVar27;
              puVar15[-2] = uVar26;
              puVar14 = puVar14 + -8;
              puVar15 = puVar15 + -8;
              uVar11 = uVar11 - 0x10;
            } while (uVar11 != 0);
            if (uVar10 == uVar7) goto code_r0x006b2604;
          }
          do {
            puVar20 = puVar20 + -1;
            puVar16 = puVar16 + -1;
            *puVar16 = *puVar20;
          } while (puVar20 != puVar18);
        }
code_r0x006b2604:
        *(undefined4 **)(lVar22 + 0x28) = puVar16;
        *(undefined4 **)(lVar22 + 0x30) = puVar9;
        *(long *)(lVar22 + 0x38) = lVar4;
        if (puVar18 != (undefined4 *)0x0) {
          __ZdlPv(puVar18);
        }
        goto code_r0x006b2618;
      }
      if (uVar11 >> 0x3e == 0) {
        lVar5 = __Znwm(uVar11 << 2);
        puVar16 = (undefined4 *)(lVar5 + lVar3 * 4);
        lVar4 = lVar5 + uVar11 * 4;
        *puVar16 = uVar6;
        goto joined_r0x006b2584;
      }
code_r0x006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
code_r0x006b2764:
    lVar22 = func_0x00017f90();
    *(long *)(lVar22 + 0x30) = *(long *)(lVar22 + 0x30) + -4;
    *(long *)(lVar22 + 0x48) = *(long *)(lVar22 + 0x48) + -4;
    return;
  }
  puVar9 = puVar1 + 1;
  *puVar1 = uVar6;
code_r0x006b2618:
  *(undefined4 **)(lVar22 + 0x30) = puVar9;
  puVar1 = *(undefined4 **)(lVar22 + 0x48);
  if (puVar1 < *(undefined4 **)(lVar22 + 0x50)) {
    puVar18 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(lVar22 + 0x1b8);
    goto code_r0x006b2740;
  }
  puVar16 = *(undefined4 **)(lVar22 + 0x40);
  lVar3 = (long)puVar1 - (long)puVar16 >> 2;
  uVar10 = lVar3 + 1;
  if (uVar10 >> 0x3e != 0) goto code_r0x006b2764;
  uVar7 = (long)*(undefined4 **)(lVar22 + 0x50) - (long)puVar16;
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
  puVar18 = puVar9 + 1;
  *puVar9 = *(undefined4 *)(lVar22 + 0x1b8);
  if ((long)puVar1 - (long)puVar16 != 0) {
    uVar10 = ((long)puVar1 - (long)puVar16) - 4;
    puVar20 = puVar1;
    if ((0x3b < uVar10) &&
       (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar16) - lVar4)))) {
      uVar10 = (uVar10 >> 2) + 1;
      uVar12 = uVar10 & 0x7ffffffffffffff0;
      puVar20 = puVar1 + -uVar12;
      puVar9 = puVar9 + -uVar12;
      puVar14 = (undefined8 *)(puVar1 + -8);
      puVar15 = (undefined8 *)(lVar4 + lVar3 * 4 + -0x20);
      uVar7 = uVar12;
      do {
        uVar25 = *puVar14;
        uVar24 = puVar14[3];
        uVar23 = puVar14[2];
        uVar29 = puVar14[-3];
        uVar28 = puVar14[-4];
        uVar27 = puVar14[-1];
        uVar26 = puVar14[-2];
        puVar15[1] = puVar14[1];
        *puVar15 = uVar25;
        puVar15[3] = uVar24;
        puVar15[2] = uVar23;
        puVar15[-3] = uVar29;
        puVar15[-4] = uVar28;
        puVar15[-1] = uVar27;
        puVar15[-2] = uVar26;
        puVar14 = puVar14 + -8;
        puVar15 = puVar15 + -8;
        uVar7 = uVar7 - 0x10;
      } while (uVar7 != 0);
      if (uVar10 == uVar12) goto code_r0x006b272c;
    }
    do {
      puVar20 = puVar20 + -1;
      puVar9 = puVar9 + -1;
      *puVar9 = *puVar20;
    } while (puVar20 != puVar16);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar22 + 0x40) = puVar9;
  *(undefined4 **)(lVar22 + 0x48) = puVar18;
  *(ulong *)(lVar22 + 0x50) = lVar4 + uVar11 * 4;
  if (puVar16 != (undefined4 *)0x0) {
    __ZdlPv(puVar16);
  }
code_r0x006b2740:
  *(undefined4 **)(lVar22 + 0x48) = puVar18;
  return;
}

