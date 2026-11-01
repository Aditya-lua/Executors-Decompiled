
void FUN_005e40a0(ulong param_1)

{
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  uint *puVar1;
  ulong uVar2;
  ulong uVar3;
  uint *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong unaff_x19;
  long *unaff_x20;
  undefined8 uVar8;
  undefined8 uVar9;
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
  
  if (in_x11 == 0) goto LAB_005e4100;
  if ((in_x11 < 4) || (param_1 < unaff_x19 + in_x11 * 4 && unaff_x19 < param_1 + in_x11 * 4)) {
    uVar3 = 0;
  }
  else {
    if (in_x11 < 0x10) {
      uVar2 = 0;
    }
    else {
      uVar3 = in_x11 & 0xfffffffffffffff0;
      puVar5 = (undefined8 *)(unaff_x19 + 0x20);
      puVar6 = (undefined8 *)(param_1 + 0x20);
      uVar2 = uVar3;
      do {
        uVar9 = puVar5[-3];
        uVar8 = puVar5[-4];
        uVar11 = puVar5[-1];
        uVar10 = puVar5[-2];
        uVar13 = puVar5[1];
        uVar12 = *puVar5;
        uVar15 = puVar5[3];
        uVar14 = puVar5[2];
        uVar17 = puVar6[-3];
        uVar16 = puVar6[-4];
        uVar19 = puVar6[-1];
        uVar18 = puVar6[-2];
        uVar21 = puVar6[1];
        uVar20 = *puVar6;
        uVar23 = puVar6[3];
        uVar22 = puVar6[2];
        puVar6[-3] = CONCAT17((byte)((ulong)uVar17 >> 0x38) & (byte)((ulong)uVar9 >> 0x38),
                              CONCAT16((byte)((ulong)uVar17 >> 0x30) & (byte)((ulong)uVar9 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar17 >> 0x28) &
                                                (byte)((ulong)uVar9 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar17 >> 0x20) &
                                                         (byte)((ulong)uVar9 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar17 >> 0x18) &
                                                                  (byte)((ulong)uVar9 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar17 >>
                                                                                 0x10) &
                                                                           (byte)((ulong)uVar9 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar17 >> 8) & (byte)((ulong)uVar9 >> 8),
                                                  (byte)uVar17 & (byte)uVar9)))))));
        puVar6[-4] = CONCAT17((byte)((ulong)uVar16 >> 0x38) & (byte)((ulong)uVar8 >> 0x38),
                              CONCAT16((byte)((ulong)uVar16 >> 0x30) & (byte)((ulong)uVar8 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar16 >> 0x28) &
                                                (byte)((ulong)uVar8 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar16 >> 0x20) &
                                                         (byte)((ulong)uVar8 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar16 >> 0x18) &
                                                                  (byte)((ulong)uVar8 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar16 >>
                                                                                 0x10) &
                                                                           (byte)((ulong)uVar8 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar16 >> 8) & (byte)((ulong)uVar8 >> 8),
                                                  (byte)uVar16 & (byte)uVar8)))))));
        puVar6[-1] = CONCAT17((byte)((ulong)uVar19 >> 0x38) & (byte)((ulong)uVar11 >> 0x38),
                              CONCAT16((byte)((ulong)uVar19 >> 0x30) & (byte)((ulong)uVar11 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar19 >> 0x28) &
                                                 (byte)((ulong)uVar11 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar19 >> 0x20) &
                                                          (byte)((ulong)uVar11 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar19 >> 0x18) &
                                                                   (byte)((ulong)uVar11 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar19 >>
                                                                                  0x10) &
                                                                            (byte)((ulong)uVar11 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) & (byte)((ulong)uVar11 >> 8),
                                                  (byte)uVar19 & (byte)uVar11)))))));
        puVar6[-2] = CONCAT17((byte)((ulong)uVar18 >> 0x38) & (byte)((ulong)uVar10 >> 0x38),
                              CONCAT16((byte)((ulong)uVar18 >> 0x30) & (byte)((ulong)uVar10 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar18 >> 0x28) &
                                                 (byte)((ulong)uVar10 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar18 >> 0x20) &
                                                          (byte)((ulong)uVar10 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar18 >> 0x18) &
                                                                   (byte)((ulong)uVar10 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar18 >>
                                                                                  0x10) &
                                                                            (byte)((ulong)uVar10 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar18 >> 8) & (byte)((ulong)uVar10 >> 8),
                                                  (byte)uVar18 & (byte)uVar10)))))));
        puVar6[1] = CONCAT17((byte)((ulong)uVar21 >> 0x38) & (byte)((ulong)uVar13 >> 0x38),
                             CONCAT16((byte)((ulong)uVar21 >> 0x30) & (byte)((ulong)uVar13 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar21 >> 0x28) &
                                               (byte)((ulong)uVar13 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar21 >> 0x20) &
                                                        (byte)((ulong)uVar13 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar21 >> 0x18) &
                                                                 (byte)((ulong)uVar13 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar21 >>
                                                                                0x10) &
                                                                          (byte)((ulong)uVar13 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) & (byte)((ulong)uVar13 >> 8),
                                                  (byte)uVar21 & (byte)uVar13)))))));
        *puVar6 = CONCAT17((byte)((ulong)uVar20 >> 0x38) & (byte)((ulong)uVar12 >> 0x38),
                           CONCAT16((byte)((ulong)uVar20 >> 0x30) & (byte)((ulong)uVar12 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar20 >> 0x28) &
                                             (byte)((ulong)uVar12 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar20 >> 0x20) &
                                                      (byte)((ulong)uVar12 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar20 >> 0x18) &
                                                               (byte)((ulong)uVar12 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar20 >> 0x10
                                                                              ) & (byte)((ulong)
                                                  uVar12 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar20 >> 8) &
                                                           (byte)((ulong)uVar12 >> 8),
                                                           (byte)uVar20 & (byte)uVar12)))))));
        puVar6[3] = CONCAT17((byte)((ulong)uVar23 >> 0x38) & (byte)((ulong)uVar15 >> 0x38),
                             CONCAT16((byte)((ulong)uVar23 >> 0x30) & (byte)((ulong)uVar15 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar23 >> 0x28) &
                                               (byte)((ulong)uVar15 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar23 >> 0x20) &
                                                        (byte)((ulong)uVar15 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar23 >> 0x18) &
                                                                 (byte)((ulong)uVar15 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar23 >>
                                                                                0x10) &
                                                                          (byte)((ulong)uVar15 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) & (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar23 & (byte)uVar15)))))));
        puVar6[2] = CONCAT17((byte)((ulong)uVar22 >> 0x38) & (byte)((ulong)uVar14 >> 0x38),
                             CONCAT16((byte)((ulong)uVar22 >> 0x30) & (byte)((ulong)uVar14 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar22 >> 0x28) &
                                               (byte)((ulong)uVar14 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar22 >> 0x20) &
                                                        (byte)((ulong)uVar14 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar22 >> 0x18) &
                                                                 (byte)((ulong)uVar14 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar22 >>
                                                                                0x10) &
                                                                          (byte)((ulong)uVar14 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) & (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar22 & (byte)uVar14)))))));
        uVar2 = uVar2 - 0x10;
        puVar5 = puVar5 + 8;
        puVar6 = puVar6 + 8;
      } while (uVar2 != 0);
      if (in_x11 == uVar3) goto LAB_005e4100;
      uVar2 = uVar3;
      if ((in_x11 & 0xc) == 0) goto LAB_005e40d8;
    }
    uVar3 = in_x11 & 0xfffffffffffffffc;
    lVar7 = uVar2 - uVar3;
    puVar5 = (undefined8 *)(param_1 + uVar2 * 4);
    puVar6 = (undefined8 *)(unaff_x19 + uVar2 * 4);
    do {
      uVar9 = puVar6[1];
      uVar8 = *puVar6;
      uVar11 = puVar5[1];
      uVar10 = *puVar5;
      puVar5[1] = CONCAT17((byte)((ulong)uVar11 >> 0x38) & (byte)((ulong)uVar9 >> 0x38),
                           CONCAT16((byte)((ulong)uVar11 >> 0x30) & (byte)((ulong)uVar9 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar11 >> 0x28) &
                                             (byte)((ulong)uVar9 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar11 >> 0x20) &
                                                      (byte)((ulong)uVar9 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar11 >> 0x18) &
                                                               (byte)((ulong)uVar9 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar11 >> 0x10
                                                                              ) & (byte)((ulong)
                                                  uVar9 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar11 >> 8) &
                                                           (byte)((ulong)uVar9 >> 8),
                                                           (byte)uVar11 & (byte)uVar9)))))));
      *puVar5 = CONCAT17((byte)((ulong)uVar10 >> 0x38) & (byte)((ulong)uVar8 >> 0x38),
                         CONCAT16((byte)((ulong)uVar10 >> 0x30) & (byte)((ulong)uVar8 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar10 >> 0x28) &
                                           (byte)((ulong)uVar8 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar10 >> 0x20) &
                                                    (byte)((ulong)uVar8 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar10 >> 0x18) &
                                                             (byte)((ulong)uVar8 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar10 >> 0x10)
                                                                      & (byte)((ulong)uVar8 >> 0x10)
                                                                      ,CONCAT11((byte)((ulong)uVar10
                                                                                      >> 8) &
                                                                                (byte)((ulong)uVar8
                                                                                      >> 8),
                                                                                (byte)uVar10 &
                                                                                (byte)uVar8)))))));
      lVar7 = lVar7 + 4;
      puVar5 = puVar5 + 2;
      puVar6 = puVar6 + 2;
    } while (lVar7 != 0);
    if (in_x11 == uVar3) goto LAB_005e4100;
  }
LAB_005e40d8:
  lVar7 = in_x11 - uVar3;
  puVar1 = (uint *)(unaff_x19 + uVar3 * 4);
  puVar4 = (uint *)(param_1 + uVar3 * 4);
  do {
    *puVar4 = *puVar4 & *puVar1;
    lVar7 = lVar7 + -1;
    puVar1 = puVar1 + 1;
    puVar4 = puVar4 + 1;
  } while (lVar7 != 0);
LAB_005e4100:
  if (in_x9 <= in_x10 && in_x10 - in_x9 != 0) {
    _bzero(param_1 + in_x9 * 4,(in_x10 - in_x9) * 4);
  }
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

