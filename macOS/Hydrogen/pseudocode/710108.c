
void FUN_00710108(void)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  int in_w8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x22;
  undefined8 *puVar16;
  undefined8 *puVar17;
  long lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000034;
  
  if (in_w8 != 0) {
    func_0x006d0634();
    *(undefined1 *)(unaff_x19 + 0x50) = 1;
  }
  *(undefined2 *)(unaff_x19 + 0x58) = *(undefined2 *)(unaff_x22 + 0x58);
  func_0x0070b9f4(unaff_x19 + 0x60);
  *(undefined8 *)(unaff_x19 + 0xe8) = 0;
  *(undefined8 *)(unaff_x19 + 0xe0) = 0;
  *(undefined8 *)(unaff_x19 + 0xd8) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0xf8) = 0;
  *(undefined8 *)(unaff_x19 + 0xf0) = 0;
  *(undefined8 *)(unaff_x19 + 0x108) = 0;
  *(undefined8 *)(unaff_x19 + 0x100) = 0;
  *(undefined1 *)(unaff_x19 + 0x110) = 1;
  *(undefined8 *)(unaff_x19 + 0x11c) = 0;
  *(undefined8 *)(unaff_x19 + 0x114) = 0;
  *(undefined8 *)(unaff_x19 + 300) = 0;
  *(undefined8 *)(unaff_x19 + 0x124) = 0;
  *(undefined4 *)(unaff_x19 + 0x134) = 0;
  uStack0000000000000020 = 0;
  in_stack_00000028 = 0;
  func_0x0070aa08(&uStack0000000000000030,&uStack0000000000000020,0);
  *(undefined4 *)(unaff_x19 + 0x138) = _uStack0000000000000030;
  *(undefined8 *)(unaff_x19 + 0x13c) = uStack0000000000000034;
  plVar1 = (long *)(unaff_x19 + 0x168);
  lVar2 = unaff_x19 + 400;
  *(undefined8 *)(unaff_x19 + 0x170) = 0;
  *(undefined8 *)(unaff_x19 + 0x168) = 0;
  *(undefined8 *)(unaff_x19 + 0x180) = 0;
  *(undefined8 *)(unaff_x19 + 0x178) = 0;
  *(undefined8 *)(unaff_x19 + 0x150) = 0;
  *(undefined8 *)(unaff_x19 + 0x148) = 0;
  *(undefined8 *)(unaff_x19 + 0x160) = 0;
  *(undefined8 *)(unaff_x19 + 0x158) = 0;
  _bzero(lVar2,0x2a8);
  puVar5 = (undefined8 *)__Znwm(0x40);
  *(undefined8 **)(unaff_x19 + 0x148) = puVar5;
  *puVar5 = 1;
  *(undefined8 **)(unaff_x19 + 0x150) = puVar5 + 1;
  *(undefined8 **)(unaff_x19 + 0x158) = puVar5 + 8;
  uVar6 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x118) = uVar6;
  uVar6 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x120) = uVar6;
  uVar6 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x128) = uVar6;
  uVar6 = func_0x0070b8b0();
  *(undefined8 *)(unaff_x19 + 0x130) = uVar6;
  _uStack0000000000000030 = 0;
  func_0x00710b24((undefined8 *)(unaff_x19 + 0x1c0),0x138,&uStack0000000000000030);
  **(undefined4 **)(unaff_x19 + 0x1c0) = 1;
  func_0x0070ba3c(unaff_x19 + 0x60,1);
  func_0x00710d48();
  *(undefined1 *)(unaff_x19 + 0x110) = 0;
  puVar5 = *(undefined8 **)(unaff_x19 + 400);
  if ((ulong)(*(long *)(unaff_x19 + 0x1a0) - (long)puVar5) < 0x80) {
    puVar16 = *(undefined8 **)(unaff_x19 + 0x198);
    lVar7 = __Znwm(0x80);
    uVar15 = (long)puVar16 - (long)puVar5;
    puVar4 = (undefined8 *)(lVar7 + (uVar15 & 0xfffffffffffffff8));
    puVar10 = puVar4;
    if (uVar15 != 0) {
      puVar17 = puVar16;
      if ((0x57 < uVar15 - 8) && (0x3f < (long)puVar16 + (-(uVar15 & 0xfffffffffffffff8) - lVar7)))
      {
        uVar3 = (uVar15 - 8 >> 3) + 1;
        uVar13 = uVar3 & 0x3ffffffffffffff8;
        puVar17 = puVar16 + -uVar13;
        puVar10 = puVar4 + -uVar13;
        puVar16 = puVar16 + -4;
        puVar14 = (undefined8 *)(lVar7 + ((long)uVar15 >> 3) * 8 + -0x20);
        uVar15 = uVar13;
        do {
          uVar19 = *puVar16;
          uVar20 = puVar16[3];
          uVar6 = puVar16[2];
          uVar24 = puVar16[-3];
          uVar23 = puVar16[-4];
          uVar22 = puVar16[-1];
          uVar21 = puVar16[-2];
          puVar14[1] = puVar16[1];
          *puVar14 = uVar19;
          puVar14[3] = uVar20;
          puVar14[2] = uVar6;
          puVar14[-3] = uVar24;
          puVar14[-4] = uVar23;
          puVar14[-1] = uVar22;
          puVar14[-2] = uVar21;
          puVar16 = puVar16 + -8;
          puVar14 = puVar14 + -8;
          uVar15 = uVar15 - 8;
        } while (uVar15 != 0);
        if (uVar3 == uVar13) goto code_r0x0071033c;
      }
      do {
        puVar17 = puVar17 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar17;
      } while (puVar17 != puVar5);
    }
code_r0x0071033c:
    *(undefined8 **)(unaff_x19 + 400) = puVar10;
    *(undefined8 **)(unaff_x19 + 0x198) = puVar4;
    *(long *)(unaff_x19 + 0x1a0) = lVar7 + 0x80;
    if (puVar5 != (undefined8 *)0x0) {
      __ZdlPv(puVar5);
    }
  }
  puVar5 = *(undefined8 **)(unaff_x19 + 0x1f0);
  if ((ulong)(*(long *)(unaff_x19 + 0x200) - (long)puVar5) < 0x80) {
    puVar16 = *(undefined8 **)(unaff_x19 + 0x1f8);
    lVar7 = __Znwm(0x80);
    uVar15 = (long)puVar16 - (long)puVar5;
    puVar4 = (undefined8 *)(lVar7 + (uVar15 & 0xfffffffffffffff8));
    puVar10 = puVar4;
    if (uVar15 != 0) {
      puVar17 = puVar16;
      if ((0x57 < uVar15 - 8) && (0x3f < (long)puVar16 + (-(uVar15 & 0xfffffffffffffff8) - lVar7)))
      {
        uVar3 = (uVar15 - 8 >> 3) + 1;
        uVar13 = uVar3 & 0x3ffffffffffffff8;
        puVar17 = puVar16 + -uVar13;
        puVar10 = puVar4 + -uVar13;
        puVar16 = puVar16 + -4;
        puVar14 = (undefined8 *)(lVar7 + ((long)uVar15 >> 3) * 8 + -0x20);
        uVar15 = uVar13;
        do {
          uVar19 = *puVar16;
          uVar20 = puVar16[3];
          uVar6 = puVar16[2];
          uVar24 = puVar16[-3];
          uVar23 = puVar16[-4];
          uVar22 = puVar16[-1];
          uVar21 = puVar16[-2];
          puVar14[1] = puVar16[1];
          *puVar14 = uVar19;
          puVar14[3] = uVar20;
          puVar14[2] = uVar6;
          puVar14[-3] = uVar24;
          puVar14[-4] = uVar23;
          puVar14[-1] = uVar22;
          puVar14[-2] = uVar21;
          puVar16 = puVar16 + -8;
          puVar14 = puVar14 + -8;
          uVar15 = uVar15 - 8;
        } while (uVar15 != 0);
        if (uVar3 == uVar13) goto code_r0x0071041c;
      }
      do {
        puVar17 = puVar17 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar17;
      } while (puVar17 != puVar5);
    }
code_r0x0071041c:
    *(undefined8 **)(unaff_x19 + 0x1f0) = puVar10;
    *(undefined8 **)(unaff_x19 + 0x1f8) = puVar4;
    *(long *)(unaff_x19 + 0x200) = lVar7 + 0x80;
    if (puVar5 != (undefined8 *)0x0) {
      __ZdlPv(puVar5);
    }
  }
  puVar5 = *(undefined8 **)(unaff_x19 + 0x238);
  if ((ulong)(*(long *)(unaff_x19 + 0x248) - (long)puVar5) < 0x80) {
    puVar16 = *(undefined8 **)(unaff_x19 + 0x240);
    lVar7 = __Znwm(0x80);
    uVar15 = (long)puVar16 - (long)puVar5;
    puVar4 = (undefined8 *)(lVar7 + (uVar15 & 0xfffffffffffffff8));
    puVar10 = puVar4;
    if (uVar15 != 0) {
      puVar17 = puVar16;
      if ((0x57 < uVar15 - 8) && (0x3f < (long)puVar16 + (-(uVar15 & 0xfffffffffffffff8) - lVar7)))
      {
        uVar3 = (uVar15 - 8 >> 3) + 1;
        uVar13 = uVar3 & 0x3ffffffffffffff8;
        puVar17 = puVar16 + -uVar13;
        puVar10 = puVar4 + -uVar13;
        puVar16 = puVar16 + -4;
        puVar14 = (undefined8 *)(lVar7 + ((long)uVar15 >> 3) * 8 + -0x20);
        uVar15 = uVar13;
        do {
          uVar19 = *puVar16;
          uVar20 = puVar16[3];
          uVar6 = puVar16[2];
          uVar24 = puVar16[-3];
          uVar23 = puVar16[-4];
          uVar22 = puVar16[-1];
          uVar21 = puVar16[-2];
          puVar14[1] = puVar16[1];
          *puVar14 = uVar19;
          puVar14[3] = uVar20;
          puVar14[2] = uVar6;
          puVar14[-3] = uVar24;
          puVar14[-4] = uVar23;
          puVar14[-1] = uVar22;
          puVar14[-2] = uVar21;
          puVar16 = puVar16 + -8;
          puVar14 = puVar14 + -8;
          uVar15 = uVar15 - 8;
        } while (uVar15 != 0);
        if (uVar3 == uVar13) goto code_r0x007104fc;
      }
      do {
        puVar17 = puVar17 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar17;
      } while (puVar17 != puVar5);
    }
code_r0x007104fc:
    *(undefined8 **)(unaff_x19 + 0x238) = puVar10;
    *(undefined8 **)(unaff_x19 + 0x240) = puVar4;
    *(long *)(unaff_x19 + 0x248) = lVar7 + 0x80;
    if (puVar5 != (undefined8 *)0x0) {
      __ZdlPv(puVar5);
    }
  }
  puVar5 = *(undefined8 **)(unaff_x19 + 0x2b0);
  if (0x7f < (ulong)(*(long *)(unaff_x19 + 0x2c0) - (long)puVar5)) goto LAB_007105f8;
  puVar16 = *(undefined8 **)(unaff_x19 + 0x2b8);
  lVar7 = __Znwm(0x80);
  uVar15 = (long)puVar16 - (long)puVar5;
  puVar4 = (undefined8 *)(lVar7 + (uVar15 & 0xfffffffffffffff8));
  puVar10 = puVar4;
  if (uVar15 != 0) {
    puVar17 = puVar16;
    if ((0x57 < uVar15 - 8) && (0x3f < (long)puVar16 + (-(uVar15 & 0xfffffffffffffff8) - lVar7))) {
      uVar3 = (uVar15 - 8 >> 3) + 1;
      uVar13 = uVar3 & 0x3ffffffffffffff8;
      puVar17 = puVar16 + -uVar13;
      puVar10 = puVar4 + -uVar13;
      puVar16 = puVar16 + -4;
      puVar14 = (undefined8 *)(lVar7 + ((long)uVar15 >> 3) * 8 + -0x20);
      uVar15 = uVar13;
      do {
        uVar19 = *puVar16;
        uVar20 = puVar16[3];
        uVar6 = puVar16[2];
        uVar24 = puVar16[-3];
        uVar23 = puVar16[-4];
        uVar22 = puVar16[-1];
        uVar21 = puVar16[-2];
        puVar14[1] = puVar16[1];
        *puVar14 = uVar19;
        puVar14[3] = uVar20;
        puVar14[2] = uVar6;
        puVar14[-3] = uVar24;
        puVar14[-4] = uVar23;
        puVar14[-1] = uVar22;
        puVar14[-2] = uVar21;
        puVar16 = puVar16 + -8;
        puVar14 = puVar14 + -8;
        uVar15 = uVar15 - 8;
      } while (uVar15 != 0);
      if (uVar3 == uVar13) goto LAB_007105e0;
    }
    do {
      puVar17 = puVar17 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar17;
    } while (puVar17 != puVar5);
  }
LAB_007105e0:
  *(undefined8 **)(unaff_x19 + 0x2b0) = puVar10;
  *(undefined8 **)(unaff_x19 + 0x2b8) = puVar4;
  *(long *)(unaff_x19 + 0x2c0) = lVar7 + 0x80;
  if (puVar5 != (undefined8 *)0x0) {
    __ZdlPv(puVar5);
  }
LAB_007105f8:
  lVar7 = *(long *)(unaff_x19 + 0x298);
  if ((ulong)((*(long *)(unaff_x19 + 0x2a8) - lVar7 >> 3) * -0x3333333333333333) < 0x10) {
    lVar18 = *(long *)(unaff_x19 + 0x2a0);
    lVar8 = __Znwm(0x280);
    lVar9 = lVar8 + ((lVar18 - lVar7) / 0x28) * 0x28;
    lVar12 = lVar9;
    if (lVar18 - lVar7 != 0) {
      lVar11 = lVar9;
      do {
        uVar20 = *(undefined8 *)(lVar18 + -0x20);
        uVar6 = *(undefined8 *)(lVar18 + -0x28);
        uVar21 = *(undefined8 *)(lVar18 + -0x10);
        uVar19 = *(undefined8 *)(lVar18 + -0x18);
        puVar5 = (undefined8 *)(lVar18 + -8);
        lVar18 = lVar18 + -0x28;
        lVar12 = lVar11 + -0x28;
        *(undefined8 *)(lVar11 + -8) = *puVar5;
        *(undefined8 *)(lVar11 + -0x10) = uVar21;
        *(undefined8 *)(lVar11 + -0x18) = uVar19;
        *(undefined8 *)(lVar11 + -0x20) = uVar20;
        *(undefined8 *)(lVar11 + -0x28) = uVar6;
        lVar11 = lVar12;
      } while (lVar18 != lVar7);
    }
    *(long *)(unaff_x19 + 0x298) = lVar12;
    *(long *)(unaff_x19 + 0x2a0) = lVar9;
    *(long *)(unaff_x19 + 0x2a8) = lVar8 + 0x280;
    if (lVar7 != 0) {
      __ZdlPv(lVar7);
    }
  }
  if (*(char *)(unaff_x22 + 0x50) != '\0') {
    if (plVar1 != (long *)(unaff_x22 + 8)) {
      uVar20 = *(undefined8 *)(unaff_x22 + 0x20);
      uVar6 = *(undefined8 *)(unaff_x22 + 0x18);
      if (*(long *)(unaff_x22 + 0x10) == 0) {
        lVar7 = 0;
        lVar12 = 0;
        lVar8 = *plVar1;
      }
      else {
        lVar12 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar7 = *(long *)(unaff_x22 + 0x10);
        if (lVar7 != 0) {
          lVar8 = 0;
          lVar18 = *(long *)(unaff_x22 + 8);
          lVar9 = lVar7;
          do {
            puVar5 = (undefined8 *)(lVar18 + lVar8);
            uVar19 = *puVar5;
            ((undefined8 *)(lVar12 + lVar8))[1] = puVar5[1];
            *(undefined8 *)(lVar12 + lVar8) = uVar19;
            lVar8 = lVar8 + 0x10;
            lVar9 = lVar9 + -1;
          } while (lVar9 != 0);
        }
        lVar8 = *plVar1;
      }
      if (lVar8 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar12;
      *(long *)(unaff_x19 + 0x170) = lVar7;
      *(undefined8 *)(unaff_x19 + 0x180) = uVar20;
      *(undefined8 *)(unaff_x19 + 0x178) = uVar6;
    }
    if (lVar2 != unaff_x22 + 0x30) {
      func_0x006d0234(lVar2,*(long *)(unaff_x22 + 0x30),*(long *)(unaff_x22 + 0x38),
                      *(long *)(unaff_x22 + 0x38) - *(long *)(unaff_x22 + 0x30) >> 3);
    }
  }
  return;
}

