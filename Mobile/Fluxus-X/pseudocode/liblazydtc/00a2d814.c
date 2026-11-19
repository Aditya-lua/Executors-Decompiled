/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2d814
 */

bool BN_GF2m_mod_solve_quad_arr(BIGNUM *param_1,undefined8 param_2,byte *param_3,BN_CTX *param_4)

{
  BIGNUM *pBVar1;
  uint uVar2;
  int iVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  BIGNUM *pBVar7;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *pBVar8;
  BIGNUM *pBVar9;
  BIGNUM *pBVar10;
  BIGNUM *pBVar11;
  long lVar12;
  undefined8 uVar13;
  ulong uVar14;
  ulong *puVar15;
  ulong *puVar16;
  ulong *puVar17;
  ulong uVar18;
  ulong uVar19;
  ulong *puVar20;
  ulong *puVar21;
  ulong *puVar22;
  uint uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  
  if (*(int *)param_3 == 0) {
    BN_zero_ex(param_1);
    return true;
  }
  BN_CTX_start(param_4);
  pBVar7 = BN_CTX_get(param_4);
  a = BN_CTX_get(param_4);
  a_00 = BN_CTX_get(param_4);
  if ((a_00 == (BIGNUM *)0x0) || (iVar5 = BN_GF2m_mod_arr(pBVar7,param_2,param_3), iVar5 == 0))
  goto LAB_00a2e218;
  iVar5 = BN_is_zero(pBVar7);
  if (iVar5 != 0) {
    BN_zero_ex(param_1);
    bVar4 = true;
    goto LAB_00a2e21c;
  }
  if ((*param_3 & 1) == 0) {
    pBVar8 = BN_CTX_get(param_4);
    pBVar9 = BN_CTX_get(param_4);
    pBVar10 = BN_CTX_get(param_4);
    if (pBVar10 != (BIGNUM *)0x0) {
      uVar23 = 0;
      do {
        iVar5 = BN_priv_rand_ex(pBVar8,*(int *)param_3,0,0,0,param_4);
        if ((iVar5 == 0) || (iVar5 = BN_GF2m_mod_arr(pBVar8,pBVar8,param_3), iVar5 == 0))
        goto LAB_00a2e218;
        BN_zero_ex(a);
        pBVar11 = BN_copy(a_00,pBVar8);
        if (pBVar11 == (BIGNUM *)0x0) goto LAB_00a2e218;
        if (1 < *(int *)param_3) {
          iVar5 = 1;
          do {
            iVar6 = BN_GF2m_mod_sqr_arr(a,a,param_3,param_4);
            if (((iVar6 == 0) ||
                (iVar6 = BN_GF2m_mod_sqr_arr(pBVar9,a_00,param_3,param_4), iVar6 == 0)) ||
               (iVar6 = BN_GF2m_mod_mul_arr(pBVar10,pBVar9,pBVar7,param_3,param_4), iVar6 == 0))
            goto LAB_00a2e218;
            pBVar11 = pBVar10;
            if (pBVar10->top <= a->top) {
              pBVar11 = a;
            }
            pBVar1 = a;
            if (pBVar10->top <= a->top) {
              pBVar1 = pBVar10;
            }
            lVar12 = bn_wexpand(a,pBVar11->top);
            if (lVar12 == 0) goto LAB_00a2e218;
            uVar2 = pBVar1->top;
            uVar14 = (ulong)uVar2;
            if ((int)uVar2 < 1) {
              uVar14 = 0;
            }
            else {
              puVar15 = pBVar11->d;
              puVar16 = pBVar1->d;
              puVar17 = a->d;
              uVar19 = 0;
              uVar18 = (ulong)(int)uVar2;
              if (3 < uVar2) {
                if (puVar17 < puVar15 + uVar18 && puVar15 < puVar17 + uVar18) {
                  uVar19 = 0;
                }
                else {
                  uVar19 = 0;
                  if (puVar16 + uVar18 <= puVar17 || puVar17 + uVar18 <= puVar16) {
                    uVar19 = uVar18 & 0xfffffffffffffffc;
                    puVar20 = puVar15 + 2;
                    puVar21 = puVar16 + 2;
                    puVar22 = puVar17 + 2;
                    uVar27 = uVar19;
                    do {
                      uVar25 = puVar20[-1];
                      uVar24 = puVar20[-2];
                      uVar28 = puVar20[1];
                      uVar26 = *puVar20;
                      uVar30 = puVar21[-1];
                      uVar29 = puVar21[-2];
                      uVar32 = puVar21[1];
                      uVar31 = *puVar21;
                      puVar20 = puVar20 + 4;
                      puVar21 = puVar21 + 4;
                      uVar27 = uVar27 - 4;
                      puVar22[-1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                             CONCAT16((byte)(uVar30 >> 0x30) ^
                                                      (byte)(uVar25 >> 0x30),
                                                      CONCAT15((byte)(uVar30 >> 0x28) ^
                                                               (byte)(uVar25 >> 0x28),
                                                               CONCAT14((byte)(uVar30 >> 0x20) ^
                                                                        (byte)(uVar25 >> 0x20),
                                                                        CONCAT13((byte)(uVar30 >>
                                                                                       0x18) ^
                                                                                 (byte)(uVar25 >>
                                                                                       0x18),
                                                                                 CONCAT12((byte)(
                                                  uVar30 >> 0x10) ^ (byte)(uVar25 >> 0x10),
                                                  CONCAT11((byte)(uVar30 >> 8) ^ (byte)(uVar25 >> 8)
                                                           ,(byte)uVar30 ^ (byte)uVar25)))))));
                      puVar22[-2] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                             CONCAT16((byte)(uVar29 >> 0x30) ^
                                                      (byte)(uVar24 >> 0x30),
                                                      CONCAT15((byte)(uVar29 >> 0x28) ^
                                                               (byte)(uVar24 >> 0x28),
                                                               CONCAT14((byte)(uVar29 >> 0x20) ^
                                                                        (byte)(uVar24 >> 0x20),
                                                                        CONCAT13((byte)(uVar29 >>
                                                                                       0x18) ^
                                                                                 (byte)(uVar24 >>
                                                                                       0x18),
                                                                                 CONCAT12((byte)(
                                                  uVar29 >> 0x10) ^ (byte)(uVar24 >> 0x10),
                                                  CONCAT11((byte)(uVar29 >> 8) ^ (byte)(uVar24 >> 8)
                                                           ,(byte)uVar29 ^ (byte)uVar24)))))));
                      puVar22[1] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                                            CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar28 >> 0x30)
                                                     ,CONCAT15((byte)(uVar32 >> 0x28) ^
                                                               (byte)(uVar28 >> 0x28),
                                                               CONCAT14((byte)(uVar32 >> 0x20) ^
                                                                        (byte)(uVar28 >> 0x20),
                                                                        CONCAT13((byte)(uVar32 >>
                                                                                       0x18) ^
                                                                                 (byte)(uVar28 >>
                                                                                       0x18),
                                                                                 CONCAT12((byte)(
                                                  uVar32 >> 0x10) ^ (byte)(uVar28 >> 0x10),
                                                  CONCAT11((byte)(uVar32 >> 8) ^ (byte)(uVar28 >> 8)
                                                           ,(byte)uVar32 ^ (byte)uVar28)))))));
                      *puVar22 = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                                          CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                                   CONCAT15((byte)(uVar31 >> 0x28) ^
                                                            (byte)(uVar26 >> 0x28),
                                                            CONCAT14((byte)(uVar31 >> 0x20) ^
                                                                     (byte)(uVar26 >> 0x20),
                                                                     CONCAT13((byte)(uVar31 >> 0x18)
                                                                              ^ (byte)(uVar26 >>
                                                                                      0x18),
                                                                              CONCAT12((byte)(uVar31
                                                                                             >> 0x10
                                                  ) ^ (byte)(uVar26 >> 0x10),
                                                  CONCAT11((byte)(uVar31 >> 8) ^ (byte)(uVar26 >> 8)
                                                           ,(byte)uVar31 ^ (byte)uVar26)))))));
                      puVar22 = puVar22 + 4;
                    } while (uVar27 != 0);
                    if (uVar19 == uVar18) goto LAB_00a2dab4;
                  }
                }
              }
              lVar12 = uVar18 - uVar19;
              puVar15 = puVar15 + uVar19;
              puVar16 = puVar16 + uVar19;
              puVar17 = puVar17 + uVar19;
              do {
                lVar12 = lVar12 + -1;
                *puVar17 = *puVar16 ^ *puVar15;
                puVar15 = puVar15 + 1;
                puVar16 = puVar16 + 1;
                puVar17 = puVar17 + 1;
              } while (lVar12 != 0);
            }
LAB_00a2dab4:
            iVar6 = pBVar11->top;
            if ((int)uVar14 < iVar6) {
              puVar15 = pBVar11->d;
              puVar16 = a->d;
              uVar2 = (iVar6 + -1) - (int)uVar14;
              uVar18 = (ulong)uVar2;
              if (3 < uVar18 + 1) {
                if ((puVar15 + uVar14 + uVar18 + 1 <= puVar16 + uVar14) ||
                   (puVar16 + uVar14 + uVar18 + 1 <= puVar15 + uVar14)) {
                  uVar2 = uVar2 + 1 & 3;
                  puVar17 = puVar16 + uVar14 + 2;
                  puVar20 = puVar15 + uVar14 + 2;
                  lVar12 = (uVar18 + 1) - (ulong)uVar2;
                  do {
                    puVar21 = puVar20 + -1;
                    uVar19 = puVar20[-2];
                    uVar24 = puVar20[1];
                    uVar27 = *puVar20;
                    lVar12 = lVar12 + -4;
                    puVar20 = puVar20 + 4;
                    puVar17[-1] = *puVar21;
                    puVar17[-2] = uVar19;
                    puVar17[1] = uVar24;
                    *puVar17 = uVar27;
                    puVar17 = puVar17 + 4;
                  } while (lVar12 != 0);
                  uVar14 = ((uVar18 + 1) - (ulong)uVar2) + uVar14;
                  if (uVar2 == 0) goto LAB_00a2db68;
                }
              }
              do {
                uVar18 = uVar14 + 1;
                puVar16[uVar14] = puVar15[uVar14];
                uVar14 = uVar18;
              } while ((int)uVar18 < iVar6);
            }
LAB_00a2db68:
            a->top = iVar6;
            bn_correct_top(a);
            pBVar11 = pBVar8;
            if (pBVar8->top <= pBVar9->top) {
              pBVar11 = pBVar9;
            }
            pBVar1 = pBVar9;
            if (pBVar8->top <= pBVar9->top) {
              pBVar1 = pBVar8;
            }
            lVar12 = bn_wexpand(a_00,pBVar11->top);
            if (lVar12 == 0) goto LAB_00a2e218;
            uVar2 = pBVar1->top;
            uVar14 = (ulong)uVar2;
            if ((int)uVar2 < 1) {
              uVar14 = 0;
            }
            else {
              puVar15 = pBVar11->d;
              puVar16 = pBVar1->d;
              puVar17 = a_00->d;
              uVar19 = 0;
              uVar18 = (ulong)(int)uVar2;
              if (3 < uVar2) {
                if (puVar17 < puVar15 + uVar18 && puVar15 < puVar17 + uVar18) {
                  uVar19 = 0;
                }
                else {
                  uVar19 = 0;
                  if (puVar16 + uVar18 <= puVar17 || puVar17 + uVar18 <= puVar16) {
                    uVar19 = uVar18 & 0xfffffffffffffffc;
                    puVar20 = puVar15 + 2;
                    puVar21 = puVar16 + 2;
                    puVar22 = puVar17 + 2;
                    uVar27 = uVar19;
                    do {
                      uVar25 = puVar20[-1];
                      uVar24 = puVar20[-2];
                      uVar28 = puVar20[1];
                      uVar26 = *puVar20;
                      uVar30 = puVar21[-1];
                      uVar29 = puVar21[-2];
                      uVar32 = puVar21[1];
                      uVar31 = *puVar21;
                      puVar20 = puVar20 + 4;
                      puVar21 = puVar21 + 4;
                      uVar27 = uVar27 - 4;
                      puVar22[-1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                             CONCAT16((byte)(uVar30 >> 0x30) ^
                                                      (byte)(uVar25 >> 0x30),
                                                      CONCAT15((byte)(uVar30 >> 0x28) ^
                                                               (byte)(uVar25 >> 0x28),
                                                               CONCAT14((byte)(uVar30 >> 0x20) ^
                                                                        (byte)(uVar25 >> 0x20),
                                                                        CONCAT13((byte)(uVar30 >>
                                                                                       0x18) ^
                                                                                 (byte)(uVar25 >>
                                                                                       0x18),
                                                                                 CONCAT12((byte)(
                                                  uVar30 >> 0x10) ^ (byte)(uVar25 >> 0x10),
                                                  CONCAT11((byte)(uVar30 >> 8) ^ (byte)(uVar25 >> 8)
                                                           ,(byte)uVar30 ^ (byte)uVar25)))))));
                      puVar22[-2] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                             CONCAT16((byte)(uVar29 >> 0x30) ^
                                                      (byte)(uVar24 >> 0x30),
                                                      CONCAT15((byte)(uVar29 >> 0x28) ^
                                                               (byte)(uVar24 >> 0x28),
                                                               CONCAT14((byte)(uVar29 >> 0x20) ^
                                                                        (byte)(uVar24 >> 0x20),
                                                                        CONCAT13((byte)(uVar29 >>
                                                                                       0x18) ^
                                                                                 (byte)(uVar24 >>
                                                                                       0x18),
                                                                                 CONCAT12((byte)(
                                                  uVar29 >> 0x10) ^ (byte)(uVar24 >> 0x10),
                                                  CONCAT11((byte)(uVar29 >> 8) ^ (byte)(uVar24 >> 8)
                                                           ,(byte)uVar29 ^ (byte)uVar24)))))));
                      puVar22[1] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                                            CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar28 >> 0x30)
                                                     ,CONCAT15((byte)(uVar32 >> 0x28) ^
                                                               (byte)(uVar28 >> 0x28),
                                                               CONCAT14((byte)(uVar32 >> 0x20) ^
                                                                        (byte)(uVar28 >> 0x20),
                                                                        CONCAT13((byte)(uVar32 >>
                                                                                       0x18) ^
                                                                                 (byte)(uVar28 >>
                                                                                       0x18),
                                                                                 CONCAT12((byte)(
                                                  uVar32 >> 0x10) ^ (byte)(uVar28 >> 0x10),
                                                  CONCAT11((byte)(uVar32 >> 8) ^ (byte)(uVar28 >> 8)
                                                           ,(byte)uVar32 ^ (byte)uVar28)))))));
                      *puVar22 = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                                          CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                                   CONCAT15((byte)(uVar31 >> 0x28) ^
                                                            (byte)(uVar26 >> 0x28),
                                                            CONCAT14((byte)(uVar31 >> 0x20) ^
                                                                     (byte)(uVar26 >> 0x20),
                                                                     CONCAT13((byte)(uVar31 >> 0x18)
                                                                              ^ (byte)(uVar26 >>
                                                                                      0x18),
                                                                              CONCAT12((byte)(uVar31
                                                                                             >> 0x10
                                                  ) ^ (byte)(uVar26 >> 0x10),
                                                  CONCAT11((byte)(uVar31 >> 8) ^ (byte)(uVar26 >> 8)
                                                           ,(byte)uVar31 ^ (byte)uVar26)))))));
                      puVar22 = puVar22 + 4;
                    } while (uVar27 != 0);
                    if (uVar19 == uVar18) goto LAB_00a2dc90;
                  }
                }
              }
              lVar12 = uVar18 - uVar19;
              puVar15 = puVar15 + uVar19;
              puVar16 = puVar16 + uVar19;
              puVar17 = puVar17 + uVar19;
              do {
                lVar12 = lVar12 + -1;
                *puVar17 = *puVar16 ^ *puVar15;
                puVar15 = puVar15 + 1;
                puVar16 = puVar16 + 1;
                puVar17 = puVar17 + 1;
              } while (lVar12 != 0);
            }
LAB_00a2dc90:
            iVar6 = pBVar11->top;
            if ((int)uVar14 < iVar6) {
              puVar15 = pBVar11->d;
              puVar16 = a_00->d;
              uVar2 = (iVar6 + -1) - (int)uVar14;
              uVar18 = (ulong)uVar2;
              if (3 < uVar18 + 1) {
                if ((puVar15 + uVar14 + uVar18 + 1 <= puVar16 + uVar14) ||
                   (puVar16 + uVar14 + uVar18 + 1 <= puVar15 + uVar14)) {
                  uVar2 = uVar2 + 1 & 3;
                  puVar17 = puVar16 + uVar14 + 2;
                  puVar20 = puVar15 + uVar14 + 2;
                  lVar12 = (uVar18 + 1) - (ulong)uVar2;
                  do {
                    puVar21 = puVar20 + -1;
                    uVar19 = puVar20[-2];
                    uVar24 = puVar20[1];
                    uVar27 = *puVar20;
                    lVar12 = lVar12 + -4;
                    puVar20 = puVar20 + 4;
                    puVar17[-1] = *puVar21;
                    puVar17[-2] = uVar19;
                    puVar17[1] = uVar24;
                    *puVar17 = uVar27;
                    puVar17 = puVar17 + 4;
                  } while (lVar12 != 0);
                  uVar14 = ((uVar18 + 1) - (ulong)uVar2) + uVar14;
                  if (uVar2 == 0) goto LAB_00a2dd44;
                }
              }
              do {
                uVar18 = uVar14 + 1;
                puVar16[uVar14] = puVar15[uVar14];
                uVar14 = uVar18;
              } while ((int)uVar18 < iVar6);
            }
LAB_00a2dd44:
            a_00->top = iVar6;
            bn_correct_top(a_00);
            iVar5 = iVar5 + 1;
          } while (iVar5 < *(int *)param_3);
        }
        uVar23 = uVar23 + 1;
        iVar5 = BN_is_zero(a_00);
      } while ((uVar23 < 0x32) && (iVar5 != 0));
      iVar5 = BN_is_zero(a_00);
      if (iVar5 == 0) goto LAB_00a2ddd0;
      ERR_new();
      ERR_set_debug("crypto/bn/bn_gf2m.c",0x43a,"BN_GF2m_mod_solve_quad_arr");
      uVar13 = 0x71;
LAB_00a2e210:
      ERR_set_error(3,uVar13,0);
    }
  }
  else {
    pBVar8 = BN_copy(a,pBVar7);
    if (pBVar8 != (BIGNUM *)0x0) {
      if (2 < *(int *)param_3) {
        iVar5 = 1;
        do {
          iVar6 = BN_GF2m_mod_sqr_arr(a,a,param_3,param_4);
          if ((iVar6 == 0) || (iVar6 = BN_GF2m_mod_sqr_arr(a,a,param_3,param_4), iVar6 == 0))
          goto LAB_00a2e218;
          pBVar8 = pBVar7;
          if (pBVar7->top <= a->top) {
            pBVar8 = a;
          }
          pBVar9 = a;
          if (pBVar7->top <= a->top) {
            pBVar9 = pBVar7;
          }
          lVar12 = bn_wexpand(a,pBVar8->top);
          if (lVar12 == 0) goto LAB_00a2e218;
          uVar23 = pBVar9->top;
          uVar14 = (ulong)uVar23;
          if ((int)uVar23 < 1) {
            uVar14 = 0;
          }
          else {
            puVar15 = pBVar8->d;
            puVar16 = pBVar9->d;
            puVar17 = a->d;
            uVar19 = 0;
            uVar18 = (ulong)(int)uVar23;
            if (3 < uVar23) {
              if (puVar17 < puVar15 + uVar18 && puVar15 < puVar17 + uVar18) {
                uVar19 = 0;
              }
              else {
                uVar19 = 0;
                if (puVar16 + uVar18 <= puVar17 || puVar17 + uVar18 <= puVar16) {
                  uVar19 = uVar18 & 0xfffffffffffffffc;
                  puVar20 = puVar15 + 2;
                  puVar21 = puVar16 + 2;
                  puVar22 = puVar17 + 2;
                  uVar27 = uVar19;
                  do {
                    uVar25 = puVar20[-1];
                    uVar24 = puVar20[-2];
                    uVar28 = puVar20[1];
                    uVar26 = *puVar20;
                    uVar30 = puVar21[-1];
                    uVar29 = puVar21[-2];
                    uVar32 = puVar21[1];
                    uVar31 = *puVar21;
                    puVar20 = puVar20 + 4;
                    puVar21 = puVar21 + 4;
                    uVar27 = uVar27 - 4;
                    puVar22[-1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                           CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar25 >> 0x30),
                                                    CONCAT15((byte)(uVar30 >> 0x28) ^
                                                             (byte)(uVar25 >> 0x28),
                                                             CONCAT14((byte)(uVar30 >> 0x20) ^
                                                                      (byte)(uVar25 >> 0x20),
                                                                      CONCAT13((byte)(uVar30 >> 0x18
                                                                                     ) ^ (byte)(
                                                  uVar25 >> 0x18),
                                                  CONCAT12((byte)(uVar30 >> 0x10) ^
                                                           (byte)(uVar25 >> 0x10),
                                                           CONCAT11((byte)(uVar30 >> 8) ^
                                                                    (byte)(uVar25 >> 8),
                                                                    (byte)uVar30 ^ (byte)uVar25)))))
                                                  ));
                    puVar22[-2] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                           CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                                    CONCAT15((byte)(uVar29 >> 0x28) ^
                                                             (byte)(uVar24 >> 0x28),
                                                             CONCAT14((byte)(uVar29 >> 0x20) ^
                                                                      (byte)(uVar24 >> 0x20),
                                                                      CONCAT13((byte)(uVar29 >> 0x18
                                                                                     ) ^ (byte)(
                                                  uVar24 >> 0x18),
                                                  CONCAT12((byte)(uVar29 >> 0x10) ^
                                                           (byte)(uVar24 >> 0x10),
                                                           CONCAT11((byte)(uVar29 >> 8) ^
                                                                    (byte)(uVar24 >> 8),
                                                                    (byte)uVar29 ^ (byte)uVar24)))))
                                                  ));
                    puVar22[1] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                                          CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar28 >> 0x30),
                                                   CONCAT15((byte)(uVar32 >> 0x28) ^
                                                            (byte)(uVar28 >> 0x28),
                                                            CONCAT14((byte)(uVar32 >> 0x20) ^
                                                                     (byte)(uVar28 >> 0x20),
                                                                     CONCAT13((byte)(uVar32 >> 0x18)
                                                                              ^ (byte)(uVar28 >>
                                                                                      0x18),
                                                                              CONCAT12((byte)(uVar32
                                                                                             >> 0x10
                                                  ) ^ (byte)(uVar28 >> 0x10),
                                                  CONCAT11((byte)(uVar32 >> 8) ^ (byte)(uVar28 >> 8)
                                                           ,(byte)uVar32 ^ (byte)uVar28)))))));
                    *puVar22 = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                                        CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                                 CONCAT15((byte)(uVar31 >> 0x28) ^
                                                          (byte)(uVar26 >> 0x28),
                                                          CONCAT14((byte)(uVar31 >> 0x20) ^
                                                                   (byte)(uVar26 >> 0x20),
                                                                   CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                            (byte)(uVar26 >> 0x18),
                                                                            CONCAT12((byte)(uVar31 
                                                  >> 0x10) ^ (byte)(uVar26 >> 0x10),
                                                  CONCAT11((byte)(uVar31 >> 8) ^ (byte)(uVar26 >> 8)
                                                           ,(byte)uVar31 ^ (byte)uVar26)))))));
                    puVar22 = puVar22 + 4;
                  } while (uVar27 != 0);
                  if (uVar19 == uVar18) goto LAB_00a2e004;
                }
              }
            }
            lVar12 = uVar18 - uVar19;
            puVar15 = puVar15 + uVar19;
            puVar16 = puVar16 + uVar19;
            puVar17 = puVar17 + uVar19;
            do {
              lVar12 = lVar12 + -1;
              *puVar17 = *puVar16 ^ *puVar15;
              puVar15 = puVar15 + 1;
              puVar16 = puVar16 + 1;
              puVar17 = puVar17 + 1;
            } while (lVar12 != 0);
          }
LAB_00a2e004:
          iVar6 = pBVar8->top;
          if ((int)uVar14 < iVar6) {
            puVar15 = pBVar8->d;
            puVar16 = a->d;
            uVar23 = (iVar6 + -1) - (int)uVar14;
            uVar18 = (ulong)uVar23;
            if (3 < uVar18 + 1) {
              if ((puVar15 + uVar14 + uVar18 + 1 <= puVar16 + uVar14) ||
                 (puVar16 + uVar14 + uVar18 + 1 <= puVar15 + uVar14)) {
                uVar23 = uVar23 + 1 & 3;
                puVar17 = puVar16 + uVar14 + 2;
                puVar20 = puVar15 + uVar14 + 2;
                lVar12 = (uVar18 + 1) - (ulong)uVar23;
                do {
                  puVar21 = puVar20 + -1;
                  uVar19 = puVar20[-2];
                  uVar24 = puVar20[1];
                  uVar27 = *puVar20;
                  lVar12 = lVar12 + -4;
                  puVar20 = puVar20 + 4;
                  puVar17[-1] = *puVar21;
                  puVar17[-2] = uVar19;
                  puVar17[1] = uVar24;
                  *puVar17 = uVar27;
                  puVar17 = puVar17 + 4;
                } while (lVar12 != 0);
                uVar14 = ((uVar18 + 1) - (ulong)uVar23) + uVar14;
                if (uVar23 == 0) goto LAB_00a2e0b8;
              }
            }
            do {
              uVar18 = uVar14 + 1;
              puVar16[uVar14] = puVar15[uVar14];
              uVar14 = uVar18;
            } while ((int)uVar18 < iVar6);
          }
LAB_00a2e0b8:
          a->top = iVar6;
          bn_correct_top(a);
          iVar3 = *(int *)param_3 + -1;
          iVar6 = *(int *)param_3;
          if (-1 < iVar3) {
            iVar6 = iVar3;
          }
          bVar4 = iVar5 < iVar6 >> 1;
          iVar5 = iVar5 + 1;
        } while (bVar4);
      }
LAB_00a2ddd0:
      iVar5 = BN_GF2m_mod_sqr_arr(a_00,a,param_3,param_4);
      if (iVar5 != 0) {
        pBVar8 = a_00;
        if (a_00->top <= a->top) {
          pBVar8 = a;
        }
        pBVar9 = a;
        if (a_00->top <= a->top) {
          pBVar9 = a_00;
        }
        lVar12 = bn_wexpand(a_00,pBVar8->top);
        if (lVar12 != 0) {
          uVar23 = pBVar9->top;
          uVar14 = (ulong)uVar23;
          if ((int)uVar23 < 1) {
            uVar14 = 0;
          }
          else {
            puVar15 = pBVar8->d;
            puVar16 = pBVar9->d;
            puVar17 = a_00->d;
            uVar19 = 0;
            uVar18 = (ulong)(int)uVar23;
            if (3 < uVar23) {
              if (puVar17 < puVar15 + uVar18 && puVar15 < puVar17 + uVar18) {
                uVar19 = 0;
              }
              else {
                uVar19 = 0;
                if (puVar16 + uVar18 <= puVar17 || puVar17 + uVar18 <= puVar16) {
                  uVar19 = uVar18 & 0xfffffffffffffffc;
                  puVar20 = puVar15 + 2;
                  puVar21 = puVar16 + 2;
                  puVar22 = puVar17 + 2;
                  uVar27 = uVar19;
                  do {
                    uVar25 = puVar20[-1];
                    uVar24 = puVar20[-2];
                    uVar28 = puVar20[1];
                    uVar26 = *puVar20;
                    uVar30 = puVar21[-1];
                    uVar29 = puVar21[-2];
                    uVar32 = puVar21[1];
                    uVar31 = *puVar21;
                    puVar20 = puVar20 + 4;
                    puVar21 = puVar21 + 4;
                    uVar27 = uVar27 - 4;
                    puVar22[-1] = CONCAT17((byte)(uVar30 >> 0x38) ^ (byte)(uVar25 >> 0x38),
                                           CONCAT16((byte)(uVar30 >> 0x30) ^ (byte)(uVar25 >> 0x30),
                                                    CONCAT15((byte)(uVar30 >> 0x28) ^
                                                             (byte)(uVar25 >> 0x28),
                                                             CONCAT14((byte)(uVar30 >> 0x20) ^
                                                                      (byte)(uVar25 >> 0x20),
                                                                      CONCAT13((byte)(uVar30 >> 0x18
                                                                                     ) ^ (byte)(
                                                  uVar25 >> 0x18),
                                                  CONCAT12((byte)(uVar30 >> 0x10) ^
                                                           (byte)(uVar25 >> 0x10),
                                                           CONCAT11((byte)(uVar30 >> 8) ^
                                                                    (byte)(uVar25 >> 8),
                                                                    (byte)uVar30 ^ (byte)uVar25)))))
                                                  ));
                    puVar22[-2] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                           CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar24 >> 0x30),
                                                    CONCAT15((byte)(uVar29 >> 0x28) ^
                                                             (byte)(uVar24 >> 0x28),
                                                             CONCAT14((byte)(uVar29 >> 0x20) ^
                                                                      (byte)(uVar24 >> 0x20),
                                                                      CONCAT13((byte)(uVar29 >> 0x18
                                                                                     ) ^ (byte)(
                                                  uVar24 >> 0x18),
                                                  CONCAT12((byte)(uVar29 >> 0x10) ^
                                                           (byte)(uVar24 >> 0x10),
                                                           CONCAT11((byte)(uVar29 >> 8) ^
                                                                    (byte)(uVar24 >> 8),
                                                                    (byte)uVar29 ^ (byte)uVar24)))))
                                                  ));
                    puVar22[1] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                                          CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar28 >> 0x30),
                                                   CONCAT15((byte)(uVar32 >> 0x28) ^
                                                            (byte)(uVar28 >> 0x28),
                                                            CONCAT14((byte)(uVar32 >> 0x20) ^
                                                                     (byte)(uVar28 >> 0x20),
                                                                     CONCAT13((byte)(uVar32 >> 0x18)
                                                                              ^ (byte)(uVar28 >>
                                                                                      0x18),
                                                                              CONCAT12((byte)(uVar32
                                                                                             >> 0x10
                                                  ) ^ (byte)(uVar28 >> 0x10),
                                                  CONCAT11((byte)(uVar32 >> 8) ^ (byte)(uVar28 >> 8)
                                                           ,(byte)uVar32 ^ (byte)uVar28)))))));
                    *puVar22 = CONCAT17((byte)(uVar31 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                                        CONCAT16((byte)(uVar31 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                                 CONCAT15((byte)(uVar31 >> 0x28) ^
                                                          (byte)(uVar26 >> 0x28),
                                                          CONCAT14((byte)(uVar31 >> 0x20) ^
                                                                   (byte)(uVar26 >> 0x20),
                                                                   CONCAT13((byte)(uVar31 >> 0x18) ^
                                                                            (byte)(uVar26 >> 0x18),
                                                                            CONCAT12((byte)(uVar31 
                                                  >> 0x10) ^ (byte)(uVar26 >> 0x10),
                                                  CONCAT11((byte)(uVar31 >> 8) ^ (byte)(uVar26 >> 8)
                                                           ,(byte)uVar31 ^ (byte)uVar26)))))));
                    puVar22 = puVar22 + 4;
                  } while (uVar27 != 0);
                  if (uVar19 == uVar18) goto LAB_00a2e11c;
                }
              }
            }
            lVar12 = uVar18 - uVar19;
            puVar15 = puVar15 + uVar19;
            puVar16 = puVar16 + uVar19;
            puVar17 = puVar17 + uVar19;
            do {
              lVar12 = lVar12 + -1;
              *puVar17 = *puVar16 ^ *puVar15;
              puVar15 = puVar15 + 1;
              puVar16 = puVar16 + 1;
              puVar17 = puVar17 + 1;
            } while (lVar12 != 0);
          }
LAB_00a2e11c:
          iVar5 = pBVar8->top;
          if ((int)uVar14 < iVar5) {
            puVar15 = pBVar8->d;
            puVar16 = a_00->d;
            uVar23 = (iVar5 + -1) - (int)uVar14;
            uVar18 = (ulong)uVar23;
            if ((3 < uVar18 + 1) &&
               ((puVar15 + uVar14 + uVar18 + 1 <= puVar16 + uVar14 ||
                (puVar16 + uVar14 + uVar18 + 1 <= puVar15 + uVar14)))) {
              uVar23 = uVar23 + 1 & 3;
              puVar20 = puVar16 + uVar14 + 2;
              puVar17 = puVar15 + uVar14 + 2;
              lVar12 = (uVar18 + 1) - (ulong)uVar23;
              do {
                puVar21 = puVar17 + -1;
                uVar19 = puVar17[-2];
                uVar24 = puVar17[1];
                uVar27 = *puVar17;
                lVar12 = lVar12 + -4;
                puVar17 = puVar17 + 4;
                puVar20[-1] = *puVar21;
                puVar20[-2] = uVar19;
                puVar20[1] = uVar24;
                *puVar20 = uVar27;
                puVar20 = puVar20 + 4;
              } while (lVar12 != 0);
              uVar14 = ((uVar18 + 1) - (ulong)uVar23) + uVar14;
              if (uVar23 == 0) goto LAB_00a2e1d0;
            }
            do {
              uVar18 = uVar14 + 1;
              puVar16[uVar14] = puVar15[uVar14];
              uVar14 = uVar18;
            } while ((int)uVar18 < iVar5);
          }
LAB_00a2e1d0:
          a_00->top = iVar5;
          bn_correct_top(a_00);
          iVar5 = BN_ucmp(a_00,pBVar7);
          if (iVar5 == 0) {
            pBVar7 = BN_copy(param_1,a);
            bVar4 = pBVar7 != (BIGNUM *)0x0;
            goto LAB_00a2e21c;
          }
          ERR_new();
          ERR_set_debug("crypto/bn/bn_gf2m.c",0x444,"BN_GF2m_mod_solve_quad_arr");
          uVar13 = 0x74;
          goto LAB_00a2e210;
        }
      }
    }
  }
LAB_00a2e218:
  bVar4 = false;
LAB_00a2e21c:
  BN_CTX_end(param_4);
  return bVar4;
}

