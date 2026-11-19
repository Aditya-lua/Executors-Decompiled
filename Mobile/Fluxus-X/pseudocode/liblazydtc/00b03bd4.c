/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03bd4
 */

stack_st_CONF_VALUE *
i2v_GENERAL_NAME(X509V3_EXT_METHOD *method,GENERAL_NAME *gen,stack_st_CONF_VALUE *ret)

{
  int iVar1;
  char *pcVar2;
  char *value;
  ASN1_STRING *pAVar3;
  ASN1_TYPE *pAVar4;
  char acStack_264 [256];
  char acStack_164 [300];
  stack_st_CONF_VALUE *local_38;
  
  local_38 = ret;
  switch(gen->type) {
  case 0:
    iVar1 = OBJ_obj2nid(((gen->d).otherName)->type_id);
    switch(iVar1) {
    case 0x4b8:
      pAVar4 = ((gen->d).otherName)->value;
      if (pAVar4->type != 0xc) {
        return (stack_st_CONF_VALUE *)0x0;
      }
      pAVar3 = (pAVar4->value).asn1_string;
      pcVar2 = "othername: SmtpUTF8Mailbox:";
      break;
    case 0x4b9:
      pAVar4 = ((gen->d).otherName)->value;
      if (pAVar4->type != 0xc) {
        return (stack_st_CONF_VALUE *)0x0;
      }
      pAVar3 = (pAVar4->value).asn1_string;
      pcVar2 = "othername: XmppAddr:";
      break;
    case 0x4ba:
      pAVar4 = ((gen->d).otherName)->value;
      if (pAVar4->type != 0x16) {
        return (stack_st_CONF_VALUE *)0x0;
      }
      pAVar3 = (pAVar4->value).asn1_string;
      pcVar2 = "othername: SRVName:";
      break;
    case 0x4bb:
      pAVar4 = ((gen->d).otherName)->value;
      if (pAVar4->type != 0xc) {
        return (stack_st_CONF_VALUE *)0x0;
      }
      pAVar3 = (pAVar4->value).asn1_string;
      pcVar2 = "othername: NAIRealm:";
      break;
    default:
      if (iVar1 == 0x289) {
        pAVar4 = ((gen->d).otherName)->value;
        if (pAVar4->type != 0xc) {
          return (stack_st_CONF_VALUE *)0x0;
        }
        pAVar3 = (pAVar4->value).asn1_string;
        pcVar2 = "othername: UPN:";
        break;
      }
      iVar1 = OBJ_obj2txt(acStack_264,0x100,((gen->d).otherName)->type_id,0);
      if (iVar1 < 1) {
        OPENSSL_strlcpy(acStack_164,"othername:",300);
      }
      else {
        BIO_snprintf(acStack_164,300,"othername: %s:",acStack_264);
      }
      pAVar3 = ((gen->d).ediPartyName)->partyName;
      iVar1 = pAVar3->length;
      if (iVar1 == 0x16) {
        iVar1 = x509v3_add_len_value_uchar
                          (acStack_164,*(undefined8 *)((long)pAVar3->data + 8),
                           (long)*(int *)pAVar3->data,&local_38);
        if (iVar1 != 0) goto switchD_00b03c10_default;
        pAVar3 = (ASN1_STRING *)((gen->d).otherName)->value;
        iVar1 = pAVar3->length;
      }
      if ((iVar1 == 0xc) &&
         (iVar1 = x509v3_add_len_value_uchar
                            (acStack_164,*(undefined8 *)((long)pAVar3->data + 8),
                             (long)*(int *)pAVar3->data,&local_38), iVar1 != 0))
      goto switchD_00b03c10_default;
      value = "<unsupported>";
      pcVar2 = acStack_164;
      goto LAB_00b03d54;
    }
    break;
  case 1:
    pAVar3 = (gen->d).rfc822Name;
    pcVar2 = "email";
    break;
  case 2:
    pAVar3 = (gen->d).rfc822Name;
    pcVar2 = "DNS";
    break;
  case 3:
    pcVar2 = "X400Name";
    goto LAB_00b03cbc;
  case 4:
    pcVar2 = X509_NAME_oneline((gen->d).directoryName,acStack_264,0x100);
    if (pcVar2 == (char *)0x0) {
      return (stack_st_CONF_VALUE *)0x0;
    }
    pcVar2 = "DirName";
    goto LAB_00b03d50;
  case 5:
    pcVar2 = "EdiPartyName";
LAB_00b03cbc:
    value = "<unsupported>";
LAB_00b03d54:
    iVar1 = X509V3_add_value(pcVar2,value,&local_38);
    goto joined_r0x00b03d5c;
  case 6:
    pAVar3 = (gen->d).rfc822Name;
    pcVar2 = "URI";
    break;
  case 7:
    pcVar2 = (char *)ossl_ipaddr_to_asc(((gen->d).rfc822Name)->data,((gen->d).rfc822Name)->length);
    if ((pcVar2 == (char *)0x0) ||
       (iVar1 = X509V3_add_value("IP Address",pcVar2,&local_38), iVar1 == 0)) {
      local_38 = (stack_st_CONF_VALUE *)0x0;
    }
    CRYPTO_free(pcVar2);
    goto switchD_00b03c10_default;
  case 8:
    i2t_ASN1_OBJECT(acStack_264,0x100,(gen->d).registeredID);
    pcVar2 = "Registered ID";
LAB_00b03d50:
    value = acStack_264;
    goto LAB_00b03d54;
  default:
    goto switchD_00b03c10_default;
  }
  iVar1 = x509v3_add_len_value_uchar(pcVar2,pAVar3->data,(long)pAVar3->length,&local_38);
joined_r0x00b03d5c:
  if (iVar1 == 0) {
    local_38 = (stack_st_CONF_VALUE *)0x0;
  }
  else {
switchD_00b03c10_default:
  }
  return local_38;
}

