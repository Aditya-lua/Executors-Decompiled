/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc228
 */

long FUN_00afc228(X509V3_EXT_METHOD *param_1,X509V3_CTX *param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  CONF_VALUE *cnf;
  GENERAL_NAME *a;
  GENERAL_NAMES *a_00;
  ASN1_VALUE *pAVar5;
  ASN1_VALUE *pAVar6;
  stack_st_CONF_VALUE *section;
  long lVar7;
  int iVar8;
  char *__s1;
  
  iVar1 = OPENSSL_sk_num(param_3);
  lVar4 = OPENSSL_sk_new_reserve(0,iVar1);
  if (lVar4 == 0) {
    a = (GENERAL_NAME *)0x0;
    a_00 = (GENERAL_NAMES *)0x0;
LAB_00afc440:
    ERR_new();
    ERR_set_debug("crypto/x509/v3_crld.c",0x121,"v2i_crld");
    ERR_set_error(0x22,0xc0100,0);
LAB_00afc498:
    GENERAL_NAME_free(a);
    GENERAL_NAMES_free(a_00);
    OPENSSL_sk_pop_free(lVar4,DIST_POINT_free);
    lVar4 = 0;
  }
  else if (0 < iVar1) {
    iVar8 = 0;
    do {
      cnf = (CONF_VALUE *)OPENSSL_sk_value(param_3,iVar8);
      if (cnf->value != (char *)0x0) {
        a = v2i_GENERAL_NAME(param_1,param_2,cnf);
        if (a != (GENERAL_NAME *)0x0) {
          a_00 = GENERAL_NAMES_new();
          if ((a_00 != (GENERAL_NAMES *)0x0) && (iVar2 = OPENSSL_sk_push(a_00,a), iVar2 != 0)) {
            pAVar5 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7f820);
            if (pAVar5 != (ASN1_VALUE *)0x0) {
              OPENSSL_sk_push(lVar4,pAVar5);
              pAVar6 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7f7b8);
              *(ASN1_VALUE **)pAVar5 = pAVar6;
              if (pAVar6 != (ASN1_VALUE *)0x0) {
                *(GENERAL_NAMES **)(pAVar6 + 8) = a_00;
                **(undefined4 **)pAVar5 = 0;
                goto LAB_00afc428;
              }
            }
            a = (GENERAL_NAME *)0x0;
          }
          goto LAB_00afc440;
        }
LAB_00afc494:
        a_00 = (GENERAL_NAMES *)0x0;
        goto LAB_00afc498;
      }
      section = X509V3_get_section(param_2,cnf->name);
      if (section == (stack_st_CONF_VALUE *)0x0) {
LAB_00afc490:
        a = (GENERAL_NAME *)0x0;
        goto LAB_00afc494;
      }
      pAVar5 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7f820);
      if (pAVar5 == (ASN1_VALUE *)0x0) {
LAB_00afc474:
        ASN1_item_free(pAVar5,(ASN1_ITEM *)&DAT_00c7f820);
        X509V3_section_free(param_2,section);
        goto LAB_00afc490;
      }
      iVar2 = OPENSSL_sk_num(section);
      if (0 < iVar2) {
        iVar2 = 0;
        do {
          lVar7 = OPENSSL_sk_value(section,iVar2);
          iVar3 = FUN_00afcb9c(pAVar5,param_2,lVar7);
          if (iVar3 < 1) {
            if (iVar3 < 0) goto LAB_00afc474;
            __s1 = *(char **)(lVar7 + 8);
            iVar3 = strcmp(__s1,"reasons");
            if (iVar3 == 0) {
              iVar3 = FUN_00afcdf8(pAVar5 + 8,*(undefined8 *)(lVar7 + 0x10));
              if (iVar3 == 0) goto LAB_00afc474;
            }
            else {
              iVar3 = strcmp(__s1,"CRLissuer");
              if (iVar3 == 0) {
                lVar7 = FUN_00afd018(param_2,*(undefined8 *)(lVar7 + 0x10));
                *(long *)(pAVar5 + 0x10) = lVar7;
                if (lVar7 == 0) goto LAB_00afc474;
              }
            }
          }
          iVar2 = iVar2 + 1;
          iVar3 = OPENSSL_sk_num(section);
        } while (iVar2 < iVar3);
      }
      X509V3_section_free(param_2,section);
      OPENSSL_sk_push(lVar4,pAVar5);
LAB_00afc428:
      iVar8 = iVar8 + 1;
    } while (iVar8 < iVar1);
  }
  return lVar4;
}

