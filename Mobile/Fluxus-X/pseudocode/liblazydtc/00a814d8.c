/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a814d8
 */

void * ossl_lib_ctx_get_data(undefined8 *param_1,int param_2,undefined4 *param_3)

{
  int iVar1;
  int iVar2;
  void *pvVar3;
  int *piVar4;
  
  if ((param_1 == (undefined8 *)0x0) &&
     (((iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348), iVar1 == 0 ||
       (DAT_00d21d60 == 0)) ||
      (param_1 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d21d58), param_1 == (undefined8 *)0x0)
      ))) {
    param_1 = &DAT_00d21b90;
  }
  iVar1 = CRYPTO_THREAD_read_lock(*param_1);
  if (iVar1 == 0) {
    return (void *)0x0;
  }
  piVar4 = (int *)((long)param_1 + (long)param_2 * 4 + 0xb0);
  iVar1 = *piVar4;
  CRYPTO_THREAD_unlock(*param_1);
  if (iVar1 == -1) {
    iVar1 = CRYPTO_THREAD_write_lock(param_1[(long)param_2 + 0x20]);
    if (iVar1 == 0) {
      return (void *)0x0;
    }
    iVar1 = CRYPTO_THREAD_write_lock(*param_1);
    if (iVar1 == 0) goto LAB_00a81648;
    iVar1 = *piVar4;
    if (iVar1 == -1) {
      iVar1 = ossl_crypto_get_ex_new_index_ex
                        (param_1,0x10,0,param_3,FUN_00a8191c,0,&LAB_00a81994,*param_3);
      if (iVar1 < 0) {
        CRYPTO_THREAD_unlock(*param_1);
        goto LAB_00a81648;
      }
      *piVar4 = iVar1;
      CRYPTO_THREAD_unlock(*param_1);
      iVar1 = ossl_crypto_alloc_ex_data_intern(0x10,0,param_1 + 1,*piVar4);
      if ((iVar1 == 0) || (iVar1 = CRYPTO_THREAD_read_lock(*param_1), iVar1 == 0)) {
        pvVar3 = (void *)0x0;
        goto LAB_00a815c4;
      }
      iVar1 = *piVar4;
    }
  }
  else {
    iVar2 = CRYPTO_THREAD_read_lock();
    if (iVar2 == 0) {
      return (void *)0x0;
    }
    iVar2 = CRYPTO_THREAD_read_lock(*param_1);
    if (iVar2 == 0) {
LAB_00a81648:
      CRYPTO_THREAD_unlock(param_1[(long)param_2 + 0x20]);
      return (void *)0x0;
    }
  }
  pvVar3 = CRYPTO_get_ex_data((CRYPTO_EX_DATA *)(param_1 + 1),iVar1);
  CRYPTO_THREAD_unlock(*param_1);
LAB_00a815c4:
  CRYPTO_THREAD_unlock(param_1[(long)param_2 + 0x20]);
  return pvVar3;
}

