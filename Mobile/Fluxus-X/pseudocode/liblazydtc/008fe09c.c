/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe09c
 */

/* cpr::ThreadPool::CreateThread() */

undefined8 __thiscall cpr::ThreadPool::CreateThread(ThreadPool *this)

{
  int iVar1;
  undefined8 uVar2;
  thread *__newthread;
  __thread_struct *this_00;
  undefined8 *__arg;
  
  uVar2 = 0;
  if (*(ulong *)(this + 0x28) < *(ulong *)(this + 0x10)) {
    __newthread = operator_new(8);
                    /* try { // try from 008fe0d4 to 008fe0db has its CatchHandler @ 008fe188 */
    this_00 = operator_new(8);
                    /* try { // try from 008fe0e0 to 008fe0e3 has its CatchHandler @ 008fe178 */
    std::__ndk1::__thread_struct::__thread_struct(this_00);
                    /* try { // try from 008fe0e4 to 008fe0eb has its CatchHandler @ 008fe168 */
    __arg = operator_new(0x10);
    *__arg = this_00;
    __arg[1] = this;
                    /* try { // try from 008fe0f4 to 008fe10b has its CatchHandler @ 008fe13c */
    iVar1 = pthread_create((pthread_t *)__newthread,(pthread_attr_t *)0x0,FUN_008fe638,__arg);
    if (iVar1 != 0) {
                    /* try { // try from 008fe130 to 008fe13b has its CatchHandler @ 008fe13c */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__throw_system_error(iVar1,"thread constructor failed");
    }
    AddThread(this,__newthread);
    uVar2 = 1;
  }
  return uVar2;
}

