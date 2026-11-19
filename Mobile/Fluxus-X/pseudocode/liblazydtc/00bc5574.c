/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5574
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::__init(wchar_t const*, unsigned long, unsigned long) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::__init(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,wchar_t *param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *__dest;
  
  if (0x3ffffffffffffff7 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (param_3 < 5) {
    __dest = this + 4;
    *this = SUB41((int)param_2 << 1,0);
  }
  else {
    uVar1 = 8;
    if ((param_3 | 1) != 5) {
      uVar1 = (param_3 | 1) + 1;
    }
    __dest = operator_new(uVar1 << 2);
    *(ulong *)(this + 8) = param_2;
    *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> **)
     (this + 0x10) = __dest;
    *(ulong *)this = uVar1 | 1;
  }
  if (param_2 != 0) {
    memmove(__dest,param_1,param_2 << 2);
  }
  *(undefined4 *)(__dest + param_2 * 4) = 0;
  return;
}

