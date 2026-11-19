/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6eb0
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::find(wchar_t const*, unsigned long, unsigned long) const */

ulong __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::find(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *this
      ,wchar_t *param_1,ulong param_2,ulong param_3)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  ulong uVar2;
  wchar_t __c;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar3;
  int iVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar5;
  long lVar6;
  
  uVar2 = (ulong)((byte)*this >> 1);
  pbVar3 = this + 4;
  if (((byte)*this & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
    pbVar3 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  if (uVar2 < param_2) {
    param_2 = 0xffffffffffffffff;
  }
  else if (param_3 != 0) {
    lVar6 = uVar2 * 4 + param_2 * -4;
    pbVar1 = pbVar3 + uVar2 * 4;
    if ((long)(param_3 * 4) <= lVar6) {
      __c = *param_1;
      lVar6 = lVar6 >> 2;
      pbVar5 = pbVar3 + param_2 * 4;
      do {
        if ((0xfffffffffffffffe < lVar6 - param_3) ||
           (pbVar5 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      *)wmemchr((wchar_t *)pbVar5,__c,(lVar6 - param_3) + 1),
           pbVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      *)0x0)) break;
        iVar4 = wmemcmp((wchar_t *)pbVar5,param_1,param_3);
        if (iVar4 == 0) goto LAB_00bc6f18;
        pbVar5 = pbVar5 + 4;
        lVar6 = (long)pbVar1 - (long)pbVar5 >> 2;
      } while ((long)param_3 <= lVar6);
    }
    pbVar5 = pbVar1;
LAB_00bc6f18:
    param_2 = (long)pbVar5 - (long)pbVar3 >> 2;
    if (pbVar5 == pbVar1) {
      param_2 = 0xffffffffffffffff;
    }
  }
  return param_2;
}

