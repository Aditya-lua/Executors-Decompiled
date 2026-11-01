
void FUN_002c9154(ulong param_1,undefined1 param_2 [16])

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  unkbyte9 Var3;
  unkbyte9 Var4;
  bool bVar5;
  ulong extraout_x8;
  undefined8 uVar6;
  ulong in_x9;
  ulong extraout_x9;
  ulong in_x10;
  undefined8 *puVar7;
  ulong uVar8;
  byte *pbVar9;
  undefined1 *puVar10;
  uint uVar11;
  undefined8 *in_x11;
  ulong uVar12;
  long lVar13;
  undefined8 *puVar14;
  long in_x12;
  undefined1 *puVar15;
  unkbyte9 *pVar16;
  ulong uVar17;
  long *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x29;
  byte bVar18;
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
  byte bVar33;
  byte bVar34;
  undefined1 auVar19 [16];
  byte bVar35;
  undefined8 uVar36;
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
  undefined1 auVar37 [16];
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
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined1 uStack0000000000000006;
  undefined8 auStack_1a [3];
  
  bVar34 = param_2[0xf];
  bVar33 = param_2[0xe];
  bVar32 = param_2[0xd];
  bVar31 = param_2[0xc];
  bVar30 = param_2[0xb];
  bVar29 = param_2[10];
  bVar28 = param_2[9];
  bVar27 = param_2[8];
  bVar26 = param_2[7];
  bVar25 = param_2[6];
  bVar24 = param_2[5];
  bVar23 = param_2[4];
  bVar22 = param_2[3];
  bVar21 = param_2[2];
  bVar20 = param_2[1];
  bVar18 = param_2[0];
  bVar35 = 0;
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
  do {
    uVar85 = in_x11[-3];
    uVar36 = in_x11[-4];
    uVar87 = in_x11[-1];
    uVar86 = in_x11[-2];
    uVar6 = in_x11[1];
    uVar88 = *in_x11;
    uVar90 = in_x11[3];
    uVar89 = in_x11[2];
    bVar18 = (byte)uVar36 | bVar18;
    bVar20 = (byte)((ulong)uVar36 >> 8) | bVar20;
    bVar21 = (byte)((ulong)uVar36 >> 0x10) | bVar21;
    bVar22 = (byte)((ulong)uVar36 >> 0x18) | bVar22;
    bVar23 = (byte)((ulong)uVar36 >> 0x20) | bVar23;
    bVar24 = (byte)((ulong)uVar36 >> 0x28) | bVar24;
    bVar25 = (byte)((ulong)uVar36 >> 0x30) | bVar25;
    bVar26 = (byte)((ulong)uVar36 >> 0x38) | bVar26;
    bVar27 = (byte)uVar85 | bVar27;
    bVar28 = (byte)((ulong)uVar85 >> 8) | bVar28;
    bVar29 = (byte)((ulong)uVar85 >> 0x10) | bVar29;
    bVar30 = (byte)((ulong)uVar85 >> 0x18) | bVar30;
    bVar31 = (byte)((ulong)uVar85 >> 0x20) | bVar31;
    bVar32 = (byte)((ulong)uVar85 >> 0x28) | bVar32;
    bVar33 = (byte)((ulong)uVar85 >> 0x30) | bVar33;
    bVar34 = (byte)((ulong)uVar85 >> 0x38) | bVar34;
    bVar35 = (byte)uVar86 | bVar35;
    bVar38 = (byte)((ulong)uVar86 >> 8) | bVar38;
    bVar39 = (byte)((ulong)uVar86 >> 0x10) | bVar39;
    bVar40 = (byte)((ulong)uVar86 >> 0x18) | bVar40;
    bVar41 = (byte)((ulong)uVar86 >> 0x20) | bVar41;
    bVar42 = (byte)((ulong)uVar86 >> 0x28) | bVar42;
    bVar43 = (byte)((ulong)uVar86 >> 0x30) | bVar43;
    bVar44 = (byte)((ulong)uVar86 >> 0x38) | bVar44;
    bVar45 = (byte)uVar87 | bVar45;
    bVar46 = (byte)((ulong)uVar87 >> 8) | bVar46;
    bVar47 = (byte)((ulong)uVar87 >> 0x10) | bVar47;
    bVar48 = (byte)((ulong)uVar87 >> 0x18) | bVar48;
    bVar49 = (byte)((ulong)uVar87 >> 0x20) | bVar49;
    bVar50 = (byte)((ulong)uVar87 >> 0x28) | bVar50;
    bVar51 = (byte)((ulong)uVar87 >> 0x30) | bVar51;
    bVar52 = (byte)((ulong)uVar87 >> 0x38) | bVar52;
    bVar53 = (byte)uVar88 | bVar53;
    bVar54 = (byte)((ulong)uVar88 >> 8) | bVar54;
    bVar55 = (byte)((ulong)uVar88 >> 0x10) | bVar55;
    bVar56 = (byte)((ulong)uVar88 >> 0x18) | bVar56;
    bVar57 = (byte)((ulong)uVar88 >> 0x20) | bVar57;
    bVar58 = (byte)((ulong)uVar88 >> 0x28) | bVar58;
    bVar59 = (byte)((ulong)uVar88 >> 0x30) | bVar59;
    bVar60 = (byte)((ulong)uVar88 >> 0x38) | bVar60;
    bVar61 = (byte)uVar6 | bVar61;
    bVar62 = (byte)((ulong)uVar6 >> 8) | bVar62;
    bVar63 = (byte)((ulong)uVar6 >> 0x10) | bVar63;
    bVar64 = (byte)((ulong)uVar6 >> 0x18) | bVar64;
    bVar65 = (byte)((ulong)uVar6 >> 0x20) | bVar65;
    bVar66 = (byte)((ulong)uVar6 >> 0x28) | bVar66;
    bVar67 = (byte)((ulong)uVar6 >> 0x30) | bVar67;
    bVar68 = (byte)((ulong)uVar6 >> 0x38) | bVar68;
    bVar69 = (byte)uVar89 | bVar69;
    bVar70 = (byte)((ulong)uVar89 >> 8) | bVar70;
    bVar71 = (byte)((ulong)uVar89 >> 0x10) | bVar71;
    bVar72 = (byte)((ulong)uVar89 >> 0x18) | bVar72;
    bVar73 = (byte)((ulong)uVar89 >> 0x20) | bVar73;
    bVar74 = (byte)((ulong)uVar89 >> 0x28) | bVar74;
    bVar75 = (byte)((ulong)uVar89 >> 0x30) | bVar75;
    bVar76 = (byte)((ulong)uVar89 >> 0x38) | bVar76;
    bVar77 = (byte)uVar90 | bVar77;
    bVar78 = (byte)((ulong)uVar90 >> 8) | bVar78;
    bVar79 = (byte)((ulong)uVar90 >> 0x10) | bVar79;
    bVar80 = (byte)((ulong)uVar90 >> 0x18) | bVar80;
    bVar81 = (byte)((ulong)uVar90 >> 0x20) | bVar81;
    bVar82 = (byte)((ulong)uVar90 >> 0x28) | bVar82;
    bVar83 = (byte)((ulong)uVar90 >> 0x30) | bVar83;
    bVar84 = (byte)((ulong)uVar90 >> 0x38) | bVar84;
    in_x12 = in_x12 + -0x40;
    in_x11 = in_x11 + 8;
  } while (in_x12 != 0);
  auVar19[0] = bVar69 | bVar53 | bVar35 | bVar18;
  auVar19[1] = bVar70 | bVar54 | bVar38 | bVar20;
  auVar19[2] = bVar71 | bVar55 | bVar39 | bVar21;
  auVar19[3] = bVar72 | bVar56 | bVar40 | bVar22;
  auVar19[4] = bVar73 | bVar57 | bVar41 | bVar23;
  auVar19[5] = bVar74 | bVar58 | bVar42 | bVar24;
  auVar19[6] = bVar75 | bVar59 | bVar43 | bVar25;
  auVar19[7] = bVar76 | bVar60 | bVar44 | bVar26;
  auVar19[8] = bVar77 | bVar61 | bVar45 | bVar27;
  auVar19[9] = bVar78 | bVar62 | bVar46 | bVar28;
  auVar19[10] = bVar79 | bVar63 | bVar47 | bVar29;
  auVar19[0xb] = bVar80 | bVar64 | bVar48 | bVar30;
  auVar19[0xc] = bVar81 | bVar65 | bVar49 | bVar31;
  auVar19[0xd] = bVar82 | bVar66 | bVar50 | bVar32;
  auVar19[0xe] = bVar83 | bVar67 | bVar51 | bVar33;
  auVar19[0xf] = bVar84 | bVar68 | bVar52 | bVar34;
  auVar37 = NEON_ext(auVar19,auVar19,8,1);
  uVar12 = CONCAT17(auVar19[7] | auVar37[7],
                    CONCAT16(auVar19[6] | auVar37[6],
                             CONCAT15(auVar19[5] | auVar37[5],
                                      CONCAT14(auVar19[4] | auVar37[4],
                                               CONCAT13(auVar19[3] | auVar37[3],
                                                        CONCAT12(auVar19[2] | auVar37[2],
                                                                 CONCAT11(auVar19[1] | auVar37[1],
                                                                          auVar19[0] | auVar37[0])))
                                              ))));
  uVar12 = uVar12 | uVar12 >> 0x20;
  uVar12 = uVar12 | uVar12 >> 0x10;
  uVar11 = (uint)uVar12 | (uint)(uVar12 >> 8);
  if (in_x9 != in_x10) {
    if ((in_x9 & 0x38) != 0) {
      uVar12 = in_x9 & 0xfffffffffffffff8;
      auVar37._1_15_ = SUB1615(ZEXT816(0),1);
      auVar37[0] = (char)uVar11;
      lVar13 = in_x10 - uVar12;
      puVar7 = (undefined8 *)(unaff_x22 + unaff_x21 + in_x10);
      do {
        uVar36 = *puVar7;
        auVar37._0_8_ =
             CONCAT17((byte)((ulong)uVar36 >> 0x38) | auVar37[7],
                      CONCAT16((byte)((ulong)uVar36 >> 0x30) | auVar37[6],
                               CONCAT15((byte)((ulong)uVar36 >> 0x28) | auVar37[5],
                                        CONCAT14((byte)((ulong)uVar36 >> 0x20) | auVar37[4],
                                                 CONCAT13((byte)((ulong)uVar36 >> 0x18) | auVar37[3]
                                                          ,CONCAT12((byte)((ulong)uVar36 >> 0x10) |
                                                                    auVar37[2],
                                                                    CONCAT11((byte)((ulong)uVar36 >>
                                                                                   8) | auVar37[1],
                                                                             (byte)uVar36 |
                                                                             auVar37[0])))))));
        auVar37._8_8_ = 0;
        lVar13 = lVar13 + 8;
        puVar7 = puVar7 + 1;
      } while (lVar13 != 0);
      uVar8 = auVar37._0_8_ | auVar37._0_8_ >> 0x20;
      uVar8 = uVar8 | uVar8 >> 0x10;
      uVar11 = (uint)uVar8 | (uint)(uVar8 >> 8);
      in_x10 = uVar12;
      if (in_x9 == uVar12) goto LAB_002c9224;
    }
    lVar13 = (unaff_x21 + in_x10) - param_1;
    pbVar9 = (byte *)(unaff_x22 + unaff_x21 + in_x10);
    do {
      uVar11 = *pbVar9 | uVar11;
      bVar5 = lVar13 != -1;
      lVar13 = lVar13 + 1;
      pbVar9 = pbVar9 + 1;
    } while (bVar5);
  }
LAB_002c9224:
  if ((uVar11 & 0xff) != 0) {
    auVar19 = func_0x0079dae0();
    puVar7 = auVar19._8_8_;
    lVar13 = auVar19._0_8_;
    if (*(int *)(lVar13 + 0x214) == 0) {
      puVar7[8] = 0;
      puVar7[5] = 0;
      puVar7[4] = 0;
      puVar7[7] = 0;
      puVar7[6] = 0;
      puVar7[1] = 0;
      *puVar7 = 0;
      puVar7[3] = 0;
      puVar7[2] = 0;
      puVar7[10] = 0;
      puVar7[9] = 0;
      puVar7[0xc] = 0;
      puVar7[0xb] = 0;
      puVar7[0xe] = 0;
      puVar7[0xd] = 0;
      puVar7[0x10] = 0;
      puVar7[0xf] = 0;
      puVar7[0x11] = 0;
      puVar7[0x13] = 0;
      puVar7[0x12] = 0;
      puVar7[0x15] = 0;
      puVar7[0x14] = 0;
      puVar7[0x17] = 0;
      puVar7[0x16] = 0;
      puVar7[0x19] = 0;
      puVar7[0x18] = 0;
      puVar7[0x1a] = 0;
      return;
    }
    uVar36 = *(undefined8 *)(lVar13 + 0x10);
    puVar7[1] = *(undefined8 *)(lVar13 + 0x18);
    *puVar7 = uVar36;
    uVar86 = *(undefined8 *)(lVar13 + 0x20);
    uVar87 = *(undefined8 *)(lVar13 + 0x28);
    uVar88 = *(undefined8 *)(lVar13 + 0x30);
    uVar6 = *(undefined8 *)(lVar13 + 0x38);
    uVar85 = *(undefined8 *)(lVar13 + 0x48);
    uVar36 = *(undefined8 *)(lVar13 + 0x40);
    puVar7[8] = *(undefined8 *)(lVar13 + 0x50);
    puVar7[5] = uVar6;
    puVar7[4] = uVar88;
    puVar7[7] = uVar85;
    puVar7[6] = uVar36;
    puVar7[3] = uVar87;
    puVar7[2] = uVar86;
    uVar85 = *(undefined8 *)(lVar13 + 0x78);
    uVar86 = *(undefined8 *)(lVar13 + 0x80);
    uVar87 = *(undefined8 *)(lVar13 + 0x88);
    uVar88 = *(undefined8 *)(lVar13 + 0x90);
    uVar6 = *(undefined8 *)(lVar13 + 0x98);
    uVar36 = *(undefined8 *)(lVar13 + 0x68);
    puVar7[0xc] = *(undefined8 *)(lVar13 + 0x70);
    puVar7[0xb] = uVar36;
    puVar7[0x11] = uVar6;
    puVar7[0x10] = uVar88;
    puVar7[0xf] = uVar87;
    puVar7[0xe] = uVar86;
    puVar7[0xd] = uVar85;
    uVar36 = *(undefined8 *)(lVar13 + 0x58);
    puVar7[10] = *(undefined8 *)(lVar13 + 0x60);
    puVar7[9] = uVar36;
    uVar88 = *(undefined8 *)(lVar13 + 0xc0);
    uVar6 = *(undefined8 *)(lVar13 + 200);
    uVar86 = *(undefined8 *)(lVar13 + 0xd0);
    uVar87 = *(undefined8 *)(lVar13 + 0xd8);
    uVar85 = *(undefined8 *)(lVar13 + 0xb8);
    uVar36 = *(undefined8 *)(lVar13 + 0xb0);
    puVar7[0x1a] = *(undefined8 *)(lVar13 + 0xe0);
    puVar7[0x17] = uVar6;
    puVar7[0x16] = uVar88;
    puVar7[0x19] = uVar87;
    puVar7[0x18] = uVar86;
    puVar7[0x15] = uVar85;
    puVar7[0x14] = uVar36;
    uVar36 = *(undefined8 *)(lVar13 + 0xa0);
    puVar7[0x13] = *(undefined8 *)(lVar13 + 0xa8);
    puVar7[0x12] = uVar36;
    return;
  }
  uVar12 = param_1;
  if (unaff_x21 <= param_1) {
    uVar12 = unaff_x21;
  }
  if (uVar12 == 0) goto LAB_002c9290;
  if (7 < uVar12) {
    if (unaff_x22 + uVar12 <= (long)auStack_1a + (unaff_x21 - uVar12) + 0x20) goto LAB_002c92e4;
    if ((long)auStack_1a + unaff_x21 + 0x20 <= unaff_x22) goto LAB_002c92e4;
  }
  uVar8 = 0;
  do {
    lVar13 = uVar12 - uVar8;
    puVar10 = (undefined1 *)(unaff_x22 + uVar8);
    puVar15 = (undefined1 *)((long)auStack_1a + ~uVar8 + unaff_x21 + 0x20);
    do {
      *puVar15 = *puVar10;
      lVar13 = lVar13 + -1;
      puVar10 = puVar10 + 1;
      puVar15 = puVar15 + -1;
    } while (lVar13 != 0);
LAB_002c9290:
    do {
      if (param_1 < unaff_x21) {
        ___memset_chk(&uStack0000000000000006,0,unaff_x21 - uVar12,0x42);
      }
      (**(code **)(*unaff_x20 + 0x70))();
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return;
      }
      ___stack_chk_fail();
      param_1 = extraout_x8;
      uVar12 = extraout_x9;
LAB_002c92e4:
      if (uVar12 < 0x40) {
        uVar17 = 0;
      }
      else {
        uVar8 = uVar12 & 0xffffffc0;
        puVar7 = (undefined8 *)((long)auStack_1a + unaff_x21);
        pVar16 = (unkbyte9 *)(unaff_x22 + 0x20);
        uVar17 = uVar8;
        do {
          uVar36 = *(undefined8 *)((long)pVar16 + 8);
          Var3 = *pVar16;
          uVar85 = *(undefined8 *)((long)pVar16 + 0x18);
          Var4 = pVar16[1];
          auVar19 = NEON_rev64(*(undefined1 (*) [16])(pVar16 + -2),1);
          auVar19 = NEON_ext(auVar19,auVar19,8,1);
          auVar37 = NEON_rev64(*(undefined1 (*) [16])(pVar16 + -1),1);
          auVar37 = NEON_ext(auVar37,auVar37,8,1);
          puVar7[1] = auVar37._8_8_;
          *puVar7 = auVar37._0_8_;
          puVar7[3] = auVar19._8_8_;
          puVar7[2] = auVar19._0_8_;
          auVar1[9] = (char)((ulong)uVar36 >> 8);
          auVar1._0_9_ = Var3;
          auVar1[10] = (char)((ulong)uVar36 >> 0x10);
          auVar1[0xb] = (char)((ulong)uVar36 >> 0x18);
          auVar1[0xc] = (char)((ulong)uVar36 >> 0x20);
          auVar1[0xd] = (char)((ulong)uVar36 >> 0x28);
          auVar1[0xe] = (char)((ulong)uVar36 >> 0x30);
          auVar1[0xf] = (char)((ulong)uVar36 >> 0x38);
          auVar19 = NEON_rev64(auVar1,1);
          auVar19 = NEON_ext(auVar19,auVar19,8,1);
          auVar2[9] = (char)((ulong)uVar85 >> 8);
          auVar2._0_9_ = Var4;
          auVar2[10] = (char)((ulong)uVar85 >> 0x10);
          auVar2[0xb] = (char)((ulong)uVar85 >> 0x18);
          auVar2[0xc] = (char)((ulong)uVar85 >> 0x20);
          auVar2[0xd] = (char)((ulong)uVar85 >> 0x28);
          auVar2[0xe] = (char)((ulong)uVar85 >> 0x30);
          auVar2[0xf] = (char)((ulong)uVar85 >> 0x38);
          auVar37 = NEON_rev64(auVar2,1);
          auVar37 = NEON_ext(auVar37,auVar37,8,1);
          puVar7[-3] = auVar37._8_8_;
          puVar7[-4] = auVar37._0_8_;
          puVar7[-1] = auVar19._8_8_;
          puVar7[-2] = auVar19._0_8_;
          puVar7 = puVar7 + -8;
          uVar17 = uVar17 - 0x40;
          pVar16 = pVar16 + 4;
        } while (uVar17 != 0);
        if (uVar12 == uVar8) goto LAB_002c9290;
        uVar17 = uVar8;
        if ((uVar12 & 0x38) == 0) break;
      }
      uVar8 = uVar12 & 0xfffffff8;
      puVar7 = (undefined8 *)((long)auStack_1a + (unaff_x21 - uVar17) + 0x20);
      lVar13 = uVar17 - uVar8;
      puVar14 = (undefined8 *)(unaff_x22 + uVar17);
      do {
        puVar7 = puVar7 + -1;
        uVar36 = NEON_rev64(*puVar14,1);
        *puVar7 = uVar36;
        lVar13 = lVar13 + 8;
        puVar14 = puVar14 + 1;
      } while (lVar13 != 0);
    } while (uVar12 == uVar8);
  } while( true );
}

