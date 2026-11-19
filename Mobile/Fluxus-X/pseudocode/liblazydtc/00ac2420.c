/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2420
 */

stack_st_X509_ALGOR * PKCS7_get_smimecap(PKCS7_SIGNER_INFO *si)

{
  int iVar1;
  ASN1_TYPE *pAVar2;
  ASN1_ITEM *it;
  ASN1_VALUE *pAVar3;
  uchar *local_18;
  
  pAVar2 = PKCS7_get_signed_attribute(si,0xa7);
  if (pAVar2 == (ASN1_TYPE *)0x0) {
    pAVar3 = (ASN1_VALUE *)0x0;
  }
  else {
    pAVar3 = (ASN1_VALUE *)0x0;
    if (pAVar2->type == 0x10) {
      local_18 = ((pAVar2->value).asn1_string)->data;
      iVar1 = ((pAVar2->value).asn1_string)->length;
      it = (ASN1_ITEM *)X509_ALGORS_it();
      pAVar3 = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_18,(long)iVar1,it);
    }
  }
  return (stack_st_X509_ALGOR *)pAVar3;
}

