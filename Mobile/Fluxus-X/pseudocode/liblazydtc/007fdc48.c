/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fdc48
 */

void FUN_007fdc48(pthread_t *param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  __thread_struct *this;
  undefined8 *__arg;
  long lVar3;
  
  lVar1 = tpidr_el0;
  lVar3 = *(long *)(lVar1 + 0x28);
  this = operator_new(8);
                    /* try { // try from 007fdc7c to 007fdc7f has its CatchHandler @ 007fdcf8 */
  std::__ndk1::__thread_struct::__thread_struct(this);
                    /* try { // try from 007fdc84 to 007fdc8b has its CatchHandler @ 007fdcf0 */
  __arg = operator_new(0x10);
  *__arg = this;
  __arg[1] = param_2;
                    /* try { // try from 007fdc98 to 007fdcef has its CatchHandler @ 007fdd0c */
  iVar2 = pthread_create(param_1,(pthread_attr_t *)0x0,FUN_007ff484,__arg);
  if (iVar2 == 0) {
    if (*(long *)(lVar1 + 0x28) == lVar3) {
      return;
    }
  }
  else if (*(long *)(lVar1 + 0x28) == lVar3) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__throw_system_error(iVar2,"thread constructor failed");
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

