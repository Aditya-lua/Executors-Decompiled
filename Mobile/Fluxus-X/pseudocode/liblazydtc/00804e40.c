/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00804e40
 */

void FUN_00804e40(void)

{
  long lVar1;
  int iVar2;
  __thread_struct *this;
  thread atStack_40 [8];
  undefined8 *local_38;
  __thread_struct *local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  this = operator_new(8);
                    /* try { // try from 00804e68 to 00804e6b has its CatchHandler @ 00804f00 */
  std::__ndk1::__thread_struct::__thread_struct(this);
  local_30 = this;
                    /* try { // try from 00804e70 to 00804e77 has its CatchHandler @ 00804ef8 */
  local_38 = operator_new(8);
  local_30 = (__thread_struct *)0x0;
  *local_38 = this;
                    /* try { // try from 00804e84 to 00804e97 has its CatchHandler @ 00804f18 */
  iVar2 = pthread_create((pthread_t *)atStack_40,(pthread_attr_t *)0x0,
                         (__start_routine *)&LAB_00804f7c,local_38);
  if (iVar2 == 0) {
                    /* try { // try from 00804e9c to 00804ea3 has its CatchHandler @ 00804ee8 */
    std::__ndk1::thread::detach(atStack_40);
    std::__ndk1::thread::~thread(atStack_40);
    if (*(long *)(lVar1 + 0x28) == local_28) {
      return;
    }
  }
  else if (*(long *)(lVar1 + 0x28) == local_28) {
                    /* try { // try from 00804edc to 00804ee7 has its CatchHandler @ 00804f18 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__throw_system_error(iVar2,"thread constructor failed");
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

