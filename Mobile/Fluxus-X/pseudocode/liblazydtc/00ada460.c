/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada460
 */

ulong ossl_rsa_check_pminusq_diff(BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3,int param_4)

{
  int iVar1;
  
  iVar1 = BN_sub(param_1,param_2,param_3);
  if (iVar1 != 0) {
    BN_set_negative(param_1,0);
    iVar1 = BN_is_zero(param_1);
    if (iVar1 != 0) {
      return 0;
    }
    iVar1 = BN_sub_word(param_1,1);
    if (iVar1 != 0) {
      iVar1 = BN_num_bits(param_1);
      return (ulong)((param_4 >> 1) + -100 < iVar1);
    }
  }
  return 0xffffffff;
}

