/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b77924
 */

int FUN_00b77924(long param_1,long param_2,long param_3,ulong param_4,long param_5,long param_6)

{
  long lVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  byte *pbVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  byte *pbVar9;
  undefined8 *puVar10;
  byte *pbVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_60 = 0;
  iVar3 = mbedtls_cipher_update(param_1,param_1 + 0x180,0x10,param_2,&local_60);
  if (iVar3 != 0) {
    mbedtls_platform_zeroize(param_2,0x10);
    goto LAB_00b77cac;
  }
  if (*(char *)(param_1 + 0x1a0) == '\0') {
    uVar4 = 0;
    if (0xf < param_4) {
      lVar7 = param_1 + param_3 + 400;
      uVar6 = 0;
      do {
        puVar12 = (undefined8 *)(lVar7 + uVar6);
        uVar16 = puVar12[1];
        uVar15 = *puVar12;
        uVar18 = ((undefined8 *)(param_5 + uVar6))[1];
        uVar17 = *(undefined8 *)(param_5 + uVar6);
        uVar4 = uVar6 + 0x10;
        uVar14 = uVar6 + 0x20;
        puVar12 = (undefined8 *)(lVar7 + uVar6);
        puVar12[1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                              CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                 (byte)((ulong)uVar16 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                          (byte)((ulong)uVar16 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                                   (byte)((ulong)uVar16 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar18 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar16 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar18 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar16)))))));
        *puVar12 = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                            CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
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
        uVar6 = uVar4;
      } while (uVar14 <= param_4);
    }
    if (uVar4 < param_4) {
      uVar6 = param_4 - uVar4;
      if (0x1f < uVar6) {
        lVar7 = param_1 + uVar4 + param_3;
        if ((param_5 + param_4 <= lVar7 + 400U) ||
           (param_1 + param_4 + param_3 + 400 <= param_5 + uVar4)) {
          uVar8 = uVar6 & 0xffffffffffffffe0;
          puVar12 = (undefined8 *)(param_5 + uVar4 + 0x10);
          uVar4 = uVar4 + uVar8;
          puVar13 = (undefined8 *)(lVar7 + 0x1a0);
          uVar14 = uVar8;
          do {
            uVar16 = puVar13[-1];
            uVar15 = puVar13[-2];
            uVar18 = puVar13[1];
            uVar17 = *puVar13;
            uVar20 = puVar12[-1];
            uVar19 = puVar12[-2];
            uVar22 = puVar12[1];
            uVar21 = *puVar12;
            uVar14 = uVar14 - 0x20;
            puVar12 = puVar12 + 4;
            puVar13[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                            (byte)((ulong)uVar16 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                     (byte)((ulong)uVar16 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                              (byte)((ulong)uVar16 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar20 >> 0x18)
                                                                       ^ (byte)((ulong)uVar16 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar20
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar16
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
            puVar13[-2] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                            (byte)((ulong)uVar15 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                     (byte)((ulong)uVar15 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                              (byte)((ulong)uVar15 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar19 >> 0x18)
                                                                       ^ (byte)((ulong)uVar15 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar19
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar15
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar19 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar15)))))));
            puVar13[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                           (byte)((ulong)uVar18 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                    (byte)((ulong)uVar18 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                             (byte)((ulong)uVar18 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar22 >> 0x18)
                                                                      ^ (byte)((ulong)uVar18 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar22
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar18
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar22 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar18)))))));
            *puVar13 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                         (byte)((ulong)uVar17 >> 0x30),
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
            puVar13 = puVar13 + 4;
          } while (uVar14 != 0);
          if (uVar6 == uVar8) goto LAB_00b77a88;
        }
      }
      lVar7 = param_4 - uVar4;
      pbVar5 = (byte *)(param_5 + uVar4);
      pbVar9 = (byte *)(param_1 + uVar4 + param_3 + 400);
      do {
        lVar7 = lVar7 + -1;
        *pbVar9 = *pbVar5 ^ *pbVar9;
        pbVar5 = pbVar5 + 1;
        pbVar9 = pbVar9 + 1;
      } while (lVar7 != 0);
    }
  }
LAB_00b77a88:
  uVar4 = 0;
  if (0xf < param_4) {
    uVar6 = 0;
    do {
      puVar12 = (undefined8 *)(param_2 + param_3 + uVar6);
      uVar16 = puVar12[1];
      uVar15 = *puVar12;
      uVar18 = ((undefined8 *)(param_5 + uVar6))[1];
      uVar17 = *(undefined8 *)(param_5 + uVar6);
      uVar4 = uVar6 + 0x10;
      uVar14 = uVar6 + 0x20;
      ((undefined8 *)(param_6 + uVar6))[1] =
           CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                    CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                             CONCAT15((byte)((ulong)uVar18 >> 0x28) ^ (byte)((ulong)uVar16 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                               (byte)((ulong)uVar16 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                        (byte)((ulong)uVar16 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                                 (byte)((ulong)uVar16 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar18 >> 8)
                                                                          ^ (byte)((ulong)uVar16 >>
                                                                                  8),
                                                                          (byte)uVar18 ^
                                                                          (byte)uVar16)))))));
      *(undefined8 *)(param_6 + uVar6) =
           CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                    CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                             CONCAT15((byte)((ulong)uVar17 >> 0x28) ^ (byte)((ulong)uVar15 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                               (byte)((ulong)uVar15 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                        (byte)((ulong)uVar15 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar17 >> 0x10) ^
                                                                 (byte)((ulong)uVar15 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar17 >> 8)
                                                                          ^ (byte)((ulong)uVar15 >>
                                                                                  8),
                                                                          (byte)uVar17 ^
                                                                          (byte)uVar15)))))));
      uVar6 = uVar4;
    } while (uVar14 <= param_4);
  }
  if (uVar4 < param_4) {
    uVar6 = param_4 - uVar4;
    if (0x1f < uVar6) {
      if ((param_2 + param_4 + param_3 <= param_6 + uVar4 ||
           param_6 + param_4 <= param_2 + uVar4 + param_3) &&
         (param_5 + param_4 <= param_6 + uVar4 || param_6 + param_4 <= param_5 + uVar4)) {
        lVar1 = uVar4 + param_3;
        uVar8 = uVar6 & 0xffffffffffffffe0;
        lVar7 = uVar4 + 0x10;
        uVar4 = uVar4 + uVar8;
        puVar10 = (undefined8 *)(param_6 + lVar7);
        puVar12 = (undefined8 *)(param_2 + lVar1 + 0x10);
        puVar13 = (undefined8 *)(param_5 + lVar7);
        uVar14 = uVar8;
        do {
          uVar16 = puVar12[-1];
          uVar15 = puVar12[-2];
          uVar18 = puVar12[1];
          uVar17 = *puVar12;
          uVar20 = puVar13[-1];
          uVar19 = puVar13[-2];
          uVar22 = puVar13[1];
          uVar21 = *puVar13;
          uVar14 = uVar14 - 0x20;
          puVar12 = puVar12 + 4;
          puVar13 = puVar13 + 4;
          puVar10[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                          (byte)((ulong)uVar16 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                   (byte)((ulong)uVar16 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                            (byte)((ulong)uVar16 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                     (byte)((ulong)uVar16 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar20
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar16
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
          puVar10[-2] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                          (byte)((ulong)uVar15 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                   (byte)((ulong)uVar15 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                            (byte)((ulong)uVar15 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                     (byte)((ulong)uVar15 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar19
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar15
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar19 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar15)))))));
          puVar10[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                                CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                         (byte)((ulong)uVar18 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
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
          puVar10 = puVar10 + 4;
        } while (uVar14 != 0);
        if (uVar6 == uVar8) goto LAB_00b77ba4;
      }
    }
    lVar7 = param_4 - uVar4;
    pbVar5 = (byte *)(param_2 + uVar4 + param_3);
    pbVar9 = (byte *)(param_6 + uVar4);
    pbVar11 = (byte *)(param_5 + uVar4);
    do {
      lVar7 = lVar7 + -1;
      *pbVar9 = *pbVar11 ^ *pbVar5;
      pbVar5 = pbVar5 + 1;
      pbVar9 = pbVar9 + 1;
      pbVar11 = pbVar11 + 1;
    } while (lVar7 != 0);
  }
LAB_00b77ba4:
  iVar3 = 0;
  if (*(char *)(param_1 + 0x1a0) == '\x01') {
    uVar4 = 0;
    if (0xf < param_4) {
      lVar7 = param_1 + param_3 + 400;
      uVar6 = 0;
      do {
        puVar12 = (undefined8 *)(lVar7 + uVar6);
        uVar16 = puVar12[1];
        uVar15 = *puVar12;
        uVar18 = ((undefined8 *)(param_6 + uVar6))[1];
        uVar17 = *(undefined8 *)(param_6 + uVar6);
        uVar4 = uVar6 + 0x10;
        uVar14 = uVar6 + 0x20;
        puVar12 = (undefined8 *)(lVar7 + uVar6);
        puVar12[1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                              CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                 (byte)((ulong)uVar16 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                          (byte)((ulong)uVar16 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                                   (byte)((ulong)uVar16 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar18 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar16 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar18 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar16)))))));
        *puVar12 = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                            CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
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
        uVar6 = uVar4;
      } while (uVar14 <= param_4);
    }
    iVar3 = 0;
    if (uVar4 < param_4) {
      uVar6 = param_4 - uVar4;
      if (0x1f < uVar6) {
        lVar7 = param_1 + uVar4 + param_3;
        if ((param_6 + param_4 <= lVar7 + 400U) ||
           (param_1 + param_4 + param_3 + 400 <= param_6 + uVar4)) {
          uVar8 = uVar6 & 0xffffffffffffffe0;
          puVar12 = (undefined8 *)(param_6 + uVar4 + 0x10);
          uVar4 = uVar4 + uVar8;
          puVar13 = (undefined8 *)(lVar7 + 0x1a0);
          uVar14 = uVar8;
          do {
            uVar16 = puVar13[-1];
            uVar15 = puVar13[-2];
            uVar18 = puVar13[1];
            uVar17 = *puVar13;
            uVar20 = puVar12[-1];
            uVar19 = puVar12[-2];
            uVar22 = puVar12[1];
            uVar21 = *puVar12;
            uVar14 = uVar14 - 0x20;
            puVar12 = puVar12 + 4;
            puVar13[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                            (byte)((ulong)uVar16 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                     (byte)((ulong)uVar16 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                              (byte)((ulong)uVar16 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar20 >> 0x18)
                                                                       ^ (byte)((ulong)uVar16 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar20
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar16
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
            puVar13[-2] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                            (byte)((ulong)uVar15 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                     (byte)((ulong)uVar15 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                              (byte)((ulong)uVar15 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar19 >> 0x18)
                                                                       ^ (byte)((ulong)uVar15 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar19
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar15
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar19 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar15)))))));
            puVar13[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                           (byte)((ulong)uVar18 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                    (byte)((ulong)uVar18 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                             (byte)((ulong)uVar18 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar22 >> 0x18)
                                                                      ^ (byte)((ulong)uVar18 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar22
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar18
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar22 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar18)))))));
            *puVar13 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                         (byte)((ulong)uVar17 >> 0x30),
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
            puVar13 = puVar13 + 4;
          } while (uVar14 != 0);
          iVar3 = 0;
          if (uVar6 == uVar8) goto LAB_00b77cac;
        }
      }
      lVar7 = param_4 - uVar4;
      pbVar5 = (byte *)(param_6 + uVar4);
      pbVar9 = (byte *)(param_1 + uVar4 + param_3 + 400);
      do {
        lVar7 = lVar7 + -1;
        *pbVar9 = *pbVar5 ^ *pbVar9;
        pbVar5 = pbVar5 + 1;
        pbVar9 = pbVar9 + 1;
      } while (lVar7 != 0);
      iVar3 = 0;
    }
  }
LAB_00b77cac:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

