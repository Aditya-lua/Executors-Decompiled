/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38ae0
 */

int BN_mod_exp_mont(BIGNUM *r,BIGNUM *a,BIGNUM *p,BIGNUM *m,BN_CTX *ctx,BN_MONT_CTX *m_ctx)

{
  int iVar1;
  
  iVar1 = BN_mod_exp_mont(r,a,p,m,ctx,m_ctx);
  return iVar1;
}

