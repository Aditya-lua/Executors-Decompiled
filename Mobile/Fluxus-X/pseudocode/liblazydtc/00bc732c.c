/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc732c
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::insert(std::__ndk1::__wrap_iter<wchar_t const*>, wchar_t) */

basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> * __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::insert(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,long param_2,undefined4 param_3)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar5;
  bool bVar6;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar7;
  
  pbVar1 = this + 4;
  bVar6 = ((byte)*this & 1) != 0;
  pbVar7 = pbVar1;
  if (bVar6) {
    pbVar7 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  param_2 = param_2 - (long)pbVar7;
  uVar3 = (ulong)((byte)*this >> 1);
  if (bVar6) {
    uVar3 = *(ulong *)(this + 8);
  }
  uVar4 = 4;
  if (bVar6) {
    uVar4 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if (uVar4 == uVar3) {
    __grow_by(this,uVar3,1,uVar3,param_2 >> 2,0,1);
    pbVar7 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
    *(ulong *)(this + 8) = uVar3 + 1;
  }
  else {
    pbVar7 = pbVar1;
    if ((*(ulong *)this & 1) != 0) {
      pbVar7 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
    lVar2 = uVar3 - (param_2 >> 2);
    if (lVar2 != 0) {
      memmove(pbVar7 + param_2 + 4,pbVar7 + param_2,lVar2 * 4);
    }
  }
  lVar2 = uVar3 + 1;
  *(undefined4 *)(pbVar7 + param_2) = param_3;
  *(undefined4 *)(pbVar7 + lVar2 * 4) = 0;
  bVar5 = *this;
  if (((byte)bVar5 & 1) == 0) {
    *this = SUB41((int)lVar2 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar2;
  }
  if (((byte)bVar5 & 1) != 0) {
    pbVar1 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  return pbVar1 + param_2;
}

