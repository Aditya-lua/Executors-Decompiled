/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03ee8
 */

int GENERAL_NAME_print(BIO *out,GENERAL_NAME *gen)

{
  int iVar1;
  char *pcVar2;
  ASN1_TYPE *pAVar3;
  ASN1_STRING *pAVar4;
  
  switch(gen->type) {
  case 0:
    iVar1 = OBJ_obj2nid(((gen->d).otherName)->type_id);
    pAVar3 = ((gen->d).otherName)->value;
    if (iVar1 == 0x4ba) {
      if (pAVar3->type == 0x16) {
        pAVar4 = (pAVar3->value).asn1_string;
        pcVar2 = "othername:SRVName:%.*s";
        goto LAB_00b03f50;
      }
    }
    else if (pAVar3->type == 0xc) {
      if (iVar1 < 0x4b9) {
        if (iVar1 == 0x289) {
          pAVar4 = (pAVar3->value).asn1_string;
          pcVar2 = "othername:UPN:%.*s";
LAB_00b03f50:
          BIO_printf(out,pcVar2,(ulong)(uint)pAVar4->length,pAVar4->data);
          return 1;
        }
        if (iVar1 == 0x4b8) {
          pAVar4 = (pAVar3->value).asn1_string;
          pcVar2 = "othername:SmtpUTF8Mailbox:%.*s";
          goto LAB_00b03f50;
        }
      }
      else {
        if (iVar1 == 0x4b9) {
          pAVar4 = (pAVar3->value).asn1_string;
          pcVar2 = "othername:XmppAddr:%.*s";
          goto LAB_00b03f50;
        }
        if (iVar1 == 0x4bb) {
          pAVar4 = (pAVar3->value).asn1_string;
          pcVar2 = "othername:NAIRealm:%.*s";
          goto LAB_00b03f50;
        }
      }
    }
    pcVar2 = "othername:<unsupported>";
    goto LAB_00b0409c;
  case 1:
    pcVar2 = "email:";
    goto LAB_00b0400c;
  case 2:
    pcVar2 = "DNS:";
    goto LAB_00b0400c;
  case 3:
    pcVar2 = "X400Name:<unsupported>";
    goto LAB_00b0409c;
  case 4:
    BIO_printf(out,"DirName:");
    X509_NAME_print_ex(out,(gen->d).directoryName,0,0x82031f);
    break;
  case 5:
    pcVar2 = "EdiPartyName:<unsupported>";
LAB_00b0409c:
    BIO_printf(out,pcVar2);
    break;
  case 6:
    pcVar2 = "URI:";
LAB_00b0400c:
    BIO_printf(out,pcVar2);
    ASN1_STRING_print(out,(ASN1_STRING *)(gen->d).otherName);
    break;
  case 7:
    pcVar2 = (char *)ossl_ipaddr_to_asc(((gen->d).rfc822Name)->data,((gen->d).rfc822Name)->length);
    if (pcVar2 == (char *)0x0) {
      return 0;
    }
    BIO_printf(out,"IP Address:%s",pcVar2);
    CRYPTO_free(pcVar2);
    break;
  case 8:
    BIO_printf(out,"Registered ID:");
    i2a_ASN1_OBJECT(out,(gen->d).registeredID);
  }
  return 1;
}

