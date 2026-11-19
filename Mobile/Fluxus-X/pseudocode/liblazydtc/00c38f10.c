/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38f10
 */

int BN_mod_sub(BIGNUM *r,BIGNUM *a,BIGNUM *b,BIGNUM *m,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_mod_sub(r,a,b,m,ctx);
  return iVar1;
}

