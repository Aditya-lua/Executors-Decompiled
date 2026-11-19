/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6514
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::find_last_of(wchar_t const*, unsigned long, unsigned long)
   const */

long __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::find_last_of(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *this,wchar_t *param_1,ulong param_2,ulong param_3)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  ulong uVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar3;
  wchar_t *pwVar4;
  long lVar5;
  
  bVar3 = *this;
  pbVar1 = this + 4;
  if (((byte)bVar3 & 1) != 0) {
    pbVar1 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  if (param_3 == 0) {
    return -1;
  }
  uVar2 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
  }
  if (param_2 < uVar2) {
    uVar2 = param_2 + 1;
  }
  lVar5 = uVar2 << 2;
  do {
    if (lVar5 == 0) {
      return -1;
    }
    pwVar4 = wmemchr(param_1,*(wchar_t *)(pbVar1 + lVar5 + -4),param_3);
    lVar5 = lVar5 + -4;
  } while (pwVar4 == (wchar_t *)0x0);
  return lVar5 >> 2;
}

