/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf820
 */

OCSP_RESPONSE * d2i_OCSP_RESPONSE(OCSP_RESPONSE **a,uchar **in,long len)

{
  OCSP_RESPONSE *pOVar1;
  
  pOVar1 = (OCSP_RESPONSE *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a048);
  return pOVar1;
}

