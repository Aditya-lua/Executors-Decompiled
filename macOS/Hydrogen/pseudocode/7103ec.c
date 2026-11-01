
void FUN_007103ec(undefined8 param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16])

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  undefined8 in_x9;
  long lVar5;
  undefined8 *in_x10;
  undefined8 *puVar6;
  long lVar7;
  long in_x11;
  long lVar8;
  long in_x12;
  ulong uVar9;
  undefined8 *in_x13;
  undefined8 *in_x14;
  undefined8 *in_x15;
  undefined8 *puVar10;
  long in_x16;
  ulong uVar11;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar12;
  undefined8 *puVar13;
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
  
  uVar22 = param_5._8_8_;
  uVar18 = param_5._0_8_;
  uVar20 = param_4._8_8_;
  uVar17 = param_4._0_8_;
  while( true ) {
    in_x15[-3] = uVar22;
    in_x15[-4] = uVar18;
    in_x15[-1] = uVar20;
    in_x15[-2] = uVar17;
    in_x16 = in_x16 + -8;
    if (in_x16 == 0) break;
    uVar21 = in_x14[-8];
    uVar19 = in_x14[-5];
    uVar16 = in_x14[-6];
    uVar22 = in_x14[-0xb];
    uVar18 = in_x14[-0xc];
    uVar20 = in_x14[-9];
    uVar17 = in_x14[-10];
    in_x15[-7] = in_x14[-7];
    in_x15[-8] = uVar21;
    in_x15[-5] = uVar19;
    in_x15[-6] = uVar16;
    in_x14 = in_x14 + -8;
    in_x15 = in_x15 + -8;
  }
  if (in_x11 != in_x12) {
    do {
      in_x13 = in_x13 + -1;
      in_x10 = in_x10 + -1;
      *in_x10 = *in_x13;
    } while (in_x13 != unaff_x23);
  }
  *(undefined8 **)(unaff_x19 + 0x1f0) = in_x10;
  *(undefined8 *)(unaff_x19 + 0x1f8) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x200) = param_1;
  if (unaff_x23 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x238);
  if ((ulong)(*(long *)(unaff_x19 + 0x248) - (long)puVar12) < 0x80) {
    puVar13 = *(undefined8 **)(unaff_x19 + 0x240);
    lVar3 = __Znwm(0x80);
    uVar11 = (long)puVar13 - (long)puVar12;
    puVar2 = (undefined8 *)(lVar3 + (uVar11 & 0xfffffffffffffff8));
    puVar6 = puVar2;
    if (uVar11 != 0) {
      puVar14 = puVar13;
      if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar3)))
      {
        uVar1 = (uVar11 - 8 >> 3) + 1;
        uVar9 = uVar1 & 0x3ffffffffffffff8;
        puVar14 = puVar13 + -uVar9;
        puVar6 = puVar2 + -uVar9;
        puVar13 = puVar13 + -4;
        puVar10 = (undefined8 *)(lVar3 + ((long)uVar11 >> 3) * 8 + -0x20);
        uVar11 = uVar9;
        do {
          uVar18 = *puVar13;
          uVar20 = puVar13[3];
          uVar17 = puVar13[2];
          uVar21 = puVar13[-3];
          uVar19 = puVar13[-4];
          uVar16 = puVar13[-1];
          uVar22 = puVar13[-2];
          puVar10[1] = puVar13[1];
          *puVar10 = uVar18;
          puVar10[3] = uVar20;
          puVar10[2] = uVar17;
          puVar10[-3] = uVar21;
          puVar10[-4] = uVar19;
          puVar10[-1] = uVar16;
          puVar10[-2] = uVar22;
          puVar13 = puVar13 + -8;
          puVar10 = puVar10 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar1 == uVar9) goto LAB_007104fc;
      }
      do {
        puVar14 = puVar14 + -1;
        puVar6 = puVar6 + -1;
        *puVar6 = *puVar14;
      } while (puVar14 != puVar12);
    }
LAB_007104fc:
    *(undefined8 **)(unaff_x19 + 0x238) = puVar6;
    *(undefined8 **)(unaff_x19 + 0x240) = puVar2;
    *(long *)(unaff_x19 + 0x248) = lVar3 + 0x80;
    if (puVar12 != (undefined8 *)0x0) {
      __ZdlPv(puVar12);
    }
  }
  puVar12 = *(undefined8 **)(unaff_x19 + 0x2b0);
  if (0x7f < (ulong)(*(long *)(unaff_x19 + 0x2c0) - (long)puVar12)) goto code_r0x007105f8;
  puVar13 = *(undefined8 **)(unaff_x19 + 0x2b8);
  lVar3 = __Znwm(0x80);
  uVar11 = (long)puVar13 - (long)puVar12;
  puVar2 = (undefined8 *)(lVar3 + (uVar11 & 0xfffffffffffffff8));
  puVar6 = puVar2;
  if (uVar11 != 0) {
    puVar14 = puVar13;
    if ((0x57 < uVar11 - 8) && (0x3f < (long)puVar13 + (-(uVar11 & 0xfffffffffffffff8) - lVar3))) {
      uVar1 = (uVar11 - 8 >> 3) + 1;
      uVar9 = uVar1 & 0x3ffffffffffffff8;
      puVar14 = puVar13 + -uVar9;
      puVar6 = puVar2 + -uVar9;
      puVar13 = puVar13 + -4;
      puVar10 = (undefined8 *)(lVar3 + ((long)uVar11 >> 3) * 8 + -0x20);
      uVar11 = uVar9;
      do {
        uVar18 = *puVar13;
        uVar20 = puVar13[3];
        uVar17 = puVar13[2];
        uVar21 = puVar13[-3];
        uVar19 = puVar13[-4];
        uVar16 = puVar13[-1];
        uVar22 = puVar13[-2];
        puVar10[1] = puVar13[1];
        *puVar10 = uVar18;
        puVar10[3] = uVar20;
        puVar10[2] = uVar17;
        puVar10[-3] = uVar21;
        puVar10[-4] = uVar19;
        puVar10[-1] = uVar16;
        puVar10[-2] = uVar22;
        puVar13 = puVar13 + -8;
        puVar10 = puVar10 + -8;
        uVar11 = uVar11 - 8;
      } while (uVar11 != 0);
      if (uVar1 == uVar9) goto code_r0x007105e0;
    }
    do {
      puVar14 = puVar14 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *puVar14;
    } while (puVar14 != puVar12);
  }
code_r0x007105e0:
  *(undefined8 **)(unaff_x19 + 0x2b0) = puVar6;
  *(undefined8 **)(unaff_x19 + 0x2b8) = puVar2;
  *(long *)(unaff_x19 + 0x2c0) = lVar3 + 0x80;
  if (puVar12 != (undefined8 *)0x0) {
    __ZdlPv(puVar12);
  }
code_r0x007105f8:
  lVar3 = *(long *)(unaff_x19 + 0x298);
  if ((ulong)((*(long *)(unaff_x19 + 0x2a8) - lVar3 >> 3) * -0x3333333333333333) < 0x10) {
    lVar15 = *(long *)(unaff_x19 + 0x2a0);
    lVar4 = __Znwm(0x280);
    lVar5 = lVar4 + ((lVar15 - lVar3) / 0x28) * 0x28;
    lVar8 = lVar5;
    if (lVar15 - lVar3 != 0) {
      lVar7 = lVar5;
      do {
        uVar20 = *(undefined8 *)(lVar15 + -0x20);
        uVar17 = *(undefined8 *)(lVar15 + -0x28);
        uVar22 = *(undefined8 *)(lVar15 + -0x10);
        uVar18 = *(undefined8 *)(lVar15 + -0x18);
        puVar12 = (undefined8 *)(lVar15 + -8);
        lVar15 = lVar15 + -0x28;
        lVar8 = lVar7 + -0x28;
        *(undefined8 *)(lVar7 + -8) = *puVar12;
        *(undefined8 *)(lVar7 + -0x10) = uVar22;
        *(undefined8 *)(lVar7 + -0x18) = uVar18;
        *(undefined8 *)(lVar7 + -0x20) = uVar20;
        *(undefined8 *)(lVar7 + -0x28) = uVar17;
        lVar7 = lVar8;
      } while (lVar15 != lVar3);
    }
    *(long *)(unaff_x19 + 0x298) = lVar8;
    *(long *)(unaff_x19 + 0x2a0) = lVar5;
    *(long *)(unaff_x19 + 0x2a8) = lVar4 + 0x280;
    if (lVar3 != 0) {
      __ZdlPv(lVar3);
    }
  }
  if (*(char *)(unaff_x22 + 0x50) != '\0') {
    if (in_stack_00000018 != (long *)(unaff_x22 + 8)) {
      uVar20 = *(undefined8 *)(unaff_x22 + 0x20);
      uVar17 = *(undefined8 *)(unaff_x22 + 0x18);
      if (*(long *)(unaff_x22 + 0x10) == 0) {
        lVar3 = 0;
        lVar8 = 0;
        lVar4 = *in_stack_00000018;
      }
      else {
        lVar8 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar3 = *(long *)(unaff_x22 + 0x10);
        if (lVar3 != 0) {
          lVar4 = 0;
          lVar15 = *(long *)(unaff_x22 + 8);
          lVar5 = lVar3;
          do {
            puVar12 = (undefined8 *)(lVar15 + lVar4);
            uVar18 = *puVar12;
            ((undefined8 *)(lVar8 + lVar4))[1] = puVar12[1];
            *(undefined8 *)(lVar8 + lVar4) = uVar18;
            lVar4 = lVar4 + 0x10;
            lVar5 = lVar5 + -1;
          } while (lVar5 != 0);
        }
        lVar4 = *in_stack_00000018;
      }
      if (lVar4 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar8;
      *(long *)(unaff_x19 + 0x170) = lVar3;
      *(undefined8 *)(unaff_x28 + 0x44) = uVar20;
      *(undefined8 *)(unaff_x28 + 0x3c) = uVar17;
    }
    if (unaff_x20 != unaff_x22 + 0x30) {
      func_0x006d0234();
    }
  }
  return;
}

