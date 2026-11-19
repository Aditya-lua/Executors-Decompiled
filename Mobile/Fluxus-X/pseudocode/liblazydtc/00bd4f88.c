/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd4f88
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::read(wchar_t*, long) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::read
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          long param_2)

{
  long lVar1;
  uint uVar2;
  sentry local_14 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_14,(basic_istream *)this,true);
  if (local_14[0] == (sentry)0x1) {
                    /* try { // try from 00bd4fe0 to 00bd4feb has its CatchHandler @ 00bd5034 */
    lVar1 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x40))
                      (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),param_1,param_2);
    *(long *)(this + 8) = lVar1;
    uVar2 = 0;
    if (lVar1 != param_2) {
      uVar2 = 6;
    }
  }
  else {
    uVar2 = 4;
  }
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar2);
  return this;
}

