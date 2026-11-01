
void FUN_00607db8(undefined8 param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong *puVar3;
  ulong uVar4;
  ulong *puVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long unaff_x19;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
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
  undefined8 uVar27;
  
  uVar11 = *(ulong *)(unaff_x19 + 0x18);
  uVar9 = *(ulong *)(param_2 + 0x18);
  if (uVar9 < uVar11 || uVar9 - uVar11 == 0) {
    if (uVar9 != 0) {
      uVar1 = *(ulong *)(unaff_x19 + 0x20);
      uVar11 = *(ulong *)(param_2 + 0x20);
      if ((uVar9 < 8) || (uVar1 < uVar11 + uVar9 * 8 && uVar11 < uVar1 + uVar9 * 8)) {
        uVar2 = 0;
      }
      else {
        uVar2 = uVar9 & 0xfffffffffffffff8;
        puVar6 = (undefined8 *)(uVar11 + 0x20);
        puVar7 = (undefined8 *)(uVar1 + 0x20);
        uVar4 = uVar2;
        do {
          uVar13 = puVar6[-3];
          uVar12 = puVar6[-4];
          uVar15 = puVar6[-1];
          uVar14 = puVar6[-2];
          uVar17 = puVar6[1];
          uVar16 = *puVar6;
          uVar19 = puVar6[3];
          uVar18 = puVar6[2];
          uVar21 = puVar7[-3];
          uVar20 = puVar7[-4];
          uVar23 = puVar7[-1];
          uVar22 = puVar7[-2];
          uVar25 = puVar7[1];
          uVar24 = *puVar7;
          uVar27 = puVar7[3];
          uVar26 = puVar7[2];
          puVar7[-3] = CONCAT17((byte)((ulong)uVar21 >> 0x38) | (byte)((ulong)uVar13 >> 0x38),
                                CONCAT16((byte)((ulong)uVar21 >> 0x30) |
                                         (byte)((ulong)uVar13 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar21 >> 0x28) |
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
          puVar7[-4] = CONCAT17((byte)((ulong)uVar20 >> 0x38) | (byte)((ulong)uVar12 >> 0x38),
                                CONCAT16((byte)((ulong)uVar20 >> 0x30) |
                                         (byte)((ulong)uVar12 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar20 >> 0x28) |
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
          puVar7[-1] = CONCAT17((byte)((ulong)uVar23 >> 0x38) | (byte)((ulong)uVar15 >> 0x38),
                                CONCAT16((byte)((ulong)uVar23 >> 0x30) |
                                         (byte)((ulong)uVar15 >> 0x30),
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
          puVar7[-2] = CONCAT17((byte)((ulong)uVar22 >> 0x38) | (byte)((ulong)uVar14 >> 0x38),
                                CONCAT16((byte)((ulong)uVar22 >> 0x30) |
                                         (byte)((ulong)uVar14 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar22 >> 0x28) |
                                                  (byte)((ulong)uVar14 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar22 >> 0x20) |
                                                           (byte)((ulong)uVar14 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar22 >> 0x18) |
                                                                    (byte)((ulong)uVar14 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar22 >>
                                                                                   0x10) |
                                                                             (byte)((ulong)uVar14 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) | (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar22 | (byte)uVar14)))))));
          puVar7[1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) | (byte)((ulong)uVar17 >> 0x38),
                               CONCAT16((byte)((ulong)uVar25 >> 0x30) |
                                        (byte)((ulong)uVar17 >> 0x30),
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
          *puVar7 = CONCAT17((byte)((ulong)uVar24 >> 0x38) | (byte)((ulong)uVar16 >> 0x38),
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
          puVar7[3] = CONCAT17((byte)((ulong)uVar27 >> 0x38) | (byte)((ulong)uVar19 >> 0x38),
                               CONCAT16((byte)((ulong)uVar27 >> 0x30) |
                                        (byte)((ulong)uVar19 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar27 >> 0x28) |
                                                 (byte)((ulong)uVar19 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar27 >> 0x20) |
                                                          (byte)((ulong)uVar19 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar27 >> 0x18) |
                                                                   (byte)((ulong)uVar19 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar27 >>
                                                                                  0x10) |
                                                                            (byte)((ulong)uVar19 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar27 >> 8) | (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar27 | (byte)uVar19)))))));
          puVar7[2] = CONCAT17((byte)((ulong)uVar26 >> 0x38) | (byte)((ulong)uVar18 >> 0x38),
                               CONCAT16((byte)((ulong)uVar26 >> 0x30) |
                                        (byte)((ulong)uVar18 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar26 >> 0x28) |
                                                 (byte)((ulong)uVar18 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar26 >> 0x20) |
                                                          (byte)((ulong)uVar18 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar26 >> 0x18) |
                                                                   (byte)((ulong)uVar18 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar26 >>
                                                                                  0x10) |
                                                                            (byte)((ulong)uVar18 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) | (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar26 | (byte)uVar18)))))));
          uVar4 = uVar4 - 8;
          puVar6 = puVar6 + 8;
          puVar7 = puVar7 + 8;
        } while (uVar4 != 0);
        if (uVar9 == uVar2) goto LAB_00607f9c;
      }
      lVar10 = uVar9 - uVar2;
      puVar3 = (ulong *)(uVar11 + uVar2 * 8);
      puVar5 = (ulong *)(uVar1 + uVar2 * 8);
      do {
        *puVar5 = *puVar5 | *puVar3;
        lVar10 = lVar10 + -1;
        puVar3 = puVar3 + 1;
        puVar5 = puVar5 + 1;
      } while (lVar10 != 0);
    }
    goto LAB_00607f9c;
  }
  lVar10 = *(long *)(unaff_x19 + 0x20);
  func_0x006108a0(uVar9);
  uVar1 = func_0x006115d0(uVar9 << 3);
  if ((lVar10 == 0) || (uVar1 == 0)) {
    if (lVar10 != 0) goto LAB_00607e84;
  }
  else {
    uVar2 = uVar9;
    if (uVar11 <= uVar9) {
      uVar2 = uVar11;
    }
    _memcpy(uVar1,lVar10,uVar2 << 3);
LAB_00607e84:
    if (uVar11 != 0) {
      uVar2 = uVar11;
      do {
        *(undefined8 *)(lVar10 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644(lVar10);
  }
  *(ulong *)(unaff_x19 + 0x18) = uVar9;
  *(ulong *)(unaff_x19 + 0x20) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
  uVar2 = *(ulong *)(param_2 + 0x20);
  if (uVar11 != 0) {
    if ((uVar11 < 8) || (uVar1 < uVar2 + uVar11 * 8 && uVar2 < uVar1 + uVar11 * 8)) {
      uVar4 = 0;
    }
    else {
      uVar4 = uVar11 & 0xfffffffffffffff8;
      puVar6 = (undefined8 *)(uVar2 + 0x20);
      puVar7 = (undefined8 *)(uVar1 + 0x20);
      uVar8 = uVar4;
      do {
        uVar13 = puVar6[-3];
        uVar12 = puVar6[-4];
        uVar15 = puVar6[-1];
        uVar14 = puVar6[-2];
        uVar17 = puVar6[1];
        uVar16 = *puVar6;
        uVar19 = puVar6[3];
        uVar18 = puVar6[2];
        uVar21 = puVar7[-3];
        uVar20 = puVar7[-4];
        uVar23 = puVar7[-1];
        uVar22 = puVar7[-2];
        uVar25 = puVar7[1];
        uVar24 = *puVar7;
        uVar27 = puVar7[3];
        uVar26 = puVar7[2];
        puVar7[-3] = CONCAT17((byte)((ulong)uVar21 >> 0x38) | (byte)((ulong)uVar13 >> 0x38),
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
        puVar7[-4] = CONCAT17((byte)((ulong)uVar20 >> 0x38) | (byte)((ulong)uVar12 >> 0x38),
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
        puVar7[-1] = CONCAT17((byte)((ulong)uVar23 >> 0x38) | (byte)((ulong)uVar15 >> 0x38),
                              CONCAT16((byte)((ulong)uVar23 >> 0x30) | (byte)((ulong)uVar15 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar23 >> 0x28) |
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
        puVar7[-2] = CONCAT17((byte)((ulong)uVar22 >> 0x38) | (byte)((ulong)uVar14 >> 0x38),
                              CONCAT16((byte)((ulong)uVar22 >> 0x30) | (byte)((ulong)uVar14 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar22 >> 0x28) |
                                                 (byte)((ulong)uVar14 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar22 >> 0x20) |
                                                          (byte)((ulong)uVar14 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar22 >> 0x18) |
                                                                   (byte)((ulong)uVar14 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar22 >>
                                                                                  0x10) |
                                                                            (byte)((ulong)uVar14 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) | (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar22 | (byte)uVar14)))))));
        puVar7[1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) | (byte)((ulong)uVar17 >> 0x38),
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
        *puVar7 = CONCAT17((byte)((ulong)uVar24 >> 0x38) | (byte)((ulong)uVar16 >> 0x38),
                           CONCAT16((byte)((ulong)uVar24 >> 0x30) | (byte)((ulong)uVar16 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar24 >> 0x28) |
                                             (byte)((ulong)uVar16 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar24 >> 0x20) |
                                                      (byte)((ulong)uVar16 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar24 >> 0x18) |
                                                               (byte)((ulong)uVar16 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar24 >> 0x10
                                                                              ) | (byte)((ulong)
                                                  uVar16 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar24 >> 8) |
                                                           (byte)((ulong)uVar16 >> 8),
                                                           (byte)uVar24 | (byte)uVar16)))))));
        puVar7[3] = CONCAT17((byte)((ulong)uVar27 >> 0x38) | (byte)((ulong)uVar19 >> 0x38),
                             CONCAT16((byte)((ulong)uVar27 >> 0x30) | (byte)((ulong)uVar19 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar27 >> 0x28) |
                                               (byte)((ulong)uVar19 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar27 >> 0x20) |
                                                        (byte)((ulong)uVar19 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar27 >> 0x18) |
                                                                 (byte)((ulong)uVar19 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar27 >>
                                                                                0x10) |
                                                                          (byte)((ulong)uVar19 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar27 >> 8) | (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar27 | (byte)uVar19)))))));
        puVar7[2] = CONCAT17((byte)((ulong)uVar26 >> 0x38) | (byte)((ulong)uVar18 >> 0x38),
                             CONCAT16((byte)((ulong)uVar26 >> 0x30) | (byte)((ulong)uVar18 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar26 >> 0x28) |
                                               (byte)((ulong)uVar18 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar26 >> 0x20) |
                                                        (byte)((ulong)uVar18 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar26 >> 0x18) |
                                                                 (byte)((ulong)uVar18 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar26 >>
                                                                                0x10) |
                                                                          (byte)((ulong)uVar18 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) | (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar26 | (byte)uVar18)))))));
        uVar8 = uVar8 - 8;
        puVar6 = puVar6 + 8;
        puVar7 = puVar7 + 8;
      } while (uVar8 != 0);
      if (uVar11 == uVar4) goto LAB_00607f80;
    }
    lVar10 = uVar11 - uVar4;
    puVar3 = (ulong *)(uVar1 + uVar4 * 8);
    puVar5 = (ulong *)(uVar2 + uVar4 * 8);
    do {
      *puVar3 = *puVar3 | *puVar5;
      lVar10 = lVar10 + -1;
      puVar3 = puVar3 + 1;
      puVar5 = puVar5 + 1;
    } while (lVar10 != 0);
  }
LAB_00607f80:
  if (uVar1 != uVar2) {
    _memcpy(uVar1 + uVar11 * 8,uVar2 + uVar11 * 8,(uVar9 - uVar11) * 8);
  }
LAB_00607f9c:
  *(undefined4 *)(unaff_x19 + 0x28) = 0;
  return;
}

