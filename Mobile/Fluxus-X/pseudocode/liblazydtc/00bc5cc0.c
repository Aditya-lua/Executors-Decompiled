/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5cc0
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::replace(unsigned long, unsigned long, unsigned long, wchar_t)
    */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::replace(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
          *this,ulong param_1,ulong param_2,ulong param_3,wchar_t param_4)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar5;
  ulong uVar6;
  ulong uVar7;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar8;
  ulong uVar9;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar10;
  
  bVar4 = *this;
  uVar2 = (ulong)((byte)bVar4 >> 1);
  if (((byte)bVar4 & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
  }
  uVar6 = uVar2 - param_1;
  if (uVar2 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  uVar3 = uVar6;
  if (param_2 <= uVar6) {
    uVar3 = param_2;
  }
  uVar9 = 4;
  if (((byte)bVar4 & 1) != 0) {
    uVar9 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if ((uVar3 - uVar2) + uVar9 < param_3) {
    __grow_by(this,uVar9,((uVar2 + param_3) - uVar9) - uVar3,uVar2,param_1,uVar3,param_3);
    pbVar10 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                **)(this + 0x10);
    *(ulong *)(this + 8) = (uVar2 + param_3) - uVar3;
  }
  else {
    pbVar10 = this + 4;
    if ((*(ulong *)this & 1) != 0) {
      pbVar10 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  **)(this + 0x10);
    }
    if ((param_2 < uVar6) && (param_3 != uVar3)) {
      memmove(pbVar10 + param_3 * 4 + param_1 * 4,pbVar10 + uVar3 * 4 + param_1 * 4,
              (uVar6 - uVar3) * 4);
    }
    if (param_3 == 0) goto LAB_00bc5e04;
  }
  pbVar5 = pbVar10 + param_1 * 4;
  uVar6 = param_3;
  if (7 < param_3) {
    uVar7 = param_3 & 0xfffffffffffffff8;
    uVar6 = param_3 & 7;
    pbVar8 = pbVar5 + 0x10;
    uVar9 = uVar7;
    do {
      uVar9 = uVar9 - 8;
      *(ulong *)(pbVar8 + -8) = CONCAT44(param_4,param_4);
      *(ulong *)(pbVar8 + -0x10) = CONCAT44(param_4,param_4);
      *(ulong *)(pbVar8 + 8) = CONCAT44(param_4,param_4);
      *(ulong *)pbVar8 = CONCAT44(param_4,param_4);
      pbVar8 = pbVar8 + 0x20;
    } while (uVar9 != 0);
    pbVar5 = pbVar5 + uVar7 * 4;
    if (param_3 == uVar7) goto LAB_00bc5e04;
  }
  do {
    uVar6 = uVar6 - 1;
    *(wchar_t *)pbVar5 = param_4;
    pbVar5 = pbVar5 + 4;
  } while (uVar6 != 0);
LAB_00bc5e04:
  lVar1 = (param_3 - uVar3) + uVar2;
  if (((byte)*this & 1) == 0) {
    *this = SUB41((int)lVar1 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar1;
  }
  *(undefined4 *)(pbVar10 + lVar1 * 4) = 0;
  return;
}

