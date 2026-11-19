/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38fb0
 */

int BN_from_montgomery(BIGNUM *r,BIGNUM *a,BN_MONT_CTX *mont,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_from_montgomery(r,a,mont,ctx);
  return iVar1;
}

