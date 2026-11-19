/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a338a8
 */

undefined8
ossl_ec_wNAF_mul(EC_GROUP *param_1,EC_POINT *param_2,BIGNUM *param_3,ulong param_4,
                undefined8 *param_5,undefined8 *param_6,BN_CTX *param_7)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  void *pvVar6;
  void *ptr;
  BIGNUM *pBVar7;
  long lVar8;
  void *ptr_00;
  size_t sVar9;
  void *__dest;
  undefined8 *puVar10;
  EC_POINT *pEVar11;
  EC_POINT *pEVar12;
  bool bVar13;
  uint uVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  long *plVar18;
  ulong uVar19;
  size_t *psVar20;
  ulong uVar21;
  undefined8 *puVar22;
  long lVar23;
  void *__src;
  ulong uVar24;
  undefined8 uVar25;
  long lVar26;
  size_t *psVar27;
  long local_d0;
  EC_POINT *local_c8;
  ulong local_b8;
  ulong local_b0;
  long local_a8;
  long local_98;
  void *local_78;
  undefined8 *local_70;
  ulong local_68;
  
  iVar3 = BN_is_zero(*(undefined8 *)(param_1 + 0x10));
  if ((iVar3 == 0) && (iVar3 = BN_is_zero(*(undefined8 *)(param_1 + 0x18)), iVar3 == 0)) {
    if ((param_4 == 0) && ((param_3 != (BIGNUM *)0x0 && (*(BIGNUM **)(param_1 + 0x10) != param_3))))
    {
      uVar25 = 0;
      pBVar7 = param_3;
LAB_00a339f0:
      uVar25 = ossl_ec_scalar_mul_ladder(param_1,param_2,pBVar7,uVar25,param_7);
      return uVar25;
    }
    if ((param_3 != (BIGNUM *)0x0) || (param_4 != 1)) goto LAB_00a338fc;
    pBVar7 = (BIGNUM *)*param_6;
    if (pBVar7 != *(BIGNUM **)(param_1 + 0x10)) {
      uVar25 = *param_5;
      goto LAB_00a339f0;
    }
LAB_00a33a14:
    local_c8 = (EC_POINT *)0x0;
    local_98 = 0;
    local_b0 = 0;
    local_a8 = 0;
    uVar16 = 0;
    local_d0 = 0;
LAB_00a33a28:
    local_b8 = uVar16 + param_4;
    iVar3 = (int)local_b8 * 8;
    local_78 = CRYPTO_malloc(iVar3,"crypto/ec/ec_mult.c",0x201);
    pvVar6 = CRYPTO_malloc(iVar3,"crypto/ec/ec_mult.c",0x202);
    local_70 = CRYPTO_malloc(iVar3 + 8,"crypto/ec/ec_mult.c",0x204);
    ptr = CRYPTO_malloc(iVar3,"crypto/ec/ec_mult.c",0x205);
    if (((local_70 == (undefined8 *)0x0) || (*local_70 = 0, local_78 == (void *)0x0)) ||
       ((pvVar6 == (void *)0x0 || (ptr == (void *)0x0)))) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_mult.c",0x20c,"ossl_ec_wNAF_mul");
      ERR_set_error(0x10,0xc0100,0);
LAB_00a33bf0:
      puVar10 = (undefined8 *)0x0;
    }
    else {
      uVar21 = local_98 + param_4;
      if (uVar21 == 0) {
        uVar15 = 0;
        lVar23 = 0;
        if (uVar16 != 0) goto LAB_00a33ce8;
      }
      else {
        lVar26 = 0;
        lVar23 = 0;
        uVar19 = 0;
        uVar24 = 0;
        do {
          pBVar7 = param_3;
          if (uVar19 < param_4) {
            pBVar7 = (BIGNUM *)param_6[uVar19];
          }
          uVar4 = BN_num_bits(pBVar7);
          if (uVar4 < 2000) {
            if (uVar4 < 800) {
              if (uVar4 < 300) {
                if (uVar4 < 0x46) {
                  lVar17 = 1;
                  if (0x13 < uVar4) {
                    lVar17 = 2;
                  }
                }
                else {
                  lVar17 = 3;
                }
              }
              else {
                lVar17 = 4;
              }
            }
            else {
              lVar17 = 5;
            }
          }
          else {
            lVar17 = 6;
          }
          *(long *)((long)local_78 + uVar19 * 8) = lVar17;
          local_70[uVar19 + 1] = 0;
          pBVar7 = param_3;
          if (uVar19 < param_4) {
            pBVar7 = (BIGNUM *)param_6[uVar19];
          }
          lVar8 = bn_compute_wNAF(pBVar7,lVar17,(long)pvVar6 + lVar26);
          *(long *)((long)local_70 + lVar26) = lVar8;
          if (lVar8 == 0) goto LAB_00a33bf0;
          uVar15 = *(ulong *)((long)pvVar6 + uVar19 * 8);
          lVar23 = (1L << (lVar17 - 1U & 0x3f)) + lVar23;
          uVar19 = uVar19 + 1;
          if (uVar15 <= uVar24) {
            uVar15 = uVar24;
          }
          lVar26 = lVar26 + 8;
          uVar24 = uVar15;
        } while (uVar19 < uVar21);
        if (uVar16 != 0) {
LAB_00a33ce8:
          if (local_a8 == 0) {
            if ((int)local_98 != 0) goto LAB_00a33ff0;
            ERR_new();
            uVar25 = 0x22a;
LAB_00a33d9c:
            ERR_set_debug("crypto/ec/ec_mult.c",uVar25,"ossl_ec_wNAF_mul");
            ERR_set_error(0x10,0xc0103,0);
          }
          else {
            local_68 = 0;
            if ((int)local_98 != 0) {
              ERR_new();
              uVar25 = 0x233;
              goto LAB_00a33d9c;
            }
            uVar25 = *(undefined8 *)(local_a8 + 0x18);
            *(undefined8 *)((long)local_78 + param_4 * 8) = uVar25;
            ptr_00 = (void *)bn_compute_wNAF(param_3,uVar25,&local_68);
            if (ptr_00 != (void *)0x0) {
              if (local_68 <= uVar15) {
                local_b8 = param_4 + 1;
                local_70[param_4] = ptr_00;
                local_70[local_b8] = 0;
                *(ulong *)((long)pvVar6 + param_4 * 8) = local_68;
                *(undefined8 *)((long)ptr + param_4 * 8) = *(undefined8 *)(local_a8 + 0x20);
                goto LAB_00a33ff0;
              }
              if (local_68 < uVar16 * local_b0) {
                local_b8 = 0;
                if (local_b0 != 0) {
                  local_b8 = ((local_b0 + local_68) - 1) / local_b0;
                }
                if (*(ulong *)(local_a8 + 0x10) < local_b8) {
                  ERR_new();
                  ERR_set_debug("crypto/ec/ec_mult.c",0x25e,"ossl_ec_wNAF_mul");
                  ERR_set_error(0x10,0xc0103,0);
                  CRYPTO_free(ptr_00);
                  goto LAB_00a33db4;
                }
                local_b8 = local_b8 + param_4;
              }
              if (param_4 < local_b8) {
                plVar18 = *(long **)(local_a8 + 0x20);
                psVar27 = (size_t *)((long)pvVar6 + param_4 * 8);
                uVar16 = param_4;
                __src = ptr_00;
                uVar19 = uVar15;
                puVar10 = local_70 + param_4;
                do {
                  if (uVar16 < local_b8 - 1) {
                    *psVar27 = local_b0;
                    if (local_b0 <= local_68) {
                      sVar9 = *psVar27;
                      psVar20 = psVar27;
                      local_68 = local_68 - local_b0;
                      goto LAB_00a33f6c;
                    }
                    ERR_new();
                    ERR_set_debug("crypto/ec/ec_mult.c",0x26d,"ossl_ec_wNAF_mul");
                    ERR_set_error(0x10,0xc0103,0);
LAB_00a34414:
                    CRYPTO_free(ptr_00);
                    goto LAB_00a33db4;
                  }
                  psVar20 = (size_t *)((long)pvVar6 + uVar16 * 8);
                  *psVar27 = local_68;
                  sVar9 = local_68;
LAB_00a33f6c:
                  puVar10[1] = 0;
                  __dest = CRYPTO_malloc((int)sVar9,"crypto/ec/ec_mult.c",0x27a);
                  *puVar10 = __dest;
                  if (__dest == (void *)0x0) {
                    ERR_new();
                    ERR_set_debug("crypto/ec/ec_mult.c",0x27c,"ossl_ec_wNAF_mul");
                    ERR_set_error(0x10,0xc0100,0);
                    goto LAB_00a34414;
                  }
                  memcpy(__dest,__src,*psVar20);
                  if (*plVar18 == 0) {
                    ERR_new();
                    ERR_set_debug("crypto/ec/ec_mult.c",0x285,"ossl_ec_wNAF_mul");
                    ERR_set_error(0x10,0xc0103,0);
                    goto LAB_00a34414;
                  }
                  uVar15 = *psVar20;
                  psVar27 = psVar27 + 1;
                  *(long **)((long)ptr + uVar16 * 8) = plVar18;
                  if (uVar15 <= uVar19) {
                    uVar15 = uVar19;
                  }
                  __src = (void *)((long)__src + local_b0);
                  uVar16 = uVar16 + 1;
                  plVar18 = plVar18 + local_d0;
                  uVar19 = uVar15;
                  puVar10 = puVar10 + 1;
                } while (uVar16 < local_b8);
              }
              CRYPTO_free(ptr_00);
              goto LAB_00a33ff0;
            }
          }
LAB_00a33db4:
          puVar10 = (undefined8 *)0x0;
          goto LAB_00a33bfc;
        }
      }
LAB_00a33ff0:
      puVar10 = CRYPTO_malloc((int)lVar23 * 8 + 8,"crypto/ec/ec_mult.c",0x297);
      if (puVar10 != (undefined8 *)0x0) {
        puVar10[lVar23] = 0;
        puVar22 = puVar10;
        if (uVar21 != 0) {
          uVar16 = 0;
          do {
            uVar19 = 0;
            *(undefined8 **)((long)ptr + uVar16 * 8) = puVar22;
            do {
              pEVar11 = EC_POINT_new(param_1);
              *puVar22 = pEVar11;
              if (pEVar11 == (EC_POINT *)0x0) goto LAB_00a340fc;
              uVar19 = uVar19 + 1;
              puVar22 = puVar22 + 1;
            } while (uVar19 < (ulong)(1L << (*(long *)((long)local_78 + uVar16 * 8) - 1U & 0x3f)));
            uVar16 = uVar16 + 1;
          } while (uVar16 < uVar21);
        }
        if (puVar22 == puVar10 + lVar23) {
          pEVar11 = EC_POINT_new(param_1);
          if (pEVar11 != (EC_POINT *)0x0) {
            if (uVar21 != 0) {
              uVar16 = 0;
              do {
                pEVar12 = (EC_POINT *)**(undefined8 **)((long)ptr + uVar16 * 8);
                if (uVar16 < param_4) {
                  iVar3 = EC_POINT_copy(pEVar12,(EC_POINT *)param_5[uVar16]);
                }
                else {
                  iVar3 = EC_POINT_copy(pEVar12,local_c8);
                }
                if (iVar3 == 0) goto LAB_00a34108;
                if (1 < *(ulong *)((long)local_78 + uVar16 * 8)) {
                  iVar3 = EC_POINT_dbl(param_1,pEVar11,
                                       (EC_POINT *)**(undefined8 **)((long)ptr + uVar16 * 8),param_7
                                      );
                  if (iVar3 == 0) goto LAB_00a34108;
                  if (*(long *)((long)local_78 + uVar16 * 8) != 1) {
                    lVar26 = 0;
                    do {
                      puVar22 = (undefined8 *)(*(long *)((long)ptr + uVar16 * 8) + lVar26 * 8);
                      iVar3 = EC_POINT_add(param_1,(EC_POINT *)puVar22[1],(EC_POINT *)*puVar22,
                                           pEVar11,param_7);
                      if (iVar3 == 0) goto LAB_00a34108;
                      uVar19 = lVar26 + 2;
                      lVar26 = lVar26 + 1;
                    } while (uVar19 < (ulong)(1L << (*(long *)((long)local_78 + uVar16 * 8) - 1U &
                                                    0x3f)));
                  }
                }
                uVar16 = uVar16 + 1;
              } while (uVar16 < uVar21);
            }
            if ((*(code **)(*(long *)param_1 + 0xd8) != (code *)0x0) &&
               (iVar3 = (**(code **)(*(long *)param_1 + 0xd8))(param_1,lVar23,puVar10,param_7),
               iVar3 != 0)) {
              iVar3 = (int)uVar15 + -1;
              if (iVar3 < 0) {
LAB_00a34344:
                iVar3 = EC_POINT_set_to_infinity(param_1,param_2);
joined_r0x00a34354:
                if (iVar3 == 0) {
LAB_00a34460:
                  uVar25 = 0;
                  goto LAB_00a33c00;
                }
              }
              else {
                uVar4 = 0;
                uVar16 = (ulong)iVar3;
                bVar13 = true;
                do {
                  if ((!bVar13) &&
                     (iVar5 = EC_POINT_dbl(param_1,param_2,param_2,param_7), iVar5 == 0))
                  goto LAB_00a34460;
                  if (local_b8 != 0) {
                    uVar21 = 0;
                    do {
                      if ((uVar16 < *(ulong *)((long)pvVar6 + uVar21 * 8)) &&
                         (cVar2 = *(char *)(local_70[uVar21] + uVar16), cVar2 != '\0')) {
                        uVar14 = (uint)cVar2;
                        uVar1 = -uVar14;
                        if (-1 < cVar2) {
                          uVar1 = uVar14;
                        }
                        if (uVar4 != (uVar14 & 0x80) >> 7) {
                          if ((!bVar13) &&
                             (iVar5 = EC_POINT_invert(param_1,param_2,param_7), iVar5 == 0))
                          goto LAB_00a34108;
                          uVar4 = (uint)(uVar4 == 0);
                        }
                        pEVar12 = *(EC_POINT **)
                                   (*(long *)((long)ptr + uVar21 * 8) + (long)((int)uVar1 >> 1) * 8)
                        ;
                        if (bVar13) {
                          iVar5 = EC_POINT_copy(param_2,pEVar12);
                          if (iVar5 == 0) goto LAB_00a34108;
                          iVar5 = ossl_ec_point_blind_coordinates(param_1,param_2,param_7);
                          bVar13 = false;
                          if (iVar5 == 0) {
                            ERR_new();
                            ERR_set_debug("crypto/ec/ec_mult.c",0x2fa,"ossl_ec_wNAF_mul");
                            ERR_set_error(0x10,0xa3,0);
                            goto LAB_00a34460;
                          }
                        }
                        else {
                          iVar5 = EC_POINT_add(param_1,param_2,param_2,pEVar12,param_7);
                          if (iVar5 == 0) goto LAB_00a34108;
                          bVar13 = false;
                        }
                      }
                      uVar21 = uVar21 + 1;
                    } while (uVar21 < local_b8);
                  }
                  iVar3 = iVar3 + -1;
                  uVar16 = uVar16 - 1;
                } while (-1 < iVar3);
                if (bVar13) goto LAB_00a34344;
                if (uVar4 != 0) {
                  iVar3 = EC_POINT_invert(param_1,param_2,param_7);
                  goto joined_r0x00a34354;
                }
              }
              uVar25 = 1;
              goto LAB_00a33c00;
            }
          }
        }
        else {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_mult.c",0x2aa,"ossl_ec_wNAF_mul");
          ERR_set_error(0x10,0xc0103,0);
LAB_00a340fc:
          pEVar11 = (EC_POINT *)0x0;
        }
LAB_00a34108:
        uVar25 = 0;
        goto LAB_00a33c00;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_mult.c",0x299,"ossl_ec_wNAF_mul");
      ERR_set_error(0x10,0xc0100,0);
    }
  }
  else {
LAB_00a338fc:
    if (param_3 == (BIGNUM *)0x0) goto LAB_00a33a14;
    local_c8 = EC_GROUP_get0_generator(param_1);
    if (local_c8 != (EC_POINT *)0x0) {
      local_a8 = *(long *)(param_1 + 0xa0);
      if (((local_a8 == 0) || (*(long *)(local_a8 + 0x10) == 0)) ||
         (iVar3 = EC_POINT_cmp(param_1,local_c8,(EC_POINT *)**(undefined8 **)(local_a8 + 0x20),
                               param_7), iVar3 != 0)) {
        local_b0 = 0;
        local_a8 = 0;
        local_d0 = 0;
        uVar16 = 1;
        local_98 = 1;
      }
      else {
        local_b0 = *(ulong *)(local_a8 + 8);
        iVar3 = BN_num_bits(param_3);
        uVar21 = *(ulong *)(local_a8 + 0x10);
        uVar15 = 0;
        if (local_b0 != 0) {
          uVar15 = (ulong)(long)iVar3 / local_b0;
        }
        uVar19 = *(long *)(local_a8 + 0x18) - 1;
        uVar16 = uVar21;
        if (uVar15 + 1 <= uVar21) {
          uVar16 = uVar15 + 1;
        }
        if (*(long *)(local_a8 + 0x28) != uVar21 << (uVar19 & 0x3f)) {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_mult.c",499,"ossl_ec_wNAF_mul");
          ERR_set_error(0x10,0xc0103,0);
          goto LAB_00a33990;
        }
        local_d0 = 1L << (uVar19 & 0x3f);
        local_98 = 0;
      }
      goto LAB_00a33a28;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_mult.c",0x1d7,"ossl_ec_wNAF_mul");
    ERR_set_error(0x10,0x71,0);
LAB_00a33990:
    local_70 = (undefined8 *)0x0;
    local_78 = (void *)0x0;
    pvVar6 = (void *)0x0;
    puVar10 = (undefined8 *)0x0;
    ptr = (void *)0x0;
  }
LAB_00a33bfc:
  pEVar11 = (EC_POINT *)0x0;
  uVar25 = 0;
LAB_00a33c00:
  EC_POINT_free(pEVar11);
  CRYPTO_free(local_78);
  CRYPTO_free(pvVar6);
  if (local_70 != (undefined8 *)0x0) {
    pvVar6 = (void *)*local_70;
    puVar22 = local_70;
    while (pvVar6 != (void *)0x0) {
      puVar22 = puVar22 + 1;
      CRYPTO_free(pvVar6);
      pvVar6 = (void *)*puVar22;
    }
    CRYPTO_free(local_70);
  }
  if (puVar10 != (undefined8 *)0x0) {
    pEVar11 = (EC_POINT *)*puVar10;
    puVar22 = puVar10;
    while (pEVar11 != (EC_POINT *)0x0) {
      puVar22 = puVar22 + 1;
      EC_POINT_clear_free(pEVar11);
      pEVar11 = (EC_POINT *)*puVar22;
    }
    CRYPTO_free(puVar10);
  }
  CRYPTO_free(ptr);
  return uVar25;
}

