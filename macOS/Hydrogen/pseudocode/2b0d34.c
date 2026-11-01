
long FUN_002b0d34(void)

{
  uint uVar1;
  code *pcVar2;
  char cVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  int iVar11;
  int iVar12;
  long *plVar13;
  long *plVar14;
  long *plVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  ulong *puVar19;
  long lVar20;
  ulong extraout_x8;
  long lVar21;
  ulong uVar22;
  long extraout_x9;
  undefined8 *puVar23;
  ulong uVar24;
  ulong uVar25;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long *unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  ulong uVar26;
  long *unaff_x27;
  uint uVar27;
  ulong unaff_x28;
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
  undefined1 auVar45 [16];
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
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  undefined8 uVar78;
  byte bVar85;
  byte bVar86;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar93;
  undefined8 uVar87;
  byte bVar94;
  undefined8 uVar95;
  undefined8 uVar96;
  undefined8 uVar97;
  undefined8 uVar98;
  undefined8 uVar99;
  undefined8 uVar100;
  undefined8 uVar101;
  undefined8 uVar102;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  long *in_stack_00000010;
  ulong in_stack_00000018;
  
  plVar13 = (long *)func_0x0029e340();
  plVar14 = (long *)func_0x0029e340();
  plVar15 = (long *)func_0x0029e340();
  if (plVar15 == (long *)0x0) goto LAB_002b11c8;
  lVar16 = unaff_x19;
  in_stack_00000018 = unaff_x21;
  if (unaff_x19 == 0) {
    lVar16 = func_0x0036e31c(0x18);
    if (lVar16 == 0) goto LAB_002b11b8;
    *(undefined4 *)(lVar16 + 0x14) = 1;
  }
  iVar11 = func_0x0029f210();
  if (iVar11 == 0) goto LAB_002b11b8;
  for (unaff_x28 = 1;
      ((ulong)(long)(int)unaff_x22[1] <= unaff_x28 >> 6 ||
      ((*(ulong *)(*unaff_x22 + (unaff_x28 >> 6) * 8) >> (unaff_x28 & 0x3f) & 1) == 0));
      unaff_x28 = unaff_x28 + 1) {
  }
  if ((int)unaff_x28 == 2) {
    iVar11 = func_0x0029fda4(plVar13);
    if (iVar11 == 0) goto LAB_002b11b8;
    iVar11 = func_0x0029f130();
    if (iVar11 == 0) goto LAB_002b11b8;
    *(undefined4 *)(unaff_x24 + 0x10) = 0;
    iVar11 = func_0x002a27b4(unaff_x21,plVar13);
    unaff_x28 = unaff_x21;
    if (iVar11 == 0) goto LAB_002b11b8;
    iVar11 = func_0x002a09b0(plVar15,unaff_x21);
    if (iVar11 == 0) goto LAB_002b11b8;
    iVar11 = func_0x002a06a4(plVar13,plVar13,plVar15);
    if (iVar11 == 0) goto LAB_002b11b8;
    iVar11 = func_0x0029b490(plVar13,1);
    if (iVar11 == 0) goto LAB_002b11b8;
    iVar11 = func_0x002a06a4(plVar14);
    if (iVar11 == 0) goto LAB_002b11b8;
    iVar11 = func_0x002a06a4(plVar14,plVar14,plVar13);
    if (iVar11 == 0) goto LAB_002b11b8;
    lVar20 = func_0x0029bd80(lVar16,plVar14);
    if (lVar20 == 0) goto LAB_002b11b8;
  }
  else {
    if ((int)unaff_x28 != 1) {
      lVar20 = func_0x0029bd80();
      if (lVar20 == 0) goto LAB_002b11b8;
      *(undefined4 *)(unaff_x24 + 0x10) = 0;
      uVar26 = 2;
      do {
        in_stack_00000000 = unaff_x23;
        in_stack_00000008 = plVar14;
        in_stack_00000010 = plVar13;
        if (uVar26 < 0x16) {
LAB_002b1074:
          iVar11 = func_0x0029b3b0(plVar15,uVar26);
          if (iVar11 == 0) goto LAB_002b11b8;
        }
        else {
          uVar17 = func_0x0029bf0c();
          iVar11 = func_0x002afac4(plVar15,uVar17,0,0);
          if (iVar11 == 0) goto LAB_002b11b8;
          iVar11 = (int)plVar15[1];
          uVar25 = (ulong)iVar11;
          iVar12 = func_0x0029d99c(*plVar15,uVar25,*unaff_x22,(long)(int)unaff_x22[1]);
          if (-1 < iVar12) {
            pcVar2 = (code *)&_aws_lc_0_24_0_BN_sub;
            if ((int)unaff_x22[2] != 0) {
              pcVar2 = (code *)&_aws_lc_0_24_0_BN_add;
            }
            iVar11 = (*pcVar2)(plVar15,plVar15);
            if (iVar11 == 0) goto LAB_002b11b8;
            iVar11 = (int)plVar15[1];
            uVar25 = (ulong)iVar11;
          }
          if (iVar11 == 0) goto LAB_002b1074;
          if (uVar25 < 8) {
            uVar22 = 0;
            uVar24 = 0;
LAB_002b1058:
            lVar20 = uVar25 - uVar22;
            puVar19 = (ulong *)(*plVar15 + uVar22 * 8);
            do {
              uVar24 = *puVar19 | uVar24;
              lVar20 = lVar20 + -1;
              puVar19 = puVar19 + 1;
            } while (lVar20 != 0);
          }
          else {
            uVar22 = uVar25 & 0xfffffffffffffff8;
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
            uVar17 = 0;
            uVar18 = 0;
            uVar78 = 0;
            uVar87 = 0;
            puVar23 = (undefined8 *)(*plVar15 + 0x20);
            uVar24 = uVar22;
            do {
              uVar96 = puVar23[-3];
              uVar95 = puVar23[-4];
              uVar98 = puVar23[-1];
              uVar97 = puVar23[-2];
              uVar100 = puVar23[1];
              uVar99 = *puVar23;
              uVar102 = puVar23[3];
              uVar101 = puVar23[2];
              bVar28 = (byte)uVar95 | bVar28;
              bVar29 = (byte)((ulong)uVar95 >> 8) | bVar29;
              bVar30 = (byte)((ulong)uVar95 >> 0x10) | bVar30;
              bVar31 = (byte)((ulong)uVar95 >> 0x18) | bVar31;
              bVar32 = (byte)((ulong)uVar95 >> 0x20) | bVar32;
              bVar33 = (byte)((ulong)uVar95 >> 0x28) | bVar33;
              bVar34 = (byte)((ulong)uVar95 >> 0x30) | bVar34;
              bVar35 = (byte)((ulong)uVar95 >> 0x38) | bVar35;
              bVar36 = (byte)uVar96 | bVar36;
              bVar37 = (byte)((ulong)uVar96 >> 8) | bVar37;
              bVar38 = (byte)((ulong)uVar96 >> 0x10) | bVar38;
              bVar39 = (byte)((ulong)uVar96 >> 0x18) | bVar39;
              bVar40 = (byte)((ulong)uVar96 >> 0x20) | bVar40;
              bVar41 = (byte)((ulong)uVar96 >> 0x28) | bVar41;
              bVar42 = (byte)((ulong)uVar96 >> 0x30) | bVar42;
              bVar43 = (byte)((ulong)uVar96 >> 0x38) | bVar43;
              bVar44 = (byte)uVar97 | bVar44;
              bVar46 = (byte)((ulong)uVar97 >> 8) | bVar46;
              bVar47 = (byte)((ulong)uVar97 >> 0x10) | bVar47;
              bVar48 = (byte)((ulong)uVar97 >> 0x18) | bVar48;
              bVar49 = (byte)((ulong)uVar97 >> 0x20) | bVar49;
              bVar50 = (byte)((ulong)uVar97 >> 0x28) | bVar50;
              bVar51 = (byte)((ulong)uVar97 >> 0x30) | bVar51;
              bVar52 = (byte)((ulong)uVar97 >> 0x38) | bVar52;
              bVar53 = (byte)uVar98 | bVar53;
              bVar54 = (byte)((ulong)uVar98 >> 8) | bVar54;
              bVar55 = (byte)((ulong)uVar98 >> 0x10) | bVar55;
              bVar56 = (byte)((ulong)uVar98 >> 0x18) | bVar56;
              bVar57 = (byte)((ulong)uVar98 >> 0x20) | bVar57;
              bVar58 = (byte)((ulong)uVar98 >> 0x28) | bVar58;
              bVar59 = (byte)((ulong)uVar98 >> 0x30) | bVar59;
              bVar60 = (byte)((ulong)uVar98 >> 0x38) | bVar60;
              bVar61 = (byte)uVar99 | (byte)uVar17;
              bVar62 = (byte)((ulong)uVar99 >> 8) | (byte)((ulong)uVar17 >> 8);
              bVar63 = (byte)((ulong)uVar99 >> 0x10) | (byte)((ulong)uVar17 >> 0x10);
              bVar64 = (byte)((ulong)uVar99 >> 0x18) | (byte)((ulong)uVar17 >> 0x18);
              bVar65 = (byte)((ulong)uVar99 >> 0x20) | (byte)((ulong)uVar17 >> 0x20);
              bVar66 = (byte)((ulong)uVar99 >> 0x28) | (byte)((ulong)uVar17 >> 0x28);
              bVar67 = (byte)((ulong)uVar99 >> 0x30) | (byte)((ulong)uVar17 >> 0x30);
              bVar68 = (byte)((ulong)uVar99 >> 0x38) | (byte)((ulong)uVar17 >> 0x38);
              uVar17 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(
                                                  bVar64,CONCAT12(bVar63,CONCAT11(bVar62,bVar61)))))
                                               ));
              bVar69 = (byte)uVar100 | (byte)uVar18;
              bVar70 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar18 >> 8);
              bVar71 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar18 >> 0x10);
              bVar72 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar18 >> 0x18);
              bVar73 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar18 >> 0x20);
              bVar74 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar18 >> 0x28);
              bVar75 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar18 >> 0x30);
              bVar76 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar18 >> 0x38);
              uVar18 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                               ));
              bVar77 = (byte)uVar101 | (byte)uVar78;
              bVar79 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar78 >> 8);
              bVar80 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar78 >> 0x10);
              bVar81 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar78 >> 0x18);
              bVar82 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar78 >> 0x20);
              bVar83 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar78 >> 0x28);
              bVar84 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar78 >> 0x30);
              bVar85 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar78 >> 0x38);
              uVar78 = CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(
                                                  bVar81,CONCAT12(bVar80,CONCAT11(bVar79,bVar77)))))
                                               ));
              bVar86 = (byte)uVar102 | (byte)uVar87;
              bVar88 = (byte)((ulong)uVar102 >> 8) | (byte)((ulong)uVar87 >> 8);
              bVar89 = (byte)((ulong)uVar102 >> 0x10) | (byte)((ulong)uVar87 >> 0x10);
              bVar90 = (byte)((ulong)uVar102 >> 0x18) | (byte)((ulong)uVar87 >> 0x18);
              bVar91 = (byte)((ulong)uVar102 >> 0x20) | (byte)((ulong)uVar87 >> 0x20);
              bVar92 = (byte)((ulong)uVar102 >> 0x28) | (byte)((ulong)uVar87 >> 0x28);
              bVar93 = (byte)((ulong)uVar102 >> 0x30) | (byte)((ulong)uVar87 >> 0x30);
              bVar94 = (byte)((ulong)uVar102 >> 0x38) | (byte)((ulong)uVar87 >> 0x38);
              uVar87 = CONCAT17(bVar94,CONCAT16(bVar93,CONCAT15(bVar92,CONCAT14(bVar91,CONCAT13(
                                                  bVar90,CONCAT12(bVar89,CONCAT11(bVar88,bVar86)))))
                                               ));
              uVar24 = uVar24 - 8;
              puVar23 = puVar23 + 8;
            } while (uVar24 != 0);
            bVar77 = bVar77 | bVar61 | bVar44 | bVar28;
            bVar79 = bVar79 | bVar62 | bVar46 | bVar29;
            bVar80 = bVar80 | bVar63 | bVar47 | bVar30;
            bVar81 = bVar81 | bVar64 | bVar48 | bVar31;
            bVar82 = bVar82 | bVar65 | bVar49 | bVar32;
            bVar83 = bVar83 | bVar66 | bVar50 | bVar33;
            bVar84 = bVar84 | bVar67 | bVar51 | bVar34;
            bVar85 = bVar85 | bVar68 | bVar52 | bVar35;
            bVar86 = bVar86 | bVar69 | bVar53 | bVar36;
            bVar88 = bVar88 | bVar70 | bVar54 | bVar37;
            bVar89 = bVar89 | bVar71 | bVar55 | bVar38;
            bVar90 = bVar90 | bVar72 | bVar56 | bVar39;
            bVar91 = bVar91 | bVar73 | bVar57 | bVar40;
            bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
            bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
            bVar94 = bVar94 | bVar76 | bVar60 | bVar43;
            auVar45[1] = bVar79;
            auVar45[0] = bVar77;
            auVar45[2] = bVar80;
            auVar45[3] = bVar81;
            auVar45[4] = bVar82;
            auVar45[5] = bVar83;
            auVar45[6] = bVar84;
            auVar45[7] = bVar85;
            auVar45[8] = bVar86;
            auVar45[9] = bVar88;
            auVar45[10] = bVar89;
            auVar45[0xb] = bVar90;
            auVar45[0xc] = bVar91;
            auVar45[0xd] = bVar92;
            auVar45[0xe] = bVar93;
            auVar45[0xf] = bVar94;
            auVar10[1] = bVar79;
            auVar10[0] = bVar77;
            auVar10[2] = bVar80;
            auVar10[3] = bVar81;
            auVar10[4] = bVar82;
            auVar10[5] = bVar83;
            auVar10[6] = bVar84;
            auVar10[7] = bVar85;
            auVar10[8] = bVar86;
            auVar10[9] = bVar88;
            auVar10[10] = bVar89;
            auVar10[0xb] = bVar90;
            auVar10[0xc] = bVar91;
            auVar10[0xd] = bVar92;
            auVar10[0xe] = bVar93;
            auVar10[0xf] = bVar94;
            auVar45 = NEON_ext(auVar45,auVar10,8,1);
            uVar24 = CONCAT17(bVar85 | auVar45[7],
                              CONCAT16(bVar84 | auVar45[6],
                                       CONCAT15(bVar83 | auVar45[5],
                                                CONCAT14(bVar82 | auVar45[4],
                                                         CONCAT13(bVar81 | auVar45[3],
                                                                  CONCAT12(bVar80 | auVar45[2],
                                                                           CONCAT11(bVar79 | auVar45
                                                  [1],bVar77 | auVar45[0])))))));
            if (uVar25 != uVar22) goto LAB_002b1058;
          }
          if (uVar24 == 0) goto LAB_002b1074;
        }
        iVar11 = func_0x002a9b1c(plVar15);
        if (iVar11 < -1) goto LAB_002b11b8;
        if (iVar11 != 1) {
          if (iVar11 == -1) {
            iVar11 = func_0x0029f130();
            if (iVar11 == 0) goto LAB_002b11b8;
            iVar11 = func_0x002a27b4(plVar15,plVar15);
            if (iVar11 == 0) goto LAB_002b11b8;
            iVar11 = func_0x0029dd44(plVar15);
            if (iVar11 != 0) {
              uVar17 = 0x72;
              uVar18 = 0x11b;
              goto LAB_002b11b4;
            }
            iVar11 = func_0x002a57f4(plVar13);
            if (iVar11 == 0) goto LAB_002b11b8;
            uVar27 = *(uint *)(plVar13 + 1);
            uVar26 = (ulong)(int)uVar27;
            if (uVar27 == 0) goto LAB_002b1344;
            if (uVar27 < 8) {
              uVar24 = 0;
              uVar25 = 0;
              goto LAB_002b12e0;
            }
            uVar24 = uVar26 & 0xfffffffffffffff8;
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
            uVar17 = 0;
            uVar18 = 0;
            uVar78 = 0;
            uVar87 = 0;
            puVar23 = (undefined8 *)(*plVar13 + 0x20);
            uVar25 = uVar24;
            do {
              uVar96 = puVar23[-3];
              uVar95 = puVar23[-4];
              uVar98 = puVar23[-1];
              uVar97 = puVar23[-2];
              uVar100 = puVar23[1];
              uVar99 = *puVar23;
              uVar102 = puVar23[3];
              uVar101 = puVar23[2];
              bVar28 = (byte)uVar95 | bVar28;
              bVar29 = (byte)((ulong)uVar95 >> 8) | bVar29;
              bVar30 = (byte)((ulong)uVar95 >> 0x10) | bVar30;
              bVar31 = (byte)((ulong)uVar95 >> 0x18) | bVar31;
              bVar32 = (byte)((ulong)uVar95 >> 0x20) | bVar32;
              bVar33 = (byte)((ulong)uVar95 >> 0x28) | bVar33;
              bVar34 = (byte)((ulong)uVar95 >> 0x30) | bVar34;
              bVar35 = (byte)((ulong)uVar95 >> 0x38) | bVar35;
              bVar36 = (byte)uVar96 | bVar36;
              bVar37 = (byte)((ulong)uVar96 >> 8) | bVar37;
              bVar38 = (byte)((ulong)uVar96 >> 0x10) | bVar38;
              bVar39 = (byte)((ulong)uVar96 >> 0x18) | bVar39;
              bVar40 = (byte)((ulong)uVar96 >> 0x20) | bVar40;
              bVar41 = (byte)((ulong)uVar96 >> 0x28) | bVar41;
              bVar42 = (byte)((ulong)uVar96 >> 0x30) | bVar42;
              bVar43 = (byte)((ulong)uVar96 >> 0x38) | bVar43;
              bVar44 = (byte)uVar97 | bVar44;
              bVar46 = (byte)((ulong)uVar97 >> 8) | bVar46;
              bVar47 = (byte)((ulong)uVar97 >> 0x10) | bVar47;
              bVar48 = (byte)((ulong)uVar97 >> 0x18) | bVar48;
              bVar49 = (byte)((ulong)uVar97 >> 0x20) | bVar49;
              bVar50 = (byte)((ulong)uVar97 >> 0x28) | bVar50;
              bVar51 = (byte)((ulong)uVar97 >> 0x30) | bVar51;
              bVar52 = (byte)((ulong)uVar97 >> 0x38) | bVar52;
              bVar53 = (byte)uVar98 | bVar53;
              bVar54 = (byte)((ulong)uVar98 >> 8) | bVar54;
              bVar55 = (byte)((ulong)uVar98 >> 0x10) | bVar55;
              bVar56 = (byte)((ulong)uVar98 >> 0x18) | bVar56;
              bVar57 = (byte)((ulong)uVar98 >> 0x20) | bVar57;
              bVar58 = (byte)((ulong)uVar98 >> 0x28) | bVar58;
              bVar59 = (byte)((ulong)uVar98 >> 0x30) | bVar59;
              bVar60 = (byte)((ulong)uVar98 >> 0x38) | bVar60;
              bVar61 = (byte)uVar99 | (byte)uVar17;
              bVar62 = (byte)((ulong)uVar99 >> 8) | (byte)((ulong)uVar17 >> 8);
              bVar63 = (byte)((ulong)uVar99 >> 0x10) | (byte)((ulong)uVar17 >> 0x10);
              bVar64 = (byte)((ulong)uVar99 >> 0x18) | (byte)((ulong)uVar17 >> 0x18);
              bVar65 = (byte)((ulong)uVar99 >> 0x20) | (byte)((ulong)uVar17 >> 0x20);
              bVar66 = (byte)((ulong)uVar99 >> 0x28) | (byte)((ulong)uVar17 >> 0x28);
              bVar67 = (byte)((ulong)uVar99 >> 0x30) | (byte)((ulong)uVar17 >> 0x30);
              bVar68 = (byte)((ulong)uVar99 >> 0x38) | (byte)((ulong)uVar17 >> 0x38);
              uVar17 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(
                                                  bVar64,CONCAT12(bVar63,CONCAT11(bVar62,bVar61)))))
                                               ));
              bVar69 = (byte)uVar100 | (byte)uVar18;
              bVar70 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar18 >> 8);
              bVar71 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar18 >> 0x10);
              bVar72 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar18 >> 0x18);
              bVar73 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar18 >> 0x20);
              bVar74 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar18 >> 0x28);
              bVar75 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar18 >> 0x30);
              bVar76 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar18 >> 0x38);
              uVar18 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                               ));
              bVar77 = (byte)uVar101 | (byte)uVar78;
              bVar79 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar78 >> 8);
              bVar80 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar78 >> 0x10);
              bVar81 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar78 >> 0x18);
              bVar82 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar78 >> 0x20);
              bVar83 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar78 >> 0x28);
              bVar84 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar78 >> 0x30);
              bVar85 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar78 >> 0x38);
              uVar78 = CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(
                                                  bVar81,CONCAT12(bVar80,CONCAT11(bVar79,bVar77)))))
                                               ));
              bVar86 = (byte)uVar102 | (byte)uVar87;
              bVar88 = (byte)((ulong)uVar102 >> 8) | (byte)((ulong)uVar87 >> 8);
              bVar89 = (byte)((ulong)uVar102 >> 0x10) | (byte)((ulong)uVar87 >> 0x10);
              bVar90 = (byte)((ulong)uVar102 >> 0x18) | (byte)((ulong)uVar87 >> 0x18);
              bVar91 = (byte)((ulong)uVar102 >> 0x20) | (byte)((ulong)uVar87 >> 0x20);
              bVar92 = (byte)((ulong)uVar102 >> 0x28) | (byte)((ulong)uVar87 >> 0x28);
              bVar93 = (byte)((ulong)uVar102 >> 0x30) | (byte)((ulong)uVar87 >> 0x30);
              bVar94 = (byte)((ulong)uVar102 >> 0x38) | (byte)((ulong)uVar87 >> 0x38);
              uVar87 = CONCAT17(bVar94,CONCAT16(bVar93,CONCAT15(bVar92,CONCAT14(bVar91,CONCAT13(
                                                  bVar90,CONCAT12(bVar89,CONCAT11(bVar88,bVar86)))))
                                               ));
              uVar25 = uVar25 - 8;
              puVar23 = puVar23 + 8;
            } while (uVar25 != 0);
            bVar77 = bVar77 | bVar61 | bVar44 | bVar28;
            bVar79 = bVar79 | bVar62 | bVar46 | bVar29;
            bVar80 = bVar80 | bVar63 | bVar47 | bVar30;
            bVar81 = bVar81 | bVar64 | bVar48 | bVar31;
            bVar82 = bVar82 | bVar65 | bVar49 | bVar32;
            bVar83 = bVar83 | bVar66 | bVar50 | bVar33;
            bVar84 = bVar84 | bVar67 | bVar51 | bVar34;
            bVar85 = bVar85 | bVar68 | bVar52 | bVar35;
            bVar86 = bVar86 | bVar69 | bVar53 | bVar36;
            bVar88 = bVar88 | bVar70 | bVar54 | bVar37;
            bVar89 = bVar89 | bVar71 | bVar55 | bVar38;
            bVar90 = bVar90 | bVar72 | bVar56 | bVar39;
            bVar91 = bVar91 | bVar73 | bVar57 | bVar40;
            bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
            bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
            bVar94 = bVar94 | bVar76 | bVar60 | bVar43;
            auVar8[1] = bVar79;
            auVar8[0] = bVar77;
            auVar8[2] = bVar80;
            auVar8[3] = bVar81;
            auVar8[4] = bVar82;
            auVar8[5] = bVar83;
            auVar8[6] = bVar84;
            auVar8[7] = bVar85;
            auVar8[8] = bVar86;
            auVar8[9] = bVar88;
            auVar8[10] = bVar89;
            auVar8[0xb] = bVar90;
            auVar8[0xc] = bVar91;
            auVar8[0xd] = bVar92;
            auVar8[0xe] = bVar93;
            auVar8[0xf] = bVar94;
            auVar9[1] = bVar79;
            auVar9[0] = bVar77;
            auVar9[2] = bVar80;
            auVar9[3] = bVar81;
            auVar9[4] = bVar82;
            auVar9[5] = bVar83;
            auVar9[6] = bVar84;
            auVar9[7] = bVar85;
            auVar9[8] = bVar86;
            auVar9[9] = bVar88;
            auVar9[10] = bVar89;
            auVar9[0xb] = bVar90;
            auVar9[0xc] = bVar91;
            auVar9[0xd] = bVar92;
            auVar9[0xe] = bVar93;
            auVar9[0xf] = bVar94;
            auVar45 = NEON_ext(auVar8,auVar9,8,1);
            uVar25 = CONCAT17(bVar85 | auVar45[7],
                              CONCAT16(bVar84 | auVar45[6],
                                       CONCAT15(bVar83 | auVar45[5],
                                                CONCAT14(bVar82 | auVar45[4],
                                                         CONCAT13(bVar81 | auVar45[3],
                                                                  CONCAT12(bVar80 | auVar45[2],
                                                                           CONCAT11(bVar79 | auVar45
                                                  [1],bVar77 | auVar45[0])))))));
            if (uVar24 != uVar26) {
LAB_002b12e0:
              lVar20 = uVar26 - uVar24;
              puVar19 = (ulong *)(*plVar13 + uVar24 * 8);
              do {
                uVar25 = *puVar19 | uVar25;
                lVar20 = lVar20 + -1;
                puVar19 = puVar19 + 1;
              } while (lVar20 != 0);
            }
            if (uVar25 != 0) {
              iVar11 = func_0x002a27b4(plVar14,unaff_x23,plVar13);
              if (iVar11 == 0) goto LAB_002b11b8;
              uVar27 = *(uint *)(plVar14 + 1);
              uVar26 = (ulong)(int)uVar27;
              if (uVar27 == 0) goto LAB_002b1608;
              if (uVar27 < 8) {
                uVar24 = 0;
                uVar25 = 0;
              }
              else {
                uVar24 = uVar26 & 0xfffffffffffffff8;
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
                uVar17 = 0;
                uVar18 = 0;
                uVar78 = 0;
                uVar87 = 0;
                puVar23 = (undefined8 *)(*plVar14 + 0x20);
                uVar25 = uVar24;
                do {
                  uVar96 = puVar23[-3];
                  uVar95 = puVar23[-4];
                  uVar98 = puVar23[-1];
                  uVar97 = puVar23[-2];
                  uVar100 = puVar23[1];
                  uVar99 = *puVar23;
                  uVar102 = puVar23[3];
                  uVar101 = puVar23[2];
                  bVar28 = (byte)uVar95 | bVar28;
                  bVar29 = (byte)((ulong)uVar95 >> 8) | bVar29;
                  bVar30 = (byte)((ulong)uVar95 >> 0x10) | bVar30;
                  bVar31 = (byte)((ulong)uVar95 >> 0x18) | bVar31;
                  bVar32 = (byte)((ulong)uVar95 >> 0x20) | bVar32;
                  bVar33 = (byte)((ulong)uVar95 >> 0x28) | bVar33;
                  bVar34 = (byte)((ulong)uVar95 >> 0x30) | bVar34;
                  bVar35 = (byte)((ulong)uVar95 >> 0x38) | bVar35;
                  bVar36 = (byte)uVar96 | bVar36;
                  bVar37 = (byte)((ulong)uVar96 >> 8) | bVar37;
                  bVar38 = (byte)((ulong)uVar96 >> 0x10) | bVar38;
                  bVar39 = (byte)((ulong)uVar96 >> 0x18) | bVar39;
                  bVar40 = (byte)((ulong)uVar96 >> 0x20) | bVar40;
                  bVar41 = (byte)((ulong)uVar96 >> 0x28) | bVar41;
                  bVar42 = (byte)((ulong)uVar96 >> 0x30) | bVar42;
                  bVar43 = (byte)((ulong)uVar96 >> 0x38) | bVar43;
                  bVar44 = (byte)uVar97 | bVar44;
                  bVar46 = (byte)((ulong)uVar97 >> 8) | bVar46;
                  bVar47 = (byte)((ulong)uVar97 >> 0x10) | bVar47;
                  bVar48 = (byte)((ulong)uVar97 >> 0x18) | bVar48;
                  bVar49 = (byte)((ulong)uVar97 >> 0x20) | bVar49;
                  bVar50 = (byte)((ulong)uVar97 >> 0x28) | bVar50;
                  bVar51 = (byte)((ulong)uVar97 >> 0x30) | bVar51;
                  bVar52 = (byte)((ulong)uVar97 >> 0x38) | bVar52;
                  bVar53 = (byte)uVar98 | bVar53;
                  bVar54 = (byte)((ulong)uVar98 >> 8) | bVar54;
                  bVar55 = (byte)((ulong)uVar98 >> 0x10) | bVar55;
                  bVar56 = (byte)((ulong)uVar98 >> 0x18) | bVar56;
                  bVar57 = (byte)((ulong)uVar98 >> 0x20) | bVar57;
                  bVar58 = (byte)((ulong)uVar98 >> 0x28) | bVar58;
                  bVar59 = (byte)((ulong)uVar98 >> 0x30) | bVar59;
                  bVar60 = (byte)((ulong)uVar98 >> 0x38) | bVar60;
                  bVar61 = (byte)uVar99 | (byte)uVar17;
                  bVar62 = (byte)((ulong)uVar99 >> 8) | (byte)((ulong)uVar17 >> 8);
                  bVar63 = (byte)((ulong)uVar99 >> 0x10) | (byte)((ulong)uVar17 >> 0x10);
                  bVar64 = (byte)((ulong)uVar99 >> 0x18) | (byte)((ulong)uVar17 >> 0x18);
                  bVar65 = (byte)((ulong)uVar99 >> 0x20) | (byte)((ulong)uVar17 >> 0x20);
                  bVar66 = (byte)((ulong)uVar99 >> 0x28) | (byte)((ulong)uVar17 >> 0x28);
                  bVar67 = (byte)((ulong)uVar99 >> 0x30) | (byte)((ulong)uVar17 >> 0x30);
                  bVar68 = (byte)((ulong)uVar99 >> 0x38) | (byte)((ulong)uVar17 >> 0x38);
                  uVar17 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(
                                                  bVar64,CONCAT12(bVar63,CONCAT11(bVar62,bVar61)))))
                                                  ));
                  bVar69 = (byte)uVar100 | (byte)uVar18;
                  bVar70 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar18 >> 8);
                  bVar71 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar18 >> 0x10);
                  bVar72 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar18 >> 0x18);
                  bVar73 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar18 >> 0x20);
                  bVar74 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar18 >> 0x28);
                  bVar75 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar18 >> 0x30);
                  bVar76 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar18 >> 0x38);
                  uVar18 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar101 | (byte)uVar78;
                  bVar79 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar78 >> 8);
                  bVar80 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar78 >> 0x10);
                  bVar81 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar78 >> 0x18);
                  bVar82 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar78 >> 0x20);
                  bVar83 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar78 >> 0x28);
                  bVar84 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar78 >> 0x30);
                  bVar85 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar78 >> 0x38);
                  uVar78 = CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(
                                                  bVar81,CONCAT12(bVar80,CONCAT11(bVar79,bVar77)))))
                                                  ));
                  bVar86 = (byte)uVar102 | (byte)uVar87;
                  bVar88 = (byte)((ulong)uVar102 >> 8) | (byte)((ulong)uVar87 >> 8);
                  bVar89 = (byte)((ulong)uVar102 >> 0x10) | (byte)((ulong)uVar87 >> 0x10);
                  bVar90 = (byte)((ulong)uVar102 >> 0x18) | (byte)((ulong)uVar87 >> 0x18);
                  bVar91 = (byte)((ulong)uVar102 >> 0x20) | (byte)((ulong)uVar87 >> 0x20);
                  bVar92 = (byte)((ulong)uVar102 >> 0x28) | (byte)((ulong)uVar87 >> 0x28);
                  bVar93 = (byte)((ulong)uVar102 >> 0x30) | (byte)((ulong)uVar87 >> 0x30);
                  bVar94 = (byte)((ulong)uVar102 >> 0x38) | (byte)((ulong)uVar87 >> 0x38);
                  uVar87 = CONCAT17(bVar94,CONCAT16(bVar93,CONCAT15(bVar92,CONCAT14(bVar91,CONCAT13(
                                                  bVar90,CONCAT12(bVar89,CONCAT11(bVar88,bVar86)))))
                                                  ));
                  uVar25 = uVar25 - 8;
                  puVar23 = puVar23 + 8;
                } while (uVar25 != 0);
                bVar77 = bVar77 | bVar61 | bVar44 | bVar28;
                bVar79 = bVar79 | bVar62 | bVar46 | bVar29;
                bVar80 = bVar80 | bVar63 | bVar47 | bVar30;
                bVar81 = bVar81 | bVar64 | bVar48 | bVar31;
                bVar82 = bVar82 | bVar65 | bVar49 | bVar32;
                bVar83 = bVar83 | bVar66 | bVar50 | bVar33;
                bVar84 = bVar84 | bVar67 | bVar51 | bVar34;
                bVar85 = bVar85 | bVar68 | bVar52 | bVar35;
                bVar86 = bVar86 | bVar69 | bVar53 | bVar36;
                bVar88 = bVar88 | bVar70 | bVar54 | bVar37;
                bVar89 = bVar89 | bVar71 | bVar55 | bVar38;
                bVar90 = bVar90 | bVar72 | bVar56 | bVar39;
                bVar91 = bVar91 | bVar73 | bVar57 | bVar40;
                bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
                bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
                bVar94 = bVar94 | bVar76 | bVar60 | bVar43;
                auVar6[1] = bVar79;
                auVar6[0] = bVar77;
                auVar6[2] = bVar80;
                auVar6[3] = bVar81;
                auVar6[4] = bVar82;
                auVar6[5] = bVar83;
                auVar6[6] = bVar84;
                auVar6[7] = bVar85;
                auVar6[8] = bVar86;
                auVar6[9] = bVar88;
                auVar6[10] = bVar89;
                auVar6[0xb] = bVar90;
                auVar6[0xc] = bVar91;
                auVar6[0xd] = bVar92;
                auVar6[0xe] = bVar93;
                auVar6[0xf] = bVar94;
                auVar7[1] = bVar79;
                auVar7[0] = bVar77;
                auVar7[2] = bVar80;
                auVar7[3] = bVar81;
                auVar7[4] = bVar82;
                auVar7[5] = bVar83;
                auVar7[6] = bVar84;
                auVar7[7] = bVar85;
                auVar7[8] = bVar86;
                auVar7[9] = bVar88;
                auVar7[10] = bVar89;
                auVar7[0xb] = bVar90;
                auVar7[0xc] = bVar91;
                auVar7[0xd] = bVar92;
                auVar7[0xe] = bVar93;
                auVar7[0xf] = bVar94;
                auVar45 = NEON_ext(auVar6,auVar7,8,1);
                uVar25 = CONCAT17(bVar85 | auVar45[7],
                                  CONCAT16(bVar84 | auVar45[6],
                                           CONCAT15(bVar83 | auVar45[5],
                                                    CONCAT14(bVar82 | auVar45[4],
                                                             CONCAT13(bVar81 | auVar45[3],
                                                                      CONCAT12(bVar80 | auVar45[2],
                                                                               CONCAT11(bVar79 | 
                                                  auVar45[1],bVar77 | auVar45[0])))))));
                if (uVar24 == uVar26) goto LAB_002b1484;
              }
              lVar20 = uVar26 - uVar24;
              puVar19 = (ulong *)(*plVar14 + uVar24 * 8);
              do {
                uVar25 = *puVar19 | uVar25;
                lVar20 = lVar20 + -1;
                puVar19 = puVar19 + 1;
              } while (lVar20 != 0);
LAB_002b1484:
              if (uVar25 == 0) goto LAB_002b1608;
              goto LAB_002b1488;
            }
LAB_002b1344:
            iVar11 = func_0x0029f210(plVar13,unaff_x23);
            if (iVar11 == 0) goto LAB_002b11b8;
            uVar27 = *(uint *)(plVar13 + 1);
            uVar26 = (ulong)(int)uVar27;
            if (uVar27 == 0) goto LAB_002b1608;
            lVar20 = *plVar13;
            if (7 < uVar27) goto LAB_002b1388;
            uVar24 = 0;
            uVar25 = 0;
            goto LAB_002b13e4;
          }
          if (iVar11 == 0) {
            uVar17 = 0x72;
            uVar18 = 0x102;
            goto LAB_002b11b4;
          }
          goto LAB_002b119c;
        }
        uVar26 = uVar26 + 1;
        if (uVar26 == 0x52) {
LAB_002b119c:
          uVar17 = 0x73;
          uVar18 = 0x10c;
          goto LAB_002b11b4;
        }
      } while( true );
    }
    iVar11 = func_0x0029f130();
    if (iVar11 == 0) goto LAB_002b11b8;
    *(undefined4 *)(unaff_x24 + 0x10) = 0;
    iVar11 = func_0x0029b0e4();
    if (iVar11 == 0) goto LAB_002b11b8;
    iVar11 = func_0x002a27b4(lVar16);
    if (iVar11 == 0) goto LAB_002b11b8;
  }
LAB_002b0e1c:
  iVar11 = func_0x002a09b0(plVar14,lVar16);
  if (iVar11 == 0) goto LAB_002b11b8;
  iVar11 = func_0x0029db84(plVar14,unaff_x23);
  if (iVar11 == 0) goto LAB_002b11cc;
  uVar17 = 0x6e;
  uVar18 = 0x19a;
LAB_002b11b4:
  func_0x0028f83c(3,0,uVar17,"/aws-lc/crypto/fipsmodule/bn/sqrt.c",uVar18);
LAB_002b11b8:
  do {
    do {
      do {
        unaff_x27 = plVar15;
        if (lVar16 != unaff_x19) {
          func_0x0029bc58(lVar16);
        }
LAB_002b11c8:
        plVar15 = unaff_x27;
        lVar16 = 0;
LAB_002b11cc:
        cVar3 = *(char *)(unaff_x20 + 0x28);
        while( true ) {
          if (cVar3 != '\0') {
            return lVar16;
          }
          if (*(long *)(unaff_x20 + 0x10) != 0) {
            lVar20 = *(long *)(unaff_x20 + 0x10) + -1;
            *(long *)(unaff_x20 + 0x10) = lVar20;
            *(undefined8 *)(unaff_x20 + 0x20) =
                 *(undefined8 *)(*(long *)(unaff_x20 + 8) + lVar20 * 8);
            return lVar16;
          }
          func_0x0079db4c();
          uVar26 = extraout_x8;
          lVar20 = extraout_x9;
LAB_002b1388:
          uVar24 = uVar26 & 0xfffffffffffffff8;
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
          uVar17 = 0;
          uVar18 = 0;
          uVar78 = 0;
          uVar87 = 0;
          puVar23 = (undefined8 *)(lVar20 + 0x20);
          uVar25 = uVar24;
          do {
            uVar96 = puVar23[-3];
            uVar95 = puVar23[-4];
            uVar98 = puVar23[-1];
            uVar97 = puVar23[-2];
            uVar100 = puVar23[1];
            uVar99 = *puVar23;
            uVar102 = puVar23[3];
            uVar101 = puVar23[2];
            bVar28 = (byte)uVar95 | bVar28;
            bVar29 = (byte)((ulong)uVar95 >> 8) | bVar29;
            bVar30 = (byte)((ulong)uVar95 >> 0x10) | bVar30;
            bVar31 = (byte)((ulong)uVar95 >> 0x18) | bVar31;
            bVar32 = (byte)((ulong)uVar95 >> 0x20) | bVar32;
            bVar33 = (byte)((ulong)uVar95 >> 0x28) | bVar33;
            bVar34 = (byte)((ulong)uVar95 >> 0x30) | bVar34;
            bVar35 = (byte)((ulong)uVar95 >> 0x38) | bVar35;
            bVar36 = (byte)uVar96 | bVar36;
            bVar37 = (byte)((ulong)uVar96 >> 8) | bVar37;
            bVar38 = (byte)((ulong)uVar96 >> 0x10) | bVar38;
            bVar39 = (byte)((ulong)uVar96 >> 0x18) | bVar39;
            bVar40 = (byte)((ulong)uVar96 >> 0x20) | bVar40;
            bVar41 = (byte)((ulong)uVar96 >> 0x28) | bVar41;
            bVar42 = (byte)((ulong)uVar96 >> 0x30) | bVar42;
            bVar43 = (byte)((ulong)uVar96 >> 0x38) | bVar43;
            bVar44 = (byte)uVar97 | bVar44;
            bVar46 = (byte)((ulong)uVar97 >> 8) | bVar46;
            bVar47 = (byte)((ulong)uVar97 >> 0x10) | bVar47;
            bVar48 = (byte)((ulong)uVar97 >> 0x18) | bVar48;
            bVar49 = (byte)((ulong)uVar97 >> 0x20) | bVar49;
            bVar50 = (byte)((ulong)uVar97 >> 0x28) | bVar50;
            bVar51 = (byte)((ulong)uVar97 >> 0x30) | bVar51;
            bVar52 = (byte)((ulong)uVar97 >> 0x38) | bVar52;
            bVar53 = (byte)uVar98 | bVar53;
            bVar54 = (byte)((ulong)uVar98 >> 8) | bVar54;
            bVar55 = (byte)((ulong)uVar98 >> 0x10) | bVar55;
            bVar56 = (byte)((ulong)uVar98 >> 0x18) | bVar56;
            bVar57 = (byte)((ulong)uVar98 >> 0x20) | bVar57;
            bVar58 = (byte)((ulong)uVar98 >> 0x28) | bVar58;
            bVar59 = (byte)((ulong)uVar98 >> 0x30) | bVar59;
            bVar60 = (byte)((ulong)uVar98 >> 0x38) | bVar60;
            bVar61 = (byte)uVar99 | (byte)uVar17;
            bVar62 = (byte)((ulong)uVar99 >> 8) | (byte)((ulong)uVar17 >> 8);
            bVar63 = (byte)((ulong)uVar99 >> 0x10) | (byte)((ulong)uVar17 >> 0x10);
            bVar64 = (byte)((ulong)uVar99 >> 0x18) | (byte)((ulong)uVar17 >> 0x18);
            bVar65 = (byte)((ulong)uVar99 >> 0x20) | (byte)((ulong)uVar17 >> 0x20);
            bVar66 = (byte)((ulong)uVar99 >> 0x28) | (byte)((ulong)uVar17 >> 0x28);
            bVar67 = (byte)((ulong)uVar99 >> 0x30) | (byte)((ulong)uVar17 >> 0x30);
            bVar68 = (byte)((ulong)uVar99 >> 0x38) | (byte)((ulong)uVar17 >> 0x38);
            uVar17 = CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64
                                                  ,CONCAT12(bVar63,CONCAT11(bVar62,bVar61)))))));
            bVar69 = (byte)uVar100 | (byte)uVar18;
            bVar70 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar18 >> 8);
            bVar71 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar18 >> 0x10);
            bVar72 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar18 >> 0x18);
            bVar73 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar18 >> 0x20);
            bVar74 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar18 >> 0x28);
            bVar75 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar18 >> 0x30);
            bVar76 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar18 >> 0x38);
            uVar18 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(bVar72
                                                  ,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))));
            bVar77 = (byte)uVar101 | (byte)uVar78;
            bVar79 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar78 >> 8);
            bVar80 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar78 >> 0x10);
            bVar81 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar78 >> 0x18);
            bVar82 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar78 >> 0x20);
            bVar83 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar78 >> 0x28);
            bVar84 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar78 >> 0x30);
            bVar85 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar78 >> 0x38);
            uVar78 = CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81
                                                  ,CONCAT12(bVar80,CONCAT11(bVar79,bVar77)))))));
            bVar86 = (byte)uVar102 | (byte)uVar87;
            bVar88 = (byte)((ulong)uVar102 >> 8) | (byte)((ulong)uVar87 >> 8);
            bVar89 = (byte)((ulong)uVar102 >> 0x10) | (byte)((ulong)uVar87 >> 0x10);
            bVar90 = (byte)((ulong)uVar102 >> 0x18) | (byte)((ulong)uVar87 >> 0x18);
            bVar91 = (byte)((ulong)uVar102 >> 0x20) | (byte)((ulong)uVar87 >> 0x20);
            bVar92 = (byte)((ulong)uVar102 >> 0x28) | (byte)((ulong)uVar87 >> 0x28);
            bVar93 = (byte)((ulong)uVar102 >> 0x30) | (byte)((ulong)uVar87 >> 0x30);
            bVar94 = (byte)((ulong)uVar102 >> 0x38) | (byte)((ulong)uVar87 >> 0x38);
            uVar87 = CONCAT17(bVar94,CONCAT16(bVar93,CONCAT15(bVar92,CONCAT14(bVar91,CONCAT13(bVar90
                                                  ,CONCAT12(bVar89,CONCAT11(bVar88,bVar86)))))));
            uVar25 = uVar25 - 8;
            puVar23 = puVar23 + 8;
          } while (uVar25 != 0);
          bVar77 = bVar77 | bVar61 | bVar44 | bVar28;
          bVar79 = bVar79 | bVar62 | bVar46 | bVar29;
          bVar80 = bVar80 | bVar63 | bVar47 | bVar30;
          bVar81 = bVar81 | bVar64 | bVar48 | bVar31;
          bVar82 = bVar82 | bVar65 | bVar49 | bVar32;
          bVar83 = bVar83 | bVar66 | bVar50 | bVar33;
          bVar84 = bVar84 | bVar67 | bVar51 | bVar34;
          bVar85 = bVar85 | bVar68 | bVar52 | bVar35;
          bVar86 = bVar86 | bVar69 | bVar53 | bVar36;
          bVar88 = bVar88 | bVar70 | bVar54 | bVar37;
          bVar89 = bVar89 | bVar71 | bVar55 | bVar38;
          bVar90 = bVar90 | bVar72 | bVar56 | bVar39;
          bVar91 = bVar91 | bVar73 | bVar57 | bVar40;
          bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
          bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
          bVar94 = bVar94 | bVar76 | bVar60 | bVar43;
          auVar4[1] = bVar79;
          auVar4[0] = bVar77;
          auVar4[2] = bVar80;
          auVar4[3] = bVar81;
          auVar4[4] = bVar82;
          auVar4[5] = bVar83;
          auVar4[6] = bVar84;
          auVar4[7] = bVar85;
          auVar4[8] = bVar86;
          auVar4[9] = bVar88;
          auVar4[10] = bVar89;
          auVar4[0xb] = bVar90;
          auVar4[0xc] = bVar91;
          auVar4[0xd] = bVar92;
          auVar4[0xe] = bVar93;
          auVar4[0xf] = bVar94;
          auVar5[1] = bVar79;
          auVar5[0] = bVar77;
          auVar5[2] = bVar80;
          auVar5[3] = bVar81;
          auVar5[4] = bVar82;
          auVar5[5] = bVar83;
          auVar5[6] = bVar84;
          auVar5[7] = bVar85;
          auVar5[8] = bVar86;
          auVar5[9] = bVar88;
          auVar5[10] = bVar89;
          auVar5[0xb] = bVar90;
          auVar5[0xc] = bVar91;
          auVar5[0xd] = bVar92;
          auVar5[0xe] = bVar93;
          auVar5[0xf] = bVar94;
          auVar45 = NEON_ext(auVar4,auVar5,8,1);
          uVar25 = CONCAT17(bVar85 | auVar45[7],
                            CONCAT16(bVar84 | auVar45[6],
                                     CONCAT15(bVar83 | auVar45[5],
                                              CONCAT14(bVar82 | auVar45[4],
                                                       CONCAT13(bVar81 | auVar45[3],
                                                                CONCAT12(bVar80 | auVar45[2],
                                                                         CONCAT11(bVar79 | auVar45[1
                                                  ],bVar77 | auVar45[0])))))));
          if (uVar24 != uVar26) {
LAB_002b13e4:
            lVar21 = uVar26 - uVar24;
            puVar19 = (ulong *)(lVar20 + uVar24 * 8);
            do {
              uVar25 = *puVar19 | uVar25;
              lVar21 = lVar21 + -1;
              puVar19 = puVar19 + 1;
            } while (lVar21 != 0);
          }
          if (uVar25 != 0) break;
LAB_002b1608:
          *(undefined4 *)(lVar16 + 0x10) = 0;
          *(undefined4 *)(lVar16 + 8) = 0;
          cVar3 = *(char *)(unaff_x20 + 0x28);
        }
        iVar11 = func_0x0029c0b0(in_stack_00000008);
      } while (iVar11 == 0);
LAB_002b1488:
      iVar11 = func_0x002a09b0(in_stack_00000018,in_stack_00000008);
    } while ((iVar11 == 0) ||
            (iVar11 = func_0x002a06a4(in_stack_00000018,in_stack_00000018,in_stack_00000000),
            iVar11 == 0));
    iVar11 = func_0x002a06a4(in_stack_00000008,in_stack_00000008,in_stack_00000000);
    while (iVar11 != 0) {
      iVar11 = func_0x0029dd44(in_stack_00000018);
      if (iVar11 != 0) {
        lVar20 = func_0x0029bd80(lVar16,in_stack_00000008);
        unaff_x23 = in_stack_00000000;
        plVar14 = in_stack_00000008;
        if (lVar20 != 0) goto LAB_002b0e1c;
        break;
      }
      uVar27 = (uint)unaff_x28;
      if (uVar27 < 2) {
LAB_002b15ec:
        uVar17 = 0x6e;
        uVar18 = 0x17a;
        goto LAB_002b11b4;
      }
      iVar11 = func_0x002a09b0(in_stack_00000010,in_stack_00000018);
      if (iVar11 == 0) break;
      iVar11 = func_0x0029dd44(in_stack_00000010);
      if (iVar11 == 0) {
        if (uVar27 == 2) goto LAB_002b15ec;
        uVar26 = 2;
        while( true ) {
          iVar11 = func_0x002a06a4(in_stack_00000010,in_stack_00000010,in_stack_00000010);
          if (iVar11 == 0) goto LAB_002b11b8;
          iVar11 = func_0x0029dd44(in_stack_00000010);
          if (iVar11 != 0) break;
          uVar1 = (int)uVar26 + 1;
          uVar26 = (ulong)uVar1;
          if (uVar27 == uVar1) goto LAB_002b15ec;
        }
      }
      else {
        uVar26 = 1;
      }
      lVar20 = func_0x0029bd80(in_stack_00000010,plVar15);
      if (lVar20 == 0) break;
      if (0 < (int)(uVar27 + ~(uint)uVar26)) {
        uVar27 = uVar27 - (uint)uVar26;
        do {
          iVar11 = func_0x002a09b0(in_stack_00000010,in_stack_00000010);
          if (iVar11 == 0) goto LAB_002b11b8;
          uVar27 = uVar27 - 1;
        } while (1 < uVar27);
      }
      iVar11 = func_0x002a06a4(plVar15,in_stack_00000010,in_stack_00000010);
      if ((iVar11 == 0) ||
         (iVar11 = func_0x002a06a4(in_stack_00000008,in_stack_00000008,in_stack_00000010),
         iVar11 == 0)) break;
      iVar11 = func_0x002a06a4(in_stack_00000018,in_stack_00000018,plVar15);
      unaff_x28 = uVar26;
    }
  } while( true );
}

