/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6f4a8
 */

undefined8
mbedtls_aes_crypt_ctr
          (undefined8 param_1,ulong param_2,ulong *param_3,long param_4,long param_5,long param_6,
          long param_7)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  uint uVar5;
  undefined8 uVar6;
  long lVar7;
  ulong uVar8;
  byte *pbVar9;
  ulong uVar10;
  ulong uVar11;
  byte *pbVar12;
  ulong uVar13;
  byte *pbVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  ulong uVar18;
  ulong uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  
  uVar19 = *param_3;
  if (uVar19 < 0x10) {
    if (param_2 != 0) {
      uVar18 = 0;
      do {
        if (uVar19 == 0) {
          mbedtls_internal_aes_encrypt(param_1,param_4,param_5);
          lVar7 = 0xc;
          do {
            uVar4 = (*(uint *)(param_4 + lVar7) & 0xff00ff00) >> 8 |
                    (*(uint *)(param_4 + lVar7) & 0xff00ff) << 8;
            uVar4 = (uVar4 >> 0x10 | uVar4 << 0x10) + 1;
            uVar5 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
            *(uint *)(param_4 + lVar7) = uVar5 >> 0x10 | uVar5 << 0x10;
            if (lVar7 == 0) {
              uVar11 = 0x10;
              break;
            }
            lVar7 = lVar7 + -4;
            uVar11 = 0x10;
          } while (uVar4 == 0);
        }
        else {
          uVar11 = 0x10 - uVar19;
        }
        uVar3 = param_2 - uVar18;
        if (uVar11 <= param_2 - uVar18) {
          uVar3 = uVar11;
        }
        uVar13 = 0;
        if (0xf < uVar3) {
          uVar10 = 0;
          do {
            puVar16 = (undefined8 *)(param_6 + uVar18 + uVar10);
            uVar20 = puVar16[1];
            uVar6 = *puVar16;
            puVar16 = (undefined8 *)(param_5 + uVar19 + uVar10);
            uVar22 = puVar16[1];
            uVar21 = *puVar16;
            uVar13 = uVar10 + 0x10;
            uVar1 = uVar10 + 0x20;
            puVar16 = (undefined8 *)(param_7 + uVar18 + uVar10);
            puVar16[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                           (byte)((ulong)uVar20 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                    (byte)((ulong)uVar20 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                             (byte)((ulong)uVar20 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar22 >> 0x18)
                                                                      ^ (byte)((ulong)uVar20 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar22
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar20
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar22 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar20)))))));
            *puVar16 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                                CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                         (byte)((ulong)uVar6 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                  (byte)((ulong)uVar6 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                           (byte)((ulong)uVar6 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                                    (byte)((ulong)uVar6 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar21 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar6 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) ^ (byte)((ulong)uVar6 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar6)))))));
            uVar10 = uVar13;
          } while (uVar1 <= uVar3);
        }
        if (uVar13 < uVar3) {
          uVar10 = uVar18 + ~param_2;
          uVar1 = uVar10;
          if (uVar10 <= ~uVar11) {
            uVar1 = ~uVar11;
          }
          uVar8 = ~uVar13 - uVar1;
          if (0x1f < uVar8) {
            if (uVar10 <= ~uVar11) {
              uVar10 = ~uVar11;
            }
            uVar11 = param_7 + uVar18 + uVar13;
            uVar2 = param_7 + -1 + (uVar18 - uVar10);
            if ((param_6 + -1 + (uVar18 - uVar10) <= uVar11 || uVar2 <= param_6 + uVar18 + uVar13)
               && (param_5 + -1 + (uVar19 - uVar10) <= uVar11 || uVar2 <= param_5 + uVar13 + uVar19)
               ) {
              uVar10 = uVar8 & 0xffffffffffffffe0;
              lVar7 = uVar19 + uVar13;
              puVar15 = (undefined8 *)(param_7 + 0x10 + uVar18 + uVar13);
              puVar16 = (undefined8 *)(param_6 + 0x10 + uVar18 + uVar13);
              uVar13 = uVar13 + uVar10;
              puVar17 = (undefined8 *)(param_5 + 0x10 + lVar7);
              uVar11 = uVar10;
              do {
                uVar20 = puVar16[-1];
                uVar6 = puVar16[-2];
                uVar22 = puVar16[1];
                uVar21 = *puVar16;
                uVar24 = puVar17[-1];
                uVar23 = puVar17[-2];
                uVar26 = puVar17[1];
                uVar25 = *puVar17;
                uVar11 = uVar11 - 0x20;
                puVar16 = puVar16 + 4;
                puVar17 = puVar17 + 4;
                puVar15[-1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                                 (byte)((ulong)uVar20 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                          (byte)((ulong)uVar20 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                                   (byte)((ulong)uVar20 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar24 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar24 >> 0x10) ^ (byte)((ulong)uVar20 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                           (byte)((ulong)uVar20 >> 8),
                                                           (byte)uVar24 ^ (byte)uVar20)))))));
                puVar15[-2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                                       CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                                (byte)((ulong)uVar6 >> 0x30),
                                                CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                         (byte)((ulong)uVar6 >> 0x28),
                                                         CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                                  (byte)((ulong)uVar6 >> 0x20),
                                                                  CONCAT13((byte)((ulong)uVar23 >>
                                                                                 0x18) ^
                                                                           (byte)((ulong)uVar6 >>
                                                                                 0x18),
                                                                           CONCAT12((byte)((ulong)
                                                  uVar23 >> 0x10) ^ (byte)((ulong)uVar6 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar23 >> 8) ^
                                                           (byte)((ulong)uVar6 >> 8),
                                                           (byte)uVar23 ^ (byte)uVar6)))))));
                puVar15[1] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
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
                *puVar15 = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                             (byte)((ulong)uVar21 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                      (byte)((ulong)uVar21 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                               (byte)((ulong)uVar21 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar25 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar21 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar25 >> 0x10) ^
                                                           (byte)((ulong)uVar21 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar25 >> 8) ^
                                                                    (byte)((ulong)uVar21 >> 8),
                                                                    (byte)uVar25 ^ (byte)uVar21)))))
                                            ));
                puVar15 = puVar15 + 4;
              } while (uVar11 != 0);
              if (uVar8 == uVar10) goto LAB_00b6f6f0;
            }
          }
          lVar7 = ~uVar13 - uVar1;
          pbVar9 = (byte *)(param_7 + uVar13 + uVar18);
          pbVar12 = (byte *)(param_5 + uVar13 + uVar19);
          pbVar14 = (byte *)(param_6 + uVar13 + uVar18);
          do {
            lVar7 = lVar7 + -1;
            *pbVar9 = *pbVar12 ^ *pbVar14;
            pbVar9 = pbVar9 + 1;
            pbVar12 = pbVar12 + 1;
            pbVar14 = pbVar14 + 1;
          } while (lVar7 != 0);
        }
LAB_00b6f6f0:
        uVar18 = uVar3 + uVar18;
        uVar19 = 0;
      } while (uVar18 < param_2);
      uVar19 = *param_3;
    }
    uVar6 = 0;
    *param_3 = (ulong)(uint)((int)uVar19 + (int)param_2) & 0xf;
  }
  else {
    uVar6 = 0xffffffdf;
  }
  return uVar6;
}

