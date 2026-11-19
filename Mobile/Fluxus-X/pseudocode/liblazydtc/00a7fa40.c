/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7fa40
 */

void HMAC_CTX_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  EVP_MD_CTX_reset(param_1[2]);
  EVP_MD_CTX_reset(param_1[3]);
  EVP_MD_CTX_reset(param_1[1]);
  *param_1 = 0;
  EVP_MD_CTX_free(param_1[2]);
  EVP_MD_CTX_free(param_1[3]);
  EVP_MD_CTX_free(param_1[1]);
  CRYPTO_free(param_1);
  return;
}

