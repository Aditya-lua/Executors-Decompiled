
void FUN_005e4dc8(long param_1,long param_2,long param_3)

{
  ulong uVar1;
  undefined4 *puVar2;
  uint *puVar3;
  long in_x9;
  ulong uVar4;
  uint *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong uVar10;
  long lVar11;
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
  
  if (param_1 - unaff_x20 < unaff_x19) {
    func_0x007afea0();
    lVar11 = *(long *)(param_2 + 8);
    puVar2 = (undefined4 *)(lVar11 + *(ulong *)(param_2 + 0x10) * 4);
    uVar10 = *(ulong *)(param_2 + 0x10);
  }
  else {
    lVar11 = *(long *)(param_2 + 8);
    puVar2 = (undefined4 *)(lVar11 + unaff_x20 * 4);
    uVar10 = unaff_x20;
  }
  if (1 < unaff_x19) {
    _bzero(puVar2,(in_x9 + ~unaff_x20) * 4);
    puVar2 = (undefined4 *)(lVar11 + unaff_x20 * -4 + (uVar10 + unaff_x21 + unaff_x22) * 4 + -4);
    uVar10 = (unaff_x19 + uVar10) - 1;
  }
  *puVar2 = 0;
  uVar10 = uVar10 + 1;
  *(ulong *)(param_2 + 0x10) = uVar10;
  uVar1 = *(ulong *)(param_3 + 0x10);
  if (uVar10 <= *(ulong *)(param_3 + 0x10)) {
    uVar1 = uVar10;
  }
  if (uVar1 == 0) {
    return;
  }
  uVar10 = *(ulong *)(param_2 + 8);
  uVar4 = *(ulong *)(param_3 + 8);
  if ((uVar1 < 4) || (uVar10 < uVar4 + uVar1 * 4 && uVar4 < uVar10 + uVar1 * 4)) {
    uVar7 = 0;
  }
  else {
    if (uVar1 < 0x10) {
      uVar6 = 0;
    }
    else {
      uVar7 = uVar1 & 0xfffffffffffffff0;
      puVar8 = (undefined8 *)(uVar4 + 0x20);
      puVar9 = (undefined8 *)(uVar10 + 0x20);
      uVar6 = uVar7;
      do {
        uVar13 = puVar8[-3];
        uVar12 = puVar8[-4];
        uVar15 = puVar8[-1];
        uVar14 = puVar8[-2];
        uVar17 = puVar8[1];
        uVar16 = *puVar8;
        uVar19 = puVar8[3];
        uVar18 = puVar8[2];
        uVar21 = puVar9[-3];
        uVar20 = puVar9[-4];
        uVar23 = puVar9[-1];
        uVar22 = puVar9[-2];
        uVar25 = puVar9[1];
        uVar24 = *puVar9;
        uVar27 = puVar9[3];
        uVar26 = puVar9[2];
        puVar9[-3] = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
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
        puVar9[-4] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
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
        puVar9[-1] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                              CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
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
        puVar9[-2] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
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
        puVar9[1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
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
        *puVar9 = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                           CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                             (byte)((ulong)uVar16 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                      (byte)((ulong)uVar16 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                               (byte)((ulong)uVar16 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar24 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar16 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                           (byte)((ulong)uVar16 >> 8),
                                                           (byte)uVar24 ^ (byte)uVar16)))))));
        puVar9[3] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                             CONCAT16((byte)((ulong)uVar27 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
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
        puVar9[2] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
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
        uVar6 = uVar6 - 0x10;
        puVar8 = puVar8 + 8;
        puVar9 = puVar9 + 8;
      } while (uVar6 != 0);
      if (uVar1 == uVar7) {
        return;
      }
      uVar6 = uVar7;
      if ((uVar1 & 0xc) == 0) goto code_r0x005e4e9c;
    }
    uVar7 = uVar1 & 0xfffffffffffffffc;
    lVar11 = uVar6 - uVar7;
    puVar8 = (undefined8 *)(uVar10 + uVar6 * 4);
    puVar9 = (undefined8 *)(uVar4 + uVar6 * 4);
    do {
      uVar13 = puVar9[1];
      uVar12 = *puVar9;
      uVar15 = puVar8[1];
      uVar14 = *puVar8;
      puVar8[1] = CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                           CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                             (byte)((ulong)uVar13 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                      (byte)((ulong)uVar13 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                               (byte)((ulong)uVar13 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar15 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar13 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar15 >> 8) ^
                                                           (byte)((ulong)uVar13 >> 8),
                                                           (byte)uVar15 ^ (byte)uVar13)))))));
      *puVar8 = CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                         CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar14 >> 0x28) ^
                                           (byte)((ulong)uVar12 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                    (byte)((ulong)uVar12 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                             (byte)((ulong)uVar12 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar14 >> 0x10)
                                                                      ^ (byte)((ulong)uVar12 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar14
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar12
                                                                                     >> 8),
                                                                               (byte)uVar14 ^
                                                                               (byte)uVar12)))))));
      lVar11 = lVar11 + 4;
      puVar8 = puVar8 + 2;
      puVar9 = puVar9 + 2;
    } while (lVar11 != 0);
    if (uVar1 == uVar7) {
      return;
    }
  }
code_r0x005e4e9c:
  lVar11 = uVar1 - uVar7;
  puVar3 = (uint *)(uVar10 + uVar7 * 4);
  puVar5 = (uint *)(uVar4 + uVar7 * 4);
  do {
    *puVar3 = *puVar3 ^ *puVar5;
    lVar11 = lVar11 + -1;
    puVar3 = puVar3 + 1;
    puVar5 = puVar5 + 1;
  } while (lVar11 != 0);
  return;
}

