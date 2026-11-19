/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05f6c
 */

int X509V3_add_value_int(char *name,ASN1_INTEGER *aint,stack_st_CONF_VALUE **extlist)

{
  int iVar1;
  BIGNUM *a;
  char *__s;
  size_t sVar2;
  
  if (aint == (ASN1_INTEGER *)0x0) {
    iVar1 = 1;
  }
  else {
    a = ASN1_INTEGER_to_BN(aint,(BIGNUM *)0x0);
    if ((a == (BIGNUM *)0x0) || (__s = (char *)FUN_00b05c0c(a), __s == (char *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_utl.c",0xbd,"i2s_ASN1_INTEGER");
      ERR_set_error(0x22,0xc0100,0);
      BN_free(a);
      iVar1 = 0;
    }
    else {
      BN_free(a);
      sVar2 = strlen(__s);
      iVar1 = FUN_00b0590c(name,__s,sVar2,extlist);
      CRYPTO_free(__s);
    }
  }
  return iVar1;
}

