/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c35870
 */

OCSP_SINGLERESP * OCSP_resp_get0(OCSP_BASICRESP *bs,int idx)

{
  OCSP_SINGLERESP *pOVar1;
  
  pOVar1 = OCSP_resp_get0(bs,idx);
  return pOVar1;
}

