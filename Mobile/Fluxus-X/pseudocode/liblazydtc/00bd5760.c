/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5760
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::seekg(long long,
   std::__ndk1::ios_base::seekdir) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekg
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,undefined8 param_1,
          undefined4 param_3)

{
  uint uVar1;
  uint uVar2;
  long extraout_x1;
  sentry local_34 [4];
  
  uVar1 = *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) & 0xfffffffd;
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),uVar1);
  sentry::sentry(local_34,(basic_istream *)this,true);
  if (local_34[0] == (sentry)0x1) {
                    /* try { // try from 00bd57d4 to 00bd57e3 has its CatchHandler @ 00bd5824 */
    (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x20))
              (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),param_1,param_3,8);
    uVar2 = uVar1 | 4;
    if (extraout_x1 != -1) {
      uVar2 = uVar1;
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar2)
    ;
  }
  return this;
}

