/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05d40
 */

char * i2s_ASN1_INTEGER(X509V3_EXT_METHOD *meth,ASN1_INTEGER *aint)

{
  BIGNUM *a;
  char *pcVar1;
  
  if (aint == (ASN1_INTEGER *)0x0) {
    pcVar1 = (char *)0x0;
  }
  else {
    a = ASN1_INTEGER_to_BN(aint,(BIGNUM *)0x0);
    if ((a == (BIGNUM *)0x0) || (pcVar1 = (char *)FUN_00b05c0c(a), pcVar1 == (char *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_utl.c",0xbd,"i2s_ASN1_INTEGER");
      ERR_set_error(0x22,0xc0100,0);
      pcVar1 = (char *)0x0;
    }
    BN_free(a);
  }
  return pcVar1;
}

