/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900830
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::write(char const*, long) */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::write
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  sentry local_48 [8];
  basic_ostream<char,std::__ndk1::char_traits<char>> *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_48[0] = (sentry)0x0;
  local_40 = this;
  if (*(int *)(this + *(long *)(*(long *)this + -0x18) + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)
         (this + *(long *)(*(long *)this + -0x18) + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
                    /* try { // try from 009008b0 to 009008b3 has its CatchHandler @ 0090090c */
      flush(*(basic_ostream<char,std::__ndk1::char_traits<char>> **)
             (this + *(long *)(*(long *)this + -0x18) + 0x88));
    }
    local_48[0] = (sentry)0x1;
                    /* try { // try from 009008d8 to 00900903 has its CatchHandler @ 00900914 */
    if ((param_2 != 0) &&
       (lVar2 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x60))
                          (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),param_1,
                           param_2), lVar2 != param_2)) {
      ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                      *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 1);
    }
  }
  sentry::~sentry(local_48);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return this;
}

