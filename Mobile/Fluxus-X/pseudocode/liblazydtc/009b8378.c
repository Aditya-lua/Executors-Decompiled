/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8378
 */

bool SSL_ct_is_enabled(long param_1)

{
  return *(long *)(param_1 + 0xb68) != 0;
}

