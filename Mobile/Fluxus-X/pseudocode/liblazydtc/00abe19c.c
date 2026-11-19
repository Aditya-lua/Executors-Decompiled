/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe19c
 */

PKCS7_ENCRYPT * d2i_PKCS7_ENCRYPT(PKCS7_ENCRYPT **a,uchar **in,long len)

{
  PKCS7_ENCRYPT *pPVar1;
  
  pPVar1 = (PKCS7_ENCRYPT *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b9f0);
  return pPVar1;
}

