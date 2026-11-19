/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc58ac
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::insert(unsigned long, unsigned long, wchar_t) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::insert(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,ulong param_1,ulong param_2,wchar_t param_3)

{
  long lVar1;
  ulong uVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar3;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar4;
  ulong uVar5;
  ulong uVar6;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar7;
  ulong uVar8;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar9;
  
  bVar3 = *this;
  uVar2 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
  }
  if (uVar2 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  if (param_2 == 0) {
    return;
  }
  uVar5 = 4;
  if (((byte)bVar3 & 1) != 0) {
    uVar5 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if (uVar5 - uVar2 < param_2) {
    __grow_by(this,uVar5,(uVar2 + param_2) - uVar5,uVar2,param_1,0,param_2);
    pbVar9 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
    *(ulong *)(this + 8) = uVar2 + param_2;
  }
  else {
    pbVar9 = this + 4;
    if ((*(ulong *)this & 1) != 0) {
      pbVar9 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
    if (uVar2 - param_1 != 0) {
      memmove(pbVar9 + param_1 * 4 + param_2 * 4,pbVar9 + param_1 * 4,(uVar2 - param_1) * 4);
    }
  }
  pbVar4 = pbVar9 + param_1 * 4;
  uVar5 = param_2;
  if (7 < param_2) {
    uVar6 = param_2 & 0xfffffffffffffff8;
    uVar5 = param_2 & 7;
    pbVar7 = pbVar4 + 0x10;
    uVar8 = uVar6;
    do {
      uVar8 = uVar8 - 8;
      *(ulong *)(pbVar7 + -8) = CONCAT44(param_3,param_3);
      *(ulong *)(pbVar7 + -0x10) = CONCAT44(param_3,param_3);
      *(ulong *)(pbVar7 + 8) = CONCAT44(param_3,param_3);
      *(ulong *)pbVar7 = CONCAT44(param_3,param_3);
      pbVar7 = pbVar7 + 0x20;
    } while (uVar8 != 0);
    pbVar4 = pbVar4 + uVar6 * 4;
    if (param_2 == uVar6) goto LAB_00bc59c8;
  }
  do {
    uVar5 = uVar5 - 1;
    *(wchar_t *)pbVar4 = param_3;
    pbVar4 = pbVar4 + 4;
  } while (uVar5 != 0);
LAB_00bc59c8:
  lVar1 = uVar2 + param_2;
  if (((byte)*this & 1) == 0) {
    *this = SUB41((int)lVar1 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar1;
  }
  *(undefined4 *)(pbVar9 + lVar1 * 4) = 0;
  return;
}

