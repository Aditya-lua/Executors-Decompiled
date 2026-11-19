/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe9cc
 */

ASN1_BIT_STRING *
v2i_ASN1_BIT_STRING(X509V3_EXT_METHOD *method,X509V3_CTX *ctx,stack_st_CONF_VALUE *nval)

{
  int iVar1;
  int iVar2;
  ASN1_BIT_STRING *a;
  long lVar3;
  char *__s2;
  char *__s1;
  undefined8 *puVar4;
  
  a = ASN1_BIT_STRING_new();
  if (a == (ASN1_BIT_STRING *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_bitst.c",0x43,"v2i_ASN1_BIT_STRING");
    ERR_set_error(0x22,0xc0100,0);
  }
  else {
    iVar1 = OPENSSL_sk_num(nval);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        lVar3 = OPENSSL_sk_value(nval,iVar1);
        __s1 = *(char **)((long)method->usr_data + 8);
        if (__s1 == (char *)0x0) {
LAB_00afeac8:
          ERR_new();
          ERR_set_debug("crypto/x509/v3_bitst.c",0x54,"v2i_ASN1_BIT_STRING");
          ERR_set_error(0x22,0x6f,&DAT_002b6c62,*(undefined8 *)(lVar3 + 8));
LAB_00afeafc:
          ASN1_BIT_STRING_free(a);
          return (ASN1_BIT_STRING *)0x0;
        }
        __s2 = *(char **)(lVar3 + 8);
        puVar4 = (undefined8 *)((long)method->usr_data + 0x10);
        while ((iVar2 = strcmp((char *)*puVar4,__s2), iVar2 != 0 &&
               (iVar2 = strcmp(__s1,__s2), iVar2 != 0))) {
          __s1 = (char *)puVar4[2];
          puVar4 = puVar4 + 3;
          if (__s1 == (char *)0x0) goto LAB_00afeac8;
        }
        iVar2 = ASN1_BIT_STRING_set_bit(a,*(int *)(puVar4 + -2),1);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/x509/v3_bitst.c",0x4c,"v2i_ASN1_BIT_STRING");
          ERR_set_error(0x22,0xc0100,0);
          goto LAB_00afeafc;
        }
        if (puVar4[-1] == 0) goto LAB_00afeac8;
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(nval);
      } while (iVar1 < iVar2);
    }
  }
  return a;
}

