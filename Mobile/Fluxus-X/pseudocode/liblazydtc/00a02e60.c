/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02e60
 */

bool BN_is_negative(long param_1)

{
  return *(int *)(param_1 + 0x10) != 0;
}

