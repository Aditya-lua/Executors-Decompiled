/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f036c
 */

EVP_PKEY_ASN1_METHOD * EVP_PKEY_asn1_get0(int idx)

{
  EVP_PKEY_ASN1_METHOD *pEVar1;
  
  if (idx < 0) {
    return (EVP_PKEY_ASN1_METHOD *)0x0;
  }
  if (idx < 0x10) {
    return *(EVP_PKEY_ASN1_METHOD **)(&DAT_00cc8608 + (long)idx * 8);
  }
  pEVar1 = (EVP_PKEY_ASN1_METHOD *)OPENSSL_sk_value(DAT_00d218e0,idx + -0x10);
  return pEVar1;
}

