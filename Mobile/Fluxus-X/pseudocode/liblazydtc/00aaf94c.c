/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf94c
 */

OCSP_RESPDATA * d2i_OCSP_RESPDATA(OCSP_RESPDATA **a,uchar **in,long len)

{
  OCSP_RESPDATA *pOVar1;
  
  pOVar1 = (OCSP_RESPDATA *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a160);
  return pOVar1;
}

