/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe124
 */

PKCS7_ENC_CONTENT * d2i_PKCS7_ENC_CONTENT(PKCS7_ENC_CONTENT **a,uchar **in,long len)

{
  PKCS7_ENC_CONTENT *pPVar1;
  
  pPVar1 = (PKCS7_ENC_CONTENT *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b980);
  return pPVar1;
}

