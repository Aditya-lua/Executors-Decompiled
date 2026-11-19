/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea0ac
 */

void OSSL_STORE_INFO_free(undefined4 *param_1)

{
  if (param_1 == (undefined4 *)0x0) {
    return;
  }
  switch(*param_1) {
  case 1:
    CRYPTO_free(*(void **)(param_1 + 2));
    CRYPTO_free(*(void **)(param_1 + 4));
    break;
  case 2:
  case 3:
  case 4:
    EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 2));
    break;
  case 5:
    X509_free(*(X509 **)(param_1 + 2));
    break;
  case 6:
    X509_CRL_free(*(X509_CRL **)(param_1 + 2));
  }
  CRYPTO_free(param_1);
  return;
}

