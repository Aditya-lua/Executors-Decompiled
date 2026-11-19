/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a017f4
 */

bool BN_is_zero(long param_1)

{
  return *(int *)(param_1 + 8) == 0;
}

