/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7ce18
 */

undefined8 ossl_ffc_validate_public_key(undefined8 *param_1,BIGNUM *param_2,uint *param_3)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *r;
  undefined8 uVar2;
  
  iVar1 = ossl_ffc_validate_public_key_partial();
  if (iVar1 != 0) {
    if ((*param_3 != 0) || (param_1[1] == 0)) {
      return 1;
    }
    ctx = (BN_CTX *)BN_CTX_new_ex(0);
    if (ctx != (BN_CTX *)0x0) {
      BN_CTX_start(ctx);
      r = BN_CTX_get(ctx);
      if ((r == (BIGNUM *)0x0) ||
         (iVar1 = BN_mod_exp(r,param_2,(BIGNUM *)param_1[1],(BIGNUM *)*param_1,ctx), iVar1 == 0)) {
        uVar2 = 0;
      }
      else {
        iVar1 = BN_is_one(r);
        if (iVar1 == 0) {
          *param_3 = *param_3 | 4;
        }
        uVar2 = 1;
      }
      BN_CTX_end(ctx);
      BN_CTX_free(ctx);
      return uVar2;
    }
  }
  return 0;
}

