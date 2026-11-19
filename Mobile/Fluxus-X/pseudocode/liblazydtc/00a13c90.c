/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13c90
 */

void SCT_LIST_free(undefined8 param_1)

{
  OPENSSL_sk_pop_free(param_1,SCT_free);
  return;
}

