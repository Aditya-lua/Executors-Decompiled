/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38f00
 */

int BN_mod_sqr(BIGNUM *r,BIGNUM *a,BIGNUM *m,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_mod_sqr(r,a,m,ctx);
  return iVar1;
}

