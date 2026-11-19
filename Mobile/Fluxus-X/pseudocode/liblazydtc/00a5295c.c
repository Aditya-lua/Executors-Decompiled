/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5295c
 */

EVP_PKEY_ASN1_METHOD * ENGINE_get_pkey_asn1_meth_str(ENGINE *e,char *str,int len)

{
  int iVar1;
  int iVar2;
  size_t sVar3;
  code *pcVar4;
  char *__s;
  long lVar5;
  EVP_PKEY_ASN1_METHOD *local_58;
  long local_48;
  
  pcVar4 = *(code **)(e + 0x50);
  if (pcVar4 != (code *)0x0) {
    if (len == -1) {
      sVar3 = strlen(str);
      len = (int)sVar3;
    }
    iVar1 = (*pcVar4)(e,0,&local_48,0);
    if (0 < iVar1) {
      lVar5 = 0;
      do {
        (**(code **)(e + 0x50))(e,&local_58,0,*(undefined4 *)(local_48 + lVar5 * 4));
        if (local_58 != (EVP_PKEY_ASN1_METHOD *)0x0) {
          __s = *(char **)(local_58 + 0x10);
          sVar3 = strlen(__s);
          if ((len == (int)sVar3) && (iVar2 = OPENSSL_strncasecmp(__s,str,(long)len), iVar2 == 0)) {
            return local_58;
          }
        }
        lVar5 = lVar5 + 1;
      } while (lVar5 < iVar1);
    }
  }
  return (EVP_PKEY_ASN1_METHOD *)0x0;
}

