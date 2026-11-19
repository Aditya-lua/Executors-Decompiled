/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6b328
 */

void mbedtls_ccm_update_ad(byte *param_1,undefined8 *param_2,ulong param_3)

{
  undefined8 *puVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  byte *pbVar9;
  ulong uVar10;
  ulong uVar11;
  byte *pbVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  byte *pbVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined1 auStack_70 [8];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  uVar2 = *(uint *)(param_1 + 0xa8);
  if ((uVar2 >> 4 & 1) == 0) {
    if (param_3 == 0) {
      uVar4 = 0;
      goto LAB_00b6b3d0;
    }
    if ((uVar2 >> 3 & 1) == 0) {
      if ((uVar2 >> 2 & 1) == 0) {
        uVar7 = *(ulong *)(param_1 + 0x28);
        if (param_3 <= uVar7) {
          *(uint *)(param_1 + 0xa8) = uVar2 | 4;
          *param_1 = *param_1 ^ (byte)(uVar7 >> 8);
          param_1[1] = param_1[1] ^ (byte)uVar7;
          lVar5 = *(long *)(param_1 + 0x38);
LAB_00b6b400:
          pbVar17 = param_1 + 0x38;
          do {
            uVar6 = (ulong)((int)lVar5 + 2) & 0xf;
            uVar7 = param_3;
            if (0x10 - uVar6 <= param_3) {
              uVar7 = 0x10 - uVar6;
            }
            uVar8 = 0;
            pbVar9 = param_1 + uVar6;
            if (0xf < uVar7) {
              uVar18 = *(undefined8 *)(pbVar9 + 8);
              uVar4 = *(undefined8 *)pbVar9;
              uVar20 = param_2[1];
              uVar19 = *param_2;
              uVar8 = 0x10;
              *(ulong *)(pbVar9 + 8) =
                   CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                            CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                              (byte)((ulong)uVar18 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                       (byte)((ulong)uVar18 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                (byte)((ulong)uVar18 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar20 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar18 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar18)))))));
              *(ulong *)pbVar9 =
                   CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38),
                            CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar4 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                              (byte)((ulong)uVar4 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                       (byte)((ulong)uVar4 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                (byte)((ulong)uVar4 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar19 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar4 >> 0x10
                                                                               ),CONCAT11((byte)((
                                                  ulong)uVar19 >> 8) ^ (byte)((ulong)uVar4 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar4)))))));
            }
            if (uVar8 < uVar7) {
              uVar10 = ~param_3;
              uVar11 = uVar6 - 0x11;
              uVar13 = uVar11;
              if (uVar11 < uVar10) {
                uVar13 = ~param_3;
              }
              uVar13 = ~uVar8 - uVar13;
              if (uVar13 < 0x20) {
LAB_00b6b4e4:
                uVar14 = uVar8;
              }
              else {
                uVar14 = uVar11;
                if (uVar11 < uVar10) {
                  uVar14 = ~param_3;
                }
                if ((param_1 + (uVar8 | uVar6) < (byte *)((long)param_2 + uVar7)) &&
                   ((byte *)((long)param_2 + uVar8) < param_1 + (uVar6 - uVar14) + -1))
                goto LAB_00b6b4e4;
                uVar15 = uVar13 & 0xffffffffffffffe0;
                uVar16 = 0;
                uVar14 = uVar8 | uVar15;
                do {
                  pbVar12 = pbVar9 + (uVar8 | uVar16);
                  puVar1 = (undefined8 *)((long)param_2 + (uVar8 | uVar16));
                  uVar18 = *(undefined8 *)(pbVar12 + 8);
                  uVar4 = *(undefined8 *)pbVar12;
                  uVar20 = *(undefined8 *)(pbVar12 + 0x18);
                  uVar19 = *(undefined8 *)(pbVar12 + 0x10);
                  uVar22 = puVar1[1];
                  uVar21 = *puVar1;
                  uVar24 = puVar1[3];
                  uVar23 = puVar1[2];
                  uVar16 = uVar16 + 0x20;
                  *(ulong *)(pbVar12 + 8) =
                       CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
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
                  *(ulong *)pbVar12 =
                       CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38),
                                CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                         (byte)((ulong)uVar4 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                  (byte)((ulong)uVar4 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                           (byte)((ulong)uVar4 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                                    (byte)((ulong)uVar4 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar21 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar4 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) ^ (byte)((ulong)uVar4 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar4)))))));
                  *(ulong *)(pbVar12 + 0x18) =
                       CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                         (byte)((ulong)uVar20 >> 0x30),
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
                  *(ulong *)(pbVar12 + 0x10) =
                       CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                                CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                         (byte)((ulong)uVar19 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
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
                if (uVar13 == uVar15) goto LAB_00b6b51c;
              }
              if (uVar10 <= uVar11) {
                uVar10 = uVar11;
              }
              lVar5 = ~uVar10 - uVar14;
              pbVar9 = (byte *)((long)param_2 + uVar14);
              pbVar12 = param_1 + uVar14 + uVar6;
              do {
                lVar5 = lVar5 + -1;
                *pbVar12 = *pbVar9 ^ *pbVar12;
                pbVar9 = pbVar9 + 1;
                pbVar12 = pbVar12 + 1;
              } while (lVar5 != 0);
            }
LAB_00b6b51c:
            lVar5 = *(long *)pbVar17 + uVar7;
            *(long *)pbVar17 = lVar5;
            if ((uVar7 + uVar6 == 0x10) || (lVar5 == *(long *)(param_1 + 0x28))) {
              uVar4 = mbedtls_cipher_update(param_1 + 0x48,param_1,0x10,param_1,auStack_70);
              if ((int)uVar4 != 0) {
                *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 0x10;
                goto LAB_00b6b3d0;
              }
              lVar5 = *(long *)pbVar17;
            }
            param_3 = param_3 - uVar7;
            param_2 = (undefined8 *)((long)param_2 + uVar7);
          } while (param_3 != 0);
          uVar4 = 0;
          if (lVar5 == *(long *)(param_1 + 0x28)) {
            uVar4 = 0;
            param_1[0x38] = 0;
            param_1[0x39] = 0;
            param_1[0x3a] = 0;
            param_1[0x3b] = 0;
            param_1[0x3c] = 0;
            param_1[0x3d] = 0;
            param_1[0x3e] = 0;
            param_1[0x3f] = 0;
            *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 8;
          }
          goto LAB_00b6b3d0;
        }
      }
      else {
        lVar5 = *(long *)(param_1 + 0x38);
        if (lVar5 + param_3 <= *(ulong *)(param_1 + 0x28)) goto LAB_00b6b400;
      }
    }
  }
  uVar4 = 0xfffffff3;
LAB_00b6b3d0:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

