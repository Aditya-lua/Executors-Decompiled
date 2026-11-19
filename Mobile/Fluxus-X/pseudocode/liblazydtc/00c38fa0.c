/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38fa0
 */

BN_MONT_CTX * BN_MONT_CTX_set_locked(BN_MONT_CTX **pmont,int lock,BIGNUM *mod,BN_CTX *ctx)

{
  BN_MONT_CTX *pBVar1;
  
  pBVar1 = BN_MONT_CTX_set_locked(pmont,lock,mod,ctx);
  return pBVar1;
}

