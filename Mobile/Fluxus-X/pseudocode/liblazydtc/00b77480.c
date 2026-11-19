/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b77480
 */

undefined8 mbedtls_gcm_update_ad(long param_1,undefined8 *param_2,ulong param_3)

{
  undefined8 *puVar1;
  ulong uVar2;
  ulong uVar3;
  byte *pbVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  undefined8 *puVar10;
  byte *pbVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  
  uVar3 = *(ulong *)(param_1 + 0x168);
  uVar5 = uVar3 + param_3;
  if (CARRY8(uVar3,param_3)) {
    return 0xffffffec;
  }
  if (uVar5 >> 0x3d != 0) {
    return 0xffffffec;
  }
  uVar3 = uVar3 & 0xf;
  if (uVar3 == 0) goto LAB_00b775c8;
  uVar2 = param_3;
  if (0x10 - uVar3 <= param_3) {
    uVar2 = 0x10 - uVar3;
  }
  lVar7 = param_1 + 400;
  uVar5 = 0;
  puVar6 = (undefined8 *)(lVar7 + uVar3);
  if (0xf < uVar2) {
    uVar18 = puVar6[1];
    uVar17 = *puVar6;
    uVar20 = param_2[1];
    uVar19 = *param_2;
    uVar5 = 0x10;
    puVar6[1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                         CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                           (byte)((ulong)uVar18 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                    (byte)((ulong)uVar18 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                             (byte)((ulong)uVar18 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar20 >> 0x10)
                                                                      ^ (byte)((ulong)uVar18 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar20
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar18
                                                                                     >> 8),
                                                                               (byte)uVar20 ^
                                                                               (byte)uVar18)))))));
    *puVar6 = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                       CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                         (byte)((ulong)uVar17 >> 0x28),
                                         CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                  (byte)((ulong)uVar17 >> 0x20),
                                                  CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                           (byte)((ulong)uVar17 >> 0x18),
                                                           CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                    (byte)((ulong)uVar17 >> 0x10),
                                                                    CONCAT11((byte)((ulong)uVar19 >>
                                                                                   8) ^
                                                                             (byte)((ulong)uVar17 >>
                                                                                   8),(byte)uVar19 ^
                                                                                      (byte)uVar17))
                                                          )))));
  }
  if (uVar5 < uVar2) {
    uVar12 = ~param_3;
    uVar8 = uVar3 - 0x11;
    uVar13 = uVar8;
    if (uVar8 < uVar12) {
      uVar13 = ~param_3;
    }
    uVar13 = ~uVar5 - uVar13;
    if (uVar13 < 0x20) {
LAB_00b7755c:
      uVar14 = uVar5;
    }
    else {
      uVar14 = uVar8;
      if (uVar8 < uVar12) {
        uVar14 = ~param_3;
      }
      if ((param_1 + (uVar5 | uVar3) + 400 < (long)param_2 + uVar2) &&
         ((long)param_2 + uVar5 < param_1 + ((uVar3 + 399) - uVar14))) goto LAB_00b7755c;
      uVar15 = uVar13 & 0xffffffffffffffe0;
      uVar16 = 0;
      uVar14 = uVar5 | uVar15;
      do {
        puVar10 = (undefined8 *)((long)puVar6 + (uVar5 | uVar16));
        puVar1 = (undefined8 *)((long)param_2 + (uVar5 | uVar16));
        uVar18 = puVar10[1];
        uVar17 = *puVar10;
        uVar20 = puVar10[3];
        uVar19 = puVar10[2];
        uVar22 = puVar1[1];
        uVar21 = *puVar1;
        uVar24 = puVar1[3];
        uVar23 = puVar1[2];
        uVar16 = uVar16 + 0x20;
        puVar10[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                              CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                 (byte)((ulong)uVar18 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                          (byte)((ulong)uVar18 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                                   (byte)((ulong)uVar18 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar22 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar18 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar18)))))));
        *puVar10 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                            CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                              (byte)((ulong)uVar17 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                       (byte)((ulong)uVar17 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                                (byte)((ulong)uVar17 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar21 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar17 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar17)))))));
        puVar10[3] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                              CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                 (byte)((ulong)uVar20 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                          (byte)((ulong)uVar20 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                   (byte)((ulong)uVar20 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar24 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
        puVar10[2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                              CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                 (byte)((ulong)uVar19 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                          (byte)((ulong)uVar19 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                                   (byte)((ulong)uVar19 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar23 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar19 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) ^ (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar19)))))));
      } while (uVar15 != uVar16);
      if (uVar13 == uVar15) goto LAB_00b77598;
    }
    if (uVar8 < uVar12) {
      uVar8 = ~param_3;
    }
    lVar9 = ~uVar8 - uVar14;
    pbVar4 = (byte *)((long)param_2 + uVar14);
    pbVar11 = (byte *)(param_1 + uVar14 + uVar3 + 400);
    do {
      lVar9 = lVar9 + -1;
      *pbVar11 = *pbVar4 ^ *pbVar11;
      pbVar4 = pbVar4 + 1;
      pbVar11 = pbVar11 + 1;
    } while (lVar9 != 0);
  }
LAB_00b77598:
  if (uVar2 + uVar3 == 0x10) {
    FUN_00b773c8(param_1,lVar7,lVar7);
  }
  param_2 = (undefined8 *)((long)param_2 + uVar2);
  uVar5 = *(long *)(param_1 + 0x168) + param_3;
  param_3 = param_3 - uVar2;
  *(ulong *)(param_1 + 0x168) = *(long *)(param_1 + 0x168) + uVar2;
LAB_00b775c8:
  uVar3 = param_3 - 0x10;
  *(ulong *)(param_1 + 0x168) = uVar5;
  if (0xf < param_3) {
    uVar5 = uVar3 & 0xfffffffffffffff0;
    puVar6 = param_2;
    do {
      uVar18 = *(undefined8 *)(param_1 + 0x198);
      uVar17 = *(undefined8 *)(param_1 + 400);
      uVar20 = puVar6[1];
      uVar19 = *puVar6;
      *(ulong *)(param_1 + 0x198) =
           CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                    CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                             CONCAT15((byte)((ulong)uVar20 >> 0x28) ^ (byte)((ulong)uVar18 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                               (byte)((ulong)uVar18 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                        (byte)((ulong)uVar18 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                                 (byte)((ulong)uVar18 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar20 >> 8)
                                                                          ^ (byte)((ulong)uVar18 >>
                                                                                  8),
                                                                          (byte)uVar20 ^
                                                                          (byte)uVar18)))))));
      *(ulong *)(param_1 + 400) =
           CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                    CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                             CONCAT15((byte)((ulong)uVar19 >> 0x28) ^ (byte)((ulong)uVar17 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                               (byte)((ulong)uVar17 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                        (byte)((ulong)uVar17 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                 (byte)((ulong)uVar17 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar19 >> 8)
                                                                          ^ (byte)((ulong)uVar17 >>
                                                                                  8),
                                                                          (byte)uVar19 ^
                                                                          (byte)uVar17)))))));
      FUN_00b773c8(param_1,param_1 + 400,param_1 + 400);
      param_3 = param_3 - 0x10;
      puVar6 = puVar6 + 2;
    } while (0xf < param_3);
    param_3 = uVar3 - uVar5;
    param_2 = (undefined8 *)((long)param_2 + uVar5 + 0x10);
  }
  if (param_3 != 0) {
    uVar5 = 0;
    if ((0x1f < param_3) &&
       (((long)param_2 + param_3 <= param_1 + 400U ||
        (uVar5 = 0, (undefined8 *)(param_1 + param_3 + 400) <= param_2)))) {
      uVar5 = param_3 & 0xffffffffffffffe0;
      puVar6 = (undefined8 *)(param_1 + 0x1a0);
      puVar10 = param_2 + 2;
      uVar3 = uVar5;
      do {
        uVar18 = puVar6[-1];
        uVar17 = puVar6[-2];
        uVar20 = puVar6[1];
        uVar19 = *puVar6;
        uVar22 = puVar10[-1];
        uVar21 = puVar10[-2];
        uVar24 = puVar10[1];
        uVar23 = *puVar10;
        uVar3 = uVar3 - 0x20;
        puVar10 = puVar10 + 4;
        puVar6[-1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                              CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                 (byte)((ulong)uVar18 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                          (byte)((ulong)uVar18 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                                   (byte)((ulong)uVar18 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar22 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar18 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar18)))))));
        puVar6[-2] = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                              CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                 (byte)((ulong)uVar17 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                          (byte)((ulong)uVar17 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                                   (byte)((ulong)uVar17 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar21 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar17 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar17)))))));
        puVar6[1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                             CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                               (byte)((ulong)uVar20 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                        (byte)((ulong)uVar20 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                 (byte)((ulong)uVar20 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar24 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar20 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
        *puVar6 = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                           CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                             (byte)((ulong)uVar19 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                      (byte)((ulong)uVar19 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                               (byte)((ulong)uVar19 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar23 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar19 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar23 >> 8) ^
                                                           (byte)((ulong)uVar19 >> 8),
                                                           (byte)uVar23 ^ (byte)uVar19)))))));
        puVar6 = puVar6 + 4;
      } while (uVar3 != 0);
      if (param_3 == uVar5) {
        return 0;
      }
    }
    lVar7 = param_3 - uVar5;
    pbVar4 = (byte *)((long)param_2 + uVar5);
    pbVar11 = (byte *)(param_1 + uVar5 + 400);
    do {
      lVar7 = lVar7 + -1;
      *pbVar11 = *pbVar4 ^ *pbVar11;
      pbVar4 = pbVar4 + 1;
      pbVar11 = pbVar11 + 1;
    } while (lVar7 != 0);
  }
  return 0;
}

