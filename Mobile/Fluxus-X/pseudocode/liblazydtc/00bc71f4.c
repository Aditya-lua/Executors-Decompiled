/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc71f4
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::append(wchar_t const*) */

basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> * __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::append(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,wchar_t *param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar4;
  ulong uVar5;
  size_t sVar6;
  
  sVar6 = wcslen(param_1);
  uVar5 = *(ulong *)this;
  uVar2 = 4;
  if (((byte)*this & 1) != 0) {
    uVar2 = (uVar5 & 0xfffffffffffffffe) - 1;
  }
  uVar3 = uVar5 >> 1 & 0x7f;
  if ((uVar5 & 1) != 0) {
    uVar3 = *(ulong *)(this + 8);
  }
  if (uVar2 - uVar3 < sVar6) {
    __grow_by_and_replace(this,uVar2,(sVar6 - uVar2) + uVar3,uVar3,uVar3,0,sVar6,param_1);
  }
  else if (sVar6 != 0) {
    pbVar4 = this + 4;
    if ((uVar5 & 1) != 0) {
      pbVar4 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
    memmove(pbVar4 + uVar3 * 4,param_1,sVar6 << 2);
    lVar1 = uVar3 + sVar6;
    if (((byte)*this & 1) == 0) {
      *this = SUB41((int)lVar1 << 1,0);
    }
    else {
      *(long *)(this + 8) = lVar1;
    }
    *(undefined4 *)(pbVar4 + lVar1 * 4) = 0;
  }
  return this;
}

