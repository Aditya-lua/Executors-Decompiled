/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf8d4
 */

OCSP_CERTSTATUS * d2i_OCSP_CERTSTATUS(OCSP_CERTSTATUS **a,uchar **in,long len)

{
  OCSP_CERTSTATUS *pOVar1;
  
  pOVar1 = (OCSP_CERTSTATUS *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a0f0);
  return pOVar1;
}

