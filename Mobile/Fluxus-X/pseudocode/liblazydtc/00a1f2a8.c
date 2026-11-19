/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f2a8
 */

long DH_get_length(long param_1)

{
  return (long)*(int *)(param_1 + 0x68);
}

