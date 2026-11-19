/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8e44
 */

void X509_PKEY_free(X509_PKEY *a)

{
  if (a == (X509_PKEY *)0x0) {
    return;
  }
  X509_ALGOR_free(a->enc_algor);
  ASN1_OCTET_STRING_free(a->enc_pkey);
  EVP_PKEY_free(a->dec_pkey);
  if (a->key_free != 0) {
    CRYPTO_free(a->key_data);
  }
  CRYPTO_free(a);
  return;
}

