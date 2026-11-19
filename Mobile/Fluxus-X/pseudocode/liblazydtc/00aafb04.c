/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafb04
 */

int OCSP_request_add1_cert(OCSP_REQUEST *req,X509 *cert)

{
  int iVar1;
  OCSP_REQINFO *pOVar2;
  
  pOVar2 = req[2].tbsRequest;
  if (pOVar2 == (OCSP_REQINFO *)0x0) {
    pOVar2 = (OCSP_REQINFO *)OCSP_SIGNATURE_new();
    req[2].tbsRequest = pOVar2;
    if (pOVar2 == (OCSP_REQINFO *)0x0) {
      return 0;
    }
  }
  if (cert == (X509 *)0x0) {
    return 1;
  }
  iVar1 = ossl_x509_add_cert_new(&pOVar2->requestExtensions,cert,1);
  return iVar1;
}

