/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba1d0
 */

PKCS12_SAFEBAG * d2i_PKCS12_SAFEBAG(PKCS12_SAFEBAG **a,uchar **in,long len)

{
  PKCS12_SAFEBAG *pPVar1;
  
  pPVar1 = (PKCS12_SAFEBAG *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b130);
  return pPVar1;
}

