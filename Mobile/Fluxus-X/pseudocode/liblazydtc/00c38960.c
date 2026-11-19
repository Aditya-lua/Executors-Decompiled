/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38960
 */

BN_BLINDING *
BN_BLINDING_create_param
          (BN_BLINDING *b,BIGNUM *e,BIGNUM *m,BN_CTX *ctx,bn_mod_exp *bn_mod_exp,BN_MONT_CTX *m_ctx)

{
  BN_BLINDING *pBVar1;
  
  pBVar1 = BN_BLINDING_create_param(b,e,m,ctx,bn_mod_exp,m_ctx);
  return pBVar1;
}

