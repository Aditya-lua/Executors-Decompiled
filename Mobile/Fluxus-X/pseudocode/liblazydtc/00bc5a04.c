/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5a04
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::TEMPNAMEPLACEHOLDERVALUE(wchar_t) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::operator=(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            *this,wchar_t param_1)

{
  wchar_t *pwVar1;
  
  if (((byte)*this & 1) == 0) {
    *this = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            )0x2;
    *(wchar_t *)(this + 4) = param_1;
    *(undefined4 *)(this + 8) = 0;
    return;
  }
  pwVar1 = *(wchar_t **)(this + 0x10);
  *(undefined8 *)(this + 8) = 1;
  *pwVar1 = param_1;
  pwVar1[1] = L'\0';
  return;
}

