/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1b1c
 */

undefined8 RSA_set0_key(long param_1,long param_2,long param_3,long param_4)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_2 != 0 || *(BIGNUM **)(param_1 + 0x28) != (BIGNUM *)0x0) &&
     (uVar1 = 0, param_3 != 0 || *(long *)(param_1 + 0x30) != 0)) {
    if (param_2 != 0) {
      BN_free(*(BIGNUM **)(param_1 + 0x28));
      *(long *)(param_1 + 0x28) = param_2;
    }
    if (param_3 != 0) {
      BN_free(*(BIGNUM **)(param_1 + 0x30));
      *(long *)(param_1 + 0x30) = param_3;
    }
    if (param_4 != 0) {
      BN_clear_free(*(BIGNUM **)(param_1 + 0x38));
      *(long *)(param_1 + 0x38) = param_4;
      BN_set_flags(param_4,4);
    }
    *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
    uVar1 = 1;
  }
  return uVar1;
}

