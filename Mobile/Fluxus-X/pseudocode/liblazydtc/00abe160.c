/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe160
 */

PKCS7_SIGN_ENVELOPE * d2i_PKCS7_SIGN_ENVELOPE(PKCS7_SIGN_ENVELOPE **a,uchar **in,long len)

{
  PKCS7_SIGN_ENVELOPE *pPVar1;
  
  pPVar1 = (PKCS7_SIGN_ENVELOPE *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b9b8);
  return pPVar1;
}

