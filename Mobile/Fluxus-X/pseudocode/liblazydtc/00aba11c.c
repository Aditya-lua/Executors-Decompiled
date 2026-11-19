/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba11c
 */

PKCS12 * d2i_PKCS12(PKCS12 **a,uchar **in,long len)

{
  PKCS12 *pPVar1;
  
  pPVar1 = (PKCS12 *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7b088);
  return pPVar1;
}

