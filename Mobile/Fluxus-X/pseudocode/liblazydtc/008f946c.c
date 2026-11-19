/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f946c
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::put(char) */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,char param_1)

{
  char *pcVar1;
  long lVar2;
  int iVar3;
  long *plVar4;
  long *plVar5;
  sentry local_48 [8];
  basic_ostream<char,std::__ndk1::char_traits<char>> *local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  local_48[0] = (sentry)0x0;
  plVar5 = (long *)(*(long *)this + -0x18);
  local_40 = this;
  if (*(int *)(this + *plVar5 + 0x20) != 0) goto LAB_008f952c;
  if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + *plVar5 + 0x88) !=
      (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
                    /* try { // try from 008f94b8 to 008f94bb has its CatchHandler @ 008f9560 */
    flush(*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + *plVar5 + 0x88));
    plVar5 = (long *)(*(long *)this + -0x18);
  }
  local_48[0] = (sentry)0x1;
  plVar4 = *(long **)(this + *plVar5 + 0x28);
  if (plVar4 != (long *)0x0) {
    pcVar1 = (char *)plVar4[6];
    if (pcVar1 != (char *)plVar4[7]) {
      plVar4[6] = (long)(pcVar1 + 1);
      *pcVar1 = param_1;
      goto LAB_008f952c;
    }
                    /* try { // try from 008f9504 to 008f952b has its CatchHandler @ 008f9568 */
    iVar3 = (**(code **)(*plVar4 + 0x68))(plVar4,param_1);
    if (iVar3 != -1) goto LAB_008f952c;
    plVar5 = (long *)(*(long *)this + -0x18);
  }
  ios_base::clear((ios_base *)(this + *plVar5),*(uint *)((ios_base *)(this + *plVar5) + 0x20) | 1);
LAB_008f952c:
  sentry::~sentry(local_48);
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return this;
}

