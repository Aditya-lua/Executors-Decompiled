/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5148
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::replace(unsigned long, unsigned long, wchar_t const*, unsigned
   long) */

basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> * __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::replace(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
          *this,ulong param_1,ulong param_2,wchar_t *param_3,ulong param_4)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *__dest;
  ulong uVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  
  bVar3 = *this;
  uVar1 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
  }
  uVar4 = uVar1 - param_1;
  if (uVar1 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  uVar6 = uVar4;
  if (param_2 <= uVar4) {
    uVar6 = param_2;
  }
  uVar5 = 4;
  if (((byte)bVar3 & 1) != 0) {
    uVar5 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if ((uVar6 - uVar1) + uVar5 < param_4) {
    __grow_by_and_replace
              (this,uVar5,((uVar1 + param_4) - uVar5) - uVar6,uVar1,param_1,uVar6,param_4,param_3);
    return this;
  }
  pbVar2 = this + 4;
  if ((*(ulong *)this & 1) != 0) {
    pbVar2 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               **)(this + 0x10);
  }
  if (param_4 == uVar6) {
    uVar6 = param_4;
  }
  else if (param_2 < uVar4) {
    __dest = pbVar2 + param_1 * 4;
    uVar5 = param_4 - uVar6;
    lVar7 = uVar4 - uVar6;
    if (param_4 < uVar6) {
      if (param_4 != 0) {
        memmove(__dest,param_3,param_4 << 2);
      }
      memmove(__dest + param_4 * 4,__dest + uVar6 * 4,lVar7 * 4);
      bVar3 = *this;
      goto joined_r0x00bc5254;
    }
    if ((param_3 < pbVar2 + uVar1 * 4) && (__dest + 4 <= param_3)) {
      if (param_3 < __dest + uVar6 * 4) {
        if (param_2 != 0) {
          memmove(__dest,param_3,uVar6 << 2);
        }
        param_3 = param_3 + param_4;
        param_1 = uVar6 + param_1;
        uVar6 = 0;
        param_4 = uVar5;
      }
      else {
        param_3 = param_3 + uVar5;
      }
    }
    memmove(pbVar2 + param_4 * 4 + param_1 * 4,pbVar2 + uVar6 * 4 + param_1 * 4,lVar7 * 4);
  }
  if (param_4 != 0) {
    memmove(pbVar2 + param_1 * 4,param_3,param_4 << 2);
  }
  bVar3 = *this;
  uVar5 = param_4 - uVar6;
joined_r0x00bc5254:
  lVar7 = uVar5 + uVar1;
  if (((byte)bVar3 & 1) == 0) {
    *this = SUB41((int)lVar7 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar7;
  }
  *(undefined4 *)(pbVar2 + lVar7 * 4) = 0;
  return this;
}

