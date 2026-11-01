
/* WARNING: Possible PIC construction at 0x002cbce0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002cbce4) */
/* WARNING: Removing unreachable block (ram,0x002cbcfc) */

long _aws_lc_0_24_0_ec_GFp_mont_felem_to_bytes
               (long param_1,undefined8 param_2,ulong *param_3,undefined1 *param_4)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  unkbyte9 Var6;
  unkbyte9 Var7;
  bool bVar8;
  int iVar9;
  long lVar10;
  long lVar11;
  ulong *puVar12;
  long lVar13;
  uint uVar14;
  ulong uVar15;
  ulong uVar16;
  byte *pbVar17;
  ulong uVar18;
  long lVar19;
  undefined8 *puVar20;
  undefined8 *puVar21;
  uint uVar22;
  ulong uVar23;
  undefined1 *puVar24;
  unkbyte9 *pVar25;
  ulong uVar26;
  long lVar27;
  undefined1 *puVar28;
  byte bVar29;
  undefined8 uVar30;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  undefined1 auVar31 [16];
  byte bVar47;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  undefined1 auVar48 [16];
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar93;
  byte bVar94;
  byte bVar95;
  undefined8 uVar96;
  undefined8 uVar97;
  undefined8 uVar98;
  undefined8 uVar99;
  undefined8 uVar100;
  undefined8 uVar101;
  undefined8 uVar102;
  undefined1 auVar103 [16];
  undefined1 auStack_138 [72];
  ulong auStack_f0 [19];
  undefined8 uStack_58;
  
  auVar103._8_8_ = param_2;
  auVar103._0_8_ = param_1;
  uStack_58 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  uVar14 = *(uint *)(param_1 + 0x148);
  lVar27 = (long)(int)uVar14;
  puVar12 = param_3;
  puVar28 = param_4;
  if (uVar14 < 10) {
    auStack_f0[0xf] = 0;
    auStack_f0[0xe] = 0;
    auStack_f0[0x11] = 0;
    auStack_f0[0x10] = 0;
    puVar28 = (undefined1 *)(lVar27 << 1);
    auStack_f0[0xb] = 0;
    auStack_f0[10] = 0;
    auStack_f0[0xd] = 0;
    auStack_f0[0xc] = 0;
    auStack_f0[9] = 0;
    auStack_f0[8] = 0;
    auStack_f0[5] = 0;
    auStack_f0[4] = 0;
    auStack_f0[7] = 0;
    auStack_f0[6] = 0;
    auStack_f0[1] = 0;
    auStack_f0[0] = 0;
    auStack_f0[3] = 0;
    auStack_f0[2] = 0;
    if (uVar14 != 0) {
      ___memcpy_chk(auStack_f0,param_4,lVar27 << 3,0x90);
    }
    puVar12 = auStack_f0;
    iVar9 = func_0x002ab2b0(auStack_138,lVar27,puVar12,puVar28,param_1 + 0x128);
    if (iVar9 == 0) goto code_r0x002cbd18;
    func_0x0036e464(auStack_f0,lVar27 << 4);
    puVar28 = auStack_138;
  }
  else {
code_r0x002cbd18:
    param_3 = puVar12;
    _abort();
    auVar103 = ___stack_chk_fail();
  }
  lVar11 = auVar103._8_8_;
  lVar10 = auVar103._0_8_;
  uVar3 = *(uint *)(lVar10 + 0x148);
  uVar15 = (ulong)uVar3;
  lVar13 = (long)(int)uVar3;
  uVar14 = uVar3 & (int)uVar3 >> 0x1f;
  lVar27 = uVar15 * 8;
  do {
    lVar27 = lVar27 + -8;
    uVar22 = (uint)uVar15;
    uVar15 = (ulong)(uVar22 - 1);
    if ((int)uVar22 < 1) {
      if (-1 < (int)uVar3) {
        uVar16 = 0;
        uVar15 = lVar13 * 8;
        if (uVar15 == 0) goto code_r0x002cbf28;
        goto code_r0x002cbe18;
      }
      lVar19 = *(long *)(lVar10 + 0x140);
      goto code_r0x002cbd84;
    }
    lVar19 = *(long *)(lVar10 + 0x140);
  } while (*(long *)(lVar19 + lVar27) == 0);
  uVar14 = uVar22;
code_r0x002cbd84:
  uVar16 = *(ulong *)(lVar19 + (long)(int)(uVar14 - 1) * 8);
  uVar23 = uVar16 >> 0x20;
  uVar15 = uVar23;
  if (uVar23 == 0) {
    uVar15 = uVar16;
  }
  uVar26 = uVar15 >> 0x10;
  uVar18 = uVar26;
  if (uVar26 == 0) {
    uVar18 = uVar15;
  }
  uVar15 = uVar18 >> 8;
  if (uVar18 < 0x100) {
    uVar15 = uVar18;
  }
  uVar1 = uVar15 >> 4;
  if (uVar15 < 0x10) {
    uVar1 = uVar15;
  }
  uVar2 = uVar1 >> 2;
  if (uVar1 < 4) {
    uVar2 = uVar1;
  }
  uVar14 = (uint)(uVar16 != 0) | (uVar14 - 1) * 0x40 | (uint)(uVar23 != 0) << 5 |
           (uint)(uVar26 != 0) << 4 | (uint)(0xff < uVar18) << 3 | (uint)(0xf < uVar15) << 2 |
           (uint)(3 < uVar1) << 1;
  if (1 < uVar2) {
    uVar14 = uVar14 + 1;
  }
  uVar16 = (ulong)(uVar14 + 7 >> 3);
  uVar15 = lVar13 * 8 - uVar16;
  if (uVar16 <= (ulong)(lVar13 * 8) && uVar15 != 0) {
code_r0x002cbe18:
    if (uVar15 < 8) {
      uVar14 = 0;
      uVar23 = uVar16;
code_r0x002cbf08:
      lVar27 = uVar23 + lVar13 * -8;
      pbVar17 = puVar28 + uVar23;
      do {
        uVar14 = *pbVar17 | uVar14;
        bVar8 = lVar27 != -1;
        lVar27 = lVar27 + 1;
        pbVar17 = pbVar17 + 1;
      } while (bVar8);
    }
    else if (uVar15 < 0x40) {
      bVar29 = 0;
      uVar18 = 0;
code_r0x002cbeb8:
      uVar26 = uVar15 & 0xfffffffffffffff8;
      uVar23 = uVar16 + uVar26;
      auVar31 = ZEXT116(bVar29);
      lVar27 = uVar18 - uVar26;
      puVar20 = (undefined8 *)(puVar28 + uVar16 + uVar18);
      do {
        uVar30 = *puVar20;
        auVar31._0_8_ =
             CONCAT17((byte)((ulong)uVar30 >> 0x38) | auVar31[7],
                      CONCAT16((byte)((ulong)uVar30 >> 0x30) | auVar31[6],
                               CONCAT15((byte)((ulong)uVar30 >> 0x28) | auVar31[5],
                                        CONCAT14((byte)((ulong)uVar30 >> 0x20) | auVar31[4],
                                                 CONCAT13((byte)((ulong)uVar30 >> 0x18) | auVar31[3]
                                                          ,CONCAT12((byte)((ulong)uVar30 >> 0x10) |
                                                                    auVar31[2],
                                                                    CONCAT11((byte)((ulong)uVar30 >>
                                                                                   8) | auVar31[1],
                                                                             (byte)uVar30 |
                                                                             auVar31[0])))))));
        auVar31._8_8_ = 0;
        lVar27 = lVar27 + 8;
        puVar20 = puVar20 + 1;
      } while (lVar27 != 0);
      uVar18 = auVar31._0_8_ | auVar31._0_8_ >> 0x20;
      uVar18 = uVar18 | uVar18 >> 0x10;
      uVar14 = (uint)uVar18 | (uint)(uVar18 >> 8);
      if (uVar15 != uVar26) goto code_r0x002cbf08;
    }
    else {
      uVar18 = uVar15 & 0xffffffffffffffc0;
      bVar29 = 0;
      bVar32 = 0;
      bVar33 = 0;
      bVar34 = 0;
      bVar35 = 0;
      bVar36 = 0;
      bVar37 = 0;
      bVar38 = 0;
      bVar39 = 0;
      bVar40 = 0;
      bVar41 = 0;
      bVar42 = 0;
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar49 = 0;
      bVar50 = 0;
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar55 = 0;
      bVar56 = 0;
      bVar57 = 0;
      bVar58 = 0;
      bVar59 = 0;
      bVar60 = 0;
      bVar61 = 0;
      bVar62 = 0;
      bVar63 = 0;
      bVar64 = 0;
      bVar65 = 0;
      bVar66 = 0;
      bVar67 = 0;
      bVar68 = 0;
      bVar69 = 0;
      bVar70 = 0;
      bVar71 = 0;
      bVar72 = 0;
      bVar73 = 0;
      bVar74 = 0;
      bVar75 = 0;
      bVar76 = 0;
      bVar77 = 0;
      bVar78 = 0;
      bVar79 = 0;
      bVar80 = 0;
      bVar81 = 0;
      bVar82 = 0;
      bVar83 = 0;
      bVar84 = 0;
      bVar85 = 0;
      bVar86 = 0;
      bVar87 = 0;
      bVar88 = 0;
      bVar89 = 0;
      bVar90 = 0;
      bVar91 = 0;
      bVar92 = 0;
      bVar93 = 0;
      bVar94 = 0;
      bVar95 = 0;
      puVar20 = (undefined8 *)(puVar28 + uVar16 + 0x20);
      uVar23 = uVar18;
      do {
        uVar96 = puVar20[-3];
        uVar30 = puVar20[-4];
        uVar98 = puVar20[-1];
        uVar97 = puVar20[-2];
        uVar100 = puVar20[1];
        uVar99 = *puVar20;
        uVar102 = puVar20[3];
        uVar101 = puVar20[2];
        bVar29 = (byte)uVar30 | bVar29;
        bVar32 = (byte)((ulong)uVar30 >> 8) | bVar32;
        bVar33 = (byte)((ulong)uVar30 >> 0x10) | bVar33;
        bVar34 = (byte)((ulong)uVar30 >> 0x18) | bVar34;
        bVar35 = (byte)((ulong)uVar30 >> 0x20) | bVar35;
        bVar36 = (byte)((ulong)uVar30 >> 0x28) | bVar36;
        bVar37 = (byte)((ulong)uVar30 >> 0x30) | bVar37;
        bVar38 = (byte)((ulong)uVar30 >> 0x38) | bVar38;
        bVar39 = (byte)uVar96 | bVar39;
        bVar40 = (byte)((ulong)uVar96 >> 8) | bVar40;
        bVar41 = (byte)((ulong)uVar96 >> 0x10) | bVar41;
        bVar42 = (byte)((ulong)uVar96 >> 0x18) | bVar42;
        bVar43 = (byte)((ulong)uVar96 >> 0x20) | bVar43;
        bVar44 = (byte)((ulong)uVar96 >> 0x28) | bVar44;
        bVar45 = (byte)((ulong)uVar96 >> 0x30) | bVar45;
        bVar46 = (byte)((ulong)uVar96 >> 0x38) | bVar46;
        bVar47 = (byte)uVar97 | bVar47;
        bVar49 = (byte)((ulong)uVar97 >> 8) | bVar49;
        bVar50 = (byte)((ulong)uVar97 >> 0x10) | bVar50;
        bVar51 = (byte)((ulong)uVar97 >> 0x18) | bVar51;
        bVar52 = (byte)((ulong)uVar97 >> 0x20) | bVar52;
        bVar53 = (byte)((ulong)uVar97 >> 0x28) | bVar53;
        bVar54 = (byte)((ulong)uVar97 >> 0x30) | bVar54;
        bVar55 = (byte)((ulong)uVar97 >> 0x38) | bVar55;
        bVar56 = (byte)uVar98 | bVar56;
        bVar57 = (byte)((ulong)uVar98 >> 8) | bVar57;
        bVar58 = (byte)((ulong)uVar98 >> 0x10) | bVar58;
        bVar59 = (byte)((ulong)uVar98 >> 0x18) | bVar59;
        bVar60 = (byte)((ulong)uVar98 >> 0x20) | bVar60;
        bVar61 = (byte)((ulong)uVar98 >> 0x28) | bVar61;
        bVar62 = (byte)((ulong)uVar98 >> 0x30) | bVar62;
        bVar63 = (byte)((ulong)uVar98 >> 0x38) | bVar63;
        bVar64 = (byte)uVar99 | bVar64;
        bVar65 = (byte)((ulong)uVar99 >> 8) | bVar65;
        bVar66 = (byte)((ulong)uVar99 >> 0x10) | bVar66;
        bVar67 = (byte)((ulong)uVar99 >> 0x18) | bVar67;
        bVar68 = (byte)((ulong)uVar99 >> 0x20) | bVar68;
        bVar69 = (byte)((ulong)uVar99 >> 0x28) | bVar69;
        bVar70 = (byte)((ulong)uVar99 >> 0x30) | bVar70;
        bVar71 = (byte)((ulong)uVar99 >> 0x38) | bVar71;
        bVar72 = (byte)uVar100 | bVar72;
        bVar73 = (byte)((ulong)uVar100 >> 8) | bVar73;
        bVar74 = (byte)((ulong)uVar100 >> 0x10) | bVar74;
        bVar75 = (byte)((ulong)uVar100 >> 0x18) | bVar75;
        bVar76 = (byte)((ulong)uVar100 >> 0x20) | bVar76;
        bVar77 = (byte)((ulong)uVar100 >> 0x28) | bVar77;
        bVar78 = (byte)((ulong)uVar100 >> 0x30) | bVar78;
        bVar79 = (byte)((ulong)uVar100 >> 0x38) | bVar79;
        bVar80 = (byte)uVar101 | bVar80;
        bVar81 = (byte)((ulong)uVar101 >> 8) | bVar81;
        bVar82 = (byte)((ulong)uVar101 >> 0x10) | bVar82;
        bVar83 = (byte)((ulong)uVar101 >> 0x18) | bVar83;
        bVar84 = (byte)((ulong)uVar101 >> 0x20) | bVar84;
        bVar85 = (byte)((ulong)uVar101 >> 0x28) | bVar85;
        bVar86 = (byte)((ulong)uVar101 >> 0x30) | bVar86;
        bVar87 = (byte)((ulong)uVar101 >> 0x38) | bVar87;
        bVar88 = (byte)uVar102 | bVar88;
        bVar89 = (byte)((ulong)uVar102 >> 8) | bVar89;
        bVar90 = (byte)((ulong)uVar102 >> 0x10) | bVar90;
        bVar91 = (byte)((ulong)uVar102 >> 0x18) | bVar91;
        bVar92 = (byte)((ulong)uVar102 >> 0x20) | bVar92;
        bVar93 = (byte)((ulong)uVar102 >> 0x28) | bVar93;
        bVar94 = (byte)((ulong)uVar102 >> 0x30) | bVar94;
        bVar95 = (byte)((ulong)uVar102 >> 0x38) | bVar95;
        uVar23 = uVar23 - 0x40;
        puVar20 = puVar20 + 8;
      } while (uVar23 != 0);
      auVar48[0] = bVar80 | bVar64 | bVar47 | bVar29;
      auVar48[1] = bVar81 | bVar65 | bVar49 | bVar32;
      auVar48[2] = bVar82 | bVar66 | bVar50 | bVar33;
      auVar48[3] = bVar83 | bVar67 | bVar51 | bVar34;
      auVar48[4] = bVar84 | bVar68 | bVar52 | bVar35;
      auVar48[5] = bVar85 | bVar69 | bVar53 | bVar36;
      auVar48[6] = bVar86 | bVar70 | bVar54 | bVar37;
      auVar48[7] = bVar87 | bVar71 | bVar55 | bVar38;
      auVar48[8] = bVar88 | bVar72 | bVar56 | bVar39;
      auVar48[9] = bVar89 | bVar73 | bVar57 | bVar40;
      auVar48[10] = bVar90 | bVar74 | bVar58 | bVar41;
      auVar48[0xb] = bVar91 | bVar75 | bVar59 | bVar42;
      auVar48[0xc] = bVar92 | bVar76 | bVar60 | bVar43;
      auVar48[0xd] = bVar93 | bVar77 | bVar61 | bVar44;
      auVar48[0xe] = bVar94 | bVar78 | bVar62 | bVar45;
      auVar48[0xf] = bVar95 | bVar79 | bVar63 | bVar46;
      auVar103 = NEON_ext(auVar48,auVar48,8,1);
      uVar23 = CONCAT17(auVar48[7] | auVar103[7],
                        CONCAT16(auVar48[6] | auVar103[6],
                                 CONCAT15(auVar48[5] | auVar103[5],
                                          CONCAT14(auVar48[4] | auVar103[4],
                                                   CONCAT13(auVar48[3] | auVar103[3],
                                                            CONCAT12(auVar48[2] | auVar103[2],
                                                                     CONCAT11(auVar48[1] |
                                                                              auVar103[1],
                                                                              auVar48[0] |
                                                                              auVar103[0])))))));
      uVar23 = uVar23 | uVar23 >> 0x20;
      uVar23 = uVar23 | uVar23 >> 0x10;
      uVar14 = (uint)uVar23 | (uint)(uVar23 >> 8);
      bVar29 = (byte)uVar14;
      if (uVar15 != uVar18) {
        if ((uVar15 & 0x38) == 0) {
          uVar23 = uVar16 + uVar18;
          goto code_r0x002cbf08;
        }
        goto code_r0x002cbeb8;
      }
    }
    if ((uVar14 & 0xff) != 0) {
      auVar103 = func_0x0079dae0();
      lVar27 = auVar103._0_8_;
      lVar10 = func_0x002cc0a0();
      if ((int)lVar10 != 0) {
        func_0x002a4078(auVar103._8_8_,auVar103._8_8_,*(undefined8 *)(lVar27 + 0x128),
                        (long)*(int *)(lVar27 + 0x148),lVar27 + 0x128);
        lVar10 = 1;
      }
      return lVar10;
    }
  }
code_r0x002cbf28:
  uVar23 = lVar13 * 8;
  uVar15 = uVar23;
  if (uVar16 <= uVar23) {
    uVar15 = uVar16;
  }
  if (uVar15 == 0) goto code_r0x002cbf84;
  if ((uVar15 < 8) ||
     (((undefined1 *)(lVar11 + (uVar16 - uVar15)) < puVar28 + uVar15 &&
      (puVar28 < (undefined1 *)(lVar11 + uVar16))))) {
    uVar18 = 0;
  }
  else {
    if (uVar15 < 0x40) {
      uVar26 = 0;
    }
    else {
      uVar18 = uVar15 & 0xffffffc0;
      puVar20 = (undefined8 *)(uVar16 + lVar11 + -0x20);
      pVar25 = (unkbyte9 *)(puVar28 + 0x20);
      uVar26 = uVar18;
      do {
        uVar30 = *(undefined8 *)((long)pVar25 + 8);
        Var6 = *pVar25;
        uVar96 = *(undefined8 *)((long)pVar25 + 0x18);
        Var7 = pVar25[1];
        auVar103 = NEON_rev64(*(undefined1 (*) [16])(pVar25 + -2),1);
        auVar103 = NEON_ext(auVar103,auVar103,8,1);
        auVar48 = NEON_rev64(*(undefined1 (*) [16])(pVar25 + -1),1);
        auVar48 = NEON_ext(auVar48,auVar48,8,1);
        puVar20[1] = auVar48._8_8_;
        *puVar20 = auVar48._0_8_;
        puVar20[3] = auVar103._8_8_;
        puVar20[2] = auVar103._0_8_;
        auVar4[9] = (char)((ulong)uVar30 >> 8);
        auVar4._0_9_ = Var6;
        auVar4[10] = (char)((ulong)uVar30 >> 0x10);
        auVar4[0xb] = (char)((ulong)uVar30 >> 0x18);
        auVar4[0xc] = (char)((ulong)uVar30 >> 0x20);
        auVar4[0xd] = (char)((ulong)uVar30 >> 0x28);
        auVar4[0xe] = (char)((ulong)uVar30 >> 0x30);
        auVar4[0xf] = (char)((ulong)uVar30 >> 0x38);
        auVar103 = NEON_rev64(auVar4,1);
        auVar103 = NEON_ext(auVar103,auVar103,8,1);
        auVar5[9] = (char)((ulong)uVar96 >> 8);
        auVar5._0_9_ = Var7;
        auVar5[10] = (char)((ulong)uVar96 >> 0x10);
        auVar5[0xb] = (char)((ulong)uVar96 >> 0x18);
        auVar5[0xc] = (char)((ulong)uVar96 >> 0x20);
        auVar5[0xd] = (char)((ulong)uVar96 >> 0x28);
        auVar5[0xe] = (char)((ulong)uVar96 >> 0x30);
        auVar5[0xf] = (char)((ulong)uVar96 >> 0x38);
        auVar48 = NEON_rev64(auVar5,1);
        auVar48 = NEON_ext(auVar48,auVar48,8,1);
        puVar20[-3] = auVar48._8_8_;
        puVar20[-4] = auVar48._0_8_;
        puVar20[-1] = auVar103._8_8_;
        puVar20[-2] = auVar103._0_8_;
        puVar20 = puVar20 + -8;
        uVar26 = uVar26 - 0x40;
        pVar25 = pVar25 + 4;
      } while (uVar26 != 0);
      if (uVar15 == uVar18) goto code_r0x002cbf84;
      uVar26 = uVar18;
      if ((uVar15 & 0x38) == 0) goto code_r0x002cbf60;
    }
    uVar18 = uVar15 & 0xfffffff8;
    puVar20 = (undefined8 *)((uVar16 - uVar26) + lVar11);
    lVar27 = uVar26 - uVar18;
    puVar21 = (undefined8 *)(puVar28 + uVar26);
    do {
      puVar20 = puVar20 + -1;
      uVar30 = NEON_rev64(*puVar21,1);
      *puVar20 = uVar30;
      lVar27 = lVar27 + 8;
      puVar21 = puVar21 + 1;
    } while (lVar27 != 0);
    if (uVar15 == uVar18) goto code_r0x002cbf84;
  }
code_r0x002cbf60:
  lVar27 = uVar15 - uVar18;
  puVar28 = puVar28 + uVar18;
  puVar24 = (undefined1 *)(lVar11 + uVar16 + ~uVar18);
  do {
    *puVar24 = *puVar28;
    lVar27 = lVar27 + -1;
    puVar28 = puVar28 + 1;
    puVar24 = puVar24 + -1;
  } while (lVar27 != 0);
code_r0x002cbf84:
  if (uVar23 < uVar16) {
    lVar10 = _bzero(lVar11,uVar16 - uVar15);
  }
  *param_3 = uVar16;
  return lVar10;
}

