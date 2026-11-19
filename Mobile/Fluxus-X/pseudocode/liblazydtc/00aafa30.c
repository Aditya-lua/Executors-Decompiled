/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafa30
 */

OCSP_ONEREQ * OCSP_request_add0_id(OCSP_REQUEST *req,OCSP_CERTID *cid)

{
  int iVar1;
  OCSP_ONEREQ *a;
  
  a = OCSP_ONEREQ_new();
  if (a != (OCSP_ONEREQ *)0x0) {
    OCSP_CERTID_free(a->reqCert);
    a->reqCert = cid;
    if ((req != (OCSP_REQUEST *)0x0) && (iVar1 = OPENSSL_sk_push(req[1].tbsRequest,a), iVar1 == 0))
    {
      a->reqCert = (OCSP_CERTID *)0x0;
      OCSP_ONEREQ_free(a);
      a = (OCSP_ONEREQ *)0x0;
    }
  }
  return a;
}

