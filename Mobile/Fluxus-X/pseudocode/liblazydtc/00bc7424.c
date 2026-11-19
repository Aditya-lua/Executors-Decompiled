/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc7424
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::resize(unsigned long, wchar_t) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::resize(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,ulong param_1,wchar_t param_2)

{
  long lVar1;
  ulong uVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar3;
  ulong uVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar5;
  uint uVar6;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar7;
  ulong uVar8;
  ulong uVar9;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar10;
  ulong uVar11;
  
  bVar3 = *this;
  uVar11 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar11 = *(ulong *)(this + 8);
  }
  uVar4 = param_1 - uVar11;
  if (param_1 < uVar11 || uVar4 == 0) {
    if (((byte)bVar3 & 1) == 0) {
      pbVar5 = this + 4;
      *this = SUB41((int)param_1 << 1,0);
    }
    else {
      pbVar5 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
      *(ulong *)(this + 8) = param_1;
    }
    *(undefined4 *)(pbVar5 + param_1 * 4) = 0;
    return;
  }
  uVar8 = *(ulong *)this;
  uVar11 = 4;
  if (((byte)bVar3 & 1) != 0) {
    uVar11 = (uVar8 & 0xfffffffffffffffe) - 1;
  }
  uVar6 = (uint)uVar8;
  uVar2 = uVar8 >> 1 & 0x7f;
  if ((uVar8 & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
  }
  if (uVar11 - uVar2 < uVar4) {
    __grow_by(this,uVar11,(uVar4 - uVar11) + uVar2,uVar2,uVar2,0,0);
    *(ulong *)(this + 8) = uVar2;
    uVar6 = (uint)(byte)*this;
  }
  pbVar5 = this + 4;
  if ((uVar6 & 1) != 0) {
    pbVar5 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  pbVar10 = pbVar5 + uVar2 * 4;
  if (uVar4 < 8) {
    pbVar7 = pbVar10;
    uVar8 = uVar4;
  }
  else {
    uVar9 = uVar4 & 0xfffffffffffffff8;
    uVar8 = uVar4 & 7;
    pbVar7 = pbVar10 + uVar9 * 4;
    pbVar10 = pbVar10 + 0x10;
    uVar11 = uVar9;
    do {
      uVar11 = uVar11 - 8;
      *(ulong *)(pbVar10 + -8) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar10 + -0x10) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar10 + 8) = CONCAT44(param_2,param_2);
      *(ulong *)pbVar10 = CONCAT44(param_2,param_2);
      pbVar10 = pbVar10 + 0x20;
    } while (uVar11 != 0);
    if (uVar4 == uVar9) goto LAB_00bc7534;
  }
  do {
    uVar8 = uVar8 - 1;
    *(wchar_t *)pbVar7 = param_2;
    pbVar7 = pbVar7 + 4;
  } while (uVar8 != 0);
LAB_00bc7534:
  lVar1 = uVar2 + uVar4;
  if (((byte)*this & 1) == 0) {
    *this = SUB41((int)lVar1 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar1;
  }
  *(undefined4 *)(pbVar5 + lVar1 * 4) = 0;
  return;
}

