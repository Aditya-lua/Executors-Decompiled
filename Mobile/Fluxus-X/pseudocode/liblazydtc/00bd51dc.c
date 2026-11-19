/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd51dc
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::putback(wchar_t) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::putback
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t param_1)

{
  long *plVar1;
  wchar_t *pwVar2;
  long lVar3;
  uint uVar4;
  sentry local_14 [4];
  
  lVar3 = *(long *)(*(long *)this + -0x18);
  *(undefined8 *)(this + 8) = 0;
  uVar4 = *(uint *)(this + lVar3 + 0x20) & 0xfffffffd;
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),uVar4);
  sentry::sentry(local_14,(basic_istream *)this,true);
  if (local_14[0] == (sentry)0x1) {
    plVar1 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if (plVar1 != (long *)0x0) {
      if ((plVar1[2] == plVar1[3]) || (pwVar2 = (wchar_t *)(plVar1[3] + -4), param_1 != *pwVar2)) {
                    /* try { // try from 00bd5288 to 00bd528f has its CatchHandler @ 00bd52d0 */
        param_1 = (**(code **)(*plVar1 + 0x58))(plVar1,param_1);
      }
      else {
        plVar1[3] = (long)pwVar2;
      }
      if (param_1 != L'\xffffffff') goto LAB_00bd52a0;
    }
    uVar4 = uVar4 | 1;
  }
  else {
    uVar4 = uVar4 | 4;
  }
LAB_00bd52a0:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar4);
  return this;
}

