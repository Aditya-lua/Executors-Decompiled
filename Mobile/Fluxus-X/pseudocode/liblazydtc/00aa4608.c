/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4608
 */

byte ossl_provider_is_child(long param_1)

{
  return *(byte *)(param_1 + 200) & 1;
}

