
ulong FUN_002aedc8(undefined8 param_1,undefined8 param_2,ulong param_3,long *param_4)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  long lVar5;
  uint *puVar6;
  uint uVar7;
  uint uVar8;
  int iVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  uint uVar16;
  long lVar17;
  ulong *puVar18;
  long lVar19;
  long lVar20;
  ulong uVar21;
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
  ulong uVar89;
  ulong uVar90;
  ulong uVar91;
  ulong uVar92;
  ulong uVar93;
  ulong uVar94;
  ulong uVar95;
  ulong uVar96;
  undefined1 auVar97 [16];
  uint uStack_94;
  undefined1 *puStack_90;
  undefined8 uStack_88;
  undefined8 *puStack_78;
  uint *puStack_70;
  ulong uStack_68;
  undefined1 auStack_6 [6];
  
  func_0x0079db4c();
  auVar97 = func_0x0079e198();
  puStack_70 = auVar97._8_8_;
  auVar97._0_8_ = auVar97._0_8_;
  lVar19 = 0;
  lVar5 = param_4[1];
  lVar20 = (long)(int)lVar5;
  lVar17 = -8;
  do {
    if (lVar20 + lVar19 == 0) goto LAB_002aee9c;
    uVar21 = ((ulong *)*param_4)[lVar20 + lVar19 + -1];
    lVar19 = lVar19 + -1;
    lVar17 = lVar17 + 8;
  } while (uVar21 == 0);
  lVar1 = lVar20 + lVar19;
  if ((lVar1 == 0) && (*(ulong *)*param_4 <= param_3)) {
LAB_002aee9c:
    uVar12 = 0xe7;
LAB_002aeeb4:
    func_0x0028f83c(3,0,0x6c,"/aws-lc/crypto/fipsmodule/bn/random.c",uVar12);
    return 0;
  }
  uVar11 = lVar1 + 1;
  uVar10 = func_0x0029afb8(auVar97._0_8_,uVar11);
  if ((int)uVar10 == 0) {
    return uVar10;
  }
  uVar21 = uVar21 | uVar21 >> 1;
  uVar21 = uVar21 | uVar21 >> 2;
  uVar21 = uVar21 | uVar21 >> 4;
  uVar21 = uVar21 | uVar21 >> 8;
  uVar21 = uVar21 | uVar21 >> 0x10;
  uVar21 = uVar21 | uVar21 >> 0x20;
  uStack_68 = uVar21 >> 1;
  if ((lVar1 == 0) && (uStack_68 < param_3)) {
    uVar12 = 0x151;
    goto LAB_002aeeb4;
  }
  func_0x002b0104(*auVar97._0_8_,lVar20 * 8 - lVar17,&UNK_00831b38);
  puVar6 = puStack_70;
  puVar18 = (ulong *)*auVar97._0_8_;
  puVar18[lVar20 + lVar19] = puVar18[lVar20 + lVar19] & uVar21;
  lVar17 = *param_4;
  uVar16 = (uint)(param_3 >> 0x20);
  if (param_3 == 0) {
    uVar8 = 0xffffffff;
  }
  else {
    if (lVar1 == 0) {
      uVar21 = 0;
    }
    else {
      uVar10 = lVar20 + lVar19;
      if (uVar10 < 8) {
        uVar21 = 0;
        uVar13 = 1;
      }
      else {
        uVar14 = uVar10 & 0xfffffffffffffff8;
        uVar13 = uVar14 | 1;
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
        uVar12 = 0;
        uVar63 = 0;
        uVar72 = 0;
        uVar81 = 0;
        puVar15 = puVar18 + 5;
        uVar21 = uVar14;
        do {
          uVar90 = puVar15[-3];
          uVar89 = puVar15[-4];
          uVar92 = puVar15[-1];
          uVar91 = puVar15[-2];
          uVar94 = puVar15[1];
          uVar93 = *puVar15;
          uVar96 = puVar15[3];
          uVar95 = puVar15[2];
          bVar22 = (byte)uVar89 | bVar22;
          bVar23 = (byte)(uVar89 >> 8) | bVar23;
          bVar24 = (byte)(uVar89 >> 0x10) | bVar24;
          bVar25 = (byte)(uVar89 >> 0x18) | bVar25;
          bVar26 = (byte)(uVar89 >> 0x20) | bVar26;
          bVar27 = (byte)(uVar89 >> 0x28) | bVar27;
          bVar28 = (byte)(uVar89 >> 0x30) | bVar28;
          bVar29 = (byte)(uVar89 >> 0x38) | bVar29;
          bVar30 = (byte)uVar90 | bVar30;
          bVar31 = (byte)(uVar90 >> 8) | bVar31;
          bVar32 = (byte)(uVar90 >> 0x10) | bVar32;
          bVar33 = (byte)(uVar90 >> 0x18) | bVar33;
          bVar34 = (byte)(uVar90 >> 0x20) | bVar34;
          bVar35 = (byte)(uVar90 >> 0x28) | bVar35;
          bVar36 = (byte)(uVar90 >> 0x30) | bVar36;
          bVar37 = (byte)(uVar90 >> 0x38) | bVar37;
          bVar38 = (byte)uVar91 | bVar38;
          bVar39 = (byte)(uVar91 >> 8) | bVar39;
          bVar40 = (byte)(uVar91 >> 0x10) | bVar40;
          bVar41 = (byte)(uVar91 >> 0x18) | bVar41;
          bVar42 = (byte)(uVar91 >> 0x20) | bVar42;
          bVar43 = (byte)(uVar91 >> 0x28) | bVar43;
          bVar44 = (byte)(uVar91 >> 0x30) | bVar44;
          bVar45 = (byte)(uVar91 >> 0x38) | bVar45;
          bVar46 = (byte)uVar92 | bVar46;
          bVar47 = (byte)(uVar92 >> 8) | bVar47;
          bVar48 = (byte)(uVar92 >> 0x10) | bVar48;
          bVar49 = (byte)(uVar92 >> 0x18) | bVar49;
          bVar50 = (byte)(uVar92 >> 0x20) | bVar50;
          bVar51 = (byte)(uVar92 >> 0x28) | bVar51;
          bVar52 = (byte)(uVar92 >> 0x30) | bVar52;
          bVar53 = (byte)(uVar92 >> 0x38) | bVar53;
          bVar54 = (byte)uVar93 | (byte)uVar12;
          bVar55 = (byte)(uVar93 >> 8) | (byte)((ulong)uVar12 >> 8);
          bVar56 = (byte)(uVar93 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
          bVar57 = (byte)(uVar93 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
          bVar58 = (byte)(uVar93 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
          bVar59 = (byte)(uVar93 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
          bVar60 = (byte)(uVar93 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
          bVar61 = (byte)(uVar93 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
          uVar12 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(bVar57,
                                                  CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))));
          bVar62 = (byte)uVar94 | (byte)uVar63;
          bVar64 = (byte)(uVar94 >> 8) | (byte)((ulong)uVar63 >> 8);
          bVar65 = (byte)(uVar94 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
          bVar66 = (byte)(uVar94 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
          bVar67 = (byte)(uVar94 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
          bVar68 = (byte)(uVar94 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
          bVar69 = (byte)(uVar94 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
          bVar70 = (byte)(uVar94 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
          uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66,
                                                  CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))));
          bVar71 = (byte)uVar95 | (byte)uVar72;
          bVar73 = (byte)(uVar95 >> 8) | (byte)((ulong)uVar72 >> 8);
          bVar74 = (byte)(uVar95 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
          bVar75 = (byte)(uVar95 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
          bVar76 = (byte)(uVar95 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
          bVar77 = (byte)(uVar95 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
          bVar78 = (byte)(uVar95 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
          bVar79 = (byte)(uVar95 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
          uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(bVar75,
                                                  CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))));
          bVar80 = (byte)uVar96 | (byte)uVar81;
          bVar82 = (byte)(uVar96 >> 8) | (byte)((ulong)uVar81 >> 8);
          bVar83 = (byte)(uVar96 >> 0x10) | (byte)((ulong)uVar81 >> 0x10);
          bVar84 = (byte)(uVar96 >> 0x18) | (byte)((ulong)uVar81 >> 0x18);
          bVar85 = (byte)(uVar96 >> 0x20) | (byte)((ulong)uVar81 >> 0x20);
          bVar86 = (byte)(uVar96 >> 0x28) | (byte)((ulong)uVar81 >> 0x28);
          bVar87 = (byte)(uVar96 >> 0x30) | (byte)((ulong)uVar81 >> 0x30);
          bVar88 = (byte)(uVar96 >> 0x38) | (byte)((ulong)uVar81 >> 0x38);
          uVar81 = CONCAT17(bVar88,CONCAT16(bVar87,CONCAT15(bVar86,CONCAT14(bVar85,CONCAT13(bVar84,
                                                  CONCAT12(bVar83,CONCAT11(bVar82,bVar80)))))));
          uVar21 = uVar21 - 8;
          puVar15 = puVar15 + 8;
        } while (uVar21 != 0);
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
        auVar97 = NEON_ext(auVar97,auVar4,8,1);
        uVar21 = CONCAT17(bVar79 | auVar97[7],
                          CONCAT16(bVar78 | auVar97[6],
                                   CONCAT15(bVar77 | auVar97[5],
                                            CONCAT14(bVar76 | auVar97[4],
                                                     CONCAT13(bVar75 | auVar97[3],
                                                              CONCAT12(bVar74 | auVar97[2],
                                                                       CONCAT11(bVar73 | auVar97[1],
                                                                                bVar71 | auVar97[0])
                                                                      ))))));
        if (uVar10 == uVar14) goto LAB_002aefe0;
      }
      do {
        uVar21 = puVar18[uVar13] | uVar21;
        uVar13 = uVar13 + 1;
      } while (uVar11 != uVar13);
    }
LAB_002aefe0:
    uVar8 = (uint)(*puVar18 >> 0x20);
    uVar8 = ~((int)((uint)(uVar21 - 1 >> 0x20) & ((uint)(uVar21 >> 0x20) ^ 0xffffffff) &
                   (((uint)(*puVar18 - param_3 >> 0x20) ^ uVar8 | uVar8 ^ uVar16) ^ uVar8)) >> 0x1f)
    ;
  }
  puStack_78 = auVar97._0_8_;
  uVar7 = func_0x0029d99c(puVar18,uVar11,lVar17,uVar11);
  uVar8 = uVar8 & uVar7 >> 0x1f;
  *puVar6 = uVar8;
  uVar21 = (ulong)uVar8 - 1;
  *puVar18 = *puVar18 | uVar21 & param_3;
  puVar18[lVar20 + lVar19] = puVar18[lVar20 + lVar19] & (uVar21 & uStack_68 | -(ulong)uVar8);
  if (param_3 == 0) {
    uVar16 = 0xffffffff;
    goto LAB_002af138;
  }
  if (uVar11 == 0) {
    uVar16 = 0;
    goto LAB_002af138;
  }
  if (uVar11 == 1) {
    uVar13 = 0;
  }
  else {
    uVar21 = lVar20 + lVar19;
    if (uVar21 < 8) {
      uVar13 = 0;
      uVar10 = 1;
    }
    else {
      uVar14 = uVar21 & 0xfffffffffffffff8;
      uVar10 = uVar14 | 1;
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
      uVar12 = 0;
      uVar63 = 0;
      uVar72 = 0;
      uVar81 = 0;
      puVar15 = puVar18 + 5;
      uVar13 = uVar14;
      do {
        uVar90 = puVar15[-3];
        uVar89 = puVar15[-4];
        uVar92 = puVar15[-1];
        uVar91 = puVar15[-2];
        uVar94 = puVar15[1];
        uVar93 = *puVar15;
        uVar96 = puVar15[3];
        uVar95 = puVar15[2];
        bVar22 = (byte)uVar89 | bVar22;
        bVar23 = (byte)(uVar89 >> 8) | bVar23;
        bVar24 = (byte)(uVar89 >> 0x10) | bVar24;
        bVar25 = (byte)(uVar89 >> 0x18) | bVar25;
        bVar26 = (byte)(uVar89 >> 0x20) | bVar26;
        bVar27 = (byte)(uVar89 >> 0x28) | bVar27;
        bVar28 = (byte)(uVar89 >> 0x30) | bVar28;
        bVar29 = (byte)(uVar89 >> 0x38) | bVar29;
        bVar30 = (byte)uVar90 | bVar30;
        bVar31 = (byte)(uVar90 >> 8) | bVar31;
        bVar32 = (byte)(uVar90 >> 0x10) | bVar32;
        bVar33 = (byte)(uVar90 >> 0x18) | bVar33;
        bVar34 = (byte)(uVar90 >> 0x20) | bVar34;
        bVar35 = (byte)(uVar90 >> 0x28) | bVar35;
        bVar36 = (byte)(uVar90 >> 0x30) | bVar36;
        bVar37 = (byte)(uVar90 >> 0x38) | bVar37;
        bVar38 = (byte)uVar91 | bVar38;
        bVar39 = (byte)(uVar91 >> 8) | bVar39;
        bVar40 = (byte)(uVar91 >> 0x10) | bVar40;
        bVar41 = (byte)(uVar91 >> 0x18) | bVar41;
        bVar42 = (byte)(uVar91 >> 0x20) | bVar42;
        bVar43 = (byte)(uVar91 >> 0x28) | bVar43;
        bVar44 = (byte)(uVar91 >> 0x30) | bVar44;
        bVar45 = (byte)(uVar91 >> 0x38) | bVar45;
        bVar46 = (byte)uVar92 | bVar46;
        bVar47 = (byte)(uVar92 >> 8) | bVar47;
        bVar48 = (byte)(uVar92 >> 0x10) | bVar48;
        bVar49 = (byte)(uVar92 >> 0x18) | bVar49;
        bVar50 = (byte)(uVar92 >> 0x20) | bVar50;
        bVar51 = (byte)(uVar92 >> 0x28) | bVar51;
        bVar52 = (byte)(uVar92 >> 0x30) | bVar52;
        bVar53 = (byte)(uVar92 >> 0x38) | bVar53;
        bVar54 = (byte)uVar93 | (byte)uVar12;
        bVar55 = (byte)(uVar93 >> 8) | (byte)((ulong)uVar12 >> 8);
        bVar56 = (byte)(uVar93 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
        bVar57 = (byte)(uVar93 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
        bVar58 = (byte)(uVar93 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
        bVar59 = (byte)(uVar93 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
        bVar60 = (byte)(uVar93 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
        bVar61 = (byte)(uVar93 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
        uVar12 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(bVar57,
                                                  CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))));
        bVar62 = (byte)uVar94 | (byte)uVar63;
        bVar64 = (byte)(uVar94 >> 8) | (byte)((ulong)uVar63 >> 8);
        bVar65 = (byte)(uVar94 >> 0x10) | (byte)((ulong)uVar63 >> 0x10);
        bVar66 = (byte)(uVar94 >> 0x18) | (byte)((ulong)uVar63 >> 0x18);
        bVar67 = (byte)(uVar94 >> 0x20) | (byte)((ulong)uVar63 >> 0x20);
        bVar68 = (byte)(uVar94 >> 0x28) | (byte)((ulong)uVar63 >> 0x28);
        bVar69 = (byte)(uVar94 >> 0x30) | (byte)((ulong)uVar63 >> 0x30);
        bVar70 = (byte)(uVar94 >> 0x38) | (byte)((ulong)uVar63 >> 0x38);
        uVar63 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66,
                                                  CONCAT12(bVar65,CONCAT11(bVar64,bVar62)))))));
        bVar71 = (byte)uVar95 | (byte)uVar72;
        bVar73 = (byte)(uVar95 >> 8) | (byte)((ulong)uVar72 >> 8);
        bVar74 = (byte)(uVar95 >> 0x10) | (byte)((ulong)uVar72 >> 0x10);
        bVar75 = (byte)(uVar95 >> 0x18) | (byte)((ulong)uVar72 >> 0x18);
        bVar76 = (byte)(uVar95 >> 0x20) | (byte)((ulong)uVar72 >> 0x20);
        bVar77 = (byte)(uVar95 >> 0x28) | (byte)((ulong)uVar72 >> 0x28);
        bVar78 = (byte)(uVar95 >> 0x30) | (byte)((ulong)uVar72 >> 0x30);
        bVar79 = (byte)(uVar95 >> 0x38) | (byte)((ulong)uVar72 >> 0x38);
        uVar72 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(bVar75,
                                                  CONCAT12(bVar74,CONCAT11(bVar73,bVar71)))))));
        bVar80 = (byte)uVar96 | (byte)uVar81;
        bVar82 = (byte)(uVar96 >> 8) | (byte)((ulong)uVar81 >> 8);
        bVar83 = (byte)(uVar96 >> 0x10) | (byte)((ulong)uVar81 >> 0x10);
        bVar84 = (byte)(uVar96 >> 0x18) | (byte)((ulong)uVar81 >> 0x18);
        bVar85 = (byte)(uVar96 >> 0x20) | (byte)((ulong)uVar81 >> 0x20);
        bVar86 = (byte)(uVar96 >> 0x28) | (byte)((ulong)uVar81 >> 0x28);
        bVar87 = (byte)(uVar96 >> 0x30) | (byte)((ulong)uVar81 >> 0x30);
        bVar88 = (byte)(uVar96 >> 0x38) | (byte)((ulong)uVar81 >> 0x38);
        uVar81 = CONCAT17(bVar88,CONCAT16(bVar87,CONCAT15(bVar86,CONCAT14(bVar85,CONCAT13(bVar84,
                                                  CONCAT12(bVar83,CONCAT11(bVar82,bVar80)))))));
        uVar13 = uVar13 - 8;
        puVar15 = puVar15 + 8;
      } while (uVar13 != 0);
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
      auVar2[1] = bVar73;
      auVar2[0] = bVar71;
      auVar2[2] = bVar74;
      auVar2[3] = bVar75;
      auVar2[4] = bVar76;
      auVar2[5] = bVar77;
      auVar2[6] = bVar78;
      auVar2[7] = bVar79;
      auVar2[8] = bVar80;
      auVar2[9] = bVar82;
      auVar2[10] = bVar83;
      auVar2[0xb] = bVar84;
      auVar2[0xc] = bVar85;
      auVar2[0xd] = bVar86;
      auVar2[0xe] = bVar87;
      auVar2[0xf] = bVar88;
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
      auVar97 = NEON_ext(auVar2,auVar3,8,1);
      uVar13 = CONCAT17(bVar79 | auVar97[7],
                        CONCAT16(bVar78 | auVar97[6],
                                 CONCAT15(bVar77 | auVar97[5],
                                          CONCAT14(bVar76 | auVar97[4],
                                                   CONCAT13(bVar75 | auVar97[3],
                                                            CONCAT12(bVar74 | auVar97[2],
                                                                     CONCAT11(bVar73 | auVar97[1],
                                                                              bVar71 | auVar97[0])))
                                                  ))));
      if (uVar21 == uVar14) goto LAB_002af10c;
    }
    do {
      uVar13 = puVar18[uVar10] | uVar13;
      uVar10 = uVar10 + 1;
    } while (uVar11 != uVar10);
  }
LAB_002af10c:
  uVar8 = (uint)(*puVar18 >> 0x20);
  uVar16 = ~((int)((uint)(uVar13 - 1 >> 0x20) & ((uint)(uVar13 >> 0x20) ^ 0xffffffff) &
                  (((uint)(*puVar18 - param_3 >> 0x20) ^ uVar8 | uVar8 ^ uVar16) ^ uVar8)) >> 0x1f);
LAB_002af138:
  uVar8 = func_0x0029d99c(puVar18,uVar11,lVar17,uVar11);
  if ((uVar16 & uVar8 >> 0x1f) != 0) {
    *(undefined4 *)(puStack_78 + 2) = 0;
    *(int *)(puStack_78 + 1) = (int)lVar5 + (int)lVar19 + 1;
    return 1;
  }
  auVar97 = func_0x0079e1c0();
  uStack_88 = 0x2af174;
  puStack_90 = auStack_6 + -10;
  iVar9 = func_0x002ae678(&uStack_94,auVar97._0_8_,auVar97._8_8_,lVar17,0,uVar11);
  if (iVar9 == 0) {
    uStack_94 = 0xffffffff;
  }
  return (ulong)uStack_94;
}

