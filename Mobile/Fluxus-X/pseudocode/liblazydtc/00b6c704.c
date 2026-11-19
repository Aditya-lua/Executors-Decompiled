/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6c704
 */

undefined8 mbedtls_chacha20_update(long param_1,long param_2,long param_3,long param_4)

{
  long lVar1;
  ulong uVar2;
  byte *pbVar3;
  ulong uVar4;
  ulong uVar5;
  byte *pbVar6;
  undefined8 *puVar7;
  byte *pbVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  
  if (param_2 != 0) {
    uVar2 = *(ulong *)(param_1 + 0x80);
    lVar12 = 0;
    uVar14 = param_2 - 0x40U;
    do {
      if (0x3f < uVar2) {
        uVar2 = param_2 - lVar12;
        lVar13 = lVar12;
        if (0x3f < uVar2) {
          puVar10 = (undefined8 *)(param_4 + lVar12 + 0x20);
          puVar9 = (undefined8 *)(param_3 + lVar12 + 0x20);
          lVar13 = (uVar14 & 0xffffffffffffffc0) + lVar12 + 0x40;
          do {
            FUN_00b6c998(param_1,param_1 + 0x40);
            uVar16 = *(undefined8 *)(param_1 + 0x48);
            uVar15 = *(undefined8 *)(param_1 + 0x40);
            uVar2 = uVar2 - 0x40;
            *(int *)(param_1 + 0x30) = *(int *)(param_1 + 0x30) + 1;
            uVar18 = puVar9[-3];
            uVar17 = puVar9[-4];
            puVar10[-3] = CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar16 >> 0x30) ^
                                            (byte)((ulong)uVar18 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                                     (byte)((ulong)uVar18 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                              (byte)((ulong)uVar18 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar16 >> 0x18)
                                                                       ^ (byte)((ulong)uVar18 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar16
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar18
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar16 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar16 ^ (byte)uVar18)))))));
            puVar10[-4] = CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar15 >> 0x30) ^
                                            (byte)((ulong)uVar17 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                                     (byte)((ulong)uVar17 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                              (byte)((ulong)uVar17 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar15 >> 0x18)
                                                                       ^ (byte)((ulong)uVar17 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar15
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar17
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar15 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar15 ^ (byte)uVar17)))))));
            uVar16 = puVar9[-1];
            uVar15 = puVar9[-2];
            uVar18 = *(undefined8 *)(param_1 + 0x58);
            uVar17 = *(undefined8 *)(param_1 + 0x50);
            puVar10[-1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                            (byte)((ulong)uVar16 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                     (byte)((ulong)uVar16 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                              (byte)((ulong)uVar16 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar18 >> 0x18)
                                                                       ^ (byte)((ulong)uVar16 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar18
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar16
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar18 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar16)))))));
            puVar10[-2] = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar17 >> 0x30) ^
                                            (byte)((ulong)uVar15 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                     (byte)((ulong)uVar15 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                              (byte)((ulong)uVar15 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar17 >> 0x18)
                                                                       ^ (byte)((ulong)uVar15 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar17
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar15
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar17 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar15)))))));
            uVar16 = puVar9[1];
            uVar15 = *puVar9;
            uVar18 = *(undefined8 *)(param_1 + 0x68);
            uVar17 = *(undefined8 *)(param_1 + 0x60);
            puVar10[1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                           (byte)((ulong)uVar16 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                    (byte)((ulong)uVar16 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                             (byte)((ulong)uVar16 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar18 >> 0x18)
                                                                      ^ (byte)((ulong)uVar16 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar18
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar16
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar18 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar16)))))));
            *puVar10 = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                CONCAT16((byte)((ulong)uVar17 >> 0x30) ^
                                         (byte)((ulong)uVar15 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                  (byte)((ulong)uVar15 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                           (byte)((ulong)uVar15 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                                    (byte)((ulong)uVar15 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar17 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar15 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar17 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar15)))))));
            uVar16 = puVar9[3];
            uVar15 = puVar9[2];
            uVar18 = *(undefined8 *)(param_1 + 0x78);
            uVar17 = *(undefined8 *)(param_1 + 0x70);
            puVar9 = puVar9 + 8;
            puVar10[3] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                           (byte)((ulong)uVar16 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                    (byte)((ulong)uVar16 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                             (byte)((ulong)uVar16 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar18 >> 0x18)
                                                                      ^ (byte)((ulong)uVar16 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar18
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar16
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar18 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar16)))))));
            puVar10[2] = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar17 >> 0x30) ^
                                           (byte)((ulong)uVar15 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                    (byte)((ulong)uVar15 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                             (byte)((ulong)uVar15 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar17 >> 0x18)
                                                                      ^ (byte)((ulong)uVar15 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar17
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar15
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar17 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar15)))))));
            puVar10 = puVar10 + 8;
          } while (0x3f < uVar2);
          uVar2 = ((param_2 - 0x40U) - (uVar14 & 0xffffffffffffffc0)) - lVar12;
          if (uVar2 == 0) {
            return 0;
          }
        }
        FUN_00b6c998(param_1,param_1 + 0x40);
        uVar14 = 0;
        *(int *)(param_1 + 0x30) = *(int *)(param_1 + 0x30) + 1;
        if (0xf < uVar2) {
          uVar4 = 0;
          do {
            puVar10 = (undefined8 *)(param_3 + lVar13 + uVar4);
            uVar16 = puVar10[1];
            uVar15 = *puVar10;
            puVar10 = (undefined8 *)(param_1 + 0x40 + uVar4);
            uVar18 = puVar10[1];
            uVar17 = *puVar10;
            uVar14 = uVar4 + 0x10;
            uVar11 = uVar4 + 0x20;
            puVar10 = (undefined8 *)(param_4 + lVar13 + uVar4);
            puVar10[1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                           (byte)((ulong)uVar16 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                    (byte)((ulong)uVar16 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                             (byte)((ulong)uVar16 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar18 >> 0x18)
                                                                      ^ (byte)((ulong)uVar16 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar18
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar16
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar18 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar16)))))));
            *puVar10 = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                CONCAT16((byte)((ulong)uVar17 >> 0x30) ^
                                         (byte)((ulong)uVar15 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                  (byte)((ulong)uVar15 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                           (byte)((ulong)uVar15 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                                    (byte)((ulong)uVar15 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar17 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar15 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar17 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar15)))))));
            uVar4 = uVar14;
          } while (uVar11 <= uVar2);
        }
        uVar4 = uVar2 - uVar14;
        if (uVar14 <= uVar2 && uVar4 != 0) {
          if (0x1f < uVar4) {
            uVar11 = param_4 + lVar13 + uVar14;
            uVar5 = param_4 + uVar2 + lVar13;
            if ((param_3 + uVar2 + lVar13 <= uVar11 || uVar5 <= param_3 + lVar13 + uVar14) &&
               (param_1 + 0x40 + uVar2 <= uVar11 || uVar5 <= param_1 + 0x40 + uVar14)) {
              uVar5 = uVar4 & 0xffffffffffffffe0;
              lVar1 = param_1 + uVar14;
              lVar12 = lVar13 + uVar14 + 0x10;
              uVar14 = uVar14 + uVar5;
              puVar7 = (undefined8 *)(param_4 + lVar12);
              puVar9 = (undefined8 *)(param_3 + lVar12);
              puVar10 = (undefined8 *)(lVar1 + 0x50);
              uVar11 = uVar5;
              do {
                uVar16 = puVar9[-1];
                uVar15 = puVar9[-2];
                uVar18 = puVar9[1];
                uVar17 = *puVar9;
                uVar20 = puVar10[-1];
                uVar19 = puVar10[-2];
                uVar22 = puVar10[1];
                uVar21 = *puVar10;
                uVar11 = uVar11 - 0x20;
                puVar9 = puVar9 + 4;
                puVar10 = puVar10 + 4;
                puVar7[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                               (byte)((ulong)uVar16 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                        (byte)((ulong)uVar16 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                                 (byte)((ulong)uVar16 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar20 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar16 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar20 >> 0x10) ^ (byte)((ulong)uVar16 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar20 >> 8) ^
                                                           (byte)((ulong)uVar16 >> 8),
                                                           (byte)uVar20 ^ (byte)uVar16)))))));
                puVar7[-2] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                               (byte)((ulong)uVar15 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                        (byte)((ulong)uVar15 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                                 (byte)((ulong)uVar15 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar19 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar15 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar19 >> 0x10) ^ (byte)((ulong)uVar15 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar19 >> 8) ^
                                                           (byte)((ulong)uVar15 >> 8),
                                                           (byte)uVar19 ^ (byte)uVar15)))))));
                puVar7[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                              (byte)((ulong)uVar18 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                       (byte)((ulong)uVar18 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                                (byte)((ulong)uVar18 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar22 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar18 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar22 >> 0x10) ^ (byte)((ulong)uVar18 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar22 >> 8) ^
                                                           (byte)((ulong)uVar18 >> 8),
                                                           (byte)uVar22 ^ (byte)uVar18)))))));
                *puVar7 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                            (byte)((ulong)uVar17 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                     (byte)((ulong)uVar17 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                              (byte)((ulong)uVar17 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar21 >> 0x18)
                                                                       ^ (byte)((ulong)uVar17 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar21
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar17
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar21 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar17)))))));
                puVar7 = puVar7 + 4;
              } while (uVar11 != 0);
              if (uVar4 == uVar5) goto LAB_00b6c970;
            }
          }
          lVar12 = uVar2 - uVar14;
          pbVar3 = (byte *)(param_1 + uVar14 + 0x40);
          pbVar6 = (byte *)(param_4 + uVar14 + lVar13);
          pbVar8 = (byte *)(param_3 + uVar14 + lVar13);
          do {
            lVar12 = lVar12 + -1;
            *pbVar6 = *pbVar3 ^ *pbVar8;
            pbVar3 = pbVar3 + 1;
            pbVar6 = pbVar6 + 1;
            pbVar8 = pbVar8 + 1;
          } while (lVar12 != 0);
        }
LAB_00b6c970:
        *(ulong *)(param_1 + 0x80) = uVar2;
        return 0;
      }
      uVar14 = uVar14 - 1;
      *(byte *)(param_4 + lVar12) = *(byte *)(param_1 + uVar2 + 0x40) ^ *(byte *)(param_3 + lVar12);
      lVar12 = lVar12 + 1;
      uVar2 = *(long *)(param_1 + 0x80) + 1;
      *(ulong *)(param_1 + 0x80) = uVar2;
    } while (param_2 != lVar12);
  }
  return 0;
}

