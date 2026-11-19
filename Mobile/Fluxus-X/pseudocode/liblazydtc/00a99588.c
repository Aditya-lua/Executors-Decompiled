/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99588
 */

void FUN_00a99588(long param_1,long *param_2)

{
  long *plVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  void *pvVar5;
  void *ptr;
  
  if ((((param_2 == (long *)0x0) ||
       (iVar3 = CRYPTO_THREAD_run_once(&DAT_00d220d8,&LAB_00a99894), lVar2 = DAT_00d220e0,
       DAT_00d220e0 == 0)) || (iVar3 == 0)) ||
     ((DAT_00d220dc == 0 ||
      (iVar3 = CRYPTO_THREAD_write_lock(*(undefined8 *)(DAT_00d220e0 + 8)), iVar3 == 0)))) {
    return;
  }
  pvVar5 = (void *)*param_2;
  if (pvVar5 != (void *)0x0) {
    ptr = (void *)0x0;
    do {
      plVar1 = param_2;
      if (ptr != (void *)0x0) {
        plVar1 = (long *)((long)ptr + 0x18);
      }
      ptr = pvVar5;
      while ((lVar4 = *(long *)((long)ptr + 8), param_1 == 0 ||
             (lVar4 = param_1, *(long *)((long)ptr + 8) == param_1))) {
        (**(code **)((long)ptr + 0x10))(lVar4);
        *plVar1 = *(long *)((long)ptr + 0x18);
        pvVar5 = *(void **)((long)ptr + 0x18);
        CRYPTO_free(ptr);
        ptr = pvVar5;
        if (pvVar5 == (void *)0x0) goto LAB_00a99658;
      }
      pvVar5 = *(void **)((long)ptr + 0x18);
    } while (pvVar5 != (void *)0x0);
  }
LAB_00a99658:
  CRYPTO_THREAD_unlock(*(undefined8 *)(lVar2 + 8));
  return;
}

