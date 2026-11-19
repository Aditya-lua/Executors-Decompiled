/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5c38
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::find_first_of(wchar_t const*, unsigned long, unsigned long)
   const */

long __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::find_first_of(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                *this,wchar_t *param_1,ulong param_2,ulong param_3)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  ulong uVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar3;
  long lVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar5;
  wchar_t *pwVar6;
  
  lVar4 = -1;
  uVar2 = (ulong)((byte)*this >> 1);
  pbVar3 = this + 4;
  if (((byte)*this & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
    pbVar3 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  if ((param_3 != 0) && (param_2 < uVar2)) {
    pbVar1 = pbVar3 + uVar2 * 4;
    pbVar5 = pbVar3 + param_2 * 4;
    do {
      lVar4 = param_3 << 2;
      pwVar6 = param_1;
      do {
        if (*(wchar_t *)pbVar5 == *pwVar6) goto LAB_00bc5cac;
        lVar4 = lVar4 + -4;
        pwVar6 = pwVar6 + 1;
      } while (lVar4 != 0);
      pbVar5 = pbVar5 + 4;
    } while (pbVar5 != pbVar1);
    pbVar5 = pbVar1;
LAB_00bc5cac:
    lVar4 = (long)pbVar5 - (long)pbVar3 >> 2;
    if (pbVar5 == pbVar1) {
      lVar4 = -1;
    }
  }
  return lVar4;
}

