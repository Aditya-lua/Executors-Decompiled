/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20f4c
 */

undefined8
FUN_00a20f4c(long param_1,BN_CTX *param_2,undefined8 *param_3,undefined8 *param_4,long param_5,
            int param_6)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIGNUM *a;
  BIGNUM *r;
  long lVar4;
  BN_MONT_CTX *pBVar5;
  BIGNUM *r_00;
  undefined8 uVar6;
  code *pcVar7;
  BN_CTX *ctx;
  BIGNUM *pBVar8;
  BIGNUM *a_00;
  
  if (((*(long *)(param_1 + 8) == 0) || (*(long *)(param_1 + 0x10) == 0)) ||
     (*(long *)(param_1 + 0x18) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_ossl.c",0xdc,"dsa_sign_setup");
    uVar6 = 0x65;
LAB_00a2102c:
    ERR_set_error(10,uVar6,0);
    return 0;
  }
  pBVar8 = (BIGNUM *)*param_4;
  iVar1 = BN_is_zero();
  if ((((iVar1 != 0) || (iVar1 = BN_is_zero(*(undefined8 *)(param_1 + 0x10)), iVar1 != 0)) ||
      ((iVar1 = BN_is_zero(*(undefined8 *)(param_1 + 0x18)), iVar1 != 0 ||
       ((iVar1 = BN_is_negative(*(undefined8 *)(param_1 + 8)), iVar1 != 0 ||
        (iVar1 = BN_is_negative(*(undefined8 *)(param_1 + 0x10)), iVar1 != 0)))))) ||
     (iVar1 = BN_is_negative(*(undefined8 *)(param_1 + 0x18)), iVar1 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_ossl.c",0xe7,"dsa_sign_setup");
    uVar6 = 0x70;
    goto LAB_00a2102c;
  }
  if (*(long *)(param_1 + 0x70) == 0) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_ossl.c",0xeb,"dsa_sign_setup");
    uVar6 = 0x6f;
    goto LAB_00a2102c;
  }
  a = BN_new();
  r = BN_new();
  ctx = (BN_CTX *)0x0;
  if (((a != (BIGNUM *)0x0) && (r != (BIGNUM *)0x0)) &&
     ((ctx = param_2, param_2 != (BN_CTX *)0x0 ||
      (ctx = (BN_CTX *)BN_CTX_new_ex(0), ctx != (BN_CTX *)0x0)))) {
    iVar2 = BN_num_bits(*(BIGNUM **)(param_1 + 0x10));
    iVar1 = bn_get_top(*(undefined8 *)(param_1 + 0x10));
    if (0x7f < iVar2) {
      iVar1 = iVar1 + 2;
      lVar4 = bn_wexpand(a,iVar1);
      if ((lVar4 != 0) && (lVar4 = bn_wexpand(r,iVar1), lVar4 != 0)) {
        do {
          if (param_5 == 0) {
            iVar3 = ossl_bn_priv_rand_range_fixed_top(a,*(undefined8 *)(param_1 + 0x10),0,ctx);
          }
          else {
            iVar3 = ossl_bn_gen_dsa_nonce_fixed_top
                              (a,*(undefined8 *)(param_1 + 0x10),*(undefined8 *)(param_1 + 0x70),
                               param_5,(long)param_6,ctx);
          }
          if (iVar3 == 0) goto LAB_00a212ec;
          iVar3 = ossl_bn_is_word_fixed_top(a,0);
        } while (iVar3 != 0);
        BN_set_flags(a,4);
        BN_set_flags(r,4);
        if (((((*(byte *)(param_1 + 0x78) & 1) == 0) ||
             (pBVar5 = BN_MONT_CTX_set_locked
                                 ((BN_MONT_CTX **)(param_1 + 0x80),
                                  (int)*(undefined8 *)(param_1 + 0xb0),*(BIGNUM **)(param_1 + 8),ctx
                                 ), pBVar5 != (BN_MONT_CTX *)0x0)) &&
            (iVar3 = BN_add(r,a,*(BIGNUM **)(param_1 + 0x10)), iVar3 != 0)) &&
           (iVar3 = BN_add(a,r,*(BIGNUM **)(param_1 + 0x10)), iVar3 != 0)) {
          iVar2 = BN_is_bit_set(r,iVar2);
          BN_consttime_swap((long)iVar2,a,r,iVar1);
          pcVar7 = *(code **)(*(long *)(param_1 + 0xa0) + 0x28);
          if (pcVar7 == (code *)0x0) {
            iVar1 = BN_mod_exp_mont(pBVar8,*(BIGNUM **)(param_1 + 0x18),a,*(BIGNUM **)(param_1 + 8),
                                    ctx,*(BN_MONT_CTX **)(param_1 + 0x80));
          }
          else {
            iVar1 = (*pcVar7)(param_1,pBVar8,*(BIGNUM **)(param_1 + 0x18),a,
                              *(BIGNUM **)(param_1 + 8),ctx);
          }
          if ((iVar1 != 0) &&
             (iVar1 = BN_div((BIGNUM *)0x0,pBVar8,pBVar8,*(BIGNUM **)(param_1 + 0x10),ctx),
             iVar1 != 0)) {
            a_00 = *(BIGNUM **)(param_1 + 0x10);
            pBVar8 = BN_new();
            if (pBVar8 != (BIGNUM *)0x0) {
              BN_CTX_start(ctx);
              r_00 = BN_CTX_get(ctx);
              if (((r_00 != (BIGNUM *)0x0) && (iVar1 = BN_set_word(pBVar8,2), iVar1 != 0)) &&
                 ((iVar1 = BN_sub(r_00,a_00,pBVar8), iVar1 != 0 &&
                  (iVar1 = BN_mod_exp_mont(pBVar8,a,r_00,a_00,ctx,(BN_MONT_CTX *)0x0), iVar1 != 0)))
                 ) {
                BN_CTX_end(ctx);
                BN_clear_free((BIGNUM *)*param_3);
                *param_3 = pBVar8;
                uVar6 = 1;
                goto joined_r0x00a21324;
              }
              BN_free(pBVar8);
              BN_CTX_end(ctx);
            }
          }
        }
      }
    }
  }
LAB_00a212ec:
  ERR_new();
  ERR_set_debug("crypto/dsa/dsa_ossl.c",0x146,"dsa_sign_setup");
  ERR_set_error(10,0x80003,0);
  uVar6 = 0;
joined_r0x00a21324:
  if (ctx != param_2) {
    BN_CTX_free(ctx);
  }
  BN_clear_free(a);
  BN_clear_free(r);
  return uVar6;
}

