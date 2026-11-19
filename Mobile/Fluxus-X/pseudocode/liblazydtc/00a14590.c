/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14590
 */

void SCT_CTX_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  EVP_PKEY_free((EVP_PKEY *)*param_1);
  CRYPTO_free((void *)param_1[1]);
  CRYPTO_free((void *)param_1[3]);
  CRYPTO_free((void *)param_1[5]);
  CRYPTO_free((void *)param_1[7]);
  CRYPTO_free((void *)param_1[0xb]);
  CRYPTO_free(param_1);
  return;
}

