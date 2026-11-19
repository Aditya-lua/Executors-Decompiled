/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ac474
 */

void ssl_cert_clear_certs(long param_1)

{
  long lVar1;
  long lVar2;
  
  if (param_1 != 0) {
    lVar2 = 0;
    do {
      lVar1 = param_1 + lVar2;
      X509_free(*(X509 **)(lVar1 + 0x20));
      *(undefined8 *)(lVar1 + 0x20) = 0;
      EVP_PKEY_free(*(EVP_PKEY **)(lVar1 + 0x28));
      *(undefined8 *)(lVar1 + 0x28) = 0;
      OPENSSL_sk_pop_free(*(undefined8 *)(lVar1 + 0x30),X509_free);
      *(undefined8 *)(lVar1 + 0x30) = 0;
      CRYPTO_free(*(void **)(lVar1 + 0x38));
      lVar2 = lVar2 + 0x28;
      *(undefined8 *)(lVar1 + 0x38) = 0;
      *(undefined8 *)(lVar1 + 0x40) = 0;
    } while (lVar2 != 0x168);
  }
  return;
}

