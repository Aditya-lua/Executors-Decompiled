
void FUN_005e4974(long param_1,long param_2)

{
  bool in_ZR;
  bool in_CY;
  bool bVar1;
  ulong uVar2;
  long *plVar3;
  undefined4 *puVar4;
  long *plVar5;
  ulong uVar6;
  uint *puVar7;
  ulong uVar8;
  uint *puVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  long lVar14;
  ulong *unaff_x19;
  ulong uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong uVar18;
  long unaff_x27;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined1 auVar33 [16];
  
  if (!in_CY || in_ZR) {
    param_1 = param_2;
  }
  uVar18 = *(ulong *)(param_1 + 0x10);
  uVar15 = uVar18 * 4;
  if (uVar18 >> 0x3e == 0 && uVar15 < 0x7ffffffffffffffd) {
    uVar16 = *(undefined8 *)(param_1 + 8);
    if (uVar15 == 0) {
      uVar6 = 0;
      uVar2 = 4;
    }
    else {
      uVar17 = 4;
      uVar2 = func_0x00187bd0(uVar15,4);
      if (uVar2 == 0) goto LAB_005e4b10;
      uVar6 = uVar18;
    }
    _memcpy(uVar2,uVar16,uVar15);
    uVar15 = *(ulong *)(unaff_x27 + 0x10);
    if ((uVar18 & 0x3fffffffffffffff) <= *(ulong *)(unaff_x27 + 0x10)) {
      uVar15 = uVar18 & 0x3fffffffffffffff;
    }
    if (uVar15 == 0) goto LAB_005e4a54;
    uVar8 = *(ulong *)(unaff_x27 + 8);
    if ((uVar15 < 4) || (uVar2 < uVar8 + uVar15 * 4 && uVar8 < uVar2 + uVar15 * 4)) {
      uVar11 = 0;
    }
    else {
      if (uVar15 < 0x10) {
        uVar10 = 0;
      }
      else {
        uVar11 = uVar15 & 0x3ffffffffffffff0;
        puVar12 = (undefined8 *)(uVar8 + 0x20);
        puVar13 = (undefined8 *)(uVar2 + 0x20);
        uVar10 = uVar11;
        do {
          uVar17 = puVar12[-3];
          uVar16 = puVar12[-4];
          uVar20 = puVar12[-1];
          uVar19 = puVar12[-2];
          uVar22 = puVar12[1];
          uVar21 = *puVar12;
          uVar24 = puVar12[3];
          uVar23 = puVar12[2];
          uVar26 = puVar13[-3];
          uVar25 = puVar13[-4];
          uVar28 = puVar13[-1];
          uVar27 = puVar13[-2];
          uVar30 = puVar13[1];
          uVar29 = *puVar13;
          uVar32 = puVar13[3];
          uVar31 = puVar13[2];
          puVar13[-3] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                          (byte)((ulong)uVar17 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                   (byte)((ulong)uVar17 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                            (byte)((ulong)uVar17 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                     (byte)((ulong)uVar17 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar26
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar17
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar26 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar17)))))));
          puVar13[-4] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                          (byte)((ulong)uVar16 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                   (byte)((ulong)uVar16 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                            (byte)((ulong)uVar16 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                     (byte)((ulong)uVar16 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar25
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar16
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar25 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar16)))))));
          puVar13[-1] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                          (byte)((ulong)uVar20 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                   (byte)((ulong)uVar20 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                            (byte)((ulong)uVar20 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                                     (byte)((ulong)uVar20 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar28
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar20
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar28 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar20)))))));
          puVar13[-2] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                          (byte)((ulong)uVar19 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                   (byte)((ulong)uVar19 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                            (byte)((ulong)uVar19 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                                     (byte)((ulong)uVar19 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar27
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar19
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar27 >> 8) ^ (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar27 ^ (byte)uVar19)))))));
          puVar13[1] = CONCAT17((byte)((ulong)uVar30 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                CONCAT16((byte)((ulong)uVar30 >> 0x30) ^
                                         (byte)((ulong)uVar22 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar30 >> 0x28) ^
                                                  (byte)((ulong)uVar22 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar30 >> 0x20) ^
                                                           (byte)((ulong)uVar22 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar30 >> 0x18) ^
                                                                    (byte)((ulong)uVar22 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar30 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar22 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar30 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar22)))))));
          *puVar13 = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                              CONCAT16((byte)((ulong)uVar29 >> 0x30) ^ (byte)((ulong)uVar21 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                 (byte)((ulong)uVar21 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                          (byte)((ulong)uVar21 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar29 >> 0x18) ^
                                                                   (byte)((ulong)uVar21 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar29 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar21 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar29 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar21)))))));
          puVar13[3] = CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                                CONCAT16((byte)((ulong)uVar32 >> 0x30) ^
                                         (byte)((ulong)uVar24 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                                  (byte)((ulong)uVar24 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                           (byte)((ulong)uVar24 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                                    (byte)((ulong)uVar24 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar32 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar24 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar32 >> 8) ^ (byte)((ulong)uVar24 >> 8),
                                                  (byte)uVar32 ^ (byte)uVar24)))))));
          puVar13[2] = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                CONCAT16((byte)((ulong)uVar31 >> 0x30) ^
                                         (byte)((ulong)uVar23 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                  (byte)((ulong)uVar23 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                           (byte)((ulong)uVar23 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar31 >> 0x18) ^
                                                                    (byte)((ulong)uVar23 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar31 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar23 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar31 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar23)))))));
          uVar10 = uVar10 - 0x10;
          puVar12 = puVar12 + 8;
          puVar13 = puVar13 + 8;
        } while (uVar10 != 0);
        if (uVar15 == uVar11) goto LAB_005e4a54;
        uVar10 = uVar11;
        if ((uVar15 & 0xc) == 0) goto code_r0x005e4a2c;
      }
      uVar11 = uVar15 & 0x3ffffffffffffffc;
      lVar14 = uVar10 - uVar11;
      puVar12 = (undefined8 *)(uVar2 + uVar10 * 4);
      puVar13 = (undefined8 *)(uVar8 + uVar10 * 4);
      do {
        uVar17 = puVar13[1];
        uVar16 = *puVar13;
        uVar20 = puVar12[1];
        uVar19 = *puVar12;
        puVar12[1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                              CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                 (byte)((ulong)uVar17 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                          (byte)((ulong)uVar17 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                   (byte)((ulong)uVar17 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar20 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar17 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar17)))))));
        *puVar12 = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                            CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                              (byte)((ulong)uVar16 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                       (byte)((ulong)uVar16 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                (byte)((ulong)uVar16 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar19 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar16)))))));
        lVar14 = lVar14 + 4;
        puVar12 = puVar12 + 2;
        puVar13 = puVar13 + 2;
      } while (lVar14 != 0);
      if (uVar15 == uVar11) goto LAB_005e4a54;
    }
code_r0x005e4a2c:
    lVar14 = uVar15 - uVar11;
    puVar7 = (uint *)(uVar8 + uVar11 * 4);
    puVar9 = (uint *)(uVar2 + uVar11 * 4);
    do {
      *puVar9 = *puVar9 ^ *puVar7;
      lVar14 = lVar14 + -1;
      puVar7 = puVar7 + 1;
      puVar9 = puVar9 + 1;
    } while (lVar14 != 0);
LAB_005e4a54:
    if (unaff_x25 <= unaff_x24) {
      unaff_x25 = unaff_x24;
    }
    *unaff_x19 = uVar6;
    unaff_x19[1] = uVar2;
    unaff_x19[2] = uVar18;
    unaff_x19[3] = unaff_x25;
    return;
  }
  uVar17 = 0;
LAB_005e4b10:
  auVar33 = func_0x007a1f00(uVar17,uVar15,&UNK_009f37f8);
  plVar5 = auVar33._8_8_;
  plVar3 = auVar33._0_8_;
  uVar15 = plVar5[3];
  if ((ulong)plVar3[3] < uVar15) {
    uVar18 = uVar15 >> 5;
    bVar1 = (uVar15 & 0x1f) != 0;
    uVar6 = uVar18;
    if (bVar1) {
      uVar6 = uVar18 + 1;
    }
    plVar3[3] = uVar15;
    uVar2 = plVar3[2];
    uVar15 = uVar6 - uVar2;
    if (uVar2 <= uVar6 && uVar15 != 0) {
      if (*plVar3 - uVar2 < uVar15) {
        func_0x007afea0(plVar3,uVar2,uVar15);
        lVar14 = plVar3[1];
        puVar4 = (undefined4 *)(lVar14 + plVar3[2] * 4);
        uVar8 = plVar3[2];
      }
      else {
        lVar14 = plVar3[1];
        puVar4 = (undefined4 *)(lVar14 + uVar2 * 4);
        uVar8 = uVar2;
      }
      if (1 < uVar15) {
        _bzero(puVar4,(uVar6 + ~uVar2) * 4);
        puVar4 = (undefined4 *)(lVar14 + uVar2 * -4 + (uVar8 + uVar18 + (ulong)bVar1) * 4 + -4);
        uVar8 = (uVar15 + uVar8) - 1;
      }
      *puVar4 = 0;
      uVar6 = uVar8 + 1;
    }
    plVar3[2] = uVar6;
    uVar15 = plVar5[1];
    uVar18 = plVar5[2];
    if (uVar6 <= (ulong)plVar5[2]) {
      uVar18 = uVar6;
    }
  }
  else {
    uVar15 = plVar5[1];
    uVar18 = plVar5[2];
    if ((ulong)plVar3[2] <= (ulong)plVar5[2]) {
      uVar18 = plVar3[2];
    }
  }
  if (uVar18 == 0) goto LAB_005e4c5c;
  uVar6 = plVar3[1];
  if ((uVar18 < 4) || (uVar6 < uVar15 + uVar18 * 4 && uVar15 < uVar6 + uVar18 * 4)) {
    uVar2 = 0;
  }
  else {
    if (uVar18 < 0x10) {
      uVar8 = 0;
    }
    else {
      uVar2 = uVar18 & 0xfffffffffffffff0;
      puVar12 = (undefined8 *)(uVar15 + 0x20);
      puVar13 = (undefined8 *)(uVar6 + 0x20);
      uVar8 = uVar2;
      do {
        uVar17 = puVar12[-3];
        uVar16 = puVar12[-4];
        uVar20 = puVar12[-1];
        uVar19 = puVar12[-2];
        uVar22 = puVar12[1];
        uVar21 = *puVar12;
        uVar24 = puVar12[3];
        uVar23 = puVar12[2];
        uVar26 = puVar13[-3];
        uVar25 = puVar13[-4];
        uVar28 = puVar13[-1];
        uVar27 = puVar13[-2];
        uVar30 = puVar13[1];
        uVar29 = *puVar13;
        uVar32 = puVar13[3];
        uVar31 = puVar13[2];
        puVar13[-3] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                               CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                        (byte)((ulong)uVar17 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                 (byte)((ulong)uVar17 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                          (byte)((ulong)uVar17 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                   (byte)((ulong)uVar17 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar26 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar17 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar17)))))));
        puVar13[-4] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                               CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                        (byte)((ulong)uVar16 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                 (byte)((ulong)uVar16 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                          (byte)((ulong)uVar16 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                   (byte)((ulong)uVar16 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar25 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar16 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar25 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar16)))))));
        puVar13[-1] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                               CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                        (byte)((ulong)uVar20 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                 (byte)((ulong)uVar20 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                          (byte)((ulong)uVar20 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                                   (byte)((ulong)uVar20 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar28 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar28 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar20)))))));
        puVar13[-2] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                               CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                        (byte)((ulong)uVar19 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                 (byte)((ulong)uVar19 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                          (byte)((ulong)uVar19 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                                   (byte)((ulong)uVar19 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar27 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar19 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar27 >> 8) ^ (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar27 ^ (byte)uVar19)))))));
        puVar13[1] = CONCAT17((byte)((ulong)uVar30 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                              CONCAT16((byte)((ulong)uVar30 >> 0x30) ^ (byte)((ulong)uVar22 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar30 >> 0x28) ^
                                                 (byte)((ulong)uVar22 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar30 >> 0x20) ^
                                                          (byte)((ulong)uVar22 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar30 >> 0x18) ^
                                                                   (byte)((ulong)uVar22 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar30 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar22 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar30 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar22)))))));
        *puVar13 = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                            CONCAT16((byte)((ulong)uVar29 >> 0x30) ^ (byte)((ulong)uVar21 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                              (byte)((ulong)uVar21 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                       (byte)((ulong)uVar21 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar29 >> 0x18) ^
                                                                (byte)((ulong)uVar21 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar29 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar21 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar29 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar21)))))));
        puVar13[3] = CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                              CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)uVar24 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                                 (byte)((ulong)uVar24 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                          (byte)((ulong)uVar24 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                                   (byte)((ulong)uVar24 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar32 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar24 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar32 >> 8) ^ (byte)((ulong)uVar24 >> 8),
                                                  (byte)uVar32 ^ (byte)uVar24)))))));
        puVar13[2] = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                              CONCAT16((byte)((ulong)uVar31 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                 (byte)((ulong)uVar23 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                          (byte)((ulong)uVar23 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar31 >> 0x18) ^
                                                                   (byte)((ulong)uVar23 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar31 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar23 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar31 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar23)))))));
        uVar8 = uVar8 - 0x10;
        puVar12 = puVar12 + 8;
        puVar13 = puVar13 + 8;
      } while (uVar8 != 0);
      if (uVar18 == uVar2) goto LAB_005e4c5c;
      uVar8 = uVar2;
      if ((uVar18 & 0xc) == 0) goto code_r0x005e4c34;
    }
    uVar2 = uVar18 & 0xfffffffffffffffc;
    lVar14 = uVar8 - uVar2;
    puVar12 = (undefined8 *)(uVar6 + uVar8 * 4);
    puVar13 = (undefined8 *)(uVar15 + uVar8 * 4);
    do {
      uVar17 = puVar13[1];
      uVar16 = *puVar13;
      uVar20 = puVar12[1];
      uVar19 = *puVar12;
      puVar12[1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                            CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                              (byte)((ulong)uVar17 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                       (byte)((ulong)uVar17 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                (byte)((ulong)uVar17 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar20 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar17 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar17)))))));
      *puVar12 = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                          CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                            (byte)((ulong)uVar16 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                     (byte)((ulong)uVar16 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                              (byte)((ulong)uVar16 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar19 >> 0x10)
                                                                       ^ (byte)((ulong)uVar16 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar19
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar16
                                                                                      >> 8),
                                                                                (byte)uVar19 ^
                                                                                (byte)uVar16)))))));
      lVar14 = lVar14 + 4;
      puVar12 = puVar12 + 2;
      puVar13 = puVar13 + 2;
    } while (lVar14 != 0);
    if (uVar18 == uVar2) goto LAB_005e4c5c;
  }
code_r0x005e4c34:
  lVar14 = uVar18 - uVar2;
  puVar7 = (uint *)(uVar6 + uVar2 * 4);
  puVar9 = (uint *)(uVar15 + uVar2 * 4);
  do {
    *puVar7 = *puVar7 ^ *puVar9;
    lVar14 = lVar14 + -1;
    puVar7 = puVar7 + 1;
    puVar9 = puVar9 + 1;
  } while (lVar14 != 0);
LAB_005e4c5c:
  if (*plVar5 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar15,*plVar5 << 2,4);
  return;
}

