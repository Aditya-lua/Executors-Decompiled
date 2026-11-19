/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009abfc0
 */

long * ssl_cert_dup(long *param_1)

{
  int iVar1;
  long *ptr;
  long lVar2;
  long lVar3;
  void *pvVar4;
  char *pcVar5;
  undefined8 uVar6;
  ulong uVar7;
  
  ptr = (long *)CRYPTO_zalloc(0x218,"ssl/ssl_cert.c",0x57);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",0x5b,"ssl_cert_dup");
    ERR_set_error(0x14,0xc0100,0);
    return (long *)0x0;
  }
  *(undefined4 *)(ptr + 0x41) = 1;
  *ptr = (long)ptr + (*param_1 - (long)(param_1 + 4)) + 0x20;
  lVar2 = CRYPTO_THREAD_lock_new();
  ptr[0x42] = lVar2;
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",99,"ssl_cert_dup");
    ERR_set_error(0x14,0xc0100,0);
    CRYPTO_free(ptr);
    return (long *)0x0;
  }
  if (param_1[1] != 0) {
    ptr[1] = param_1[1];
    EVP_PKEY_up_ref();
  }
  lVar2 = 0;
  uVar7 = 0;
  ptr[2] = param_1[2];
  *(int *)(ptr + 3) = (int)param_1[3];
  do {
    lVar3 = *(long *)((long)param_1 + lVar2 + 0x20);
    if (lVar3 != 0) {
      *(long *)((long)ptr + lVar2 + 0x20) = lVar3;
      X509_up_ref();
    }
    lVar3 = *(long *)((long)param_1 + lVar2 + 0x28);
    if (lVar3 != 0) {
      *(long *)((long)ptr + lVar2 + 0x28) = lVar3;
      EVP_PKEY_up_ref(*(undefined8 *)((long)param_1 + lVar2 + 0x28));
    }
    if (*(long *)((long)param_1 + lVar2 + 0x30) != 0) {
      lVar3 = X509_chain_up_ref();
      *(long *)((long)ptr + lVar2 + 0x30) = lVar3;
      if (lVar3 != 0) goto LAB_009ac0a4;
      ERR_new();
      uVar6 = 0x80;
LAB_009ac224:
      ERR_set_debug("ssl/ssl_cert.c",uVar6,"ssl_cert_dup");
      ERR_set_error(0x14,0xc0100,0);
      goto LAB_009ac23c;
    }
LAB_009ac0a4:
    if (*(long *)((long)param_1 + lVar2 + 0x38) != 0) {
      pvVar4 = CRYPTO_malloc((int)*(undefined8 *)((long)param_1 + lVar2 + 0x40),"ssl/ssl_cert.c",
                             0x87);
      *(void **)((long)ptr + lVar2 + 0x38) = pvVar4;
      if (pvVar4 == (void *)0x0) {
        ERR_new();
        uVar6 = 0x89;
        goto LAB_009ac224;
      }
      *(undefined8 *)((long)ptr + lVar2 + 0x40) = *(undefined8 *)((long)param_1 + lVar2 + 0x40);
      memcpy(pvVar4,*(void **)((long)param_1 + lVar2 + 0x38),
             *(size_t *)((long)param_1 + lVar2 + 0x40));
    }
    uVar7 = uVar7 + 1;
    lVar2 = lVar2 + 0x28;
  } while (uVar7 < 9);
  if (param_1[0x33] == 0) {
    ptr[0x33] = 0;
    if (param_1[0x35] != 0) goto LAB_009ac134;
LAB_009ac270:
    ptr[0x35] = 0;
    lVar2 = param_1[0x31];
  }
  else {
    pvVar4 = CRYPTO_malloc((int)(param_1[0x34] << 1),"ssl/ssl_cert.c",0x95);
    ptr[0x33] = (long)pvVar4;
    if (pvVar4 == (void *)0x0) goto LAB_009ac23c;
    memcpy(pvVar4,(void *)param_1[0x33],param_1[0x34] << 1);
    ptr[0x34] = param_1[0x34];
    if (param_1[0x35] == 0) goto LAB_009ac270;
LAB_009ac134:
    pvVar4 = CRYPTO_malloc((int)(param_1[0x36] << 1),"ssl/ssl_cert.c",0xa0);
    ptr[0x35] = (long)pvVar4;
    if (pvVar4 == (void *)0x0) goto LAB_009ac23c;
    memcpy(pvVar4,(void *)param_1[0x35],param_1[0x36] << 1);
    ptr[0x36] = param_1[0x36];
    lVar2 = param_1[0x31];
  }
  if (lVar2 != 0) {
    lVar2 = CRYPTO_memdup(lVar2,param_1[0x32],"ssl/ssl_cert.c",0xaa);
    ptr[0x31] = lVar2;
    if (lVar2 == 0) goto LAB_009ac23c;
    ptr[0x32] = param_1[0x32];
  }
  *(undefined4 *)((long)ptr + 0x1c) = *(undefined4 *)((long)param_1 + 0x1c);
  lVar2 = param_1[0x37];
  ptr[0x38] = param_1[0x38];
  ptr[0x37] = lVar2;
  if (param_1[0x3a] != 0) {
    X509_STORE_up_ref();
    ptr[0x3a] = param_1[0x3a];
  }
  if (param_1[0x39] != 0) {
    X509_STORE_up_ref();
    ptr[0x39] = param_1[0x39];
  }
  ptr[0x3d] = param_1[0x3d];
  *(int *)(ptr + 0x3e) = (int)param_1[0x3e];
  ptr[0x3f] = param_1[0x3f];
  iVar1 = custom_exts_copy(ptr + 0x3b,param_1 + 0x3b);
  if (iVar1 != 0) {
    if ((char *)param_1[0x40] == (char *)0x0) {
      return ptr;
    }
    pcVar5 = CRYPTO_strdup((char *)param_1[0x40],"ssl/ssl_cert.c",199);
    ptr[0x40] = (long)pcVar5;
    if (pcVar5 != (char *)0x0) {
      return ptr;
    }
  }
LAB_009ac23c:
  ssl_cert_free(ptr);
  return (long *)0x0;
}

