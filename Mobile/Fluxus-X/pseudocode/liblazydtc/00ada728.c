/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada728
 */

undefined8
ossl_rsa_sp800_56b_check_keypair(long param_1,BIGNUM *param_2,undefined4 param_3,int param_4)

{
  int iVar1;
  BIGNUM *b;
  BN_CTX *ctx;
  undefined8 uVar2;
  BIGNUM *pBVar3;
  
  if ((((*(long *)(param_1 + 0x40) == 0) || (*(long *)(param_1 + 0x48) == 0)) ||
      (*(long *)(param_1 + 0x30) == 0)) ||
     ((*(long *)(param_1 + 0x38) == 0 || (*(long *)(param_1 + 0x28) == 0)))) {
    ERR_new();
    uVar2 = 0x182;
  }
  else {
    iVar1 = ossl_rsa_sp800_56b_validate_strength(param_4,param_3);
    if (iVar1 == 0) {
      return 0;
    }
    if ((param_2 == (BIGNUM *)0x0) ||
       (iVar1 = BN_cmp(param_2,*(BIGNUM **)(param_1 + 0x30)), iVar1 == 0)) {
      pBVar3 = *(BIGNUM **)(param_1 + 0x30);
      iVar1 = BN_is_odd(pBVar3);
      if (iVar1 != 0) {
        b = BN_value_one();
        iVar1 = BN_cmp(pBVar3,b);
        if (0 < iVar1) {
          iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x28));
          if (iVar1 == param_4) {
            ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 8));
            if (ctx == (BN_CTX *)0x0) {
              return 0;
            }
            BN_CTX_start(ctx);
            pBVar3 = BN_CTX_get(ctx);
            if ((pBVar3 != (BIGNUM *)0x0) &&
               (iVar1 = BN_mul(pBVar3,*(BIGNUM **)(param_1 + 0x40),*(BIGNUM **)(param_1 + 0x48),ctx)
               , iVar1 != 0)) {
              iVar1 = BN_cmp(*(BIGNUM **)(param_1 + 0x28),pBVar3);
              if (iVar1 == 0) {
                iVar1 = ossl_rsa_check_prime_factor
                                  (*(undefined8 *)(param_1 + 0x40),*(undefined8 *)(param_1 + 0x30),
                                   param_4,ctx);
                if (((iVar1 != 0) &&
                    (iVar1 = ossl_rsa_check_prime_factor
                                       (*(undefined8 *)(param_1 + 0x48),
                                        *(undefined8 *)(param_1 + 0x30),param_4,ctx), iVar1 != 0))
                   && (iVar1 = BN_sub(pBVar3,*(BIGNUM **)(param_1 + 0x40),
                                      *(BIGNUM **)(param_1 + 0x48)), iVar1 != 0)) {
                  BN_set_negative(pBVar3,0);
                  iVar1 = BN_is_zero(pBVar3);
                  if (((iVar1 == 0) && (iVar1 = BN_sub_word(pBVar3,1), iVar1 != 0)) &&
                     ((iVar1 = BN_num_bits(pBVar3), (param_4 >> 1) + -100 < iVar1 &&
                      ((iVar1 = ossl_rsa_check_private_exponent(param_1,param_4,ctx), iVar1 != 0 &&
                       (iVar1 = ossl_rsa_check_crt_components(param_1,ctx), iVar1 != 0)))))) {
                    uVar2 = 1;
                    goto LAB_00ada978;
                  }
                }
                ERR_new();
                ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",0x1b4,
                              "ossl_rsa_sp800_56b_check_keypair");
                uVar2 = 0xab;
              }
              else {
                ERR_new();
                ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",0x1a7,
                              "ossl_rsa_sp800_56b_check_keypair");
                uVar2 = 0xaf;
              }
              ERR_set_error(4,uVar2,0);
            }
            uVar2 = 0;
LAB_00ada978:
            BN_clear(pBVar3);
            BN_CTX_end(ctx);
            BN_CTX_free(ctx);
            return uVar2;
          }
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",0x199,"ossl_rsa_sp800_56b_check_keypair")
          ;
          uVar2 = 0xab;
          goto LAB_00ada7d4;
        }
      }
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",0x194,"ossl_rsa_sp800_56b_check_keypair");
      uVar2 = 0xb2;
      goto LAB_00ada7d4;
    }
    ERR_new();
    uVar2 = 0x18d;
  }
  ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",uVar2,"ossl_rsa_sp800_56b_check_keypair");
  uVar2 = 0xaf;
LAB_00ada7d4:
  ERR_set_error(4,uVar2,0);
  return 0;
}

