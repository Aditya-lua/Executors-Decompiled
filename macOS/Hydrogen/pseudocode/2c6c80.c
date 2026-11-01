
byte FUN_002c6c80(undefined8 param_1)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x24;
  undefined8 uVar20;
  code *unaff_x27;
  long unaff_x29;
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
  undefined1 auVar39 [16];
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  undefined8 uVar64;
  byte bVar71;
  byte bVar72;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  undefined8 uVar73;
  byte bVar80;
  byte bVar81;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  undefined8 uVar82;
  byte bVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  undefined8 uVar93;
  undefined8 uVar94;
  undefined8 uVar95;
  undefined8 uVar96;
  undefined8 uVar97;
  undefined8 uVar98;
  undefined8 uVar99;
  undefined8 uVar100;
  undefined8 uVar101;
  undefined1 uStack0000000000000098;
  undefined1 uStack00000000000000e0;
  undefined8 uStack0000000000000100;
  
  lVar7 = func_0x00382cc0(param_1,&uStack00000000000000e0,&uStack0000000000000098);
  func_0x00382c70(unaff_x29 + -0x98,&uStack00000000000000e0);
  if ((uint)unaff_x24 != 0) {
    uVar12 = 0;
    uVar8 = -lVar7;
    uVar9 = lVar7 - 1;
    if (7 < (uint)unaff_x24) {
      bVar21 = (byte)uVar8;
      bVar22 = (byte)(uVar8 >> 8);
      bVar23 = (byte)(uVar8 >> 0x10);
      bVar24 = (byte)(uVar8 >> 0x18);
      bVar25 = (byte)(uVar8 >> 0x20);
      bVar26 = (byte)(uVar8 >> 0x28);
      bVar27 = (byte)(uVar8 >> 0x30);
      bVar28 = (byte)(uVar8 >> 0x38);
      uVar12 = unaff_x24 & 0xfffffffffffffff8;
      puVar11 = &uStack0000000000000100;
      puVar15 = (undefined8 *)(unaff_x29 + -0x78);
      uVar13 = uVar12;
      do {
        uVar64 = puVar15[-3];
        uVar20 = puVar15[-4];
        uVar82 = puVar15[-1];
        uVar73 = puVar15[-2];
        uVar91 = puVar15[1];
        uVar90 = *puVar15;
        uVar93 = puVar15[3];
        uVar92 = puVar15[2];
        uVar95 = puVar11[-3];
        uVar94 = puVar11[-4];
        uVar97 = puVar11[-1];
        uVar96 = puVar11[-2];
        uVar99 = puVar11[1];
        uVar98 = *puVar11;
        uVar101 = puVar11[3];
        uVar100 = puVar11[2];
        bVar29 = (byte)uVar9;
        bVar30 = (byte)(uVar9 >> 8);
        bVar31 = (byte)(uVar9 >> 0x10);
        bVar32 = (byte)(uVar9 >> 0x18);
        bVar33 = (byte)(uVar9 >> 0x20);
        bVar34 = (byte)(uVar9 >> 0x28);
        bVar35 = (byte)(uVar9 >> 0x30);
        bVar36 = (byte)(uVar9 >> 0x38);
        puVar11[-3] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar36 |
                               (byte)((ulong)uVar64 >> 0x38) & bVar28,
                               CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar35 |
                                        (byte)((ulong)uVar64 >> 0x30) & bVar27,
                                        CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar34 |
                                                 (byte)((ulong)uVar64 >> 0x28) & bVar26,
                                                 CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar33 |
                                                          (byte)((ulong)uVar64 >> 0x20) & bVar25,
                                                          CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                   bVar32 | (byte)((ulong)uVar64 >>
                                                                                  0x18) & bVar24,
                                                                   CONCAT12((byte)((ulong)uVar95 >>
                                                                                  0x10) & bVar31 |
                                                                            (byte)((ulong)uVar64 >>
                                                                                  0x10) & bVar23,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar95 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar64 >> 8) & bVar22,
                                                  (byte)uVar95 & bVar29 | (byte)uVar64 & bVar21)))))
                                       ));
        puVar11[-4] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar36 |
                               (byte)((ulong)uVar20 >> 0x38) & bVar28,
                               CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar35 |
                                        (byte)((ulong)uVar20 >> 0x30) & bVar27,
                                        CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar34 |
                                                 (byte)((ulong)uVar20 >> 0x28) & bVar26,
                                                 CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar33 |
                                                          (byte)((ulong)uVar20 >> 0x20) & bVar25,
                                                          CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                   bVar32 | (byte)((ulong)uVar20 >>
                                                                                  0x18) & bVar24,
                                                                   CONCAT12((byte)((ulong)uVar94 >>
                                                                                  0x10) & bVar31 |
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x10) & bVar23,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar94 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar20 >> 8) & bVar22,
                                                  (byte)uVar94 & bVar29 | (byte)uVar20 & bVar21)))))
                                       ));
        puVar11[-1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar36 |
                               (byte)((ulong)uVar82 >> 0x38) & bVar28,
                               CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar35 |
                                        (byte)((ulong)uVar82 >> 0x30) & bVar27,
                                        CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar34 |
                                                 (byte)((ulong)uVar82 >> 0x28) & bVar26,
                                                 CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar33 |
                                                          (byte)((ulong)uVar82 >> 0x20) & bVar25,
                                                          CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                   bVar32 | (byte)((ulong)uVar82 >>
                                                                                  0x18) & bVar24,
                                                                   CONCAT12((byte)((ulong)uVar97 >>
                                                                                  0x10) & bVar31 |
                                                                            (byte)((ulong)uVar82 >>
                                                                                  0x10) & bVar23,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar97 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar82 >> 8) & bVar22,
                                                  (byte)uVar97 & bVar29 | (byte)uVar82 & bVar21)))))
                                       ));
        puVar11[-2] = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar36 |
                               (byte)((ulong)uVar73 >> 0x38) & bVar28,
                               CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar35 |
                                        (byte)((ulong)uVar73 >> 0x30) & bVar27,
                                        CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar34 |
                                                 (byte)((ulong)uVar73 >> 0x28) & bVar26,
                                                 CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar33 |
                                                          (byte)((ulong)uVar73 >> 0x20) & bVar25,
                                                          CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                   bVar32 | (byte)((ulong)uVar73 >>
                                                                                  0x18) & bVar24,
                                                                   CONCAT12((byte)((ulong)uVar96 >>
                                                                                  0x10) & bVar31 |
                                                                            (byte)((ulong)uVar73 >>
                                                                                  0x10) & bVar23,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar96 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar73 >> 8) & bVar22,
                                                  (byte)uVar96 & bVar29 | (byte)uVar73 & bVar21)))))
                                       ));
        puVar11[1] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar36 |
                              (byte)((ulong)uVar91 >> 0x38) & bVar28,
                              CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar35 |
                                       (byte)((ulong)uVar91 >> 0x30) & bVar27,
                                       CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar34 |
                                                (byte)((ulong)uVar91 >> 0x28) & bVar26,
                                                CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar33 |
                                                         (byte)((ulong)uVar91 >> 0x20) & bVar25,
                                                         CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                  bVar32 | (byte)((ulong)uVar91 >>
                                                                                 0x18) & bVar24,
                                                                  CONCAT12((byte)((ulong)uVar99 >>
                                                                                 0x10) & bVar31 |
                                                                           (byte)((ulong)uVar91 >>
                                                                                 0x10) & bVar23,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar22,
                                                  (byte)uVar99 & bVar29 | (byte)uVar91 & bVar21)))))
                                      ));
        *puVar11 = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar36 |
                            (byte)((ulong)uVar90 >> 0x38) & bVar28,
                            CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar35 |
                                     (byte)((ulong)uVar90 >> 0x30) & bVar27,
                                     CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar34 |
                                              (byte)((ulong)uVar90 >> 0x28) & bVar26,
                                              CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar33 |
                                                       (byte)((ulong)uVar90 >> 0x20) & bVar25,
                                                       CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                bVar32 | (byte)((ulong)uVar90 >>
                                                                               0x18) & bVar24,
                                                                CONCAT12((byte)((ulong)uVar98 >>
                                                                               0x10) & bVar31 |
                                                                         (byte)((ulong)uVar90 >>
                                                                               0x10) & bVar23,
                                                                         CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar90 >> 8) & bVar22,
                                                  (byte)uVar98 & bVar29 | (byte)uVar90 & bVar21)))))
                                    ));
        puVar11[3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar36 |
                              (byte)((ulong)uVar93 >> 0x38) & bVar28,
                              CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar35 |
                                       (byte)((ulong)uVar93 >> 0x30) & bVar27,
                                       CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar34 |
                                                (byte)((ulong)uVar93 >> 0x28) & bVar26,
                                                CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar33 |
                                                         (byte)((ulong)uVar93 >> 0x20) & bVar25,
                                                         CONCAT13((byte)((ulong)uVar101 >> 0x18) &
                                                                  bVar32 | (byte)((ulong)uVar93 >>
                                                                                 0x18) & bVar24,
                                                                  CONCAT12((byte)((ulong)uVar101 >>
                                                                                 0x10) & bVar31 |
                                                                           (byte)((ulong)uVar93 >>
                                                                                 0x10) & bVar23,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar101 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar22,
                                                  (byte)uVar101 & bVar29 | (byte)uVar93 & bVar21))))
                                               )));
        puVar11[2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar36 |
                              (byte)((ulong)uVar92 >> 0x38) & bVar28,
                              CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar35 |
                                       (byte)((ulong)uVar92 >> 0x30) & bVar27,
                                       CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar34 |
                                                (byte)((ulong)uVar92 >> 0x28) & bVar26,
                                                CONCAT14((byte)((ulong)uVar100 >> 0x20) & bVar33 |
                                                         (byte)((ulong)uVar92 >> 0x20) & bVar25,
                                                         CONCAT13((byte)((ulong)uVar100 >> 0x18) &
                                                                  bVar32 | (byte)((ulong)uVar92 >>
                                                                                 0x18) & bVar24,
                                                                  CONCAT12((byte)((ulong)uVar100 >>
                                                                                 0x10) & bVar31 |
                                                                           (byte)((ulong)uVar92 >>
                                                                                 0x10) & bVar23,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar100 >> 8) & bVar30 |
                                                  (byte)((ulong)uVar92 >> 8) & bVar22,
                                                  (byte)uVar100 & bVar29 | (byte)uVar92 & bVar21))))
                                               )));
        uVar13 = uVar13 - 8;
        puVar11 = puVar11 + 8;
        puVar15 = puVar15 + 8;
      } while (uVar13 != 0);
      if (uVar12 == unaff_x24) goto LAB_002c6d70;
    }
    lVar7 = unaff_x24 - uVar12;
    puVar10 = (ulong *)(&uStack00000000000000e0 + uVar12 * 8);
    puVar16 = (ulong *)(unaff_x29 + -0x98 + uVar12 * 8);
    do {
      *puVar10 = *puVar10 & uVar9 | *puVar16 & uVar8;
      lVar7 = lVar7 + -1;
      puVar10 = puVar10 + 1;
      puVar16 = puVar16 + 1;
    } while (lVar7 != 0);
  }
LAB_002c6d70:
  uVar1 = *(uint *)(unaff_x21 + 0x148);
  uVar8 = (ulong)uVar1;
  if ((int)uVar1 < 1) {
    bVar21 = 0xff;
  }
  else {
    if (uVar1 < 8) {
      uVar12 = 0;
      uVar9 = 0;
LAB_002c6df8:
      lVar7 = uVar8 - uVar12;
      puVar10 = (ulong *)(&uStack00000000000000e0 + uVar12 * 8);
      do {
        uVar9 = *puVar10 | uVar9;
        lVar7 = lVar7 + -1;
        puVar10 = puVar10 + 1;
      } while (lVar7 != 0);
    }
    else {
      uVar12 = uVar8 & 0xfffffff8;
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
      bVar53 = 0;
      uVar20 = 0;
      uVar64 = 0;
      uVar73 = 0;
      uVar82 = 0;
      puVar11 = &uStack0000000000000100;
      uVar9 = uVar12;
      do {
        uVar91 = puVar11[-3];
        uVar90 = puVar11[-4];
        uVar93 = puVar11[-1];
        uVar92 = puVar11[-2];
        uVar95 = puVar11[1];
        uVar94 = *puVar11;
        uVar97 = puVar11[3];
        uVar96 = puVar11[2];
        bVar21 = (byte)uVar90 | bVar21;
        bVar22 = (byte)((ulong)uVar90 >> 8) | bVar22;
        bVar23 = (byte)((ulong)uVar90 >> 0x10) | bVar23;
        bVar24 = (byte)((ulong)uVar90 >> 0x18) | bVar24;
        bVar25 = (byte)((ulong)uVar90 >> 0x20) | bVar25;
        bVar26 = (byte)((ulong)uVar90 >> 0x28) | bVar26;
        bVar27 = (byte)((ulong)uVar90 >> 0x30) | bVar27;
        bVar28 = (byte)((ulong)uVar90 >> 0x38) | bVar28;
        bVar29 = (byte)uVar91 | bVar29;
        bVar30 = (byte)((ulong)uVar91 >> 8) | bVar30;
        bVar31 = (byte)((ulong)uVar91 >> 0x10) | bVar31;
        bVar32 = (byte)((ulong)uVar91 >> 0x18) | bVar32;
        bVar33 = (byte)((ulong)uVar91 >> 0x20) | bVar33;
        bVar34 = (byte)((ulong)uVar91 >> 0x28) | bVar34;
        bVar35 = (byte)((ulong)uVar91 >> 0x30) | bVar35;
        bVar36 = (byte)((ulong)uVar91 >> 0x38) | bVar36;
        bVar37 = (byte)uVar92 | bVar37;
        bVar38 = (byte)((ulong)uVar92 >> 8) | bVar38;
        bVar40 = (byte)((ulong)uVar92 >> 0x10) | bVar40;
        bVar41 = (byte)((ulong)uVar92 >> 0x18) | bVar41;
        bVar42 = (byte)((ulong)uVar92 >> 0x20) | bVar42;
        bVar43 = (byte)((ulong)uVar92 >> 0x28) | bVar43;
        bVar44 = (byte)((ulong)uVar92 >> 0x30) | bVar44;
        bVar45 = (byte)((ulong)uVar92 >> 0x38) | bVar45;
        bVar46 = (byte)uVar93 | bVar46;
        bVar47 = (byte)((ulong)uVar93 >> 8) | bVar47;
        bVar48 = (byte)((ulong)uVar93 >> 0x10) | bVar48;
        bVar49 = (byte)((ulong)uVar93 >> 0x18) | bVar49;
        bVar50 = (byte)((ulong)uVar93 >> 0x20) | bVar50;
        bVar51 = (byte)((ulong)uVar93 >> 0x28) | bVar51;
        bVar52 = (byte)((ulong)uVar93 >> 0x30) | bVar52;
        bVar53 = (byte)((ulong)uVar93 >> 0x38) | bVar53;
        bVar89 = (byte)uVar94 | (byte)uVar20;
        bVar55 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar20 >> 8);
        bVar56 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar20 >> 0x10);
        bVar57 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar20 >> 0x18);
        bVar58 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar20 >> 0x20);
        bVar59 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar20 >> 0x28);
        bVar60 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar20 >> 0x30);
        bVar61 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar20 >> 0x38);
        uVar20 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(bVar57,
                                                  CONCAT12(bVar56,CONCAT11(bVar55,bVar89)))))));
        bVar62 = (byte)uVar95 | (byte)uVar64;
        bVar63 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar64 >> 8);
        bVar65 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar64 >> 0x10);
        bVar66 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar64 >> 0x18);
        bVar67 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar64 >> 0x20);
        bVar68 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar64 >> 0x28);
        bVar69 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar64 >> 0x30);
        bVar70 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar64 >> 0x38);
        uVar64 = CONCAT17(bVar70,CONCAT16(bVar69,CONCAT15(bVar68,CONCAT14(bVar67,CONCAT13(bVar66,
                                                  CONCAT12(bVar65,CONCAT11(bVar63,bVar62)))))));
        bVar54 = (byte)uVar96 | (byte)uVar73;
        bVar72 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar73 >> 8);
        bVar74 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar73 >> 0x10);
        bVar75 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar73 >> 0x18);
        bVar76 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar73 >> 0x20);
        bVar77 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar73 >> 0x28);
        bVar78 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar73 >> 0x30);
        bVar79 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar73 >> 0x38);
        uVar73 = CONCAT17(bVar79,CONCAT16(bVar78,CONCAT15(bVar77,CONCAT14(bVar76,CONCAT13(bVar75,
                                                  CONCAT12(bVar74,CONCAT11(bVar72,bVar54)))))));
        bVar80 = (byte)uVar97 | (byte)uVar82;
        bVar81 = (byte)((ulong)uVar97 >> 8) | (byte)((ulong)uVar82 >> 8);
        bVar83 = (byte)((ulong)uVar97 >> 0x10) | (byte)((ulong)uVar82 >> 0x10);
        bVar84 = (byte)((ulong)uVar97 >> 0x18) | (byte)((ulong)uVar82 >> 0x18);
        bVar85 = (byte)((ulong)uVar97 >> 0x20) | (byte)((ulong)uVar82 >> 0x20);
        bVar86 = (byte)((ulong)uVar97 >> 0x28) | (byte)((ulong)uVar82 >> 0x28);
        bVar87 = (byte)((ulong)uVar97 >> 0x30) | (byte)((ulong)uVar82 >> 0x30);
        bVar88 = (byte)((ulong)uVar97 >> 0x38) | (byte)((ulong)uVar82 >> 0x38);
        uVar82 = CONCAT17(bVar88,CONCAT16(bVar87,CONCAT15(bVar86,CONCAT14(bVar85,CONCAT13(bVar84,
                                                  CONCAT12(bVar83,CONCAT11(bVar81,bVar80)))))));
        uVar9 = uVar9 - 8;
        puVar11 = puVar11 + 8;
      } while (uVar9 != 0);
      bVar54 = bVar54 | bVar89 | bVar37 | bVar21;
      bVar72 = bVar72 | bVar55 | bVar38 | bVar22;
      bVar74 = bVar74 | bVar56 | bVar40 | bVar23;
      bVar75 = bVar75 | bVar57 | bVar41 | bVar24;
      bVar76 = bVar76 | bVar58 | bVar42 | bVar25;
      bVar77 = bVar77 | bVar59 | bVar43 | bVar26;
      bVar78 = bVar78 | bVar60 | bVar44 | bVar27;
      bVar79 = bVar79 | bVar61 | bVar45 | bVar28;
      bVar80 = bVar80 | bVar62 | bVar46 | bVar29;
      bVar81 = bVar81 | bVar63 | bVar47 | bVar30;
      bVar83 = bVar83 | bVar65 | bVar48 | bVar31;
      bVar84 = bVar84 | bVar66 | bVar49 | bVar32;
      bVar85 = bVar85 | bVar67 | bVar50 | bVar33;
      bVar86 = bVar86 | bVar68 | bVar51 | bVar34;
      bVar87 = bVar87 | bVar69 | bVar52 | bVar35;
      bVar88 = bVar88 | bVar70 | bVar53 | bVar36;
      auVar39[1] = bVar72;
      auVar39[0] = bVar54;
      auVar39[2] = bVar74;
      auVar39[3] = bVar75;
      auVar39[4] = bVar76;
      auVar39[5] = bVar77;
      auVar39[6] = bVar78;
      auVar39[7] = bVar79;
      auVar39[8] = bVar80;
      auVar39[9] = bVar81;
      auVar39[10] = bVar83;
      auVar39[0xb] = bVar84;
      auVar39[0xc] = bVar85;
      auVar39[0xd] = bVar86;
      auVar39[0xe] = bVar87;
      auVar39[0xf] = bVar88;
      auVar6[1] = bVar72;
      auVar6[0] = bVar54;
      auVar6[2] = bVar74;
      auVar6[3] = bVar75;
      auVar6[4] = bVar76;
      auVar6[5] = bVar77;
      auVar6[6] = bVar78;
      auVar6[7] = bVar79;
      auVar6[8] = bVar80;
      auVar6[9] = bVar81;
      auVar6[10] = bVar83;
      auVar6[0xb] = bVar84;
      auVar6[0xc] = bVar85;
      auVar6[0xd] = bVar86;
      auVar6[0xe] = bVar87;
      auVar6[0xf] = bVar88;
      auVar39 = NEON_ext(auVar39,auVar6,8,1);
      uVar9 = CONCAT17(bVar79 | auVar39[7],
                       CONCAT16(bVar78 | auVar39[6],
                                CONCAT15(bVar77 | auVar39[5],
                                         CONCAT14(bVar76 | auVar39[4],
                                                  CONCAT13(bVar75 | auVar39[3],
                                                           CONCAT12(bVar74 | auVar39[2],
                                                                    CONCAT11(bVar72 | auVar39[1],
                                                                             bVar54 | auVar39[0]))))
                                        )));
      if (uVar12 != uVar8) goto LAB_002c6df8;
    }
    bVar21 = ~(uVar9 != 0);
  }
  (*unaff_x27)();
  (*unaff_x27)();
  (*unaff_x27)();
  (*unaff_x27)();
  uVar20 = *(undefined8 *)(unaff_x21 + 0x140);
  uVar1 = *(uint *)(unaff_x21 + 0x148);
  uVar8 = (ulong)(int)uVar1;
  lVar7 = func_0x00382cc0(&uStack00000000000000e0,&uStack00000000000000e0,&uStack0000000000000098,
                          uVar8);
  func_0x00382c70(unaff_x29 + -0x98,&uStack00000000000000e0,uVar20,uVar8);
  if (uVar1 != 0) {
    uVar13 = 0;
    uVar9 = -lVar7;
    uVar12 = lVar7 - 1;
    if (7 < uVar1) {
      bVar22 = (byte)uVar9;
      bVar23 = (byte)(uVar9 >> 8);
      bVar24 = (byte)(uVar9 >> 0x10);
      bVar25 = (byte)(uVar9 >> 0x18);
      bVar26 = (byte)(uVar9 >> 0x20);
      bVar27 = (byte)(uVar9 >> 0x28);
      bVar28 = (byte)(uVar9 >> 0x30);
      bVar29 = (byte)(uVar9 >> 0x38);
      uVar13 = uVar8 & 0xfffffffffffffff8;
      puVar11 = &uStack0000000000000100;
      puVar15 = (undefined8 *)(unaff_x29 + -0x78);
      uVar14 = uVar13;
      do {
        uVar64 = puVar15[-3];
        uVar20 = puVar15[-4];
        uVar82 = puVar15[-1];
        uVar73 = puVar15[-2];
        uVar91 = puVar15[1];
        uVar90 = *puVar15;
        uVar93 = puVar15[3];
        uVar92 = puVar15[2];
        uVar95 = puVar11[-3];
        uVar94 = puVar11[-4];
        uVar97 = puVar11[-1];
        uVar96 = puVar11[-2];
        uVar99 = puVar11[1];
        uVar98 = *puVar11;
        uVar101 = puVar11[3];
        uVar100 = puVar11[2];
        bVar30 = (byte)uVar12;
        bVar31 = (byte)(uVar12 >> 8);
        bVar32 = (byte)(uVar12 >> 0x10);
        bVar33 = (byte)(uVar12 >> 0x18);
        bVar34 = (byte)(uVar12 >> 0x20);
        bVar35 = (byte)(uVar12 >> 0x28);
        bVar36 = (byte)(uVar12 >> 0x30);
        bVar37 = (byte)(uVar12 >> 0x38);
        puVar11[-3] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar37 |
                               (byte)((ulong)uVar64 >> 0x38) & bVar29,
                               CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar36 |
                                        (byte)((ulong)uVar64 >> 0x30) & bVar28,
                                        CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar35 |
                                                 (byte)((ulong)uVar64 >> 0x28) & bVar27,
                                                 CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar34 |
                                                          (byte)((ulong)uVar64 >> 0x20) & bVar26,
                                                          CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                   bVar33 | (byte)((ulong)uVar64 >>
                                                                                  0x18) & bVar25,
                                                                   CONCAT12((byte)((ulong)uVar95 >>
                                                                                  0x10) & bVar32 |
                                                                            (byte)((ulong)uVar64 >>
                                                                                  0x10) & bVar24,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar95 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar64 >> 8) & bVar23,
                                                  (byte)uVar95 & bVar30 | (byte)uVar64 & bVar22)))))
                                       ));
        puVar11[-4] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar37 |
                               (byte)((ulong)uVar20 >> 0x38) & bVar29,
                               CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar36 |
                                        (byte)((ulong)uVar20 >> 0x30) & bVar28,
                                        CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar35 |
                                                 (byte)((ulong)uVar20 >> 0x28) & bVar27,
                                                 CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar34 |
                                                          (byte)((ulong)uVar20 >> 0x20) & bVar26,
                                                          CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                   bVar33 | (byte)((ulong)uVar20 >>
                                                                                  0x18) & bVar25,
                                                                   CONCAT12((byte)((ulong)uVar94 >>
                                                                                  0x10) & bVar32 |
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x10) & bVar24,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar94 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar20 >> 8) & bVar23,
                                                  (byte)uVar94 & bVar30 | (byte)uVar20 & bVar22)))))
                                       ));
        puVar11[-1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar37 |
                               (byte)((ulong)uVar82 >> 0x38) & bVar29,
                               CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar36 |
                                        (byte)((ulong)uVar82 >> 0x30) & bVar28,
                                        CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar35 |
                                                 (byte)((ulong)uVar82 >> 0x28) & bVar27,
                                                 CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar34 |
                                                          (byte)((ulong)uVar82 >> 0x20) & bVar26,
                                                          CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                   bVar33 | (byte)((ulong)uVar82 >>
                                                                                  0x18) & bVar25,
                                                                   CONCAT12((byte)((ulong)uVar97 >>
                                                                                  0x10) & bVar32 |
                                                                            (byte)((ulong)uVar82 >>
                                                                                  0x10) & bVar24,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar97 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar82 >> 8) & bVar23,
                                                  (byte)uVar97 & bVar30 | (byte)uVar82 & bVar22)))))
                                       ));
        puVar11[-2] = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar37 |
                               (byte)((ulong)uVar73 >> 0x38) & bVar29,
                               CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar36 |
                                        (byte)((ulong)uVar73 >> 0x30) & bVar28,
                                        CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar35 |
                                                 (byte)((ulong)uVar73 >> 0x28) & bVar27,
                                                 CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar34 |
                                                          (byte)((ulong)uVar73 >> 0x20) & bVar26,
                                                          CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                   bVar33 | (byte)((ulong)uVar73 >>
                                                                                  0x18) & bVar25,
                                                                   CONCAT12((byte)((ulong)uVar96 >>
                                                                                  0x10) & bVar32 |
                                                                            (byte)((ulong)uVar73 >>
                                                                                  0x10) & bVar24,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar96 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar73 >> 8) & bVar23,
                                                  (byte)uVar96 & bVar30 | (byte)uVar73 & bVar22)))))
                                       ));
        puVar11[1] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar37 |
                              (byte)((ulong)uVar91 >> 0x38) & bVar29,
                              CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar36 |
                                       (byte)((ulong)uVar91 >> 0x30) & bVar28,
                                       CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar35 |
                                                (byte)((ulong)uVar91 >> 0x28) & bVar27,
                                                CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar34 |
                                                         (byte)((ulong)uVar91 >> 0x20) & bVar26,
                                                         CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                  bVar33 | (byte)((ulong)uVar91 >>
                                                                                 0x18) & bVar25,
                                                                  CONCAT12((byte)((ulong)uVar99 >>
                                                                                 0x10) & bVar32 |
                                                                           (byte)((ulong)uVar91 >>
                                                                                 0x10) & bVar24,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar23,
                                                  (byte)uVar99 & bVar30 | (byte)uVar91 & bVar22)))))
                                      ));
        *puVar11 = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar37 |
                            (byte)((ulong)uVar90 >> 0x38) & bVar29,
                            CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar36 |
                                     (byte)((ulong)uVar90 >> 0x30) & bVar28,
                                     CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar35 |
                                              (byte)((ulong)uVar90 >> 0x28) & bVar27,
                                              CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar34 |
                                                       (byte)((ulong)uVar90 >> 0x20) & bVar26,
                                                       CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                bVar33 | (byte)((ulong)uVar90 >>
                                                                               0x18) & bVar25,
                                                                CONCAT12((byte)((ulong)uVar98 >>
                                                                               0x10) & bVar32 |
                                                                         (byte)((ulong)uVar90 >>
                                                                               0x10) & bVar24,
                                                                         CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar90 >> 8) & bVar23,
                                                  (byte)uVar98 & bVar30 | (byte)uVar90 & bVar22)))))
                                    ));
        puVar11[3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar37 |
                              (byte)((ulong)uVar93 >> 0x38) & bVar29,
                              CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar36 |
                                       (byte)((ulong)uVar93 >> 0x30) & bVar28,
                                       CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar35 |
                                                (byte)((ulong)uVar93 >> 0x28) & bVar27,
                                                CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar34 |
                                                         (byte)((ulong)uVar93 >> 0x20) & bVar26,
                                                         CONCAT13((byte)((ulong)uVar101 >> 0x18) &
                                                                  bVar33 | (byte)((ulong)uVar93 >>
                                                                                 0x18) & bVar25,
                                                                  CONCAT12((byte)((ulong)uVar101 >>
                                                                                 0x10) & bVar32 |
                                                                           (byte)((ulong)uVar93 >>
                                                                                 0x10) & bVar24,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar101 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar23,
                                                  (byte)uVar101 & bVar30 | (byte)uVar93 & bVar22))))
                                               )));
        puVar11[2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar37 |
                              (byte)((ulong)uVar92 >> 0x38) & bVar29,
                              CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar36 |
                                       (byte)((ulong)uVar92 >> 0x30) & bVar28,
                                       CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar35 |
                                                (byte)((ulong)uVar92 >> 0x28) & bVar27,
                                                CONCAT14((byte)((ulong)uVar100 >> 0x20) & bVar34 |
                                                         (byte)((ulong)uVar92 >> 0x20) & bVar26,
                                                         CONCAT13((byte)((ulong)uVar100 >> 0x18) &
                                                                  bVar33 | (byte)((ulong)uVar92 >>
                                                                                 0x18) & bVar25,
                                                                  CONCAT12((byte)((ulong)uVar100 >>
                                                                                 0x10) & bVar32 |
                                                                           (byte)((ulong)uVar92 >>
                                                                                 0x10) & bVar24,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar100 >> 8) & bVar31 |
                                                  (byte)((ulong)uVar92 >> 8) & bVar23,
                                                  (byte)uVar100 & bVar30 | (byte)uVar92 & bVar22))))
                                               )));
        uVar14 = uVar14 - 8;
        puVar11 = puVar11 + 8;
        puVar15 = puVar15 + 8;
      } while (uVar14 != 0);
      if (uVar13 == uVar8) goto LAB_002c6f6c;
    }
    lVar7 = uVar8 - uVar13;
    puVar10 = (ulong *)(&uStack00000000000000e0 + uVar13 * 8);
    puVar16 = (ulong *)(unaff_x29 + -0x98 + uVar13 * 8);
    do {
      *puVar10 = *puVar10 & uVar12 | *puVar16 & uVar9;
      lVar7 = lVar7 + -1;
      puVar10 = puVar10 + 1;
      puVar16 = puVar16 + 1;
    } while (lVar7 != 0);
  }
LAB_002c6f6c:
  uVar1 = *(uint *)(unaff_x21 + 0x148);
  uVar8 = (ulong)uVar1;
  if ((int)uVar1 < 1) {
    return 1;
  }
  if (uVar1 < 8) {
    uVar12 = 0;
    uVar9 = 0;
LAB_002c6ff4:
    lVar7 = uVar8 - uVar12;
    puVar10 = (ulong *)(&uStack00000000000000e0 + uVar12 * 8);
    do {
      uVar9 = *puVar10 | uVar9;
      lVar7 = lVar7 + -1;
      puVar10 = puVar10 + 1;
    } while (lVar7 != 0);
  }
  else {
    uVar12 = uVar8 & 0xfffffff8;
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
    bVar53 = 0;
    bVar54 = 0;
    uVar20 = 0;
    uVar64 = 0;
    uVar73 = 0;
    uVar82 = 0;
    puVar11 = &uStack0000000000000100;
    uVar9 = uVar12;
    do {
      uVar91 = puVar11[-3];
      uVar90 = puVar11[-4];
      uVar93 = puVar11[-1];
      uVar92 = puVar11[-2];
      uVar95 = puVar11[1];
      uVar94 = *puVar11;
      uVar97 = puVar11[3];
      uVar96 = puVar11[2];
      bVar22 = (byte)uVar90 | bVar22;
      bVar23 = (byte)((ulong)uVar90 >> 8) | bVar23;
      bVar24 = (byte)((ulong)uVar90 >> 0x10) | bVar24;
      bVar25 = (byte)((ulong)uVar90 >> 0x18) | bVar25;
      bVar26 = (byte)((ulong)uVar90 >> 0x20) | bVar26;
      bVar27 = (byte)((ulong)uVar90 >> 0x28) | bVar27;
      bVar28 = (byte)((ulong)uVar90 >> 0x30) | bVar28;
      bVar29 = (byte)((ulong)uVar90 >> 0x38) | bVar29;
      bVar30 = (byte)uVar91 | bVar30;
      bVar31 = (byte)((ulong)uVar91 >> 8) | bVar31;
      bVar32 = (byte)((ulong)uVar91 >> 0x10) | bVar32;
      bVar33 = (byte)((ulong)uVar91 >> 0x18) | bVar33;
      bVar34 = (byte)((ulong)uVar91 >> 0x20) | bVar34;
      bVar35 = (byte)((ulong)uVar91 >> 0x28) | bVar35;
      bVar36 = (byte)((ulong)uVar91 >> 0x30) | bVar36;
      bVar37 = (byte)((ulong)uVar91 >> 0x38) | bVar37;
      bVar38 = (byte)uVar92 | bVar38;
      bVar40 = (byte)((ulong)uVar92 >> 8) | bVar40;
      bVar41 = (byte)((ulong)uVar92 >> 0x10) | bVar41;
      bVar42 = (byte)((ulong)uVar92 >> 0x18) | bVar42;
      bVar43 = (byte)((ulong)uVar92 >> 0x20) | bVar43;
      bVar44 = (byte)((ulong)uVar92 >> 0x28) | bVar44;
      bVar45 = (byte)((ulong)uVar92 >> 0x30) | bVar45;
      bVar46 = (byte)((ulong)uVar92 >> 0x38) | bVar46;
      bVar47 = (byte)uVar93 | bVar47;
      bVar48 = (byte)((ulong)uVar93 >> 8) | bVar48;
      bVar49 = (byte)((ulong)uVar93 >> 0x10) | bVar49;
      bVar50 = (byte)((ulong)uVar93 >> 0x18) | bVar50;
      bVar51 = (byte)((ulong)uVar93 >> 0x20) | bVar51;
      bVar52 = (byte)((ulong)uVar93 >> 0x28) | bVar52;
      bVar53 = (byte)((ulong)uVar93 >> 0x30) | bVar53;
      bVar54 = (byte)((ulong)uVar93 >> 0x38) | bVar54;
      bVar55 = (byte)uVar94 | (byte)uVar20;
      bVar56 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar20 >> 8);
      bVar57 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar20 >> 0x10);
      bVar58 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar20 >> 0x18);
      bVar59 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar20 >> 0x20);
      bVar60 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar20 >> 0x28);
      bVar61 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar20 >> 0x30);
      bVar62 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar20 >> 0x38);
      uVar20 = CONCAT17(bVar62,CONCAT16(bVar61,CONCAT15(bVar60,CONCAT14(bVar59,CONCAT13(bVar58,
                                                  CONCAT12(bVar57,CONCAT11(bVar56,bVar55)))))));
      bVar63 = (byte)uVar95 | (byte)uVar64;
      bVar65 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar64 >> 8);
      bVar66 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar64 >> 0x10);
      bVar67 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar64 >> 0x18);
      bVar68 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar64 >> 0x20);
      bVar69 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar64 >> 0x28);
      bVar70 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar64 >> 0x30);
      bVar71 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar64 >> 0x38);
      uVar64 = CONCAT17(bVar71,CONCAT16(bVar70,CONCAT15(bVar69,CONCAT14(bVar68,CONCAT13(bVar67,
                                                  CONCAT12(bVar66,CONCAT11(bVar65,bVar63)))))));
      bVar72 = (byte)uVar96 | (byte)uVar73;
      bVar74 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar73 >> 8);
      bVar75 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar73 >> 0x10);
      bVar76 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar73 >> 0x18);
      bVar77 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar73 >> 0x20);
      bVar78 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar73 >> 0x28);
      bVar79 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar73 >> 0x30);
      bVar80 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar73 >> 0x38);
      uVar73 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(bVar76,
                                                  CONCAT12(bVar75,CONCAT11(bVar74,bVar72)))))));
      bVar81 = (byte)uVar97 | (byte)uVar82;
      bVar83 = (byte)((ulong)uVar97 >> 8) | (byte)((ulong)uVar82 >> 8);
      bVar84 = (byte)((ulong)uVar97 >> 0x10) | (byte)((ulong)uVar82 >> 0x10);
      bVar85 = (byte)((ulong)uVar97 >> 0x18) | (byte)((ulong)uVar82 >> 0x18);
      bVar86 = (byte)((ulong)uVar97 >> 0x20) | (byte)((ulong)uVar82 >> 0x20);
      bVar87 = (byte)((ulong)uVar97 >> 0x28) | (byte)((ulong)uVar82 >> 0x28);
      bVar88 = (byte)((ulong)uVar97 >> 0x30) | (byte)((ulong)uVar82 >> 0x30);
      bVar89 = (byte)((ulong)uVar97 >> 0x38) | (byte)((ulong)uVar82 >> 0x38);
      uVar82 = CONCAT17(bVar89,CONCAT16(bVar88,CONCAT15(bVar87,CONCAT14(bVar86,CONCAT13(bVar85,
                                                  CONCAT12(bVar84,CONCAT11(bVar83,bVar81)))))));
      uVar9 = uVar9 - 8;
      puVar11 = puVar11 + 8;
    } while (uVar9 != 0);
    bVar72 = bVar72 | bVar55 | bVar38 | bVar22;
    bVar74 = bVar74 | bVar56 | bVar40 | bVar23;
    bVar75 = bVar75 | bVar57 | bVar41 | bVar24;
    bVar76 = bVar76 | bVar58 | bVar42 | bVar25;
    bVar77 = bVar77 | bVar59 | bVar43 | bVar26;
    bVar78 = bVar78 | bVar60 | bVar44 | bVar27;
    bVar79 = bVar79 | bVar61 | bVar45 | bVar28;
    bVar80 = bVar80 | bVar62 | bVar46 | bVar29;
    bVar81 = bVar81 | bVar63 | bVar47 | bVar30;
    bVar83 = bVar83 | bVar65 | bVar48 | bVar31;
    bVar84 = bVar84 | bVar66 | bVar49 | bVar32;
    bVar85 = bVar85 | bVar67 | bVar50 | bVar33;
    bVar86 = bVar86 | bVar68 | bVar51 | bVar34;
    bVar87 = bVar87 | bVar69 | bVar52 | bVar35;
    bVar88 = bVar88 | bVar70 | bVar53 | bVar36;
    bVar89 = bVar89 | bVar71 | bVar54 | bVar37;
    auVar4[1] = bVar74;
    auVar4[0] = bVar72;
    auVar4[2] = bVar75;
    auVar4[3] = bVar76;
    auVar4[4] = bVar77;
    auVar4[5] = bVar78;
    auVar4[6] = bVar79;
    auVar4[7] = bVar80;
    auVar4[8] = bVar81;
    auVar4[9] = bVar83;
    auVar4[10] = bVar84;
    auVar4[0xb] = bVar85;
    auVar4[0xc] = bVar86;
    auVar4[0xd] = bVar87;
    auVar4[0xe] = bVar88;
    auVar4[0xf] = bVar89;
    auVar5[1] = bVar74;
    auVar5[0] = bVar72;
    auVar5[2] = bVar75;
    auVar5[3] = bVar76;
    auVar5[4] = bVar77;
    auVar5[5] = bVar78;
    auVar5[6] = bVar79;
    auVar5[7] = bVar80;
    auVar5[8] = bVar81;
    auVar5[9] = bVar83;
    auVar5[10] = bVar84;
    auVar5[0xb] = bVar85;
    auVar5[0xc] = bVar86;
    auVar5[0xd] = bVar87;
    auVar5[0xe] = bVar88;
    auVar5[0xf] = bVar89;
    auVar39 = NEON_ext(auVar4,auVar5,8,1);
    uVar9 = CONCAT17(bVar80 | auVar39[7],
                     CONCAT16(bVar79 | auVar39[6],
                              CONCAT15(bVar78 | auVar39[5],
                                       CONCAT14(bVar77 | auVar39[4],
                                                CONCAT13(bVar76 | auVar39[3],
                                                         CONCAT12(bVar75 | auVar39[2],
                                                                  CONCAT11(bVar74 | auVar39[1],
                                                                           bVar72 | auVar39[0]))))))
                    );
    if (uVar12 != uVar8) goto LAB_002c6ff4;
  }
  if (uVar1 < 4) {
    uVar14 = 0;
    uVar12 = 0;
LAB_002c7078:
    lVar7 = uVar8 - uVar14;
    puVar10 = (ulong *)(unaff_x20 + uVar14 * 8 + 0x90);
    do {
      uVar12 = *puVar10 | uVar12;
      lVar7 = lVar7 + -1;
      puVar10 = puVar10 + 1;
    } while (lVar7 != 0);
  }
  else {
    uVar17 = 0;
    uVar19 = 0;
    uVar13 = 0;
    uVar18 = 0;
    uVar14 = uVar8 & 0xfffffffc;
    puVar10 = (ulong *)(unaff_x20 + 0xa8);
    uVar12 = uVar14;
    do {
      uVar17 = puVar10[-3] | uVar17;
      uVar19 = puVar10[-2] | uVar19;
      uVar13 = puVar10[-1] | uVar13;
      uVar18 = *puVar10 | uVar18;
      puVar10 = puVar10 + 4;
      uVar12 = uVar12 - 4;
    } while (uVar12 != 0);
    uVar12 = uVar18 | uVar13 | uVar19 | uVar17;
    if (uVar14 != uVar8) goto LAB_002c7078;
  }
  if (uVar1 < 8) {
    uVar14 = 0;
    uVar13 = 0;
  }
  else {
    uVar14 = uVar8 & 0xfffffff8;
    puVar11 = (undefined8 *)(unaff_x19 + 0xc0);
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
    bVar53 = 0;
    bVar54 = 0;
    uVar20 = 0;
    uVar64 = 0;
    uVar73 = 0;
    uVar82 = 0;
    uVar13 = uVar14;
    do {
      uVar91 = puVar11[-5];
      uVar90 = puVar11[-6];
      uVar93 = puVar11[-3];
      uVar92 = puVar11[-4];
      uVar95 = puVar11[-1];
      uVar94 = puVar11[-2];
      uVar97 = puVar11[1];
      uVar96 = *puVar11;
      bVar22 = (byte)uVar90 | bVar22;
      bVar23 = (byte)((ulong)uVar90 >> 8) | bVar23;
      bVar24 = (byte)((ulong)uVar90 >> 0x10) | bVar24;
      bVar25 = (byte)((ulong)uVar90 >> 0x18) | bVar25;
      bVar26 = (byte)((ulong)uVar90 >> 0x20) | bVar26;
      bVar27 = (byte)((ulong)uVar90 >> 0x28) | bVar27;
      bVar28 = (byte)((ulong)uVar90 >> 0x30) | bVar28;
      bVar29 = (byte)((ulong)uVar90 >> 0x38) | bVar29;
      bVar30 = (byte)uVar91 | bVar30;
      bVar31 = (byte)((ulong)uVar91 >> 8) | bVar31;
      bVar32 = (byte)((ulong)uVar91 >> 0x10) | bVar32;
      bVar33 = (byte)((ulong)uVar91 >> 0x18) | bVar33;
      bVar34 = (byte)((ulong)uVar91 >> 0x20) | bVar34;
      bVar35 = (byte)((ulong)uVar91 >> 0x28) | bVar35;
      bVar36 = (byte)((ulong)uVar91 >> 0x30) | bVar36;
      bVar37 = (byte)((ulong)uVar91 >> 0x38) | bVar37;
      bVar38 = (byte)uVar92 | bVar38;
      bVar40 = (byte)((ulong)uVar92 >> 8) | bVar40;
      bVar41 = (byte)((ulong)uVar92 >> 0x10) | bVar41;
      bVar42 = (byte)((ulong)uVar92 >> 0x18) | bVar42;
      bVar43 = (byte)((ulong)uVar92 >> 0x20) | bVar43;
      bVar44 = (byte)((ulong)uVar92 >> 0x28) | bVar44;
      bVar45 = (byte)((ulong)uVar92 >> 0x30) | bVar45;
      bVar46 = (byte)((ulong)uVar92 >> 0x38) | bVar46;
      bVar47 = (byte)uVar93 | bVar47;
      bVar48 = (byte)((ulong)uVar93 >> 8) | bVar48;
      bVar49 = (byte)((ulong)uVar93 >> 0x10) | bVar49;
      bVar50 = (byte)((ulong)uVar93 >> 0x18) | bVar50;
      bVar51 = (byte)((ulong)uVar93 >> 0x20) | bVar51;
      bVar52 = (byte)((ulong)uVar93 >> 0x28) | bVar52;
      bVar53 = (byte)((ulong)uVar93 >> 0x30) | bVar53;
      bVar54 = (byte)((ulong)uVar93 >> 0x38) | bVar54;
      bVar55 = (byte)uVar94 | (byte)uVar20;
      bVar56 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar20 >> 8);
      bVar57 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar20 >> 0x10);
      bVar58 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar20 >> 0x18);
      bVar59 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar20 >> 0x20);
      bVar60 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar20 >> 0x28);
      bVar61 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar20 >> 0x30);
      bVar62 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar20 >> 0x38);
      uVar20 = CONCAT17(bVar62,CONCAT16(bVar61,CONCAT15(bVar60,CONCAT14(bVar59,CONCAT13(bVar58,
                                                  CONCAT12(bVar57,CONCAT11(bVar56,bVar55)))))));
      bVar63 = (byte)uVar95 | (byte)uVar64;
      bVar65 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar64 >> 8);
      bVar66 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar64 >> 0x10);
      bVar67 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar64 >> 0x18);
      bVar68 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar64 >> 0x20);
      bVar69 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar64 >> 0x28);
      bVar70 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar64 >> 0x30);
      bVar71 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar64 >> 0x38);
      uVar64 = CONCAT17(bVar71,CONCAT16(bVar70,CONCAT15(bVar69,CONCAT14(bVar68,CONCAT13(bVar67,
                                                  CONCAT12(bVar66,CONCAT11(bVar65,bVar63)))))));
      bVar72 = (byte)uVar96 | (byte)uVar73;
      bVar74 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar73 >> 8);
      bVar75 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar73 >> 0x10);
      bVar76 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar73 >> 0x18);
      bVar77 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar73 >> 0x20);
      bVar78 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar73 >> 0x28);
      bVar79 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar73 >> 0x30);
      bVar80 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar73 >> 0x38);
      uVar73 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(bVar76,
                                                  CONCAT12(bVar75,CONCAT11(bVar74,bVar72)))))));
      bVar81 = (byte)uVar97 | (byte)uVar82;
      bVar83 = (byte)((ulong)uVar97 >> 8) | (byte)((ulong)uVar82 >> 8);
      bVar84 = (byte)((ulong)uVar97 >> 0x10) | (byte)((ulong)uVar82 >> 0x10);
      bVar85 = (byte)((ulong)uVar97 >> 0x18) | (byte)((ulong)uVar82 >> 0x18);
      bVar86 = (byte)((ulong)uVar97 >> 0x20) | (byte)((ulong)uVar82 >> 0x20);
      bVar87 = (byte)((ulong)uVar97 >> 0x28) | (byte)((ulong)uVar82 >> 0x28);
      bVar88 = (byte)((ulong)uVar97 >> 0x30) | (byte)((ulong)uVar82 >> 0x30);
      bVar89 = (byte)((ulong)uVar97 >> 0x38) | (byte)((ulong)uVar82 >> 0x38);
      uVar82 = CONCAT17(bVar89,CONCAT16(bVar88,CONCAT15(bVar87,CONCAT14(bVar86,CONCAT13(bVar85,
                                                  CONCAT12(bVar84,CONCAT11(bVar83,bVar81)))))));
      puVar11 = puVar11 + 8;
      uVar13 = uVar13 - 8;
    } while (uVar13 != 0);
    bVar72 = bVar72 | bVar55 | bVar38 | bVar22;
    bVar74 = bVar74 | bVar56 | bVar40 | bVar23;
    bVar75 = bVar75 | bVar57 | bVar41 | bVar24;
    bVar76 = bVar76 | bVar58 | bVar42 | bVar25;
    bVar77 = bVar77 | bVar59 | bVar43 | bVar26;
    bVar78 = bVar78 | bVar60 | bVar44 | bVar27;
    bVar79 = bVar79 | bVar61 | bVar45 | bVar28;
    bVar80 = bVar80 | bVar62 | bVar46 | bVar29;
    bVar81 = bVar81 | bVar63 | bVar47 | bVar30;
    bVar83 = bVar83 | bVar65 | bVar48 | bVar31;
    bVar84 = bVar84 | bVar66 | bVar49 | bVar32;
    bVar85 = bVar85 | bVar67 | bVar50 | bVar33;
    bVar86 = bVar86 | bVar68 | bVar51 | bVar34;
    bVar87 = bVar87 | bVar69 | bVar52 | bVar35;
    bVar88 = bVar88 | bVar70 | bVar53 | bVar36;
    bVar89 = bVar89 | bVar71 | bVar54 | bVar37;
    auVar2[1] = bVar74;
    auVar2[0] = bVar72;
    auVar2[2] = bVar75;
    auVar2[3] = bVar76;
    auVar2[4] = bVar77;
    auVar2[5] = bVar78;
    auVar2[6] = bVar79;
    auVar2[7] = bVar80;
    auVar2[8] = bVar81;
    auVar2[9] = bVar83;
    auVar2[10] = bVar84;
    auVar2[0xb] = bVar85;
    auVar2[0xc] = bVar86;
    auVar2[0xd] = bVar87;
    auVar2[0xe] = bVar88;
    auVar2[0xf] = bVar89;
    auVar3[1] = bVar74;
    auVar3[0] = bVar72;
    auVar3[2] = bVar75;
    auVar3[3] = bVar76;
    auVar3[4] = bVar77;
    auVar3[5] = bVar78;
    auVar3[6] = bVar79;
    auVar3[7] = bVar80;
    auVar3[8] = bVar81;
    auVar3[9] = bVar83;
    auVar3[10] = bVar84;
    auVar3[0xb] = bVar85;
    auVar3[0xc] = bVar86;
    auVar3[0xd] = bVar87;
    auVar3[0xe] = bVar88;
    auVar3[0xf] = bVar89;
    auVar39 = NEON_ext(auVar2,auVar3,8,1);
    uVar13 = CONCAT17(bVar80 | auVar39[7],
                      CONCAT16(bVar79 | auVar39[6],
                               CONCAT15(bVar78 | auVar39[5],
                                        CONCAT14(bVar77 | auVar39[4],
                                                 CONCAT13(bVar76 | auVar39[3],
                                                          CONCAT12(bVar75 | auVar39[2],
                                                                   CONCAT11(bVar74 | auVar39[1],
                                                                            bVar72 | auVar39[0])))))
                              ));
    if (uVar14 == uVar8) goto LAB_002c7124;
  }
  lVar7 = uVar8 - uVar14;
  puVar10 = (ulong *)(unaff_x19 + uVar14 * 8 + 0x90);
  do {
    uVar13 = *puVar10 | uVar13;
    lVar7 = lVar7 + -1;
    puVar10 = puVar10 + 1;
  } while (lVar7 != 0);
LAB_002c7124:
  if (uVar9 != 0) {
    bVar21 = 0;
  }
  bVar21 = bVar21 & uVar13 != 0;
  if (uVar12 == 0) {
    bVar21 = ~(uVar13 != 0);
  }
  return bVar21 & 1;
}

