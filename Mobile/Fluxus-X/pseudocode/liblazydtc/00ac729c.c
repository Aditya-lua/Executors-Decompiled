/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac729c
 */

undefined4 ossl_property_get_type(long param_1)

{
  return *(undefined4 *)(param_1 + 4);
}

