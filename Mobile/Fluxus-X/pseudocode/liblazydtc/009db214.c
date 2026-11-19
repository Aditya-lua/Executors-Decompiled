/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db214
 */

bool ossl_statem_export_early_allowed(long param_1)

{
  if (*(int *)(param_1 + 0xb30) == 2) {
    return true;
  }
  if (*(int *)(param_1 + 0x38) == 0) {
    return *(int *)(param_1 + 0xb30) != 0;
  }
  return false;
}

