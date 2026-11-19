/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf910
 */

OCSP_SINGLERESP * d2i_OCSP_SINGLERESP(OCSP_SINGLERESP **a,uchar **in,long len)

{
  OCSP_SINGLERESP *pOVar1;
  
  pOVar1 = (OCSP_SINGLERESP *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a128);
  return pOVar1;
}

