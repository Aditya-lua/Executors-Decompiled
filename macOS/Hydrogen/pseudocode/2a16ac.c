
undefined8 FUN_002a16ac(ulong param_1)

{
  long *plVar1;
  undefined1 auVar2 [16];
  long *plVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  uint uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  uint uVar11;
  ulong *puVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  undefined8 *puVar16;
  long *unaff_x19;
  ulong unaff_x20;
  uint uVar17;
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
  undefined1 auVar35 [16];
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  undefined8 uVar60;
  byte bVar67;
  byte bVar68;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  undefined8 uVar69;
  byte bVar77;
  undefined8 uVar70;
  byte bVar78;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  undefined8 uVar79;
  byte bVar87;
  undefined8 uVar80;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  undefined8 uVar93;
  
  if ((uint)param_1 < 8) {
    uVar13 = 0;
    uVar15 = 0;
LAB_002a1720:
    lVar8 = param_1 - uVar13;
    puVar12 = (ulong *)(*unaff_x19 + uVar13 * 8);
    do {
      uVar15 = *puVar12 | uVar15;
      lVar8 = lVar8 + -1;
      puVar12 = puVar12 + 1;
    } while (lVar8 != 0);
  }
  else {
    uVar13 = param_1 & 0xfffffffffffffff8;
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
    uVar6 = 0;
    uVar60 = 0;
    uVar69 = 0;
    uVar79 = 0;
    puVar16 = (undefined8 *)(*unaff_x19 + 0x20);
    uVar15 = uVar13;
    do {
      uVar80 = puVar16[-3];
      uVar70 = puVar16[-4];
      uVar89 = puVar16[-1];
      uVar88 = puVar16[-2];
      uVar91 = puVar16[1];
      uVar90 = *puVar16;
      uVar93 = puVar16[3];
      uVar92 = puVar16[2];
      bVar18 = (byte)uVar70 | bVar18;
      bVar19 = (byte)((ulong)uVar70 >> 8) | bVar19;
      bVar20 = (byte)((ulong)uVar70 >> 0x10) | bVar20;
      bVar21 = (byte)((ulong)uVar70 >> 0x18) | bVar21;
      bVar22 = (byte)((ulong)uVar70 >> 0x20) | bVar22;
      bVar23 = (byte)((ulong)uVar70 >> 0x28) | bVar23;
      bVar24 = (byte)((ulong)uVar70 >> 0x30) | bVar24;
      bVar25 = (byte)((ulong)uVar70 >> 0x38) | bVar25;
      bVar26 = (byte)uVar80 | bVar26;
      bVar27 = (byte)((ulong)uVar80 >> 8) | bVar27;
      bVar28 = (byte)((ulong)uVar80 >> 0x10) | bVar28;
      bVar29 = (byte)((ulong)uVar80 >> 0x18) | bVar29;
      bVar30 = (byte)((ulong)uVar80 >> 0x20) | bVar30;
      bVar31 = (byte)((ulong)uVar80 >> 0x28) | bVar31;
      bVar32 = (byte)((ulong)uVar80 >> 0x30) | bVar32;
      bVar33 = (byte)((ulong)uVar80 >> 0x38) | bVar33;
      bVar34 = (byte)uVar88 | bVar34;
      bVar36 = (byte)((ulong)uVar88 >> 8) | bVar36;
      bVar37 = (byte)((ulong)uVar88 >> 0x10) | bVar37;
      bVar38 = (byte)((ulong)uVar88 >> 0x18) | bVar38;
      bVar39 = (byte)((ulong)uVar88 >> 0x20) | bVar39;
      bVar40 = (byte)((ulong)uVar88 >> 0x28) | bVar40;
      bVar41 = (byte)((ulong)uVar88 >> 0x30) | bVar41;
      bVar42 = (byte)((ulong)uVar88 >> 0x38) | bVar42;
      bVar43 = (byte)uVar89 | bVar43;
      bVar44 = (byte)((ulong)uVar89 >> 8) | bVar44;
      bVar45 = (byte)((ulong)uVar89 >> 0x10) | bVar45;
      bVar46 = (byte)((ulong)uVar89 >> 0x18) | bVar46;
      bVar47 = (byte)((ulong)uVar89 >> 0x20) | bVar47;
      bVar48 = (byte)((ulong)uVar89 >> 0x28) | bVar48;
      bVar49 = (byte)((ulong)uVar89 >> 0x30) | bVar49;
      bVar50 = (byte)((ulong)uVar89 >> 0x38) | bVar50;
      bVar51 = (byte)uVar90 | (byte)uVar6;
      bVar52 = (byte)((ulong)uVar90 >> 8) | (byte)((ulong)uVar6 >> 8);
      bVar53 = (byte)((ulong)uVar90 >> 0x10) | (byte)((ulong)uVar6 >> 0x10);
      bVar54 = (byte)((ulong)uVar90 >> 0x18) | (byte)((ulong)uVar6 >> 0x18);
      bVar55 = (byte)((ulong)uVar90 >> 0x20) | (byte)((ulong)uVar6 >> 0x20);
      bVar56 = (byte)((ulong)uVar90 >> 0x28) | (byte)((ulong)uVar6 >> 0x28);
      bVar57 = (byte)((ulong)uVar90 >> 0x30) | (byte)((ulong)uVar6 >> 0x30);
      bVar58 = (byte)((ulong)uVar90 >> 0x38) | (byte)((ulong)uVar6 >> 0x38);
      uVar6 = CONCAT17(bVar58,CONCAT16(bVar57,CONCAT15(bVar56,CONCAT14(bVar55,CONCAT13(bVar54,
                                                  CONCAT12(bVar53,CONCAT11(bVar52,bVar51)))))));
      bVar59 = (byte)uVar91 | (byte)uVar60;
      bVar61 = (byte)((ulong)uVar91 >> 8) | (byte)((ulong)uVar60 >> 8);
      bVar62 = (byte)((ulong)uVar91 >> 0x10) | (byte)((ulong)uVar60 >> 0x10);
      bVar63 = (byte)((ulong)uVar91 >> 0x18) | (byte)((ulong)uVar60 >> 0x18);
      bVar64 = (byte)((ulong)uVar91 >> 0x20) | (byte)((ulong)uVar60 >> 0x20);
      bVar65 = (byte)((ulong)uVar91 >> 0x28) | (byte)((ulong)uVar60 >> 0x28);
      bVar66 = (byte)((ulong)uVar91 >> 0x30) | (byte)((ulong)uVar60 >> 0x30);
      bVar67 = (byte)((ulong)uVar91 >> 0x38) | (byte)((ulong)uVar60 >> 0x38);
      uVar60 = CONCAT17(bVar67,CONCAT16(bVar66,CONCAT15(bVar65,CONCAT14(bVar64,CONCAT13(bVar63,
                                                  CONCAT12(bVar62,CONCAT11(bVar61,bVar59)))))));
      bVar68 = (byte)uVar92 | (byte)uVar69;
      bVar71 = (byte)((ulong)uVar92 >> 8) | (byte)((ulong)uVar69 >> 8);
      bVar72 = (byte)((ulong)uVar92 >> 0x10) | (byte)((ulong)uVar69 >> 0x10);
      bVar73 = (byte)((ulong)uVar92 >> 0x18) | (byte)((ulong)uVar69 >> 0x18);
      bVar74 = (byte)((ulong)uVar92 >> 0x20) | (byte)((ulong)uVar69 >> 0x20);
      bVar75 = (byte)((ulong)uVar92 >> 0x28) | (byte)((ulong)uVar69 >> 0x28);
      bVar76 = (byte)((ulong)uVar92 >> 0x30) | (byte)((ulong)uVar69 >> 0x30);
      bVar77 = (byte)((ulong)uVar92 >> 0x38) | (byte)((ulong)uVar69 >> 0x38);
      uVar69 = CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,
                                                  CONCAT12(bVar72,CONCAT11(bVar71,bVar68)))))));
      bVar78 = (byte)uVar93 | (byte)uVar79;
      bVar81 = (byte)((ulong)uVar93 >> 8) | (byte)((ulong)uVar79 >> 8);
      bVar82 = (byte)((ulong)uVar93 >> 0x10) | (byte)((ulong)uVar79 >> 0x10);
      bVar83 = (byte)((ulong)uVar93 >> 0x18) | (byte)((ulong)uVar79 >> 0x18);
      bVar84 = (byte)((ulong)uVar93 >> 0x20) | (byte)((ulong)uVar79 >> 0x20);
      bVar85 = (byte)((ulong)uVar93 >> 0x28) | (byte)((ulong)uVar79 >> 0x28);
      bVar86 = (byte)((ulong)uVar93 >> 0x30) | (byte)((ulong)uVar79 >> 0x30);
      bVar87 = (byte)((ulong)uVar93 >> 0x38) | (byte)((ulong)uVar79 >> 0x38);
      uVar79 = CONCAT17(bVar87,CONCAT16(bVar86,CONCAT15(bVar85,CONCAT14(bVar84,CONCAT13(bVar83,
                                                  CONCAT12(bVar82,CONCAT11(bVar81,bVar78)))))));
      uVar15 = uVar15 - 8;
      puVar16 = puVar16 + 8;
    } while (uVar15 != 0);
    bVar68 = bVar68 | bVar51 | bVar34 | bVar18;
    bVar71 = bVar71 | bVar52 | bVar36 | bVar19;
    bVar72 = bVar72 | bVar53 | bVar37 | bVar20;
    bVar73 = bVar73 | bVar54 | bVar38 | bVar21;
    bVar74 = bVar74 | bVar55 | bVar39 | bVar22;
    bVar75 = bVar75 | bVar56 | bVar40 | bVar23;
    bVar76 = bVar76 | bVar57 | bVar41 | bVar24;
    bVar77 = bVar77 | bVar58 | bVar42 | bVar25;
    bVar78 = bVar78 | bVar59 | bVar43 | bVar26;
    bVar81 = bVar81 | bVar61 | bVar44 | bVar27;
    bVar82 = bVar82 | bVar62 | bVar45 | bVar28;
    bVar83 = bVar83 | bVar63 | bVar46 | bVar29;
    bVar84 = bVar84 | bVar64 | bVar47 | bVar30;
    bVar85 = bVar85 | bVar65 | bVar48 | bVar31;
    bVar86 = bVar86 | bVar66 | bVar49 | bVar32;
    bVar87 = bVar87 | bVar67 | bVar50 | bVar33;
    auVar35[1] = bVar71;
    auVar35[0] = bVar68;
    auVar35[2] = bVar72;
    auVar35[3] = bVar73;
    auVar35[4] = bVar74;
    auVar35[5] = bVar75;
    auVar35[6] = bVar76;
    auVar35[7] = bVar77;
    auVar35[8] = bVar78;
    auVar35[9] = bVar81;
    auVar35[10] = bVar82;
    auVar35[0xb] = bVar83;
    auVar35[0xc] = bVar84;
    auVar35[0xd] = bVar85;
    auVar35[0xe] = bVar86;
    auVar35[0xf] = bVar87;
    auVar2[1] = bVar71;
    auVar2[0] = bVar68;
    auVar2[2] = bVar72;
    auVar2[3] = bVar73;
    auVar2[4] = bVar74;
    auVar2[5] = bVar75;
    auVar2[6] = bVar76;
    auVar2[7] = bVar77;
    auVar2[8] = bVar78;
    auVar2[9] = bVar81;
    auVar2[10] = bVar82;
    auVar2[0xb] = bVar83;
    auVar2[0xc] = bVar84;
    auVar2[0xd] = bVar85;
    auVar2[0xe] = bVar86;
    auVar2[0xf] = bVar87;
    auVar35 = NEON_ext(auVar35,auVar2,8,1);
    uVar15 = CONCAT17(bVar77 | auVar35[7],
                      CONCAT16(bVar76 | auVar35[6],
                               CONCAT15(bVar75 | auVar35[5],
                                        CONCAT14(bVar74 | auVar35[4],
                                                 CONCAT13(bVar73 | auVar35[3],
                                                          CONCAT12(bVar72 | auVar35[2],
                                                                   CONCAT11(bVar71 | auVar35[1],
                                                                            bVar68 | auVar35[0])))))
                              ));
    if (uVar13 != param_1) goto LAB_002a1720;
  }
  if ((uVar15 == 0) || ((int)unaff_x19[2] == 0)) {
    return 1;
  }
  uVar13 = unaff_x20 - 1 >> 6;
  uVar15 = uVar13 + 1;
  uVar6 = func_0x0029afb8();
  if ((int)uVar6 == 0) {
    return uVar6;
  }
  lVar8 = uVar15 - (long)(int)unaff_x19[1];
  if (lVar8 != 0) {
    _bzero(*unaff_x19 + (long)(int)unaff_x19[1] * 8,lVar8 * 8);
  }
  *(undefined4 *)(unaff_x19 + 2) = 0;
  uVar17 = (uint)uVar15;
  if (0 < (int)uVar17) {
    lVar8 = *unaff_x19;
    uVar9 = uVar15 & 0xffffffff;
    if (uVar9 < 8) {
      lVar14 = 0;
    }
    else {
      lVar14 = uVar9 - (uVar15 & 7);
      puVar16 = (undefined8 *)(lVar8 + 0x20);
      lVar10 = lVar14;
      do {
        uVar60 = puVar16[-3];
        uVar6 = puVar16[-4];
        uVar79 = puVar16[1];
        uVar69 = *puVar16;
        uVar80 = puVar16[3];
        uVar70 = puVar16[2];
        puVar16[-3] = CONCAT17(~(byte)((ulong)uVar60 >> 0x38),
                               CONCAT16(~(byte)((ulong)uVar60 >> 0x30),
                                        CONCAT15(~(byte)((ulong)uVar60 >> 0x28),
                                                 CONCAT14(~(byte)((ulong)uVar60 >> 0x20),
                                                          CONCAT13(~(byte)((ulong)uVar60 >> 0x18),
                                                                   CONCAT12(~(byte)((ulong)uVar60 >>
                                                                                   0x10),
                                                                            CONCAT11(~(byte)((ulong)
                                                  uVar60 >> 8),~(byte)uVar60)))))));
        puVar16[-4] = CONCAT17(~(byte)((ulong)uVar6 >> 0x38),
                               CONCAT16(~(byte)((ulong)uVar6 >> 0x30),
                                        CONCAT15(~(byte)((ulong)uVar6 >> 0x28),
                                                 CONCAT14(~(byte)((ulong)uVar6 >> 0x20),
                                                          CONCAT13(~(byte)((ulong)uVar6 >> 0x18),
                                                                   CONCAT12(~(byte)((ulong)uVar6 >>
                                                                                   0x10),
                                                                            CONCAT11(~(byte)((ulong)
                                                  uVar6 >> 8),~(byte)uVar6)))))));
        *(byte *)(puVar16 + -1) = ~*(byte *)(puVar16 + -1);
        *(byte *)((long)puVar16 + -7) = ~*(byte *)((long)puVar16 + -7);
        *(byte *)((long)puVar16 + -6) = ~*(byte *)((long)puVar16 + -6);
        *(byte *)((long)puVar16 + -5) = ~*(byte *)((long)puVar16 + -5);
        *(byte *)((long)puVar16 + -4) = ~*(byte *)((long)puVar16 + -4);
        *(byte *)((long)puVar16 + -3) = ~*(byte *)((long)puVar16 + -3);
        *(byte *)((long)puVar16 + -2) = ~*(byte *)((long)puVar16 + -2);
        *(byte *)((long)puVar16 + -1) = ~*(byte *)((long)puVar16 + -1);
        *(byte *)(puVar16 + -2) = ~*(byte *)(puVar16 + -2);
        *(byte *)((long)puVar16 + -0xf) = ~*(byte *)((long)puVar16 + -0xf);
        *(byte *)((long)puVar16 + -0xe) = ~*(byte *)((long)puVar16 + -0xe);
        *(byte *)((long)puVar16 + -0xd) = ~*(byte *)((long)puVar16 + -0xd);
        *(byte *)((long)puVar16 + -0xc) = ~*(byte *)((long)puVar16 + -0xc);
        *(byte *)((long)puVar16 + -0xb) = ~*(byte *)((long)puVar16 + -0xb);
        *(byte *)((long)puVar16 + -10) = ~*(byte *)((long)puVar16 + -10);
        *(byte *)((long)puVar16 + -9) = ~*(byte *)((long)puVar16 + -9);
        puVar16[1] = CONCAT17(~(byte)((ulong)uVar79 >> 0x38),
                              CONCAT16(~(byte)((ulong)uVar79 >> 0x30),
                                       CONCAT15(~(byte)((ulong)uVar79 >> 0x28),
                                                CONCAT14(~(byte)((ulong)uVar79 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)uVar79 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)uVar79 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  uVar79 >> 8),~(byte)uVar79)))))));
        *puVar16 = CONCAT17(~(byte)((ulong)uVar69 >> 0x38),
                            CONCAT16(~(byte)((ulong)uVar69 >> 0x30),
                                     CONCAT15(~(byte)((ulong)uVar69 >> 0x28),
                                              CONCAT14(~(byte)((ulong)uVar69 >> 0x20),
                                                       CONCAT13(~(byte)((ulong)uVar69 >> 0x18),
                                                                CONCAT12(~(byte)((ulong)uVar69 >>
                                                                                0x10),
                                                                         CONCAT11(~(byte)((ulong)
                                                  uVar69 >> 8),~(byte)uVar69)))))));
        puVar16[3] = CONCAT17(~(byte)((ulong)uVar80 >> 0x38),
                              CONCAT16(~(byte)((ulong)uVar80 >> 0x30),
                                       CONCAT15(~(byte)((ulong)uVar80 >> 0x28),
                                                CONCAT14(~(byte)((ulong)uVar80 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)uVar80 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)uVar80 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  uVar80 >> 8),~(byte)uVar80)))))));
        puVar16[2] = CONCAT17(~(byte)((ulong)uVar70 >> 0x38),
                              CONCAT16(~(byte)((ulong)uVar70 >> 0x30),
                                       CONCAT15(~(byte)((ulong)uVar70 >> 0x28),
                                                CONCAT14(~(byte)((ulong)uVar70 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)uVar70 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)uVar70 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  uVar70 >> 8),~(byte)uVar70)))))));
        lVar10 = lVar10 + -8;
        puVar16 = puVar16 + 8;
      } while (lVar10 != 0);
      if ((uVar15 & 7) == 0) goto LAB_002a180c;
    }
    lVar10 = lVar14 - uVar9;
    puVar12 = (ulong *)(lVar8 + lVar14 * 8);
    do {
      *puVar12 = ~*puVar12;
      bVar4 = lVar10 != -1;
      lVar10 = lVar10 + 1;
      puVar12 = puVar12 + 1;
    } while (bVar4);
  }
LAB_002a180c:
  if ((unaff_x20 & 0x3f) != 0) {
    uVar9 = -(unaff_x20 - 1 >> 0x25 & 1) & 0xfffffff800000000 | (uVar13 & 0xffffffff) << 3;
    *(ulong *)(*unaff_x19 + uVar9) =
         *(ulong *)(*unaff_x19 + uVar9) & (-1L << (unaff_x20 & 0x3f) ^ 0xffffffffffffffffU);
  }
  lVar8 = (uVar15 & 0xffffffff) * 8;
  iVar5 = (int)uVar13 + 2;
  do {
    lVar8 = lVar8 + -8;
    iVar5 = iVar5 + -1;
    if (iVar5 < 1) {
      *(uint *)(unaff_x19 + 1) = uVar17 & (int)uVar17 >> 0x1f;
      if (-1 < (int)uVar17) {
        *(undefined4 *)(unaff_x19 + 2) = 0;
      }
      goto _aws_lc_0_24_0_BN_add;
    }
  } while (*(long *)(*unaff_x19 + lVar8) == 0);
  *(int *)(unaff_x19 + 1) = iVar5;
_aws_lc_0_24_0_BN_add:
  func_0x00373e9c(0xa29210,&DAT_0029be70);
  iVar5 = (int)unaff_x19[2];
  if (iVar5 == iRam0000000000a398d0) {
    uVar6 = func_0x0029ae04();
  }
  else {
    plVar1 = unaff_x19;
    plVar3 = (long *)0xa398c0;
    if (iVar5 != 0) {
      plVar1 = (long *)0xa398c0;
      plVar3 = unaff_x19;
    }
    iVar5 = func_0x0029d99c(*plVar1,(long)(int)plVar1[1],*plVar3,(long)(int)plVar3[1]);
    if (iVar5 < 0) {
      uVar6 = func_0x0029b864();
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      uVar17 = *(uint *)(unaff_x19 + 1);
      uVar15 = (ulong)uVar17;
      lVar8 = uVar15 * 8;
      do {
        lVar8 = lVar8 + -8;
        uVar11 = (uint)uVar15;
        uVar15 = (ulong)(uVar11 - 1);
        uVar7 = uVar17 & (int)uVar17 >> 0x1f;
        if ((int)uVar11 < 1) goto code_r0x0029ad5c;
      } while (*(long *)(*unaff_x19 + lVar8) == 0);
      uVar7 = uVar11;
code_r0x0029ad5c:
      *(uint *)(unaff_x19 + 1) = uVar7;
      iVar5 = 1;
    }
    else {
      uVar6 = func_0x0029b864();
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      uVar17 = *(uint *)(unaff_x19 + 1);
      uVar15 = (ulong)uVar17;
      lVar8 = uVar15 * 8;
      do {
        lVar8 = lVar8 + -8;
        uVar11 = (uint)uVar15;
        uVar15 = (ulong)(uVar11 - 1);
        uVar7 = uVar17 & (int)uVar17 >> 0x1f;
        if ((int)uVar11 < 1) goto code_r0x0029ad10;
      } while (*(long *)(*unaff_x19 + lVar8) == 0);
      uVar7 = uVar11;
code_r0x0029ad10:
      iVar5 = 0;
      *(uint *)(unaff_x19 + 1) = uVar7;
    }
    uVar6 = 1;
  }
  *(int *)(unaff_x19 + 2) = iVar5;
  return uVar6;
}

