/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19b20
 */

undefined8 DH_check_params(long param_1,uint *param_2)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *a;
  BIGNUM *pBVar2;
  undefined8 uVar3;
  
  *param_2 = 0;
  ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xb0));
  if (ctx != (BN_CTX *)0x0) {
    BN_CTX_start(ctx);
    a = BN_CTX_get(ctx);
    if (a != (BIGNUM *)0x0) {
      iVar1 = BN_is_odd(*(undefined8 *)(param_1 + 8));
      if (iVar1 == 0) {
        *param_2 = *param_2 | 1;
      }
      iVar1 = BN_is_negative(*(undefined8 *)(param_1 + 0x18));
      if (((iVar1 != 0) || (iVar1 = BN_is_zero(*(undefined8 *)(param_1 + 0x18)), iVar1 != 0)) ||
         (iVar1 = BN_is_one(*(undefined8 *)(param_1 + 0x18)), iVar1 != 0)) {
        *param_2 = *param_2 | 8;
      }
      pBVar2 = BN_copy(a,*(BIGNUM **)(param_1 + 8));
      if ((pBVar2 != (BIGNUM *)0x0) && (iVar1 = BN_sub_word(a,1), iVar1 != 0)) {
        iVar1 = BN_cmp(*(BIGNUM **)(param_1 + 0x18),a);
        if (-1 < iVar1) {
          *param_2 = *param_2 | 8;
        }
        iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 8));
        if (iVar1 < 0x200) {
          *param_2 = *param_2 | 0x80;
        }
        iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 8));
        if (10000 < iVar1) {
          *param_2 = *param_2 | 0x100;
        }
        uVar3 = 1;
        goto LAB_00a19c30;
      }
    }
  }
  uVar3 = 0;
LAB_00a19c30:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return uVar3;
}

