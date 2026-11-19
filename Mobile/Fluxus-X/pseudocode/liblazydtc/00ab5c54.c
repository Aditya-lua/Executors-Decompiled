/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5c54
 */

/* WARNING: Removing unreachable block (ram,0x00ab5fe0) */
/* WARNING: Removing unreachable block (ram,0x00ab5fd4) */
/* WARNING: Removing unreachable block (ram,0x00ab5fec) */

undefined8
FUN_00ab5c54(undefined8 *param_1,long *param_2,undefined8 *param_3,char *param_4,undefined8 param_5,
            undefined1 *param_6,void *param_7,uint param_8)

{
  uchar *puVar1;
  char *ptr;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  size_t sVar6;
  EVP_PKEY_ASN1_METHOD *pEVar7;
  ulong uVar8;
  undefined8 uVar9;
  char *__s1;
  long local_98;
  uchar *local_90;
  char *local_88;
  char *local_80;
  EVP_CIPHER_INFO local_78;
  
  __s1 = (char *)0x0;
  local_88 = (char *)0x0;
  local_80 = (char *)0x0;
  local_98 = 0;
  local_90 = (uchar *)0x0;
LAB_00ab5cb8:
  do {
    if ((param_8 & 1) == 0) {
      CRYPTO_free(__s1);
      CRYPTO_free(local_88);
      CRYPTO_free(local_90);
    }
    else {
      CRYPTO_secure_clear_free(__s1,0,"crypto/pem/pem_lib.c",0xe0);
      CRYPTO_secure_clear_free(local_88,0,"crypto/pem/pem_lib.c",0xe0);
      CRYPTO_secure_clear_free(local_90,local_98,"crypto/pem/pem_lib.c",0xe0);
    }
    iVar3 = PEM_read_bio_ex(param_5,&local_80,&local_88,&local_90,&local_98,param_8);
    __s1 = local_80;
    if (iVar3 == 0) {
      uVar8 = ERR_peek_error();
      if ((((int)(uint)uVar8 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar8) != 0x6c) {
        return 0;
      }
      ERR_add_error_data(2,"Expecting: ",param_4);
      goto LAB_00ab6134;
    }
    iVar3 = strcmp(local_80,param_4);
    if (iVar3 == 0) break;
    iVar3 = strcmp(param_4,"ANY PRIVATE KEY");
    if (iVar3 == 0) {
      iVar3 = strcmp(__s1,"ENCRYPTED PRIVATE KEY");
      if ((iVar3 == 0) || (iVar3 = strcmp(__s1,"PRIVATE KEY"), iVar3 == 0)) break;
      sVar6 = strlen(__s1);
      iVar3 = (int)sVar6;
      bVar2 = false;
      if (0xc < iVar3) {
        iVar4 = strcmp(__s1 + (long)iVar3 + -0xb,"PRIVATE KEY");
        bVar2 = false;
        if (iVar4 == 0) {
          bVar2 = false;
          if (__s1[(long)iVar3 + -0xc] == ' ') {
            iVar3 = (int)(__s1 + (long)iVar3 + -0xc) - (int)__s1;
            if ((iVar3 < 1) ||
               (pEVar7 = EVP_PKEY_asn1_find_str((ENGINE **)0x0,__s1,iVar3),
               pEVar7 == (EVP_PKEY_ASN1_METHOD *)0x0)) goto LAB_00ab5cb8;
            bVar2 = false;
            if (*(long *)(pEVar7 + 0xb8) != 0) break;
          }
        }
      }
    }
    else {
      iVar3 = strcmp(param_4,"PARAMETERS");
      if (iVar3 == 0) {
        sVar6 = strlen(__s1);
        iVar3 = (int)sVar6;
        bVar2 = false;
        if (0xb < iVar3) {
          iVar4 = strcmp(__s1 + (long)iVar3 + -10,"PARAMETERS");
          bVar2 = false;
          if (iVar4 == 0) {
            bVar2 = false;
            if (__s1[(long)iVar3 + -0xb] == ' ') {
              iVar3 = (int)(__s1 + (long)iVar3 + -0xb) - (int)__s1;
              if ((iVar3 < 1) ||
                 (pEVar7 = EVP_PKEY_asn1_find_str((ENGINE **)&local_78,__s1,iVar3),
                 pEVar7 == (EVP_PKEY_ASN1_METHOD *)0x0)) goto LAB_00ab5cb8;
              bVar2 = *(long *)(pEVar7 + 0x70) != 0;
              ENGINE_finish((ENGINE *)local_78.cipher);
            }
          }
        }
      }
      else {
        iVar3 = strcmp(__s1,"X9.42 DH PARAMETERS");
        if (((((((iVar3 == 0) && (iVar3 = strcmp(param_4,"DH PARAMETERS"), iVar3 == 0)) ||
               ((iVar3 = strcmp(__s1,"X509 CERTIFICATE"), iVar3 == 0 &&
                (iVar4 = strcmp(param_4,"CERTIFICATE"), iVar4 == 0)))) ||
              ((iVar4 = strcmp(__s1,"NEW CERTIFICATE REQUEST"), iVar4 == 0 &&
               (iVar4 = strcmp(param_4,"CERTIFICATE REQUEST"), iVar4 == 0)))) ||
             ((iVar4 = strcmp(__s1,"CERTIFICATE"), iVar4 == 0 &&
              (iVar5 = strcmp(param_4,"TRUSTED CERTIFICATE"), iVar5 == 0)))) ||
            ((((iVar3 == 0 && (iVar3 = strcmp(param_4,"TRUSTED CERTIFICATE"), iVar3 == 0)) ||
              ((iVar4 == 0 && (iVar3 = strcmp(param_4,"PKCS7"), iVar3 == 0)))) ||
             ((iVar3 = strcmp(__s1,"PKCS #7 SIGNED DATA"), iVar3 == 0 &&
              (iVar3 = strcmp(param_4,"PKCS7"), iVar3 == 0)))))) ||
           ((iVar4 == 0 && (iVar3 = strcmp(param_4,"CMS"), iVar3 == 0)))) break;
        iVar3 = strcmp(__s1,"PKCS7");
        bVar2 = false;
        if (iVar3 == 0) {
          iVar3 = strcmp(param_4,"CMS");
          bVar2 = false;
          if (iVar3 == 0) break;
        }
      }
    }
  } while (!bVar2);
  ptr = local_88;
  iVar3 = PEM_get_EVP_CIPHER_INFO(local_88,&local_78);
  puVar1 = local_90;
  if ((iVar3 == 0) ||
     (iVar3 = PEM_do_header(&local_78,local_90,&local_98,param_6,param_7), iVar3 == 0)) {
    bVar2 = true;
    if ((param_8 & 1) != 0) goto LAB_00ab60ec;
LAB_00ab6068:
    CRYPTO_free(__s1);
    CRYPTO_free(ptr);
    if (!bVar2) goto LAB_00ab6154;
    CRYPTO_free(local_90);
LAB_00ab6134:
    uVar9 = 0;
  }
  else {
    *param_1 = puVar1;
    *param_2 = local_98;
    if (param_3 == (undefined8 *)0x0) {
      bVar2 = false;
      if ((param_8 & 1) == 0) goto LAB_00ab6068;
LAB_00ab60ec:
      CRYPTO_secure_clear_free(__s1,0,"crypto/pem/pem_lib.c",0xe0);
      CRYPTO_secure_clear_free(ptr,0,"crypto/pem/pem_lib.c",0xe0);
      if (bVar2) {
        CRYPTO_secure_clear_free(local_90,local_98,"crypto/pem/pem_lib.c",0xe0);
        goto LAB_00ab6134;
      }
    }
    else {
      *param_3 = __s1;
      if ((param_8 & 1) == 0) {
        CRYPTO_free(ptr);
      }
      else {
        CRYPTO_secure_clear_free(ptr,0,"crypto/pem/pem_lib.c",0xe0);
      }
    }
LAB_00ab6154:
    uVar9 = 1;
  }
  return uVar9;
}

