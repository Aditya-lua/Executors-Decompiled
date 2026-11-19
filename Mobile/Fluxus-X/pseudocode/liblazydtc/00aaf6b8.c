/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf6b8
 */

OCSP_SIGNATURE * d2i_OCSP_SIGNATURE(OCSP_SIGNATURE **a,uchar **in,long len)

{
  OCSP_SIGNATURE *pOVar1;
  
  pOVar1 = (OCSP_SIGNATURE *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c79ef8);
  return pOVar1;
}

