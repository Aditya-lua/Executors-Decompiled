/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf7e4
 */

OCSP_RESPBYTES * d2i_OCSP_RESPBYTES(OCSP_RESPBYTES **a,uchar **in,long len)

{
  OCSP_RESPBYTES *pOVar1;
  
  pOVar1 = (OCSP_RESPBYTES *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a010);
  return pOVar1;
}

