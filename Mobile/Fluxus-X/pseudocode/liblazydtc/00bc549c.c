/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc549c
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::rfind(wchar_t const*, unsigned long, unsigned long) const */

long __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::rfind(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
        *this,wchar_t *param_1,ulong param_2,ulong param_3)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  wchar_t wVar5;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar6;
  long lVar7;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar8;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar9;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar10;
  wchar_t *pwVar11;
  
  uVar2 = (ulong)((byte)*this >> 1);
  pbVar6 = this + 4;
  if (((byte)*this & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
    pbVar6 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  uVar3 = uVar2;
  if (param_2 <= uVar2) {
    uVar3 = param_2;
  }
  uVar4 = uVar3 + param_3;
  if (uVar2 - uVar3 <= param_3) {
    uVar4 = uVar2;
  }
  pbVar1 = pbVar6 + uVar4 * 4;
  pbVar8 = pbVar1;
  if ((param_3 != 0) && (uVar4 != 0)) {
    pbVar9 = pbVar6;
    do {
      pbVar10 = pbVar9;
      while( true ) {
        pbVar10 = pbVar10 + 4;
        lVar7 = param_3 * 4;
        pwVar11 = param_1;
        if (*(wchar_t *)pbVar9 == *param_1) break;
        pbVar9 = pbVar9 + 4;
        if (pbVar9 == pbVar1) goto LAB_00bc555c;
      }
      do {
        pwVar11 = pwVar11 + 1;
        if (lVar7 + -4 == 0) {
          pbVar8 = pbVar9;
          break;
        }
        if (pbVar10 == pbVar1) goto LAB_00bc555c;
        wVar5 = *(wchar_t *)pbVar10;
        pbVar10 = pbVar10 + 4;
        lVar7 = lVar7 + -4;
      } while (wVar5 == *pwVar11);
      pbVar9 = pbVar9 + 4;
    } while (pbVar9 != pbVar1);
  }
LAB_00bc555c:
  lVar7 = (long)pbVar8 - (long)pbVar6 >> 2;
  if (pbVar8 == pbVar1 && param_3 != 0) {
    lVar7 = -1;
  }
  return lVar7;
}

