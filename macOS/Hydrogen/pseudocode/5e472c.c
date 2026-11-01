
void FUN_005e472c(long *param_1,long param_2)

{
  bool bVar1;
  ulong uVar2;
  undefined4 *puVar3;
  ulong uVar4;
  uint *puVar5;
  uint *puVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
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
  undefined8 uVar28;
  
  uVar2 = *(ulong *)(param_2 + 0x18);
  if ((ulong)param_1[3] < uVar2) {
    uVar10 = uVar2 >> 5;
    bVar1 = (uVar2 & 0x1f) != 0;
    uVar4 = uVar10;
    if (bVar1) {
      uVar4 = uVar10 + 1;
    }
    param_1[3] = uVar2;
    uVar9 = param_1[2];
    uVar2 = uVar4 - uVar9;
    if (uVar9 <= uVar4 && uVar2 != 0) {
      if (*param_1 - uVar9 < uVar2) {
        func_0x007afea0(param_1,uVar9,uVar2);
        lVar12 = param_1[1];
        puVar3 = (undefined4 *)(lVar12 + param_1[2] * 4);
        uVar11 = param_1[2];
      }
      else {
        lVar12 = param_1[1];
        puVar3 = (undefined4 *)(lVar12 + uVar9 * 4);
        uVar11 = uVar9;
      }
      if (1 < uVar2) {
        _bzero(puVar3,(uVar4 + ~uVar9) * 4);
        puVar3 = (undefined4 *)(lVar12 + uVar9 * -4 + (uVar11 + uVar10 + (ulong)bVar1) * 4 + -4);
        uVar11 = (uVar2 + uVar11) - 1;
      }
      *puVar3 = 0;
      uVar4 = uVar11 + 1;
    }
    param_1[2] = uVar4;
    uVar2 = *(ulong *)(param_2 + 0x10);
    if (uVar4 <= *(ulong *)(param_2 + 0x10)) {
      uVar2 = uVar4;
    }
  }
  else {
    uVar2 = *(ulong *)(param_2 + 0x10);
    if ((ulong)param_1[2] <= *(ulong *)(param_2 + 0x10)) {
      uVar2 = param_1[2];
    }
  }
  if (uVar2 == 0) {
    return;
  }
  uVar4 = param_1[1];
  uVar10 = *(ulong *)(param_2 + 8);
  if ((uVar2 < 4) || (uVar4 < uVar10 + uVar2 * 4 && uVar10 < uVar4 + uVar2 * 4)) {
    uVar9 = 0;
  }
  else {
    if (uVar2 < 0x10) {
      uVar11 = 0;
    }
    else {
      uVar9 = uVar2 & 0xfffffffffffffff0;
      puVar7 = (undefined8 *)(uVar10 + 0x20);
      puVar8 = (undefined8 *)(uVar4 + 0x20);
      uVar11 = uVar9;
      do {
        uVar14 = puVar7[-3];
        uVar13 = puVar7[-4];
        uVar16 = puVar7[-1];
        uVar15 = puVar7[-2];
        uVar18 = puVar7[1];
        uVar17 = *puVar7;
        uVar20 = puVar7[3];
        uVar19 = puVar7[2];
        uVar22 = puVar8[-3];
        uVar21 = puVar8[-4];
        uVar24 = puVar8[-1];
        uVar23 = puVar8[-2];
        uVar26 = puVar8[1];
        uVar25 = *puVar8;
        uVar28 = puVar8[3];
        uVar27 = puVar8[2];
        puVar8[-3] = CONCAT17((byte)((ulong)uVar22 >> 0x38) | (byte)((ulong)uVar14 >> 0x38),
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
        puVar8[-4] = CONCAT17((byte)((ulong)uVar21 >> 0x38) | (byte)((ulong)uVar13 >> 0x38),
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
        puVar8[-1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) | (byte)((ulong)uVar16 >> 0x38),
                              CONCAT16((byte)((ulong)uVar24 >> 0x30) | (byte)((ulong)uVar16 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar24 >> 0x28) |
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
        puVar8[-2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) | (byte)((ulong)uVar15 >> 0x38),
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
        puVar8[1] = CONCAT17((byte)((ulong)uVar26 >> 0x38) | (byte)((ulong)uVar18 >> 0x38),
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
        *puVar8 = CONCAT17((byte)((ulong)uVar25 >> 0x38) | (byte)((ulong)uVar17 >> 0x38),
                           CONCAT16((byte)((ulong)uVar25 >> 0x30) | (byte)((ulong)uVar17 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar25 >> 0x28) |
                                             (byte)((ulong)uVar17 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar25 >> 0x20) |
                                                      (byte)((ulong)uVar17 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar25 >> 0x18) |
                                                               (byte)((ulong)uVar17 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar25 >> 0x10
                                                                              ) | (byte)((ulong)
                                                  uVar17 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar25 >> 8) |
                                                           (byte)((ulong)uVar17 >> 8),
                                                           (byte)uVar25 | (byte)uVar17)))))));
        puVar8[3] = CONCAT17((byte)((ulong)uVar28 >> 0x38) | (byte)((ulong)uVar20 >> 0x38),
                             CONCAT16((byte)((ulong)uVar28 >> 0x30) | (byte)((ulong)uVar20 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar28 >> 0x28) |
                                               (byte)((ulong)uVar20 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar28 >> 0x20) |
                                                        (byte)((ulong)uVar20 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar28 >> 0x18) |
                                                                 (byte)((ulong)uVar20 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar28 >>
                                                                                0x10) |
                                                                          (byte)((ulong)uVar20 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar28 >> 8) | (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar28 | (byte)uVar20)))))));
        puVar8[2] = CONCAT17((byte)((ulong)uVar27 >> 0x38) | (byte)((ulong)uVar19 >> 0x38),
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
        uVar11 = uVar11 - 0x10;
        puVar7 = puVar7 + 8;
        puVar8 = puVar8 + 8;
      } while (uVar11 != 0);
      if (uVar2 == uVar9) {
        return;
      }
      uVar11 = uVar9;
      if ((uVar2 & 0xc) == 0) goto LAB_005e483c;
    }
    uVar9 = uVar2 & 0xfffffffffffffffc;
    lVar12 = uVar11 - uVar9;
    puVar7 = (undefined8 *)(uVar4 + uVar11 * 4);
    puVar8 = (undefined8 *)(uVar10 + uVar11 * 4);
    do {
      uVar14 = puVar8[1];
      uVar13 = *puVar8;
      uVar16 = puVar7[1];
      uVar15 = *puVar7;
      puVar7[1] = CONCAT17((byte)((ulong)uVar16 >> 0x38) | (byte)((ulong)uVar14 >> 0x38),
                           CONCAT16((byte)((ulong)uVar16 >> 0x30) | (byte)((ulong)uVar14 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar16 >> 0x28) |
                                             (byte)((ulong)uVar14 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar16 >> 0x20) |
                                                      (byte)((ulong)uVar14 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar16 >> 0x18) |
                                                               (byte)((ulong)uVar14 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar16 >> 0x10
                                                                              ) | (byte)((ulong)
                                                  uVar14 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar16 >> 8) |
                                                           (byte)((ulong)uVar14 >> 8),
                                                           (byte)uVar16 | (byte)uVar14)))))));
      *puVar7 = CONCAT17((byte)((ulong)uVar15 >> 0x38) | (byte)((ulong)uVar13 >> 0x38),
                         CONCAT16((byte)((ulong)uVar15 >> 0x30) | (byte)((ulong)uVar13 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar15 >> 0x28) |
                                           (byte)((ulong)uVar13 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar15 >> 0x20) |
                                                    (byte)((ulong)uVar13 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar15 >> 0x18) |
                                                             (byte)((ulong)uVar13 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar15 >> 0x10)
                                                                      | (byte)((ulong)uVar13 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar15
                                                                                     >> 8) |
                                                                               (byte)((ulong)uVar13
                                                                                     >> 8),
                                                                               (byte)uVar15 |
                                                                               (byte)uVar13)))))));
      lVar12 = lVar12 + 4;
      puVar7 = puVar7 + 2;
      puVar8 = puVar8 + 2;
    } while (lVar12 != 0);
    if (uVar2 == uVar9) {
      return;
    }
  }
LAB_005e483c:
  lVar12 = uVar2 - uVar9;
  puVar5 = (uint *)(uVar4 + uVar9 * 4);
  puVar6 = (uint *)(uVar10 + uVar9 * 4);
  do {
    *puVar5 = *puVar5 | *puVar6;
    lVar12 = lVar12 + -1;
    puVar5 = puVar5 + 1;
    puVar6 = puVar6 + 1;
  } while (lVar12 != 0);
  return;
}

