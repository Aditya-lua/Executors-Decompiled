/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99b54
 */

void * CRYPTO_clear_realloc
                 (void *param_1,ulong param_2,ulong param_3,undefined8 param_4,undefined4 param_5)

{
  void *pvVar1;
  
  if (param_1 == (void *)0x0) {
    if ((code *)PTR_CRYPTO_malloc_00cc9138 != CRYPTO_malloc) {
                    /* WARNING: Could not recover jumptable at 0x00a99bc8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      pvVar1 = (void *)(*(code *)PTR_CRYPTO_malloc_00cc9138)(param_3,param_4,param_5);
      return pvVar1;
    }
    if (param_3 != 0) {
      if ((DAT_00d220e8 & 1) == 0) {
        DAT_00d220e8 = 1;
      }
      pvVar1 = malloc(param_3);
      return pvVar1;
    }
  }
  else {
    if (param_3 == 0) {
      if (param_2 != 0) {
        OPENSSL_cleanse(param_1,param_2);
      }
      if ((code *)PTR_CRYPTO_free_00cc9148 == CRYPTO_free) {
        free(param_1);
        return (void *)0x0;
      }
      (*(code *)PTR_CRYPTO_free_00cc9148)(param_1,param_4,param_5);
      return (void *)0x0;
    }
    if (param_3 <= param_2 && param_2 - param_3 != 0) {
      OPENSSL_cleanse((void *)((long)param_1 + param_3),param_2 - param_3);
      return param_1;
    }
    if ((code *)PTR_CRYPTO_malloc_00cc9138 == CRYPTO_malloc) {
      if ((DAT_00d220e8 & 1) == 0) {
        DAT_00d220e8 = 1;
      }
      pvVar1 = malloc(param_3);
    }
    else {
      pvVar1 = (void *)(*(code *)PTR_CRYPTO_malloc_00cc9138)(param_3,param_4,param_5);
    }
    if (pvVar1 != (void *)0x0) {
      memcpy(pvVar1,param_1,param_2);
      if (param_2 != 0) {
        OPENSSL_cleanse(param_1,param_2);
      }
      if ((code *)PTR_CRYPTO_free_00cc9148 == CRYPTO_free) {
        free(param_1);
      }
      else {
        (*(code *)PTR_CRYPTO_free_00cc9148)(param_1,param_4,param_5);
      }
      return pvVar1;
    }
  }
  return (void *)0x0;
}

