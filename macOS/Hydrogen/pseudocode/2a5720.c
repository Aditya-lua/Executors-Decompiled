
ulong FUN_002a5720(void)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  ulong uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  ulong uVar8;
  ulong uVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  int iVar20;
  ulong uVar21;
  long lVar22;
  ulong *puVar23;
  ulong uVar24;
  long *plVar25;
  ulong uVar26;
  ulong uVar27;
  undefined1 (*pauVar28) [16];
  ulong uVar29;
  ulong *puVar30;
  ulong uVar31;
  undefined8 *puVar32;
  ulong *puVar33;
  ulong *puVar34;
  long unaff_x19;
  undefined8 *unaff_x21;
  undefined4 *unaff_x22;
  undefined8 *unaff_x23;
  long *unaff_x24;
  long *unaff_x25;
  undefined8 *unaff_x26;
  byte bVar35;
  undefined1 uVar36;
  byte bVar37;
  undefined1 uVar38;
  byte bVar39;
  undefined1 uVar40;
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
  ulong uVar68;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  undefined1 auVar69 [16];
  undefined1 auVar70 [16];
  ulong uVar79;
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
  undefined1 uVar97;
  byte bVar98;
  undefined1 uVar99;
  byte bVar100;
  undefined1 uVar101;
  byte bVar102;
  undefined1 uVar103;
  byte bVar104;
  undefined1 uVar105;
  byte bVar106;
  undefined1 uVar107;
  byte bVar108;
  undefined1 uVar109;
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
  undefined1 uVar120;
  byte bVar121;
  undefined1 uVar122;
  byte bVar123;
  undefined1 uVar124;
  byte bVar125;
  undefined1 uVar126;
  byte bVar127;
  undefined1 uVar128;
  byte bVar129;
  undefined1 uVar130;
  byte bVar131;
  undefined1 uVar132;
  ulong uVar133;
  undefined1 auVar134 [16];
  ulong uVar135;
  ulong uVar136;
  undefined1 auVar137 [16];
  undefined1 auVar138 [16];
  undefined1 auVar139 [16];
  undefined1 auVar140 [16];
  
code_r0x002a5724:
  do {
    uVar21 = func_0x0029ad98();
    if ((int)uVar21 == 0) break;
    uVar1 = *(uint *)(unaff_x25 + 1);
    if (uVar1 == 0) {
code_r0x002a5730:
      iVar20 = func_0x0029dd44();
      if (iVar20 == 0) {
        *unaff_x22 = 1;
        func_0x0028f83c(3,0,0x70,"/aws-lc/crypto/fipsmodule/bn/gcd.c",0xf8);
        uVar21 = 0;
      }
      else {
        uVar21 = func_0x0029b6ec();
        if (((int)uVar21 != 0) &&
           (((*(int *)(unaff_x23 + 2) == 0 &&
             (iVar20 = func_0x0029d99c(*unaff_x23,(long)*(int *)(unaff_x23 + 1),*unaff_x21,
                                       (long)*(int *)(unaff_x21 + 1)), iVar20 < 0)) ||
            (uVar21 = func_0x0029f210(), (int)uVar21 != 0)))) {
          lVar22 = func_0x0029bd80();
          uVar21 = (ulong)(lVar22 != 0);
        }
      }
      break;
    }
    uVar21 = (ulong)(int)uVar1;
    if (uVar1 < 8) {
      uVar27 = 0;
      uVar24 = 0;
code_r0x002a534c:
      lVar22 = uVar21 - uVar27;
      puVar23 = (ulong *)(*unaff_x25 + uVar27 * 8);
      do {
        uVar24 = *puVar23 | uVar24;
        lVar22 = lVar22 + -1;
        puVar23 = puVar23 + 1;
      } while (lVar22 != 0);
    }
    else {
      uVar27 = uVar21 & 0xfffffffffffffff8;
      bVar35 = 0;
      bVar37 = 0;
      bVar39 = 0;
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
      bVar71 = 0;
      bVar72 = 0;
      bVar73 = 0;
      bVar74 = 0;
      bVar75 = 0;
      bVar76 = 0;
      bVar77 = 0;
      bVar78 = 0;
      bVar80 = 0;
      bVar81 = 0;
      bVar82 = 0;
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
      bVar95 = 0;
      bVar96 = 0;
      bVar98 = 0;
      bVar100 = 0;
      bVar102 = 0;
      bVar104 = 0;
      bVar106 = 0;
      bVar108 = 0;
      bVar110 = 0;
      bVar111 = 0;
      bVar112 = 0;
      bVar113 = 0;
      bVar114 = 0;
      bVar115 = 0;
      bVar116 = 0;
      bVar117 = 0;
      bVar118 = 0;
      bVar119 = 0;
      bVar121 = 0;
      bVar123 = 0;
      bVar125 = 0;
      bVar127 = 0;
      bVar129 = 0;
      bVar131 = 0;
      pauVar28 = (undefined1 (*) [16])(*unaff_x25 + 0x20);
      uVar24 = uVar27;
      do {
        auVar140 = pauVar28[-2];
        auVar134 = pauVar28[-1];
        auVar137 = *pauVar28;
        auVar139 = pauVar28[1];
        bVar35 = auVar140[0] | bVar35;
        bVar37 = auVar140[1] | bVar37;
        bVar39 = auVar140[2] | bVar39;
        bVar41 = auVar140[3] | bVar41;
        bVar43 = auVar140[4] | bVar43;
        bVar45 = auVar140[5] | bVar45;
        bVar47 = auVar140[6] | bVar47;
        bVar49 = auVar140[7] | bVar49;
        bVar51 = auVar140[8] | bVar51;
        bVar53 = auVar140[9] | bVar53;
        bVar55 = auVar140[10] | bVar55;
        bVar57 = auVar140[0xb] | bVar57;
        bVar59 = auVar140[0xc] | bVar59;
        bVar61 = auVar140[0xd] | bVar61;
        bVar63 = auVar140[0xe] | bVar63;
        bVar65 = auVar140[0xf] | bVar65;
        bVar67 = auVar134[0] | bVar67;
        bVar71 = auVar134[1] | bVar71;
        bVar72 = auVar134[2] | bVar72;
        bVar73 = auVar134[3] | bVar73;
        bVar74 = auVar134[4] | bVar74;
        bVar75 = auVar134[5] | bVar75;
        bVar76 = auVar134[6] | bVar76;
        bVar77 = auVar134[7] | bVar77;
        bVar78 = auVar134[8] | bVar78;
        bVar80 = auVar134[9] | bVar80;
        bVar81 = auVar134[10] | bVar81;
        bVar82 = auVar134[0xb] | bVar82;
        bVar83 = auVar134[0xc] | bVar83;
        bVar84 = auVar134[0xd] | bVar84;
        bVar85 = auVar134[0xe] | bVar85;
        bVar86 = auVar134[0xf] | bVar86;
        bVar87 = auVar137[0] | bVar87;
        bVar88 = auVar137[1] | bVar88;
        bVar89 = auVar137[2] | bVar89;
        bVar90 = auVar137[3] | bVar90;
        bVar91 = auVar137[4] | bVar91;
        bVar92 = auVar137[5] | bVar92;
        bVar93 = auVar137[6] | bVar93;
        bVar94 = auVar137[7] | bVar94;
        bVar95 = auVar137[8] | bVar95;
        bVar96 = auVar137[9] | bVar96;
        bVar98 = auVar137[10] | bVar98;
        bVar100 = auVar137[0xb] | bVar100;
        bVar102 = auVar137[0xc] | bVar102;
        bVar104 = auVar137[0xd] | bVar104;
        bVar106 = auVar137[0xe] | bVar106;
        bVar108 = auVar137[0xf] | bVar108;
        bVar110 = auVar139[0] | bVar110;
        bVar111 = auVar139[1] | bVar111;
        bVar112 = auVar139[2] | bVar112;
        bVar113 = auVar139[3] | bVar113;
        bVar114 = auVar139[4] | bVar114;
        bVar115 = auVar139[5] | bVar115;
        bVar116 = auVar139[6] | bVar116;
        bVar117 = auVar139[7] | bVar117;
        bVar118 = auVar139[8] | bVar118;
        bVar119 = auVar139[9] | bVar119;
        bVar121 = auVar139[10] | bVar121;
        bVar123 = auVar139[0xb] | bVar123;
        bVar125 = auVar139[0xc] | bVar125;
        bVar127 = auVar139[0xd] | bVar127;
        bVar129 = auVar139[0xe] | bVar129;
        bVar131 = auVar139[0xf] | bVar131;
        uVar24 = uVar24 - 8;
        pauVar28 = pauVar28 + 4;
      } while (uVar24 != 0);
      bVar110 = bVar110 | bVar87 | bVar67 | bVar35;
      bVar111 = bVar111 | bVar88 | bVar71 | bVar37;
      bVar112 = bVar112 | bVar89 | bVar72 | bVar39;
      bVar113 = bVar113 | bVar90 | bVar73 | bVar41;
      bVar114 = bVar114 | bVar91 | bVar74 | bVar43;
      bVar115 = bVar115 | bVar92 | bVar75 | bVar45;
      bVar116 = bVar116 | bVar93 | bVar76 | bVar47;
      bVar117 = bVar117 | bVar94 | bVar77 | bVar49;
      bVar118 = bVar118 | bVar95 | bVar78 | bVar51;
      bVar119 = bVar119 | bVar96 | bVar80 | bVar53;
      bVar121 = bVar121 | bVar98 | bVar81 | bVar55;
      bVar123 = bVar123 | bVar100 | bVar82 | bVar57;
      bVar125 = bVar125 | bVar102 | bVar83 | bVar59;
      bVar127 = bVar127 | bVar104 | bVar84 | bVar61;
      bVar129 = bVar129 | bVar106 | bVar85 | bVar63;
      bVar131 = bVar131 | bVar108 | bVar86 | bVar65;
      auVar140[1] = bVar111;
      auVar140[0] = bVar110;
      auVar140[2] = bVar112;
      auVar140[3] = bVar113;
      auVar140[4] = bVar114;
      auVar140[5] = bVar115;
      auVar140[6] = bVar116;
      auVar140[7] = bVar117;
      auVar140[8] = bVar118;
      auVar140[9] = bVar119;
      auVar140[10] = bVar121;
      auVar140[0xb] = bVar123;
      auVar140[0xc] = bVar125;
      auVar140[0xd] = bVar127;
      auVar140[0xe] = bVar129;
      auVar140[0xf] = bVar131;
      auVar134[1] = bVar111;
      auVar134[0] = bVar110;
      auVar134[2] = bVar112;
      auVar134[3] = bVar113;
      auVar134[4] = bVar114;
      auVar134[5] = bVar115;
      auVar134[6] = bVar116;
      auVar134[7] = bVar117;
      auVar134[8] = bVar118;
      auVar134[9] = bVar119;
      auVar134[10] = bVar121;
      auVar134[0xb] = bVar123;
      auVar134[0xc] = bVar125;
      auVar134[0xd] = bVar127;
      auVar134[0xe] = bVar129;
      auVar134[0xf] = bVar131;
      auVar140 = NEON_ext(auVar140,auVar134,8,1);
      uVar24 = CONCAT17(bVar117 | auVar140[7],
                        CONCAT16(bVar116 | auVar140[6],
                                 CONCAT15(bVar115 | auVar140[5],
                                          CONCAT14(bVar114 | auVar140[4],
                                                   CONCAT13(bVar113 | auVar140[3],
                                                            CONCAT12(bVar112 | auVar140[2],
                                                                     CONCAT11(bVar111 | auVar140[1],
                                                                              bVar110 | auVar140[0])
                                                                    ))))));
      if (uVar27 != uVar21) goto code_r0x002a534c;
    }
    if (uVar24 == 0) goto code_r0x002a5730;
    uVar24 = 0;
    uVar21 = 0;
    if (uVar1 == 0) goto code_r0x002a539c;
code_r0x002a538c:
    if ((*(ulong *)(*unaff_x25 + uVar21 * 8) >> (uVar24 & 0x3f) & 1) == 0) {
code_r0x002a539c:
      do {
        if ((((0 < *(int *)(unaff_x26 + 1)) && ((*(byte *)*unaff_x26 & 1) != 0)) &&
            (uVar21 = func_0x0029ae04(), (int)uVar21 == 0)) ||
           (uVar21 = func_0x0029afb8(), (int)uVar21 == 0)) goto LAB_002a57c8;
        puVar23 = (ulong *)*unaff_x26;
        uVar1 = *(uint *)(unaff_x26 + 1);
        uVar21 = (ulong)uVar1;
        if (uVar1 != 0) {
          uVar27 = (long)(int)uVar1 - 1;
          if (uVar27 != 0) {
            uVar26 = *puVar23;
            if (uVar1 < 9) {
              uVar29 = 0;
            }
            else {
              uVar29 = uVar27 & 0xfffffffffffffff8;
              uVar36 = (undefined1)uVar26;
              uVar38 = (undefined1)(uVar26 >> 8);
              uVar40 = (undefined1)(uVar26 >> 0x10);
              uVar42 = (undefined1)(uVar26 >> 0x18);
              uVar44 = (undefined1)(uVar26 >> 0x20);
              uVar46 = (undefined1)(uVar26 >> 0x28);
              uVar48 = (undefined1)(uVar26 >> 0x30);
              uVar50 = (undefined1)(uVar26 >> 0x38);
              puVar30 = puVar23 + 4;
              uVar31 = uVar29;
              uVar52 = uVar36;
              uVar54 = uVar38;
              uVar56 = uVar40;
              uVar58 = uVar42;
              uVar60 = uVar44;
              uVar62 = uVar46;
              uVar64 = uVar48;
              uVar66 = uVar50;
              do {
                auVar140 = *(undefined1 (*) [16])(puVar30 + -3);
                puVar34 = puVar30 + -1;
                uVar9 = *puVar30;
                uVar97 = (undefined1)(uVar9 >> 8);
                uVar99 = (undefined1)(uVar9 >> 0x10);
                uVar101 = (undefined1)(uVar9 >> 0x18);
                uVar103 = (undefined1)(uVar9 >> 0x20);
                uVar105 = (undefined1)(uVar9 >> 0x28);
                uVar107 = (undefined1)(uVar9 >> 0x30);
                uVar109 = (undefined1)(uVar9 >> 0x38);
                uVar8 = *puVar34;
                puVar33 = puVar30 + 1;
                uVar15 = puVar30[2];
                uVar120 = (undefined1)(uVar15 >> 8);
                uVar122 = (undefined1)(uVar15 >> 0x10);
                uVar124 = (undefined1)(uVar15 >> 0x18);
                uVar126 = (undefined1)(uVar15 >> 0x20);
                uVar128 = (undefined1)(uVar15 >> 0x28);
                uVar130 = (undefined1)(uVar15 >> 0x30);
                uVar132 = (undefined1)(uVar15 >> 0x38);
                uVar14 = *puVar33;
                auVar137[1] = uVar38;
                auVar137[0] = uVar36;
                auVar137[2] = uVar40;
                auVar137[3] = uVar42;
                auVar137[4] = uVar44;
                auVar137[5] = uVar46;
                auVar137[6] = uVar48;
                auVar137[7] = uVar50;
                auVar137[8] = uVar52;
                auVar137[9] = uVar54;
                auVar137[10] = uVar56;
                auVar137[0xb] = uVar58;
                auVar137[0xc] = uVar60;
                auVar137[0xd] = uVar62;
                auVar137[0xe] = uVar64;
                auVar137[0xf] = uVar66;
                auVar134 = NEON_ext(auVar137,auVar140,8,1);
                uVar26 = puVar30[4];
                uVar52 = (undefined1)uVar26;
                uVar54 = (undefined1)(uVar26 >> 8);
                uVar56 = (undefined1)(uVar26 >> 0x10);
                uVar58 = (undefined1)(uVar26 >> 0x18);
                uVar60 = (undefined1)(uVar26 >> 0x20);
                uVar62 = (undefined1)(uVar26 >> 0x28);
                uVar64 = (undefined1)(uVar26 >> 0x30);
                uVar66 = (undefined1)(uVar26 >> 0x38);
                uVar4 = puVar30[3];
                uVar36 = (undefined1)uVar4;
                uVar38 = (undefined1)(uVar4 >> 8);
                uVar40 = (undefined1)(uVar4 >> 0x10);
                uVar42 = (undefined1)(uVar4 >> 0x18);
                uVar44 = (undefined1)(uVar4 >> 0x20);
                uVar46 = (undefined1)(uVar4 >> 0x28);
                uVar48 = (undefined1)(uVar4 >> 0x30);
                uVar50 = (undefined1)(uVar4 >> 0x38);
                auVar138[9] = uVar97;
                auVar138._0_9_ = *(unkbyte9 *)puVar34;
                auVar138[10] = uVar99;
                auVar138[0xb] = uVar101;
                auVar138[0xc] = uVar103;
                auVar138[0xd] = uVar105;
                auVar138[0xe] = uVar107;
                auVar138[0xf] = uVar109;
                auVar137 = NEON_ext(auVar140,auVar138,8,1);
                auVar5[9] = uVar97;
                auVar5._0_9_ = *(unkbyte9 *)puVar34;
                auVar5[10] = uVar99;
                auVar5[0xb] = uVar101;
                auVar5[0xc] = uVar103;
                auVar5[0xd] = uVar105;
                auVar5[0xe] = uVar107;
                auVar5[0xf] = uVar109;
                auVar10[9] = uVar120;
                auVar10._0_9_ = *(unkbyte9 *)puVar33;
                auVar10[10] = uVar122;
                auVar10[0xb] = uVar124;
                auVar10[0xc] = uVar126;
                auVar10[0xd] = uVar128;
                auVar10[0xe] = uVar130;
                auVar10[0xf] = uVar132;
                auVar138 = NEON_ext(auVar5,auVar10,8,1);
                auVar139[9] = uVar54;
                auVar139._0_9_ = *(unkbyte9 *)(puVar30 + 3);
                auVar139[10] = uVar56;
                auVar139[0xb] = uVar58;
                auVar139[0xc] = uVar60;
                auVar139[0xd] = uVar62;
                auVar139[0xe] = uVar64;
                auVar139[0xf] = uVar66;
                auVar11[9] = uVar120;
                auVar11._0_9_ = *(unkbyte9 *)puVar33;
                auVar11[10] = uVar122;
                auVar11[0xb] = uVar124;
                auVar11[0xc] = uVar126;
                auVar11[0xd] = uVar128;
                auVar11[0xe] = uVar130;
                auVar11[0xf] = uVar132;
                auVar139 = NEON_ext(auVar11,auVar139,8,1);
                uVar133 = auVar134._0_8_ >> 1;
                uVar135 = auVar134._8_8_ >> 1;
                uVar136 = auVar139._8_8_ >> 1;
                *(char *)(puVar30 + -3) = (char)uVar135;
                *(char *)((long)puVar30 + -0x17) = (char)(uVar135 >> 8);
                *(char *)((long)puVar30 + -0x16) = (char)(uVar135 >> 0x10);
                *(char *)((long)puVar30 + -0x15) = (char)(uVar135 >> 0x18);
                *(char *)((long)puVar30 + -0x14) = (char)(uVar135 >> 0x20);
                *(char *)((long)puVar30 + -0x13) = (char)(uVar135 >> 0x28);
                *(char *)((long)puVar30 + -0x12) = (char)(uVar135 >> 0x30);
                *(byte *)((long)puVar30 + -0x11) =
                     (byte)((ulong)(auVar140._8_8_ << 0x3f) >> 0x38) | auVar134[0xf] >> 1;
                *(char *)(puVar30 + -4) = (char)uVar133;
                *(char *)((long)puVar30 + -0x1f) = (char)(uVar133 >> 8);
                *(char *)((long)puVar30 + -0x1e) = (char)(uVar133 >> 0x10);
                *(char *)((long)puVar30 + -0x1d) = (char)(uVar133 >> 0x18);
                *(char *)((long)puVar30 + -0x1c) = (char)(uVar133 >> 0x20);
                *(char *)((long)puVar30 + -0x1b) = (char)(uVar133 >> 0x28);
                *(char *)((long)puVar30 + -0x1a) = (char)(uVar133 >> 0x30);
                *(byte *)((long)puVar30 + -0x19) =
                     (byte)((ulong)(auVar140._0_8_ << 0x3f) >> 0x38) | auVar134[7] >> 1;
                puVar30[-1] = CONCAT17((byte)((uVar9 << 0x3f) >> 0x38) | auVar137[0xf] >> 1,
                                       (int7)(auVar137._8_8_ >> 1));
                puVar30[-2] = CONCAT17((byte)((uVar8 << 0x3f) >> 0x38) | auVar137[7] >> 1,
                                       (int7)(auVar137._0_8_ >> 1));
                auVar69._0_8_ =
                     CONCAT17((byte)((uVar4 << 0x3f) >> 0x38) | auVar139[7] >> 1,
                              (int7)(auVar139._0_8_ >> 1));
                auVar69[8] = (char)uVar136;
                auVar69[9] = (char)(uVar136 >> 8);
                auVar69[10] = (char)(uVar136 >> 0x10);
                auVar69[0xb] = (char)(uVar136 >> 0x18);
                auVar69[0xc] = (char)(uVar136 >> 0x20);
                auVar69[0xd] = (char)(uVar136 >> 0x28);
                auVar69[0xe] = (char)(uVar136 >> 0x30);
                auVar69[0xf] = (byte)((uVar26 << 0x3f) >> 0x38) | auVar139[0xf] >> 1;
                puVar30[1] = CONCAT17((byte)((uVar15 << 0x3f) >> 0x38) | auVar138[0xf] >> 1,
                                      (int7)(auVar138._8_8_ >> 1));
                *puVar30 = CONCAT17((byte)((uVar14 << 0x3f) >> 0x38) | auVar138[7] >> 1,
                                    (int7)(auVar138._0_8_ >> 1));
                puVar30[3] = auVar69._8_8_;
                puVar30[2] = auVar69._0_8_;
                uVar31 = uVar31 - 8;
                puVar30 = puVar30 + 8;
              } while (uVar31 != 0);
              if (uVar27 == uVar29) goto code_r0x002a54b0;
            }
            lVar22 = ~uVar29 + (long)(int)uVar1;
            puVar30 = puVar23 + uVar29;
            do {
              uVar31 = puVar30[1];
              *puVar30 = uVar26 >> 1 | uVar31 << 0x3f;
              lVar22 = lVar22 + -1;
              uVar26 = uVar31;
              puVar30 = puVar30 + 1;
            } while (lVar22 != 0);
          }
code_r0x002a54b0:
          puVar23[uVar27] = puVar23[uVar27] >> 1;
        }
        uVar24 = uVar24 + 1;
        puVar23 = puVar23 + uVar21;
        do {
          puVar23 = puVar23 + -1;
          iVar20 = (int)uVar21;
          uVar21 = (ulong)(iVar20 - 1);
          if (iVar20 < 1) {
            *(uint *)(unaff_x26 + 1) = uVar1 & (int)uVar1 >> 0x1f;
            if (-1 < (int)uVar1) {
              *(undefined4 *)(unaff_x26 + 2) = 0;
            }
            uVar21 = uVar24 >> 6;
            if ((ulong)(long)(int)unaff_x25[1] <= uVar21) goto code_r0x002a539c;
            goto code_r0x002a538c;
          }
        } while (*puVar23 == 0);
        *(int *)(unaff_x26 + 1) = iVar20;
        uVar21 = uVar24 >> 6;
      } while ((ulong)(long)(int)unaff_x25[1] <= uVar21);
      goto code_r0x002a538c;
    }
    if (((int)uVar24 != 0) && (uVar21 = func_0x0029f130(), (int)uVar21 == 0)) break;
    uVar24 = 0;
code_r0x002a552c:
    uVar21 = (ulong)(int)unaff_x24[1];
    if ((uVar21 <= uVar24 >> 6) ||
       (lVar22 = *unaff_x24, (*(ulong *)(lVar22 + (uVar24 >> 6) * 8) >> (uVar24 & 0x3f) & 1) == 0))
    {
      if (((0 < *(int *)(unaff_x23 + 1)) &&
          (((*(byte *)*unaff_x23 & 1) != 0 && (uVar21 = func_0x0029ae04(), (int)uVar21 == 0)))) ||
         (uVar21 = func_0x0029afb8(), (int)uVar21 == 0)) break;
      puVar23 = (ulong *)*unaff_x23;
      uVar1 = *(uint *)(unaff_x23 + 1);
      uVar21 = (ulong)uVar1;
      if (uVar1 != 0) {
        uVar27 = (long)(int)uVar1 - 1;
        if (uVar27 != 0) {
          uVar26 = *puVar23;
          if (uVar1 < 9) {
            uVar29 = 0;
          }
          else {
            uVar29 = uVar27 & 0xfffffffffffffff8;
            uVar36 = (undefined1)uVar26;
            uVar38 = (undefined1)(uVar26 >> 8);
            uVar40 = (undefined1)(uVar26 >> 0x10);
            uVar42 = (undefined1)(uVar26 >> 0x18);
            uVar44 = (undefined1)(uVar26 >> 0x20);
            uVar46 = (undefined1)(uVar26 >> 0x28);
            uVar48 = (undefined1)(uVar26 >> 0x30);
            uVar50 = (undefined1)(uVar26 >> 0x38);
            puVar30 = puVar23 + 4;
            uVar31 = uVar29;
            uVar52 = uVar36;
            uVar54 = uVar38;
            uVar56 = uVar40;
            uVar58 = uVar42;
            uVar60 = uVar44;
            uVar62 = uVar46;
            uVar64 = uVar48;
            uVar66 = uVar50;
            do {
              auVar140 = *(undefined1 (*) [16])(puVar30 + -3);
              puVar34 = puVar30 + -1;
              uVar9 = *puVar30;
              uVar97 = (undefined1)(uVar9 >> 8);
              uVar99 = (undefined1)(uVar9 >> 0x10);
              uVar101 = (undefined1)(uVar9 >> 0x18);
              uVar103 = (undefined1)(uVar9 >> 0x20);
              uVar105 = (undefined1)(uVar9 >> 0x28);
              uVar107 = (undefined1)(uVar9 >> 0x30);
              uVar109 = (undefined1)(uVar9 >> 0x38);
              uVar8 = *puVar34;
              puVar33 = puVar30 + 1;
              uVar15 = puVar30[2];
              uVar120 = (undefined1)(uVar15 >> 8);
              uVar122 = (undefined1)(uVar15 >> 0x10);
              uVar124 = (undefined1)(uVar15 >> 0x18);
              uVar126 = (undefined1)(uVar15 >> 0x20);
              uVar128 = (undefined1)(uVar15 >> 0x28);
              uVar130 = (undefined1)(uVar15 >> 0x30);
              uVar132 = (undefined1)(uVar15 >> 0x38);
              uVar14 = *puVar33;
              auVar2[1] = uVar38;
              auVar2[0] = uVar36;
              auVar2[2] = uVar40;
              auVar2[3] = uVar42;
              auVar2[4] = uVar44;
              auVar2[5] = uVar46;
              auVar2[6] = uVar48;
              auVar2[7] = uVar50;
              auVar2[8] = uVar52;
              auVar2[9] = uVar54;
              auVar2[10] = uVar56;
              auVar2[0xb] = uVar58;
              auVar2[0xc] = uVar60;
              auVar2[0xd] = uVar62;
              auVar2[0xe] = uVar64;
              auVar2[0xf] = uVar66;
              auVar134 = NEON_ext(auVar2,auVar140,8,1);
              uVar26 = puVar30[4];
              uVar52 = (undefined1)uVar26;
              uVar54 = (undefined1)(uVar26 >> 8);
              uVar56 = (undefined1)(uVar26 >> 0x10);
              uVar58 = (undefined1)(uVar26 >> 0x18);
              uVar60 = (undefined1)(uVar26 >> 0x20);
              uVar62 = (undefined1)(uVar26 >> 0x28);
              uVar64 = (undefined1)(uVar26 >> 0x30);
              uVar66 = (undefined1)(uVar26 >> 0x38);
              uVar4 = puVar30[3];
              uVar36 = (undefined1)uVar4;
              uVar38 = (undefined1)(uVar4 >> 8);
              uVar40 = (undefined1)(uVar4 >> 0x10);
              uVar42 = (undefined1)(uVar4 >> 0x18);
              uVar44 = (undefined1)(uVar4 >> 0x20);
              uVar46 = (undefined1)(uVar4 >> 0x28);
              uVar48 = (undefined1)(uVar4 >> 0x30);
              uVar50 = (undefined1)(uVar4 >> 0x38);
              auVar6[9] = uVar97;
              auVar6._0_9_ = *(unkbyte9 *)puVar34;
              auVar6[10] = uVar99;
              auVar6[0xb] = uVar101;
              auVar6[0xc] = uVar103;
              auVar6[0xd] = uVar105;
              auVar6[0xe] = uVar107;
              auVar6[0xf] = uVar109;
              auVar137 = NEON_ext(auVar140,auVar6,8,1);
              auVar7[9] = uVar97;
              auVar7._0_9_ = *(unkbyte9 *)puVar34;
              auVar7[10] = uVar99;
              auVar7[0xb] = uVar101;
              auVar7[0xc] = uVar103;
              auVar7[0xd] = uVar105;
              auVar7[0xe] = uVar107;
              auVar7[0xf] = uVar109;
              auVar12[9] = uVar120;
              auVar12._0_9_ = *(unkbyte9 *)puVar33;
              auVar12[10] = uVar122;
              auVar12[0xb] = uVar124;
              auVar12[0xc] = uVar126;
              auVar12[0xd] = uVar128;
              auVar12[0xe] = uVar130;
              auVar12[0xf] = uVar132;
              auVar139 = NEON_ext(auVar7,auVar12,8,1);
              auVar3[9] = uVar54;
              auVar3._0_9_ = *(unkbyte9 *)(puVar30 + 3);
              auVar3[10] = uVar56;
              auVar3[0xb] = uVar58;
              auVar3[0xc] = uVar60;
              auVar3[0xd] = uVar62;
              auVar3[0xe] = uVar64;
              auVar3[0xf] = uVar66;
              auVar13[9] = uVar120;
              auVar13._0_9_ = *(unkbyte9 *)puVar33;
              auVar13[10] = uVar122;
              auVar13[0xb] = uVar124;
              auVar13[0xc] = uVar126;
              auVar13[0xd] = uVar128;
              auVar13[0xe] = uVar130;
              auVar13[0xf] = uVar132;
              auVar138 = NEON_ext(auVar13,auVar3,8,1);
              uVar133 = auVar134._0_8_ >> 1;
              uVar135 = auVar134._8_8_ >> 1;
              uVar136 = auVar138._8_8_ >> 1;
              *(char *)(puVar30 + -3) = (char)uVar135;
              *(char *)((long)puVar30 + -0x17) = (char)(uVar135 >> 8);
              *(char *)((long)puVar30 + -0x16) = (char)(uVar135 >> 0x10);
              *(char *)((long)puVar30 + -0x15) = (char)(uVar135 >> 0x18);
              *(char *)((long)puVar30 + -0x14) = (char)(uVar135 >> 0x20);
              *(char *)((long)puVar30 + -0x13) = (char)(uVar135 >> 0x28);
              *(char *)((long)puVar30 + -0x12) = (char)(uVar135 >> 0x30);
              *(byte *)((long)puVar30 + -0x11) =
                   (byte)((ulong)(auVar140._8_8_ << 0x3f) >> 0x38) | auVar134[0xf] >> 1;
              *(char *)(puVar30 + -4) = (char)uVar133;
              *(char *)((long)puVar30 + -0x1f) = (char)(uVar133 >> 8);
              *(char *)((long)puVar30 + -0x1e) = (char)(uVar133 >> 0x10);
              *(char *)((long)puVar30 + -0x1d) = (char)(uVar133 >> 0x18);
              *(char *)((long)puVar30 + -0x1c) = (char)(uVar133 >> 0x20);
              *(char *)((long)puVar30 + -0x1b) = (char)(uVar133 >> 0x28);
              *(char *)((long)puVar30 + -0x1a) = (char)(uVar133 >> 0x30);
              *(byte *)((long)puVar30 + -0x19) =
                   (byte)((ulong)(auVar140._0_8_ << 0x3f) >> 0x38) | auVar134[7] >> 1;
              puVar30[-1] = CONCAT17((byte)((uVar9 << 0x3f) >> 0x38) | auVar137[0xf] >> 1,
                                     (int7)(auVar137._8_8_ >> 1));
              puVar30[-2] = CONCAT17((byte)((uVar8 << 0x3f) >> 0x38) | auVar137[7] >> 1,
                                     (int7)(auVar137._0_8_ >> 1));
              auVar70._0_8_ =
                   CONCAT17((byte)((uVar4 << 0x3f) >> 0x38) | auVar138[7] >> 1,
                            (int7)(auVar138._0_8_ >> 1));
              auVar70[8] = (char)uVar136;
              auVar70[9] = (char)(uVar136 >> 8);
              auVar70[10] = (char)(uVar136 >> 0x10);
              auVar70[0xb] = (char)(uVar136 >> 0x18);
              auVar70[0xc] = (char)(uVar136 >> 0x20);
              auVar70[0xd] = (char)(uVar136 >> 0x28);
              auVar70[0xe] = (char)(uVar136 >> 0x30);
              auVar70[0xf] = (byte)((uVar26 << 0x3f) >> 0x38) | auVar138[0xf] >> 1;
              puVar30[1] = CONCAT17((byte)((uVar15 << 0x3f) >> 0x38) | auVar139[0xf] >> 1,
                                    (int7)(auVar139._8_8_ >> 1));
              *puVar30 = CONCAT17((byte)((uVar14 << 0x3f) >> 0x38) | auVar139[7] >> 1,
                                  (int7)(auVar139._0_8_ >> 1));
              puVar30[3] = auVar70._8_8_;
              puVar30[2] = auVar70._0_8_;
              uVar31 = uVar31 - 8;
              puVar30 = puVar30 + 8;
            } while (uVar31 != 0);
            if (uVar27 == uVar29) goto code_r0x002a5660;
          }
          lVar22 = ~uVar29 + (long)(int)uVar1;
          puVar30 = puVar23 + uVar29;
          do {
            uVar31 = puVar30[1];
            *puVar30 = uVar26 >> 1 | uVar31 << 0x3f;
            lVar22 = lVar22 + -1;
            uVar26 = uVar31;
            puVar30 = puVar30 + 1;
          } while (lVar22 != 0);
        }
code_r0x002a5660:
        puVar23[uVar27] = puVar23[uVar27] >> 1;
      }
      uVar24 = uVar24 + 1;
      puVar23 = puVar23 + uVar21;
      do {
        puVar23 = puVar23 + -1;
        iVar20 = (int)uVar21;
        uVar21 = (ulong)(iVar20 - 1);
        if (iVar20 < 1) {
          *(uint *)(unaff_x23 + 1) = uVar1 & (int)uVar1 >> 0x1f;
          if (-1 < (int)uVar1) {
            *(undefined4 *)(unaff_x23 + 2) = 0;
          }
          goto code_r0x002a552c;
        }
      } while (*puVar23 == 0);
      *(int *)(unaff_x23 + 1) = iVar20;
      goto code_r0x002a552c;
    }
    if ((int)uVar24 != 0) {
      uVar21 = func_0x0029f130();
      if ((int)uVar21 == 0) break;
      lVar22 = *unaff_x24;
      uVar21 = (ulong)(int)unaff_x24[1];
    }
    iVar20 = func_0x0029d99c(*unaff_x25,(long)(int)unaff_x25[1],lVar22,uVar21);
    if (-1 < iVar20) {
      uVar21 = func_0x0029ae04();
      if ((int)uVar21 == 0) break;
      goto code_r0x002a5724;
    }
    uVar21 = func_0x0029ae04();
  } while ((int)uVar21 != 0);
LAB_002a57c8:
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return uVar21;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar22 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar22;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar22 * 8);
    return uVar21;
  }
  auVar140 = func_0x0079db4c(uVar21);
  puVar30 = auVar140._8_8_;
  puVar23 = auVar140._0_8_;
  uVar21 = func_0x0029afb8(puVar23,(long)(int)puVar30[1]);
  if ((int)uVar21 == 0) {
    return uVar21;
  }
  uVar24 = *puVar23;
  uVar1 = (uint)puVar30[1];
  uVar21 = (ulong)uVar1;
  if (uVar1 == 0) goto code_r0x002a5910;
  uVar26 = *puVar30;
  lVar22 = (long)(int)uVar1;
  uVar27 = lVar22 - 1;
  if (uVar27 != 0) {
    if ((uVar1 < 9) || (uVar24 < uVar26 + lVar22 * 8 && uVar26 < (lVar22 * 8 + uVar24) - 8)) {
      uVar31 = 0;
    }
    else {
      uVar31 = uVar27 & 0xfffffffffffffff8;
      puVar34 = (ulong *)(uVar26 + 0x20);
      puVar32 = (undefined8 *)(uVar24 + 0x20);
      uVar29 = uVar31;
      do {
        uVar4 = puVar34[-4];
        auVar140 = *(undefined1 (*) [16])(puVar34 + -2);
        uVar9 = puVar34[1];
        uVar8 = *puVar34;
        uVar15 = puVar34[3];
        uVar14 = puVar34[2];
        uVar133 = puVar34[-3];
        uVar135 = puVar34[-1];
        uVar136 = *puVar34;
        uVar16 = puVar34[1];
        uVar17 = puVar34[2];
        uVar18 = puVar34[3];
        uVar19 = puVar34[4];
        uVar68 = auVar140._0_8_ >> 1;
        uVar79 = auVar140._8_8_ >> 1;
        puVar32[-3] = CONCAT17((byte)((puVar34[-2] << 0x3f) >> 0x38) | (byte)(puVar34[-3] >> 0x39),
                               (int7)(puVar34[-3] >> 1));
        puVar32[-4] = CONCAT17((byte)((uVar133 << 0x3f) >> 0x38) | (byte)(uVar4 >> 0x39),
                               (int7)(uVar4 >> 1));
        *(char *)(puVar32 + -1) = (char)uVar79;
        *(char *)((long)puVar32 + -7) = (char)(uVar79 >> 8);
        *(char *)((long)puVar32 + -6) = (char)((auVar140._9_7_ >> 1) >> 8);
        *(char *)((long)puVar32 + -5) = (char)((auVar140._10_6_ >> 1) >> 8);
        *(char *)((long)puVar32 + -4) = (char)((auVar140._11_5_ >> 1) >> 8);
        *(char *)((long)puVar32 + -3) = (char)((auVar140._12_4_ >> 1) >> 8);
        *(char *)((long)puVar32 + -2) = (char)((uint3)(auVar140._13_3_ >> 1) >> 8);
        *(byte *)((long)puVar32 + -1) = (byte)((uVar136 << 0x3f) >> 0x38) | auVar140[0xf] >> 1;
        *(char *)(puVar32 + -2) = (char)uVar68;
        *(char *)((long)puVar32 + -0xf) = (char)(uVar68 >> 8);
        *(char *)((long)puVar32 + -0xe) = (char)(uVar68 >> 0x10);
        *(char *)((long)puVar32 + -0xd) = (char)(uVar68 >> 0x18);
        *(char *)((long)puVar32 + -0xc) = (char)(uVar68 >> 0x20);
        *(char *)((long)puVar32 + -0xb) = (char)(uVar68 >> 0x28);
        *(char *)((long)puVar32 + -10) = (char)(uVar68 >> 0x30);
        *(byte *)((long)puVar32 + -9) = (byte)((uVar135 << 0x3f) >> 0x38) | auVar140[7] >> 1;
        puVar32[1] = CONCAT17((byte)((uVar17 << 0x3f) >> 0x38) | (byte)(uVar9 >> 0x39),
                              (int7)(uVar9 >> 1));
        *puVar32 = CONCAT17((byte)((uVar16 << 0x3f) >> 0x38) | (byte)(uVar8 >> 0x39),
                            (int7)(uVar8 >> 1));
        puVar32[3] = CONCAT17((byte)((uVar19 << 0x3f) >> 0x38) | (byte)(uVar15 >> 0x39),
                              (int7)(uVar15 >> 1));
        puVar32[2] = CONCAT17((byte)((uVar18 << 0x3f) >> 0x38) | (byte)(uVar14 >> 0x39),
                              (int7)(uVar14 >> 1));
        puVar34 = puVar34 + 8;
        uVar29 = uVar29 - 8;
        puVar32 = puVar32 + 8;
      } while (uVar29 != 0);
      if (uVar27 == uVar31) goto code_r0x002a5900;
    }
    lVar22 = ~uVar31 + lVar22;
    puVar33 = (ulong *)(uVar24 + uVar31 * 8);
    puVar34 = (ulong *)(uVar31 * 8 + uVar26);
    do {
      *puVar33 = *puVar34 >> 1 | puVar34[1] << 0x3f;
      lVar22 = lVar22 + -1;
      puVar33 = puVar33 + 1;
      puVar34 = puVar34 + 1;
    } while (lVar22 != 0);
  }
code_r0x002a5900:
  *(ulong *)(uVar24 + uVar27 * 8) = *(ulong *)(uVar26 + uVar27 * 8) >> 1;
code_r0x002a5910:
  *(int *)(puVar23 + 2) = (int)puVar30[2];
  plVar25 = (long *)(uVar24 + uVar21 * 8);
  do {
    plVar25 = plVar25 + -1;
    iVar20 = (int)uVar21;
    uVar21 = (ulong)(iVar20 - 1);
    if (iVar20 < 1) {
      *(uint *)(puVar23 + 1) = uVar1 & (int)uVar1 >> 0x1f;
      if ((int)uVar1 < 0) {
        return 1;
      }
      *(undefined4 *)(puVar23 + 2) = 0;
      return 1;
    }
  } while (*plVar25 == 0);
  *(int *)(puVar23 + 1) = iVar20;
  return 1;
}

