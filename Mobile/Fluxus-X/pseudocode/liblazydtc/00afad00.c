/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afad00
 */

long FUN_00afad00(undefined8 param_1,X509V3_CTX *param_2,char *param_3)

{
  undefined4 uVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  stack_st_CONF_VALUE *psVar8;
  long lVar9;
  long lVar10;
  stack_st_CONF_VALUE *section;
  ASN1_VALUE *val;
  undefined8 *puVar11;
  stack_st_CONF_VALUE *section_00;
  ASN1_VALUE *pAVar12;
  ASN1_OBJECT *pAVar13;
  ASN1_VALUE *pAVar14;
  ASN1_IA5STRING *str;
  stack_st_CONF_VALUE *psVar15;
  ASN1_INTEGER *a;
  char *pcVar16;
  size_t sVar17;
  undefined8 uVar18;
  int iVar19;
  int iVar20;
  long *plVar21;
  char *pcVar22;
  ASN1_VALUE *pAVar23;
  ASN1_STRING *pAVar24;
  int iVar25;
  undefined8 uVar26;
  
  psVar8 = X509V3_parse_list(param_3);
  iVar3 = OPENSSL_sk_num();
  if (psVar8 == (stack_st_CONF_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_cpols.c",0x66,"r2i_certpol");
    ERR_set_error(0x22,0x80022,0);
  }
  else {
    lVar9 = OPENSSL_sk_new_reserve(0,iVar3);
    if (lVar9 != 0) {
      if (0 < iVar3) {
        bVar2 = false;
        iVar25 = 0;
        do {
          lVar10 = OPENSSL_sk_value(psVar8,iVar25);
          if ((*(long *)(lVar10 + 0x10) != 0) ||
             (pcVar22 = *(char **)(lVar10 + 8), pcVar22 == (char *)0x0)) {
            ERR_new();
            ERR_set_debug("crypto/x509/v3_cpols.c",0x74,"r2i_certpol");
            ERR_set_error(0x22,0x86,0);
            ERR_add_error_data(4,"name=",*(undefined8 *)(lVar10 + 8),", value=",
                               *(undefined8 *)(lVar10 + 0x10));
            goto LAB_00afb7d8;
          }
          iVar4 = strcmp(pcVar22,"ia5org");
          if (iVar4 != 0) {
            if (*pcVar22 == '@') {
              section = X509V3_get_section(param_2,pcVar22 + 1);
              if (section != (stack_st_CONF_VALUE *)0x0) {
                val = ASN1_item_new((ASN1_ITEM *)&DAT_00c7ef68);
                if (val == (ASN1_VALUE *)0x0) {
LAB_00afb78c:
                  ERR_new();
                  ERR_set_debug("crypto/x509/v3_cpols.c",0xf0,"policy_section");
                  uVar26 = 0xc0100;
                }
                else {
                  iVar4 = OPENSSL_sk_num(section);
                  if (0 < iVar4) {
                    iVar4 = 0;
                    iVar19 = 0x1a;
                    if (bVar2) {
                      iVar19 = 0x16;
                    }
                    do {
                      puVar11 = (undefined8 *)OPENSSL_sk_value(section,iVar4);
                      pcVar22 = (char *)puVar11[1];
                      iVar5 = strcmp(pcVar22,"policyIdentifier");
                      if (iVar5 == 0) {
                        pAVar13 = OBJ_txt2obj((char *)puVar11[2],0);
                        if (pAVar13 == (ASN1_OBJECT *)0x0) {
                          ERR_new();
                          ERR_set_debug("crypto/x509/v3_cpols.c",0xb6,"policy_section");
                          uVar26 = 0x6e;
                          goto LAB_00afb620;
                        }
                        *(ASN1_OBJECT **)val = pAVar13;
                      }
                      else {
                        iVar5 = ossl_v3_name_cmp(pcVar22,&DAT_002c24f9);
                        if (iVar5 != 0) {
                          iVar5 = ossl_v3_name_cmp(puVar11[1],"userNotice");
                          if (iVar5 == 0) {
                            if (*(char *)puVar11[2] == '@') {
                              section_00 = X509V3_get_section(param_2,(char *)puVar11[2] + 1);
                              if (section_00 != (stack_st_CONF_VALUE *)0x0) {
                                pAVar12 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7efa0);
                                if (pAVar12 == (ASN1_VALUE *)0x0) {
LAB_00afb6e0:
                                  ERR_new();
                                  ERR_set_debug("crypto/x509/v3_cpols.c",0x16d,"notice_section");
                                  uVar1 = 0xc0100;
LAB_00afb708:
                                  ERR_set_error(0x22,uVar1,0);
                                }
                                else {
                                  pAVar13 = OBJ_nid2obj(0xa5);
                                  *(ASN1_OBJECT **)pAVar12 = pAVar13;
                                  if (pAVar13 == (ASN1_OBJECT *)0x0) {
                                    ERR_new();
                                    ERR_set_debug("crypto/x509/v3_cpols.c",0x125,"notice_section");
                                    uVar1 = 0xc0103;
                                    goto LAB_00afb708;
                                  }
                                  pAVar14 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7efd8);
                                  if (pAVar14 == (ASN1_VALUE *)0x0) goto LAB_00afb6e0;
                                  *(ASN1_VALUE **)(pAVar12 + 8) = pAVar14;
                                  iVar5 = OPENSSL_sk_num(section_00);
                                  if (0 < iVar5) {
                                    iVar5 = 0;
                                    do {
                                      lVar10 = OPENSSL_sk_value(section_00,iVar5);
                                      pcVar16 = *(char **)(lVar10 + 8);
                                      pcVar22 = *(char **)(lVar10 + 0x10);
                                      iVar6 = strcmp(pcVar16,"explicitText");
                                      if (iVar6 == 0) {
                                        pcVar16 = strchr(pcVar22,0x3a);
                                        iVar6 = 0x1a;
                                        if (pcVar16 == (char *)0x0) {
                                          iVar7 = 0;
                                        }
                                        else {
                                          iVar20 = (int)pcVar16 - (int)pcVar22;
                                          iVar7 = 0;
                                          if (iVar20 != -1) {
                                            if (iVar20 - 3U < 0xb) {
                                              sVar17 = (size_t)iVar20;
                                              switch(iVar20) {
                                              case 3:
                                                iVar6 = strncmp(pcVar22,"BMP",sVar17);
                                                if (iVar6 == 0) {
                                                  iVar6 = 0x1e;
                                                  iVar7 = 3;
                                                  goto LAB_00afb1dc;
                                                }
                                                break;
                                              case 4:
                                                iVar6 = strncmp(pcVar22,"UTF8",sVar17);
                                                if (iVar6 == 0) {
                                                  iVar6 = 0xc;
                                                  iVar7 = 4;
                                                  goto LAB_00afb1dc;
                                                }
                                                break;
                                              case 7:
                                                iVar6 = strncmp(pcVar22,"VISIBLE",sVar17);
                                                if (iVar6 == 0) {
                                                  iVar6 = 0x1a;
                                                  iVar7 = 7;
                                                  goto LAB_00afb1dc;
                                                }
                                                break;
                                              case 9:
                                                iVar6 = strncmp(pcVar22,"BMPSTRING",sVar17);
                                                if (iVar6 == 0) {
                                                  iVar6 = 0x1e;
                                                  iVar7 = 9;
                                                  goto LAB_00afb1dc;
                                                }
                                                break;
                                              case 10:
                                                iVar6 = strncmp(pcVar22,"UTF8String",sVar17);
                                                if (iVar6 == 0) {
                                                  iVar6 = 0xc;
                                                  iVar7 = 10;
                                                  goto LAB_00afb1dc;
                                                }
                                                break;
                                              case 0xd:
                                                iVar6 = strncmp(pcVar22,"VISIBLESTRING",sVar17);
                                                if (iVar6 == 0) {
                                                  iVar6 = 0x1a;
                                                  iVar7 = 0xd;
                                                  goto LAB_00afb1dc;
                                                }
                                              }
                                            }
                                            iVar7 = 0;
                                            iVar6 = 0x1a;
                                          }
                                        }
LAB_00afb1dc:
                                        pAVar24 = ASN1_STRING_type_new(iVar6);
                                        *(ASN1_STRING **)(pAVar14 + 8) = pAVar24;
                                        if (pAVar24 == (ASN1_STRING *)0x0) goto LAB_00afb6e0;
                                        if (iVar7 != 0) {
                                          pcVar22 = pcVar22 + (iVar7 + 1);
                                        }
                                        sVar17 = strlen(pcVar22);
                                        iVar6 = ASN1_STRING_set(pAVar24,pcVar22,(int)sVar17);
joined_r0x00afb218:
                                        if (iVar6 == 0) goto LAB_00afb6e0;
                                      }
                                      else {
                                        iVar6 = strcmp(pcVar16,"organization");
                                        if (iVar6 == 0) {
                                          pAVar23 = *(ASN1_VALUE **)pAVar14;
                                          if (pAVar23 == (ASN1_VALUE *)0x0) {
                                            pAVar23 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7f010);
                                            if (pAVar23 == (ASN1_VALUE *)0x0) goto LAB_00afb6e0;
                                            *(ASN1_VALUE **)pAVar14 = pAVar23;
                                            pcVar22 = *(char **)(lVar10 + 0x10);
                                          }
                                          pAVar24 = *(ASN1_STRING **)pAVar23;
                                          pAVar24->type = iVar19;
                                          sVar17 = strlen(pcVar22);
                                          iVar6 = ASN1_STRING_set(pAVar24,pcVar22,(int)sVar17);
                                          goto joined_r0x00afb218;
                                        }
                                        iVar6 = strcmp(pcVar16,"noticeNumbers");
                                        if (iVar6 != 0) {
                                          ERR_new();
                                          ERR_set_debug("crypto/x509/v3_cpols.c",0x15e,
                                                        "notice_section");
                                          ERR_set_error(0x22,0x8a,0);
                                          ERR_add_error_data(4,"name=",*(undefined8 *)(lVar10 + 8),
                                                             ", value=",
                                                             *(undefined8 *)(lVar10 + 0x10));
                                          goto LAB_00afb710;
                                        }
                                        pAVar23 = *(ASN1_VALUE **)pAVar14;
                                        if (pAVar23 == (ASN1_VALUE *)0x0) {
                                          pAVar23 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7f010);
                                          if (pAVar23 == (ASN1_VALUE *)0x0) goto LAB_00afb6e0;
                                          *(ASN1_VALUE **)pAVar14 = pAVar23;
                                          pcVar22 = *(char **)(lVar10 + 0x10);
                                        }
                                        psVar15 = X509V3_parse_list(pcVar22);
                                        if ((psVar15 == (stack_st_CONF_VALUE *)0x0) ||
                                           (iVar6 = OPENSSL_sk_num(psVar15), iVar6 == 0)) {
                                          ERR_new();
                                          ERR_set_debug("crypto/x509/v3_cpols.c",0x154,
                                                        "notice_section");
                                          ERR_set_error(0x22,0x8d,0);
                                          ERR_add_error_data(4,"name=",*(undefined8 *)(lVar10 + 8),
                                                             ", value=",
                                                             *(undefined8 *)(lVar10 + 0x10));
                                          OPENSSL_sk_pop_free(psVar15,X509V3_conf_free);
                                          goto LAB_00afb710;
                                        }
                                        uVar26 = *(undefined8 *)(pAVar23 + 8);
                                        iVar6 = OPENSSL_sk_num(psVar15);
                                        if (0 < iVar6) {
                                          iVar6 = 0;
                                          do {
                                            lVar10 = OPENSSL_sk_value(psVar15,iVar6);
                                            a = s2i_ASN1_INTEGER((X509V3_EXT_METHOD *)0x0,
                                                                 *(char **)(lVar10 + 8));
                                            if (a == (ASN1_INTEGER *)0x0) {
                                              ERR_new();
                                              ERR_set_debug("crypto/x509/v3_cpols.c",0x17e,
                                                            "nref_nos");
                                              uVar26 = 0x8c;
LAB_00afb428:
                                              ERR_set_error(0x22,uVar26,0);
                                              OPENSSL_sk_pop_free(psVar15,X509V3_conf_free);
                                              goto LAB_00afb710;
                                            }
                                            iVar7 = OPENSSL_sk_push(uVar26,a);
                                            if (iVar7 == 0) {
                                              ASN1_INTEGER_free(a);
                                              ERR_new();
                                              ERR_set_debug("crypto/x509/v3_cpols.c",0x188,
                                                            "nref_nos");
                                              uVar26 = 0xc0100;
                                              goto LAB_00afb428;
                                            }
                                            iVar6 = iVar6 + 1;
                                            iVar7 = OPENSSL_sk_num(psVar15);
                                          } while (iVar6 < iVar7);
                                        }
                                        OPENSSL_sk_pop_free(psVar15,X509V3_conf_free);
                                      }
                                      iVar5 = iVar5 + 1;
                                      iVar6 = OPENSSL_sk_num(section_00);
                                    } while (iVar5 < iVar6);
                                  }
                                  plVar21 = *(long **)pAVar14;
                                  if ((plVar21 == (long *)0x0) ||
                                     ((plVar21[1] != 0 && (*plVar21 != 0)))) {
                                    X509V3_section_free(param_2,section_00);
                                    lVar10 = *(long *)(val + 8);
                                    if (lVar10 == 0) {
                                      lVar10 = OPENSSL_sk_new_null();
                                      *(long *)(val + 8) = lVar10;
                                    }
                                    iVar5 = OPENSSL_sk_push(lVar10,pAVar12);
                                    if (iVar5 != 0) goto LAB_00afb280;
                                    goto LAB_00afb78c;
                                  }
                                  ERR_new();
                                  ERR_set_debug("crypto/x509/v3_cpols.c",0x166,"notice_section");
                                  ERR_set_error(0x22,0x8e,0);
                                }
LAB_00afb710:
                                ASN1_item_free(pAVar12,(ASN1_ITEM *)&DAT_00c7efa0);
                                X509V3_section_free(param_2,section_00);
                                goto LAB_00afb7bc;
                              }
                              ERR_new();
                              ERR_set_debug("crypto/x509/v3_cpols.c",0xd5,"policy_section");
                              uVar26 = 0x87;
                            }
                            else {
                              ERR_new();
                              ERR_set_debug("crypto/x509/v3_cpols.c",0xcf,"policy_section");
                              uVar26 = 0x89;
                            }
                          }
                          else {
                            ERR_new();
                            ERR_set_debug("crypto/x509/v3_cpols.c",0xe3,"policy_section");
                            uVar26 = 0x8a;
                          }
LAB_00afb620:
                          ERR_set_error(0x22,uVar26,0);
                          ERR_add_error_data(6,"section:",*puVar11,",name:",puVar11[1],",value:",
                                             puVar11[2]);
                          goto LAB_00afb7bc;
                        }
                        if (*(long *)(val + 8) == 0) {
                          uVar26 = OPENSSL_sk_new_null();
                          *(undefined8 *)(val + 8) = uVar26;
                        }
                        pAVar12 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7efa0);
                        if ((pAVar12 == (ASN1_VALUE *)0x0) ||
                           (iVar5 = OPENSSL_sk_push(*(undefined8 *)(val + 8),pAVar12), iVar5 == 0))
                        goto LAB_00afb78c;
                        pAVar13 = OBJ_nid2obj(0xa4);
                        *(ASN1_OBJECT **)pAVar12 = pAVar13;
                        if (pAVar13 == (ASN1_OBJECT *)0x0) {
                          ERR_new();
                          ERR_set_debug("crypto/x509/v3_cpols.c",0xc4,"policy_section");
                          uVar26 = 0xc0103;
                          goto LAB_00afb7b4;
                        }
                        str = ASN1_IA5STRING_new();
                        *(ASN1_IA5STRING **)(pAVar12 + 8) = str;
                        if (str == (ASN1_IA5STRING *)0x0) goto LAB_00afb78c;
                        pcVar22 = (char *)puVar11[2];
                        sVar17 = strlen(pcVar22);
                        iVar5 = ASN1_STRING_set(str,pcVar22,(int)sVar17);
                        if (iVar5 == 0) goto LAB_00afb78c;
                      }
LAB_00afb280:
                      iVar4 = iVar4 + 1;
                      iVar5 = OPENSSL_sk_num(section);
                    } while (iVar4 < iVar5);
                  }
                  if (*(long *)val != 0) {
                    X509V3_section_free(param_2,section);
                    goto LAB_00afb2ec;
                  }
                  ERR_new();
                  ERR_set_debug("crypto/x509/v3_cpols.c",0xe9,"policy_section");
                  uVar26 = 0x8b;
                }
LAB_00afb7b4:
                ERR_set_error(0x22,uVar26,0);
LAB_00afb7bc:
                ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7ef68);
                X509V3_section_free(param_2,section);
                goto LAB_00afb7d8;
              }
              ERR_new();
              ERR_set_debug("crypto/x509/v3_cpols.c",0x81,"r2i_certpol");
              uVar18 = *(undefined8 *)(lVar10 + 8);
              uVar26 = 0x87;
            }
            else {
              pAVar13 = OBJ_txt2obj(pcVar22,0);
              if (pAVar13 != (ASN1_OBJECT *)0x0) {
                val = ASN1_item_new((ASN1_ITEM *)&DAT_00c7ef68);
                if (val == (ASN1_VALUE *)0x0) {
                  ASN1_OBJECT_free(pAVar13);
                  ERR_new();
                  uVar26 = 0x93;
                }
                else {
                  *(ASN1_OBJECT **)val = pAVar13;
LAB_00afb2ec:
                  iVar4 = OPENSSL_sk_push(lVar9,val);
                  if (iVar4 != 0) goto LAB_00afb2fc;
                  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7ef68);
                  ERR_new();
                  uVar26 = 0x9a;
                }
                goto LAB_00afb368;
              }
              ERR_new();
              ERR_set_debug("crypto/x509/v3_cpols.c",0x8b,"r2i_certpol");
              uVar18 = *(undefined8 *)(lVar10 + 8);
              uVar26 = 0x6e;
            }
            ERR_set_error(0x22,uVar26,&DAT_002b6c62,uVar18);
            goto LAB_00afb7d8;
          }
          bVar2 = true;
LAB_00afb2fc:
          iVar25 = iVar25 + 1;
        } while (iVar25 < iVar3);
      }
      OPENSSL_sk_pop_free(psVar8,X509V3_conf_free);
      return lVar9;
    }
    ERR_new();
    uVar26 = 0x6c;
LAB_00afb368:
    ERR_set_debug("crypto/x509/v3_cpols.c",uVar26,"r2i_certpol");
    ERR_set_error(0x22,0xc0100,0);
LAB_00afb7d8:
    OPENSSL_sk_pop_free(psVar8,X509V3_conf_free);
    OPENSSL_sk_pop_free(lVar9,POLICYINFO_free);
  }
  return 0;
}

