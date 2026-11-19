/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da3a8
 */

bool ossl_statem_in_error(long param_1)

{
  return *(int *)(param_1 + 0x48) == 1;
}

