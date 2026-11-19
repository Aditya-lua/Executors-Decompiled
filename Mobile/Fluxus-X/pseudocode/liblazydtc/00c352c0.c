/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c352c0
 */

EVP_PKEY_ASN1_METHOD * EVP_PKEY_asn1_find_str(ENGINE **pe,char *str,int len)

{
  EVP_PKEY_ASN1_METHOD *pEVar1;
  
  pEVar1 = EVP_PKEY_asn1_find_str(pe,str,len);
  return pEVar1;
}

