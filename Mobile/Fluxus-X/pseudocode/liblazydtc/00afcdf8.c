/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afcdf8
 */

undefined8 FUN_00afcdf8(long *param_1,char *param_2)

{
  int iVar1;
  int iVar2;
  stack_st_CONF_VALUE *psVar3;
  long lVar4;
  int *piVar5;
  undefined8 uVar6;
  char *__s2;
  undefined **ppuVar7;
  ASN1_BIT_STRING *a;
  
  psVar3 = X509V3_parse_list(param_2);
  if (psVar3 == (stack_st_CONF_VALUE *)0x0) {
    uVar6 = 0;
  }
  else {
    uVar6 = 0;
    if (*param_1 == 0) {
      iVar1 = OPENSSL_sk_num(psVar3);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          lVar4 = OPENSSL_sk_value(psVar3,iVar1);
          a = (ASN1_BIT_STRING *)*param_1;
          __s2 = *(char **)(lVar4 + 8);
          if (a == (ASN1_BIT_STRING *)0x0) {
            a = ASN1_BIT_STRING_new();
            *param_1 = (long)a;
            if (a != (ASN1_BIT_STRING *)0x0) goto LAB_00afce98;
LAB_00afcfe4:
            uVar6 = 0;
            goto LAB_00afcfe8;
          }
LAB_00afce98:
          iVar2 = strcmp("unused",__s2);
          if (iVar2 == 0) {
            ppuVar7 = &PTR_s_Unused_00c7f938;
            piVar5 = &DAT_00c7f930;
          }
          else {
            iVar2 = strcmp("keyCompromise",__s2);
            if (iVar2 == 0) {
              piVar5 = &DAT_00c7f948;
              ppuVar7 = &PTR_s_Key_Compromise_00c7f950;
            }
            else {
              iVar2 = strcmp("CACompromise",__s2);
              if (iVar2 == 0) {
                piVar5 = &DAT_00c7f960;
                ppuVar7 = &PTR_s_CA_Compromise_00c7f968;
              }
              else {
                iVar2 = strcmp("affiliationChanged",__s2);
                if (iVar2 == 0) {
                  piVar5 = &DAT_00c7f978;
                  ppuVar7 = &PTR_s_Affiliation_Changed_00c7f980;
                }
                else {
                  iVar2 = strcmp("superseded",__s2);
                  if (iVar2 == 0) {
                    piVar5 = &DAT_00c7f990;
                    ppuVar7 = &PTR_s_Superseded_00c7f998;
                  }
                  else {
                    iVar2 = strcmp("cessationOfOperation",__s2);
                    if (iVar2 == 0) {
                      piVar5 = &DAT_00c7f9a8;
                      ppuVar7 = &PTR_s_Cessation_Of_Operation_00c7f9b0;
                    }
                    else {
                      iVar2 = strcmp("certificateHold",__s2);
                      if (iVar2 == 0) {
                        piVar5 = &DAT_00c7f9c0;
                        ppuVar7 = &PTR_s_Certificate_Hold_00c7f9c8;
                      }
                      else {
                        iVar2 = strcmp("privilegeWithdrawn",__s2);
                        if (iVar2 == 0) {
                          piVar5 = &DAT_00c7f9d8;
                          ppuVar7 = &PTR_s_Privilege_Withdrawn_00c7f9e0;
                        }
                        else {
                          iVar2 = strcmp("AACompromise",__s2);
                          if (iVar2 != 0) goto LAB_00afcfe4;
                          piVar5 = &DAT_00c7f9f0;
                          ppuVar7 = &PTR_s_AA_Compromise_00c7f9f8;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          iVar2 = ASN1_BIT_STRING_set_bit(a,*piVar5,1);
          if ((iVar2 == 0) || (*ppuVar7 == (undefined *)0x0)) goto LAB_00afcfe4;
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(psVar3);
        } while (iVar1 < iVar2);
      }
      uVar6 = 1;
    }
LAB_00afcfe8:
    OPENSSL_sk_pop_free(psVar3,X509V3_conf_free);
  }
  return uVar6;
}

