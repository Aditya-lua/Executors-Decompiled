/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38f90
 */

int BN_MONT_CTX_set(BN_MONT_CTX *mont,BIGNUM *mod,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_MONT_CTX_set(mont,mod,ctx);
  return iVar1;
}

