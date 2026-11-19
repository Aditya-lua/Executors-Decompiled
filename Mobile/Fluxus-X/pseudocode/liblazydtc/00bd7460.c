/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd7460
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >::seekp(long long,
   std::__ndk1::ios_base::seekdir) */

basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekp
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,undefined8 param_1,
          undefined4 param_3)

{
  long extraout_x1;
  sentry asStack_40 [16];
  
  sentry::sentry(asStack_40,(basic_ostream *)this);
                    /* try { // try from 00bd74b8 to 00bd74c7 has its CatchHandler @ 00bd7510 */
  if ((((byte)this[*(long *)(*(long *)this + -0x18) + 0x20] & 5) == 0) &&
     ((**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x20))
                (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),param_1,param_3,0x10),
     extraout_x1 == -1)) {
                    /* try { // try from 00bd74e0 to 00bd74e7 has its CatchHandler @ 00bd750c */
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 4);
  }
  sentry::~sentry(asStack_40);
  return this;
}

