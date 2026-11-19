/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc68b8
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::rfind(wchar_t, unsigned long) const */

long __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::rfind(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
        *this,wchar_t param_1,ulong param_2)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  
  pbVar1 = this + 4;
  uVar2 = (ulong)((byte)*this >> 1);
  if (((byte)*this & 1) != 0) {
    pbVar1 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
    uVar2 = *(ulong *)(this + 8);
  }
  if (uVar2 != 0) {
    if (param_2 < uVar2) {
      uVar2 = param_2 + 1;
    }
    lVar4 = uVar2 << 2;
    while (lVar4 != 0) {
      lVar3 = lVar4 + -4;
      lVar4 = lVar4 + -4;
      if (*(wchar_t *)(pbVar1 + lVar3) == param_1) {
        return lVar4 >> 2;
      }
    }
  }
  return -1;
}

