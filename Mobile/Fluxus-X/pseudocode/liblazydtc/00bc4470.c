/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4470
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::__init(unsigned long, char) */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::__init
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,char param_2)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__s;
  
  if (0xfffffffffffffff7 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (param_1 < 0x17) {
    __s = this + 1;
    *this = SUB41((int)param_1 << 1,0);
    if (param_1 == 0) goto LAB_00bc44e8;
  }
  else {
    uVar1 = 0x1a;
    if ((param_1 | 7) != 0x17) {
      uVar1 = (param_1 | 7) + 1;
    }
    __s = operator_new(uVar1);
    *(ulong *)(this + 8) = param_1;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = __s;
    *(ulong *)this = uVar1 | 1;
  }
  memset(__s,(uint)(byte)param_2,param_1);
LAB_00bc44e8:
  __s[param_1] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0
  ;
  return;
}

