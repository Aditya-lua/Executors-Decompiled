/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b071e0
 */

ASN1_OCTET_STRING * a2i_IPADDRESS_NC(char *ipasc)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  char *ptr;
  ASN1_OCTET_STRING *str;
  undefined1 auStack_50 [32];
  
  pcVar3 = strchr(ipasc,0x2f);
  if (pcVar3 == (char *)0x0) {
    return (ASN1_OCTET_STRING *)0x0;
  }
  ptr = CRYPTO_strdup(ipasc,"crypto/x509/v3_utl.c",0x452);
  if (ptr == (char *)0x0) {
    return (ASN1_OCTET_STRING *)0x0;
  }
  ptr[(long)pcVar3 - (long)ipasc] = '\0';
  iVar1 = ossl_a2i_ipadd(auStack_50,ptr);
  if (iVar1 != 0) {
    iVar2 = ossl_a2i_ipadd(auStack_50 + iVar1,ptr + ((long)pcVar3 - (long)ipasc) + 1);
    CRYPTO_free(ptr);
    ptr = (char *)0x0;
    if (iVar2 != 0) {
      str = (ASN1_STRING *)0x0;
      if (iVar1 == iVar2) {
        str = ASN1_OCTET_STRING_new();
        if ((str != (ASN1_OCTET_STRING *)0x0) &&
           (iVar1 = ASN1_OCTET_STRING_set(str,auStack_50,iVar1 << 1), iVar1 != 0)) {
          return str;
        }
        ptr = (char *)0x0;
      }
      goto LAB_00b072ac;
    }
  }
  str = (ASN1_STRING *)0x0;
LAB_00b072ac:
  CRYPTO_free(ptr);
  ASN1_OCTET_STRING_free(str);
  return (ASN1_OCTET_STRING *)0x0;
}

