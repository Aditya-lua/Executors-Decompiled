/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada4d8
 */

undefined8 ossl_rsa_sp800_56b_check_public(long param_1)

{
  int iVar1;
  int iVar2;
  BIGNUM *pBVar3;
  BN_CTX *ctx;
  undefined8 uVar4;
  BIGNUM *pBVar5;
  BIGNUM *a;
  int local_34;
  
  if ((*(BIGNUM **)(param_1 + 0x28) != (BIGNUM *)0x0) && (*(long *)(param_1 + 0x30) != 0)) {
    iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x28));
    if (iVar1 < 0x4001) {
      iVar2 = BN_is_odd(*(undefined8 *)(param_1 + 0x28));
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",0x134,"ossl_rsa_sp800_56b_check_public");
        uVar4 = 0xae;
      }
      else {
        pBVar5 = *(BIGNUM **)(param_1 + 0x30);
        iVar2 = BN_is_odd(pBVar5);
        if (iVar2 != 0) {
          pBVar3 = BN_value_one();
          iVar2 = BN_cmp(pBVar5,pBVar3);
          if (0 < iVar2) {
            ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 8));
            pBVar5 = BN_new();
            if (ctx != (BN_CTX *)0x0) {
              uVar4 = 0;
              if (pBVar5 == (BIGNUM *)0x0) goto LAB_00ada6bc;
              a = *(BIGNUM **)(param_1 + 0x28);
              pBVar3 = (BIGNUM *)ossl_bn_get0_small_factors();
              iVar2 = BN_gcd(pBVar5,a,pBVar3,ctx);
              if ((iVar2 == 0) || (iVar2 = BN_is_one(pBVar5), iVar2 == 0)) {
                ERR_new();
                uVar4 = 0x148;
              }
              else {
                iVar2 = ossl_bn_miller_rabin_is_prime
                                  (*(undefined8 *)(param_1 + 0x28),5,ctx,0,1,&local_34);
                if ((iVar2 == 1) && ((local_34 == 2 || ((iVar1 < 0x200 && (local_34 == 1)))))) {
                  uVar4 = 1;
                  goto LAB_00ada6bc;
                }
                ERR_new();
                uVar4 = 0x155;
              }
              ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",uVar4,
                            "ossl_rsa_sp800_56b_check_public");
              ERR_set_error(4,0xae,0);
            }
            uVar4 = 0;
LAB_00ada6bc:
            BN_free(pBVar5);
            BN_CTX_free(ctx);
            return uVar4;
          }
        }
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",0x139,"ossl_rsa_sp800_56b_check_public");
        uVar4 = 0xb2;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_sp800_56b_check.c",0x125,"ossl_rsa_sp800_56b_check_public");
      uVar4 = 0x69;
    }
    ERR_set_error(4,uVar4,0);
  }
  return 0;
}

