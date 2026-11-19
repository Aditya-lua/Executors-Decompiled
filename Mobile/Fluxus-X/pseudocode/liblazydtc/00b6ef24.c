/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6ef24
 */

void mbedtls_aes_crypt_xts
               (long param_1,uint param_2,ulong param_3,undefined8 param_4,undefined8 *param_5,
               undefined8 *param_6)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  ulong *puVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long lVar15;
  undefined8 uVar16;
  byte bVar17;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  undefined8 uVar18;
  byte bVar26;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  undefined8 uVar27;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  ulong local_a0 [7];
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  if (1 < param_2) {
    uVar5 = 0xffffffdf;
    goto LAB_00b6f200;
  }
  if (0xfffff0 < param_3 - 0x10) {
    uVar5 = 0xffffffde;
    goto LAB_00b6f200;
  }
  uVar14 = param_3 & 0xf;
  mbedtls_internal_aes_encrypt(param_1 + 0x120,param_4,local_a0 + 2);
  if (param_3 >> 4 != 0) {
    lVar15 = 1 - (param_3 >> 4);
    puVar6 = param_5;
    puVar13 = param_6;
    do {
      if ((param_2 == 0 && uVar14 != 0) && lVar15 == 0) {
        uVar7 = local_a0[2] >> 0x3f;
        local_a0[5] = local_a0[3];
        local_a0[4] = local_a0[2];
        local_a0[2] = (ulong)(0x87 >> (ulong)((int)((long)local_a0[3] >> 0x3f) * 8 + 8U & 0x1f)) ^
                      local_a0[2] << 1;
        local_a0[3] = uVar7 | local_a0[3] << 1;
      }
      uVar7 = local_a0[2];
      uVar16 = puVar6[1];
      uVar5 = *puVar6;
      bVar17 = (byte)local_a0[2];
      bVar19 = (byte)(local_a0[2] >> 8);
      bVar20 = (byte)(local_a0[2] >> 0x10);
      bVar21 = (byte)(local_a0[2] >> 0x18);
      bVar22 = (byte)(local_a0[2] >> 0x20);
      bVar23 = (byte)(local_a0[2] >> 0x28);
      bVar24 = (byte)(local_a0[2] >> 0x30);
      bVar25 = (byte)(local_a0[2] >> 0x38);
      local_a0[0] = CONCAT17(bVar25 ^ (byte)((ulong)uVar5 >> 0x38),
                             CONCAT16(bVar24 ^ (byte)((ulong)uVar5 >> 0x30),
                                      CONCAT15(bVar23 ^ (byte)((ulong)uVar5 >> 0x28),
                                               CONCAT14(bVar22 ^ (byte)((ulong)uVar5 >> 0x20),
                                                        CONCAT13(bVar21 ^ (byte)((ulong)uVar5 >>
                                                                                0x18),
                                                                 CONCAT12(bVar20 ^ (byte)((ulong)
                                                  uVar5 >> 0x10),
                                                  CONCAT11(bVar19 ^ (byte)((ulong)uVar5 >> 8),
                                                           bVar17 ^ (byte)uVar5)))))));
      bVar26 = (byte)local_a0[3];
      bVar28 = (byte)(local_a0[3] >> 8);
      bVar29 = (byte)(local_a0[3] >> 0x10);
      bVar30 = (byte)(local_a0[3] >> 0x18);
      bVar31 = (byte)(local_a0[3] >> 0x20);
      bVar32 = (byte)(local_a0[3] >> 0x28);
      bVar33 = (byte)(local_a0[3] >> 0x30);
      bVar34 = (byte)(local_a0[3] >> 0x38);
      local_a0[1] = CONCAT17(bVar34 ^ (byte)((ulong)uVar16 >> 0x38),
                             CONCAT16(bVar33 ^ (byte)((ulong)uVar16 >> 0x30),
                                      CONCAT15(bVar32 ^ (byte)((ulong)uVar16 >> 0x28),
                                               CONCAT14(bVar31 ^ (byte)((ulong)uVar16 >> 0x20),
                                                        CONCAT13(bVar30 ^ (byte)((ulong)uVar16 >>
                                                                                0x18),
                                                                 CONCAT12(bVar29 ^ (byte)((ulong)
                                                  uVar16 >> 0x10),
                                                  CONCAT11(bVar28 ^ (byte)((ulong)uVar16 >> 8),
                                                           bVar26 ^ (byte)uVar16)))))));
      if (param_2 == 0) {
        mbedtls_internal_aes_decrypt(param_1,local_a0,local_a0);
      }
      else {
        mbedtls_internal_aes_encrypt(param_1);
      }
      lVar15 = lVar15 + 1;
      puVar6 = puVar6 + 2;
      puVar13[1] = CONCAT17(bVar34 ^ (byte)(local_a0[1] >> 0x38),
                            CONCAT16(bVar33 ^ (byte)(local_a0[1] >> 0x30),
                                     CONCAT15(bVar32 ^ (byte)(local_a0[1] >> 0x28),
                                              CONCAT14(bVar31 ^ (byte)(local_a0[1] >> 0x20),
                                                       CONCAT13(bVar30 ^ (byte)(local_a0[1] >> 0x18)
                                                                ,CONCAT12(bVar29 ^ (byte)(local_a0[1
                                                  ] >> 0x10),
                                                  CONCAT11(bVar28 ^ (byte)(local_a0[1] >> 8),
                                                           bVar26 ^ (byte)local_a0[1])))))));
      *puVar13 = CONCAT17(bVar25 ^ (byte)(local_a0[0] >> 0x38),
                          CONCAT16(bVar24 ^ (byte)(local_a0[0] >> 0x30),
                                   CONCAT15(bVar23 ^ (byte)(local_a0[0] >> 0x28),
                                            CONCAT14(bVar22 ^ (byte)(local_a0[0] >> 0x20),
                                                     CONCAT13(bVar21 ^ (byte)(local_a0[0] >> 0x18),
                                                              CONCAT12(bVar20 ^ (byte)(local_a0[0]
                                                                                      >> 0x10),
                                                                       CONCAT11(bVar19 ^ (byte)(
                                                  local_a0[0] >> 8),bVar17 ^ (byte)local_a0[0]))))))
                         );
      local_a0[2] = (ulong)(0x87 >> (ulong)((int)((long)local_a0[3] >> 0x3f) * 8 + 8U & 0x1f)) ^
                    uVar7 << 1;
      local_a0[3] = uVar7 >> 0x3f | local_a0[3] << 1;
      puVar13 = puVar13 + 2;
    } while (lVar15 != 1);
    param_5 = (undefined8 *)((long)param_5 + (param_3 & 0xfffffffffffffff0));
    param_6 = (undefined8 *)((long)param_6 + (param_3 & 0xfffffffffffffff0));
  }
  if (uVar14 == 0) {
    uVar5 = 0;
    goto LAB_00b6f200;
  }
  puVar3 = local_a0 + 4;
  if (param_2 != 0) {
    puVar3 = local_a0 + 2;
  }
  uVar7 = uVar14;
  puVar6 = param_6;
  do {
    uVar7 = uVar7 - 1;
    *(undefined1 *)puVar6 = *(undefined1 *)(puVar6 + -2);
    puVar6 = (undefined8 *)((long)puVar6 + 1);
  } while (uVar7 != 0);
  uVar7 = 0;
  do {
    *(byte *)((long)local_a0 + uVar7) =
         *(byte *)((long)puVar3 + uVar7) ^ *(byte *)((long)param_5 + uVar7);
    uVar7 = uVar7 + 1;
  } while (uVar14 != uVar7);
  uVar7 = 0;
  puVar6 = (undefined8 *)((long)(param_6 + -2) + uVar14);
  puVar13 = (undefined8 *)((long)puVar3 + uVar14);
  if (0xf < 0x10 - uVar14) {
    uVar16 = puVar6[1];
    uVar5 = *puVar6;
    uVar27 = puVar13[1];
    uVar18 = *puVar13;
    uVar7 = 0x10;
    *(ulong *)((long)local_a0 + uVar14 + 8) =
         CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                  CONCAT16((byte)((ulong)uVar27 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                           CONCAT15((byte)((ulong)uVar27 >> 0x28) ^ (byte)((ulong)uVar16 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                             (byte)((ulong)uVar16 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                      (byte)((ulong)uVar16 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar27 >> 0x10) ^
                                                               (byte)((ulong)uVar16 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar27 >> 8) ^
                                                                        (byte)((ulong)uVar16 >> 8),
                                                                        (byte)uVar27 ^ (byte)uVar16)
                                                              ))))));
    *(undefined8 *)((long)local_a0 + uVar14) =
         CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38),
                  CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar5 >> 0x30),
                           CONCAT15((byte)((ulong)uVar18 >> 0x28) ^ (byte)((ulong)uVar5 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                             (byte)((ulong)uVar5 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                      (byte)((ulong)uVar5 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                               (byte)((ulong)uVar5 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar18 >> 8) ^
                                                                        (byte)((ulong)uVar5 >> 8),
                                                                        (byte)uVar18 ^ (byte)uVar5))
                                                     )))));
  }
  if (uVar7 < 0x10 - uVar14) {
    uVar9 = (0x10 - uVar7) - uVar14;
    if (uVar9 < 0x20) {
      uVar8 = uVar7;
    }
    else {
      uVar10 = uVar9 & 0xffffffffffffffe0;
      uVar11 = 0;
      uVar8 = uVar7 | uVar10;
      do {
        uVar12 = uVar7 | uVar11;
        puVar1 = (undefined8 *)((long)puVar6 + uVar12);
        puVar2 = (undefined8 *)((long)puVar13 + uVar12);
        uVar16 = puVar1[1];
        uVar5 = *puVar1;
        uVar27 = puVar1[3];
        uVar18 = puVar1[2];
        uVar36 = puVar2[1];
        uVar35 = *puVar2;
        uVar38 = puVar2[3];
        uVar37 = puVar2[2];
        uVar11 = uVar11 + 0x20;
        puVar1 = (undefined8 *)((long)((long)local_a0 + uVar14) + uVar12);
        puVar1[1] = CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                             CONCAT16((byte)((ulong)uVar36 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
                                               (byte)((ulong)uVar16 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar36 >> 0x20) ^
                                                        (byte)((ulong)uVar16 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar36 >> 0x18) ^
                                                                 (byte)((ulong)uVar16 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar36 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar16 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar36 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar36 ^ (byte)uVar16)))))));
        *puVar1 = CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38),
                           CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)uVar5 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                             (byte)((ulong)uVar5 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                      (byte)((ulong)uVar5 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                               (byte)((ulong)uVar5 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar35 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar5 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar35 >> 8) ^
                                                           (byte)((ulong)uVar5 >> 8),
                                                           (byte)uVar35 ^ (byte)uVar5)))))));
        puVar1[3] = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar27 >> 0x38),
                             CONCAT16((byte)((ulong)uVar38 >> 0x30) ^ (byte)((ulong)uVar27 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                               (byte)((ulong)uVar27 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                        (byte)((ulong)uVar27 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar38 >> 0x18) ^
                                                                 (byte)((ulong)uVar27 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar38 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar27 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar38 >> 8) ^ (byte)((ulong)uVar27 >> 8),
                                                  (byte)uVar38 ^ (byte)uVar27)))))));
        puVar1[2] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                             CONCAT16((byte)((ulong)uVar37 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                               (byte)((ulong)uVar18 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                        (byte)((ulong)uVar18 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar37 >> 0x18) ^
                                                                 (byte)((ulong)uVar18 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar37 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar18 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar37 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar37 ^ (byte)uVar18)))))));
      } while (uVar10 != uVar11);
      if (uVar9 == uVar10) goto LAB_00b6f1c4;
    }
    lVar15 = uVar8 + uVar14;
    do {
      *(byte *)((long)local_a0 + lVar15) =
           *(byte *)((long)puVar3 + lVar15) ^ *(byte *)((long)param_6 + lVar15 + -0x10);
      lVar15 = lVar15 + 1;
    } while (lVar15 != 0x10);
  }
LAB_00b6f1c4:
  if (param_2 == 0) {
    mbedtls_internal_aes_decrypt(param_1,local_a0,local_a0);
  }
  else {
    mbedtls_internal_aes_encrypt(param_1,local_a0,local_a0);
  }
  uVar7 = puVar3[1];
  uVar14 = *puVar3;
  uVar5 = 0;
  param_6[-1] = CONCAT17((byte)(uVar7 >> 0x38) ^ (byte)(local_a0[1] >> 0x38),
                         CONCAT16((byte)(uVar7 >> 0x30) ^ (byte)(local_a0[1] >> 0x30),
                                  CONCAT15((byte)(uVar7 >> 0x28) ^ (byte)(local_a0[1] >> 0x28),
                                           CONCAT14((byte)(uVar7 >> 0x20) ^
                                                    (byte)(local_a0[1] >> 0x20),
                                                    CONCAT13((byte)(uVar7 >> 0x18) ^
                                                             (byte)(local_a0[1] >> 0x18),
                                                             CONCAT12((byte)(uVar7 >> 0x10) ^
                                                                      (byte)(local_a0[1] >> 0x10),
                                                                      CONCAT11((byte)(uVar7 >> 8) ^
                                                                               (byte)(local_a0[1] >>
                                                                                     8),(byte)uVar7
                                                                                        ^ (byte)
                                                  local_a0[1])))))));
  param_6[-2] = CONCAT17((byte)(uVar14 >> 0x38) ^ (byte)(local_a0[0] >> 0x38),
                         CONCAT16((byte)(uVar14 >> 0x30) ^ (byte)(local_a0[0] >> 0x30),
                                  CONCAT15((byte)(uVar14 >> 0x28) ^ (byte)(local_a0[0] >> 0x28),
                                           CONCAT14((byte)(uVar14 >> 0x20) ^
                                                    (byte)(local_a0[0] >> 0x20),
                                                    CONCAT13((byte)(uVar14 >> 0x18) ^
                                                             (byte)(local_a0[0] >> 0x18),
                                                             CONCAT12((byte)(uVar14 >> 0x10) ^
                                                                      (byte)(local_a0[0] >> 0x10),
                                                                      CONCAT11((byte)(uVar14 >> 8) ^
                                                                               (byte)(local_a0[0] >>
                                                                                     8),(byte)uVar14
                                                                                        ^ (byte)
                                                  local_a0[0])))))));
LAB_00b6f200:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

