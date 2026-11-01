
void thunk_FUN_005e4370(void)

{
  ulong uVar1;
  ulong uVar2;
  uint *puVar3;
  uint *puVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  
  _memcpy();
  uVar1 = *(ulong *)(unaff_x27 + 0x10);
  if ((unaff_x26 & 0x3fffffffffffffff) <= *(ulong *)(unaff_x27 + 0x10)) {
    uVar1 = unaff_x26 & 0x3fffffffffffffff;
  }
  if (uVar1 == 0) goto LAB_005e43f4;
  uVar2 = *(ulong *)(unaff_x27 + 8);
  if ((uVar1 < 4) || (unaff_x20 < uVar2 + uVar1 * 4 && uVar2 < unaff_x20 + uVar1 * 4)) {
    uVar6 = 0;
  }
  else {
    if (uVar1 < 0x10) {
      uVar5 = 0;
    }
    else {
      uVar6 = uVar1 & 0x3ffffffffffffff0;
      puVar7 = (undefined8 *)(uVar2 + 0x20);
      puVar8 = (undefined8 *)(unaff_x20 + 0x20);
      uVar5 = uVar6;
      do {
        uVar11 = puVar7[-3];
        uVar10 = puVar7[-4];
        uVar13 = puVar7[-1];
        uVar12 = puVar7[-2];
        uVar15 = puVar7[1];
        uVar14 = *puVar7;
        uVar17 = puVar7[3];
        uVar16 = puVar7[2];
        uVar19 = puVar8[-3];
        uVar18 = puVar8[-4];
        uVar21 = puVar8[-1];
        uVar20 = puVar8[-2];
        uVar23 = puVar8[1];
        uVar22 = *puVar8;
        uVar25 = puVar8[3];
        uVar24 = puVar8[2];
        puVar8[-3] = CONCAT17((byte)((ulong)uVar19 >> 0x38) | (byte)((ulong)uVar11 >> 0x38),
                              CONCAT16((byte)((ulong)uVar19 >> 0x30) | (byte)((ulong)uVar11 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar19 >> 0x28) |
                                                 (byte)((ulong)uVar11 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar19 >> 0x20) |
                                                          (byte)((ulong)uVar11 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar19 >> 0x18) |
                                                                   (byte)((ulong)uVar11 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar19 >>
                                                                                  0x10) |
                                                                            (byte)((ulong)uVar11 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) | (byte)((ulong)uVar11 >> 8),
                                                  (byte)uVar19 | (byte)uVar11)))))));
        puVar8[-4] = CONCAT17((byte)((ulong)uVar18 >> 0x38) | (byte)((ulong)uVar10 >> 0x38),
                              CONCAT16((byte)((ulong)uVar18 >> 0x30) | (byte)((ulong)uVar10 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar18 >> 0x28) |
                                                 (byte)((ulong)uVar10 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar18 >> 0x20) |
                                                          (byte)((ulong)uVar10 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar18 >> 0x18) |
                                                                   (byte)((ulong)uVar10 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar18 >>
                                                                                  0x10) |
                                                                            (byte)((ulong)uVar10 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar18 >> 8) | (byte)((ulong)uVar10 >> 8),
                                                  (byte)uVar18 | (byte)uVar10)))))));
        puVar8[-1] = CONCAT17((byte)((ulong)uVar21 >> 0x38) | (byte)((ulong)uVar13 >> 0x38),
                              CONCAT16((byte)((ulong)uVar21 >> 0x30) | (byte)((ulong)uVar13 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar21 >> 0x28) |
                                                 (byte)((ulong)uVar13 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar21 >> 0x20) |
                                                          (byte)((ulong)uVar13 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar21 >> 0x18) |
                                                                   (byte)((ulong)uVar13 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar21 >>
                                                                                  0x10) |
                                                                            (byte)((ulong)uVar13 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) | (byte)((ulong)uVar13 >> 8),
                                                  (byte)uVar21 | (byte)uVar13)))))));
        puVar8[-2] = CONCAT17((byte)((ulong)uVar20 >> 0x38) | (byte)((ulong)uVar12 >> 0x38),
                              CONCAT16((byte)((ulong)uVar20 >> 0x30) | (byte)((ulong)uVar12 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar20 >> 0x28) |
                                                 (byte)((ulong)uVar12 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar20 >> 0x20) |
                                                          (byte)((ulong)uVar12 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar20 >> 0x18) |
                                                                   (byte)((ulong)uVar12 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar20 >>
                                                                                  0x10) |
                                                                            (byte)((ulong)uVar12 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) | (byte)((ulong)uVar12 >> 8),
                                                  (byte)uVar20 | (byte)uVar12)))))));
        puVar8[1] = CONCAT17((byte)((ulong)uVar23 >> 0x38) | (byte)((ulong)uVar15 >> 0x38),
                             CONCAT16((byte)((ulong)uVar23 >> 0x30) | (byte)((ulong)uVar15 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar23 >> 0x28) |
                                               (byte)((ulong)uVar15 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar23 >> 0x20) |
                                                        (byte)((ulong)uVar15 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar23 >> 0x18) |
                                                                 (byte)((ulong)uVar15 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar23 >>
                                                                                0x10) |
                                                                          (byte)((ulong)uVar15 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) | (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar23 | (byte)uVar15)))))));
        *puVar8 = CONCAT17((byte)((ulong)uVar22 >> 0x38) | (byte)((ulong)uVar14 >> 0x38),
                           CONCAT16((byte)((ulong)uVar22 >> 0x30) | (byte)((ulong)uVar14 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar22 >> 0x28) |
                                             (byte)((ulong)uVar14 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar22 >> 0x20) |
                                                      (byte)((ulong)uVar14 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar22 >> 0x18) |
                                                               (byte)((ulong)uVar14 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar22 >> 0x10
                                                                              ) | (byte)((ulong)
                                                  uVar14 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar22 >> 8) |
                                                           (byte)((ulong)uVar14 >> 8),
                                                           (byte)uVar22 | (byte)uVar14)))))));
        puVar8[3] = CONCAT17((byte)((ulong)uVar25 >> 0x38) | (byte)((ulong)uVar17 >> 0x38),
                             CONCAT16((byte)((ulong)uVar25 >> 0x30) | (byte)((ulong)uVar17 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar25 >> 0x28) |
                                               (byte)((ulong)uVar17 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar25 >> 0x20) |
                                                        (byte)((ulong)uVar17 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar25 >> 0x18) |
                                                                 (byte)((ulong)uVar17 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar25 >>
                                                                                0x10) |
                                                                          (byte)((ulong)uVar17 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar25 >> 8) | (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar25 | (byte)uVar17)))))));
        puVar8[2] = CONCAT17((byte)((ulong)uVar24 >> 0x38) | (byte)((ulong)uVar16 >> 0x38),
                             CONCAT16((byte)((ulong)uVar24 >> 0x30) | (byte)((ulong)uVar16 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar24 >> 0x28) |
                                               (byte)((ulong)uVar16 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar24 >> 0x20) |
                                                        (byte)((ulong)uVar16 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar24 >> 0x18) |
                                                                 (byte)((ulong)uVar16 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar24 >>
                                                                                0x10) |
                                                                          (byte)((ulong)uVar16 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) | (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar24 | (byte)uVar16)))))));
        uVar5 = uVar5 - 0x10;
        puVar7 = puVar7 + 8;
        puVar8 = puVar8 + 8;
      } while (uVar5 != 0);
      if (uVar1 == uVar6) goto LAB_005e43f4;
      uVar5 = uVar6;
      if ((uVar1 & 0xc) == 0) goto LAB_005e43cc;
    }
    uVar6 = uVar1 & 0x3ffffffffffffffc;
    lVar9 = uVar5 - uVar6;
    puVar7 = (undefined8 *)(unaff_x20 + uVar5 * 4);
    puVar8 = (undefined8 *)(uVar2 + uVar5 * 4);
    do {
      uVar11 = puVar8[1];
      uVar10 = *puVar8;
      uVar13 = puVar7[1];
      uVar12 = *puVar7;
      puVar7[1] = CONCAT17((byte)((ulong)uVar13 >> 0x38) | (byte)((ulong)uVar11 >> 0x38),
                           CONCAT16((byte)((ulong)uVar13 >> 0x30) | (byte)((ulong)uVar11 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar13 >> 0x28) |
                                             (byte)((ulong)uVar11 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar13 >> 0x20) |
                                                      (byte)((ulong)uVar11 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar13 >> 0x18) |
                                                               (byte)((ulong)uVar11 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar13 >> 0x10
                                                                              ) | (byte)((ulong)
                                                  uVar11 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar13 >> 8) |
                                                           (byte)((ulong)uVar11 >> 8),
                                                           (byte)uVar13 | (byte)uVar11)))))));
      *puVar7 = CONCAT17((byte)((ulong)uVar12 >> 0x38) | (byte)((ulong)uVar10 >> 0x38),
                         CONCAT16((byte)((ulong)uVar12 >> 0x30) | (byte)((ulong)uVar10 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar12 >> 0x28) |
                                           (byte)((ulong)uVar10 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar12 >> 0x20) |
                                                    (byte)((ulong)uVar10 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar12 >> 0x18) |
                                                             (byte)((ulong)uVar10 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar12 >> 0x10)
                                                                      | (byte)((ulong)uVar10 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar12
                                                                                     >> 8) |
                                                                               (byte)((ulong)uVar10
                                                                                     >> 8),
                                                                               (byte)uVar12 |
                                                                               (byte)uVar10)))))));
      lVar9 = lVar9 + 4;
      puVar7 = puVar7 + 2;
      puVar8 = puVar8 + 2;
    } while (lVar9 != 0);
    if (uVar1 == uVar6) goto LAB_005e43f4;
  }
LAB_005e43cc:
  lVar9 = uVar1 - uVar6;
  puVar3 = (uint *)(uVar2 + uVar6 * 4);
  puVar4 = (uint *)(unaff_x20 + uVar6 * 4);
  do {
    *puVar4 = *puVar4 | *puVar3;
    lVar9 = lVar9 + -1;
    puVar3 = puVar3 + 1;
    puVar4 = puVar4 + 1;
  } while (lVar9 != 0);
LAB_005e43f4:
  if (unaff_x25 <= unaff_x24) {
    unaff_x25 = unaff_x24;
  }
  *unaff_x19 = unaff_x23;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = unaff_x26;
  unaff_x19[3] = unaff_x25;
  return;
}

