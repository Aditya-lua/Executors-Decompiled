
ulong FUN_002aa87c(byte *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                  undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                  undefined1 param_7 [16],undefined8 param_8,undefined8 param_9,ulong param_10,
                  undefined8 param_11)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  bool bVar7;
  long *plVar8;
  ulong uVar9;
  int iVar10;
  long in_x9;
  byte *pbVar11;
  ulong *puVar12;
  uint uVar13;
  undefined8 *in_x10;
  ulong uVar14;
  long lVar15;
  long in_x11;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  int iVar19;
  undefined8 *puVar20;
  long *unaff_x19;
  int iVar21;
  int iVar22;
  long unaff_x22;
  uint uVar23;
  ulong unaff_x23;
  uint uVar24;
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
  undefined1 auVar42 [16];
  byte bVar58;
  byte bVar66;
  undefined8 uVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar67;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  undefined8 uVar68;
  byte bVar76;
  byte bVar84;
  undefined8 uVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar85;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar93;
  undefined8 uVar86;
  undefined8 uVar94;
  undefined8 uVar95;
  undefined8 uVar96;
  undefined8 uVar97;
  undefined8 uVar98;
  undefined8 uVar99;
  undefined8 uVar100;
  undefined8 uVar101;
  
  uVar97 = param_7._8_8_;
  uVar96 = param_7._0_8_;
  uVar95 = param_6._8_8_;
  uVar94 = param_6._0_8_;
  uVar86 = param_5._8_8_;
  uVar77 = param_5._0_8_;
  uVar68 = param_4._8_8_;
  uVar59 = param_4._0_8_;
  bVar57 = param_3[0xf];
  bVar56 = param_3[0xe];
  bVar55 = param_3[0xd];
  bVar54 = param_3[0xc];
  bVar53 = param_3[0xb];
  bVar52 = param_3[10];
  bVar51 = param_3[9];
  bVar50 = param_3[8];
  bVar49 = param_3[7];
  bVar48 = param_3[6];
  bVar47 = param_3[5];
  bVar46 = param_3[4];
  bVar45 = param_3[3];
  bVar44 = param_3[2];
  bVar43 = param_3[1];
  bVar41 = param_3[0];
  bVar40 = param_2[0xf];
  bVar39 = param_2[0xe];
  bVar38 = param_2[0xd];
  bVar37 = param_2[0xc];
  bVar36 = param_2[0xb];
  bVar35 = param_2[10];
  bVar34 = param_2[9];
  bVar33 = param_2[8];
  bVar32 = param_2[7];
  bVar31 = param_2[6];
  bVar30 = param_2[5];
  bVar29 = param_2[4];
  bVar28 = param_2[3];
  bVar27 = param_2[2];
  bVar26 = param_2[1];
  bVar25 = param_2[0];
  while( true ) {
    uVar99 = in_x10[1];
    uVar98 = *in_x10;
    uVar101 = in_x10[3];
    uVar100 = in_x10[2];
    bVar25 = (byte)uVar94 | bVar25;
    bVar26 = (byte)((ulong)uVar94 >> 8) | bVar26;
    bVar27 = (byte)((ulong)uVar94 >> 0x10) | bVar27;
    bVar28 = (byte)((ulong)uVar94 >> 0x18) | bVar28;
    bVar29 = (byte)((ulong)uVar94 >> 0x20) | bVar29;
    bVar30 = (byte)((ulong)uVar94 >> 0x28) | bVar30;
    bVar31 = (byte)((ulong)uVar94 >> 0x30) | bVar31;
    bVar32 = (byte)((ulong)uVar94 >> 0x38) | bVar32;
    bVar33 = (byte)uVar95 | bVar33;
    bVar34 = (byte)((ulong)uVar95 >> 8) | bVar34;
    bVar35 = (byte)((ulong)uVar95 >> 0x10) | bVar35;
    bVar36 = (byte)((ulong)uVar95 >> 0x18) | bVar36;
    bVar37 = (byte)((ulong)uVar95 >> 0x20) | bVar37;
    bVar38 = (byte)((ulong)uVar95 >> 0x28) | bVar38;
    bVar39 = (byte)((ulong)uVar95 >> 0x30) | bVar39;
    bVar40 = (byte)((ulong)uVar95 >> 0x38) | bVar40;
    bVar41 = (byte)uVar96 | bVar41;
    bVar43 = (byte)((ulong)uVar96 >> 8) | bVar43;
    bVar44 = (byte)((ulong)uVar96 >> 0x10) | bVar44;
    bVar45 = (byte)((ulong)uVar96 >> 0x18) | bVar45;
    bVar46 = (byte)((ulong)uVar96 >> 0x20) | bVar46;
    bVar47 = (byte)((ulong)uVar96 >> 0x28) | bVar47;
    bVar48 = (byte)((ulong)uVar96 >> 0x30) | bVar48;
    bVar49 = (byte)((ulong)uVar96 >> 0x38) | bVar49;
    bVar50 = (byte)uVar97 | bVar50;
    bVar51 = (byte)((ulong)uVar97 >> 8) | bVar51;
    bVar52 = (byte)((ulong)uVar97 >> 0x10) | bVar52;
    bVar53 = (byte)((ulong)uVar97 >> 0x18) | bVar53;
    bVar54 = (byte)((ulong)uVar97 >> 0x20) | bVar54;
    bVar55 = (byte)((ulong)uVar97 >> 0x28) | bVar55;
    bVar56 = (byte)((ulong)uVar97 >> 0x30) | bVar56;
    bVar57 = (byte)((ulong)uVar97 >> 0x38) | bVar57;
    bVar58 = (byte)uVar98 | (byte)uVar59;
    bVar60 = (byte)((ulong)uVar98 >> 8) | (byte)((ulong)uVar59 >> 8);
    bVar61 = (byte)((ulong)uVar98 >> 0x10) | (byte)((ulong)uVar59 >> 0x10);
    bVar62 = (byte)((ulong)uVar98 >> 0x18) | (byte)((ulong)uVar59 >> 0x18);
    bVar63 = (byte)((ulong)uVar98 >> 0x20) | (byte)((ulong)uVar59 >> 0x20);
    bVar64 = (byte)((ulong)uVar98 >> 0x28) | (byte)((ulong)uVar59 >> 0x28);
    bVar65 = (byte)((ulong)uVar98 >> 0x30) | (byte)((ulong)uVar59 >> 0x30);
    bVar66 = (byte)((ulong)uVar98 >> 0x38) | (byte)((ulong)uVar59 >> 0x38);
    uVar59 = CONCAT17(bVar66,CONCAT16(bVar65,CONCAT15(bVar64,CONCAT14(bVar63,CONCAT13(bVar62,
                                                  CONCAT12(bVar61,CONCAT11(bVar60,bVar58)))))));
    bVar67 = (byte)uVar99 | (byte)uVar68;
    bVar69 = (byte)((ulong)uVar99 >> 8) | (byte)((ulong)uVar68 >> 8);
    bVar70 = (byte)((ulong)uVar99 >> 0x10) | (byte)((ulong)uVar68 >> 0x10);
    bVar71 = (byte)((ulong)uVar99 >> 0x18) | (byte)((ulong)uVar68 >> 0x18);
    bVar72 = (byte)((ulong)uVar99 >> 0x20) | (byte)((ulong)uVar68 >> 0x20);
    bVar73 = (byte)((ulong)uVar99 >> 0x28) | (byte)((ulong)uVar68 >> 0x28);
    bVar74 = (byte)((ulong)uVar99 >> 0x30) | (byte)((ulong)uVar68 >> 0x30);
    bVar75 = (byte)((ulong)uVar99 >> 0x38) | (byte)((ulong)uVar68 >> 0x38);
    uVar68 = CONCAT17(bVar75,CONCAT16(bVar74,CONCAT15(bVar73,CONCAT14(bVar72,CONCAT13(bVar71,
                                                  CONCAT12(bVar70,CONCAT11(bVar69,bVar67)))))));
    bVar76 = (byte)uVar100 | (byte)uVar77;
    bVar78 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar77 >> 8);
    bVar79 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar77 >> 0x10);
    bVar80 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar77 >> 0x18);
    bVar81 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar77 >> 0x20);
    bVar82 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar77 >> 0x28);
    bVar83 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar77 >> 0x30);
    bVar84 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar77 >> 0x38);
    uVar77 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(bVar80,
                                                  CONCAT12(bVar79,CONCAT11(bVar78,bVar76)))))));
    bVar85 = (byte)uVar101 | (byte)uVar86;
    bVar87 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar86 >> 8);
    bVar88 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
    bVar89 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
    bVar90 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
    bVar91 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
    bVar92 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
    bVar93 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
    uVar86 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(bVar89,
                                                  CONCAT12(bVar88,CONCAT11(bVar87,bVar85)))))));
    in_x11 = in_x11 + -8;
    if (in_x11 == 0) break;
    uVar95 = in_x10[5];
    uVar94 = in_x10[4];
    uVar97 = in_x10[7];
    uVar96 = in_x10[6];
    in_x10 = in_x10 + 8;
  }
  bVar76 = bVar76 | bVar58 | bVar41 | bVar25;
  bVar78 = bVar78 | bVar60 | bVar43 | bVar26;
  bVar79 = bVar79 | bVar61 | bVar44 | bVar27;
  bVar80 = bVar80 | bVar62 | bVar45 | bVar28;
  bVar81 = bVar81 | bVar63 | bVar46 | bVar29;
  bVar82 = bVar82 | bVar64 | bVar47 | bVar30;
  bVar83 = bVar83 | bVar65 | bVar48 | bVar31;
  bVar84 = bVar84 | bVar66 | bVar49 | bVar32;
  bVar85 = bVar85 | bVar67 | bVar50 | bVar33;
  bVar87 = bVar87 | bVar69 | bVar51 | bVar34;
  bVar88 = bVar88 | bVar70 | bVar52 | bVar35;
  bVar89 = bVar89 | bVar71 | bVar53 | bVar36;
  bVar90 = bVar90 | bVar72 | bVar54 | bVar37;
  bVar91 = bVar91 | bVar73 | bVar55 | bVar38;
  bVar92 = bVar92 | bVar74 | bVar56 | bVar39;
  bVar93 = bVar93 | bVar75 | bVar57 | bVar40;
  auVar42[1] = bVar78;
  auVar42[0] = bVar76;
  auVar42[2] = bVar79;
  auVar42[3] = bVar80;
  auVar42[4] = bVar81;
  auVar42[5] = bVar82;
  auVar42[6] = bVar83;
  auVar42[7] = bVar84;
  auVar42[8] = bVar85;
  auVar42[9] = bVar87;
  auVar42[10] = bVar88;
  auVar42[0xb] = bVar89;
  auVar42[0xc] = bVar90;
  auVar42[0xd] = bVar91;
  auVar42[0xe] = bVar92;
  auVar42[0xf] = bVar93;
  auVar4[1] = bVar78;
  auVar4[0] = bVar76;
  auVar4[2] = bVar79;
  auVar4[3] = bVar80;
  auVar4[4] = bVar81;
  auVar4[5] = bVar82;
  auVar4[6] = bVar83;
  auVar4[7] = bVar84;
  auVar4[8] = bVar85;
  auVar4[9] = bVar87;
  auVar4[10] = bVar88;
  auVar4[0xb] = bVar89;
  auVar4[0xc] = bVar90;
  auVar4[0xd] = bVar91;
  auVar4[0xe] = bVar92;
  auVar4[0xf] = bVar93;
  auVar42 = NEON_ext(auVar42,auVar4,8,1);
  uVar14 = CONCAT17(bVar84 | auVar42[7],
                    CONCAT16(bVar83 | auVar42[6],
                             CONCAT15(bVar82 | auVar42[5],
                                      CONCAT14(bVar81 | auVar42[4],
                                               CONCAT13(bVar80 | auVar42[3],
                                                        CONCAT12(bVar79 | auVar42[2],
                                                                 CONCAT11(bVar78 | auVar42[1],
                                                                          bVar76 | auVar42[0])))))))
  ;
  if (in_x9 != unaff_x22) {
    lVar16 = unaff_x22 - in_x9;
    puVar12 = (ulong *)(param_1 + in_x9 * 8);
    do {
      uVar14 = *puVar12 | uVar14;
      lVar16 = lVar16 + -1;
      puVar12 = puVar12 + 1;
    } while (lVar16 != 0);
  }
  if (uVar14 != 0) {
    if ((int)unaff_x19[5] == 0) {
      uVar23 = (uint)unaff_x23;
      if (((int)uVar23 < 1) || ((*param_1 & 1) == 0)) goto LAB_002aad14;
      pbVar11 = param_1 + unaff_x23 * 8;
      uVar14 = unaff_x23;
      do {
        pbVar11 = pbVar11 + -8;
        uVar13 = (uint)uVar14;
        uVar14 = (ulong)(uVar13 - 1);
        if ((int)uVar13 < 1) {
          uVar13 = 0;
          break;
        }
      } while (*(long *)pbVar11 == 0);
      if (uVar13 != uVar23) goto LAB_002aad00;
      pbVar11 = param_1 + unaff_x23 * 8;
      uVar13 = ~uVar23;
      iVar10 = uVar23 << 6;
      do {
        pbVar11 = pbVar11 + -8;
        iVar19 = (int)unaff_x23;
        unaff_x23 = (ulong)(iVar19 - 1);
        if (iVar19 < 1) goto LAB_002aad0c;
        uVar13 = uVar13 - 0x40;
        iVar10 = iVar10 + -0x40;
      } while (*(long *)pbVar11 == 0);
      uVar9 = *(ulong *)(param_1 + unaff_x23 * 8);
      bVar7 = uVar9 >> 0x20 != 0;
      uVar14 = uVar9 >> 0x20;
      if (!bVar7) {
        uVar14 = uVar9;
      }
      uVar17 = uVar14 >> 0x10;
      uVar18 = uVar17;
      if (uVar17 == 0) {
        uVar18 = uVar14;
      }
      uVar2 = (uint)(uVar17 != 0) * 0x10;
      uVar14 = uVar18 >> 8;
      if (uVar18 < 0x100) {
        uVar14 = uVar18;
      }
      uVar17 = uVar14 >> 4;
      if (uVar14 < 0x10) {
        uVar17 = uVar14;
      }
      uVar1 = uVar17 >> 2;
      if (uVar17 < 4) {
        uVar1 = uVar17;
      }
      uVar24 = (uint)(uVar9 != 0);
      uVar3 = uVar2 | (uint)bVar7 << 5 | (uint)(0xff < uVar18) << 3 | (uint)(0xf < uVar14) << 2 |
              (uint)(3 < uVar17) << 1 | uVar24;
      if (1 < uVar1) {
        uVar3 = uVar3 + 1;
      }
      uVar3 = uVar3 + iVar10;
      if (uVar3 == 1) {
        *(undefined4 *)(unaff_x19 + 2) = 0;
        *(undefined4 *)(unaff_x19 + 1) = 0;
        uVar14 = func_0x0029afb8();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        uVar13 = *(uint *)(unaff_x19 + 1);
        if (uVar23 != uVar13) {
          _bzero(*unaff_x19 + (long)(int)uVar13 * 8,(unaff_x22 - (int)uVar13) * 8);
        }
        *(uint *)(unaff_x19 + 1) = uVar23;
        return 1;
      }
      if (uVar3 == 0) goto LAB_002aad0c;
      if (uVar23 * 0x40 < uVar3) goto LAB_002aad04;
      iVar21 = (uint)(0xff < uVar18) * 8;
      iVar22 = (uint)(0xf < uVar14) * 4;
      iVar19 = (uint)(3 < uVar17) * 2;
      uVar3 = ((uint)bVar7 * 0x20 + uVar2 + iVar21 + iVar22 + uVar24 + iVar19 + (uint)(1 < uVar1) +
              iVar10) - 1;
      if ((int)uVar3 < 0) {
LAB_002aaccc:
        uVar14 = 0;
      }
      else {
        uVar24 = uVar3 >> 6;
        if ((int)unaff_x19[1] <= (int)uVar24) {
          uVar14 = func_0x0029afb8();
          if ((int)uVar14 == 0) {
            return uVar14;
          }
          iVar10 = (int)unaff_x19[1];
          if (iVar10 <= (int)uVar24) {
            _bzero(*unaff_x19 + (long)iVar10 * 8,(ulong)(uVar24 - iVar10) * 8 + 8);
          }
          *(uint *)(unaff_x19 + 1) = uVar24 + 1;
        }
        *(ulong *)(*unaff_x19 + (ulong)uVar24 * 8) =
             *(ulong *)(*unaff_x19 + (ulong)uVar24 * 8) | 1L << (uVar3 & 0x3f);
        param_10 = (ulong)(-((uint)bVar7 * 0x20 + uVar2 + iVar21 + iVar22 + (uint)(uVar9 != 0) +
                             iVar19 + (uint)(1 < uVar1)) - uVar13);
        uVar14 = func_0x002a0b7c();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        if (uVar23 != *(uint *)(unaff_x19 + 4)) goto LAB_002aad08;
        uVar14 = func_0x002a3110();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        uVar14 = func_0x002a3110();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        uVar14 = func_0x002a3110();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        uVar14 = func_0x002a3110();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        uVar14 = func_0x002a3110();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        uVar14 = func_0x002a3110();
        if ((int)uVar14 == 0) {
          return uVar14;
        }
        uVar23 = *(uint *)(unaff_x19 + 4);
        lVar16 = (long)(int)uVar23;
        uVar13 = *(uint *)(unaff_x19 + 1);
        if (uVar23 < uVar13) {
          uVar14 = (int)uVar13 - lVar16;
          if (uVar14 < 8) {
            uVar9 = 0;
            lVar15 = lVar16;
LAB_002aac94:
            lVar16 = (int)uVar13 - lVar15;
            puVar12 = (ulong *)(*unaff_x19 + lVar15 * 8);
            do {
              uVar9 = *puVar12 | uVar9;
              lVar16 = lVar16 + -1;
              puVar12 = puVar12 + 1;
            } while (lVar16 != 0);
          }
          else {
            uVar18 = uVar14 & 0xfffffffffffffff8;
            lVar15 = uVar18 + lVar16;
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
            uVar59 = 0;
            uVar68 = 0;
            uVar77 = 0;
            uVar86 = 0;
            puVar20 = (undefined8 *)(*unaff_x19 + lVar16 * 8 + 0x20);
            uVar9 = uVar18;
            do {
              uVar95 = puVar20[-3];
              uVar94 = puVar20[-4];
              uVar97 = puVar20[-1];
              uVar96 = puVar20[-2];
              uVar99 = puVar20[1];
              uVar98 = *puVar20;
              uVar101 = puVar20[3];
              uVar100 = puVar20[2];
              bVar25 = (byte)uVar94 | bVar25;
              bVar26 = (byte)((ulong)uVar94 >> 8) | bVar26;
              bVar27 = (byte)((ulong)uVar94 >> 0x10) | bVar27;
              bVar28 = (byte)((ulong)uVar94 >> 0x18) | bVar28;
              bVar29 = (byte)((ulong)uVar94 >> 0x20) | bVar29;
              bVar30 = (byte)((ulong)uVar94 >> 0x28) | bVar30;
              bVar31 = (byte)((ulong)uVar94 >> 0x30) | bVar31;
              bVar32 = (byte)((ulong)uVar94 >> 0x38) | bVar32;
              bVar33 = (byte)uVar95 | bVar33;
              bVar34 = (byte)((ulong)uVar95 >> 8) | bVar34;
              bVar35 = (byte)((ulong)uVar95 >> 0x10) | bVar35;
              bVar36 = (byte)((ulong)uVar95 >> 0x18) | bVar36;
              bVar37 = (byte)((ulong)uVar95 >> 0x20) | bVar37;
              bVar38 = (byte)((ulong)uVar95 >> 0x28) | bVar38;
              bVar39 = (byte)((ulong)uVar95 >> 0x30) | bVar39;
              bVar40 = (byte)((ulong)uVar95 >> 0x38) | bVar40;
              bVar41 = (byte)uVar96 | bVar41;
              bVar43 = (byte)((ulong)uVar96 >> 8) | bVar43;
              bVar44 = (byte)((ulong)uVar96 >> 0x10) | bVar44;
              bVar45 = (byte)((ulong)uVar96 >> 0x18) | bVar45;
              bVar46 = (byte)((ulong)uVar96 >> 0x20) | bVar46;
              bVar47 = (byte)((ulong)uVar96 >> 0x28) | bVar47;
              bVar48 = (byte)((ulong)uVar96 >> 0x30) | bVar48;
              bVar49 = (byte)((ulong)uVar96 >> 0x38) | bVar49;
              bVar50 = (byte)uVar97 | bVar50;
              bVar51 = (byte)((ulong)uVar97 >> 8) | bVar51;
              bVar52 = (byte)((ulong)uVar97 >> 0x10) | bVar52;
              bVar53 = (byte)((ulong)uVar97 >> 0x18) | bVar53;
              bVar54 = (byte)((ulong)uVar97 >> 0x20) | bVar54;
              bVar55 = (byte)((ulong)uVar97 >> 0x28) | bVar55;
              bVar56 = (byte)((ulong)uVar97 >> 0x30) | bVar56;
              bVar57 = (byte)((ulong)uVar97 >> 0x38) | bVar57;
              bVar58 = (byte)uVar98 | (byte)uVar59;
              bVar60 = (byte)((ulong)uVar98 >> 8) | (byte)((ulong)uVar59 >> 8);
              bVar61 = (byte)((ulong)uVar98 >> 0x10) | (byte)((ulong)uVar59 >> 0x10);
              bVar62 = (byte)((ulong)uVar98 >> 0x18) | (byte)((ulong)uVar59 >> 0x18);
              bVar63 = (byte)((ulong)uVar98 >> 0x20) | (byte)((ulong)uVar59 >> 0x20);
              bVar64 = (byte)((ulong)uVar98 >> 0x28) | (byte)((ulong)uVar59 >> 0x28);
              bVar65 = (byte)((ulong)uVar98 >> 0x30) | (byte)((ulong)uVar59 >> 0x30);
              bVar66 = (byte)((ulong)uVar98 >> 0x38) | (byte)((ulong)uVar59 >> 0x38);
              uVar59 = CONCAT17(bVar66,CONCAT16(bVar65,CONCAT15(bVar64,CONCAT14(bVar63,CONCAT13(
                                                  bVar62,CONCAT12(bVar61,CONCAT11(bVar60,bVar58)))))
                                               ));
              bVar67 = (byte)uVar99 | (byte)uVar68;
              bVar69 = (byte)((ulong)uVar99 >> 8) | (byte)((ulong)uVar68 >> 8);
              bVar70 = (byte)((ulong)uVar99 >> 0x10) | (byte)((ulong)uVar68 >> 0x10);
              bVar71 = (byte)((ulong)uVar99 >> 0x18) | (byte)((ulong)uVar68 >> 0x18);
              bVar72 = (byte)((ulong)uVar99 >> 0x20) | (byte)((ulong)uVar68 >> 0x20);
              bVar73 = (byte)((ulong)uVar99 >> 0x28) | (byte)((ulong)uVar68 >> 0x28);
              bVar74 = (byte)((ulong)uVar99 >> 0x30) | (byte)((ulong)uVar68 >> 0x30);
              bVar75 = (byte)((ulong)uVar99 >> 0x38) | (byte)((ulong)uVar68 >> 0x38);
              uVar68 = CONCAT17(bVar75,CONCAT16(bVar74,CONCAT15(bVar73,CONCAT14(bVar72,CONCAT13(
                                                  bVar71,CONCAT12(bVar70,CONCAT11(bVar69,bVar67)))))
                                               ));
              bVar76 = (byte)uVar100 | (byte)uVar77;
              bVar78 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar77 >> 8);
              bVar79 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar77 >> 0x10);
              bVar80 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar77 >> 0x18);
              bVar81 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar77 >> 0x20);
              bVar82 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar77 >> 0x28);
              bVar83 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar77 >> 0x30);
              bVar84 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar77 >> 0x38);
              uVar77 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
                                                  bVar80,CONCAT12(bVar79,CONCAT11(bVar78,bVar76)))))
                                               ));
              bVar85 = (byte)uVar101 | (byte)uVar86;
              bVar87 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar86 >> 8);
              bVar88 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
              bVar89 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
              bVar90 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
              bVar91 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
              bVar92 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
              bVar93 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
              uVar86 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(
                                                  bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar85)))))
                                               ));
              uVar9 = uVar9 - 8;
              puVar20 = puVar20 + 8;
            } while (uVar9 != 0);
            bVar76 = bVar76 | bVar58 | bVar41 | bVar25;
            bVar78 = bVar78 | bVar60 | bVar43 | bVar26;
            bVar79 = bVar79 | bVar61 | bVar44 | bVar27;
            bVar80 = bVar80 | bVar62 | bVar45 | bVar28;
            bVar81 = bVar81 | bVar63 | bVar46 | bVar29;
            bVar82 = bVar82 | bVar64 | bVar47 | bVar30;
            bVar83 = bVar83 | bVar65 | bVar48 | bVar31;
            bVar84 = bVar84 | bVar66 | bVar49 | bVar32;
            bVar85 = bVar85 | bVar67 | bVar50 | bVar33;
            bVar87 = bVar87 | bVar69 | bVar51 | bVar34;
            bVar88 = bVar88 | bVar70 | bVar52 | bVar35;
            bVar89 = bVar89 | bVar71 | bVar53 | bVar36;
            bVar90 = bVar90 | bVar72 | bVar54 | bVar37;
            bVar91 = bVar91 | bVar73 | bVar55 | bVar38;
            bVar92 = bVar92 | bVar74 | bVar56 | bVar39;
            bVar93 = bVar93 | bVar75 | bVar57 | bVar40;
            auVar5[1] = bVar78;
            auVar5[0] = bVar76;
            auVar5[2] = bVar79;
            auVar5[3] = bVar80;
            auVar5[4] = bVar81;
            auVar5[5] = bVar82;
            auVar5[6] = bVar83;
            auVar5[7] = bVar84;
            auVar5[8] = bVar85;
            auVar5[9] = bVar87;
            auVar5[10] = bVar88;
            auVar5[0xb] = bVar89;
            auVar5[0xc] = bVar90;
            auVar5[0xd] = bVar91;
            auVar5[0xe] = bVar92;
            auVar5[0xf] = bVar93;
            auVar6[1] = bVar78;
            auVar6[0] = bVar76;
            auVar6[2] = bVar79;
            auVar6[3] = bVar80;
            auVar6[4] = bVar81;
            auVar6[5] = bVar82;
            auVar6[6] = bVar83;
            auVar6[7] = bVar84;
            auVar6[8] = bVar85;
            auVar6[9] = bVar87;
            auVar6[10] = bVar88;
            auVar6[0xb] = bVar89;
            auVar6[0xc] = bVar90;
            auVar6[0xd] = bVar91;
            auVar6[0xe] = bVar92;
            auVar6[0xf] = bVar93;
            auVar42 = NEON_ext(auVar5,auVar6,8,1);
            uVar9 = CONCAT17(bVar84 | auVar42[7],
                             CONCAT16(bVar83 | auVar42[6],
                                      CONCAT15(bVar82 | auVar42[5],
                                               CONCAT14(bVar81 | auVar42[4],
                                                        CONCAT13(bVar80 | auVar42[3],
                                                                 CONCAT12(bVar79 | auVar42[2],
                                                                          CONCAT11(bVar78 | auVar42[
                                                  1],bVar76 | auVar42[0])))))));
            if (uVar14 != uVar18) goto LAB_002aac94;
          }
          if (uVar9 != 0) {
            func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x19e);
            goto LAB_002aaccc;
          }
        }
        else {
          uVar14 = func_0x0029afb8();
          if ((int)uVar14 == 0) {
            return uVar14;
          }
          uVar13 = *(uint *)(unaff_x19 + 1);
          if (uVar23 != uVar13) {
            _bzero(*unaff_x19 + (long)(int)uVar13 * 8,(lVar16 - (int)uVar13) * 8);
          }
        }
        *(uint *)(unaff_x19 + 1) = uVar23;
        uVar14 = 1;
      }
      return uVar14;
    }
    func_0x0079e00c();
LAB_002aad00:
    func_0x0079dfe4();
LAB_002aad04:
    func_0x0079df6c();
LAB_002aad08:
    func_0x0079df94();
LAB_002aad0c:
    func_0x0079dfbc();
  }
  func_0x0079df1c();
LAB_002aad14:
  auVar42 = func_0x0079df44();
  uVar59 = auVar42._8_8_;
  plVar8 = auVar42._0_8_;
  func_0x00373db8(uVar59);
  lVar16 = *plVar8;
  func_0x00373df0(uVar59);
  if (lVar16 != 0) {
    return 1;
  }
  func_0x00373dd4(uVar59);
  lVar16 = *plVar8;
  if (lVar16 == 0) {
    lVar16 = func_0x002a4fe0(param_10,param_11);
    *plVar8 = lVar16;
  }
  func_0x00373e0c(uVar59);
  return (ulong)(lVar16 != 0);
}

