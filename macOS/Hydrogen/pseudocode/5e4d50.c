
void FUN_005e4d50(undefined4 *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint *puVar4;
  uint *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long lVar10;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x26;
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
  undefined8 uVar26;
  
  *param_1 = 0;
  uVar3 = unaff_x26 + 1;
  *(ulong *)(unaff_x20 + 0x10) = uVar3;
  uVar2 = unaff_x19[1];
  uVar1 = unaff_x19[2];
  if (uVar3 <= (ulong)unaff_x19[2]) {
    uVar1 = uVar3;
  }
  if (uVar1 == 0) goto code_r0x005e4c5c;
  uVar3 = *(ulong *)(unaff_x20 + 8);
  if ((uVar1 < 4) || (uVar3 < uVar2 + uVar1 * 4 && uVar2 < uVar3 + uVar1 * 4)) {
    uVar7 = 0;
  }
  else {
    if (uVar1 < 0x10) {
      uVar6 = 0;
    }
    else {
      uVar7 = uVar1 & 0xfffffffffffffff0;
      puVar8 = (undefined8 *)(uVar2 + 0x20);
      puVar9 = (undefined8 *)(uVar3 + 0x20);
      uVar6 = uVar7;
      do {
        uVar12 = puVar8[-3];
        uVar11 = puVar8[-4];
        uVar14 = puVar8[-1];
        uVar13 = puVar8[-2];
        uVar16 = puVar8[1];
        uVar15 = *puVar8;
        uVar18 = puVar8[3];
        uVar17 = puVar8[2];
        uVar20 = puVar9[-3];
        uVar19 = puVar9[-4];
        uVar22 = puVar9[-1];
        uVar21 = puVar9[-2];
        uVar24 = puVar9[1];
        uVar23 = *puVar9;
        uVar26 = puVar9[3];
        uVar25 = puVar9[2];
        puVar9[-3] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                              CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                 (byte)((ulong)uVar12 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                          (byte)((ulong)uVar12 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                   (byte)((ulong)uVar12 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar20 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar12 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) ^ (byte)((ulong)uVar12 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar12)))))));
        puVar9[-4] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                              CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar11 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                 (byte)((ulong)uVar11 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                          (byte)((ulong)uVar11 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                   (byte)((ulong)uVar11 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar19 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar11 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)((ulong)uVar11 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar11)))))));
        puVar9[-1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                              CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                 (byte)((ulong)uVar14 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                          (byte)((ulong)uVar14 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                                   (byte)((ulong)uVar14 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar22 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar14 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) ^ (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar14)))))));
        puVar9[-2] = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                              CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                 (byte)((ulong)uVar13 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                          (byte)((ulong)uVar13 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                                   (byte)((ulong)uVar13 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar21 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar13 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) ^ (byte)((ulong)uVar13 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar13)))))));
        puVar9[1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                             CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                               (byte)((ulong)uVar16 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                        (byte)((ulong)uVar16 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                 (byte)((ulong)uVar16 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar24 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar16 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar16)))))));
        *puVar9 = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                           CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                             (byte)((ulong)uVar15 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                      (byte)((ulong)uVar15 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                               (byte)((ulong)uVar15 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar23 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar15 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar23 >> 8) ^
                                                           (byte)((ulong)uVar15 >> 8),
                                                           (byte)uVar23 ^ (byte)uVar15)))))));
        puVar9[3] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                             CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                               (byte)((ulong)uVar18 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                        (byte)((ulong)uVar18 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                 (byte)((ulong)uVar18 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar26 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar18 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar18)))))));
        puVar9[2] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                             CONCAT16((byte)((ulong)uVar25 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                               (byte)((ulong)uVar17 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                        (byte)((ulong)uVar17 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                 (byte)((ulong)uVar17 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar25 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar17 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar25 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar17)))))));
        uVar6 = uVar6 - 0x10;
        puVar8 = puVar8 + 8;
        puVar9 = puVar9 + 8;
      } while (uVar6 != 0);
      if (uVar1 == uVar7) goto code_r0x005e4c5c;
      uVar6 = uVar7;
      if ((uVar1 & 0xc) == 0) goto code_r0x005e4c34;
    }
    uVar7 = uVar1 & 0xfffffffffffffffc;
    lVar10 = uVar6 - uVar7;
    puVar8 = (undefined8 *)(uVar3 + uVar6 * 4);
    puVar9 = (undefined8 *)(uVar2 + uVar6 * 4);
    do {
      uVar12 = puVar9[1];
      uVar11 = *puVar9;
      uVar14 = puVar8[1];
      uVar13 = *puVar8;
      puVar8[1] = CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                           CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar14 >> 0x28) ^
                                             (byte)((ulong)uVar12 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                      (byte)((ulong)uVar12 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                               (byte)((ulong)uVar12 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar14 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar12 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar14 >> 8) ^
                                                           (byte)((ulong)uVar12 >> 8),
                                                           (byte)uVar14 ^ (byte)uVar12)))))));
      *puVar8 = CONCAT17((byte)((ulong)uVar13 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                         CONCAT16((byte)((ulong)uVar13 >> 0x30) ^ (byte)((ulong)uVar11 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar13 >> 0x28) ^
                                           (byte)((ulong)uVar11 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar13 >> 0x20) ^
                                                    (byte)((ulong)uVar11 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar13 >> 0x18) ^
                                                             (byte)((ulong)uVar11 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar13 >> 0x10)
                                                                      ^ (byte)((ulong)uVar11 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar13
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar11
                                                                                     >> 8),
                                                                               (byte)uVar13 ^
                                                                               (byte)uVar11)))))));
      lVar10 = lVar10 + 4;
      puVar8 = puVar8 + 2;
      puVar9 = puVar9 + 2;
    } while (lVar10 != 0);
    if (uVar1 == uVar7) goto code_r0x005e4c5c;
  }
code_r0x005e4c34:
  lVar10 = uVar1 - uVar7;
  puVar4 = (uint *)(uVar3 + uVar7 * 4);
  puVar5 = (uint *)(uVar2 + uVar7 * 4);
  do {
    *puVar4 = *puVar4 ^ *puVar5;
    lVar10 = lVar10 + -1;
    puVar4 = puVar4 + 1;
    puVar5 = puVar5 + 1;
  } while (lVar10 != 0);
code_r0x005e4c5c:
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,*unaff_x19 << 2,4);
  return;
}

