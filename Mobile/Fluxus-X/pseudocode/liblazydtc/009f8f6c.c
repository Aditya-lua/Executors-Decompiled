/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8f6c
 */

undefined8
ASYNC_start_job(long *param_1,undefined8 param_2,undefined4 *param_3,undefined8 param_4,
               void *param_5,size_t param_6)

{
  int iVar1;
  undefined8 uVar2;
  void *ptr;
  long lVar3;
  undefined8 *puVar4;
  void *pvVar5;
  
  uVar2 = OPENSSL_init_crypto(0x100,0);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  ptr = (void *)CRYPTO_THREAD_get_local(&DAT_00d218e8);
  if (ptr == (void *)0x0) {
    uVar2 = ossl_init_thread_start(0,0,FUN_009f9704);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    ptr = CRYPTO_malloc(0x18,"crypto/async/async.c",0x2a);
    if (ptr == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/async/async.c",0x2c,"async_ctx_new");
      ERR_set_error(0x33,0xc0100,0);
LAB_009f9194:
      CRYPTO_free(ptr);
      return 0;
    }
    *(undefined8 *)((long)ptr + 8) = 0;
    *(undefined4 *)((long)ptr + 0x10) = 0;
    iVar1 = CRYPTO_THREAD_set_local(&DAT_00d218e8,ptr);
    if (iVar1 == 0) goto LAB_009f9194;
  }
  lVar3 = *param_1;
  if (lVar3 == 0) {
    lVar3 = *(long *)((long)ptr + 8);
    if (lVar3 != 0) goto LAB_009f9028;
    puVar4 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d218ec);
    if (puVar4 == (undefined8 *)0x0) {
      iVar1 = ASYNC_init_thread(0,0);
      if (iVar1 == 0) goto LAB_009f930c;
      puVar4 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d218ec);
    }
    lVar3 = OPENSSL_sk_pop(*puVar4);
    if (lVar3 == 0) {
      if ((puVar4[2] == 0) || ((ulong)puVar4[1] < (ulong)puVar4[2])) {
        pvVar5 = (void *)CRYPTO_zalloc(0x30,"crypto/async/async.c",0x54);
        if (pvVar5 == (void *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/async/async.c",0x56,"async_job_new");
          ERR_set_error(0x33,0xc0100,0);
        }
        else {
          *(undefined4 *)((long)pvVar5 + 0x1c) = 0;
          CRYPTO_free(*(void **)((long)pvVar5 + 0x10));
          CRYPTO_free(pvVar5);
        }
      }
LAB_009f930c:
      *(undefined8 *)((long)ptr + 8) = 0;
      return 1;
    }
    *(long *)((long)ptr + 8) = lVar3;
    if (param_5 == (void *)0x0) {
      *(undefined8 *)(lVar3 + 0x10) = 0;
    }
    else {
      pvVar5 = CRYPTO_malloc((int)param_6,"crypto/async/async.c",0x101);
      *(void **)(*(long *)((long)ptr + 8) + 0x10) = pvVar5;
      if (pvVar5 == (void *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/async/async.c",0x103,"ASYNC_start_job");
        ERR_set_error(0x33,0xc0100,0);
        FUN_009f9318(*(undefined8 *)((long)ptr + 8));
        *(undefined8 *)((long)ptr + 8) = 0;
        return 0;
      }
      memcpy(pvVar5,param_5,param_6);
      lVar3 = *(long *)((long)ptr + 8);
    }
    *(undefined8 *)(lVar3 + 8) = param_4;
    *(undefined8 *)(lVar3 + 0x20) = param_2;
    ossl_lib_ctx_get_concrete(0);
    ERR_new();
    uVar2 = 0x112;
LAB_009f9258:
    ERR_set_debug("crypto/async/async.c",uVar2,"ASYNC_start_job");
    uVar2 = 0x66;
  }
  else {
    *(long *)((long)ptr + 8) = lVar3;
LAB_009f9028:
    iVar1 = *(int *)(lVar3 + 0x1c);
    if (iVar1 == 1) {
      *param_1 = lVar3;
      *(undefined4 *)(*(long *)((long)ptr + 8) + 0x1c) = 2;
      *(undefined8 *)((long)ptr + 8) = 0;
      return 2;
    }
    if (iVar1 == 2) {
      lVar3 = *param_1;
      if (lVar3 == 0) {
        return 0;
      }
      *(long *)((long)ptr + 8) = lVar3;
      lVar3 = OSSL_LIB_CTX_set0_default(*(undefined8 *)(lVar3 + 0x28));
      if (lVar3 != 0) {
        uVar2 = OSSL_LIB_CTX_set0_default();
        *(undefined8 *)(*(long *)((long)ptr + 8) + 0x28) = uVar2;
        ERR_new();
        uVar2 = 0xe8;
        goto LAB_009f9258;
      }
      ERR_new();
      uVar2 = 0xe1;
    }
    else {
      if (iVar1 == 3) {
        *param_3 = *(undefined4 *)(lVar3 + 0x18);
        *(undefined8 *)(lVar3 + 0x20) = 0;
        FUN_009f9318();
        *(undefined8 *)((long)ptr + 8) = 0;
        *param_1 = 0;
        return 3;
      }
      ERR_new();
      uVar2 = 0xf5;
    }
    ERR_set_debug("crypto/async/async.c",uVar2,"ASYNC_start_job");
    uVar2 = 0xc0103;
  }
  ERR_set_error(0x33,uVar2,0);
  FUN_009f9318(*(undefined8 *)((long)ptr + 8));
  *(undefined8 *)((long)ptr + 8) = 0;
  *param_1 = 0;
  return 0;
}

