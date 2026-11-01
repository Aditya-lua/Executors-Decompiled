
/* WARNING: Removing unreachable block (ram,0x002a6b74) */

ulong FUN_002a5b94(void)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  int iVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong *puVar10;
  ulong *puVar11;
  ulong *puVar12;
  long lVar13;
  long lVar14;
  undefined8 uVar15;
  char *pcVar16;
  ulong uVar17;
  undefined8 *in_x3;
  char *pcVar18;
  char *in_x4;
  undefined8 uVar19;
  undefined4 uVar20;
  ulong uVar21;
  char *pcVar22;
  ulong uVar23;
  dword *pdVar24;
  char *pcVar25;
  ulong uVar26;
  long lVar27;
  ulong uVar28;
  ulong uVar29;
  byte *pbVar30;
  ulong *puVar31;
  byte *pbVar32;
  undefined8 *puVar33;
  ulong *puVar34;
  qword *pqVar35;
  char *pcVar36;
  long unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  char *pcVar37;
  ulong *unaff_x24;
  char *pcVar38;
  uint uVar39;
  ulong unaff_x26;
  ulong uVar40;
  byte *unaff_x27;
  undefined8 *puVar41;
  long unaff_x29;
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
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
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
  byte bVar94;
  byte bVar95;
  byte bVar96;
  byte bVar97;
  byte bVar98;
  byte bVar99;
  undefined8 uVar93;
  byte bVar100;
  byte bVar101;
  byte bVar104;
  byte bVar105;
  byte bVar106;
  byte bVar107;
  byte bVar108;
  byte bVar109;
  qword qVar102;
  undefined8 uVar103;
  byte bVar110;
  undefined8 uVar111;
  qword qVar112;
  undefined8 uVar113;
  undefined8 uVar114;
  undefined8 uVar115;
  undefined8 uVar116;
  undefined8 uVar117;
  undefined8 uVar118;
  undefined8 uVar119;
  undefined8 uVar120;
  undefined8 uVar121;
  undefined8 uVar122;
  undefined8 uVar123;
  undefined1 auVar124 [16];
  ulong uStack0000000000000030;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pcVar38 = (char *)*in_x3;
  uVar1 = *(uint *)(in_x3 + 1);
  pcVar37 = (char *)(long)(int)uVar1;
  pcVar16 = pcVar38;
  pcVar18 = pcVar37;
  iVar7 = func_0x0029d99c();
  if (-1 < iVar7) {
    uVar15 = 0x6b;
    uVar19 = 0xae;
    goto LAB_002a5bcc;
  }
  uVar39 = (uint)unaff_x26;
  if (uVar39 != 0) {
    if (uVar39 < 8) {
      uVar21 = 0;
      uVar23 = 0;
FUN_002a5c6c:
      lVar27 = unaff_x26 - uVar21;
      puVar8 = (ulong *)(unaff_x27 + uVar21 * 8);
      do {
        uVar23 = *puVar8 | uVar23;
        lVar27 = lVar27 + -1;
        puVar8 = puVar8 + 1;
      } while (lVar27 != 0);
    }
    else {
      uVar21 = unaff_x26 & 0xfffffffffffffff8;
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
      uVar15 = 0;
      uVar19 = 0;
      uVar93 = 0;
      uVar103 = 0;
      pbVar30 = unaff_x27 + 0x20;
      uVar23 = uVar21;
      do {
        uVar113 = *(undefined8 *)(pbVar30 + -0x18);
        uVar111 = *(undefined8 *)(pbVar30 + -0x20);
        uVar115 = *(undefined8 *)(pbVar30 + -8);
        uVar114 = *(undefined8 *)(pbVar30 + -0x10);
        uVar117 = *(undefined8 *)(pbVar30 + 8);
        uVar116 = *(undefined8 *)pbVar30;
        uVar119 = *(undefined8 *)(pbVar30 + 0x18);
        uVar118 = *(undefined8 *)(pbVar30 + 0x10);
        bVar42 = (byte)uVar111 | bVar42;
        bVar43 = (byte)((ulong)uVar111 >> 8) | bVar43;
        bVar44 = (byte)((ulong)uVar111 >> 0x10) | bVar44;
        bVar45 = (byte)((ulong)uVar111 >> 0x18) | bVar45;
        bVar46 = (byte)((ulong)uVar111 >> 0x20) | bVar46;
        bVar47 = (byte)((ulong)uVar111 >> 0x28) | bVar47;
        bVar48 = (byte)((ulong)uVar111 >> 0x30) | bVar48;
        bVar49 = (byte)((ulong)uVar111 >> 0x38) | bVar49;
        bVar50 = (byte)uVar113 | bVar50;
        bVar51 = (byte)((ulong)uVar113 >> 8) | bVar51;
        bVar52 = (byte)((ulong)uVar113 >> 0x10) | bVar52;
        bVar53 = (byte)((ulong)uVar113 >> 0x18) | bVar53;
        bVar54 = (byte)((ulong)uVar113 >> 0x20) | bVar54;
        bVar55 = (byte)((ulong)uVar113 >> 0x28) | bVar55;
        bVar56 = (byte)((ulong)uVar113 >> 0x30) | bVar56;
        bVar57 = (byte)((ulong)uVar113 >> 0x38) | bVar57;
        bVar58 = (byte)uVar114 | bVar58;
        bVar61 = (byte)((ulong)uVar114 >> 8) | bVar61;
        bVar62 = (byte)((ulong)uVar114 >> 0x10) | bVar62;
        bVar63 = (byte)((ulong)uVar114 >> 0x18) | bVar63;
        bVar64 = (byte)((ulong)uVar114 >> 0x20) | bVar64;
        bVar65 = (byte)((ulong)uVar114 >> 0x28) | bVar65;
        bVar66 = (byte)((ulong)uVar114 >> 0x30) | bVar66;
        bVar67 = (byte)((ulong)uVar114 >> 0x38) | bVar67;
        bVar68 = (byte)uVar115 | bVar68;
        bVar69 = (byte)((ulong)uVar115 >> 8) | bVar69;
        bVar70 = (byte)((ulong)uVar115 >> 0x10) | bVar70;
        bVar71 = (byte)((ulong)uVar115 >> 0x18) | bVar71;
        bVar72 = (byte)((ulong)uVar115 >> 0x20) | bVar72;
        bVar73 = (byte)((ulong)uVar115 >> 0x28) | bVar73;
        bVar74 = (byte)((ulong)uVar115 >> 0x30) | bVar74;
        bVar75 = (byte)((ulong)uVar115 >> 0x38) | bVar75;
        bVar76 = (byte)uVar116 | (byte)uVar15;
        bVar77 = (byte)((ulong)uVar116 >> 8) | (byte)((ulong)uVar15 >> 8);
        bVar78 = (byte)((ulong)uVar116 >> 0x10) | (byte)((ulong)uVar15 >> 0x10);
        bVar79 = (byte)((ulong)uVar116 >> 0x18) | (byte)((ulong)uVar15 >> 0x18);
        bVar80 = (byte)((ulong)uVar116 >> 0x20) | (byte)((ulong)uVar15 >> 0x20);
        bVar81 = (byte)((ulong)uVar116 >> 0x28) | (byte)((ulong)uVar15 >> 0x28);
        bVar82 = (byte)((ulong)uVar116 >> 0x30) | (byte)((ulong)uVar15 >> 0x30);
        bVar83 = (byte)((ulong)uVar116 >> 0x38) | (byte)((ulong)uVar15 >> 0x38);
        uVar15 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79,
                                                  CONCAT12(bVar78,CONCAT11(bVar77,bVar76)))))));
        bVar84 = (byte)uVar117 | (byte)uVar19;
        bVar85 = (byte)((ulong)uVar117 >> 8) | (byte)((ulong)uVar19 >> 8);
        bVar86 = (byte)((ulong)uVar117 >> 0x10) | (byte)((ulong)uVar19 >> 0x10);
        bVar87 = (byte)((ulong)uVar117 >> 0x18) | (byte)((ulong)uVar19 >> 0x18);
        bVar88 = (byte)((ulong)uVar117 >> 0x20) | (byte)((ulong)uVar19 >> 0x20);
        bVar89 = (byte)((ulong)uVar117 >> 0x28) | (byte)((ulong)uVar19 >> 0x28);
        bVar90 = (byte)((ulong)uVar117 >> 0x30) | (byte)((ulong)uVar19 >> 0x30);
        bVar91 = (byte)((ulong)uVar117 >> 0x38) | (byte)((ulong)uVar19 >> 0x38);
        uVar19 = CONCAT17(bVar91,CONCAT16(bVar90,CONCAT15(bVar89,CONCAT14(bVar88,CONCAT13(bVar87,
                                                  CONCAT12(bVar86,CONCAT11(bVar85,bVar84)))))));
        bVar92 = (byte)uVar118 | (byte)uVar93;
        bVar94 = (byte)((ulong)uVar118 >> 8) | (byte)((ulong)uVar93 >> 8);
        bVar95 = (byte)((ulong)uVar118 >> 0x10) | (byte)((ulong)uVar93 >> 0x10);
        bVar96 = (byte)((ulong)uVar118 >> 0x18) | (byte)((ulong)uVar93 >> 0x18);
        bVar97 = (byte)((ulong)uVar118 >> 0x20) | (byte)((ulong)uVar93 >> 0x20);
        bVar98 = (byte)((ulong)uVar118 >> 0x28) | (byte)((ulong)uVar93 >> 0x28);
        bVar99 = (byte)((ulong)uVar118 >> 0x30) | (byte)((ulong)uVar93 >> 0x30);
        bVar100 = (byte)((ulong)uVar118 >> 0x38) | (byte)((ulong)uVar93 >> 0x38);
        uVar93 = CONCAT17(bVar100,CONCAT16(bVar99,CONCAT15(bVar98,CONCAT14(bVar97,CONCAT13(bVar96,
                                                  CONCAT12(bVar95,CONCAT11(bVar94,bVar92)))))));
        bVar101 = (byte)uVar119 | (byte)uVar103;
        bVar104 = (byte)((ulong)uVar119 >> 8) | (byte)((ulong)uVar103 >> 8);
        bVar105 = (byte)((ulong)uVar119 >> 0x10) | (byte)((ulong)uVar103 >> 0x10);
        bVar106 = (byte)((ulong)uVar119 >> 0x18) | (byte)((ulong)uVar103 >> 0x18);
        bVar107 = (byte)((ulong)uVar119 >> 0x20) | (byte)((ulong)uVar103 >> 0x20);
        bVar108 = (byte)((ulong)uVar119 >> 0x28) | (byte)((ulong)uVar103 >> 0x28);
        bVar109 = (byte)((ulong)uVar119 >> 0x30) | (byte)((ulong)uVar103 >> 0x30);
        bVar110 = (byte)((ulong)uVar119 >> 0x38) | (byte)((ulong)uVar103 >> 0x38);
        uVar103 = CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,CONCAT13(
                                                  bVar106,CONCAT12(bVar105,CONCAT11(bVar104,bVar101)
                                                                  ))))));
        uVar23 = uVar23 - 8;
        pbVar30 = pbVar30 + 0x40;
      } while (uVar23 != 0);
      bVar92 = bVar92 | bVar76 | bVar58 | bVar42;
      bVar94 = bVar94 | bVar77 | bVar61 | bVar43;
      bVar95 = bVar95 | bVar78 | bVar62 | bVar44;
      bVar96 = bVar96 | bVar79 | bVar63 | bVar45;
      bVar97 = bVar97 | bVar80 | bVar64 | bVar46;
      bVar98 = bVar98 | bVar81 | bVar65 | bVar47;
      bVar99 = bVar99 | bVar82 | bVar66 | bVar48;
      bVar100 = bVar100 | bVar83 | bVar67 | bVar49;
      bVar101 = bVar101 | bVar84 | bVar68 | bVar50;
      bVar104 = bVar104 | bVar85 | bVar69 | bVar51;
      bVar105 = bVar105 | bVar86 | bVar70 | bVar52;
      bVar106 = bVar106 | bVar87 | bVar71 | bVar53;
      bVar107 = bVar107 | bVar88 | bVar72 | bVar54;
      bVar108 = bVar108 | bVar89 | bVar73 | bVar55;
      bVar109 = bVar109 | bVar90 | bVar74 | bVar56;
      bVar110 = bVar110 | bVar91 | bVar75 | bVar57;
      auVar124[1] = bVar94;
      auVar124[0] = bVar92;
      auVar124[2] = bVar95;
      auVar124[3] = bVar96;
      auVar124[4] = bVar97;
      auVar124[5] = bVar98;
      auVar124[6] = bVar99;
      auVar124[7] = bVar100;
      auVar124[8] = bVar101;
      auVar124[9] = bVar104;
      auVar124[10] = bVar105;
      auVar124[0xb] = bVar106;
      auVar124[0xc] = bVar107;
      auVar124[0xd] = bVar108;
      auVar124[0xe] = bVar109;
      auVar124[0xf] = bVar110;
      auVar6[1] = bVar94;
      auVar6[0] = bVar92;
      auVar6[2] = bVar95;
      auVar6[3] = bVar96;
      auVar6[4] = bVar97;
      auVar6[5] = bVar98;
      auVar6[6] = bVar99;
      auVar6[7] = bVar100;
      auVar6[8] = bVar101;
      auVar6[9] = bVar104;
      auVar6[10] = bVar105;
      auVar6[0xb] = bVar106;
      auVar6[0xc] = bVar107;
      auVar6[0xd] = bVar108;
      auVar6[0xe] = bVar109;
      auVar6[0xf] = bVar110;
      auVar124 = NEON_ext(auVar124,auVar6,8,1);
      uVar23 = CONCAT17(bVar100 | auVar124[7],
                        CONCAT16(bVar99 | auVar124[6],
                                 CONCAT15(bVar98 | auVar124[5],
                                          CONCAT14(bVar97 | auVar124[4],
                                                   CONCAT13(bVar96 | auVar124[3],
                                                            CONCAT12(bVar95 | auVar124[2],
                                                                     CONCAT11(bVar94 | auVar124[1],
                                                                              bVar92 | auVar124[0]))
                                                           )))));
      if (uVar21 != unaff_x26) goto FUN_002a5c6c;
    }
    if (uVar23 != 0) {
      if ((((int)uVar39 < 1) || ((*unaff_x27 & 1) == 0)) &&
         (((int)uVar1 < 1 || ((*pcVar38 & 1U) == 0)))) {
        *unaff_x20 = 1;
        uVar15 = 0x70;
        uVar19 = 199;
        goto LAB_002a5bcc;
      }
      if (uVar1 <= uVar39) {
        uVar39 = uVar1;
      }
      if (*(char *)(unaff_x19 + 0x28) == '\0') {
        uVar15 = *(undefined8 *)(unaff_x19 + 0x20);
        uVar23 = *(ulong *)(unaff_x19 + 0x10);
        if (uVar23 == *(ulong *)(unaff_x19 + 0x18)) {
          uVar21 = 0x20;
          if (uVar23 != 0) {
            uVar21 = uVar23 * 3 >> 1;
          }
          if ((uVar21 <= uVar23 || uVar21 >> 0x3d != 0) ||
             (lVar27 = func_0x0036e48c(*(undefined8 *)(unaff_x19 + 8),uVar21 << 3), lVar27 == 0)) {
            *(undefined2 *)(unaff_x19 + 0x28) = 0x101;
            goto code_r0x002a5e34;
          }
          *(long *)(unaff_x19 + 8) = lVar27;
          *(ulong *)(unaff_x19 + 0x18) = uVar21;
          uVar23 = *(ulong *)(unaff_x19 + 0x10);
        }
        else {
          lVar27 = *(long *)(unaff_x19 + 8);
        }
        *(undefined8 *)(lVar27 + uVar23 * 8) = uVar15;
        *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
      }
code_r0x002a5e34:
      puVar8 = (ulong *)func_0x0029e340();
      puVar9 = (ulong *)func_0x0029e340();
      uVar15 = func_0x0029e340();
      *(undefined8 *)(unaff_x29 + -0x58) = uVar15;
      uVar15 = func_0x0029e340();
      *(undefined8 *)(unaff_x29 + -0x68) = uVar15;
      puVar10 = (ulong *)func_0x0029e340();
      uVar15 = func_0x0029e340();
      *(undefined8 *)(unaff_x29 + -0x60) = uVar15;
      puVar11 = (ulong *)func_0x0029e340();
      puVar12 = (ulong *)func_0x0029e340();
      uVar23 = 0;
      if ((((((puVar8 == (ulong *)0x0) || (puVar9 == (ulong *)0x0)) ||
            (*(long *)(unaff_x29 + -0x58) == 0)) ||
           ((*(long *)(unaff_x29 + -0x68) == 0 || (puVar10 == (ulong *)0x0)))) ||
          (*(long *)(unaff_x29 + -0x60) == 0)) ||
         ((puVar11 == (ulong *)0x0 || (puVar12 == (ulong *)0x0)))) {
LAB_002a6abc:
        if (*(char *)(unaff_x19 + 0x28) != '\0') {
          return uVar23;
        }
        if (*(long *)(unaff_x19 + 0x10) != 0) {
          lVar27 = *(long *)(unaff_x19 + 0x10) + -1;
          *(long *)(unaff_x19 + 0x10) = lVar27;
          *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar27 * 8)
          ;
          return uVar23;
        }
        func_0x0079db4c(uVar23);
code_r0x002a6ae8:
        func_0x0079dea4();
      }
      else {
        if (puVar8 != unaff_x24) {
          uVar23 = func_0x0029afb8(puVar8,(long)(int)unaff_x24[1]);
          if ((int)uVar23 == 0) goto LAB_002a6abc;
          uVar20 = 0;
          if ((int)unaff_x24[1] != 0) {
            pcVar16 = (char *)((long)(int)unaff_x24[1] << 3);
            _memcpy(*puVar8,*unaff_x24);
            uVar20 = (undefined4)unaff_x24[1];
          }
          *(undefined4 *)(puVar8 + 1) = uVar20;
          *(int *)(puVar8 + 2) = (int)unaff_x24[2];
        }
        lVar27 = func_0x0029bd80(puVar9);
        uVar23 = 0;
        if ((((lVar27 == 0) ||
             (uVar23 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x58)), (int)uVar23 == 0)) ||
            (uVar23 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x60)), (int)uVar23 == 0)) ||
           (((uVar23 = func_0x0029c3cc(puVar8,pcVar37), (int)uVar23 == 0 ||
             (uVar23 = func_0x0029c3cc(puVar9,pcVar37), (int)uVar23 == 0)) ||
            ((uVar23 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x58),pcVar37), (int)uVar23 == 0
             || (uVar23 = func_0x0029c3cc(puVar10,pcVar37), (int)uVar23 == 0))))))
        goto LAB_002a6abc;
        pcVar38 = (char *)(long)(int)uVar39;
        uVar23 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x68),pcVar38);
        if ((((int)uVar23 == 0) ||
            (uVar23 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x60),pcVar38), (int)uVar23 == 0)
            ) || ((uVar23 = func_0x0029c3cc(puVar11,pcVar37), (int)uVar23 == 0 ||
                  (uVar23 = func_0x0029c3cc(puVar12,pcVar37), (int)uVar23 == 0))))
        goto LAB_002a6abc;
        uVar23 = (long)(pcVar38 + (long)pcVar37) * 0x40;
        if (uVar23 < (ulong)((long)pcVar38 << 6)) {
          pcVar16 = (char *)((long)&segment_command_00000020.flags + 2);
          in_x4 = "\b\x04";
LAB_002a6ab4:
          pcVar18 = "/aws-lc/crypto/fipsmodule/bn/gcd_extra.c";
          func_0x0028f83c(3,0,pcVar16,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",in_x4);
          uVar23 = 0;
          goto LAB_002a6abc;
        }
        if (pcVar38 + (long)pcVar37 != (char *)0x0) {
          if (uVar23 < 2) {
            uVar23 = 1;
          }
          lVar27 = (long)pcVar37 * 8;
          uStack0000000000000030 = 0;
          pcVar25 = (char *)((ulong)pcVar37 & 0xfffffffffffffff8);
          pcVar22 = (char *)((ulong)pcVar38 & 0xfffffffffffffff8);
          do {
            uVar40 = -(*(ulong *)*puVar8 & 1) & -(*(ulong *)*puVar9 & 1);
            lVar13 = func_0x00382cc0(*puVar11,(ulong *)*puVar9,(ulong *)*puVar8,pcVar37);
            uVar17 = *puVar9;
            uVar26 = lVar13 - 1U & uVar40;
            uVar21 = *puVar11;
            bVar42 = (byte)uVar26;
            bVar43 = (byte)(uVar26 >> 8);
            bVar44 = (byte)(uVar26 >> 0x10);
            bVar45 = (byte)(uVar26 >> 0x18);
            bVar46 = (byte)(uVar26 >> 0x20);
            bVar47 = (byte)(uVar26 >> 0x28);
            bVar48 = (byte)(uVar26 >> 0x30);
            bVar49 = (byte)(uVar26 >> 0x38);
            if (uVar1 != 0) {
              uVar28 = ~uVar26;
              if ((uVar1 < 8) || (uVar17 < uVar21 + lVar27 && uVar21 < uVar17 + lVar27)) {
                pcVar16 = (char *)0x0;
              }
              else {
                puVar41 = (undefined8 *)(uVar17 + 0x20);
                puVar33 = (undefined8 *)(uVar21 + 0x20);
                pcVar16 = pcVar25;
                do {
                  uVar19 = puVar33[-3];
                  uVar15 = puVar33[-4];
                  uVar103 = puVar33[-1];
                  uVar93 = puVar33[-2];
                  uVar113 = puVar33[1];
                  uVar111 = *puVar33;
                  uVar115 = puVar33[3];
                  uVar114 = puVar33[2];
                  uVar117 = puVar41[-3];
                  uVar116 = puVar41[-4];
                  uVar119 = puVar41[-1];
                  uVar118 = puVar41[-2];
                  uVar121 = puVar41[1];
                  uVar120 = *puVar41;
                  uVar123 = puVar41[3];
                  uVar122 = puVar41[2];
                  bVar50 = (byte)uVar28;
                  bVar51 = (byte)(uVar28 >> 8);
                  bVar52 = (byte)(uVar28 >> 0x10);
                  bVar53 = (byte)(uVar28 >> 0x18);
                  bVar54 = (byte)(uVar28 >> 0x20);
                  bVar55 = (byte)(uVar28 >> 0x28);
                  bVar56 = (byte)(uVar28 >> 0x30);
                  bVar57 = (byte)(uVar28 >> 0x38);
                  puVar41[-3] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar57 |
                                         (byte)((ulong)uVar19 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar56 |
                                                  (byte)((ulong)uVar19 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar55 |
                                                           (byte)((ulong)uVar19 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                                    bVar54 | (byte)((ulong)uVar19 >>
                                                                                   0x20) & bVar46,
                                                                    CONCAT13((byte)((ulong)uVar117
                                                                                   >> 0x18) & bVar53
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x18) &
                                                                               bVar45,CONCAT12((byte
                                                  )((ulong)uVar117 >> 0x10) & bVar52 |
                                                  (byte)((ulong)uVar19 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar19 >> 8) & bVar43,
                                                           (byte)uVar117 & bVar50 |
                                                           (byte)uVar19 & bVar42)))))));
                  puVar41[-4] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar57 |
                                         (byte)((ulong)uVar15 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar56 |
                                                  (byte)((ulong)uVar15 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar55 |
                                                           (byte)((ulong)uVar15 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                    bVar54 | (byte)((ulong)uVar15 >>
                                                                                   0x20) & bVar46,
                                                                    CONCAT13((byte)((ulong)uVar116
                                                                                   >> 0x18) & bVar53
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x18) &
                                                                               bVar45,CONCAT12((byte
                                                  )((ulong)uVar116 >> 0x10) & bVar52 |
                                                  (byte)((ulong)uVar15 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar15 >> 8) & bVar43,
                                                           (byte)uVar116 & bVar50 |
                                                           (byte)uVar15 & bVar42)))))));
                  puVar41[-1] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar57 |
                                         (byte)((ulong)uVar103 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar56 |
                                                  (byte)((ulong)uVar103 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar55 |
                                                           (byte)((ulong)uVar103 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                                    bVar54 | (byte)((ulong)uVar103
                                                                                   >> 0x20) & bVar46
                                                                    ,CONCAT13((byte)((ulong)uVar119
                                                                                    >> 0x18) &
                                                                              bVar53 | (byte)((ulong
                                                  )uVar103 >> 0x18) & bVar45,
                                                  CONCAT12((byte)((ulong)uVar119 >> 0x10) & bVar52 |
                                                           (byte)((ulong)uVar103 >> 0x10) & bVar44,
                                                           CONCAT11((byte)((ulong)uVar119 >> 8) &
                                                                    bVar51 | (byte)((ulong)uVar103
                                                                                   >> 8) & bVar43,
                                                                    (byte)uVar119 & bVar50 |
                                                                    (byte)uVar103 & bVar42)))))));
                  puVar41[-2] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar57 |
                                         (byte)((ulong)uVar93 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar56 |
                                                  (byte)((ulong)uVar93 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar55 |
                                                           (byte)((ulong)uVar93 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                                    bVar54 | (byte)((ulong)uVar93 >>
                                                                                   0x20) & bVar46,
                                                                    CONCAT13((byte)((ulong)uVar118
                                                                                   >> 0x18) & bVar53
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x18) &
                                                                               bVar45,CONCAT12((byte
                                                  )((ulong)uVar118 >> 0x10) & bVar52 |
                                                  (byte)((ulong)uVar93 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar93 >> 8) & bVar43,
                                                           (byte)uVar118 & bVar50 |
                                                           (byte)uVar93 & bVar42)))))));
                  puVar41[1] = CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar57 |
                                        (byte)((ulong)uVar113 >> 0x38) & bVar49,
                                        CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar56 |
                                                 (byte)((ulong)uVar113 >> 0x30) & bVar48,
                                                 CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar55 |
                                                          (byte)((ulong)uVar113 >> 0x28) & bVar47,
                                                          CONCAT14((byte)((ulong)uVar121 >> 0x20) &
                                                                   bVar54 | (byte)((ulong)uVar113 >>
                                                                                  0x20) & bVar46,
                                                                   CONCAT13((byte)((ulong)uVar121 >>
                                                                                  0x18) & bVar53 |
                                                                            (byte)((ulong)uVar113 >>
                                                                                  0x18) & bVar45,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar121 >> 0x10) & bVar52 |
                                                  (byte)((ulong)uVar113 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar43,
                                                           (byte)uVar121 & bVar50 |
                                                           (byte)uVar113 & bVar42)))))));
                  *puVar41 = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar57 |
                                      (byte)((ulong)uVar111 >> 0x38) & bVar49,
                                      CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar56 |
                                               (byte)((ulong)uVar111 >> 0x30) & bVar48,
                                               CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar55 |
                                                        (byte)((ulong)uVar111 >> 0x28) & bVar47,
                                                        CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                                 bVar54 | (byte)((ulong)uVar111 >>
                                                                                0x20) & bVar46,
                                                                 CONCAT13((byte)((ulong)uVar120 >>
                                                                                0x18) & bVar53 |
                                                                          (byte)((ulong)uVar111 >>
                                                                                0x18) & bVar45,
                                                                          CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar52 |
                                                  (byte)((ulong)uVar111 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar43,
                                                           (byte)uVar120 & bVar50 |
                                                           (byte)uVar111 & bVar42)))))));
                  puVar41[3] = CONCAT17((byte)((ulong)uVar123 >> 0x38) & bVar57 |
                                        (byte)((ulong)uVar115 >> 0x38) & bVar49,
                                        CONCAT16((byte)((ulong)uVar123 >> 0x30) & bVar56 |
                                                 (byte)((ulong)uVar115 >> 0x30) & bVar48,
                                                 CONCAT15((byte)((ulong)uVar123 >> 0x28) & bVar55 |
                                                          (byte)((ulong)uVar115 >> 0x28) & bVar47,
                                                          CONCAT14((byte)((ulong)uVar123 >> 0x20) &
                                                                   bVar54 | (byte)((ulong)uVar115 >>
                                                                                  0x20) & bVar46,
                                                                   CONCAT13((byte)((ulong)uVar123 >>
                                                                                  0x18) & bVar53 |
                                                                            (byte)((ulong)uVar115 >>
                                                                                  0x18) & bVar45,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar123 >> 0x10) & bVar52 |
                                                  (byte)((ulong)uVar115 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar123 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar115 >> 8) & bVar43,
                                                           (byte)uVar123 & bVar50 |
                                                           (byte)uVar115 & bVar42)))))));
                  puVar41[2] = CONCAT17((byte)((ulong)uVar122 >> 0x38) & bVar57 |
                                        (byte)((ulong)uVar114 >> 0x38) & bVar49,
                                        CONCAT16((byte)((ulong)uVar122 >> 0x30) & bVar56 |
                                                 (byte)((ulong)uVar114 >> 0x30) & bVar48,
                                                 CONCAT15((byte)((ulong)uVar122 >> 0x28) & bVar55 |
                                                          (byte)((ulong)uVar114 >> 0x28) & bVar47,
                                                          CONCAT14((byte)((ulong)uVar122 >> 0x20) &
                                                                   bVar54 | (byte)((ulong)uVar114 >>
                                                                                  0x20) & bVar46,
                                                                   CONCAT13((byte)((ulong)uVar122 >>
                                                                                  0x18) & bVar53 |
                                                                            (byte)((ulong)uVar114 >>
                                                                                  0x18) & bVar45,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar122 >> 0x10) & bVar52 |
                                                  (byte)((ulong)uVar114 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar122 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar114 >> 8) & bVar43,
                                                           (byte)uVar122 & bVar50 |
                                                           (byte)uVar114 & bVar42)))))));
                  pcVar16 = pcVar16 + -8;
                  puVar41 = puVar41 + 8;
                  puVar33 = puVar33 + 8;
                } while (pcVar16 != (char *)0x0);
                pcVar16 = pcVar25;
                if (pcVar25 == pcVar37) goto LAB_002a6148;
              }
              lVar14 = (long)pcVar37 - (long)pcVar16;
              puVar31 = (ulong *)(uVar17 + (long)pcVar16 * 8);
              puVar34 = (ulong *)(uVar21 + (long)pcVar16 * 8);
              do {
                *puVar31 = *puVar31 & uVar28 | *puVar34 & uVar26;
                lVar14 = lVar14 + -1;
                puVar31 = puVar31 + 1;
                puVar34 = puVar34 + 1;
              } while (lVar14 != 0);
            }
LAB_002a6148:
            func_0x00382cc0(uVar21,*puVar8,uVar17,pcVar37);
            uVar40 = uVar40 & -lVar13;
            uVar21 = *puVar11;
            bVar50 = (byte)uVar40;
            bVar51 = (byte)(uVar40 >> 8);
            bVar52 = (byte)(uVar40 >> 0x10);
            bVar53 = (byte)(uVar40 >> 0x18);
            bVar54 = (byte)(uVar40 >> 0x20);
            bVar55 = (byte)(uVar40 >> 0x28);
            bVar56 = (byte)(uVar40 >> 0x30);
            bVar57 = (byte)(uVar40 >> 0x38);
            if (uVar1 != 0) {
              uVar28 = *puVar8;
              uVar17 = ~uVar40;
              if ((uVar1 < 8) || ((uVar28 < uVar21 + lVar27 && (uVar21 < uVar28 + lVar27)))) {
                pcVar16 = (char *)0x0;
              }
              else {
                puVar41 = (undefined8 *)(uVar28 + 0x20);
                puVar33 = (undefined8 *)(uVar21 + 0x20);
                pcVar16 = pcVar25;
                do {
                  uVar19 = puVar33[-3];
                  uVar15 = puVar33[-4];
                  uVar103 = puVar33[-1];
                  uVar93 = puVar33[-2];
                  uVar113 = puVar33[1];
                  uVar111 = *puVar33;
                  uVar115 = puVar33[3];
                  uVar114 = puVar33[2];
                  uVar117 = puVar41[-3];
                  uVar116 = puVar41[-4];
                  uVar119 = puVar41[-1];
                  uVar118 = puVar41[-2];
                  uVar121 = puVar41[1];
                  uVar120 = *puVar41;
                  uVar123 = puVar41[3];
                  uVar122 = puVar41[2];
                  bVar58 = (byte)uVar17;
                  bVar61 = (byte)(uVar17 >> 8);
                  bVar62 = (byte)(uVar17 >> 0x10);
                  bVar63 = (byte)(uVar17 >> 0x18);
                  bVar64 = (byte)(uVar17 >> 0x20);
                  bVar65 = (byte)(uVar17 >> 0x28);
                  bVar66 = (byte)(uVar17 >> 0x30);
                  bVar67 = (byte)(uVar17 >> 0x38);
                  puVar41[-3] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar67 |
                                         (byte)((ulong)uVar19 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar66 |
                                                  (byte)((ulong)uVar19 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar65 |
                                                           (byte)((ulong)uVar19 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                                    bVar64 | (byte)((ulong)uVar19 >>
                                                                                   0x20) & bVar54,
                                                                    CONCAT13((byte)((ulong)uVar117
                                                                                   >> 0x18) & bVar63
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x18) &
                                                                               bVar53,CONCAT12((byte
                                                  )((ulong)uVar117 >> 0x10) & bVar62 |
                                                  (byte)((ulong)uVar19 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar19 >> 8) & bVar51,
                                                           (byte)uVar117 & bVar58 |
                                                           (byte)uVar19 & bVar50)))))));
                  puVar41[-4] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar67 |
                                         (byte)((ulong)uVar15 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar66 |
                                                  (byte)((ulong)uVar15 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar65 |
                                                           (byte)((ulong)uVar15 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                    bVar64 | (byte)((ulong)uVar15 >>
                                                                                   0x20) & bVar54,
                                                                    CONCAT13((byte)((ulong)uVar116
                                                                                   >> 0x18) & bVar63
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x18) &
                                                                               bVar53,CONCAT12((byte
                                                  )((ulong)uVar116 >> 0x10) & bVar62 |
                                                  (byte)((ulong)uVar15 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar15 >> 8) & bVar51,
                                                           (byte)uVar116 & bVar58 |
                                                           (byte)uVar15 & bVar50)))))));
                  puVar41[-1] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar67 |
                                         (byte)((ulong)uVar103 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar66 |
                                                  (byte)((ulong)uVar103 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar65 |
                                                           (byte)((ulong)uVar103 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                                    bVar64 | (byte)((ulong)uVar103
                                                                                   >> 0x20) & bVar54
                                                                    ,CONCAT13((byte)((ulong)uVar119
                                                                                    >> 0x18) &
                                                                              bVar63 | (byte)((ulong
                                                  )uVar103 >> 0x18) & bVar53,
                                                  CONCAT12((byte)((ulong)uVar119 >> 0x10) & bVar62 |
                                                           (byte)((ulong)uVar103 >> 0x10) & bVar52,
                                                           CONCAT11((byte)((ulong)uVar119 >> 8) &
                                                                    bVar61 | (byte)((ulong)uVar103
                                                                                   >> 8) & bVar51,
                                                                    (byte)uVar119 & bVar58 |
                                                                    (byte)uVar103 & bVar50)))))));
                  puVar41[-2] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar67 |
                                         (byte)((ulong)uVar93 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar66 |
                                                  (byte)((ulong)uVar93 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar65 |
                                                           (byte)((ulong)uVar93 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                                    bVar64 | (byte)((ulong)uVar93 >>
                                                                                   0x20) & bVar54,
                                                                    CONCAT13((byte)((ulong)uVar118
                                                                                   >> 0x18) & bVar63
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x18) &
                                                                               bVar53,CONCAT12((byte
                                                  )((ulong)uVar118 >> 0x10) & bVar62 |
                                                  (byte)((ulong)uVar93 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar93 >> 8) & bVar51,
                                                           (byte)uVar118 & bVar58 |
                                                           (byte)uVar93 & bVar50)))))));
                  puVar41[1] = CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar67 |
                                        (byte)((ulong)uVar113 >> 0x38) & bVar57,
                                        CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar66 |
                                                 (byte)((ulong)uVar113 >> 0x30) & bVar56,
                                                 CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar65 |
                                                          (byte)((ulong)uVar113 >> 0x28) & bVar55,
                                                          CONCAT14((byte)((ulong)uVar121 >> 0x20) &
                                                                   bVar64 | (byte)((ulong)uVar113 >>
                                                                                  0x20) & bVar54,
                                                                   CONCAT13((byte)((ulong)uVar121 >>
                                                                                  0x18) & bVar63 |
                                                                            (byte)((ulong)uVar113 >>
                                                                                  0x18) & bVar53,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar121 >> 0x10) & bVar62 |
                                                  (byte)((ulong)uVar113 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar51,
                                                           (byte)uVar121 & bVar58 |
                                                           (byte)uVar113 & bVar50)))))));
                  *puVar41 = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar67 |
                                      (byte)((ulong)uVar111 >> 0x38) & bVar57,
                                      CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar66 |
                                               (byte)((ulong)uVar111 >> 0x30) & bVar56,
                                               CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar65 |
                                                        (byte)((ulong)uVar111 >> 0x28) & bVar55,
                                                        CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                                 bVar64 | (byte)((ulong)uVar111 >>
                                                                                0x20) & bVar54,
                                                                 CONCAT13((byte)((ulong)uVar120 >>
                                                                                0x18) & bVar63 |
                                                                          (byte)((ulong)uVar111 >>
                                                                                0x18) & bVar53,
                                                                          CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar62 |
                                                  (byte)((ulong)uVar111 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar51,
                                                           (byte)uVar120 & bVar58 |
                                                           (byte)uVar111 & bVar50)))))));
                  puVar41[3] = CONCAT17((byte)((ulong)uVar123 >> 0x38) & bVar67 |
                                        (byte)((ulong)uVar115 >> 0x38) & bVar57,
                                        CONCAT16((byte)((ulong)uVar123 >> 0x30) & bVar66 |
                                                 (byte)((ulong)uVar115 >> 0x30) & bVar56,
                                                 CONCAT15((byte)((ulong)uVar123 >> 0x28) & bVar65 |
                                                          (byte)((ulong)uVar115 >> 0x28) & bVar55,
                                                          CONCAT14((byte)((ulong)uVar123 >> 0x20) &
                                                                   bVar64 | (byte)((ulong)uVar115 >>
                                                                                  0x20) & bVar54,
                                                                   CONCAT13((byte)((ulong)uVar123 >>
                                                                                  0x18) & bVar63 |
                                                                            (byte)((ulong)uVar115 >>
                                                                                  0x18) & bVar53,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar123 >> 0x10) & bVar62 |
                                                  (byte)((ulong)uVar115 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar123 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar115 >> 8) & bVar51,
                                                           (byte)uVar123 & bVar58 |
                                                           (byte)uVar115 & bVar50)))))));
                  puVar41[2] = CONCAT17((byte)((ulong)uVar122 >> 0x38) & bVar67 |
                                        (byte)((ulong)uVar114 >> 0x38) & bVar57,
                                        CONCAT16((byte)((ulong)uVar122 >> 0x30) & bVar66 |
                                                 (byte)((ulong)uVar114 >> 0x30) & bVar56,
                                                 CONCAT15((byte)((ulong)uVar122 >> 0x28) & bVar65 |
                                                          (byte)((ulong)uVar114 >> 0x28) & bVar55,
                                                          CONCAT14((byte)((ulong)uVar122 >> 0x20) &
                                                                   bVar64 | (byte)((ulong)uVar114 >>
                                                                                  0x20) & bVar54,
                                                                   CONCAT13((byte)((ulong)uVar122 >>
                                                                                  0x18) & bVar63 |
                                                                            (byte)((ulong)uVar114 >>
                                                                                  0x18) & bVar53,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar122 >> 0x10) & bVar62 |
                                                  (byte)((ulong)uVar114 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar122 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar114 >> 8) & bVar51,
                                                           (byte)uVar122 & bVar58 |
                                                           (byte)uVar114 & bVar50)))))));
                  pcVar16 = pcVar16 + -8;
                  puVar41 = puVar41 + 8;
                  puVar33 = puVar33 + 8;
                } while (pcVar16 != (char *)0x0);
                pcVar16 = pcVar25;
                if (pcVar25 == pcVar37) goto code_r0x002a61dc;
              }
              lVar13 = (long)pcVar37 - (long)pcVar16;
              puVar31 = (ulong *)(uVar28 + (long)pcVar16 * 8);
              puVar34 = (ulong *)(uVar21 + (long)pcVar16 * 8);
              do {
                *puVar31 = *puVar31 & uVar17 | *puVar34 & uVar40;
                lVar13 = lVar13 + -1;
                puVar31 = puVar31 + 1;
                puVar34 = puVar34 + 1;
              } while (lVar13 != 0);
            }
code_r0x002a61dc:
            lVar13 = func_0x00382c70(uVar21,**(undefined8 **)(unaff_x29 + -0x58),*puVar10,pcVar37);
            lVar14 = func_0x00382cc0(*puVar12,*puVar11,*unaff_x22,pcVar37);
            uVar17 = lVar13 - lVar14;
            uVar21 = *puVar11;
            bVar58 = (byte)uVar17;
            bVar61 = (byte)(uVar17 >> 8);
            bVar62 = (byte)(uVar17 >> 0x10);
            bVar63 = (byte)(uVar17 >> 0x18);
            bVar64 = (byte)(uVar17 >> 0x20);
            bVar65 = (byte)(uVar17 >> 0x28);
            bVar66 = (byte)(uVar17 >> 0x30);
            bVar67 = (byte)(uVar17 >> 0x38);
            if (uVar1 != 0) {
              uVar29 = *puVar12;
              uVar28 = ~uVar17;
              if ((uVar1 < 8) || ((uVar21 < uVar29 + lVar27 && (uVar29 < uVar21 + lVar27)))) {
                pcVar16 = (char *)0x0;
code_r0x002a6260:
                lVar13 = (long)pcVar37 - (long)pcVar16;
                puVar31 = (ulong *)(uVar29 + (long)pcVar16 * 8);
                puVar34 = (ulong *)(uVar21 + (long)pcVar16 * 8);
                do {
                  *puVar34 = *puVar31 & uVar28 | *puVar34 & uVar17;
                  lVar13 = lVar13 + -1;
                  puVar31 = puVar31 + 1;
                  puVar34 = puVar34 + 1;
                } while (lVar13 != 0);
              }
              else {
                puVar41 = (undefined8 *)(uVar29 + 0x20);
                puVar33 = (undefined8 *)(uVar21 + 0x20);
                pcVar16 = pcVar25;
                do {
                  uVar19 = puVar33[-3];
                  uVar15 = puVar33[-4];
                  uVar103 = puVar33[-1];
                  uVar93 = puVar33[-2];
                  uVar113 = puVar33[1];
                  uVar111 = *puVar33;
                  uVar115 = puVar33[3];
                  uVar114 = puVar33[2];
                  uVar117 = puVar41[-3];
                  uVar116 = puVar41[-4];
                  uVar119 = puVar41[-1];
                  uVar118 = puVar41[-2];
                  uVar121 = puVar41[1];
                  uVar120 = *puVar41;
                  uVar123 = puVar41[3];
                  uVar122 = puVar41[2];
                  bVar68 = (byte)uVar28;
                  bVar69 = (byte)(uVar28 >> 8);
                  bVar70 = (byte)(uVar28 >> 0x10);
                  bVar71 = (byte)(uVar28 >> 0x18);
                  bVar72 = (byte)(uVar28 >> 0x20);
                  bVar73 = (byte)(uVar28 >> 0x28);
                  bVar74 = (byte)(uVar28 >> 0x30);
                  bVar75 = (byte)(uVar28 >> 0x38);
                  puVar33[-3] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar19 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar19 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar19 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar19 >>
                                                                                   0x20) & bVar64,
                                                                    CONCAT13((byte)((ulong)uVar117
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x18) &
                                                                               bVar63,CONCAT12((byte
                                                  )((ulong)uVar117 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar19 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar19 >> 8) & bVar61,
                                                           (byte)uVar117 & bVar68 |
                                                           (byte)uVar19 & bVar58)))))));
                  puVar33[-4] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar15 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar15 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar15 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar15 >>
                                                                                   0x20) & bVar64,
                                                                    CONCAT13((byte)((ulong)uVar116
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x18) &
                                                                               bVar63,CONCAT12((byte
                                                  )((ulong)uVar116 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar15 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar15 >> 8) & bVar61,
                                                           (byte)uVar116 & bVar68 |
                                                           (byte)uVar15 & bVar58)))))));
                  puVar33[-1] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar103 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar103 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar103 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar103
                                                                                   >> 0x20) & bVar64
                                                                    ,CONCAT13((byte)((ulong)uVar119
                                                                                    >> 0x18) &
                                                                              bVar71 | (byte)((ulong
                                                  )uVar103 >> 0x18) & bVar63,
                                                  CONCAT12((byte)((ulong)uVar119 >> 0x10) & bVar70 |
                                                           (byte)((ulong)uVar103 >> 0x10) & bVar62,
                                                           CONCAT11((byte)((ulong)uVar119 >> 8) &
                                                                    bVar69 | (byte)((ulong)uVar103
                                                                                   >> 8) & bVar61,
                                                                    (byte)uVar119 & bVar68 |
                                                                    (byte)uVar103 & bVar58)))))));
                  puVar33[-2] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar93 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar93 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar93 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar93 >>
                                                                                   0x20) & bVar64,
                                                                    CONCAT13((byte)((ulong)uVar118
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x18) &
                                                                               bVar63,CONCAT12((byte
                                                  )((ulong)uVar118 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar93 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar93 >> 8) & bVar61,
                                                           (byte)uVar118 & bVar68 |
                                                           (byte)uVar93 & bVar58)))))));
                  puVar33[1] = CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar113 >> 0x38) & bVar67,
                                        CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar113 >> 0x30) & bVar66,
                                                 CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar113 >> 0x28) & bVar65,
                                                          CONCAT14((byte)((ulong)uVar121 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar113 >>
                                                                                  0x20) & bVar64,
                                                                   CONCAT13((byte)((ulong)uVar121 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar113 >>
                                                                                  0x18) & bVar63,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar121 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar113 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar61,
                                                           (byte)uVar121 & bVar68 |
                                                           (byte)uVar113 & bVar58)))))));
                  *puVar33 = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar75 |
                                      (byte)((ulong)uVar111 >> 0x38) & bVar67,
                                      CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar74 |
                                               (byte)((ulong)uVar111 >> 0x30) & bVar66,
                                               CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar73 |
                                                        (byte)((ulong)uVar111 >> 0x28) & bVar65,
                                                        CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                                 bVar72 | (byte)((ulong)uVar111 >>
                                                                                0x20) & bVar64,
                                                                 CONCAT13((byte)((ulong)uVar120 >>
                                                                                0x18) & bVar71 |
                                                                          (byte)((ulong)uVar111 >>
                                                                                0x18) & bVar63,
                                                                          CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar111 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar61,
                                                           (byte)uVar120 & bVar68 |
                                                           (byte)uVar111 & bVar58)))))));
                  puVar33[3] = CONCAT17((byte)((ulong)uVar123 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar115 >> 0x38) & bVar67,
                                        CONCAT16((byte)((ulong)uVar123 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar115 >> 0x30) & bVar66,
                                                 CONCAT15((byte)((ulong)uVar123 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar115 >> 0x28) & bVar65,
                                                          CONCAT14((byte)((ulong)uVar123 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar115 >>
                                                                                  0x20) & bVar64,
                                                                   CONCAT13((byte)((ulong)uVar123 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar115 >>
                                                                                  0x18) & bVar63,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar123 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar115 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar123 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar115 >> 8) & bVar61,
                                                           (byte)uVar123 & bVar68 |
                                                           (byte)uVar115 & bVar58)))))));
                  puVar33[2] = CONCAT17((byte)((ulong)uVar122 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar114 >> 0x38) & bVar67,
                                        CONCAT16((byte)((ulong)uVar122 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar114 >> 0x30) & bVar66,
                                                 CONCAT15((byte)((ulong)uVar122 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar114 >> 0x28) & bVar65,
                                                          CONCAT14((byte)((ulong)uVar122 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar114 >>
                                                                                  0x20) & bVar64,
                                                                   CONCAT13((byte)((ulong)uVar122 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar114 >>
                                                                                  0x18) & bVar63,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar122 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar114 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar122 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar114 >> 8) & bVar61,
                                                           (byte)uVar122 & bVar68 |
                                                           (byte)uVar114 & bVar58)))))));
                  pcVar16 = pcVar16 + -8;
                  puVar41 = puVar41 + 8;
                  puVar33 = puVar33 + 8;
                } while (pcVar16 != (char *)0x0);
                pcVar16 = pcVar25;
                if (pcVar25 != pcVar37) goto code_r0x002a6260;
              }
              uVar29 = **(ulong **)(unaff_x29 + -0x58);
              uVar28 = ~uVar40;
              if ((uVar1 < 8) || (uVar29 < uVar21 + lVar27 && uVar21 < uVar29 + lVar27)) {
                pcVar16 = (char *)0x0;
code_r0x002a6340:
                lVar13 = (long)pcVar37 - (long)pcVar16;
                puVar31 = (ulong *)(uVar29 + (long)pcVar16 * 8);
                puVar34 = (ulong *)(uVar21 + (long)pcVar16 * 8);
                do {
                  *puVar31 = *puVar31 & uVar28 | *puVar34 & uVar40;
                  lVar13 = lVar13 + -1;
                  puVar31 = puVar31 + 1;
                  puVar34 = puVar34 + 1;
                } while (lVar13 != 0);
              }
              else {
                puVar41 = (undefined8 *)(uVar29 + 0x20);
                puVar33 = (undefined8 *)(uVar21 + 0x20);
                pcVar16 = pcVar25;
                do {
                  uVar19 = puVar33[-3];
                  uVar15 = puVar33[-4];
                  uVar103 = puVar33[-1];
                  uVar93 = puVar33[-2];
                  uVar113 = puVar33[1];
                  uVar111 = *puVar33;
                  uVar115 = puVar33[3];
                  uVar114 = puVar33[2];
                  uVar117 = puVar41[-3];
                  uVar116 = puVar41[-4];
                  uVar119 = puVar41[-1];
                  uVar118 = puVar41[-2];
                  uVar121 = puVar41[1];
                  uVar120 = *puVar41;
                  uVar123 = puVar41[3];
                  uVar122 = puVar41[2];
                  bVar68 = (byte)uVar28;
                  bVar69 = (byte)(uVar28 >> 8);
                  bVar70 = (byte)(uVar28 >> 0x10);
                  bVar71 = (byte)(uVar28 >> 0x18);
                  bVar72 = (byte)(uVar28 >> 0x20);
                  bVar73 = (byte)(uVar28 >> 0x28);
                  bVar74 = (byte)(uVar28 >> 0x30);
                  bVar75 = (byte)(uVar28 >> 0x38);
                  puVar41[-3] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar19 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar19 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar19 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar19 >>
                                                                                   0x20) & bVar54,
                                                                    CONCAT13((byte)((ulong)uVar117
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x18) &
                                                                               bVar53,CONCAT12((byte
                                                  )((ulong)uVar117 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar19 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar19 >> 8) & bVar51,
                                                           (byte)uVar117 & bVar68 |
                                                           (byte)uVar19 & bVar50)))))));
                  puVar41[-4] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar15 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar15 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar15 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar15 >>
                                                                                   0x20) & bVar54,
                                                                    CONCAT13((byte)((ulong)uVar116
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x18) &
                                                                               bVar53,CONCAT12((byte
                                                  )((ulong)uVar116 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar15 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar15 >> 8) & bVar51,
                                                           (byte)uVar116 & bVar68 |
                                                           (byte)uVar15 & bVar50)))))));
                  puVar41[-1] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar103 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar103 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar103 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar103
                                                                                   >> 0x20) & bVar54
                                                                    ,CONCAT13((byte)((ulong)uVar119
                                                                                    >> 0x18) &
                                                                              bVar71 | (byte)((ulong
                                                  )uVar103 >> 0x18) & bVar53,
                                                  CONCAT12((byte)((ulong)uVar119 >> 0x10) & bVar70 |
                                                           (byte)((ulong)uVar103 >> 0x10) & bVar52,
                                                           CONCAT11((byte)((ulong)uVar119 >> 8) &
                                                                    bVar69 | (byte)((ulong)uVar103
                                                                                   >> 8) & bVar51,
                                                                    (byte)uVar119 & bVar68 |
                                                                    (byte)uVar103 & bVar50)))))));
                  puVar41[-2] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar93 >> 0x38) & bVar57,
                                         CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar93 >> 0x30) & bVar56,
                                                  CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar93 >> 0x28) & bVar55,
                                                           CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar93 >>
                                                                                   0x20) & bVar54,
                                                                    CONCAT13((byte)((ulong)uVar118
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x18) &
                                                                               bVar53,CONCAT12((byte
                                                  )((ulong)uVar118 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar93 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar93 >> 8) & bVar51,
                                                           (byte)uVar118 & bVar68 |
                                                           (byte)uVar93 & bVar50)))))));
                  puVar41[1] = CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar113 >> 0x38) & bVar57,
                                        CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar113 >> 0x30) & bVar56,
                                                 CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar113 >> 0x28) & bVar55,
                                                          CONCAT14((byte)((ulong)uVar121 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar113 >>
                                                                                  0x20) & bVar54,
                                                                   CONCAT13((byte)((ulong)uVar121 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar113 >>
                                                                                  0x18) & bVar53,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar121 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar113 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar51,
                                                           (byte)uVar121 & bVar68 |
                                                           (byte)uVar113 & bVar50)))))));
                  *puVar41 = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar75 |
                                      (byte)((ulong)uVar111 >> 0x38) & bVar57,
                                      CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar74 |
                                               (byte)((ulong)uVar111 >> 0x30) & bVar56,
                                               CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar73 |
                                                        (byte)((ulong)uVar111 >> 0x28) & bVar55,
                                                        CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                                 bVar72 | (byte)((ulong)uVar111 >>
                                                                                0x20) & bVar54,
                                                                 CONCAT13((byte)((ulong)uVar120 >>
                                                                                0x18) & bVar71 |
                                                                          (byte)((ulong)uVar111 >>
                                                                                0x18) & bVar53,
                                                                          CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar111 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar51,
                                                           (byte)uVar120 & bVar68 |
                                                           (byte)uVar111 & bVar50)))))));
                  puVar41[3] = CONCAT17((byte)((ulong)uVar123 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar115 >> 0x38) & bVar57,
                                        CONCAT16((byte)((ulong)uVar123 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar115 >> 0x30) & bVar56,
                                                 CONCAT15((byte)((ulong)uVar123 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar115 >> 0x28) & bVar55,
                                                          CONCAT14((byte)((ulong)uVar123 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar115 >>
                                                                                  0x20) & bVar54,
                                                                   CONCAT13((byte)((ulong)uVar123 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar115 >>
                                                                                  0x18) & bVar53,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar123 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar115 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar123 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar115 >> 8) & bVar51,
                                                           (byte)uVar123 & bVar68 |
                                                           (byte)uVar115 & bVar50)))))));
                  puVar41[2] = CONCAT17((byte)((ulong)uVar122 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar114 >> 0x38) & bVar57,
                                        CONCAT16((byte)((ulong)uVar122 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar114 >> 0x30) & bVar56,
                                                 CONCAT15((byte)((ulong)uVar122 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar114 >> 0x28) & bVar55,
                                                          CONCAT14((byte)((ulong)uVar122 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar114 >>
                                                                                  0x20) & bVar54,
                                                                   CONCAT13((byte)((ulong)uVar122 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar114 >>
                                                                                  0x18) & bVar53,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar122 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar114 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar122 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar114 >> 8) & bVar51,
                                                           (byte)uVar122 & bVar68 |
                                                           (byte)uVar114 & bVar50)))))));
                  pcVar16 = pcVar16 + -8;
                  puVar41 = puVar41 + 8;
                  puVar33 = puVar33 + 8;
                } while (pcVar16 != (char *)0x0);
                pcVar16 = pcVar25;
                if (pcVar25 != pcVar37) goto code_r0x002a6340;
              }
              uVar29 = *puVar10;
              uVar28 = ~uVar26;
              if ((uVar1 < 8) || (uVar29 < uVar21 + lVar27 && uVar21 < uVar29 + lVar27)) {
                pcVar16 = (char *)0x0;
              }
              else {
                puVar41 = (undefined8 *)(uVar29 + 0x20);
                puVar33 = (undefined8 *)(uVar21 + 0x20);
                pcVar16 = pcVar25;
                do {
                  uVar19 = puVar33[-3];
                  uVar15 = puVar33[-4];
                  uVar103 = puVar33[-1];
                  uVar93 = puVar33[-2];
                  uVar113 = puVar33[1];
                  uVar111 = *puVar33;
                  uVar115 = puVar33[3];
                  uVar114 = puVar33[2];
                  uVar117 = puVar41[-3];
                  uVar116 = puVar41[-4];
                  uVar119 = puVar41[-1];
                  uVar118 = puVar41[-2];
                  uVar121 = puVar41[1];
                  uVar120 = *puVar41;
                  uVar123 = puVar41[3];
                  uVar122 = puVar41[2];
                  bVar68 = (byte)uVar28;
                  bVar69 = (byte)(uVar28 >> 8);
                  bVar70 = (byte)(uVar28 >> 0x10);
                  bVar71 = (byte)(uVar28 >> 0x18);
                  bVar72 = (byte)(uVar28 >> 0x20);
                  bVar73 = (byte)(uVar28 >> 0x28);
                  bVar74 = (byte)(uVar28 >> 0x30);
                  bVar75 = (byte)(uVar28 >> 0x38);
                  puVar41[-3] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar19 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar19 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar19 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar19 >>
                                                                                   0x20) & bVar46,
                                                                    CONCAT13((byte)((ulong)uVar117
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x18) &
                                                                               bVar45,CONCAT12((byte
                                                  )((ulong)uVar117 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar19 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar19 >> 8) & bVar43,
                                                           (byte)uVar117 & bVar68 |
                                                           (byte)uVar19 & bVar42)))))));
                  puVar41[-4] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar15 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar15 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar15 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar15 >>
                                                                                   0x20) & bVar46,
                                                                    CONCAT13((byte)((ulong)uVar116
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x18) &
                                                                               bVar45,CONCAT12((byte
                                                  )((ulong)uVar116 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar15 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar15 >> 8) & bVar43,
                                                           (byte)uVar116 & bVar68 |
                                                           (byte)uVar15 & bVar42)))))));
                  puVar41[-1] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar103 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar103 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar103 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar103
                                                                                   >> 0x20) & bVar46
                                                                    ,CONCAT13((byte)((ulong)uVar119
                                                                                    >> 0x18) &
                                                                              bVar71 | (byte)((ulong
                                                  )uVar103 >> 0x18) & bVar45,
                                                  CONCAT12((byte)((ulong)uVar119 >> 0x10) & bVar70 |
                                                           (byte)((ulong)uVar103 >> 0x10) & bVar44,
                                                           CONCAT11((byte)((ulong)uVar119 >> 8) &
                                                                    bVar69 | (byte)((ulong)uVar103
                                                                                   >> 8) & bVar43,
                                                                    (byte)uVar119 & bVar68 |
                                                                    (byte)uVar103 & bVar42)))))));
                  puVar41[-2] = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar93 >> 0x38) & bVar49,
                                         CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar93 >> 0x30) & bVar48,
                                                  CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar93 >> 0x28) & bVar47,
                                                           CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar93 >>
                                                                                   0x20) & bVar46,
                                                                    CONCAT13((byte)((ulong)uVar118
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x18) &
                                                                               bVar45,CONCAT12((byte
                                                  )((ulong)uVar118 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar93 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar93 >> 8) & bVar43,
                                                           (byte)uVar118 & bVar68 |
                                                           (byte)uVar93 & bVar42)))))));
                  puVar41[1] = CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar113 >> 0x38) & bVar49,
                                        CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar113 >> 0x30) & bVar48,
                                                 CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar113 >> 0x28) & bVar47,
                                                          CONCAT14((byte)((ulong)uVar121 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar113 >>
                                                                                  0x20) & bVar46,
                                                                   CONCAT13((byte)((ulong)uVar121 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar113 >>
                                                                                  0x18) & bVar45,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar121 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar113 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar43,
                                                           (byte)uVar121 & bVar68 |
                                                           (byte)uVar113 & bVar42)))))));
                  *puVar41 = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar75 |
                                      (byte)((ulong)uVar111 >> 0x38) & bVar49,
                                      CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar74 |
                                               (byte)((ulong)uVar111 >> 0x30) & bVar48,
                                               CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar73 |
                                                        (byte)((ulong)uVar111 >> 0x28) & bVar47,
                                                        CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                                 bVar72 | (byte)((ulong)uVar111 >>
                                                                                0x20) & bVar46,
                                                                 CONCAT13((byte)((ulong)uVar120 >>
                                                                                0x18) & bVar71 |
                                                                          (byte)((ulong)uVar111 >>
                                                                                0x18) & bVar45,
                                                                          CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar111 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar43,
                                                           (byte)uVar120 & bVar68 |
                                                           (byte)uVar111 & bVar42)))))));
                  puVar41[3] = CONCAT17((byte)((ulong)uVar123 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar115 >> 0x38) & bVar49,
                                        CONCAT16((byte)((ulong)uVar123 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar115 >> 0x30) & bVar48,
                                                 CONCAT15((byte)((ulong)uVar123 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar115 >> 0x28) & bVar47,
                                                          CONCAT14((byte)((ulong)uVar123 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar115 >>
                                                                                  0x20) & bVar46,
                                                                   CONCAT13((byte)((ulong)uVar123 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar115 >>
                                                                                  0x18) & bVar45,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar123 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar115 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar123 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar115 >> 8) & bVar43,
                                                           (byte)uVar123 & bVar68 |
                                                           (byte)uVar115 & bVar42)))))));
                  puVar41[2] = CONCAT17((byte)((ulong)uVar122 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar114 >> 0x38) & bVar49,
                                        CONCAT16((byte)((ulong)uVar122 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar114 >> 0x30) & bVar48,
                                                 CONCAT15((byte)((ulong)uVar122 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar114 >> 0x28) & bVar47,
                                                          CONCAT14((byte)((ulong)uVar122 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar114 >>
                                                                                  0x20) & bVar46,
                                                                   CONCAT13((byte)((ulong)uVar122 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar114 >>
                                                                                  0x18) & bVar45,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar122 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar114 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar122 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar114 >> 8) & bVar43,
                                                           (byte)uVar122 & bVar68 |
                                                           (byte)uVar114 & bVar42)))))));
                  pcVar16 = pcVar16 + -8;
                  puVar41 = puVar41 + 8;
                  puVar33 = puVar33 + 8;
                } while (pcVar16 != (char *)0x0);
                pcVar16 = pcVar25;
                if (pcVar25 == pcVar37) goto code_r0x002a6450;
              }
              lVar13 = (long)pcVar37 - (long)pcVar16;
              puVar31 = (ulong *)(uVar29 + (long)pcVar16 * 8);
              puVar34 = (ulong *)(uVar21 + (long)pcVar16 * 8);
              do {
                *puVar31 = *puVar31 & uVar28 | *puVar34 & uVar26;
                lVar13 = lVar13 + -1;
                puVar31 = puVar31 + 1;
                puVar34 = puVar34 + 1;
              } while (lVar13 != 0);
            }
code_r0x002a6450:
            func_0x00382c70(uVar21,**(undefined8 **)(unaff_x29 + -0x68),
                            **(undefined8 **)(unaff_x29 + -0x60),pcVar38);
            pcVar18 = pcVar38;
            func_0x00382cc0(*puVar12,*puVar11,*unaff_x24);
            pcVar16 = (char *)*puVar11;
            if (uVar39 != 0) {
              pbVar30 = (byte *)*puVar12;
              uVar21 = ~uVar17;
              if ((uVar39 < 8) ||
                 (pcVar16 < pbVar30 + (long)pcVar38 * 8 && pbVar30 < pcVar16 + (long)pcVar38 * 8)) {
                pcVar36 = (char *)0x0;
code_r0x002a653c:
                lVar13 = (long)pcVar38 - (long)pcVar36;
                puVar31 = (ulong *)(pbVar30 + (long)pcVar36 * 8);
                pcVar36 = pcVar16 + (long)pcVar36 * 8;
                do {
                  *(ulong *)pcVar36 = *puVar31 & uVar21 | *(ulong *)pcVar36 & uVar17;
                  lVar13 = lVar13 + -1;
                  puVar31 = puVar31 + 1;
                  pcVar36 = pcVar36 + 8;
                } while (lVar13 != 0);
              }
              else {
                pbVar32 = pbVar30 + 0x20;
                pqVar35 = (qword *)(pcVar16 + 0x20);
                pcVar36 = pcVar22;
                do {
                  uVar19 = pqVar35[-3];
                  uVar15 = pqVar35[-4];
                  qVar102 = pqVar35[-1];
                  uVar93 = pqVar35[-2];
                  uVar103 = pqVar35[1];
                  qVar112 = *pqVar35;
                  uVar113 = pqVar35[3];
                  uVar111 = pqVar35[2];
                  uVar115 = *(undefined8 *)(pbVar32 + -0x18);
                  uVar114 = *(undefined8 *)(pbVar32 + -0x20);
                  uVar117 = *(undefined8 *)(pbVar32 + -8);
                  uVar116 = *(undefined8 *)(pbVar32 + -0x10);
                  uVar119 = *(undefined8 *)(pbVar32 + 8);
                  uVar118 = *(undefined8 *)pbVar32;
                  uVar121 = *(undefined8 *)(pbVar32 + 0x18);
                  uVar120 = *(undefined8 *)(pbVar32 + 0x10);
                  bVar68 = (byte)uVar21;
                  bVar69 = (byte)(uVar21 >> 8);
                  bVar70 = (byte)(uVar21 >> 0x10);
                  bVar71 = (byte)(uVar21 >> 0x18);
                  bVar72 = (byte)(uVar21 >> 0x20);
                  bVar73 = (byte)(uVar21 >> 0x28);
                  bVar74 = (byte)(uVar21 >> 0x30);
                  bVar75 = (byte)(uVar21 >> 0x38);
                  pqVar35[-3] = CONCAT17((byte)((ulong)uVar115 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar19 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar115 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar19 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar115 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar19 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar115 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar19 >>
                                                                                   0x20) & bVar64,
                                                                    CONCAT13((byte)((ulong)uVar115
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x18) &
                                                                               bVar63,CONCAT12((byte
                                                  )((ulong)uVar115 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar19 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar115 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar19 >> 8) & bVar61,
                                                           (byte)uVar115 & bVar68 |
                                                           (byte)uVar19 & bVar58)))))));
                  pqVar35[-4] = CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar15 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar15 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar15 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar114 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar15 >>
                                                                                   0x20) & bVar64,
                                                                    CONCAT13((byte)((ulong)uVar114
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x18) &
                                                                               bVar63,CONCAT12((byte
                                                  )((ulong)uVar114 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar15 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar114 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar15 >> 8) & bVar61,
                                                           (byte)uVar114 & bVar68 |
                                                           (byte)uVar15 & bVar58)))))));
                  pqVar35[-1] = CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar75 |
                                         (byte)(qVar102 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar74 |
                                                  (byte)(qVar102 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar73 |
                                                           (byte)(qVar102 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar117 >> 0x20) &
                                                                    bVar72 | (byte)(qVar102 >> 0x20)
                                                                             & bVar64,
                                                                    CONCAT13((byte)((ulong)uVar117
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)(qVar102 >>
                                                                                     0x18) & bVar63,
                                                                             CONCAT12((byte)((ulong)
                                                  uVar117 >> 0x10) & bVar70 |
                                                  (byte)(qVar102 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar117 >> 8) & bVar69 |
                                                           (byte)(qVar102 >> 8) & bVar61,
                                                           (byte)uVar117 & bVar68 |
                                                           (byte)qVar102 & bVar58)))))));
                  pqVar35[-2] = CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar75 |
                                         (byte)((ulong)uVar93 >> 0x38) & bVar67,
                                         CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar74 |
                                                  (byte)((ulong)uVar93 >> 0x30) & bVar66,
                                                  CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar73 |
                                                           (byte)((ulong)uVar93 >> 0x28) & bVar65,
                                                           CONCAT14((byte)((ulong)uVar116 >> 0x20) &
                                                                    bVar72 | (byte)((ulong)uVar93 >>
                                                                                   0x20) & bVar64,
                                                                    CONCAT13((byte)((ulong)uVar116
                                                                                   >> 0x18) & bVar71
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x18) &
                                                                               bVar63,CONCAT12((byte
                                                  )((ulong)uVar116 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar93 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar116 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar93 >> 8) & bVar61,
                                                           (byte)uVar116 & bVar68 |
                                                           (byte)uVar93 & bVar58)))))));
                  pqVar35[1] = CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar103 >> 0x38) & bVar67,
                                        CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar103 >> 0x30) & bVar66,
                                                 CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar103 >> 0x28) & bVar65,
                                                          CONCAT14((byte)((ulong)uVar119 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar103 >>
                                                                                  0x20) & bVar64,
                                                                   CONCAT13((byte)((ulong)uVar119 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar103 >>
                                                                                  0x18) & bVar63,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar119 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar103 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar103 >> 8) & bVar61,
                                                           (byte)uVar119 & bVar68 |
                                                           (byte)uVar103 & bVar58)))))));
                  *pqVar35 = CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar75 |
                                      (byte)(qVar112 >> 0x38) & bVar67,
                                      CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar74 |
                                               (byte)(qVar112 >> 0x30) & bVar66,
                                               CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar73 |
                                                        (byte)(qVar112 >> 0x28) & bVar65,
                                                        CONCAT14((byte)((ulong)uVar118 >> 0x20) &
                                                                 bVar72 | (byte)(qVar112 >> 0x20) &
                                                                          bVar64,
                                                                 CONCAT13((byte)((ulong)uVar118 >>
                                                                                0x18) & bVar71 |
                                                                          (byte)(qVar112 >> 0x18) &
                                                                          bVar63,CONCAT12((byte)((
                                                  ulong)uVar118 >> 0x10) & bVar70 |
                                                  (byte)(qVar112 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar118 >> 8) & bVar69 |
                                                           (byte)(qVar112 >> 8) & bVar61,
                                                           (byte)uVar118 & bVar68 |
                                                           (byte)qVar112 & bVar58)))))));
                  pqVar35[3] = CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar113 >> 0x38) & bVar67,
                                        CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar113 >> 0x30) & bVar66,
                                                 CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar113 >> 0x28) & bVar65,
                                                          CONCAT14((byte)((ulong)uVar121 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar113 >>
                                                                                  0x20) & bVar64,
                                                                   CONCAT13((byte)((ulong)uVar121 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar113 >>
                                                                                  0x18) & bVar63,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar121 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar113 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar61,
                                                           (byte)uVar121 & bVar68 |
                                                           (byte)uVar113 & bVar58)))))));
                  pqVar35[2] = CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar75 |
                                        (byte)((ulong)uVar111 >> 0x38) & bVar67,
                                        CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar74 |
                                                 (byte)((ulong)uVar111 >> 0x30) & bVar66,
                                                 CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar73 |
                                                          (byte)((ulong)uVar111 >> 0x28) & bVar65,
                                                          CONCAT14((byte)((ulong)uVar120 >> 0x20) &
                                                                   bVar72 | (byte)((ulong)uVar111 >>
                                                                                  0x20) & bVar64,
                                                                   CONCAT13((byte)((ulong)uVar120 >>
                                                                                  0x18) & bVar71 |
                                                                            (byte)((ulong)uVar111 >>
                                                                                  0x18) & bVar63,
                                                                            CONCAT12((byte)((ulong)
                                                  uVar120 >> 0x10) & bVar70 |
                                                  (byte)((ulong)uVar111 >> 0x10) & bVar62,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar69 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar61,
                                                           (byte)uVar120 & bVar68 |
                                                           (byte)uVar111 & bVar58)))))));
                  pcVar36 = pcVar36 + -8;
                  pbVar32 = pbVar32 + 0x40;
                  pqVar35 = pqVar35 + 8;
                } while (pcVar36 != (char *)0x0);
                pcVar36 = pcVar22;
                if (pcVar22 != pcVar38) goto code_r0x002a653c;
              }
              pbVar30 = (byte *)**(undefined8 **)(unaff_x29 + -0x68);
              uVar21 = ~uVar40;
              if ((uVar39 < 8) ||
                 (pbVar30 < pcVar16 + (long)pcVar38 * 8 && pcVar16 < pbVar30 + (long)pcVar38 * 8)) {
                pcVar36 = (char *)0x0;
code_r0x002a661c:
                lVar13 = (long)pcVar38 - (long)pcVar36;
                puVar31 = (ulong *)(pbVar30 + (long)pcVar36 * 8);
                pcVar36 = pcVar16 + (long)pcVar36 * 8;
                do {
                  *puVar31 = *puVar31 & uVar21 | *(ulong *)pcVar36 & uVar40;
                  lVar13 = lVar13 + -1;
                  puVar31 = puVar31 + 1;
                  pcVar36 = pcVar36 + 8;
                } while (lVar13 != 0);
              }
              else {
                pbVar32 = pbVar30 + 0x20;
                pqVar35 = (qword *)(pcVar16 + 0x20);
                pcVar36 = pcVar22;
                do {
                  uVar19 = pqVar35[-3];
                  uVar15 = pqVar35[-4];
                  qVar102 = pqVar35[-1];
                  uVar93 = pqVar35[-2];
                  uVar103 = pqVar35[1];
                  qVar112 = *pqVar35;
                  uVar113 = pqVar35[3];
                  uVar111 = pqVar35[2];
                  uVar115 = *(undefined8 *)(pbVar32 + -0x18);
                  uVar114 = *(undefined8 *)(pbVar32 + -0x20);
                  uVar117 = *(undefined8 *)(pbVar32 + -8);
                  uVar116 = *(undefined8 *)(pbVar32 + -0x10);
                  uVar119 = *(undefined8 *)(pbVar32 + 8);
                  uVar118 = *(undefined8 *)pbVar32;
                  uVar121 = *(undefined8 *)(pbVar32 + 0x18);
                  uVar120 = *(undefined8 *)(pbVar32 + 0x10);
                  bVar58 = (byte)uVar21;
                  bVar61 = (byte)(uVar21 >> 8);
                  bVar62 = (byte)(uVar21 >> 0x10);
                  bVar63 = (byte)(uVar21 >> 0x18);
                  bVar64 = (byte)(uVar21 >> 0x20);
                  bVar65 = (byte)(uVar21 >> 0x28);
                  bVar66 = (byte)(uVar21 >> 0x30);
                  bVar67 = (byte)(uVar21 >> 0x38);
                  *(ulong *)(pbVar32 + -0x18) =
                       CONCAT17((byte)((ulong)uVar115 >> 0x38) & bVar67 |
                                (byte)((ulong)uVar19 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar115 >> 0x30) & bVar66 |
                                         (byte)((ulong)uVar19 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar115 >> 0x28) & bVar65 |
                                                  (byte)((ulong)uVar19 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar115 >> 0x20) & bVar64 |
                                                           (byte)((ulong)uVar19 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar115 >> 0x18) &
                                                                    bVar63 | (byte)((ulong)uVar19 >>
                                                                                   0x18) & bVar53,
                                                                    CONCAT12((byte)((ulong)uVar115
                                                                                   >> 0x10) & bVar62
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x10) &
                                                                               bVar52,CONCAT11((byte
                                                  )((ulong)uVar115 >> 8) & bVar61 |
                                                  (byte)((ulong)uVar19 >> 8) & bVar51,
                                                  (byte)uVar115 & bVar58 | (byte)uVar19 & bVar50))))
                                                 )));
                  *(ulong *)(pbVar32 + -0x20) =
                       CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar67 |
                                (byte)((ulong)uVar15 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar66 |
                                         (byte)((ulong)uVar15 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar65 |
                                                  (byte)((ulong)uVar15 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar114 >> 0x20) & bVar64 |
                                                           (byte)((ulong)uVar15 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar114 >> 0x18) &
                                                                    bVar63 | (byte)((ulong)uVar15 >>
                                                                                   0x18) & bVar53,
                                                                    CONCAT12((byte)((ulong)uVar114
                                                                                   >> 0x10) & bVar62
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x10) &
                                                                               bVar52,CONCAT11((byte
                                                  )((ulong)uVar114 >> 8) & bVar61 |
                                                  (byte)((ulong)uVar15 >> 8) & bVar51,
                                                  (byte)uVar114 & bVar58 | (byte)uVar15 & bVar50))))
                                                 )));
                  *(ulong *)(pbVar32 + -8) =
                       CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar67 |
                                (byte)(qVar102 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar66 |
                                         (byte)(qVar102 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar65 |
                                                  (byte)(qVar102 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar117 >> 0x20) & bVar64 |
                                                           (byte)(qVar102 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar117 >> 0x18) &
                                                                    bVar63 | (byte)(qVar102 >> 0x18)
                                                                             & bVar53,
                                                                    CONCAT12((byte)((ulong)uVar117
                                                                                   >> 0x10) & bVar62
                                                                             | (byte)(qVar102 >>
                                                                                     0x10) & bVar52,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar117 >> 8) & bVar61 |
                                                  (byte)(qVar102 >> 8) & bVar51,
                                                  (byte)uVar117 & bVar58 | (byte)qVar102 & bVar50)))
                                                  ))));
                  *(ulong *)(pbVar32 + -0x10) =
                       CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar67 |
                                (byte)((ulong)uVar93 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar66 |
                                         (byte)((ulong)uVar93 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar65 |
                                                  (byte)((ulong)uVar93 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar116 >> 0x20) & bVar64 |
                                                           (byte)((ulong)uVar93 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar116 >> 0x18) &
                                                                    bVar63 | (byte)((ulong)uVar93 >>
                                                                                   0x18) & bVar53,
                                                                    CONCAT12((byte)((ulong)uVar116
                                                                                   >> 0x10) & bVar62
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x10) &
                                                                               bVar52,CONCAT11((byte
                                                  )((ulong)uVar116 >> 8) & bVar61 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar51,
                                                  (byte)uVar116 & bVar58 | (byte)uVar93 & bVar50))))
                                                 )));
                  *(ulong *)(pbVar32 + 8) =
                       CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar67 |
                                (byte)((ulong)uVar103 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar66 |
                                         (byte)((ulong)uVar103 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar65 |
                                                  (byte)((ulong)uVar103 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar119 >> 0x20) & bVar64 |
                                                           (byte)((ulong)uVar103 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar119 >> 0x18) &
                                                                    bVar63 | (byte)((ulong)uVar103
                                                                                   >> 0x18) & bVar53
                                                                    ,CONCAT12((byte)((ulong)uVar119
                                                                                    >> 0x10) &
                                                                              bVar62 | (byte)((ulong
                                                  )uVar103 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar103 >> 8) & bVar51,
                                                           (byte)uVar119 & bVar58 |
                                                           (byte)uVar103 & bVar50)))))));
                  *(ulong *)pbVar32 =
                       CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar67 |
                                (byte)(qVar112 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar66 |
                                         (byte)(qVar112 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar65 |
                                                  (byte)(qVar112 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar118 >> 0x20) & bVar64 |
                                                           (byte)(qVar112 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar118 >> 0x18) &
                                                                    bVar63 | (byte)(qVar112 >> 0x18)
                                                                             & bVar53,
                                                                    CONCAT12((byte)((ulong)uVar118
                                                                                   >> 0x10) & bVar62
                                                                             | (byte)(qVar112 >>
                                                                                     0x10) & bVar52,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar118 >> 8) & bVar61 |
                                                  (byte)(qVar112 >> 8) & bVar51,
                                                  (byte)uVar118 & bVar58 | (byte)qVar112 & bVar50)))
                                                  ))));
                  *(ulong *)(pbVar32 + 0x18) =
                       CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar67 |
                                (byte)((ulong)uVar113 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar66 |
                                         (byte)((ulong)uVar113 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar65 |
                                                  (byte)((ulong)uVar113 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar121 >> 0x20) & bVar64 |
                                                           (byte)((ulong)uVar113 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar121 >> 0x18) &
                                                                    bVar63 | (byte)((ulong)uVar113
                                                                                   >> 0x18) & bVar53
                                                                    ,CONCAT12((byte)((ulong)uVar121
                                                                                    >> 0x10) &
                                                                              bVar62 | (byte)((ulong
                                                  )uVar113 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar51,
                                                           (byte)uVar121 & bVar58 |
                                                           (byte)uVar113 & bVar50)))))));
                  *(ulong *)(pbVar32 + 0x10) =
                       CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar67 |
                                (byte)((ulong)uVar111 >> 0x38) & bVar57,
                                CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar66 |
                                         (byte)((ulong)uVar111 >> 0x30) & bVar56,
                                         CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar65 |
                                                  (byte)((ulong)uVar111 >> 0x28) & bVar55,
                                                  CONCAT14((byte)((ulong)uVar120 >> 0x20) & bVar64 |
                                                           (byte)((ulong)uVar111 >> 0x20) & bVar54,
                                                           CONCAT13((byte)((ulong)uVar120 >> 0x18) &
                                                                    bVar63 | (byte)((ulong)uVar111
                                                                                   >> 0x18) & bVar53
                                                                    ,CONCAT12((byte)((ulong)uVar120
                                                                                    >> 0x10) &
                                                                              bVar62 | (byte)((ulong
                                                  )uVar111 >> 0x10) & bVar52,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar61 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar51,
                                                           (byte)uVar120 & bVar58 |
                                                           (byte)uVar111 & bVar50)))))));
                  pcVar36 = pcVar36 + -8;
                  pbVar32 = pbVar32 + 0x40;
                  pqVar35 = pqVar35 + 8;
                } while (pcVar36 != (char *)0x0);
                pcVar36 = pcVar22;
                if (pcVar22 != pcVar38) goto code_r0x002a661c;
              }
              pbVar30 = (byte *)**(undefined8 **)(unaff_x29 + -0x60);
              uVar21 = ~uVar26;
              if ((uVar39 < 8) ||
                 (pbVar30 < pcVar16 + (long)pcVar38 * 8 && pcVar16 < pbVar30 + (long)pcVar38 * 8)) {
                pcVar36 = (char *)0x0;
              }
              else {
                pbVar32 = pbVar30 + 0x20;
                pqVar35 = (qword *)(pcVar16 + 0x20);
                pcVar36 = pcVar22;
                do {
                  uVar19 = pqVar35[-3];
                  uVar15 = pqVar35[-4];
                  qVar102 = pqVar35[-1];
                  uVar93 = pqVar35[-2];
                  uVar103 = pqVar35[1];
                  qVar112 = *pqVar35;
                  uVar113 = pqVar35[3];
                  uVar111 = pqVar35[2];
                  uVar115 = *(undefined8 *)(pbVar32 + -0x18);
                  uVar114 = *(undefined8 *)(pbVar32 + -0x20);
                  uVar117 = *(undefined8 *)(pbVar32 + -8);
                  uVar116 = *(undefined8 *)(pbVar32 + -0x10);
                  uVar119 = *(undefined8 *)(pbVar32 + 8);
                  uVar118 = *(undefined8 *)pbVar32;
                  uVar121 = *(undefined8 *)(pbVar32 + 0x18);
                  uVar120 = *(undefined8 *)(pbVar32 + 0x10);
                  bVar50 = (byte)uVar21;
                  bVar51 = (byte)(uVar21 >> 8);
                  bVar52 = (byte)(uVar21 >> 0x10);
                  bVar53 = (byte)(uVar21 >> 0x18);
                  bVar54 = (byte)(uVar21 >> 0x20);
                  bVar55 = (byte)(uVar21 >> 0x28);
                  bVar56 = (byte)(uVar21 >> 0x30);
                  bVar57 = (byte)(uVar21 >> 0x38);
                  *(ulong *)(pbVar32 + -0x18) =
                       CONCAT17((byte)((ulong)uVar115 >> 0x38) & bVar57 |
                                (byte)((ulong)uVar19 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar115 >> 0x30) & bVar56 |
                                         (byte)((ulong)uVar19 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar115 >> 0x28) & bVar55 |
                                                  (byte)((ulong)uVar19 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar115 >> 0x20) & bVar54 |
                                                           (byte)((ulong)uVar19 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar115 >> 0x18) &
                                                                    bVar53 | (byte)((ulong)uVar19 >>
                                                                                   0x18) & bVar45,
                                                                    CONCAT12((byte)((ulong)uVar115
                                                                                   >> 0x10) & bVar52
                                                                             | (byte)((ulong)uVar19
                                                                                     >> 0x10) &
                                                                               bVar44,CONCAT11((byte
                                                  )((ulong)uVar115 >> 8) & bVar51 |
                                                  (byte)((ulong)uVar19 >> 8) & bVar43,
                                                  (byte)uVar115 & bVar50 | (byte)uVar19 & bVar42))))
                                                 )));
                  *(ulong *)(pbVar32 + -0x20) =
                       CONCAT17((byte)((ulong)uVar114 >> 0x38) & bVar57 |
                                (byte)((ulong)uVar15 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar114 >> 0x30) & bVar56 |
                                         (byte)((ulong)uVar15 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar114 >> 0x28) & bVar55 |
                                                  (byte)((ulong)uVar15 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar114 >> 0x20) & bVar54 |
                                                           (byte)((ulong)uVar15 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar114 >> 0x18) &
                                                                    bVar53 | (byte)((ulong)uVar15 >>
                                                                                   0x18) & bVar45,
                                                                    CONCAT12((byte)((ulong)uVar114
                                                                                   >> 0x10) & bVar52
                                                                             | (byte)((ulong)uVar15
                                                                                     >> 0x10) &
                                                                               bVar44,CONCAT11((byte
                                                  )((ulong)uVar114 >> 8) & bVar51 |
                                                  (byte)((ulong)uVar15 >> 8) & bVar43,
                                                  (byte)uVar114 & bVar50 | (byte)uVar15 & bVar42))))
                                                 )));
                  *(ulong *)(pbVar32 + -8) =
                       CONCAT17((byte)((ulong)uVar117 >> 0x38) & bVar57 |
                                (byte)(qVar102 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar117 >> 0x30) & bVar56 |
                                         (byte)(qVar102 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar117 >> 0x28) & bVar55 |
                                                  (byte)(qVar102 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar117 >> 0x20) & bVar54 |
                                                           (byte)(qVar102 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar117 >> 0x18) &
                                                                    bVar53 | (byte)(qVar102 >> 0x18)
                                                                             & bVar45,
                                                                    CONCAT12((byte)((ulong)uVar117
                                                                                   >> 0x10) & bVar52
                                                                             | (byte)(qVar102 >>
                                                                                     0x10) & bVar44,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar117 >> 8) & bVar51 |
                                                  (byte)(qVar102 >> 8) & bVar43,
                                                  (byte)uVar117 & bVar50 | (byte)qVar102 & bVar42)))
                                                  ))));
                  *(ulong *)(pbVar32 + -0x10) =
                       CONCAT17((byte)((ulong)uVar116 >> 0x38) & bVar57 |
                                (byte)((ulong)uVar93 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar116 >> 0x30) & bVar56 |
                                         (byte)((ulong)uVar93 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar116 >> 0x28) & bVar55 |
                                                  (byte)((ulong)uVar93 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar116 >> 0x20) & bVar54 |
                                                           (byte)((ulong)uVar93 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar116 >> 0x18) &
                                                                    bVar53 | (byte)((ulong)uVar93 >>
                                                                                   0x18) & bVar45,
                                                                    CONCAT12((byte)((ulong)uVar116
                                                                                   >> 0x10) & bVar52
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x10) &
                                                                               bVar44,CONCAT11((byte
                                                  )((ulong)uVar116 >> 8) & bVar51 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar43,
                                                  (byte)uVar116 & bVar50 | (byte)uVar93 & bVar42))))
                                                 )));
                  *(ulong *)(pbVar32 + 8) =
                       CONCAT17((byte)((ulong)uVar119 >> 0x38) & bVar57 |
                                (byte)((ulong)uVar103 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar119 >> 0x30) & bVar56 |
                                         (byte)((ulong)uVar103 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar119 >> 0x28) & bVar55 |
                                                  (byte)((ulong)uVar103 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar119 >> 0x20) & bVar54 |
                                                           (byte)((ulong)uVar103 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar119 >> 0x18) &
                                                                    bVar53 | (byte)((ulong)uVar103
                                                                                   >> 0x18) & bVar45
                                                                    ,CONCAT12((byte)((ulong)uVar119
                                                                                    >> 0x10) &
                                                                              bVar52 | (byte)((ulong
                                                  )uVar103 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar119 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar103 >> 8) & bVar43,
                                                           (byte)uVar119 & bVar50 |
                                                           (byte)uVar103 & bVar42)))))));
                  *(ulong *)pbVar32 =
                       CONCAT17((byte)((ulong)uVar118 >> 0x38) & bVar57 |
                                (byte)(qVar112 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar118 >> 0x30) & bVar56 |
                                         (byte)(qVar112 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar118 >> 0x28) & bVar55 |
                                                  (byte)(qVar112 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar118 >> 0x20) & bVar54 |
                                                           (byte)(qVar112 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar118 >> 0x18) &
                                                                    bVar53 | (byte)(qVar112 >> 0x18)
                                                                             & bVar45,
                                                                    CONCAT12((byte)((ulong)uVar118
                                                                                   >> 0x10) & bVar52
                                                                             | (byte)(qVar112 >>
                                                                                     0x10) & bVar44,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar118 >> 8) & bVar51 |
                                                  (byte)(qVar112 >> 8) & bVar43,
                                                  (byte)uVar118 & bVar50 | (byte)qVar112 & bVar42)))
                                                  ))));
                  *(ulong *)(pbVar32 + 0x18) =
                       CONCAT17((byte)((ulong)uVar121 >> 0x38) & bVar57 |
                                (byte)((ulong)uVar113 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar121 >> 0x30) & bVar56 |
                                         (byte)((ulong)uVar113 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar121 >> 0x28) & bVar55 |
                                                  (byte)((ulong)uVar113 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar121 >> 0x20) & bVar54 |
                                                           (byte)((ulong)uVar113 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar121 >> 0x18) &
                                                                    bVar53 | (byte)((ulong)uVar113
                                                                                   >> 0x18) & bVar45
                                                                    ,CONCAT12((byte)((ulong)uVar121
                                                                                    >> 0x10) &
                                                                              bVar52 | (byte)((ulong
                                                  )uVar113 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar121 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar113 >> 8) & bVar43,
                                                           (byte)uVar121 & bVar50 |
                                                           (byte)uVar113 & bVar42)))))));
                  *(ulong *)(pbVar32 + 0x10) =
                       CONCAT17((byte)((ulong)uVar120 >> 0x38) & bVar57 |
                                (byte)((ulong)uVar111 >> 0x38) & bVar49,
                                CONCAT16((byte)((ulong)uVar120 >> 0x30) & bVar56 |
                                         (byte)((ulong)uVar111 >> 0x30) & bVar48,
                                         CONCAT15((byte)((ulong)uVar120 >> 0x28) & bVar55 |
                                                  (byte)((ulong)uVar111 >> 0x28) & bVar47,
                                                  CONCAT14((byte)((ulong)uVar120 >> 0x20) & bVar54 |
                                                           (byte)((ulong)uVar111 >> 0x20) & bVar46,
                                                           CONCAT13((byte)((ulong)uVar120 >> 0x18) &
                                                                    bVar53 | (byte)((ulong)uVar111
                                                                                   >> 0x18) & bVar45
                                                                    ,CONCAT12((byte)((ulong)uVar120
                                                                                    >> 0x10) &
                                                                              bVar52 | (byte)((ulong
                                                  )uVar111 >> 0x10) & bVar44,
                                                  CONCAT11((byte)((ulong)uVar120 >> 8) & bVar51 |
                                                           (byte)((ulong)uVar111 >> 8) & bVar43,
                                                           (byte)uVar120 & bVar50 |
                                                           (byte)uVar111 & bVar42)))))));
                  pcVar36 = pcVar36 + -8;
                  pbVar32 = pbVar32 + 0x40;
                  pqVar35 = pqVar35 + 8;
                } while (pcVar36 != (char *)0x0);
                pcVar36 = pcVar22;
                if (pcVar22 == pcVar38) goto code_r0x002a672c;
              }
              lVar13 = (long)pcVar38 - (long)pcVar36;
              puVar31 = (ulong *)(pbVar30 + (long)pcVar36 * 8);
              pcVar36 = pcVar16 + (long)pcVar36 * 8;
              do {
                *puVar31 = *puVar31 & uVar21 | *(ulong *)pcVar36 & uVar26;
                lVar13 = lVar13 + -1;
                puVar31 = puVar31 + 1;
                pcVar36 = pcVar36 + 8;
              } while (lVar13 != 0);
            }
code_r0x002a672c:
            if ((*(ulong *)*puVar8 & 1) == (*(ulong *)*puVar9 & 1)) goto code_r0x002a6ae8;
            pcVar16 = (char *)((*(ulong *)*puVar9 & 1) - 1);
            uVar21 = (*(ulong *)*puVar8 & 1) - 1;
            func_0x002a8410();
            puVar41 = *(undefined8 **)(unaff_x29 + -0x68);
            uVar17 = (-(*(ulong *)*puVar41 & 1) |
                     -(*(ulong *)**(undefined8 **)(unaff_x29 + -0x58) & 1)) & uVar21;
            uVar15 = func_0x002a85f8((ulong *)**(undefined8 **)(unaff_x29 + -0x58),uVar17,*unaff_x22
                                     ,*puVar11,pcVar37);
            uVar19 = func_0x002a85f8(*puVar41,uVar17,*unaff_x24,*puVar11,pcVar38);
            func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x58),uVar15,uVar21,*puVar11,pcVar37);
            func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x68),uVar19,uVar21,*puVar11,pcVar38);
            func_0x002a8410(*puVar9,pcVar16,*puVar11,pcVar37);
            uVar21 = (-(*(ulong *)**(undefined8 **)(unaff_x29 + -0x60) & 1) |
                     -(*(ulong *)*puVar10 & 1)) & (ulong)pcVar16;
            uVar15 = func_0x002a85f8((ulong *)*puVar10,uVar21,*unaff_x22,*puVar11,pcVar37);
            uVar19 = func_0x002a85f8(**(undefined8 **)(unaff_x29 + -0x60),uVar21,*unaff_x24,*puVar11
                                     ,pcVar38);
            func_0x002a8714(*puVar10,uVar15,pcVar16,*puVar11,pcVar37);
            pcVar18 = (char *)*puVar11;
            in_x4 = pcVar38;
            func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x60),uVar19,pcVar16,pcVar18,pcVar38);
            uStack0000000000000030 = uStack0000000000000030 + 1;
          } while (uStack0000000000000030 != uVar23);
        }
        uVar1 = (uint)puVar9[1];
        uVar23 = (ulong)(int)uVar1;
        if (uVar1 == 0) {
LAB_002a6a70:
          iVar7 = func_0x0029dd44(puVar8);
          if (iVar7 != 0) {
            lVar27 = func_0x0029bd80();
            uVar23 = (ulong)(lVar27 != 0);
            goto LAB_002a6abc;
          }
          *unaff_x20 = 1;
          pcVar16 = section_00000068.sectname + 8;
          in_x4 = "";
          goto LAB_002a6ab4;
        }
        if (uVar1 < 8) {
          uVar17 = 0;
          uVar21 = 0;
LAB_002a6a54:
          lVar27 = uVar23 - uVar17;
          puVar9 = (ulong *)(*puVar9 + uVar17 * 8);
          do {
            uVar21 = *puVar9 | uVar21;
            lVar27 = lVar27 + -1;
            puVar9 = puVar9 + 1;
          } while (lVar27 != 0);
        }
        else {
          uVar17 = uVar23 & 0xfffffffffffffff8;
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
          uVar15 = 0;
          uVar19 = 0;
          uVar93 = 0;
          uVar103 = 0;
          puVar41 = (undefined8 *)(*puVar9 + 0x20);
          uVar21 = uVar17;
          do {
            uVar113 = puVar41[-3];
            uVar111 = puVar41[-4];
            uVar115 = puVar41[-1];
            uVar114 = puVar41[-2];
            uVar117 = puVar41[1];
            uVar116 = *puVar41;
            uVar119 = puVar41[3];
            uVar118 = puVar41[2];
            bVar42 = (byte)uVar111 | bVar42;
            bVar43 = (byte)((ulong)uVar111 >> 8) | bVar43;
            bVar44 = (byte)((ulong)uVar111 >> 0x10) | bVar44;
            bVar45 = (byte)((ulong)uVar111 >> 0x18) | bVar45;
            bVar46 = (byte)((ulong)uVar111 >> 0x20) | bVar46;
            bVar47 = (byte)((ulong)uVar111 >> 0x28) | bVar47;
            bVar48 = (byte)((ulong)uVar111 >> 0x30) | bVar48;
            bVar49 = (byte)((ulong)uVar111 >> 0x38) | bVar49;
            bVar50 = (byte)uVar113 | bVar50;
            bVar51 = (byte)((ulong)uVar113 >> 8) | bVar51;
            bVar52 = (byte)((ulong)uVar113 >> 0x10) | bVar52;
            bVar53 = (byte)((ulong)uVar113 >> 0x18) | bVar53;
            bVar54 = (byte)((ulong)uVar113 >> 0x20) | bVar54;
            bVar55 = (byte)((ulong)uVar113 >> 0x28) | bVar55;
            bVar56 = (byte)((ulong)uVar113 >> 0x30) | bVar56;
            bVar57 = (byte)((ulong)uVar113 >> 0x38) | bVar57;
            bVar58 = (byte)uVar114 | bVar58;
            bVar61 = (byte)((ulong)uVar114 >> 8) | bVar61;
            bVar62 = (byte)((ulong)uVar114 >> 0x10) | bVar62;
            bVar63 = (byte)((ulong)uVar114 >> 0x18) | bVar63;
            bVar64 = (byte)((ulong)uVar114 >> 0x20) | bVar64;
            bVar65 = (byte)((ulong)uVar114 >> 0x28) | bVar65;
            bVar66 = (byte)((ulong)uVar114 >> 0x30) | bVar66;
            bVar67 = (byte)((ulong)uVar114 >> 0x38) | bVar67;
            bVar68 = (byte)uVar115 | bVar68;
            bVar69 = (byte)((ulong)uVar115 >> 8) | bVar69;
            bVar70 = (byte)((ulong)uVar115 >> 0x10) | bVar70;
            bVar71 = (byte)((ulong)uVar115 >> 0x18) | bVar71;
            bVar72 = (byte)((ulong)uVar115 >> 0x20) | bVar72;
            bVar73 = (byte)((ulong)uVar115 >> 0x28) | bVar73;
            bVar74 = (byte)((ulong)uVar115 >> 0x30) | bVar74;
            bVar75 = (byte)((ulong)uVar115 >> 0x38) | bVar75;
            bVar76 = (byte)uVar116 | (byte)uVar15;
            bVar77 = (byte)((ulong)uVar116 >> 8) | (byte)((ulong)uVar15 >> 8);
            bVar78 = (byte)((ulong)uVar116 >> 0x10) | (byte)((ulong)uVar15 >> 0x10);
            bVar79 = (byte)((ulong)uVar116 >> 0x18) | (byte)((ulong)uVar15 >> 0x18);
            bVar80 = (byte)((ulong)uVar116 >> 0x20) | (byte)((ulong)uVar15 >> 0x20);
            bVar81 = (byte)((ulong)uVar116 >> 0x28) | (byte)((ulong)uVar15 >> 0x28);
            bVar82 = (byte)((ulong)uVar116 >> 0x30) | (byte)((ulong)uVar15 >> 0x30);
            bVar83 = (byte)((ulong)uVar116 >> 0x38) | (byte)((ulong)uVar15 >> 0x38);
            uVar15 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79
                                                  ,CONCAT12(bVar78,CONCAT11(bVar77,bVar76)))))));
            bVar84 = (byte)uVar117 | (byte)uVar19;
            bVar85 = (byte)((ulong)uVar117 >> 8) | (byte)((ulong)uVar19 >> 8);
            bVar86 = (byte)((ulong)uVar117 >> 0x10) | (byte)((ulong)uVar19 >> 0x10);
            bVar87 = (byte)((ulong)uVar117 >> 0x18) | (byte)((ulong)uVar19 >> 0x18);
            bVar88 = (byte)((ulong)uVar117 >> 0x20) | (byte)((ulong)uVar19 >> 0x20);
            bVar89 = (byte)((ulong)uVar117 >> 0x28) | (byte)((ulong)uVar19 >> 0x28);
            bVar90 = (byte)((ulong)uVar117 >> 0x30) | (byte)((ulong)uVar19 >> 0x30);
            bVar91 = (byte)((ulong)uVar117 >> 0x38) | (byte)((ulong)uVar19 >> 0x38);
            uVar19 = CONCAT17(bVar91,CONCAT16(bVar90,CONCAT15(bVar89,CONCAT14(bVar88,CONCAT13(bVar87
                                                  ,CONCAT12(bVar86,CONCAT11(bVar85,bVar84)))))));
            bVar92 = (byte)uVar118 | (byte)uVar93;
            bVar94 = (byte)((ulong)uVar118 >> 8) | (byte)((ulong)uVar93 >> 8);
            bVar95 = (byte)((ulong)uVar118 >> 0x10) | (byte)((ulong)uVar93 >> 0x10);
            bVar96 = (byte)((ulong)uVar118 >> 0x18) | (byte)((ulong)uVar93 >> 0x18);
            bVar97 = (byte)((ulong)uVar118 >> 0x20) | (byte)((ulong)uVar93 >> 0x20);
            bVar98 = (byte)((ulong)uVar118 >> 0x28) | (byte)((ulong)uVar93 >> 0x28);
            bVar99 = (byte)((ulong)uVar118 >> 0x30) | (byte)((ulong)uVar93 >> 0x30);
            bVar100 = (byte)((ulong)uVar118 >> 0x38) | (byte)((ulong)uVar93 >> 0x38);
            uVar93 = CONCAT17(bVar100,CONCAT16(bVar99,CONCAT15(bVar98,CONCAT14(bVar97,CONCAT13(
                                                  bVar96,CONCAT12(bVar95,CONCAT11(bVar94,bVar92)))))
                                              ));
            bVar101 = (byte)uVar119 | (byte)uVar103;
            bVar104 = (byte)((ulong)uVar119 >> 8) | (byte)((ulong)uVar103 >> 8);
            bVar105 = (byte)((ulong)uVar119 >> 0x10) | (byte)((ulong)uVar103 >> 0x10);
            bVar106 = (byte)((ulong)uVar119 >> 0x18) | (byte)((ulong)uVar103 >> 0x18);
            bVar107 = (byte)((ulong)uVar119 >> 0x20) | (byte)((ulong)uVar103 >> 0x20);
            bVar108 = (byte)((ulong)uVar119 >> 0x28) | (byte)((ulong)uVar103 >> 0x28);
            bVar109 = (byte)((ulong)uVar119 >> 0x30) | (byte)((ulong)uVar103 >> 0x30);
            bVar110 = (byte)((ulong)uVar119 >> 0x38) | (byte)((ulong)uVar103 >> 0x38);
            uVar103 = CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,CONCAT13(
                                                  bVar106,CONCAT12(bVar105,CONCAT11(bVar104,bVar101)
                                                                  ))))));
            uVar21 = uVar21 - 8;
            puVar41 = puVar41 + 8;
          } while (uVar21 != 0);
          bVar92 = bVar92 | bVar76 | bVar58 | bVar42;
          bVar94 = bVar94 | bVar77 | bVar61 | bVar43;
          bVar95 = bVar95 | bVar78 | bVar62 | bVar44;
          bVar96 = bVar96 | bVar79 | bVar63 | bVar45;
          bVar97 = bVar97 | bVar80 | bVar64 | bVar46;
          bVar98 = bVar98 | bVar81 | bVar65 | bVar47;
          bVar99 = bVar99 | bVar82 | bVar66 | bVar48;
          bVar100 = bVar100 | bVar83 | bVar67 | bVar49;
          bVar101 = bVar101 | bVar84 | bVar68 | bVar50;
          bVar104 = bVar104 | bVar85 | bVar69 | bVar51;
          bVar105 = bVar105 | bVar86 | bVar70 | bVar52;
          bVar106 = bVar106 | bVar87 | bVar71 | bVar53;
          bVar107 = bVar107 | bVar88 | bVar72 | bVar54;
          bVar108 = bVar108 | bVar89 | bVar73 | bVar55;
          bVar109 = bVar109 | bVar90 | bVar74 | bVar56;
          bVar110 = bVar110 | bVar91 | bVar75 | bVar57;
          auVar2[1] = bVar94;
          auVar2[0] = bVar92;
          auVar2[2] = bVar95;
          auVar2[3] = bVar96;
          auVar2[4] = bVar97;
          auVar2[5] = bVar98;
          auVar2[6] = bVar99;
          auVar2[7] = bVar100;
          auVar2[8] = bVar101;
          auVar2[9] = bVar104;
          auVar2[10] = bVar105;
          auVar2[0xb] = bVar106;
          auVar2[0xc] = bVar107;
          auVar2[0xd] = bVar108;
          auVar2[0xe] = bVar109;
          auVar2[0xf] = bVar110;
          auVar3[1] = bVar94;
          auVar3[0] = bVar92;
          auVar3[2] = bVar95;
          auVar3[3] = bVar96;
          auVar3[4] = bVar97;
          auVar3[5] = bVar98;
          auVar3[6] = bVar99;
          auVar3[7] = bVar100;
          auVar3[8] = bVar101;
          auVar3[9] = bVar104;
          auVar3[10] = bVar105;
          auVar3[0xb] = bVar106;
          auVar3[0xc] = bVar107;
          auVar3[0xd] = bVar108;
          auVar3[0xe] = bVar109;
          auVar3[0xf] = bVar110;
          auVar124 = NEON_ext(auVar2,auVar3,8,1);
          uVar21 = CONCAT17(bVar100 | auVar124[7],
                            CONCAT16(bVar99 | auVar124[6],
                                     CONCAT15(bVar98 | auVar124[5],
                                              CONCAT14(bVar97 | auVar124[4],
                                                       CONCAT13(bVar96 | auVar124[3],
                                                                CONCAT12(bVar95 | auVar124[2],
                                                                         CONCAT11(bVar94 | auVar124[
                                                  1],bVar92 | auVar124[0])))))));
          if (uVar17 != uVar23) goto LAB_002a6a54;
        }
        if (uVar21 == 0) goto LAB_002a6a70;
      }
      auVar124 = func_0x0079de7c();
      uVar15 = auVar124._0_8_;
      *auVar124._8_8_ = 0;
      if (((*(int *)(pcVar16 + 0x10) != 0) || (*(int *)(pcVar18 + 0x28) != 0)) ||
         (iVar7 = func_0x0029d99c(*(undefined8 *)pcVar16,(long)*(int *)(pcVar16 + 8),
                                  *(undefined8 *)(pcVar18 + 0x18),(long)*(int *)(pcVar18 + 0x20)),
         -1 < iVar7)) {
        func_0x0028f83c(3,0,0x6b,"/aws-lc/crypto/fipsmodule/bn/gcd.c",0x14e);
        return 0;
      }
      uStack_58 = 0;
      uStack_50 = 0;
      uStack_48 = 0;
      iVar7 = func_0x0029afb8(&uStack_58,(long)*(int *)(pcVar18 + 0x20));
      if ((iVar7 != 0) &&
         (iVar7 = func_0x002afddc(uStack_58,1,*(undefined8 *)(pcVar18 + 0x18),
                                  (long)*(int *)(pcVar18 + 0x20),&UNK_008310d0), iVar7 != 0)) {
        uStack_48 = uStack_48 & 0xffffffff00000000;
        uStack_50 = CONCAT44(uStack_50._4_4_,*(undefined4 *)(pcVar18 + 0x20));
        iVar7 = func_0x002a3110(uVar15,&uStack_58,pcVar16,pcVar18,in_x4);
        if ((iVar7 != 0) &&
           (iVar7 = func_0x002a50c8(uVar15,auVar124._8_8_,uVar15,pcVar18 + 0x18,in_x4), iVar7 != 0))
        {
          uVar23 = func_0x002a3110(uVar15,&uStack_58,uVar15,pcVar18,in_x4);
          goto code_r0x002a6c38;
        }
      }
      uVar23 = 0;
code_r0x002a6c38:
      if ((uStack_48._4_4_ >> 1 & 1) == 0) {
        func_0x0036e3d8(uStack_58);
      }
      if ((uStack_48._4_4_ & 1) != 0) {
        func_0x0036e3d8(&uStack_58);
      }
      return uVar23;
    }
  }
  if ((uVar1 != 0) && (*(int *)(unaff_x22 + 2) == 0)) {
    uVar23 = *(ulong *)pcVar38 ^ 1;
    if (1 < (int)uVar1) {
      if (uVar1 < 9) {
        uVar21 = 1;
      }
      else {
        uVar17 = (ulong)uVar1 - 1;
        uVar40 = uVar17 & 0xfffffffffffffff8;
        uVar21 = uVar40 | 1;
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
        auVar59._8_8_ = 0;
        auVar59._0_8_ = uVar23;
        uVar15 = 0;
        uVar19 = 0;
        uVar93 = 0;
        uVar103 = 0;
        pdVar24 = (dword *)(pcVar38 + 0x28);
        uVar23 = uVar40;
        do {
          uVar113 = *(undefined8 *)(pdVar24 + -6);
          uVar111 = *(undefined8 *)(pdVar24 + -8);
          qVar112 = *(qword *)(pdVar24 + -2);
          qVar102 = *(qword *)(pdVar24 + -4);
          uVar115 = *(undefined8 *)(pdVar24 + 2);
          uVar114 = *(undefined8 *)pdVar24;
          uVar117 = *(undefined8 *)(pdVar24 + 6);
          uVar116 = *(undefined8 *)(pdVar24 + 4);
          auVar60[0] = (byte)uVar111 | auVar59[0];
          auVar60[1] = (byte)((ulong)uVar111 >> 8) | auVar59[1];
          auVar60[2] = (byte)((ulong)uVar111 >> 0x10) | auVar59[2];
          auVar60[3] = (byte)((ulong)uVar111 >> 0x18) | auVar59[3];
          auVar60[4] = (byte)((ulong)uVar111 >> 0x20) | auVar59[4];
          auVar60[5] = (byte)((ulong)uVar111 >> 0x28) | auVar59[5];
          auVar60[6] = (byte)((ulong)uVar111 >> 0x30) | auVar59[6];
          auVar60[7] = (byte)((ulong)uVar111 >> 0x38) | auVar59[7];
          auVar60[8] = (byte)uVar113 | auVar59[8];
          auVar60[9] = (byte)((ulong)uVar113 >> 8) | auVar59[9];
          auVar60[10] = (byte)((ulong)uVar113 >> 0x10) | auVar59[10];
          auVar60[0xb] = (byte)((ulong)uVar113 >> 0x18) | auVar59[0xb];
          auVar60[0xc] = (byte)((ulong)uVar113 >> 0x20) | auVar59[0xc];
          auVar60[0xd] = (byte)((ulong)uVar113 >> 0x28) | auVar59[0xd];
          auVar60[0xe] = (byte)((ulong)uVar113 >> 0x30) | auVar59[0xe];
          auVar60[0xf] = (byte)((ulong)uVar113 >> 0x38) | auVar59[0xf];
          bVar42 = (byte)qVar102 | bVar42;
          bVar43 = (byte)(qVar102 >> 8) | bVar43;
          bVar44 = (byte)(qVar102 >> 0x10) | bVar44;
          bVar45 = (byte)(qVar102 >> 0x18) | bVar45;
          bVar46 = (byte)(qVar102 >> 0x20) | bVar46;
          bVar47 = (byte)(qVar102 >> 0x28) | bVar47;
          bVar48 = (byte)(qVar102 >> 0x30) | bVar48;
          bVar49 = (byte)(qVar102 >> 0x38) | bVar49;
          bVar50 = (byte)qVar112 | bVar50;
          bVar51 = (byte)(qVar112 >> 8) | bVar51;
          bVar52 = (byte)(qVar112 >> 0x10) | bVar52;
          bVar53 = (byte)(qVar112 >> 0x18) | bVar53;
          bVar54 = (byte)(qVar112 >> 0x20) | bVar54;
          bVar55 = (byte)(qVar112 >> 0x28) | bVar55;
          bVar56 = (byte)(qVar112 >> 0x30) | bVar56;
          bVar57 = (byte)(qVar112 >> 0x38) | bVar57;
          bVar92 = (byte)uVar114 | (byte)uVar15;
          bVar94 = (byte)((ulong)uVar114 >> 8) | (byte)((ulong)uVar15 >> 8);
          bVar95 = (byte)((ulong)uVar114 >> 0x10) | (byte)((ulong)uVar15 >> 0x10);
          bVar96 = (byte)((ulong)uVar114 >> 0x18) | (byte)((ulong)uVar15 >> 0x18);
          bVar97 = (byte)((ulong)uVar114 >> 0x20) | (byte)((ulong)uVar15 >> 0x20);
          bVar98 = (byte)((ulong)uVar114 >> 0x28) | (byte)((ulong)uVar15 >> 0x28);
          bVar99 = (byte)((ulong)uVar114 >> 0x30) | (byte)((ulong)uVar15 >> 0x30);
          bVar100 = (byte)((ulong)uVar114 >> 0x38) | (byte)((ulong)uVar15 >> 0x38);
          uVar15 = CONCAT17(bVar100,CONCAT16(bVar99,CONCAT15(bVar98,CONCAT14(bVar97,CONCAT13(bVar96,
                                                  CONCAT12(bVar95,CONCAT11(bVar94,bVar92)))))));
          bVar101 = (byte)uVar115 | (byte)uVar19;
          bVar104 = (byte)((ulong)uVar115 >> 8) | (byte)((ulong)uVar19 >> 8);
          bVar105 = (byte)((ulong)uVar115 >> 0x10) | (byte)((ulong)uVar19 >> 0x10);
          bVar106 = (byte)((ulong)uVar115 >> 0x18) | (byte)((ulong)uVar19 >> 0x18);
          bVar107 = (byte)((ulong)uVar115 >> 0x20) | (byte)((ulong)uVar19 >> 0x20);
          bVar108 = (byte)((ulong)uVar115 >> 0x28) | (byte)((ulong)uVar19 >> 0x28);
          bVar109 = (byte)((ulong)uVar115 >> 0x30) | (byte)((ulong)uVar19 >> 0x30);
          bVar110 = (byte)((ulong)uVar115 >> 0x38) | (byte)((ulong)uVar19 >> 0x38);
          uVar19 = CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,CONCAT13(
                                                  bVar106,CONCAT12(bVar105,CONCAT11(bVar104,bVar101)
                                                                  ))))));
          bVar58 = (byte)uVar116 | (byte)uVar93;
          bVar61 = (byte)((ulong)uVar116 >> 8) | (byte)((ulong)uVar93 >> 8);
          bVar62 = (byte)((ulong)uVar116 >> 0x10) | (byte)((ulong)uVar93 >> 0x10);
          bVar63 = (byte)((ulong)uVar116 >> 0x18) | (byte)((ulong)uVar93 >> 0x18);
          bVar64 = (byte)((ulong)uVar116 >> 0x20) | (byte)((ulong)uVar93 >> 0x20);
          bVar65 = (byte)((ulong)uVar116 >> 0x28) | (byte)((ulong)uVar93 >> 0x28);
          bVar66 = (byte)((ulong)uVar116 >> 0x30) | (byte)((ulong)uVar93 >> 0x30);
          bVar67 = (byte)((ulong)uVar116 >> 0x38) | (byte)((ulong)uVar93 >> 0x38);
          uVar93 = CONCAT17(bVar67,CONCAT16(bVar66,CONCAT15(bVar65,CONCAT14(bVar64,CONCAT13(bVar63,
                                                  CONCAT12(bVar62,CONCAT11(bVar61,bVar58)))))));
          bVar68 = (byte)uVar117 | (byte)uVar103;
          bVar69 = (byte)((ulong)uVar117 >> 8) | (byte)((ulong)uVar103 >> 8);
          bVar70 = (byte)((ulong)uVar117 >> 0x10) | (byte)((ulong)uVar103 >> 0x10);
          bVar71 = (byte)((ulong)uVar117 >> 0x18) | (byte)((ulong)uVar103 >> 0x18);
          bVar72 = (byte)((ulong)uVar117 >> 0x20) | (byte)((ulong)uVar103 >> 0x20);
          bVar73 = (byte)((ulong)uVar117 >> 0x28) | (byte)((ulong)uVar103 >> 0x28);
          bVar74 = (byte)((ulong)uVar117 >> 0x30) | (byte)((ulong)uVar103 >> 0x30);
          bVar75 = (byte)((ulong)uVar117 >> 0x38) | (byte)((ulong)uVar103 >> 0x38);
          uVar103 = CONCAT17(bVar75,CONCAT16(bVar74,CONCAT15(bVar73,CONCAT14(bVar72,CONCAT13(bVar71,
                                                  CONCAT12(bVar70,CONCAT11(bVar69,bVar68)))))));
          uVar23 = uVar23 - 8;
          pdVar24 = pdVar24 + 0x10;
          auVar59 = auVar60;
        } while (uVar23 != 0);
        bVar58 = bVar58 | bVar92 | bVar42 | auVar60[0];
        bVar61 = bVar61 | bVar94 | bVar43 | auVar60[1];
        bVar62 = bVar62 | bVar95 | bVar44 | auVar60[2];
        bVar63 = bVar63 | bVar96 | bVar45 | auVar60[3];
        bVar64 = bVar64 | bVar97 | bVar46 | auVar60[4];
        bVar65 = bVar65 | bVar98 | bVar47 | auVar60[5];
        bVar66 = bVar66 | bVar99 | bVar48 | auVar60[6];
        bVar67 = bVar67 | bVar100 | bVar49 | auVar60[7];
        bVar68 = bVar68 | bVar101 | bVar50 | auVar60[8];
        bVar69 = bVar69 | bVar104 | bVar51 | auVar60[9];
        bVar70 = bVar70 | bVar105 | bVar52 | auVar60[10];
        bVar71 = bVar71 | bVar106 | bVar53 | auVar60[0xb];
        bVar72 = bVar72 | bVar107 | bVar54 | auVar60[0xc];
        bVar73 = bVar73 | bVar108 | bVar55 | auVar60[0xd];
        bVar74 = bVar74 | bVar109 | bVar56 | auVar60[0xe];
        bVar75 = bVar75 | bVar110 | bVar57 | auVar60[0xf];
        auVar4[1] = bVar61;
        auVar4[0] = bVar58;
        auVar4[2] = bVar62;
        auVar4[3] = bVar63;
        auVar4[4] = bVar64;
        auVar4[5] = bVar65;
        auVar4[6] = bVar66;
        auVar4[7] = bVar67;
        auVar4[8] = bVar68;
        auVar4[9] = bVar69;
        auVar4[10] = bVar70;
        auVar4[0xb] = bVar71;
        auVar4[0xc] = bVar72;
        auVar4[0xd] = bVar73;
        auVar4[0xe] = bVar74;
        auVar4[0xf] = bVar75;
        auVar5[1] = bVar61;
        auVar5[0] = bVar58;
        auVar5[2] = bVar62;
        auVar5[3] = bVar63;
        auVar5[4] = bVar64;
        auVar5[5] = bVar65;
        auVar5[6] = bVar66;
        auVar5[7] = bVar67;
        auVar5[8] = bVar68;
        auVar5[9] = bVar69;
        auVar5[10] = bVar70;
        auVar5[0xb] = bVar71;
        auVar5[0xc] = bVar72;
        auVar5[0xd] = bVar73;
        auVar5[0xe] = bVar74;
        auVar5[0xf] = bVar75;
        auVar124 = NEON_ext(auVar4,auVar5,8,1);
        uVar23 = CONCAT17(bVar67 | auVar124[7],
                          CONCAT16(bVar66 | auVar124[6],
                                   CONCAT15(bVar65 | auVar124[5],
                                            CONCAT14(bVar64 | auVar124[4],
                                                     CONCAT13(bVar63 | auVar124[3],
                                                              CONCAT12(bVar62 | auVar124[2],
                                                                       CONCAT11(bVar61 | auVar124[1]
                                                                                ,bVar58 | auVar124[0
                                                  ])))))));
        if (uVar17 == uVar40) goto LAB_002a5ddc;
      }
      lVar27 = uVar1 - uVar21;
      pcVar16 = pcVar38 + uVar21 * 8;
      do {
        uVar23 = *(ulong *)pcVar16 | uVar23;
        lVar27 = lVar27 + -1;
        pcVar16 = pcVar16 + 8;
      } while (lVar27 != 0);
    }
LAB_002a5ddc:
    if (uVar23 == 0) {
      *(undefined4 *)(unaff_x21 + 0x10) = 0;
      *(undefined4 *)(unaff_x21 + 8) = 0;
      return 1;
    }
  }
  *unaff_x20 = 1;
  uVar15 = 0x70;
  uVar19 = 0xb7;
LAB_002a5bcc:
  func_0x0028f83c(3,0,uVar15,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",uVar19);
  return 0;
}

