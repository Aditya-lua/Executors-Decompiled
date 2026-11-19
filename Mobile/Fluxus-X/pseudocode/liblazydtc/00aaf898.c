/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf898
 */

OCSP_REVOKEDINFO * d2i_OCSP_REVOKEDINFO(OCSP_REVOKEDINFO **a,uchar **in,long len)

{
  OCSP_REVOKEDINFO *pOVar1;
  
  pOVar1 = (OCSP_REVOKEDINFO *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a0b8);
  return pOVar1;
}

