/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901d98
 */

/* std::__ndk1::vector<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::vector(std::__ndk1::vector<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > > const&) */

void __thiscall
std::__ndk1::
vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::vector(vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
         *this,vector *param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  void *__dest;
  ulong uVar4;
  void *__src;
  ulong uVar5;
  
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  uVar4 = *(long *)(param_1 + 8) - *(long *)param_1;
  if (uVar4 != 0) {
    if (0xaaaaaaaaaaaaaaa < (ulong)(((long)uVar4 >> 3) * -0x5555555555555555)) {
                    /* WARNING: Subroutine does not return */
      __vector_base_common<true>::__throw_length_error();
    }
                    /* try { // try from 00901df0 to 00901df3 has its CatchHandler @ 00901ed4 */
    puVar3 = operator_new(uVar4);
    *(ulong **)this = puVar3;
    *(ulong **)(this + 8) = puVar3;
    *(ulong **)(this + 0x10) = puVar3 + ((long)uVar4 >> 3);
    puVar2 = *(ulong **)(param_1 + 8);
    for (puVar1 = *(ulong **)param_1; puVar1 != puVar2; puVar1 = puVar1 + 3) {
      puVar3[1] = 0;
      puVar3[2] = 0;
      *puVar3 = 0;
      if ((*puVar1 & 1) == 0) {
        puVar3[2] = puVar1[2];
        uVar4 = *puVar1;
        puVar3[1] = puVar1[1];
        *puVar3 = uVar4;
      }
      else {
        uVar4 = puVar1[1];
        if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 00901ec4 to 00901ed3 has its CatchHandler @ 00901ed4 */
                    /* WARNING: Subroutine does not return */
          __basic_string_common<true>::__throw_length_error();
        }
        __src = (void *)puVar1[2];
        if (uVar4 < 0x17) {
          __dest = (void *)((long)puVar3 + 1);
          *(char *)puVar3 = (char)((int)uVar4 << 1);
          if (uVar4 != 0) goto LAB_00901e80;
        }
        else {
          uVar5 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00901e68 to 00901e6f has its CatchHandler @ 00901ed8 */
          __dest = operator_new(uVar5);
          puVar3[1] = uVar4;
          puVar3[2] = (ulong)__dest;
          *puVar3 = uVar5 | 1;
LAB_00901e80:
          memcpy(__dest,__src,uVar4);
        }
        *(undefined1 *)((long)__dest + uVar4) = 0;
      }
      puVar3 = (ulong *)(*(long *)(this + 8) + 0x18);
      *(ulong **)(this + 8) = puVar3;
    }
  }
  return;
}

