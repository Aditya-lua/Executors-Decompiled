/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a330e0
 */

int ossl_ec_scalar_mul_ladder
              (EC_GROUP *param_1,EC_POINT *param_2,BIGNUM *param_3,EC_POINT *param_4,BN_CTX *param_5
              )

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  uint uVar4;
  EC_POINT *dst;
  EC_POINT *dst_00;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *a;
  long lVar5;
  BIGNUM *pBVar6;
  undefined8 uVar7;
  uint uVar8;
  int local_64;
  
  if ((param_4 != (EC_POINT *)0x0) && (iVar1 = EC_POINT_is_at_infinity(param_1,param_4), iVar1 != 0)
     ) {
    iVar1 = EC_POINT_set_to_infinity(param_1,param_2);
    return iVar1;
  }
  iVar1 = BN_is_zero(*(undefined8 *)(param_1 + 0x10));
  if (iVar1 != 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_mult.c",0xa2,"ossl_ec_scalar_mul_ladder");
    uVar7 = 0x72;
LAB_00a331b4:
    ERR_set_error(0x10,uVar7,0);
    return 0;
  }
  iVar1 = BN_is_zero(*(undefined8 *)(param_1 + 0x18));
  if (iVar1 != 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_mult.c",0xa6,"ossl_ec_scalar_mul_ladder");
    uVar7 = 0xa4;
    goto LAB_00a331b4;
  }
  BN_CTX_start(param_5);
  dst = EC_POINT_new(param_1);
  if ((dst == (EC_POINT *)0x0) || (dst_00 = EC_POINT_new(param_1), dst_00 == (EC_POINT *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_mult.c",0xae,"ossl_ec_scalar_mul_ladder");
    ERR_set_error(0x10,0xc0100,0);
    dst_00 = (EC_POINT *)0x0;
    goto LAB_00a33588;
  }
  if (param_4 == (EC_POINT *)0x0) {
    iVar1 = EC_POINT_copy(dst,*(EC_POINT **)(param_1 + 8));
    if (iVar1 != 0) goto LAB_00a33284;
    ERR_new();
    uVar7 = 0xb4;
LAB_00a3356c:
    ERR_set_debug("crypto/ec/ec_mult.c",uVar7,"ossl_ec_scalar_mul_ladder");
    uVar7 = 0x80010;
  }
  else {
    iVar1 = EC_POINT_copy(dst,param_4);
    if (iVar1 == 0) {
      ERR_new();
      uVar7 = 0xb9;
      goto LAB_00a3356c;
    }
LAB_00a33284:
    BN_set_flags(*(undefined8 *)(dst + 0x10),4);
    BN_set_flags(*(undefined8 *)(dst + 0x18),4);
    BN_set_flags(*(undefined8 *)(dst + 0x20),4);
    BN_set_flags(*(undefined8 *)(param_2 + 0x10),4);
    BN_set_flags(*(undefined8 *)(param_2 + 0x18),4);
    BN_set_flags(*(undefined8 *)(param_2 + 0x20),4);
    BN_set_flags(*(undefined8 *)(dst_00 + 0x10),4);
    BN_set_flags(*(undefined8 *)(dst_00 + 0x18),4);
    BN_set_flags(*(undefined8 *)(dst_00 + 0x20),4);
    r = BN_CTX_get(param_5);
    r_00 = BN_CTX_get(param_5);
    a = BN_CTX_get(param_5);
    if (a == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_mult.c",0xc6,"ossl_ec_scalar_mul_ladder");
      uVar7 = 0xc0100;
    }
    else {
      iVar1 = BN_mul(r,*(BIGNUM **)(param_1 + 0x10),*(BIGNUM **)(param_1 + 0x18),param_5);
      if (iVar1 == 0) {
        ERR_new();
        uVar7 = 0xcb;
      }
      else {
        local_64 = BN_num_bits(r);
        iVar1 = bn_get_top(r);
        iVar1 = iVar1 + 2;
        lVar5 = bn_wexpand(a,iVar1);
        if ((lVar5 == 0) || (lVar5 = bn_wexpand(r_00,iVar1), lVar5 == 0)) {
          ERR_new();
          uVar7 = 0xd9;
        }
        else {
          pBVar6 = BN_copy(a,param_3);
          if (pBVar6 == (BIGNUM *)0x0) {
            ERR_new();
            uVar7 = 0xde;
          }
          else {
            BN_set_flags(a,4);
            iVar2 = BN_num_bits(a);
            if (((local_64 < iVar2) || (iVar2 = BN_is_negative(a), iVar2 != 0)) &&
               (iVar2 = BN_nnmod(a,a,r,param_5), iVar2 == 0)) {
              ERR_new();
              uVar7 = 0xea;
            }
            else {
              iVar2 = BN_add(r_00,a,r);
              if (iVar2 == 0) {
                ERR_new();
                uVar7 = 0xf0;
              }
              else {
                BN_set_flags(r_00,4);
                iVar2 = BN_add(a,r_00,r);
                if (iVar2 == 0) {
                  ERR_new();
                  uVar7 = 0xf5;
                }
                else {
                  iVar2 = BN_is_bit_set(r_00,local_64);
                  BN_consttime_swap((long)iVar2,a,r_00,iVar1);
                  uVar3 = bn_get_top(*(undefined8 *)(param_1 + 0x40));
                  lVar5 = bn_wexpand(*(undefined8 *)(dst_00 + 0x10),uVar3);
                  if (((((lVar5 != 0) &&
                        (lVar5 = bn_wexpand(*(undefined8 *)(dst_00 + 0x18),uVar3), lVar5 != 0)) &&
                       ((lVar5 = bn_wexpand(*(undefined8 *)(dst_00 + 0x20),uVar3), lVar5 != 0 &&
                        ((lVar5 = bn_wexpand(*(undefined8 *)(param_2 + 0x10),uVar3), lVar5 != 0 &&
                         (lVar5 = bn_wexpand(*(undefined8 *)(param_2 + 0x18),uVar3), lVar5 != 0)))))
                       ) && (lVar5 = bn_wexpand(*(undefined8 *)(param_2 + 0x20),uVar3), lVar5 != 0))
                     && (((lVar5 = bn_wexpand(*(undefined8 *)(dst + 0x10),uVar3), lVar5 != 0 &&
                          (lVar5 = bn_wexpand(*(undefined8 *)(dst + 0x18),uVar3), lVar5 != 0)) &&
                         (lVar5 = bn_wexpand(*(undefined8 *)(dst + 0x20),uVar3), lVar5 != 0)))) {
                    if ((*(int *)(dst + 0x28) == 0) &&
                       ((*(code **)(*(long *)param_1 + 0xd0) == (code *)0x0 ||
                        (iVar1 = (**(code **)(*(long *)param_1 + 0xd0))(param_1,dst,param_5),
                        iVar1 == 0)))) {
                      ERR_new();
                      uVar7 = 0x110;
                      goto LAB_00a3356c;
                    }
                    if (*(code **)(*(long *)param_1 + 0x1a0) == (code *)0x0) {
                      iVar1 = EC_POINT_copy(dst_00,dst);
                      if (iVar1 != 0) {
                        iVar1 = EC_POINT_dbl(param_1,param_2,dst_00,param_5);
                        goto joined_r0x00a3369c;
                      }
                    }
                    else {
                      iVar1 = (**(code **)(*(long *)param_1 + 0x1a0))
                                        (param_1,param_2,dst_00,dst,param_5);
joined_r0x00a3369c:
                      if (iVar1 != 0) {
                        uVar8 = 1;
                        do {
                          while( true ) {
                            iVar1 = local_64 + -1;
                            if (local_64 < 1) {
                              lVar5 = (long)(int)uVar8;
                              BN_consttime_swap(lVar5,*(undefined8 *)(param_2 + 0x10),
                                                *(undefined8 *)(dst_00 + 0x10),uVar3);
                              BN_consttime_swap(lVar5,*(undefined8 *)(param_2 + 0x18),
                                                *(undefined8 *)(dst_00 + 0x18),uVar3);
                              BN_consttime_swap(lVar5,*(undefined8 *)(param_2 + 0x20),
                                                *(undefined8 *)(dst_00 + 0x20),uVar3);
                              uVar8 = (*(uint *)(dst_00 + 0x28) ^ *(uint *)(param_2 + 0x28)) & uVar8
                              ;
                              *(uint *)(param_2 + 0x28) = uVar8 ^ *(uint *)(param_2 + 0x28);
                              *(uint *)(dst_00 + 0x28) = *(uint *)(dst_00 + 0x28) ^ uVar8;
                              if ((*(code **)(*(long *)param_1 + 0x1b0) != (code *)0x0) &&
                                 (iVar1 = (**(code **)(*(long *)param_1 + 0x1b0))
                                                    (param_1,param_2,dst_00,dst,param_5), iVar1 == 0
                                 )) {
                                ERR_new();
                                ERR_set_debug("crypto/ec/ec_mult.c",0x175,
                                              "ossl_ec_scalar_mul_ladder");
                                uVar7 = 0x88;
                                goto LAB_00a33580;
                              }
                              iVar1 = 1;
                              goto LAB_00a3358c;
                            }
                            uVar4 = BN_is_bit_set(a,iVar1);
                            lVar5 = (long)(int)(uVar4 ^ uVar8);
                            BN_consttime_swap(lVar5,*(undefined8 *)(param_2 + 0x10),
                                              *(undefined8 *)(dst_00 + 0x10),uVar3);
                            BN_consttime_swap(lVar5,*(undefined8 *)(param_2 + 0x18),
                                              *(undefined8 *)(dst_00 + 0x18),uVar3);
                            BN_consttime_swap(lVar5,*(undefined8 *)(param_2 + 0x20),
                                              *(undefined8 *)(dst_00 + 0x20),uVar3);
                            uVar8 = (*(uint *)(dst_00 + 0x28) ^ *(uint *)(param_2 + 0x28)) &
                                    (uVar4 ^ uVar8);
                            *(uint *)(param_2 + 0x28) = uVar8 ^ *(uint *)(param_2 + 0x28);
                            *(uint *)(dst_00 + 0x28) = *(uint *)(dst_00 + 0x28) ^ uVar8;
                            uVar8 = uVar4;
                            local_64 = iVar1;
                            if (*(code **)(*(long *)param_1 + 0x1a8) != (code *)0x0) break;
                            iVar1 = EC_POINT_add(param_1,dst_00,param_2,dst_00,param_5);
                            if ((iVar1 == 0) ||
                               (iVar1 = EC_POINT_dbl(param_1,param_2,param_2,param_5), iVar1 == 0))
                            goto LAB_00a3379c;
                          }
                          iVar1 = (**(code **)(*(long *)param_1 + 0x1a8))
                                            (param_1,param_2,dst_00,dst,param_5);
                        } while (iVar1 != 0);
LAB_00a3379c:
                        ERR_new();
                        ERR_set_debug("crypto/ec/ec_mult.c",0x166,"ossl_ec_scalar_mul_ladder");
                        uVar7 = 0xa2;
                        goto LAB_00a33580;
                      }
                    }
                    ERR_new();
                    ERR_set_debug("crypto/ec/ec_mult.c",0x116,"ossl_ec_scalar_mul_ladder");
                    uVar7 = 0x99;
                    goto LAB_00a33580;
                  }
                  ERR_new();
                  uVar7 = 0x109;
                }
              }
            }
          }
        }
      }
      ERR_set_debug("crypto/ec/ec_mult.c",uVar7,"ossl_ec_scalar_mul_ladder");
      uVar7 = 0x80003;
    }
  }
LAB_00a33580:
  ERR_set_error(0x10,uVar7,0);
LAB_00a33588:
  iVar1 = 0;
LAB_00a3358c:
  EC_POINT_free(dst);
  EC_POINT_clear_free(dst_00);
  BN_CTX_end(param_5);
  return iVar1;
}

