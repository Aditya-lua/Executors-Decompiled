/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1eeec
 */

undefined8 FUN_00b1eeec(int param_1,undefined8 *param_2,undefined8 param_3,undefined8 *param_4)

{
  int iVar1;
  char *pcVar2;
  undefined8 uVar3;
  void *obj;
  
  if (0x10 < param_1 - 1U) {
    return 1;
  }
  obj = (void *)*param_2;
  switch(param_1) {
  case 1:
    goto LAB_00b1f010;
  case 3:
    CRYPTO_free_ex_data(3,obj,(CRYPTO_EX_DATA *)((long)obj + 200));
    X509_CERT_AUX_free(*(X509_CERT_AUX **)((long)obj + 0x150));
    ASN1_OCTET_STRING_free(*(ASN1_STRING **)((long)obj + 0xf8));
    AUTHORITY_KEYID_free(*(AUTHORITY_KEYID **)((long)obj + 0x100));
    CRL_DIST_POINTS_free(*(CRL_DIST_POINTS **)((long)obj + 0x110));
    ossl_policy_cache_free(*(undefined8 *)((long)obj + 0x108));
    GENERAL_NAMES_free(*(GENERAL_NAMES **)((long)obj + 0x118));
    NAME_CONSTRAINTS_free(*(NAME_CONSTRAINTS **)((long)obj + 0x120));
    OPENSSL_sk_pop_free(*(undefined8 *)((long)obj + 0x128),IPAddressFamily_free);
    ASIdentifiers_free(*(ASIdentifiers **)((long)obj + 0x130));
    ASN1_OCTET_STRING_free(*(ASN1_STRING **)((long)obj + 0x168));
    CRYPTO_free(*(void **)((long)obj + 0x178));
    break;
  case 4:
    CRYPTO_free_ex_data(3,obj,(CRYPTO_EX_DATA *)((long)obj + 200));
    X509_CERT_AUX_free(*(X509_CERT_AUX **)((long)obj + 0x150));
    ASN1_OCTET_STRING_free(*(ASN1_STRING **)((long)obj + 0xf8));
    AUTHORITY_KEYID_free(*(AUTHORITY_KEYID **)((long)obj + 0x100));
    CRL_DIST_POINTS_free(*(CRL_DIST_POINTS **)((long)obj + 0x110));
    ossl_policy_cache_free(*(undefined8 *)((long)obj + 0x108));
    GENERAL_NAMES_free(*(GENERAL_NAMES **)((long)obj + 0x118));
    NAME_CONSTRAINTS_free(*(NAME_CONSTRAINTS **)((long)obj + 0x120));
    OPENSSL_sk_pop_free(*(undefined8 *)((long)obj + 0x128),IPAddressFamily_free);
    ASIdentifiers_free(*(ASIdentifiers **)((long)obj + 0x130));
    ASN1_OCTET_STRING_free(*(ASN1_STRING **)((long)obj + 0x168));
LAB_00b1f010:
    *(undefined4 *)((long)obj + 0x160) = 0;
    *(undefined8 *)((long)obj + 0xf0) = 0;
    *(undefined8 *)((long)obj + 0xe8) = 0;
    *(undefined8 *)((long)obj + 0xd8) = 0xffffffffffffffff;
    *(undefined8 *)((long)obj + 0xe0) = 0xffffffffffffffff;
    *(undefined8 *)((long)obj + 0x100) = 0;
    *(undefined8 *)((long)obj + 0xf8) = 0;
    *(undefined8 *)((long)obj + 0x110) = 0;
    *(undefined8 *)((long)obj + 0x108) = 0;
    *(undefined8 *)((long)obj + 0x120) = 0;
    *(undefined8 *)((long)obj + 0x118) = 0;
    *(undefined8 *)((long)obj + 0x130) = 0;
    *(undefined8 *)((long)obj + 0x128) = 0;
    *(undefined8 *)((long)obj + 0x168) = 0;
    *(undefined8 *)((long)obj + 0x150) = 0;
    iVar1 = CRYPTO_new_ex_data(3,obj,(CRYPTO_EX_DATA *)((long)obj + 200));
    if (iVar1 == 0) {
      return 0;
    }
    break;
  case 0xf:
    if (obj != (void *)0x0) {
      pcVar2 = (char *)param_4[0x2f];
      *(undefined8 *)((long)obj + 0x170) = param_4[0x2e];
      CRYPTO_free(*(void **)((long)obj + 0x178));
      *(undefined8 *)((long)obj + 0x178) = 0;
      if (pcVar2 != (char *)0x0) {
        pcVar2 = CRYPTO_strdup(pcVar2,"crypto/x509/x_x509.c",0x99);
        *(char **)((long)obj + 0x178) = pcVar2;
        if (pcVar2 == (char *)0x0) {
          return 0;
        }
      }
    }
    break;
  case 0x10:
    uVar3 = *(undefined8 *)((long)obj + 0x170);
    goto LAB_00b1f0b4;
  case 0x11:
    uVar3 = *(undefined8 *)((long)obj + 0x178);
LAB_00b1f0b4:
    *param_4 = uVar3;
  }
  return 1;
}

