/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03018
 */

int BN_mod_mul_montgomery(BIGNUM *r,BIGNUM *a,BIGNUM *b,BN_MONT_CTX *mont,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = bn_mul_mont_fixed_top();
  bn_correct_top(r);
  return iVar1;
}

