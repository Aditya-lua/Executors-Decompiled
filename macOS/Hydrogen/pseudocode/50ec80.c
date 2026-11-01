
void FUN_0050ec80(long param_1)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  code *pcVar6;
  bool in_ZR;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  undefined1 *puVar12;
  undefined8 *puVar13;
  long in_x9;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  long in_x10;
  ulong uVar17;
  ulong uVar18;
  undefined8 *puVar19;
  ulong uVar20;
  undefined8 *puVar21;
  long *plVar22;
  undefined8 *puVar23;
  ulong uVar24;
  long in_x15;
  long unaff_x20;
  undefined8 *puVar25;
  undefined8 *puVar26;
  long unaff_x21;
  undefined8 uVar27;
  undefined8 *unaff_x25;
  ulong uVar28;
  undefined8 uVar29;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  ulong uStack00000000000000a0;
  long lStack00000000000000c0;
  long lStack0000000000000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 uStack0000000000000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  
  if (!in_ZR) {
    in_x10 = in_x9;
  }
  param_1 = param_1 - in_x10;
  lVar11 = unaff_x21 - param_1;
  puVar25 = (undefined8 *)(in_x15 + 0x20);
  puVar21 = (undefined8 *)(unaff_x20 + 0x20);
  lVar8 = param_1;
  do {
    uVar33 = puVar21[-3];
    uVar31 = puVar21[-2];
    uVar34 = puVar21[-1];
    uVar36 = *puVar21;
    uVar40 = puVar21[1];
    uVar38 = puVar21[2];
    uVar42 = puVar21[3];
    puVar25[-4] = puVar21[-4];
    puVar25[-3] = uVar33;
    puVar25[-2] = uVar31;
    puVar25[-1] = uVar34;
    *puVar25 = uVar36;
    puVar25[1] = uVar40;
    puVar25[2] = uVar38;
    puVar25[3] = uVar42;
    puVar25 = puVar25 + 8;
    puVar21 = puVar21 + 8;
    lVar8 = lVar8 + -4;
  } while (lVar8 != 0);
  puVar25 = (undefined8 *)(in_x15 + param_1 * 0x10 + 8);
  puVar21 = (undefined8 *)(unaff_x20 + param_1 * 0x10);
  do {
    if (puVar21 == (undefined8 *)(unaff_x20 + unaff_x21 * 0x10)) break;
    uVar31 = puVar21[1];
    puVar25[-1] = *puVar21;
    *puVar25 = uVar31;
    puVar25 = puVar25 + 2;
    lVar11 = lVar11 + -1;
    puVar21 = puVar21 + 2;
  } while (lVar11 != 0);
  uVar31 = 0;
  uVar24 = unaff_x28[0x27];
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar24;
  uVar10 = uVar24 * 0x18;
  if ((SUB168(auVar4 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar10)) {
LAB_0050f554:
    func_0x007a1f00(uVar31,uVar10,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  uVar1 = *(undefined4 *)(unaff_x28 + 0x49);
  uVar33 = unaff_x28[0x45];
  uVar34 = unaff_x28[0x46];
  if (uVar10 == 0) {
    lStack0000000000000118 = 8;
  }
  else {
    puVar25 = (undefined8 *)unaff_x28[0x26];
    uVar31 = 8;
    lStack0000000000000118 = func_0x00187bd0(uVar10,8);
    if (lStack0000000000000118 == 0) goto LAB_0050f554;
    if (uVar24 != 0) {
      puVar12 = (undefined1 *)(lStack0000000000000118 + 0x10);
      uVar17 = uVar24;
      do {
        if (uVar10 == 0) break;
        uVar31 = *puVar25;
        uVar36 = puVar25[1];
        uVar3 = *(undefined1 *)(puVar25 + 2);
        puVar25 = puVar25 + 3;
        *(undefined8 *)(puVar12 + -0x10) = uVar31;
        *(undefined8 *)(puVar12 + -8) = uVar36;
        *puVar12 = uVar3;
        uVar10 = uVar10 - 0x18;
        uVar17 = uVar17 - 1;
        puVar12 = puVar12 + 0x18;
      } while (uVar17 != 0);
    }
  }
  uVar10 = unaff_x28[0x2a];
  uVar17 = uVar10 * 8;
  *(ulong *)(unaff_x29 + -0xa8) = uVar10;
  if (uVar10 >> 0x3d != 0 || 0x7ffffffffffffffc < uVar17) {
    uVar31 = 0;
LAB_0050f670:
    func_0x007a1f00(uVar31,uVar17,&UNK_009e7fe0);
    goto LAB_0050f6d8;
  }
  uVar36 = unaff_x28[0x29];
  if (uVar17 == 0) {
    uStack0000000000000140 = 0;
    lVar8 = 4;
  }
  else {
    uVar31 = 4;
    lVar8 = func_0x00187bd0(uVar17,4);
    if (lVar8 == 0) goto LAB_0050f670;
    uStack0000000000000140 = *(undefined8 *)(unaff_x29 + -0xa8);
  }
  _memcpy(lVar8,uVar36,uVar17);
  uVar31 = 0;
  uVar17 = unaff_x28[0x2d];
  uVar10 = uVar17 * 0x10;
  if ((uVar17 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar10)) {
LAB_0050f568:
    func_0x007a1f00(uVar31,uVar10,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  uVar36 = *unaff_x28;
  uVar38 = unaff_x28[1];
  if (uVar10 == 0) {
    *(undefined8 *)(unaff_x29 + -0xb8) = 8;
  }
  else {
    puVar25 = (undefined8 *)unaff_x28[0x2c];
    uVar31 = 8;
    lVar11 = func_0x00187bd0(uVar10,8);
    *(long *)(unaff_x29 + -0xb8) = lVar11;
    if (lVar11 == 0) goto LAB_0050f568;
    if (uVar17 == 0) goto LAB_0050ef50;
    uVar14 = uVar17 - 1;
    uVar10 = uVar17;
    if (uVar14 <= uVar17) {
      uVar10 = uVar14;
    }
    if (uVar10 < 8) {
LAB_0050eeb8:
      lVar11 = 0;
      uVar10 = uVar17;
      puVar26 = puVar25;
    }
    else {
      uVar15 = uVar17;
      if (uVar14 <= uVar17) {
        uVar15 = uVar14;
      }
      puVar21 = *(undefined8 **)(unaff_x29 + -0xb8);
      if ((puVar21 < puVar25 + uVar15 * 2 + 2) && (puVar25 < puVar21 + uVar15 * 2 + 2))
      goto LAB_0050eeb8;
      uVar14 = uVar10 + 1 & 3;
      uVar15 = 4;
      if (uVar14 != 0) {
        uVar15 = uVar14;
      }
      lVar11 = (uVar10 + 1) - uVar15;
      uVar10 = uVar17 - lVar11;
      puVar26 = puVar25 + lVar11 * 2;
      puVar21 = puVar21 + 4;
      puVar13 = puVar25 + 4;
      lVar9 = lVar11;
      do {
        uVar40 = puVar13[-3];
        uVar31 = puVar13[-2];
        uVar42 = puVar13[-1];
        uVar35 = *puVar13;
        uVar39 = puVar13[1];
        uVar37 = puVar13[2];
        uVar41 = puVar13[3];
        puVar21[-4] = puVar13[-4];
        puVar21[-3] = uVar40;
        puVar21[-2] = uVar31;
        puVar21[-1] = uVar42;
        *puVar21 = uVar35;
        puVar21[1] = uVar39;
        puVar21[2] = uVar37;
        puVar21[3] = uVar41;
        puVar21 = puVar21 + 8;
        puVar13 = puVar13 + 8;
        lVar9 = lVar9 + -4;
      } while (lVar9 != 0);
    }
    puVar21 = (undefined8 *)(*(long *)(unaff_x29 + -0xb8) + lVar11 * 0x10 + 8);
    do {
      if (puVar26 == puVar25 + uVar17 * 2) break;
      uVar31 = puVar26[1];
      puVar21[-1] = *puVar26;
      *puVar21 = uVar31;
      puVar21 = puVar21 + 2;
      uVar10 = uVar10 - 1;
      puVar26 = puVar26 + 2;
    } while (uVar10 != 0);
  }
LAB_0050ef50:
  uVar31 = unaff_x28[2];
  if ((int)uVar31 == 1) {
    uVar40 = unaff_x28[3];
    *(undefined8 *)(unaff_x29 + -0x78) = unaff_x28[4];
    *(undefined8 *)(unaff_x29 + -0x80) = uVar40;
  }
  else {
    uVar31 = 0;
  }
  uVar14 = unaff_x28[0x30];
  uVar10 = uVar14 * 0x10;
  if (uVar14 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar10) {
    uVar40 = 0;
code_r0x0050f68c:
    func_0x007a1f00(uVar40,uVar10,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  uVar2 = *(undefined4 *)((long)unaff_x28 + 0x24c);
  if (uVar10 == 0) {
    puVar25 = (undefined8 *)0x8;
  }
  else {
    puVar21 = (undefined8 *)unaff_x28[0x2f];
    uVar40 = 8;
    puVar25 = (undefined8 *)func_0x00187bd0(uVar10,8);
    if (puVar25 == (undefined8 *)0x0) goto code_r0x0050f68c;
    if (uVar14 == 0) goto code_r0x0050f0a8;
    uVar15 = uVar14 - 1;
    uVar10 = uVar14;
    if (uVar15 <= uVar14) {
      uVar10 = uVar15;
    }
    if (uVar10 < 8) {
code_r0x0050f004:
      lVar11 = 0;
      uVar10 = uVar14;
      puVar26 = puVar21;
    }
    else {
      uVar18 = uVar14;
      if (uVar15 <= uVar14) {
        uVar18 = uVar15;
      }
      if ((puVar25 < puVar21 + uVar18 * 2 + 2) && (puVar21 < puVar25 + uVar18 * 2 + 2))
      goto code_r0x0050f004;
      uVar15 = uVar10 + 1 & 3;
      uVar18 = 4;
      if (uVar15 != 0) {
        uVar18 = uVar15;
      }
      lVar11 = (uVar10 + 1) - uVar18;
      uVar10 = uVar14 - lVar11;
      puVar26 = puVar21 + lVar11 * 2;
      puVar13 = puVar25 + 4;
      puVar19 = puVar21 + 4;
      lVar9 = lVar11;
      do {
        uVar42 = puVar19[-3];
        uVar40 = puVar19[-2];
        uVar35 = puVar19[-1];
        uVar37 = *puVar19;
        uVar41 = puVar19[1];
        uVar39 = puVar19[2];
        uVar43 = puVar19[3];
        puVar13[-4] = puVar19[-4];
        puVar13[-3] = uVar42;
        puVar13[-2] = uVar40;
        puVar13[-1] = uVar35;
        *puVar13 = uVar37;
        puVar13[1] = uVar41;
        puVar13[2] = uVar39;
        puVar13[3] = uVar43;
        puVar13 = puVar13 + 8;
        puVar19 = puVar19 + 8;
        lVar9 = lVar9 + -4;
      } while (lVar9 != 0);
    }
    puVar13 = puVar25 + lVar11 * 2 + 1;
    do {
      if (puVar26 == puVar21 + uVar14 * 2) break;
      uVar40 = puVar26[1];
      puVar13[-1] = *puVar26;
      *puVar13 = uVar40;
      puVar13 = puVar13 + 2;
      uVar10 = uVar10 - 1;
      puVar26 = puVar26 + 2;
    } while (uVar10 != 0);
  }
code_r0x0050f0a8:
  uVar40 = 0;
  uVar15 = unaff_x28[0x33];
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar15;
  uVar10 = uVar15 * 0x30;
  if ((SUB168(auVar5 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar10)) {
LAB_0050f57c:
    func_0x007a1f00(uVar40,uVar10,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar10 == 0) {
    lStack00000000000000c0 = 8;
  }
  else {
    puVar21 = (undefined8 *)unaff_x28[0x32];
    uVar40 = 8;
    lStack00000000000000c0 = func_0x00187bd0(uVar10,8);
    if (lStack00000000000000c0 == 0) goto LAB_0050f57c;
    if (uVar15 != 0) {
      puVar26 = (undefined8 *)(lStack00000000000000c0 + 0x18);
      uVar18 = uVar15;
      do {
        if (uVar10 == 0) break;
        puVar13 = puVar21 + 1;
        uVar35 = *puVar21;
        uVar39 = puVar21[3];
        uVar37 = puVar21[2];
        uVar40 = puVar21[4];
        uVar42 = puVar21[5];
        puVar21 = puVar21 + 6;
        puVar26[-2] = *puVar13;
        puVar26[-3] = uVar35;
        *puVar26 = uVar39;
        puVar26[-1] = uVar37;
        puVar26[1] = uVar40;
        puVar26[2] = uVar42;
        uVar10 = uVar10 - 0x30;
        puVar26 = puVar26 + 6;
        uVar18 = uVar18 - 1;
      } while (uVar18 != 0);
    }
  }
  uVar10 = unaff_x28[0x36];
  uVar18 = uVar10 * 0x10;
  if (uVar10 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar18) {
    uVar40 = 0;
LAB_0050f6a8:
    func_0x007a1f00(uVar40,uVar18,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar18 == 0) {
    puVar21 = (undefined8 *)0x8;
  }
  else {
    puVar26 = (undefined8 *)unaff_x28[0x35];
    uVar40 = 8;
    puVar21 = (undefined8 *)func_0x00187bd0(uVar18,8);
    if (puVar21 == (undefined8 *)0x0) goto LAB_0050f6a8;
    if (uVar10 == 0) goto LAB_0050f270;
    uVar16 = uVar10 - 1;
    uVar18 = uVar10;
    if (uVar16 <= uVar10) {
      uVar18 = uVar16;
    }
    if (uVar18 < 8) {
LAB_0050f230:
      lVar11 = 0;
      uVar18 = uVar10;
      puVar13 = puVar26;
    }
    else {
      uVar28 = uVar10;
      if (uVar16 <= uVar10) {
        uVar28 = uVar16;
      }
      if (puVar21 < puVar26 + uVar28 * 2 + 2 && puVar26 < puVar21 + uVar28 * 2 + 2)
      goto LAB_0050f230;
      uVar16 = uVar18 + 1 & 3;
      uVar28 = 4;
      if (uVar16 != 0) {
        uVar28 = uVar16;
      }
      lVar11 = (uVar18 + 1) - uVar28;
      uVar18 = uVar10 - lVar11;
      puVar13 = puVar26 + lVar11 * 2;
      puVar19 = puVar21 + 4;
      puVar23 = puVar26 + 4;
      lVar9 = lVar11;
      do {
        uVar42 = puVar23[-3];
        uVar40 = puVar23[-2];
        uVar35 = puVar23[-1];
        uVar37 = *puVar23;
        uVar41 = puVar23[1];
        uVar39 = puVar23[2];
        uVar43 = puVar23[3];
        puVar19[-4] = puVar23[-4];
        puVar19[-3] = uVar42;
        puVar19[-2] = uVar40;
        puVar19[-1] = uVar35;
        *puVar19 = uVar37;
        puVar19[1] = uVar41;
        puVar19[2] = uVar39;
        puVar19[3] = uVar43;
        puVar19 = puVar19 + 8;
        puVar23 = puVar23 + 8;
        lVar9 = lVar9 + -4;
      } while (lVar9 != 0);
    }
    puVar19 = puVar21 + lVar11 * 2 + 1;
    do {
      if (puVar13 == puVar26 + uVar10 * 2) break;
      uVar40 = puVar13[1];
      puVar19[-1] = *puVar13;
      *puVar19 = uVar40;
      puVar19 = puVar19 + 2;
      uVar18 = uVar18 - 1;
      puVar13 = puVar13 + 2;
    } while (uVar18 != 0);
  }
LAB_0050f270:
  uVar18 = unaff_x28[0x39];
  uVar16 = uVar18 * 0x10;
  if (uVar18 >> 0x3c == 0 && uVar16 < 0x7ffffffffffffff9) {
    uVar43 = unaff_x28[0x47];
    uVar27 = unaff_x28[0x48];
    uVar42 = unaff_x28[5];
    uVar37 = unaff_x28[6];
    uVar35 = unaff_x28[7];
    uVar39 = unaff_x28[8];
    uVar41 = unaff_x28[9];
    uVar29 = unaff_x28[0x38];
    if (uVar16 == 0) {
      uStack00000000000000a0 = 0;
      lVar11 = 8;
    }
    else {
      uVar40 = 8;
      lVar11 = func_0x00187bd0(uVar16,8);
      if (lVar11 == 0) goto LAB_0050f6c4;
      uStack00000000000000a0 = uVar18;
    }
    _memcpy(lVar11,uVar29,uVar16);
    uVar40 = 0;
    uVar16 = unaff_x28[0x3c];
    uVar28 = uVar16 * 0x20;
    if ((uVar16 >> 0x3b == 0) && (uVar28 < 0x7ffffffffffffff9)) {
      if (uVar28 == 0) {
        lVar9 = 8;
        uVar40 = *(undefined8 *)(unaff_x29 + -0xb8);
LAB_0050f390:
        unaff_x25[0x43] = in_stack_00000138;
        unaff_x25[0x44] = in_stack_00000148;
        unaff_x25[0x41] = in_stack_00000060;
        unaff_x25[0x42] = in_stack_00000058;
        *(undefined1 *)((long)unaff_x25 + 0x254) = in_stack_00000158._4_1_;
        unaff_x25[0xe] = *(undefined8 *)(unaff_x29 + -0xf0);
        *(undefined4 *)(unaff_x25 + 0x4a) = in_stack_00000130._4_4_;
        unaff_x25[0x14] = in_stack_00000178;
        unaff_x25[0x1a] = in_stack_00000160;
        unaff_x25[0x20] = in_stack_00000120;
        *(undefined4 *)(unaff_x25 + 0x49) = uVar1;
        unaff_x25[0x45] = uVar33;
        unaff_x25[0x46] = uVar34;
        unaff_x25[0x26] = lStack0000000000000118;
        unaff_x25[0x28] = uStack0000000000000140;
        unaff_x25[0x29] = lVar8;
        unaff_x25[0x2a] = *(undefined8 *)(unaff_x29 + -0xa8);
        *unaff_x25 = uVar36;
        unaff_x25[1] = uVar38;
        unaff_x25[0x2c] = uVar40;
        unaff_x25[2] = uVar31;
        *(undefined4 *)((long)unaff_x25 + 0x24c) = uVar2;
        unaff_x25[0x47] = uVar43;
        unaff_x25[0x48] = uVar27;
        unaff_x25[0x32] = lStack00000000000000c0;
        unaff_x25[0x33] = uVar15;
        uVar31 = *(undefined8 *)(unaff_x29 + -0x98);
        unaff_x25[0x3e] = *(undefined8 *)(unaff_x29 + -0x90);
        unaff_x25[0x3d] = uVar31;
        uVar31 = *(undefined8 *)(unaff_x29 + -0xd8);
        unaff_x25[0x3f] = *(undefined8 *)(unaff_x29 + -0x88);
        unaff_x25[0x40] = uVar31;
        uVar31 = *(undefined8 *)(unaff_x29 + -0x70);
        unaff_x25[0xb] = *(undefined8 *)(unaff_x29 + -0x68);
        unaff_x25[10] = uVar31;
        uVar31 = *(undefined8 *)(unaff_x29 + -0xd0);
        uVar33 = *(undefined8 *)(unaff_x29 + -200);
        unaff_x25[0xc] = *(undefined8 *)(unaff_x29 + -0x60);
        unaff_x25[0xd] = uVar33;
        unaff_x25[0xf] = uVar33;
        unaff_x25[0x10] = uVar31;
        unaff_x25[0x11] = *(undefined8 *)(unaff_x29 + -0xf8);
        unaff_x25[0x12] = uVar31;
        uVar31 = *(undefined8 *)(unaff_x29 + -0xe8);
        uVar33 = *(undefined8 *)(unaff_x29 + -0xe0);
        unaff_x25[0x13] = uVar33;
        unaff_x25[0x15] = uVar33;
        unaff_x25[0x16] = uVar31;
        unaff_x25[0x17] = in_stack_00000170;
        unaff_x25[0x18] = uVar31;
        uVar33 = *(undefined8 *)(unaff_x29 + -0xa0);
        unaff_x25[0x19] = uVar33;
        uVar31 = *(undefined8 *)(unaff_x29 + -0x100);
        unaff_x25[0x1b] = uVar33;
        unaff_x25[0x1c] = uVar31;
        unaff_x25[0x1d] = *(undefined8 *)(unaff_x29 + -0xb0);
        unaff_x25[0x1e] = uVar31;
        unaff_x25[0x1f] = in_stack_00000168;
        unaff_x25[0x21] = in_stack_00000168;
        unaff_x25[0x22] = unaff_x21;
        unaff_x25[0x23] = *(undefined8 *)(unaff_x29 + -0xc0);
        unaff_x25[0x24] = unaff_x21;
        unaff_x25[0x25] = uVar24;
        unaff_x25[0x27] = uVar24;
        unaff_x25[0x2b] = uVar17;
        uVar31 = *(undefined8 *)(unaff_x29 + -0x80);
        unaff_x25[4] = *(undefined8 *)(unaff_x29 + -0x78);
        unaff_x25[3] = uVar31;
        unaff_x25[0x2d] = uVar17;
        unaff_x25[0x2e] = uVar14;
        unaff_x25[0x2f] = puVar25;
        unaff_x25[0x30] = uVar14;
        unaff_x25[0x31] = uVar15;
        unaff_x25[0x34] = uVar10;
        unaff_x25[0x35] = puVar21;
        unaff_x25[5] = uVar42;
        unaff_x25[6] = uVar37;
        unaff_x25[7] = uVar35;
        unaff_x25[8] = uVar39;
        unaff_x25[9] = uVar41;
        unaff_x25[0x36] = uVar10;
        unaff_x25[0x37] = uStack00000000000000a0;
        unaff_x25[0x38] = lVar11;
        unaff_x25[0x39] = uVar18;
        unaff_x25[0x3a] = uVar16;
        unaff_x25[0x3b] = lVar9;
        unaff_x25[0x3c] = uVar16;
        return;
      }
      puVar26 = (undefined8 *)unaff_x28[0x3b];
      uVar40 = 8;
      lVar9 = func_0x00187bd0(uVar28,8);
      if (lVar9 != 0) {
        uVar40 = *(undefined8 *)(unaff_x29 + -0xb8);
        if (uVar16 != 0) {
          puVar13 = (undefined8 *)(lVar9 + 0x10);
          uVar20 = uVar16;
          do {
            if (uVar28 == 0) break;
            plVar22 = (long *)*puVar26;
            lVar7 = *plVar22;
            *plVar22 = lVar7 + 1;
            if (lVar7 < 0) goto LAB_0050f6d8;
            uVar29 = puVar26[1];
            uVar32 = puVar26[3];
            uVar30 = puVar26[2];
            puVar26 = puVar26 + 4;
            puVar13[-2] = plVar22;
            puVar13[-1] = uVar29;
            puVar13[1] = uVar32;
            *puVar13 = uVar30;
            uVar28 = uVar28 - 0x20;
            uVar20 = uVar20 - 1;
            puVar13 = puVar13 + 4;
          } while (uVar20 != 0);
        }
        goto LAB_0050f390;
      }
    }
    func_0x007a1f00(uVar40,uVar28,&UNK_009e7fc8);
  }
  else {
    uVar40 = 0;
LAB_0050f6c4:
    func_0x007a1f00(uVar40,uVar16,&UNK_009e7fe0);
  }
LAB_0050f6d8:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x50f6dc);
  (*pcVar6)();
}

