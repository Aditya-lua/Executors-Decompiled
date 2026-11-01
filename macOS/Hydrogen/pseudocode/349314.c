
bool FUN_00349314(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16])

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  uint3 uVar14;
  uint6 uVar15;
  uint6 uVar16;
  uint6 uVar17;
  long lVar18;
  long lVar19;
  ulong uVar20;
  ulong uVar21;
  byte *pbVar22;
  uint uVar23;
  undefined8 *puVar24;
  ulong uVar25;
  undefined8 *puVar26;
  long lVar27;
  byte *pbVar28;
  long unaff_x20;
  long unaff_x29;
  undefined1 uVar29;
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
  byte bVar58;
  undefined8 uVar51;
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
  undefined8 uVar95;
  undefined8 uVar96;
  undefined8 uVar97;
  undefined8 uVar98;
  byte in_b24;
  byte in_register_00005308;
  byte in_b25;
  byte in_register_00005328;
  undefined1 auVar99 [16];
  
  uVar51 = *(undefined8 *)(unaff_x20 + 0x658);
  uVar3 = *(undefined8 *)(unaff_x20 + 0x650);
  uVar29 = (undefined1)((ulong)uVar3 >> 0x28);
  uVar14 = CONCAT12((char)((ulong)uVar3 >> 8),(short)uVar3) & 0xff00ff;
  uVar15 = (uint6)CONCAT14((char)(uVar14 >> 0x10),(uint)uVar14) & 0xffff0000ffff;
  uVar16 = (uint6)CONCAT14(uVar29,(uint)CONCAT12(uVar29,(ushort)(byte)((ulong)uVar3 >> 0x20))) &
           0xffff0000ffff;
  uVar29 = (undefined1)((ulong)uVar51 >> 8);
  uVar17 = (uint6)CONCAT14(uVar29,(uint)CONCAT12(uVar29,(ushort)(byte)uVar51)) & 0xffff0000ffff;
  auVar99._0_8_ =
       CONCAT17(in_register_00005328 & (byte)((ulong)uVar3 >> 0x38) |
                in_register_00005308 & param_2[7],
                CONCAT16(in_b25 & (byte)((ulong)uVar3 >> 0x30) | in_b24 & param_2[6],
                         CONCAT15(in_register_00005328 & (byte)(uVar16 >> 0x20) |
                                  in_register_00005308 & param_2[5],
                                  CONCAT14(in_b25 & (byte)uVar16 | in_b24 & param_2[4],
                                           CONCAT13(in_register_00005328 &
                                                    (byte)((ulong)uVar3 >> 0x18) |
                                                    in_register_00005308 & param_2[3],
                                                    CONCAT12(in_b25 & (byte)((ulong)uVar3 >> 0x10) |
                                                             in_b24 & param_2[2],
                                                             CONCAT11(in_register_00005328 &
                                                                      (byte)(uVar15 >> 0x20) |
                                                                      in_register_00005308 &
                                                                      param_2[1],
                                                                      in_b25 & (byte)uVar15 |
                                                                      in_b24 & param_2[0])))))));
  auVar99[8] = in_b25 & (byte)uVar17 | in_b24 & param_2[8];
  auVar99[9] = in_register_00005328 & (byte)(uVar17 >> 0x20) | in_register_00005308 & param_2[9];
  auVar99[10] = in_b25 & (byte)((ulong)uVar51 >> 0x10) | in_b24 & param_2[10];
  auVar99[0xb] = in_register_00005328 & (byte)((ulong)uVar51 >> 0x18) |
                 in_register_00005308 & param_2[0xb];
  auVar99[0xc] = in_b25 & (byte)((ulong)uVar51 >> 0x20) | in_b24 & param_2[0xc];
  auVar99[0xd] = in_register_00005328 & (byte)((ulong)uVar51 >> 0x28) |
                 in_register_00005308 & param_2[0xd];
  auVar99[0xe] = in_b25 & (byte)((ulong)uVar51 >> 0x30) | in_b24 & param_2[0xe];
  auVar99[0xf] = in_register_00005328 & (byte)((ulong)uVar51 >> 0x38) |
                 in_register_00005308 & param_2[0xf];
  *(ulong *)(unaff_x29 + -0xb8) =
       CONCAT17(param_1[0xe],
                CONCAT16(param_1[0xc],
                         CONCAT15(param_1[10],
                                  CONCAT14(param_1[8],
                                           CONCAT13(param_1[6],
                                                    CONCAT12(param_1[4],
                                                             CONCAT11(param_1[2],param_1[0])))))));
  *(ulong *)(unaff_x29 + -0xc0) =
       CONCAT17(param_3[0xe],
                CONCAT16(param_3[0xc],
                         CONCAT15(param_3[10],
                                  CONCAT14(param_3[8],
                                           CONCAT13(param_3[6],
                                                    CONCAT12(param_3[4],
                                                             CONCAT11(param_3[2],param_3[0])))))));
  *(long *)(unaff_x29 + -0xa8) = auVar99._8_8_;
  *(undefined8 *)(unaff_x29 + -0xb0) = auVar99._0_8_;
  uVar20 = unaff_x29 - 0xc0;
  func_0x0036d148();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return false;
  }
  auVar99 = ___stack_chk_fail();
  lVar19 = auVar99._8_8_;
  lVar18 = auVar99._0_8_;
  if (uVar20 == 0) {
    return false;
  }
  if (uVar20 < 8) {
    uVar23 = 0;
    uVar21 = 0;
  }
  else {
    if (uVar20 < 0x40) {
      bVar30 = 0;
      uVar25 = 0;
    }
    else {
      uVar21 = uVar20 & 0xffffffffffffffc0;
      bVar30 = 0;
      bVar32 = 0;
      bVar35 = 0;
      bVar39 = 0;
      bVar34 = 0;
      bVar36 = 0;
      bVar38 = 0;
      bVar40 = 0;
      bVar42 = 0;
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
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
      bVar31 = 0;
      bVar33 = 0;
      bVar37 = 0;
      bVar41 = 0;
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
      puVar24 = (undefined8 *)(lVar18 + 0x20);
      puVar26 = (undefined8 *)(lVar19 + 0x20);
      uVar25 = uVar21;
      do {
        uVar51 = puVar24[-3];
        uVar3 = puVar24[-4];
        uVar5 = puVar24[-1];
        uVar4 = puVar24[-2];
        uVar7 = puVar24[1];
        uVar6 = *puVar24;
        uVar9 = puVar24[3];
        uVar8 = puVar24[2];
        uVar11 = puVar26[-3];
        uVar10 = puVar26[-4];
        uVar13 = puVar26[-1];
        uVar12 = puVar26[-2];
        uVar96 = puVar26[1];
        uVar95 = *puVar26;
        uVar98 = puVar26[3];
        uVar97 = puVar26[2];
        bVar30 = (byte)uVar10 ^ (byte)uVar3 | bVar30;
        bVar32 = (byte)((ulong)uVar10 >> 8) ^ (byte)((ulong)uVar3 >> 8) | bVar32;
        bVar35 = (byte)((ulong)uVar10 >> 0x10) ^ (byte)((ulong)uVar3 >> 0x10) | bVar35;
        bVar39 = (byte)((ulong)uVar10 >> 0x18) ^ (byte)((ulong)uVar3 >> 0x18) | bVar39;
        bVar34 = (byte)((ulong)uVar10 >> 0x20) ^ (byte)((ulong)uVar3 >> 0x20) | bVar34;
        bVar36 = (byte)((ulong)uVar10 >> 0x28) ^ (byte)((ulong)uVar3 >> 0x28) | bVar36;
        bVar38 = (byte)((ulong)uVar10 >> 0x30) ^ (byte)((ulong)uVar3 >> 0x30) | bVar38;
        bVar40 = (byte)((ulong)uVar10 >> 0x38) ^ (byte)((ulong)uVar3 >> 0x38) | bVar40;
        bVar42 = (byte)uVar11 ^ (byte)uVar51 | bVar42;
        bVar43 = (byte)((ulong)uVar11 >> 8) ^ (byte)((ulong)uVar51 >> 8) | bVar43;
        bVar44 = (byte)((ulong)uVar11 >> 0x10) ^ (byte)((ulong)uVar51 >> 0x10) | bVar44;
        bVar45 = (byte)((ulong)uVar11 >> 0x18) ^ (byte)((ulong)uVar51 >> 0x18) | bVar45;
        bVar46 = (byte)((ulong)uVar11 >> 0x20) ^ (byte)((ulong)uVar51 >> 0x20) | bVar46;
        bVar47 = (byte)((ulong)uVar11 >> 0x28) ^ (byte)((ulong)uVar51 >> 0x28) | bVar47;
        bVar48 = (byte)((ulong)uVar11 >> 0x30) ^ (byte)((ulong)uVar51 >> 0x30) | bVar48;
        bVar49 = (byte)((ulong)uVar11 >> 0x38) ^ (byte)((ulong)uVar51 >> 0x38) | bVar49;
        bVar50 = (byte)uVar12 ^ (byte)uVar4 | bVar50;
        bVar52 = (byte)((ulong)uVar12 >> 8) ^ (byte)((ulong)uVar4 >> 8) | bVar52;
        bVar53 = (byte)((ulong)uVar12 >> 0x10) ^ (byte)((ulong)uVar4 >> 0x10) | bVar53;
        bVar54 = (byte)((ulong)uVar12 >> 0x18) ^ (byte)((ulong)uVar4 >> 0x18) | bVar54;
        bVar55 = (byte)((ulong)uVar12 >> 0x20) ^ (byte)((ulong)uVar4 >> 0x20) | bVar55;
        bVar56 = (byte)((ulong)uVar12 >> 0x28) ^ (byte)((ulong)uVar4 >> 0x28) | bVar56;
        bVar57 = (byte)((ulong)uVar12 >> 0x30) ^ (byte)((ulong)uVar4 >> 0x30) | bVar57;
        bVar58 = (byte)((ulong)uVar12 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38) | bVar58;
        bVar59 = (byte)uVar13 ^ (byte)uVar5 | bVar59;
        bVar60 = (byte)((ulong)uVar13 >> 8) ^ (byte)((ulong)uVar5 >> 8) | bVar60;
        bVar61 = (byte)((ulong)uVar13 >> 0x10) ^ (byte)((ulong)uVar5 >> 0x10) | bVar61;
        bVar62 = (byte)((ulong)uVar13 >> 0x18) ^ (byte)((ulong)uVar5 >> 0x18) | bVar62;
        bVar63 = (byte)((ulong)uVar13 >> 0x20) ^ (byte)((ulong)uVar5 >> 0x20) | bVar63;
        bVar64 = (byte)((ulong)uVar13 >> 0x28) ^ (byte)((ulong)uVar5 >> 0x28) | bVar64;
        bVar65 = (byte)((ulong)uVar13 >> 0x30) ^ (byte)((ulong)uVar5 >> 0x30) | bVar65;
        bVar66 = (byte)((ulong)uVar13 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38) | bVar66;
        bVar67 = (byte)uVar95 ^ (byte)uVar6 | bVar67;
        bVar68 = (byte)((ulong)uVar95 >> 8) ^ (byte)((ulong)uVar6 >> 8) | bVar68;
        bVar69 = (byte)((ulong)uVar95 >> 0x10) ^ (byte)((ulong)uVar6 >> 0x10) | bVar69;
        bVar70 = (byte)((ulong)uVar95 >> 0x18) ^ (byte)((ulong)uVar6 >> 0x18) | bVar70;
        bVar71 = (byte)((ulong)uVar95 >> 0x20) ^ (byte)((ulong)uVar6 >> 0x20) | bVar71;
        bVar72 = (byte)((ulong)uVar95 >> 0x28) ^ (byte)((ulong)uVar6 >> 0x28) | bVar72;
        bVar73 = (byte)((ulong)uVar95 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30) | bVar73;
        bVar74 = (byte)((ulong)uVar95 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38) | bVar74;
        bVar75 = (byte)uVar96 ^ (byte)uVar7 | bVar75;
        bVar76 = (byte)((ulong)uVar96 >> 8) ^ (byte)((ulong)uVar7 >> 8) | bVar76;
        bVar77 = (byte)((ulong)uVar96 >> 0x10) ^ (byte)((ulong)uVar7 >> 0x10) | bVar77;
        bVar78 = (byte)((ulong)uVar96 >> 0x18) ^ (byte)((ulong)uVar7 >> 0x18) | bVar78;
        bVar79 = (byte)((ulong)uVar96 >> 0x20) ^ (byte)((ulong)uVar7 >> 0x20) | bVar79;
        bVar80 = (byte)((ulong)uVar96 >> 0x28) ^ (byte)((ulong)uVar7 >> 0x28) | bVar80;
        bVar81 = (byte)((ulong)uVar96 >> 0x30) ^ (byte)((ulong)uVar7 >> 0x30) | bVar81;
        bVar82 = (byte)((ulong)uVar96 >> 0x38) ^ (byte)((ulong)uVar7 >> 0x38) | bVar82;
        bVar31 = (byte)uVar97 ^ (byte)uVar8 | bVar31;
        bVar33 = (byte)((ulong)uVar97 >> 8) ^ (byte)((ulong)uVar8 >> 8) | bVar33;
        bVar37 = (byte)((ulong)uVar97 >> 0x10) ^ (byte)((ulong)uVar8 >> 0x10) | bVar37;
        bVar41 = (byte)((ulong)uVar97 >> 0x18) ^ (byte)((ulong)uVar8 >> 0x18) | bVar41;
        bVar83 = (byte)((ulong)uVar97 >> 0x20) ^ (byte)((ulong)uVar8 >> 0x20) | bVar83;
        bVar84 = (byte)((ulong)uVar97 >> 0x28) ^ (byte)((ulong)uVar8 >> 0x28) | bVar84;
        bVar85 = (byte)((ulong)uVar97 >> 0x30) ^ (byte)((ulong)uVar8 >> 0x30) | bVar85;
        bVar86 = (byte)((ulong)uVar97 >> 0x38) ^ (byte)((ulong)uVar8 >> 0x38) | bVar86;
        bVar87 = (byte)uVar98 ^ (byte)uVar9 | bVar87;
        bVar88 = (byte)((ulong)uVar98 >> 8) ^ (byte)((ulong)uVar9 >> 8) | bVar88;
        bVar89 = (byte)((ulong)uVar98 >> 0x10) ^ (byte)((ulong)uVar9 >> 0x10) | bVar89;
        bVar90 = (byte)((ulong)uVar98 >> 0x18) ^ (byte)((ulong)uVar9 >> 0x18) | bVar90;
        bVar91 = (byte)((ulong)uVar98 >> 0x20) ^ (byte)((ulong)uVar9 >> 0x20) | bVar91;
        bVar92 = (byte)((ulong)uVar98 >> 0x28) ^ (byte)((ulong)uVar9 >> 0x28) | bVar92;
        bVar93 = (byte)((ulong)uVar98 >> 0x30) ^ (byte)((ulong)uVar9 >> 0x30) | bVar93;
        bVar94 = (byte)((ulong)uVar98 >> 0x38) ^ (byte)((ulong)uVar9 >> 0x38) | bVar94;
        uVar25 = uVar25 - 0x40;
        puVar24 = puVar24 + 8;
        puVar26 = puVar26 + 8;
      } while (uVar25 != 0);
      bVar31 = bVar31 | bVar67 | bVar50 | bVar30;
      bVar33 = bVar33 | bVar68 | bVar52 | bVar32;
      bVar37 = bVar37 | bVar69 | bVar53 | bVar35;
      bVar41 = bVar41 | bVar70 | bVar54 | bVar39;
      bVar83 = bVar83 | bVar71 | bVar55 | bVar34;
      bVar84 = bVar84 | bVar72 | bVar56 | bVar36;
      bVar85 = bVar85 | bVar73 | bVar57 | bVar38;
      bVar86 = bVar86 | bVar74 | bVar58 | bVar40;
      bVar87 = bVar87 | bVar75 | bVar59 | bVar42;
      bVar88 = bVar88 | bVar76 | bVar60 | bVar43;
      bVar89 = bVar89 | bVar77 | bVar61 | bVar44;
      bVar90 = bVar90 | bVar78 | bVar62 | bVar45;
      bVar91 = bVar91 | bVar79 | bVar63 | bVar46;
      bVar92 = bVar92 | bVar80 | bVar64 | bVar47;
      bVar93 = bVar93 | bVar81 | bVar65 | bVar48;
      bVar94 = bVar94 | bVar82 | bVar66 | bVar49;
      auVar1[1] = bVar33;
      auVar1[0] = bVar31;
      auVar1[2] = bVar37;
      auVar1[3] = bVar41;
      auVar1[4] = bVar83;
      auVar1[5] = bVar84;
      auVar1[6] = bVar85;
      auVar1[7] = bVar86;
      auVar1[8] = bVar87;
      auVar1[9] = bVar88;
      auVar1[10] = bVar89;
      auVar1[0xb] = bVar90;
      auVar1[0xc] = bVar91;
      auVar1[0xd] = bVar92;
      auVar1[0xe] = bVar93;
      auVar1[0xf] = bVar94;
      auVar2[1] = bVar33;
      auVar2[0] = bVar31;
      auVar2[2] = bVar37;
      auVar2[3] = bVar41;
      auVar2[4] = bVar83;
      auVar2[5] = bVar84;
      auVar2[6] = bVar85;
      auVar2[7] = bVar86;
      auVar2[8] = bVar87;
      auVar2[9] = bVar88;
      auVar2[10] = bVar89;
      auVar2[0xb] = bVar90;
      auVar2[0xc] = bVar91;
      auVar2[0xd] = bVar92;
      auVar2[0xe] = bVar93;
      auVar2[0xf] = bVar94;
      auVar99 = NEON_ext(auVar1,auVar2,8,1);
      uVar25 = CONCAT17(bVar86 | auVar99[7],
                        CONCAT16(bVar85 | auVar99[6],
                                 CONCAT15(bVar84 | auVar99[5],
                                          CONCAT14(bVar83 | auVar99[4],
                                                   CONCAT13(bVar41 | auVar99[3],
                                                            CONCAT12(bVar37 | auVar99[2],
                                                                     CONCAT11(bVar33 | auVar99[1],
                                                                              bVar31 | auVar99[0])))
                                                  ))));
      uVar25 = uVar25 | uVar25 >> 0x20;
      uVar25 = uVar25 | uVar25 >> 0x10;
      uVar23 = (uint)uVar25 | (uint)(uVar25 >> 8);
      bVar30 = (byte)uVar23;
      if (uVar21 == uVar20) goto LAB_00349590;
      uVar25 = uVar21;
      if ((uVar20 & 0x38) == 0) goto LAB_0034956c;
    }
    uVar21 = uVar20 & 0xfffffffffffffff8;
    bVar31 = 0;
    bVar32 = 0;
    bVar33 = 0;
    bVar35 = 0;
    bVar37 = 0;
    bVar39 = 0;
    bVar41 = 0;
    lVar27 = uVar25 - uVar21;
    puVar24 = (undefined8 *)(lVar18 + uVar25);
    puVar26 = (undefined8 *)(lVar19 + uVar25);
    do {
      uVar51 = *puVar24;
      uVar3 = *puVar26;
      bVar30 = (byte)uVar3 ^ (byte)uVar51 | bVar30;
      bVar31 = (byte)((ulong)uVar3 >> 8) ^ (byte)((ulong)uVar51 >> 8) | bVar31;
      bVar32 = (byte)((ulong)uVar3 >> 0x10) ^ (byte)((ulong)uVar51 >> 0x10) | bVar32;
      bVar33 = (byte)((ulong)uVar3 >> 0x18) ^ (byte)((ulong)uVar51 >> 0x18) | bVar33;
      bVar35 = (byte)((ulong)uVar3 >> 0x20) ^ (byte)((ulong)uVar51 >> 0x20) | bVar35;
      bVar37 = (byte)((ulong)uVar3 >> 0x28) ^ (byte)((ulong)uVar51 >> 0x28) | bVar37;
      bVar39 = (byte)((ulong)uVar3 >> 0x30) ^ (byte)((ulong)uVar51 >> 0x30) | bVar39;
      bVar41 = (byte)((ulong)uVar3 >> 0x38) ^ (byte)((ulong)uVar51 >> 0x38) | bVar41;
      lVar27 = lVar27 + 8;
      puVar24 = puVar24 + 1;
      puVar26 = puVar26 + 1;
    } while (lVar27 != 0);
    uVar25 = CONCAT17(bVar41,CONCAT16(bVar39,CONCAT15(bVar37,CONCAT14(bVar35,CONCAT13(bVar33,
                                                  CONCAT12(bVar32,CONCAT11(bVar31,bVar30)))))));
    uVar25 = uVar25 | uVar25 >> 0x20;
    uVar25 = uVar25 | uVar25 >> 0x10;
    uVar23 = (uint)uVar25 | (uint)(uVar25 >> 8);
    if (uVar21 == uVar20) goto LAB_00349590;
  }
LAB_0034956c:
  lVar27 = uVar20 - uVar21;
  pbVar22 = (byte *)(lVar18 + uVar21);
  pbVar28 = (byte *)(lVar19 + uVar21);
  do {
    uVar23 = *pbVar28 ^ *pbVar22 | uVar23;
    lVar27 = lVar27 + -1;
    pbVar22 = pbVar22 + 1;
    pbVar28 = pbVar28 + 1;
  } while (lVar27 != 0);
LAB_00349590:
  return (uVar23 & 0xff) != 0;
}

