/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0cea8
 */

/* WARNING: Type propagation algorithm not settling */

int X509_TRUST_add(int id,int flags,ck *ck,char *name,int arg1,void *arg2)

{
  byte bVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  char *pcVar5;
  undefined8 uVar6;
  uint uVar7;
  int *ptr;
  int local_78 [10];
  
  uVar7 = id - 1;
  if (uVar7 < 8) {
LAB_00b0cee8:
    ptr = (int *)(&DAT_00cc9bf8 + (long)(int)uVar7 * 0x28);
    bVar1 = (&DAT_00cc9bfc)[(long)(int)uVar7 * 0x28];
  }
  else {
    if (((DAT_00d227e8 == 0) ||
        (local_78[0] = id, iVar4 = OPENSSL_sk_find(DAT_00d227e8,local_78), iVar4 < 0)) ||
       (uVar7 = iVar4 + 8, (int)uVar7 < 0)) {
      ptr = CRYPTO_malloc(0x28,"crypto/x509/x509_trust.c",0x8a);
      if (ptr == (int *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_trust.c",0x8b,"X509_TRUST_add");
        ERR_set_error(0xb,0xc0100,0);
        return 0;
      }
      bVar3 = true;
      bVar2 = true;
      ptr[1] = 1;
      bVar1 = *(byte *)(ptr + 1);
      goto joined_r0x00b0d004;
    }
    if ((int)uVar7 < 8) goto LAB_00b0cee8;
    ptr = (int *)OPENSSL_sk_value(DAT_00d227e8,iVar4);
    bVar1 = *(byte *)(ptr + 1);
  }
  bVar3 = false;
  bVar2 = false;
joined_r0x00b0d004:
  if ((bVar1 >> 1 & 1) != 0) {
    CRYPTO_free(*(void **)(ptr + 4));
    bVar2 = bVar3;
  }
  pcVar5 = CRYPTO_strdup(name,"crypto/x509/x509_trust.c",0x96);
  *(char **)(ptr + 4) = pcVar5;
  if (pcVar5 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_trust.c",0x97,"X509_TRUST_add");
    ERR_set_error(0xb,0xc0100,0);
    if (!bVar2) {
      return 0;
    }
  }
  else {
    *(ck **)(ptr + 2) = ck;
    ptr[6] = arg1;
    *ptr = id;
    ptr[1] = flags & 0xfffffffcU | ptr[1] & 1U | 2;
    *(void **)(ptr + 8) = arg2;
    if (!bVar2) {
      return 1;
    }
    if ((DAT_00d227e8 == 0) && (DAT_00d227e8 = OPENSSL_sk_new(&LAB_00b0d110), DAT_00d227e8 == 0)) {
      ERR_new();
      uVar6 = 0xa8;
    }
    else {
      iVar4 = OPENSSL_sk_push(DAT_00d227e8,ptr);
      if (iVar4 != 0) {
        return 1;
      }
      ERR_new();
      uVar6 = 0xac;
    }
    ERR_set_debug("crypto/x509/x509_trust.c",uVar6,"X509_TRUST_add");
    ERR_set_error(0xb,0xc0100,0);
  }
  CRYPTO_free(*(void **)(ptr + 4));
  CRYPTO_free(ptr);
  return 0;
}

