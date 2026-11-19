/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1bb8
 */

undefined8 RSA_set0_factors(long param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_2 != 0 || *(BIGNUM **)(param_1 + 0x40) != (BIGNUM *)0x0) &&
     (uVar1 = 0, param_3 != 0 || *(long *)(param_1 + 0x48) != 0)) {
    if (param_2 != 0) {
      BN_clear_free(*(BIGNUM **)(param_1 + 0x40));
      *(long *)(param_1 + 0x40) = param_2;
      BN_set_flags(param_2,4);
    }
    if (param_3 != 0) {
      BN_clear_free(*(BIGNUM **)(param_1 + 0x48));
      *(long *)(param_1 + 0x48) = param_3;
      BN_set_flags(param_3,4);
    }
    *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
    uVar1 = 1;
  }
  return uVar1;
}

