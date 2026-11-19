/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af53d4
 */

long FUN_00af53d4(X509V3_EXT_METHOD *param_1,X509V3_CTX *param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  ASN1_VALUE *pAVar4;
  char *pcVar5;
  GENERAL_NAME *pGVar6;
  ASN1_OBJECT *pAVar7;
  undefined8 uVar8;
  int iVar9;
  CONF_VALUE CStack_78;
  
  iVar1 = OPENSSL_sk_num(param_3);
  lVar2 = OPENSSL_sk_new_reserve(0,iVar1);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_info.c",0x72,"v2i_AUTHORITY_INFO_ACCESS");
    ERR_set_error(0x22,0xc0100,0);
  }
  else if (0 < iVar1) {
    iVar9 = 0;
    do {
      lVar3 = OPENSSL_sk_value(param_3,iVar9);
      pAVar4 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e668);
      if (pAVar4 == (ASN1_VALUE *)0x0) {
        ERR_new();
        uVar8 = 0x78;
LAB_00af5580:
        ERR_set_debug("crypto/x509/v3_info.c",uVar8,"v2i_AUTHORITY_INFO_ACCESS");
        uVar8 = 0xc0100;
LAB_00af5590:
        ERR_set_error(0x22,uVar8,0);
LAB_00af55e4:
        OPENSSL_sk_pop_free(lVar2,ACCESS_DESCRIPTION_free);
        return 0;
      }
      OPENSSL_sk_push(lVar2,pAVar4);
      pcVar5 = strchr(*(char **)(lVar3 + 8),0x3b);
      if (pcVar5 == (char *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_info.c",0x7e,"v2i_AUTHORITY_INFO_ACCESS");
        uVar8 = 0x8f;
        goto LAB_00af5590;
      }
      CStack_78.name = pcVar5 + 1;
      CStack_78.value = *(char **)(lVar3 + 0x10);
      pGVar6 = v2i_GENERAL_NAME_ex(*(GENERAL_NAME **)(pAVar4 + 8),param_1,param_2,&CStack_78,0);
      if (pGVar6 == (GENERAL_NAME *)0x0) goto LAB_00af55e4;
      pcVar5 = (char *)CRYPTO_strndup(*(long *)(lVar3 + 8),(long)pcVar5 - *(long *)(lVar3 + 8),
                                      "crypto/x509/v3_info.c",0x85);
      if (pcVar5 == (char *)0x0) {
        ERR_new();
        uVar8 = 0x86;
        goto LAB_00af5580;
      }
      pAVar7 = OBJ_txt2obj(pcVar5,0);
      *(ASN1_OBJECT **)pAVar4 = pAVar7;
      if (pAVar7 == (ASN1_OBJECT *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_info.c",0x8b,"v2i_AUTHORITY_INFO_ACCESS");
        ERR_set_error(0x22,0x77,"value=%s",pcVar5);
        CRYPTO_free(pcVar5);
        goto LAB_00af55e4;
      }
      CRYPTO_free(pcVar5);
      iVar9 = iVar9 + 1;
    } while (iVar9 < iVar1);
  }
  return lVar2;
}

