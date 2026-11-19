/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f2e8
 */

undefined8 DH_set0_key(long param_1,long param_2,long param_3)

{
  if (param_2 != 0) {
    BN_clear_free(*(BIGNUM **)(param_1 + 0x70));
    *(long *)(param_1 + 0x70) = param_2;
  }
  if (param_3 != 0) {
    BN_clear_free(*(BIGNUM **)(param_1 + 0x78));
    *(long *)(param_1 + 0x78) = param_3;
  }
  *(long *)(param_1 + 200) = *(long *)(param_1 + 200) + 1;
  return 1;
}

