/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38b00
 */

int BN_mod_exp2_mont(BIGNUM *r,BIGNUM *a1,BIGNUM *p1,BIGNUM *a2,BIGNUM *p2,BIGNUM *m,BN_CTX *ctx,
                    BN_MONT_CTX *m_ctx)

{
  int iVar1;
  
  iVar1 = BN_mod_exp2_mont(r,a1,p1,a2,p2,m,ctx,m_ctx);
  return iVar1;
}

