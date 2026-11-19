/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7430
 */

bool SRP_user_pwd_set0_sv(long param_1,long param_2,long param_3)

{
  BN_free(*(BIGNUM **)(param_1 + 8));
  BN_clear_free(*(BIGNUM **)(param_1 + 0x10));
  *(long *)(param_1 + 8) = param_2;
  *(long *)(param_1 + 0x10) = param_3;
  return param_2 != 0 && param_3 != 0;
}

