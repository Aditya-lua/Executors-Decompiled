/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7e5fc
 */

undefined4
FUN_00a7e5fc(BN_CTX *param_1,BN_MONT_CTX *param_2,BIGNUM *param_3,BIGNUM *param_4,BIGNUM *param_5,
            BIGNUM *param_6,BIGNUM *param_7,int *param_8)

{
  int iVar1;
  int iVar2;
  BIGNUM *b;
  
  iVar1 = BN_set_word(param_4,2);
  if ((iVar1 != 0) &&
     (iVar1 = BN_mod_exp_mont(param_3,param_4,param_6,param_5,param_1,param_2), iVar1 != 0)) {
    iVar1 = 2;
    do {
      b = BN_value_one();
      iVar2 = BN_cmp(param_3,b);
      if (0 < iVar2) {
        *param_8 = iVar1;
        return 1;
      }
      iVar2 = BN_add_word(param_4,1);
      if (iVar2 == 0) {
        return 0;
      }
      iVar2 = BN_cmp(param_4,param_7);
      if (-1 < iVar2) {
        return 0;
      }
      iVar1 = iVar1 + 1;
      iVar2 = BN_mod_exp_mont(param_3,param_4,param_6,param_5,param_1,param_2);
    } while (iVar2 != 0);
  }
  return 0;
}

