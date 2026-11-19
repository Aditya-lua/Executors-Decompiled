/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aff54c
 */

void FUN_00aff54c(undefined8 param_1,BIO *param_2,int param_3,char *param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  undefined8 *puVar5;
  char *pcVar6;
  char *pcVar7;
  GENERAL_NAME *pGVar8;
  ASN1_IA5STRING *pAVar9;
  
  iVar3 = OPENSSL_sk_num();
  if (0 < iVar3) {
    BIO_printf(param_2,"%*s%s:\n",param_3,"",param_4);
  }
  iVar3 = OPENSSL_sk_num(param_1);
  if (0 < iVar3) {
    puVar5 = (undefined8 *)OPENSSL_sk_value(param_1,0);
    BIO_printf(param_2,"%*s",(ulong)(param_3 + 2U),&DAT_002ab32c);
    pGVar8 = (GENERAL_NAME *)*puVar5;
    if (pGVar8->type == 7) {
      pAVar9 = (pGVar8->d).rfc822Name;
      iVar4 = pAVar9->length;
      iVar3 = iVar4;
      if (3 < iVar4) {
        iVar3 = 4;
      }
      iVar2 = 0x10;
      if (iVar4 < 0x10) {
        iVar2 = iVar3;
      }
      pcVar6 = (char *)ossl_ipaddr_to_asc(pAVar9->data,iVar2);
      pcVar7 = (char *)ossl_ipaddr_to_asc(pAVar9->data + iVar2,iVar4 - iVar2);
      if ((pcVar6 != (char *)0x0) && (pcVar7 != (char *)0x0)) {
        BIO_printf(param_2,"IP:%s/%s",pcVar6,pcVar7);
      }
      CRYPTO_free(pcVar6);
      CRYPTO_free(pcVar7);
    }
    else {
      GENERAL_NAME_print(param_2,pGVar8);
    }
    iVar3 = OPENSSL_sk_num(param_1);
    if (1 < iVar3) {
      iVar3 = 1;
      do {
        BIO_puts(param_2,"\n");
        puVar5 = (undefined8 *)OPENSSL_sk_value(param_1,iVar3);
        BIO_printf(param_2,"%*s",(ulong)(param_3 + 2U),&DAT_002ab32c);
        pGVar8 = (GENERAL_NAME *)*puVar5;
        if (pGVar8->type == 7) {
          pAVar9 = (pGVar8->d).rfc822Name;
          iVar2 = pAVar9->length;
          iVar4 = iVar2;
          if (3 < iVar2) {
            iVar4 = 4;
          }
          iVar1 = 0x10;
          if (iVar2 < 0x10) {
            iVar1 = iVar4;
          }
          pcVar6 = (char *)ossl_ipaddr_to_asc(pAVar9->data,iVar1);
          pcVar7 = (char *)ossl_ipaddr_to_asc(pAVar9->data + iVar1,iVar2 - iVar1);
          if ((pcVar6 != (char *)0x0) && (pcVar7 != (char *)0x0)) {
            BIO_printf(param_2,"IP:%s/%s",pcVar6,pcVar7);
          }
          CRYPTO_free(pcVar6);
          CRYPTO_free(pcVar7);
        }
        else {
          GENERAL_NAME_print(param_2,pGVar8);
        }
        iVar3 = iVar3 + 1;
        iVar4 = OPENSSL_sk_num(param_1);
      } while (iVar3 < iVar4);
    }
  }
  return;
}

