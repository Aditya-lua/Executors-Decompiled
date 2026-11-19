/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009005e0
 */

/* cpr::util::headerUserFunction(char*, unsigned long, unsigned long, cpr::HeaderCallback const*) */

ulong cpr::util::headerUserFunction
                (char *param_1,ulong param_2,ulong param_3,HeaderCallback *param_4)

{
  long lVar1;
  ulong uVar2;
  ulong __n;
  void *__dest;
  ulong local_60;
  ulong local_58;
  void *local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  __n = param_3 * param_2;
  local_58 = 0;
  local_50 = (void *)0x0;
  local_60 = 0;
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_60 | 1);
    local_60 = (ulong)(byte)((int)__n << 1);
    if (__n == 0) goto LAB_00900670;
  }
  else {
    uVar2 = __n + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar2);
    local_60 = uVar2 | 1;
    local_58 = __n;
    local_50 = __dest;
  }
  memcpy(__dest,param_1,__n);
LAB_00900670:
  *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 00900674 to 0090067f has its CatchHandler @ 009006d0 */
  uVar2 = HeaderCallback::operator()(param_4,&local_60);
  if ((uVar2 & 1) == 0) {
    __n = 0;
  }
  if ((local_60 & 1) != 0) {
    operator_delete(local_50);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return __n;
}

