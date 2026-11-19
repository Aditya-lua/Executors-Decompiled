/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098b218
 */

/* ix::setThreadName(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void ix::setThreadName(basic_string_conflict *param_1)

{
  basic_string_conflict *__src;
  long lVar1;
  ulong __n;
  pthread_t __target_thread;
  char *pcVar2;
  ulong local_60;
  ulong local_58;
  char *local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  __target_thread = pthread_self();
  local_58 = 0;
  local_50 = (char *)0x0;
  local_60 = 0;
  __src = *(basic_string_conflict **)(param_1 + 0x10);
  __n = (ulong)((byte)*param_1 >> 1);
  if (((byte)*param_1 & 1) == 0) {
    __src = param_1 + 1;
  }
  else {
    __n = *(ulong *)(param_1 + 8);
  }
  if (0xe < __n) {
    __n = 0xf;
  }
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    pcVar2 = (char *)((ulong)&local_60 | 1);
    local_60 = (ulong)(byte)((int)__n << 1);
    if (__n == 0) goto LAB_0098b2d0;
  }
  else {
    pcVar2 = operator_new(0x10);
    local_60 = 0x11;
    local_58 = __n;
    local_50 = pcVar2;
  }
  memcpy(pcVar2,__src,__n);
LAB_0098b2d0:
  pcVar2[__n] = '\0';
  pcVar2 = (char *)((ulong)&local_60 | 1);
  if ((local_60 & 1) != 0) {
    pcVar2 = local_50;
  }
                    /* try { // try from 0098b2e4 to 0098b2eb has its CatchHandler @ 0098b330 */
  pthread_setname_np(__target_thread,pcVar2);
  if ((local_60 & 1) != 0) {
    operator_delete(local_50);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

