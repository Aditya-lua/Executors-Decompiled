/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1cb44
 */

undefined8 * X509_PUBKEY_dup(undefined8 *param_1)

{
  int iVar1;
  undefined8 *ptr;
  char *pcVar2;
  X509_ALGOR *pXVar3;
  ASN1_BIT_STRING *str;
  long lVar4;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x30,"crypto/x509/x_pubkey.c",0x11d);
  if (ptr == (undefined8 *)0x0) goto LAB_00b1cc6c;
  pcVar2 = (char *)param_1[4];
  ptr[3] = param_1[3];
  CRYPTO_free((void *)ptr[4]);
  ptr[4] = 0;
  if (pcVar2 == (char *)0x0) {
LAB_00b1cbb4:
    pXVar3 = X509_ALGOR_dup((X509_ALGOR *)*param_1);
    *ptr = pXVar3;
    if (pXVar3 != (X509_ALGOR *)0x0) {
      str = ASN1_BIT_STRING_new();
      ptr[1] = str;
      if ((str != (ASN1_BIT_STRING *)0x0) &&
         (iVar1 = ASN1_BIT_STRING_set(str,*(void **)((int *)param_1[1] + 2),*(int *)param_1[1]),
         iVar1 != 0)) {
        if (param_1[2] == 0) {
          return ptr;
        }
        ERR_set_mark();
        lVar4 = EVP_PKEY_dup(param_1[2]);
        ptr[2] = lVar4;
        if (lVar4 == 0) {
          *(byte *)(ptr + 5) = *(byte *)(ptr + 5) | 1;
          iVar1 = FUN_00b1cd70(ptr + 2,ptr);
          if (iVar1 < 1) {
            X509_ALGOR_free((X509_ALGOR *)*ptr);
            ASN1_BIT_STRING_free((ASN1_STRING *)ptr[1]);
            EVP_PKEY_free((EVP_PKEY *)ptr[2]);
            CRYPTO_free((void *)ptr[4]);
            CRYPTO_free(ptr);
            ERR_clear_last_mark();
            return (undefined8 *)0x0;
          }
        }
        ERR_pop_to_mark();
        return ptr;
      }
    }
  }
  else {
    pcVar2 = CRYPTO_strdup(pcVar2,"crypto/x509/x_pubkey.c",0x37);
    ptr[4] = pcVar2;
    if (pcVar2 != (char *)0x0) goto LAB_00b1cbb4;
  }
  X509_ALGOR_free((X509_ALGOR *)*ptr);
  ASN1_BIT_STRING_free((ASN1_STRING *)ptr[1]);
  EVP_PKEY_free((EVP_PKEY *)ptr[2]);
  CRYPTO_free((void *)ptr[4]);
  CRYPTO_free(ptr);
LAB_00b1cc6c:
  ERR_new();
  ERR_set_debug("crypto/x509/x_pubkey.c",0x128,"X509_PUBKEY_dup");
  ERR_set_error(0xb,0xc0100,0);
  return (undefined8 *)0x0;
}

