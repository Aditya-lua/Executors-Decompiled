/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a32264
 */

ulong ossl_ec_group_do_inverse_ord(long *param_1,BIGNUM *param_2,BIGNUM *param_3,BN_CTX *param_4)

{
  int iVar1;
  ulong uVar2;
  BIGNUM *a;
  BN_CTX *c;
  
  if (*(code **)(*param_1 + 400) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a322b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)(*param_1 + 400))(param_1,param_2,param_3,param_4);
    return uVar2;
  }
  if ((param_1[0x12] == 0) ||
     ((c = (BN_CTX *)0x0, param_4 == (BN_CTX *)0x0 &&
      (param_4 = (BN_CTX *)BN_CTX_secure_new(), c = param_4, param_4 == (BN_CTX *)0x0)))) {
    uVar2 = 0;
  }
  else {
    BN_CTX_start(param_4);
    a = BN_CTX_get(param_4);
    if (((a == (BIGNUM *)0x0) || (iVar1 = BN_set_word(a,2), iVar1 == 0)) ||
       (iVar1 = BN_sub(a,(BIGNUM *)param_1[2],a), iVar1 == 0)) {
      uVar2 = 0;
    }
    else {
      iVar1 = BN_mod_exp_mont(param_2,param_3,a,(BIGNUM *)param_1[2],param_4,
                              (BN_MONT_CTX *)param_1[0x12]);
      uVar2 = (ulong)(iVar1 != 0);
    }
    BN_CTX_end(param_4);
    BN_CTX_free(c);
  }
  return uVar2;
}

