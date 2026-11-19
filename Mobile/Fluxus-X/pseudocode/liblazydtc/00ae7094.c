/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7094
 */

bool SRP_Verify_A_mod_N(BIGNUM *param_1,BIGNUM *param_2)

{
  bool bVar1;
  int iVar2;
  BN_CTX *ctx;
  BIGNUM *r;
  
  bVar1 = false;
  if ((param_1 != (BIGNUM *)0x0) && (param_2 != (BIGNUM *)0x0)) {
    ctx = BN_CTX_new();
    if (ctx == (BN_CTX *)0x0) {
      bVar1 = false;
    }
    else {
      r = BN_new();
      if ((r == (BIGNUM *)0x0) || (iVar2 = BN_nnmod(r,param_1,param_2,ctx), iVar2 == 0)) {
        bVar1 = false;
      }
      else {
        iVar2 = BN_is_zero(r);
        bVar1 = iVar2 == 0;
      }
      BN_CTX_free(ctx);
      BN_free(r);
    }
  }
  return bVar1;
}

