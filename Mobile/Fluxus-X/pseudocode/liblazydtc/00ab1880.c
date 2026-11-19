/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1880
 */

int OCSP_REQUEST_print(BIO *bp,OCSP_REQUEST *a,ulong flags)

{
  int iVar1;
  int iVar2;
  ulong param3;
  undefined8 *puVar3;
  X509 *pXVar4;
  OCSP_REQINFO *alg;
  
  alg = a[2].tbsRequest;
  iVar1 = BIO_write(bp,"OCSP Request Data:\n",0x13);
  if (0 < iVar1) {
    param3 = ASN1_INTEGER_get((ASN1_INTEGER *)a->tbsRequest);
    iVar1 = BIO_printf(bp,"    Version: %lu (0x%lx)",param3 + 1,param3);
    if (0 < iVar1) {
      if (a->optionalSignature != (OCSP_SIGNATURE *)0x0) {
        iVar1 = BIO_write(bp,"\n    Requestor Name: ",0x15);
        if (iVar1 < 1) {
          return 0;
        }
        GENERAL_NAME_print(bp,(GENERAL_NAME *)a->optionalSignature);
      }
      iVar1 = BIO_write(bp,"\n    Requestor List:\n",0x15);
      if (0 < iVar1) {
        iVar1 = OPENSSL_sk_num(a[1].tbsRequest);
        if (0 < iVar1) {
          iVar1 = 0;
          do {
            puVar3 = (undefined8 *)OPENSSL_sk_value(a[1].tbsRequest,iVar1);
            FUN_00ab1a58(bp,*puVar3,8);
            iVar2 = X509V3_extensions_print
                              (bp,"Request Single Extensions",(stack_st_X509_EXTENSION *)puVar3[1],
                               flags,8);
            if (iVar2 == 0) {
              return 0;
            }
            iVar1 = iVar1 + 1;
            iVar2 = OPENSSL_sk_num(a[1].tbsRequest);
          } while (iVar1 < iVar2);
        }
        iVar1 = X509V3_extensions_print
                          (bp,"Request Extensions",(stack_st_X509_EXTENSION *)a[1].optionalSignature
                           ,flags,4);
        if (iVar1 == 0) {
          return 0;
        }
        if (alg != (OCSP_REQINFO *)0x0) {
          X509_signature_print(bp,(X509_ALGOR *)alg,(ASN1_STRING *)alg->requestList);
          iVar1 = OPENSSL_sk_num(alg->requestExtensions);
          if (0 < iVar1) {
            iVar1 = 0;
            do {
              pXVar4 = (X509 *)OPENSSL_sk_value(alg->requestExtensions,iVar1);
              X509_print(bp,pXVar4);
              pXVar4 = (X509 *)OPENSSL_sk_value(alg->requestExtensions,iVar1);
              PEM_write_bio_X509(bp,pXVar4);
              iVar1 = iVar1 + 1;
              iVar2 = OPENSSL_sk_num(alg->requestExtensions);
            } while (iVar1 < iVar2);
            return 1;
          }
        }
        return 1;
      }
    }
  }
  return 0;
}

