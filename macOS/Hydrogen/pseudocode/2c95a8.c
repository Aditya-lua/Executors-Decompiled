
/* WARNING: Possible PIC construction at 0x002c9a10: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002c99c8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002c9a14) */
/* WARNING: Removing unreachable block (ram,0x002c9a18) */
/* WARNING: Removing unreachable block (ram,0x002c9a84) */
/* WARNING: Removing unreachable block (ram,0x002c9a44) */
/* WARNING: Removing unreachable block (ram,0x002c9aac) */
/* WARNING: Removing unreachable block (ram,0x002c9a48) */
/* WARNING: Removing unreachable block (ram,0x002c99cc) */
/* WARNING: Removing unreachable block (ram,0x002c99d0) */
/* WARNING: Removing unreachable block (ram,0x002c9a68) */
/* WARNING: Removing unreachable block (ram,0x002c9a9c) */
/* WARNING: Removing unreachable block (ram,0x002c9aa0) */
/* WARNING: Removing unreachable block (ram,0x002c9aa8) */

undefined8 FUN_002c95a8(int param_1)

{
  code *pcVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  int iVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long in_x4;
  undefined8 uVar13;
  undefined8 *in_x5;
  ulong uVar14;
  long lVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  ulong *puVar19;
  ulong uVar20;
  long unaff_x19;
  long unaff_x20;
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
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  undefined8 uVar70;
  byte bVar77;
  byte bVar78;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  undefined8 uVar79;
  byte bVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  undefined8 uVar93;
  undefined8 uVar94;
  undefined1 auVar95 [16];
  undefined1 auVar96 [16];
  undefined1 auStack_1b0 [216];
  undefined1 auStack_d8 [72];
  
  if (param_1 != 0) {
    func_0x0028f83c(0xf,0,0x6a,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x330);
    return 0;
  }
  uVar2 = *(uint *)(unaff_x20 + 0x148);
  uVar14 = (ulong)uVar2;
  if ((int)uVar2 < 1) {
    uVar14 = 0;
  }
  else {
    if (uVar2 < 8) {
      uVar17 = 0;
      uVar20 = 0;
LAB_002c966c:
      lVar15 = uVar14 - uVar17;
      puVar19 = (ulong *)(unaff_x19 + uVar17 * 8 + 0x50);
      do {
        uVar20 = *puVar19 | uVar20;
        lVar15 = lVar15 + -1;
        puVar19 = puVar19 + 1;
      } while (lVar15 != 0);
    }
    else {
      uVar17 = uVar14 & 0xfffffff8;
      puVar11 = (undefined8 *)(unaff_x19 + 0x80);
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
      uVar8 = 0;
      uVar13 = 0;
      uVar70 = 0;
      uVar79 = 0;
      uVar20 = uVar17;
      do {
        uVar88 = puVar11[-5];
        uVar87 = puVar11[-6];
        uVar90 = puVar11[-3];
        uVar89 = puVar11[-4];
        uVar92 = puVar11[-1];
        uVar91 = puVar11[-2];
        uVar94 = puVar11[1];
        uVar93 = *puVar11;
        bVar21 = (byte)uVar87 | bVar21;
        bVar22 = (byte)((ulong)uVar87 >> 8) | bVar22;
        bVar23 = (byte)((ulong)uVar87 >> 0x10) | bVar23;
        bVar24 = (byte)((ulong)uVar87 >> 0x18) | bVar24;
        bVar25 = (byte)((ulong)uVar87 >> 0x20) | bVar25;
        bVar26 = (byte)((ulong)uVar87 >> 0x28) | bVar26;
        bVar27 = (byte)((ulong)uVar87 >> 0x30) | bVar27;
        bVar28 = (byte)((ulong)uVar87 >> 0x38) | bVar28;
        bVar29 = (byte)uVar88 | bVar29;
        bVar30 = (byte)((ulong)uVar88 >> 8) | bVar30;
        bVar31 = (byte)((ulong)uVar88 >> 0x10) | bVar31;
        bVar32 = (byte)((ulong)uVar88 >> 0x18) | bVar32;
        bVar33 = (byte)((ulong)uVar88 >> 0x20) | bVar33;
        bVar34 = (byte)((ulong)uVar88 >> 0x28) | bVar34;
        bVar35 = (byte)((ulong)uVar88 >> 0x30) | bVar35;
        bVar36 = (byte)((ulong)uVar88 >> 0x38) | bVar36;
        bVar37 = (byte)uVar89 | bVar37;
        bVar38 = (byte)((ulong)uVar89 >> 8) | bVar38;
        bVar39 = (byte)((ulong)uVar89 >> 0x10) | bVar39;
        bVar40 = (byte)((ulong)uVar89 >> 0x18) | bVar40;
        bVar41 = (byte)((ulong)uVar89 >> 0x20) | bVar41;
        bVar42 = (byte)((ulong)uVar89 >> 0x28) | bVar42;
        bVar43 = (byte)((ulong)uVar89 >> 0x30) | bVar43;
        bVar44 = (byte)((ulong)uVar89 >> 0x38) | bVar44;
        bVar45 = (byte)uVar90 | bVar45;
        bVar46 = (byte)((ulong)uVar90 >> 8) | bVar46;
        bVar47 = (byte)((ulong)uVar90 >> 0x10) | bVar47;
        bVar48 = (byte)((ulong)uVar90 >> 0x18) | bVar48;
        bVar49 = (byte)((ulong)uVar90 >> 0x20) | bVar49;
        bVar50 = (byte)((ulong)uVar90 >> 0x28) | bVar50;
        bVar51 = (byte)((ulong)uVar90 >> 0x30) | bVar51;
        bVar52 = (byte)((ulong)uVar90 >> 0x38) | bVar52;
        bVar53 = (byte)uVar91 | (byte)uVar8;
        bVar54 = (byte)((ulong)uVar91 >> 8) | (byte)((ulong)uVar8 >> 8);
        bVar55 = (byte)((ulong)uVar91 >> 0x10) | (byte)((ulong)uVar8 >> 0x10);
        bVar56 = (byte)((ulong)uVar91 >> 0x18) | (byte)((ulong)uVar8 >> 0x18);
        bVar57 = (byte)((ulong)uVar91 >> 0x20) | (byte)((ulong)uVar8 >> 0x20);
        bVar58 = (byte)((ulong)uVar91 >> 0x28) | (byte)((ulong)uVar8 >> 0x28);
        bVar59 = (byte)((ulong)uVar91 >> 0x30) | (byte)((ulong)uVar8 >> 0x30);
        bVar60 = (byte)((ulong)uVar91 >> 0x38) | (byte)((ulong)uVar8 >> 0x38);
        uVar8 = CONCAT17(bVar60,CONCAT16(bVar59,CONCAT15(bVar58,CONCAT14(bVar57,CONCAT13(bVar56,
                                                  CONCAT12(bVar55,CONCAT11(bVar54,bVar53)))))));
        bVar61 = (byte)uVar92 | (byte)uVar13;
        bVar62 = (byte)((ulong)uVar92 >> 8) | (byte)((ulong)uVar13 >> 8);
        bVar63 = (byte)((ulong)uVar92 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
        bVar64 = (byte)((ulong)uVar92 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
        bVar65 = (byte)((ulong)uVar92 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
        bVar66 = (byte)((ulong)uVar92 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
        bVar67 = (byte)((ulong)uVar92 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
        bVar68 = (byte)((ulong)uVar92 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
        uVar13 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,
                                                  CONCAT12(bVar63,CONCAT11(bVar62,bVar61)))))));
        bVar69 = (byte)uVar93 | (byte)uVar70;
        bVar71 = (byte)((ulong)uVar93 >> 8) | (byte)((ulong)uVar70 >> 8);
        bVar72 = (byte)((ulong)uVar93 >> 0x10) | (byte)((ulong)uVar70 >> 0x10);
        bVar73 = (byte)((ulong)uVar93 >> 0x18) | (byte)((ulong)uVar70 >> 0x18);
        bVar74 = (byte)((ulong)uVar93 >> 0x20) | (byte)((ulong)uVar70 >> 0x20);
        bVar75 = (byte)((ulong)uVar93 >> 0x28) | (byte)((ulong)uVar70 >> 0x28);
        bVar76 = (byte)((ulong)uVar93 >> 0x30) | (byte)((ulong)uVar70 >> 0x30);
        bVar77 = (byte)((ulong)uVar93 >> 0x38) | (byte)((ulong)uVar70 >> 0x38);
        uVar70 = CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,
                                                  CONCAT12(bVar72,CONCAT11(bVar71,bVar69)))))));
        bVar78 = (byte)uVar94 | (byte)uVar79;
        bVar80 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar79 >> 8);
        bVar81 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar79 >> 0x10);
        bVar82 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar79 >> 0x18);
        bVar83 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar79 >> 0x20);
        bVar84 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar79 >> 0x28);
        bVar85 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar79 >> 0x30);
        bVar86 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar79 >> 0x38);
        uVar79 = CONCAT17(bVar86,CONCAT16(bVar85,CONCAT15(bVar84,CONCAT14(bVar83,CONCAT13(bVar82,
                                                  CONCAT12(bVar81,CONCAT11(bVar80,bVar78)))))));
        puVar11 = puVar11 + 8;
        uVar20 = uVar20 - 8;
      } while (uVar20 != 0);
      bVar69 = bVar69 | bVar53 | bVar37 | bVar21;
      bVar71 = bVar71 | bVar54 | bVar38 | bVar22;
      bVar72 = bVar72 | bVar55 | bVar39 | bVar23;
      bVar73 = bVar73 | bVar56 | bVar40 | bVar24;
      bVar74 = bVar74 | bVar57 | bVar41 | bVar25;
      bVar75 = bVar75 | bVar58 | bVar42 | bVar26;
      bVar76 = bVar76 | bVar59 | bVar43 | bVar27;
      bVar77 = bVar77 | bVar60 | bVar44 | bVar28;
      bVar78 = bVar78 | bVar61 | bVar45 | bVar29;
      bVar80 = bVar80 | bVar62 | bVar46 | bVar30;
      bVar81 = bVar81 | bVar63 | bVar47 | bVar31;
      bVar82 = bVar82 | bVar64 | bVar48 | bVar32;
      bVar83 = bVar83 | bVar65 | bVar49 | bVar33;
      bVar84 = bVar84 | bVar66 | bVar50 | bVar34;
      bVar85 = bVar85 | bVar67 | bVar51 | bVar35;
      bVar86 = bVar86 | bVar68 | bVar52 | bVar36;
      auVar95[1] = bVar71;
      auVar95[0] = bVar69;
      auVar95[2] = bVar72;
      auVar95[3] = bVar73;
      auVar95[4] = bVar74;
      auVar95[5] = bVar75;
      auVar95[6] = bVar76;
      auVar95[7] = bVar77;
      auVar95[8] = bVar78;
      auVar95[9] = bVar80;
      auVar95[10] = bVar81;
      auVar95[0xb] = bVar82;
      auVar95[0xc] = bVar83;
      auVar95[0xd] = bVar84;
      auVar95[0xe] = bVar85;
      auVar95[0xf] = bVar86;
      auVar5[1] = bVar71;
      auVar5[0] = bVar69;
      auVar5[2] = bVar72;
      auVar5[3] = bVar73;
      auVar5[4] = bVar74;
      auVar5[5] = bVar75;
      auVar5[6] = bVar76;
      auVar5[7] = bVar77;
      auVar5[8] = bVar78;
      auVar5[9] = bVar80;
      auVar5[10] = bVar81;
      auVar5[0xb] = bVar82;
      auVar5[0xc] = bVar83;
      auVar5[0xd] = bVar84;
      auVar5[0xe] = bVar85;
      auVar5[0xf] = bVar86;
      auVar95 = NEON_ext(auVar95,auVar5,8,1);
      uVar20 = CONCAT17(bVar77 | auVar95[7],
                        CONCAT16(bVar76 | auVar95[6],
                                 CONCAT15(bVar75 | auVar95[5],
                                          CONCAT14(bVar74 | auVar95[4],
                                                   CONCAT13(bVar73 | auVar95[3],
                                                            CONCAT12(bVar72 | auVar95[2],
                                                                     CONCAT11(bVar71 | auVar95[1],
                                                                              bVar69 | auVar95[0])))
                                                  ))));
      if (uVar17 != uVar14) goto LAB_002c966c;
    }
    uVar14 = -(ulong)(uVar20 != 0);
  }
  lVar15 = func_0x00382cc0(unaff_x19 + 0x50,*(undefined8 *)(unaff_x20 + 0x140),unaff_x19 + 0x50,
                           (long)(int)uVar2);
  if (lVar15 == 0) {
    uVar2 = *(uint *)(unaff_x20 + 0x148);
    uVar20 = (ulong)uVar2;
    if (0 < (int)uVar2) {
      if (uVar2 < 8) {
        uVar18 = 0;
      }
      else {
        uVar18 = uVar20 & 0xfffffff8;
        bVar21 = (byte)uVar14;
        bVar22 = (byte)(uVar14 >> 8);
        bVar23 = (byte)(uVar14 >> 0x10);
        bVar24 = (byte)(uVar14 >> 0x18);
        bVar25 = (byte)(uVar14 >> 0x20);
        bVar26 = (byte)(uVar14 >> 0x28);
        bVar27 = (byte)(uVar14 >> 0x30);
        bVar28 = (byte)(uVar14 >> 0x38);
        puVar11 = (undefined8 *)(unaff_x19 + 0x80);
        uVar17 = uVar18;
        do {
          uVar13 = puVar11[-3];
          uVar8 = puVar11[-4];
          uVar79 = puVar11[-1];
          uVar70 = puVar11[-2];
          uVar88 = puVar11[1];
          uVar87 = *puVar11;
          *(byte *)(puVar11 + -5) = *(byte *)(puVar11 + -5) & bVar21;
          *(byte *)((long)puVar11 + -0x27) = *(byte *)((long)puVar11 + -0x27) & bVar22;
          *(byte *)((long)puVar11 + -0x26) = *(byte *)((long)puVar11 + -0x26) & bVar23;
          *(byte *)((long)puVar11 + -0x25) = *(byte *)((long)puVar11 + -0x25) & bVar24;
          *(byte *)((long)puVar11 + -0x24) = *(byte *)((long)puVar11 + -0x24) & bVar25;
          *(byte *)((long)puVar11 + -0x23) = *(byte *)((long)puVar11 + -0x23) & bVar26;
          *(byte *)((long)puVar11 + -0x22) = *(byte *)((long)puVar11 + -0x22) & bVar27;
          *(byte *)((long)puVar11 + -0x21) = *(byte *)((long)puVar11 + -0x21) & bVar28;
          *(byte *)(puVar11 + -6) = *(byte *)(puVar11 + -6) & bVar21;
          *(byte *)((long)puVar11 + -0x2f) = *(byte *)((long)puVar11 + -0x2f) & bVar22;
          *(byte *)((long)puVar11 + -0x2e) = *(byte *)((long)puVar11 + -0x2e) & bVar23;
          *(byte *)((long)puVar11 + -0x2d) = *(byte *)((long)puVar11 + -0x2d) & bVar24;
          *(byte *)((long)puVar11 + -0x2c) = *(byte *)((long)puVar11 + -0x2c) & bVar25;
          *(byte *)((long)puVar11 + -0x2b) = *(byte *)((long)puVar11 + -0x2b) & bVar26;
          *(byte *)((long)puVar11 + -0x2a) = *(byte *)((long)puVar11 + -0x2a) & bVar27;
          *(byte *)((long)puVar11 + -0x29) = *(byte *)((long)puVar11 + -0x29) & bVar28;
          puVar11[-3] = CONCAT17((byte)((ulong)uVar13 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar13 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar13 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar13 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar13 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar13 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar13 >> 8) & bVar22,
                                                           (byte)uVar13 & bVar21)))))));
          puVar11[-4] = CONCAT17((byte)((ulong)uVar8 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar8 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar8 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar8 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar8 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar8 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar8 >> 8) & bVar22,
                                                           (byte)uVar8 & bVar21)))))));
          puVar11[-1] = CONCAT17((byte)((ulong)uVar79 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar79 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar79 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar79 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar79 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar79 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar79 >> 8) & bVar22,
                                                           (byte)uVar79 & bVar21)))))));
          puVar11[-2] = CONCAT17((byte)((ulong)uVar70 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar70 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar70 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar70 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar70 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar70 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar70 >> 8) & bVar22,
                                                           (byte)uVar70 & bVar21)))))));
          puVar11[1] = CONCAT17((byte)((ulong)uVar88 >> 0x38) & bVar28,
                                CONCAT16((byte)((ulong)uVar88 >> 0x30) & bVar27,
                                         CONCAT15((byte)((ulong)uVar88 >> 0x28) & bVar26,
                                                  CONCAT14((byte)((ulong)uVar88 >> 0x20) & bVar25,
                                                           CONCAT13((byte)((ulong)uVar88 >> 0x18) &
                                                                    bVar24,CONCAT12((byte)((ulong)
                                                  uVar88 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar88 >> 8) & bVar22,
                                                           (byte)uVar88 & bVar21)))))));
          *puVar11 = CONCAT17((byte)((ulong)uVar87 >> 0x38) & bVar28,
                              CONCAT16((byte)((ulong)uVar87 >> 0x30) & bVar27,
                                       CONCAT15((byte)((ulong)uVar87 >> 0x28) & bVar26,
                                                CONCAT14((byte)((ulong)uVar87 >> 0x20) & bVar25,
                                                         CONCAT13((byte)((ulong)uVar87 >> 0x18) &
                                                                  bVar24,CONCAT12((byte)((ulong)
                                                  uVar87 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar87 >> 8) & bVar22,
                                                           (byte)uVar87 & bVar21)))))));
          puVar11 = puVar11 + 8;
          uVar17 = uVar17 - 8;
        } while (uVar17 != 0);
        if (uVar18 == uVar20) {
          return 1;
        }
      }
      lVar15 = uVar20 - uVar18;
      puVar19 = (ulong *)(unaff_x19 + uVar18 * 8 + 0x50);
      do {
        *puVar19 = *puVar19 & uVar14;
        lVar15 = lVar15 + -1;
        puVar19 = puVar19 + 1;
      } while (lVar15 != 0);
    }
    return 1;
  }
  auVar95 = func_0x0079e864();
  lVar9 = auVar95._8_8_;
  lVar7 = auVar95._0_8_;
  lVar15 = lVar9 + 0x48;
  uVar2 = *(uint *)(lVar7 + 0x148);
  uVar14 = (ulong)uVar2;
  puVar11 = (undefined8 *)(long)(int)uVar2;
  if ((int)uVar2 < 1) {
    uVar14 = 0;
  }
  else {
    if (uVar2 < 8) {
      uVar17 = 0;
      uVar20 = 0;
code_r0x002c97e0:
      lVar16 = uVar14 - uVar17;
      puVar19 = (ulong *)(lVar9 + uVar17 * 8 + 0x48);
      do {
        uVar20 = *puVar19 | uVar20;
        lVar16 = lVar16 + -1;
        puVar19 = puVar19 + 1;
      } while (lVar16 != 0);
    }
    else {
      uVar17 = uVar14 & 0xfffffff8;
      puVar12 = (undefined8 *)(lVar9 + 0x78);
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
      uVar8 = 0;
      uVar13 = 0;
      uVar70 = 0;
      uVar79 = 0;
      uVar20 = uVar17;
      do {
        uVar88 = puVar12[-5];
        uVar87 = puVar12[-6];
        uVar90 = puVar12[-3];
        uVar89 = puVar12[-4];
        uVar92 = puVar12[-1];
        uVar91 = puVar12[-2];
        uVar94 = puVar12[1];
        uVar93 = *puVar12;
        bVar21 = (byte)uVar87 | bVar21;
        bVar22 = (byte)((ulong)uVar87 >> 8) | bVar22;
        bVar23 = (byte)((ulong)uVar87 >> 0x10) | bVar23;
        bVar24 = (byte)((ulong)uVar87 >> 0x18) | bVar24;
        bVar25 = (byte)((ulong)uVar87 >> 0x20) | bVar25;
        bVar26 = (byte)((ulong)uVar87 >> 0x28) | bVar26;
        bVar27 = (byte)((ulong)uVar87 >> 0x30) | bVar27;
        bVar28 = (byte)((ulong)uVar87 >> 0x38) | bVar28;
        bVar29 = (byte)uVar88 | bVar29;
        bVar30 = (byte)((ulong)uVar88 >> 8) | bVar30;
        bVar31 = (byte)((ulong)uVar88 >> 0x10) | bVar31;
        bVar32 = (byte)((ulong)uVar88 >> 0x18) | bVar32;
        bVar33 = (byte)((ulong)uVar88 >> 0x20) | bVar33;
        bVar34 = (byte)((ulong)uVar88 >> 0x28) | bVar34;
        bVar35 = (byte)((ulong)uVar88 >> 0x30) | bVar35;
        bVar36 = (byte)((ulong)uVar88 >> 0x38) | bVar36;
        bVar37 = (byte)uVar89 | bVar37;
        bVar38 = (byte)((ulong)uVar89 >> 8) | bVar38;
        bVar39 = (byte)((ulong)uVar89 >> 0x10) | bVar39;
        bVar40 = (byte)((ulong)uVar89 >> 0x18) | bVar40;
        bVar41 = (byte)((ulong)uVar89 >> 0x20) | bVar41;
        bVar42 = (byte)((ulong)uVar89 >> 0x28) | bVar42;
        bVar43 = (byte)((ulong)uVar89 >> 0x30) | bVar43;
        bVar44 = (byte)((ulong)uVar89 >> 0x38) | bVar44;
        bVar45 = (byte)uVar90 | bVar45;
        bVar46 = (byte)((ulong)uVar90 >> 8) | bVar46;
        bVar47 = (byte)((ulong)uVar90 >> 0x10) | bVar47;
        bVar48 = (byte)((ulong)uVar90 >> 0x18) | bVar48;
        bVar49 = (byte)((ulong)uVar90 >> 0x20) | bVar49;
        bVar50 = (byte)((ulong)uVar90 >> 0x28) | bVar50;
        bVar51 = (byte)((ulong)uVar90 >> 0x30) | bVar51;
        bVar52 = (byte)((ulong)uVar90 >> 0x38) | bVar52;
        bVar53 = (byte)uVar91 | (byte)uVar8;
        bVar54 = (byte)((ulong)uVar91 >> 8) | (byte)((ulong)uVar8 >> 8);
        bVar55 = (byte)((ulong)uVar91 >> 0x10) | (byte)((ulong)uVar8 >> 0x10);
        bVar56 = (byte)((ulong)uVar91 >> 0x18) | (byte)((ulong)uVar8 >> 0x18);
        bVar57 = (byte)((ulong)uVar91 >> 0x20) | (byte)((ulong)uVar8 >> 0x20);
        bVar58 = (byte)((ulong)uVar91 >> 0x28) | (byte)((ulong)uVar8 >> 0x28);
        bVar59 = (byte)((ulong)uVar91 >> 0x30) | (byte)((ulong)uVar8 >> 0x30);
        bVar60 = (byte)((ulong)uVar91 >> 0x38) | (byte)((ulong)uVar8 >> 0x38);
        uVar8 = CONCAT17(bVar60,CONCAT16(bVar59,CONCAT15(bVar58,CONCAT14(bVar57,CONCAT13(bVar56,
                                                  CONCAT12(bVar55,CONCAT11(bVar54,bVar53)))))));
        bVar61 = (byte)uVar92 | (byte)uVar13;
        bVar62 = (byte)((ulong)uVar92 >> 8) | (byte)((ulong)uVar13 >> 8);
        bVar63 = (byte)((ulong)uVar92 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
        bVar64 = (byte)((ulong)uVar92 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
        bVar65 = (byte)((ulong)uVar92 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
        bVar66 = (byte)((ulong)uVar92 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
        bVar67 = (byte)((ulong)uVar92 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
        bVar68 = (byte)((ulong)uVar92 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
        uVar13 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,
                                                  CONCAT12(bVar63,CONCAT11(bVar62,bVar61)))))));
        bVar69 = (byte)uVar93 | (byte)uVar70;
        bVar71 = (byte)((ulong)uVar93 >> 8) | (byte)((ulong)uVar70 >> 8);
        bVar72 = (byte)((ulong)uVar93 >> 0x10) | (byte)((ulong)uVar70 >> 0x10);
        bVar73 = (byte)((ulong)uVar93 >> 0x18) | (byte)((ulong)uVar70 >> 0x18);
        bVar74 = (byte)((ulong)uVar93 >> 0x20) | (byte)((ulong)uVar70 >> 0x20);
        bVar75 = (byte)((ulong)uVar93 >> 0x28) | (byte)((ulong)uVar70 >> 0x28);
        bVar76 = (byte)((ulong)uVar93 >> 0x30) | (byte)((ulong)uVar70 >> 0x30);
        bVar77 = (byte)((ulong)uVar93 >> 0x38) | (byte)((ulong)uVar70 >> 0x38);
        uVar70 = CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,
                                                  CONCAT12(bVar72,CONCAT11(bVar71,bVar69)))))));
        bVar78 = (byte)uVar94 | (byte)uVar79;
        bVar80 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar79 >> 8);
        bVar81 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar79 >> 0x10);
        bVar82 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar79 >> 0x18);
        bVar83 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar79 >> 0x20);
        bVar84 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar79 >> 0x28);
        bVar85 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar79 >> 0x30);
        bVar86 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar79 >> 0x38);
        uVar79 = CONCAT17(bVar86,CONCAT16(bVar85,CONCAT15(bVar84,CONCAT14(bVar83,CONCAT13(bVar82,
                                                  CONCAT12(bVar81,CONCAT11(bVar80,bVar78)))))));
        puVar12 = puVar12 + 8;
        uVar20 = uVar20 - 8;
      } while (uVar20 != 0);
      bVar69 = bVar69 | bVar53 | bVar37 | bVar21;
      bVar71 = bVar71 | bVar54 | bVar38 | bVar22;
      bVar72 = bVar72 | bVar55 | bVar39 | bVar23;
      bVar73 = bVar73 | bVar56 | bVar40 | bVar24;
      bVar74 = bVar74 | bVar57 | bVar41 | bVar25;
      bVar75 = bVar75 | bVar58 | bVar42 | bVar26;
      bVar76 = bVar76 | bVar59 | bVar43 | bVar27;
      bVar77 = bVar77 | bVar60 | bVar44 | bVar28;
      bVar78 = bVar78 | bVar61 | bVar45 | bVar29;
      bVar80 = bVar80 | bVar62 | bVar46 | bVar30;
      bVar81 = bVar81 | bVar63 | bVar47 | bVar31;
      bVar82 = bVar82 | bVar64 | bVar48 | bVar32;
      bVar83 = bVar83 | bVar65 | bVar49 | bVar33;
      bVar84 = bVar84 | bVar66 | bVar50 | bVar34;
      bVar85 = bVar85 | bVar67 | bVar51 | bVar35;
      bVar86 = bVar86 | bVar68 | bVar52 | bVar36;
      auVar3[1] = bVar71;
      auVar3[0] = bVar69;
      auVar3[2] = bVar72;
      auVar3[3] = bVar73;
      auVar3[4] = bVar74;
      auVar3[5] = bVar75;
      auVar3[6] = bVar76;
      auVar3[7] = bVar77;
      auVar3[8] = bVar78;
      auVar3[9] = bVar80;
      auVar3[10] = bVar81;
      auVar3[0xb] = bVar82;
      auVar3[0xc] = bVar83;
      auVar3[0xd] = bVar84;
      auVar3[0xe] = bVar85;
      auVar3[0xf] = bVar86;
      auVar4[1] = bVar71;
      auVar4[0] = bVar69;
      auVar4[2] = bVar72;
      auVar4[3] = bVar73;
      auVar4[4] = bVar74;
      auVar4[5] = bVar75;
      auVar4[6] = bVar76;
      auVar4[7] = bVar77;
      auVar4[8] = bVar78;
      auVar4[9] = bVar80;
      auVar4[10] = bVar81;
      auVar4[0xb] = bVar82;
      auVar4[0xc] = bVar83;
      auVar4[0xd] = bVar84;
      auVar4[0xe] = bVar85;
      auVar4[0xf] = bVar86;
      auVar95 = NEON_ext(auVar3,auVar4,8,1);
      uVar20 = CONCAT17(bVar77 | auVar95[7],
                        CONCAT16(bVar76 | auVar95[6],
                                 CONCAT15(bVar75 | auVar95[5],
                                          CONCAT14(bVar74 | auVar95[4],
                                                   CONCAT13(bVar73 | auVar95[3],
                                                            CONCAT12(bVar72 | auVar95[2],
                                                                     CONCAT11(bVar71 | auVar95[1],
                                                                              bVar69 | auVar95[0])))
                                                  ))));
      if (uVar17 != uVar14) goto code_r0x002c97e0;
    }
    uVar14 = -(ulong)(uVar20 != 0);
  }
  lVar16 = func_0x00382cc0(lVar15,*(undefined8 *)(lVar7 + 0x140));
  if (lVar16 == 0) {
    uVar2 = *(uint *)(lVar7 + 0x148);
    uVar20 = (ulong)uVar2;
    if (0 < (int)uVar2) {
      if (uVar2 < 8) {
        uVar18 = 0;
      }
      else {
        uVar18 = uVar20 & 0xfffffff8;
        bVar21 = (byte)uVar14;
        bVar22 = (byte)(uVar14 >> 8);
        bVar23 = (byte)(uVar14 >> 0x10);
        bVar24 = (byte)(uVar14 >> 0x18);
        bVar25 = (byte)(uVar14 >> 0x20);
        bVar26 = (byte)(uVar14 >> 0x28);
        bVar27 = (byte)(uVar14 >> 0x30);
        bVar28 = (byte)(uVar14 >> 0x38);
        puVar11 = (undefined8 *)(lVar9 + 0x78);
        uVar17 = uVar18;
        do {
          uVar13 = puVar11[-3];
          uVar8 = puVar11[-4];
          uVar79 = puVar11[-1];
          uVar70 = puVar11[-2];
          uVar88 = puVar11[1];
          uVar87 = *puVar11;
          *(byte *)(puVar11 + -5) = *(byte *)(puVar11 + -5) & bVar21;
          *(byte *)((long)puVar11 + -0x27) = *(byte *)((long)puVar11 + -0x27) & bVar22;
          *(byte *)((long)puVar11 + -0x26) = *(byte *)((long)puVar11 + -0x26) & bVar23;
          *(byte *)((long)puVar11 + -0x25) = *(byte *)((long)puVar11 + -0x25) & bVar24;
          *(byte *)((long)puVar11 + -0x24) = *(byte *)((long)puVar11 + -0x24) & bVar25;
          *(byte *)((long)puVar11 + -0x23) = *(byte *)((long)puVar11 + -0x23) & bVar26;
          *(byte *)((long)puVar11 + -0x22) = *(byte *)((long)puVar11 + -0x22) & bVar27;
          *(byte *)((long)puVar11 + -0x21) = *(byte *)((long)puVar11 + -0x21) & bVar28;
          *(byte *)(puVar11 + -6) = *(byte *)(puVar11 + -6) & bVar21;
          *(byte *)((long)puVar11 + -0x2f) = *(byte *)((long)puVar11 + -0x2f) & bVar22;
          *(byte *)((long)puVar11 + -0x2e) = *(byte *)((long)puVar11 + -0x2e) & bVar23;
          *(byte *)((long)puVar11 + -0x2d) = *(byte *)((long)puVar11 + -0x2d) & bVar24;
          *(byte *)((long)puVar11 + -0x2c) = *(byte *)((long)puVar11 + -0x2c) & bVar25;
          *(byte *)((long)puVar11 + -0x2b) = *(byte *)((long)puVar11 + -0x2b) & bVar26;
          *(byte *)((long)puVar11 + -0x2a) = *(byte *)((long)puVar11 + -0x2a) & bVar27;
          *(byte *)((long)puVar11 + -0x29) = *(byte *)((long)puVar11 + -0x29) & bVar28;
          puVar11[-3] = CONCAT17((byte)((ulong)uVar13 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar13 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar13 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar13 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar13 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar13 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar13 >> 8) & bVar22,
                                                           (byte)uVar13 & bVar21)))))));
          puVar11[-4] = CONCAT17((byte)((ulong)uVar8 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar8 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar8 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar8 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar8 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar8 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar8 >> 8) & bVar22,
                                                           (byte)uVar8 & bVar21)))))));
          puVar11[-1] = CONCAT17((byte)((ulong)uVar79 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar79 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar79 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar79 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar79 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar79 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar79 >> 8) & bVar22,
                                                           (byte)uVar79 & bVar21)))))));
          puVar11[-2] = CONCAT17((byte)((ulong)uVar70 >> 0x38) & bVar28,
                                 CONCAT16((byte)((ulong)uVar70 >> 0x30) & bVar27,
                                          CONCAT15((byte)((ulong)uVar70 >> 0x28) & bVar26,
                                                   CONCAT14((byte)((ulong)uVar70 >> 0x20) & bVar25,
                                                            CONCAT13((byte)((ulong)uVar70 >> 0x18) &
                                                                     bVar24,CONCAT12((byte)((ulong)
                                                  uVar70 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar70 >> 8) & bVar22,
                                                           (byte)uVar70 & bVar21)))))));
          puVar11[1] = CONCAT17((byte)((ulong)uVar88 >> 0x38) & bVar28,
                                CONCAT16((byte)((ulong)uVar88 >> 0x30) & bVar27,
                                         CONCAT15((byte)((ulong)uVar88 >> 0x28) & bVar26,
                                                  CONCAT14((byte)((ulong)uVar88 >> 0x20) & bVar25,
                                                           CONCAT13((byte)((ulong)uVar88 >> 0x18) &
                                                                    bVar24,CONCAT12((byte)((ulong)
                                                  uVar88 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar88 >> 8) & bVar22,
                                                           (byte)uVar88 & bVar21)))))));
          *puVar11 = CONCAT17((byte)((ulong)uVar87 >> 0x38) & bVar28,
                              CONCAT16((byte)((ulong)uVar87 >> 0x30) & bVar27,
                                       CONCAT15((byte)((ulong)uVar87 >> 0x28) & bVar26,
                                                CONCAT14((byte)((ulong)uVar87 >> 0x20) & bVar25,
                                                         CONCAT13((byte)((ulong)uVar87 >> 0x18) &
                                                                  bVar24,CONCAT12((byte)((ulong)
                                                  uVar87 >> 0x10) & bVar23,
                                                  CONCAT11((byte)((ulong)uVar87 >> 8) & bVar22,
                                                           (byte)uVar87 & bVar21)))))));
          puVar11 = puVar11 + 8;
          uVar17 = uVar17 - 8;
        } while (uVar17 != 0);
        if (uVar18 == uVar20) {
          return 0;
        }
      }
      lVar15 = uVar20 - uVar18;
      puVar19 = (ulong *)(lVar9 + uVar18 * 8 + 0x48);
      do {
        *puVar19 = *puVar19 & uVar14;
        lVar15 = lVar15 + -1;
        puVar19 = puVar19 + 1;
      } while (lVar15 != 0);
    }
    return 0;
  }
  auVar95 = func_0x0079e864();
  uVar8 = auVar95._0_8_;
  auVar96._8_8_ = auStack_1b0;
  auVar96._0_8_ = uVar8;
  if ((puVar11 != (undefined8 *)0x0) == (in_x4 == 0) || lVar15 == 0 && in_x4 == 0) {
    uVar8 = 0x43;
    uVar13 = 0x351;
LAB_002c9948:
    func_0x0028f83c(0xf,0,uVar8,"/aws-lc/crypto/fipsmodule/ec/ec.c",uVar13);
    return 0;
  }
  lVar7 = lVar15;
  puVar12 = puVar11;
  iVar6 = func_0x002c2908(uVar8,*auVar95._8_8_);
  if ((iVar6 != 0) ||
     ((puVar11 != (undefined8 *)0x0 && (iVar6 = func_0x002c2908(uVar8,*puVar11), iVar6 != 0)))) {
    uVar8 = 0x6a;
    uVar13 = 0x357;
    goto LAB_002c9948;
  }
  if (in_x5 == (undefined8 *)0x0) {
    puVar11 = (undefined8 *)func_0x0036e31c(0x30);
    if (puVar11 == (undefined8 *)0x0) {
      return 0;
    }
    puVar11[1] = 0;
    puVar11[2] = 0;
    puVar11[3] = 0;
    in_x5 = puVar11;
    if (lVar15 == 0) goto LAB_002c99fc;
LAB_002c99b8:
    puVar12 = in_x5;
  }
  else {
    puVar11 = (undefined8 *)0x0;
    if (lVar15 != 0) goto LAB_002c99b8;
LAB_002c99fc:
    lVar15 = lVar7;
    if (in_x4 == 0) {
      if (puVar11 == (undefined8 *)0x0) {
        return 1;
      }
      if ((puVar11[4] == 0) || (*(char *)(puVar11 + 5) != '\0')) {
        func_0x00373520(*puVar11,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
        func_0x0036e3d8(puVar11[1]);
        func_0x0036e3d8(puVar11);
        return 1;
      }
      auVar96 = func_0x0079db28();
    }
    else {
      auVar96._8_8_ = auStack_d8;
      lVar15 = in_x4;
      puVar12 = in_x5;
    }
  }
  uVar8 = auVar96._8_8_;
  lVar7 = auVar96._0_8_;
  iVar6 = func_0x0029c218(uVar8,(long)*(int *)(lVar7 + 0x108));
  if ((iVar6 != 0) &&
     (iVar6 = func_0x0029d99c(uVar8,(long)*(int *)(lVar7 + 0x108),*(undefined8 *)(lVar7 + 0x100),
                              (long)*(int *)(lVar7 + 0x108)), iVar6 < 0)) {
    return 1;
  }
  lVar9 = 0x85;
  func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",0x1c);
  func_0x0028f0e4();
  if (*(char *)(puVar12 + 5) == '\0') {
    uVar13 = puVar12[4];
    uVar14 = puVar12[2];
    if (uVar14 != puVar12[3]) {
      lVar16 = puVar12[1];
code_r0x002c9c30:
      *(undefined8 *)(lVar16 + uVar14 * 8) = uVar13;
      puVar12[2] = puVar12[2] + 1;
      goto code_r0x002c9c40;
    }
    uVar20 = 0x20;
    if (uVar14 != 0) {
      uVar20 = uVar14 * 3 >> 1;
    }
    if ((uVar14 < uVar20 && uVar20 >> 0x3d == 0) &&
       (lVar16 = func_0x0036e48c(puVar12[1],uVar20 << 3), lVar16 != 0)) {
      puVar12[1] = lVar16;
      puVar12[3] = uVar20;
      uVar14 = puVar12[2];
      goto code_r0x002c9c30;
    }
    *(undefined2 *)(puVar12 + 5) = 0x101;
    lVar16 = func_0x0029e340(puVar12);
    if (lVar16 != 0) goto code_r0x002c9c4c;
    uVar13 = 0;
  }
  else {
code_r0x002c9c40:
    lVar16 = func_0x0029e340(puVar12);
    uVar13 = 0;
    if (lVar16 != 0) {
code_r0x002c9c4c:
      if (*(int *)(lVar7 + 0x214) == 0) {
        uVar13 = func_0x0079e818();
        goto code_r0x002c9d58;
      }
      lVar10 = lVar7 + 0x100;
      uVar13 = func_0x0029e4fc(0,lVar16,lVar15,lVar10,puVar12);
      lVar9 = lVar15;
      if ((int)uVar13 != 0) {
        if (*(int *)(lVar16 + 0x10) != 0) {
          pcVar1 = (code *)&_aws_lc_0_24_0_BN_add;
          if (*(int *)(lVar7 + 0x110) != 0) {
            pcVar1 = (code *)&_aws_lc_0_24_0_BN_sub;
          }
          uVar13 = (*pcVar1)(lVar16,lVar16);
          lVar9 = lVar10;
          if ((int)uVar13 == 0) goto code_r0x002c9d1c;
        }
        iVar6 = func_0x0029c218(uVar8,(long)*(int *)(lVar7 + 0x108),lVar16);
        if (iVar6 != 0) {
          lVar9 = *(long *)(lVar7 + 0x100);
          iVar6 = func_0x0029d99c(uVar8,(long)*(int *)(lVar7 + 0x108),lVar9,
                                  (long)*(int *)(lVar7 + 0x108));
          if (iVar6 < 0) {
            uVar13 = 1;
            goto code_r0x002c9d1c;
          }
        }
        lVar9 = 0x85;
        func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",0x1c);
        uVar13 = 0;
      }
    }
  }
code_r0x002c9d1c:
  if (*(char *)(puVar12 + 5) != '\0') {
    return uVar13;
  }
  if (puVar12[2] != 0) {
    lVar15 = puVar12[2] + -1;
    puVar12[2] = lVar15;
    puVar12[4] = *(undefined8 *)(puVar12[1] + lVar15 * 8);
    return uVar13;
  }
code_r0x002c9d58:
  auVar95 = func_0x0079db4c(uVar13);
  if (lVar9 == 0) {
    func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3ca);
    return 0;
  }
  (**(code **)(*auVar95._0_8_ + 0x28))();
  iVar6 = func_0x002c7cd4(auVar95._0_8_,auVar95._8_8_);
  if (iVar6 == 0) {
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3d6);
    return 0;
  }
  return 1;
}

