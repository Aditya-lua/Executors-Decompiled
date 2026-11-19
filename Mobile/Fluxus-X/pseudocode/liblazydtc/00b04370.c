/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04370
 */

GENERAL_NAME *
a2i_GENERAL_NAME(GENERAL_NAME *out,X509V3_EXT_METHOD *method,X509V3_CTX *ctx,int gen_type,
                char *value,int is_nc)

{
  int iVar1;
  GENERAL_NAME *a;
  ASN1_IA5STRING *str;
  size_t sVar2;
  ASN1_STRING *a_00;
  char *pcVar3;
  OTHERNAME *pOVar4;
  ASN1_TYPE *pAVar5;
  X509_NAME *nm;
  stack_st_CONF_VALUE *dn_sk;
  ASN1_OCTET_STRING *pAVar6;
  ASN1_OBJECT *pAVar7;
  undefined8 uVar8;
  
  if (value == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x205,"a2i_GENERAL_NAME");
    uVar8 = 0x7c;
LAB_00b0445c:
    ERR_set_error(0x22,uVar8,0);
    return (GENERAL_NAME *)0x0;
  }
  a = out;
  if ((out == (GENERAL_NAME *)0x0) && (a = GENERAL_NAME_new(), a == (GENERAL_NAME *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x20e,"a2i_GENERAL_NAME");
    uVar8 = 0xc0100;
    goto LAB_00b0445c;
  }
  switch(gen_type) {
  case 0:
    pcVar3 = strchr(value,0x3b);
    if (pcVar3 != (char *)0x0) {
      pOVar4 = OTHERNAME_new();
      (a->d).otherName = pOVar4;
      if (pOVar4 != (OTHERNAME *)0x0) {
        ASN1_TYPE_free(pOVar4->value);
        pAVar5 = ASN1_generate_v3(pcVar3 + 1,ctx);
        ((a->d).otherName)->value = pAVar5;
        if ((pAVar5 != (ASN1_TYPE *)0x0) &&
           (pcVar3 = (char *)CRYPTO_strndup(value,(long)((int)pcVar3 - (int)value),
                                            "crypto/x509/v3_san.c",0x292), pcVar3 != (char *)0x0)) {
          pAVar7 = OBJ_txt2obj(pcVar3,0);
          ((a->d).otherName)->type_id = pAVar7;
          CRYPTO_free(pcVar3);
          if (((a->d).otherName)->type_id != (ASN1_OBJECT *)0x0) goto LAB_00b04614;
        }
        OTHERNAME_free((a->d).otherName);
        (a->d).ptr = (char *)0x0;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x23b,"a2i_GENERAL_NAME");
    uVar8 = 0x93;
    break;
  case 1:
  case 2:
  case 6:
    str = ASN1_IA5STRING_new();
    (a->d).rfc822Name = str;
    a_00 = (ASN1_STRING *)0x0;
    if (str != (ASN1_IA5STRING *)0x0) {
      sVar2 = strlen(value);
      iVar1 = ASN1_STRING_set(str,value,(int)sVar2);
      if (iVar1 != 0) goto LAB_00b04614;
      a_00 = (ASN1_STRING *)(a->d).otherName;
    }
    ASN1_IA5STRING_free(a_00);
    (a->d).ptr = (char *)0x0;
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x24a,"a2i_GENERAL_NAME");
    uVar8 = 0xc0100;
    break;
  default:
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x240,"a2i_GENERAL_NAME");
    uVar8 = 0xa7;
    break;
  case 4:
    nm = X509_NAME_new();
    if (nm == (X509_NAME *)0x0) {
      dn_sk = (stack_st_CONF_VALUE *)0x0;
    }
    else {
      dn_sk = X509V3_get_section(ctx,value);
      if (dn_sk == (stack_st_CONF_VALUE *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_san.c",0x2ab,"do_dirname");
        ERR_set_error(0x22,0x96,"section=%s",value);
      }
      else {
        iVar1 = X509V3_NAME_from_section(nm,dn_sk,0x1001);
        if (iVar1 != 0) {
          (a->d).directoryName = nm;
          X509V3_section_free(ctx,dn_sk);
          goto LAB_00b04614;
        }
      }
    }
    X509_NAME_free(nm);
    X509V3_section_free(ctx,dn_sk);
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x234,"a2i_GENERAL_NAME");
    uVar8 = 0x95;
    break;
  case 7:
    if (is_nc == 0) {
      pAVar6 = a2i_IPADDRESS(value);
      (a->d).iPAddress = pAVar6;
    }
    else {
      pAVar6 = a2i_IPADDRESS_NC(value);
      (a->d).iPAddress = pAVar6;
    }
    if (pAVar6 != (ASN1_OCTET_STRING *)0x0) {
LAB_00b04614:
      a->type = gen_type;
      return a;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x22c,"a2i_GENERAL_NAME");
    uVar8 = 0x76;
    goto LAB_00b0467c;
  case 8:
    pAVar7 = OBJ_txt2obj(value,0);
    if (pAVar7 != (ASN1_OBJECT *)0x0) {
      (a->d).registeredID = pAVar7;
      goto LAB_00b04614;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x21e,"a2i_GENERAL_NAME");
    uVar8 = 0x77;
LAB_00b0467c:
    ERR_set_error(0x22,uVar8,"value=%s",value);
    goto joined_r0x00b04688;
  }
  ERR_set_error(0x22,uVar8,0);
joined_r0x00b04688:
  if (out == (GENERAL_NAME *)0x0) {
    GENERAL_NAME_free(a);
    return (GENERAL_NAME *)0x0;
  }
  return (GENERAL_NAME *)0x0;
}

