/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a816e0
 */

undefined4 ossl_lib_ctx_run_once(undefined8 *param_1,ulong param_2,code *param_3)

{
  int *piVar1;
  int iVar2;
  undefined4 uVar3;
  
  param_2 = param_2 & 0xffffffff;
  if ((param_1 == (undefined8 *)0x0) &&
     (((iVar2 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348), iVar2 == 0 ||
       (DAT_00d21d60 == 0)) ||
      (param_1 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d21d58), param_1 == (undefined8 *)0x0)
      ))) {
    param_1 = &DAT_00d21b90;
  }
  iVar2 = CRYPTO_THREAD_read_lock(param_1[0x33]);
  if (iVar2 == 0) {
LAB_00a817b0:
    uVar3 = 0;
  }
  else {
    if (*(int *)((long)param_1 + param_2 * 4 + 0x1a0) == 0) {
      CRYPTO_THREAD_unlock(param_1[0x33]);
      iVar2 = CRYPTO_THREAD_write_lock(param_1[0x33]);
      if (iVar2 == 0) goto LAB_00a817b0;
      piVar1 = (int *)((long)param_1 + param_2 * 4 + 0x1a0);
      if (*piVar1 != 0) goto LAB_00a8175c;
      uVar3 = (*param_3)(param_1);
      *piVar1 = 1;
      *(undefined4 *)((long)param_1 + param_2 * 4 + 0x1ac) = uVar3;
    }
    else {
LAB_00a8175c:
      uVar3 = *(undefined4 *)((long)param_1 + param_2 * 4 + 0x1ac);
    }
    CRYPTO_THREAD_unlock(param_1[0x33]);
  }
  return uVar3;
}

