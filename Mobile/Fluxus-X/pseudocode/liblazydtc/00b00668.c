/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00668
 */

PROXY_CERT_INFO_EXTENSION * FUN_00b00668(undefined8 param_1,X509V3_CTX *param_2,char *param_3)

{
  ASN1_OBJECT *pAVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  stack_st_CONF_VALUE *psVar6;
  undefined8 *puVar7;
  stack_st_CONF_VALUE *section;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  char *pcVar11;
  PROXY_POLICY *pPVar12;
  PROXY_CERT_INFO_EXTENSION *pPVar13;
  ASN1_OCTET_STRING *local_50;
  ASN1_STRING *local_48;
  ASN1_OBJECT *local_38;
  
  local_38 = (ASN1_OBJECT *)0x0;
  local_50 = (ASN1_OCTET_STRING *)0x0;
  local_48 = (ASN1_INTEGER *)0x0;
  psVar6 = X509V3_parse_list(param_3);
  iVar2 = OPENSSL_sk_num();
  if (iVar2 < 1) {
LAB_00b007bc:
    ERR_new();
    ERR_set_debug("crypto/x509/v3_pci.c",0x11f,"r2i_pci");
    uVar8 = 0x9a;
  }
  else {
    iVar2 = 0;
    do {
      puVar7 = (undefined8 *)OPENSSL_sk_value(psVar6,iVar2);
      pcVar11 = (char *)puVar7[1];
      if (pcVar11 == (char *)0x0) {
LAB_00b007f0:
        ERR_new();
        ERR_set_debug("crypto/x509/v3_pci.c",0xfe,"r2i_pci");
        ERR_set_error(0x22,0x99,0);
        uVar8 = *puVar7;
        uVar9 = puVar7[1];
        uVar10 = puVar7[2];
LAB_00b0085c:
        ERR_add_error_data(6,"section:",uVar8,",name:",uVar9,",value:",uVar10);
        goto LAB_00b0087c;
      }
      if (*pcVar11 == '@') {
        section = X509V3_get_section(param_2,pcVar11 + 1);
        if (section == (stack_st_CONF_VALUE *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/x509/v3_pci.c",0x108,"r2i_pci");
          ERR_set_error(0x22,0x87,0);
LAB_00b00854:
          uVar8 = *puVar7;
          uVar9 = puVar7[1];
          uVar10 = puVar7[2];
          goto LAB_00b0085c;
        }
        iVar4 = 0;
        while (iVar3 = OPENSSL_sk_num(section), iVar4 < iVar3) {
          uVar8 = OPENSSL_sk_value(section,iVar4);
          iVar3 = FUN_00b00934(uVar8,&local_38,&local_48,&local_50);
          iVar4 = iVar4 + 1;
          if (iVar3 == 0) {
            X509V3_section_free(param_2,section);
            goto LAB_00b0087c;
          }
        }
        X509V3_section_free(param_2,section);
      }
      else {
        if (puVar7[2] == 0) goto LAB_00b007f0;
        iVar4 = FUN_00b00934(puVar7,&local_38,&local_48,&local_50);
        if (iVar4 == 0) goto LAB_00b00854;
      }
      iVar2 = iVar2 + 1;
      iVar4 = OPENSSL_sk_num(psVar6);
      pAVar1 = local_38;
    } while (iVar2 < iVar4);
    if (local_38 == (ASN1_OBJECT *)0x0) goto LAB_00b007bc;
    uVar5 = OBJ_obj2nid(local_38);
    if (((uVar5 | 2) == 0x29b) && (local_50 != (ASN1_OCTET_STRING *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",0x125,"r2i_pci");
      uVar8 = 0x9f;
    }
    else {
      pPVar13 = PROXY_CERT_INFO_EXTENSION_new();
      if (pPVar13 != (PROXY_CERT_INFO_EXTENSION *)0x0) {
        pPVar12 = pPVar13->proxyPolicy;
        pPVar12->policyLanguage = pAVar1;
        local_38 = (ASN1_OBJECT *)0x0;
        pPVar12->policy = local_50;
        local_50 = (ASN1_OCTET_STRING *)0x0;
        pPVar13->pcPathLengthConstraint = local_48;
        local_48 = (ASN1_STRING *)0x0;
        goto LAB_00b008a8;
      }
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",299,"r2i_pci");
      uVar8 = 0xc0100;
    }
  }
  ERR_set_error(0x22,uVar8,0);
LAB_00b0087c:
  ASN1_OBJECT_free(local_38);
  ASN1_INTEGER_free(local_48);
  local_48 = (ASN1_STRING *)0x0;
  ASN1_OCTET_STRING_free(local_50);
  local_50 = (ASN1_OCTET_STRING *)0x0;
  PROXY_CERT_INFO_EXTENSION_free((PROXY_CERT_INFO_EXTENSION *)0x0);
  pPVar13 = (PROXY_CERT_INFO_EXTENSION *)0x0;
LAB_00b008a8:
  OPENSSL_sk_pop_free(psVar6,X509V3_conf_free);
  return pPVar13;
}

