/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00999620
 */

/* void std::__ndk1::list<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::emplace_back<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&>(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

void __thiscall
std::__ndk1::
list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::
emplace_back<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&>
          (list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
           *this,basic_string_conflict *param_1)

{
  long *plVar1;
  void *__dest;
  long lVar2;
  ulong __n;
  void *__src;
  ulong uVar3;
  
  plVar1 = operator_new(0x28);
  *plVar1 = 0;
  plVar1[2] = 0;
  plVar1[3] = 0;
  plVar1[4] = 0;
  if (((byte)*param_1 & 1) == 0) {
    plVar1[4] = *(long *)(param_1 + 0x10);
    lVar2 = *(long *)param_1;
    plVar1[3] = *(long *)(param_1 + 8);
    plVar1[2] = lVar2;
    goto LAB_009996d0;
  }
  __n = *(ulong *)(param_1 + 8);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00999700 to 00999703 has its CatchHandler @ 00999704 */
    __basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_1 + 0x10);
  if (__n < 0x17) {
    __dest = (void *)((long)plVar1 + 0x11);
    *(char *)(plVar1 + 2) = (char)((int)__n << 1);
    if (__n != 0) goto LAB_009996bc;
  }
  else {
    uVar3 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009996a4 to 009996ab has its CatchHandler @ 00999704 */
    __dest = operator_new(uVar3);
    plVar1[3] = __n;
    plVar1[4] = (long)__dest;
    plVar1[2] = uVar3 | 1;
LAB_009996bc:
    memcpy(__dest,__src,__n);
  }
  *(undefined1 *)((long)__dest + __n) = 0;
LAB_009996d0:
  lVar2 = *(long *)this;
  *plVar1 = lVar2;
  plVar1[1] = (long)this;
  *(long **)(lVar2 + 8) = plVar1;
  *(long **)this = plVar1;
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 1;
  return;
}

