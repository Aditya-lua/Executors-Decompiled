/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf7a8
 */

OCSP_REQUEST * d2i_OCSP_REQUEST(OCSP_REQUEST **a,uchar **in,long len)

{
  OCSP_REQUEST *pOVar1;
  
  pOVar1 = (OCSP_REQUEST *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c79fd8);
  return pOVar1;
}

