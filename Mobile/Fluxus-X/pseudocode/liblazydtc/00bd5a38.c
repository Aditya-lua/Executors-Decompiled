/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5a38
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::sentry::sentry(std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >&) */

void __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
          (sentry *this,basic_ostream *param_1)

{
  long lVar1;
  
  lVar1 = *(long *)param_1;
  *this = (sentry)0x0;
  *(basic_ostream **)(this + 8) = param_1;
  if (*(int *)(param_1 + *(long *)(lVar1 + -0x18) + 0x20) != 0) {
    return;
  }
  if (*(basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> **)
       (param_1 + *(long *)(lVar1 + -0x18) + 0x88) !=
      (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *)0x0) {
    flush(*(basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> **)
           (param_1 + *(long *)(lVar1 + -0x18) + 0x88));
  }
  *this = (sentry)0x1;
  return;
}

