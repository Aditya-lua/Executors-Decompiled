/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2073c
 */

undefined8 DSA_get_method(long param_1)

{
  return *(undefined8 *)(param_1 + 0xa0);
}

