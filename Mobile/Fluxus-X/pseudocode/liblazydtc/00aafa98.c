/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafa98
 */

int OCSP_request_set1_name(OCSP_REQUEST *req,X509_NAME *nm)

{
  int iVar1;
  OCSP_SIGNATURE *a;
  
  a = (OCSP_SIGNATURE *)GENERAL_NAME_new();
  iVar1 = 0;
  if (a != (OCSP_SIGNATURE *)0x0) {
    iVar1 = X509_NAME_set((X509_NAME **)&a->signature,nm);
    if (iVar1 == 0) {
      GENERAL_NAME_free((GENERAL_NAME *)a);
      iVar1 = 0;
    }
    else {
      *(undefined4 *)&a->signatureAlgorithm = 4;
      GENERAL_NAME_free((GENERAL_NAME *)req->optionalSignature);
      iVar1 = 1;
      req->optionalSignature = a;
    }
  }
  return iVar1;
}

