/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b77ce0
 */

void mbedtls_gcm_finish(long param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
                       void *param_5,ulong param_6)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  long lVar5;
  undefined8 uVar6;
  uint uVar7;
  long lVar8;
  ulong uVar9;
  byte *pbVar10;
  ulong uVar11;
  long lVar12;
  uint uVar13;
  ulong uVar14;
  byte *pbVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  ulong uVar18;
  uint uVar19;
  uint uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  
  lVar5 = tpidr_el0;
  lVar8 = *(long *)(lVar5 + 0x28);
  *param_4 = 0;
  uVar9 = *(ulong *)(param_1 + 0x160);
  uVar11 = *(ulong *)(param_1 + 0x168);
  if ((uVar9 == 0) && ((uVar11 & 0xf) != 0)) {
    FUN_00b773c8(param_1,param_1 + 400,param_1 + 400);
  }
  if (param_6 - 4 < 0xd) {
    if ((*(byte *)(param_1 + 0x160) & 0xf) != 0) {
      FUN_00b773c8(param_1,param_1 + 400,param_1 + 400);
    }
    memcpy(param_5,(void *)(param_1 + 0x170),param_6);
    if (((uVar11 | uVar9) & 0x1fffffffffffffff) != 0) {
      uVar20 = (uint)(uVar11 << 3);
      uVar1 = uVar20 & 0xff00ff00;
      uVar20 = uVar20 & 0xff00ff;
      uVar19 = (uint)(uVar9 << 3);
      uVar2 = uVar19 & 0xff00ff00;
      uVar19 = uVar19 & 0xff00ff;
      uVar7 = (uint)(uVar11 >> 0x1d);
      uVar3 = uVar7 & 0xff00ff00;
      uVar7 = uVar7 & 0xff00ff;
      uVar13 = (uint)(uVar9 >> 0x1d);
      uVar4 = uVar13 & 0xff00ff00;
      uVar13 = uVar13 & 0xff00ff;
      uVar21 = *(undefined8 *)(param_1 + 0x198);
      uVar6 = *(undefined8 *)(param_1 + 400);
      lVar12 = param_1 + 400;
      *(ulong *)(param_1 + 0x198) =
           CONCAT17((byte)uVar19 ^ (byte)((ulong)uVar21 >> 0x38),
                    CONCAT16((byte)(uVar2 >> 8) ^ (byte)((ulong)uVar21 >> 0x30),
                             CONCAT15((byte)(uVar19 >> 0x10) ^ (byte)((ulong)uVar21 >> 0x28),
                                      CONCAT14((byte)(uVar2 >> 0x18) ^ (byte)((ulong)uVar21 >> 0x20)
                                               ,CONCAT13((byte)uVar13 ^
                                                         (byte)((ulong)uVar21 >> 0x18),
                                                         CONCAT12((byte)(uVar4 >> 8) ^
                                                                  (byte)((ulong)uVar21 >> 0x10),
                                                                  CONCAT11((byte)(uVar13 >> 0x10) ^
                                                                           (byte)((ulong)uVar21 >> 8
                                                                                 ),(byte)(uVar4 >> 
                                                  0x18) ^ (byte)uVar21)))))));
      *(ulong *)(param_1 + 400) =
           CONCAT17((byte)uVar20 ^ (byte)((ulong)uVar6 >> 0x38),
                    CONCAT16((byte)(uVar1 >> 8) ^ (byte)((ulong)uVar6 >> 0x30),
                             CONCAT15((byte)(uVar20 >> 0x10) ^ (byte)((ulong)uVar6 >> 0x28),
                                      CONCAT14((byte)(uVar1 >> 0x18) ^ (byte)((ulong)uVar6 >> 0x20),
                                               CONCAT13((byte)uVar7 ^ (byte)((ulong)uVar6 >> 0x18),
                                                        CONCAT12((byte)(uVar3 >> 8) ^
                                                                 (byte)((ulong)uVar6 >> 0x10),
                                                                 CONCAT11((byte)(uVar7 >> 0x10) ^
                                                                          (byte)((ulong)uVar6 >> 8),
                                                                          (byte)(uVar3 >> 0x18) ^
                                                                          (byte)uVar6)))))));
      FUN_00b773c8(param_1,lVar12,lVar12);
      uVar9 = 0;
      if (0xf < param_6) {
        uVar11 = 0;
        do {
          uVar21 = ((undefined8 *)((long)param_5 + uVar11))[1];
          uVar6 = *(undefined8 *)((long)param_5 + uVar11);
          uVar23 = ((undefined8 *)(lVar12 + uVar11))[1];
          uVar22 = *(undefined8 *)(lVar12 + uVar11);
          uVar9 = uVar11 + 0x10;
          uVar18 = uVar11 + 0x20;
          ((undefined8 *)((long)param_5 + uVar11))[1] =
               CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                        CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar21 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                          (byte)((ulong)uVar21 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                   (byte)((ulong)uVar21 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                            (byte)((ulong)uVar21 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar23 >> 0x10) ^
                                                                     (byte)((ulong)uVar21 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar23
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar21
                                                                                    >> 8),
                                                                              (byte)uVar23 ^
                                                                              (byte)uVar21)))))));
          *(undefined8 *)((long)param_5 + uVar11) =
               CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                        CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                          (byte)((ulong)uVar6 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                   (byte)((ulong)uVar6 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                            (byte)((ulong)uVar6 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar22 >> 0x10) ^
                                                                     (byte)((ulong)uVar6 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar22
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar6 >>
                                                                                    8),(byte)uVar22
                                                                                       ^ (byte)uVar6
                                                                             )))))));
          uVar11 = uVar9;
        } while (uVar18 <= param_6);
      }
      uVar6 = 0;
      if (param_6 <= uVar9) goto LAB_00b77eb0;
      uVar11 = param_6 - uVar9;
      if (0x1f < uVar11) {
        uVar18 = (long)param_5 + uVar9;
        if ((param_1 + param_6 + 400 <= uVar18) ||
           ((long)param_5 + param_6 <= param_1 + uVar9 + 400)) {
          uVar14 = uVar11 & 0xffffffffffffffe0;
          puVar16 = (undefined8 *)(param_1 + uVar9 + 0x1a0);
          uVar9 = uVar9 + uVar14;
          puVar17 = (undefined8 *)(uVar18 + 0x10);
          uVar18 = uVar14;
          do {
            uVar21 = puVar17[-1];
            uVar6 = puVar17[-2];
            uVar23 = puVar17[1];
            uVar22 = *puVar17;
            uVar25 = puVar16[-1];
            uVar24 = puVar16[-2];
            uVar27 = puVar16[1];
            uVar26 = *puVar16;
            uVar18 = uVar18 - 0x20;
            puVar16 = puVar16 + 4;
            puVar17[-1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                            (byte)((ulong)uVar21 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                     (byte)((ulong)uVar21 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                              (byte)((ulong)uVar21 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar25 >> 0x18)
                                                                       ^ (byte)((ulong)uVar21 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar25
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar21
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar25 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar21)))))));
            puVar17[-2] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                            (byte)((ulong)uVar6 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                     (byte)((ulong)uVar6 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                              (byte)((ulong)uVar6 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar24 >> 0x18)
                                                                       ^ (byte)((ulong)uVar6 >> 0x18
                                                                               ),
                                                                       CONCAT12((byte)((ulong)uVar24
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar6
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar24 >> 8) ^ (byte)((ulong)uVar6 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar6)))))));
            puVar17[1] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                           (byte)((ulong)uVar23 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                    (byte)((ulong)uVar23 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                             (byte)((ulong)uVar23 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar27 >> 0x18)
                                                                      ^ (byte)((ulong)uVar23 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar27
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar23
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar27 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar27 ^ (byte)uVar23)))))));
            *puVar17 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                         (byte)((ulong)uVar22 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
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
            puVar17 = puVar17 + 4;
          } while (uVar18 != 0);
          uVar6 = 0;
          if (uVar11 == uVar14) goto LAB_00b77eb0;
        }
      }
      lVar12 = param_6 - uVar9;
      pbVar10 = (byte *)((long)param_5 + uVar9);
      pbVar15 = (byte *)(param_1 + uVar9 + 400);
      do {
        lVar12 = lVar12 + -1;
        *pbVar10 = *pbVar15 ^ *pbVar10;
        pbVar10 = pbVar10 + 1;
        pbVar15 = pbVar15 + 1;
      } while (lVar12 != 0);
    }
    uVar6 = 0;
  }
  else {
    uVar6 = 0xffffffec;
  }
LAB_00b77eb0:
  if (*(long *)(lVar5 + 0x28) != lVar8) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

