/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c325a0
 */

OCSP_BASICRESP * OCSP_response_get1_basic(OCSP_RESPONSE *resp)

{
  OCSP_BASICRESP *pOVar1;
  
  pOVar1 = OCSP_response_get1_basic(resp);
  return pOVar1;
}

