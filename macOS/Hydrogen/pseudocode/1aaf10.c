
void FUN_001aaf10(undefined8 param_1,undefined8 param_2)

{
  undefined2 *puVar1;
  ulong *puVar2;
  undefined1 uVar3;
  byte bVar4;
  char cVar5;
  byte bVar6;
  ushort uVar7;
  long lVar8;
  ushort uVar9;
  undefined2 uVar10;
  undefined2 uVar11;
  code *pcVar12;
  long *plVar13;
  undefined8 uVar14;
  ulong extraout_x1;
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
  ulong extraout_x1_12;
  long lVar15;
  ulong extraout_x1_13;
  ulong extraout_x1_14;
  ulong uVar16;
  undefined8 *extraout_x8;
  ulong extraout_x8_00;
  ulong extraout_x8_01;
  undefined8 *extraout_x8_02;
  ulong extraout_x8_03;
  ulong extraout_x8_04;
  undefined8 *extraout_x8_05;
  undefined8 *puVar17;
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
  undefined8 *extraout_x8_20;
  ulong extraout_x8_21;
  ulong extraout_x8_22;
  ulong uVar18;
  long *extraout_x8_23;
  long in_x9;
  ulong extraout_x9;
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
  ulong extraout_x9_13;
  ulong uVar19;
  ulong extraout_x9_14;
  ulong uVar20;
  long lVar21;
  uint uVar22;
  uint extraout_w13;
  undefined1 uVar23;
  undefined8 *puVar24;
  long unaff_x22;
  long lVar25;
  undefined8 *puVar26;
  long unaff_x23;
  undefined8 uVar27;
  byte bVar28;
  undefined1 auVar29 [16];
  long lStack_558;
  long lStack_550;
  long lStack_548;
  long lStack_4e0;
  ulong uStack_4d8;
  ulong uStack_4d0;
  long lStack_4c8;
  long lStack_4c0;
  long lStack_4b8;
  long lStack_4b0;
  long lStack_4a8;
  long lStack_4a0;
  long lStack_498;
  long lStack_490;
  long lStack_488;
  long lStack_428;
  long lStack_420;
  long lStack_418;
  long lStack_3b0;
  ulong uStack_3a8;
  ulong uStack_3a0;
  long lStack_398;
  long lStack_390;
  long lStack_388;
  undefined4 uStack_380;
  ushort uStack_37c;
  undefined2 uStack_37a;
  ulong uStack_378;
  ushort uStack_370;
  ushort uStack_36e;
  uint uStack_36c;
  ulong uStack_368;
  long lStack_2f8;
  ulong uStack_2f0;
  ulong uStack_2e8;
  long lStack_2e0;
  long lStack_2d8;
  long lStack_2d0;
  char cStack_2c8;
  undefined1 uStack_2c7;
  undefined4 uStack_2c6;
  undefined8 uStack_2c2;
  undefined8 uStack_2ba;
  undefined2 uStack_2b2;
  long lStack_268;
  long lStack_260;
  long lStack_258;
  long lStack_1f0;
  ulong uStack_1e8;
  ulong uStack_1e0;
  long lStack_1d8;
  long lStack_1d0;
  long lStack_1c8;
  undefined7 uStack_1c0;
  undefined1 uStack_1b9;
  undefined7 uStack_1b8;
  undefined1 uStack_1b1;
  undefined7 uStack_1b0;
  undefined8 uStack_1a9;
  char acStack_1a0 [8];
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  char cStack_178;
  undefined7 uStack_177;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  long lStack_108;
  ulong uStack_100;
  ulong uStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  char cStack_d8;
  undefined1 uStack_d7;
  undefined4 uStack_d6;
  undefined8 uStack_d2;
  undefined8 uStack_ca;
  undefined2 uStack_c2;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  
  func_0x00187bd4(param_1,in_x9 << 2,2);
  plVar13 = (long *)__Unwind_Resume(param_2);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 == uVar19) {
    extraout_x8[2] = &UNK_008298d8;
    extraout_x8[3] = 2;
    *(undefined1 *)(extraout_x8 + 1) = 0xc;
    *extraout_x8 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar13[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001ab098;
    lVar21 = *plVar13;
    bVar28 = *(byte *)(lVar21 + uVar19);
    uVar20 = (ulong)bVar28;
    if (uVar16 - uVar18 < uVar20) {
      extraout_x8[2] = uVar20;
      extraout_x8[3] = 0;
      *extraout_x8 = 1;
      extraout_x8[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uVar20;
    plVar13[2] = uVar19;
    if (CARRY8(uVar18,uVar20)) goto code_r0x001ab0a8;
    if (uVar19 <= uVar16) {
      lStack_78 = 0;
      lStack_70 = 1;
      lStack_68 = 0;
      if (bVar28 != 0) {
        lVar25 = 0;
        do {
          lVar15 = lStack_68;
          cVar5 = *(char *)(lVar21 + uVar18 + lStack_68);
          uVar23 = 1;
          if (cVar5 != '\x01') {
            uVar23 = 2;
          }
          uVar3 = 0;
          if (cVar5 != '\0') {
            uVar3 = uVar23;
          }
          if (lStack_68 == lStack_78) {
            func_0x001d8c88(&lStack_78,&UNK_009c24d8);
          }
          *(undefined1 *)(lStack_70 + lVar25) = uVar3;
          ((undefined1 *)(lStack_70 + lVar25))[1] = cVar5;
          lStack_68 = lVar15 + 1;
          lVar25 = lVar25 + 2;
        } while (lVar15 != uVar20 - 1);
      }
      extraout_x8[2] = lStack_70;
      extraout_x8[1] = lStack_78;
      extraout_x8[3] = lStack_68;
      *extraout_x8 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1;
    uVar18 = extraout_x8_00;
code_r0x001ab098:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_01;
    uVar19 = extraout_x9;
code_r0x001ab0a8:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_00;
    uVar19 = extraout_x9_00;
  }
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_78 != 0) {
    func_0x00187bd4(lStack_70,lStack_78 << 1,1);
  }
  plVar13 = (long *)__Unwind_Resume(uVar14);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_02[2] = &UNK_008298da;
    extraout_x8_02[3] = 3;
    *(undefined1 *)(extraout_x8_02 + 1) = 0xc;
    *extraout_x8_02 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar13[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto LAB_001ab2ac;
    uVar7 = *(ushort *)(*plVar13 + uVar19);
    uStack_100 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_100) {
      extraout_x8_02[2] = uStack_100;
      extraout_x8_02[3] = 0;
      *extraout_x8_02 = 1;
      extraout_x8_02[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_100;
    plVar13[2] = uVar19;
    if (CARRY8(uVar18,uStack_100)) goto code_r0x001ab2bc;
    if (uVar19 <= uVar16) {
      lStack_108 = *plVar13 + uVar18;
      uStack_f8 = 0;
      lStack_f0 = 0;
      lStack_e8 = 2;
      lStack_e0 = 0;
      if (uVar7 != 0) {
        do {
          func_0x001f6b2c(&cStack_d8,&lStack_108);
          lVar21 = lStack_e0;
          if (cStack_d8 != '\x15') {
            *(undefined8 *)((long)extraout_x8_02 + 0x16) = uStack_ca;
            *(undefined8 *)((long)extraout_x8_02 + 0xe) = uStack_d2;
            *(undefined2 *)((long)extraout_x8_02 + 0x1e) = uStack_c2;
            *(char *)(extraout_x8_02 + 1) = cStack_d8;
            *(undefined1 *)((long)extraout_x8_02 + 9) = uStack_d7;
            *(undefined4 *)((long)extraout_x8_02 + 10) = uStack_d6;
            *extraout_x8_02 = 1;
            if (lStack_f0 == 0) {
              return;
            }
            func_0x00187bd4(lStack_e8,lStack_f0 << 2,2);
            return;
          }
          uVar10 = (undefined2)uStack_d6;
          uVar11 = uStack_d6._2_2_;
          if (lStack_e0 == lStack_f0) {
            func_0x001d8d34(&lStack_f0,&UNK_009c24d8);
          }
          puVar1 = (undefined2 *)(lStack_e8 + lVar21 * 4);
          *puVar1 = uVar10;
          puVar1[1] = uVar11;
          lStack_e0 = lVar21 + 1;
        } while (uStack_f8 < uStack_100);
      }
      extraout_x8_02[2] = lStack_e8;
      extraout_x8_02[1] = lStack_f0;
      extraout_x8_02[3] = lStack_e0;
      *extraout_x8_02 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_01;
    uVar18 = extraout_x8_03;
LAB_001ab2ac:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_04;
    uVar19 = extraout_x9_01;
code_r0x001ab2bc:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_02;
    uVar19 = extraout_x9_02;
  }
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_f0 != 0) {
    func_0x00187bd4(lStack_e8,lStack_f0 << 2,2);
  }
  plVar13 = (long *)__Unwind_Resume(uVar14);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_05[2] = &UNK_008298da;
    extraout_x8_05[3] = 3;
    *(undefined1 *)(extraout_x8_05 + 1) = 0xc;
    *extraout_x8_05 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar13[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto code_r0x001ab51c;
    uVar7 = *(ushort *)(*plVar13 + uVar19);
    uStack_1e8 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_1e8) {
      extraout_x8_05[2] = uStack_1e8;
      extraout_x8_05[3] = 0;
      *extraout_x8_05 = 1;
      extraout_x8_05[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_1e8;
    plVar13[2] = uVar19;
    if (CARRY8(uVar18,uStack_1e8)) goto code_r0x001ab52c;
    if (uVar19 <= uVar16) {
      lStack_1f0 = *plVar13 + uVar18;
      uStack_1e0 = 0;
      lStack_1d8 = 0;
      lStack_1d0 = 8;
      lStack_1c8 = 0;
      if (uVar7 != 0) {
        puVar24 = (undefined8 *)((ulong)acStack_1a0 | 1);
        puVar26 = (undefined8 *)((ulong)&cStack_178 | 1);
        do {
          func_0x001b0d08(acStack_1a0,&lStack_1f0);
          lVar21 = lStack_1c8;
          if (acStack_1a0[0] == '\x11') {
            uStack_1b1 = (undefined1)uStack_190;
            uStack_1b0 = (undefined7)((ulong)uStack_190 >> 8);
            uStack_1b9 = (undefined1)uStack_198;
            uStack_1b8 = (undefined7)((ulong)uStack_198 >> 8);
            uStack_1a9 = uStack_188;
            extraout_x8_05[2] = uStack_190;
            extraout_x8_05[1] = uStack_198;
            extraout_x8_05[3] = uStack_188;
            *extraout_x8_05 = 1;
            if (lStack_1c8 != 0) {
              lVar21 = lStack_1d0;
              lVar25 = lStack_1c8;
              do {
                func_0x0016abd8(lVar21);
                lVar21 = lVar21 + 0x28;
                lVar25 = lVar25 + -1;
              } while (lVar25 != 0);
            }
            if (lStack_1d8 == 0) {
              return;
            }
            func_0x00187bd4(lStack_1d0,lStack_1d8 * 0x28,8);
            return;
          }
          uStack_1a9 = *(undefined8 *)((long)puVar24 + 0x17);
          uStack_1b0 = (undefined7)((ulong)*(undefined8 *)((long)puVar24 + 0xf) >> 8);
          uVar27 = puVar24[1];
          uVar14 = *puVar24;
          uStack_1b8 = (undefined7)uVar27;
          uStack_1b1 = (undefined1)((ulong)uVar27 >> 0x38);
          uStack_1c0 = (undefined7)uVar14;
          uStack_1b9 = (undefined1)((ulong)uVar14 >> 0x38);
          cStack_178 = acStack_1a0[0];
          puVar26[1] = uVar27;
          *puVar26 = uVar14;
          *(undefined8 *)((long)puVar26 + 0x17) = uStack_1a9;
          *(ulong *)((long)puVar26 + 0xf) = CONCAT71(uStack_1b0,uStack_1b1);
          uStack_158 = uStack_180;
          if (lStack_1c8 == lStack_1d8) {
            func_0x001d9010(&lStack_1d8,&UNK_009c24d8);
          }
          puVar17 = (undefined8 *)(lStack_1d0 + lVar21 * 0x28);
          puVar17[1] = uStack_170;
          *puVar17 = CONCAT71(uStack_177,cStack_178);
          puVar17[3] = uStack_160;
          puVar17[2] = uStack_168;
          puVar17[4] = uStack_158;
          lStack_1c8 = lVar21 + 1;
        } while (uStack_1e0 < uStack_1e8);
      }
      extraout_x8_05[2] = lStack_1d0;
      extraout_x8_05[1] = lStack_1d8;
      extraout_x8_05[3] = lStack_1c8;
      *extraout_x8_05 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_03;
    uVar18 = extraout_x8_06;
code_r0x001ab51c:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_07;
    uVar19 = extraout_x9_03;
code_r0x001ab52c:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_04;
    uVar19 = extraout_x9_04;
  }
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  func_0x0016abd8(&cStack_178);
  func_0x001a0f94(&lStack_1d8);
  uVar14 = __Unwind_Resume(uVar14);
  func_0x001a0f94(&lStack_1d8);
  plVar13 = (long *)__Unwind_Resume(uVar14);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 == uVar19) {
    extraout_x8_08[2] = &UNK_008298d8;
    extraout_x8_08[3] = 2;
    *(undefined1 *)(extraout_x8_08 + 1) = 0xc;
    *extraout_x8_08 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar13[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001ab6f4;
    lVar21 = *plVar13;
    bVar28 = *(byte *)(lVar21 + uVar19);
    uVar20 = (ulong)bVar28;
    if (uVar16 - uVar18 < uVar20) {
      extraout_x8_08[2] = uVar20;
      extraout_x8_08[3] = 0;
      *extraout_x8_08 = 1;
      extraout_x8_08[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uVar20;
    plVar13[2] = uVar19;
    if (CARRY8(uVar18,uVar20)) goto code_r0x001ab704;
    if (uVar19 <= uVar16) {
      lStack_268 = 0;
      lStack_260 = 1;
      lStack_258 = 0;
      if (bVar28 != 0) {
        lVar25 = 0;
        do {
          lVar15 = lStack_258;
          bVar6 = *(byte *)(lVar21 + uVar18 + lStack_258);
          bVar28 = 2;
          if (bVar6 != 0x40) {
            bVar28 = 3;
          }
          bVar4 = bVar6;
          if (1 < bVar6) {
            bVar4 = bVar28;
          }
          if (lStack_258 == lStack_268) {
            func_0x001d8c88(&lStack_268,&UNK_009c24d8);
          }
          *(byte *)(lStack_260 + lVar25) = bVar4;
          ((byte *)(lStack_260 + lVar25))[1] = bVar6;
          lStack_258 = lVar15 + 1;
          lVar25 = lVar25 + 2;
        } while (lVar15 != uVar20 - 1);
      }
      extraout_x8_08[2] = lStack_260;
      extraout_x8_08[1] = lStack_268;
      extraout_x8_08[3] = lStack_258;
      *extraout_x8_08 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_05;
    uVar18 = extraout_x8_09;
code_r0x001ab6f4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_10;
    uVar19 = extraout_x9_05;
code_r0x001ab704:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_06;
    uVar19 = extraout_x9_06;
  }
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_268 != 0) {
    func_0x00187bd4(lStack_260,lStack_268 << 1,1);
  }
  plVar13 = (long *)__Unwind_Resume(uVar14);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 == uVar19) {
    extraout_x8_11[2] = &UNK_008298d8;
    extraout_x8_11[3] = 2;
    *(undefined1 *)(extraout_x8_11 + 1) = 0xc;
    *extraout_x8_11 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar13[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001ab8f4;
    bVar28 = *(byte *)(*plVar13 + uVar19);
    uStack_2f0 = (ulong)bVar28;
    if (uVar16 - uVar18 < uStack_2f0) {
      extraout_x8_11[2] = uStack_2f0;
      extraout_x8_11[3] = 0;
      *extraout_x8_11 = 1;
      extraout_x8_11[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_2f0;
    plVar13[2] = uVar19;
    if (CARRY8(uVar18,uStack_2f0)) goto code_r0x001ab904;
    if (uVar19 <= uVar16) {
      lStack_2f8 = *plVar13 + uVar18;
      uStack_2e8 = 0;
      lStack_2e0 = 0;
      lStack_2d8 = 2;
      lStack_2d0 = 0;
      if (bVar28 != 0) {
        do {
          func_0x001f10d8(&cStack_2c8,&lStack_2f8);
          lVar21 = lStack_2d0;
          if (cStack_2c8 != '\x15') {
            *(undefined8 *)((long)extraout_x8_11 + 0x16) = uStack_2ba;
            *(undefined8 *)((long)extraout_x8_11 + 0xe) = uStack_2c2;
            *(undefined2 *)((long)extraout_x8_11 + 0x1e) = uStack_2b2;
            *(char *)(extraout_x8_11 + 1) = cStack_2c8;
            *(undefined1 *)((long)extraout_x8_11 + 9) = uStack_2c7;
            *(undefined4 *)((long)extraout_x8_11 + 10) = uStack_2c6;
            *extraout_x8_11 = 1;
            if (lStack_2e0 == 0) {
              return;
            }
            func_0x00187bd4(lStack_2d8,lStack_2e0 << 2,2);
            return;
          }
          uVar10 = (undefined2)uStack_2c6;
          uVar11 = uStack_2c6._2_2_;
          if (lStack_2d0 == lStack_2e0) {
            func_0x001d8d34(&lStack_2e0,&UNK_009c24d8);
          }
          puVar1 = (undefined2 *)(lStack_2d8 + lVar21 * 4);
          *puVar1 = uVar10;
          puVar1[1] = uVar11;
          lStack_2d0 = lVar21 + 1;
        } while (uStack_2e8 < uStack_2f0);
      }
      extraout_x8_11[2] = lStack_2d8;
      extraout_x8_11[1] = lStack_2e0;
      extraout_x8_11[3] = lStack_2d0;
      *extraout_x8_11 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_07;
    uVar18 = extraout_x8_12;
code_r0x001ab8f4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_13;
    uVar19 = extraout_x9_07;
code_r0x001ab904:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_08;
    uVar19 = extraout_x9_08;
  }
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_2e0 != 0) {
    func_0x00187bd4(lStack_2d8,lStack_2e0 << 2,2);
  }
  plVar13 = (long *)__Unwind_Resume(uVar14);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_14[2] = &UNK_008298da;
    extraout_x8_14[3] = 3;
    *(undefined1 *)(extraout_x8_14 + 1) = 0xc;
    *extraout_x8_14 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar13[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto code_r0x001abbe4;
    uVar7 = *(ushort *)(*plVar13 + uVar19);
    uStack_3a8 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_3a8) {
      extraout_x8_14[2] = uStack_3a8;
      extraout_x8_14[3] = 0;
      *extraout_x8_14 = 1;
      extraout_x8_14[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_3a8;
    plVar13[2] = uVar19;
    if (CARRY8(uVar18,uStack_3a8)) goto code_r0x001abbf4;
    if (uVar19 <= uVar16) {
      lStack_3b0 = *plVar13 + uVar18;
      uStack_3a0 = 0;
      lStack_398 = 0;
      lStack_390 = 8;
      lStack_388 = 0;
      if (uVar7 != 0) {
        do {
          func_0x001f2140(&uStack_380,&lStack_3b0);
          uVar9 = uStack_37c;
          uVar7 = uStack_380._2_2_;
          if ((char)uStack_380 != '\x15') {
            uVar23 = (undefined1)((uint)uStack_380 >> 8);
            uVar22 = (uint)uStack_37c;
            uStack_368 = (ulong)uStack_370;
            uVar16 = uStack_378;
code_r0x001abb34:
            *(char *)(extraout_x8_14 + 1) = (char)uStack_380;
            *(undefined1 *)((long)extraout_x8_14 + 9) = uVar23;
            *(ushort *)((long)extraout_x8_14 + 10) = uStack_380._2_2_;
            *(short *)((long)extraout_x8_14 + 0xc) = (short)uVar22;
            *(undefined2 *)((long)extraout_x8_14 + 0xe) = uStack_37a;
            extraout_x8_14[2] = uVar16;
            *(short *)(extraout_x8_14 + 3) = (short)uStack_368;
            *(ushort *)((long)extraout_x8_14 + 0x1a) = uStack_36e;
            *(uint *)((long)extraout_x8_14 + 0x1c) = uStack_36c;
            *extraout_x8_14 = 1;
            if (lStack_388 != 0) {
              puVar24 = (undefined8 *)(lStack_390 + 8);
              lVar21 = lStack_388;
              do {
                if (puVar24[-1] != 0) {
                  func_0x00187bd4(*puVar24,puVar24[-1],1);
                }
                puVar24 = puVar24 + 4;
                lVar21 = lVar21 + -1;
              } while (lVar21 != 0);
            }
            if (lStack_398 == 0) {
              return;
            }
            func_0x00187bd4(lStack_390,lStack_398 << 5,8);
            return;
          }
          uVar20 = (ulong)uStack_380._2_2_;
          func_0x00223f7c(&uStack_380,&lStack_3b0);
          uVar18 = uStack_368;
          uVar19 = uStack_378;
          lVar21 = lStack_388;
          uVar16 = CONCAT44(uStack_36c,CONCAT22(uStack_36e,uStack_370));
          if (uStack_380 == 1) {
            uVar23 = (undefined1)(uStack_378 >> 8);
            uStack_380._0_1_ = (char)uStack_378;
            uStack_380._2_2_ = (ushort)(uStack_378 >> 0x10);
            uVar22 = (uint)(uStack_378 >> 0x20);
            uStack_37a = (undefined2)(uStack_378 >> 0x30);
            uStack_36e = (ushort)(uStack_368 >> 0x10);
            uStack_36c = (uint)(uStack_368 >> 0x20);
            goto code_r0x001abb34;
          }
          if (uStack_378 == 0x8000000000000000) {
            uStack_380._0_1_ = (char)uStack_370;
            uVar23 = (undefined1)(uStack_370 >> 8);
            uStack_37a = (undefined2)(uStack_36c >> 0x10);
            uVar16 = uStack_368;
            uStack_368 = uVar20;
            uVar22 = uStack_36c;
            uStack_36c = extraout_w13;
            uStack_380._2_2_ = uStack_36e;
            uStack_36e = uVar9;
            goto code_r0x001abb34;
          }
          if (lStack_388 == lStack_398) {
            func_0x001d8840(&lStack_398,&UNK_009c24d8);
          }
          puVar2 = (ulong *)(lStack_390 + lVar21 * 0x20);
          *puVar2 = uVar19;
          puVar2[1] = uVar16;
          puVar2[2] = uVar18;
          *(ushort *)(puVar2 + 3) = uVar7;
          *(ushort *)((long)puVar2 + 0x1a) = uVar9;
          lStack_388 = lVar21 + 1;
        } while (uStack_3a0 < uStack_3a8);
      }
      extraout_x8_14[2] = lStack_390;
      extraout_x8_14[1] = lStack_398;
      extraout_x8_14[3] = lStack_388;
      *extraout_x8_14 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_09;
    uVar18 = extraout_x8_15;
code_r0x001abbe4:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_16;
    uVar19 = extraout_x9_09;
code_r0x001abbf4:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_10;
    uVar19 = extraout_x9_10;
  }
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (unaff_x22 != 0) {
    func_0x00187bd4();
    func_0x001a0dec(&lStack_398);
    uVar14 = __Unwind_Resume(uVar14);
  }
  func_0x001a0dec(&lStack_398);
  plVar13 = (long *)__Unwind_Resume(uVar14);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 == uVar19) {
    extraout_x8_17[2] = &UNK_008298d8;
    extraout_x8_17[3] = 2;
    *(undefined1 *)(extraout_x8_17 + 1) = 0xc;
    *extraout_x8_17 = 1;
    return;
  }
  uVar18 = uVar19 + 1;
  plVar13[2] = uVar18;
  if (uVar19 < 0xffffffffffffffff) {
    if (uVar16 < uVar18) goto code_r0x001abdc0;
    lVar21 = *plVar13;
    bVar28 = *(byte *)(lVar21 + uVar19);
    uVar20 = (ulong)bVar28;
    if (uVar16 - uVar18 < uVar20) {
      extraout_x8_17[2] = uVar20;
      extraout_x8_17[3] = 0;
      *extraout_x8_17 = 1;
      extraout_x8_17[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uVar20;
    plVar13[2] = uVar19;
    if (CARRY8(uVar18,uVar20)) goto code_r0x001abdd0;
    if (uVar19 <= uVar16) {
      lStack_428 = 0;
      lStack_420 = 1;
      lStack_418 = 0;
      if (bVar28 != 0) {
        lVar25 = 0;
        do {
          lVar15 = lStack_418;
          cVar5 = *(char *)(lVar21 + uVar18 + lStack_418);
          uVar23 = 1;
          if (cVar5 != '\x02') {
            uVar23 = 2;
          }
          uVar3 = 0;
          if (cVar5 != '\0') {
            uVar3 = uVar23;
          }
          if (lStack_418 == lStack_428) {
            func_0x001d8c88(&lStack_428,&UNK_009c24d8);
          }
          *(undefined1 *)(lStack_420 + lVar25) = uVar3;
          ((undefined1 *)(lStack_420 + lVar25))[1] = cVar5;
          lStack_418 = lVar15 + 1;
          lVar25 = lVar25 + 2;
        } while (lVar15 != uVar20 - 1);
      }
      extraout_x8_17[2] = lStack_420;
      extraout_x8_17[1] = lStack_428;
      extraout_x8_17[3] = lStack_418;
      *extraout_x8_17 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_11;
    uVar18 = extraout_x8_18;
code_r0x001abdc0:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_19;
    uVar19 = extraout_x9_11;
code_r0x001abdd0:
    func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
    uVar16 = extraout_x1_12;
    uVar19 = extraout_x9_12;
  }
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if (lStack_428 != 0) {
    func_0x00187bd4(lStack_420,lStack_428 << 1,1);
  }
  plVar13 = (long *)__Unwind_Resume(uVar14);
  uVar16 = plVar13[1];
  uVar19 = plVar13[2];
  if (uVar16 - uVar19 < 2) {
    extraout_x8_20[2] = &UNK_008298da;
    extraout_x8_20[3] = 3;
    *(undefined1 *)(extraout_x8_20 + 1) = 0xc;
    *extraout_x8_20 = 1;
    return;
  }
  uVar18 = uVar19 + 2;
  plVar13[2] = uVar18;
  if (uVar19 < 0xfffffffffffffffe) {
    if (uVar16 < uVar18) goto LAB_001ac00c;
    uVar7 = *(ushort *)(*plVar13 + uVar19);
    uStack_4d8 = (ulong)((uint)(uVar7 >> 8) | (uVar7 & 0xff00ff) << 8);
    if (uVar16 - uVar18 < uStack_4d8) {
      extraout_x8_20[2] = uStack_4d8;
      extraout_x8_20[3] = 0;
      *extraout_x8_20 = 1;
      extraout_x8_20[1] = 0xb;
      return;
    }
    uVar19 = uVar18 + uStack_4d8;
    plVar13[2] = uVar19;
    if (!CARRY8(uVar18,uStack_4d8)) {
      if (uVar19 <= uVar16) {
        lStack_4e0 = *plVar13 + uVar18;
        uStack_4d0 = 0;
        lStack_4c8 = 0;
        lStack_4c0 = 8;
        lStack_4b8 = 0;
        if (uVar7 != 0) {
          do {
            func_0x001b932c(&lStack_4a0,&lStack_4e0);
            lVar8 = lStack_498;
            lVar15 = lStack_4a0;
            lVar25 = lStack_4b8;
            lVar21 = lStack_4c0;
            lStack_4a8 = lStack_488;
            lStack_4b0 = lStack_490;
            if (lStack_4a0 == -0x7ffffffffffffffe) {
              extraout_x8_20[3] = lStack_488;
              extraout_x8_20[2] = lStack_490;
              *extraout_x8_20 = 1;
              extraout_x8_20[1] = lStack_498;
              if (lStack_4b8 != 0) {
                puVar24 = (undefined8 *)(lStack_4c0 + 8);
                do {
                  lVar15 = puVar24[-1];
                  if (-0x7fffffffffffffff < lVar15 && lVar15 != 0) {
                    func_0x00187bd4(*puVar24,lVar15,1);
                  }
                  puVar24 = puVar24 + 4;
                  lVar25 = lVar25 + -1;
                } while (lVar25 != 0);
              }
              if (lStack_4c8 == 0) {
                return;
              }
              func_0x00187bd4(lVar21,lStack_4c8 << 5,8);
              return;
            }
            if (lStack_4b8 == lStack_4c8) {
              func_0x001d8840(&lStack_4c8,&UNK_009c24d8);
            }
            plVar13 = (long *)(lStack_4c0 + lVar25 * 0x20);
            *plVar13 = lVar15;
            plVar13[1] = lVar8;
            plVar13[3] = lStack_4a8;
            plVar13[2] = lStack_4b0;
            lStack_4b8 = lVar25 + 1;
          } while (uStack_4d0 < uStack_4d8);
        }
        extraout_x8_20[2] = lStack_4c0;
        extraout_x8_20[1] = lStack_4c8;
        extraout_x8_20[3] = lStack_4b8;
        *extraout_x8_20 = 0;
        return;
      }
      goto LAB_001ac030;
    }
  }
  else {
    func_0x007a28bc(uVar19,uVar18,&UNK_009c9a78);
    uVar16 = extraout_x1_13;
    uVar18 = extraout_x8_21;
LAB_001ac00c:
    func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
    uVar18 = extraout_x8_22;
    uVar19 = extraout_x9_13;
  }
  func_0x007a28bc(uVar18,uVar19,&UNK_009c9a78);
  uVar16 = extraout_x1_14;
  uVar19 = extraout_x9_14;
LAB_001ac030:
  uVar14 = func_0x007a28b0(uVar19,uVar16,&UNK_009c9a78);
  if ((-0x7fffffffffffffff < unaff_x22) && (unaff_x22 != 0)) {
    func_0x00187bd4();
    func_0x00183ef0(&lStack_4c8);
    uVar14 = __Unwind_Resume(uVar14);
  }
  func_0x00183ef0(&lStack_4c8);
  auVar29 = __Unwind_Resume(uVar14);
  puVar24 = auVar29._0_8_;
  lStack_558 = 0;
  lStack_550 = 8;
  lStack_548 = 0;
  if (auVar29._8_8_ == 0) {
code_r0x001ac170:
    extraout_x8_23[1] = lStack_550;
    *extraout_x8_23 = lStack_558;
    extraout_x8_23[2] = lStack_548;
    return;
  }
  lVar21 = puVar24[1];
  if (lVar21 < 0) {
    uVar14 = 0;
  }
  else {
    uVar14 = 1;
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
      lVar25 = lStack_548;
      if (lStack_548 == lStack_558) {
        func_0x001d88f4(&lStack_558,&UNK_009c24f0);
      }
      plVar13 = (long *)(lStack_550 + lVar25 * 0x18);
      *plVar13 = lVar21;
      plVar13[1] = unaff_x23;
      plVar13[2] = lVar21;
      lStack_548 = lVar25 + 1;
      if (puVar26 + 2 == puVar24 + auVar29._8_8_ * 2) goto code_r0x001ac170;
      lVar21 = puVar26[3];
      puVar26 = puVar26 + 2;
    } while (-1 < lVar21);
    uVar14 = 0;
  }
code_r0x001ac1a4:
  func_0x007a1f00(uVar14,unaff_x23,&UNK_009c24c0);
                    /* WARNING: Does not return */
  pcVar12 = (code *)SoftwareBreakpoint(1,0x1ac1bc);
  (*pcVar12)();
}

