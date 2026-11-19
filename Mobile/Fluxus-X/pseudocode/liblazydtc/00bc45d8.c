/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc45d8
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::__grow_by(unsigned long, unsigned long, unsigned long, unsigned long, unsigned long, unsigned
   long) */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
__grow_by(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
         ulong param_1,ulong param_2,ulong param_3,ulong param_4,ulong param_5,ulong param_6)

{
  ulong uVar1;
  ulong uVar2;
  size_t __n;
  void *__dest;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  ulong uVar3;
  
  if (-param_1 - 9 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  __src = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
           (this + 0x10);
  if (((byte)*this & 1) == 0) {
    __src = this + 1;
  }
  if (param_1 < 0x7ffffffffffffff3) {
    uVar1 = param_2 + param_1;
    if (param_2 + param_1 <= param_1 * 2) {
      uVar1 = param_1 * 2;
    }
    uVar2 = 0x1a;
    if ((uVar1 | 7) != 0x17) {
      uVar2 = (uVar1 | 7) + 1;
    }
    uVar3 = 0x17;
    if (0x16 < uVar1) {
      uVar3 = uVar2;
    }
  }
  else {
    uVar3 = 0xfffffffffffffff7;
  }
  __dest = operator_new(uVar3);
  if (param_4 != 0) {
    memmove(__dest,__src,param_4);
  }
  __n = param_3 - (param_5 + param_4);
  if (__n != 0) {
    memmove((void *)((long)__dest + param_6 + param_4),__src + param_5 + param_4,__n);
  }
  if (param_1 + 1 != 0x17) {
    operator_delete(__src,param_1 + 1);
  }
  *(void **)(this + 0x10) = __dest;
  *(ulong *)this = uVar3 | 1;
  return;
}

