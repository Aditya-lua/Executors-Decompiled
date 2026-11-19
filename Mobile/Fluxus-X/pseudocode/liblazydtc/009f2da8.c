/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2da8
 */

ASN1_STRING * ossl_c2i_ASN1_INTEGER(long *param_1,long *param_2,long param_3)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  ASN1_INTEGER *str;
  int local_34;
  
  lVar3 = FUN_009f2ec4(0,0,*param_2,param_3);
  if (lVar3 != 0) {
    if ((param_1 == (long *)0x0) || (str = (ASN1_INTEGER *)*param_1, str == (ASN1_STRING *)0x0)) {
      str = ASN1_INTEGER_new();
      if (str == (ASN1_INTEGER *)0x0) {
        return (ASN1_STRING *)0x0;
      }
      str->type = 2;
    }
    iVar2 = ASN1_STRING_set(str,(void *)0x0,(int)lVar3);
    if (iVar2 != 0) {
      FUN_009f2ec4(str->data,&local_34,*param_2,param_3);
      uVar1 = str->type & 0xfffffeff;
      if (local_34 != 0) {
        uVar1 = str->type | 0x100;
      }
      str->type = uVar1;
      *param_2 = *param_2 + param_3;
      if (param_1 == (long *)0x0) {
        return str;
      }
      *param_1 = (long)str;
      return str;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/a_int.c",0x141,"ossl_c2i_ASN1_INTEGER");
    ERR_set_error(0xd,0xc0100,0);
    if ((param_1 == (long *)0x0) || ((ASN1_STRING *)*param_1 != str)) {
      ASN1_INTEGER_free(str);
    }
  }
  return (ASN1_STRING *)0x0;
}

