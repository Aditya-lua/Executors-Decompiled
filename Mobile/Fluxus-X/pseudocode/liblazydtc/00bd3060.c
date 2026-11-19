/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd3060
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >::flush() */

basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::flush
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  int iVar1;
  sentry local_30 [16];
  
  if (*(long *)(this + *(long *)(*(long *)this + -0x18) + 0x28) != 0) {
                    /* try { // try from 00bd308c to 00bd3097 has its CatchHandler @ 00bd3110 */
    sentry::sentry(local_30,(basic_ostream *)this);
                    /* try { // try from 00bd30bc to 00bd30df has its CatchHandler @ 00bd3100 */
    if ((local_30[0] == (sentry)0x1) &&
       (iVar1 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x30))(),
       iVar1 == -1)) {
      ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                      *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 1);
    }
    sentry::~sentry(local_30);
  }
  return this;
}

