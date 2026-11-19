/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38b10
 */

int BN_gcd(BIGNUM *r,BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_gcd(r,a,b,ctx);
  return iVar1;
}

