/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a042ac
 */

int BN_div(BIGNUM *dv,BIGNUM *rem,BIGNUM *m,BIGNUM *d,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = BN_is_zero(d);
  if (iVar1 == 0) {
    if (d->d[(long)d->top + -1] != 0) {
      iVar1 = bn_div_fixed_top(dv,rem,m,d,ctx);
      if (iVar1 == 0) {
        return 0;
      }
      if (dv != (BIGNUM *)0x0) {
        bn_correct_top(dv);
      }
      if (rem == (BIGNUM *)0x0) {
        return iVar1;
      }
      bn_correct_top(rem);
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/bn/bn_div.c",0xe1,"BN_div");
    uVar2 = 0x6b;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_div.c",0xd7,"BN_div");
    uVar2 = 0x67;
  }
  ERR_set_error(3,uVar2,0);
  return 0;
}

