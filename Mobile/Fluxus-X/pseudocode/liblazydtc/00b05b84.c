/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05b84
 */

char * i2s_ASN1_ENUMERATED(X509V3_EXT_METHOD *meth,ASN1_ENUMERATED *aint)

{
  BIGNUM *a;
  char *pcVar1;
  
  if (aint == (ASN1_ENUMERATED *)0x0) {
    pcVar1 = (char *)0x0;
  }
  else {
    a = ASN1_ENUMERATED_to_BN(aint,(BIGNUM *)0x0);
    if ((a == (BIGNUM *)0x0) || (pcVar1 = (char *)FUN_00b05c0c(a), pcVar1 == (char *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_utl.c",0xaf,"i2s_ASN1_ENUMERATED");
      ERR_set_error(0x22,0xc0100,0);
      pcVar1 = (char *)0x0;
    }
    BN_free(a);
  }
  return pcVar1;
}

