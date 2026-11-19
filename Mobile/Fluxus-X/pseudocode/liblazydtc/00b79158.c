/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79158
 */

int mbedtls_md_hmac_starts(long *param_1,undefined1 *param_2,ulong param_3)

{
  void *__s;
  undefined1 *puVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  byte *pbVar6;
  ulong uVar7;
  ulong uVar8;
  byte *pbVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  void *__s_00;
  size_t __n;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined1 local_98 [64];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (((param_1 == (long *)0x0) || (*param_1 == 0)) ||
     (__s_00 = (void *)param_1[2], __s_00 == (void *)0x0)) {
    iVar3 = -0x5100;
    goto LAB_00b79400;
  }
  __n = (size_t)*(byte *)(*param_1 + 5);
  if (__n < param_3) {
    iVar3 = mbedtls_md_starts(param_1);
    if (iVar3 == 0) {
      iVar3 = mbedtls_md_update(param_1,param_2,param_3);
      if (iVar3 == 0) {
        iVar3 = mbedtls_md_finish(param_1,local_98);
        if (iVar3 == 0) {
          __s_00 = (void *)param_1[2];
          param_2 = local_98;
          param_3 = (ulong)*(byte *)(*param_1 + 4);
          __n = (size_t)*(byte *)(*param_1 + 5);
          goto LAB_00b791fc;
        }
      }
    }
  }
  else {
LAB_00b791fc:
    __s = (void *)((long)__s_00 + __n);
    memset(__s_00,0x36,__n);
    memset(__s,0x5c,(ulong)*(byte *)(*param_1 + 5));
    uVar7 = 0;
    if (0xf < param_3) {
      uVar4 = 0;
      do {
        uVar14 = ((undefined8 *)((long)__s_00 + uVar4))[1];
        uVar13 = *(undefined8 *)((long)__s_00 + uVar4);
        uVar16 = *(undefined8 *)((long)(param_2 + uVar4) + 8);
        uVar15 = *(undefined8 *)(param_2 + uVar4);
        uVar7 = uVar4 + 0x10;
        uVar12 = uVar4 + 0x20;
        ((undefined8 *)((long)__s_00 + uVar4))[1] =
             CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                      CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                               CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                        (byte)((ulong)uVar14 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                 (byte)((ulong)uVar14 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                          (byte)((ulong)uVar14 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                                   (byte)((ulong)uVar14 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar16 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar14 >>
                                                                                  8),(byte)uVar16 ^
                                                                                     (byte)uVar14)))
                                                ))));
        *(undefined8 *)((long)__s_00 + uVar4) =
             CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                      CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                               CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                        (byte)((ulong)uVar13 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                 (byte)((ulong)uVar13 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                          (byte)((ulong)uVar13 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar15 >> 0x10) ^
                                                                   (byte)((ulong)uVar13 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar15 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar13 >>
                                                                                  8),(byte)uVar15 ^
                                                                                     (byte)uVar13)))
                                                ))));
        uVar4 = uVar7;
      } while (uVar12 <= param_3);
    }
    uVar4 = param_3 - uVar7;
    if (uVar7 <= param_3 && uVar4 != 0) {
      if ((0x1f < uVar4) &&
         ((param_2 + param_3 <= (undefined1 *)((long)__s_00 + uVar7) ||
          ((undefined1 *)((long)__s_00 + param_3) <= param_2 + uVar7)))) {
        uVar8 = uVar4 & 0xffffffffffffffe0;
        lVar5 = uVar7 + 0x10;
        uVar7 = uVar7 + uVar8;
        puVar10 = (undefined8 *)(param_2 + lVar5);
        puVar11 = (undefined8 *)((long)__s_00 + lVar5);
        uVar12 = uVar8;
        do {
          uVar14 = puVar11[-1];
          uVar13 = puVar11[-2];
          uVar16 = puVar11[1];
          uVar15 = *puVar11;
          uVar18 = puVar10[-1];
          uVar17 = puVar10[-2];
          uVar20 = puVar10[1];
          uVar19 = *puVar10;
          puVar10 = puVar10 + 4;
          uVar12 = uVar12 - 0x20;
          puVar11[-1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                          (byte)((ulong)uVar14 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                   (byte)((ulong)uVar14 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                            (byte)((ulong)uVar14 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                                     (byte)((ulong)uVar14 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar18
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar14
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar18 >> 8) ^ (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar14)))))));
          puVar11[-2] = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar17 >> 0x30) ^
                                          (byte)((ulong)uVar13 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                   (byte)((ulong)uVar13 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                            (byte)((ulong)uVar13 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                                     (byte)((ulong)uVar13 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar17
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar13
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar17 >> 8) ^ (byte)((ulong)uVar13 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar13)))))));
          puVar11[1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                         (byte)((ulong)uVar16 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                  (byte)((ulong)uVar16 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                           (byte)((ulong)uVar16 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                    (byte)((ulong)uVar16 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar20 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar16 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
          *puVar11 = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                              CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                 (byte)((ulong)uVar15 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                          (byte)((ulong)uVar15 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                   (byte)((ulong)uVar15 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar19 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar15 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar15)))))));
          puVar11 = puVar11 + 4;
        } while (uVar12 != 0);
        if (uVar4 == uVar8) goto LAB_00b792f0;
      }
      lVar5 = param_3 - uVar7;
      pbVar6 = (byte *)((long)__s_00 + uVar7);
      pbVar9 = param_2 + uVar7;
      do {
        lVar5 = lVar5 + -1;
        *pbVar6 = *pbVar9 ^ *pbVar6;
        pbVar6 = pbVar6 + 1;
        pbVar9 = pbVar9 + 1;
      } while (lVar5 != 0);
    }
LAB_00b792f0:
    uVar7 = 0;
    if (0xf < param_3) {
      uVar4 = 0;
      do {
        uVar14 = ((undefined8 *)((long)__s + uVar4))[1];
        uVar13 = *(undefined8 *)((long)__s + uVar4);
        uVar16 = *(undefined8 *)((long)(param_2 + uVar4) + 8);
        uVar15 = *(undefined8 *)(param_2 + uVar4);
        uVar7 = uVar4 + 0x10;
        uVar12 = uVar4 + 0x20;
        ((undefined8 *)((long)__s + uVar4))[1] =
             CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                      CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                               CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                        (byte)((ulong)uVar14 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                 (byte)((ulong)uVar14 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                          (byte)((ulong)uVar14 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                                   (byte)((ulong)uVar14 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar16 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar14 >>
                                                                                  8),(byte)uVar16 ^
                                                                                     (byte)uVar14)))
                                                ))));
        *(undefined8 *)((long)__s + uVar4) =
             CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                      CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                               CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                        (byte)((ulong)uVar13 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                 (byte)((ulong)uVar13 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                          (byte)((ulong)uVar13 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar15 >> 0x10) ^
                                                                   (byte)((ulong)uVar13 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar15 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar13 >>
                                                                                  8),(byte)uVar15 ^
                                                                                     (byte)uVar13)))
                                                ))));
        uVar4 = uVar7;
      } while (uVar12 <= param_3);
    }
    uVar4 = param_3 - uVar7;
    if (uVar7 <= param_3 && uVar4 != 0) {
      if (0x1f < uVar4) {
        puVar1 = (undefined1 *)((long)__s_00 + __n + uVar7);
        if ((param_2 + param_3 <= puVar1) ||
           ((undefined1 *)((long)__s_00 + __n + param_3) <= param_2 + uVar7)) {
          uVar8 = uVar4 & 0xffffffffffffffe0;
          puVar10 = (undefined8 *)(param_2 + uVar7 + 0x10);
          uVar7 = uVar7 + uVar8;
          puVar11 = (undefined8 *)(puVar1 + 0x10);
          uVar12 = uVar8;
          do {
            uVar14 = puVar11[-1];
            uVar13 = puVar11[-2];
            uVar16 = puVar11[1];
            uVar15 = *puVar11;
            uVar18 = puVar10[-1];
            uVar17 = puVar10[-2];
            uVar20 = puVar10[1];
            uVar19 = *puVar10;
            uVar12 = uVar12 - 0x20;
            puVar10 = puVar10 + 4;
            puVar11[-1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                            (byte)((ulong)uVar14 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                     (byte)((ulong)uVar14 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                              (byte)((ulong)uVar14 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar18 >> 0x18)
                                                                       ^ (byte)((ulong)uVar14 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar18
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar14
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar18 >> 8) ^ (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar14)))))));
            puVar11[-2] = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar17 >> 0x30) ^
                                            (byte)((ulong)uVar13 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                     (byte)((ulong)uVar13 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                              (byte)((ulong)uVar13 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar17 >> 0x18)
                                                                       ^ (byte)((ulong)uVar13 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar17
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar13
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar17 >> 8) ^ (byte)((ulong)uVar13 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar13)))))));
            puVar11[1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                           (byte)((ulong)uVar16 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                    (byte)((ulong)uVar16 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                             (byte)((ulong)uVar16 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar20 >> 0x18)
                                                                      ^ (byte)((ulong)uVar16 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar20
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar16
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
            *puVar11 = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                         (byte)((ulong)uVar15 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                  (byte)((ulong)uVar15 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                           (byte)((ulong)uVar15 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                    (byte)((ulong)uVar15 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar19 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar15 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar15)))))));
            puVar11 = puVar11 + 4;
          } while (uVar12 != 0);
          if (uVar4 == uVar8) goto LAB_00b793c4;
        }
      }
      lVar5 = param_3 - uVar7;
      pbVar6 = (byte *)((long)__s_00 + uVar7 + __n);
      pbVar9 = param_2 + uVar7;
      do {
        lVar5 = lVar5 + -1;
        *pbVar6 = *pbVar9 ^ *pbVar6;
        pbVar6 = pbVar6 + 1;
        pbVar9 = pbVar9 + 1;
      } while (lVar5 != 0);
    }
LAB_00b793c4:
    iVar3 = mbedtls_md_starts(param_1);
    if (iVar3 == 0) {
      iVar3 = mbedtls_md_update(param_1,__s_00,*(undefined1 *)(*param_1 + 5));
    }
  }
  mbedtls_platform_zeroize(local_98,0x40);
LAB_00b79400:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

