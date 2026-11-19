/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5810
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::find_first_not_of(wchar_t const*, unsigned long, unsigned
   long) const */

long __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::find_first_not_of(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    *this,wchar_t *param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar2;
  wchar_t *pwVar3;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar4;
  long lVar5;
  
  uVar1 = (ulong)((byte)*this >> 1);
  pbVar2 = this + 4;
  if (((byte)*this & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
    pbVar2 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  if (param_2 < uVar1) {
    pbVar4 = pbVar2 + param_2 * 4;
    if (param_3 == 0) {
LAB_00bc588c:
      return (long)pbVar4 - (long)pbVar2 >> 2;
    }
    lVar5 = uVar1 * 4 + param_2 * -4;
    do {
      pwVar3 = wmemchr(param_1,*(wchar_t *)pbVar4,param_3);
      if (pwVar3 == (wchar_t *)0x0) goto LAB_00bc588c;
      lVar5 = lVar5 + -4;
      pbVar4 = pbVar4 + 4;
    } while (lVar5 != 0);
  }
  return -1;
}

