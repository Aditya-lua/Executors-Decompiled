/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38110
 */

int ASN1_item_print(BIO *out,ASN1_VALUE *ifld,int indent,ASN1_ITEM *it,ASN1_PCTX *pctx)

{
  int iVar1;
  
  iVar1 = ASN1_item_print(out,ifld,indent,it,pctx);
  return iVar1;
}

