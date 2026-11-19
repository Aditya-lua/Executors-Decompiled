/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf730
 */

OCSP_ONEREQ * d2i_OCSP_ONEREQ(OCSP_ONEREQ **a,uchar **in,long len)

{
  OCSP_ONEREQ *pOVar1;
  
  pOVar1 = (OCSP_ONEREQ *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c79f68);
  return pOVar1;
}

