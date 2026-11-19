/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3c1c
 */

void ssl_hmac_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  EVP_MAC_CTX_free(*param_1);
  ssl_hmac_old_free(param_1);
  CRYPTO_free(param_1);
  return;
}

