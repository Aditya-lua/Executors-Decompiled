/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6790
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::append(unsigned long, wchar_t) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::append(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,ulong param_1,wchar_t param_2)

{
  long lVar1;
  ulong uVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar3;
  uint uVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar5;
  ulong uVar6;
  ulong uVar7;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar8;
  ulong uVar9;
  
  if (param_1 == 0) {
    return;
  }
  uVar9 = *(ulong *)this;
  uVar6 = 4;
  if (((byte)*this & 1) != 0) {
    uVar6 = (uVar9 & 0xfffffffffffffffe) - 1;
  }
  uVar4 = (uint)uVar9;
  uVar2 = uVar9 >> 1 & 0x7f;
  if ((uVar9 & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
  }
  if (uVar6 - uVar2 < param_1) {
    __grow_by(this,uVar6,(param_1 - uVar6) + uVar2,uVar2,uVar2,0,0);
    *(ulong *)(this + 8) = uVar2;
    uVar4 = (uint)(byte)*this;
  }
  pbVar3 = this + 4;
  if ((uVar4 & 1) != 0) {
    pbVar3 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  pbVar5 = pbVar3 + uVar2 * 4;
  uVar6 = param_1;
  if (7 < param_1) {
    uVar7 = param_1 & 0xfffffffffffffff8;
    uVar6 = param_1 & 7;
    pbVar8 = pbVar5 + 0x10;
    uVar9 = uVar7;
    do {
      uVar9 = uVar9 - 8;
      *(ulong *)(pbVar8 + -8) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar8 + -0x10) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar8 + 8) = CONCAT44(param_2,param_2);
      *(ulong *)pbVar8 = CONCAT44(param_2,param_2);
      pbVar8 = pbVar8 + 0x20;
    } while (uVar9 != 0);
    pbVar5 = pbVar5 + uVar7 * 4;
    if (param_1 == uVar7) goto LAB_00bc6884;
  }
  do {
    uVar6 = uVar6 - 1;
    *(wchar_t *)pbVar5 = param_2;
    pbVar5 = pbVar5 + 4;
  } while (uVar6 != 0);
LAB_00bc6884:
  lVar1 = uVar2 + param_1;
  if (((byte)*this & 1) == 0) {
    *this = SUB41((int)lVar1 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar1;
  }
  *(undefined4 *)(pbVar3 + lVar1 * 4) = 0;
  return;
}

