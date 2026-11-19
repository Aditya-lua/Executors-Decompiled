/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1b50
 */

int OCSP_RESPONSE_print(BIO *bp,OCSP_RESPONSE *o,ulong flags)

{
  int iVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  OCSP_BASICRESP *a;
  long lVar5;
  undefined8 *puVar6;
  ASN1_ENUMERATED *a_00;
  X509 *pXVar7;
  char *pcVar8;
  OCSP_RESPBYTES *pOVar9;
  uint *puVar10;
  undefined8 *puVar11;
  
  pOVar9 = o->responseBytes;
  iVar1 = BIO_puts(bp,"OCSP Response Data:\n");
  if (0 < iVar1) {
    uVar4 = ASN1_ENUMERATED_get(o->responseStatus);
    if ((uVar4 < 7) && ((0x6fU >> (ulong)((uint)uVar4 & 0x1f) & 1) != 0)) {
      pcVar8 = *(char **)((&PTR_DAT_00c7ac00)[uVar4] + 8);
    }
    else {
      pcVar8 = "(UNKNOWN)";
    }
    iVar1 = BIO_printf(bp,"    OCSP Response Status: %s (0x%lx)\n",pcVar8,uVar4);
    if (0 < iVar1) {
      if (pOVar9 == (OCSP_RESPBYTES *)0x0) {
        return 1;
      }
      iVar1 = BIO_puts(bp,"    Response Type: ");
      if ((0 < iVar1) && (iVar1 = i2a_ASN1_OBJECT(bp,pOVar9->responseType), 0 < iVar1)) {
        iVar1 = OBJ_obj2nid(pOVar9->responseType);
        if (iVar1 != 0x16d) {
          BIO_puts(bp," (unknown response type)\n");
          return 1;
        }
        a = OCSP_response_get1_basic(o);
        if (a != (OCSP_BASICRESP *)0x0) {
          uVar4 = ASN1_INTEGER_get((ASN1_INTEGER *)a->tbsResponseData);
          iVar1 = BIO_printf(bp,"\n    Version: %lu (0x%lx)\n",uVar4 + 1,uVar4);
          if ((0 < iVar1) && (iVar1 = BIO_puts(bp,"    Responder Id: "), 0 < iVar1)) {
            if (*(int *)&a->signatureAlgorithm == 1) {
              i2a_ASN1_STRING(bp,a->signature,0);
            }
            else if (*(int *)&a->signatureAlgorithm == 0) {
              X509_NAME_print_ex(bp,(X509_NAME *)a->signature,0,0x82031f);
            }
            iVar1 = BIO_printf(bp,"\n    Produced At: ");
            if (((0 < iVar1) &&
                (iVar1 = ASN1_GENERALIZEDTIME_print(bp,(ASN1_GENERALIZEDTIME *)a->certs), iVar1 != 0
                )) && (iVar1 = BIO_printf(bp,"\n    Responses:\n"), 0 < iVar1)) {
              iVar1 = OPENSSL_sk_num(a[1].tbsResponseData);
              if (0 < iVar1) {
                iVar1 = 0;
                do {
                  lVar5 = OPENSSL_sk_value(a[1].tbsResponseData,iVar1);
                  if (lVar5 != 0) {
                    puVar6 = (undefined8 *)OPENSSL_sk_value(a[1].tbsResponseData,iVar1);
                    FUN_00ab1a58(bp,*puVar6,4);
                    puVar10 = (uint *)puVar6[1];
                    pcVar8 = "(UNKNOWN)";
                    if (*puVar10 < 3) {
                      pcVar8 = *(char **)((&PTR_DAT_00c7ac40)[(int)*puVar10] + 8);
                    }
                    iVar2 = BIO_printf(bp,"    Cert Status: %s",pcVar8);
                    if (iVar2 < 1) goto LAB_00ab1fc0;
                    if (*puVar10 == 1) {
                      puVar11 = *(undefined8 **)(puVar10 + 2);
                      iVar2 = BIO_printf(bp,"\n    Revocation Time: ");
                      if ((iVar2 < 1) ||
                         (iVar2 = ASN1_GENERALIZEDTIME_print(bp,(ASN1_GENERALIZEDTIME *)*puVar11),
                         iVar2 == 0)) goto LAB_00ab1fc0;
                      a_00 = (ASN1_ENUMERATED *)puVar11[1];
                      if (a_00 != (ASN1_ENUMERATED *)0x0) {
                        uVar4 = ASN1_ENUMERATED_get(a_00);
                        pcVar8 = "(UNKNOWN)";
                        if ((uVar4 < 9) &&
                           (pcVar8 = "(UNKNOWN)", (0x17fU >> (ulong)((uint)uVar4 & 0x1f) & 1) != 0))
                        {
                          pcVar8 = *(char **)((&PTR_DAT_00c7ac60)[uVar4] + 8);
                        }
                        iVar2 = BIO_printf(bp,"\n    Revocation Reason: %s (0x%lx)",pcVar8,uVar4);
                        if (iVar2 < 1) goto LAB_00ab1fc0;
                      }
                    }
                    iVar2 = BIO_printf(bp,"\n    This Update: ");
                    if (((((iVar2 < 1) ||
                          (iVar2 = ASN1_GENERALIZEDTIME_print(bp,(ASN1_GENERALIZEDTIME *)puVar6[2]),
                          iVar2 == 0)) ||
                         ((puVar6[3] != 0 &&
                          ((iVar2 = BIO_printf(bp,"\n    Next Update: "), iVar2 < 1 ||
                           (iVar2 = ASN1_GENERALIZEDTIME_print(bp,(ASN1_GENERALIZEDTIME *)puVar6[3])
                           , iVar2 == 0)))))) || (iVar2 = BIO_write(bp,&DAT_002c4dae,1), iVar2 < 1))
                       || ((iVar2 = X509V3_extensions_print
                                              (bp,"Response Single Extensions",
                                               (stack_st_X509_EXTENSION *)puVar6[4],flags,8),
                           iVar2 == 0 || (iVar2 = BIO_write(bp,&DAT_002c4dae,1), iVar2 < 1))))
                    goto LAB_00ab1fc0;
                  }
                  iVar1 = iVar1 + 1;
                  iVar2 = OPENSSL_sk_num(a[1].tbsResponseData);
                } while (iVar1 < iVar2);
              }
              iVar1 = X509V3_extensions_print
                                (bp,"Response Extensions",
                                 (stack_st_X509_EXTENSION *)a[1].signatureAlgorithm,flags,4);
              if ((iVar1 != 0) &&
                 (iVar1 = X509_signature_print
                                    (bp,(X509_ALGOR *)&a[1].signature,
                                     (ASN1_STRING *)a[2].tbsResponseData), 0 < iVar1)) {
                iVar1 = OPENSSL_sk_num(a[2].signatureAlgorithm);
                if (iVar1 < 1) {
                  iVar1 = 1;
                }
                else {
                  iVar2 = 0;
                  iVar1 = 1;
                  do {
                    pXVar7 = (X509 *)OPENSSL_sk_value(a[2].signatureAlgorithm,iVar2);
                    X509_print(bp,pXVar7);
                    pXVar7 = (X509 *)OPENSSL_sk_value(a[2].signatureAlgorithm,iVar2);
                    PEM_write_bio_X509(bp,pXVar7);
                    iVar2 = iVar2 + 1;
                    iVar3 = OPENSSL_sk_num(a[2].signatureAlgorithm);
                  } while (iVar2 < iVar3);
                }
                goto LAB_00ab1cac;
              }
            }
          }
        }
LAB_00ab1fc0:
        iVar1 = 0;
        goto LAB_00ab1cac;
      }
    }
  }
  iVar1 = 0;
  a = (OCSP_BASICRESP *)0x0;
LAB_00ab1cac:
  OCSP_BASICRESP_free(a);
  return iVar1;
}

