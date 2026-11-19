/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ea5c
 */

void FUN_0090ea5c(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *__s;
  long *plVar4;
  
  plVar4 = (long *)param_1[2];
  if (plVar4 != (long *)0x0) {
    __s = plVar4 + 3;
    lVar1 = plVar4[7];
    lVar3 = plVar4[6];
    pthread_mutex_lock((pthread_mutex_t *)*__s);
    lVar2 = plVar4[4];
    *(undefined4 *)(plVar4 + 4) = 1;
    pthread_mutex_unlock((pthread_mutex_t *)*__s);
    if ((int)lVar2 == 0) {
      if (*plVar4 != 0) {
        FUN_0090fa48();
        *plVar4 = 0;
      }
    }
    else {
      if (*plVar4 != 0) {
        FUN_0090fa8c(plVar4);
      }
      if ((pthread_mutex_t *)*__s != (pthread_mutex_t *)0x0) {
        pthread_mutex_destroy((pthread_mutex_t *)*__s);
        (*(code *)PTR_free_00cc4678)(*__s);
      }
      (*(code *)PTR_free_00cc4678)(plVar4[5]);
      if (plVar4[9] != 0) {
        FUN_0090f270();
      }
      if (*(int *)((long)plVar4 + 0x3c) != -1) {
        close(*(int *)((long)plVar4 + 0x3c));
      }
      memset(__s,0,0x70);
      (*(code *)PTR_free_00cc4678)(param_1[2]);
    }
    FUN_0092e498(lVar3,(int)lVar1);
    close((int)lVar1);
  }
  param_1[2] = 0;
  (*(code *)PTR_free_00cc4678)(*param_1);
  *param_1 = 0;
  return;
}

