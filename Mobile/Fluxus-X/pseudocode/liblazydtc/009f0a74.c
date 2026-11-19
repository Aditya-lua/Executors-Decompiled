/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0a74
 */

void EVP_PKEY_asn1_set_free(EVP_PKEY_ASN1_METHOD *ameth,pkey_free *pkey_free)

{
  *(pkey_free **)(ameth + 0xa8) = pkey_free;
  return;
}

