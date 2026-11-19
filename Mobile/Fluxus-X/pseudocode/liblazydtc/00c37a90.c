/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37a90
 */

ASN1_STRING * ASN1_item_pack(void *obj,ASN1_ITEM *it,ASN1_OCTET_STRING **oct)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = ASN1_item_pack(obj,it,oct);
  return pAVar1;
}

