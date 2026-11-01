
long FUN_00506aec(void)

{
  undefined8 *puVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined1 uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  code *pcVar8;
  long lVar9;
  int iVar10;
  undefined8 *puVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  undefined8 *extraout_x8;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined1 *puVar17;
  ulong uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  long *plVar28;
  undefined8 uVar29;
  undefined8 *puVar30;
  long unaff_x20;
  undefined8 uVar31;
  ulong uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  long unaff_x21;
  undefined8 uVar35;
  undefined8 uVar36;
  long lVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  ulong uVar40;
  undefined8 uVar41;
  ulong uVar42;
  long unaff_x23;
  undefined8 uVar43;
  undefined8 uVar44;
  ulong uVar45;
  ulong uVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  undefined1 auVar50 [16];
  undefined8 uStack_2e8;
  undefined8 uStack_2e0;
  undefined8 uStack_2d8;
  undefined8 uStack_2d0;
  undefined8 uStack_2c8;
  undefined8 uStack_2c0;
  undefined8 uStack_2b8;
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined8 uStack_288;
  undefined8 uStack_280;
  undefined8 uStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  undefined8 uStack_260;
  undefined8 uStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  ulong uStack_1f8;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  long lStack_1d8;
  ulong uStack_1d0;
  ulong uStack_1c0;
  ulong uStack_188;
  ulong uStack_138;
  ulong uStack_130;
  ulong uStack_120;
  ulong uStack_118;
  ulong uStack_110;
  ulong uStack_108;
  ulong uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  ulong uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  ulong uStack_c8;
  long lStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  ulong uStack_80;
  undefined1 auStack_78 [16];
  
  do {
    if ((*(long *)(unaff_x20 + 0x220) == unaff_x21) &&
       (iVar10 = _memcmp(*(undefined8 *)(unaff_x20 + 0x218)), iVar10 == 0)) {
      return unaff_x20;
    }
    unaff_x20 = unaff_x20 + 600;
    unaff_x23 = unaff_x23 + -600;
  } while (unaff_x23 != 0);
  puVar11 = (undefined8 *)func_0x007a23d8(&UNK_008a4847,99);
  uVar43 = puVar11[0x46];
  uVar29 = puVar11[0x47];
  uVar31 = puVar11[0x48];
  uVar35 = puVar11[0x49];
  uVar2 = *(undefined4 *)(puVar11 + 0x57);
  if (puVar11[0x22] == -0x8000000000000000) {
    uStack_f8 = 0x8000000000000000;
    if (puVar11[0x25] == -0x8000000000000000) goto code_r0x00506bd8;
code_r0x00506b98:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x25);
    uStack_100 = uStack_e0;
    uStack_250 = uStack_d8;
    uStack_288 = uStack_d0;
  }
  else {
    func_0x0045cd08(&uStack_f8,puVar11 + 0x22);
    if (puVar11[0x25] != -0x8000000000000000) goto code_r0x00506b98;
code_r0x00506bd8:
    uStack_100 = 0x8000000000000000;
  }
  uVar44 = puVar11[0x4a];
  uVar48 = puVar11[0x4b];
  uVar22 = puVar11[0x4c];
  uVar15 = puVar11[0x4d];
  uVar23 = puVar11[0x4e];
  uVar16 = puVar11[0x4f];
  if (puVar11[0x28] == -0x8000000000000000) {
    uStack_108 = 0x8000000000000000;
    if (puVar11[0x2b] != -0x8000000000000000) goto code_r0x00506c98;
code_r0x00506c24:
    uStack_110 = 0x8000000000000000;
    if (puVar11[0x2e] != -0x8000000000000000) goto code_r0x00506cc8;
code_r0x00506c3c:
    uStack_118 = 0x8000000000000000;
    if (puVar11[0x31] != -0x8000000000000000) goto code_r0x00506cf8;
code_r0x00506c50:
    uStack_120 = 0x8000000000000000;
    if (puVar11[0x34] != -0x8000000000000000) goto code_r0x00506d24;
code_r0x00506c64:
    uVar45 = 0x8000000000000000;
  }
  else {
    func_0x0045cd08(&uStack_e0,puVar11 + 0x28);
    uStack_258 = uStack_d8;
    uStack_290 = uStack_d0;
    uStack_108 = uStack_e0;
    if (puVar11[0x2b] == -0x8000000000000000) goto code_r0x00506c24;
code_r0x00506c98:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x2b);
    uStack_110 = uStack_e0;
    uStack_260 = uStack_d8;
    uStack_298 = uStack_d0;
    if (puVar11[0x2e] == -0x8000000000000000) goto code_r0x00506c3c;
code_r0x00506cc8:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x2e);
    uStack_268 = uStack_d8;
    uStack_2a0 = uStack_d0;
    uStack_118 = uStack_e0;
    if (puVar11[0x31] == -0x8000000000000000) goto code_r0x00506c50;
code_r0x00506cf8:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x31);
    uStack_120 = uStack_e0;
    uStack_270 = uStack_d8;
    uStack_2a8 = uStack_d0;
    if (puVar11[0x34] == -0x8000000000000000) goto code_r0x00506c64;
code_r0x00506d24:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x34);
    uStack_278 = uStack_d8;
    uStack_2b0 = uStack_d0;
    uVar45 = uStack_e0;
  }
  if (puVar11[0x37] == -0x8000000000000000) {
    uStack_130 = 0x8000000000000000;
  }
  else {
    func_0x0045cd08(&uStack_e0,puVar11 + 0x37);
    uStack_130 = uStack_e0;
    uStack_248 = uStack_d0;
    uStack_240 = uStack_d8;
  }
  uVar36 = 0;
  uVar32 = puVar11[9];
  auVar50._8_8_ = 0;
  auVar50._0_8_ = uVar32;
  uVar40 = uVar32 * 0x18;
  if ((SUB168(auVar50 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar40)) {
code_r0x005074bc:
    func_0x007a1f00(uVar36,uVar40,&UNK_009e7fc8);
    goto code_r0x00507548;
  }
  if (uVar40 == 0) {
    lVar12 = 8;
  }
  else {
    puVar30 = (undefined8 *)puVar11[8];
    uVar36 = 8;
    lVar12 = func_0x00187bd0(uVar40,8);
    if (lVar12 == 0) goto code_r0x005074bc;
    if (uVar32 != 0) {
      puVar17 = (undefined1 *)(lVar12 + 0x10);
      uVar25 = uVar32;
      do {
        if (uVar40 == 0) break;
        uVar36 = *puVar30;
        uVar41 = puVar30[1];
        uVar5 = *(undefined1 *)(puVar30 + 2);
        puVar30 = puVar30 + 3;
        *(undefined8 *)(puVar17 + -0x10) = uVar36;
        *(undefined8 *)(puVar17 + -8) = uVar41;
        *puVar17 = uVar5;
        uVar40 = uVar40 - 0x18;
        uVar25 = uVar25 - 1;
        puVar17 = puVar17 + 0x18;
      } while (uVar25 != 0);
    }
  }
  uVar25 = puVar11[0xc];
  uVar40 = uVar25 * 8;
  if (uVar25 >> 0x3d != 0 || 0x7ffffffffffffffc < uVar40) {
    uVar36 = 0;
code_r0x00507534:
    func_0x007a1f00(uVar36,uVar40,&UNK_009e7fe0);
    goto code_r0x00507548;
  }
  uVar41 = puVar11[0xb];
  if (uVar40 == 0) {
    uStack_138 = 0;
    lVar13 = 4;
  }
  else {
    uVar36 = 4;
    lVar13 = func_0x00187bd0(uVar40,4);
    if (lVar13 == 0) goto code_r0x00507534;
    uStack_138 = uVar25;
  }
  _memcpy(lVar13,uVar41,uVar40);
  uVar36 = 0;
  uVar42 = puVar11[0xf];
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar42;
  uVar40 = uVar42 * 0x18;
  if ((SUB168(auVar6 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar40)) {
code_r0x005074d4:
    func_0x007a1f00(uVar36,uVar40,&UNK_009e7fc8);
    goto code_r0x00507548;
  }
  if (uVar40 == 0) {
    lStack_1d8 = 8;
    if (puVar11[0x3a] == -0x8000000000000000) goto code_r0x00506f3c;
code_r0x00506fa0:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x3a);
    uStack_188 = uStack_e0;
    uStack_2b8 = uStack_d8;
    uStack_2d8 = uStack_d0;
    if (puVar11[0x3d] == -0x8000000000000000) goto code_r0x00506f50;
code_r0x00506fcc:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x3d);
    uStack_2c0 = uStack_d8;
    uStack_280 = uStack_d0;
    uStack_1c0 = uStack_e0;
    if (puVar11[0x40] == -0x8000000000000000) goto code_r0x00506f64;
code_r0x00506ffc:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x40);
    uStack_1d0 = uStack_e0;
    uStack_2c8 = uStack_d8;
    uStack_2e0 = uStack_d0;
    uStack_1e0 = *puVar11;
    uStack_1e8 = puVar11[1];
    if (puVar11[0x43] == -0x8000000000000000) goto code_r0x00506f80;
code_r0x00507030:
    func_0x0045cd08(&uStack_e0,puVar11 + 0x43);
    uStack_2d0 = uStack_d8;
    uStack_2e8 = uStack_d0;
    uVar40 = uStack_e0;
  }
  else {
    puVar30 = (undefined8 *)puVar11[0xe];
    uVar36 = 8;
    lStack_1d8 = func_0x00187bd0(uVar40,8);
    if (lStack_1d8 == 0) goto code_r0x005074d4;
    if (uVar42 != 0) {
      puVar17 = (undefined1 *)(lStack_1d8 + 0x10);
      uVar26 = uVar42;
      do {
        if (uVar40 == 0) break;
        uVar36 = *puVar30;
        uVar41 = puVar30[1];
        uVar5 = *(undefined1 *)(puVar30 + 2);
        puVar30 = puVar30 + 3;
        *(undefined8 *)(puVar17 + -0x10) = uVar36;
        *(undefined8 *)(puVar17 + -8) = uVar41;
        *puVar17 = uVar5;
        uVar40 = uVar40 - 0x18;
        uVar26 = uVar26 - 1;
        puVar17 = puVar17 + 0x18;
      } while (uVar26 != 0);
    }
    if (puVar11[0x3a] != -0x8000000000000000) goto code_r0x00506fa0;
code_r0x00506f3c:
    uStack_188 = 0x8000000000000000;
    if (puVar11[0x3d] != -0x8000000000000000) goto code_r0x00506fcc;
code_r0x00506f50:
    uStack_1c0 = 0x8000000000000000;
    if (puVar11[0x40] != -0x8000000000000000) goto code_r0x00506ffc;
code_r0x00506f64:
    uStack_1d0 = 0x8000000000000000;
    uStack_1e0 = *puVar11;
    uStack_1e8 = puVar11[1];
    if (puVar11[0x43] != -0x8000000000000000) goto code_r0x00507030;
code_r0x00506f80:
    uVar40 = 0x8000000000000000;
  }
  uVar3 = *(undefined4 *)((long)puVar11 + 700);
  uVar4 = *(undefined4 *)(puVar11 + 0x58);
  func_0x004e2918(&uStack_80,puVar11 + 0x10,&UNK_009e8c50);
  uVar36 = 0;
  uVar26 = puVar11[0x15];
  uVar46 = uVar26 * 0x20;
  if ((uVar26 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar46)) {
code_r0x005074e8:
    func_0x007a1f00(uVar36,uVar46,&UNK_009e7fc8);
    goto code_r0x00507548;
  }
  if (uVar46 == 0) {
    lVar14 = 8;
  }
  else {
    lVar37 = puVar11[0x14];
    uVar36 = 8;
    lVar14 = func_0x00187bd0(uVar46,8);
    if (lVar14 == 0) goto code_r0x005074e8;
    if (uVar26 != 0) {
      uVar18 = 0;
      uVar27 = uVar26;
      do {
        if (uVar46 == uVar18) break;
        puVar30 = (undefined8 *)(lVar37 + uVar18);
        puVar1 = (undefined8 *)(lVar14 + uVar18);
        uVar36 = *puVar30;
        uVar19 = puVar30[3];
        uVar41 = puVar30[2];
        puVar1[1] = puVar30[1];
        *puVar1 = uVar36;
        puVar1[3] = uVar19;
        puVar1[2] = uVar41;
        uVar18 = uVar18 + 0x20;
        uVar27 = uVar27 - 1;
      } while (uVar27 != 0);
    }
  }
  uStack_d8 = auStack_78._0_8_;
  uStack_e0 = uStack_80;
  uStack_d0 = auStack_78._8_8_;
  uStack_c8 = uVar26;
  lStack_c0 = lVar14;
  uStack_b8 = uVar26;
  func_0x004e17b4(&uStack_b0,puVar11 + 0x16,&UNK_009e8c38);
  auVar50 = func_0x004e4980(&uStack_98,puVar11 + 0x19,&UNK_009e8c38);
  auVar7._8_8_ = auStack_78._8_8_;
  auVar7._0_8_ = auStack_78._0_8_;
  uVar38 = puVar11[0x50];
  uVar33 = puVar11[0x51];
  uVar36 = puVar11[2];
  uVar41 = puVar11[3];
  uVar19 = puVar11[0x52];
  uVar24 = puVar11[0x53];
  uVar20 = puVar11[0x54];
  uVar21 = puVar11[0x55];
  uStack_80 = puVar11[4];
  if (uStack_80 == 5) {
    uStack_80 = 5;
    auVar50 = auVar7;
  }
  else if (3 < uStack_80) {
    auVar50 = (**(code **)(puVar11[6] + 0x38))(puVar11[5]);
  }
  uVar47 = 0;
  uVar26 = puVar11[0x1e];
  uVar46 = uVar26 * 0x10;
  auStack_78 = auVar50;
  if ((uVar26 >> 0x3c == 0) && (uVar46 < 0x7ffffffffffffff9)) {
    uVar5 = *(undefined1 *)((long)puVar11 + 0x2c4);
    uVar39 = puVar11[0x56];
    uVar34 = puVar11[0x1d];
    if (uVar46 == 0) {
      uStack_1f8 = 0;
      lVar14 = 8;
    }
    else {
      uVar47 = 8;
      lVar14 = func_0x00187bd0(uVar46,8);
      if (lVar14 == 0) goto code_r0x00507500;
      uStack_1f8 = uVar26;
      auVar50 = auStack_78;
    }
    auStack_78 = auVar50;
    _memcpy(lVar14,uVar34,uVar46);
    uVar47 = 0;
    uVar46 = puVar11[0x21];
    uVar18 = uVar46 * 0x20;
    if ((uVar46 >> 0x3b == 0) && (uVar18 < 0x7ffffffffffffff9)) {
      if (uVar18 == 0) {
        lVar37 = 8;
code_r0x005072b8:
        extraout_x8[0x46] = uVar43;
        extraout_x8[0x47] = uVar29;
        extraout_x8[0x48] = uVar31;
        extraout_x8[0x49] = uVar35;
        *(undefined4 *)(extraout_x8 + 0x57) = uVar2;
        extraout_x8[0x26] = uStack_250;
        extraout_x8[0x27] = uStack_288;
        extraout_x8[0x4a] = uVar44;
        extraout_x8[0x4b] = uVar48;
        extraout_x8[0x4c] = uVar22;
        extraout_x8[0x4d] = uVar15;
        extraout_x8[0x4e] = uVar23;
        extraout_x8[0x4f] = uVar16;
        extraout_x8[0x28] = uStack_108;
        extraout_x8[0x29] = uStack_258;
        extraout_x8[0x2a] = uStack_290;
        extraout_x8[0x2b] = uStack_110;
        extraout_x8[0x2c] = uStack_260;
        extraout_x8[0x2d] = uStack_298;
        extraout_x8[0x2e] = uStack_118;
        extraout_x8[0x2f] = uStack_268;
        extraout_x8[0x30] = uStack_2a0;
        extraout_x8[0x31] = uStack_120;
        extraout_x8[0x32] = uStack_270;
        extraout_x8[0x33] = uStack_2a8;
        extraout_x8[0x34] = uVar45;
        extraout_x8[0x35] = uStack_278;
        extraout_x8[0x36] = uStack_2b0;
        extraout_x8[0x37] = uStack_130;
        extraout_x8[0x38] = uStack_240;
        extraout_x8[0x39] = uStack_248;
        extraout_x8[10] = uStack_138;
        extraout_x8[0xb] = lVar13;
        extraout_x8[0x3a] = uStack_188;
        extraout_x8[0x3b] = uStack_2b8;
        extraout_x8[0x3c] = uStack_2d8;
        extraout_x8[0x3d] = uStack_1c0;
        extraout_x8[0x23] = uStack_f0;
        extraout_x8[0x22] = uStack_f8;
        extraout_x8[0x24] = uStack_e8;
        extraout_x8[0x25] = uStack_100;
        extraout_x8[8] = lVar12;
        extraout_x8[9] = uVar32;
        extraout_x8[0xc] = uVar25;
        extraout_x8[0xd] = uVar42;
        extraout_x8[0xe] = lStack_1d8;
        extraout_x8[0xf] = uVar42;
        extraout_x8[0x3e] = uStack_2c0;
        extraout_x8[0x3f] = uStack_280;
        extraout_x8[0x40] = uStack_1d0;
        extraout_x8[0x41] = uStack_2c8;
        extraout_x8[0x42] = uStack_2e0;
        *extraout_x8 = uStack_1e0;
        extraout_x8[1] = uStack_1e8;
        extraout_x8[0x43] = uVar40;
        extraout_x8[0x44] = uStack_2d0;
        extraout_x8[0x45] = uStack_2e8;
        *(undefined4 *)((long)extraout_x8 + 700) = uVar3;
        *(undefined4 *)(extraout_x8 + 0x58) = uVar4;
        extraout_x8[0x11] = uStack_d8;
        extraout_x8[0x10] = uStack_e0;
        extraout_x8[0x13] = uStack_c8;
        extraout_x8[0x12] = uStack_d0;
        extraout_x8[0x18] = uStack_a0;
        extraout_x8[0x15] = uStack_b8;
        extraout_x8[0x14] = lStack_c0;
        extraout_x8[0x17] = uStack_a8;
        extraout_x8[0x16] = uStack_b0;
        extraout_x8[0x1a] = uStack_90;
        extraout_x8[0x19] = uStack_98;
        extraout_x8[0x50] = uVar38;
        extraout_x8[0x51] = uVar33;
        extraout_x8[2] = uVar36;
        extraout_x8[3] = uVar41;
        extraout_x8[0x52] = uVar19;
        extraout_x8[0x53] = uVar24;
        extraout_x8[0x54] = uVar20;
        extraout_x8[0x55] = uVar21;
        extraout_x8[6] = auStack_78._8_8_;
        extraout_x8[7] = uVar32;
        extraout_x8[5] = auStack_78._0_8_;
        extraout_x8[4] = uStack_80;
        *(undefined1 *)((long)extraout_x8 + 0x2c4) = uVar5;
        extraout_x8[0x56] = uVar39;
        extraout_x8[0x1b] = uStack_88;
        extraout_x8[0x1c] = uStack_1f8;
        extraout_x8[0x1d] = lVar14;
        extraout_x8[0x1e] = uVar26;
        extraout_x8[0x1f] = uVar46;
        extraout_x8[0x20] = lVar37;
        extraout_x8[0x21] = uVar46;
        return lVar37;
      }
      puVar11 = (undefined8 *)puVar11[0x20];
      uVar47 = 8;
      lVar37 = func_0x00187bd0(uVar18,8);
      if (lVar37 != 0) {
        if (uVar46 != 0) {
          puVar30 = (undefined8 *)(lVar37 + 0x10);
          uVar27 = uVar46;
          do {
            if (uVar18 == 0) break;
            plVar28 = (long *)*puVar11;
            lVar9 = *plVar28;
            *plVar28 = lVar9 + 1;
            if (lVar9 < 0) goto code_r0x00507548;
            uVar47 = puVar11[1];
            uVar49 = puVar11[3];
            uVar34 = puVar11[2];
            puVar11 = puVar11 + 4;
            puVar30[-2] = plVar28;
            puVar30[-1] = uVar47;
            puVar30[1] = uVar49;
            *puVar30 = uVar34;
            uVar18 = uVar18 - 0x20;
            uVar27 = uVar27 - 1;
            puVar30 = puVar30 + 4;
          } while (uVar27 != 0);
        }
        goto code_r0x005072b8;
      }
    }
    func_0x007a1f00(uVar47,uVar18,&UNK_009e7fc8);
  }
  else {
code_r0x00507500:
    func_0x007a1f00(uVar47,uVar46,&UNK_009e7fe0);
  }
code_r0x00507548:
                    /* WARNING: Does not return */
  pcVar8 = (code *)SoftwareBreakpoint(1,0x50754c);
  (*pcVar8)();
}

