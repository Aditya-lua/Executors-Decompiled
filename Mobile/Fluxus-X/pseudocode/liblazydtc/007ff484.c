/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff484
 */

undefined8 FUN_007ff484(undefined8 *param_1)

{
  pthread_key_t __key;
  long lVar1;
  int iVar2;
  pthread_key_t *ppVar3;
  void *__pointer;
  long lVar4;
  __thread_struct *this;
  
  lVar1 = tpidr_el0;
  lVar4 = *(long *)(lVar1 + 0x28);
                    /* try { // try from 007ff4ac to 007ff4c7 has its CatchHandler @ 007ff51c */
  ppVar3 = (pthread_key_t *)std::__ndk1::__thread_local_data();
  __pointer = (void *)*param_1;
  __key = *ppVar3;
  *param_1 = 0;
  iVar2 = pthread_setspecific(__key,__pointer);
  (*(code *)param_1[1])(iVar2);
  this = (__thread_struct *)*param_1;
  *param_1 = 0;
  if (this != (__thread_struct *)0x0) {
    std::__ndk1::__thread_struct::~__thread_struct(this);
    operator_delete(this,8);
  }
  if (*(long *)(lVar1 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  operator_delete(param_1,0x10);
  return 0;
}

