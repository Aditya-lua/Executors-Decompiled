/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36fd0
 */

OCSP_RESPID * d2i_OCSP_RESPID(OCSP_RESPID **a,uchar **in,long len)

{
  OCSP_RESPID *pOVar1;
  
  pOVar1 = d2i_OCSP_RESPID(a,in,len);
  return pOVar1;
}

