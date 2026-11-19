/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32d60
 */

OCSP_RESPONSE * d2i_OCSP_RESPONSE(OCSP_RESPONSE **a,uchar **in,long len)

{
  OCSP_RESPONSE *pOVar1;
  
  pOVar1 = d2i_OCSP_RESPONSE(a,in,len);
  return pOVar1;
}

