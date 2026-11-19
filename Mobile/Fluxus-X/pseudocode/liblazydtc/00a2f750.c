/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f750
 */

int EC_KEY_get_flags(EC_KEY *key)

{
  return *(int *)(key + 0x3c);
}

