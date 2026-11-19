/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08460
 */

BIGNUM * BN_mod_inverse(BIGNUM *ret,BIGNUM *a,BIGNUM *n,BN_CTX *ctx)

{
  BIGNUM *pBVar1;
  BN_CTX *c;
  int local_34;
  
  local_34 = 0;
  c = (BN_CTX *)0x0;
  if ((ctx == (BN_CTX *)0x0) && (ctx = (BN_CTX *)BN_CTX_new_ex(0), c = ctx, ctx == (BN_CTX *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_gcd.c",0x20d,"BN_mod_inverse");
    ERR_set_error(3,0xc0100,0);
    pBVar1 = (BIGNUM *)0x0;
  }
  else {
    pBVar1 = (BIGNUM *)int_bn_mod_inverse(ret,a,n,ctx,&local_34);
    if (local_34 != 0) {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_gcd.c",0x214,"BN_mod_inverse");
      ERR_set_error(3,0x6c,0);
    }
    BN_CTX_free(c);
  }
  return pBVar1;
}

