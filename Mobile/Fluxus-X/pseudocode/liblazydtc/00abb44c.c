/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb44c
 */

int PKCS12_pack_authsafes(PKCS12 *p12,stack_st_PKCS7 *safes)

{
  ASN1_ITEM *it;
  ASN1_STRING *pAVar1;
  
  it = (ASN1_ITEM *)PKCS12_AUTHSAFES_it();
  pAVar1 = ASN1_item_pack(safes,it,&(p12->authsafes->d).data);
  return (int)(pAVar1 != (ASN1_STRING *)0x0);
}

