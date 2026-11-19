/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adb11c
 */

undefined8
ossl_rsa_fips186_4_gen_prob_primes
          (long param_1,undefined8 param_2,int param_3,undefined8 param_4,BN_CTX *param_5,
          undefined8 param_6)

{
  int iVar1;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *a_01;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  
  if (param_3 < 0x800) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_sp800_56b_gen.c",0x5c,"ossl_rsa_fips186_4_gen_prob_primes");
    uVar3 = 0x78;
  }
  else {
    iVar1 = ossl_rsa_check_public_exponent(param_4);
    if (iVar1 != 0) {
      BN_CTX_start(param_5);
      a = BN_CTX_get(param_5);
      a_00 = BN_CTX_get(param_5);
      a_01 = BN_CTX_get(param_5);
      if (((a != (BIGNUM *)0x0) && (a_00 != (BIGNUM *)0x0)) && (a_01 != (BIGNUM *)0x0)) {
        BN_set_flags(a_00,4);
        BN_set_flags(a_01,4);
        lVar4 = *(long *)(param_1 + 0x40);
        if (lVar4 == 0) {
          lVar4 = BN_secure_new();
          *(long *)(param_1 + 0x40) = lVar4;
          lVar2 = *(long *)(param_1 + 0x48);
        }
        else {
          lVar2 = *(long *)(param_1 + 0x48);
        }
        if (lVar2 == 0) {
          lVar2 = BN_secure_new();
          lVar4 = *(long *)(param_1 + 0x40);
          *(long *)(param_1 + 0x48) = lVar2;
        }
        if ((lVar4 != 0) && (lVar2 != 0)) {
          BN_set_flags(lVar4,4);
          BN_set_flags(*(undefined8 *)(param_1 + 0x48),4);
          iVar1 = ossl_bn_rsa_fips186_4_gen_prob_primes
                            (*(undefined8 *)(param_1 + 0x40),a_00,0,0,0,0,0,param_3,param_4,param_5,
                             param_6);
          if (iVar1 != 0) {
            iVar1 = ossl_bn_rsa_fips186_4_gen_prob_primes
                              (*(undefined8 *)(param_1 + 0x48),a_01,0,0,0,0,0,param_3,param_4,
                               param_5,param_6);
            do {
              if ((iVar1 == 0) ||
                 (iVar1 = ossl_rsa_check_pminusq_diff(a,a_00,a_01,param_3), iVar1 < 0)) break;
              if (iVar1 != 0) {
                iVar1 = ossl_rsa_check_pminusq_diff
                                  (a,*(undefined8 *)(param_1 + 0x40),*(undefined8 *)(param_1 + 0x48)
                                   ,param_3);
                if (iVar1 < 0) break;
                if (iVar1 != 0) {
                  uVar3 = 1;
                  *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
                  goto joined_r0x00adb3a0;
                }
              }
              iVar1 = ossl_bn_rsa_fips186_4_gen_prob_primes
                                (*(undefined8 *)(param_1 + 0x48),a_01,0,0,0,0,0,param_3,param_4,
                                 param_5,param_6);
            } while( true );
          }
        }
      }
      uVar3 = 0;
joined_r0x00adb3a0:
      if (a_00 != (BIGNUM *)0x0) {
        BN_clear(a_00);
      }
      if (a_01 != (BIGNUM *)0x0) {
        BN_clear(a_01);
      }
      BN_clear(a);
      BN_CTX_end(param_5);
      return uVar3;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_sp800_56b_gen.c",0x61,"ossl_rsa_fips186_4_gen_prob_primes");
    uVar3 = 0xb2;
  }
  ERR_set_error(4,uVar3,0);
  return 0;
}

