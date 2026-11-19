/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2caa4
 */

bool BN_GF2m_mod_inv(BIGNUM *param_1,undefined8 param_2,BIGNUM *param_3,BN_CTX *param_4)

{
  uint uVar1;
  uint uVar2;
  BIGNUM *pBVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  long lVar9;
  ulong *__s;
  ulong *puVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong uVar16;
  ulong uVar17;
  ulong *puVar18;
  ulong *puVar19;
  ulong *puVar20;
  ulong uVar21;
  int iVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong *local_90;
  BIGNUM *local_80;
  BIGNUM *local_78;
  BIGNUM *local_70;
  BIGNUM *local_68;
  
  BN_CTX_start(param_4);
  pBVar7 = BN_CTX_get(param_4);
  if (pBVar7 != (BIGNUM *)0x0) {
    iVar5 = BN_num_bits(param_3);
    bVar4 = false;
    if (iVar5 < 2) goto LAB_00a2cbb4;
    do {
      iVar6 = BN_priv_rand_ex(pBVar7,iVar5 + -1,0xffffffff,0,0,param_4);
      if (iVar6 == 0) goto LAB_00a2cbb0;
      iVar6 = BN_is_zero(pBVar7);
    } while (iVar6 != 0);
    iVar5 = BN_GF2m_mod_mul(param_1,param_2,pBVar7,param_3,param_4);
    if (iVar5 != 0) {
      BN_CTX_start(param_4);
      local_78 = BN_CTX_get(param_4);
      local_80 = BN_CTX_get(param_4);
      local_68 = BN_CTX_get(param_4);
      local_70 = BN_CTX_get(param_4);
      if ((((local_70 != (BIGNUM *)0x0) &&
           (iVar5 = BN_GF2m_mod(local_68,param_1,param_3), iVar5 != 0)) &&
          (iVar5 = BN_is_zero(local_68), iVar5 == 0)) &&
         (pBVar8 = BN_copy(local_70,param_3), pBVar8 != (BIGNUM *)0x0)) {
        iVar5 = BN_num_bits(local_68);
        iVar6 = BN_num_bits(local_70);
        uVar2 = param_3->top;
        uVar21 = (ulong)uVar2;
        lVar9 = bn_wexpand(local_68,uVar21);
        if (lVar9 != 0) {
          iVar22 = local_68->top;
          puVar19 = local_68->d;
          if (iVar22 < (int)uVar2) {
            memset(puVar19 + iVar22,0,(ulong)((uVar2 - 1) - iVar22) * 8 + 8);
          }
          local_68->top = uVar2;
          lVar9 = bn_wexpand(local_78,uVar2);
          if (lVar9 != 0) {
            puVar20 = local_78->d;
            *puVar20 = 1;
            if (1 < (int)uVar2) {
              memset(puVar20 + 1,0,(ulong)(uVar2 - 1) << 3);
            }
            local_78->top = uVar2;
            lVar9 = bn_wexpand(local_80,uVar2);
            if (lVar9 != 0) {
              __s = local_80->d;
              if (0 < (int)uVar2) {
                memset(__s,0,uVar21 << 3);
              }
              uVar11 = uVar21 & 0xfffffffc;
              local_80->top = uVar2;
              puVar10 = local_70->d;
              local_90 = puVar10;
LAB_00a2cd20:
              uVar12 = *puVar19;
              if (iVar5 == 0) {
                iVar5 = 0;
              }
              else {
                do {
                  if ((uVar12 & 1) != 0) {
                    if (0x40 < iVar5) goto LAB_00a2cde8;
                    break;
                  }
                  puVar18 = param_3->d;
                  uVar17 = -(*puVar20 & 1);
                  uVar16 = *puVar18 & uVar17 ^ *puVar20;
                  if ((int)uVar2 < 2) {
                    uVar17 = 0;
                  }
                  else {
                    uVar24 = uVar12;
                    uVar25 = uVar16;
                    uVar23 = (ulong)(uVar2 - 1);
                    puVar13 = puVar19;
                    puVar14 = puVar20;
                    do {
                      puVar18 = puVar18 + 1;
                      uVar12 = puVar13[1];
                      uVar23 = uVar23 - 1;
                      *puVar13 = uVar24 >> 1 | uVar12 << 0x3f;
                      uVar16 = *puVar18 & uVar17 ^ puVar14[1];
                      *puVar14 = uVar25 >> 1 | uVar16 << 0x3f;
                      uVar24 = uVar12;
                      uVar25 = uVar16;
                      puVar13 = puVar13 + 1;
                      puVar14 = puVar14 + 1;
                    } while (uVar23 != 0);
                    uVar17 = (ulong)(uVar2 - 2) + 1;
                  }
                  puVar19[uVar17 & 0xffffffff] = uVar12 >> 1;
                  puVar20[uVar17 & 0xffffffff] = uVar16 >> 1;
                  uVar12 = *puVar19;
                  iVar5 = iVar5 + -1;
                } while (iVar5 != 0);
              }
              if (uVar12 == 0) goto LAB_00a2cba8;
              if (uVar12 != 1) {
LAB_00a2cde8:
                puVar18 = __s;
                puVar13 = puVar10;
                iVar22 = iVar6;
                pBVar8 = local_80;
                pBVar3 = local_70;
                if (iVar5 < iVar6) {
                  local_90 = local_68->d;
                  puVar18 = local_78->d;
                  puVar13 = local_90;
                  puVar19 = puVar10;
                  puVar20 = __s;
                  iVar22 = iVar5;
                  pBVar8 = local_78;
                  local_78 = local_80;
                  pBVar3 = local_68;
                  local_68 = local_70;
                  iVar5 = iVar6;
                }
                local_70 = pBVar3;
                local_80 = pBVar8;
                iVar6 = iVar22;
                puVar10 = puVar13;
                __s = puVar18;
                if (0 < (int)uVar2) {
                  uVar12 = 0;
                  if (3 < uVar21) {
                    puVar18 = puVar20 + uVar21;
                    puVar13 = puVar19 + uVar21;
                    if (((puVar19 < puVar18 && puVar20 < puVar13) ||
                        (puVar19 < puVar10 + uVar21 && local_90 < puVar13)) ||
                       ((puVar19 < __s + uVar21 && __s < puVar13 ||
                        (puVar20 < puVar10 + uVar21 && local_90 < puVar18)))) {
                      uVar12 = 0;
                    }
                    else {
                      uVar12 = 0;
                      if (__s + uVar21 <= puVar20 || puVar18 <= __s) {
                        puVar18 = puVar10 + 2;
                        puVar13 = puVar19 + 2;
                        puVar14 = __s + 2;
                        puVar15 = puVar20 + 2;
                        uVar12 = uVar11;
                        do {
                          uVar17 = puVar18[-1];
                          uVar16 = puVar18[-2];
                          uVar24 = puVar18[1];
                          uVar23 = *puVar18;
                          uVar26 = puVar13[-1];
                          uVar25 = puVar13[-2];
                          uVar28 = puVar13[1];
                          uVar27 = *puVar13;
                          puVar18 = puVar18 + 4;
                          uVar12 = uVar12 - 4;
                          puVar13[-1] = CONCAT17((byte)(uVar26 >> 0x38) ^ (byte)(uVar17 >> 0x38),
                                                 CONCAT16((byte)(uVar26 >> 0x30) ^
                                                          (byte)(uVar17 >> 0x30),
                                                          CONCAT15((byte)(uVar26 >> 0x28) ^
                                                                   (byte)(uVar17 >> 0x28),
                                                                   CONCAT14((byte)(uVar26 >> 0x20) ^
                                                                            (byte)(uVar17 >> 0x20),
                                                                            CONCAT13((byte)(uVar26 
                                                  >> 0x18) ^ (byte)(uVar17 >> 0x18),
                                                  CONCAT12((byte)(uVar26 >> 0x10) ^
                                                           (byte)(uVar17 >> 0x10),
                                                           CONCAT11((byte)(uVar26 >> 8) ^
                                                                    (byte)(uVar17 >> 8),
                                                                    (byte)uVar26 ^ (byte)uVar17)))))
                                                  ));
                          puVar13[-2] = CONCAT17((byte)(uVar25 >> 0x38) ^ (byte)(uVar16 >> 0x38),
                                                 CONCAT16((byte)(uVar25 >> 0x30) ^
                                                          (byte)(uVar16 >> 0x30),
                                                          CONCAT15((byte)(uVar25 >> 0x28) ^
                                                                   (byte)(uVar16 >> 0x28),
                                                                   CONCAT14((byte)(uVar25 >> 0x20) ^
                                                                            (byte)(uVar16 >> 0x20),
                                                                            CONCAT13((byte)(uVar25 
                                                  >> 0x18) ^ (byte)(uVar16 >> 0x18),
                                                  CONCAT12((byte)(uVar25 >> 0x10) ^
                                                           (byte)(uVar16 >> 0x10),
                                                           CONCAT11((byte)(uVar25 >> 8) ^
                                                                    (byte)(uVar16 >> 8),
                                                                    (byte)uVar25 ^ (byte)uVar16)))))
                                                  ));
                          puVar13[1] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                                CONCAT16((byte)(uVar28 >> 0x30) ^
                                                         (byte)(uVar24 >> 0x30),
                                                         CONCAT15((byte)(uVar28 >> 0x28) ^
                                                                  (byte)(uVar24 >> 0x28),
                                                                  CONCAT14((byte)(uVar28 >> 0x20) ^
                                                                           (byte)(uVar24 >> 0x20),
                                                                           CONCAT13((byte)(uVar28 >>
                                                                                          0x18) ^
                                                                                    (byte)(uVar24 >>
                                                                                          0x18),
                                                                                    CONCAT12((byte)(
                                                  uVar28 >> 0x10) ^ (byte)(uVar24 >> 0x10),
                                                  CONCAT11((byte)(uVar28 >> 8) ^ (byte)(uVar24 >> 8)
                                                           ,(byte)uVar28 ^ (byte)uVar24)))))));
                          *puVar13 = CONCAT17((byte)(uVar27 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                                              CONCAT16((byte)(uVar27 >> 0x30) ^
                                                       (byte)(uVar23 >> 0x30),
                                                       CONCAT15((byte)(uVar27 >> 0x28) ^
                                                                (byte)(uVar23 >> 0x28),
                                                                CONCAT14((byte)(uVar27 >> 0x20) ^
                                                                         (byte)(uVar23 >> 0x20),
                                                                         CONCAT13((byte)(uVar27 >>
                                                                                        0x18) ^
                                                                                  (byte)(uVar23 >>
                                                                                        0x18),
                                                                                  CONCAT12((byte)(
                                                  uVar27 >> 0x10) ^ (byte)(uVar23 >> 0x10),
                                                  CONCAT11((byte)(uVar27 >> 8) ^ (byte)(uVar23 >> 8)
                                                           ,(byte)uVar27 ^ (byte)uVar23)))))));
                          uVar17 = puVar14[-1];
                          uVar16 = puVar14[-2];
                          uVar24 = puVar14[1];
                          uVar23 = *puVar14;
                          uVar26 = puVar15[-1];
                          uVar25 = puVar15[-2];
                          uVar28 = puVar15[1];
                          uVar27 = *puVar15;
                          puVar13 = puVar13 + 4;
                          puVar14 = puVar14 + 4;
                          puVar15[-1] = CONCAT17((byte)(uVar26 >> 0x38) ^ (byte)(uVar17 >> 0x38),
                                                 CONCAT16((byte)(uVar26 >> 0x30) ^
                                                          (byte)(uVar17 >> 0x30),
                                                          CONCAT15((byte)(uVar26 >> 0x28) ^
                                                                   (byte)(uVar17 >> 0x28),
                                                                   CONCAT14((byte)(uVar26 >> 0x20) ^
                                                                            (byte)(uVar17 >> 0x20),
                                                                            CONCAT13((byte)(uVar26 
                                                  >> 0x18) ^ (byte)(uVar17 >> 0x18),
                                                  CONCAT12((byte)(uVar26 >> 0x10) ^
                                                           (byte)(uVar17 >> 0x10),
                                                           CONCAT11((byte)(uVar26 >> 8) ^
                                                                    (byte)(uVar17 >> 8),
                                                                    (byte)uVar26 ^ (byte)uVar17)))))
                                                  ));
                          puVar15[-2] = CONCAT17((byte)(uVar25 >> 0x38) ^ (byte)(uVar16 >> 0x38),
                                                 CONCAT16((byte)(uVar25 >> 0x30) ^
                                                          (byte)(uVar16 >> 0x30),
                                                          CONCAT15((byte)(uVar25 >> 0x28) ^
                                                                   (byte)(uVar16 >> 0x28),
                                                                   CONCAT14((byte)(uVar25 >> 0x20) ^
                                                                            (byte)(uVar16 >> 0x20),
                                                                            CONCAT13((byte)(uVar25 
                                                  >> 0x18) ^ (byte)(uVar16 >> 0x18),
                                                  CONCAT12((byte)(uVar25 >> 0x10) ^
                                                           (byte)(uVar16 >> 0x10),
                                                           CONCAT11((byte)(uVar25 >> 8) ^
                                                                    (byte)(uVar16 >> 8),
                                                                    (byte)uVar25 ^ (byte)uVar16)))))
                                                  ));
                          puVar15[1] = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar24 >> 0x38),
                                                CONCAT16((byte)(uVar28 >> 0x30) ^
                                                         (byte)(uVar24 >> 0x30),
                                                         CONCAT15((byte)(uVar28 >> 0x28) ^
                                                                  (byte)(uVar24 >> 0x28),
                                                                  CONCAT14((byte)(uVar28 >> 0x20) ^
                                                                           (byte)(uVar24 >> 0x20),
                                                                           CONCAT13((byte)(uVar28 >>
                                                                                          0x18) ^
                                                                                    (byte)(uVar24 >>
                                                                                          0x18),
                                                                                    CONCAT12((byte)(
                                                  uVar28 >> 0x10) ^ (byte)(uVar24 >> 0x10),
                                                  CONCAT11((byte)(uVar28 >> 8) ^ (byte)(uVar24 >> 8)
                                                           ,(byte)uVar28 ^ (byte)uVar24)))))));
                          *puVar15 = CONCAT17((byte)(uVar27 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                                              CONCAT16((byte)(uVar27 >> 0x30) ^
                                                       (byte)(uVar23 >> 0x30),
                                                       CONCAT15((byte)(uVar27 >> 0x28) ^
                                                                (byte)(uVar23 >> 0x28),
                                                                CONCAT14((byte)(uVar27 >> 0x20) ^
                                                                         (byte)(uVar23 >> 0x20),
                                                                         CONCAT13((byte)(uVar27 >>
                                                                                        0x18) ^
                                                                                  (byte)(uVar23 >>
                                                                                        0x18),
                                                                                  CONCAT12((byte)(
                                                  uVar27 >> 0x10) ^ (byte)(uVar23 >> 0x10),
                                                  CONCAT11((byte)(uVar27 >> 8) ^ (byte)(uVar23 >> 8)
                                                           ,(byte)uVar27 ^ (byte)uVar23)))))));
                          puVar15 = puVar15 + 4;
                        } while (uVar12 != 0);
                        uVar12 = uVar11;
                        if (uVar21 == uVar11) goto LAB_00a2cf9c;
                      }
                    }
                  }
                  lVar9 = uVar21 - uVar12;
                  puVar18 = puVar20 + uVar12;
                  puVar13 = __s + uVar12;
                  puVar14 = puVar19 + uVar12;
                  puVar15 = puVar10 + uVar12;
                  do {
                    lVar9 = lVar9 + -1;
                    *puVar14 = *puVar14 ^ *puVar15;
                    *puVar18 = *puVar18 ^ *puVar13;
                    puVar18 = puVar18 + 1;
                    puVar13 = puVar13 + 1;
                    puVar14 = puVar14 + 1;
                    puVar15 = puVar15 + 1;
                  } while (lVar9 != 0);
                }
LAB_00a2cf9c:
                if (iVar5 == iVar6) {
                  uVar1 = iVar5 + 0x3e;
                  if (-1 < (int)(iVar5 - 1U)) {
                    uVar1 = iVar5 - 1U;
                  }
                  iVar5 = (int)uVar1 >> 6;
                  iVar22 = -0x40 - (uVar1 & 0xffffffc0);
                  puVar18 = puVar19 + iVar5;
                  do {
                    uVar12 = *puVar18;
                    iVar22 = iVar22 + 0x40;
                    if (iVar5 == 0) break;
                    iVar5 = iVar5 + -1;
                    puVar18 = puVar18 + -1;
                  } while (uVar12 == 0);
                  iVar5 = BN_num_bits_word(uVar12);
                  iVar5 = iVar5 - iVar22;
                }
                goto LAB_00a2cd20;
              }
              bn_correct_top(local_78);
              pBVar8 = BN_copy(param_1,local_78);
              BN_CTX_end(param_4);
              if (pBVar8 != (BIGNUM *)0x0) {
                iVar5 = BN_GF2m_mod_mul(param_1,param_1,pBVar7,param_3,param_4);
                bVar4 = iVar5 != 0;
                goto LAB_00a2cbb4;
              }
              goto LAB_00a2cbb0;
            }
          }
        }
      }
LAB_00a2cba8:
      BN_CTX_end(param_4);
    }
  }
LAB_00a2cbb0:
  bVar4 = false;
LAB_00a2cbb4:
  BN_CTX_end(param_4);
  return bVar4;
}

