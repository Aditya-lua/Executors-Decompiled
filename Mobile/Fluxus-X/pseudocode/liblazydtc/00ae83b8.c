/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae83b8
 */

undefined8
SRP_create_verifier_BN_ex
          (long param_1,long param_2,undefined8 *param_3,undefined8 *param_4,BIGNUM *param_5,
          BIGNUM *param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *r;
  BIGNUM *p;
  BIGNUM *a;
  undefined8 uVar2;
  uchar auStack_a2c [2508];
  
  ctx = (BN_CTX *)BN_CTX_new_ex(param_7);
  uVar2 = 0;
  p = (BIGNUM *)0x0;
  if (((((param_1 == 0) || (param_2 == 0)) || (param_3 == (undefined8 *)0x0)) ||
      ((param_4 == (undefined8 *)0x0 || (param_5 == (BIGNUM *)0x0)))) || (param_6 == (BIGNUM *)0x0))
  {
    a = (BIGNUM *)0x0;
    goto joined_r0x00ae84e8;
  }
  a = (BIGNUM *)0x0;
  if (ctx == (BN_CTX *)0x0) {
LAB_00ae84e8:
    uVar2 = 0;
  }
  else {
    a = (BIGNUM *)*param_3;
    if (a == (BIGNUM *)0x0) {
      iVar1 = RAND_bytes_ex(param_7,auStack_a2c,0x14,0);
      if (iVar1 < 1) {
        p = (BIGNUM *)0x0;
        a = (BIGNUM *)0x0;
      }
      else {
        a = BN_bin2bn(auStack_a2c,0x14,(BIGNUM *)0x0);
        if (a != (BIGNUM *)0x0) goto LAB_00ae843c;
        p = (BIGNUM *)0x0;
      }
    }
    else {
LAB_00ae843c:
      p = (BIGNUM *)SRP_Calc_x_ex(a,param_1,param_2,param_7,param_8);
      if (p == (BIGNUM *)0x0) goto LAB_00ae84e8;
      r = BN_new();
      if (r != (BIGNUM *)0x0) {
        iVar1 = BN_mod_exp(r,param_6,p,param_5,ctx);
        if (iVar1 != 0) {
          uVar2 = 1;
          *param_3 = a;
          *param_4 = r;
          goto joined_r0x00ae84e8;
        }
        BN_clear_free(r);
      }
    }
    uVar2 = 0;
  }
joined_r0x00ae84e8:
  if ((param_3 != (undefined8 *)0x0) && ((BIGNUM *)*param_3 != a)) {
    BN_clear_free(a);
  }
  BN_clear_free(p);
  BN_CTX_free(ctx);
  return uVar2;
}

