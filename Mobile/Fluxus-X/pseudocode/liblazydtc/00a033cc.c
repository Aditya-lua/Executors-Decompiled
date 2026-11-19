/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a033cc
 */

int BN_from_montgomery(BIGNUM *r,BIGNUM *a,BN_MONT_CTX *mont,BN_CTX *ctx)

{
  int iVar1;
  BIGNUM *a_00;
  BIGNUM *pBVar2;
  
  BN_CTX_start(ctx);
  a_00 = BN_CTX_get(ctx);
  if ((a_00 == (BIGNUM *)0x0) || (pBVar2 = BN_copy(a_00,a), pBVar2 == (BIGNUM *)0x0)) {
    iVar1 = 0;
  }
  else {
    iVar1 = FUN_00a03110(r,a_00,mont);
  }
  BN_CTX_end(ctx);
  bn_correct_top(r);
  return iVar1;
}

