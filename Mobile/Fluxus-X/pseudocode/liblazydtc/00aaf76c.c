/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf76c
 */

OCSP_REQINFO * d2i_OCSP_REQINFO(OCSP_REQINFO **a,uchar **in,long len)

{
  OCSP_REQINFO *pOVar1;
  
  pOVar1 = (OCSP_REQINFO *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c79fa0);
  return pOVar1;
}

