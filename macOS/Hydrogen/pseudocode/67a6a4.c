
long FUN_0067a6a4(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  long lVar5;
  ulong *puVar6;
  ulong *puVar7;
  ulong uVar8;
  uint uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  uint uVar13;
  ulong *puVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  int iVar18;
  long unaff_x20;
  int iVar19;
  ulong *unaff_x21;
  ulong *puVar20;
  ulong *unaff_x23;
  ulong *unaff_x24;
  uint uVar21;
  ulong unaff_x26;
  ulong *unaff_x27;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong in_stack_00000000;
  
  _memcpy();
  uVar21 = 0;
  uVar10 = 1;
  puVar20 = unaff_x21;
code_r0x0067a6b8:
  do {
    uVar17 = *unaff_x24;
    if (uVar17 == 0) {
      uVar16 = (ulong)(unaff_x26 != 0);
      uVar15 = uVar10;
      do {
        if (unaff_x26 != 0) {
          if (unaff_x26 != 1) {
            lVar11 = 0;
            lVar5 = 1;
            lVar4 = unaff_x26 - uVar16;
            puVar6 = unaff_x24;
            do {
              *puVar6 = unaff_x24[lVar5];
              lVar11 = lVar11 + 1;
              lVar5 = lVar11 + uVar16;
              lVar4 = lVar4 + -1;
              puVar6 = puVar6 + 1;
            } while (lVar4 != 0);
          }
          unaff_x24[unaff_x26 - (unaff_x26 != 0)] = 0;
        }
        uVar17 = (ulong)(unaff_x27[uVar15 - 1] != 0);
        uVar10 = uVar15;
        if (unaff_x27[uVar15 - 1] != 0) {
          uVar10 = uVar15 + 1;
        }
        uVar22 = (ulong)(uVar10 != 0);
        if (uVar10 != 0) {
          uVar8 = uVar10 - 1;
          if (uVar22 <= uVar8) {
            uVar25 = (uVar15 - 1) + uVar17;
            if (0x29 < uVar25) {
              uVar17 = (uVar15 + uVar17) - 2;
              puVar6 = unaff_x27 + (uVar10 - 1);
              if ((puVar6 + -uVar17 <= puVar6 && puVar6 + -1 + -uVar17 <= puVar6 + -1) &&
                  uVar17 >> 0x3d == 0) {
                uVar15 = uVar25 & 0xfffffffffffffff8;
                uVar8 = uVar8 - uVar15;
                puVar6 = unaff_x27 + (uVar10 - 4);
                uVar17 = uVar15;
                do {
                  puVar14 = puVar6 + -uVar22;
                  uVar24 = *puVar14;
                  uVar23 = puVar14[3];
                  uVar12 = puVar14[2];
                  uVar29 = puVar14[-3];
                  uVar28 = puVar14[-4];
                  uVar27 = puVar14[-1];
                  uVar26 = puVar14[-2];
                  puVar6[1] = puVar14[1];
                  *puVar6 = uVar24;
                  puVar6[3] = uVar23;
                  puVar6[2] = uVar12;
                  puVar6[-3] = uVar29;
                  puVar6[-4] = uVar28;
                  puVar6[-1] = uVar27;
                  puVar6[-2] = uVar26;
                  puVar6 = puVar6 + -8;
                  uVar17 = uVar17 - 8;
                } while (uVar17 != 0);
                if (uVar25 == uVar15) goto code_r0x0067a918;
              }
            }
            do {
              unaff_x27[uVar8] = unaff_x27[uVar8 - uVar22];
              uVar8 = uVar8 - 1;
            } while (uVar22 <= uVar8);
          }
code_r0x0067a918:
          *unaff_x27 = 0;
        }
        uVar21 = uVar21 + 0x40;
        uVar17 = *unaff_x24;
        uVar15 = uVar10;
      } while (uVar17 == 0);
    }
    uVar9 = 0;
    if ((uVar17 & 1) == 0) {
      uVar15 = uVar17;
      do {
        uVar17 = uVar15 >> 1;
        uVar9 = uVar9 + 1;
        uVar13 = (uint)uVar15;
        uVar15 = uVar17;
      } while ((uVar13 >> 1 & 1) == 0);
    }
    uVar21 = uVar9 + uVar21;
    if (uVar17 == 1) {
      uVar17 = unaff_x26;
      do {
        if (uVar17 == 0) goto code_r0x0067a710;
        uVar15 = uVar17 - 1;
        lVar11 = uVar17 - 1;
        uVar17 = uVar15;
      } while (unaff_x24[lVar11] == 0);
      if (uVar15 == 0) break;
    }
code_r0x0067a710:
    if (uVar9 == 1) {
      if (unaff_x26 != 0) {
        uVar15 = 0;
        uVar17 = unaff_x26;
        do {
          uVar16 = unaff_x24[uVar17 - 1];
          unaff_x24[uVar17 - 1] = uVar15 | uVar16 >> 1;
          uVar15 = uVar16 << 0x3f;
          uVar17 = uVar17 - 1;
        } while (uVar17 != 0);
      }
      if (uVar10 != 0) {
        uVar15 = 0;
        puVar6 = unaff_x27;
        uVar17 = uVar10;
        do {
          uVar16 = *puVar6;
          *puVar6 = uVar15 | uVar16 << 1;
          uVar15 = uVar16 >> 0x3f;
          uVar17 = uVar17 - 1;
          puVar6 = puVar6 + 1;
        } while (uVar17 != 0);
        goto code_r0x0067a7e4;
      }
      uVar10 = 0;
      uVar17 = unaff_x24[unaff_x26 - 1];
    }
    else {
      if ((unaff_x26 != 0) && (uVar9 != 0)) {
        uVar15 = 0;
        uVar17 = unaff_x26;
        do {
          uVar16 = unaff_x24[uVar17 - 1] >> ((ulong)uVar9 & 0x3f) | uVar15;
          uVar15 = unaff_x24[uVar17 - 1] << ((ulong)(0x40 - uVar9) & 0x3f);
          unaff_x24[uVar17 - 1] = uVar16;
          uVar17 = uVar17 - 1;
        } while (uVar17 != 0);
      }
      if ((uVar10 != 0) && (uVar9 != 0)) {
        uVar15 = 0;
        puVar6 = unaff_x27;
        uVar17 = uVar10;
        do {
          uVar16 = *puVar6;
          *puVar6 = uVar16 << ((ulong)uVar9 & 0x3f) | uVar15;
          uVar15 = uVar16 >> ((ulong)(0x40 - uVar9) & 0x3f);
          uVar17 = uVar17 - 1;
          puVar6 = puVar6 + 1;
        } while (uVar17 != 0);
code_r0x0067a7e4:
        if (uVar15 != 0) {
          unaff_x27[uVar10] = uVar15;
          uVar10 = uVar10 + 1;
          uVar17 = unaff_x24[unaff_x26 - 1];
          goto joined_r0x0067aa38;
        }
      }
      uVar17 = unaff_x24[unaff_x26 - 1];
    }
joined_r0x0067aa38:
    lVar11 = unaff_x26 - 1;
    uVar15 = unaff_x26;
    if (uVar17 == 0) {
      uVar15 = unaff_x26 - 1;
      if (unaff_x23[unaff_x26 - 1] != 0) {
        uVar15 = unaff_x26;
      }
      lVar11 = uVar15 - 1;
      uVar17 = unaff_x24[lVar11];
    }
    puVar6 = unaff_x23;
    puVar14 = unaff_x27;
    if (uVar17 < unaff_x23[lVar11]) {
      puVar6 = unaff_x24;
      unaff_x24 = unaff_x23;
      puVar14 = puVar20;
      puVar20 = unaff_x27;
    }
    unaff_x27 = puVar14;
    if (uVar15 != 0) {
      if ((uVar15 < 8) || ((unaff_x24 < puVar6 + uVar15 && (puVar6 < unaff_x24 + uVar15)))) {
        uVar17 = 0;
      }
      else {
        uVar17 = uVar15 & 0xfffffffffffffff8;
        puVar14 = puVar6 + 4;
        puVar7 = unaff_x24 + 4;
        uVar16 = uVar17;
        do {
          uVar8 = puVar14[-3];
          uVar22 = puVar14[-4];
          uVar12 = puVar14[-1];
          uVar25 = puVar14[-2];
          uVar24 = puVar14[1];
          uVar23 = *puVar14;
          uVar27 = puVar14[3];
          uVar26 = puVar14[2];
          uVar29 = puVar7[-3];
          uVar28 = puVar7[-4];
          uVar31 = puVar7[-1];
          uVar30 = puVar7[-2];
          uVar33 = puVar7[1];
          uVar32 = *puVar7;
          uVar35 = puVar7[3];
          uVar34 = puVar7[2];
          puVar7[-3] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar8 >> 0x38),
                                CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar8 >> 0x30),
                                         CONCAT15((byte)(uVar29 >> 0x28) ^ (byte)(uVar8 >> 0x28),
                                                  CONCAT14((byte)(uVar29 >> 0x20) ^
                                                           (byte)(uVar8 >> 0x20),
                                                           CONCAT13((byte)(uVar29 >> 0x18) ^
                                                                    (byte)(uVar8 >> 0x18),
                                                                    CONCAT12((byte)(uVar29 >> 0x10)
                                                                             ^ (byte)(uVar8 >> 0x10)
                                                                             ,CONCAT11((byte)(uVar29
                                                                                             >> 8) ^
                                                                                       (byte)(uVar8 
                                                  >> 8),(byte)uVar29 ^ (byte)uVar8)))))));
          puVar7[-4] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar22 >> 0x38),
                                CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar22 >> 0x30),
                                         CONCAT15((byte)(uVar28 >> 0x28) ^ (byte)(uVar22 >> 0x28),
                                                  CONCAT14((byte)(uVar28 >> 0x20) ^
                                                           (byte)(uVar22 >> 0x20),
                                                           CONCAT13((byte)(uVar28 >> 0x18) ^
                                                                    (byte)(uVar22 >> 0x18),
                                                                    CONCAT12((byte)(uVar28 >> 0x10)
                                                                             ^ (byte)(uVar22 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar28 
                                                  >> 8) ^ (byte)(uVar22 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar22)))))));
          puVar7[-1] = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar12 >> 0x38),
                                CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar12 >> 0x30),
                                         CONCAT15((byte)(uVar31 >> 0x28) ^ (byte)(uVar12 >> 0x28),
                                                  CONCAT14((byte)(uVar31 >> 0x20) ^
                                                           (byte)(uVar12 >> 0x20),
                                                           CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                    (byte)(uVar12 >> 0x18),
                                                                    CONCAT12((byte)(uVar31 >> 0x10)
                                                                             ^ (byte)(uVar12 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar31 
                                                  >> 8) ^ (byte)(uVar12 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar12)))))));
          puVar7[-2] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar25 >> 0x30),
                                         CONCAT15((byte)(uVar30 >> 0x28) ^ (byte)(uVar25 >> 0x28),
                                                  CONCAT14((byte)(uVar30 >> 0x20) ^
                                                           (byte)(uVar25 >> 0x20),
                                                           CONCAT13((byte)(uVar30 >> 0x18) ^
                                                                    (byte)(uVar25 >> 0x18),
                                                                    CONCAT12((byte)(uVar30 >> 0x10)
                                                                             ^ (byte)(uVar25 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar30 
                                                  >> 8) ^ (byte)(uVar25 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar25)))))));
          puVar7[1] = CONCAT17((byte)(uVar33 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                               CONCAT16((byte)(uVar33 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                        CONCAT15((byte)(uVar33 >> 0x28) ^ (byte)(uVar24 >> 0x28),
                                                 CONCAT14((byte)(uVar33 >> 0x20) ^
                                                          (byte)(uVar24 >> 0x20),
                                                          CONCAT13((byte)(uVar33 >> 0x18) ^
                                                                   (byte)(uVar24 >> 0x18),
                                                                   CONCAT12((byte)(uVar33 >> 0x10) ^
                                                                            (byte)(uVar24 >> 0x10),
                                                                            CONCAT11((byte)(uVar33 
                                                  >> 8) ^ (byte)(uVar24 >> 8),
                                                  (byte)uVar33 ^ (byte)uVar24)))))));
          *puVar7 = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                             CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                      CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar23 >> 0x28),
                                               CONCAT14((byte)(uVar32 >> 0x20) ^
                                                        (byte)(uVar23 >> 0x20),
                                                        CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                 (byte)(uVar23 >> 0x18),
                                                                 CONCAT12((byte)(uVar32 >> 0x10) ^
                                                                          (byte)(uVar23 >> 0x10),
                                                                          CONCAT11((byte)(uVar32 >>
                                                                                         8) ^
                                                                                   (byte)(uVar23 >>
                                                                                         8),(byte)
                                                  uVar32 ^ (byte)uVar23)))))));
          puVar7[3] = CONCAT17((byte)(uVar35 >> 0x38) ^ (byte)(uVar27 >> 0x38),
                               CONCAT16((byte)(uVar35 >> 0x30) ^ (byte)(uVar27 >> 0x30),
                                        CONCAT15((byte)(uVar35 >> 0x28) ^ (byte)(uVar27 >> 0x28),
                                                 CONCAT14((byte)(uVar35 >> 0x20) ^
                                                          (byte)(uVar27 >> 0x20),
                                                          CONCAT13((byte)(uVar35 >> 0x18) ^
                                                                   (byte)(uVar27 >> 0x18),
                                                                   CONCAT12((byte)(uVar35 >> 0x10) ^
                                                                            (byte)(uVar27 >> 0x10),
                                                                            CONCAT11((byte)(uVar35 
                                                  >> 8) ^ (byte)(uVar27 >> 8),
                                                  (byte)uVar35 ^ (byte)uVar27)))))));
          puVar7[2] = CONCAT17((byte)(uVar34 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                               CONCAT16((byte)(uVar34 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                        CONCAT15((byte)(uVar34 >> 0x28) ^ (byte)(uVar26 >> 0x28),
                                                 CONCAT14((byte)(uVar34 >> 0x20) ^
                                                          (byte)(uVar26 >> 0x20),
                                                          CONCAT13((byte)(uVar34 >> 0x18) ^
                                                                   (byte)(uVar26 >> 0x18),
                                                                   CONCAT12((byte)(uVar34 >> 0x10) ^
                                                                            (byte)(uVar26 >> 0x10),
                                                                            CONCAT11((byte)(uVar34 
                                                  >> 8) ^ (byte)(uVar26 >> 8),
                                                  (byte)uVar34 ^ (byte)uVar26)))))));
          uVar16 = uVar16 - 8;
          puVar14 = puVar14 + 8;
          puVar7 = puVar7 + 8;
        } while (uVar16 != 0);
        if (uVar15 == uVar17) goto code_r0x0067a890;
      }
      lVar11 = uVar15 - uVar17;
      puVar14 = unaff_x24 + uVar17;
      puVar7 = puVar6 + uVar17;
      do {
        *puVar14 = *puVar14 ^ *puVar7;
        lVar11 = lVar11 + -1;
        puVar14 = puVar14 + 1;
        puVar7 = puVar7 + 1;
      } while (lVar11 != 0);
    }
code_r0x0067a890:
    unaff_x23 = puVar6;
    unaff_x26 = uVar15;
    if (uVar10 != 0) {
      if ((uVar10 < 8) || ((puVar20 < unaff_x27 + uVar10 && (unaff_x27 < puVar20 + uVar10)))) {
        uVar17 = 0;
      }
      else {
        uVar17 = uVar10 & 0xfffffffffffffff8;
        puVar6 = unaff_x27 + 4;
        puVar14 = puVar20 + 4;
        uVar15 = uVar17;
        do {
          uVar22 = puVar6[-3];
          uVar16 = puVar6[-4];
          uVar25 = puVar6[-1];
          uVar8 = puVar6[-2];
          uVar23 = puVar6[1];
          uVar12 = *puVar6;
          uVar26 = puVar6[3];
          uVar24 = puVar6[2];
          uVar28 = puVar14[-3];
          uVar27 = puVar14[-4];
          uVar30 = puVar14[-1];
          uVar29 = puVar14[-2];
          uVar32 = puVar14[1];
          uVar31 = *puVar14;
          uVar34 = puVar14[3];
          uVar33 = puVar14[2];
          puVar14[-3] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar22 >> 0x38),
                                 CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar22 >> 0x30),
                                          CONCAT15((byte)(uVar28 >> 0x28) ^ (byte)(uVar22 >> 0x28),
                                                   CONCAT14((byte)(uVar28 >> 0x20) ^
                                                            (byte)(uVar22 >> 0x20),
                                                            CONCAT13((byte)(uVar28 >> 0x18) ^
                                                                     (byte)(uVar22 >> 0x18),
                                                                     CONCAT12((byte)(uVar28 >> 0x10)
                                                                              ^ (byte)(uVar22 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar28
                                                                                             >> 8) ^
                                                                                       (byte)(uVar22
                                                                                             >> 8),
                                                                                       (byte)uVar28
                                                                                       ^ (byte)
                                                  uVar22)))))));
          puVar14[-4] = CONCAT17((byte)(uVar27 >> 0x38) ^ (byte)(uVar16 >> 0x38),
                                 CONCAT16((byte)(uVar27 >> 0x30) ^ (byte)(uVar16 >> 0x30),
                                          CONCAT15((byte)(uVar27 >> 0x28) ^ (byte)(uVar16 >> 0x28),
                                                   CONCAT14((byte)(uVar27 >> 0x20) ^
                                                            (byte)(uVar16 >> 0x20),
                                                            CONCAT13((byte)(uVar27 >> 0x18) ^
                                                                     (byte)(uVar16 >> 0x18),
                                                                     CONCAT12((byte)(uVar27 >> 0x10)
                                                                              ^ (byte)(uVar16 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar27
                                                                                             >> 8) ^
                                                                                       (byte)(uVar16
                                                                                             >> 8),
                                                                                       (byte)uVar27
                                                                                       ^ (byte)
                                                  uVar16)))))));
          puVar14[-1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                 CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar25 >> 0x30),
                                          CONCAT15((byte)(uVar30 >> 0x28) ^ (byte)(uVar25 >> 0x28),
                                                   CONCAT14((byte)(uVar30 >> 0x20) ^
                                                            (byte)(uVar25 >> 0x20),
                                                            CONCAT13((byte)(uVar30 >> 0x18) ^
                                                                     (byte)(uVar25 >> 0x18),
                                                                     CONCAT12((byte)(uVar30 >> 0x10)
                                                                              ^ (byte)(uVar25 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar30
                                                                                             >> 8) ^
                                                                                       (byte)(uVar25
                                                                                             >> 8),
                                                                                       (byte)uVar30
                                                                                       ^ (byte)
                                                  uVar25)))))));
          puVar14[-2] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar8 >> 0x38),
                                 CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar8 >> 0x30),
                                          CONCAT15((byte)(uVar29 >> 0x28) ^ (byte)(uVar8 >> 0x28),
                                                   CONCAT14((byte)(uVar29 >> 0x20) ^
                                                            (byte)(uVar8 >> 0x20),
                                                            CONCAT13((byte)(uVar29 >> 0x18) ^
                                                                     (byte)(uVar8 >> 0x18),
                                                                     CONCAT12((byte)(uVar29 >> 0x10)
                                                                              ^ (byte)(uVar8 >> 0x10
                                                                                      ),
                                                                              CONCAT11((byte)(uVar29
                                                                                             >> 8) ^
                                                                                       (byte)(uVar8 
                                                  >> 8),(byte)uVar29 ^ (byte)uVar8)))))));
          puVar14[1] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                                CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                         CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar23 >> 0x28),
                                                  CONCAT14((byte)(uVar32 >> 0x20) ^
                                                           (byte)(uVar23 >> 0x20),
                                                           CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                    (byte)(uVar23 >> 0x18),
                                                                    CONCAT12((byte)(uVar32 >> 0x10)
                                                                             ^ (byte)(uVar23 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar32 
                                                  >> 8) ^ (byte)(uVar23 >> 8),
                                                  (byte)uVar32 ^ (byte)uVar23)))))));
          *puVar14 = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar12 >> 0x38),
                              CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar12 >> 0x30),
                                       CONCAT15((byte)(uVar31 >> 0x28) ^ (byte)(uVar12 >> 0x28),
                                                CONCAT14((byte)(uVar31 >> 0x20) ^
                                                         (byte)(uVar12 >> 0x20),
                                                         CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                  (byte)(uVar12 >> 0x18),
                                                                  CONCAT12((byte)(uVar31 >> 0x10) ^
                                                                           (byte)(uVar12 >> 0x10),
                                                                           CONCAT11((byte)(uVar31 >>
                                                                                          8) ^
                                                                                    (byte)(uVar12 >>
                                                                                          8),(byte)
                                                  uVar31 ^ (byte)uVar12)))))));
          puVar14[3] = CONCAT17((byte)(uVar34 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                                CONCAT16((byte)(uVar34 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                         CONCAT15((byte)(uVar34 >> 0x28) ^ (byte)(uVar26 >> 0x28),
                                                  CONCAT14((byte)(uVar34 >> 0x20) ^
                                                           (byte)(uVar26 >> 0x20),
                                                           CONCAT13((byte)(uVar34 >> 0x18) ^
                                                                    (byte)(uVar26 >> 0x18),
                                                                    CONCAT12((byte)(uVar34 >> 0x10)
                                                                             ^ (byte)(uVar26 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar34 
                                                  >> 8) ^ (byte)(uVar26 >> 8),
                                                  (byte)uVar34 ^ (byte)uVar26)))))));
          puVar14[2] = CONCAT17((byte)(uVar33 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                CONCAT16((byte)(uVar33 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                         CONCAT15((byte)(uVar33 >> 0x28) ^ (byte)(uVar24 >> 0x28),
                                                  CONCAT14((byte)(uVar33 >> 0x20) ^
                                                           (byte)(uVar24 >> 0x20),
                                                           CONCAT13((byte)(uVar33 >> 0x18) ^
                                                                    (byte)(uVar24 >> 0x18),
                                                                    CONCAT12((byte)(uVar33 >> 0x10)
                                                                             ^ (byte)(uVar24 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar33 
                                                  >> 8) ^ (byte)(uVar24 >> 8),
                                                  (byte)uVar33 ^ (byte)uVar24)))))));
          uVar15 = uVar15 - 8;
          puVar6 = puVar6 + 8;
          puVar14 = puVar14 + 8;
        } while (uVar15 != 0);
        if (uVar10 == uVar17) goto code_r0x0067a6b8;
      }
      lVar11 = uVar10 - uVar17;
      puVar6 = puVar20 + uVar17;
      puVar14 = unaff_x27 + uVar17;
      do {
        *puVar6 = *puVar6 ^ *puVar14;
        lVar11 = lVar11 + -1;
        puVar6 = puVar6 + 1;
        puVar14 = puVar14 + 1;
      } while (lVar11 != 0);
    }
  } while( true );
  if (0x3f < uVar21) {
    uVar13 = *(uint *)(unaff_x20 + 0x90);
    uVar10 = (ulong)uVar13 + 0x3f >> 6;
    lVar11 = uVar10 - 1;
    uVar1 = *(uint *)(unaff_x20 + 0x98);
    uVar16 = (ulong)uVar1 & 0x3f;
    uVar2 = uVar1 >> 6;
    uVar17 = (ulong)(uVar2 - 1);
    uVar9 = 0x40 - uVar1;
    iVar19 = (int)uVar16;
    uVar15 = (ulong)*(uint *)(unaff_x20 + 0x94) & 0x3f;
    uVar3 = *(uint *)(unaff_x20 + 0x94) >> 6;
    puVar6 = puVar20 + (uVar3 - 1);
    iVar18 = (int)uVar15;
    puVar14 = puVar20 + uVar3;
    if (uVar10 < 3) {
      uVar10 = 2;
    }
    if (uVar9 < 2) {
      uVar9 = 1;
    }
    puVar7 = (ulong *)(uVar17 * 8);
    do {
      while( true ) {
        uVar22 = *puVar20;
        if (0x40 < uVar13) {
          _memmove(puVar7,puVar20,puVar20 + 1,uVar10 * 8 + -8);
        }
        puVar20[lVar11] = 0;
        if (uVar1 < 0x40) {
          uVar8 = 0;
          do {
            uVar25 = uVar1 + uVar8;
            uVar12 = (uVar22 >> (uVar8 & 0x3f) & 1) << (uVar25 & 0x3f);
            if (0x3f < (uint)uVar25) {
              uVar12 = 0;
            }
            uVar22 = uVar12 ^ uVar22;
            uVar8 = uVar8 + 1;
          } while (uVar9 != uVar8);
        }
        else {
          puVar20[uVar17] = puVar20[uVar17] ^ uVar22 << uVar16;
        }
        if (iVar19 != 0) {
          puVar20[uVar2] = puVar20[uVar2] ^ uVar22 >> ((ulong)(0x40 - iVar19) & 0x3f);
        }
        if (iVar18 != 0) break;
        *puVar6 = *puVar6 ^ uVar22;
        uVar21 = uVar21 - 0x40;
        puVar7 = puVar6;
        if (uVar21 < 0x40) goto LAB_0067ac58;
      }
      *puVar6 = *puVar6 ^ uVar22 << uVar15;
      *puVar14 = *puVar14 ^ uVar22 >> ((ulong)(0x40 - iVar18) & 0x3f);
      uVar21 = uVar21 - 0x40;
      puVar7 = puVar14;
    } while (0x3f < uVar21);
  }
LAB_0067ac58:
  if (uVar21 != 0) {
    uVar10 = *puVar20 << ((ulong)-uVar21 & 0x3f);
    if (*(uint *)(unaff_x20 + 0x90) != 0) {
      uVar15 = 0;
      uVar17 = (ulong)*(uint *)(unaff_x20 + 0x90) + 0x3f >> 3 & 0x3ffffff8;
      do {
        uVar16 = *(ulong *)((long)puVar20 + (uVar17 - 8));
        *(ulong *)((long)puVar20 + (uVar17 - 8)) = uVar16 >> ((ulong)uVar21 & 0x3f) | uVar15;
        uVar15 = uVar16 << ((ulong)(0x40 - uVar21) & 0x3f);
        uVar17 = uVar17 - 8;
      } while (uVar17 != 0);
    }
    uVar21 = *(uint *)(unaff_x20 + 0x98);
    uVar17 = (ulong)uVar21;
    if (uVar21 < 0x40) {
      uVar15 = 0;
      do {
        uVar16 = (uVar10 >> (uVar15 & 0x3f) & 1) << (uVar17 + uVar15 & 0x3f);
        if (0x3f < (uint)(uVar17 + uVar15)) {
          uVar16 = 0;
        }
        uVar10 = uVar16 ^ uVar10;
        uVar15 = uVar15 + 1;
      } while (0x40 - uVar17 != uVar15);
    }
    else {
      uVar9 = (uVar21 >> 6) - 1;
      puVar20[uVar9] = puVar20[uVar9] ^ uVar10 << (uVar17 & 0x3f);
    }
    if ((uVar21 & 0x3f) != 0) {
      uVar17 = (ulong)(uVar21 >> 3) & 0x1ffffff8;
      *(ulong *)((long)puVar20 + uVar17) =
           *(ulong *)((long)puVar20 + uVar17) ^ uVar10 >> ((ulong)-(uVar21 & 0x3f) & 0x3f);
    }
    uVar21 = *(uint *)(unaff_x20 + 0x94);
    uVar9 = uVar21 & 0x3f;
    if (uVar9 == 0) {
      uVar21 = (uVar21 >> 6) - 1;
    }
    else {
      uVar21 = uVar21 >> 6;
      puVar20[uVar21 - 1] = puVar20[uVar21 - 1] ^ uVar10 << uVar9;
      uVar10 = uVar10 >> ((ulong)-uVar9 & 0x3f);
    }
    puVar20[uVar21] = puVar20[uVar21] ^ uVar10;
  }
  if (*(ulong **)(unaff_x20 + 0xb8) != puVar20) {
    _memcpy(*(ulong **)(unaff_x20 + 0xb8),puVar20,*(long *)(unaff_x20 + 0xb0) << 3);
  }
  if (0x1ffffffffffffffe < in_stack_00000000) {
    in_stack_00000000 = 0x1fffffffffffffff;
  }
  for (; in_stack_00000000 != 0; in_stack_00000000 = in_stack_00000000 - 1) {
    unaff_x21[in_stack_00000000 - 1] = 0;
  }
  func_0x00611644(unaff_x21);
  return unaff_x20 + 0xa0;
}

