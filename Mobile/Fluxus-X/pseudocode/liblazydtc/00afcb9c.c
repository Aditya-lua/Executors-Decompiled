/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afcb9c
 */

undefined8 FUN_00afcb9c(long *param_1,X509V3_CTX *param_2,long param_3)

{
  int iVar1;
  X509_NAME *a;
  stack_st_CONF_VALUE *dn_sk;
  ASN1_VALUE *pAVar2;
  long lVar3;
  stack_st_X509_NAME_ENTRY *psVar4;
  long lVar5;
  char *__s1;
  
  lVar5 = *(long *)(param_3 + 0x10);
  if (lVar5 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_crld.c",0x4a,"set_dist_point_name");
    ERR_set_error(0x22,0x7c,0);
    psVar4 = (stack_st_X509_NAME_ENTRY *)0x0;
    lVar5 = 0;
    goto LAB_00afcdb0;
  }
  __s1 = *(char **)(param_3 + 8);
  iVar1 = strncmp(__s1,"fullname",9);
  if (iVar1 == 0) {
    lVar5 = FUN_00afd018(param_2,lVar5);
    psVar4 = (stack_st_X509_NAME_ENTRY *)0x0;
    if (lVar5 == 0) goto LAB_00afcdb0;
    lVar3 = *param_1;
  }
  else {
    iVar1 = strcmp(__s1,"relativename");
    if (iVar1 != 0) {
      return 0;
    }
    a = X509_NAME_new();
    if (a == (X509_NAME *)0x0) {
      return 0xffffffff;
    }
    dn_sk = X509V3_get_section(param_2,*(char **)(param_3 + 0x10));
    if (dn_sk == (stack_st_CONF_VALUE *)0x0) {
      X509_NAME_free(a);
      ERR_new();
      ERR_set_debug("crypto/x509/v3_crld.c",0x5c,"set_dist_point_name");
      ERR_set_error(0x22,0x96,0);
      return 0xffffffff;
    }
    iVar1 = X509V3_NAME_from_section(a,dn_sk,0x1001);
    X509V3_section_free(param_2,dn_sk);
    psVar4 = a->entries;
    a->entries = (stack_st_X509_NAME_ENTRY *)0x0;
    X509_NAME_free(a);
    if ((iVar1 == 0) || (iVar1 = OPENSSL_sk_num(psVar4), iVar1 < 1)) {
      lVar5 = 0;
      goto LAB_00afcdb0;
    }
    iVar1 = OPENSSL_sk_num(psVar4);
    lVar5 = OPENSSL_sk_value(psVar4,iVar1 + -1);
    if (*(int *)(lVar5 + 0x10) != 0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_crld.c",0x6b,"set_dist_point_name");
      ERR_set_error(0x22,0xa1,0);
      lVar5 = 0;
      goto LAB_00afcdb0;
    }
    lVar5 = 0;
    lVar3 = *param_1;
  }
  if (lVar3 == 0) {
    pAVar2 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7f7b8);
    *param_1 = (long)pAVar2;
    if (pAVar2 != (ASN1_VALUE *)0x0) {
      if (lVar5 == 0) {
        *(undefined4 *)pAVar2 = 1;
        *(stack_st_X509_NAME_ENTRY **)(pAVar2 + 8) = psVar4;
        return 1;
      }
      *(undefined4 *)pAVar2 = 0;
      *(long *)(pAVar2 + 8) = lVar5;
      return 1;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_crld.c",0x72,"set_dist_point_name");
    ERR_set_error(0x22,0xa0,0);
  }
LAB_00afcdb0:
  OPENSSL_sk_pop_free(lVar5,GENERAL_NAME_free);
  OPENSSL_sk_pop_free(psVar4,X509_NAME_ENTRY_free);
  return 0xffffffff;
}

