
ulong FUN_0029b8ec(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                  undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                  undefined1 param_7 [16])

{
  int iVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined8 uVar5;
  ulong *puVar6;
  ulong uVar7;
  long lVar8;
  long in_x9;
  long lVar9;
  long in_x10;
  ulong uVar10;
  ulong uVar11;
  long in_x11;
  long in_x12;
  ulong uVar12;
  undefined8 *in_x13;
  ulong uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  long in_x14;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  int unaff_w23;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
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
  undefined1 auVar33 [16];
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  undefined8 uVar58;
  byte bVar66;
  byte bVar74;
  undefined8 uVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar75;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  undefined8 uVar76;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  
  uVar87 = param_7._8_8_;
  uVar86 = param_7._0_8_;
  uVar85 = param_6._8_8_;
  uVar84 = param_6._0_8_;
  uVar76 = param_5._8_8_;
  uVar67 = param_5._0_8_;
  uVar58 = param_4._8_8_;
  uVar5 = param_4._0_8_;
  bVar48 = param_3[0xf];
  bVar47 = param_3[0xe];
  bVar46 = param_3[0xd];
  bVar45 = param_3[0xc];
  bVar44 = param_3[0xb];
  bVar43 = param_3[10];
  bVar42 = param_3[9];
  bVar41 = param_3[8];
  bVar40 = param_3[7];
  bVar39 = param_3[6];
  bVar38 = param_3[5];
  bVar37 = param_3[4];
  bVar36 = param_3[3];
  bVar35 = param_3[2];
  bVar34 = param_3[1];
  bVar32 = param_3[0];
  bVar31 = param_2[0xf];
  bVar30 = param_2[0xe];
  bVar29 = param_2[0xd];
  bVar28 = param_2[0xc];
  bVar27 = param_2[0xb];
  bVar26 = param_2[10];
  bVar25 = param_2[9];
  bVar24 = param_2[8];
  bVar23 = param_2[7];
  bVar22 = param_2[6];
  bVar21 = param_2[5];
  bVar20 = param_2[4];
  bVar19 = param_2[3];
  bVar18 = param_2[2];
  bVar17 = param_2[1];
  bVar16 = param_2[0];
  while( true ) {
    uVar89 = in_x13[1];
    uVar88 = *in_x13;
    uVar91 = in_x13[3];
    uVar90 = in_x13[2];
    bVar16 = (byte)uVar84 | bVar16;
    bVar17 = (byte)((ulong)uVar84 >> 8) | bVar17;
    bVar18 = (byte)((ulong)uVar84 >> 0x10) | bVar18;
    bVar19 = (byte)((ulong)uVar84 >> 0x18) | bVar19;
    bVar20 = (byte)((ulong)uVar84 >> 0x20) | bVar20;
    bVar21 = (byte)((ulong)uVar84 >> 0x28) | bVar21;
    bVar22 = (byte)((ulong)uVar84 >> 0x30) | bVar22;
    bVar23 = (byte)((ulong)uVar84 >> 0x38) | bVar23;
    bVar24 = (byte)uVar85 | bVar24;
    bVar25 = (byte)((ulong)uVar85 >> 8) | bVar25;
    bVar26 = (byte)((ulong)uVar85 >> 0x10) | bVar26;
    bVar27 = (byte)((ulong)uVar85 >> 0x18) | bVar27;
    bVar28 = (byte)((ulong)uVar85 >> 0x20) | bVar28;
    bVar29 = (byte)((ulong)uVar85 >> 0x28) | bVar29;
    bVar30 = (byte)((ulong)uVar85 >> 0x30) | bVar30;
    bVar31 = (byte)((ulong)uVar85 >> 0x38) | bVar31;
    bVar32 = (byte)uVar86 | bVar32;
    bVar34 = (byte)((ulong)uVar86 >> 8) | bVar34;
    bVar35 = (byte)((ulong)uVar86 >> 0x10) | bVar35;
    bVar36 = (byte)((ulong)uVar86 >> 0x18) | bVar36;
    bVar37 = (byte)((ulong)uVar86 >> 0x20) | bVar37;
    bVar38 = (byte)((ulong)uVar86 >> 0x28) | bVar38;
    bVar39 = (byte)((ulong)uVar86 >> 0x30) | bVar39;
    bVar40 = (byte)((ulong)uVar86 >> 0x38) | bVar40;
    bVar41 = (byte)uVar87 | bVar41;
    bVar42 = (byte)((ulong)uVar87 >> 8) | bVar42;
    bVar43 = (byte)((ulong)uVar87 >> 0x10) | bVar43;
    bVar44 = (byte)((ulong)uVar87 >> 0x18) | bVar44;
    bVar45 = (byte)((ulong)uVar87 >> 0x20) | bVar45;
    bVar46 = (byte)((ulong)uVar87 >> 0x28) | bVar46;
    bVar47 = (byte)((ulong)uVar87 >> 0x30) | bVar47;
    bVar48 = (byte)((ulong)uVar87 >> 0x38) | bVar48;
    bVar49 = (byte)uVar88 | (byte)uVar5;
    bVar50 = (byte)((ulong)uVar88 >> 8) | (byte)((ulong)uVar5 >> 8);
    bVar51 = (byte)((ulong)uVar88 >> 0x10) | (byte)((ulong)uVar5 >> 0x10);
    bVar52 = (byte)((ulong)uVar88 >> 0x18) | (byte)((ulong)uVar5 >> 0x18);
    bVar53 = (byte)((ulong)uVar88 >> 0x20) | (byte)((ulong)uVar5 >> 0x20);
    bVar54 = (byte)((ulong)uVar88 >> 0x28) | (byte)((ulong)uVar5 >> 0x28);
    bVar55 = (byte)((ulong)uVar88 >> 0x30) | (byte)((ulong)uVar5 >> 0x30);
    bVar56 = (byte)((ulong)uVar88 >> 0x38) | (byte)((ulong)uVar5 >> 0x38);
    uVar5 = CONCAT17(bVar56,CONCAT16(bVar55,CONCAT15(bVar54,CONCAT14(bVar53,CONCAT13(bVar52,CONCAT12
                                                  (bVar51,CONCAT11(bVar50,bVar49)))))));
    bVar57 = (byte)uVar89 | (byte)uVar58;
    bVar59 = (byte)((ulong)uVar89 >> 8) | (byte)((ulong)uVar58 >> 8);
    bVar60 = (byte)((ulong)uVar89 >> 0x10) | (byte)((ulong)uVar58 >> 0x10);
    bVar61 = (byte)((ulong)uVar89 >> 0x18) | (byte)((ulong)uVar58 >> 0x18);
    bVar62 = (byte)((ulong)uVar89 >> 0x20) | (byte)((ulong)uVar58 >> 0x20);
    bVar63 = (byte)((ulong)uVar89 >> 0x28) | (byte)((ulong)uVar58 >> 0x28);
    bVar64 = (byte)((ulong)uVar89 >> 0x30) | (byte)((ulong)uVar58 >> 0x30);
    bVar65 = (byte)((ulong)uVar89 >> 0x38) | (byte)((ulong)uVar58 >> 0x38);
    uVar58 = CONCAT17(bVar65,CONCAT16(bVar64,CONCAT15(bVar63,CONCAT14(bVar62,CONCAT13(bVar61,
                                                  CONCAT12(bVar60,CONCAT11(bVar59,bVar57)))))));
    bVar66 = (byte)uVar90 | (byte)uVar67;
    bVar68 = (byte)((ulong)uVar90 >> 8) | (byte)((ulong)uVar67 >> 8);
    bVar69 = (byte)((ulong)uVar90 >> 0x10) | (byte)((ulong)uVar67 >> 0x10);
    bVar70 = (byte)((ulong)uVar90 >> 0x18) | (byte)((ulong)uVar67 >> 0x18);
    bVar71 = (byte)((ulong)uVar90 >> 0x20) | (byte)((ulong)uVar67 >> 0x20);
    bVar72 = (byte)((ulong)uVar90 >> 0x28) | (byte)((ulong)uVar67 >> 0x28);
    bVar73 = (byte)((ulong)uVar90 >> 0x30) | (byte)((ulong)uVar67 >> 0x30);
    bVar74 = (byte)((ulong)uVar90 >> 0x38) | (byte)((ulong)uVar67 >> 0x38);
    uVar67 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar66)))))));
    bVar75 = (byte)uVar91 | (byte)uVar76;
    bVar77 = (byte)((ulong)uVar91 >> 8) | (byte)((ulong)uVar76 >> 8);
    bVar78 = (byte)((ulong)uVar91 >> 0x10) | (byte)((ulong)uVar76 >> 0x10);
    bVar79 = (byte)((ulong)uVar91 >> 0x18) | (byte)((ulong)uVar76 >> 0x18);
    bVar80 = (byte)((ulong)uVar91 >> 0x20) | (byte)((ulong)uVar76 >> 0x20);
    bVar81 = (byte)((ulong)uVar91 >> 0x28) | (byte)((ulong)uVar76 >> 0x28);
    bVar82 = (byte)((ulong)uVar91 >> 0x30) | (byte)((ulong)uVar76 >> 0x30);
    bVar83 = (byte)((ulong)uVar91 >> 0x38) | (byte)((ulong)uVar76 >> 0x38);
    uVar76 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79,
                                                  CONCAT12(bVar78,CONCAT11(bVar77,bVar75)))))));
    in_x14 = in_x14 + -8;
    if (in_x14 == 0) break;
    uVar85 = in_x13[5];
    uVar84 = in_x13[4];
    uVar87 = in_x13[7];
    uVar86 = in_x13[6];
    in_x13 = in_x13 + 8;
  }
  bVar66 = bVar66 | bVar49 | bVar32 | bVar16;
  bVar68 = bVar68 | bVar50 | bVar34 | bVar17;
  bVar69 = bVar69 | bVar51 | bVar35 | bVar18;
  bVar70 = bVar70 | bVar52 | bVar36 | bVar19;
  bVar71 = bVar71 | bVar53 | bVar37 | bVar20;
  bVar72 = bVar72 | bVar54 | bVar38 | bVar21;
  bVar73 = bVar73 | bVar55 | bVar39 | bVar22;
  bVar74 = bVar74 | bVar56 | bVar40 | bVar23;
  bVar75 = bVar75 | bVar57 | bVar41 | bVar24;
  bVar77 = bVar77 | bVar59 | bVar42 | bVar25;
  bVar78 = bVar78 | bVar60 | bVar43 | bVar26;
  bVar79 = bVar79 | bVar61 | bVar44 | bVar27;
  bVar80 = bVar80 | bVar62 | bVar45 | bVar28;
  bVar81 = bVar81 | bVar63 | bVar46 | bVar29;
  bVar82 = bVar82 | bVar64 | bVar47 | bVar30;
  bVar83 = bVar83 | bVar65 | bVar48 | bVar31;
  auVar33[1] = bVar68;
  auVar33[0] = bVar66;
  auVar33[2] = bVar69;
  auVar33[3] = bVar70;
  auVar33[4] = bVar71;
  auVar33[5] = bVar72;
  auVar33[6] = bVar73;
  auVar33[7] = bVar74;
  auVar33[8] = bVar75;
  auVar33[9] = bVar77;
  auVar33[10] = bVar78;
  auVar33[0xb] = bVar79;
  auVar33[0xc] = bVar80;
  auVar33[0xd] = bVar81;
  auVar33[0xe] = bVar82;
  auVar33[0xf] = bVar83;
  auVar2[1] = bVar68;
  auVar2[0] = bVar66;
  auVar2[2] = bVar69;
  auVar2[3] = bVar70;
  auVar2[4] = bVar71;
  auVar2[5] = bVar72;
  auVar2[6] = bVar73;
  auVar2[7] = bVar74;
  auVar2[8] = bVar75;
  auVar2[9] = bVar77;
  auVar2[10] = bVar78;
  auVar2[0xb] = bVar79;
  auVar2[0xc] = bVar80;
  auVar2[0xd] = bVar81;
  auVar2[0xe] = bVar82;
  auVar2[0xf] = bVar83;
  auVar33 = NEON_ext(auVar33,auVar2,8,1);
  uVar13 = CONCAT17(bVar74 | auVar33[7],
                    CONCAT16(bVar73 | auVar33[6],
                             CONCAT15(bVar72 | auVar33[5],
                                      CONCAT14(bVar71 | auVar33[4],
                                               CONCAT13(bVar70 | auVar33[3],
                                                        CONCAT12(bVar69 | auVar33[2],
                                                                 CONCAT11(bVar68 | auVar33[1],
                                                                          bVar66 | auVar33[0])))))))
  ;
  if (in_x11 != in_x12) {
    lVar9 = in_x9 - in_x10;
    puVar6 = (ulong *)(param_1 + in_x10 * 8);
    do {
      uVar13 = *puVar6 | uVar13;
      lVar9 = lVar9 + -1;
      puVar6 = puVar6 + 1;
    } while (lVar9 != 0);
  }
  if (uVar13 == 0) {
    uVar13 = func_0x0029afb8();
    if ((int)uVar13 == 0) {
      return uVar13;
    }
    lVar9 = (long)unaff_w23;
    uVar13 = func_0x00382cc0(*unaff_x19,*unaff_x20,*unaff_x21,lVar9);
    iVar1 = (int)unaff_x20[1];
    if (unaff_w23 < iVar1) {
      do {
        if (1 < uVar13) {
          auVar33 = func_0x0079da1c();
          uVar10 = auVar33._8_8_;
          uVar7 = (ulong)(int)auVar33._0_8_[1];
          uVar13 = uVar7 - uVar10;
          if (uVar7 < uVar10 || uVar13 == 0) {
            return 1;
          }
          lVar9 = *auVar33._0_8_;
          if (uVar13 < 8) {
            uVar14 = 0;
            uVar11 = uVar10;
            goto code_r0x0029bab0;
          }
          uVar12 = uVar13 & 0xfffffffffffffff8;
          uVar11 = uVar12 + uVar10;
          bVar16 = 0;
          bVar17 = 0;
          bVar18 = 0;
          bVar19 = 0;
          bVar20 = 0;
          bVar21 = 0;
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
          uVar5 = 0;
          uVar58 = 0;
          uVar67 = 0;
          uVar76 = 0;
          puVar15 = (undefined8 *)(lVar9 + uVar10 * 8 + 0x20);
          uVar10 = uVar12;
          do {
            uVar85 = puVar15[-3];
            uVar84 = puVar15[-4];
            uVar87 = puVar15[-1];
            uVar86 = puVar15[-2];
            uVar89 = puVar15[1];
            uVar88 = *puVar15;
            uVar91 = puVar15[3];
            uVar90 = puVar15[2];
            bVar16 = (byte)uVar84 | bVar16;
            bVar17 = (byte)((ulong)uVar84 >> 8) | bVar17;
            bVar18 = (byte)((ulong)uVar84 >> 0x10) | bVar18;
            bVar19 = (byte)((ulong)uVar84 >> 0x18) | bVar19;
            bVar20 = (byte)((ulong)uVar84 >> 0x20) | bVar20;
            bVar21 = (byte)((ulong)uVar84 >> 0x28) | bVar21;
            bVar22 = (byte)((ulong)uVar84 >> 0x30) | bVar22;
            bVar23 = (byte)((ulong)uVar84 >> 0x38) | bVar23;
            bVar24 = (byte)uVar85 | bVar24;
            bVar25 = (byte)((ulong)uVar85 >> 8) | bVar25;
            bVar26 = (byte)((ulong)uVar85 >> 0x10) | bVar26;
            bVar27 = (byte)((ulong)uVar85 >> 0x18) | bVar27;
            bVar28 = (byte)((ulong)uVar85 >> 0x20) | bVar28;
            bVar29 = (byte)((ulong)uVar85 >> 0x28) | bVar29;
            bVar30 = (byte)((ulong)uVar85 >> 0x30) | bVar30;
            bVar31 = (byte)((ulong)uVar85 >> 0x38) | bVar31;
            bVar32 = (byte)uVar86 | bVar32;
            bVar34 = (byte)((ulong)uVar86 >> 8) | bVar34;
            bVar35 = (byte)((ulong)uVar86 >> 0x10) | bVar35;
            bVar36 = (byte)((ulong)uVar86 >> 0x18) | bVar36;
            bVar37 = (byte)((ulong)uVar86 >> 0x20) | bVar37;
            bVar38 = (byte)((ulong)uVar86 >> 0x28) | bVar38;
            bVar39 = (byte)((ulong)uVar86 >> 0x30) | bVar39;
            bVar40 = (byte)((ulong)uVar86 >> 0x38) | bVar40;
            bVar41 = (byte)uVar87 | bVar41;
            bVar42 = (byte)((ulong)uVar87 >> 8) | bVar42;
            bVar43 = (byte)((ulong)uVar87 >> 0x10) | bVar43;
            bVar44 = (byte)((ulong)uVar87 >> 0x18) | bVar44;
            bVar45 = (byte)((ulong)uVar87 >> 0x20) | bVar45;
            bVar46 = (byte)((ulong)uVar87 >> 0x28) | bVar46;
            bVar47 = (byte)((ulong)uVar87 >> 0x30) | bVar47;
            bVar48 = (byte)((ulong)uVar87 >> 0x38) | bVar48;
            bVar49 = (byte)uVar88 | (byte)uVar5;
            bVar50 = (byte)((ulong)uVar88 >> 8) | (byte)((ulong)uVar5 >> 8);
            bVar51 = (byte)((ulong)uVar88 >> 0x10) | (byte)((ulong)uVar5 >> 0x10);
            bVar52 = (byte)((ulong)uVar88 >> 0x18) | (byte)((ulong)uVar5 >> 0x18);
            bVar53 = (byte)((ulong)uVar88 >> 0x20) | (byte)((ulong)uVar5 >> 0x20);
            bVar54 = (byte)((ulong)uVar88 >> 0x28) | (byte)((ulong)uVar5 >> 0x28);
            bVar55 = (byte)((ulong)uVar88 >> 0x30) | (byte)((ulong)uVar5 >> 0x30);
            bVar56 = (byte)((ulong)uVar88 >> 0x38) | (byte)((ulong)uVar5 >> 0x38);
            uVar5 = CONCAT17(bVar56,CONCAT16(bVar55,CONCAT15(bVar54,CONCAT14(bVar53,CONCAT13(bVar52,
                                                  CONCAT12(bVar51,CONCAT11(bVar50,bVar49)))))));
            bVar57 = (byte)uVar89 | (byte)uVar58;
            bVar59 = (byte)((ulong)uVar89 >> 8) | (byte)((ulong)uVar58 >> 8);
            bVar60 = (byte)((ulong)uVar89 >> 0x10) | (byte)((ulong)uVar58 >> 0x10);
            bVar61 = (byte)((ulong)uVar89 >> 0x18) | (byte)((ulong)uVar58 >> 0x18);
            bVar62 = (byte)((ulong)uVar89 >> 0x20) | (byte)((ulong)uVar58 >> 0x20);
            bVar63 = (byte)((ulong)uVar89 >> 0x28) | (byte)((ulong)uVar58 >> 0x28);
            bVar64 = (byte)((ulong)uVar89 >> 0x30) | (byte)((ulong)uVar58 >> 0x30);
            bVar65 = (byte)((ulong)uVar89 >> 0x38) | (byte)((ulong)uVar58 >> 0x38);
            uVar58 = CONCAT17(bVar65,CONCAT16(bVar64,CONCAT15(bVar63,CONCAT14(bVar62,CONCAT13(bVar61
                                                  ,CONCAT12(bVar60,CONCAT11(bVar59,bVar57)))))));
            bVar66 = (byte)uVar90 | (byte)uVar67;
            bVar68 = (byte)((ulong)uVar90 >> 8) | (byte)((ulong)uVar67 >> 8);
            bVar69 = (byte)((ulong)uVar90 >> 0x10) | (byte)((ulong)uVar67 >> 0x10);
            bVar70 = (byte)((ulong)uVar90 >> 0x18) | (byte)((ulong)uVar67 >> 0x18);
            bVar71 = (byte)((ulong)uVar90 >> 0x20) | (byte)((ulong)uVar67 >> 0x20);
            bVar72 = (byte)((ulong)uVar90 >> 0x28) | (byte)((ulong)uVar67 >> 0x28);
            bVar73 = (byte)((ulong)uVar90 >> 0x30) | (byte)((ulong)uVar67 >> 0x30);
            bVar74 = (byte)((ulong)uVar90 >> 0x38) | (byte)((ulong)uVar67 >> 0x38);
            uVar67 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70
                                                  ,CONCAT12(bVar69,CONCAT11(bVar68,bVar66)))))));
            bVar75 = (byte)uVar91 | (byte)uVar76;
            bVar77 = (byte)((ulong)uVar91 >> 8) | (byte)((ulong)uVar76 >> 8);
            bVar78 = (byte)((ulong)uVar91 >> 0x10) | (byte)((ulong)uVar76 >> 0x10);
            bVar79 = (byte)((ulong)uVar91 >> 0x18) | (byte)((ulong)uVar76 >> 0x18);
            bVar80 = (byte)((ulong)uVar91 >> 0x20) | (byte)((ulong)uVar76 >> 0x20);
            bVar81 = (byte)((ulong)uVar91 >> 0x28) | (byte)((ulong)uVar76 >> 0x28);
            bVar82 = (byte)((ulong)uVar91 >> 0x30) | (byte)((ulong)uVar76 >> 0x30);
            bVar83 = (byte)((ulong)uVar91 >> 0x38) | (byte)((ulong)uVar76 >> 0x38);
            uVar76 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79
                                                  ,CONCAT12(bVar78,CONCAT11(bVar77,bVar75)))))));
            uVar10 = uVar10 - 8;
            puVar15 = puVar15 + 8;
          } while (uVar10 != 0);
          bVar66 = bVar66 | bVar49 | bVar32 | bVar16;
          bVar68 = bVar68 | bVar50 | bVar34 | bVar17;
          bVar69 = bVar69 | bVar51 | bVar35 | bVar18;
          bVar70 = bVar70 | bVar52 | bVar36 | bVar19;
          bVar71 = bVar71 | bVar53 | bVar37 | bVar20;
          bVar72 = bVar72 | bVar54 | bVar38 | bVar21;
          bVar73 = bVar73 | bVar55 | bVar39 | bVar22;
          bVar74 = bVar74 | bVar56 | bVar40 | bVar23;
          bVar75 = bVar75 | bVar57 | bVar41 | bVar24;
          bVar77 = bVar77 | bVar59 | bVar42 | bVar25;
          bVar78 = bVar78 | bVar60 | bVar43 | bVar26;
          bVar79 = bVar79 | bVar61 | bVar44 | bVar27;
          bVar80 = bVar80 | bVar62 | bVar45 | bVar28;
          bVar81 = bVar81 | bVar63 | bVar46 | bVar29;
          bVar82 = bVar82 | bVar64 | bVar47 | bVar30;
          bVar83 = bVar83 | bVar65 | bVar48 | bVar31;
          auVar3[1] = bVar68;
          auVar3[0] = bVar66;
          auVar3[2] = bVar69;
          auVar3[3] = bVar70;
          auVar3[4] = bVar71;
          auVar3[5] = bVar72;
          auVar3[6] = bVar73;
          auVar3[7] = bVar74;
          auVar3[8] = bVar75;
          auVar3[9] = bVar77;
          auVar3[10] = bVar78;
          auVar3[0xb] = bVar79;
          auVar3[0xc] = bVar80;
          auVar3[0xd] = bVar81;
          auVar3[0xe] = bVar82;
          auVar3[0xf] = bVar83;
          auVar4[1] = bVar68;
          auVar4[0] = bVar66;
          auVar4[2] = bVar69;
          auVar4[3] = bVar70;
          auVar4[4] = bVar71;
          auVar4[5] = bVar72;
          auVar4[6] = bVar73;
          auVar4[7] = bVar74;
          auVar4[8] = bVar75;
          auVar4[9] = bVar77;
          auVar4[10] = bVar78;
          auVar4[0xb] = bVar79;
          auVar4[0xc] = bVar80;
          auVar4[0xd] = bVar81;
          auVar4[0xe] = bVar82;
          auVar4[0xf] = bVar83;
          auVar33 = NEON_ext(auVar3,auVar4,8,1);
          uVar14 = CONCAT17(bVar74 | auVar33[7],
                            CONCAT16(bVar73 | auVar33[6],
                                     CONCAT15(bVar72 | auVar33[5],
                                              CONCAT14(bVar71 | auVar33[4],
                                                       CONCAT13(bVar70 | auVar33[3],
                                                                CONCAT12(bVar69 | auVar33[2],
                                                                         CONCAT11(bVar68 | auVar33[1
                                                  ],bVar66 | auVar33[0])))))));
          if (uVar13 != uVar12) {
code_r0x0029bab0:
            lVar8 = uVar7 - uVar11;
            puVar6 = (ulong *)(lVar9 + uVar11 * 8);
            do {
              uVar14 = *puVar6 | uVar14;
              lVar8 = lVar8 + -1;
              puVar6 = puVar6 + 1;
            } while (lVar8 != 0);
          }
          return (ulong)(uVar14 == 0);
        }
        uVar10 = *(ulong *)(*unaff_x20 + lVar9 * 8);
        lVar8 = uVar10 - uVar13;
        uVar13 = (ulong)(uVar10 < uVar13);
        *(long *)(*unaff_x19 + lVar9 * 8) = lVar8;
        lVar9 = lVar9 + 1;
      } while (iVar1 != lVar9);
    }
    if (uVar13 == 0) {
      *(int *)(unaff_x19 + 1) = iVar1;
      *(undefined4 *)(unaff_x19 + 2) = 0;
      return 1;
    }
    uVar5 = 0xf5;
  }
  else {
    uVar5 = 0xe5;
  }
  func_0x0028f83c(3,0,100,"/aws-lc/crypto/fipsmodule/bn/add.c",uVar5);
  return 0;
}

