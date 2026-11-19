/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f04ac
 */

EVP_PKEY_ASN1_METHOD * EVP_PKEY_asn1_find_str(ENGINE **pe,char *str,int len)

{
  bool bVar1;
  EVP_PKEY_ASN1_METHOD *pEVar2;
  EVP_PKEY_ASN1_METHOD EVar3;
  int iVar4;
  size_t sVar5;
  EVP_PKEY_ASN1_METHOD *pEVar6;
  char *__s;
  long lVar7;
  ENGINE *local_58;
  
  if (len == -1) {
    sVar5 = strlen(str);
    len = (int)sVar5;
  }
  if (pe != (ENGINE **)0x0) {
    pEVar6 = ENGINE_pkey_asn1_find_str(&local_58,str,len);
    if (pEVar6 != (EVP_PKEY_ASN1_METHOD *)0x0) {
      iVar4 = ENGINE_init(local_58);
      pEVar2 = (EVP_PKEY_ASN1_METHOD *)0x0;
      if (iVar4 != 0) {
        pEVar2 = pEVar6;
      }
      ENGINE_free(local_58);
      *pe = local_58;
      return pEVar2;
    }
    *pe = (ENGINE *)0x0;
  }
  if (DAT_00d218e0 == 0) {
    iVar4 = 0x10;
  }
  else {
    iVar4 = OPENSSL_sk_num();
    if (iVar4 < -0xf) {
      return (EVP_PKEY_ASN1_METHOD *)0x0;
    }
    iVar4 = iVar4 + 0x10;
  }
  lVar7 = (long)iVar4;
  do {
    if ((int)lVar7 < 0x11) {
      pEVar6 = *(EVP_PKEY_ASN1_METHOD **)(&DAT_00cc8600 + lVar7 * 8);
      EVar3 = pEVar6[8];
    }
    else {
      pEVar6 = (EVP_PKEY_ASN1_METHOD *)OPENSSL_sk_value(DAT_00d218e0,(int)lVar7 + -0x11);
      EVar3 = pEVar6[8];
    }
    if (((byte)EVar3 & 1) == 0) {
      __s = *(char **)(pEVar6 + 0x10);
      sVar5 = strlen(__s);
      if ((len == (int)sVar5) && (iVar4 = OPENSSL_strncasecmp(__s,str,(long)len), iVar4 == 0)) {
        return pEVar6;
      }
    }
    bVar1 = lVar7 < 2;
    lVar7 = lVar7 + -1;
    if (bVar1) {
      return (EVP_PKEY_ASN1_METHOD *)0x0;
    }
  } while( true );
}

