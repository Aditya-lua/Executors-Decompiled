/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca70c
 */

undefined8 ossl_rand_pool_entropy(long param_1)

{
  return *(undefined8 *)(param_1 + 0x30);
}

