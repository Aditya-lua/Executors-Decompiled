/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf9c4
 */

OCSP_CRLID * d2i_OCSP_CRLID(OCSP_CRLID **a,uchar **in,long len)

{
  OCSP_CRLID *pOVar1;
  
  pOVar1 = (OCSP_CRLID *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a1d0);
  return pOVar1;
}

