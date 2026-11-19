/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada0b8
 */

bool ossl_rsa_check_prime_factor(BIGNUM *param_1,BIGNUM *param_2,undefined4 param_3,BN_CTX *param_4)

{
  bool bVar1;
  int iVar2;
  BIGNUM *a;
  BIGNUM *r;
  BIGNUM *pBVar3;
  
  iVar2 = BN_check_prime(param_1,param_4,0);
  bVar1 = false;
  if (iVar2 == 1) {
    iVar2 = ossl_rsa_check_prime_factor_range(param_1,param_3,param_4);
    bVar1 = false;
    if (iVar2 == 1) {
      BN_CTX_start(param_4);
      a = BN_CTX_get(param_4);
      r = BN_CTX_get(param_4);
      bVar1 = false;
      if (r != (BIGNUM *)0x0) {
        BN_set_flags(a,4);
        BN_set_flags(r,4);
        pBVar3 = BN_copy(a,param_1);
        if (((pBVar3 == (BIGNUM *)0x0) || (iVar2 = BN_sub_word(a,1), iVar2 == 0)) ||
           (iVar2 = BN_gcd(r,a,param_2,param_4), iVar2 == 0)) {
          bVar1 = false;
        }
        else {
          iVar2 = BN_is_one(r);
          bVar1 = iVar2 != 0;
        }
      }
      BN_clear(a);
      BN_CTX_end(param_4);
    }
  }
  return bVar1;
}

