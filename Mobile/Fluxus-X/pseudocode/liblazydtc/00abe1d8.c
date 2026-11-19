/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe1d8
 */

PKCS7_DIGEST * d2i_PKCS7_DIGEST(PKCS7_DIGEST **a,uchar **in,long len)

{
  PKCS7_DIGEST *pPVar1;
  
  pPVar1 = (PKCS7_DIGEST *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ba28);
  return pPVar1;
}

