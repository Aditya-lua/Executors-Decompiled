/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3630
 */

ASN1_STRING * FUN_009f3630(BIGNUM *param_1,ASN1_STRING *param_2,int param_3)

{
  int len;
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  ASN1_STRING *str;
  
  if (param_2 == (ASN1_STRING *)0x0) {
    str = ASN1_STRING_type_new(param_3);
    if (str == (ASN1_STRING *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_int.c",0x1db,"bn_to_asn1_string");
      uVar2 = 0x8010a;
      goto LAB_009f3748;
    }
  }
  else {
    param_2->type = param_3;
    str = param_2;
  }
  iVar3 = BN_is_negative(param_1);
  if ((iVar3 != 0) && (iVar3 = BN_is_zero(param_1), iVar3 == 0)) {
    str->type = str->type | 0x102;
  }
  iVar3 = BN_num_bits(param_1);
  uVar1 = iVar3 + 0xeU;
  if (-1 < (int)(iVar3 + 7U)) {
    uVar1 = iVar3 + 7U;
  }
  len = (int)uVar1 >> 3;
  if (iVar3 + 0xeU < 0xf) {
    len = 1;
  }
  iVar3 = ASN1_STRING_set(str,(void *)0x0,len);
  if (iVar3 != 0) {
    iVar3 = BN_is_zero(param_1);
    if (iVar3 == 0) {
      iVar3 = BN_bn2bin(param_1,str->data);
      str->length = iVar3;
      return str;
    }
    *str->data = '\0';
    str->length = len;
    return str;
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/a_int.c",0x1e8,"bn_to_asn1_string");
  uVar2 = 0xc0100;
LAB_009f3748:
  ERR_set_error(0xd,uVar2,0);
  if (str != param_2) {
    ASN1_INTEGER_free(str);
  }
  return (ASN1_STRING *)0x0;
}

