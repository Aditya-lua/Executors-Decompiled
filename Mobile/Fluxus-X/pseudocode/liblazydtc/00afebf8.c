/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afebf8
 */

ASN1_IA5STRING * s2i_ASN1_IA5STRING(undefined8 param_1,undefined8 param_2,char *param_3)

{
  int iVar1;
  ASN1_IA5STRING *str;
  size_t sVar2;
  
  if (param_3 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_ia5.c",0x30,"s2i_ASN1_IA5STRING");
    ERR_set_error(0x22,0x6b,0);
    str = (ASN1_IA5STRING *)0x0;
  }
  else {
    str = ASN1_IA5STRING_new();
    if (str == (ASN1_IA5STRING *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_ia5.c",0x3e,"s2i_ASN1_IA5STRING");
      ERR_set_error(0x22,0xc0100,0);
    }
    else {
      sVar2 = strlen(param_3);
      iVar1 = ASN1_STRING_set(str,param_3,(int)sVar2);
      if (iVar1 == 0) {
        ASN1_IA5STRING_free(str);
        str = (ASN1_IA5STRING *)0x0;
      }
    }
  }
  return str;
}

