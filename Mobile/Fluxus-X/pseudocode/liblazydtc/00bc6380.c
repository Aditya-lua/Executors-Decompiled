/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6380
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::find(wchar_t, unsigned long) const */

long __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::find(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *this
      ,wchar_t param_1,ulong param_2)

{
  ulong uVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar3;
  wchar_t *pwVar4;
  long lVar5;
  
  bVar3 = *this;
  uVar1 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
  }
  if (uVar1 < param_2 || uVar1 - param_2 == 0) {
    return -1;
  }
  pbVar2 = this + 4;
  if (((byte)bVar3 & 1) != 0) {
    pbVar2 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  pwVar4 = wmemchr((wchar_t *)(pbVar2 + param_2 * 4),param_1,uVar1 - param_2);
  lVar5 = (long)pwVar4 - (long)pbVar2 >> 2;
  if (pwVar4 == (wchar_t *)0x0) {
    lVar5 = -1;
  }
  return lVar5;
}

