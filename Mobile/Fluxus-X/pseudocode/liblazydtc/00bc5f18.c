/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5f18
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::reserve(unsigned long) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::reserve(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
          *this,ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *__src;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *__dest;
  uint uVar7;
  ulong uVar8;
  
  if (0x3ffffffffffffff7 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  uVar2 = 4;
  if (((byte)*this & 1) != 0) {
    uVar2 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if (param_1 <= uVar2) {
    return;
  }
  uVar2 = 7;
  if ((param_1 | 1) != 5) {
    uVar2 = param_1 | 1;
  }
  if (param_1 < 5) {
    uVar2 = 4;
  }
  uVar6 = *(ulong *)this;
  uVar8 = (uVar6 & 0xfffffffffffffffe) - 1;
  uVar3 = 4;
  if (((byte)*this & 1) != 0) {
    uVar3 = uVar8;
  }
  uVar4 = uVar6 >> 1 & 0x7f;
  if ((uVar6 & 1) != 0) {
    uVar4 = *(ulong *)(this + 8);
  }
  if (uVar2 < 5) {
    __dest = this + 4;
    uVar7 = 1;
    __src = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
              **)(this + 0x10);
  }
  else {
    uVar1 = uVar2 + 1;
    if (uVar3 < uVar2) {
      if (uVar1 >> 0x3e != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe1b8();
      }
      __dest = operator_new(uVar1 * 4);
    }
    else {
      if (uVar1 >> 0x3e != 0) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bc60e8 to 00bc60eb has its CatchHandler @ 00bc60ec */
        FUN_007fe1b8();
      }
                    /* try { // try from 00bc6084 to 00bc608b has its CatchHandler @ 00bc60ec */
      __dest = operator_new(uVar1 * 4);
      uVar5 = 4;
      if ((uVar6 & 1) != 0) {
        uVar5 = uVar8;
      }
      if (uVar5 < uVar2) {
        operator_delete(__dest,uVar1 * 4);
        return;
      }
    }
    uVar7 = (uint)uVar6 & 1;
    __src = this + 4;
    if ((uVar6 & 1) != 0) {
      __src = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                **)(this + 0x10);
    }
  }
  if (uVar4 != 0xffffffffffffffff) {
    memmove(__dest,__src,(uVar4 + 1) * 4);
  }
  if (uVar7 != 0) {
    operator_delete(__src,uVar3 * 4 + 4);
  }
  if (uVar2 < 5) {
    *this = SUB41((int)uVar4 << 1,0);
  }
  else {
    *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> **)
     (this + 0x10) = __dest;
    *(ulong *)this = uVar2 + 1 | 1;
    *(ulong *)(this + 8) = uVar4;
  }
  return;
}

