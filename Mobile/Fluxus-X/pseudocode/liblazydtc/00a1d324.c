/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d324
 */

int BN_RECP_CTX_set(BN_RECP_CTX *recp,BIGNUM *rdiv,BN_CTX *ctx)

{
  int iVar1;
  int iVar2;
  BIGNUM *pBVar3;
  
  iVar1 = BN_is_zero(rdiv);
  iVar2 = 0;
  if ((iVar1 == 0) && (pBVar3 = BN_copy(&recp->N,rdiv), iVar2 = 0, pBVar3 != (BIGNUM *)0x0)) {
    BN_zero_ex(&recp->Nr);
    iVar2 = BN_num_bits(rdiv);
    recp->num_bits = iVar2;
    recp->shift = 0;
    iVar2 = 1;
  }
  return iVar2;
}

