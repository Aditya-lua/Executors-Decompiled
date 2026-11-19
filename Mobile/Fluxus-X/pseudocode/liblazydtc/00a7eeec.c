/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7eeec
 */

undefined4
ossl_ffc_params_validate_unverifiable_g
          (BN_CTX *param_1,BN_MONT_CTX *param_2,BIGNUM *param_3,BIGNUM *param_4,BIGNUM *param_5,
          BIGNUM *param_6,uint *param_7)

{
  int iVar1;
  BIGNUM *pBVar2;
  
  pBVar2 = BN_value_one();
  iVar1 = BN_cmp(param_5,pBVar2);
  if ((0 < iVar1) && (iVar1 = BN_cmp(param_5,param_3), iVar1 < 0)) {
    iVar1 = BN_mod_exp_mont(param_6,param_5,param_4,param_3,param_1,param_2);
    if (iVar1 == 0) {
      return 0;
    }
    pBVar2 = BN_value_one();
    iVar1 = BN_cmp(param_6,pBVar2);
    if (iVar1 == 0) {
      return 1;
    }
  }
  *param_7 = *param_7 | 8;
  return 0;
}

