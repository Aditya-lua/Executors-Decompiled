/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae698c
 */

BIGNUM * SRP_Calc_B_ex(BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4,
                      undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *r_01;
  BIGNUM *b;
  
  if (param_1 == (BIGNUM *)0x0) {
    return (BIGNUM *)0x0;
  }
  if (param_2 == (BIGNUM *)0x0) {
    return (BIGNUM *)0x0;
  }
  if (param_3 == (BIGNUM *)0x0) {
    return (BIGNUM *)0x0;
  }
  if (param_4 == (BIGNUM *)0x0) {
    return (BIGNUM *)0x0;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(param_5);
  if (ctx == (BN_CTX *)0x0) {
    return (BIGNUM *)0x0;
  }
  r = BN_new();
  if (r == (BIGNUM *)0x0) {
    r_00 = (BIGNUM *)0x0;
LAB_00ae6a8c:
    r_01 = (BIGNUM *)0x0;
  }
  else {
    r_00 = BN_new();
    if (r_00 == (BIGNUM *)0x0) goto LAB_00ae6a8c;
    r_01 = BN_new();
    if (r_01 != (BIGNUM *)0x0) {
      iVar1 = BN_mod_exp(r_00,param_3,param_1,param_2,ctx);
      if (iVar1 == 0) {
        b = (BIGNUM *)0x0;
      }
      else {
        b = (BIGNUM *)FUN_00ae6724(param_2,param_3,param_2,param_5,param_6);
        if (((b != (BIGNUM *)0x0) && (iVar1 = BN_mod_mul(r,param_4,b,param_2,ctx), iVar1 != 0)) &&
           (iVar1 = BN_mod_add(r_01,r_00,r,param_2,ctx), iVar1 != 0)) goto LAB_00ae6aa8;
      }
      BN_free(r_01);
      r_01 = (BIGNUM *)0x0;
      goto LAB_00ae6aa8;
    }
  }
  b = (BIGNUM *)0x0;
LAB_00ae6aa8:
  BN_CTX_free(ctx);
  BN_clear_free(r);
  BN_clear_free(r_00);
  BN_free(b);
  return r_01;
}

