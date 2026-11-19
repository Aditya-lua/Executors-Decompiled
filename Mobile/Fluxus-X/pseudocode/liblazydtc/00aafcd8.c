/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafcd8
 */

int OCSP_response_status(OCSP_RESPONSE *resp)

{
  long lVar1;
  
  lVar1 = ASN1_ENUMERATED_get(resp->responseStatus);
  return (int)lVar1;
}

