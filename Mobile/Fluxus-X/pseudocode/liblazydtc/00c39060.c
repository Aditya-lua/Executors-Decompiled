/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39060
 */

int BN_mul(BIGNUM *r,BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_mul(r,a,b,ctx);
  return iVar1;
}

