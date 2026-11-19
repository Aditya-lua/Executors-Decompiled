/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32560
 */

OCSP_CERTID * OCSP_cert_to_id(EVP_MD *dgst,X509 *subject,X509 *issuer)

{
  OCSP_CERTID *pOVar1;
  
  pOVar1 = OCSP_cert_to_id(dgst,subject,issuer);
  return pOVar1;
}

