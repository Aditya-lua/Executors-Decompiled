/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af1cb8
 */

void FUN_00af1cb8(undefined8 *param_1)

{
  CRYPTO_free((void *)*param_1);
  OPENSSL_sk_pop_free(param_1[2],&LAB_00af1d08);
  CRYPTO_free(param_1);
  return;
}

