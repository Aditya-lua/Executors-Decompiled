
void FUN_001ab0b0(undefined8 param_1)

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
  ulong extraout_x1_00;
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
  ulong extraout_x1_11;
  long lVar15;
  ulong extraout_x1_12;
  ulong extraout_x1_13;
  ulong uVar16;
  undefined8 *extraout_x8;
  ulong extraout_x8_00;
  ulong extraout_x8_01;
  undefined8 *extraout_x8_02;
  undefined8 *puVar17;
  ulong extraout_x8_03;
  ulong extraout_x8_04;
  undefined8 *extraout_x8_05;
  ulong extraout_x8_06;
  ulong extraout_x8_07;
  undefined8 *extraout_x8_08;
  ulong extraout_x8_09;
  ulong extraout_x8_10;
  undefined8 *extraout_x8_11;
  ulong extraout_x8_12;
  ulong extraout_x8_13;
  undefined8 *extraout_x8_14;
  ulong extraout_x8_15;
  ulong extraout_x8_16;
  undefined8 *extraout_x8_17;
  ulong extraout_x8_18;
  ulong extraout_x8_19;
  ulong uVar18;
  long *extraout_x8_20;
  undefined8 extraout_x9;
  ulong extraout_x9_00;
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
  ulong extraout_x9_12;
  ulong uVar19;
  ulong extraout_x9_13;
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
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long lStack_4d8;
  long lStack_4d0;
  long lStack_4c8;
  long lStack_460;
  ulong uStack_458;
  ulong uStack_450;
  long lStack_448;
  long lStack_440;
  long lStack_438;
  long lStack_430;
  long lStack_428;
  long lStack_420;
  long lStack_418;
  long lStack_410;
  long lStack_408;
  long lStack_3a8;
  long lStack_3a0;
  long lStack_398;
  long lStack_330;
  ulong uStack_328;
  ulong uStack_320;
  long lStack_318;
  long lStack_310;
  long lStack_308;
  undefined4 uStack_300;
  ushort uStack_2fc;
  undefined2 uStack_2fa;
  ulong uStack_2f8;
  ushort uStack_2f0;
  ushort uStack_2ee;
  uint uStack_2ec;
  ulong uStack_2e8;
  long lStack_278;
  ulong uStack_270;
  ulong uStack_268;
  long lStack_260;
  long lStack_258;
  long lStack_250;
  char cStack_248;
  undefined1 uStack_247;
  undefined4 uStack_246;
  undefined8 uStack_242;
  undefined8 uStack_23a;
  undefined2 uStack_232;
  long lStack_1e8;
  long lStack_1e0;
  long lStack_1d8;
  long lStack_170;
  ulong uStack_168;
  ulong uStack_160;
  long lStack_158;
  long lStack_150;
  long lStack_148;
  undefined7 uStack_140;
  undefined1 uStack_139;
  undefined7 uStack_138;
  undefined1 uStack_131;
  undefined7 uStack_130;
  undefined8 uStack_129;
  char acStack_120 [8];
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  char cStack_f8;
  undefined7 uStack_f7;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long lStack_88;
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  char cStack_58;
  undefined1 uStack_57;
  undefined4 uStack_56;
  undefined8 uStack_52;
  undefined8 uStack_4a;
  undefined2 uStack_42;
  
  func_0x007a28bc(param_1);
  uVar13 = func_0x007a28b0(extraout_x9,extraout_x1,&UNK_009c9a78);
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 1,1);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8[2] = &UNK_008298da;
    extraout_x8[3] = 3;
    *(undefined1 *)(extraout_x8 + 1) = 0xc;
    *extraout_x8 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar14[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto LAB_001ab2ac;
    uVar7 = *(ushort *)(*plVar14 + uVar19);
    uStack_80 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_80) {
      extraout_x8[2] = uStack_80;
      extraout_x8[3] = 0;
      *extraout_x8 = 1;
      extraout_x8[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_80;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uStack_80)) goto code_r0x001ab2bc;
    if (uVar19 <= uVar16) {
      lStack_88 = *plVar14 + uVar18;
      uStack_78 = 0;
      lStack_70 = 0;
      lStack_68 = 2;
      lStack_60 = 0;
      if (uVar7 != 0) {
        do {
          func_0x001f6b2c(&cStack_58,&lStack_88);
          lVar21 = lStack_60;
          if (cStack_58 != '\x15') {
            *(undefined8 *)((long)extraout_x8 + 0x16) = uStack_4a;
            *(undefined8 *)((long)extraout_x8 + 0xe) = uStack_52;
            *(undefined2 *)((long)extraout_x8 + 0x1e) = uStack_42;
            *(char *)(extraout_x8 + 1) = cStack_58;
            *(undefined1 *)((long)extraout_x8 + 9) = uStack_57;
            *(undefined4 *)((long)extraout_x8 + 10) = uStack_56;
            *extraout_x8 = 1;
            if (lStack_70 == 0) {
              return;
            }
            func_0x00187bd4(lStack_68,lStack_70 << 2,2);
            return;
          }
          uVar10 = (undefined2)uStack_56;
          uVar11 = uStack_56._2_2_;
          if (lStack_60 == lStack_70) {
            func_0x001d8d34(&lStack_70,&UNK_009c24d8);
          }
          puVar1 = (undefined2 *)(lStack_68 + lVar21 * 4);
          *puVar1 = uVar10;
          puVar1[1] = uVar11;
          lStack_60 = lVar21 + 1;
        } while (uStack_78 < uStack_80);
      }
      extraout_x8[2] = lStack_68;
      extraout_x8[1] = lStack_70;
      extraout_x8[3] = lStack_60;
      *extraout_x8 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_00;
    uVar18 = extraout_x8_00;
LAB_001ab2ac:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_01;
    uVar19 = extraout_x9_00;
code_r0x001ab2bc:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_01;
    uVar19 = extraout_x9_01;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_70 != 0) {
    func_0x00187bd4(lStack_68,lStack_70 << 2,2);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_02[2] = &UNK_008298da;
    extraout_x8_02[3] = 3;
    *(undefined1 *)(extraout_x8_02 + 1) = 0xc;
    *extraout_x8_02 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar14[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto code_r0x001ab51c;
    uVar7 = *(ushort *)(*plVar14 + uVar19);
    uStack_168 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_168) {
      extraout_x8_02[2] = uStack_168;
      extraout_x8_02[3] = 0;
      *extraout_x8_02 = 1;
      extraout_x8_02[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_168;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uStack_168)) goto code_r0x001ab52c;
    if (uVar19 <= uVar16) {
      lStack_170 = *plVar14 + uVar18;
      uStack_160 = 0;
      lStack_158 = 0;
      lStack_150 = 8;
      lStack_148 = 0;
      if (uVar7 != 0) {
        puVar24 = (undefined8 *)((ulong)acStack_120 | 1);
        puVar26 = (undefined8 *)((ulong)&cStack_f8 | 1);
        do {
          func_0x001b0d08(acStack_120,&lStack_170);
          lVar21 = lStack_148;
          if (acStack_120[0] == '\x11') {
            uStack_131 = (undefined1)uStack_110;
            uStack_130 = (undefined7)((ulong)uStack_110 >> 8);
            uStack_139 = (undefined1)uStack_118;
            uStack_138 = (undefined7)((ulong)uStack_118 >> 8);
            uStack_129 = uStack_108;
            extraout_x8_02[2] = uStack_110;
            extraout_x8_02[1] = uStack_118;
            extraout_x8_02[3] = uStack_108;
            *extraout_x8_02 = 1;
            if (lStack_148 != 0) {
              lVar21 = lStack_150;
              lVar25 = lStack_148;
              do {
                func_0x0016abd8(lVar21);
                lVar21 = lVar21 + 0x28;
                lVar25 = lVar25 + -1;
              } while (lVar25 != 0);
            }
            if (lStack_158 == 0) {
              return;
            }
            func_0x00187bd4(lStack_150,lStack_158 * 0x28,8);
            return;
          }
          uStack_129 = *(undefined8 *)((long)puVar24 + 0x17);
          uStack_130 = (undefined7)((ulong)*(undefined8 *)((long)puVar24 + 0xf) >> 8);
          uVar27 = puVar24[1];
          uVar13 = *puVar24;
          uStack_138 = (undefined7)uVar27;
          uStack_131 = (undefined1)((ulong)uVar27 >> 0x38);
          uStack_140 = (undefined7)uVar13;
          uStack_139 = (undefined1)((ulong)uVar13 >> 0x38);
          cStack_f8 = acStack_120[0];
          puVar26[1] = uVar27;
          *puVar26 = uVar13;
          *(undefined8 *)((long)puVar26 + 0x17) = uStack_129;
          *(ulong *)((long)puVar26 + 0xf) = CONCAT71(uStack_130,uStack_131);
          uStack_d8 = uStack_100;
          if (lStack_148 == lStack_158) {
            func_0x001d9010(&lStack_158,&UNK_009c24d8);
          }
          puVar17 = (undefined8 *)(lStack_150 + lVar21 * 0x28);
          puVar17[1] = uStack_f0;
          *puVar17 = CONCAT71(uStack_f7,cStack_f8);
          puVar17[3] = uStack_e0;
          puVar17[2] = uStack_e8;
          puVar17[4] = uStack_d8;
          lStack_148 = lVar21 + 1;
        } while (uStack_160 < uStack_168);
      }
      extraout_x8_02[2] = lStack_150;
      extraout_x8_02[1] = lStack_158;
      extraout_x8_02[3] = lStack_148;
      *extraout_x8_02 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_02;
    uVar18 = extraout_x8_03;
code_r0x001ab51c:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_04;
    uVar19 = extraout_x9_02;
code_r0x001ab52c:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_03;
    uVar19 = extraout_x9_03;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  func_0x0016abd8(&cStack_f8);
  func_0x001a0f94(&lStack_158);
  uVar13 = __Unwind_Resume(uVar13);
  func_0x001a0f94(&lStack_158);
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 == uVar19) {
    extraout_x8_05[2] = &UNK_008298d8;
    extraout_x8_05[3] = 2;
    *(undefined1 *)(extraout_x8_05 + 1) = 0xc;
    *extraout_x8_05 = 1;
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
      extraout_x8_05[2] = uVar20;
      extraout_x8_05[3] = 0;
      *extraout_x8_05 = 1;
      extraout_x8_05[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uVar20;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uVar20)) goto code_r0x001ab704;
    if (uVar19 <= uVar16) {
      lStack_1e8 = 0;
      lStack_1e0 = 1;
      lStack_1d8 = 0;
      if (bVar28 != 0) {
        lVar25 = 0;
        do {
          lVar15 = lStack_1d8;
          bVar5 = *(byte *)(lVar21 + uVar18 + lStack_1d8);
          bVar28 = 2;
          if (bVar5 != 0x40) {
            bVar28 = 3;
          }
          bVar3 = bVar5;
          if (1 < bVar5) {
            bVar3 = bVar28;
          }
          if (lStack_1d8 == lStack_1e8) {
            func_0x001d8c88(&lStack_1e8,&UNK_009c24d8);
          }
          *(byte *)(lStack_1e0 + lVar25) = bVar3;
          ((byte *)(lStack_1e0 + lVar25))[1] = bVar5;
          lStack_1d8 = lVar15 + 1;
          lVar25 = lVar25 + 2;
        } while (lVar15 != uVar20 - 1);
      }
      extraout_x8_05[2] = lStack_1e0;
      extraout_x8_05[1] = lStack_1e8;
      extraout_x8_05[3] = lStack_1d8;
      *extraout_x8_05 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_04;
    uVar18 = extraout_x8_06;
code_r0x001ab6f4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_07;
    uVar19 = extraout_x9_04;
code_r0x001ab704:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_05;
    uVar19 = extraout_x9_05;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_1e8 != 0) {
    func_0x00187bd4(lStack_1e0,lStack_1e8 << 1,1);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 == uVar19) {
    extraout_x8_08[2] = &UNK_008298d8;
    extraout_x8_08[3] = 2;
    *(undefined1 *)(extraout_x8_08 + 1) = 0xc;
    *extraout_x8_08 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar14[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001ab8f4;
    bVar28 = *(byte *)(*plVar14 + uVar19);
    uStack_270 = (ulong)bVar28;
    if (uVar16 - uVar18 < uStack_270) {
      extraout_x8_08[2] = uStack_270;
      extraout_x8_08[3] = 0;
      *extraout_x8_08 = 1;
      extraout_x8_08[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_270;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uStack_270)) goto code_r0x001ab904;
    if (uVar19 <= uVar16) {
      lStack_278 = *plVar14 + uVar18;
      uStack_268 = 0;
      lStack_260 = 0;
      lStack_258 = 2;
      lStack_250 = 0;
      if (bVar28 != 0) {
        do {
          func_0x001f10d8(&cStack_248,&lStack_278);
          lVar21 = lStack_250;
          if (cStack_248 != '\x15') {
            *(undefined8 *)((long)extraout_x8_08 + 0x16) = uStack_23a;
            *(undefined8 *)((long)extraout_x8_08 + 0xe) = uStack_242;
            *(undefined2 *)((long)extraout_x8_08 + 0x1e) = uStack_232;
            *(char *)(extraout_x8_08 + 1) = cStack_248;
            *(undefined1 *)((long)extraout_x8_08 + 9) = uStack_247;
            *(undefined4 *)((long)extraout_x8_08 + 10) = uStack_246;
            *extraout_x8_08 = 1;
            if (lStack_260 == 0) {
              return;
            }
            func_0x00187bd4(lStack_258,lStack_260 << 2,2);
            return;
          }
          uVar10 = (undefined2)uStack_246;
          uVar11 = uStack_246._2_2_;
          if (lStack_250 == lStack_260) {
            func_0x001d8d34(&lStack_260,&UNK_009c24d8);
          }
          puVar1 = (undefined2 *)(lStack_258 + lVar21 * 4);
          *puVar1 = uVar10;
          puVar1[1] = uVar11;
          lStack_250 = lVar21 + 1;
        } while (uStack_268 < uStack_270);
      }
      extraout_x8_08[2] = lStack_258;
      extraout_x8_08[1] = lStack_260;
      extraout_x8_08[3] = lStack_250;
      *extraout_x8_08 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_06;
    uVar18 = extraout_x8_09;
code_r0x001ab8f4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_10;
    uVar19 = extraout_x9_06;
code_r0x001ab904:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_07;
    uVar19 = extraout_x9_07;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_260 != 0) {
    func_0x00187bd4(lStack_258,lStack_260 << 2,2);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_11[2] = &UNK_008298da;
    extraout_x8_11[3] = 3;
    *(undefined1 *)(extraout_x8_11 + 1) = 0xc;
    *extraout_x8_11 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar14[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto code_r0x001abbe4;
    uVar7 = *(ushort *)(*plVar14 + uVar19);
    uStack_328 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_328) {
      extraout_x8_11[2] = uStack_328;
      extraout_x8_11[3] = 0;
      *extraout_x8_11 = 1;
      extraout_x8_11[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_328;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uStack_328)) goto code_r0x001abbf4;
    if (uVar19 <= uVar16) {
      lStack_330 = *plVar14 + uVar18;
      uStack_320 = 0;
      lStack_318 = 0;
      lStack_310 = 8;
      lStack_308 = 0;
      if (uVar7 != 0) {
        do {
          func_0x001f2140(&uStack_300,&lStack_330);
          uVar9 = uStack_2fc;
          uVar7 = uStack_300._2_2_;
          if ((char)uStack_300 != '\x15') {
            uVar23 = (undefined1)((uint)uStack_300 >> 8);
            uVar22 = (uint)uStack_2fc;
            uStack_2e8 = (ulong)uStack_2f0;
            uVar16 = uStack_2f8;
code_r0x001abb34:
            *(char *)(extraout_x8_11 + 1) = (char)uStack_300;
            *(undefined1 *)((long)extraout_x8_11 + 9) = uVar23;
            *(ushort *)((long)extraout_x8_11 + 10) = uStack_300._2_2_;
            *(short *)((long)extraout_x8_11 + 0xc) = (short)uVar22;
            *(undefined2 *)((long)extraout_x8_11 + 0xe) = uStack_2fa;
            extraout_x8_11[2] = uVar16;
            *(short *)(extraout_x8_11 + 3) = (short)uStack_2e8;
            *(ushort *)((long)extraout_x8_11 + 0x1a) = uStack_2ee;
            *(uint *)((long)extraout_x8_11 + 0x1c) = uStack_2ec;
            *extraout_x8_11 = 1;
            if (lStack_308 != 0) {
              puVar24 = (undefined8 *)(lStack_310 + 8);
              lVar21 = lStack_308;
              do {
                if (puVar24[-1] != 0) {
                  func_0x00187bd4(*puVar24,puVar24[-1],1);
                }
                puVar24 = puVar24 + 4;
                lVar21 = lVar21 + -1;
              } while (lVar21 != 0);
            }
            if (lStack_318 == 0) {
              return;
            }
            func_0x00187bd4(lStack_310,lStack_318 << 5,8);
            return;
          }
          uVar20 = (ulong)uStack_300._2_2_;
          func_0x00223f7c(&uStack_300,&lStack_330);
          uVar18 = uStack_2e8;
          uVar19 = uStack_2f8;
          lVar21 = lStack_308;
          uVar16 = CONCAT44(uStack_2ec,CONCAT22(uStack_2ee,uStack_2f0));
          if (uStack_300 == 1) {
            uVar23 = (undefined1)(uStack_2f8 >> 8);
            uStack_300._0_1_ = (char)uStack_2f8;
            uStack_300._2_2_ = (ushort)(uStack_2f8 >> 0x10);
            uVar22 = (uint)(uStack_2f8 >> 0x20);
            uStack_2fa = (undefined2)(uStack_2f8 >> 0x30);
            uStack_2ee = (ushort)(uStack_2e8 >> 0x10);
            uStack_2ec = (uint)(uStack_2e8 >> 0x20);
            goto code_r0x001abb34;
          }
          if (uStack_2f8 == 0x8000000000000000) {
            uStack_300._0_1_ = (char)uStack_2f0;
            uVar23 = (undefined1)(uStack_2f0 >> 8);
            uStack_2fa = (undefined2)(uStack_2ec >> 0x10);
            uVar16 = uStack_2e8;
            uStack_2e8 = uVar20;
            uVar22 = uStack_2ec;
            uStack_2ec = extraout_w13;
            uStack_300._2_2_ = uStack_2ee;
            uStack_2ee = uVar9;
            goto code_r0x001abb34;
          }
          if (lStack_308 == lStack_318) {
            func_0x001d8840(&lStack_318,&UNK_009c24d8);
          }
          puVar2 = (ulong *)(lStack_310 + lVar21 * 0x20);
          *puVar2 = uVar19;
          puVar2[1] = uVar16;
          puVar2[2] = uVar18;
          *(ushort *)(puVar2 + 3) = uVar7;
          *(ushort *)((long)puVar2 + 0x1a) = uVar9;
          lStack_308 = lVar21 + 1;
        } while (uStack_320 < uStack_328);
      }
      extraout_x8_11[2] = lStack_310;
      extraout_x8_11[1] = lStack_318;
      extraout_x8_11[3] = lStack_308;
      *extraout_x8_11 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_08;
    uVar18 = extraout_x8_12;
code_r0x001abbe4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_13;
    uVar19 = extraout_x9_08;
code_r0x001abbf4:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_09;
    uVar19 = extraout_x9_09;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (unaff_x22 != 0) {
    func_0x00187bd4();
    func_0x001a0dec(&lStack_318);
    uVar13 = __Unwind_Resume(uVar13);
  }
  func_0x001a0dec(&lStack_318);
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 == uVar19) {
    extraout_x8_14[2] = &UNK_008298d8;
    extraout_x8_14[3] = 2;
    *(undefined1 *)(extraout_x8_14 + 1) = 0xc;
    *extraout_x8_14 = 1;
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
      extraout_x8_14[2] = uVar20;
      extraout_x8_14[3] = 0;
      *extraout_x8_14 = 1;
      extraout_x8_14[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uVar20;
    plVar14[2] = uVar19;
    if (CARRY8(uVar18,uVar20)) goto code_r0x001abdd0;
    if (uVar19 <= uVar16) {
      lStack_3a8 = 0;
      lStack_3a0 = 1;
      lStack_398 = 0;
      if (bVar28 != 0) {
        lVar25 = 0;
        do {
          lVar15 = lStack_398;
          cVar6 = *(char *)(lVar21 + uVar18 + lStack_398);
          uVar23 = 1;
          if (cVar6 != '\x02') {
            uVar23 = 2;
          }
          uVar4 = 0;
          if (cVar6 != '\0') {
            uVar4 = uVar23;
          }
          if (lStack_398 == lStack_3a8) {
            func_0x001d8c88(&lStack_3a8,&UNK_009c24d8);
          }
          *(undefined1 *)(lStack_3a0 + lVar25) = uVar4;
          ((undefined1 *)(lStack_3a0 + lVar25))[1] = cVar6;
          lStack_398 = lVar15 + 1;
          lVar25 = lVar25 + 2;
        } while (lVar15 != uVar20 - 1);
      }
      extraout_x8_14[2] = lStack_3a0;
      extraout_x8_14[1] = lStack_3a8;
      extraout_x8_14[3] = lStack_398;
      *extraout_x8_14 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_10;
    uVar18 = extraout_x8_15;
code_r0x001abdc0:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_16;
    uVar19 = extraout_x9_10;
code_r0x001abdd0:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_11;
    uVar19 = extraout_x9_11;
  }
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_3a8 != 0) {
    func_0x00187bd4(lStack_3a0,lStack_3a8 << 1,1);
  }
  plVar14 = (long *)__Unwind_Resume(uVar13);
  uVar16 = plVar14[1];
  uVar19 = plVar14[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_17[2] = &UNK_008298da;
    extraout_x8_17[3] = 3;
    *(undefined1 *)(extraout_x8_17 + 1) = 0xc;
    *extraout_x8_17 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar14[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto LAB_001ac00c;
    uVar7 = *(ushort *)(*plVar14 + uVar19);
    uStack_458 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_458) {
      extraout_x8_17[2] = uStack_458;
      extraout_x8_17[3] = 0;
      *extraout_x8_17 = 1;
      extraout_x8_17[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_458;
    plVar14[2] = uVar19;
    if (!CARRY8(uVar18,uStack_458)) {
      if (uVar19 <= uVar16) {
        lStack_460 = *plVar14 + uVar18;
        uStack_450 = 0;
        lStack_448 = 0;
        lStack_440 = 8;
        lStack_438 = 0;
        if (uVar7 != 0) {
          do {
            func_0x001b932c(&lStack_420,&lStack_460);
            lVar8 = lStack_418;
            lVar15 = lStack_420;
            lVar25 = lStack_438;
            lVar21 = lStack_440;
            lStack_428 = lStack_408;
            lStack_430 = lStack_410;
            if (lStack_420 == -0x7ffffffffffffffe) {
              extraout_x8_17[3] = lStack_408;
              extraout_x8_17[2] = lStack_410;
              *extraout_x8_17 = 1;
              extraout_x8_17[1] = lStack_418;
              if (lStack_438 != 0) {
                puVar24 = (undefined8 *)(lStack_440 + 8);
                do {
                  lVar15 = puVar24[-1];
                  if (-0x7fffffffffffffff < lVar15 && lVar15 != 0) {
                    func_0x00187bd4(*puVar24,lVar15,1);
                  }
                  puVar24 = puVar24 + 4;
                  lVar25 = lVar25 + -1;
                } while (lVar25 != 0);
              }
              if (lStack_448 == 0) {
                return;
              }
              func_0x00187bd4(lVar21,lStack_448 << 5,8);
              return;
            }
            if (lStack_438 == lStack_448) {
              func_0x001d8840(&lStack_448,&UNK_009c24d8);
            }
            plVar14 = (long *)(lStack_440 + lVar25 * 0x20);
            *plVar14 = lVar15;
            plVar14[1] = lVar8;
            plVar14[3] = lStack_428;
            plVar14[2] = lStack_430;
            lStack_438 = lVar25 + 1;
          } while (uStack_450 < uStack_458);
        }
        extraout_x8_17[2] = lStack_440;
        extraout_x8_17[1] = lStack_448;
        extraout_x8_17[3] = lStack_438;
        *extraout_x8_17 = 0;
        return;
      }
      goto LAB_001ac030;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_12;
    uVar18 = extraout_x8_18;
LAB_001ac00c:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_19;
    uVar19 = extraout_x9_12;
  }
  func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
  uVar16 = extraout_x1_13;
  uVar19 = extraout_x9_13;
LAB_001ac030:
  uVar13 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if ((-0x7fffffffffffffff < unaff_x22) && (unaff_x22 != 0)) {
    func_0x00187bd4();
    func_0x00183ef0(&lStack_448);
    uVar13 = __Unwind_Resume(uVar13);
  }
  func_0x00183ef0(&lStack_448);
  auVar29 = __Unwind_Resume(uVar13);
  puVar24 = auVar29._0_8_;
  lStack_4d8 = 0;
  lStack_4d0 = 8;
  lStack_4c8 = 0;
  if (auVar29._8_8_ == 0) {
code_r0x001ac170:
    extraout_x8_20[1] = lStack_4d0;
    *extraout_x8_20 = lStack_4d8;
    extraout_x8_20[2] = lStack_4c8;
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
      lVar25 = lStack_4c8;
      if (lStack_4c8 == lStack_4d8) {
        func_0x001d88f4(&lStack_4d8,&UNK_009c24f0);
      }
      plVar14 = (long *)(lStack_4d0 + lVar25 * 0x18);
      *plVar14 = lVar21;
      plVar14[1] = unaff_x23;
      plVar14[2] = lVar21;
      lStack_4c8 = lVar25 + 1;
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

