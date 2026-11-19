/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7cd0c
 */

undefined8 ossl_ffc_validate_public_key_partial(long *param_1,BIGNUM *param_2,uint *param_3)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *a;
  BIGNUM *pBVar2;
  undefined8 uVar3;
  
  *param_3 = 0;
  if (((param_1 == (long *)0x0) || (param_2 == (BIGNUM *)0x0)) || (*param_1 == 0)) {
    *param_3 = 0x40;
    return 1;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(0);
  if (ctx == (BN_CTX *)0x0) {
    return 0;
  }
  BN_CTX_start(ctx);
  a = BN_CTX_get(ctx);
  if ((a != (BIGNUM *)0x0) && (iVar1 = BN_set_word(a,1), iVar1 != 0)) {
    iVar1 = BN_cmp(param_2,a);
    if (iVar1 < 1) {
      *param_3 = *param_3 | 1;
    }
    pBVar2 = BN_copy(a,(BIGNUM *)*param_1);
    if ((pBVar2 != (BIGNUM *)0x0) && (iVar1 = BN_sub_word(a,1), iVar1 != 0)) {
      iVar1 = BN_cmp(param_2,a);
      if (-1 < iVar1) {
        *param_3 = *param_3 | 2;
      }
      uVar3 = 1;
      goto LAB_00a7cde8;
    }
  }
  uVar3 = 0;
LAB_00a7cde8:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return uVar3;
}

