/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5334
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::__grow_by_and_replace(unsigned long, unsigned long, unsigned
   long, unsigned long, unsigned long, unsigned long, wchar_t const*) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::__grow_by_and_replace
          (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
           *this,ulong param_1,ulong param_2,ulong param_3,ulong param_4,ulong param_5,ulong param_6
          ,wchar_t *param_7)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *__src;
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  void *__dest;
  ulong uVar4;
  size_t __n;
  
  if (0x3ffffffffffffff6 - param_1 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  __src = this + 4;
  if (((byte)*this & 1) != 0) {
    __src = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
              **)(this + 0x10);
  }
  if (param_1 < 0x1ffffffffffffff3) {
    uVar1 = param_2 + param_1;
    if (param_2 + param_1 <= param_1 * 2) {
      uVar1 = param_1 * 2;
    }
    uVar2 = 8;
    if ((uVar1 | 1) != 5) {
      uVar2 = (uVar1 | 1) + 1;
    }
    uVar4 = 5;
    if (4 < uVar1) {
      uVar4 = uVar2;
    }
    if (uVar4 >> 0x3e != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
  else {
    uVar4 = 0x3ffffffffffffff7;
  }
  __dest = operator_new(uVar4 << 2);
  __n = param_4 * 4;
  if (param_4 != 0) {
    memmove(__dest,__src,__n);
  }
  if (param_6 != 0) {
    memcpy((void *)((long)__dest + param_4 * 4),param_7,param_6 << 2);
  }
  lVar3 = param_3 - (param_5 + param_4);
  if (lVar3 != 0) {
    memmove((void *)((long)__dest + param_6 * 4 + __n),__src + param_5 * 4 + __n,lVar3 * 4);
  }
  if (param_1 + 1 != 5) {
    operator_delete(__src,(param_1 + 1) * 4);
  }
  lVar3 = param_6 + param_4 + lVar3;
  *(ulong *)this = uVar4 | 1;
  *(long *)(this + 8) = lVar3;
  *(void **)(this + 0x10) = __dest;
  *(undefined4 *)((long)__dest + lVar3 * 4) = 0;
  return;
}

