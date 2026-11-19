/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac4c4c
 */

undefined8
ossl_method_store_cache_set
          (long param_1,long param_2,int param_3,char *param_4,long param_5,code *param_6,
          long param_7)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  size_t sVar4;
  long *ptr;
  void *pvVar5;
  undefined8 uVar6;
  long local_90;
  char *local_88;
  int local_80;
  char local_7c;
  
  if (param_2 == 0) {
    return 0;
  }
  if (param_1 == 0) {
    return 0;
  }
  if (param_3 < 1) {
    return 0;
  }
  if (param_4 == (char *)0x0) {
    return 0;
  }
  iVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x10));
  if (iVar2 == 0) {
    return 0;
  }
  if (*(int *)(param_1 + 0x28) != 0) {
    local_88 = (char *)0x0;
    local_7c = '\0';
    local_80 = OPENSSL_rdtsc();
    if (local_80 == 0) {
      local_7c = '\x01';
      local_80 = DAT_00cc9188;
    }
    *(undefined4 *)(param_1 + 0x28) = 0;
    ossl_sa_doall_arg(*(undefined8 *)(param_1 + 8),&LAB_00ac4f34,&local_90);
    *(char **)(param_1 + 0x20) = local_88;
    if (local_7c != '\0') {
      DAT_00cc9188 = local_80;
    }
  }
  lVar3 = ossl_sa_get(*(undefined8 *)(param_1 + 8),(long)param_3);
  if (lVar3 == 0) {
    ptr = (long *)0x0;
  }
  else {
    if (param_5 == 0) {
      local_90 = param_2;
      local_88 = param_4;
      pvVar5 = (void *)OPENSSL_LH_delete(*(undefined8 *)(lVar3 + 0x10),&local_90);
      if (pvVar5 == (void *)0x0) {
        uVar6 = 1;
      }
      else {
        (**(code **)((long)pvVar5 + 0x20))(*(undefined8 *)((long)pvVar5 + 0x10));
        CRYPTO_free(pvVar5);
        uVar6 = 1;
        *(long *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) + -1;
      }
      goto LAB_00ac4de8;
    }
    sVar4 = strlen(param_4);
    ptr = CRYPTO_malloc((int)sVar4 + 0x30,"crypto/property/property.c",0x2e7);
    if (ptr != (long *)0x0) {
      ptr[2] = param_5;
      ptr[3] = (long)param_6;
      *ptr = param_2;
      ptr[1] = (long)(ptr + 5);
      ptr[4] = param_7;
      iVar2 = (*param_6)(param_5);
      if (iVar2 != 0) {
        memcpy((void *)ptr[1],param_4,sVar4 + 1);
        pvVar5 = (void *)OPENSSL_LH_insert(*(undefined8 *)(lVar3 + 0x10),ptr);
        if (pvVar5 != (void *)0x0) {
          (**(code **)((long)pvVar5 + 0x20))(*(undefined8 *)((long)pvVar5 + 0x10));
          CRYPTO_free(pvVar5);
          uVar6 = 1;
          goto LAB_00ac4de8;
        }
        iVar2 = OPENSSL_LH_error(*(undefined8 *)(lVar3 + 0x10));
        if (iVar2 == 0) {
          uVar6 = 1;
          uVar1 = *(long *)(param_1 + 0x20) + 1;
          *(ulong *)(param_1 + 0x20) = uVar1;
          if (499 < uVar1) {
            *(undefined4 *)(param_1 + 0x28) = 1;
          }
          goto LAB_00ac4de8;
        }
        (*(code *)ptr[4])(ptr[2]);
      }
    }
  }
  CRYPTO_free(ptr);
  uVar6 = 0;
LAB_00ac4de8:
  CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x10));
  return uVar6;
}

