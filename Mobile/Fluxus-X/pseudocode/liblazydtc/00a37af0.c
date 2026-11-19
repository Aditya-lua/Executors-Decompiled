/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37af0
 */

undefined8 ossl_ec_GFp_mont_field_inv(long param_1,BIGNUM *param_2,BIGNUM *param_3,BN_CTX *param_4)

{
  int iVar1;
  BIGNUM *a;
  BN_CTX *c;
  undefined8 uVar2;
  
  if ((*(long *)(param_1 + 0x78) == 0) ||
     ((c = (BN_CTX *)0x0, param_4 == (BN_CTX *)0x0 &&
      (param_4 = (BN_CTX *)BN_CTX_secure_new_ex(*(undefined8 *)(param_1 + 0xa8)), c = param_4,
      param_4 == (BN_CTX *)0x0)))) {
    return 0;
  }
  BN_CTX_start(param_4);
  a = BN_CTX_get(param_4);
  if ((((a != (BIGNUM *)0x0) && (iVar1 = BN_set_word(a,2), iVar1 != 0)) &&
      (iVar1 = BN_sub(a,*(BIGNUM **)(param_1 + 0x40),a), iVar1 != 0)) &&
     (iVar1 = BN_mod_exp_mont(param_2,param_3,a,*(BIGNUM **)(param_1 + 0x40),param_4,
                              *(BN_MONT_CTX **)(param_1 + 0x78)), iVar1 != 0)) {
    iVar1 = BN_is_zero(param_2);
    if (iVar1 == 0) {
      uVar2 = 1;
      goto LAB_00a37bcc;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_mont.c",0xff,"ossl_ec_GFp_mont_field_inv");
    ERR_set_error(0x10,0xa5,0);
  }
  uVar2 = 0;
LAB_00a37bcc:
  BN_CTX_end(param_4);
  BN_CTX_free(c);
  return uVar2;
}

