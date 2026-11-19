/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc233c
 */

/* std::__ndk1::__call_once(unsigned long volatile&, void*, void (*)(void*)) */

int std::__ndk1::__call_once(ulong *param_1,void *param_2,_func_void_void_ptr *param_3)

{
  int iVar1;
  ulong uVar2;
  
  pthread_mutex_lock((pthread_mutex_t *)&DAT_00d26194);
  uVar2 = *param_1;
  while (uVar2 == 1) {
    pthread_cond_wait((pthread_cond_t *)&DAT_00d261bc,(pthread_mutex_t *)&DAT_00d26194);
    uVar2 = *param_1;
  }
  if (*param_1 == 0) {
    *param_1 = 1;
                    /* try { // try from 00bc23e0 to 00bc241f has its CatchHandler @ 00bc243c */
    pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d26194);
    (*param_3)(param_2);
    pthread_mutex_lock((pthread_mutex_t *)&DAT_00d26194);
    *param_1 = 0xffffffffffffffff;
    pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d26194);
    iVar1 = pthread_cond_broadcast((pthread_cond_t *)&DAT_00d261bc);
    return iVar1;
  }
  iVar1 = pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d26194);
  return iVar1;
}

