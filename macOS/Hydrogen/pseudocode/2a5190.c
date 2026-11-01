
ulong FUN_002a5190(void)

{
  undefined8 uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  ulong uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  ulong uVar9;
  ulong uVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  int iVar21;
  long lVar22;
  long *plVar23;
  long *plVar24;
  undefined8 *puVar25;
  undefined8 *puVar26;
  long *plVar27;
  long *plVar28;
  int in_w8;
  undefined4 uVar29;
  ulong uVar30;
  ulong *puVar31;
  ulong uVar32;
  ulong uVar33;
  undefined1 (*pauVar34) [16];
  ulong uVar35;
  ulong uVar36;
  ulong *puVar37;
  ulong uVar38;
  ulong *puVar39;
  ulong *puVar40;
  long unaff_x19;
  long *unaff_x21;
  undefined4 *unaff_x22;
  long *unaff_x27;
  byte bVar41;
  undefined1 uVar42;
  byte bVar43;
  undefined1 uVar44;
  byte bVar45;
  undefined1 uVar46;
  byte bVar47;
  undefined1 uVar48;
  byte bVar49;
  undefined1 uVar50;
  byte bVar51;
  undefined1 uVar52;
  byte bVar53;
  undefined1 uVar54;
  byte bVar55;
  undefined1 uVar56;
  byte bVar57;
  undefined1 uVar58;
  byte bVar59;
  undefined1 uVar60;
  byte bVar61;
  undefined1 uVar62;
  byte bVar63;
  undefined1 uVar64;
  byte bVar65;
  undefined1 uVar66;
  byte bVar67;
  undefined1 uVar68;
  byte bVar69;
  undefined1 uVar70;
  byte bVar71;
  undefined1 uVar72;
  byte bVar73;
  ulong uVar74;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  undefined1 auVar75 [16];
  undefined1 auVar76 [16];
  ulong uVar85;
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
  undefined1 uVar103;
  byte bVar104;
  undefined1 uVar105;
  byte bVar106;
  undefined1 uVar107;
  byte bVar108;
  undefined1 uVar109;
  byte bVar110;
  undefined1 uVar111;
  byte bVar112;
  undefined1 uVar113;
  byte bVar114;
  undefined1 uVar115;
  byte bVar116;
  byte bVar117;
  byte bVar118;
  byte bVar119;
  byte bVar120;
  byte bVar121;
  byte bVar122;
  byte bVar123;
  byte bVar124;
  byte bVar125;
  undefined1 uVar126;
  byte bVar127;
  undefined1 uVar128;
  byte bVar129;
  undefined1 uVar130;
  byte bVar131;
  undefined1 uVar132;
  byte bVar133;
  undefined1 uVar134;
  byte bVar135;
  undefined1 uVar136;
  byte bVar137;
  undefined1 uVar138;
  ulong uVar139;
  undefined1 auVar140 [16];
  ulong uVar141;
  ulong uVar142;
  undefined1 auVar143 [16];
  undefined1 auVar144 [16];
  undefined1 auVar145 [16];
  undefined1 auVar146 [16];
  
  if (in_w8 == 0) {
    uVar1 = *(undefined8 *)(unaff_x19 + 0x20);
    uVar30 = *(ulong *)(unaff_x19 + 0x10);
    if (uVar30 == *(ulong *)(unaff_x19 + 0x18)) {
      uVar33 = 0x20;
      if (uVar30 != 0) {
        uVar33 = uVar30 * 3 >> 1;
      }
      if (((uVar33 <= uVar30) || (uVar33 >> 0x3d != 0)) ||
         (lVar22 = func_0x0036e48c(*(undefined8 *)(unaff_x19 + 8),uVar33 << 3), lVar22 == 0)) {
        *(undefined2 *)(unaff_x19 + 0x28) = 0x101;
        goto LAB_002a5208;
      }
      *(long *)(unaff_x19 + 8) = lVar22;
      *(ulong *)(unaff_x19 + 0x18) = uVar33;
      uVar30 = *(ulong *)(unaff_x19 + 0x10);
    }
    else {
      lVar22 = *(long *)(unaff_x19 + 8);
    }
    *(undefined8 *)(lVar22 + uVar30 * 8) = uVar1;
    *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  }
LAB_002a5208:
  plVar23 = (long *)func_0x0029e340();
  plVar24 = (long *)func_0x0029e340();
  puVar25 = (undefined8 *)func_0x0029e340();
  puVar26 = (undefined8 *)func_0x0029e340();
  uVar30 = 0;
  if (puVar26 != (undefined8 *)0x0) {
    *(undefined4 *)(puVar26 + 2) = 0;
    *(undefined4 *)(puVar26 + 1) = 0;
    uVar30 = func_0x0029c0b0(puVar25);
    if ((int)uVar30 != 0) {
      if (plVar24 != unaff_x27) {
        uVar30 = func_0x0029afb8(plVar24,(long)(int)unaff_x27[1]);
        if ((int)uVar30 == 0) goto LAB_002a57c8;
        uVar29 = 0;
        if ((int)unaff_x27[1] != 0) {
          _memcpy(*plVar24,*unaff_x27,(long)(int)unaff_x27[1] << 3);
          uVar29 = (undefined4)unaff_x27[1];
        }
        *(undefined4 *)(plVar24 + 1) = uVar29;
        *(int *)(plVar24 + 2) = (int)unaff_x27[2];
      }
      if (plVar23 != unaff_x21) {
        uVar30 = func_0x0029afb8(plVar23,(long)(int)unaff_x21[1]);
        if ((int)uVar30 == 0) goto LAB_002a57c8;
        uVar29 = 0;
        if ((int)unaff_x21[1] != 0) {
          _memcpy(*plVar23,*unaff_x21,(long)(int)unaff_x21[1] << 3);
          uVar29 = (undefined4)unaff_x21[1];
        }
        *(undefined4 *)(plVar23 + 1) = uVar29;
      }
      *(undefined4 *)(plVar23 + 2) = 0;
      while (uVar2 = *(uint *)(plVar24 + 1), uVar2 != 0) {
        uVar30 = (ulong)(int)uVar2;
        if (uVar2 < 8) {
          uVar32 = 0;
          uVar33 = 0;
LAB_002a534c:
          lVar22 = uVar30 - uVar32;
          puVar31 = (ulong *)(*plVar24 + uVar32 * 8);
          do {
            uVar33 = *puVar31 | uVar33;
            lVar22 = lVar22 + -1;
            puVar31 = puVar31 + 1;
          } while (lVar22 != 0);
        }
        else {
          uVar32 = uVar30 & 0xfffffffffffffff8;
          bVar41 = 0;
          bVar43 = 0;
          bVar45 = 0;
          bVar47 = 0;
          bVar49 = 0;
          bVar51 = 0;
          bVar53 = 0;
          bVar55 = 0;
          bVar57 = 0;
          bVar59 = 0;
          bVar61 = 0;
          bVar63 = 0;
          bVar65 = 0;
          bVar67 = 0;
          bVar69 = 0;
          bVar71 = 0;
          bVar73 = 0;
          bVar77 = 0;
          bVar78 = 0;
          bVar79 = 0;
          bVar80 = 0;
          bVar81 = 0;
          bVar82 = 0;
          bVar83 = 0;
          bVar84 = 0;
          bVar86 = 0;
          bVar87 = 0;
          bVar88 = 0;
          bVar89 = 0;
          bVar90 = 0;
          bVar91 = 0;
          bVar92 = 0;
          bVar93 = 0;
          bVar94 = 0;
          bVar95 = 0;
          bVar96 = 0;
          bVar97 = 0;
          bVar98 = 0;
          bVar99 = 0;
          bVar100 = 0;
          bVar101 = 0;
          bVar102 = 0;
          bVar104 = 0;
          bVar106 = 0;
          bVar108 = 0;
          bVar110 = 0;
          bVar112 = 0;
          bVar114 = 0;
          bVar116 = 0;
          bVar117 = 0;
          bVar118 = 0;
          bVar119 = 0;
          bVar120 = 0;
          bVar121 = 0;
          bVar122 = 0;
          bVar123 = 0;
          bVar124 = 0;
          bVar125 = 0;
          bVar127 = 0;
          bVar129 = 0;
          bVar131 = 0;
          bVar133 = 0;
          bVar135 = 0;
          bVar137 = 0;
          pauVar34 = (undefined1 (*) [16])(*plVar24 + 0x20);
          uVar33 = uVar32;
          do {
            auVar146 = pauVar34[-2];
            auVar140 = pauVar34[-1];
            auVar143 = *pauVar34;
            auVar145 = pauVar34[1];
            bVar41 = auVar146[0] | bVar41;
            bVar43 = auVar146[1] | bVar43;
            bVar45 = auVar146[2] | bVar45;
            bVar47 = auVar146[3] | bVar47;
            bVar49 = auVar146[4] | bVar49;
            bVar51 = auVar146[5] | bVar51;
            bVar53 = auVar146[6] | bVar53;
            bVar55 = auVar146[7] | bVar55;
            bVar57 = auVar146[8] | bVar57;
            bVar59 = auVar146[9] | bVar59;
            bVar61 = auVar146[10] | bVar61;
            bVar63 = auVar146[0xb] | bVar63;
            bVar65 = auVar146[0xc] | bVar65;
            bVar67 = auVar146[0xd] | bVar67;
            bVar69 = auVar146[0xe] | bVar69;
            bVar71 = auVar146[0xf] | bVar71;
            bVar73 = auVar140[0] | bVar73;
            bVar77 = auVar140[1] | bVar77;
            bVar78 = auVar140[2] | bVar78;
            bVar79 = auVar140[3] | bVar79;
            bVar80 = auVar140[4] | bVar80;
            bVar81 = auVar140[5] | bVar81;
            bVar82 = auVar140[6] | bVar82;
            bVar83 = auVar140[7] | bVar83;
            bVar84 = auVar140[8] | bVar84;
            bVar86 = auVar140[9] | bVar86;
            bVar87 = auVar140[10] | bVar87;
            bVar88 = auVar140[0xb] | bVar88;
            bVar89 = auVar140[0xc] | bVar89;
            bVar90 = auVar140[0xd] | bVar90;
            bVar91 = auVar140[0xe] | bVar91;
            bVar92 = auVar140[0xf] | bVar92;
            bVar93 = auVar143[0] | bVar93;
            bVar94 = auVar143[1] | bVar94;
            bVar95 = auVar143[2] | bVar95;
            bVar96 = auVar143[3] | bVar96;
            bVar97 = auVar143[4] | bVar97;
            bVar98 = auVar143[5] | bVar98;
            bVar99 = auVar143[6] | bVar99;
            bVar100 = auVar143[7] | bVar100;
            bVar101 = auVar143[8] | bVar101;
            bVar102 = auVar143[9] | bVar102;
            bVar104 = auVar143[10] | bVar104;
            bVar106 = auVar143[0xb] | bVar106;
            bVar108 = auVar143[0xc] | bVar108;
            bVar110 = auVar143[0xd] | bVar110;
            bVar112 = auVar143[0xe] | bVar112;
            bVar114 = auVar143[0xf] | bVar114;
            bVar116 = auVar145[0] | bVar116;
            bVar117 = auVar145[1] | bVar117;
            bVar118 = auVar145[2] | bVar118;
            bVar119 = auVar145[3] | bVar119;
            bVar120 = auVar145[4] | bVar120;
            bVar121 = auVar145[5] | bVar121;
            bVar122 = auVar145[6] | bVar122;
            bVar123 = auVar145[7] | bVar123;
            bVar124 = auVar145[8] | bVar124;
            bVar125 = auVar145[9] | bVar125;
            bVar127 = auVar145[10] | bVar127;
            bVar129 = auVar145[0xb] | bVar129;
            bVar131 = auVar145[0xc] | bVar131;
            bVar133 = auVar145[0xd] | bVar133;
            bVar135 = auVar145[0xe] | bVar135;
            bVar137 = auVar145[0xf] | bVar137;
            uVar33 = uVar33 - 8;
            pauVar34 = pauVar34 + 4;
          } while (uVar33 != 0);
          bVar116 = bVar116 | bVar93 | bVar73 | bVar41;
          bVar117 = bVar117 | bVar94 | bVar77 | bVar43;
          bVar118 = bVar118 | bVar95 | bVar78 | bVar45;
          bVar119 = bVar119 | bVar96 | bVar79 | bVar47;
          bVar120 = bVar120 | bVar97 | bVar80 | bVar49;
          bVar121 = bVar121 | bVar98 | bVar81 | bVar51;
          bVar122 = bVar122 | bVar99 | bVar82 | bVar53;
          bVar123 = bVar123 | bVar100 | bVar83 | bVar55;
          bVar124 = bVar124 | bVar101 | bVar84 | bVar57;
          bVar125 = bVar125 | bVar102 | bVar86 | bVar59;
          bVar127 = bVar127 | bVar104 | bVar87 | bVar61;
          bVar129 = bVar129 | bVar106 | bVar88 | bVar63;
          bVar131 = bVar131 | bVar108 | bVar89 | bVar65;
          bVar133 = bVar133 | bVar110 | bVar90 | bVar67;
          bVar135 = bVar135 | bVar112 | bVar91 | bVar69;
          bVar137 = bVar137 | bVar114 | bVar92 | bVar71;
          auVar146[1] = bVar117;
          auVar146[0] = bVar116;
          auVar146[2] = bVar118;
          auVar146[3] = bVar119;
          auVar146[4] = bVar120;
          auVar146[5] = bVar121;
          auVar146[6] = bVar122;
          auVar146[7] = bVar123;
          auVar146[8] = bVar124;
          auVar146[9] = bVar125;
          auVar146[10] = bVar127;
          auVar146[0xb] = bVar129;
          auVar146[0xc] = bVar131;
          auVar146[0xd] = bVar133;
          auVar146[0xe] = bVar135;
          auVar146[0xf] = bVar137;
          auVar140[1] = bVar117;
          auVar140[0] = bVar116;
          auVar140[2] = bVar118;
          auVar140[3] = bVar119;
          auVar140[4] = bVar120;
          auVar140[5] = bVar121;
          auVar140[6] = bVar122;
          auVar140[7] = bVar123;
          auVar140[8] = bVar124;
          auVar140[9] = bVar125;
          auVar140[10] = bVar127;
          auVar140[0xb] = bVar129;
          auVar140[0xc] = bVar131;
          auVar140[0xd] = bVar133;
          auVar140[0xe] = bVar135;
          auVar140[0xf] = bVar137;
          auVar146 = NEON_ext(auVar146,auVar140,8,1);
          uVar33 = CONCAT17(bVar123 | auVar146[7],
                            CONCAT16(bVar122 | auVar146[6],
                                     CONCAT15(bVar121 | auVar146[5],
                                              CONCAT14(bVar120 | auVar146[4],
                                                       CONCAT13(bVar119 | auVar146[3],
                                                                CONCAT12(bVar118 | auVar146[2],
                                                                         CONCAT11(bVar117 | auVar146
                                                  [1],bVar116 | auVar146[0])))))));
          if (uVar32 != uVar30) goto LAB_002a534c;
        }
        if (uVar33 == 0) break;
        uVar33 = 0;
        uVar30 = 0;
        if (uVar2 == 0) goto LAB_002a539c;
LAB_002a538c:
        if ((*(ulong *)(*plVar24 + uVar30 * 8) >> (uVar33 & 0x3f) & 1) == 0) {
LAB_002a539c:
          do {
            iVar21 = *(int *)(puVar25 + 1);
            if ((0 < iVar21) && ((*(byte *)*puVar25 & 1) != 0)) {
              uVar30 = func_0x0029ae04(puVar25,puVar25);
              if ((int)uVar30 == 0) goto LAB_002a57c8;
              iVar21 = *(int *)(puVar25 + 1);
            }
            uVar30 = func_0x0029afb8(puVar25,(long)iVar21);
            if ((int)uVar30 == 0) goto LAB_002a57c8;
            puVar31 = (ulong *)*puVar25;
            uVar2 = *(uint *)(puVar25 + 1);
            uVar30 = (ulong)uVar2;
            if (uVar2 != 0) {
              uVar32 = (long)(int)uVar2 - 1;
              if (uVar32 != 0) {
                uVar36 = *puVar31;
                if (uVar2 < 9) {
                  uVar35 = 0;
                }
                else {
                  uVar35 = uVar32 & 0xfffffffffffffff8;
                  uVar42 = (undefined1)uVar36;
                  uVar44 = (undefined1)(uVar36 >> 8);
                  uVar46 = (undefined1)(uVar36 >> 0x10);
                  uVar48 = (undefined1)(uVar36 >> 0x18);
                  uVar50 = (undefined1)(uVar36 >> 0x20);
                  uVar52 = (undefined1)(uVar36 >> 0x28);
                  uVar54 = (undefined1)(uVar36 >> 0x30);
                  uVar56 = (undefined1)(uVar36 >> 0x38);
                  puVar37 = puVar31 + 4;
                  uVar38 = uVar35;
                  uVar58 = uVar42;
                  uVar60 = uVar44;
                  uVar62 = uVar46;
                  uVar64 = uVar48;
                  uVar66 = uVar50;
                  uVar68 = uVar52;
                  uVar70 = uVar54;
                  uVar72 = uVar56;
                  do {
                    auVar146 = *(undefined1 (*) [16])(puVar37 + -3);
                    puVar40 = puVar37 + -1;
                    uVar10 = *puVar37;
                    uVar103 = (undefined1)(uVar10 >> 8);
                    uVar105 = (undefined1)(uVar10 >> 0x10);
                    uVar107 = (undefined1)(uVar10 >> 0x18);
                    uVar109 = (undefined1)(uVar10 >> 0x20);
                    uVar111 = (undefined1)(uVar10 >> 0x28);
                    uVar113 = (undefined1)(uVar10 >> 0x30);
                    uVar115 = (undefined1)(uVar10 >> 0x38);
                    uVar9 = *puVar40;
                    puVar39 = puVar37 + 1;
                    uVar16 = puVar37[2];
                    uVar126 = (undefined1)(uVar16 >> 8);
                    uVar128 = (undefined1)(uVar16 >> 0x10);
                    uVar130 = (undefined1)(uVar16 >> 0x18);
                    uVar132 = (undefined1)(uVar16 >> 0x20);
                    uVar134 = (undefined1)(uVar16 >> 0x28);
                    uVar136 = (undefined1)(uVar16 >> 0x30);
                    uVar138 = (undefined1)(uVar16 >> 0x38);
                    uVar15 = *puVar39;
                    auVar143[1] = uVar44;
                    auVar143[0] = uVar42;
                    auVar143[2] = uVar46;
                    auVar143[3] = uVar48;
                    auVar143[4] = uVar50;
                    auVar143[5] = uVar52;
                    auVar143[6] = uVar54;
                    auVar143[7] = uVar56;
                    auVar143[8] = uVar58;
                    auVar143[9] = uVar60;
                    auVar143[10] = uVar62;
                    auVar143[0xb] = uVar64;
                    auVar143[0xc] = uVar66;
                    auVar143[0xd] = uVar68;
                    auVar143[0xe] = uVar70;
                    auVar143[0xf] = uVar72;
                    auVar140 = NEON_ext(auVar143,auVar146,8,1);
                    uVar36 = puVar37[4];
                    uVar58 = (undefined1)uVar36;
                    uVar60 = (undefined1)(uVar36 >> 8);
                    uVar62 = (undefined1)(uVar36 >> 0x10);
                    uVar64 = (undefined1)(uVar36 >> 0x18);
                    uVar66 = (undefined1)(uVar36 >> 0x20);
                    uVar68 = (undefined1)(uVar36 >> 0x28);
                    uVar70 = (undefined1)(uVar36 >> 0x30);
                    uVar72 = (undefined1)(uVar36 >> 0x38);
                    uVar5 = puVar37[3];
                    uVar42 = (undefined1)uVar5;
                    uVar44 = (undefined1)(uVar5 >> 8);
                    uVar46 = (undefined1)(uVar5 >> 0x10);
                    uVar48 = (undefined1)(uVar5 >> 0x18);
                    uVar50 = (undefined1)(uVar5 >> 0x20);
                    uVar52 = (undefined1)(uVar5 >> 0x28);
                    uVar54 = (undefined1)(uVar5 >> 0x30);
                    uVar56 = (undefined1)(uVar5 >> 0x38);
                    auVar144[9] = uVar103;
                    auVar144._0_9_ = *(unkbyte9 *)puVar40;
                    auVar144[10] = uVar105;
                    auVar144[0xb] = uVar107;
                    auVar144[0xc] = uVar109;
                    auVar144[0xd] = uVar111;
                    auVar144[0xe] = uVar113;
                    auVar144[0xf] = uVar115;
                    auVar143 = NEON_ext(auVar146,auVar144,8,1);
                    auVar6[9] = uVar103;
                    auVar6._0_9_ = *(unkbyte9 *)puVar40;
                    auVar6[10] = uVar105;
                    auVar6[0xb] = uVar107;
                    auVar6[0xc] = uVar109;
                    auVar6[0xd] = uVar111;
                    auVar6[0xe] = uVar113;
                    auVar6[0xf] = uVar115;
                    auVar11[9] = uVar126;
                    auVar11._0_9_ = *(unkbyte9 *)puVar39;
                    auVar11[10] = uVar128;
                    auVar11[0xb] = uVar130;
                    auVar11[0xc] = uVar132;
                    auVar11[0xd] = uVar134;
                    auVar11[0xe] = uVar136;
                    auVar11[0xf] = uVar138;
                    auVar144 = NEON_ext(auVar6,auVar11,8,1);
                    auVar145[9] = uVar60;
                    auVar145._0_9_ = *(unkbyte9 *)(puVar37 + 3);
                    auVar145[10] = uVar62;
                    auVar145[0xb] = uVar64;
                    auVar145[0xc] = uVar66;
                    auVar145[0xd] = uVar68;
                    auVar145[0xe] = uVar70;
                    auVar145[0xf] = uVar72;
                    auVar12[9] = uVar126;
                    auVar12._0_9_ = *(unkbyte9 *)puVar39;
                    auVar12[10] = uVar128;
                    auVar12[0xb] = uVar130;
                    auVar12[0xc] = uVar132;
                    auVar12[0xd] = uVar134;
                    auVar12[0xe] = uVar136;
                    auVar12[0xf] = uVar138;
                    auVar145 = NEON_ext(auVar12,auVar145,8,1);
                    uVar139 = auVar140._0_8_ >> 1;
                    uVar141 = auVar140._8_8_ >> 1;
                    uVar142 = auVar145._8_8_ >> 1;
                    *(char *)(puVar37 + -3) = (char)uVar141;
                    *(char *)((long)puVar37 + -0x17) = (char)(uVar141 >> 8);
                    *(char *)((long)puVar37 + -0x16) = (char)(uVar141 >> 0x10);
                    *(char *)((long)puVar37 + -0x15) = (char)(uVar141 >> 0x18);
                    *(char *)((long)puVar37 + -0x14) = (char)(uVar141 >> 0x20);
                    *(char *)((long)puVar37 + -0x13) = (char)(uVar141 >> 0x28);
                    *(char *)((long)puVar37 + -0x12) = (char)(uVar141 >> 0x30);
                    *(byte *)((long)puVar37 + -0x11) =
                         (byte)((ulong)(auVar146._8_8_ << 0x3f) >> 0x38) | auVar140[0xf] >> 1;
                    *(char *)(puVar37 + -4) = (char)uVar139;
                    *(char *)((long)puVar37 + -0x1f) = (char)(uVar139 >> 8);
                    *(char *)((long)puVar37 + -0x1e) = (char)(uVar139 >> 0x10);
                    *(char *)((long)puVar37 + -0x1d) = (char)(uVar139 >> 0x18);
                    *(char *)((long)puVar37 + -0x1c) = (char)(uVar139 >> 0x20);
                    *(char *)((long)puVar37 + -0x1b) = (char)(uVar139 >> 0x28);
                    *(char *)((long)puVar37 + -0x1a) = (char)(uVar139 >> 0x30);
                    *(byte *)((long)puVar37 + -0x19) =
                         (byte)((ulong)(auVar146._0_8_ << 0x3f) >> 0x38) | auVar140[7] >> 1;
                    puVar37[-1] = CONCAT17((byte)((uVar10 << 0x3f) >> 0x38) | auVar143[0xf] >> 1,
                                           (int7)(auVar143._8_8_ >> 1));
                    puVar37[-2] = CONCAT17((byte)((uVar9 << 0x3f) >> 0x38) | auVar143[7] >> 1,
                                           (int7)(auVar143._0_8_ >> 1));
                    auVar75._0_8_ =
                         CONCAT17((byte)((uVar5 << 0x3f) >> 0x38) | auVar145[7] >> 1,
                                  (int7)(auVar145._0_8_ >> 1));
                    auVar75[8] = (char)uVar142;
                    auVar75[9] = (char)(uVar142 >> 8);
                    auVar75[10] = (char)(uVar142 >> 0x10);
                    auVar75[0xb] = (char)(uVar142 >> 0x18);
                    auVar75[0xc] = (char)(uVar142 >> 0x20);
                    auVar75[0xd] = (char)(uVar142 >> 0x28);
                    auVar75[0xe] = (char)(uVar142 >> 0x30);
                    auVar75[0xf] = (byte)((uVar36 << 0x3f) >> 0x38) | auVar145[0xf] >> 1;
                    puVar37[1] = CONCAT17((byte)((uVar16 << 0x3f) >> 0x38) | auVar144[0xf] >> 1,
                                          (int7)(auVar144._8_8_ >> 1));
                    *puVar37 = CONCAT17((byte)((uVar15 << 0x3f) >> 0x38) | auVar144[7] >> 1,
                                        (int7)(auVar144._0_8_ >> 1));
                    puVar37[3] = auVar75._8_8_;
                    puVar37[2] = auVar75._0_8_;
                    uVar38 = uVar38 - 8;
                    puVar37 = puVar37 + 8;
                  } while (uVar38 != 0);
                  if (uVar32 == uVar35) goto code_r0x002a54b0;
                }
                lVar22 = ~uVar35 + (long)(int)uVar2;
                puVar37 = puVar31 + uVar35;
                do {
                  uVar38 = puVar37[1];
                  *puVar37 = uVar36 >> 1 | uVar38 << 0x3f;
                  lVar22 = lVar22 + -1;
                  uVar36 = uVar38;
                  puVar37 = puVar37 + 1;
                } while (lVar22 != 0);
              }
code_r0x002a54b0:
              puVar31[uVar32] = puVar31[uVar32] >> 1;
            }
            uVar33 = uVar33 + 1;
            puVar31 = puVar31 + uVar30;
            do {
              puVar31 = puVar31 + -1;
              iVar21 = (int)uVar30;
              uVar30 = (ulong)(iVar21 - 1);
              if (iVar21 < 1) {
                *(uint *)(puVar25 + 1) = uVar2 & (int)uVar2 >> 0x1f;
                if (-1 < (int)uVar2) {
                  *(undefined4 *)(puVar25 + 2) = 0;
                }
                uVar30 = uVar33 >> 6;
                if ((ulong)(long)(int)plVar24[1] <= uVar30) goto LAB_002a539c;
                goto LAB_002a538c;
              }
            } while (*puVar31 == 0);
            *(int *)(puVar25 + 1) = iVar21;
            uVar30 = uVar33 >> 6;
          } while ((ulong)(long)(int)plVar24[1] <= uVar30);
          goto LAB_002a538c;
        }
        if (((int)uVar33 != 0) &&
           (uVar30 = func_0x0029f130(plVar24,plVar24,uVar33), (int)uVar30 == 0)) goto LAB_002a57c8;
        uVar33 = 0;
code_r0x002a552c:
        uVar30 = (ulong)(int)plVar23[1];
        if ((uVar30 <= uVar33 >> 6) ||
           (lVar22 = *plVar23, (*(ulong *)(lVar22 + (uVar33 >> 6) * 8) >> (uVar33 & 0x3f) & 1) == 0)
           ) {
          iVar21 = *(int *)(puVar26 + 1);
          if ((0 < iVar21) && ((*(byte *)*puVar26 & 1) != 0)) {
            uVar30 = func_0x0029ae04(puVar26,puVar26);
            if ((int)uVar30 == 0) goto LAB_002a57c8;
            iVar21 = *(int *)(puVar26 + 1);
          }
          uVar30 = func_0x0029afb8(puVar26,(long)iVar21);
          if ((int)uVar30 == 0) goto LAB_002a57c8;
          puVar31 = (ulong *)*puVar26;
          uVar2 = *(uint *)(puVar26 + 1);
          uVar30 = (ulong)uVar2;
          if (uVar2 != 0) {
            uVar32 = (long)(int)uVar2 - 1;
            if (uVar32 != 0) {
              uVar36 = *puVar31;
              if (uVar2 < 9) {
                uVar35 = 0;
              }
              else {
                uVar35 = uVar32 & 0xfffffffffffffff8;
                uVar42 = (undefined1)uVar36;
                uVar44 = (undefined1)(uVar36 >> 8);
                uVar46 = (undefined1)(uVar36 >> 0x10);
                uVar48 = (undefined1)(uVar36 >> 0x18);
                uVar50 = (undefined1)(uVar36 >> 0x20);
                uVar52 = (undefined1)(uVar36 >> 0x28);
                uVar54 = (undefined1)(uVar36 >> 0x30);
                uVar56 = (undefined1)(uVar36 >> 0x38);
                puVar37 = puVar31 + 4;
                uVar38 = uVar35;
                uVar58 = uVar42;
                uVar60 = uVar44;
                uVar62 = uVar46;
                uVar64 = uVar48;
                uVar66 = uVar50;
                uVar68 = uVar52;
                uVar70 = uVar54;
                uVar72 = uVar56;
                do {
                  auVar146 = *(undefined1 (*) [16])(puVar37 + -3);
                  puVar40 = puVar37 + -1;
                  uVar10 = *puVar37;
                  uVar103 = (undefined1)(uVar10 >> 8);
                  uVar105 = (undefined1)(uVar10 >> 0x10);
                  uVar107 = (undefined1)(uVar10 >> 0x18);
                  uVar109 = (undefined1)(uVar10 >> 0x20);
                  uVar111 = (undefined1)(uVar10 >> 0x28);
                  uVar113 = (undefined1)(uVar10 >> 0x30);
                  uVar115 = (undefined1)(uVar10 >> 0x38);
                  uVar9 = *puVar40;
                  puVar39 = puVar37 + 1;
                  uVar16 = puVar37[2];
                  uVar126 = (undefined1)(uVar16 >> 8);
                  uVar128 = (undefined1)(uVar16 >> 0x10);
                  uVar130 = (undefined1)(uVar16 >> 0x18);
                  uVar132 = (undefined1)(uVar16 >> 0x20);
                  uVar134 = (undefined1)(uVar16 >> 0x28);
                  uVar136 = (undefined1)(uVar16 >> 0x30);
                  uVar138 = (undefined1)(uVar16 >> 0x38);
                  uVar15 = *puVar39;
                  auVar3[1] = uVar44;
                  auVar3[0] = uVar42;
                  auVar3[2] = uVar46;
                  auVar3[3] = uVar48;
                  auVar3[4] = uVar50;
                  auVar3[5] = uVar52;
                  auVar3[6] = uVar54;
                  auVar3[7] = uVar56;
                  auVar3[8] = uVar58;
                  auVar3[9] = uVar60;
                  auVar3[10] = uVar62;
                  auVar3[0xb] = uVar64;
                  auVar3[0xc] = uVar66;
                  auVar3[0xd] = uVar68;
                  auVar3[0xe] = uVar70;
                  auVar3[0xf] = uVar72;
                  auVar140 = NEON_ext(auVar3,auVar146,8,1);
                  uVar36 = puVar37[4];
                  uVar58 = (undefined1)uVar36;
                  uVar60 = (undefined1)(uVar36 >> 8);
                  uVar62 = (undefined1)(uVar36 >> 0x10);
                  uVar64 = (undefined1)(uVar36 >> 0x18);
                  uVar66 = (undefined1)(uVar36 >> 0x20);
                  uVar68 = (undefined1)(uVar36 >> 0x28);
                  uVar70 = (undefined1)(uVar36 >> 0x30);
                  uVar72 = (undefined1)(uVar36 >> 0x38);
                  uVar5 = puVar37[3];
                  uVar42 = (undefined1)uVar5;
                  uVar44 = (undefined1)(uVar5 >> 8);
                  uVar46 = (undefined1)(uVar5 >> 0x10);
                  uVar48 = (undefined1)(uVar5 >> 0x18);
                  uVar50 = (undefined1)(uVar5 >> 0x20);
                  uVar52 = (undefined1)(uVar5 >> 0x28);
                  uVar54 = (undefined1)(uVar5 >> 0x30);
                  uVar56 = (undefined1)(uVar5 >> 0x38);
                  auVar7[9] = uVar103;
                  auVar7._0_9_ = *(unkbyte9 *)puVar40;
                  auVar7[10] = uVar105;
                  auVar7[0xb] = uVar107;
                  auVar7[0xc] = uVar109;
                  auVar7[0xd] = uVar111;
                  auVar7[0xe] = uVar113;
                  auVar7[0xf] = uVar115;
                  auVar143 = NEON_ext(auVar146,auVar7,8,1);
                  auVar8[9] = uVar103;
                  auVar8._0_9_ = *(unkbyte9 *)puVar40;
                  auVar8[10] = uVar105;
                  auVar8[0xb] = uVar107;
                  auVar8[0xc] = uVar109;
                  auVar8[0xd] = uVar111;
                  auVar8[0xe] = uVar113;
                  auVar8[0xf] = uVar115;
                  auVar13[9] = uVar126;
                  auVar13._0_9_ = *(unkbyte9 *)puVar39;
                  auVar13[10] = uVar128;
                  auVar13[0xb] = uVar130;
                  auVar13[0xc] = uVar132;
                  auVar13[0xd] = uVar134;
                  auVar13[0xe] = uVar136;
                  auVar13[0xf] = uVar138;
                  auVar145 = NEON_ext(auVar8,auVar13,8,1);
                  auVar4[9] = uVar60;
                  auVar4._0_9_ = *(unkbyte9 *)(puVar37 + 3);
                  auVar4[10] = uVar62;
                  auVar4[0xb] = uVar64;
                  auVar4[0xc] = uVar66;
                  auVar4[0xd] = uVar68;
                  auVar4[0xe] = uVar70;
                  auVar4[0xf] = uVar72;
                  auVar14[9] = uVar126;
                  auVar14._0_9_ = *(unkbyte9 *)puVar39;
                  auVar14[10] = uVar128;
                  auVar14[0xb] = uVar130;
                  auVar14[0xc] = uVar132;
                  auVar14[0xd] = uVar134;
                  auVar14[0xe] = uVar136;
                  auVar14[0xf] = uVar138;
                  auVar144 = NEON_ext(auVar14,auVar4,8,1);
                  uVar139 = auVar140._0_8_ >> 1;
                  uVar141 = auVar140._8_8_ >> 1;
                  uVar142 = auVar144._8_8_ >> 1;
                  *(char *)(puVar37 + -3) = (char)uVar141;
                  *(char *)((long)puVar37 + -0x17) = (char)(uVar141 >> 8);
                  *(char *)((long)puVar37 + -0x16) = (char)(uVar141 >> 0x10);
                  *(char *)((long)puVar37 + -0x15) = (char)(uVar141 >> 0x18);
                  *(char *)((long)puVar37 + -0x14) = (char)(uVar141 >> 0x20);
                  *(char *)((long)puVar37 + -0x13) = (char)(uVar141 >> 0x28);
                  *(char *)((long)puVar37 + -0x12) = (char)(uVar141 >> 0x30);
                  *(byte *)((long)puVar37 + -0x11) =
                       (byte)((ulong)(auVar146._8_8_ << 0x3f) >> 0x38) | auVar140[0xf] >> 1;
                  *(char *)(puVar37 + -4) = (char)uVar139;
                  *(char *)((long)puVar37 + -0x1f) = (char)(uVar139 >> 8);
                  *(char *)((long)puVar37 + -0x1e) = (char)(uVar139 >> 0x10);
                  *(char *)((long)puVar37 + -0x1d) = (char)(uVar139 >> 0x18);
                  *(char *)((long)puVar37 + -0x1c) = (char)(uVar139 >> 0x20);
                  *(char *)((long)puVar37 + -0x1b) = (char)(uVar139 >> 0x28);
                  *(char *)((long)puVar37 + -0x1a) = (char)(uVar139 >> 0x30);
                  *(byte *)((long)puVar37 + -0x19) =
                       (byte)((ulong)(auVar146._0_8_ << 0x3f) >> 0x38) | auVar140[7] >> 1;
                  puVar37[-1] = CONCAT17((byte)((uVar10 << 0x3f) >> 0x38) | auVar143[0xf] >> 1,
                                         (int7)(auVar143._8_8_ >> 1));
                  puVar37[-2] = CONCAT17((byte)((uVar9 << 0x3f) >> 0x38) | auVar143[7] >> 1,
                                         (int7)(auVar143._0_8_ >> 1));
                  auVar76._0_8_ =
                       CONCAT17((byte)((uVar5 << 0x3f) >> 0x38) | auVar144[7] >> 1,
                                (int7)(auVar144._0_8_ >> 1));
                  auVar76[8] = (char)uVar142;
                  auVar76[9] = (char)(uVar142 >> 8);
                  auVar76[10] = (char)(uVar142 >> 0x10);
                  auVar76[0xb] = (char)(uVar142 >> 0x18);
                  auVar76[0xc] = (char)(uVar142 >> 0x20);
                  auVar76[0xd] = (char)(uVar142 >> 0x28);
                  auVar76[0xe] = (char)(uVar142 >> 0x30);
                  auVar76[0xf] = (byte)((uVar36 << 0x3f) >> 0x38) | auVar144[0xf] >> 1;
                  puVar37[1] = CONCAT17((byte)((uVar16 << 0x3f) >> 0x38) | auVar145[0xf] >> 1,
                                        (int7)(auVar145._8_8_ >> 1));
                  *puVar37 = CONCAT17((byte)((uVar15 << 0x3f) >> 0x38) | auVar145[7] >> 1,
                                      (int7)(auVar145._0_8_ >> 1));
                  puVar37[3] = auVar76._8_8_;
                  puVar37[2] = auVar76._0_8_;
                  uVar38 = uVar38 - 8;
                  puVar37 = puVar37 + 8;
                } while (uVar38 != 0);
                if (uVar32 == uVar35) goto code_r0x002a5660;
              }
              lVar22 = ~uVar35 + (long)(int)uVar2;
              puVar37 = puVar31 + uVar35;
              do {
                uVar38 = puVar37[1];
                *puVar37 = uVar36 >> 1 | uVar38 << 0x3f;
                lVar22 = lVar22 + -1;
                uVar36 = uVar38;
                puVar37 = puVar37 + 1;
              } while (lVar22 != 0);
            }
code_r0x002a5660:
            puVar31[uVar32] = puVar31[uVar32] >> 1;
          }
          uVar33 = uVar33 + 1;
          puVar31 = puVar31 + uVar30;
          do {
            puVar31 = puVar31 + -1;
            iVar21 = (int)uVar30;
            uVar30 = (ulong)(iVar21 - 1);
            if (iVar21 < 1) {
              *(uint *)(puVar26 + 1) = uVar2 & (int)uVar2 >> 0x1f;
              if (-1 < (int)uVar2) {
                *(undefined4 *)(puVar26 + 2) = 0;
              }
              goto code_r0x002a552c;
            }
          } while (*puVar31 == 0);
          *(int *)(puVar26 + 1) = iVar21;
          goto code_r0x002a552c;
        }
        if ((int)uVar33 != 0) {
          uVar30 = func_0x0029f130(plVar23,plVar23,uVar33);
          if ((int)uVar30 == 0) goto LAB_002a57c8;
          lVar22 = *plVar23;
          uVar30 = (ulong)(int)plVar23[1];
        }
        iVar21 = func_0x0029d99c(*plVar24,(long)(int)plVar24[1],lVar22,uVar30);
        if (iVar21 < 0) {
          uVar30 = func_0x0029ae04(puVar26,puVar26,puVar25);
          if ((int)uVar30 == 0) goto LAB_002a57c8;
          plVar27 = plVar23;
          plVar28 = plVar24;
        }
        else {
          uVar30 = func_0x0029ae04(puVar25,puVar25,puVar26);
          if ((int)uVar30 == 0) goto LAB_002a57c8;
          plVar27 = plVar24;
          plVar28 = plVar23;
        }
        uVar30 = func_0x0029ad98(plVar27,plVar27,plVar28);
        if ((int)uVar30 == 0) goto LAB_002a57c8;
      }
      iVar21 = func_0x0029dd44(plVar23);
      if (iVar21 == 0) {
        *unaff_x22 = 1;
        func_0x0028f83c(3,0,0x70,"/aws-lc/crypto/fipsmodule/bn/gcd.c",0xf8);
        uVar30 = 0;
      }
      else {
        uVar30 = func_0x0029b6ec(puVar26);
        if (((int)uVar30 != 0) &&
           (((*(int *)(puVar26 + 2) == 0 &&
             (iVar21 = func_0x0029d99c(*puVar26,(long)*(int *)(puVar26 + 1),*unaff_x21,
                                       (long)(int)unaff_x21[1]), iVar21 < 0)) ||
            (uVar30 = func_0x0029f210(puVar26,puVar26), (int)uVar30 != 0)))) {
          lVar22 = func_0x0029bd80();
          uVar30 = (ulong)(lVar22 != 0);
        }
      }
    }
  }
LAB_002a57c8:
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return uVar30;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar22 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar22;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar22 * 8);
    return uVar30;
  }
  auVar146 = func_0x0079db4c(uVar30);
  puVar37 = auVar146._8_8_;
  puVar31 = auVar146._0_8_;
  uVar30 = func_0x0029afb8(puVar31,(long)(int)puVar37[1]);
  if ((int)uVar30 == 0) {
    return uVar30;
  }
  uVar33 = *puVar31;
  uVar2 = (uint)puVar37[1];
  uVar30 = (ulong)uVar2;
  if (uVar2 == 0) goto code_r0x002a5910;
  uVar36 = *puVar37;
  lVar22 = (long)(int)uVar2;
  uVar32 = lVar22 - 1;
  if (uVar32 != 0) {
    if ((uVar2 < 9) || (uVar33 < uVar36 + lVar22 * 8 && uVar36 < (lVar22 * 8 + uVar33) - 8)) {
      uVar38 = 0;
    }
    else {
      uVar38 = uVar32 & 0xfffffffffffffff8;
      puVar40 = (ulong *)(uVar36 + 0x20);
      puVar25 = (undefined8 *)(uVar33 + 0x20);
      uVar35 = uVar38;
      do {
        uVar5 = puVar40[-4];
        auVar146 = *(undefined1 (*) [16])(puVar40 + -2);
        uVar10 = puVar40[1];
        uVar9 = *puVar40;
        uVar16 = puVar40[3];
        uVar15 = puVar40[2];
        uVar139 = puVar40[-3];
        uVar141 = puVar40[-1];
        uVar142 = *puVar40;
        uVar17 = puVar40[1];
        uVar18 = puVar40[2];
        uVar19 = puVar40[3];
        uVar20 = puVar40[4];
        uVar74 = auVar146._0_8_ >> 1;
        uVar85 = auVar146._8_8_ >> 1;
        puVar25[-3] = CONCAT17((byte)((puVar40[-2] << 0x3f) >> 0x38) | (byte)(puVar40[-3] >> 0x39),
                               (int7)(puVar40[-3] >> 1));
        puVar25[-4] = CONCAT17((byte)((uVar139 << 0x3f) >> 0x38) | (byte)(uVar5 >> 0x39),
                               (int7)(uVar5 >> 1));
        *(char *)(puVar25 + -1) = (char)uVar85;
        *(char *)((long)puVar25 + -7) = (char)(uVar85 >> 8);
        *(char *)((long)puVar25 + -6) = (char)((auVar146._9_7_ >> 1) >> 8);
        *(char *)((long)puVar25 + -5) = (char)((auVar146._10_6_ >> 1) >> 8);
        *(char *)((long)puVar25 + -4) = (char)((auVar146._11_5_ >> 1) >> 8);
        *(char *)((long)puVar25 + -3) = (char)((auVar146._12_4_ >> 1) >> 8);
        *(char *)((long)puVar25 + -2) = (char)((uint3)(auVar146._13_3_ >> 1) >> 8);
        *(byte *)((long)puVar25 + -1) = (byte)((uVar142 << 0x3f) >> 0x38) | auVar146[0xf] >> 1;
        *(char *)(puVar25 + -2) = (char)uVar74;
        *(char *)((long)puVar25 + -0xf) = (char)(uVar74 >> 8);
        *(char *)((long)puVar25 + -0xe) = (char)(uVar74 >> 0x10);
        *(char *)((long)puVar25 + -0xd) = (char)(uVar74 >> 0x18);
        *(char *)((long)puVar25 + -0xc) = (char)(uVar74 >> 0x20);
        *(char *)((long)puVar25 + -0xb) = (char)(uVar74 >> 0x28);
        *(char *)((long)puVar25 + -10) = (char)(uVar74 >> 0x30);
        *(byte *)((long)puVar25 + -9) = (byte)((uVar141 << 0x3f) >> 0x38) | auVar146[7] >> 1;
        puVar25[1] = CONCAT17((byte)((uVar18 << 0x3f) >> 0x38) | (byte)(uVar10 >> 0x39),
                              (int7)(uVar10 >> 1));
        *puVar25 = CONCAT17((byte)((uVar17 << 0x3f) >> 0x38) | (byte)(uVar9 >> 0x39),
                            (int7)(uVar9 >> 1));
        puVar25[3] = CONCAT17((byte)((uVar20 << 0x3f) >> 0x38) | (byte)(uVar16 >> 0x39),
                              (int7)(uVar16 >> 1));
        puVar25[2] = CONCAT17((byte)((uVar19 << 0x3f) >> 0x38) | (byte)(uVar15 >> 0x39),
                              (int7)(uVar15 >> 1));
        puVar40 = puVar40 + 8;
        uVar35 = uVar35 - 8;
        puVar25 = puVar25 + 8;
      } while (uVar35 != 0);
      if (uVar32 == uVar38) goto code_r0x002a5900;
    }
    lVar22 = ~uVar38 + lVar22;
    puVar39 = (ulong *)(uVar33 + uVar38 * 8);
    puVar40 = (ulong *)(uVar38 * 8 + uVar36);
    do {
      *puVar39 = *puVar40 >> 1 | puVar40[1] << 0x3f;
      lVar22 = lVar22 + -1;
      puVar39 = puVar39 + 1;
      puVar40 = puVar40 + 1;
    } while (lVar22 != 0);
  }
code_r0x002a5900:
  *(ulong *)(uVar33 + uVar32 * 8) = *(ulong *)(uVar36 + uVar32 * 8) >> 1;
code_r0x002a5910:
  *(int *)(puVar31 + 2) = (int)puVar37[2];
  plVar23 = (long *)(uVar33 + uVar30 * 8);
  do {
    plVar23 = plVar23 + -1;
    iVar21 = (int)uVar30;
    uVar30 = (ulong)(iVar21 - 1);
    if (iVar21 < 1) {
      *(uint *)(puVar31 + 1) = uVar2 & (int)uVar2 >> 0x1f;
      if ((int)uVar2 < 0) {
        return 1;
      }
      *(undefined4 *)(puVar31 + 2) = 0;
      return 1;
    }
  } while (*plVar23 == 0);
  *(int *)(puVar31 + 1) = iVar21;
  return 1;
}

