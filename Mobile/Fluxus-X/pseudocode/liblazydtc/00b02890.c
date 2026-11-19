/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02890
 */

/* WARNING: Type propagation algorithm not settling */

int X509_PURPOSE_add(int id,int trust,int flags,ck *ck,char *name,char *sname,void *arg)

{
  byte bVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  char *pcVar5;
  undefined8 uVar6;
  uint uVar7;
  int *ptr;
  int local_90 [12];
  
  uVar7 = id - 1;
  if (8 < uVar7) {
    if (((DAT_00d227e0 == 0) ||
        (local_90[0] = id, iVar4 = OPENSSL_sk_find(DAT_00d227e0,local_90), iVar4 < 0)) ||
       (uVar7 = iVar4 + 9, uVar7 == 0xffffffff)) {
      ptr = CRYPTO_malloc(0x30,"crypto/x509/v3_purp.c",0xa8);
      if (ptr == (int *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_purp.c",0xa9,"X509_PURPOSE_add");
        ERR_set_error(0x22,0xc0100,0);
        return 0;
      }
      bVar3 = true;
      bVar2 = true;
      ptr[2] = 1;
      bVar1 = *(byte *)(ptr + 2);
      goto joined_r0x00b02a00;
    }
    if ((int)uVar7 < 0) {
      bVar3 = false;
      bVar2 = false;
      ptr = (int *)0x0;
      bVar1 = bRam0000000000000008;
      goto joined_r0x00b02a00;
    }
    if (8 < (int)uVar7) {
      ptr = (int *)OPENSSL_sk_value(DAT_00d227e0,iVar4);
      bVar3 = false;
      bVar2 = false;
      bVar1 = *(byte *)(ptr + 2);
      goto joined_r0x00b02a00;
    }
  }
  bVar3 = false;
  bVar2 = false;
  ptr = (int *)(&DAT_00cc9a28 + (long)(int)uVar7 * 0x30);
  bVar1 = (&DAT_00cc9a30)[(long)(int)uVar7 * 0x30];
joined_r0x00b02a00:
  if ((bVar1 >> 1 & 1) != 0) {
    CRYPTO_free(*(void **)(ptr + 6));
    CRYPTO_free(*(void **)(ptr + 8));
    bVar2 = bVar3;
  }
  pcVar5 = CRYPTO_strdup(name,"crypto/x509/v3_purp.c",0xb6);
  *(char **)(ptr + 6) = pcVar5;
  pcVar5 = CRYPTO_strdup(sname,"crypto/x509/v3_purp.c",0xb7);
  *(char **)(ptr + 8) = pcVar5;
  if ((pcVar5 == (char *)0x0) || (*(long *)(ptr + 6) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_purp.c",0xb9,"X509_PURPOSE_add");
    ERR_set_error(0x22,0xc0100,0);
    if (!bVar2) {
      return 0;
    }
  }
  else {
    *ptr = id;
    ptr[1] = trust;
    *(ck **)(ptr + 4) = ck;
    ptr[2] = flags & 0xfffffffcU | ptr[2] & 1U | 2;
    *(void **)(ptr + 10) = arg;
    if (!bVar2) {
      return 1;
    }
    if ((DAT_00d227e0 == 0) && (DAT_00d227e0 = OPENSSL_sk_new(&LAB_00b02b64), DAT_00d227e0 == 0)) {
      ERR_new();
      uVar6 = 0xca;
    }
    else {
      iVar4 = OPENSSL_sk_push(DAT_00d227e0,ptr);
      if (iVar4 != 0) {
        return 1;
      }
      ERR_new();
      uVar6 = 0xce;
    }
    ERR_set_debug("crypto/x509/v3_purp.c",uVar6,"X509_PURPOSE_add");
    ERR_set_error(0x22,0xc0100,0);
  }
  CRYPTO_free(*(void **)(ptr + 6));
  CRYPTO_free(*(void **)(ptr + 8));
  CRYPTO_free(ptr);
  return 0;
}

