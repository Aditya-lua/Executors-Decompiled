/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da3e4
 */

bool ossl_statem_skip_early_data(long param_1)

{
  if (((*(int *)(param_1 + 0xb30) == 1) && (*(int *)(param_1 + 0x38) != 0)) &&
     (*(int *)(param_1 + 0x5c) == 0x2e)) {
    return *(int *)(param_1 + 0x8e8) != 2;
  }
  return false;
}

