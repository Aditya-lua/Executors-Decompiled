
long FUN_0067ae08(long param_1,long param_2,long param_3)

{
  uint uVar1;
  uint uVar2;
  ulong *puVar3;
  long lVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong *puVar9;
  ulong uVar10;
  long lVar11;
  ulong *puVar12;
  int iVar13;
  ulong uVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  ulong uVar21;
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
  
  uVar17 = *(ulong *)(param_1 + 0xb0);
  if (*(ulong *)(param_2 + 0x10) <= *(ulong *)(param_1 + 0xb0)) {
    uVar17 = *(ulong *)(param_2 + 0x10);
  }
  uVar1 = *(uint *)(param_1 + 0x90);
  uVar21 = (ulong)uVar1 + 0x3f >> 6;
  func_0x006108a0(uVar21);
  lVar20 = uVar21 * 8;
  if (uVar1 == 0) {
    puVar3 = (ulong *)0x0;
    uVar2 = *(uint *)(param_1 + 0x90);
  }
  else {
    puVar3 = (ulong *)func_0x006115d0(lVar20);
    *puVar3 = 0;
    if (uVar21 != 1) {
      _bzero(puVar3 + 1,lVar20 + -8);
    }
    uVar2 = *(uint *)(param_1 + 0x90);
  }
  uVar15 = uVar2 - 1;
  if (-1 < (int)uVar15) {
    uVar14 = (ulong)uVar15;
    lVar11 = *(long *)(param_3 + 0x18);
    puVar12 = *(ulong **)(param_2 + 0x18);
    if (uVar15 >> 6 < uVar21) {
      uVar16 = uVar14 & 0x3f;
      uVar18 = uVar21 & 0x7fffff8;
      uVar19 = uVar17 & 0xfffffffffffffff8;
      do {
        if ((puVar3[uVar15 >> 6] & 1L << uVar16) == 0) {
          uVar8 = 0;
          puVar5 = puVar3;
          uVar6 = uVar21;
          do {
            uVar10 = *puVar5;
            *puVar5 = uVar8 | uVar10 << 1;
            uVar8 = uVar10 >> 0x3f;
            uVar6 = uVar6 - 1;
            puVar5 = puVar5 + 1;
          } while (uVar6 != 0);
        }
        else {
          lVar4 = 0;
          uVar6 = 0;
          do {
            uVar8 = *(ulong *)((long)puVar3 + lVar4);
            *(ulong *)((long)puVar3 + lVar4) = uVar6 | uVar8 << 1;
            uVar6 = uVar8 >> 0x3f;
            lVar4 = lVar4 + 8;
          } while (lVar20 != lVar4);
          puVar5 = *(ulong **)(param_1 + 0x88);
          if ((uVar1 < 0x1c1) || (puVar3 < puVar5 + uVar21 && puVar5 < puVar3 + uVar21)) {
            uVar6 = 0;
          }
          else {
            puVar7 = puVar5 + 4;
            puVar9 = puVar3 + 4;
            uVar6 = uVar18;
            do {
              uVar10 = puVar7[-3];
              uVar8 = puVar7[-4];
              uVar23 = puVar7[-1];
              uVar22 = puVar7[-2];
              uVar25 = puVar7[1];
              uVar24 = *puVar7;
              uVar27 = puVar7[3];
              uVar26 = puVar7[2];
              uVar29 = puVar9[-3];
              uVar28 = puVar9[-4];
              uVar31 = puVar9[-1];
              uVar30 = puVar9[-2];
              uVar33 = puVar9[1];
              uVar32 = *puVar9;
              uVar35 = puVar9[3];
              uVar34 = puVar9[2];
              puVar9[-3] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar10 >> 0x38),
                                    CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar10 >> 0x30),
                                             CONCAT15((byte)(uVar29 >> 0x28) ^
                                                      (byte)(uVar10 >> 0x28),
                                                      CONCAT14((byte)(uVar29 >> 0x20) ^
                                                               (byte)(uVar10 >> 0x20),
                                                               CONCAT13((byte)(uVar29 >> 0x18) ^
                                                                        (byte)(uVar10 >> 0x18),
                                                                        CONCAT12((byte)(uVar29 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar10 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar29 >> 8) ^ (byte)(uVar10 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar10)))))));
              puVar9[-4] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar8 >> 0x38),
                                    CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar8 >> 0x30),
                                             CONCAT15((byte)(uVar28 >> 0x28) ^ (byte)(uVar8 >> 0x28)
                                                      ,CONCAT14((byte)(uVar28 >> 0x20) ^
                                                                (byte)(uVar8 >> 0x20),
                                                                CONCAT13((byte)(uVar28 >> 0x18) ^
                                                                         (byte)(uVar8 >> 0x18),
                                                                         CONCAT12((byte)(uVar28 >>
                                                                                        0x10) ^
                                                                                  (byte)(uVar8 >> 
                                                  0x10),CONCAT11((byte)(uVar28 >> 8) ^
                                                                 (byte)(uVar8 >> 8),
                                                                 (byte)uVar28 ^ (byte)uVar8)))))));
              puVar9[-1] = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                                    CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                             CONCAT15((byte)(uVar31 >> 0x28) ^
                                                      (byte)(uVar23 >> 0x28),
                                                      CONCAT14((byte)(uVar31 >> 0x20) ^
                                                               (byte)(uVar23 >> 0x20),
                                                               CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                        (byte)(uVar23 >> 0x18),
                                                                        CONCAT12((byte)(uVar31 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar23 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar31 >> 8) ^ (byte)(uVar23 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar23)))))));
              puVar9[-2] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar22 >> 0x38),
                                    CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar22 >> 0x30),
                                             CONCAT15((byte)(uVar30 >> 0x28) ^
                                                      (byte)(uVar22 >> 0x28),
                                                      CONCAT14((byte)(uVar30 >> 0x20) ^
                                                               (byte)(uVar22 >> 0x20),
                                                               CONCAT13((byte)(uVar30 >> 0x18) ^
                                                                        (byte)(uVar22 >> 0x18),
                                                                        CONCAT12((byte)(uVar30 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar22 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar30 >> 8) ^ (byte)(uVar22 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar22)))))));
              puVar9[1] = CONCAT17((byte)(uVar33 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                   CONCAT16((byte)(uVar33 >> 0x30) ^ (byte)(uVar25 >> 0x30),
                                            CONCAT15((byte)(uVar33 >> 0x28) ^ (byte)(uVar25 >> 0x28)
                                                     ,CONCAT14((byte)(uVar33 >> 0x20) ^
                                                               (byte)(uVar25 >> 0x20),
                                                               CONCAT13((byte)(uVar33 >> 0x18) ^
                                                                        (byte)(uVar25 >> 0x18),
                                                                        CONCAT12((byte)(uVar33 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar25 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar33 >> 8) ^ (byte)(uVar25 >> 8),
                                                  (byte)uVar33 ^ (byte)uVar25)))))));
              *puVar9 = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                 CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                          CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar24 >> 0x28),
                                                   CONCAT14((byte)(uVar32 >> 0x20) ^
                                                            (byte)(uVar24 >> 0x20),
                                                            CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                     (byte)(uVar24 >> 0x18),
                                                                     CONCAT12((byte)(uVar32 >> 0x10)
                                                                              ^ (byte)(uVar24 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar32
                                                                                             >> 8) ^
                                                                                       (byte)(uVar24
                                                                                             >> 8),
                                                                                       (byte)uVar32
                                                                                       ^ (byte)
                                                  uVar24)))))));
              puVar9[3] = CONCAT17((byte)(uVar35 >> 0x38) ^ (byte)(uVar27 >> 0x38),
                                   CONCAT16((byte)(uVar35 >> 0x30) ^ (byte)(uVar27 >> 0x30),
                                            CONCAT15((byte)(uVar35 >> 0x28) ^ (byte)(uVar27 >> 0x28)
                                                     ,CONCAT14((byte)(uVar35 >> 0x20) ^
                                                               (byte)(uVar27 >> 0x20),
                                                               CONCAT13((byte)(uVar35 >> 0x18) ^
                                                                        (byte)(uVar27 >> 0x18),
                                                                        CONCAT12((byte)(uVar35 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar27 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar35 >> 8) ^ (byte)(uVar27 >> 8),
                                                  (byte)uVar35 ^ (byte)uVar27)))))));
              puVar9[2] = CONCAT17((byte)(uVar34 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                                   CONCAT16((byte)(uVar34 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                            CONCAT15((byte)(uVar34 >> 0x28) ^ (byte)(uVar26 >> 0x28)
                                                     ,CONCAT14((byte)(uVar34 >> 0x20) ^
                                                               (byte)(uVar26 >> 0x20),
                                                               CONCAT13((byte)(uVar34 >> 0x18) ^
                                                                        (byte)(uVar26 >> 0x18),
                                                                        CONCAT12((byte)(uVar34 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar26 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar34 >> 8) ^ (byte)(uVar26 >> 8),
                                                  (byte)uVar34 ^ (byte)uVar26)))))));
              uVar6 = uVar6 - 8;
              puVar7 = puVar7 + 8;
              puVar9 = puVar9 + 8;
            } while (uVar6 != 0);
            uVar6 = uVar18;
            if (uVar21 == uVar18) goto code_r0x0067afd8;
          }
          lVar4 = uVar21 - uVar6;
          puVar5 = puVar5 + uVar6;
          puVar7 = puVar3 + uVar6;
          do {
            *puVar7 = *puVar7 ^ *puVar5;
            lVar4 = lVar4 + -1;
            puVar5 = puVar5 + 1;
            puVar7 = puVar7 + 1;
          } while (lVar4 != 0);
        }
code_r0x0067afd8:
        iVar13 = (int)uVar14;
        if (((uVar14 >> 6 < *(ulong *)(param_3 + 0x10)) &&
            ((*(ulong *)(lVar11 + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0)) && (uVar17 != 0)
           ) {
          if (puVar3 < puVar12 + uVar17 && puVar12 < puVar3 + uVar17 || uVar17 < 8) {
            uVar14 = 0;
          }
          else {
            puVar5 = puVar12 + 4;
            puVar7 = puVar3 + 4;
            uVar14 = uVar19;
            do {
              uVar8 = puVar5[-3];
              uVar6 = puVar5[-4];
              uVar22 = puVar5[-1];
              uVar10 = puVar5[-2];
              uVar24 = puVar5[1];
              uVar23 = *puVar5;
              uVar26 = puVar5[3];
              uVar25 = puVar5[2];
              uVar28 = puVar7[-3];
              uVar27 = puVar7[-4];
              uVar30 = puVar7[-1];
              uVar29 = puVar7[-2];
              uVar32 = puVar7[1];
              uVar31 = *puVar7;
              uVar34 = puVar7[3];
              uVar33 = puVar7[2];
              puVar7[-3] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar8 >> 0x38),
                                    CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar8 >> 0x30),
                                             CONCAT15((byte)(uVar28 >> 0x28) ^ (byte)(uVar8 >> 0x28)
                                                      ,CONCAT14((byte)(uVar28 >> 0x20) ^
                                                                (byte)(uVar8 >> 0x20),
                                                                CONCAT13((byte)(uVar28 >> 0x18) ^
                                                                         (byte)(uVar8 >> 0x18),
                                                                         CONCAT12((byte)(uVar28 >>
                                                                                        0x10) ^
                                                                                  (byte)(uVar8 >> 
                                                  0x10),CONCAT11((byte)(uVar28 >> 8) ^
                                                                 (byte)(uVar8 >> 8),
                                                                 (byte)uVar28 ^ (byte)uVar8)))))));
              puVar7[-4] = CONCAT17((byte)(uVar27 >> 0x38) ^ (byte)(uVar6 >> 0x38),
                                    CONCAT16((byte)(uVar27 >> 0x30) ^ (byte)(uVar6 >> 0x30),
                                             CONCAT15((byte)(uVar27 >> 0x28) ^ (byte)(uVar6 >> 0x28)
                                                      ,CONCAT14((byte)(uVar27 >> 0x20) ^
                                                                (byte)(uVar6 >> 0x20),
                                                                CONCAT13((byte)(uVar27 >> 0x18) ^
                                                                         (byte)(uVar6 >> 0x18),
                                                                         CONCAT12((byte)(uVar27 >>
                                                                                        0x10) ^
                                                                                  (byte)(uVar6 >> 
                                                  0x10),CONCAT11((byte)(uVar27 >> 8) ^
                                                                 (byte)(uVar6 >> 8),
                                                                 (byte)uVar27 ^ (byte)uVar6)))))));
              puVar7[-1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar22 >> 0x38),
                                    CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar22 >> 0x30),
                                             CONCAT15((byte)(uVar30 >> 0x28) ^
                                                      (byte)(uVar22 >> 0x28),
                                                      CONCAT14((byte)(uVar30 >> 0x20) ^
                                                               (byte)(uVar22 >> 0x20),
                                                               CONCAT13((byte)(uVar30 >> 0x18) ^
                                                                        (byte)(uVar22 >> 0x18),
                                                                        CONCAT12((byte)(uVar30 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar22 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar30 >> 8) ^ (byte)(uVar22 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar22)))))));
              puVar7[-2] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar10 >> 0x38),
                                    CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar10 >> 0x30),
                                             CONCAT15((byte)(uVar29 >> 0x28) ^
                                                      (byte)(uVar10 >> 0x28),
                                                      CONCAT14((byte)(uVar29 >> 0x20) ^
                                                               (byte)(uVar10 >> 0x20),
                                                               CONCAT13((byte)(uVar29 >> 0x18) ^
                                                                        (byte)(uVar10 >> 0x18),
                                                                        CONCAT12((byte)(uVar29 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar10 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar29 >> 8) ^ (byte)(uVar10 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar10)))))));
              puVar7[1] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                   CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                            CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar24 >> 0x28)
                                                     ,CONCAT14((byte)(uVar32 >> 0x20) ^
                                                               (byte)(uVar24 >> 0x20),
                                                               CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                        (byte)(uVar24 >> 0x18),
                                                                        CONCAT12((byte)(uVar32 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar24 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar32 >> 8) ^ (byte)(uVar24 >> 8),
                                                  (byte)uVar32 ^ (byte)uVar24)))))));
              *puVar7 = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                                 CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                          CONCAT15((byte)(uVar31 >> 0x28) ^ (byte)(uVar23 >> 0x28),
                                                   CONCAT14((byte)(uVar31 >> 0x20) ^
                                                            (byte)(uVar23 >> 0x20),
                                                            CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                     (byte)(uVar23 >> 0x18),
                                                                     CONCAT12((byte)(uVar31 >> 0x10)
                                                                              ^ (byte)(uVar23 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar31
                                                                                             >> 8) ^
                                                                                       (byte)(uVar23
                                                                                             >> 8),
                                                                                       (byte)uVar31
                                                                                       ^ (byte)
                                                  uVar23)))))));
              puVar7[3] = CONCAT17((byte)(uVar34 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                                   CONCAT16((byte)(uVar34 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                            CONCAT15((byte)(uVar34 >> 0x28) ^ (byte)(uVar26 >> 0x28)
                                                     ,CONCAT14((byte)(uVar34 >> 0x20) ^
                                                               (byte)(uVar26 >> 0x20),
                                                               CONCAT13((byte)(uVar34 >> 0x18) ^
                                                                        (byte)(uVar26 >> 0x18),
                                                                        CONCAT12((byte)(uVar34 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar26 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar34 >> 8) ^ (byte)(uVar26 >> 8),
                                                  (byte)uVar34 ^ (byte)uVar26)))))));
              puVar7[2] = CONCAT17((byte)(uVar33 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                   CONCAT16((byte)(uVar33 >> 0x30) ^ (byte)(uVar25 >> 0x30),
                                            CONCAT15((byte)(uVar33 >> 0x28) ^ (byte)(uVar25 >> 0x28)
                                                     ,CONCAT14((byte)(uVar33 >> 0x20) ^
                                                               (byte)(uVar25 >> 0x20),
                                                               CONCAT13((byte)(uVar33 >> 0x18) ^
                                                                        (byte)(uVar25 >> 0x18),
                                                                        CONCAT12((byte)(uVar33 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar25 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar33 >> 8) ^ (byte)(uVar25 >> 8),
                                                  (byte)uVar33 ^ (byte)uVar25)))))));
              uVar14 = uVar14 - 8;
              puVar5 = puVar5 + 8;
              puVar7 = puVar7 + 8;
            } while (uVar14 != 0);
            uVar14 = uVar19;
            if (uVar17 == uVar19) goto code_r0x0067aedc;
          }
          lVar4 = uVar17 - uVar14;
          puVar5 = puVar3 + uVar14;
          puVar7 = puVar12 + uVar14;
          do {
            *puVar5 = *puVar5 ^ *puVar7;
            lVar4 = lVar4 + -1;
            puVar5 = puVar5 + 1;
            puVar7 = puVar7 + 1;
          } while (lVar4 != 0);
        }
code_r0x0067aedc:
        uVar14 = (ulong)(iVar13 - 1);
      } while (0 < iVar13);
    }
    else if (uVar1 == 0) {
      if (uVar17 != 0) {
        if (uVar17 < 8) {
          uVar15 = uVar2;
          do {
            if ((((uVar14 >> 6 < *(ulong *)(param_3 + 0x10)) &&
                 ((*(ulong *)(lVar11 + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0)) &&
                (*puVar3 = *puVar3 ^ *puVar12, uVar17 != 1)) &&
               (((puVar3[1] = puVar3[1] ^ puVar12[1], uVar17 != 2 &&
                 (puVar3[2] = puVar3[2] ^ puVar12[2], uVar17 != 3)) &&
                ((puVar3[3] = puVar3[3] ^ puVar12[3], uVar17 != 4 &&
                 ((puVar3[4] = puVar3[4] ^ puVar12[4], uVar17 != 5 &&
                  (puVar3[5] = puVar3[5] ^ puVar12[5], uVar17 != 6)))))))) {
              puVar3[6] = puVar3[6] ^ puVar12[6];
            }
            uVar15 = uVar15 - 1;
            uVar14 = uVar14 - 1;
          } while (0 < (int)uVar15);
        }
        else {
          uVar16 = uVar17 & 0xfffffffffffffff8;
          do {
            iVar13 = (int)uVar14;
            if ((uVar14 >> 6 < *(ulong *)(param_3 + 0x10)) &&
               ((*(ulong *)(lVar11 + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0)) {
              if (puVar3 < puVar12 + uVar17 && puVar12 < puVar3 + uVar17) {
                uVar14 = 0;
              }
              else {
                uVar14 = uVar16;
                puVar5 = puVar12 + 4;
                puVar7 = puVar3 + 4;
                do {
                  uVar19 = puVar5[-3];
                  uVar18 = puVar5[-4];
                  uVar8 = puVar5[-1];
                  uVar6 = puVar5[-2];
                  uVar22 = puVar5[1];
                  uVar10 = *puVar5;
                  uVar24 = puVar5[3];
                  uVar23 = puVar5[2];
                  uVar26 = puVar7[-3];
                  uVar25 = puVar7[-4];
                  uVar28 = puVar7[-1];
                  uVar27 = puVar7[-2];
                  uVar30 = puVar7[1];
                  uVar29 = *puVar7;
                  uVar32 = puVar7[3];
                  uVar31 = puVar7[2];
                  puVar7[-3] = CONCAT17((byte)(uVar26 >> 0x38) ^ (byte)(uVar19 >> 0x38),
                                        CONCAT16((byte)(uVar26 >> 0x30) ^ (byte)(uVar19 >> 0x30),
                                                 CONCAT15((byte)(uVar26 >> 0x28) ^
                                                          (byte)(uVar19 >> 0x28),
                                                          CONCAT14((byte)(uVar26 >> 0x20) ^
                                                                   (byte)(uVar19 >> 0x20),
                                                                   CONCAT13((byte)(uVar26 >> 0x18) ^
                                                                            (byte)(uVar19 >> 0x18),
                                                                            CONCAT12((byte)(uVar26 
                                                  >> 0x10) ^ (byte)(uVar19 >> 0x10),
                                                  CONCAT11((byte)(uVar26 >> 8) ^ (byte)(uVar19 >> 8)
                                                           ,(byte)uVar26 ^ (byte)uVar19)))))));
                  puVar7[-4] = CONCAT17((byte)(uVar25 >> 0x38) ^ (byte)(uVar18 >> 0x38),
                                        CONCAT16((byte)(uVar25 >> 0x30) ^ (byte)(uVar18 >> 0x30),
                                                 CONCAT15((byte)(uVar25 >> 0x28) ^
                                                          (byte)(uVar18 >> 0x28),
                                                          CONCAT14((byte)(uVar25 >> 0x20) ^
                                                                   (byte)(uVar18 >> 0x20),
                                                                   CONCAT13((byte)(uVar25 >> 0x18) ^
                                                                            (byte)(uVar18 >> 0x18),
                                                                            CONCAT12((byte)(uVar25 
                                                  >> 0x10) ^ (byte)(uVar18 >> 0x10),
                                                  CONCAT11((byte)(uVar25 >> 8) ^ (byte)(uVar18 >> 8)
                                                           ,(byte)uVar25 ^ (byte)uVar18)))))));
                  puVar7[-1] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar8 >> 0x38),
                                        CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar8 >> 0x30),
                                                 CONCAT15((byte)(uVar28 >> 0x28) ^
                                                          (byte)(uVar8 >> 0x28),
                                                          CONCAT14((byte)(uVar28 >> 0x20) ^
                                                                   (byte)(uVar8 >> 0x20),
                                                                   CONCAT13((byte)(uVar28 >> 0x18) ^
                                                                            (byte)(uVar8 >> 0x18),
                                                                            CONCAT12((byte)(uVar28 
                                                  >> 0x10) ^ (byte)(uVar8 >> 0x10),
                                                  CONCAT11((byte)(uVar28 >> 8) ^ (byte)(uVar8 >> 8),
                                                           (byte)uVar28 ^ (byte)uVar8)))))));
                  puVar7[-2] = CONCAT17((byte)(uVar27 >> 0x38) ^ (byte)(uVar6 >> 0x38),
                                        CONCAT16((byte)(uVar27 >> 0x30) ^ (byte)(uVar6 >> 0x30),
                                                 CONCAT15((byte)(uVar27 >> 0x28) ^
                                                          (byte)(uVar6 >> 0x28),
                                                          CONCAT14((byte)(uVar27 >> 0x20) ^
                                                                   (byte)(uVar6 >> 0x20),
                                                                   CONCAT13((byte)(uVar27 >> 0x18) ^
                                                                            (byte)(uVar6 >> 0x18),
                                                                            CONCAT12((byte)(uVar27 
                                                  >> 0x10) ^ (byte)(uVar6 >> 0x10),
                                                  CONCAT11((byte)(uVar27 >> 8) ^ (byte)(uVar6 >> 8),
                                                           (byte)uVar27 ^ (byte)uVar6)))))));
                  puVar7[1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar22 >> 0x38),
                                       CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar22 >> 0x30),
                                                CONCAT15((byte)(uVar30 >> 0x28) ^
                                                         (byte)(uVar22 >> 0x28),
                                                         CONCAT14((byte)(uVar30 >> 0x20) ^
                                                                  (byte)(uVar22 >> 0x20),
                                                                  CONCAT13((byte)(uVar30 >> 0x18) ^
                                                                           (byte)(uVar22 >> 0x18),
                                                                           CONCAT12((byte)(uVar30 >>
                                                                                          0x10) ^
                                                                                    (byte)(uVar22 >>
                                                                                          0x10),
                                                                                    CONCAT11((byte)(
                                                  uVar30 >> 8) ^ (byte)(uVar22 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar22)))))));
                  *puVar7 = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar10 >> 0x38),
                                     CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar10 >> 0x30),
                                              CONCAT15((byte)(uVar29 >> 0x28) ^
                                                       (byte)(uVar10 >> 0x28),
                                                       CONCAT14((byte)(uVar29 >> 0x20) ^
                                                                (byte)(uVar10 >> 0x20),
                                                                CONCAT13((byte)(uVar29 >> 0x18) ^
                                                                         (byte)(uVar10 >> 0x18),
                                                                         CONCAT12((byte)(uVar29 >>
                                                                                        0x10) ^
                                                                                  (byte)(uVar10 >>
                                                                                        0x10),
                                                                                  CONCAT11((byte)(
                                                  uVar29 >> 8) ^ (byte)(uVar10 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar10)))))));
                  puVar7[3] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                       CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                                CONCAT15((byte)(uVar32 >> 0x28) ^
                                                         (byte)(uVar24 >> 0x28),
                                                         CONCAT14((byte)(uVar32 >> 0x20) ^
                                                                  (byte)(uVar24 >> 0x20),
                                                                  CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                           (byte)(uVar24 >> 0x18),
                                                                           CONCAT12((byte)(uVar32 >>
                                                                                          0x10) ^
                                                                                    (byte)(uVar24 >>
                                                                                          0x10),
                                                                                    CONCAT11((byte)(
                                                  uVar32 >> 8) ^ (byte)(uVar24 >> 8),
                                                  (byte)uVar32 ^ (byte)uVar24)))))));
                  puVar7[2] = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                                       CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                                CONCAT15((byte)(uVar31 >> 0x28) ^
                                                         (byte)(uVar23 >> 0x28),
                                                         CONCAT14((byte)(uVar31 >> 0x20) ^
                                                                  (byte)(uVar23 >> 0x20),
                                                                  CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                           (byte)(uVar23 >> 0x18),
                                                                           CONCAT12((byte)(uVar31 >>
                                                                                          0x10) ^
                                                                                    (byte)(uVar23 >>
                                                                                          0x10),
                                                                                    CONCAT11((byte)(
                                                  uVar31 >> 8) ^ (byte)(uVar23 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar23)))))));
                  uVar14 = uVar14 - 8;
                  puVar5 = puVar5 + 8;
                  puVar7 = puVar7 + 8;
                } while (uVar14 != 0);
                uVar14 = uVar16;
                if (uVar17 == uVar16) goto code_r0x0067b2c8;
              }
              lVar4 = uVar17 - uVar14;
              puVar5 = puVar12 + uVar14;
              puVar7 = puVar3 + uVar14;
              do {
                *puVar7 = *puVar7 ^ *puVar5;
                lVar4 = lVar4 + -1;
                puVar5 = puVar5 + 1;
                puVar7 = puVar7 + 1;
              } while (lVar4 != 0);
            }
code_r0x0067b2c8:
            uVar14 = (ulong)(iVar13 - 1);
          } while (0 < iVar13);
        }
      }
    }
    else if (uVar17 == 0) {
      do {
        uVar16 = 0;
        puVar12 = puVar3;
        uVar17 = uVar21;
        do {
          uVar18 = *puVar12;
          *puVar12 = uVar16 | uVar18 << 1;
          uVar16 = uVar18 >> 0x3f;
          uVar17 = uVar17 - 1;
          puVar12 = puVar12 + 1;
        } while (uVar17 != 0);
        iVar13 = (int)uVar14;
        uVar14 = (ulong)(iVar13 - 1);
      } while (0 < iVar13);
    }
    else {
      uVar16 = uVar17 & 0xfffffffffffffff8;
      do {
        uVar19 = 0;
        uVar18 = uVar21;
        puVar5 = puVar3;
        do {
          uVar6 = *puVar5;
          *puVar5 = uVar19 | uVar6 << 1;
          uVar19 = uVar6 >> 0x3f;
          uVar18 = uVar18 - 1;
          puVar5 = puVar5 + 1;
        } while (uVar18 != 0);
        iVar13 = (int)uVar14;
        if ((uVar14 >> 6 < *(ulong *)(param_3 + 0x10)) &&
           ((*(ulong *)(lVar11 + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0)) {
          if (puVar3 < puVar12 + uVar17 && puVar12 < puVar3 + uVar17 || uVar17 < 8) {
            uVar14 = 0;
          }
          else {
            uVar14 = uVar16;
            puVar5 = puVar12 + 4;
            puVar7 = puVar3 + 4;
            do {
              uVar19 = puVar5[-3];
              uVar18 = puVar5[-4];
              uVar8 = puVar5[-1];
              uVar6 = puVar5[-2];
              uVar22 = puVar5[1];
              uVar10 = *puVar5;
              uVar24 = puVar5[3];
              uVar23 = puVar5[2];
              uVar26 = puVar7[-3];
              uVar25 = puVar7[-4];
              uVar28 = puVar7[-1];
              uVar27 = puVar7[-2];
              uVar30 = puVar7[1];
              uVar29 = *puVar7;
              uVar32 = puVar7[3];
              uVar31 = puVar7[2];
              puVar7[-3] = CONCAT17((byte)(uVar26 >> 0x38) ^ (byte)(uVar19 >> 0x38),
                                    CONCAT16((byte)(uVar26 >> 0x30) ^ (byte)(uVar19 >> 0x30),
                                             CONCAT15((byte)(uVar26 >> 0x28) ^
                                                      (byte)(uVar19 >> 0x28),
                                                      CONCAT14((byte)(uVar26 >> 0x20) ^
                                                               (byte)(uVar19 >> 0x20),
                                                               CONCAT13((byte)(uVar26 >> 0x18) ^
                                                                        (byte)(uVar19 >> 0x18),
                                                                        CONCAT12((byte)(uVar26 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar19 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar26 >> 8) ^ (byte)(uVar19 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar19)))))));
              puVar7[-4] = CONCAT17((byte)(uVar25 >> 0x38) ^ (byte)(uVar18 >> 0x38),
                                    CONCAT16((byte)(uVar25 >> 0x30) ^ (byte)(uVar18 >> 0x30),
                                             CONCAT15((byte)(uVar25 >> 0x28) ^
                                                      (byte)(uVar18 >> 0x28),
                                                      CONCAT14((byte)(uVar25 >> 0x20) ^
                                                               (byte)(uVar18 >> 0x20),
                                                               CONCAT13((byte)(uVar25 >> 0x18) ^
                                                                        (byte)(uVar18 >> 0x18),
                                                                        CONCAT12((byte)(uVar25 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar18 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar25 >> 8) ^ (byte)(uVar18 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar18)))))));
              puVar7[-1] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar8 >> 0x38),
                                    CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar8 >> 0x30),
                                             CONCAT15((byte)(uVar28 >> 0x28) ^ (byte)(uVar8 >> 0x28)
                                                      ,CONCAT14((byte)(uVar28 >> 0x20) ^
                                                                (byte)(uVar8 >> 0x20),
                                                                CONCAT13((byte)(uVar28 >> 0x18) ^
                                                                         (byte)(uVar8 >> 0x18),
                                                                         CONCAT12((byte)(uVar28 >>
                                                                                        0x10) ^
                                                                                  (byte)(uVar8 >> 
                                                  0x10),CONCAT11((byte)(uVar28 >> 8) ^
                                                                 (byte)(uVar8 >> 8),
                                                                 (byte)uVar28 ^ (byte)uVar8)))))));
              puVar7[-2] = CONCAT17((byte)(uVar27 >> 0x38) ^ (byte)(uVar6 >> 0x38),
                                    CONCAT16((byte)(uVar27 >> 0x30) ^ (byte)(uVar6 >> 0x30),
                                             CONCAT15((byte)(uVar27 >> 0x28) ^ (byte)(uVar6 >> 0x28)
                                                      ,CONCAT14((byte)(uVar27 >> 0x20) ^
                                                                (byte)(uVar6 >> 0x20),
                                                                CONCAT13((byte)(uVar27 >> 0x18) ^
                                                                         (byte)(uVar6 >> 0x18),
                                                                         CONCAT12((byte)(uVar27 >>
                                                                                        0x10) ^
                                                                                  (byte)(uVar6 >> 
                                                  0x10),CONCAT11((byte)(uVar27 >> 8) ^
                                                                 (byte)(uVar6 >> 8),
                                                                 (byte)uVar27 ^ (byte)uVar6)))))));
              puVar7[1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar22 >> 0x38),
                                   CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar22 >> 0x30),
                                            CONCAT15((byte)(uVar30 >> 0x28) ^ (byte)(uVar22 >> 0x28)
                                                     ,CONCAT14((byte)(uVar30 >> 0x20) ^
                                                               (byte)(uVar22 >> 0x20),
                                                               CONCAT13((byte)(uVar30 >> 0x18) ^
                                                                        (byte)(uVar22 >> 0x18),
                                                                        CONCAT12((byte)(uVar30 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar22 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar30 >> 8) ^ (byte)(uVar22 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar22)))))));
              *puVar7 = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar10 >> 0x38),
                                 CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar10 >> 0x30),
                                          CONCAT15((byte)(uVar29 >> 0x28) ^ (byte)(uVar10 >> 0x28),
                                                   CONCAT14((byte)(uVar29 >> 0x20) ^
                                                            (byte)(uVar10 >> 0x20),
                                                            CONCAT13((byte)(uVar29 >> 0x18) ^
                                                                     (byte)(uVar10 >> 0x18),
                                                                     CONCAT12((byte)(uVar29 >> 0x10)
                                                                              ^ (byte)(uVar10 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar29
                                                                                             >> 8) ^
                                                                                       (byte)(uVar10
                                                                                             >> 8),
                                                                                       (byte)uVar29
                                                                                       ^ (byte)
                                                  uVar10)))))));
              puVar7[3] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                   CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                            CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar24 >> 0x28)
                                                     ,CONCAT14((byte)(uVar32 >> 0x20) ^
                                                               (byte)(uVar24 >> 0x20),
                                                               CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                        (byte)(uVar24 >> 0x18),
                                                                        CONCAT12((byte)(uVar32 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar24 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar32 >> 8) ^ (byte)(uVar24 >> 8),
                                                  (byte)uVar32 ^ (byte)uVar24)))))));
              puVar7[2] = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                                   CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                            CONCAT15((byte)(uVar31 >> 0x28) ^ (byte)(uVar23 >> 0x28)
                                                     ,CONCAT14((byte)(uVar31 >> 0x20) ^
                                                               (byte)(uVar23 >> 0x20),
                                                               CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                        (byte)(uVar23 >> 0x18),
                                                                        CONCAT12((byte)(uVar31 >>
                                                                                       0x10) ^
                                                                                 (byte)(uVar23 >>
                                                                                       0x10),
                                                                                 CONCAT11((byte)(
                                                  uVar31 >> 8) ^ (byte)(uVar23 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar23)))))));
              uVar14 = uVar14 - 8;
              puVar5 = puVar5 + 8;
              puVar7 = puVar7 + 8;
            } while (uVar14 != 0);
            uVar14 = uVar16;
            if (uVar17 == uVar16) goto code_r0x0067b0b0;
          }
          lVar4 = uVar17 - uVar14;
          puVar5 = puVar12 + uVar14;
          puVar7 = puVar3 + uVar14;
          do {
            *puVar7 = *puVar7 ^ *puVar5;
            lVar4 = lVar4 + -1;
            puVar5 = puVar5 + 1;
            puVar7 = puVar7 + 1;
          } while (lVar4 != 0);
        }
code_r0x0067b0b0:
        uVar14 = (ulong)(iVar13 - 1);
      } while (0 < iVar13);
    }
  }
  if ((uVar2 & 0x3f) != 0) {
    puVar3[uVar21 - 1] = puVar3[uVar21 - 1] & (-1L << (uVar2 & 0x3f) ^ 0xffffffffffffffffU);
  }
  if (*(ulong **)(param_1 + 0xb8) != puVar3) {
    _memcpy(*(ulong **)(param_1 + 0xb8),puVar3,*(long *)(param_1 + 0xb0) << 3);
  }
  if (puVar3 != (ulong *)0x0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)((long)puVar3 + lVar20 + -8) = 0;
        lVar20 = lVar20 + -8;
      } while (lVar20 != 0);
    }
    func_0x00611644(puVar3);
  }
  return param_1 + 0xa0;
}

