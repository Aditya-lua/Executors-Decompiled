/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafb58
 */

int OCSP_request_sign(OCSP_REQUEST *req,X509 *signer,EVP_PKEY *key,EVP_MD *dgst,stack_st_X509 *certs
                     ,ulong flags)

{
  int iVar1;
  X509_NAME *name;
  OCSP_SIGNATURE *a;
  OCSP_REQINFO *pOVar2;
  undefined8 uVar3;
  
  name = X509_get_subject_name(signer);
  a = (OCSP_SIGNATURE *)GENERAL_NAME_new();
  if (a != (OCSP_SIGNATURE *)0x0) {
    iVar1 = X509_NAME_set((X509_NAME **)&a->signature,name);
    if (iVar1 == 0) {
      GENERAL_NAME_free((GENERAL_NAME *)a);
    }
    else {
      *(undefined4 *)&a->signatureAlgorithm = 4;
      GENERAL_NAME_free((GENERAL_NAME *)req->optionalSignature);
      req->optionalSignature = a;
      pOVar2 = (OCSP_REQINFO *)OCSP_SIGNATURE_new();
      req[2].tbsRequest = pOVar2;
      if (pOVar2 != (OCSP_REQINFO *)0x0) {
        if (key != (EVP_PKEY *)0x0) {
          iVar1 = X509_check_private_key(signer,key);
          if (iVar1 == 0) {
            ERR_new();
            ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x5e,"OCSP_request_sign");
            ERR_set_error(0x27,0x6e,0);
            goto LAB_00aafca8;
          }
          uVar3 = OCSP_REQINFO_it();
          iVar1 = ASN1_item_sign_ex(uVar3,req[2].tbsRequest,0,(req[2].tbsRequest)->requestList,req,0
                                    ,key,dgst,*(undefined8 *)signer[1].sha1_hash,
                                    *(undefined8 *)(signer[1].sha1_hash + 8));
          if (iVar1 == 0) goto LAB_00aafca8;
        }
        if ((flags & 1) != 0) {
          return 1;
        }
        pOVar2 = req[2].tbsRequest;
        if (pOVar2 == (OCSP_REQINFO *)0x0) {
          pOVar2 = (OCSP_REQINFO *)OCSP_SIGNATURE_new();
          req[2].tbsRequest = pOVar2;
          if (pOVar2 == (OCSP_REQINFO *)0x0) goto LAB_00aafca8;
        }
        if (signer != (X509 *)0x0) {
          iVar1 = ossl_x509_add_cert_new(&pOVar2->requestExtensions,signer,1);
          if (iVar1 == 0) goto LAB_00aafca8;
          pOVar2 = req[2].tbsRequest;
        }
        iVar1 = X509_add_certs(pOVar2->requestExtensions,certs,1);
        if (iVar1 != 0) {
          return 1;
        }
      }
    }
  }
LAB_00aafca8:
  OCSP_SIGNATURE_free((OCSP_SIGNATURE *)req[2].tbsRequest);
  req[2].tbsRequest = (OCSP_REQINFO *)0x0;
  return 0;
}

