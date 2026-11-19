/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e310
 */

undefined8 FUN_00b1e310(undefined8 *param_1,undefined8 param_2,long param_3,char *param_4)

{
  long *ptr;
  X509_ALGOR *pXVar1;
  ASN1_BIT_STRING *pAVar2;
  char *pcVar3;
  
  ptr = (long *)CRYPTO_zalloc(0x30,"crypto/x509/x_pubkey.c",0x73);
  if (ptr == (long *)0x0) goto LAB_00b1e3f8;
  if (*ptr == 0) {
    pXVar1 = X509_ALGOR_new();
    *ptr = (long)pXVar1;
    if (pXVar1 != (X509_ALGOR *)0x0) goto LAB_00b1e35c;
  }
  else {
LAB_00b1e35c:
    if (ptr[1] == 0) {
      pAVar2 = ASN1_BIT_STRING_new();
      ptr[1] = (long)pAVar2;
      if (pAVar2 == (ASN1_BIT_STRING *)0x0) goto LAB_00b1e3b8;
    }
    ptr[3] = param_3;
    CRYPTO_free((void *)ptr[4]);
    ptr[4] = 0;
    if (param_4 == (char *)0x0) {
LAB_00b1e3ac:
      *param_1 = ptr;
      return 1;
    }
    pcVar3 = CRYPTO_strdup(param_4,"crypto/x509/x_pubkey.c",0x37);
    ptr[4] = (long)pcVar3;
    if (pcVar3 != (char *)0x0) goto LAB_00b1e3ac;
  }
LAB_00b1e3b8:
  X509_ALGOR_free((X509_ALGOR *)*ptr);
  ASN1_BIT_STRING_free((ASN1_STRING *)ptr[1]);
  EVP_PKEY_free((EVP_PKEY *)ptr[2]);
  CRYPTO_free((void *)ptr[4]);
  CRYPTO_free(ptr);
LAB_00b1e3f8:
  ERR_new();
  ERR_set_debug("crypto/x509/x_pubkey.c",0x78,"x509_pubkey_ex_new_ex");
  ERR_set_error(0xd,0xc0100,0);
  return 0;
}

