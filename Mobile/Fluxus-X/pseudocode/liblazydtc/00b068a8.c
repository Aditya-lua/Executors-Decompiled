/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b068a8
 */

undefined8 FUN_00b068a8(long *param_1,int *param_2)

{
  int iVar1;
  void *pvVar2;
  undefined8 uVar3;
  long lVar4;
  void *pvVar5;
  size_t __n;
  
  if ((((param_2[1] == 0x16) && (pvVar5 = *(void **)(param_2 + 2), pvVar5 != (void *)0x0)) &&
      (__n = (size_t)*param_2, *param_2 != 0)) &&
     (pvVar2 = memchr(pvVar5,0,__n), pvVar2 == (void *)0x0)) {
    if (*param_1 == 0) {
      lVar4 = OPENSSL_sk_new(&LAB_00b073c4);
      *param_1 = lVar4;
      if (lVar4 == 0) {
        return 0;
      }
      pvVar5 = *(void **)(param_2 + 2);
      __n = (size_t)*param_2;
    }
    pvVar5 = (void *)CRYPTO_strndup(pvVar5,__n,"crypto/x509/v3_utl.c",0x225);
    lVar4 = *param_1;
    if (pvVar5 != (void *)0x0) {
      iVar1 = OPENSSL_sk_find(lVar4,pvVar5);
      if (iVar1 != -1) {
        CRYPTO_free(pvVar5);
        return 1;
      }
      iVar1 = OPENSSL_sk_push(*param_1,pvVar5);
      if (iVar1 != 0) goto LAB_00b068f0;
      CRYPTO_free(pvVar5);
      lVar4 = *param_1;
    }
    OPENSSL_sk_pop_free(lVar4,&LAB_00b06a50);
    uVar3 = 0;
    *param_1 = 0;
  }
  else {
LAB_00b068f0:
    uVar3 = 1;
  }
  return uVar3;
}

