/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba194
 */

PKCS12_BAGS * d2i_PKCS12_BAGS(PKCS12_BAGS **a,uchar **in,long len)

{
  PKCS12_BAGS *pPVar1;
  
  pPVar1 = (PKCS12_BAGS *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b0f8);
  return pPVar1;
}

