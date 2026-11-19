/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f22cc
 */

void * ASN1_item_unpack(ASN1_STRING *oct,ASN1_ITEM *it)

{
  ASN1_VALUE *pAVar1;
  uchar *local_18;
  
  local_18 = oct->data;
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_18,(long)oct->length,it);
  if (pAVar1 == (ASN1_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn_pack.c",0x3c,"ASN1_item_unpack");
    ERR_set_error(0xd,0x6e,0);
  }
  return pAVar1;
}

