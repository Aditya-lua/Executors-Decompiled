
void FUN_00608018(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong *puVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  ulong *puVar7;
  ulong uVar8;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
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
  undefined8 uVar24;
  
  _memcpy();
  if (unaff_x24 != 0) {
    uVar1 = unaff_x24;
    do {
      *(undefined8 *)(unaff_x23 + -8 + uVar1 * 8) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  func_0x00611644();
  *(undefined8 *)(unaff_x19 + 0x18) = unaff_x21;
  *(ulong *)(unaff_x19 + 0x20) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
  uVar1 = *(ulong *)(unaff_x22 + 0x20);
  if (unaff_x24 != 0) {
    if ((unaff_x24 < 8) || (unaff_x20 < uVar1 + unaff_x24 * 8 && uVar1 < unaff_x20 + unaff_x24 * 8))
    {
      uVar2 = 0;
    }
    else {
      uVar2 = unaff_x24 & 0xfffffffffffffff8;
      puVar4 = (undefined8 *)(uVar1 + 0x20);
      puVar6 = (undefined8 *)(unaff_x20 + 0x20);
      uVar8 = uVar2;
      do {
        uVar10 = puVar4[-3];
        uVar9 = puVar4[-4];
        uVar12 = puVar4[-1];
        uVar11 = puVar4[-2];
        uVar14 = puVar4[1];
        uVar13 = *puVar4;
        uVar16 = puVar4[3];
        uVar15 = puVar4[2];
        uVar18 = puVar6[-3];
        uVar17 = puVar6[-4];
        uVar20 = puVar6[-1];
        uVar19 = puVar6[-2];
        uVar22 = puVar6[1];
        uVar21 = *puVar6;
        uVar24 = puVar6[3];
        uVar23 = puVar6[2];
        puVar6[-3] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                              CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                 (byte)((ulong)uVar10 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                          (byte)((ulong)uVar10 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                                   (byte)((ulong)uVar10 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar18 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar10 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar18 >> 8) ^ (byte)((ulong)uVar10 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar10)))))));
        puVar6[-4] = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar9 >> 0x38),
                              CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar9 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                (byte)((ulong)uVar9 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                         (byte)((ulong)uVar9 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                                  (byte)((ulong)uVar9 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar17 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)uVar9 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar17 >> 8) ^ (byte)((ulong)uVar9 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar9)))))));
        puVar6[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
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
        puVar6[-2] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
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
        puVar6[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                             CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
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
        *puVar6 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                           CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                             (byte)((ulong)uVar13 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                      (byte)((ulong)uVar13 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                               (byte)((ulong)uVar13 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar21 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar13 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) ^
                                                           (byte)((ulong)uVar13 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar13)))))));
        puVar6[3] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
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
        puVar6[2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                             CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                               (byte)((ulong)uVar15 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                        (byte)((ulong)uVar15 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                                 (byte)((ulong)uVar15 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar23 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar15 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar15)))))));
        uVar8 = uVar8 - 8;
        puVar4 = puVar4 + 8;
        puVar6 = puVar6 + 8;
      } while (uVar8 != 0);
      if (unaff_x24 == uVar2) goto LAB_006081cc;
    }
    lVar5 = unaff_x24 - uVar2;
    puVar3 = (ulong *)(unaff_x20 + uVar2 * 8);
    puVar7 = (ulong *)(uVar1 + uVar2 * 8);
    do {
      *puVar3 = *puVar3 ^ *puVar7;
      lVar5 = lVar5 + -1;
      puVar3 = puVar3 + 1;
      puVar7 = puVar7 + 1;
    } while (lVar5 != 0);
  }
LAB_006081cc:
  if (unaff_x20 != uVar1) {
    _memcpy(unaff_x20 + unaff_x24 * 8,uVar1 + unaff_x24 * 8,unaff_x25 << 3);
  }
  *(undefined4 *)(unaff_x19 + 0x28) = 0;
  return;
}

