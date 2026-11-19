/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03974
 */

long FUN_00b03974(X509V3_EXT_METHOD *param_1,X509V3_CTX *param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  X509_EXTENSION *ext;
  void *pvVar5;
  undefined8 uVar6;
  CONF_VALUE *cnf;
  GENERAL_NAME *pGVar7;
  int iVar8;
  
  iVar1 = OPENSSL_sk_num(param_3);
  lVar4 = OPENSSL_sk_new_reserve(0,iVar1);
  if (lVar4 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x136,"v2i_issuer_alt");
    ERR_set_error(0x22,0xc0100,0);
    OPENSSL_sk_free(0);
  }
  else if (0 < iVar1) {
    iVar8 = 0;
    do {
      cnf = (CONF_VALUE *)OPENSSL_sk_value(param_3,iVar8);
      iVar3 = ossl_v3_name_cmp(cnf->name,"issuer");
      if (((iVar3 == 0) && (cnf->value != (char *)0x0)) &&
         (iVar3 = strcmp(cnf->value,"copy"), iVar3 == 0)) {
        if (param_2 == (X509V3_CTX *)0x0) {
LAB_00b03b20:
          ERR_new();
          ERR_set_debug("crypto/x509/v3_san.c",0x15b,"copy_issuer");
          uVar6 = 0x7f;
        }
        else {
          if ((param_2->flags & 1) != 0) goto LAB_00b03ad4;
          if (param_2->issuer_cert == (X509 *)0x0) goto LAB_00b03b20;
          iVar3 = X509_get_ext_by_NID(param_2->issuer_cert,0x55,-1);
          if (iVar3 < 0) goto LAB_00b03ad4;
          ext = X509_get_ext(param_2->issuer_cert,iVar3);
          if ((ext == (X509_EXTENSION *)0x0) ||
             (pvVar5 = X509V3_EXT_d2i(ext), pvVar5 == (void *)0x0)) {
            ERR_new();
            ERR_set_debug("crypto/x509/v3_san.c",0x163,"copy_issuer");
            uVar6 = 0x7e;
          }
          else {
            iVar3 = OPENSSL_sk_num();
            iVar2 = OPENSSL_sk_reserve(lVar4,iVar3);
            if (iVar2 != 0) {
              if (0 < iVar3) {
                iVar2 = 0;
                do {
                  uVar6 = OPENSSL_sk_value(pvVar5,iVar2);
                  OPENSSL_sk_push(lVar4,uVar6);
                  iVar2 = iVar2 + 1;
                } while (iVar3 != iVar2);
              }
              OPENSSL_sk_free(pvVar5);
              goto LAB_00b03ad4;
            }
            ERR_new();
            ERR_set_debug("crypto/x509/v3_san.c",0x169,"copy_issuer");
            uVar6 = 0xc0100;
          }
        }
        ERR_set_error(0x22,uVar6,0);
LAB_00b03ba0:
        OPENSSL_sk_pop_free(lVar4,GENERAL_NAME_free);
        return 0;
      }
      pGVar7 = v2i_GENERAL_NAME_ex((GENERAL_NAME *)0x0,param_1,param_2,cnf,0);
      if (pGVar7 == (GENERAL_NAME *)0x0) goto LAB_00b03ba0;
      OPENSSL_sk_push(lVar4,pGVar7);
LAB_00b03ad4:
      iVar8 = iVar8 + 1;
    } while (iVar8 < iVar1);
  }
  return lVar4;
}

