/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f09f4
 */

EVP_PKEY_ASN1_METHOD * EVP_PKEY_get0_asn1(EVP_PKEY *pkey)

{
  return *(EVP_PKEY_ASN1_METHOD **)&pkey->references;
}

