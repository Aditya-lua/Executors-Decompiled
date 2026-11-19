/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf988
 */

OCSP_BASICRESP * d2i_OCSP_BASICRESP(OCSP_BASICRESP **a,uchar **in,long len)

{
  OCSP_BASICRESP *pOVar1;
  
  pOVar1 = (OCSP_BASICRESP *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a198);
  return pOVar1;
}

