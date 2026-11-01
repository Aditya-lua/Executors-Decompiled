
bool FUN_002aa3a4(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16])

{
  long *plVar1;
  bool bVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  int iVar8;
  long lVar9;
  undefined8 uVar10;
  long *plVar11;
  uint uVar12;
  byte *pbVar13;
  ulong *puVar14;
  long in_x9;
  ulong uVar15;
  long in_x10;
  ulong uVar16;
  byte *pbVar17;
  long lVar18;
  long in_x11;
  long lVar19;
  ulong uVar20;
  long in_x12;
  undefined8 *in_x13;
  ulong uVar21;
  long in_x14;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined4 unaff_w22;
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
  undefined1 auVar53 [16];
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
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  undefined8 uVar78;
  byte bVar85;
  undefined8 uVar86;
  byte bVar88;
  undefined8 uVar87;
  byte bVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  undefined8 uVar93;
  undefined8 uVar94;
  undefined8 uVar95;
  undefined8 uVar96;
  undefined8 uVar97;
  
  uVar87 = param_5._8_8_;
  uVar86 = param_5._0_8_;
  uVar78 = param_4._8_8_;
  uVar10 = param_4._0_8_;
  bVar68 = param_3[0xf];
  bVar67 = param_3[0xe];
  bVar66 = param_3[0xd];
  bVar65 = param_3[0xc];
  bVar64 = param_3[0xb];
  bVar63 = param_3[10];
  bVar62 = param_3[9];
  bVar61 = param_3[8];
  bVar60 = param_3[7];
  bVar59 = param_3[6];
  bVar58 = param_3[5];
  bVar57 = param_3[4];
  bVar56 = param_3[3];
  bVar55 = param_3[2];
  bVar54 = param_3[1];
  bVar52 = param_3[0];
  bVar51 = param_2[0xf];
  bVar49 = param_2[0xe];
  bVar47 = param_2[0xd];
  bVar45 = param_2[0xc];
  bVar43 = param_2[0xb];
  bVar41 = param_2[10];
  bVar39 = param_2[9];
  bVar37 = param_2[8];
  bVar35 = param_2[7];
  bVar33 = param_2[6];
  bVar31 = param_2[5];
  bVar29 = param_2[4];
  bVar27 = param_2[3];
  bVar25 = param_2[2];
  bVar36 = param_2[1];
  bVar22 = param_2[0];
  while( true ) {
    in_x14 = in_x14 + -8;
    bVar88 = (byte)((ulong)uVar10 >> 8);
    bVar74 = (byte)((ulong)uVar78 >> 8);
    bVar23 = (byte)((ulong)uVar86 >> 8);
    bVar38 = (byte)((ulong)uVar87 >> 8);
    bVar73 = (byte)((ulong)uVar10 >> 0x38);
    bVar81 = (byte)((ulong)uVar78 >> 0x38);
    bVar34 = (byte)((ulong)uVar86 >> 0x38);
    bVar50 = (byte)((ulong)uVar87 >> 0x38);
    bVar89 = (byte)((ulong)uVar10 >> 0x10);
    bVar69 = (byte)((ulong)uVar10 >> 0x18);
    bVar70 = (byte)((ulong)uVar10 >> 0x20);
    bVar71 = (byte)((ulong)uVar10 >> 0x28);
    bVar72 = (byte)((ulong)uVar10 >> 0x30);
    bVar75 = (byte)((ulong)uVar78 >> 0x10);
    bVar76 = (byte)((ulong)uVar78 >> 0x18);
    bVar77 = (byte)((ulong)uVar78 >> 0x20);
    bVar79 = (byte)((ulong)uVar78 >> 0x28);
    bVar80 = (byte)((ulong)uVar78 >> 0x30);
    bVar24 = (byte)((ulong)uVar86 >> 0x10);
    bVar26 = (byte)((ulong)uVar86 >> 0x18);
    bVar28 = (byte)((ulong)uVar86 >> 0x20);
    bVar30 = (byte)((ulong)uVar86 >> 0x28);
    bVar32 = (byte)((ulong)uVar86 >> 0x30);
    bVar40 = (byte)((ulong)uVar87 >> 0x10);
    bVar42 = (byte)((ulong)uVar87 >> 0x18);
    bVar44 = (byte)((ulong)uVar87 >> 0x20);
    bVar46 = (byte)((ulong)uVar87 >> 0x28);
    bVar48 = (byte)((ulong)uVar87 >> 0x30);
    if (in_x14 == 0) break;
    uVar91 = in_x13[-3];
    uVar90 = in_x13[-4];
    uVar93 = in_x13[-1];
    uVar92 = in_x13[-2];
    uVar95 = in_x13[1];
    uVar94 = *in_x13;
    uVar97 = in_x13[3];
    uVar96 = in_x13[2];
    bVar22 = (byte)uVar90 | bVar22;
    bVar36 = (byte)((ulong)uVar90 >> 8) | bVar36;
    bVar25 = (byte)((ulong)uVar90 >> 0x10) | bVar25;
    bVar27 = (byte)((ulong)uVar90 >> 0x18) | bVar27;
    bVar29 = (byte)((ulong)uVar90 >> 0x20) | bVar29;
    bVar31 = (byte)((ulong)uVar90 >> 0x28) | bVar31;
    bVar33 = (byte)((ulong)uVar90 >> 0x30) | bVar33;
    bVar35 = (byte)((ulong)uVar90 >> 0x38) | bVar35;
    bVar37 = (byte)uVar91 | bVar37;
    bVar39 = (byte)((ulong)uVar91 >> 8) | bVar39;
    bVar41 = (byte)((ulong)uVar91 >> 0x10) | bVar41;
    bVar43 = (byte)((ulong)uVar91 >> 0x18) | bVar43;
    bVar45 = (byte)((ulong)uVar91 >> 0x20) | bVar45;
    bVar47 = (byte)((ulong)uVar91 >> 0x28) | bVar47;
    bVar49 = (byte)((ulong)uVar91 >> 0x30) | bVar49;
    bVar51 = (byte)((ulong)uVar91 >> 0x38) | bVar51;
    bVar52 = (byte)uVar92 | bVar52;
    bVar54 = (byte)((ulong)uVar92 >> 8) | bVar54;
    bVar55 = (byte)((ulong)uVar92 >> 0x10) | bVar55;
    bVar56 = (byte)((ulong)uVar92 >> 0x18) | bVar56;
    bVar57 = (byte)((ulong)uVar92 >> 0x20) | bVar57;
    bVar58 = (byte)((ulong)uVar92 >> 0x28) | bVar58;
    bVar59 = (byte)((ulong)uVar92 >> 0x30) | bVar59;
    bVar60 = (byte)((ulong)uVar92 >> 0x38) | bVar60;
    bVar61 = (byte)uVar93 | bVar61;
    bVar62 = (byte)((ulong)uVar93 >> 8) | bVar62;
    bVar63 = (byte)((ulong)uVar93 >> 0x10) | bVar63;
    bVar64 = (byte)((ulong)uVar93 >> 0x18) | bVar64;
    bVar65 = (byte)((ulong)uVar93 >> 0x20) | bVar65;
    bVar66 = (byte)((ulong)uVar93 >> 0x28) | bVar66;
    bVar67 = (byte)((ulong)uVar93 >> 0x30) | bVar67;
    bVar68 = (byte)((ulong)uVar93 >> 0x38) | bVar68;
    uVar10 = CONCAT17((byte)((ulong)uVar94 >> 0x38) | bVar73,
                      CONCAT16((byte)((ulong)uVar94 >> 0x30) | bVar72,
                               CONCAT15((byte)((ulong)uVar94 >> 0x28) | bVar71,
                                        CONCAT14((byte)((ulong)uVar94 >> 0x20) | bVar70,
                                                 CONCAT13((byte)((ulong)uVar94 >> 0x18) | bVar69,
                                                          CONCAT12((byte)((ulong)uVar94 >> 0x10) |
                                                                   bVar89,CONCAT11((byte)((ulong)
                                                  uVar94 >> 8) | bVar88,(byte)uVar94 | (byte)uVar10)
                                                  ))))));
    uVar78 = CONCAT17((byte)((ulong)uVar95 >> 0x38) | bVar81,
                      CONCAT16((byte)((ulong)uVar95 >> 0x30) | bVar80,
                               CONCAT15((byte)((ulong)uVar95 >> 0x28) | bVar79,
                                        CONCAT14((byte)((ulong)uVar95 >> 0x20) | bVar77,
                                                 CONCAT13((byte)((ulong)uVar95 >> 0x18) | bVar76,
                                                          CONCAT12((byte)((ulong)uVar95 >> 0x10) |
                                                                   bVar75,CONCAT11((byte)((ulong)
                                                  uVar95 >> 8) | bVar74,(byte)uVar95 | (byte)uVar78)
                                                  ))))));
    uVar86 = CONCAT17((byte)((ulong)uVar96 >> 0x38) | bVar34,
                      CONCAT16((byte)((ulong)uVar96 >> 0x30) | bVar32,
                               CONCAT15((byte)((ulong)uVar96 >> 0x28) | bVar30,
                                        CONCAT14((byte)((ulong)uVar96 >> 0x20) | bVar28,
                                                 CONCAT13((byte)((ulong)uVar96 >> 0x18) | bVar26,
                                                          CONCAT12((byte)((ulong)uVar96 >> 0x10) |
                                                                   bVar24,CONCAT11((byte)((ulong)
                                                  uVar96 >> 8) | bVar23,(byte)uVar96 | (byte)uVar86)
                                                  ))))));
    uVar87 = CONCAT17((byte)((ulong)uVar97 >> 0x38) | bVar50,
                      CONCAT16((byte)((ulong)uVar97 >> 0x30) | bVar48,
                               CONCAT15((byte)((ulong)uVar97 >> 0x28) | bVar46,
                                        CONCAT14((byte)((ulong)uVar97 >> 0x20) | bVar44,
                                                 CONCAT13((byte)((ulong)uVar97 >> 0x18) | bVar42,
                                                          CONCAT12((byte)((ulong)uVar97 >> 0x10) |
                                                                   bVar40,CONCAT11((byte)((ulong)
                                                  uVar97 >> 8) | bVar38,(byte)uVar97 | (byte)uVar87)
                                                  ))))));
    in_x13 = in_x13 + 8;
  }
  bVar22 = (byte)uVar86 | (byte)uVar10 | bVar52 | bVar22;
  bVar23 = bVar23 | bVar88 | bVar54 | bVar36;
  bVar24 = bVar24 | bVar89 | bVar55 | bVar25;
  bVar26 = bVar26 | bVar69 | bVar56 | bVar27;
  bVar28 = bVar28 | bVar70 | bVar57 | bVar29;
  bVar30 = bVar30 | bVar71 | bVar58 | bVar31;
  bVar32 = bVar32 | bVar72 | bVar59 | bVar33;
  bVar34 = bVar34 | bVar73 | bVar60 | bVar35;
  bVar36 = (byte)uVar87 | (byte)uVar78 | bVar61 | bVar37;
  bVar38 = bVar38 | bVar74 | bVar62 | bVar39;
  bVar40 = bVar40 | bVar75 | bVar63 | bVar41;
  bVar42 = bVar42 | bVar76 | bVar64 | bVar43;
  bVar44 = bVar44 | bVar77 | bVar65 | bVar45;
  bVar46 = bVar46 | bVar79 | bVar66 | bVar47;
  bVar48 = bVar48 | bVar80 | bVar67 | bVar49;
  bVar50 = bVar50 | bVar81 | bVar68 | bVar51;
  auVar53[1] = bVar23;
  auVar53[0] = bVar22;
  auVar53[2] = bVar24;
  auVar53[3] = bVar26;
  auVar53[4] = bVar28;
  auVar53[5] = bVar30;
  auVar53[6] = bVar32;
  auVar53[7] = bVar34;
  auVar53[8] = bVar36;
  auVar53[9] = bVar38;
  auVar53[10] = bVar40;
  auVar53[0xb] = bVar42;
  auVar53[0xc] = bVar44;
  auVar53[0xd] = bVar46;
  auVar53[0xe] = bVar48;
  auVar53[0xf] = bVar50;
  auVar3[1] = bVar23;
  auVar3[0] = bVar22;
  auVar3[2] = bVar24;
  auVar3[3] = bVar26;
  auVar3[4] = bVar28;
  auVar3[5] = bVar30;
  auVar3[6] = bVar32;
  auVar3[7] = bVar34;
  auVar3[8] = bVar36;
  auVar3[9] = bVar38;
  auVar3[10] = bVar40;
  auVar3[0xb] = bVar42;
  auVar3[0xc] = bVar44;
  auVar3[0xd] = bVar46;
  auVar3[0xe] = bVar48;
  auVar3[0xf] = bVar50;
  auVar53 = NEON_ext(auVar53,auVar3,8,1);
  uVar21 = CONCAT17(bVar34 | auVar53[7],
                    CONCAT16(bVar32 | auVar53[6],
                             CONCAT15(bVar30 | auVar53[5],
                                      CONCAT14(bVar28 | auVar53[4],
                                               CONCAT13(bVar26 | auVar53[3],
                                                        CONCAT12(bVar24 | auVar53[2],
                                                                 CONCAT11(bVar23 | auVar53[1],
                                                                          bVar22 | auVar53[0])))))))
  ;
  if (in_x11 != in_x12) {
    param_1 = param_1 - in_x10;
    puVar14 = (ulong *)(in_x9 + in_x10 * 8);
    do {
      uVar21 = *puVar14 | uVar21;
      param_1 = param_1 + -1;
      puVar14 = puVar14 + 1;
    } while (param_1 != 0);
  }
  bVar2 = uVar21 == 0;
  if (bVar2) {
    *(undefined4 *)(unaff_x20 + 8) = unaff_w22;
  }
  else {
    func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x19e);
  }
  if (unaff_x19 == (undefined8 *)0x0) {
    return bVar2;
  }
  if ((unaff_x19[4] == 0) || (*(char *)(unaff_x19 + 5) != '\0')) {
    func_0x00373520(*unaff_x19,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
    func_0x0036e3d8(unaff_x19[1]);
    func_0x0036e3d8();
    return bVar2;
  }
  auVar53 = func_0x0079db28();
  plVar11 = auVar53._8_8_;
  lVar9 = auVar53._0_8_;
  uVar12 = *(uint *)(plVar11 + 1);
  uVar21 = (ulong)(int)uVar12;
  if (uVar12 == 0) goto LAB_002aa560;
  pbVar13 = (byte *)*plVar11;
  if (uVar12 < 8) {
    uVar15 = 0;
    uVar16 = 0;
LAB_002aa504:
    lVar19 = uVar21 - uVar15;
    puVar14 = (ulong *)(pbVar13 + uVar15 * 8);
    do {
      uVar16 = *puVar14 | uVar16;
      lVar19 = lVar19 + -1;
      puVar14 = puVar14 + 1;
    } while (lVar19 != 0);
  }
  else {
    uVar15 = uVar21 & 0xfffffffffffffff8;
    bVar22 = 0;
    bVar36 = 0;
    bVar25 = 0;
    bVar27 = 0;
    bVar29 = 0;
    bVar31 = 0;
    bVar33 = 0;
    bVar35 = 0;
    bVar37 = 0;
    bVar39 = 0;
    bVar41 = 0;
    bVar43 = 0;
    bVar45 = 0;
    bVar47 = 0;
    bVar49 = 0;
    bVar51 = 0;
    bVar52 = 0;
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
    uVar10 = 0;
    uVar78 = 0;
    uVar86 = 0;
    uVar87 = 0;
    pbVar17 = pbVar13 + 0x20;
    uVar16 = uVar15;
    do {
      uVar91 = *(undefined8 *)(pbVar17 + -0x18);
      uVar90 = *(undefined8 *)(pbVar17 + -0x20);
      uVar93 = *(undefined8 *)(pbVar17 + -8);
      uVar92 = *(undefined8 *)(pbVar17 + -0x10);
      uVar95 = *(undefined8 *)(pbVar17 + 8);
      uVar94 = *(undefined8 *)pbVar17;
      uVar97 = *(undefined8 *)(pbVar17 + 0x18);
      uVar96 = *(undefined8 *)(pbVar17 + 0x10);
      bVar22 = (byte)uVar90 | bVar22;
      bVar36 = (byte)((ulong)uVar90 >> 8) | bVar36;
      bVar25 = (byte)((ulong)uVar90 >> 0x10) | bVar25;
      bVar27 = (byte)((ulong)uVar90 >> 0x18) | bVar27;
      bVar29 = (byte)((ulong)uVar90 >> 0x20) | bVar29;
      bVar31 = (byte)((ulong)uVar90 >> 0x28) | bVar31;
      bVar33 = (byte)((ulong)uVar90 >> 0x30) | bVar33;
      bVar35 = (byte)((ulong)uVar90 >> 0x38) | bVar35;
      bVar37 = (byte)uVar91 | bVar37;
      bVar39 = (byte)((ulong)uVar91 >> 8) | bVar39;
      bVar41 = (byte)((ulong)uVar91 >> 0x10) | bVar41;
      bVar43 = (byte)((ulong)uVar91 >> 0x18) | bVar43;
      bVar45 = (byte)((ulong)uVar91 >> 0x20) | bVar45;
      bVar47 = (byte)((ulong)uVar91 >> 0x28) | bVar47;
      bVar49 = (byte)((ulong)uVar91 >> 0x30) | bVar49;
      bVar51 = (byte)((ulong)uVar91 >> 0x38) | bVar51;
      bVar52 = (byte)uVar92 | bVar52;
      bVar54 = (byte)((ulong)uVar92 >> 8) | bVar54;
      bVar55 = (byte)((ulong)uVar92 >> 0x10) | bVar55;
      bVar56 = (byte)((ulong)uVar92 >> 0x18) | bVar56;
      bVar57 = (byte)((ulong)uVar92 >> 0x20) | bVar57;
      bVar58 = (byte)((ulong)uVar92 >> 0x28) | bVar58;
      bVar59 = (byte)((ulong)uVar92 >> 0x30) | bVar59;
      bVar60 = (byte)((ulong)uVar92 >> 0x38) | bVar60;
      bVar61 = (byte)uVar93 | bVar61;
      bVar62 = (byte)((ulong)uVar93 >> 8) | bVar62;
      bVar63 = (byte)((ulong)uVar93 >> 0x10) | bVar63;
      bVar64 = (byte)((ulong)uVar93 >> 0x18) | bVar64;
      bVar65 = (byte)((ulong)uVar93 >> 0x20) | bVar65;
      bVar66 = (byte)((ulong)uVar93 >> 0x28) | bVar66;
      bVar67 = (byte)((ulong)uVar93 >> 0x30) | bVar67;
      bVar68 = (byte)((ulong)uVar93 >> 0x38) | bVar68;
      bVar69 = (byte)uVar94 | (byte)uVar10;
      bVar70 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar10 >> 8);
      bVar71 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar10 >> 0x10);
      bVar72 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar10 >> 0x18);
      bVar73 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar10 >> 0x20);
      bVar74 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar10 >> 0x28);
      bVar75 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar10 >> 0x30);
      bVar76 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar10 >> 0x38);
      uVar10 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(bVar72,
                                                  CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))));
      bVar77 = (byte)uVar95 | (byte)uVar78;
      bVar79 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar78 >> 8);
      bVar80 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar78 >> 0x10);
      bVar81 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar78 >> 0x18);
      bVar82 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar78 >> 0x20);
      bVar83 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar78 >> 0x28);
      bVar84 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar78 >> 0x30);
      bVar85 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar78 >> 0x38);
      uVar78 = CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,
                                                  CONCAT12(bVar80,CONCAT11(bVar79,bVar77)))))));
      bVar23 = (byte)uVar96 | (byte)uVar86;
      bVar24 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar86 >> 8);
      bVar26 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
      bVar28 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
      bVar30 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
      bVar32 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
      bVar34 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
      bVar38 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
      uVar86 = CONCAT17(bVar38,CONCAT16(bVar34,CONCAT15(bVar32,CONCAT14(bVar30,CONCAT13(bVar28,
                                                  CONCAT12(bVar26,CONCAT11(bVar24,bVar23)))))));
      bVar40 = (byte)uVar97 | (byte)uVar87;
      bVar42 = (byte)((ulong)uVar97 >> 8) | (byte)((ulong)uVar87 >> 8);
      bVar44 = (byte)((ulong)uVar97 >> 0x10) | (byte)((ulong)uVar87 >> 0x10);
      bVar46 = (byte)((ulong)uVar97 >> 0x18) | (byte)((ulong)uVar87 >> 0x18);
      bVar48 = (byte)((ulong)uVar97 >> 0x20) | (byte)((ulong)uVar87 >> 0x20);
      bVar50 = (byte)((ulong)uVar97 >> 0x28) | (byte)((ulong)uVar87 >> 0x28);
      bVar88 = (byte)((ulong)uVar97 >> 0x30) | (byte)((ulong)uVar87 >> 0x30);
      bVar89 = (byte)((ulong)uVar97 >> 0x38) | (byte)((ulong)uVar87 >> 0x38);
      uVar87 = CONCAT17(bVar89,CONCAT16(bVar88,CONCAT15(bVar50,CONCAT14(bVar48,CONCAT13(bVar46,
                                                  CONCAT12(bVar44,CONCAT11(bVar42,bVar40)))))));
      uVar16 = uVar16 - 8;
      pbVar17 = pbVar17 + 0x40;
    } while (uVar16 != 0);
    bVar23 = bVar23 | bVar69 | bVar52 | bVar22;
    bVar24 = bVar24 | bVar70 | bVar54 | bVar36;
    bVar26 = bVar26 | bVar71 | bVar55 | bVar25;
    bVar28 = bVar28 | bVar72 | bVar56 | bVar27;
    bVar30 = bVar30 | bVar73 | bVar57 | bVar29;
    bVar32 = bVar32 | bVar74 | bVar58 | bVar31;
    bVar34 = bVar34 | bVar75 | bVar59 | bVar33;
    bVar38 = bVar38 | bVar76 | bVar60 | bVar35;
    bVar40 = bVar40 | bVar77 | bVar61 | bVar37;
    bVar42 = bVar42 | bVar79 | bVar62 | bVar39;
    bVar44 = bVar44 | bVar80 | bVar63 | bVar41;
    bVar46 = bVar46 | bVar81 | bVar64 | bVar43;
    bVar48 = bVar48 | bVar82 | bVar65 | bVar45;
    bVar50 = bVar50 | bVar83 | bVar66 | bVar47;
    bVar88 = bVar88 | bVar84 | bVar67 | bVar49;
    bVar89 = bVar89 | bVar85 | bVar68 | bVar51;
    auVar6[1] = bVar24;
    auVar6[0] = bVar23;
    auVar6[2] = bVar26;
    auVar6[3] = bVar28;
    auVar6[4] = bVar30;
    auVar6[5] = bVar32;
    auVar6[6] = bVar34;
    auVar6[7] = bVar38;
    auVar6[8] = bVar40;
    auVar6[9] = bVar42;
    auVar6[10] = bVar44;
    auVar6[0xb] = bVar46;
    auVar6[0xc] = bVar48;
    auVar6[0xd] = bVar50;
    auVar6[0xe] = bVar88;
    auVar6[0xf] = bVar89;
    auVar7[1] = bVar24;
    auVar7[0] = bVar23;
    auVar7[2] = bVar26;
    auVar7[3] = bVar28;
    auVar7[4] = bVar30;
    auVar7[5] = bVar32;
    auVar7[6] = bVar34;
    auVar7[7] = bVar38;
    auVar7[8] = bVar40;
    auVar7[9] = bVar42;
    auVar7[10] = bVar44;
    auVar7[0xb] = bVar46;
    auVar7[0xc] = bVar48;
    auVar7[0xd] = bVar50;
    auVar7[0xe] = bVar88;
    auVar7[0xf] = bVar89;
    auVar53 = NEON_ext(auVar6,auVar7,8,1);
    uVar16 = CONCAT17(bVar38 | auVar53[7],
                      CONCAT16(bVar34 | auVar53[6],
                               CONCAT15(bVar32 | auVar53[5],
                                        CONCAT14(bVar30 | auVar53[4],
                                                 CONCAT13(bVar28 | auVar53[3],
                                                          CONCAT12(bVar26 | auVar53[2],
                                                                   CONCAT11(bVar24 | auVar53[1],
                                                                            bVar23 | auVar53[0])))))
                              ));
    if (uVar15 != uVar21) goto LAB_002aa504;
  }
  if (uVar16 == 0) {
LAB_002aa560:
    func_0x0028f83c(3,0,0x69,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xc9);
    return false;
  }
  if (((int)uVar12 < 1) || ((*pbVar13 & 1) == 0)) {
    func_0x0028f83c(3,0,0x68,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xcd);
    return false;
  }
  if ((int)plVar11[2] != 0) {
    func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xd1);
    return false;
  }
  if (uVar12 < 0x401) goto LAB_002aa69c;
  uVar16 = uVar21 - 0x400;
  if (uVar16 < 8) {
    uVar15 = 0;
    lVar19 = 0x400;
code_r0x002aa650:
    lVar18 = uVar21 - lVar19;
    puVar14 = (ulong *)(pbVar13 + lVar19 * 8);
    do {
      uVar15 = *puVar14 | uVar15;
      lVar18 = lVar18 + -1;
      puVar14 = puVar14 + 1;
    } while (lVar18 != 0);
  }
  else {
    uVar20 = uVar16 & 0xfffffffffffffff8;
    lVar19 = uVar20 + 0x400;
    pbVar17 = pbVar13 + 0x2030;
    bVar22 = 0;
    bVar36 = 0;
    bVar25 = 0;
    bVar27 = 0;
    bVar29 = 0;
    bVar31 = 0;
    bVar33 = 0;
    bVar35 = 0;
    bVar37 = 0;
    bVar39 = 0;
    bVar41 = 0;
    bVar43 = 0;
    bVar45 = 0;
    bVar47 = 0;
    bVar49 = 0;
    bVar51 = 0;
    bVar52 = 0;
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
    uVar10 = 0;
    uVar78 = 0;
    uVar86 = 0;
    uVar87 = 0;
    uVar15 = uVar20;
    do {
      uVar91 = *(undefined8 *)(pbVar17 + -0x28);
      uVar90 = *(undefined8 *)(pbVar17 + -0x30);
      uVar93 = *(undefined8 *)(pbVar17 + -0x18);
      uVar92 = *(undefined8 *)(pbVar17 + -0x20);
      uVar95 = *(undefined8 *)(pbVar17 + -8);
      uVar94 = *(undefined8 *)(pbVar17 + -0x10);
      uVar97 = *(undefined8 *)(pbVar17 + 8);
      uVar96 = *(undefined8 *)pbVar17;
      bVar22 = (byte)uVar90 | bVar22;
      bVar36 = (byte)((ulong)uVar90 >> 8) | bVar36;
      bVar25 = (byte)((ulong)uVar90 >> 0x10) | bVar25;
      bVar27 = (byte)((ulong)uVar90 >> 0x18) | bVar27;
      bVar29 = (byte)((ulong)uVar90 >> 0x20) | bVar29;
      bVar31 = (byte)((ulong)uVar90 >> 0x28) | bVar31;
      bVar33 = (byte)((ulong)uVar90 >> 0x30) | bVar33;
      bVar35 = (byte)((ulong)uVar90 >> 0x38) | bVar35;
      bVar37 = (byte)uVar91 | bVar37;
      bVar39 = (byte)((ulong)uVar91 >> 8) | bVar39;
      bVar41 = (byte)((ulong)uVar91 >> 0x10) | bVar41;
      bVar43 = (byte)((ulong)uVar91 >> 0x18) | bVar43;
      bVar45 = (byte)((ulong)uVar91 >> 0x20) | bVar45;
      bVar47 = (byte)((ulong)uVar91 >> 0x28) | bVar47;
      bVar49 = (byte)((ulong)uVar91 >> 0x30) | bVar49;
      bVar51 = (byte)((ulong)uVar91 >> 0x38) | bVar51;
      bVar52 = (byte)uVar92 | bVar52;
      bVar54 = (byte)((ulong)uVar92 >> 8) | bVar54;
      bVar55 = (byte)((ulong)uVar92 >> 0x10) | bVar55;
      bVar56 = (byte)((ulong)uVar92 >> 0x18) | bVar56;
      bVar57 = (byte)((ulong)uVar92 >> 0x20) | bVar57;
      bVar58 = (byte)((ulong)uVar92 >> 0x28) | bVar58;
      bVar59 = (byte)((ulong)uVar92 >> 0x30) | bVar59;
      bVar60 = (byte)((ulong)uVar92 >> 0x38) | bVar60;
      bVar61 = (byte)uVar93 | bVar61;
      bVar62 = (byte)((ulong)uVar93 >> 8) | bVar62;
      bVar63 = (byte)((ulong)uVar93 >> 0x10) | bVar63;
      bVar64 = (byte)((ulong)uVar93 >> 0x18) | bVar64;
      bVar65 = (byte)((ulong)uVar93 >> 0x20) | bVar65;
      bVar66 = (byte)((ulong)uVar93 >> 0x28) | bVar66;
      bVar67 = (byte)((ulong)uVar93 >> 0x30) | bVar67;
      bVar68 = (byte)((ulong)uVar93 >> 0x38) | bVar68;
      bVar69 = (byte)uVar94 | (byte)uVar10;
      bVar70 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar10 >> 8);
      bVar71 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar10 >> 0x10);
      bVar72 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar10 >> 0x18);
      bVar73 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar10 >> 0x20);
      bVar74 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar10 >> 0x28);
      bVar75 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar10 >> 0x30);
      bVar76 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar10 >> 0x38);
      uVar10 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(bVar72,
                                                  CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))));
      bVar77 = (byte)uVar95 | (byte)uVar78;
      bVar79 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar78 >> 8);
      bVar80 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar78 >> 0x10);
      bVar81 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar78 >> 0x18);
      bVar82 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar78 >> 0x20);
      bVar83 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar78 >> 0x28);
      bVar84 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar78 >> 0x30);
      bVar85 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar78 >> 0x38);
      uVar78 = CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,
                                                  CONCAT12(bVar80,CONCAT11(bVar79,bVar77)))))));
      bVar23 = (byte)uVar96 | (byte)uVar86;
      bVar24 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar86 >> 8);
      bVar26 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
      bVar28 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
      bVar30 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
      bVar32 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
      bVar34 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
      bVar38 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
      uVar86 = CONCAT17(bVar38,CONCAT16(bVar34,CONCAT15(bVar32,CONCAT14(bVar30,CONCAT13(bVar28,
                                                  CONCAT12(bVar26,CONCAT11(bVar24,bVar23)))))));
      bVar40 = (byte)uVar97 | (byte)uVar87;
      bVar42 = (byte)((ulong)uVar97 >> 8) | (byte)((ulong)uVar87 >> 8);
      bVar44 = (byte)((ulong)uVar97 >> 0x10) | (byte)((ulong)uVar87 >> 0x10);
      bVar46 = (byte)((ulong)uVar97 >> 0x18) | (byte)((ulong)uVar87 >> 0x18);
      bVar48 = (byte)((ulong)uVar97 >> 0x20) | (byte)((ulong)uVar87 >> 0x20);
      bVar50 = (byte)((ulong)uVar97 >> 0x28) | (byte)((ulong)uVar87 >> 0x28);
      bVar88 = (byte)((ulong)uVar97 >> 0x30) | (byte)((ulong)uVar87 >> 0x30);
      bVar89 = (byte)((ulong)uVar97 >> 0x38) | (byte)((ulong)uVar87 >> 0x38);
      uVar87 = CONCAT17(bVar89,CONCAT16(bVar88,CONCAT15(bVar50,CONCAT14(bVar48,CONCAT13(bVar46,
                                                  CONCAT12(bVar44,CONCAT11(bVar42,bVar40)))))));
      pbVar17 = pbVar17 + 0x40;
      uVar15 = uVar15 - 8;
    } while (uVar15 != 0);
    bVar23 = bVar23 | bVar69 | bVar52 | bVar22;
    bVar24 = bVar24 | bVar70 | bVar54 | bVar36;
    bVar26 = bVar26 | bVar71 | bVar55 | bVar25;
    bVar28 = bVar28 | bVar72 | bVar56 | bVar27;
    bVar30 = bVar30 | bVar73 | bVar57 | bVar29;
    bVar32 = bVar32 | bVar74 | bVar58 | bVar31;
    bVar34 = bVar34 | bVar75 | bVar59 | bVar33;
    bVar38 = bVar38 | bVar76 | bVar60 | bVar35;
    bVar40 = bVar40 | bVar77 | bVar61 | bVar37;
    bVar42 = bVar42 | bVar79 | bVar62 | bVar39;
    bVar44 = bVar44 | bVar80 | bVar63 | bVar41;
    bVar46 = bVar46 | bVar81 | bVar64 | bVar43;
    bVar48 = bVar48 | bVar82 | bVar65 | bVar45;
    bVar50 = bVar50 | bVar83 | bVar66 | bVar47;
    bVar88 = bVar88 | bVar84 | bVar67 | bVar49;
    bVar89 = bVar89 | bVar85 | bVar68 | bVar51;
    auVar4[1] = bVar24;
    auVar4[0] = bVar23;
    auVar4[2] = bVar26;
    auVar4[3] = bVar28;
    auVar4[4] = bVar30;
    auVar4[5] = bVar32;
    auVar4[6] = bVar34;
    auVar4[7] = bVar38;
    auVar4[8] = bVar40;
    auVar4[9] = bVar42;
    auVar4[10] = bVar44;
    auVar4[0xb] = bVar46;
    auVar4[0xc] = bVar48;
    auVar4[0xd] = bVar50;
    auVar4[0xe] = bVar88;
    auVar4[0xf] = bVar89;
    auVar5[1] = bVar24;
    auVar5[0] = bVar23;
    auVar5[2] = bVar26;
    auVar5[3] = bVar28;
    auVar5[4] = bVar30;
    auVar5[5] = bVar32;
    auVar5[6] = bVar34;
    auVar5[7] = bVar38;
    auVar5[8] = bVar40;
    auVar5[9] = bVar42;
    auVar5[10] = bVar44;
    auVar5[0xb] = bVar46;
    auVar5[0xc] = bVar48;
    auVar5[0xd] = bVar50;
    auVar5[0xe] = bVar88;
    auVar5[0xf] = bVar89;
    auVar53 = NEON_ext(auVar4,auVar5,8,1);
    uVar15 = CONCAT17(bVar38 | auVar53[7],
                      CONCAT16(bVar34 | auVar53[6],
                               CONCAT15(bVar32 | auVar53[5],
                                        CONCAT14(bVar30 | auVar53[4],
                                                 CONCAT13(bVar28 | auVar53[3],
                                                          CONCAT12(bVar26 | auVar53[2],
                                                                   CONCAT11(bVar24 | auVar53[1],
                                                                            bVar23 | auVar53[0])))))
                              ));
    if (uVar16 != uVar20) goto code_r0x002aa650;
  }
  if (uVar15 != 0) {
    func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xd5);
    return false;
  }
LAB_002aa69c:
  plVar1 = (long *)(lVar9 + 0x18);
  if (plVar1 == plVar11) {
    uVar21 = (ulong)*(uint *)(lVar9 + 0x20);
  }
  else {
    iVar8 = func_0x0029afb8(plVar1);
    if (iVar8 == 0) {
      func_0x0028f83c(3,0,0x44,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xdb);
      return false;
    }
    uVar21 = (ulong)(int)plVar11[1];
    if ((int)plVar11[1] != 0) {
      _memcpy(*plVar1,*plVar11,uVar21 << 3);
      uVar21 = (ulong)*(uint *)(plVar11 + 1);
    }
    *(int *)(lVar9 + 0x28) = (int)plVar11[2];
  }
  uVar12 = (uint)uVar21;
  lVar19 = (uVar21 & 0xffffffff) * 8;
  do {
    lVar19 = lVar19 + -8;
    iVar8 = (int)uVar21;
    uVar21 = (ulong)(iVar8 - 1);
    if (iVar8 < 1) {
      *(uint *)(lVar9 + 0x20) = uVar12 & (int)uVar12 >> 0x1f;
      if (-1 < (int)uVar12) {
        *(undefined4 *)(lVar9 + 0x28) = 0;
      }
      goto code_r0x002aa720;
    }
  } while (*(long *)(*plVar1 + lVar19) == 0);
  *(int *)(lVar9 + 0x20) = iVar8;
code_r0x002aa720:
  uVar10 = func_0x002ab5dc(plVar1);
  *(undefined8 *)(lVar9 + 0x30) = uVar10;
  *(undefined8 *)(lVar9 + 0x38) = 0;
  return true;
}

