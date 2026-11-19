/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37b30
 */

EVP_PKEY_ASN1_METHOD * ENGINE_get_pkey_asn1_meth(ENGINE *e,int nid)

{
  EVP_PKEY_ASN1_METHOD *pEVar1;
  
  pEVar1 = ENGINE_get_pkey_asn1_meth(e,nid);
  return pEVar1;
}

