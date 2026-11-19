/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38d60
 */

int BN_mod_mul_montgomery(BIGNUM *r,BIGNUM *a,BIGNUM *b,BN_MONT_CTX *mont,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_mod_mul_montgomery(r,a,b,mont,ctx);
  return iVar1;
}

