/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd554c
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::tellg() */

undefined1  [16] __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::tellg
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  undefined1 auVar1 [16];
  sentry local_14 [4];
  
  sentry::sentry(local_14,(basic_istream *)this,true);
  if (local_14[0] == (sentry)0x1) {
                    /* try { // try from 00bd5598 to 00bd55a7 has its CatchHandler @ 00bd55f4 */
    auVar1 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x20))
                       (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),0,1,8);
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20));
  }
  else {
    auVar1 = ZEXT816(0xffffffffffffffff) << 0x40;
  }
  return auVar1;
}

