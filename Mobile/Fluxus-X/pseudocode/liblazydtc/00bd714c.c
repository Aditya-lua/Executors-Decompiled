/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd714c
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >::put(wchar_t) */

basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::put
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t param_1)

{
  wchar_t *pwVar1;
  long *plVar2;
  long lVar3;
  sentry local_30 [16];
  
                    /* try { // try from 00bd7168 to 00bd7173 has its CatchHandler @ 00bd7218 */
  sentry::sentry(local_30,(basic_ostream *)this);
  if (local_30[0] == (sentry)0x1) {
    lVar3 = *(long *)(*(long *)this + -0x18);
    plVar2 = *(long **)(this + lVar3 + 0x28);
    if (plVar2 != (long *)0x0) {
      pwVar1 = (wchar_t *)plVar2[6];
      if (pwVar1 == (wchar_t *)plVar2[7]) {
                    /* try { // try from 00bd71bc to 00bd71e7 has its CatchHandler @ 00bd7208 */
        param_1 = (**(code **)(*plVar2 + 0x68))(plVar2,param_1);
      }
      else {
        *pwVar1 = param_1;
        plVar2[6] = (long)(pwVar1 + 1);
      }
      if (param_1 != L'\xffffffff') goto LAB_00bd71e8;
      lVar3 = *(long *)(*(long *)this + -0x18);
    }
    ios_base::clear((ios_base *)(this + lVar3),*(uint *)((ios_base *)(this + lVar3) + 0x20) | 1);
  }
LAB_00bd71e8:
  sentry::~sentry(local_30);
  return this;
}

