/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbdcc
 */

/* std::__ndk1::notify_all_at_thread_exit(std::__ndk1::condition_variable&,
   std::__ndk1::unique_lock<std::__ndk1::mutex>) */

void std::__ndk1::notify_all_at_thread_exit(condition_variable *param_1,undefined8 *param_2)

{
  pthread_key_t *ppVar1;
  void *pvVar2;
  __thread_struct *p_Var3;
  mutex *pmVar4;
  
  ppVar1 = (pthread_key_t *)__thread_local_data();
  pvVar2 = pthread_getspecific(*ppVar1);
  if (pvVar2 == (void *)0x0) {
    p_Var3 = operator_new(8);
                    /* try { // try from 00bcbe08 to 00bcbe0b has its CatchHandler @ 00bcbe48 */
    __thread_struct::__thread_struct(p_Var3);
    pthread_setspecific(*ppVar1,p_Var3);
  }
  ppVar1 = (pthread_key_t *)__thread_local_data();
  p_Var3 = pthread_getspecific(*ppVar1);
  pmVar4 = (mutex *)*param_2;
  *param_2 = 0;
  *(undefined1 *)(param_2 + 1) = 0;
  __thread_struct::notify_all_at_thread_exit(p_Var3,param_1,pmVar4);
  return;
}

