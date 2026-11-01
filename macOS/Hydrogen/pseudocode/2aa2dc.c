
undefined8 FUN_002aa2dc(void)

{
  long *plVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  int iVar8;
  uint uVar9;
  byte *pbVar10;
  ulong *puVar11;
  ulong uVar12;
  byte *pbVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 *unaff_x19;
  long *unaff_x20;
  undefined8 uVar20;
  long lVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
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
  byte bVar47;
  byte bVar48;
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
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  undefined8 uVar63;
  byte bVar70;
  byte bVar71;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  undefined8 uVar72;
  byte bVar79;
  byte bVar80;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  undefined8 uVar81;
  byte bVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  undefined8 uVar93;
  undefined8 uVar94;
  undefined8 uVar95;
  undefined8 uVar96;
  undefined1 auVar97 [16];
  
  iVar8 = func_0x0029e4fc();
  if (iVar8 == 0) {
LAB_002aa404:
    uVar20 = 0;
  }
  else {
    uVar9 = *(uint *)(unaff_x20 + 4);
    lVar21 = (long)(int)uVar9;
    uVar2 = *(uint *)(unaff_x20 + 1);
    if (uVar9 < uVar2) {
      uVar15 = (int)uVar2 - lVar21;
      if (uVar15 < 8) {
        uVar18 = 0;
        lVar16 = lVar21;
LAB_002aa3cc:
        lVar21 = (int)uVar2 - lVar16;
        puVar11 = (ulong *)(*unaff_x20 + lVar16 * 8);
        do {
          uVar18 = *puVar11 | uVar18;
          lVar21 = lVar21 + -1;
          puVar11 = puVar11 + 1;
        } while (lVar21 != 0);
      }
      else {
        uVar12 = uVar15 & 0xfffffffffffffff8;
        lVar16 = uVar12 + lVar21;
        bVar22 = 0;
        bVar23 = 0;
        bVar24 = 0;
        bVar25 = 0;
        bVar26 = 0;
        bVar27 = 0;
        bVar28 = 0;
        bVar29 = 0;
        bVar30 = 0;
        bVar31 = 0;
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
        bVar48 = 0;
        bVar49 = 0;
        bVar50 = 0;
        bVar51 = 0;
        bVar52 = 0;
        bVar53 = 0;
        uVar20 = 0;
        uVar63 = 0;
        uVar72 = 0;
        uVar81 = 0;
        puVar19 = (undefined8 *)(*unaff_x20 + lVar21 * 8 + 0x20);
        uVar18 = uVar12;
        do {
          uVar90 = puVar19[-3];
          uVar89 = puVar19[-4];
          uVar92 = puVar19[-1];
          uVar91 = puVar19[-2];
          uVar94 = puVar19[1];
          uVar93 = *puVar19;
          uVar96 = puVar19[3];
          uVar95 = puVar19[2];
          bVar22 = (byte)uVar89 | bVar22;
          bVar23 = (byte)((ulong)uVar89 >> 8) | bVar23;
          bVar24 = (byte)((ulong)uVar89 >> 0x10) | bVar24;
          bVar25 = (byte)((ulong)uVar89 >> 0x18) | bVar25;
          bVar26 = (byte)((ulong)uVar89 >> 0x20) | bVar26;
          bVar27 = (byte)((ulong)uVar89 >> 0x28) | bVar27;
          bVar28 = (byte)((ulong)uVar89 >> 0x30) | bVar28;
          bVar29 = (byte)((ulong)uVar89 >> 0x38) | bVar29;
          bVar30 = (byte)uVar90 | bVar30;
          bVar31 = (byte)((ulong)uVar90 >> 8) | bVar31;
          bVar32 = (byte)((ulong)uVar90 >> 0x10) | bVar32;
          bVar33 = (byte)((ulong)uVar90 >> 0x18) | bVar33;
          bVar34 = (byte)((ulong)uVar90 >> 0x20) | bVar34;
          bVar35 = (byte)((ulong)uVar90 >> 0x28) | bVar35;
          bVar36 = (byte)((ulong)uVar90 >> 0x30) | bVar36;
          bVar37 = (byte)((ulong)uVar90 >> 0x38) | bVar37;
          bVar38 = (byte)uVar91 | bVar38;
          bVar39 = (byte)((ulong)uVar91 >> 8) | bVar39;
          bVar40 = (byte)((ulong)uVar91 >> 0x10) | bVar40;
          bVar41 = (byte)((ulong)uVar91 >> 0x18) | bVar41;
          bVar42 = (byte)((ulong)uVar91 >> 0x20) | bVar42;
          bVar43 = (byte)((ulong)uVar91 >> 0x28) | bVar43;
          bVar44 = (byte)((ulong)uVar91 >> 0x30) | bVar44;
          bVar45 = (byte)((ulong)uVar91 >> 0x38) | bVar45;
          bVar46 = (byte)uVar92 | bVar46;
          bVar47 = (byte)((ulong)uVar92 >> 8) | bVar47;
          bVar48 = (byte)((ulong)uVar92 >> 0x10) | bVar48;
          bVar49 = (byte)((ulong)uVar92 >> 0x18) | bVar49;
          bVar50 = (byte)((ulong)uVar92 >> 0x20) | bVar50;
          bVar51 = (byte)((ulong)uVar92 >> 0x28) | bVar51;
          bVar52 = (byte)((ulong)uVar92 >> 0x30) | bVar52;
          bVar53 = (byte)((ulong)uVar92 >> 0x38) | bVar53;
          bVar54 = (byte)uVar93 | (byte)uVar20;
          bVar55 = (byte)((ulong)uVar93 >> 8) | (byte)((ulong)uVar20 >> 8);
          bVar56 = (byte)((ulong)uVar93 >> 0x10) | (byte)((ulong)uVar20 >> 0x10);
          bVar57 = (byte)((ulong)uVar93 >> 0x18) | (byte)((ulong)uVar20 >> 0x18);
          bVar58 = (byte)((ulong)uVar93 >> 0x20) | (byte)((ulong)uVar20 >> 0x20);
          bVar59 = (byte)((ulong)uVar93 >> 0x28) | (byte)((ulong)uVar20 >> 0x28);
          bVar60 = (byte)((ulong)uVar93 >> 0x30) | (byte)((ulong)uVar20 >> 0x30);
          bVar61 = (byte)((ulong)uVar93 >> 0x38) | (byte)((ulong)uVar20 >> 0x38);
          uVar20 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(bVar57,
                                                  CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))));
          bVar62 = (byte)uVar94 | (byte)uVar63;
          bVar64 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar63 >> 8);
          bVar65 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
          bVar66 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
          bVar67 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
          bVar68 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
          bVar69 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
          bVar70 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
          uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66,
                                                  CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))));
          bVar71 = (byte)uVar95 | (byte)uVar72;
          bVar73 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar72 >> 8);
          bVar74 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
          bVar75 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
          bVar76 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
          bVar77 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
          bVar78 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
          bVar79 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
          uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(bVar75,
                                                  CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))));
          bVar80 = (byte)uVar96 | (byte)uVar81;
          bVar82 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar81 >> 8);
          bVar83 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar81 >> 0x10);
          bVar84 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar81 >> 0x18);
          bVar85 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar81 >> 0x20);
          bVar86 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar81 >> 0x28);
          bVar87 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar81 >> 0x30);
          bVar88 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar81 >> 0x38);
          uVar81 = CONCAT17(bVar88,CONCAT16(bVar87,CONCAT15(bVar86,CONCAT14(bVar85,CONCAT13(bVar84,
                                                  CONCAT12(bVar83,CONCAT11(bVar82,bVar80)))))));
          uVar18 = uVar18 - 8;
          puVar19 = puVar19 + 8;
        } while (uVar18 != 0);
        bVar71 = bVar71 | bVar54 | bVar38 | bVar22;
        bVar73 = bVar73 | bVar55 | bVar39 | bVar23;
        bVar74 = bVar74 | bVar56 | bVar40 | bVar24;
        bVar75 = bVar75 | bVar57 | bVar41 | bVar25;
        bVar76 = bVar76 | bVar58 | bVar42 | bVar26;
        bVar77 = bVar77 | bVar59 | bVar43 | bVar27;
        bVar78 = bVar78 | bVar60 | bVar44 | bVar28;
        bVar79 = bVar79 | bVar61 | bVar45 | bVar29;
        bVar80 = bVar80 | bVar62 | bVar46 | bVar30;
        bVar82 = bVar82 | bVar64 | bVar47 | bVar31;
        bVar83 = bVar83 | bVar65 | bVar48 | bVar32;
        bVar84 = bVar84 | bVar66 | bVar49 | bVar33;
        bVar85 = bVar85 | bVar67 | bVar50 | bVar34;
        bVar86 = bVar86 | bVar68 | bVar51 | bVar35;
        bVar87 = bVar87 | bVar69 | bVar52 | bVar36;
        bVar88 = bVar88 | bVar70 | bVar53 | bVar37;
        auVar97[1] = bVar73;
        auVar97[0] = bVar71;
        auVar97[2] = bVar74;
        auVar97[3] = bVar75;
        auVar97[4] = bVar76;
        auVar97[5] = bVar77;
        auVar97[6] = bVar78;
        auVar97[7] = bVar79;
        auVar97[8] = bVar80;
        auVar97[9] = bVar82;
        auVar97[10] = bVar83;
        auVar97[0xb] = bVar84;
        auVar97[0xc] = bVar85;
        auVar97[0xd] = bVar86;
        auVar97[0xe] = bVar87;
        auVar97[0xf] = bVar88;
        auVar7[1] = bVar73;
        auVar7[0] = bVar71;
        auVar7[2] = bVar74;
        auVar7[3] = bVar75;
        auVar7[4] = bVar76;
        auVar7[5] = bVar77;
        auVar7[6] = bVar78;
        auVar7[7] = bVar79;
        auVar7[8] = bVar80;
        auVar7[9] = bVar82;
        auVar7[10] = bVar83;
        auVar7[0xb] = bVar84;
        auVar7[0xc] = bVar85;
        auVar7[0xd] = bVar86;
        auVar7[0xe] = bVar87;
        auVar7[0xf] = bVar88;
        auVar97 = NEON_ext(auVar97,auVar7,8,1);
        uVar18 = CONCAT17(bVar79 | auVar97[7],
                          CONCAT16(bVar78 | auVar97[6],
                                   CONCAT15(bVar77 | auVar97[5],
                                            CONCAT14(bVar76 | auVar97[4],
                                                     CONCAT13(bVar75 | auVar97[3],
                                                              CONCAT12(bVar74 | auVar97[2],
                                                                       CONCAT11(bVar73 | auVar97[1],
                                                                                bVar71 | auVar97[0])
                                                                      ))))));
        if (uVar15 != uVar12) goto LAB_002aa3cc;
      }
      if (uVar18 != 0) {
        func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x19e);
        goto LAB_002aa404;
      }
    }
    else {
      iVar8 = func_0x0029afb8();
      if (iVar8 == 0) goto LAB_002aa404;
      uVar2 = *(uint *)(unaff_x20 + 1);
      if (uVar9 != uVar2) {
        _bzero(*unaff_x20 + (long)(int)uVar2 * 8,(lVar21 - (int)uVar2) * 8);
      }
    }
    *(uint *)(unaff_x20 + 1) = uVar9;
    uVar20 = 1;
  }
  if (unaff_x19 == (undefined8 *)0x0) {
    return uVar20;
  }
  if ((unaff_x19[4] == 0) || (*(char *)(unaff_x19 + 5) != '\0')) {
    func_0x00373520(*unaff_x19,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
    func_0x0036e3d8(unaff_x19[1]);
    func_0x0036e3d8();
    return uVar20;
  }
  auVar97 = func_0x0079db28();
  auVar97._8_8_ = auVar97._8_8_;
  lVar21 = auVar97._0_8_;
  uVar9 = *(uint *)(auVar97._8_8_ + 1);
  uVar15 = (ulong)(int)uVar9;
  if (uVar9 == 0) goto code_r0x002aa560;
  pbVar10 = (byte *)*auVar97._8_8_;
  if (uVar9 < 8) {
    uVar12 = 0;
    uVar18 = 0;
code_r0x002aa504:
    lVar16 = uVar15 - uVar12;
    puVar11 = (ulong *)(pbVar10 + uVar12 * 8);
    do {
      uVar18 = *puVar11 | uVar18;
      lVar16 = lVar16 + -1;
      puVar11 = puVar11 + 1;
    } while (lVar16 != 0);
  }
  else {
    uVar12 = uVar15 & 0xfffffffffffffff8;
    bVar22 = 0;
    bVar23 = 0;
    bVar24 = 0;
    bVar25 = 0;
    bVar26 = 0;
    bVar27 = 0;
    bVar28 = 0;
    bVar29 = 0;
    bVar30 = 0;
    bVar31 = 0;
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
    bVar48 = 0;
    bVar49 = 0;
    bVar50 = 0;
    bVar51 = 0;
    bVar52 = 0;
    bVar53 = 0;
    uVar20 = 0;
    uVar63 = 0;
    uVar72 = 0;
    uVar81 = 0;
    pbVar13 = pbVar10 + 0x20;
    uVar18 = uVar12;
    do {
      uVar90 = *(undefined8 *)(pbVar13 + -0x18);
      uVar89 = *(undefined8 *)(pbVar13 + -0x20);
      uVar92 = *(undefined8 *)(pbVar13 + -8);
      uVar91 = *(undefined8 *)(pbVar13 + -0x10);
      uVar94 = *(undefined8 *)(pbVar13 + 8);
      uVar93 = *(undefined8 *)pbVar13;
      uVar96 = *(undefined8 *)(pbVar13 + 0x18);
      uVar95 = *(undefined8 *)(pbVar13 + 0x10);
      bVar22 = (byte)uVar89 | bVar22;
      bVar23 = (byte)((ulong)uVar89 >> 8) | bVar23;
      bVar24 = (byte)((ulong)uVar89 >> 0x10) | bVar24;
      bVar25 = (byte)((ulong)uVar89 >> 0x18) | bVar25;
      bVar26 = (byte)((ulong)uVar89 >> 0x20) | bVar26;
      bVar27 = (byte)((ulong)uVar89 >> 0x28) | bVar27;
      bVar28 = (byte)((ulong)uVar89 >> 0x30) | bVar28;
      bVar29 = (byte)((ulong)uVar89 >> 0x38) | bVar29;
      bVar30 = (byte)uVar90 | bVar30;
      bVar31 = (byte)((ulong)uVar90 >> 8) | bVar31;
      bVar32 = (byte)((ulong)uVar90 >> 0x10) | bVar32;
      bVar33 = (byte)((ulong)uVar90 >> 0x18) | bVar33;
      bVar34 = (byte)((ulong)uVar90 >> 0x20) | bVar34;
      bVar35 = (byte)((ulong)uVar90 >> 0x28) | bVar35;
      bVar36 = (byte)((ulong)uVar90 >> 0x30) | bVar36;
      bVar37 = (byte)((ulong)uVar90 >> 0x38) | bVar37;
      bVar38 = (byte)uVar91 | bVar38;
      bVar39 = (byte)((ulong)uVar91 >> 8) | bVar39;
      bVar40 = (byte)((ulong)uVar91 >> 0x10) | bVar40;
      bVar41 = (byte)((ulong)uVar91 >> 0x18) | bVar41;
      bVar42 = (byte)((ulong)uVar91 >> 0x20) | bVar42;
      bVar43 = (byte)((ulong)uVar91 >> 0x28) | bVar43;
      bVar44 = (byte)((ulong)uVar91 >> 0x30) | bVar44;
      bVar45 = (byte)((ulong)uVar91 >> 0x38) | bVar45;
      bVar46 = (byte)uVar92 | bVar46;
      bVar47 = (byte)((ulong)uVar92 >> 8) | bVar47;
      bVar48 = (byte)((ulong)uVar92 >> 0x10) | bVar48;
      bVar49 = (byte)((ulong)uVar92 >> 0x18) | bVar49;
      bVar50 = (byte)((ulong)uVar92 >> 0x20) | bVar50;
      bVar51 = (byte)((ulong)uVar92 >> 0x28) | bVar51;
      bVar52 = (byte)((ulong)uVar92 >> 0x30) | bVar52;
      bVar53 = (byte)((ulong)uVar92 >> 0x38) | bVar53;
      bVar54 = (byte)uVar93 | (byte)uVar20;
      bVar55 = (byte)((ulong)uVar93 >> 8) | (byte)((ulong)uVar20 >> 8);
      bVar56 = (byte)((ulong)uVar93 >> 0x10) | (byte)((ulong)uVar20 >> 0x10);
      bVar57 = (byte)((ulong)uVar93 >> 0x18) | (byte)((ulong)uVar20 >> 0x18);
      bVar58 = (byte)((ulong)uVar93 >> 0x20) | (byte)((ulong)uVar20 >> 0x20);
      bVar59 = (byte)((ulong)uVar93 >> 0x28) | (byte)((ulong)uVar20 >> 0x28);
      bVar60 = (byte)((ulong)uVar93 >> 0x30) | (byte)((ulong)uVar20 >> 0x30);
      bVar61 = (byte)((ulong)uVar93 >> 0x38) | (byte)((ulong)uVar20 >> 0x38);
      uVar20 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(bVar57,
                                                  CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))));
      bVar62 = (byte)uVar94 | (byte)uVar63;
      bVar64 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar63 >> 8);
      bVar65 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
      bVar66 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
      bVar67 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
      bVar68 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
      bVar69 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
      bVar70 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
      uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66,
                                                  CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))));
      bVar71 = (byte)uVar95 | (byte)uVar72;
      bVar73 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar72 >> 8);
      bVar74 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
      bVar75 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
      bVar76 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
      bVar77 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
      bVar78 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
      bVar79 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
      uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(bVar75,
                                                  CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))));
      bVar80 = (byte)uVar96 | (byte)uVar81;
      bVar82 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar81 >> 8);
      bVar83 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar81 >> 0x10);
      bVar84 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar81 >> 0x18);
      bVar85 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar81 >> 0x20);
      bVar86 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar81 >> 0x28);
      bVar87 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar81 >> 0x30);
      bVar88 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar81 >> 0x38);
      uVar81 = CONCAT17(bVar88,CONCAT16(bVar87,CONCAT15(bVar86,CONCAT14(bVar85,CONCAT13(bVar84,
                                                  CONCAT12(bVar83,CONCAT11(bVar82,bVar80)))))));
      uVar18 = uVar18 - 8;
      pbVar13 = pbVar13 + 0x40;
    } while (uVar18 != 0);
    bVar71 = bVar71 | bVar54 | bVar38 | bVar22;
    bVar73 = bVar73 | bVar55 | bVar39 | bVar23;
    bVar74 = bVar74 | bVar56 | bVar40 | bVar24;
    bVar75 = bVar75 | bVar57 | bVar41 | bVar25;
    bVar76 = bVar76 | bVar58 | bVar42 | bVar26;
    bVar77 = bVar77 | bVar59 | bVar43 | bVar27;
    bVar78 = bVar78 | bVar60 | bVar44 | bVar28;
    bVar79 = bVar79 | bVar61 | bVar45 | bVar29;
    bVar80 = bVar80 | bVar62 | bVar46 | bVar30;
    bVar82 = bVar82 | bVar64 | bVar47 | bVar31;
    bVar83 = bVar83 | bVar65 | bVar48 | bVar32;
    bVar84 = bVar84 | bVar66 | bVar49 | bVar33;
    bVar85 = bVar85 | bVar67 | bVar50 | bVar34;
    bVar86 = bVar86 | bVar68 | bVar51 | bVar35;
    bVar87 = bVar87 | bVar69 | bVar52 | bVar36;
    bVar88 = bVar88 | bVar70 | bVar53 | bVar37;
    auVar5[1] = bVar73;
    auVar5[0] = bVar71;
    auVar5[2] = bVar74;
    auVar5[3] = bVar75;
    auVar5[4] = bVar76;
    auVar5[5] = bVar77;
    auVar5[6] = bVar78;
    auVar5[7] = bVar79;
    auVar5[8] = bVar80;
    auVar5[9] = bVar82;
    auVar5[10] = bVar83;
    auVar5[0xb] = bVar84;
    auVar5[0xc] = bVar85;
    auVar5[0xd] = bVar86;
    auVar5[0xe] = bVar87;
    auVar5[0xf] = bVar88;
    auVar6[1] = bVar73;
    auVar6[0] = bVar71;
    auVar6[2] = bVar74;
    auVar6[3] = bVar75;
    auVar6[4] = bVar76;
    auVar6[5] = bVar77;
    auVar6[6] = bVar78;
    auVar6[7] = bVar79;
    auVar6[8] = bVar80;
    auVar6[9] = bVar82;
    auVar6[10] = bVar83;
    auVar6[0xb] = bVar84;
    auVar6[0xc] = bVar85;
    auVar6[0xd] = bVar86;
    auVar6[0xe] = bVar87;
    auVar6[0xf] = bVar88;
    auVar97 = NEON_ext(auVar5,auVar6,8,1);
    uVar18 = CONCAT17(bVar79 | auVar97[7],
                      CONCAT16(bVar78 | auVar97[6],
                               CONCAT15(bVar77 | auVar97[5],
                                        CONCAT14(bVar76 | auVar97[4],
                                                 CONCAT13(bVar75 | auVar97[3],
                                                          CONCAT12(bVar74 | auVar97[2],
                                                                   CONCAT11(bVar73 | auVar97[1],
                                                                            bVar71 | auVar97[0])))))
                              ));
    if (uVar12 != uVar15) goto code_r0x002aa504;
  }
  if (uVar18 == 0) {
code_r0x002aa560:
    func_0x0028f83c(3,0,0x69,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xc9);
    return 0;
  }
  if (((int)uVar9 < 1) || ((*pbVar10 & 1) == 0)) {
    func_0x0028f83c(3,0,0x68,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xcd);
    return 0;
  }
  if ((int)auVar97._8_8_[2] != 0) {
    func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xd1);
    return 0;
  }
  if (uVar9 < 0x401) goto code_r0x002aa69c;
  uVar18 = uVar15 - 0x400;
  if (uVar18 < 8) {
    uVar12 = 0;
    lVar16 = 0x400;
code_r0x002aa650:
    lVar14 = uVar15 - lVar16;
    puVar11 = (ulong *)(pbVar10 + lVar16 * 8);
    do {
      uVar12 = *puVar11 | uVar12;
      lVar14 = lVar14 + -1;
      puVar11 = puVar11 + 1;
    } while (lVar14 != 0);
  }
  else {
    uVar17 = uVar18 & 0xfffffffffffffff8;
    lVar16 = uVar17 + 0x400;
    pbVar13 = pbVar10 + 0x2030;
    bVar22 = 0;
    bVar23 = 0;
    bVar24 = 0;
    bVar25 = 0;
    bVar26 = 0;
    bVar27 = 0;
    bVar28 = 0;
    bVar29 = 0;
    bVar30 = 0;
    bVar31 = 0;
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
    bVar48 = 0;
    bVar49 = 0;
    bVar50 = 0;
    bVar51 = 0;
    bVar52 = 0;
    bVar53 = 0;
    uVar20 = 0;
    uVar63 = 0;
    uVar72 = 0;
    uVar81 = 0;
    uVar12 = uVar17;
    do {
      uVar90 = *(undefined8 *)(pbVar13 + -0x28);
      uVar89 = *(undefined8 *)(pbVar13 + -0x30);
      uVar92 = *(undefined8 *)(pbVar13 + -0x18);
      uVar91 = *(undefined8 *)(pbVar13 + -0x20);
      uVar94 = *(undefined8 *)(pbVar13 + -8);
      uVar93 = *(undefined8 *)(pbVar13 + -0x10);
      uVar96 = *(undefined8 *)(pbVar13 + 8);
      uVar95 = *(undefined8 *)pbVar13;
      bVar22 = (byte)uVar89 | bVar22;
      bVar23 = (byte)((ulong)uVar89 >> 8) | bVar23;
      bVar24 = (byte)((ulong)uVar89 >> 0x10) | bVar24;
      bVar25 = (byte)((ulong)uVar89 >> 0x18) | bVar25;
      bVar26 = (byte)((ulong)uVar89 >> 0x20) | bVar26;
      bVar27 = (byte)((ulong)uVar89 >> 0x28) | bVar27;
      bVar28 = (byte)((ulong)uVar89 >> 0x30) | bVar28;
      bVar29 = (byte)((ulong)uVar89 >> 0x38) | bVar29;
      bVar30 = (byte)uVar90 | bVar30;
      bVar31 = (byte)((ulong)uVar90 >> 8) | bVar31;
      bVar32 = (byte)((ulong)uVar90 >> 0x10) | bVar32;
      bVar33 = (byte)((ulong)uVar90 >> 0x18) | bVar33;
      bVar34 = (byte)((ulong)uVar90 >> 0x20) | bVar34;
      bVar35 = (byte)((ulong)uVar90 >> 0x28) | bVar35;
      bVar36 = (byte)((ulong)uVar90 >> 0x30) | bVar36;
      bVar37 = (byte)((ulong)uVar90 >> 0x38) | bVar37;
      bVar38 = (byte)uVar91 | bVar38;
      bVar39 = (byte)((ulong)uVar91 >> 8) | bVar39;
      bVar40 = (byte)((ulong)uVar91 >> 0x10) | bVar40;
      bVar41 = (byte)((ulong)uVar91 >> 0x18) | bVar41;
      bVar42 = (byte)((ulong)uVar91 >> 0x20) | bVar42;
      bVar43 = (byte)((ulong)uVar91 >> 0x28) | bVar43;
      bVar44 = (byte)((ulong)uVar91 >> 0x30) | bVar44;
      bVar45 = (byte)((ulong)uVar91 >> 0x38) | bVar45;
      bVar46 = (byte)uVar92 | bVar46;
      bVar47 = (byte)((ulong)uVar92 >> 8) | bVar47;
      bVar48 = (byte)((ulong)uVar92 >> 0x10) | bVar48;
      bVar49 = (byte)((ulong)uVar92 >> 0x18) | bVar49;
      bVar50 = (byte)((ulong)uVar92 >> 0x20) | bVar50;
      bVar51 = (byte)((ulong)uVar92 >> 0x28) | bVar51;
      bVar52 = (byte)((ulong)uVar92 >> 0x30) | bVar52;
      bVar53 = (byte)((ulong)uVar92 >> 0x38) | bVar53;
      bVar54 = (byte)uVar93 | (byte)uVar20;
      bVar55 = (byte)((ulong)uVar93 >> 8) | (byte)((ulong)uVar20 >> 8);
      bVar56 = (byte)((ulong)uVar93 >> 0x10) | (byte)((ulong)uVar20 >> 0x10);
      bVar57 = (byte)((ulong)uVar93 >> 0x18) | (byte)((ulong)uVar20 >> 0x18);
      bVar58 = (byte)((ulong)uVar93 >> 0x20) | (byte)((ulong)uVar20 >> 0x20);
      bVar59 = (byte)((ulong)uVar93 >> 0x28) | (byte)((ulong)uVar20 >> 0x28);
      bVar60 = (byte)((ulong)uVar93 >> 0x30) | (byte)((ulong)uVar20 >> 0x30);
      bVar61 = (byte)((ulong)uVar93 >> 0x38) | (byte)((ulong)uVar20 >> 0x38);
      uVar20 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(bVar57,
                                                  CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))));
      bVar62 = (byte)uVar94 | (byte)uVar63;
      bVar64 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar63 >> 8);
      bVar65 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
      bVar66 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
      bVar67 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
      bVar68 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
      bVar69 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
      bVar70 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
      uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66,
                                                  CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))));
      bVar71 = (byte)uVar95 | (byte)uVar72;
      bVar73 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar72 >> 8);
      bVar74 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
      bVar75 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
      bVar76 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
      bVar77 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
      bVar78 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
      bVar79 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
      uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(bVar75,
                                                  CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))));
      bVar80 = (byte)uVar96 | (byte)uVar81;
      bVar82 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar81 >> 8);
      bVar83 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar81 >> 0x10);
      bVar84 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar81 >> 0x18);
      bVar85 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar81 >> 0x20);
      bVar86 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar81 >> 0x28);
      bVar87 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar81 >> 0x30);
      bVar88 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar81 >> 0x38);
      uVar81 = CONCAT17(bVar88,CONCAT16(bVar87,CONCAT15(bVar86,CONCAT14(bVar85,CONCAT13(bVar84,
                                                  CONCAT12(bVar83,CONCAT11(bVar82,bVar80)))))));
      pbVar13 = pbVar13 + 0x40;
      uVar12 = uVar12 - 8;
    } while (uVar12 != 0);
    bVar71 = bVar71 | bVar54 | bVar38 | bVar22;
    bVar73 = bVar73 | bVar55 | bVar39 | bVar23;
    bVar74 = bVar74 | bVar56 | bVar40 | bVar24;
    bVar75 = bVar75 | bVar57 | bVar41 | bVar25;
    bVar76 = bVar76 | bVar58 | bVar42 | bVar26;
    bVar77 = bVar77 | bVar59 | bVar43 | bVar27;
    bVar78 = bVar78 | bVar60 | bVar44 | bVar28;
    bVar79 = bVar79 | bVar61 | bVar45 | bVar29;
    bVar80 = bVar80 | bVar62 | bVar46 | bVar30;
    bVar82 = bVar82 | bVar64 | bVar47 | bVar31;
    bVar83 = bVar83 | bVar65 | bVar48 | bVar32;
    bVar84 = bVar84 | bVar66 | bVar49 | bVar33;
    bVar85 = bVar85 | bVar67 | bVar50 | bVar34;
    bVar86 = bVar86 | bVar68 | bVar51 | bVar35;
    bVar87 = bVar87 | bVar69 | bVar52 | bVar36;
    bVar88 = bVar88 | bVar70 | bVar53 | bVar37;
    auVar3[1] = bVar73;
    auVar3[0] = bVar71;
    auVar3[2] = bVar74;
    auVar3[3] = bVar75;
    auVar3[4] = bVar76;
    auVar3[5] = bVar77;
    auVar3[6] = bVar78;
    auVar3[7] = bVar79;
    auVar3[8] = bVar80;
    auVar3[9] = bVar82;
    auVar3[10] = bVar83;
    auVar3[0xb] = bVar84;
    auVar3[0xc] = bVar85;
    auVar3[0xd] = bVar86;
    auVar3[0xe] = bVar87;
    auVar3[0xf] = bVar88;
    auVar4[1] = bVar73;
    auVar4[0] = bVar71;
    auVar4[2] = bVar74;
    auVar4[3] = bVar75;
    auVar4[4] = bVar76;
    auVar4[5] = bVar77;
    auVar4[6] = bVar78;
    auVar4[7] = bVar79;
    auVar4[8] = bVar80;
    auVar4[9] = bVar82;
    auVar4[10] = bVar83;
    auVar4[0xb] = bVar84;
    auVar4[0xc] = bVar85;
    auVar4[0xd] = bVar86;
    auVar4[0xe] = bVar87;
    auVar4[0xf] = bVar88;
    auVar97 = NEON_ext(auVar3,auVar4,8,1);
    uVar12 = CONCAT17(bVar79 | auVar97[7],
                      CONCAT16(bVar78 | auVar97[6],
                               CONCAT15(bVar77 | auVar97[5],
                                        CONCAT14(bVar76 | auVar97[4],
                                                 CONCAT13(bVar75 | auVar97[3],
                                                          CONCAT12(bVar74 | auVar97[2],
                                                                   CONCAT11(bVar73 | auVar97[1],
                                                                            bVar71 | auVar97[0])))))
                              ));
    if (uVar18 != uVar17) goto code_r0x002aa650;
  }
  if (uVar12 != 0) {
    func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xd5);
    return 0;
  }
code_r0x002aa69c:
  plVar1 = (long *)(lVar21 + 0x18);
  if (plVar1 == auVar97._8_8_) {
    uVar15 = (ulong)*(uint *)(lVar21 + 0x20);
  }
  else {
    iVar8 = func_0x0029afb8(plVar1);
    if (iVar8 == 0) {
      func_0x0028f83c(3,0,0x44,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xdb);
      return 0;
    }
    uVar15 = (ulong)(int)auVar97._8_8_[1];
    if ((int)auVar97._8_8_[1] != 0) {
      _memcpy(*plVar1,*auVar97._8_8_,uVar15 << 3);
      uVar15 = (ulong)*(uint *)(auVar97._8_8_ + 1);
    }
    *(int *)(lVar21 + 0x28) = (int)auVar97._8_8_[2];
  }
  uVar9 = (uint)uVar15;
  lVar16 = (uVar15 & 0xffffffff) * 8;
  do {
    lVar16 = lVar16 + -8;
    iVar8 = (int)uVar15;
    uVar15 = (ulong)(iVar8 - 1);
    if (iVar8 < 1) {
      *(uint *)(lVar21 + 0x20) = uVar9 & (int)uVar9 >> 0x1f;
      if (-1 < (int)uVar9) {
        *(undefined4 *)(lVar21 + 0x28) = 0;
      }
      goto code_r0x002aa720;
    }
  } while (*(long *)(*plVar1 + lVar16) == 0);
  *(int *)(lVar21 + 0x20) = iVar8;
code_r0x002aa720:
  uVar20 = func_0x002ab5dc(plVar1);
  *(undefined8 *)(lVar21 + 0x30) = uVar20;
  *(undefined8 *)(lVar21 + 0x38) = 0;
  return 1;
}

