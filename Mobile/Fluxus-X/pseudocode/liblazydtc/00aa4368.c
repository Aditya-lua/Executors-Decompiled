/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4368
 */

undefined8 ossl_provider_name(long param_1)

{
  return *(undefined8 *)(param_1 + 0x28);
}

