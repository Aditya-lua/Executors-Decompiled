/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef088
 */

undefined8 ASN1_TIME_set_string_X509(ASN1_STRING *param_1,uchar *param_2)

{
  int iVar1;
  size_t sVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 auStack_70 [20];
  int local_5c;
  ASN1_UTCTIME local_38;
  
  sVar2 = strlen((char *)param_2);
  local_38.length = (int)sVar2;
  local_38.type = 0x17;
  local_38.flags = 0x100;
  local_38.data = param_2;
  iVar1 = ASN1_UTCTIME_check(&local_38);
  if (iVar1 == 0) {
    local_38.type = 0x18;
    iVar1 = ASN1_GENERALIZEDTIME_check(&local_38);
    if (iVar1 != 0) goto LAB_009ef0d8;
LAB_009ef1b8:
    uVar4 = 0;
  }
  else {
LAB_009ef0d8:
    if ((param_1 == (ASN1_STRING *)0x0) || (local_38.type != 0x18)) {
      if (param_1 != (ASN1_STRING *)0x0) goto LAB_009ef14c;
LAB_009ef15c:
      uVar4 = 1;
    }
    else {
      iVar1 = ossl_asn1_time_to_tm(auStack_70,&local_38);
      if (iVar1 == 0) goto LAB_009ef1b8;
      if (local_5c - 0x32U < 100) {
        lVar3 = (long)local_38.length;
        local_38.length = local_38.length + -2;
        local_38.data = (uchar *)CRYPTO_zalloc(lVar3 + -1,"crypto/asn1/a_time.c",0x1a6);
        if (local_38.data == (uchar *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/a_time.c",0x1a8,"ASN1_TIME_set_string_X509");
          ERR_set_error(0xd,0xc0100,0);
          goto LAB_009ef1b8;
        }
        memcpy(local_38.data,param_2 + 2,(long)local_38.length);
        local_38.type = 0x17;
      }
LAB_009ef14c:
      iVar1 = ASN1_STRING_copy(param_1,&local_38);
      if (iVar1 != 0) goto LAB_009ef15c;
      uVar4 = 0;
    }
    if (local_38.data != param_2) {
      CRYPTO_free(local_38.data);
    }
  }
  return uVar4;
}

