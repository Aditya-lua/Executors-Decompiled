/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca714
 */

undefined8 ossl_rand_pool_length(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

