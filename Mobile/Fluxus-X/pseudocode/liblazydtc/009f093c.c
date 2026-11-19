/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f093c
 */

void EVP_PKEY_asn1_free(EVP_PKEY_ASN1_METHOD *ameth)

{
  if ((ameth == (EVP_PKEY_ASN1_METHOD *)0x0) || (((byte)ameth[8] >> 1 & 1) == 0)) {
    return;
  }
  CRYPTO_free(*(void **)(ameth + 0x10));
  CRYPTO_free(*(void **)(ameth + 0x18));
  CRYPTO_free(ameth);
  return;
}

