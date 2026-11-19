/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc38b4
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::__grow_by_and_replace(unsigned long, unsigned long, unsigned long, unsigned long, unsigned
   long, unsigned long, char const*) */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
__grow_by_and_replace
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,ulong param_2,ulong param_3,ulong param_4,ulong param_5,ulong param_6,
          char *param_7)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  size_t __n;
  void *__dest;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  ulong uVar4;
  
  if (-param_1 - 10 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  __src = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
           (this + 0x10);
  if (((byte)*this & 1) == 0) {
    __src = this + 1;
  }
  if (param_1 < 0x7ffffffffffffff3) {
    uVar2 = param_2 + param_1;
    if (param_2 + param_1 <= param_1 * 2) {
      uVar2 = param_1 * 2;
    }
    uVar3 = 0x1a;
    if ((uVar2 | 7) != 0x17) {
      uVar3 = (uVar2 | 7) + 1;
    }
    uVar4 = 0x17;
    if (0x16 < uVar2) {
      uVar4 = uVar3;
    }
  }
  else {
    uVar4 = 0xfffffffffffffff7;
  }
  __dest = operator_new(uVar4);
  if (param_4 != 0) {
    memmove(__dest,__src,param_4);
  }
  if (param_6 != 0) {
    memcpy((void *)((long)__dest + param_4),param_7,param_6);
  }
  __n = param_3 - (param_5 + param_4);
  if (__n != 0) {
    memmove((void *)((long)__dest + param_6 + param_4),__src + param_5 + param_4,__n);
  }
  if (param_1 + 1 != 0x17) {
    operator_delete(__src,param_1 + 1);
  }
  lVar1 = param_6 + param_4 + __n;
  *(ulong *)this = uVar4 | 1;
  *(long *)(this + 8) = lVar1;
  *(void **)(this + 0x10) = __dest;
  *(undefined1 *)((long)__dest + lVar1) = 0;
  return;
}

