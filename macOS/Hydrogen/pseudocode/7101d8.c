
void FUN_007101d8(undefined8 param_1,undefined8 *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined8 *puVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  long lVar16;
  long unaff_x28;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  long *in_stack_00000018;
  
  *(undefined8 **)(unaff_x19 + 0x148) = param_2;
  *param_2 = 1;
  *(undefined8 **)(unaff_x19 + 0x150) = param_2 + 1;
  *(undefined8 *)(unaff_x19 + 0x158) = param_1;
  uVar3 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x118) = uVar3;
  uVar3 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x120) = uVar3;
  uVar3 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x128) = uVar3;
  uVar3 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x130) = uVar3;
  func_0x00710b24();
  *(undefined4 *)*unaff_x21 = 1;
  func_0x0070ba3c();
  func_0x00710d48();
  *(undefined1 *)(unaff_x19 + 0x110) = 0;
  puVar13 = *(undefined8 **)(unaff_x19 + 400);
  if ((ulong)(*(long *)(unaff_x19 + 0x1a0) - (long)puVar13) < 0x80) {
    puVar14 = *(undefined8 **)(unaff_x19 + 0x198);
    lVar4 = __Znwm(0x80);
    uVar12 = (long)puVar14 - (long)puVar13;
    puVar2 = (undefined8 *)(lVar4 + (uVar12 & 0xfffffffffffffff8));
    puVar7 = puVar2;
    if (uVar12 != 0) {
      puVar15 = puVar14;
      if ((0x57 < uVar12 - 8) && (0x3f < (long)puVar14 + (-(uVar12 & 0xfffffffffffffff8) - lVar4)))
      {
        uVar1 = (uVar12 - 8 >> 3) + 1;
        uVar10 = uVar1 & 0x3ffffffffffffff8;
        puVar15 = puVar14 + -uVar10;
        puVar7 = puVar2 + -uVar10;
        puVar14 = puVar14 + -4;
        puVar11 = (undefined8 *)(lVar4 + ((long)uVar12 >> 3) * 8 + -0x20);
        uVar12 = uVar10;
        do {
          uVar17 = *puVar14;
          uVar18 = puVar14[3];
          uVar3 = puVar14[2];
          uVar22 = puVar14[-3];
          uVar21 = puVar14[-4];
          uVar20 = puVar14[-1];
          uVar19 = puVar14[-2];
          puVar11[1] = puVar14[1];
          *puVar11 = uVar17;
          puVar11[3] = uVar18;
          puVar11[2] = uVar3;
          puVar11[-3] = uVar22;
          puVar11[-4] = uVar21;
          puVar11[-1] = uVar20;
          puVar11[-2] = uVar19;
          puVar14 = puVar14 + -8;
          puVar11 = puVar11 + -8;
          uVar12 = uVar12 - 8;
        } while (uVar12 != 0);
        if (uVar1 == uVar10) goto code_r0x0071033c;
      }
      do {
        puVar15 = puVar15 + -1;
        puVar7 = puVar7 + -1;
        *puVar7 = *puVar15;
      } while (puVar15 != puVar13);
    }
code_r0x0071033c:
    *(undefined8 **)(unaff_x19 + 400) = puVar7;
    *(undefined8 **)(unaff_x19 + 0x198) = puVar2;
    *(long *)(unaff_x19 + 0x1a0) = lVar4 + 0x80;
    if (puVar13 != (undefined8 *)0x0) {
      __ZdlPv(puVar13);
    }
  }
  puVar13 = *(undefined8 **)(unaff_x19 + 0x1f0);
  if ((ulong)(*(long *)(unaff_x19 + 0x200) - (long)puVar13) < 0x80) {
    puVar14 = *(undefined8 **)(unaff_x19 + 0x1f8);
    lVar4 = __Znwm(0x80);
    uVar12 = (long)puVar14 - (long)puVar13;
    puVar2 = (undefined8 *)(lVar4 + (uVar12 & 0xfffffffffffffff8));
    puVar7 = puVar2;
    if (uVar12 != 0) {
      puVar15 = puVar14;
      if ((0x57 < uVar12 - 8) && (0x3f < (long)puVar14 + (-(uVar12 & 0xfffffffffffffff8) - lVar4)))
      {
        uVar1 = (uVar12 - 8 >> 3) + 1;
        uVar10 = uVar1 & 0x3ffffffffffffff8;
        puVar15 = puVar14 + -uVar10;
        puVar7 = puVar2 + -uVar10;
        puVar14 = puVar14 + -4;
        puVar11 = (undefined8 *)(lVar4 + ((long)uVar12 >> 3) * 8 + -0x20);
        uVar12 = uVar10;
        do {
          uVar17 = *puVar14;
          uVar18 = puVar14[3];
          uVar3 = puVar14[2];
          uVar22 = puVar14[-3];
          uVar21 = puVar14[-4];
          uVar20 = puVar14[-1];
          uVar19 = puVar14[-2];
          puVar11[1] = puVar14[1];
          *puVar11 = uVar17;
          puVar11[3] = uVar18;
          puVar11[2] = uVar3;
          puVar11[-3] = uVar22;
          puVar11[-4] = uVar21;
          puVar11[-1] = uVar20;
          puVar11[-2] = uVar19;
          puVar14 = puVar14 + -8;
          puVar11 = puVar11 + -8;
          uVar12 = uVar12 - 8;
        } while (uVar12 != 0);
        if (uVar1 == uVar10) goto code_r0x0071041c;
      }
      do {
        puVar15 = puVar15 + -1;
        puVar7 = puVar7 + -1;
        *puVar7 = *puVar15;
      } while (puVar15 != puVar13);
    }
code_r0x0071041c:
    *(undefined8 **)(unaff_x19 + 0x1f0) = puVar7;
    *(undefined8 **)(unaff_x19 + 0x1f8) = puVar2;
    *(long *)(unaff_x19 + 0x200) = lVar4 + 0x80;
    if (puVar13 != (undefined8 *)0x0) {
      __ZdlPv(puVar13);
    }
  }
  puVar13 = *(undefined8 **)(unaff_x19 + 0x238);
  if ((ulong)(*(long *)(unaff_x19 + 0x248) - (long)puVar13) < 0x80) {
    puVar14 = *(undefined8 **)(unaff_x19 + 0x240);
    lVar4 = __Znwm(0x80);
    uVar12 = (long)puVar14 - (long)puVar13;
    puVar2 = (undefined8 *)(lVar4 + (uVar12 & 0xfffffffffffffff8));
    puVar7 = puVar2;
    if (uVar12 != 0) {
      puVar15 = puVar14;
      if ((0x57 < uVar12 - 8) && (0x3f < (long)puVar14 + (-(uVar12 & 0xfffffffffffffff8) - lVar4)))
      {
        uVar1 = (uVar12 - 8 >> 3) + 1;
        uVar10 = uVar1 & 0x3ffffffffffffff8;
        puVar15 = puVar14 + -uVar10;
        puVar7 = puVar2 + -uVar10;
        puVar14 = puVar14 + -4;
        puVar11 = (undefined8 *)(lVar4 + ((long)uVar12 >> 3) * 8 + -0x20);
        uVar12 = uVar10;
        do {
          uVar17 = *puVar14;
          uVar18 = puVar14[3];
          uVar3 = puVar14[2];
          uVar22 = puVar14[-3];
          uVar21 = puVar14[-4];
          uVar20 = puVar14[-1];
          uVar19 = puVar14[-2];
          puVar11[1] = puVar14[1];
          *puVar11 = uVar17;
          puVar11[3] = uVar18;
          puVar11[2] = uVar3;
          puVar11[-3] = uVar22;
          puVar11[-4] = uVar21;
          puVar11[-1] = uVar20;
          puVar11[-2] = uVar19;
          puVar14 = puVar14 + -8;
          puVar11 = puVar11 + -8;
          uVar12 = uVar12 - 8;
        } while (uVar12 != 0);
        if (uVar1 == uVar10) goto code_r0x007104fc;
      }
      do {
        puVar15 = puVar15 + -1;
        puVar7 = puVar7 + -1;
        *puVar7 = *puVar15;
      } while (puVar15 != puVar13);
    }
code_r0x007104fc:
    *(undefined8 **)(unaff_x19 + 0x238) = puVar7;
    *(undefined8 **)(unaff_x19 + 0x240) = puVar2;
    *(long *)(unaff_x19 + 0x248) = lVar4 + 0x80;
    if (puVar13 != (undefined8 *)0x0) {
      __ZdlPv(puVar13);
    }
  }
  puVar13 = *(undefined8 **)(unaff_x19 + 0x2b0);
  if (0x7f < (ulong)(*(long *)(unaff_x19 + 0x2c0) - (long)puVar13)) goto LAB_007105f8;
  puVar14 = *(undefined8 **)(unaff_x19 + 0x2b8);
  lVar4 = __Znwm(0x80);
  uVar12 = (long)puVar14 - (long)puVar13;
  puVar2 = (undefined8 *)(lVar4 + (uVar12 & 0xfffffffffffffff8));
  puVar7 = puVar2;
  if (uVar12 != 0) {
    puVar15 = puVar14;
    if ((0x57 < uVar12 - 8) && (0x3f < (long)puVar14 + (-(uVar12 & 0xfffffffffffffff8) - lVar4))) {
      uVar1 = (uVar12 - 8 >> 3) + 1;
      uVar10 = uVar1 & 0x3ffffffffffffff8;
      puVar15 = puVar14 + -uVar10;
      puVar7 = puVar2 + -uVar10;
      puVar14 = puVar14 + -4;
      puVar11 = (undefined8 *)(lVar4 + ((long)uVar12 >> 3) * 8 + -0x20);
      uVar12 = uVar10;
      do {
        uVar17 = *puVar14;
        uVar18 = puVar14[3];
        uVar3 = puVar14[2];
        uVar22 = puVar14[-3];
        uVar21 = puVar14[-4];
        uVar20 = puVar14[-1];
        uVar19 = puVar14[-2];
        puVar11[1] = puVar14[1];
        *puVar11 = uVar17;
        puVar11[3] = uVar18;
        puVar11[2] = uVar3;
        puVar11[-3] = uVar22;
        puVar11[-4] = uVar21;
        puVar11[-1] = uVar20;
        puVar11[-2] = uVar19;
        puVar14 = puVar14 + -8;
        puVar11 = puVar11 + -8;
        uVar12 = uVar12 - 8;
      } while (uVar12 != 0);
      if (uVar1 == uVar10) goto LAB_007105e0;
    }
    do {
      puVar15 = puVar15 + -1;
      puVar7 = puVar7 + -1;
      *puVar7 = *puVar15;
    } while (puVar15 != puVar13);
  }
LAB_007105e0:
  *(undefined8 **)(unaff_x19 + 0x2b0) = puVar7;
  *(undefined8 **)(unaff_x19 + 0x2b8) = puVar2;
  *(long *)(unaff_x19 + 0x2c0) = lVar4 + 0x80;
  if (puVar13 != (undefined8 *)0x0) {
    __ZdlPv(puVar13);
  }
LAB_007105f8:
  lVar4 = *(long *)(unaff_x19 + 0x298);
  if ((ulong)((*(long *)(unaff_x19 + 0x2a8) - lVar4 >> 3) * -0x3333333333333333) < 0x10) {
    lVar16 = *(long *)(unaff_x19 + 0x2a0);
    lVar5 = __Znwm(0x280);
    lVar6 = lVar5 + ((lVar16 - lVar4) / 0x28) * 0x28;
    lVar9 = lVar6;
    if (lVar16 - lVar4 != 0) {
      lVar8 = lVar6;
      do {
        uVar18 = *(undefined8 *)(lVar16 + -0x20);
        uVar3 = *(undefined8 *)(lVar16 + -0x28);
        uVar19 = *(undefined8 *)(lVar16 + -0x10);
        uVar17 = *(undefined8 *)(lVar16 + -0x18);
        puVar13 = (undefined8 *)(lVar16 + -8);
        lVar16 = lVar16 + -0x28;
        lVar9 = lVar8 + -0x28;
        *(undefined8 *)(lVar8 + -8) = *puVar13;
        *(undefined8 *)(lVar8 + -0x10) = uVar19;
        *(undefined8 *)(lVar8 + -0x18) = uVar17;
        *(undefined8 *)(lVar8 + -0x20) = uVar18;
        *(undefined8 *)(lVar8 + -0x28) = uVar3;
        lVar8 = lVar9;
      } while (lVar16 != lVar4);
    }
    *(long *)(unaff_x19 + 0x298) = lVar9;
    *(long *)(unaff_x19 + 0x2a0) = lVar6;
    *(long *)(unaff_x19 + 0x2a8) = lVar5 + 0x280;
    if (lVar4 != 0) {
      __ZdlPv(lVar4);
    }
  }
  if (*(char *)(unaff_x22 + 0x50) != '\0') {
    if (in_stack_00000018 != (long *)(unaff_x22 + 8)) {
      uVar18 = *(undefined8 *)(unaff_x22 + 0x20);
      uVar3 = *(undefined8 *)(unaff_x22 + 0x18);
      if (*(long *)(unaff_x22 + 0x10) == 0) {
        lVar4 = 0;
        lVar9 = 0;
        lVar5 = *in_stack_00000018;
      }
      else {
        lVar9 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar4 = *(long *)(unaff_x22 + 0x10);
        if (lVar4 != 0) {
          lVar5 = 0;
          lVar16 = *(long *)(unaff_x22 + 8);
          lVar6 = lVar4;
          do {
            puVar13 = (undefined8 *)(lVar16 + lVar5);
            uVar17 = *puVar13;
            ((undefined8 *)(lVar9 + lVar5))[1] = puVar13[1];
            *(undefined8 *)(lVar9 + lVar5) = uVar17;
            lVar5 = lVar5 + 0x10;
            lVar6 = lVar6 + -1;
          } while (lVar6 != 0);
        }
        lVar5 = *in_stack_00000018;
      }
      if (lVar5 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar9;
      *(long *)(unaff_x19 + 0x170) = lVar4;
      *(undefined8 *)(unaff_x28 + 0x44) = uVar18;
      *(undefined8 *)(unaff_x28 + 0x3c) = uVar3;
    }
    if (unaff_x20 != unaff_x22 + 0x30) {
      func_0x006d0234();
    }
  }
  return;
}

