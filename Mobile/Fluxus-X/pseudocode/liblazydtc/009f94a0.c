/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f94a0
 */

undefined8 ASYNC_init_thread(ulong param_1,ulong param_2)

{
  int iVar1;
  long *ptr;
  long lVar2;
  void *pvVar3;
  undefined8 uVar4;
  
  if (param_1 < param_2) {
    ERR_new();
    ERR_set_debug("crypto/async/async.c",0x166,"ASYNC_init_thread");
    uVar4 = 0x67;
  }
  else {
    uVar4 = OPENSSL_init_crypto(0x100,0);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    uVar4 = ossl_init_thread_start(0,0,FUN_009f9704);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    ptr = (long *)CRYPTO_zalloc(0x18,"crypto/async/async.c",0x170);
    if (ptr != (long *)0x0) {
      lVar2 = OPENSSL_sk_new_reserve(0,param_2 & 0xffffffff);
      *ptr = lVar2;
      if (lVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/async/async.c",0x178,"ASYNC_init_thread");
        ERR_set_error(0x33,0xc0100,0);
      }
      else {
        ptr[2] = param_1;
        if (param_2 != 0) {
          pvVar3 = (void *)CRYPTO_zalloc(0x30,"crypto/async/async.c",0x54);
          if (pvVar3 == (void *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/async/async.c",0x56,"async_job_new");
            ERR_set_error(0x33,0xc0100,0);
          }
          else {
            *(undefined4 *)((long)pvVar3 + 0x1c) = 0;
            CRYPTO_free(*(void **)((long)pvVar3 + 0x10));
            CRYPTO_free(pvVar3);
          }
        }
        ptr[1] = 0;
        iVar1 = CRYPTO_THREAD_set_local(&DAT_00d218ec,ptr);
        if (iVar1 != 0) {
          return 1;
        }
        ERR_new();
        ERR_set_debug("crypto/async/async.c",0x191,"ASYNC_init_thread");
        ERR_set_error(0x33,0x65,0);
        if ((*ptr != 0) && (pvVar3 = (void *)OPENSSL_sk_pop(), pvVar3 != (void *)0x0)) {
          do {
            CRYPTO_free(*(void **)((long)pvVar3 + 0x10));
            CRYPTO_free(pvVar3);
            pvVar3 = (void *)OPENSSL_sk_pop(*ptr);
          } while (pvVar3 != (void *)0x0);
        }
        OPENSSL_sk_free(*ptr);
      }
      CRYPTO_free(ptr);
      return 0;
    }
    ERR_new();
    ERR_set_debug("crypto/async/async.c",0x172,"ASYNC_init_thread");
    uVar4 = 0xc0100;
  }
  ERR_set_error(0x33,uVar4,0);
  return 0;
}

