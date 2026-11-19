/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd7250
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >::write(wchar_t const*,
   long) */

basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::write
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          long param_2)

{
  long lVar1;
  sentry local_40 [16];
  
                    /* try { // try from 00bd7274 to 00bd727f has its CatchHandler @ 00bd7304 */
  sentry::sentry(local_40,(basic_ostream *)this);
                    /* try { // try from 00bd72a4 to 00bd72cf has its CatchHandler @ 00bd72f4 */
  if (((param_2 != 0) && (((byte)local_40[0] & 1) != 0)) &&
     (lVar1 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x60))
                        (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),param_1,param_2)
     , lVar1 != param_2)) {
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 1);
  }
  sentry::~sentry(local_40);
  return this;
}

