/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d1ac
 */

uint BN_mod_exp_mont_consttime_x2
               (BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4,BN_MONT_CTX *param_5
               ,BIGNUM *param_6,BIGNUM *param_7,BIGNUM *param_8,BIGNUM *param_9,
               BN_MONT_CTX *param_10,BN_CTX *param_11)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = BN_mod_exp_mont_consttime(param_1,param_2,param_3,param_4,param_11,param_5);
  uVar2 = BN_mod_exp_mont_consttime(param_6,param_7,param_8,param_9,param_11,param_10);
  return uVar2 & uVar1;
}

