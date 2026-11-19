/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b037dc
 */

long FUN_00b037dc(X509V3_EXT_METHOD *param_1,X509V3_CTX *param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  long lVar3;
  CONF_VALUE *cnf;
  GENERAL_NAME *pGVar4;
  int iVar5;
  
  iVar1 = OPENSSL_sk_num(param_3);
  lVar3 = OPENSSL_sk_new_reserve(0,iVar1);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x185,"v2i_subject_alt");
    ERR_set_error(0x22,0xc0100,0);
    OPENSSL_sk_free(0);
  }
  else if (0 < iVar1) {
    iVar5 = 0;
    do {
      cnf = (CONF_VALUE *)OPENSSL_sk_value(param_3,iVar5);
      iVar2 = ossl_v3_name_cmp(cnf->name,"email");
      if (((iVar2 == 0) && (cnf->value != (char *)0x0)) &&
         (iVar2 = strcmp(cnf->value,"copy"), iVar2 == 0)) {
        iVar2 = FUN_00b04730(param_2,lVar3,0);
joined_r0x00b03900:
        if (iVar2 == 0) {
LAB_00b03904:
          OPENSSL_sk_pop_free(lVar3,GENERAL_NAME_free);
          return 0;
        }
      }
      else {
        iVar2 = ossl_v3_name_cmp(cnf->name,"email");
        if (((iVar2 == 0) && (cnf->value != (char *)0x0)) &&
           (iVar2 = strcmp(cnf->value,"move"), iVar2 == 0)) {
          iVar2 = FUN_00b04730(param_2,lVar3,1);
          goto joined_r0x00b03900;
        }
        pGVar4 = v2i_GENERAL_NAME_ex((GENERAL_NAME *)0x0,param_1,param_2,cnf,0);
        if (pGVar4 == (GENERAL_NAME *)0x0) goto LAB_00b03904;
        OPENSSL_sk_push(lVar3,pGVar4);
      }
      iVar5 = iVar5 + 1;
    } while (iVar5 < iVar1);
  }
  return lVar3;
}

