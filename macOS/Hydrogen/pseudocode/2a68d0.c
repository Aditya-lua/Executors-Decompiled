
/* WARNING: Removing unreachable block (ram,0x002a6b74) */

ulong FUN_002a68d0(long param_1,undefined8 param_2,undefined8 param_3,char *param_4,char *param_5,
                  char *param_6)

{
  undefined1 auVar1 [16];
  int iVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  undefined8 *puVar14;
  ulong *puVar15;
  qword *pqVar16;
  char *pcVar17;
  uint uVar18;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  ulong *unaff_x25;
  undefined8 *puVar19;
  uint unaff_w28;
  long unaff_x29;
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
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
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
  byte bVar79;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  qword qVar80;
  undefined8 uVar81;
  byte bVar88;
  undefined8 uVar89;
  qword qVar90;
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
  undefined1 auVar102 [16];
  long in_stack_00000000;
  char *in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000030;
  long in_stack_00000038;
  ulong *in_stack_00000040;
  char *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  ulong *in_stack_00000070;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  while (param_1 != in_stack_00000010) {
    uVar10 = -(*(ulong *)*unaff_x25 & 1) & -(*(ulong *)*in_stack_00000040 & 1);
    lVar4 = func_0x00382cc0(*in_stack_00000068);
    uVar13 = *in_stack_00000040;
    uVar5 = lVar4 - 1U & uVar10;
    uVar3 = *in_stack_00000068;
    bVar20 = (byte)uVar5;
    bVar21 = (byte)(uVar5 >> 8);
    bVar22 = (byte)(uVar5 >> 0x10);
    bVar23 = (byte)(uVar5 >> 0x18);
    bVar24 = (byte)(uVar5 >> 0x20);
    bVar25 = (byte)(uVar5 >> 0x28);
    bVar26 = (byte)(uVar5 >> 0x30);
    bVar27 = (byte)(uVar5 >> 0x38);
    if (unaff_w28 != 0) {
      uVar7 = ~uVar5;
      if ((unaff_w28 < 8) ||
         (uVar13 < uVar3 + in_stack_00000038 && uVar3 < uVar13 + in_stack_00000038)) {
        lVar12 = 0;
      }
      else {
        puVar19 = (undefined8 *)(uVar13 + 0x20);
        puVar14 = (undefined8 *)(uVar3 + 0x20);
        lVar12 = in_stack_00000018;
        do {
          uVar62 = puVar14[-3];
          uVar53 = puVar14[-4];
          uVar81 = puVar14[-1];
          uVar71 = puVar14[-2];
          uVar91 = puVar14[1];
          uVar89 = *puVar14;
          uVar93 = puVar14[3];
          uVar92 = puVar14[2];
          uVar95 = puVar19[-3];
          uVar94 = puVar19[-4];
          uVar97 = puVar19[-1];
          uVar96 = puVar19[-2];
          uVar99 = puVar19[1];
          uVar98 = *puVar19;
          uVar101 = puVar19[3];
          uVar100 = puVar19[2];
          bVar28 = (byte)uVar7;
          bVar29 = (byte)(uVar7 >> 8);
          bVar30 = (byte)(uVar7 >> 0x10);
          bVar31 = (byte)(uVar7 >> 0x18);
          bVar32 = (byte)(uVar7 >> 0x20);
          bVar33 = (byte)(uVar7 >> 0x28);
          bVar34 = (byte)(uVar7 >> 0x30);
          bVar35 = (byte)(uVar7 >> 0x38);
          puVar19[-3] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar35 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar34 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar33 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar32 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar31 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar21,
                                                           (byte)uVar95 & bVar28 |
                                                           (byte)uVar62 & bVar20)))))));
          puVar19[-4] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar35 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar34 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar33 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar32 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar31 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar21,
                                                           (byte)uVar94 & bVar28 |
                                                           (byte)uVar53 & bVar20)))))));
          puVar19[-1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar35 |
                                 (byte)((ulong)uVar81 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar34 |
                                          (byte)((ulong)uVar81 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar33 |
                                                   (byte)((ulong)uVar81 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar32 |
                                                            (byte)((ulong)uVar81 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                     bVar31 | (byte)((ulong)uVar81
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar97
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)((ulong
                                                  )uVar81 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar81 >> 8) & bVar21,
                                                           (byte)uVar97 & bVar28 |
                                                           (byte)uVar81 & bVar20)))))));
          puVar19[-2] = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar35 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar34 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar33 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar32 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                     bVar31 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar96
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar96 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar21,
                                                           (byte)uVar96 & bVar28 |
                                                           (byte)uVar71 & bVar20)))))));
          puVar19[1] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar35 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar34 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar33 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar32 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar31 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar30 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar22,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar29 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar21,
                                                  (byte)uVar99 & bVar28 | (byte)uVar91 & bVar20)))))
                                        ));
          *puVar19 = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar35 |
                              (byte)((ulong)uVar89 >> 0x38) & bVar27,
                              CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar34 |
                                       (byte)((ulong)uVar89 >> 0x30) & bVar26,
                                       CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar33 |
                                                (byte)((ulong)uVar89 >> 0x28) & bVar25,
                                                CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar32 |
                                                         (byte)((ulong)uVar89 >> 0x20) & bVar24,
                                                         CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                  bVar31 | (byte)((ulong)uVar89 >>
                                                                                 0x18) & bVar23,
                                                                  CONCAT12((byte)((ulong)uVar98 >>
                                                                                 0x10) & bVar30 |
                                                                           (byte)((ulong)uVar89 >>
                                                                                 0x10) & bVar22,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar29 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar21,
                                                  (byte)uVar98 & bVar28 | (byte)uVar89 & bVar20)))))
                                      ));
          puVar19[3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar35 |
                                (byte)((ulong)uVar93 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar34 |
                                         (byte)((ulong)uVar93 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar33 |
                                                  (byte)((ulong)uVar93 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar32 |
                                                           (byte)((ulong)uVar93 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar101 >> 0x18) &
                                                                    bVar31 | (byte)((ulong)uVar93 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar101
                                                                                   >> 0x10) & bVar30
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x10) &
                                                                               bVar22,CONCAT11((byte
                                                  )((ulong)uVar101 >> 8) & bVar29 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar21,
                                                  (byte)uVar101 & bVar28 | (byte)uVar93 & bVar20))))
                                                 )));
          puVar19[2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar35 |
                                (byte)((ulong)uVar92 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar34 |
                                         (byte)((ulong)uVar92 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar33 |
                                                  (byte)((ulong)uVar92 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar100 >> 0x20) & bVar32 |
                                                           (byte)((ulong)uVar92 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar100 >> 0x18) &
                                                                    bVar31 | (byte)((ulong)uVar92 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar100
                                                                                   >> 0x10) & bVar30
                                                                             | (byte)((ulong)uVar92
                                                                                     >> 0x10) &
                                                                               bVar22,CONCAT11((byte
                                                  )((ulong)uVar100 >> 8) & bVar29 |
                                                  (byte)((ulong)uVar92 >> 8) & bVar21,
                                                  (byte)uVar100 & bVar28 | (byte)uVar92 & bVar20))))
                                                 )));
          lVar12 = lVar12 + -8;
          puVar19 = puVar19 + 8;
          puVar14 = puVar14 + 8;
        } while (lVar12 != 0);
        lVar12 = in_stack_00000018;
        if (in_stack_00000018 == unaff_x23) goto code_r0x002a6148;
      }
      lVar11 = unaff_x23 - lVar12;
      puVar6 = (ulong *)(uVar13 + lVar12 * 8);
      puVar15 = (ulong *)(uVar3 + lVar12 * 8);
      do {
        *puVar6 = *puVar6 & uVar7 | *puVar15 & uVar5;
        lVar11 = lVar11 + -1;
        puVar6 = puVar6 + 1;
        puVar15 = puVar15 + 1;
      } while (lVar11 != 0);
    }
code_r0x002a6148:
    func_0x00382cc0(uVar3,*unaff_x25);
    uVar10 = uVar10 & -lVar4;
    uVar3 = *in_stack_00000068;
    bVar28 = (byte)uVar10;
    bVar29 = (byte)(uVar10 >> 8);
    bVar30 = (byte)(uVar10 >> 0x10);
    bVar31 = (byte)(uVar10 >> 0x18);
    bVar32 = (byte)(uVar10 >> 0x20);
    bVar33 = (byte)(uVar10 >> 0x28);
    bVar34 = (byte)(uVar10 >> 0x30);
    bVar35 = (byte)(uVar10 >> 0x38);
    if ((int)unaff_x23 != 0) {
      uVar7 = *unaff_x25;
      uVar13 = ~uVar10;
      if ((unaff_w28 < 8) ||
         ((uVar7 < uVar3 + in_stack_00000038 && (uVar3 < uVar7 + in_stack_00000038)))) {
        lVar4 = 0;
      }
      else {
        puVar19 = (undefined8 *)(uVar7 + 0x20);
        puVar14 = (undefined8 *)(uVar3 + 0x20);
        lVar4 = in_stack_00000018;
        do {
          uVar62 = puVar14[-3];
          uVar53 = puVar14[-4];
          uVar81 = puVar14[-1];
          uVar71 = puVar14[-2];
          uVar91 = puVar14[1];
          uVar89 = *puVar14;
          uVar93 = puVar14[3];
          uVar92 = puVar14[2];
          uVar95 = puVar19[-3];
          uVar94 = puVar19[-4];
          uVar97 = puVar19[-1];
          uVar96 = puVar19[-2];
          uVar99 = puVar19[1];
          uVar98 = *puVar19;
          uVar101 = puVar19[3];
          uVar100 = puVar19[2];
          bVar36 = (byte)uVar13;
          bVar37 = (byte)(uVar13 >> 8);
          bVar38 = (byte)(uVar13 >> 0x10);
          bVar39 = (byte)(uVar13 >> 0x18);
          bVar40 = (byte)(uVar13 >> 0x20);
          bVar41 = (byte)(uVar13 >> 0x28);
          bVar42 = (byte)(uVar13 >> 0x30);
          bVar43 = (byte)(uVar13 >> 0x38);
          puVar19[-3] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar43 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar42 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar41 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar40 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar39 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar29,
                                                           (byte)uVar95 & bVar36 |
                                                           (byte)uVar62 & bVar28)))))));
          puVar19[-4] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar43 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar42 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar41 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar40 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar39 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar29,
                                                           (byte)uVar94 & bVar36 |
                                                           (byte)uVar53 & bVar28)))))));
          puVar19[-1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar43 |
                                 (byte)((ulong)uVar81 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar42 |
                                          (byte)((ulong)uVar81 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar41 |
                                                   (byte)((ulong)uVar81 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar40 |
                                                            (byte)((ulong)uVar81 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                     bVar39 | (byte)((ulong)uVar81
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar97
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)((ulong
                                                  )uVar81 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar81 >> 8) & bVar29,
                                                           (byte)uVar97 & bVar36 |
                                                           (byte)uVar81 & bVar28)))))));
          puVar19[-2] = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar43 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar42 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar41 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar40 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                     bVar39 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar96
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar96 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar29,
                                                           (byte)uVar96 & bVar36 |
                                                           (byte)uVar71 & bVar28)))))));
          puVar19[1] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar43 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar42 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar41 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar40 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar39 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar38 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar30,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar37 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar29,
                                                  (byte)uVar99 & bVar36 | (byte)uVar91 & bVar28)))))
                                        ));
          *puVar19 = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar43 |
                              (byte)((ulong)uVar89 >> 0x38) & bVar35,
                              CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar42 |
                                       (byte)((ulong)uVar89 >> 0x30) & bVar34,
                                       CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar41 |
                                                (byte)((ulong)uVar89 >> 0x28) & bVar33,
                                                CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar40 |
                                                         (byte)((ulong)uVar89 >> 0x20) & bVar32,
                                                         CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                  bVar39 | (byte)((ulong)uVar89 >>
                                                                                 0x18) & bVar31,
                                                                  CONCAT12((byte)((ulong)uVar98 >>
                                                                                 0x10) & bVar38 |
                                                                           (byte)((ulong)uVar89 >>
                                                                                 0x10) & bVar30,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar37 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar29,
                                                  (byte)uVar98 & bVar36 | (byte)uVar89 & bVar28)))))
                                      ));
          puVar19[3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar43 |
                                (byte)((ulong)uVar93 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar42 |
                                         (byte)((ulong)uVar93 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar41 |
                                                  (byte)((ulong)uVar93 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar40 |
                                                           (byte)((ulong)uVar93 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar101 >> 0x18) &
                                                                    bVar39 | (byte)((ulong)uVar93 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar101
                                                                                   >> 0x10) & bVar38
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x10) &
                                                                               bVar30,CONCAT11((byte
                                                  )((ulong)uVar101 >> 8) & bVar37 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar29,
                                                  (byte)uVar101 & bVar36 | (byte)uVar93 & bVar28))))
                                                 )));
          puVar19[2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar43 |
                                (byte)((ulong)uVar92 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar42 |
                                         (byte)((ulong)uVar92 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar41 |
                                                  (byte)((ulong)uVar92 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar100 >> 0x20) & bVar40 |
                                                           (byte)((ulong)uVar92 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar100 >> 0x18) &
                                                                    bVar39 | (byte)((ulong)uVar92 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar100
                                                                                   >> 0x10) & bVar38
                                                                             | (byte)((ulong)uVar92
                                                                                     >> 0x10) &
                                                                               bVar30,CONCAT11((byte
                                                  )((ulong)uVar100 >> 8) & bVar37 |
                                                  (byte)((ulong)uVar92 >> 8) & bVar29,
                                                  (byte)uVar100 & bVar36 | (byte)uVar92 & bVar28))))
                                                 )));
          lVar4 = lVar4 + -8;
          puVar19 = puVar19 + 8;
          puVar14 = puVar14 + 8;
        } while (lVar4 != 0);
        lVar4 = in_stack_00000018;
        if (in_stack_00000018 == unaff_x23) goto code_r0x002a61dc;
      }
      lVar12 = unaff_x23 - lVar4;
      puVar6 = (ulong *)(uVar7 + lVar4 * 8);
      puVar15 = (ulong *)(uVar3 + lVar4 * 8);
      do {
        *puVar6 = *puVar6 & uVar13 | *puVar15 & uVar10;
        lVar12 = lVar12 + -1;
        puVar6 = puVar6 + 1;
        puVar15 = puVar15 + 1;
      } while (lVar12 != 0);
    }
code_r0x002a61dc:
    lVar4 = func_0x00382c70(uVar3,**(undefined8 **)(unaff_x29 + -0x58),*in_stack_00000070);
    lVar12 = func_0x00382cc0(*in_stack_00000060,*in_stack_00000068,*unaff_x22);
    uVar13 = lVar4 - lVar12;
    uVar3 = *in_stack_00000068;
    bVar36 = (byte)uVar13;
    bVar37 = (byte)(uVar13 >> 8);
    bVar38 = (byte)(uVar13 >> 0x10);
    bVar39 = (byte)(uVar13 >> 0x18);
    bVar40 = (byte)(uVar13 >> 0x20);
    bVar41 = (byte)(uVar13 >> 0x28);
    bVar42 = (byte)(uVar13 >> 0x30);
    bVar43 = (byte)(uVar13 >> 0x38);
    if (unaff_w28 != 0) {
      uVar8 = *in_stack_00000060;
      uVar7 = ~uVar13;
      if ((unaff_w28 < 8) ||
         ((uVar3 < uVar8 + in_stack_00000038 && (uVar8 < uVar3 + in_stack_00000038)))) {
        lVar4 = 0;
code_r0x002a6260:
        lVar12 = unaff_x23 - lVar4;
        puVar6 = (ulong *)(uVar8 + lVar4 * 8);
        puVar15 = (ulong *)(uVar3 + lVar4 * 8);
        do {
          *puVar15 = *puVar6 & uVar7 | *puVar15 & uVar13;
          lVar12 = lVar12 + -1;
          puVar6 = puVar6 + 1;
          puVar15 = puVar15 + 1;
        } while (lVar12 != 0);
      }
      else {
        puVar19 = (undefined8 *)(uVar8 + 0x20);
        puVar14 = (undefined8 *)(uVar3 + 0x20);
        lVar4 = in_stack_00000018;
        do {
          uVar62 = puVar14[-3];
          uVar53 = puVar14[-4];
          uVar81 = puVar14[-1];
          uVar71 = puVar14[-2];
          uVar91 = puVar14[1];
          uVar89 = *puVar14;
          uVar93 = puVar14[3];
          uVar92 = puVar14[2];
          uVar95 = puVar19[-3];
          uVar94 = puVar19[-4];
          uVar97 = puVar19[-1];
          uVar96 = puVar19[-2];
          uVar99 = puVar19[1];
          uVar98 = *puVar19;
          uVar101 = puVar19[3];
          uVar100 = puVar19[2];
          bVar44 = (byte)uVar7;
          bVar45 = (byte)(uVar7 >> 8);
          bVar46 = (byte)(uVar7 >> 0x10);
          bVar47 = (byte)(uVar7 >> 0x18);
          bVar48 = (byte)(uVar7 >> 0x20);
          bVar49 = (byte)(uVar7 >> 0x28);
          bVar50 = (byte)(uVar7 >> 0x30);
          bVar51 = (byte)(uVar7 >> 0x38);
          puVar14[-3] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar39,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar37,
                                                           (byte)uVar95 & bVar44 |
                                                           (byte)uVar62 & bVar36)))))));
          puVar14[-4] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar39,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar37,
                                                           (byte)uVar94 & bVar44 |
                                                           (byte)uVar53 & bVar36)))))));
          puVar14[-1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar81 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar81 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar81 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar81 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar81
                                                                                    >> 0x18) &
                                                                              bVar39,
                                                                     CONCAT12((byte)((ulong)uVar97
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar81 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar81 >> 8) & bVar37,
                                                           (byte)uVar97 & bVar44 |
                                                           (byte)uVar81 & bVar36)))))));
          puVar14[-2] = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar39,
                                                                     CONCAT12((byte)((ulong)uVar96
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar96 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar37,
                                                           (byte)uVar96 & bVar44 |
                                                           (byte)uVar71 & bVar36)))))));
          puVar14[1] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar43,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar42,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar41,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar40,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar39,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar46 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar38,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar37,
                                                  (byte)uVar99 & bVar44 | (byte)uVar91 & bVar36)))))
                                        ));
          *puVar14 = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar51 |
                              (byte)((ulong)uVar89 >> 0x38) & bVar43,
                              CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar50 |
                                       (byte)((ulong)uVar89 >> 0x30) & bVar42,
                                       CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar49 |
                                                (byte)((ulong)uVar89 >> 0x28) & bVar41,
                                                CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar48 |
                                                         (byte)((ulong)uVar89 >> 0x20) & bVar40,
                                                         CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                  bVar47 | (byte)((ulong)uVar89 >>
                                                                                 0x18) & bVar39,
                                                                  CONCAT12((byte)((ulong)uVar98 >>
                                                                                 0x10) & bVar46 |
                                                                           (byte)((ulong)uVar89 >>
                                                                                 0x10) & bVar38,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar37,
                                                  (byte)uVar98 & bVar44 | (byte)uVar89 & bVar36)))))
                                      ));
          puVar14[3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar93 >> 0x38) & bVar43,
                                CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar93 >> 0x30) & bVar42,
                                         CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar93 >> 0x28) & bVar41,
                                                  CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar93 >> 0x20) & bVar40,
                                                           CONCAT13((byte)((ulong)uVar101 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar93 >>
                                                                                   0x18) & bVar39,
                                                                    CONCAT12((byte)((ulong)uVar101
                                                                                   >> 0x10) & bVar46
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x10) &
                                                                               bVar38,CONCAT11((byte
                                                  )((ulong)uVar101 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar37,
                                                  (byte)uVar101 & bVar44 | (byte)uVar93 & bVar36))))
                                                 )));
          puVar14[2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar92 >> 0x38) & bVar43,
                                CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar92 >> 0x30) & bVar42,
                                         CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar92 >> 0x28) & bVar41,
                                                  CONCAT14((byte)((ulong)uVar100 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar92 >> 0x20) & bVar40,
                                                           CONCAT13((byte)((ulong)uVar100 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar92 >>
                                                                                   0x18) & bVar39,
                                                                    CONCAT12((byte)((ulong)uVar100
                                                                                   >> 0x10) & bVar46
                                                                             | (byte)((ulong)uVar92
                                                                                     >> 0x10) &
                                                                               bVar38,CONCAT11((byte
                                                  )((ulong)uVar100 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar92 >> 8) & bVar37,
                                                  (byte)uVar100 & bVar44 | (byte)uVar92 & bVar36))))
                                                 )));
          lVar4 = lVar4 + -8;
          puVar19 = puVar19 + 8;
          puVar14 = puVar14 + 8;
        } while (lVar4 != 0);
        lVar4 = in_stack_00000018;
        if (in_stack_00000018 != unaff_x23) goto code_r0x002a6260;
      }
      uVar8 = **(ulong **)(unaff_x29 + -0x58);
      uVar7 = ~uVar10;
      if ((unaff_w28 < 8) ||
         (uVar8 < uVar3 + in_stack_00000038 && uVar3 < uVar8 + in_stack_00000038)) {
        lVar4 = 0;
code_r0x002a6340:
        lVar12 = unaff_x23 - lVar4;
        puVar6 = (ulong *)(uVar8 + lVar4 * 8);
        puVar15 = (ulong *)(uVar3 + lVar4 * 8);
        do {
          *puVar6 = *puVar6 & uVar7 | *puVar15 & uVar10;
          lVar12 = lVar12 + -1;
          puVar6 = puVar6 + 1;
          puVar15 = puVar15 + 1;
        } while (lVar12 != 0);
      }
      else {
        puVar19 = (undefined8 *)(uVar8 + 0x20);
        puVar14 = (undefined8 *)(uVar3 + 0x20);
        lVar4 = in_stack_00000018;
        do {
          uVar62 = puVar14[-3];
          uVar53 = puVar14[-4];
          uVar81 = puVar14[-1];
          uVar71 = puVar14[-2];
          uVar91 = puVar14[1];
          uVar89 = *puVar14;
          uVar93 = puVar14[3];
          uVar92 = puVar14[2];
          uVar95 = puVar19[-3];
          uVar94 = puVar19[-4];
          uVar97 = puVar19[-1];
          uVar96 = puVar19[-2];
          uVar99 = puVar19[1];
          uVar98 = *puVar19;
          uVar101 = puVar19[3];
          uVar100 = puVar19[2];
          bVar44 = (byte)uVar7;
          bVar45 = (byte)(uVar7 >> 8);
          bVar46 = (byte)(uVar7 >> 0x10);
          bVar47 = (byte)(uVar7 >> 0x18);
          bVar48 = (byte)(uVar7 >> 0x20);
          bVar49 = (byte)(uVar7 >> 0x28);
          bVar50 = (byte)(uVar7 >> 0x30);
          bVar51 = (byte)(uVar7 >> 0x38);
          puVar19[-3] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar29,
                                                           (byte)uVar95 & bVar44 |
                                                           (byte)uVar62 & bVar28)))))));
          puVar19[-4] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar29,
                                                           (byte)uVar94 & bVar44 |
                                                           (byte)uVar53 & bVar28)))))));
          puVar19[-1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar81 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar81 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar81 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar81 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar81
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar97
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar81 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar81 >> 8) & bVar29,
                                                           (byte)uVar97 & bVar44 |
                                                           (byte)uVar81 & bVar28)))))));
          puVar19[-2] = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar96
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar96 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar29,
                                                           (byte)uVar96 & bVar44 |
                                                           (byte)uVar71 & bVar28)))))));
          puVar19[1] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar46 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar30,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar29,
                                                  (byte)uVar99 & bVar44 | (byte)uVar91 & bVar28)))))
                                        ));
          *puVar19 = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar51 |
                              (byte)((ulong)uVar89 >> 0x38) & bVar35,
                              CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar50 |
                                       (byte)((ulong)uVar89 >> 0x30) & bVar34,
                                       CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar49 |
                                                (byte)((ulong)uVar89 >> 0x28) & bVar33,
                                                CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar48 |
                                                         (byte)((ulong)uVar89 >> 0x20) & bVar32,
                                                         CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                  bVar47 | (byte)((ulong)uVar89 >>
                                                                                 0x18) & bVar31,
                                                                  CONCAT12((byte)((ulong)uVar98 >>
                                                                                 0x10) & bVar46 |
                                                                           (byte)((ulong)uVar89 >>
                                                                                 0x10) & bVar30,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar29,
                                                  (byte)uVar98 & bVar44 | (byte)uVar89 & bVar28)))))
                                      ));
          puVar19[3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar93 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar93 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar93 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar93 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar101 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar93 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar101
                                                                                   >> 0x10) & bVar46
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x10) &
                                                                               bVar30,CONCAT11((byte
                                                  )((ulong)uVar101 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar29,
                                                  (byte)uVar101 & bVar44 | (byte)uVar93 & bVar28))))
                                                 )));
          puVar19[2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar92 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar92 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar92 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar100 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar92 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar100 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar92 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar100
                                                                                   >> 0x10) & bVar46
                                                                             | (byte)((ulong)uVar92
                                                                                     >> 0x10) &
                                                                               bVar30,CONCAT11((byte
                                                  )((ulong)uVar100 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar92 >> 8) & bVar29,
                                                  (byte)uVar100 & bVar44 | (byte)uVar92 & bVar28))))
                                                 )));
          lVar4 = lVar4 + -8;
          puVar19 = puVar19 + 8;
          puVar14 = puVar14 + 8;
        } while (lVar4 != 0);
        lVar4 = in_stack_00000018;
        if (in_stack_00000018 != unaff_x23) goto code_r0x002a6340;
      }
      uVar8 = *in_stack_00000070;
      uVar7 = ~uVar5;
      if ((unaff_w28 < 8) ||
         (uVar8 < uVar3 + in_stack_00000038 && uVar3 < uVar8 + in_stack_00000038)) {
        lVar4 = 0;
      }
      else {
        puVar19 = (undefined8 *)(uVar8 + 0x20);
        puVar14 = (undefined8 *)(uVar3 + 0x20);
        lVar4 = in_stack_00000018;
        do {
          uVar62 = puVar14[-3];
          uVar53 = puVar14[-4];
          uVar81 = puVar14[-1];
          uVar71 = puVar14[-2];
          uVar91 = puVar14[1];
          uVar89 = *puVar14;
          uVar93 = puVar14[3];
          uVar92 = puVar14[2];
          uVar95 = puVar19[-3];
          uVar94 = puVar19[-4];
          uVar97 = puVar19[-1];
          uVar96 = puVar19[-2];
          uVar99 = puVar19[1];
          uVar98 = *puVar19;
          uVar101 = puVar19[3];
          uVar100 = puVar19[2];
          bVar44 = (byte)uVar7;
          bVar45 = (byte)(uVar7 >> 8);
          bVar46 = (byte)(uVar7 >> 0x10);
          bVar47 = (byte)(uVar7 >> 0x18);
          bVar48 = (byte)(uVar7 >> 0x20);
          bVar49 = (byte)(uVar7 >> 0x28);
          bVar50 = (byte)(uVar7 >> 0x30);
          bVar51 = (byte)(uVar7 >> 0x38);
          puVar19[-3] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar21,
                                                           (byte)uVar95 & bVar44 |
                                                           (byte)uVar62 & bVar20)))))));
          puVar19[-4] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar21,
                                                           (byte)uVar94 & bVar44 |
                                                           (byte)uVar53 & bVar20)))))));
          puVar19[-1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar81 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar81 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar81 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar81 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar81
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar97
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar81 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar81 >> 8) & bVar21,
                                                           (byte)uVar97 & bVar44 |
                                                           (byte)uVar81 & bVar20)))))));
          puVar19[-2] = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar96
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar96 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar21,
                                                           (byte)uVar96 & bVar44 |
                                                           (byte)uVar71 & bVar20)))))));
          puVar19[1] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar46 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar22,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar21,
                                                  (byte)uVar99 & bVar44 | (byte)uVar91 & bVar20)))))
                                        ));
          *puVar19 = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar51 |
                              (byte)((ulong)uVar89 >> 0x38) & bVar27,
                              CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar50 |
                                       (byte)((ulong)uVar89 >> 0x30) & bVar26,
                                       CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar49 |
                                                (byte)((ulong)uVar89 >> 0x28) & bVar25,
                                                CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar48 |
                                                         (byte)((ulong)uVar89 >> 0x20) & bVar24,
                                                         CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                  bVar47 | (byte)((ulong)uVar89 >>
                                                                                 0x18) & bVar23,
                                                                  CONCAT12((byte)((ulong)uVar98 >>
                                                                                 0x10) & bVar46 |
                                                                           (byte)((ulong)uVar89 >>
                                                                                 0x10) & bVar22,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar21,
                                                  (byte)uVar98 & bVar44 | (byte)uVar89 & bVar20)))))
                                      ));
          puVar19[3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar93 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar93 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar93 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar93 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar101 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar93 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar101
                                                                                   >> 0x10) & bVar46
                                                                             | (byte)((ulong)uVar93
                                                                                     >> 0x10) &
                                                                               bVar22,CONCAT11((byte
                                                  )((ulong)uVar101 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar93 >> 8) & bVar21,
                                                  (byte)uVar101 & bVar44 | (byte)uVar93 & bVar20))))
                                                 )));
          puVar19[2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar92 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar92 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar92 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar100 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar92 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar100 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar92 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar100
                                                                                   >> 0x10) & bVar46
                                                                             | (byte)((ulong)uVar92
                                                                                     >> 0x10) &
                                                                               bVar22,CONCAT11((byte
                                                  )((ulong)uVar100 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar92 >> 8) & bVar21,
                                                  (byte)uVar100 & bVar44 | (byte)uVar92 & bVar20))))
                                                 )));
          lVar4 = lVar4 + -8;
          puVar19 = puVar19 + 8;
          puVar14 = puVar14 + 8;
        } while (lVar4 != 0);
        lVar4 = in_stack_00000018;
        if (in_stack_00000018 == unaff_x23) goto code_r0x002a6450;
      }
      lVar12 = unaff_x23 - lVar4;
      puVar6 = (ulong *)(uVar8 + lVar4 * 8);
      puVar15 = (ulong *)(uVar3 + lVar4 * 8);
      do {
        *puVar6 = *puVar6 & uVar7 | *puVar15 & uVar5;
        lVar12 = lVar12 + -1;
        puVar6 = puVar6 + 1;
        puVar15 = puVar15 + 1;
      } while (lVar12 != 0);
    }
code_r0x002a6450:
    func_0x00382c70(uVar3,**(undefined8 **)(unaff_x29 + -0x68),**(undefined8 **)(unaff_x29 + -0x60),
                    in_stack_00000058);
    param_5 = in_stack_00000058;
    func_0x00382cc0(*in_stack_00000060,*in_stack_00000068,*unaff_x24);
    param_4 = (char *)*in_stack_00000068;
    uVar18 = (uint)in_stack_00000058;
    if (uVar18 != 0) {
      puVar9 = (undefined1 *)*in_stack_00000060;
      uVar3 = ~uVar13;
      if ((uVar18 < 8) ||
         (param_4 < puVar9 + in_stack_00000000 && puVar9 < param_4 + in_stack_00000000)) {
        pcVar17 = (char *)0x0;
code_r0x002a653c:
        lVar4 = (long)in_stack_00000058 - (long)pcVar17;
        puVar6 = (ulong *)(puVar9 + (long)pcVar17 * 8);
        pcVar17 = param_4 + (long)pcVar17 * 8;
        do {
          *(ulong *)pcVar17 = *puVar6 & uVar3 | *(ulong *)pcVar17 & uVar13;
          lVar4 = lVar4 + -1;
          puVar6 = puVar6 + 1;
          pcVar17 = pcVar17 + 8;
        } while (lVar4 != 0);
      }
      else {
        puVar19 = (undefined8 *)(puVar9 + 0x20);
        pqVar16 = (qword *)(param_4 + 0x20);
        pcVar17 = in_stack_00000008;
        do {
          uVar62 = pqVar16[-3];
          uVar53 = pqVar16[-4];
          qVar80 = pqVar16[-1];
          uVar71 = pqVar16[-2];
          uVar81 = pqVar16[1];
          qVar90 = *pqVar16;
          uVar91 = pqVar16[3];
          uVar89 = pqVar16[2];
          uVar93 = puVar19[-3];
          uVar92 = puVar19[-4];
          uVar95 = puVar19[-1];
          uVar94 = puVar19[-2];
          uVar97 = puVar19[1];
          uVar96 = *puVar19;
          uVar99 = puVar19[3];
          uVar98 = puVar19[2];
          bVar44 = (byte)uVar3;
          bVar45 = (byte)(uVar3 >> 8);
          bVar46 = (byte)(uVar3 >> 0x10);
          bVar47 = (byte)(uVar3 >> 0x18);
          bVar48 = (byte)(uVar3 >> 0x20);
          bVar49 = (byte)(uVar3 >> 0x28);
          bVar50 = (byte)(uVar3 >> 0x30);
          bVar51 = (byte)(uVar3 >> 0x38);
          pqVar16[-3] = CONCAT17((byte)((ulong)uVar93 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar93 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar93 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar93 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar93 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar39,
                                                                     CONCAT12((byte)((ulong)uVar93
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar93 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar37,
                                                           (byte)uVar93 & bVar44 |
                                                           (byte)uVar62 & bVar36)))))));
          pqVar16[-4] = CONCAT17((byte)((ulong)uVar92 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar92 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar92 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar92 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar92 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar39,
                                                                     CONCAT12((byte)((ulong)uVar92
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar92 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar37,
                                                           (byte)uVar92 & bVar44 |
                                                           (byte)uVar53 & bVar36)))))));
          pqVar16[-1] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar51 |
                                 (byte)(qVar80 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar50 |
                                          (byte)(qVar80 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar49 |
                                                   (byte)(qVar80 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar48 |
                                                            (byte)(qVar80 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar47 | (byte)(qVar80 >> 0x18)
                                                                              & bVar39,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)(qVar80
                                                                                             >> 0x10
                                                  ) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar45 |
                                                           (byte)(qVar80 >> 8) & bVar37,
                                                           (byte)uVar95 & bVar44 |
                                                           (byte)qVar80 & bVar36)))))));
          pqVar16[-2] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar51 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar43,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar50 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar42,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar49 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar41,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar48 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar40,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar47 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar39,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar46 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar37,
                                                           (byte)uVar94 & bVar44 |
                                                           (byte)uVar71 & bVar36)))))));
          pqVar16[1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar81 >> 0x38) & bVar43,
                                CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar81 >> 0x30) & bVar42,
                                         CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar81 >> 0x28) & bVar41,
                                                  CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar81 >> 0x20) & bVar40,
                                                           CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar81 >>
                                                                                   0x18) & bVar39,
                                                                    CONCAT12((byte)((ulong)uVar97 >>
                                                                                   0x10) & bVar46 |
                                                                             (byte)((ulong)uVar81 >>
                                                                                   0x10) & bVar38,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar97 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar81 >> 8) & bVar37,
                                                  (byte)uVar97 & bVar44 | (byte)uVar81 & bVar36)))))
                                        ));
          *pqVar16 = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar51 |
                              (byte)(qVar90 >> 0x38) & bVar43,
                              CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar50 |
                                       (byte)(qVar90 >> 0x30) & bVar42,
                                       CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar49 |
                                                (byte)(qVar90 >> 0x28) & bVar41,
                                                CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar48 |
                                                         (byte)(qVar90 >> 0x20) & bVar40,
                                                         CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                  bVar47 | (byte)(qVar90 >> 0x18) &
                                                                           bVar39,
                                                                  CONCAT12((byte)((ulong)uVar96 >>
                                                                                 0x10) & bVar46 |
                                                                           (byte)(qVar90 >> 0x10) &
                                                                           bVar38,CONCAT11((byte)((
                                                  ulong)uVar96 >> 8) & bVar45 |
                                                  (byte)(qVar90 >> 8) & bVar37,
                                                  (byte)uVar96 & bVar44 | (byte)qVar90 & bVar36)))))
                                      ));
          pqVar16[3] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar43,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar42,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar41,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar40,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar39,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar46 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar38,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar37,
                                                  (byte)uVar99 & bVar44 | (byte)uVar91 & bVar36)))))
                                        ));
          pqVar16[2] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar51 |
                                (byte)((ulong)uVar89 >> 0x38) & bVar43,
                                CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar50 |
                                         (byte)((ulong)uVar89 >> 0x30) & bVar42,
                                         CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar49 |
                                                  (byte)((ulong)uVar89 >> 0x28) & bVar41,
                                                  CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar48 |
                                                           (byte)((ulong)uVar89 >> 0x20) & bVar40,
                                                           CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                    bVar47 | (byte)((ulong)uVar89 >>
                                                                                   0x18) & bVar39,
                                                                    CONCAT12((byte)((ulong)uVar98 >>
                                                                                   0x10) & bVar46 |
                                                                             (byte)((ulong)uVar89 >>
                                                                                   0x10) & bVar38,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar45 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar37,
                                                  (byte)uVar98 & bVar44 | (byte)uVar89 & bVar36)))))
                                        ));
          pcVar17 = pcVar17 + -8;
          puVar19 = puVar19 + 8;
          pqVar16 = pqVar16 + 8;
        } while (pcVar17 != (char *)0x0);
        pcVar17 = in_stack_00000008;
        if (in_stack_00000008 != in_stack_00000058) goto code_r0x002a653c;
      }
      puVar9 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x68);
      uVar3 = ~uVar10;
      if ((uVar18 < 8) ||
         (puVar9 < param_4 + in_stack_00000000 && param_4 < puVar9 + in_stack_00000000)) {
        pcVar17 = (char *)0x0;
code_r0x002a661c:
        lVar4 = (long)in_stack_00000058 - (long)pcVar17;
        puVar6 = (ulong *)(puVar9 + (long)pcVar17 * 8);
        pcVar17 = param_4 + (long)pcVar17 * 8;
        do {
          *puVar6 = *puVar6 & uVar3 | *(ulong *)pcVar17 & uVar10;
          lVar4 = lVar4 + -1;
          puVar6 = puVar6 + 1;
          pcVar17 = pcVar17 + 8;
        } while (lVar4 != 0);
      }
      else {
        puVar19 = (undefined8 *)(puVar9 + 0x20);
        pqVar16 = (qword *)(param_4 + 0x20);
        pcVar17 = in_stack_00000008;
        do {
          uVar62 = pqVar16[-3];
          uVar53 = pqVar16[-4];
          qVar80 = pqVar16[-1];
          uVar71 = pqVar16[-2];
          uVar81 = pqVar16[1];
          qVar90 = *pqVar16;
          uVar91 = pqVar16[3];
          uVar89 = pqVar16[2];
          uVar93 = puVar19[-3];
          uVar92 = puVar19[-4];
          uVar95 = puVar19[-1];
          uVar94 = puVar19[-2];
          uVar97 = puVar19[1];
          uVar96 = *puVar19;
          uVar99 = puVar19[3];
          uVar98 = puVar19[2];
          bVar36 = (byte)uVar3;
          bVar37 = (byte)(uVar3 >> 8);
          bVar38 = (byte)(uVar3 >> 0x10);
          bVar39 = (byte)(uVar3 >> 0x18);
          bVar40 = (byte)(uVar3 >> 0x20);
          bVar41 = (byte)(uVar3 >> 0x28);
          bVar42 = (byte)(uVar3 >> 0x30);
          bVar43 = (byte)(uVar3 >> 0x38);
          puVar19[-3] = CONCAT17((byte)((ulong)uVar93 >> 0x38) & bVar43 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar93 >> 0x30) & bVar42 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar93 >> 0x28) & bVar41 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar93 >> 0x20) & bVar40 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar93 >> 0x18) &
                                                                     bVar39 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar93
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar93 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar29,
                                                           (byte)uVar93 & bVar36 |
                                                           (byte)uVar62 & bVar28)))))));
          puVar19[-4] = CONCAT17((byte)((ulong)uVar92 >> 0x38) & bVar43 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar92 >> 0x30) & bVar42 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar92 >> 0x28) & bVar41 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar92 >> 0x20) & bVar40 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar92 >> 0x18) &
                                                                     bVar39 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar92
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar92 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar29,
                                                           (byte)uVar92 & bVar36 |
                                                           (byte)uVar53 & bVar28)))))));
          puVar19[-1] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar43 |
                                 (byte)(qVar80 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar42 |
                                          (byte)(qVar80 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar41 |
                                                   (byte)(qVar80 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar40 |
                                                            (byte)(qVar80 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar39 | (byte)(qVar80 >> 0x18)
                                                                              & bVar31,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)(qVar80
                                                                                             >> 0x10
                                                  ) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar37 |
                                                           (byte)(qVar80 >> 8) & bVar29,
                                                           (byte)uVar95 & bVar36 |
                                                           (byte)qVar80 & bVar28)))))));
          puVar19[-2] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar43 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar35,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar42 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar34,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar41 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar33,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar40 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar32,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar39 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar31,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar38 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar29,
                                                           (byte)uVar94 & bVar36 |
                                                           (byte)uVar71 & bVar28)))))));
          puVar19[1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar43 |
                                (byte)((ulong)uVar81 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar42 |
                                         (byte)((ulong)uVar81 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar41 |
                                                  (byte)((ulong)uVar81 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar40 |
                                                           (byte)((ulong)uVar81 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                    bVar39 | (byte)((ulong)uVar81 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar97 >>
                                                                                   0x10) & bVar38 |
                                                                             (byte)((ulong)uVar81 >>
                                                                                   0x10) & bVar30,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar97 >> 8) & bVar37 |
                                                  (byte)((ulong)uVar81 >> 8) & bVar29,
                                                  (byte)uVar97 & bVar36 | (byte)uVar81 & bVar28)))))
                                        ));
          *puVar19 = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar43 |
                              (byte)(qVar90 >> 0x38) & bVar35,
                              CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar42 |
                                       (byte)(qVar90 >> 0x30) & bVar34,
                                       CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar41 |
                                                (byte)(qVar90 >> 0x28) & bVar33,
                                                CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar40 |
                                                         (byte)(qVar90 >> 0x20) & bVar32,
                                                         CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                  bVar39 | (byte)(qVar90 >> 0x18) &
                                                                           bVar31,
                                                                  CONCAT12((byte)((ulong)uVar96 >>
                                                                                 0x10) & bVar38 |
                                                                           (byte)(qVar90 >> 0x10) &
                                                                           bVar30,CONCAT11((byte)((
                                                  ulong)uVar96 >> 8) & bVar37 |
                                                  (byte)(qVar90 >> 8) & bVar29,
                                                  (byte)uVar96 & bVar36 | (byte)qVar90 & bVar28)))))
                                      ));
          puVar19[3] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar43 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar42 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar41 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar40 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar39 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar38 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar30,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar37 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar29,
                                                  (byte)uVar99 & bVar36 | (byte)uVar91 & bVar28)))))
                                        ));
          puVar19[2] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar43 |
                                (byte)((ulong)uVar89 >> 0x38) & bVar35,
                                CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar42 |
                                         (byte)((ulong)uVar89 >> 0x30) & bVar34,
                                         CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar41 |
                                                  (byte)((ulong)uVar89 >> 0x28) & bVar33,
                                                  CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar40 |
                                                           (byte)((ulong)uVar89 >> 0x20) & bVar32,
                                                           CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                    bVar39 | (byte)((ulong)uVar89 >>
                                                                                   0x18) & bVar31,
                                                                    CONCAT12((byte)((ulong)uVar98 >>
                                                                                   0x10) & bVar38 |
                                                                             (byte)((ulong)uVar89 >>
                                                                                   0x10) & bVar30,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar37 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar29,
                                                  (byte)uVar98 & bVar36 | (byte)uVar89 & bVar28)))))
                                        ));
          pcVar17 = pcVar17 + -8;
          puVar19 = puVar19 + 8;
          pqVar16 = pqVar16 + 8;
        } while (pcVar17 != (char *)0x0);
        pcVar17 = in_stack_00000008;
        if (in_stack_00000008 != in_stack_00000058) goto code_r0x002a661c;
      }
      puVar9 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x60);
      uVar3 = ~uVar5;
      if ((uVar18 < 8) ||
         (puVar9 < param_4 + in_stack_00000000 && param_4 < puVar9 + in_stack_00000000)) {
        pcVar17 = (char *)0x0;
      }
      else {
        puVar19 = (undefined8 *)(puVar9 + 0x20);
        pqVar16 = (qword *)(param_4 + 0x20);
        pcVar17 = in_stack_00000008;
        do {
          uVar62 = pqVar16[-3];
          uVar53 = pqVar16[-4];
          qVar80 = pqVar16[-1];
          uVar71 = pqVar16[-2];
          uVar81 = pqVar16[1];
          qVar90 = *pqVar16;
          uVar91 = pqVar16[3];
          uVar89 = pqVar16[2];
          uVar93 = puVar19[-3];
          uVar92 = puVar19[-4];
          uVar95 = puVar19[-1];
          uVar94 = puVar19[-2];
          uVar97 = puVar19[1];
          uVar96 = *puVar19;
          uVar99 = puVar19[3];
          uVar98 = puVar19[2];
          bVar28 = (byte)uVar3;
          bVar29 = (byte)(uVar3 >> 8);
          bVar30 = (byte)(uVar3 >> 0x10);
          bVar31 = (byte)(uVar3 >> 0x18);
          bVar32 = (byte)(uVar3 >> 0x20);
          bVar33 = (byte)(uVar3 >> 0x28);
          bVar34 = (byte)(uVar3 >> 0x30);
          bVar35 = (byte)(uVar3 >> 0x38);
          puVar19[-3] = CONCAT17((byte)((ulong)uVar93 >> 0x38) & bVar35 |
                                 (byte)((ulong)uVar62 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar93 >> 0x30) & bVar34 |
                                          (byte)((ulong)uVar62 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar93 >> 0x28) & bVar33 |
                                                   (byte)((ulong)uVar62 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar93 >> 0x20) & bVar32 |
                                                            (byte)((ulong)uVar62 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar93 >> 0x18) &
                                                                     bVar31 | (byte)((ulong)uVar62
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar93
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)((ulong
                                                  )uVar62 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar93 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar62 >> 8) & bVar21,
                                                           (byte)uVar93 & bVar28 |
                                                           (byte)uVar62 & bVar20)))))));
          puVar19[-4] = CONCAT17((byte)((ulong)uVar92 >> 0x38) & bVar35 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar92 >> 0x30) & bVar34 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar92 >> 0x28) & bVar33 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar92 >> 0x20) & bVar32 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar92 >> 0x18) &
                                                                     bVar31 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar92
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar92 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar21,
                                                           (byte)uVar92 & bVar28 |
                                                           (byte)uVar53 & bVar20)))))));
          puVar19[-1] = CONCAT17((byte)((ulong)uVar95 >> 0x38) & bVar35 |
                                 (byte)(qVar80 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar95 >> 0x30) & bVar34 |
                                          (byte)(qVar80 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar95 >> 0x28) & bVar33 |
                                                   (byte)(qVar80 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar95 >> 0x20) & bVar32 |
                                                            (byte)(qVar80 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar95 >> 0x18) &
                                                                     bVar31 | (byte)(qVar80 >> 0x18)
                                                                              & bVar23,
                                                                     CONCAT12((byte)((ulong)uVar95
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)(qVar80
                                                                                             >> 0x10
                                                  ) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar95 >> 8) & bVar29 |
                                                           (byte)(qVar80 >> 8) & bVar21,
                                                           (byte)uVar95 & bVar28 |
                                                           (byte)qVar80 & bVar20)))))));
          puVar19[-2] = CONCAT17((byte)((ulong)uVar94 >> 0x38) & bVar35 |
                                 (byte)((ulong)uVar71 >> 0x38) & bVar27,
                                 CONCAT16((byte)((ulong)uVar94 >> 0x30) & bVar34 |
                                          (byte)((ulong)uVar71 >> 0x30) & bVar26,
                                          CONCAT15((byte)((ulong)uVar94 >> 0x28) & bVar33 |
                                                   (byte)((ulong)uVar71 >> 0x28) & bVar25,
                                                   CONCAT14((byte)((ulong)uVar94 >> 0x20) & bVar32 |
                                                            (byte)((ulong)uVar71 >> 0x20) & bVar24,
                                                            CONCAT13((byte)((ulong)uVar94 >> 0x18) &
                                                                     bVar31 | (byte)((ulong)uVar71
                                                                                    >> 0x18) &
                                                                              bVar23,
                                                                     CONCAT12((byte)((ulong)uVar94
                                                                                    >> 0x10) &
                                                                              bVar30 | (byte)((ulong
                                                  )uVar71 >> 0x10) & bVar22,
                                                  CONCAT11((byte)((ulong)uVar94 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar71 >> 8) & bVar21,
                                                           (byte)uVar94 & bVar28 |
                                                           (byte)uVar71 & bVar20)))))));
          puVar19[1] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar35 |
                                (byte)((ulong)uVar81 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar34 |
                                         (byte)((ulong)uVar81 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar33 |
                                                  (byte)((ulong)uVar81 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar97 >> 0x20) & bVar32 |
                                                           (byte)((ulong)uVar81 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar97 >> 0x18) &
                                                                    bVar31 | (byte)((ulong)uVar81 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar97 >>
                                                                                   0x10) & bVar30 |
                                                                             (byte)((ulong)uVar81 >>
                                                                                   0x10) & bVar22,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar97 >> 8) & bVar29 |
                                                  (byte)((ulong)uVar81 >> 8) & bVar21,
                                                  (byte)uVar97 & bVar28 | (byte)uVar81 & bVar20)))))
                                        ));
          *puVar19 = CONCAT17((byte)((ulong)uVar96 >> 0x38) & bVar35 |
                              (byte)(qVar90 >> 0x38) & bVar27,
                              CONCAT16((byte)((ulong)uVar96 >> 0x30) & bVar34 |
                                       (byte)(qVar90 >> 0x30) & bVar26,
                                       CONCAT15((byte)((ulong)uVar96 >> 0x28) & bVar33 |
                                                (byte)(qVar90 >> 0x28) & bVar25,
                                                CONCAT14((byte)((ulong)uVar96 >> 0x20) & bVar32 |
                                                         (byte)(qVar90 >> 0x20) & bVar24,
                                                         CONCAT13((byte)((ulong)uVar96 >> 0x18) &
                                                                  bVar31 | (byte)(qVar90 >> 0x18) &
                                                                           bVar23,
                                                                  CONCAT12((byte)((ulong)uVar96 >>
                                                                                 0x10) & bVar30 |
                                                                           (byte)(qVar90 >> 0x10) &
                                                                           bVar22,CONCAT11((byte)((
                                                  ulong)uVar96 >> 8) & bVar29 |
                                                  (byte)(qVar90 >> 8) & bVar21,
                                                  (byte)uVar96 & bVar28 | (byte)qVar90 & bVar20)))))
                                      ));
          puVar19[3] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar35 |
                                (byte)((ulong)uVar91 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar34 |
                                         (byte)((ulong)uVar91 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar33 |
                                                  (byte)((ulong)uVar91 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar99 >> 0x20) & bVar32 |
                                                           (byte)((ulong)uVar91 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar99 >> 0x18) &
                                                                    bVar31 | (byte)((ulong)uVar91 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar99 >>
                                                                                   0x10) & bVar30 |
                                                                             (byte)((ulong)uVar91 >>
                                                                                   0x10) & bVar22,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar99 >> 8) & bVar29 |
                                                  (byte)((ulong)uVar91 >> 8) & bVar21,
                                                  (byte)uVar99 & bVar28 | (byte)uVar91 & bVar20)))))
                                        ));
          puVar19[2] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar35 |
                                (byte)((ulong)uVar89 >> 0x38) & bVar27,
                                CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar34 |
                                         (byte)((ulong)uVar89 >> 0x30) & bVar26,
                                         CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar33 |
                                                  (byte)((ulong)uVar89 >> 0x28) & bVar25,
                                                  CONCAT14((byte)((ulong)uVar98 >> 0x20) & bVar32 |
                                                           (byte)((ulong)uVar89 >> 0x20) & bVar24,
                                                           CONCAT13((byte)((ulong)uVar98 >> 0x18) &
                                                                    bVar31 | (byte)((ulong)uVar89 >>
                                                                                   0x18) & bVar23,
                                                                    CONCAT12((byte)((ulong)uVar98 >>
                                                                                   0x10) & bVar30 |
                                                                             (byte)((ulong)uVar89 >>
                                                                                   0x10) & bVar22,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar98 >> 8) & bVar29 |
                                                  (byte)((ulong)uVar89 >> 8) & bVar21,
                                                  (byte)uVar98 & bVar28 | (byte)uVar89 & bVar20)))))
                                        ));
          pcVar17 = pcVar17 + -8;
          puVar19 = puVar19 + 8;
          pqVar16 = pqVar16 + 8;
        } while (pcVar17 != (char *)0x0);
        pcVar17 = in_stack_00000008;
        if (in_stack_00000008 == in_stack_00000058) goto code_r0x002a672c;
      }
      lVar4 = (long)in_stack_00000058 - (long)pcVar17;
      puVar6 = (ulong *)(puVar9 + (long)pcVar17 * 8);
      pcVar17 = param_4 + (long)pcVar17 * 8;
      do {
        *puVar6 = *puVar6 & uVar3 | *(ulong *)pcVar17 & uVar5;
        lVar4 = lVar4 + -1;
        puVar6 = puVar6 + 1;
        pcVar17 = pcVar17 + 8;
      } while (lVar4 != 0);
    }
code_r0x002a672c:
    if ((*(ulong *)*unaff_x25 & 1) == (*(ulong *)*in_stack_00000040 & 1)) goto code_r0x002a6ae8;
    param_4 = (char *)((*(ulong *)*in_stack_00000040 & 1) - 1);
    uVar3 = (*(ulong *)*unaff_x25 & 1) - 1;
    func_0x002a8410();
    puVar19 = *(undefined8 **)(unaff_x29 + -0x68);
    uVar13 = (-(*(ulong *)*puVar19 & 1) | -(*(ulong *)**(undefined8 **)(unaff_x29 + -0x58) & 1)) &
             uVar3;
    uVar53 = func_0x002a85f8((ulong *)**(undefined8 **)(unaff_x29 + -0x58),uVar13,*unaff_x22,
                             *in_stack_00000068);
    uVar62 = func_0x002a85f8(*puVar19,uVar13,*unaff_x24,*in_stack_00000068,in_stack_00000058);
    func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x58),uVar53,uVar3,*in_stack_00000068);
    func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x68),uVar62,uVar3,*in_stack_00000068,
                    in_stack_00000058);
    func_0x002a8410(*in_stack_00000040,param_4,*in_stack_00000068);
    uVar3 = (-(*(ulong *)**(undefined8 **)(unaff_x29 + -0x60) & 1) |
            -(*(ulong *)*in_stack_00000070 & 1)) & (ulong)param_4;
    uVar53 = func_0x002a85f8((ulong *)*in_stack_00000070,uVar3,*unaff_x22,*in_stack_00000068);
    uVar62 = func_0x002a85f8(**(undefined8 **)(unaff_x29 + -0x60),uVar3,*unaff_x24,
                             *in_stack_00000068,in_stack_00000058);
    func_0x002a8714(*in_stack_00000070,uVar53,param_4,*in_stack_00000068);
    param_5 = (char *)*in_stack_00000068;
    param_6 = in_stack_00000058;
    func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x60),uVar62,param_4,param_5,in_stack_00000058);
    param_1 = in_stack_00000030 + 1;
    in_stack_00000030 = param_1;
  }
  uVar18 = (uint)in_stack_00000040[1];
  uVar3 = (ulong)(int)uVar18;
  if (uVar18 == 0) {
LAB_002a6a70:
    iVar2 = func_0x0029dd44();
    if (iVar2 == 0) {
      *unaff_x20 = 1;
      param_5 = "/aws-lc/crypto/fipsmodule/bn/gcd_extra.c";
      param_4 = section_00000068.sectname + 8;
      param_6 = "";
      func_0x0028f83c(3,0,0x70,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",0x13f);
      uVar3 = 0;
    }
    else {
      lVar4 = func_0x0029bd80();
      uVar3 = (ulong)(lVar4 != 0);
    }
    if (*(char *)(unaff_x19 + 0x28) != '\0') {
      return uVar3;
    }
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar4 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar4;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar4 * 8);
      return uVar3;
    }
    func_0x0079db4c(uVar3);
code_r0x002a6ae8:
    func_0x0079dea4();
  }
  else {
    if (uVar18 < 8) {
      uVar10 = 0;
      uVar13 = 0;
LAB_002a6a54:
      lVar4 = uVar3 - uVar10;
      puVar6 = (ulong *)(*in_stack_00000040 + uVar10 * 8);
      do {
        uVar13 = *puVar6 | uVar13;
        lVar4 = lVar4 + -1;
        puVar6 = puVar6 + 1;
      } while (lVar4 != 0);
    }
    else {
      uVar10 = uVar3 & 0xfffffffffffffff8;
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
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
      bVar51 = 0;
      uVar53 = 0;
      uVar62 = 0;
      uVar71 = 0;
      uVar81 = 0;
      puVar19 = (undefined8 *)(*in_stack_00000040 + 0x20);
      uVar13 = uVar10;
      do {
        uVar91 = puVar19[-3];
        uVar89 = puVar19[-4];
        uVar93 = puVar19[-1];
        uVar92 = puVar19[-2];
        uVar95 = puVar19[1];
        uVar94 = *puVar19;
        uVar97 = puVar19[3];
        uVar96 = puVar19[2];
        bVar20 = (byte)uVar89 | bVar20;
        bVar21 = (byte)((ulong)uVar89 >> 8) | bVar21;
        bVar22 = (byte)((ulong)uVar89 >> 0x10) | bVar22;
        bVar23 = (byte)((ulong)uVar89 >> 0x18) | bVar23;
        bVar24 = (byte)((ulong)uVar89 >> 0x20) | bVar24;
        bVar25 = (byte)((ulong)uVar89 >> 0x28) | bVar25;
        bVar26 = (byte)((ulong)uVar89 >> 0x30) | bVar26;
        bVar27 = (byte)((ulong)uVar89 >> 0x38) | bVar27;
        bVar28 = (byte)uVar91 | bVar28;
        bVar29 = (byte)((ulong)uVar91 >> 8) | bVar29;
        bVar30 = (byte)((ulong)uVar91 >> 0x10) | bVar30;
        bVar31 = (byte)((ulong)uVar91 >> 0x18) | bVar31;
        bVar32 = (byte)((ulong)uVar91 >> 0x20) | bVar32;
        bVar33 = (byte)((ulong)uVar91 >> 0x28) | bVar33;
        bVar34 = (byte)((ulong)uVar91 >> 0x30) | bVar34;
        bVar35 = (byte)((ulong)uVar91 >> 0x38) | bVar35;
        bVar36 = (byte)uVar92 | bVar36;
        bVar37 = (byte)((ulong)uVar92 >> 8) | bVar37;
        bVar38 = (byte)((ulong)uVar92 >> 0x10) | bVar38;
        bVar39 = (byte)((ulong)uVar92 >> 0x18) | bVar39;
        bVar40 = (byte)((ulong)uVar92 >> 0x20) | bVar40;
        bVar41 = (byte)((ulong)uVar92 >> 0x28) | bVar41;
        bVar42 = (byte)((ulong)uVar92 >> 0x30) | bVar42;
        bVar43 = (byte)((ulong)uVar92 >> 0x38) | bVar43;
        bVar44 = (byte)uVar93 | bVar44;
        bVar45 = (byte)((ulong)uVar93 >> 8) | bVar45;
        bVar46 = (byte)((ulong)uVar93 >> 0x10) | bVar46;
        bVar47 = (byte)((ulong)uVar93 >> 0x18) | bVar47;
        bVar48 = (byte)((ulong)uVar93 >> 0x20) | bVar48;
        bVar49 = (byte)((ulong)uVar93 >> 0x28) | bVar49;
        bVar50 = (byte)((ulong)uVar93 >> 0x30) | bVar50;
        bVar51 = (byte)((ulong)uVar93 >> 0x38) | bVar51;
        bVar52 = (byte)uVar94 | (byte)uVar53;
        bVar54 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar53 >> 8);
        bVar55 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar53 >> 0x10);
        bVar56 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar53 >> 0x18);
        bVar57 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar53 >> 0x20);
        bVar58 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar53 >> 0x28);
        bVar59 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar53 >> 0x30);
        bVar60 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar53 >> 0x38);
        uVar53 = CONCAT17(bVar60,CONCAT16(bVar59,CONCAT15(bVar58,CONCAT14(bVar57,CONCAT13(bVar56,
                                                  CONCAT12(bVar55,CONCAT11(bVar54,bVar52)))))));
        bVar61 = (byte)uVar95 | (byte)uVar62;
        bVar63 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar62 >> 8);
        bVar64 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar62 >> 0x10);
        bVar65 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar62 >> 0x18);
        bVar66 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar62 >> 0x20);
        bVar67 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar62 >> 0x28);
        bVar68 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar62 >> 0x30);
        bVar69 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar62 >> 0x38);
        uVar62 = CONCAT17(bVar69,CONCAT16(bVar68,CONCAT15(bVar67,CONCAT14(bVar66,CONCAT13(bVar65,
                                                  CONCAT12(bVar64,CONCAT11(bVar63,bVar61)))))));
        bVar70 = (byte)uVar96 | (byte)uVar71;
        bVar72 = (byte)((ulong)uVar96 >> 8) | (byte)((ulong)uVar71 >> 8);
        bVar73 = (byte)((ulong)uVar96 >> 0x10) | (byte)((ulong)uVar71 >> 0x10);
        bVar74 = (byte)((ulong)uVar96 >> 0x18) | (byte)((ulong)uVar71 >> 0x18);
        bVar75 = (byte)((ulong)uVar96 >> 0x20) | (byte)((ulong)uVar71 >> 0x20);
        bVar76 = (byte)((ulong)uVar96 >> 0x28) | (byte)((ulong)uVar71 >> 0x28);
        bVar77 = (byte)((ulong)uVar96 >> 0x30) | (byte)((ulong)uVar71 >> 0x30);
        bVar78 = (byte)((ulong)uVar96 >> 0x38) | (byte)((ulong)uVar71 >> 0x38);
        uVar71 = CONCAT17(bVar78,CONCAT16(bVar77,CONCAT15(bVar76,CONCAT14(bVar75,CONCAT13(bVar74,
                                                  CONCAT12(bVar73,CONCAT11(bVar72,bVar70)))))));
        bVar79 = (byte)uVar97 | (byte)uVar81;
        bVar82 = (byte)((ulong)uVar97 >> 8) | (byte)((ulong)uVar81 >> 8);
        bVar83 = (byte)((ulong)uVar97 >> 0x10) | (byte)((ulong)uVar81 >> 0x10);
        bVar84 = (byte)((ulong)uVar97 >> 0x18) | (byte)((ulong)uVar81 >> 0x18);
        bVar85 = (byte)((ulong)uVar97 >> 0x20) | (byte)((ulong)uVar81 >> 0x20);
        bVar86 = (byte)((ulong)uVar97 >> 0x28) | (byte)((ulong)uVar81 >> 0x28);
        bVar87 = (byte)((ulong)uVar97 >> 0x30) | (byte)((ulong)uVar81 >> 0x30);
        bVar88 = (byte)((ulong)uVar97 >> 0x38) | (byte)((ulong)uVar81 >> 0x38);
        uVar81 = CONCAT17(bVar88,CONCAT16(bVar87,CONCAT15(bVar86,CONCAT14(bVar85,CONCAT13(bVar84,
                                                  CONCAT12(bVar83,CONCAT11(bVar82,bVar79)))))));
        uVar13 = uVar13 - 8;
        puVar19 = puVar19 + 8;
      } while (uVar13 != 0);
      bVar70 = bVar70 | bVar52 | bVar36 | bVar20;
      bVar72 = bVar72 | bVar54 | bVar37 | bVar21;
      bVar73 = bVar73 | bVar55 | bVar38 | bVar22;
      bVar74 = bVar74 | bVar56 | bVar39 | bVar23;
      bVar75 = bVar75 | bVar57 | bVar40 | bVar24;
      bVar76 = bVar76 | bVar58 | bVar41 | bVar25;
      bVar77 = bVar77 | bVar59 | bVar42 | bVar26;
      bVar78 = bVar78 | bVar60 | bVar43 | bVar27;
      bVar79 = bVar79 | bVar61 | bVar44 | bVar28;
      bVar82 = bVar82 | bVar63 | bVar45 | bVar29;
      bVar83 = bVar83 | bVar64 | bVar46 | bVar30;
      bVar84 = bVar84 | bVar65 | bVar47 | bVar31;
      bVar85 = bVar85 | bVar66 | bVar48 | bVar32;
      bVar86 = bVar86 | bVar67 | bVar49 | bVar33;
      bVar87 = bVar87 | bVar68 | bVar50 | bVar34;
      bVar88 = bVar88 | bVar69 | bVar51 | bVar35;
      auVar102[1] = bVar72;
      auVar102[0] = bVar70;
      auVar102[2] = bVar73;
      auVar102[3] = bVar74;
      auVar102[4] = bVar75;
      auVar102[5] = bVar76;
      auVar102[6] = bVar77;
      auVar102[7] = bVar78;
      auVar102[8] = bVar79;
      auVar102[9] = bVar82;
      auVar102[10] = bVar83;
      auVar102[0xb] = bVar84;
      auVar102[0xc] = bVar85;
      auVar102[0xd] = bVar86;
      auVar102[0xe] = bVar87;
      auVar102[0xf] = bVar88;
      auVar1[1] = bVar72;
      auVar1[0] = bVar70;
      auVar1[2] = bVar73;
      auVar1[3] = bVar74;
      auVar1[4] = bVar75;
      auVar1[5] = bVar76;
      auVar1[6] = bVar77;
      auVar1[7] = bVar78;
      auVar1[8] = bVar79;
      auVar1[9] = bVar82;
      auVar1[10] = bVar83;
      auVar1[0xb] = bVar84;
      auVar1[0xc] = bVar85;
      auVar1[0xd] = bVar86;
      auVar1[0xe] = bVar87;
      auVar1[0xf] = bVar88;
      auVar102 = NEON_ext(auVar102,auVar1,8,1);
      uVar13 = CONCAT17(bVar78 | auVar102[7],
                        CONCAT16(bVar77 | auVar102[6],
                                 CONCAT15(bVar76 | auVar102[5],
                                          CONCAT14(bVar75 | auVar102[4],
                                                   CONCAT13(bVar74 | auVar102[3],
                                                            CONCAT12(bVar73 | auVar102[2],
                                                                     CONCAT11(bVar72 | auVar102[1],
                                                                              bVar70 | auVar102[0]))
                                                           )))));
      if (uVar10 != uVar3) goto LAB_002a6a54;
    }
    if (uVar13 == 0) goto LAB_002a6a70;
  }
  auVar102 = func_0x0079de7c();
  uVar53 = auVar102._0_8_;
  *auVar102._8_8_ = 0;
  if (((*(int *)(param_4 + 0x10) != 0) || (*(int *)(param_5 + 0x28) != 0)) ||
     (iVar2 = func_0x0029d99c(*(undefined8 *)param_4,(long)*(int *)(param_4 + 8),
                              *(undefined8 *)(param_5 + 0x18),(long)*(int *)(param_5 + 0x20)),
     -1 < iVar2)) {
    func_0x0028f83c(3,0,0x6b,"/aws-lc/crypto/fipsmodule/bn/gcd.c",0x14e);
    return 0;
  }
  uStack_58 = 0;
  uStack_50 = 0;
  uStack_48 = 0;
  iVar2 = func_0x0029afb8(&uStack_58,(long)*(int *)(param_5 + 0x20));
  if ((iVar2 != 0) &&
     (iVar2 = func_0x002afddc(uStack_58,1,*(undefined8 *)(param_5 + 0x18),
                              (long)*(int *)(param_5 + 0x20),&UNK_008310d0), iVar2 != 0)) {
    uStack_48 = uStack_48 & 0xffffffff00000000;
    uStack_50 = CONCAT44(uStack_50._4_4_,*(undefined4 *)(param_5 + 0x20));
    iVar2 = func_0x002a3110(uVar53,&uStack_58,param_4,param_5,param_6);
    if ((iVar2 != 0) &&
       (iVar2 = func_0x002a50c8(uVar53,auVar102._8_8_,uVar53,param_5 + 0x18,param_6), iVar2 != 0)) {
      uVar3 = func_0x002a3110(uVar53,&uStack_58,uVar53,param_5,param_6);
      goto code_r0x002a6c38;
    }
  }
  uVar3 = 0;
code_r0x002a6c38:
  if ((uStack_48._4_4_ >> 1 & 1) == 0) {
    func_0x0036e3d8(uStack_58);
  }
  if ((uStack_48._4_4_ & 1) != 0) {
    func_0x0036e3d8(&uStack_58);
  }
  return uVar3;
}

