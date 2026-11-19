/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f6e14
 */

void ASN1_item_free(ASN1_VALUE *val,ASN1_ITEM *it)

{
  ASN1_VALUE *local_18;
  
  local_18 = val;
  ossl_asn1_item_embed_free(&local_18,it,0);
  return;
}

