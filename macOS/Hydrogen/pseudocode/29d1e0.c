
undefined8
FUN_0029d1e0(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined1 param_4 [16],
            undefined1 param_5 [16],undefined8 param_6,undefined8 param_7,ulong *param_8)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  unkbyte9 Var3;
  unkbyte9 Var4;
  bool bVar5;
  long *plVar6;
  ulong uVar7;
  uint uVar8;
  uint uVar9;
  ulong in_x9;
  ulong uVar10;
  long lVar11;
  byte *pbVar12;
  undefined1 *puVar13;
  uint uVar14;
  ulong uVar15;
  long lVar16;
  long lVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  undefined1 *puVar21;
  unkbyte9 *pVar22;
  ulong uVar23;
  ulong uVar24;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x22;
  ulong uVar25;
  byte bVar26;
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
  byte bVar47;
  byte bVar48;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  byte bVar49;
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  byte bVar50;
  undefined8 uVar51;
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
  byte bVar64;
  byte bVar65;
  byte bVar66;
  undefined1 auVar52 [16];
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
  byte bVar96;
  byte bVar97;
  byte bVar98;
  byte bVar99;
  undefined8 uVar100;
  undefined8 uVar101;
  undefined8 uVar102;
  undefined8 uVar103;
  undefined8 uVar104;
  undefined8 uVar105;
  undefined8 uVar106;
  undefined1 auVar107 [16];
  
  auVar107[0] = param_5[0] | param_4[0] | param_2[0];
  auVar107[1] = param_5[1] | param_4[1] | param_2[1];
  auVar107[2] = param_5[2] | param_4[2] | param_2[2];
  auVar107[3] = param_5[3] | param_4[3] | param_2[3];
  auVar107[4] = param_5[4] | param_4[4] | param_2[4];
  auVar107[5] = param_5[5] | param_4[5] | param_2[5];
  auVar107[6] = param_5[6] | param_4[6] | param_2[6];
  auVar107[7] = param_5[7] | param_4[7] | param_2[7];
  auVar107[8] = param_5[8] | param_4[8] | param_2[8];
  auVar107[9] = param_5[9] | param_4[9] | param_2[9];
  auVar107[10] = param_5[10] | param_4[10] | param_2[10];
  auVar107[0xb] = param_5[0xb] | param_4[0xb] | param_2[0xb];
  auVar107[0xc] = param_5[0xc] | param_4[0xc] | param_2[0xc];
  auVar107[0xd] = param_5[0xd] | param_4[0xd] | param_2[0xd];
  auVar107[0xe] = param_5[0xe] | param_4[0xe] | param_2[0xe];
  auVar107[0xf] = param_5[0xf] | param_4[0xf] | param_2[0xf];
  auVar52 = NEON_ext(auVar107,auVar107,8,1);
  uVar15 = CONCAT17(auVar107[7] | auVar52[7],
                    CONCAT16(auVar107[6] | auVar52[6],
                             CONCAT15(auVar107[5] | auVar52[5],
                                      CONCAT14(auVar107[4] | auVar52[4],
                                               CONCAT13(auVar107[3] | auVar52[3],
                                                        CONCAT12(auVar107[2] | auVar52[2],
                                                                 CONCAT11(auVar107[1] | auVar52[1],
                                                                          auVar107[0] | auVar52[0]))
                                                       )))));
  uVar15 = uVar15 | uVar15 >> 0x20;
  uVar15 = uVar15 | uVar15 >> 0x10;
  uVar14 = (uint)uVar15 | (uint)(uVar15 >> 8);
  if (param_1 != in_x9) {
    if ((param_1 & 0x38) != 0) {
      uVar15 = param_1 & 0xfffffffffffffff8;
      auVar52._1_15_ = SUB1615(ZEXT816(0),1);
      auVar52[0] = (char)uVar14;
      lVar16 = in_x9 - uVar15;
      puVar19 = (undefined8 *)((long)param_8 + in_x9 + unaff_x20);
      do {
        uVar51 = *puVar19;
        auVar52._0_8_ =
             CONCAT17((byte)((ulong)uVar51 >> 0x38) | auVar52[7],
                      CONCAT16((byte)((ulong)uVar51 >> 0x30) | auVar52[6],
                               CONCAT15((byte)((ulong)uVar51 >> 0x28) | auVar52[5],
                                        CONCAT14((byte)((ulong)uVar51 >> 0x20) | auVar52[4],
                                                 CONCAT13((byte)((ulong)uVar51 >> 0x18) | auVar52[3]
                                                          ,CONCAT12((byte)((ulong)uVar51 >> 0x10) |
                                                                    auVar52[2],
                                                                    CONCAT11((byte)((ulong)uVar51 >>
                                                                                   8) | auVar52[1],
                                                                             (byte)uVar51 |
                                                                             auVar52[0])))))));
        auVar52._8_8_ = 0;
        lVar16 = lVar16 + 8;
        puVar19 = puVar19 + 1;
      } while (lVar16 != 0);
      uVar10 = auVar52._0_8_ | auVar52._0_8_ >> 0x20;
      uVar10 = uVar10 | uVar10 >> 0x10;
      uVar14 = (uint)uVar10 | (uint)(uVar10 >> 8);
      in_x9 = uVar15;
      if (param_1 == uVar15) goto LAB_0029d27c;
    }
    lVar16 = (in_x9 + unaff_x20) - unaff_x22;
    pbVar12 = (byte *)((long)param_8 + in_x9 + unaff_x20);
    do {
      uVar14 = *pbVar12 | uVar14;
      bVar5 = lVar16 != -1;
      lVar16 = lVar16 + 1;
      pbVar12 = pbVar12 + 1;
    } while (bVar5);
  }
LAB_0029d27c:
  if ((uVar14 & 0xff) == 0) {
    uVar15 = unaff_x22;
    if (unaff_x20 <= unaff_x22) {
      uVar15 = unaff_x20;
    }
    if (uVar15 != 0) {
      param_6 = _memcpy();
    }
    if (unaff_x22 < unaff_x20) {
                    /* WARNING: Could not recover jumptable at 0x007b31b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar51 = (*(code *)PTR__bzero_00a24c68)(unaff_x19 + uVar15,unaff_x20 - uVar15);
      return uVar51;
    }
    return param_6;
  }
  auVar107 = func_0x0079db04();
  uVar10 = auVar107._8_8_;
  uVar7 = *param_8;
  lVar16 = (long)(int)param_8[1];
  uVar25 = lVar16 * 8;
  uVar15 = uVar25 - uVar10;
  if (uVar25 < uVar10 || uVar15 == 0) goto code_r0x0029d534;
  if (uVar15 < 8) {
    uVar14 = 0;
    uVar18 = uVar10;
code_r0x0029d3f0:
    lVar11 = uVar18 + lVar16 * -8;
    pbVar12 = (byte *)(uVar7 + uVar18);
    do {
      uVar14 = *pbVar12 | uVar14;
      bVar5 = lVar11 != -1;
      lVar11 = lVar11 + 1;
      pbVar12 = pbVar12 + 1;
    } while (bVar5);
  }
  else if (uVar15 < 0x40) {
    bVar26 = 0;
    uVar24 = 0;
code_r0x0029d3a0:
    uVar23 = uVar15 & 0xfffffffffffffff8;
    uVar18 = uVar23 + uVar10;
    auVar28 = ZEXT116(bVar26);
    lVar11 = uVar24 - uVar23;
    puVar19 = (undefined8 *)(uVar7 + uVar24 + uVar10);
    do {
      uVar51 = *puVar19;
      auVar28._0_8_ =
           CONCAT17((byte)((ulong)uVar51 >> 0x38) | auVar28[7],
                    CONCAT16((byte)((ulong)uVar51 >> 0x30) | auVar28[6],
                             CONCAT15((byte)((ulong)uVar51 >> 0x28) | auVar28[5],
                                      CONCAT14((byte)((ulong)uVar51 >> 0x20) | auVar28[4],
                                               CONCAT13((byte)((ulong)uVar51 >> 0x18) | auVar28[3],
                                                        CONCAT12((byte)((ulong)uVar51 >> 0x10) |
                                                                 auVar28[2],
                                                                 CONCAT11((byte)((ulong)uVar51 >> 8)
                                                                          | auVar28[1],
                                                                          (byte)uVar51 | auVar28[0])
                                                                ))))));
      auVar28._8_8_ = 0;
      lVar11 = lVar11 + 8;
      puVar19 = puVar19 + 1;
    } while (lVar11 != 0);
    uVar24 = auVar28._0_8_ | auVar28._0_8_ >> 0x20;
    uVar24 = uVar24 | uVar24 >> 0x10;
    uVar14 = (uint)uVar24 | (uint)(uVar24 >> 8);
    if (uVar15 != uVar23) goto code_r0x0029d3f0;
  }
  else {
    uVar24 = uVar15 & 0xffffffffffffffc0;
    bVar26 = 0;
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
    bVar48 = 0;
    bVar49 = 0;
    bVar50 = 0;
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
    bVar96 = 0;
    bVar97 = 0;
    bVar98 = 0;
    bVar99 = 0;
    puVar19 = (undefined8 *)(uVar10 + uVar7 + 0x20);
    uVar18 = uVar24;
    do {
      uVar100 = puVar19[-3];
      uVar51 = puVar19[-4];
      uVar102 = puVar19[-1];
      uVar101 = puVar19[-2];
      uVar104 = puVar19[1];
      uVar103 = *puVar19;
      uVar106 = puVar19[3];
      uVar105 = puVar19[2];
      bVar26 = (byte)uVar51 | bVar26;
      bVar35 = (byte)((ulong)uVar51 >> 8) | bVar35;
      bVar36 = (byte)((ulong)uVar51 >> 0x10) | bVar36;
      bVar37 = (byte)((ulong)uVar51 >> 0x18) | bVar37;
      bVar38 = (byte)((ulong)uVar51 >> 0x20) | bVar38;
      bVar39 = (byte)((ulong)uVar51 >> 0x28) | bVar39;
      bVar40 = (byte)((ulong)uVar51 >> 0x30) | bVar40;
      bVar41 = (byte)((ulong)uVar51 >> 0x38) | bVar41;
      bVar42 = (byte)uVar100 | bVar42;
      bVar43 = (byte)((ulong)uVar100 >> 8) | bVar43;
      bVar44 = (byte)((ulong)uVar100 >> 0x10) | bVar44;
      bVar45 = (byte)((ulong)uVar100 >> 0x18) | bVar45;
      bVar46 = (byte)((ulong)uVar100 >> 0x20) | bVar46;
      bVar47 = (byte)((ulong)uVar100 >> 0x28) | bVar47;
      bVar48 = (byte)((ulong)uVar100 >> 0x30) | bVar48;
      bVar49 = (byte)((ulong)uVar100 >> 0x38) | bVar49;
      bVar50 = (byte)uVar101 | bVar50;
      bVar53 = (byte)((ulong)uVar101 >> 8) | bVar53;
      bVar54 = (byte)((ulong)uVar101 >> 0x10) | bVar54;
      bVar55 = (byte)((ulong)uVar101 >> 0x18) | bVar55;
      bVar56 = (byte)((ulong)uVar101 >> 0x20) | bVar56;
      bVar57 = (byte)((ulong)uVar101 >> 0x28) | bVar57;
      bVar58 = (byte)((ulong)uVar101 >> 0x30) | bVar58;
      bVar59 = (byte)((ulong)uVar101 >> 0x38) | bVar59;
      bVar60 = (byte)uVar102 | bVar60;
      bVar61 = (byte)((ulong)uVar102 >> 8) | bVar61;
      bVar62 = (byte)((ulong)uVar102 >> 0x10) | bVar62;
      bVar63 = (byte)((ulong)uVar102 >> 0x18) | bVar63;
      bVar64 = (byte)((ulong)uVar102 >> 0x20) | bVar64;
      bVar65 = (byte)((ulong)uVar102 >> 0x28) | bVar65;
      bVar66 = (byte)((ulong)uVar102 >> 0x30) | bVar66;
      bVar67 = (byte)((ulong)uVar102 >> 0x38) | bVar67;
      bVar68 = (byte)uVar103 | bVar68;
      bVar69 = (byte)((ulong)uVar103 >> 8) | bVar69;
      bVar70 = (byte)((ulong)uVar103 >> 0x10) | bVar70;
      bVar71 = (byte)((ulong)uVar103 >> 0x18) | bVar71;
      bVar72 = (byte)((ulong)uVar103 >> 0x20) | bVar72;
      bVar73 = (byte)((ulong)uVar103 >> 0x28) | bVar73;
      bVar74 = (byte)((ulong)uVar103 >> 0x30) | bVar74;
      bVar75 = (byte)((ulong)uVar103 >> 0x38) | bVar75;
      bVar76 = (byte)uVar104 | bVar76;
      bVar77 = (byte)((ulong)uVar104 >> 8) | bVar77;
      bVar78 = (byte)((ulong)uVar104 >> 0x10) | bVar78;
      bVar79 = (byte)((ulong)uVar104 >> 0x18) | bVar79;
      bVar80 = (byte)((ulong)uVar104 >> 0x20) | bVar80;
      bVar81 = (byte)((ulong)uVar104 >> 0x28) | bVar81;
      bVar82 = (byte)((ulong)uVar104 >> 0x30) | bVar82;
      bVar83 = (byte)((ulong)uVar104 >> 0x38) | bVar83;
      bVar84 = (byte)uVar105 | bVar84;
      bVar85 = (byte)((ulong)uVar105 >> 8) | bVar85;
      bVar86 = (byte)((ulong)uVar105 >> 0x10) | bVar86;
      bVar87 = (byte)((ulong)uVar105 >> 0x18) | bVar87;
      bVar88 = (byte)((ulong)uVar105 >> 0x20) | bVar88;
      bVar89 = (byte)((ulong)uVar105 >> 0x28) | bVar89;
      bVar90 = (byte)((ulong)uVar105 >> 0x30) | bVar90;
      bVar91 = (byte)((ulong)uVar105 >> 0x38) | bVar91;
      bVar92 = (byte)uVar106 | bVar92;
      bVar93 = (byte)((ulong)uVar106 >> 8) | bVar93;
      bVar94 = (byte)((ulong)uVar106 >> 0x10) | bVar94;
      bVar95 = (byte)((ulong)uVar106 >> 0x18) | bVar95;
      bVar96 = (byte)((ulong)uVar106 >> 0x20) | bVar96;
      bVar97 = (byte)((ulong)uVar106 >> 0x28) | bVar97;
      bVar98 = (byte)((ulong)uVar106 >> 0x30) | bVar98;
      bVar99 = (byte)((ulong)uVar106 >> 0x38) | bVar99;
      uVar18 = uVar18 - 0x40;
      puVar19 = puVar19 + 8;
    } while (uVar18 != 0);
    auVar27[0] = bVar84 | bVar68 | bVar50 | bVar26;
    auVar27[1] = bVar85 | bVar69 | bVar53 | bVar35;
    auVar27[2] = bVar86 | bVar70 | bVar54 | bVar36;
    auVar27[3] = bVar87 | bVar71 | bVar55 | bVar37;
    auVar27[4] = bVar88 | bVar72 | bVar56 | bVar38;
    auVar27[5] = bVar89 | bVar73 | bVar57 | bVar39;
    auVar27[6] = bVar90 | bVar74 | bVar58 | bVar40;
    auVar27[7] = bVar91 | bVar75 | bVar59 | bVar41;
    auVar27[8] = bVar92 | bVar76 | bVar60 | bVar42;
    auVar27[9] = bVar93 | bVar77 | bVar61 | bVar43;
    auVar27[10] = bVar94 | bVar78 | bVar62 | bVar44;
    auVar27[0xb] = bVar95 | bVar79 | bVar63 | bVar45;
    auVar27[0xc] = bVar96 | bVar80 | bVar64 | bVar46;
    auVar27[0xd] = bVar97 | bVar81 | bVar65 | bVar47;
    auVar27[0xe] = bVar98 | bVar82 | bVar66 | bVar48;
    auVar27[0xf] = bVar99 | bVar83 | bVar67 | bVar49;
    auVar52 = NEON_ext(auVar27,auVar27,8,1);
    uVar18 = CONCAT17(auVar27[7] | auVar52[7],
                      CONCAT16(auVar27[6] | auVar52[6],
                               CONCAT15(auVar27[5] | auVar52[5],
                                        CONCAT14(auVar27[4] | auVar52[4],
                                                 CONCAT13(auVar27[3] | auVar52[3],
                                                          CONCAT12(auVar27[2] | auVar52[2],
                                                                   CONCAT11(auVar27[1] | auVar52[1],
                                                                            auVar27[0] | auVar52[0])
                                                                  ))))));
    uVar18 = uVar18 | uVar18 >> 0x20;
    uVar18 = uVar18 | uVar18 >> 0x10;
    uVar14 = (uint)uVar18 | (uint)(uVar18 >> 8);
    bVar26 = (byte)uVar14;
    if (uVar15 != uVar24) {
      if ((uVar15 & 0x38) == 0) {
        uVar18 = uVar24 + uVar10;
        goto code_r0x0029d3f0;
      }
      goto code_r0x0029d3a0;
    }
  }
  if ((uVar14 & 0xff) != 0) {
    return 0;
  }
  if (uVar15 < 8) {
    uVar14 = 0;
    uVar18 = uVar10;
code_r0x0029d514:
    lVar16 = uVar18 + lVar16 * -8;
    pbVar12 = (byte *)(uVar7 + uVar18);
    do {
      uVar14 = *pbVar12 | uVar14;
      bVar5 = lVar16 != -1;
      lVar16 = lVar16 + 1;
      pbVar12 = pbVar12 + 1;
    } while (bVar5);
  }
  else if (uVar15 < 0x40) {
    bVar26 = 0;
    uVar24 = 0;
code_r0x0029d4c4:
    uVar23 = uVar15 & 0xfffffffffffffff8;
    uVar18 = uVar23 + uVar10;
    auVar30 = ZEXT116(bVar26);
    lVar11 = uVar24 - uVar23;
    puVar19 = (undefined8 *)(uVar7 + uVar24 + uVar10);
    do {
      uVar51 = *puVar19;
      auVar30._0_8_ =
           CONCAT17((byte)((ulong)uVar51 >> 0x38) | auVar30[7],
                    CONCAT16((byte)((ulong)uVar51 >> 0x30) | auVar30[6],
                             CONCAT15((byte)((ulong)uVar51 >> 0x28) | auVar30[5],
                                      CONCAT14((byte)((ulong)uVar51 >> 0x20) | auVar30[4],
                                               CONCAT13((byte)((ulong)uVar51 >> 0x18) | auVar30[3],
                                                        CONCAT12((byte)((ulong)uVar51 >> 0x10) |
                                                                 auVar30[2],
                                                                 CONCAT11((byte)((ulong)uVar51 >> 8)
                                                                          | auVar30[1],
                                                                          (byte)uVar51 | auVar30[0])
                                                                ))))));
      auVar30._8_8_ = 0;
      lVar11 = lVar11 + 8;
      puVar19 = puVar19 + 1;
    } while (lVar11 != 0);
    uVar24 = auVar30._0_8_ | auVar30._0_8_ >> 0x20;
    uVar24 = uVar24 | uVar24 >> 0x10;
    uVar14 = (uint)uVar24 | (uint)(uVar24 >> 8);
    if (uVar15 != uVar23) goto code_r0x0029d514;
  }
  else {
    uVar24 = uVar15 & 0xffffffffffffffc0;
    bVar26 = 0;
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
    bVar48 = 0;
    bVar49 = 0;
    bVar50 = 0;
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
    bVar96 = 0;
    bVar97 = 0;
    bVar98 = 0;
    bVar99 = 0;
    puVar19 = (undefined8 *)(uVar10 + uVar7 + 0x20);
    uVar18 = uVar24;
    do {
      uVar100 = puVar19[-3];
      uVar51 = puVar19[-4];
      uVar102 = puVar19[-1];
      uVar101 = puVar19[-2];
      uVar104 = puVar19[1];
      uVar103 = *puVar19;
      uVar106 = puVar19[3];
      uVar105 = puVar19[2];
      bVar26 = (byte)uVar51 | bVar26;
      bVar35 = (byte)((ulong)uVar51 >> 8) | bVar35;
      bVar36 = (byte)((ulong)uVar51 >> 0x10) | bVar36;
      bVar37 = (byte)((ulong)uVar51 >> 0x18) | bVar37;
      bVar38 = (byte)((ulong)uVar51 >> 0x20) | bVar38;
      bVar39 = (byte)((ulong)uVar51 >> 0x28) | bVar39;
      bVar40 = (byte)((ulong)uVar51 >> 0x30) | bVar40;
      bVar41 = (byte)((ulong)uVar51 >> 0x38) | bVar41;
      bVar42 = (byte)uVar100 | bVar42;
      bVar43 = (byte)((ulong)uVar100 >> 8) | bVar43;
      bVar44 = (byte)((ulong)uVar100 >> 0x10) | bVar44;
      bVar45 = (byte)((ulong)uVar100 >> 0x18) | bVar45;
      bVar46 = (byte)((ulong)uVar100 >> 0x20) | bVar46;
      bVar47 = (byte)((ulong)uVar100 >> 0x28) | bVar47;
      bVar48 = (byte)((ulong)uVar100 >> 0x30) | bVar48;
      bVar49 = (byte)((ulong)uVar100 >> 0x38) | bVar49;
      bVar50 = (byte)uVar101 | bVar50;
      bVar53 = (byte)((ulong)uVar101 >> 8) | bVar53;
      bVar54 = (byte)((ulong)uVar101 >> 0x10) | bVar54;
      bVar55 = (byte)((ulong)uVar101 >> 0x18) | bVar55;
      bVar56 = (byte)((ulong)uVar101 >> 0x20) | bVar56;
      bVar57 = (byte)((ulong)uVar101 >> 0x28) | bVar57;
      bVar58 = (byte)((ulong)uVar101 >> 0x30) | bVar58;
      bVar59 = (byte)((ulong)uVar101 >> 0x38) | bVar59;
      bVar60 = (byte)uVar102 | bVar60;
      bVar61 = (byte)((ulong)uVar102 >> 8) | bVar61;
      bVar62 = (byte)((ulong)uVar102 >> 0x10) | bVar62;
      bVar63 = (byte)((ulong)uVar102 >> 0x18) | bVar63;
      bVar64 = (byte)((ulong)uVar102 >> 0x20) | bVar64;
      bVar65 = (byte)((ulong)uVar102 >> 0x28) | bVar65;
      bVar66 = (byte)((ulong)uVar102 >> 0x30) | bVar66;
      bVar67 = (byte)((ulong)uVar102 >> 0x38) | bVar67;
      bVar68 = (byte)uVar103 | bVar68;
      bVar69 = (byte)((ulong)uVar103 >> 8) | bVar69;
      bVar70 = (byte)((ulong)uVar103 >> 0x10) | bVar70;
      bVar71 = (byte)((ulong)uVar103 >> 0x18) | bVar71;
      bVar72 = (byte)((ulong)uVar103 >> 0x20) | bVar72;
      bVar73 = (byte)((ulong)uVar103 >> 0x28) | bVar73;
      bVar74 = (byte)((ulong)uVar103 >> 0x30) | bVar74;
      bVar75 = (byte)((ulong)uVar103 >> 0x38) | bVar75;
      bVar76 = (byte)uVar104 | bVar76;
      bVar77 = (byte)((ulong)uVar104 >> 8) | bVar77;
      bVar78 = (byte)((ulong)uVar104 >> 0x10) | bVar78;
      bVar79 = (byte)((ulong)uVar104 >> 0x18) | bVar79;
      bVar80 = (byte)((ulong)uVar104 >> 0x20) | bVar80;
      bVar81 = (byte)((ulong)uVar104 >> 0x28) | bVar81;
      bVar82 = (byte)((ulong)uVar104 >> 0x30) | bVar82;
      bVar83 = (byte)((ulong)uVar104 >> 0x38) | bVar83;
      bVar84 = (byte)uVar105 | bVar84;
      bVar85 = (byte)((ulong)uVar105 >> 8) | bVar85;
      bVar86 = (byte)((ulong)uVar105 >> 0x10) | bVar86;
      bVar87 = (byte)((ulong)uVar105 >> 0x18) | bVar87;
      bVar88 = (byte)((ulong)uVar105 >> 0x20) | bVar88;
      bVar89 = (byte)((ulong)uVar105 >> 0x28) | bVar89;
      bVar90 = (byte)((ulong)uVar105 >> 0x30) | bVar90;
      bVar91 = (byte)((ulong)uVar105 >> 0x38) | bVar91;
      bVar92 = (byte)uVar106 | bVar92;
      bVar93 = (byte)((ulong)uVar106 >> 8) | bVar93;
      bVar94 = (byte)((ulong)uVar106 >> 0x10) | bVar94;
      bVar95 = (byte)((ulong)uVar106 >> 0x18) | bVar95;
      bVar96 = (byte)((ulong)uVar106 >> 0x20) | bVar96;
      bVar97 = (byte)((ulong)uVar106 >> 0x28) | bVar97;
      bVar98 = (byte)((ulong)uVar106 >> 0x30) | bVar98;
      bVar99 = (byte)((ulong)uVar106 >> 0x38) | bVar99;
      uVar18 = uVar18 - 0x40;
      puVar19 = puVar19 + 8;
    } while (uVar18 != 0);
    auVar29[0] = bVar84 | bVar68 | bVar50 | bVar26;
    auVar29[1] = bVar85 | bVar69 | bVar53 | bVar35;
    auVar29[2] = bVar86 | bVar70 | bVar54 | bVar36;
    auVar29[3] = bVar87 | bVar71 | bVar55 | bVar37;
    auVar29[4] = bVar88 | bVar72 | bVar56 | bVar38;
    auVar29[5] = bVar89 | bVar73 | bVar57 | bVar39;
    auVar29[6] = bVar90 | bVar74 | bVar58 | bVar40;
    auVar29[7] = bVar91 | bVar75 | bVar59 | bVar41;
    auVar29[8] = bVar92 | bVar76 | bVar60 | bVar42;
    auVar29[9] = bVar93 | bVar77 | bVar61 | bVar43;
    auVar29[10] = bVar94 | bVar78 | bVar62 | bVar44;
    auVar29[0xb] = bVar95 | bVar79 | bVar63 | bVar45;
    auVar29[0xc] = bVar96 | bVar80 | bVar64 | bVar46;
    auVar29[0xd] = bVar97 | bVar81 | bVar65 | bVar47;
    auVar29[0xe] = bVar98 | bVar82 | bVar66 | bVar48;
    auVar29[0xf] = bVar99 | bVar83 | bVar67 | bVar49;
    auVar52 = NEON_ext(auVar29,auVar29,8,1);
    uVar18 = CONCAT17(auVar29[7] | auVar52[7],
                      CONCAT16(auVar29[6] | auVar52[6],
                               CONCAT15(auVar29[5] | auVar52[5],
                                        CONCAT14(auVar29[4] | auVar52[4],
                                                 CONCAT13(auVar29[3] | auVar52[3],
                                                          CONCAT12(auVar29[2] | auVar52[2],
                                                                   CONCAT11(auVar29[1] | auVar52[1],
                                                                            auVar29[0] | auVar52[0])
                                                                  ))))));
    uVar18 = uVar18 | uVar18 >> 0x20;
    uVar18 = uVar18 | uVar18 >> 0x10;
    uVar14 = (uint)uVar18 | (uint)(uVar18 >> 8);
    bVar26 = (byte)uVar14;
    if (uVar15 != uVar24) {
      if ((uVar15 & 0x38) == 0) {
        uVar18 = uVar24 + uVar10;
        goto code_r0x0029d514;
      }
      goto code_r0x0029d4c4;
    }
  }
  if ((uVar14 & 0xff) == 0) {
code_r0x0029d534:
    uVar15 = uVar25;
    if (uVar10 <= uVar25) {
      uVar15 = uVar10;
    }
    if (uVar15 != 0) {
      _memcpy(auVar107._0_8_,uVar7,uVar15);
    }
    if (uVar25 < uVar10) {
      _bzero(auVar107._0_8_ + uVar15,uVar10 - uVar15);
    }
    return 1;
  }
  auVar107 = func_0x0079db04();
  uVar10 = auVar107._8_8_;
  lVar16 = auVar107._0_8_;
  uVar25 = *param_8;
  lVar11 = (long)(int)param_8[1];
  uVar7 = lVar11 * 8;
  uVar15 = uVar7 - uVar10;
  if (uVar10 <= uVar7 && uVar15 != 0) {
    if (uVar15 < 8) {
      uVar14 = 0;
      uVar18 = uVar10;
code_r0x0029d684:
      lVar17 = uVar18 + lVar11 * -8;
      pbVar12 = (byte *)(uVar25 + uVar18);
      do {
        uVar14 = *pbVar12 | uVar14;
        bVar5 = lVar17 != -1;
        lVar17 = lVar17 + 1;
        pbVar12 = pbVar12 + 1;
      } while (bVar5);
    }
    else if (uVar15 < 0x40) {
      bVar26 = 0;
      uVar24 = 0;
code_r0x0029d634:
      uVar23 = uVar15 & 0xfffffffffffffff8;
      uVar18 = uVar23 + uVar10;
      auVar32 = ZEXT116(bVar26);
      lVar17 = uVar24 - uVar23;
      puVar19 = (undefined8 *)(uVar25 + uVar24 + uVar10);
      do {
        uVar51 = *puVar19;
        auVar32._0_8_ =
             CONCAT17((byte)((ulong)uVar51 >> 0x38) | auVar32[7],
                      CONCAT16((byte)((ulong)uVar51 >> 0x30) | auVar32[6],
                               CONCAT15((byte)((ulong)uVar51 >> 0x28) | auVar32[5],
                                        CONCAT14((byte)((ulong)uVar51 >> 0x20) | auVar32[4],
                                                 CONCAT13((byte)((ulong)uVar51 >> 0x18) | auVar32[3]
                                                          ,CONCAT12((byte)((ulong)uVar51 >> 0x10) |
                                                                    auVar32[2],
                                                                    CONCAT11((byte)((ulong)uVar51 >>
                                                                                   8) | auVar32[1],
                                                                             (byte)uVar51 |
                                                                             auVar32[0])))))));
        auVar32._8_8_ = 0;
        lVar17 = lVar17 + 8;
        puVar19 = puVar19 + 1;
      } while (lVar17 != 0);
      uVar24 = auVar32._0_8_ | auVar32._0_8_ >> 0x20;
      uVar24 = uVar24 | uVar24 >> 0x10;
      uVar14 = (uint)uVar24 | (uint)(uVar24 >> 8);
      if (uVar15 != uVar23) goto code_r0x0029d684;
    }
    else {
      uVar24 = uVar15 & 0xffffffffffffffc0;
      bVar26 = 0;
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
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
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
      bVar96 = 0;
      bVar97 = 0;
      bVar98 = 0;
      bVar99 = 0;
      puVar19 = (undefined8 *)(uVar10 + uVar25 + 0x20);
      uVar18 = uVar24;
      do {
        uVar100 = puVar19[-3];
        uVar51 = puVar19[-4];
        uVar102 = puVar19[-1];
        uVar101 = puVar19[-2];
        uVar104 = puVar19[1];
        uVar103 = *puVar19;
        uVar106 = puVar19[3];
        uVar105 = puVar19[2];
        bVar26 = (byte)uVar51 | bVar26;
        bVar35 = (byte)((ulong)uVar51 >> 8) | bVar35;
        bVar36 = (byte)((ulong)uVar51 >> 0x10) | bVar36;
        bVar37 = (byte)((ulong)uVar51 >> 0x18) | bVar37;
        bVar38 = (byte)((ulong)uVar51 >> 0x20) | bVar38;
        bVar39 = (byte)((ulong)uVar51 >> 0x28) | bVar39;
        bVar40 = (byte)((ulong)uVar51 >> 0x30) | bVar40;
        bVar41 = (byte)((ulong)uVar51 >> 0x38) | bVar41;
        bVar42 = (byte)uVar100 | bVar42;
        bVar43 = (byte)((ulong)uVar100 >> 8) | bVar43;
        bVar44 = (byte)((ulong)uVar100 >> 0x10) | bVar44;
        bVar45 = (byte)((ulong)uVar100 >> 0x18) | bVar45;
        bVar46 = (byte)((ulong)uVar100 >> 0x20) | bVar46;
        bVar47 = (byte)((ulong)uVar100 >> 0x28) | bVar47;
        bVar48 = (byte)((ulong)uVar100 >> 0x30) | bVar48;
        bVar49 = (byte)((ulong)uVar100 >> 0x38) | bVar49;
        bVar50 = (byte)uVar101 | bVar50;
        bVar53 = (byte)((ulong)uVar101 >> 8) | bVar53;
        bVar54 = (byte)((ulong)uVar101 >> 0x10) | bVar54;
        bVar55 = (byte)((ulong)uVar101 >> 0x18) | bVar55;
        bVar56 = (byte)((ulong)uVar101 >> 0x20) | bVar56;
        bVar57 = (byte)((ulong)uVar101 >> 0x28) | bVar57;
        bVar58 = (byte)((ulong)uVar101 >> 0x30) | bVar58;
        bVar59 = (byte)((ulong)uVar101 >> 0x38) | bVar59;
        bVar60 = (byte)uVar102 | bVar60;
        bVar61 = (byte)((ulong)uVar102 >> 8) | bVar61;
        bVar62 = (byte)((ulong)uVar102 >> 0x10) | bVar62;
        bVar63 = (byte)((ulong)uVar102 >> 0x18) | bVar63;
        bVar64 = (byte)((ulong)uVar102 >> 0x20) | bVar64;
        bVar65 = (byte)((ulong)uVar102 >> 0x28) | bVar65;
        bVar66 = (byte)((ulong)uVar102 >> 0x30) | bVar66;
        bVar67 = (byte)((ulong)uVar102 >> 0x38) | bVar67;
        bVar68 = (byte)uVar103 | bVar68;
        bVar69 = (byte)((ulong)uVar103 >> 8) | bVar69;
        bVar70 = (byte)((ulong)uVar103 >> 0x10) | bVar70;
        bVar71 = (byte)((ulong)uVar103 >> 0x18) | bVar71;
        bVar72 = (byte)((ulong)uVar103 >> 0x20) | bVar72;
        bVar73 = (byte)((ulong)uVar103 >> 0x28) | bVar73;
        bVar74 = (byte)((ulong)uVar103 >> 0x30) | bVar74;
        bVar75 = (byte)((ulong)uVar103 >> 0x38) | bVar75;
        bVar76 = (byte)uVar104 | bVar76;
        bVar77 = (byte)((ulong)uVar104 >> 8) | bVar77;
        bVar78 = (byte)((ulong)uVar104 >> 0x10) | bVar78;
        bVar79 = (byte)((ulong)uVar104 >> 0x18) | bVar79;
        bVar80 = (byte)((ulong)uVar104 >> 0x20) | bVar80;
        bVar81 = (byte)((ulong)uVar104 >> 0x28) | bVar81;
        bVar82 = (byte)((ulong)uVar104 >> 0x30) | bVar82;
        bVar83 = (byte)((ulong)uVar104 >> 0x38) | bVar83;
        bVar84 = (byte)uVar105 | bVar84;
        bVar85 = (byte)((ulong)uVar105 >> 8) | bVar85;
        bVar86 = (byte)((ulong)uVar105 >> 0x10) | bVar86;
        bVar87 = (byte)((ulong)uVar105 >> 0x18) | bVar87;
        bVar88 = (byte)((ulong)uVar105 >> 0x20) | bVar88;
        bVar89 = (byte)((ulong)uVar105 >> 0x28) | bVar89;
        bVar90 = (byte)((ulong)uVar105 >> 0x30) | bVar90;
        bVar91 = (byte)((ulong)uVar105 >> 0x38) | bVar91;
        bVar92 = (byte)uVar106 | bVar92;
        bVar93 = (byte)((ulong)uVar106 >> 8) | bVar93;
        bVar94 = (byte)((ulong)uVar106 >> 0x10) | bVar94;
        bVar95 = (byte)((ulong)uVar106 >> 0x18) | bVar95;
        bVar96 = (byte)((ulong)uVar106 >> 0x20) | bVar96;
        bVar97 = (byte)((ulong)uVar106 >> 0x28) | bVar97;
        bVar98 = (byte)((ulong)uVar106 >> 0x30) | bVar98;
        bVar99 = (byte)((ulong)uVar106 >> 0x38) | bVar99;
        uVar18 = uVar18 - 0x40;
        puVar19 = puVar19 + 8;
      } while (uVar18 != 0);
      auVar31[0] = bVar84 | bVar68 | bVar50 | bVar26;
      auVar31[1] = bVar85 | bVar69 | bVar53 | bVar35;
      auVar31[2] = bVar86 | bVar70 | bVar54 | bVar36;
      auVar31[3] = bVar87 | bVar71 | bVar55 | bVar37;
      auVar31[4] = bVar88 | bVar72 | bVar56 | bVar38;
      auVar31[5] = bVar89 | bVar73 | bVar57 | bVar39;
      auVar31[6] = bVar90 | bVar74 | bVar58 | bVar40;
      auVar31[7] = bVar91 | bVar75 | bVar59 | bVar41;
      auVar31[8] = bVar92 | bVar76 | bVar60 | bVar42;
      auVar31[9] = bVar93 | bVar77 | bVar61 | bVar43;
      auVar31[10] = bVar94 | bVar78 | bVar62 | bVar44;
      auVar31[0xb] = bVar95 | bVar79 | bVar63 | bVar45;
      auVar31[0xc] = bVar96 | bVar80 | bVar64 | bVar46;
      auVar31[0xd] = bVar97 | bVar81 | bVar65 | bVar47;
      auVar31[0xe] = bVar98 | bVar82 | bVar66 | bVar48;
      auVar31[0xf] = bVar99 | bVar83 | bVar67 | bVar49;
      auVar107 = NEON_ext(auVar31,auVar31,8,1);
      uVar18 = CONCAT17(auVar31[7] | auVar107[7],
                        CONCAT16(auVar31[6] | auVar107[6],
                                 CONCAT15(auVar31[5] | auVar107[5],
                                          CONCAT14(auVar31[4] | auVar107[4],
                                                   CONCAT13(auVar31[3] | auVar107[3],
                                                            CONCAT12(auVar31[2] | auVar107[2],
                                                                     CONCAT11(auVar31[1] |
                                                                              auVar107[1],
                                                                              auVar31[0] |
                                                                              auVar107[0])))))));
      uVar18 = uVar18 | uVar18 >> 0x20;
      uVar18 = uVar18 | uVar18 >> 0x10;
      uVar14 = (uint)uVar18 | (uint)(uVar18 >> 8);
      bVar26 = (byte)uVar14;
      if (uVar15 != uVar24) {
        if ((uVar15 & 0x38) == 0) {
          uVar18 = uVar24 + uVar10;
          goto code_r0x0029d684;
        }
        goto code_r0x0029d634;
      }
    }
    if ((uVar14 & 0xff) != 0) {
      return 0;
    }
    if (uVar15 < 8) {
      uVar14 = 0;
      uVar18 = uVar10;
code_r0x0029d7a0:
      lVar11 = uVar18 + lVar11 * -8;
      pbVar12 = (byte *)(uVar25 + uVar18);
      do {
        uVar14 = *pbVar12 | uVar14;
        bVar5 = lVar11 != -1;
        lVar11 = lVar11 + 1;
        pbVar12 = pbVar12 + 1;
      } while (bVar5);
    }
    else if (uVar15 < 0x40) {
      bVar26 = 0;
      uVar24 = 0;
code_r0x0029d750:
      uVar23 = uVar15 & 0xfffffffffffffff8;
      uVar18 = uVar23 + uVar10;
      auVar34 = ZEXT116(bVar26);
      lVar17 = uVar24 - uVar23;
      puVar19 = (undefined8 *)(uVar25 + uVar24 + uVar10);
      do {
        uVar51 = *puVar19;
        auVar34._0_8_ =
             CONCAT17((byte)((ulong)uVar51 >> 0x38) | auVar34[7],
                      CONCAT16((byte)((ulong)uVar51 >> 0x30) | auVar34[6],
                               CONCAT15((byte)((ulong)uVar51 >> 0x28) | auVar34[5],
                                        CONCAT14((byte)((ulong)uVar51 >> 0x20) | auVar34[4],
                                                 CONCAT13((byte)((ulong)uVar51 >> 0x18) | auVar34[3]
                                                          ,CONCAT12((byte)((ulong)uVar51 >> 0x10) |
                                                                    auVar34[2],
                                                                    CONCAT11((byte)((ulong)uVar51 >>
                                                                                   8) | auVar34[1],
                                                                             (byte)uVar51 |
                                                                             auVar34[0])))))));
        auVar34._8_8_ = 0;
        lVar17 = lVar17 + 8;
        puVar19 = puVar19 + 1;
      } while (lVar17 != 0);
      uVar24 = auVar34._0_8_ | auVar34._0_8_ >> 0x20;
      uVar24 = uVar24 | uVar24 >> 0x10;
      uVar14 = (uint)uVar24 | (uint)(uVar24 >> 8);
      if (uVar15 != uVar23) goto code_r0x0029d7a0;
    }
    else {
      uVar24 = uVar15 & 0xffffffffffffffc0;
      bVar26 = 0;
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
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
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
      bVar96 = 0;
      bVar97 = 0;
      bVar98 = 0;
      bVar99 = 0;
      puVar19 = (undefined8 *)(uVar10 + uVar25 + 0x20);
      uVar18 = uVar24;
      do {
        uVar100 = puVar19[-3];
        uVar51 = puVar19[-4];
        uVar102 = puVar19[-1];
        uVar101 = puVar19[-2];
        uVar104 = puVar19[1];
        uVar103 = *puVar19;
        uVar106 = puVar19[3];
        uVar105 = puVar19[2];
        bVar26 = (byte)uVar51 | bVar26;
        bVar35 = (byte)((ulong)uVar51 >> 8) | bVar35;
        bVar36 = (byte)((ulong)uVar51 >> 0x10) | bVar36;
        bVar37 = (byte)((ulong)uVar51 >> 0x18) | bVar37;
        bVar38 = (byte)((ulong)uVar51 >> 0x20) | bVar38;
        bVar39 = (byte)((ulong)uVar51 >> 0x28) | bVar39;
        bVar40 = (byte)((ulong)uVar51 >> 0x30) | bVar40;
        bVar41 = (byte)((ulong)uVar51 >> 0x38) | bVar41;
        bVar42 = (byte)uVar100 | bVar42;
        bVar43 = (byte)((ulong)uVar100 >> 8) | bVar43;
        bVar44 = (byte)((ulong)uVar100 >> 0x10) | bVar44;
        bVar45 = (byte)((ulong)uVar100 >> 0x18) | bVar45;
        bVar46 = (byte)((ulong)uVar100 >> 0x20) | bVar46;
        bVar47 = (byte)((ulong)uVar100 >> 0x28) | bVar47;
        bVar48 = (byte)((ulong)uVar100 >> 0x30) | bVar48;
        bVar49 = (byte)((ulong)uVar100 >> 0x38) | bVar49;
        bVar50 = (byte)uVar101 | bVar50;
        bVar53 = (byte)((ulong)uVar101 >> 8) | bVar53;
        bVar54 = (byte)((ulong)uVar101 >> 0x10) | bVar54;
        bVar55 = (byte)((ulong)uVar101 >> 0x18) | bVar55;
        bVar56 = (byte)((ulong)uVar101 >> 0x20) | bVar56;
        bVar57 = (byte)((ulong)uVar101 >> 0x28) | bVar57;
        bVar58 = (byte)((ulong)uVar101 >> 0x30) | bVar58;
        bVar59 = (byte)((ulong)uVar101 >> 0x38) | bVar59;
        bVar60 = (byte)uVar102 | bVar60;
        bVar61 = (byte)((ulong)uVar102 >> 8) | bVar61;
        bVar62 = (byte)((ulong)uVar102 >> 0x10) | bVar62;
        bVar63 = (byte)((ulong)uVar102 >> 0x18) | bVar63;
        bVar64 = (byte)((ulong)uVar102 >> 0x20) | bVar64;
        bVar65 = (byte)((ulong)uVar102 >> 0x28) | bVar65;
        bVar66 = (byte)((ulong)uVar102 >> 0x30) | bVar66;
        bVar67 = (byte)((ulong)uVar102 >> 0x38) | bVar67;
        bVar68 = (byte)uVar103 | bVar68;
        bVar69 = (byte)((ulong)uVar103 >> 8) | bVar69;
        bVar70 = (byte)((ulong)uVar103 >> 0x10) | bVar70;
        bVar71 = (byte)((ulong)uVar103 >> 0x18) | bVar71;
        bVar72 = (byte)((ulong)uVar103 >> 0x20) | bVar72;
        bVar73 = (byte)((ulong)uVar103 >> 0x28) | bVar73;
        bVar74 = (byte)((ulong)uVar103 >> 0x30) | bVar74;
        bVar75 = (byte)((ulong)uVar103 >> 0x38) | bVar75;
        bVar76 = (byte)uVar104 | bVar76;
        bVar77 = (byte)((ulong)uVar104 >> 8) | bVar77;
        bVar78 = (byte)((ulong)uVar104 >> 0x10) | bVar78;
        bVar79 = (byte)((ulong)uVar104 >> 0x18) | bVar79;
        bVar80 = (byte)((ulong)uVar104 >> 0x20) | bVar80;
        bVar81 = (byte)((ulong)uVar104 >> 0x28) | bVar81;
        bVar82 = (byte)((ulong)uVar104 >> 0x30) | bVar82;
        bVar83 = (byte)((ulong)uVar104 >> 0x38) | bVar83;
        bVar84 = (byte)uVar105 | bVar84;
        bVar85 = (byte)((ulong)uVar105 >> 8) | bVar85;
        bVar86 = (byte)((ulong)uVar105 >> 0x10) | bVar86;
        bVar87 = (byte)((ulong)uVar105 >> 0x18) | bVar87;
        bVar88 = (byte)((ulong)uVar105 >> 0x20) | bVar88;
        bVar89 = (byte)((ulong)uVar105 >> 0x28) | bVar89;
        bVar90 = (byte)((ulong)uVar105 >> 0x30) | bVar90;
        bVar91 = (byte)((ulong)uVar105 >> 0x38) | bVar91;
        bVar92 = (byte)uVar106 | bVar92;
        bVar93 = (byte)((ulong)uVar106 >> 8) | bVar93;
        bVar94 = (byte)((ulong)uVar106 >> 0x10) | bVar94;
        bVar95 = (byte)((ulong)uVar106 >> 0x18) | bVar95;
        bVar96 = (byte)((ulong)uVar106 >> 0x20) | bVar96;
        bVar97 = (byte)((ulong)uVar106 >> 0x28) | bVar97;
        bVar98 = (byte)((ulong)uVar106 >> 0x30) | bVar98;
        bVar99 = (byte)((ulong)uVar106 >> 0x38) | bVar99;
        uVar18 = uVar18 - 0x40;
        puVar19 = puVar19 + 8;
      } while (uVar18 != 0);
      auVar33[0] = bVar84 | bVar68 | bVar50 | bVar26;
      auVar33[1] = bVar85 | bVar69 | bVar53 | bVar35;
      auVar33[2] = bVar86 | bVar70 | bVar54 | bVar36;
      auVar33[3] = bVar87 | bVar71 | bVar55 | bVar37;
      auVar33[4] = bVar88 | bVar72 | bVar56 | bVar38;
      auVar33[5] = bVar89 | bVar73 | bVar57 | bVar39;
      auVar33[6] = bVar90 | bVar74 | bVar58 | bVar40;
      auVar33[7] = bVar91 | bVar75 | bVar59 | bVar41;
      auVar33[8] = bVar92 | bVar76 | bVar60 | bVar42;
      auVar33[9] = bVar93 | bVar77 | bVar61 | bVar43;
      auVar33[10] = bVar94 | bVar78 | bVar62 | bVar44;
      auVar33[0xb] = bVar95 | bVar79 | bVar63 | bVar45;
      auVar33[0xc] = bVar96 | bVar80 | bVar64 | bVar46;
      auVar33[0xd] = bVar97 | bVar81 | bVar65 | bVar47;
      auVar33[0xe] = bVar98 | bVar82 | bVar66 | bVar48;
      auVar33[0xf] = bVar99 | bVar83 | bVar67 | bVar49;
      auVar107 = NEON_ext(auVar33,auVar33,8,1);
      uVar18 = CONCAT17(auVar33[7] | auVar107[7],
                        CONCAT16(auVar33[6] | auVar107[6],
                                 CONCAT15(auVar33[5] | auVar107[5],
                                          CONCAT14(auVar33[4] | auVar107[4],
                                                   CONCAT13(auVar33[3] | auVar107[3],
                                                            CONCAT12(auVar33[2] | auVar107[2],
                                                                     CONCAT11(auVar33[1] |
                                                                              auVar107[1],
                                                                              auVar33[0] |
                                                                              auVar107[0])))))));
      uVar18 = uVar18 | uVar18 >> 0x20;
      uVar18 = uVar18 | uVar18 >> 0x10;
      uVar14 = (uint)uVar18 | (uint)(uVar18 >> 8);
      bVar26 = (byte)uVar14;
      if (uVar15 != uVar24) {
        if ((uVar15 & 0x38) == 0) {
          uVar18 = uVar24 + uVar10;
          goto code_r0x0029d7a0;
        }
        goto code_r0x0029d750;
      }
    }
    if ((uVar14 & 0xff) != 0) {
      plVar6 = (long *)func_0x0079dae0();
      uVar14 = *(uint *)(plVar6 + 1);
      uVar15 = (ulong)uVar14;
      lVar16 = uVar15 * 8;
      do {
        lVar16 = lVar16 + -8;
        uVar9 = (uint)uVar15;
        uVar15 = (ulong)(uVar9 - 1);
        uVar8 = uVar14 & (int)uVar14 >> 0x1f;
        if ((int)uVar9 < 1) goto code_r0x0029d910;
      } while (*(long *)(*plVar6 + lVar16) == 0);
      uVar8 = uVar9;
code_r0x0029d910:
      if (uVar8 == 0) {
        return 0;
      }
      if (uVar8 == 1) {
        return *(undefined8 *)*plVar6;
      }
      return 0xffffffffffffffff;
    }
  }
  uVar15 = uVar7;
  if (uVar10 <= uVar7) {
    uVar15 = uVar10;
  }
  if (uVar15 == 0) goto LAB_0029d828;
  if ((uVar15 < 8) || (lVar16 + (uVar10 - uVar15) < uVar25 + uVar15 && uVar25 < lVar16 + uVar10)) {
    uVar18 = 0;
  }
  else {
    if (uVar15 < 0x40) {
      uVar24 = 0;
    }
    else {
      uVar18 = uVar15 & 0xffffffffffffffc0;
      puVar19 = (undefined8 *)(uVar10 + lVar16 + -0x20);
      pVar22 = (unkbyte9 *)(uVar25 + 0x20);
      uVar24 = uVar18;
      do {
        uVar51 = *(undefined8 *)((long)pVar22 + 8);
        Var3 = *pVar22;
        uVar100 = *(undefined8 *)((long)pVar22 + 0x18);
        Var4 = pVar22[1];
        auVar107 = NEON_rev64(*(undefined1 (*) [16])(pVar22 + -2),1);
        auVar107 = NEON_ext(auVar107,auVar107,8,1);
        auVar52 = NEON_rev64(*(undefined1 (*) [16])(pVar22 + -1),1);
        auVar52 = NEON_ext(auVar52,auVar52,8,1);
        puVar19[1] = auVar52._8_8_;
        *puVar19 = auVar52._0_8_;
        puVar19[3] = auVar107._8_8_;
        puVar19[2] = auVar107._0_8_;
        auVar1[9] = (char)((ulong)uVar51 >> 8);
        auVar1._0_9_ = Var3;
        auVar1[10] = (char)((ulong)uVar51 >> 0x10);
        auVar1[0xb] = (char)((ulong)uVar51 >> 0x18);
        auVar1[0xc] = (char)((ulong)uVar51 >> 0x20);
        auVar1[0xd] = (char)((ulong)uVar51 >> 0x28);
        auVar1[0xe] = (char)((ulong)uVar51 >> 0x30);
        auVar1[0xf] = (char)((ulong)uVar51 >> 0x38);
        auVar107 = NEON_rev64(auVar1,1);
        auVar107 = NEON_ext(auVar107,auVar107,8,1);
        auVar2[9] = (char)((ulong)uVar100 >> 8);
        auVar2._0_9_ = Var4;
        auVar2[10] = (char)((ulong)uVar100 >> 0x10);
        auVar2[0xb] = (char)((ulong)uVar100 >> 0x18);
        auVar2[0xc] = (char)((ulong)uVar100 >> 0x20);
        auVar2[0xd] = (char)((ulong)uVar100 >> 0x28);
        auVar2[0xe] = (char)((ulong)uVar100 >> 0x30);
        auVar2[0xf] = (char)((ulong)uVar100 >> 0x38);
        auVar52 = NEON_rev64(auVar2,1);
        auVar52 = NEON_ext(auVar52,auVar52,8,1);
        puVar19[-3] = auVar52._8_8_;
        puVar19[-4] = auVar52._0_8_;
        puVar19[-1] = auVar107._8_8_;
        puVar19[-2] = auVar107._0_8_;
        puVar19 = puVar19 + -8;
        uVar24 = uVar24 - 0x40;
        pVar22 = pVar22 + 4;
      } while (uVar24 != 0);
      if (uVar15 == uVar18) goto LAB_0029d828;
      uVar24 = uVar18;
      if ((uVar15 & 0x38) == 0) goto LAB_0029d804;
    }
    uVar18 = uVar15 & 0xfffffffffffffff8;
    puVar19 = (undefined8 *)((uVar10 - uVar24) + lVar16);
    lVar11 = uVar24 - uVar18;
    puVar20 = (undefined8 *)(uVar25 + uVar24);
    do {
      puVar19 = puVar19 + -1;
      uVar51 = NEON_rev64(*puVar20,1);
      *puVar19 = uVar51;
      lVar11 = lVar11 + 8;
      puVar20 = puVar20 + 1;
    } while (lVar11 != 0);
    if (uVar15 == uVar18) goto LAB_0029d828;
  }
LAB_0029d804:
  lVar11 = uVar15 - uVar18;
  puVar13 = (undefined1 *)(uVar25 + uVar18);
  puVar21 = (undefined1 *)(lVar16 + uVar10 + ~uVar18);
  do {
    *puVar21 = *puVar13;
    lVar11 = lVar11 + -1;
    puVar13 = puVar13 + 1;
    puVar21 = puVar21 + -1;
  } while (lVar11 != 0);
LAB_0029d828:
  if (uVar7 < uVar10) {
    _bzero(lVar16,uVar10 - uVar15);
  }
  return 1;
}

