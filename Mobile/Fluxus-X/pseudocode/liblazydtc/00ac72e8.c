/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac72e8
 */

byte ossl_property_has_optional(long param_1)

{
  return *(byte *)(param_1 + 4) & 1;
}

