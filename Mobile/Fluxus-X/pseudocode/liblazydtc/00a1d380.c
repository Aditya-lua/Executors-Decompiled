/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d380
 */

int BN_mod_mul_reciprocal(BIGNUM *r,BIGNUM *x,BIGNUM *y,BN_RECP_CTX *recp,BN_CTX *ctx)

{
  int iVar1;
  BIGNUM *r_00;
  
  BN_CTX_start(ctx);
  r_00 = BN_CTX_get(ctx);
  if (r_00 == (BIGNUM *)0x0) {
LAB_00a1d41c:
    iVar1 = 0;
  }
  else {
    if (y != (BIGNUM *)0x0) {
      if (x == y) {
        iVar1 = BN_sqr(r_00,y,ctx);
      }
      else {
        iVar1 = BN_mul(r_00,x,y,ctx);
      }
      x = r_00;
      if (iVar1 == 0) goto LAB_00a1d41c;
    }
    iVar1 = BN_div_recp((BIGNUM *)0x0,r,x,recp,ctx);
  }
  BN_CTX_end(ctx);
  return iVar1;
}

