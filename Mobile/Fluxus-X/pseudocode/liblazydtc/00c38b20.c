/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38b20
 */

BIGNUM * BN_mod_inverse(BIGNUM *ret,BIGNUM *a,BIGNUM *n,BN_CTX *ctx)

{
  BIGNUM *pBVar1;
  
  pBVar1 = BN_mod_inverse(ret,a,n,ctx);
  return pBVar1;
}

