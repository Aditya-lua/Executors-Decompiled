/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37b50
 */

EVP_PKEY_ASN1_METHOD * ENGINE_pkey_asn1_find_str(ENGINE **pe,char *str,int len)

{
  EVP_PKEY_ASN1_METHOD *pEVar1;
  
  pEVar1 = ENGINE_pkey_asn1_find_str(pe,str,len);
  return pEVar1;
}

