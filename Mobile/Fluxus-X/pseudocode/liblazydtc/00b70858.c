/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b70858
 */

undefined8 mbedtls_aria_setkey_dec(byte *param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined8 uVar13;
  undefined4 uVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined8 uVar17;
  byte *pbVar18;
  undefined8 uVar19;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  long lVar23;
  uint *puVar24;
  long lVar25;
  undefined4 uVar26;
  undefined4 uVar28;
  undefined4 uVar29;
  undefined4 uVar30;
  undefined1 auVar27 [16];
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
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
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
  undefined1 auVar63 [16];
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
  byte bVar67;
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
  undefined1 auVar68 [16];
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
  byte bVar100;
  byte bVar101;
  byte bVar102;
  byte bVar103;
  byte bVar104;
  byte bVar105;
  byte bVar106;
  byte bVar107;
  byte bVar108;
  byte bVar109;
  byte bVar110;
  byte bVar111;
  byte bVar112;
  byte bVar113;
  byte bVar114;
  byte bVar115;
  byte bVar116;
  byte bVar117;
  byte bVar118;
  byte bVar119;
  undefined1 auVar120 [16];
  undefined1 auVar121 [16];
  byte bVar122;
  byte bVar123;
  byte bVar124;
  byte bVar125;
  byte bVar126;
  byte bVar127;
  byte bVar128;
  byte bVar129;
  
  uVar19 = mbedtls_aria_setkey_enc();
  if ((int)uVar19 != 0) {
    return uVar19;
  }
  bVar31 = *param_1;
  uVar20 = (ulong)bVar31;
  if (uVar20 != 0) {
    lVar21 = 0;
    uVar22 = uVar20;
    do {
      lVar23 = lVar21 * 0x10;
      lVar25 = uVar22 * 0x10;
      uVar17 = *(undefined8 *)(param_1 + lVar25 + 4);
      uVar13 = *(undefined8 *)(param_1 + lVar23 + 4 + 8);
      uVar19 = *(undefined8 *)(param_1 + lVar23 + 4);
      lVar21 = lVar21 + 1;
      uVar22 = uVar22 - 1;
      *(undefined8 *)(param_1 + lVar23 + 4 + 8) = *(undefined8 *)(param_1 + lVar25 + 4 + 8);
      *(undefined8 *)(param_1 + lVar23 + 4) = uVar17;
      *(undefined8 *)(param_1 + lVar25 + 4 + 8) = uVar13;
      *(undefined8 *)(param_1 + lVar25 + 4) = uVar19;
    } while (lVar21 < (long)uVar22);
    if (bVar31 < 2) {
      return 0;
    }
    if (uVar20 - 1 < 4) {
      lVar21 = 1;
    }
    else {
      uVar2 = bVar31 - 1 & 3;
      lVar23 = (uVar20 - 1) - (ulong)uVar2;
      lVar21 = lVar23 + 1;
      pbVar18 = param_1 + 0x14;
      do {
        uVar26 = *(undefined4 *)pbVar18;
        uVar11 = *(undefined4 *)(pbVar18 + 4);
        bVar31 = (byte)((uint)uVar11 >> 8);
        bVar32 = (byte)((uint)uVar11 >> 0x10);
        bVar33 = (byte)((uint)uVar11 >> 0x18);
        auVar46._0_4_ = *(uint *)(pbVar18 + 8);
        uVar14 = *(undefined4 *)(pbVar18 + 0xc);
        bVar48 = (byte)((uint)uVar14 >> 8);
        bVar49 = (byte)((uint)uVar14 >> 0x10);
        bVar50 = (byte)((uint)uVar14 >> 0x18);
        uVar28 = *(undefined4 *)(pbVar18 + 0x10);
        uVar12 = *(undefined4 *)(pbVar18 + 0x14);
        bVar34 = (byte)uVar12;
        bVar35 = (byte)((uint)uVar12 >> 8);
        bVar36 = (byte)((uint)uVar12 >> 0x10);
        bVar37 = (byte)((uint)uVar12 >> 0x18);
        auVar46._4_4_ = *(int *)(pbVar18 + 0x18);
        uVar12 = *(undefined4 *)(pbVar18 + 0x1c);
        bVar51 = (byte)uVar12;
        bVar52 = (byte)((uint)uVar12 >> 8);
        bVar53 = (byte)((uint)uVar12 >> 0x10);
        bVar54 = (byte)((uint)uVar12 >> 0x18);
        uVar29 = *(undefined4 *)(pbVar18 + 0x20);
        uVar12 = *(undefined4 *)(pbVar18 + 0x24);
        bVar38 = (byte)uVar12;
        bVar39 = (byte)((uint)uVar12 >> 8);
        bVar40 = (byte)((uint)uVar12 >> 0x10);
        bVar41 = (byte)((uint)uVar12 >> 0x18);
        auVar46._8_4_ = *(int *)(pbVar18 + 0x28);
        uVar12 = *(undefined4 *)(pbVar18 + 0x2c);
        bVar55 = (byte)uVar12;
        bVar56 = (byte)((uint)uVar12 >> 8);
        bVar57 = (byte)((uint)uVar12 >> 0x10);
        bVar58 = (byte)((uint)uVar12 >> 0x18);
        uVar30 = *(undefined4 *)(pbVar18 + 0x30);
        uVar12 = *(undefined4 *)(pbVar18 + 0x34);
        bVar42 = (byte)uVar12;
        bVar43 = (byte)((uint)uVar12 >> 8);
        bVar44 = (byte)((uint)uVar12 >> 0x10);
        bVar45 = (byte)((uint)uVar12 >> 0x18);
        auVar46._12_4_ = *(int *)(pbVar18 + 0x38);
        uVar12 = *(undefined4 *)(pbVar18 + 0x3c);
        bVar59 = (byte)uVar12;
        bVar60 = (byte)((uint)uVar12 >> 8);
        bVar61 = (byte)((uint)uVar12 >> 0x10);
        bVar62 = (byte)((uint)uVar12 >> 0x18);
        auVar63._8_8_ = 0xff00ff00ff00ff;
        auVar63._0_8_ = 0xff00ff00ff00ff;
        auVar65._8_8_ = 0xff00ff00ff00ff;
        auVar65._0_8_ = 0xff00ff00ff00ff;
        auVar64._0_4_ = auVar46._0_4_ << 8;
        auVar64._4_4_ = auVar46._4_4_ << 8;
        auVar64._8_4_ = auVar46._8_4_ << 8;
        auVar64._12_4_ = auVar46._12_4_ << 8;
        auVar121[4] = (char)((uint)auVar46._4_4_ >> 8);
        auVar121._0_4_ = auVar46._0_4_ >> 8;
        auVar121[5] = (char)((uint)auVar46._4_4_ >> 0x10);
        auVar121[6] = (char)((uint)auVar46._4_4_ >> 0x18);
        auVar121[7] = 0;
        auVar121[8] = (char)((uint)auVar46._8_4_ >> 8);
        auVar121[9] = (char)((uint)auVar46._8_4_ >> 0x10);
        auVar121[10] = (char)((uint)auVar46._8_4_ >> 0x18);
        auVar121[0xb] = 0;
        auVar121[0xc] = (char)((uint)auVar46._12_4_ >> 8);
        auVar121[0xd] = (char)((uint)auVar46._12_4_ >> 0x10);
        auVar121[0xe] = (char)((uint)auVar46._12_4_ >> 0x18);
        auVar121[0xf] = 0;
        auVar64 = auVar64 ^ (auVar64 ^ auVar121) & auVar63;
        bVar102 = (byte)uVar26;
        bVar104 = (byte)((uint)uVar26 >> 8);
        bVar107 = (byte)uVar28;
        bVar109 = (byte)((uint)uVar28 >> 8);
        bVar112 = (byte)uVar29;
        bVar114 = (byte)((uint)uVar29 >> 8);
        bVar117 = (byte)uVar30;
        bVar119 = (byte)((uint)uVar30 >> 8);
        auVar120[4] = bVar51;
        auVar120._0_4_ = uVar14;
        auVar120[5] = bVar52;
        auVar120[6] = bVar53;
        auVar120[7] = bVar54;
        auVar120[8] = bVar55;
        auVar120[9] = bVar56;
        auVar120[10] = bVar57;
        auVar120[0xb] = bVar58;
        auVar120[0xc] = bVar59;
        auVar120[0xd] = bVar60;
        auVar120[0xe] = bVar61;
        auVar120[0xf] = bVar62;
        auVar121 = NEON_rev32(auVar120,1);
        auVar120 = NEON_rev32(auVar46,1);
        auVar68[4] = bVar34;
        auVar68._0_4_ = uVar11;
        auVar68[5] = bVar35;
        auVar68[6] = bVar36;
        auVar68[7] = bVar37;
        auVar68[8] = bVar38;
        auVar68[9] = bVar39;
        auVar68[10] = bVar40;
        auVar68[0xb] = bVar41;
        auVar68[0xc] = bVar42;
        auVar68[0xd] = bVar43;
        auVar68[0xe] = bVar44;
        auVar68[0xf] = bVar45;
        auVar68 = NEON_rev32(auVar68,1);
        bVar122 = (byte)((uint)uVar26 >> 0x10);
        bVar123 = (byte)((uint)uVar26 >> 0x18);
        bVar124 = (byte)((uint)uVar28 >> 0x10);
        bVar125 = (byte)((uint)uVar28 >> 0x18);
        bVar126 = (byte)((uint)uVar29 >> 0x10);
        bVar127 = (byte)((uint)uVar29 >> 0x18);
        bVar128 = (byte)((uint)uVar30 >> 0x10);
        bVar129 = (byte)((uint)uVar30 >> 0x18);
        bVar100 = auVar64[0] ^ (byte)uVar11;
        bVar101 = auVar64[1] ^ bVar31;
        bVar103 = auVar64[2] ^ bVar32;
        bVar105 = auVar64[4] ^ bVar34;
        bVar106 = auVar64[5] ^ bVar35;
        bVar108 = auVar64[6] ^ bVar36;
        bVar110 = auVar64[8] ^ bVar38;
        bVar111 = auVar64[9] ^ bVar39;
        bVar113 = auVar64[10] ^ bVar40;
        bVar115 = auVar64[0xc] ^ bVar42;
        bVar116 = auVar64[0xd] ^ bVar43;
        bVar118 = auVar64[0xe] ^ bVar44;
        bVar84 = auVar120[0] ^ bVar49;
        bVar85 = auVar120[1] ^ bVar50;
        bVar86 = auVar120[2] ^ (byte)uVar14;
        bVar87 = auVar120[3] ^ bVar48;
        bVar88 = auVar120[4] ^ bVar53;
        bVar89 = auVar120[5] ^ bVar54;
        bVar90 = auVar120[6] ^ bVar51;
        bVar91 = auVar120[7] ^ bVar52;
        bVar92 = auVar120[8] ^ bVar57;
        bVar93 = auVar120[9] ^ bVar58;
        bVar94 = auVar120[10] ^ bVar55;
        bVar95 = auVar120[0xb] ^ bVar56;
        bVar96 = auVar120[0xc] ^ bVar61;
        bVar97 = auVar120[0xd] ^ bVar62;
        bVar98 = auVar120[0xe] ^ bVar59;
        bVar99 = auVar120[0xf] ^ bVar60;
        bVar67 = bVar122 ^ auVar68[0];
        bVar69 = bVar123 ^ auVar68[1];
        bVar70 = bVar102 ^ auVar68[2];
        bVar71 = bVar104 ^ auVar68[3];
        bVar72 = bVar124 ^ auVar68[4];
        bVar73 = bVar125 ^ auVar68[5];
        bVar74 = bVar107 ^ auVar68[6];
        bVar75 = bVar109 ^ auVar68[7];
        bVar76 = bVar126 ^ auVar68[8];
        bVar77 = bVar127 ^ auVar68[9];
        bVar78 = bVar112 ^ auVar68[10];
        bVar79 = bVar114 ^ auVar68[0xb];
        bVar80 = bVar128 ^ auVar68[0xc];
        bVar81 = bVar129 ^ auVar68[0xd];
        bVar82 = bVar117 ^ auVar68[0xe];
        bVar83 = bVar119 ^ auVar68[0xf];
        auVar15[2] = auVar64[3] ^ bVar33;
        auVar15._0_2_ = (short)(CONCAT12(bVar103,CONCAT11(bVar101,bVar100)) >> 8);
        auVar15[3] = 0;
        auVar15[4] = bVar106;
        auVar15[5] = bVar108;
        auVar15[6] = auVar64[7] ^ bVar37;
        auVar15[7] = 0;
        auVar15[8] = bVar111;
        auVar15[9] = bVar113;
        auVar15[10] = auVar64[0xb] ^ bVar41;
        auVar15[0xb] = 0;
        auVar15[0xc] = bVar116;
        auVar15[0xd] = bVar118;
        auVar15[0xe] = auVar64[0xf] ^ bVar45;
        auVar15[0xf] = 0;
        auVar16[5] = bVar105;
        auVar16._0_5_ = (uint5)CONCAT12(bVar103,CONCAT11(bVar101,bVar100)) << 8;
        auVar16[6] = bVar106;
        auVar16[7] = bVar108;
        auVar16[8] = 0;
        auVar16[9] = bVar110;
        auVar16[10] = bVar111;
        auVar16[0xb] = bVar113;
        auVar16[0xc] = 0;
        auVar16[0xd] = bVar115;
        auVar16[0xe] = bVar116;
        auVar16[0xf] = bVar118;
        auVar66[5] = bVar105;
        auVar66._0_5_ = (uint5)CONCAT12(bVar103,CONCAT11(bVar101,bVar100)) << 8;
        auVar66[6] = bVar106;
        auVar66[7] = bVar108;
        auVar66[8] = 0;
        auVar66[9] = bVar110;
        auVar66[10] = bVar111;
        auVar66[0xb] = bVar113;
        auVar66[0xc] = 0;
        auVar66[0xd] = bVar115;
        auVar66[0xe] = bVar116;
        auVar66[0xf] = bVar118;
        auVar66 = auVar66 ^ (auVar16 ^ auVar15) & auVar65;
        auVar27[0] = (byte)uVar14 ^ bVar67;
        auVar27[1] = bVar48 ^ bVar69;
        auVar27[2] = bVar49 ^ bVar70;
        auVar27[3] = bVar50 ^ bVar71;
        auVar27[4] = bVar51 ^ bVar72;
        auVar27[5] = bVar52 ^ bVar73;
        auVar27[6] = bVar53 ^ bVar74;
        auVar27[7] = bVar54 ^ bVar75;
        auVar27[8] = bVar55 ^ bVar76;
        auVar27[9] = bVar56 ^ bVar77;
        auVar27[10] = bVar57 ^ bVar78;
        auVar27[0xb] = bVar58 ^ bVar79;
        auVar27[0xc] = bVar59 ^ bVar80;
        auVar27[0xd] = bVar60 ^ bVar81;
        auVar27[0xe] = bVar61 ^ bVar82;
        auVar27[0xf] = bVar62 ^ bVar83;
        auVar47[0] = auVar121[0] ^ bVar122 ^ auVar66[0];
        auVar47[1] = auVar121[1] ^ bVar123 ^ auVar66[1];
        auVar47[2] = auVar121[2] ^ bVar102 ^ auVar66[2];
        auVar47[3] = auVar121[3] ^ bVar104 ^ auVar66[3];
        auVar47[4] = auVar121[4] ^ bVar124 ^ auVar66[4];
        auVar47[5] = auVar121[5] ^ bVar125 ^ auVar66[5];
        auVar47[6] = auVar121[6] ^ bVar107 ^ auVar66[6];
        auVar47[7] = auVar121[7] ^ bVar109 ^ auVar66[7];
        auVar47[8] = auVar121[8] ^ bVar126 ^ auVar66[8];
        auVar47[9] = auVar121[9] ^ bVar127 ^ auVar66[9];
        auVar47[10] = auVar121[10] ^ bVar112 ^ auVar66[10];
        auVar47[0xb] = auVar121[0xb] ^ bVar114 ^ auVar66[0xb];
        auVar47[0xc] = auVar121[0xc] ^ bVar128 ^ auVar66[0xc];
        auVar47[0xd] = auVar121[0xd] ^ bVar129 ^ auVar66[0xd];
        auVar47[0xe] = auVar121[0xe] ^ bVar117 ^ auVar66[0xe];
        auVar47[0xf] = auVar121[0xf] ^ bVar119 ^ auVar66[0xf];
        auVar120 = NEON_rev32(auVar47,1);
        auVar68 = NEON_rev32(auVar27,1);
        lVar23 = lVar23 + -4;
        *pbVar18 = auVar47[1] ^ bVar87 ^ bVar32;
        pbVar18[1] = auVar47[0] ^ bVar86 ^ bVar33;
        pbVar18[2] = auVar47[3] ^ bVar85 ^ (byte)uVar11;
        pbVar18[3] = auVar47[2] ^ bVar84 ^ bVar31;
        *(uint *)(pbVar18 + 4) =
             CONCAT13(bVar87 ^ bVar123 ^ auVar47[3],
                      CONCAT12(bVar86 ^ bVar122 ^ auVar47[2],
                               CONCAT11(bVar85 ^ bVar104 ^ auVar47[1],bVar84 ^ bVar102 ^ auVar47[0])
                              ));
        *(uint *)(pbVar18 + 8) =
             CONCAT13(auVar68[3] ^ auVar47[1],
                      CONCAT12(auVar68[2] ^ auVar47[0],
                               CONCAT11(auVar68[1] ^ auVar47[3],auVar68[0] ^ auVar47[2])));
        *(uint *)(pbVar18 + 0xc) =
             CONCAT13(auVar64[3] ^ bVar71 ^ auVar120[3],
                      CONCAT12(auVar64[2] ^ bVar70 ^ auVar120[2],
                               CONCAT11(auVar64[1] ^ bVar69 ^ auVar120[1],
                                        auVar64[0] ^ bVar67 ^ auVar120[0])));
        pbVar18[0x10] = auVar47[5] ^ bVar91 ^ bVar36;
        pbVar18[0x11] = auVar47[4] ^ bVar90 ^ bVar37;
        pbVar18[0x12] = auVar47[7] ^ bVar89 ^ bVar34;
        pbVar18[0x13] = auVar47[6] ^ bVar88 ^ bVar35;
        *(uint *)(pbVar18 + 0x14) =
             CONCAT13(bVar91 ^ bVar125 ^ auVar47[7],
                      CONCAT12(bVar90 ^ bVar124 ^ auVar47[6],
                               CONCAT11(bVar89 ^ bVar109 ^ auVar47[5],bVar88 ^ bVar107 ^ auVar47[4])
                              ));
        *(uint *)(pbVar18 + 0x18) =
             CONCAT13(auVar68[7] ^ auVar47[5],
                      CONCAT12(auVar68[6] ^ auVar47[4],
                               CONCAT11(auVar68[5] ^ auVar47[7],auVar68[4] ^ auVar47[6])));
        *(uint *)(pbVar18 + 0x1c) =
             CONCAT13(auVar64[7] ^ bVar75 ^ auVar120[7],
                      CONCAT12(auVar64[6] ^ bVar74 ^ auVar120[6],
                               CONCAT11(auVar64[5] ^ bVar73 ^ auVar120[5],
                                        auVar64[4] ^ bVar72 ^ auVar120[4])));
        pbVar18[0x20] = auVar47[9] ^ bVar95 ^ bVar40;
        pbVar18[0x21] = auVar47[8] ^ bVar94 ^ bVar41;
        pbVar18[0x22] = auVar47[0xb] ^ bVar93 ^ bVar38;
        pbVar18[0x23] = auVar47[10] ^ bVar92 ^ bVar39;
        *(uint *)(pbVar18 + 0x24) =
             CONCAT13(bVar95 ^ bVar127 ^ auVar47[0xb],
                      CONCAT12(bVar94 ^ bVar126 ^ auVar47[10],
                               CONCAT11(bVar93 ^ bVar114 ^ auVar47[9],bVar92 ^ bVar112 ^ auVar47[8])
                              ));
        *(uint *)(pbVar18 + 0x28) =
             CONCAT13(auVar68[0xb] ^ auVar47[9],
                      CONCAT12(auVar68[10] ^ auVar47[8],
                               CONCAT11(auVar68[9] ^ auVar47[0xb],auVar68[8] ^ auVar47[10])));
        *(uint *)(pbVar18 + 0x2c) =
             CONCAT13(auVar64[0xb] ^ bVar79 ^ auVar120[0xb],
                      CONCAT12(auVar64[10] ^ bVar78 ^ auVar120[10],
                               CONCAT11(auVar64[9] ^ bVar77 ^ auVar120[9],
                                        auVar64[8] ^ bVar76 ^ auVar120[8])));
        pbVar18[0x30] = auVar47[0xd] ^ bVar99 ^ bVar44;
        pbVar18[0x31] = auVar47[0xc] ^ bVar98 ^ bVar45;
        pbVar18[0x32] = auVar47[0xf] ^ bVar97 ^ bVar42;
        pbVar18[0x33] = auVar47[0xe] ^ bVar96 ^ bVar43;
        *(uint *)(pbVar18 + 0x34) =
             CONCAT13(bVar99 ^ bVar129 ^ auVar47[0xf],
                      CONCAT12(bVar98 ^ bVar128 ^ auVar47[0xe],
                               CONCAT11(bVar97 ^ bVar119 ^ auVar47[0xd],
                                        bVar96 ^ bVar117 ^ auVar47[0xc])));
        *(uint *)(pbVar18 + 0x38) =
             CONCAT13(auVar68[0xf] ^ auVar47[0xd],
                      CONCAT12(auVar68[0xe] ^ auVar47[0xc],
                               CONCAT11(auVar68[0xd] ^ auVar47[0xf],auVar68[0xc] ^ auVar47[0xe])));
        *(uint *)(pbVar18 + 0x3c) =
             CONCAT13(auVar64[0xf] ^ bVar83 ^ auVar120[0xf],
                      CONCAT12(auVar64[0xe] ^ bVar82 ^ auVar120[0xe],
                               CONCAT11(auVar64[0xd] ^ bVar81 ^ auVar120[0xd],
                                        auVar64[0xc] ^ bVar80 ^ auVar120[0xc])));
        pbVar18 = pbVar18 + 0x40;
      } while (lVar23 != 0);
      if (uVar2 == 0) {
        return 0;
      }
    }
    puVar24 = (uint *)(param_1 + lVar21 * 0x10 + 8);
    lVar21 = uVar20 - lVar21;
    do {
      uVar1 = *puVar24;
      uVar2 = puVar24[1];
      uVar4 = puVar24[-1];
      uVar3 = puVar24[2];
      lVar21 = lVar21 + -1;
      uVar6 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
      uVar10 = uVar4 >> 0x10 | uVar4 << 0x10;
      uVar7 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
      uVar5 = uVar2 >> 8 & 0xff00ff | (uVar2 & 0xff00ff) << 8;
      uVar8 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
      uVar2 = uVar10 ^ (uVar7 >> 0x10 | uVar7 << 0x10);
      uVar7 = uVar5 ^ uVar1;
      uVar8 = (uVar8 >> 0x10 | uVar8 << 0x10) ^ (uVar3 >> 0x10 | uVar3 << 0x10);
      uVar3 = uVar3 ^ uVar2;
      uVar9 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
      uVar7 = (uVar6 >> 0x10 | uVar6 << 0x10) ^ uVar10 ^
              (uVar7 >> 8 & 0xff00ff | (uVar7 & 0xff00ff) << 8);
      uVar3 = uVar7 ^ (uVar8 >> 0x10 | uVar8 << 0x10);
      *puVar24 = uVar8 ^ uVar4 ^ uVar7;
      puVar24[1] = (uVar9 >> 0x10 | uVar9 << 0x10) ^ (uVar7 >> 0x10 | uVar7 << 0x10);
      uVar7 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
      puVar24[2] = uVar5 ^ uVar2 ^ (uVar7 >> 0x10 | uVar7 << 0x10);
      puVar24[-1] = (uVar3 >> 8 & 0xff00ff | (uVar3 & 0xff00ff) << 8) ^
                    (uVar1 >> 0x10 | uVar1 << 0x10);
      puVar24 = puVar24 + 4;
    } while (lVar21 != 0);
  }
  return 0;
}

