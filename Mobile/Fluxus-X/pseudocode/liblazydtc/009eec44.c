/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eec44
 */

ASN1_STRING * ossl_asn1_time_from_tm(ASN1_STRING *param_1,undefined4 *param_2,int param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  char *format;
  ASN1_STRING *str;
  undefined4 uVar6;
  
  if (param_3 != 0x18) {
    if (param_3 == 0x17) {
      str = (ASN1_STRING *)0x0;
      if (99 < param_2[5] - 0x32) goto LAB_009eed1c;
      param_3 = 0x17;
    }
    else {
      str = (ASN1_STRING *)0x0;
      if (param_3 != -1) goto LAB_009eed1c;
      param_3 = 0x17;
      if (99 < param_2[5] - 0x32) {
        param_3 = 0x18;
      }
    }
  }
  str = param_1;
  if ((param_1 == (ASN1_STRING *)0x0) && (str = ASN1_STRING_new(), str == (ASN1_STRING *)0x0)) {
    return (ASN1_STRING *)0x0;
  }
  iVar5 = ASN1_STRING_set(str,(void *)0x0,0x14);
  if (iVar5 != 0) {
    str->type = param_3;
    if (param_3 == 0x18) {
      uVar2 = param_2[3];
      iVar5 = param_2[4];
      uVar3 = param_2[1];
      uVar4 = param_2[2];
      uVar6 = *param_2;
      uVar1 = param_2[5] + 0x76c;
      format = "%04d%02d%02d%02d%02d%02dZ";
    }
    else {
      uVar2 = param_2[3];
      iVar5 = param_2[4];
      uVar6 = *param_2;
      uVar3 = param_2[1];
      uVar4 = param_2[2];
      uVar1 = (int)param_2[5] % 100;
      format = "%02d%02d%02d%02d%02d%02dZ";
    }
    iVar5 = BIO_snprintf((char *)str->data,0x14,format,(ulong)uVar1,(ulong)(iVar5 + 1),(ulong)uVar2,
                         (ulong)uVar4,(ulong)uVar3,uVar6);
    str->length = iVar5;
    return str;
  }
LAB_009eed1c:
  if (str != param_1) {
    ASN1_STRING_free(str);
  }
  return (ASN1_STRING *)0x0;
}

