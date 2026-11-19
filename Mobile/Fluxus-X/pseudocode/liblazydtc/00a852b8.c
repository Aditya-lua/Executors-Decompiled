/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a852b8
 */

undefined8 ossl_cmp_sk_ASN1_UTF8STRING_push_str(long param_1,void *param_2,int param_3)

{
  int iVar1;
  undefined8 uVar2;
  ASN1_UTF8STRING *str;
  
  uVar2 = 0;
  if ((param_1 != 0) && (param_2 != (void *)0x0)) {
    str = ASN1_UTF8STRING_new();
    uVar2 = 0;
    if (str != (ASN1_UTF8STRING *)0x0) {
      iVar1 = ASN1_STRING_set(str,param_2,param_3);
      if ((iVar1 == 0) || (iVar1 = OPENSSL_sk_push(param_1,str), iVar1 == 0)) {
        ASN1_UTF8STRING_free(str);
        uVar2 = 0;
      }
      else {
        uVar2 = 1;
      }
    }
  }
  return uVar2;
}

