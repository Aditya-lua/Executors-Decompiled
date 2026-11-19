/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13c64
 */

void ossl_policy_node_free(void *param_1)

{
  CRYPTO_free(param_1);
  return;
}

