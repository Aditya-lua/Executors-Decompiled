/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02e70
 */

int BN_to_montgomery(BIGNUM *param_1,BIGNUM *param_2,BN_MONT_CTX *param_3,BN_CTX *param_4)

{
  int iVar1;
  
  iVar1 = BN_mod_mul_montgomery(param_1,param_2,&param_3->RR,param_3,param_4);
  return iVar1;
}

