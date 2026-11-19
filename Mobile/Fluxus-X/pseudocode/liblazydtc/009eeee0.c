/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eeee0
 */

ASN1_GENERALIZEDTIME * ASN1_TIME_to_generalizedtime(ASN1_TIME *t,ASN1_GENERALIZEDTIME **out)

{
  int iVar1;
  long lVar2;
  ASN1_STRING *str;
  ASN1_GENERALIZEDTIME *pAVar3;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  time_t tStack_28;
  
  if (t == (ASN1_TIME *)0x0) {
    time(&tStack_28);
    local_40 = 0;
    uStack_38 = 0;
    local_50 = 0;
    uStack_48 = 0;
    local_60 = 0;
    local_58 = 0;
    local_68 = 0;
    lVar2 = OPENSSL_gmtime(&tStack_28,&local_68);
    if (lVar2 == 0) {
      return (ASN1_GENERALIZEDTIME *)0x0;
    }
  }
  else {
    iVar1 = ossl_asn1_time_to_tm(&local_68,t);
    if (iVar1 == 0) {
      return (ASN1_GENERALIZEDTIME *)0x0;
    }
  }
  if ((out == (ASN1_GENERALIZEDTIME **)0x0) ||
     (str = *out, pAVar3 = str, str == (ASN1_GENERALIZEDTIME *)0x0)) {
    str = ASN1_STRING_new();
    pAVar3 = (ASN1_GENERALIZEDTIME *)0x0;
    if (str == (ASN1_STRING *)0x0) {
      return (ASN1_GENERALIZEDTIME *)0x0;
    }
  }
  iVar1 = ASN1_STRING_set(str,(void *)0x0,0x14);
  if (iVar1 == 0) {
    if (str != pAVar3) {
      ASN1_STRING_free(str);
    }
    return (ASN1_GENERALIZEDTIME *)0x0;
  }
  str->type = 0x18;
  iVar1 = BIO_snprintf((char *)str->data,0x14,"%04d%02d%02d%02d%02d%02dZ",local_58._4_4_ + 0x76c,
                       (int)local_58 + 1,local_60._4_4_,(int)local_60,local_68._4_4_,(int)local_68);
  str->length = iVar1;
  if (out != (ASN1_GENERALIZEDTIME **)0x0) {
    *out = str;
  }
  return str;
}

