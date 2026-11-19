/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe070
 */

PKCS7_ISSUER_AND_SERIAL *
d2i_PKCS7_ISSUER_AND_SERIAL(PKCS7_ISSUER_AND_SERIAL **a,uchar **in,long len)

{
  PKCS7_ISSUER_AND_SERIAL *pPVar1;
  
  pPVar1 = (PKCS7_ISSUER_AND_SERIAL *)
           ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b8a8);
  return pPVar1;
}

