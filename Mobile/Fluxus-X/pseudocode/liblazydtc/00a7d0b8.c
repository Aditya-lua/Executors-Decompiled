/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d0b8
 */

void ossl_ffc_params_set0_j(long param_1,undefined8 param_2)

{
  BN_free(*(BIGNUM **)(param_1 + 0x18));
  *(undefined8 *)(param_1 + 0x18) = param_2;
  return;
}

