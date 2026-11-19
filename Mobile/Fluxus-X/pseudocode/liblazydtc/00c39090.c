/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39090
 */

int BN_sqr(BIGNUM *r,BIGNUM *a,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_sqr(r,a,ctx);
  return iVar1;
}

