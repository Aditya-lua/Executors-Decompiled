/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf85c
 */

OCSP_RESPID * d2i_OCSP_RESPID(OCSP_RESPID **a,uchar **in,long len)

{
  OCSP_RESPID *pOVar1;
  
  pOVar1 = (OCSP_RESPID *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a080);
  return pOVar1;
}

