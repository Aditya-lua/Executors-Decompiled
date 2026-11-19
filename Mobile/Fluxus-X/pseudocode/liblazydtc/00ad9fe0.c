/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad9fe0
 */

bool ossl_rsa_check_prime_factor_range(BIGNUM *param_1,int param_2,BN_CTX *param_3)

{
  int iVar1;
  int iVar2;
  BIGNUM *a;
  BIGNUM *pBVar3;
  bool bVar4;
  
  iVar1 = BN_num_bits((BIGNUM *)&ossl_bn_inv_sqrt_2);
  iVar2 = BN_num_bits(param_1);
  if (iVar2 != param_2 >> 1) {
    return false;
  }
  BN_CTX_start(param_3);
  a = BN_CTX_get(param_3);
  bVar4 = false;
  if (a != (BIGNUM *)0x0) {
    pBVar3 = BN_copy(a,(BIGNUM *)&ossl_bn_inv_sqrt_2);
    if (pBVar3 != (BIGNUM *)0x0) {
      iVar1 = (param_2 >> 1) - iVar1;
      if (iVar1 < 0) {
        iVar1 = BN_rshift(a,a,-iVar1);
      }
      else {
        iVar1 = BN_lshift(a,a,iVar1);
      }
      if (iVar1 != 0) {
        iVar1 = BN_cmp(param_1,a);
        bVar4 = 0 < iVar1;
        goto LAB_00ada098;
      }
    }
    bVar4 = false;
  }
LAB_00ada098:
  BN_CTX_end(param_3);
  return bVar4;
}

