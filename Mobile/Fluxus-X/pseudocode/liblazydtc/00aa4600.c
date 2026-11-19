/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4600
 */

undefined8 ossl_provider_get_parent(long param_1)

{
  return *(undefined8 *)(param_1 + 0xc0);
}

