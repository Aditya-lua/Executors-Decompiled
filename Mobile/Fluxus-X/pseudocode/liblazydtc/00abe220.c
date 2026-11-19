/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe220
 */

int PKCS7_print_ctx(BIO *out,PKCS7 *x,int indent,ASN1_PCTX *pctx)

{
  int iVar1;
  
  iVar1 = ASN1_item_print(out,(ASN1_VALUE *)x,indent,(ASN1_ITEM *)&DAT_00c7b7a0,pctx);
  return iVar1;
}

