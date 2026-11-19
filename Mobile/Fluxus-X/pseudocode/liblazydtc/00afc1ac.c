/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc1ac
 */

char * i2s_ASN1_ENUMERATED_TABLE(X509V3_EXT_METHOD *meth,ASN1_ENUMERATED *aint)

{
  long lVar1;
  char *pcVar2;
  int *piVar3;
  
  lVar1 = ASN1_ENUMERATED_get(aint);
  piVar3 = meth->usr_data;
  pcVar2 = *(char **)(piVar3 + 2);
  while( true ) {
    if (pcVar2 == (char *)0x0) {
      pcVar2 = i2s_ASN1_ENUMERATED(meth,aint);
      return pcVar2;
    }
    if (lVar1 == *piVar3) break;
    pcVar2 = *(char **)(piVar3 + 8);
    piVar3 = piVar3 + 6;
  }
  pcVar2 = CRYPTO_strdup(pcVar2,"crypto/x509/v3_enum.c",0x32);
  return pcVar2;
}

