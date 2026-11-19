/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b057d0
 */

ASN1_UTF8STRING * s2i_ASN1_UTF8STRING(undefined8 param_1,undefined8 param_2,char *param_3)

{
  int iVar1;
  ASN1_UTF8STRING *str;
  size_t sVar2;
  
  if (param_3 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_utf8.c",0x34,"s2i_ASN1_UTF8STRING");
    ERR_set_error(0x22,0x6b,0);
  }
  else {
    str = ASN1_UTF8STRING_new();
    if (str == (ASN1_UTF8STRING *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_utf8.c",0x38,"s2i_ASN1_UTF8STRING");
      ERR_set_error(0x22,0xc0100,0);
      return (ASN1_UTF8STRING *)0x0;
    }
    sVar2 = strlen(param_3);
    iVar1 = ASN1_STRING_set(str,param_3,(int)sVar2);
    if (iVar1 != 0) {
      return str;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_utf8.c",0x3c,"s2i_ASN1_UTF8STRING");
    ERR_set_error(0x22,0xc0100,0);
    ASN1_UTF8STRING_free(str);
  }
  return (ASN1_UTF8STRING *)0x0;
}

