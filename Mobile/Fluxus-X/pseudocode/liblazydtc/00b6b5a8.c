/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6b5a8
 */

/* WARNING: Type propagation algorithm not settling */

int mbedtls_ccm_update(long param_1,undefined8 *param_2,ulong param_3,undefined8 *param_4,
                      ulong param_5,ulong *param_6)

{
  char cVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong __n;
  long lVar6;
  int iVar7;
  uint uVar8;
  ulong uVar9;
  long lVar10;
  byte *pbVar11;
  ulong uVar12;
  byte *pbVar13;
  ulong uVar14;
  byte *pbVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 local_a0 [4];
  byte local_80;
  byte bStack_7f;
  byte bStack_7e;
  byte bStack_7d;
  byte bStack_7c;
  byte bStack_7b;
  byte bStack_7a;
  byte abStack_79 [17];
  undefined8 local_68;
  
  lVar6 = tpidr_el0;
  local_68 = *(long *)(lVar6 + 0x28);
  if ((*(byte *)(param_1 + 0xa8) >> 4 & 1) == 0) {
    if (*(long *)(param_1 + 0x30) == 0) {
      if (param_5 < param_3) goto LAB_00b6b620;
    }
    else {
      iVar7 = -0xd;
      if ((param_5 < param_3) || (*(ulong *)(param_1 + 0x20) < *(long *)(param_1 + 0x38) + param_3))
      goto LAB_00b6bc7c;
    }
    *param_6 = param_3;
    if (param_3 == 0) {
      iVar7 = 0;
    }
    else {
      lVar2 = param_1 + 0x48;
      do {
        uVar8 = *(uint *)(param_1 + 0x44);
        uVar21 = *(ulong *)(param_1 + 0x38) & 0xf;
        __n = param_3;
        if (0x10 - uVar21 <= param_3) {
          __n = 0x10 - uVar21;
        }
        *(ulong *)(param_1 + 0x38) = __n + *(ulong *)(param_1 + 0x38);
        if ((uVar8 | 2) == 3) {
          uVar14 = 0;
          puVar4 = (undefined8 *)(param_1 + uVar21);
          if (0xf < __n) {
            uVar23 = puVar4[1];
            uVar22 = *puVar4;
            uVar25 = param_2[1];
            uVar24 = *param_2;
            uVar14 = 0x10;
            puVar4[1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                          (byte)((ulong)uVar23 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                   (byte)((ulong)uVar23 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                            (byte)((ulong)uVar23 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                     (byte)((ulong)uVar23 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar25
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar23
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar25 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar23)))))));
            *puVar4 = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                               CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                        (byte)((ulong)uVar22 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                 (byte)((ulong)uVar22 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                          (byte)((ulong)uVar22 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                   (byte)((ulong)uVar22 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar24 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar22 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar22)))))));
          }
          if (uVar14 < __n) {
            uVar9 = ~param_3;
            uVar12 = uVar21 - 0x11;
            uVar16 = uVar12;
            if (uVar12 < uVar9) {
              uVar16 = ~param_3;
            }
            uVar16 = ~uVar14 - uVar16;
            if (uVar16 < 0x20) {
LAB_00b6b750:
              uVar19 = uVar14;
            }
            else {
              uVar19 = uVar12;
              if (uVar12 < uVar9) {
                uVar19 = ~param_3;
              }
              if ((param_1 + (uVar14 | uVar21) < (long)param_2 + __n) &&
                 ((long)param_2 + uVar14 < param_1 + -1 + (uVar21 - uVar19))) goto LAB_00b6b750;
              uVar18 = uVar16 & 0xffffffffffffffe0;
              uVar17 = 0;
              uVar19 = uVar14 | uVar18;
              do {
                puVar5 = (undefined8 *)((long)puVar4 + (uVar14 | uVar17));
                puVar3 = (undefined8 *)((long)param_2 + (uVar14 | uVar17));
                uVar23 = puVar5[1];
                uVar22 = *puVar5;
                uVar25 = puVar5[3];
                uVar24 = puVar5[2];
                uVar27 = puVar3[1];
                uVar26 = *puVar3;
                uVar29 = puVar3[3];
                uVar28 = puVar3[2];
                uVar17 = uVar17 + 0x20;
                puVar5[1] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                              (byte)((ulong)uVar23 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                       (byte)((ulong)uVar23 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                                (byte)((ulong)uVar23 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar27 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar23 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar27 >> 0x10) ^ (byte)((ulong)uVar23 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar27 >> 8) ^
                                                           (byte)((ulong)uVar23 >> 8),
                                                           (byte)uVar27 ^ (byte)uVar23)))))));
                *puVar5 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                            (byte)((ulong)uVar22 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                     (byte)((ulong)uVar22 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                              (byte)((ulong)uVar22 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar26 >> 0x18)
                                                                       ^ (byte)((ulong)uVar22 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar26
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar22
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
                puVar5[3] = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar29 >> 0x30) ^
                                              (byte)((ulong)uVar25 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                       (byte)((ulong)uVar25 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                                (byte)((ulong)uVar25 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar29 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar25 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar29 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar29 >> 8) ^
                                                           (byte)((ulong)uVar25 >> 8),
                                                           (byte)uVar29 ^ (byte)uVar25)))))));
                puVar5[2] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                              (byte)((ulong)uVar24 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                       (byte)((ulong)uVar24 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                                (byte)((ulong)uVar24 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar28 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar24 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar28 >> 0x10) ^ (byte)((ulong)uVar24 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar28 >> 8) ^
                                                           (byte)((ulong)uVar24 >> 8),
                                                           (byte)uVar28 ^ (byte)uVar24)))))));
              } while (uVar18 != uVar17);
              if (uVar16 == uVar18) goto LAB_00b6b788;
            }
            if (uVar9 <= uVar12) {
              uVar9 = uVar12;
            }
            lVar10 = ~uVar9 - uVar19;
            pbVar11 = (byte *)(param_1 + uVar19 + uVar21);
            pbVar13 = (byte *)((long)param_2 + uVar19);
            do {
              lVar10 = lVar10 + -1;
              *pbVar11 = *pbVar13 ^ *pbVar11;
              pbVar11 = pbVar11 + 1;
              pbVar13 = pbVar13 + 1;
            } while (lVar10 != 0);
          }
LAB_00b6b788:
          if (((__n + uVar21 == 0x10) || (*(long *)(param_1 + 0x38) == *(long *)(param_1 + 0x20)))
             && (iVar7 = mbedtls_cipher_update(lVar2,param_1,0x10,param_1,local_a0 + 3), iVar7 != 0)
             ) {
LAB_00b6bc60:
            *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 0x10;
          }
          else {
            abStack_79[1] = 0;
            abStack_79[2] = 0;
            abStack_79[3] = 0;
            abStack_79[4] = 0;
            abStack_79[5] = 0;
            abStack_79[6] = 0;
            abStack_79[7] = 0;
            abStack_79[8] = 0;
            abStack_79[9] = 0;
            abStack_79[10] = 0;
            abStack_79[0xb] = 0;
            abStack_79[0xc] = 0;
            abStack_79[0xd] = 0;
            abStack_79[0xe] = 0;
            abStack_79[0xf] = 0;
            abStack_79[0x10] = 0;
            local_80 = 0;
            bStack_7f = 0;
            bStack_7e = 0;
            bStack_7d = 0;
            bStack_7c = 0;
            bStack_7b = 0;
            bStack_7a = 0;
            abStack_79[0] = 0;
            iVar7 = mbedtls_cipher_update
                              (lVar2,param_1 + 0x10,0x10,(byte *)((long)abStack_79 + 1),
                               &stack0xffffffffffffff80);
            if (iVar7 == 0) {
              uVar14 = 0;
              pbVar11 = (byte *)((long)abStack_79 + uVar21 + 1);
              if (0xf < __n) {
                uVar23 = param_2[1];
                uVar22 = *param_2;
                uVar25 = *(undefined8 *)((long)abStack_79 + uVar21 + 9);
                uVar24 = *(undefined8 *)pbVar11;
                uVar14 = 0x10;
                param_4[1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                               (byte)((ulong)uVar23 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                        (byte)((ulong)uVar23 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                                 (byte)((ulong)uVar23 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar25 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar23 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar25 >> 0x10) ^ (byte)((ulong)uVar23 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar25 >> 8) ^
                                                           (byte)((ulong)uVar23 >> 8),
                                                           (byte)uVar25 ^ (byte)uVar23)))))));
                *param_4 = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                             (byte)((ulong)uVar22 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                      (byte)((ulong)uVar22 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                               (byte)((ulong)uVar22 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar24 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar22 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                           (byte)((ulong)uVar22 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                                    (byte)((ulong)uVar22 >> 8),
                                                                    (byte)uVar24 ^ (byte)uVar22)))))
                                            ));
              }
              if (uVar14 < __n) {
                uVar9 = ~param_3;
                uVar12 = uVar21 - 0x11;
                uVar16 = uVar12;
                if (uVar12 < uVar9) {
                  uVar16 = ~param_3;
                }
                uVar16 = ~uVar14 - uVar16;
                if (uVar16 < 0x20) {
LAB_00b6b83c:
                  uVar17 = uVar14;
                }
                else {
                  uVar19 = uVar12;
                  if (uVar12 < uVar9) {
                    uVar19 = ~param_3;
                  }
                  if (((byte *)((long)param_4 + uVar14) < (byte *)((long)param_2 + __n) &&
                       (byte *)((long)param_2 + uVar14) < (byte *)((long)param_4 + __n)) ||
                     ((byte *)((long)param_4 + uVar14) <
                      (byte *)((long)abStack_79 + (uVar21 - uVar19)) &&
                      (byte *)((long)abStack_79 + (uVar14 | uVar21) + 1) <
                      (byte *)((long)param_4 + __n))) goto LAB_00b6b83c;
                  uVar18 = uVar16 & 0xffffffffffffffe0;
                  uVar19 = 0;
                  uVar17 = uVar14 | uVar18;
                  do {
                    uVar20 = uVar14 | uVar19;
                    puVar4 = (undefined8 *)((long)param_2 + uVar20);
                    pbVar13 = pbVar11 + uVar20;
                    uVar23 = puVar4[1];
                    uVar22 = *puVar4;
                    uVar25 = puVar4[3];
                    uVar24 = puVar4[2];
                    uVar27 = *(undefined8 *)(pbVar13 + 8);
                    uVar26 = *(undefined8 *)pbVar13;
                    uVar29 = *(undefined8 *)(pbVar13 + 0x18);
                    uVar28 = *(undefined8 *)(pbVar13 + 0x10);
                    uVar19 = uVar19 + 0x20;
                    puVar4 = (undefined8 *)((long)param_4 + uVar20);
                    puVar4[1] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^
                                         (byte)((ulong)uVar23 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                                  (byte)((ulong)uVar23 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                           (byte)((ulong)uVar23 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                                    (byte)((ulong)uVar23 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar27 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar23 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar27 >> 0x10) ^ (byte)((ulong)uVar23 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar27 >> 8) ^
                                                           (byte)((ulong)uVar23 >> 8),
                                                           (byte)uVar27 ^ (byte)uVar23)))))));
                    *puVar4 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                                 (byte)((ulong)uVar22 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                          (byte)((ulong)uVar22 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                                   (byte)((ulong)uVar22 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar26 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar22 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar26 >> 0x10) ^ (byte)((ulong)uVar22 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar26 >> 8) ^
                                                           (byte)((ulong)uVar22 >> 8),
                                                           (byte)uVar26 ^ (byte)uVar22)))))));
                    puVar4[3] = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^
                                         (byte)((ulong)uVar25 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar29 >> 0x30) ^
                                                  (byte)((ulong)uVar25 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                           (byte)((ulong)uVar25 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                                    (byte)((ulong)uVar25 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar29 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar25 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar29 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar29 >> 8) ^
                                                           (byte)((ulong)uVar25 >> 8),
                                                           (byte)uVar29 ^ (byte)uVar25)))))));
                    puVar4[2] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^
                                         (byte)((ulong)uVar24 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                                  (byte)((ulong)uVar24 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                           (byte)((ulong)uVar24 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                                    (byte)((ulong)uVar24 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar28 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar24 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar28 >> 0x10) ^ (byte)((ulong)uVar24 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar28 >> 8) ^
                                                           (byte)((ulong)uVar24 >> 8),
                                                           (byte)uVar28 ^ (byte)uVar24)))))));
                  } while (uVar18 != uVar19);
                  if (uVar16 == uVar18) goto LAB_00b6b87c;
                }
                if (uVar9 <= uVar12) {
                  uVar9 = uVar12;
                }
                lVar10 = ~uVar9 - uVar17;
                pbVar11 = (byte *)((long)abStack_79 + uVar17 + uVar21 + 1);
                pbVar13 = (byte *)((long)param_4 + uVar17);
                pbVar15 = (byte *)((long)param_2 + uVar17);
                do {
                  lVar10 = lVar10 + -1;
                  *pbVar13 = *pbVar11 ^ *pbVar15;
                  pbVar11 = pbVar11 + 1;
                  pbVar13 = pbVar13 + 1;
                  pbVar15 = pbVar15 + 1;
                } while (lVar10 != 0);
              }
LAB_00b6b87c:
              mbedtls_platform_zeroize((byte *)((long)abStack_79 + 1),0x10);
              uVar8 = *(uint *)(param_1 + 0x44);
              goto LAB_00b6b88c;
            }
LAB_00b6bc44:
            *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 0x10;
            mbedtls_platform_zeroize((byte *)((long)abStack_79 + 1),0x10);
          }
          goto LAB_00b6bc70;
        }
LAB_00b6b88c:
        if ((uVar8 | 2) == 2) {
          abStack_79[1] = 0;
          abStack_79[2] = 0;
          abStack_79[3] = 0;
          abStack_79[4] = 0;
          abStack_79[5] = 0;
          abStack_79[6] = 0;
          abStack_79[7] = 0;
          abStack_79[8] = 0;
          abStack_79[9] = 0;
          abStack_79[10] = 0;
          abStack_79[0xb] = 0;
          abStack_79[0xc] = 0;
          abStack_79[0xd] = 0;
          abStack_79[0xe] = 0;
          abStack_79[0xf] = 0;
          abStack_79[0x10] = 0;
          local_80 = 0;
          bStack_7f = 0;
          bStack_7e = 0;
          bStack_7d = 0;
          bStack_7c = 0;
          bStack_7b = 0;
          bStack_7a = 0;
          abStack_79[0] = 0;
          iVar7 = mbedtls_cipher_update
                            (lVar2,param_1 + 0x10,0x10,(byte *)((long)abStack_79 + 1),
                             &stack0xffffffffffffff80);
          if (iVar7 != 0) goto LAB_00b6bc44;
          uVar14 = 0;
          pbVar11 = (byte *)((long)abStack_79 + uVar21 + 1);
          if (0xf < __n) {
            uVar23 = param_2[1];
            uVar22 = *param_2;
            uVar25 = *(undefined8 *)((long)abStack_79 + uVar21 + 9);
            uVar24 = *(undefined8 *)pbVar11;
            uVar14 = 0x10;
            local_a0[1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                            (byte)((ulong)uVar23 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                     (byte)((ulong)uVar23 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                              (byte)((ulong)uVar23 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar25 >> 0x18)
                                                                       ^ (byte)((ulong)uVar23 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar25
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar23
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar25 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar23)))))));
            local_a0[0] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                            (byte)((ulong)uVar22 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                     (byte)((ulong)uVar22 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                              (byte)((ulong)uVar22 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar24 >> 0x18)
                                                                       ^ (byte)((ulong)uVar22 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar24
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar22
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar24 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar22)))))));
          }
          if (uVar14 < __n) {
            uVar9 = ~param_3;
            uVar12 = uVar21 - 0x11;
            uVar16 = uVar12;
            if (uVar12 < uVar9) {
              uVar16 = ~param_3;
            }
            uVar16 = ~uVar14 - uVar16;
            if (uVar16 < 0x20) {
LAB_00b6b910:
              uVar17 = uVar14;
            }
            else {
              uVar19 = uVar12;
              if (uVar12 < uVar9) {
                uVar19 = ~param_3;
              }
              if (((byte *)((long)local_a0 + uVar14) < (byte *)((long)param_2 + __n) &&
                   (byte *)((long)param_2 + uVar14) < (byte *)((long)local_a0 + __n)) ||
                 ((byte *)((long)local_a0 + uVar14) < (byte *)((long)abStack_79 + (uVar21 - uVar19))
                  && (byte *)((long)abStack_79 + (uVar14 | uVar21) + 1) <
                     (byte *)((long)local_a0 + __n))) goto LAB_00b6b910;
              uVar18 = uVar16 & 0xffffffffffffffe0;
              uVar19 = 0;
              uVar17 = uVar14 | uVar18;
              do {
                uVar20 = uVar14 | uVar19;
                puVar4 = (undefined8 *)((long)param_2 + uVar20);
                pbVar13 = pbVar11 + uVar20;
                uVar23 = puVar4[1];
                uVar22 = *puVar4;
                uVar25 = puVar4[3];
                uVar24 = puVar4[2];
                uVar27 = *(undefined8 *)(pbVar13 + 8);
                uVar26 = *(undefined8 *)pbVar13;
                uVar29 = *(undefined8 *)(pbVar13 + 0x18);
                uVar28 = *(undefined8 *)(pbVar13 + 0x10);
                uVar19 = uVar19 + 0x20;
                *(ulong *)((long)local_a0 + uVar20 + 8) =
                     CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                              CONCAT16((byte)((ulong)uVar27 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                 (byte)((ulong)uVar23 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                          (byte)((ulong)uVar23 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                                   (byte)((ulong)uVar23 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar27 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar23 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar27 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar27 ^ (byte)uVar23)))))));
                *(ulong *)((long)local_a0 + uVar20) =
                     CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                              CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)((ulong)uVar22 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                 (byte)((ulong)uVar22 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                          (byte)((ulong)uVar22 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                   (byte)((ulong)uVar22 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar26 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar22 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
                *(ulong *)((long)local_a0 + uVar20 + 0x18) =
                     CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                              CONCAT16((byte)((ulong)uVar29 >> 0x30) ^ (byte)((ulong)uVar25 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                 (byte)((ulong)uVar25 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                          (byte)((ulong)uVar25 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar29 >> 0x18) ^
                                                                   (byte)((ulong)uVar25 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar29 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar25 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar29 >> 8) ^ (byte)((ulong)uVar25 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar25)))))));
                *(ulong *)((long)local_a0 + uVar20 + 0x10) =
                     CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                              CONCAT16((byte)((ulong)uVar28 >> 0x30) ^ (byte)((ulong)uVar24 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                 (byte)((ulong)uVar24 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                          (byte)((ulong)uVar24 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                                   (byte)((ulong)uVar24 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar28 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar24 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar28 >> 8) ^ (byte)((ulong)uVar24 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar24)))))));
              } while (uVar18 != uVar19);
              if (uVar16 == uVar18) goto LAB_00b6b950;
            }
            if (uVar9 <= uVar12) {
              uVar9 = uVar12;
            }
            lVar10 = ~uVar9 - uVar17;
            pbVar11 = (byte *)((long)abStack_79 + uVar17 + uVar21 + 1);
            pbVar13 = (byte *)((long)local_a0 + uVar17);
            pbVar15 = (byte *)((long)param_2 + uVar17);
            do {
              lVar10 = lVar10 + -1;
              *pbVar13 = *pbVar11 ^ *pbVar15;
              pbVar11 = pbVar11 + 1;
              pbVar13 = pbVar13 + 1;
              pbVar15 = pbVar15 + 1;
            } while (lVar10 != 0);
          }
LAB_00b6b950:
          mbedtls_platform_zeroize((byte *)((long)abStack_79 + 1),0x10);
          uVar14 = 0;
          puVar4 = (undefined8 *)(param_1 + uVar21);
          if (0xf < __n) {
            uVar23 = puVar4[1];
            uVar22 = *puVar4;
            uVar14 = 0x10;
            puVar4[1] = CONCAT17((byte)((ulong)local_a0[1] >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                 CONCAT16((byte)((ulong)local_a0[1] >> 0x30) ^
                                          (byte)((ulong)uVar23 >> 0x30),
                                          CONCAT15((byte)((ulong)local_a0[1] >> 0x28) ^
                                                   (byte)((ulong)uVar23 >> 0x28),
                                                   CONCAT14((byte)((ulong)local_a0[1] >> 0x20) ^
                                                            (byte)((ulong)uVar23 >> 0x20),
                                                            CONCAT13((byte)((ulong)local_a0[1] >>
                                                                           0x18) ^
                                                                     (byte)((ulong)uVar23 >> 0x18),
                                                                     CONCAT12((byte)((ulong)local_a0
                                                  [1] >> 0x10) ^ (byte)((ulong)uVar23 >> 0x10),
                                                  CONCAT11((byte)((ulong)local_a0[1] >> 8) ^
                                                           (byte)((ulong)uVar23 >> 8),
                                                           (byte)local_a0[1] ^ (byte)uVar23)))))));
            *puVar4 = CONCAT17((byte)((ulong)local_a0[0] >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                               CONCAT16((byte)((ulong)local_a0[0] >> 0x30) ^
                                        (byte)((ulong)uVar22 >> 0x30),
                                        CONCAT15((byte)((ulong)local_a0[0] >> 0x28) ^
                                                 (byte)((ulong)uVar22 >> 0x28),
                                                 CONCAT14((byte)((ulong)local_a0[0] >> 0x20) ^
                                                          (byte)((ulong)uVar22 >> 0x20),
                                                          CONCAT13((byte)((ulong)local_a0[0] >> 0x18
                                                                         ) ^ (byte)((ulong)uVar22 >>
                                                                                   0x18),
                                                                   CONCAT12((byte)((ulong)local_a0[0
                                                  ] >> 0x10) ^ (byte)((ulong)uVar22 >> 0x10),
                                                  CONCAT11((byte)((ulong)local_a0[0] >> 8) ^
                                                           (byte)((ulong)uVar22 >> 8),
                                                           (byte)local_a0[0] ^ (byte)uVar22)))))));
          }
          if (uVar14 < __n) {
            uVar9 = ~param_3;
            uVar12 = uVar21 - 0x11;
            uVar16 = uVar12;
            if (uVar12 < uVar9) {
              uVar16 = ~param_3;
            }
            uVar16 = ~uVar14 - uVar16;
            if (uVar16 < 0x20) {
              uVar17 = uVar14;
            }
            else {
              uVar18 = uVar16 & 0xffffffffffffffe0;
              uVar19 = 0;
              uVar17 = uVar14 | uVar18;
              do {
                uVar20 = uVar14 | uVar19;
                puVar5 = (undefined8 *)((long)puVar4 + uVar20);
                uVar23 = puVar5[1];
                uVar22 = *puVar5;
                uVar25 = puVar5[3];
                uVar24 = puVar5[2];
                uVar27 = *(undefined8 *)((long)local_a0 + uVar20 + 8);
                uVar26 = *(undefined8 *)((long)local_a0 + uVar20);
                uVar29 = *(undefined8 *)((long)local_a0 + uVar20 + 0x18);
                uVar28 = *(undefined8 *)((long)local_a0 + uVar20 + 0x10);
                uVar19 = uVar19 + 0x20;
                puVar5[1] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                              (byte)((ulong)uVar23 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                       (byte)((ulong)uVar23 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                                (byte)((ulong)uVar23 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar27 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar23 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar27 >> 0x10) ^ (byte)((ulong)uVar23 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar27 >> 8) ^
                                                           (byte)((ulong)uVar23 >> 8),
                                                           (byte)uVar27 ^ (byte)uVar23)))))));
                *puVar5 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                            (byte)((ulong)uVar22 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                     (byte)((ulong)uVar22 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                              (byte)((ulong)uVar22 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar26 >> 0x18)
                                                                       ^ (byte)((ulong)uVar22 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar26
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar22
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
                puVar5[3] = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar29 >> 0x30) ^
                                              (byte)((ulong)uVar25 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                       (byte)((ulong)uVar25 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                                (byte)((ulong)uVar25 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar29 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar25 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar29 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar29 >> 8) ^
                                                           (byte)((ulong)uVar25 >> 8),
                                                           (byte)uVar29 ^ (byte)uVar25)))))));
                puVar5[2] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                              (byte)((ulong)uVar24 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                       (byte)((ulong)uVar24 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                                (byte)((ulong)uVar24 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar28 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar24 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar28 >> 0x10) ^ (byte)((ulong)uVar24 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar28 >> 8) ^
                                                           (byte)((ulong)uVar24 >> 8),
                                                           (byte)uVar28 ^ (byte)uVar24)))))));
              } while (uVar18 != uVar19);
              if (uVar16 == uVar18) goto LAB_00b6bb84;
            }
            if (uVar9 <= uVar12) {
              uVar9 = uVar12;
            }
            lVar10 = ~uVar9 - uVar17;
            pbVar11 = (byte *)((long)local_a0 + uVar17);
            pbVar13 = (byte *)(param_1 + uVar17 + uVar21);
            do {
              lVar10 = lVar10 + -1;
              *pbVar13 = *pbVar11 ^ *pbVar13;
              pbVar11 = pbVar11 + 1;
              pbVar13 = pbVar13 + 1;
            } while (lVar10 != 0);
          }
LAB_00b6bb84:
          memcpy(param_4,local_a0,__n);
          if ((__n + uVar21 == 0x10) || (*(long *)(param_1 + 0x38) == *(long *)(param_1 + 0x20))) {
            iVar7 = mbedtls_cipher_update(lVar2,param_1,0x10,param_1,local_a0 + 3);
            if (iVar7 != 0) goto LAB_00b6bc60;
            if (__n + uVar21 == 0x10) goto LAB_00b6bbe8;
          }
LAB_00b6bbd8:
          if (*(long *)(param_1 + 0x38) == *(long *)(param_1 + 0x20)) goto LAB_00b6bbe8;
        }
        else {
          if (__n + uVar21 != 0x10) goto LAB_00b6bbd8;
LAB_00b6bbe8:
          if (*(int *)(param_1 + 0x40) != 0) {
            uVar8 = 0;
            do {
              lVar10 = param_1 + (0xf - (long)(int)uVar8);
              cVar1 = *(char *)(lVar10 + 0x10) + '\x01';
              *(char *)(lVar10 + 0x10) = cVar1;
              if (cVar1 != '\0') break;
              uVar8 = uVar8 + 1 & 0xff;
            } while (uVar8 < *(uint *)(param_1 + 0x40));
          }
        }
        param_3 = param_3 - __n;
        param_2 = (undefined8 *)((long)param_2 + __n);
        param_4 = (undefined8 *)((long)param_4 + __n);
      } while (param_3 != 0);
      iVar7 = 0;
    }
LAB_00b6bc70:
    mbedtls_platform_zeroize(local_a0,0x10);
  }
  else {
LAB_00b6b620:
    iVar7 = -0xd;
  }
LAB_00b6bc7c:
  if (*(long *)(lVar6 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar7;
}

