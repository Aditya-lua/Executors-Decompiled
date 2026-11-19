/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9b74
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::flush() */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  sentry local_38 [8];
  basic_ostream<char,std::__ndk1::char_traits<char>> *local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  plVar3 = (long *)(*(long *)this + -0x18);
  if (*(long *)(this + *plVar3 + 0x28) != 0) {
    local_38[0] = (sentry)0x0;
    local_30 = this;
    if (*(int *)(this + *plVar3 + 0x20) == 0) {
      if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + *plVar3 + 0x88) !=
          (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
                    /* try { // try from 008e9bc8 to 008e9bcb has its CatchHandler @ 008e9c44 */
        flush(*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + *plVar3 + 0x88));
        plVar3 = (long *)(*(long *)this + -0x18);
      }
      local_38[0] = (sentry)0x1;
                    /* try { // try from 008e9bf0 to 008e9c13 has its CatchHandler @ 008e9c50 */
      iVar2 = (**(code **)(**(long **)(this + *plVar3 + 0x28) + 0x30))();
      if (iVar2 == -1) {
        ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                        *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 1)
        ;
      }
    }
    sentry::~sentry(local_38);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return this;
}

