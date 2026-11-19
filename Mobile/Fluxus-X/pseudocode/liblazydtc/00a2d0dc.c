/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2d0dc
 */

undefined4 BN_GF2m_arr2poly(int *param_1,BIGNUM *param_2)

{
  int iVar1;
  
  BN_zero_ex(param_2);
  iVar1 = *param_1;
  if (iVar1 != -1) {
    do {
      param_1 = param_1 + 1;
      iVar1 = BN_set_bit(param_2,iVar1);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = *param_1;
    } while (iVar1 != -1);
  }
  return 1;
}

