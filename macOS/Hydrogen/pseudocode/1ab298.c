
void FUN_001ab298(void)

{
  undefined2 *puVar1;
  ulong *puVar2;
  byte bVar3;
  undefined1 uVar4;
  byte bVar5;
  char cVar6;
  ushort uVar7;
  long lVar8;
  ushort uVar9;
  undefined2 uVar10;
  undefined2 uVar11;
  code *pcVar12;
  undefined8 uVar13;
  long *plVar14;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  ulong extraout_x1_01;
  ulong extraout_x1_02;
  ulong extraout_x1_03;
  ulong extraout_x1_04;
  ulong extraout_x1_05;
  ulong extraout_x1_06;
  ulong extraout_x1_07;
  ulong extraout_x1_08;
  ulong extraout_x1_09;
  ulong extraout_x1_10;
  long lVar15;
  ulong extraout_x1_11;
  ulong extraout_x1_12;
  ulong uVar16;
  undefined8 extraout_x8;
  undefined8 extraout_x8_00;
  undefined8 *extraout_x8_01;
  undefined8 *puVar17;
  ulong extraout_x8_02;
  ulong extraout_x8_03;
  undefined8 *extraout_x8_04;
  ulong extraout_x8_05;
  ulong extraout_x8_06;
  undefined8 *extraout_x8_07;
  ulong extraout_x8_08;
  ulong extraout_x8_09;
  undefined8 *extraout_x8_10;
  ulong extraout_x8_11;
  ulong extraout_x8_12;
  undefined8 *extraout_x8_13;
  ulong extraout_x8_14;
  ulong extraout_x8_15;
  undefined8 *extraout_x8_16;
  ulong extraout_x8_17;
  ulong extraout_x8_18;
  ulong uVar18;
  long *extraout_x8_19;
  undefined8 extraout_x9;
  undefined8 extraout_x9_00;
  ulong extraout_x9_01;
  ulong extraout_x9_02;
  ulong extraout_x9_03;
  ulong extraout_x9_04;
  ulong extraout_x9_05;
  ulong extraout_x9_06;
  ulong extraout_x9_07;
  ulong extraout_x9_08;
  ulong extraout_x9_09;
  ulong extraout_x9_10;
  ulong extraout_x9_11;
  ulong uVar19;
  ulong extraout_x9_12;
  ulong uVar20;
  long lVar21;
  uint uVar22;
  uint extraout_w13;
  undefined1 uVar23;
  undefined8 *puVar24;
  long lVar25;
  long unaff_x22;
  undefined8 *puVar26;
  long unaff_x23;
  undefined8 uVar27;
  byte bVar28;
  undefined1 auVar29 [16];
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  long lStack_448;
  long lStack_440;
  long lStack_438;
  long lStack_3d0;
  ulong uStack_3c8;
  ulong uStack_3c0;
  long lStack_3b8;
  long lStack_3b0;
  long lStack_3a8;
  long lStack_3a0;
  long lStack_398;
  long lStack_390;
  long lStack_388;
  long lStack_380;
  long lStack_378;
  long lStack_318;
  long lStack_310;
  long lStack_308;
  long lStack_2a0;
  ulong uStack_298;
  ulong uStack_290;
  long lStack_288;
  long lStack_280;
  long lStack_278;
  undefined4 uStack_270;
  ushort uStack_26c;
  undefined2 uStack_26a;
  ulong uStack_268;
  ushort uStack_260;
  ushort uStack_25e;
  uint uStack_25c;
  ulong uStack_258;
  long lStack_1e8;
  ulong uStack_1e0;
  ulong uStack_1d8;
  long lStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  char cStack_1b8;
  undefined1 uStack_1b7;
  undefined4 uStack_1b6;
  undefined8 uStack_1b2;
  undefined8 uStack_1aa;
  undefined2 uStack_1a2;
  long lStack_158;
  long lStack_150;
  long lStack_148;
  long lStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  undefined7 uStack_b0;
  undefined1 uStack_a9;
  undefined7 uStack_a8;
  undefined1 uStack_a1;
  undefined7 uStack_a0;
  undefined8 uStack_99;
  char acStack_90 [8];
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  char cStack_68;
  undefined7 uStack_67;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  func_0x007a28bc();
  func_0x007a28b0(extraout_x8,extraout_x1,&UNK_009c9a78);
  func_0x007a28bc(extraout_x8_00,extraout_x9,&UNK_009c9a78);
  uVar13 = func_0x007a28b0(extraout_x9_00,extraout_x1_00,&UNK_009c9a78);
  if (in_stack_00000020 != 0) {
    func_0x00187bd4(in_stack_00000028,in_stack_00000020 << 2,2);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_01[2] = &UNK_008298da;
    extraout_x8_01[3] = 3;
    *(undefined1 *)(extraout_x8_01 + 1) = 0xc;
    *extraout_x8_01 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar14[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto code_r0x001ab51c;
    uVar7 = *(ushort *)(*plVar14 + uVar19);
    uStack_d8 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_d8) {
      extraout_x8_01[2] = uStack_d8;
      extraout_x8_01[3] = 0;
      *extraout_x8_01 = 1;
      extraout_x8_01[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_d8;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uStack_d8)) goto code_r0x001ab52c;
    if (uVar19 <= uVar16) {
      lStack_e0 = *plVar14 + uVar18;
      uStack_d0 = 0;
      lStack_c8 = 0;
      lStack_c0 = 8;
      lStack_b8 = 0;
      if (uVar7 != 0) {
        puVar24 = (undefined8 *)((ulong)acStack_90 | 1);
        puVar26 = (undefined8 *)((ulong)&cStack_68 | 1);
        do {
          func_0x001b0d08(acStack_90,&lStack_e0);
          lVar21 = lStack_b8;
          if (acStack_90[0] == '\x11') {
            uStack_a1 = (undefined1)uStack_80;
            uStack_a0 = (undefined7)((ulong)uStack_80 >> 8);
            uStack_a9 = (undefined1)uStack_88;
            uStack_a8 = (undefined7)((ulong)uStack_88 >> 8);
            uStack_99 = uStack_78;
            extraout_x8_01[2] = uStack_80;
            extraout_x8_01[1] = uStack_88;
            extraout_x8_01[3] = uStack_78;
            *extraout_x8_01 = 1;
            if (lStack_b8 != 0) {
              lVar21 = lStack_c0;
              lVar25 = lStack_b8;
              do {
                func_0x0016abd8(lVar21);
                lVar21 = lVar21 + 0x28;
                lVar25 = lVar25 + -1;
              } while (lVar25 != 0);
            }
            if (lStack_c8 == 0) {
              return;
            }
            func_0x00187bd4(lStack_c0,lStack_c8 * 0x28,8);
            return;
          }
          uStack_99 = *(undefined8 *)((long)puVar24 + 0x17);
          uStack_a0 = (undefined7)((ulong)*(undefined8 *)((long)puVar24 + 0xf) >> 8);
          uVar27 = puVar24[1];
          uVar13 = *puVar24;
          uStack_a8 = (undefined7)uVar27;
          uStack_a1 = (undefined1)((ulong)uVar27 >> 0x38);
          uStack_b0 = (undefined7)uVar13;
          uStack_a9 = (undefined1)((ulong)uVar13 >> 0x38);
          cStack_68 = acStack_90[0];
          puVar26[1] = uVar27;
          *puVar26 = uVar13;
          *(undefined8 *)((long)puVar26 + 0x17) = uStack_99;
          *(ulong *)((long)puVar26 + 0xf) = CONCAT71(uStack_a0,uStack_a1);
          uStack_48 = uStack_70;
          if (lStack_b8 == lStack_c8) {
            func_0x001d9010(&lStack_c8,&UNK_009c24d8);
          }
          puVar17 = (undefined8 *)(lStack_c0 + lVar21 * 0x28);
          puVar17[1] = uStack_60;
          *puVar17 = CONCAT71(uStack_67,cStack_68);
          puVar17[3] = uStack_50;
          puVar17[2] = uStack_58;
          puVar17[4] = uStack_48;
          lStack_b8 = lVar21 + 1;
        } while (uStack_d0 < uStack_d8);
      }
      extraout_x8_01[2] = lStack_c0;
      extraout_x8_01[1] = lStack_c8;
      extraout_x8_01[3] = lStack_b8;
      *extraout_x8_01 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_01;
    uVar18 = extraout_x8_02;
code_r0x001ab51c:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_03;
    uVar19 = extraout_x9_01;
code_r0x001ab52c:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_02;
    uVar19 = extraout_x9_02;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  func_0x0016abd8(&cStack_68);
  func_0x001a0f94(&lStack_c8);
  uVar13 = __Unwind_Resume(uVar13);
  func_0x001a0f94(&lStack_c8);
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 == uVar19) {
    extraout_x8_04[2] = &UNK_008298d8;
    extraout_x8_04[3] = 2;
    *(undefined1 *)(extraout_x8_04 + 1) = 0xc;
    *extraout_x8_04 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar14[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001ab6f4;
    lVar21 = *plVar14;
    bVar28 = *(byte *)(lVar21 + uVar19);
    uVar20 = (ulong)bVar28;
    if (uVar16 - uVar18 < uVar20) {
      extraout_x8_04[2] = uVar20;
      extraout_x8_04[3] = 0;
      *extraout_x8_04 = 1;
      extraout_x8_04[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uVar20;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uVar20)) goto code_r0x001ab704;
    if (uVar19 <= uVar16) {
      lStack_158 = 0;
      lStack_150 = 1;
      lStack_148 = 0;
      if (bVar28 != 0) {
        lVar25 = 0;
        do {
          lVar15 = lStack_148;
          bVar5 = *(byte *)(lVar21 + uVar18 + lStack_148);
          bVar28 = 2;
          if (bVar5 != 0x40) {
            bVar28 = 3;
          }
          bVar3 = bVar5;
          if (1 < bVar5) {
            bVar3 = bVar28;
          }
          if (lStack_148 == lStack_158) {
            func_0x001d8c88(&lStack_158,&UNK_009c24d8);
          }
          *(byte *)(lStack_150 + lVar25) = bVar3;
          ((byte *)(lStack_150 + lVar25))[1] = bVar5;
          lStack_148 = lVar15 + 1;
          lVar25 = lVar25 + 2;
        } while (lVar15 != uVar20 - 1);
      }
      extraout_x8_04[2] = lStack_150;
      extraout_x8_04[1] = lStack_158;
      extraout_x8_04[3] = lStack_148;
      *extraout_x8_04 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_03;
    uVar18 = extraout_x8_05;
code_r0x001ab6f4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_06;
    uVar19 = extraout_x9_03;
code_r0x001ab704:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_04;
    uVar19 = extraout_x9_04;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_158 != 0) {
    func_0x00187bd4(lStack_150,lStack_158 << 1,1);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 == uVar19) {
    extraout_x8_07[2] = &UNK_008298d8;
    extraout_x8_07[3] = 2;
    *(undefined1 *)(extraout_x8_07 + 1) = 0xc;
    *extraout_x8_07 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar14[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001ab8f4;
    bVar28 = *(byte *)(*plVar14 + uVar19);
    uStack_1e0 = (ulong)bVar28;
    if (uVar16 - uVar18 < uStack_1e0) {
      extraout_x8_07[2] = uStack_1e0;
      extraout_x8_07[3] = 0;
      *extraout_x8_07 = 1;
      extraout_x8_07[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_1e0;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uStack_1e0)) goto code_r0x001ab904;
    if (uVar19 <= uVar16) {
      lStack_1e8 = *plVar14 + uVar18;
      uStack_1d8 = 0;
      lStack_1d0 = 0;
      lStack_1c8 = 2;
      lStack_1c0 = 0;
      if (bVar28 != 0) {
        do {
          func_0x001f10d8(&cStack_1b8,&lStack_1e8);
          lVar21 = lStack_1c0;
          if (cStack_1b8 != '\x15') {
            *(undefined8 *)((long)extraout_x8_07 + 0x16) = uStack_1aa;
            *(undefined8 *)((long)extraout_x8_07 + 0xe) = uStack_1b2;
            *(undefined2 *)((long)extraout_x8_07 + 0x1e) = uStack_1a2;
            *(char *)(extraout_x8_07 + 1) = cStack_1b8;
            *(undefined1 *)((long)extraout_x8_07 + 9) = uStack_1b7;
            *(undefined4 *)((long)extraout_x8_07 + 10) = uStack_1b6;
            *extraout_x8_07 = 1;
            if (lStack_1d0 == 0) {
              return;
            }
            func_0x00187bd4(lStack_1c8,lStack_1d0 << 2,2);
            return;
          }
          uVar10 = (undefined2)uStack_1b6;
          uVar11 = uStack_1b6._2_2_;
          if (lStack_1c0 == lStack_1d0) {
            func_0x001d8d34(&lStack_1d0,&UNK_009c24d8);
          }
          puVar1 = (undefined2 *)(lStack_1c8 + lVar21 * 4);
          *puVar1 = uVar10;
          puVar1[1] = uVar11;
          lStack_1c0 = lVar21 + 1;
        } while (uStack_1d8 < uStack_1e0);
      }
      extraout_x8_07[2] = lStack_1c8;
      extraout_x8_07[1] = lStack_1d0;
      extraout_x8_07[3] = lStack_1c0;
      *extraout_x8_07 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_05;
    uVar18 = extraout_x8_08;
code_r0x001ab8f4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_09;
    uVar19 = extraout_x9_05;
code_r0x001ab904:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_06;
    uVar19 = extraout_x9_06;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_1d0 != 0) {
    func_0x00187bd4(lStack_1c8,lStack_1d0 << 2,2);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_10[2] = &UNK_008298da;
    extraout_x8_10[3] = 3;
    *(undefined1 *)(extraout_x8_10 + 1) = 0xc;
    *extraout_x8_10 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar14[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto code_r0x001abbe4;
    uVar7 = *(ushort *)(*plVar14 + uVar19);
    uStack_298 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_298) {
      extraout_x8_10[2] = uStack_298;
      extraout_x8_10[3] = 0;
      *extraout_x8_10 = 1;
      extraout_x8_10[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_298;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uStack_298)) goto code_r0x001abbf4;
    if (uVar19 <= uVar16) {
      lStack_2a0 = *plVar14 + uVar18;
      uStack_290 = 0;
      lStack_288 = 0;
      lStack_280 = 8;
      lStack_278 = 0;
      if (uVar7 != 0) {
        do {
          func_0x001f2140(&uStack_270,&lStack_2a0);
          uVar9 = uStack_26c;
          uVar7 = uStack_270._2_2_;
          if ((char)uStack_270 != '\x15') {
            uVar23 = (undefined1)((uint)uStack_270 >> 8);
            uVar22 = (uint)uStack_26c;
            uStack_258 = (ulong)uStack_260;
            uVar16 = uStack_268;
code_r0x001abb34:
            *(char *)(extraout_x8_10 + 1) = (char)uStack_270;
            *(undefined1 *)((long)extraout_x8_10 + 9) = uVar23;
            *(ushort *)((long)extraout_x8_10 + 10) = uStack_270._2_2_;
            *(short *)((long)extraout_x8_10 + 0xc) = (short)uVar22;
            *(undefined2 *)((long)extraout_x8_10 + 0xe) = uStack_26a;
            extraout_x8_10[2] = uVar16;
            *(short *)(extraout_x8_10 + 3) = (short)uStack_258;
            *(ushort *)((long)extraout_x8_10 + 0x1a) = uStack_25e;
            *(uint *)((long)extraout_x8_10 + 0x1c) = uStack_25c;
            *extraout_x8_10 = 1;
            if (lStack_278 != 0) {
              puVar24 = (undefined8 *)(lStack_280 + 8);
              lVar21 = lStack_278;
              do {
                if (puVar24[-1] != 0) {
                  func_0x00187bd4(*puVar24,puVar24[-1],1);
                }
                puVar24 = puVar24 + 4;
                lVar21 = lVar21 + -1;
              } while (lVar21 != 0);
            }
            if (lStack_288 == 0) {
              return;
            }
            func_0x00187bd4(lStack_280,lStack_288 << 5,8);
            return;
          }
          uVar20 = (ulong)uStack_270._2_2_;
          func_0x00223f7c(&uStack_270,&lStack_2a0);
          uVar18 = uStack_258;
          uVar19 = uStack_268;
          lVar21 = lStack_278;
          uVar16 = CONCAT44(uStack_25c,CONCAT22(uStack_25e,uStack_260));
          if (uStack_270 == 1) {
            uVar23 = (undefined1)(uStack_268 >> 8);
            uStack_270._0_1_ = (char)uStack_268;
            uStack_270._2_2_ = (ushort)(uStack_268 >> 0x10);
            uVar22 = (uint)(uStack_268 >> 0x20);
            uStack_26a = (undefined2)(uStack_268 >> 0x30);
            uStack_25e = (ushort)(uStack_258 >> 0x10);
            uStack_25c = (uint)(uStack_258 >> 0x20);
            goto code_r0x001abb34;
          }
          if (uStack_268 == 0x8000000000000000) {
            uStack_270._0_1_ = (char)uStack_260;
            uVar23 = (undefined1)(uStack_260 >> 8);
            uStack_26a = (undefined2)(uStack_25c >> 0x10);
            uVar16 = uStack_258;
            uStack_258 = uVar20;
            uVar22 = uStack_25c;
            uStack_25c = extraout_w13;
            uStack_270._2_2_ = uStack_25e;
            uStack_25e = uVar9;
            goto code_r0x001abb34;
          }
          if (lStack_278 == lStack_288) {
            func_0x001d8840(&lStack_288,&UNK_009c24d8);
          }
          puVar2 = (ulong *)(lStack_280 + lVar21 * 0x20);
          *puVar2 = uVar19;
          puVar2[1] = uVar16;
          puVar2[2] = uVar18;
          *(ushort *)(puVar2 + 3) = uVar7;
          *(ushort *)((long)puVar2 + 0x1a) = uVar9;
          lStack_278 = lVar21 + 1;
        } while (uStack_290 < uStack_298);
      }
      extraout_x8_10[2] = lStack_280;
      extraout_x8_10[1] = lStack_288;
      extraout_x8_10[3] = lStack_278;
      *extraout_x8_10 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_07;
    uVar18 = extraout_x8_11;
code_r0x001abbe4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_12;
    uVar19 = extraout_x9_07;
code_r0x001abbf4:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_08;
    uVar19 = extraout_x9_08;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (unaff_x22 != 0) {
    func_0x00187bd4();
    func_0x001a0dec(&lStack_288);
    uVar13 = __Unwind_Resume(uVar13);
  }
  func_0x001a0dec(&lStack_288);
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 == uVar19) {
    extraout_x8_13[2] = &UNK_008298d8;
    extraout_x8_13[3] = 2;
    *(undefined1 *)(extraout_x8_13 + 1) = 0xc;
    *extraout_x8_13 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar14[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001abdc0;
    lVar21 = *plVar14;
    bVar28 = *(byte *)(lVar21 + uVar19);
    uVar20 = (ulong)bVar28;
    if (uVar16 - uVar18 < uVar20) {
      extraout_x8_13[2] = uVar20;
      extraout_x8_13[3] = 0;
      *extraout_x8_13 = 1;
      extraout_x8_13[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uVar20;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uVar20)) goto code_r0x001abdd0;
    if (uVar19 <= uVar16) {
      lStack_318 = 0;
      lStack_310 = 1;
      lStack_308 = 0;
      if (bVar28 != 0) {
        lVar25 = 0;
        do {
          lVar15 = lStack_308;
          cVar6 = *(char *)(lVar21 + uVar18 + lStack_308);
          uVar23 = 1;
          if (cVar6 != '\x02') {
            uVar23 = 2;
          }
          uVar4 = 0;
          if (cVar6 != '\0') {
            uVar4 = uVar23;
          }
          if (lStack_308 == lStack_318) {
            func_0x001d8c88(&lStack_318,&UNK_009c24d8);
          }
          *(undefined1 *)(lStack_310 + lVar25) = uVar4;
          ((undefined1 *)(lStack_310 + lVar25))[1] = cVar6;
          lStack_308 = lVar15 + 1;
          lVar25 = lVar25 + 2;
        } while (lVar15 != uVar20 - 1);
      }
      extraout_x8_13[2] = lStack_310;
      extraout_x8_13[1] = lStack_318;
      extraout_x8_13[3] = lStack_308;
      *extraout_x8_13 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_09;
    uVar18 = extraout_x8_14;
code_r0x001abdc0:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_15;
    uVar19 = extraout_x9_09;
code_r0x001abdd0:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_10;
    uVar19 = extraout_x9_10;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_318 != 0) {
    func_0x00187bd4(lStack_310,lStack_318 << 1,1);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_16[2] = &UNK_008298da;
    extraout_x8_16[3] = 3;
    *(undefined1 *)(extraout_x8_16 + 1) = 0xc;
    *extraout_x8_16 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar14[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto LAB_001ac00c;
    uVar7 = *(ushort *)(*plVar14 + uVar19);
    uStack_3c8 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_3c8) {
      extraout_x8_16[2] = uStack_3c8;
      extraout_x8_16[3] = 0;
      *extraout_x8_16 = 1;
      extraout_x8_16[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_3c8;
    plVar14[2] = uVar19;
    if (!CARRY8(uVar18,uStack_3c8)) {
      if (uVar19 <= uVar16) {
        lStack_3d0 = *plVar14 + uVar18;
        uStack_3c0 = 0;
        lStack_3b8 = 0;
        lStack_3b0 = 8;
        lStack_3a8 = 0;
        if (uVar7 != 0) {
          do {
            func_0x001b932c(&lStack_390,&lStack_3d0);
            lVar8 = lStack_388;
            lVar15 = lStack_390;
            lVar25 = lStack_3a8;
            lVar21 = lStack_3b0;
            lStack_398 = lStack_378;
            lStack_3a0 = lStack_380;
            if (lStack_390 == -0x7ffffffffffffffe) {
              extraout_x8_16[3] = lStack_378;
              extraout_x8_16[2] = lStack_380;
              *extraout_x8_16 = 1;
              extraout_x8_16[1] = lStack_388;
              if (lStack_3a8 != 0) {
                puVar24 = (undefined8 *)(lStack_3b0 + 8);
                do {
                  lVar15 = puVar24[-1];
                  if (-0x7fffffffffffffff < lVar15 && lVar15 != 0) {
                    func_0x00187bd4(*puVar24,lVar15,1);
                  }
                  puVar24 = puVar24 + 4;
                  lVar25 = lVar25 + -1;
                } while (lVar25 != 0);
              }
              if (lStack_3b8 == 0) {
                return;
              }
              func_0x00187bd4(lVar21,lStack_3b8 << 5,8);
              return;
            }
            if (lStack_3a8 == lStack_3b8) {
              func_0x001d8840(&lStack_3b8,&UNK_009c24d8);
            }
            plVar14 = (long *)(lStack_3b0 + lVar25 * 0x20);
            *plVar14 = lVar15;
            plVar14[1] = lVar8;
            plVar14[3] = lStack_398;
            plVar14[2] = lStack_3a0;
            lStack_3a8 = lVar25 + 1;
          } while (uStack_3c0 < uStack_3c8);
        }
        extraout_x8_16[2] = lStack_3b0;
        extraout_x8_16[1] = lStack_3b8;
        extraout_x8_16[3] = lStack_3a8;
        *extraout_x8_16 = 0;
        return;
      }
      goto LAB_001ac030;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_11;
    uVar18 = extraout_x8_17;
LAB_001ac00c:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_18;
    uVar19 = extraout_x9_11;
  }
  func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
  uVar16 = extraout_x1_12;
  uVar19 = extraout_x9_12;
LAB_001ac030:
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if ((-0x7fffffffffffffff < unaff_x22) && (unaff_x22 != 0)) {
    func_0x00187bd4();
    func_0x00183ef0(&lStack_3b8);
    uVar13 = __Unwind_Resume(uVar13);
  }
  func_0x00183ef0(&lStack_3b8);
  auVar29 = __Unwind_Resume(uVar13);
  puVar24 = auVar29._0_8_;
  lStack_448 = 0;
  lStack_440 = 8;
  lStack_438 = 0;
  if (auVar29._8_8_ == 0) {
code_r0x001ac170:
    extraout_x8_19[1] = lStack_440;
    *extraout_x8_19 = lStack_448;
    extraout_x8_19[2] = lStack_438;
    return;
  }
  lVar21 = puVar24[1];
  if (lVar21 < 0) {
    uVar13 = 0;
  }
  else {
    uVar13 = 1;
    puVar26 = puVar24;
    do {
      uVar27 = *puVar26;
      if (lVar21 == 0) {
        unaff_x23 = 1;
      }
      else {
        unaff_x23 = func_0x00187bd0(lVar21,1);
        if (unaff_x23 == 0) {
          unaff_x23 = lVar21;
          goto code_r0x001ac1a4;
        }
      }
      _memcpy(unaff_x23,uVar27,lVar21);
      lVar25 = lStack_438;
      if (lStack_438 == lStack_448) {
        func_0x001d88f4(&lStack_448,&UNK_009c24f0);
      }
      plVar14 = (long *)(lStack_440 + lVar25 * 0x18);
      *plVar14 = lVar21;
      plVar14[1] = unaff_x23;
      plVar14[2] = lVar21;
      lStack_438 = lVar25 + 1;
      if (puVar26 + 2 == puVar24 + auVar29._8_8_ * 2) goto code_r0x001ac170;
      lVar21 = puVar26[3];
      puVar26 = puVar26 + 2;
    } while (-1 < lVar21);
    uVar13 = 0;
  }
code_r0x001ac1a4:
  func_0x007a1f00(uVar13,unaff_x23,&UNK_009c24c0);
                    /* WARNING: Does not return */
  pcVar12 = (code *)SoftwareBreakpoint(1,0x1ac1bc);
  (*pcVar12)();
}

