/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c391d0
 */

int BN_mod_mul_reciprocal(BIGNUM *r,BIGNUM *x,BIGNUM *y,BN_RECP_CTX *recp,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_mod_mul_reciprocal(r,x,y,recp,ctx);
  return iVar1;
}

