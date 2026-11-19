/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6b3c
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::append(std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&, unsigned long,
   unsigned long) */

basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> * __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::append(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,basic_string_conflict *param_1,ulong param_2,ulong param_3)

{
  long lVar1;
  basic_string_conflict *pbVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar6;
  ulong uVar7;
  basic_string_conflict bVar8;
  
  bVar8 = *param_1;
  uVar4 = (ulong)((byte)bVar8 >> 1);
  if (((byte)bVar8 & 1) != 0) {
    uVar4 = *(ulong *)(param_1 + 8);
  }
  if (uVar4 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  uVar7 = *(ulong *)this;
  pbVar2 = param_1 + 4;
  if (((byte)bVar8 & 1) != 0) {
    pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
  }
  uVar3 = uVar4 - param_2;
  if (param_3 <= uVar4 - param_2) {
    uVar3 = param_3;
  }
  uVar4 = 4;
  if (((byte)*this & 1) != 0) {
    uVar4 = (uVar7 & 0xfffffffffffffffe) - 1;
  }
  uVar5 = uVar7 >> 1 & 0x7f;
  if ((uVar7 & 1) != 0) {
    uVar5 = *(ulong *)(this + 8);
  }
  if (uVar4 - uVar5 < uVar3) {
    __grow_by_and_replace
              (this,uVar4,(uVar3 - uVar4) + uVar5,uVar5,uVar5,0,uVar3,
               (wchar_t *)(pbVar2 + param_2 * 4));
  }
  else if (uVar3 != 0) {
    pbVar6 = this + 4;
    if ((uVar7 & 1) != 0) {
      pbVar6 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
    memmove(pbVar6 + uVar5 * 4,pbVar2 + param_2 * 4,uVar3 << 2);
    lVar1 = uVar5 + uVar3;
    if (((byte)*this & 1) == 0) {
      *this = SUB41((int)lVar1 << 1,0);
    }
    else {
      *(long *)(this + 8) = lVar1;
    }
    *(undefined4 *)(pbVar6 + lVar1 * 4) = 0;
  }
  return this;
}

