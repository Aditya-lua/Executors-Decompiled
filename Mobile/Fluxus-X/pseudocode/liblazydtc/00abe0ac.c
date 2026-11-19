/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe0ac
 */

PKCS7_ENVELOPE * d2i_PKCS7_ENVELOPE(PKCS7_ENVELOPE **a,uchar **in,long len)

{
  PKCS7_ENVELOPE *pPVar1;
  
  pPVar1 = (PKCS7_ENVELOPE *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b8e0);
  return pPVar1;
}

