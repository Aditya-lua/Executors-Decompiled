
ulong FUN_002ab1a0(long param_1,ulong param_2)

{
  uint uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  ulong *puVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  long lVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
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
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  undefined8 uVar44;
  byte bVar51;
  byte bVar52;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  undefined8 uVar53;
  byte bVar60;
  byte bVar61;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  undefined8 uVar62;
  byte bVar69;
  byte bVar70;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  undefined8 uVar71;
  byte bVar78;
  undefined8 uVar79;
  undefined8 uVar80;
  undefined8 uVar81;
  undefined8 uVar82;
  undefined8 uVar83;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined1 auVar87 [16];
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == param_1) {
    return param_2;
  }
  auVar87 = ___stack_chk_fail();
  auVar87._0_8_ = auVar87._0_8_;
  if ((int)auVar87._0_8_[2] != 0) {
    return 0;
  }
  uVar1 = *(uint *)(auVar87._8_8_ + 0x20);
  lVar10 = (long)(int)uVar1;
  uVar2 = *(uint *)(auVar87._0_8_ + 1);
  if (uVar2 <= uVar1) {
    return 1;
  }
  uVar6 = (int)uVar2 - lVar10;
  if (uVar6 < 8) {
    uVar8 = 0;
    lVar5 = lVar10;
  }
  else {
    uVar7 = uVar6 & 0xfffffffffffffff8;
    lVar5 = uVar7 + lVar10;
    bVar11 = 0;
    bVar12 = 0;
    bVar13 = 0;
    bVar14 = 0;
    bVar15 = 0;
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
    uVar44 = 0;
    uVar53 = 0;
    uVar62 = 0;
    uVar71 = 0;
    puVar9 = (undefined8 *)(*auVar87._0_8_ + lVar10 * 8 + 0x20);
    uVar8 = uVar7;
    do {
      uVar80 = puVar9[-3];
      uVar79 = puVar9[-4];
      uVar82 = puVar9[-1];
      uVar81 = puVar9[-2];
      uVar84 = puVar9[1];
      uVar83 = *puVar9;
      uVar86 = puVar9[3];
      uVar85 = puVar9[2];
      bVar11 = (byte)uVar79 | bVar11;
      bVar12 = (byte)((ulong)uVar79 >> 8) | bVar12;
      bVar13 = (byte)((ulong)uVar79 >> 0x10) | bVar13;
      bVar14 = (byte)((ulong)uVar79 >> 0x18) | bVar14;
      bVar15 = (byte)((ulong)uVar79 >> 0x20) | bVar15;
      bVar16 = (byte)((ulong)uVar79 >> 0x28) | bVar16;
      bVar17 = (byte)((ulong)uVar79 >> 0x30) | bVar17;
      bVar18 = (byte)((ulong)uVar79 >> 0x38) | bVar18;
      bVar19 = (byte)uVar80 | bVar19;
      bVar20 = (byte)((ulong)uVar80 >> 8) | bVar20;
      bVar21 = (byte)((ulong)uVar80 >> 0x10) | bVar21;
      bVar22 = (byte)((ulong)uVar80 >> 0x18) | bVar22;
      bVar23 = (byte)((ulong)uVar80 >> 0x20) | bVar23;
      bVar24 = (byte)((ulong)uVar80 >> 0x28) | bVar24;
      bVar25 = (byte)((ulong)uVar80 >> 0x30) | bVar25;
      bVar26 = (byte)((ulong)uVar80 >> 0x38) | bVar26;
      bVar27 = (byte)uVar81 | bVar27;
      bVar28 = (byte)((ulong)uVar81 >> 8) | bVar28;
      bVar29 = (byte)((ulong)uVar81 >> 0x10) | bVar29;
      bVar30 = (byte)((ulong)uVar81 >> 0x18) | bVar30;
      bVar31 = (byte)((ulong)uVar81 >> 0x20) | bVar31;
      bVar32 = (byte)((ulong)uVar81 >> 0x28) | bVar32;
      bVar33 = (byte)((ulong)uVar81 >> 0x30) | bVar33;
      bVar34 = (byte)((ulong)uVar81 >> 0x38) | bVar34;
      bVar35 = (byte)uVar82 | bVar35;
      bVar36 = (byte)((ulong)uVar82 >> 8) | bVar36;
      bVar37 = (byte)((ulong)uVar82 >> 0x10) | bVar37;
      bVar38 = (byte)((ulong)uVar82 >> 0x18) | bVar38;
      bVar39 = (byte)((ulong)uVar82 >> 0x20) | bVar39;
      bVar40 = (byte)((ulong)uVar82 >> 0x28) | bVar40;
      bVar41 = (byte)((ulong)uVar82 >> 0x30) | bVar41;
      bVar42 = (byte)((ulong)uVar82 >> 0x38) | bVar42;
      bVar43 = (byte)uVar83 | (byte)uVar44;
      bVar45 = (byte)((ulong)uVar83 >> 8) | (byte)((ulong)uVar44 >> 8);
      bVar46 = (byte)((ulong)uVar83 >> 0x10) | (byte)((ulong)uVar44 >> 0x10);
      bVar47 = (byte)((ulong)uVar83 >> 0x18) | (byte)((ulong)uVar44 >> 0x18);
      bVar48 = (byte)((ulong)uVar83 >> 0x20) | (byte)((ulong)uVar44 >> 0x20);
      bVar49 = (byte)((ulong)uVar83 >> 0x28) | (byte)((ulong)uVar44 >> 0x28);
      bVar50 = (byte)((ulong)uVar83 >> 0x30) | (byte)((ulong)uVar44 >> 0x30);
      bVar51 = (byte)((ulong)uVar83 >> 0x38) | (byte)((ulong)uVar44 >> 0x38);
      uVar44 = CONCAT17(bVar51,CONCAT16(bVar50,CONCAT15(bVar49,CONCAT14(bVar48,CONCAT13(bVar47,
                                                  CONCAT12(bVar46,CONCAT11(bVar45,bVar43)))))));
      bVar52 = (byte)uVar84 | (byte)uVar53;
      bVar54 = (byte)((ulong)uVar84 >> 8) | (byte)((ulong)uVar53 >> 8);
      bVar55 = (byte)((ulong)uVar84 >> 0x10) | (byte)((ulong)uVar53 >> 0x10);
      bVar56 = (byte)((ulong)uVar84 >> 0x18) | (byte)((ulong)uVar53 >> 0x18);
      bVar57 = (byte)((ulong)uVar84 >> 0x20) | (byte)((ulong)uVar53 >> 0x20);
      bVar58 = (byte)((ulong)uVar84 >> 0x28) | (byte)((ulong)uVar53 >> 0x28);
      bVar59 = (byte)((ulong)uVar84 >> 0x30) | (byte)((ulong)uVar53 >> 0x30);
      bVar60 = (byte)((ulong)uVar84 >> 0x38) | (byte)((ulong)uVar53 >> 0x38);
      uVar53 = CONCAT17(bVar60,CONCAT16(bVar59,CONCAT15(bVar58,CONCAT14(bVar57,CONCAT13(bVar56,
                                                  CONCAT12(bVar55,CONCAT11(bVar54,bVar52)))))));
      bVar61 = (byte)uVar85 | (byte)uVar62;
      bVar63 = (byte)((ulong)uVar85 >> 8) | (byte)((ulong)uVar62 >> 8);
      bVar64 = (byte)((ulong)uVar85 >> 0x10) | (byte)((ulong)uVar62 >> 0x10);
      bVar65 = (byte)((ulong)uVar85 >> 0x18) | (byte)((ulong)uVar62 >> 0x18);
      bVar66 = (byte)((ulong)uVar85 >> 0x20) | (byte)((ulong)uVar62 >> 0x20);
      bVar67 = (byte)((ulong)uVar85 >> 0x28) | (byte)((ulong)uVar62 >> 0x28);
      bVar68 = (byte)((ulong)uVar85 >> 0x30) | (byte)((ulong)uVar62 >> 0x30);
      bVar69 = (byte)((ulong)uVar85 >> 0x38) | (byte)((ulong)uVar62 >> 0x38);
      uVar62 = CONCAT17(bVar69,CONCAT16(bVar68,CONCAT15(bVar67,CONCAT14(bVar66,CONCAT13(bVar65,
                                                  CONCAT12(bVar64,CONCAT11(bVar63,bVar61)))))));
      bVar70 = (byte)uVar86 | (byte)uVar71;
      bVar72 = (byte)((ulong)uVar86 >> 8) | (byte)((ulong)uVar71 >> 8);
      bVar73 = (byte)((ulong)uVar86 >> 0x10) | (byte)((ulong)uVar71 >> 0x10);
      bVar74 = (byte)((ulong)uVar86 >> 0x18) | (byte)((ulong)uVar71 >> 0x18);
      bVar75 = (byte)((ulong)uVar86 >> 0x20) | (byte)((ulong)uVar71 >> 0x20);
      bVar76 = (byte)((ulong)uVar86 >> 0x28) | (byte)((ulong)uVar71 >> 0x28);
      bVar77 = (byte)((ulong)uVar86 >> 0x30) | (byte)((ulong)uVar71 >> 0x30);
      bVar78 = (byte)((ulong)uVar86 >> 0x38) | (byte)((ulong)uVar71 >> 0x38);
      uVar71 = CONCAT17(bVar78,CONCAT16(bVar77,CONCAT15(bVar76,CONCAT14(bVar75,CONCAT13(bVar74,
                                                  CONCAT12(bVar73,CONCAT11(bVar72,bVar70)))))));
      uVar8 = uVar8 - 8;
      puVar9 = puVar9 + 8;
    } while (uVar8 != 0);
    bVar61 = bVar61 | bVar43 | bVar27 | bVar11;
    bVar63 = bVar63 | bVar45 | bVar28 | bVar12;
    bVar64 = bVar64 | bVar46 | bVar29 | bVar13;
    bVar65 = bVar65 | bVar47 | bVar30 | bVar14;
    bVar66 = bVar66 | bVar48 | bVar31 | bVar15;
    bVar67 = bVar67 | bVar49 | bVar32 | bVar16;
    bVar68 = bVar68 | bVar50 | bVar33 | bVar17;
    bVar69 = bVar69 | bVar51 | bVar34 | bVar18;
    bVar70 = bVar70 | bVar52 | bVar35 | bVar19;
    bVar72 = bVar72 | bVar54 | bVar36 | bVar20;
    bVar73 = bVar73 | bVar55 | bVar37 | bVar21;
    bVar74 = bVar74 | bVar56 | bVar38 | bVar22;
    bVar75 = bVar75 | bVar57 | bVar39 | bVar23;
    bVar76 = bVar76 | bVar58 | bVar40 | bVar24;
    bVar77 = bVar77 | bVar59 | bVar41 | bVar25;
    bVar78 = bVar78 | bVar60 | bVar42 | bVar26;
    auVar87[1] = bVar63;
    auVar87[0] = bVar61;
    auVar87[2] = bVar64;
    auVar87[3] = bVar65;
    auVar87[4] = bVar66;
    auVar87[5] = bVar67;
    auVar87[6] = bVar68;
    auVar87[7] = bVar69;
    auVar87[8] = bVar70;
    auVar87[9] = bVar72;
    auVar87[10] = bVar73;
    auVar87[0xb] = bVar74;
    auVar87[0xc] = bVar75;
    auVar87[0xd] = bVar76;
    auVar87[0xe] = bVar77;
    auVar87[0xf] = bVar78;
    auVar3[1] = bVar63;
    auVar3[0] = bVar61;
    auVar3[2] = bVar64;
    auVar3[3] = bVar65;
    auVar3[4] = bVar66;
    auVar3[5] = bVar67;
    auVar3[6] = bVar68;
    auVar3[7] = bVar69;
    auVar3[8] = bVar70;
    auVar3[9] = bVar72;
    auVar3[10] = bVar73;
    auVar3[0xb] = bVar74;
    auVar3[0xc] = bVar75;
    auVar3[0xd] = bVar76;
    auVar3[0xe] = bVar77;
    auVar3[0xf] = bVar78;
    auVar87 = NEON_ext(auVar87,auVar3,8,1);
    uVar8 = CONCAT17(bVar69 | auVar87[7],
                     CONCAT16(bVar68 | auVar87[6],
                              CONCAT15(bVar67 | auVar87[5],
                                       CONCAT14(bVar66 | auVar87[4],
                                                CONCAT13(bVar65 | auVar87[3],
                                                         CONCAT12(bVar64 | auVar87[2],
                                                                  CONCAT11(bVar63 | auVar87[1],
                                                                           bVar61 | auVar87[0]))))))
                    );
    if (uVar6 == uVar7) goto code_r0x002ab294;
  }
  lVar10 = (int)uVar2 - lVar5;
  puVar4 = (ulong *)(*auVar87._0_8_ + lVar5 * 8);
  do {
    uVar8 = *puVar4 | uVar8;
    lVar10 = lVar10 + -1;
    puVar4 = puVar4 + 1;
  } while (lVar10 != 0);
code_r0x002ab294:
  return (ulong)(uVar8 == 0);
}

