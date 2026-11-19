/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37b20
 */

EVP_PKEY_ASN1_METHOD * EVP_PKEY_asn1_find(ENGINE **pe,int type)

{
  EVP_PKEY_ASN1_METHOD *pEVar1;
  
  pEVar1 = EVP_PKEY_asn1_find(pe,type);
  return pEVar1;
}

