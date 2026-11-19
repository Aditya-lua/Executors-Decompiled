/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc575c
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::find_last_not_of(wchar_t const*, unsigned long, unsigned long)
   const */

long __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::find_last_not_of(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                   *this,wchar_t *param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar2;
  wchar_t *pwVar3;
  long lVar4;
  
  uVar1 = (ulong)((byte)*this >> 1);
  pbVar2 = this + 4;
  if (((byte)*this & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
    pbVar2 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  if (param_2 < uVar1) {
    uVar1 = param_2 + 1;
  }
  lVar4 = uVar1 * 4;
  do {
    lVar4 = lVar4 + -4;
    if (lVar4 == -4) {
      return -1;
    }
  } while ((param_3 != 0) &&
          (pwVar3 = wmemchr(param_1,*(wchar_t *)(pbVar2 + lVar4),param_3), pwVar3 != (wchar_t *)0x0)
          );
  return lVar4 >> 2;
}

