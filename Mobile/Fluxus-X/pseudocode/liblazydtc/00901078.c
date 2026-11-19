/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901078
 */

/* void std::__ndk1::vector<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > >::__emplace_back_slow_path<char
   const (&) [1]>(char const (&) [1]) */

void __thiscall
std::__ndk1::
vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::__emplace_back_slow_path<char_const(&)[1]>
          (vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
           *this,char *param_1)

{
  ulong *puVar1;
  void *pvVar2;
  size_t __n;
  long lVar3;
  byte *pbVar4;
  long lVar5;
  ulong uVar6;
  byte *pbVar7;
  byte *pbVar8;
  ulong *puVar9;
  void *__dest;
  ulong uVar10;
  ulong uVar11;
  
  lVar3 = *(long *)(this + 8) - *(long *)this >> 3;
  uVar11 = 0xaaaaaaaaaaaaaaa;
  uVar10 = lVar3 * -0x5555555555555555 + 1;
  if (0xaaaaaaaaaaaaaaa < uVar10) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  lVar5 = *(long *)(this + 0x10) - *(long *)this >> 3;
  if ((ulong)(lVar5 * -0x5555555555555555) < 0x555555555555555) {
    uVar6 = lVar5 * 0x5555555555555556;
    uVar11 = uVar10;
    if (uVar10 <= uVar6) {
      uVar11 = uVar6;
    }
    if (uVar11 != 0) goto LAB_009010fc;
    pvVar2 = (void *)0x0;
  }
  else {
LAB_009010fc:
    pvVar2 = operator_new(uVar11 * 0x18);
  }
  puVar9 = (ulong *)((long)pvVar2 + lVar3 * 8);
  *puVar9 = 0;
  puVar9[1] = 0;
  puVar9[2] = 0;
  __n = strlen(param_1);
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 00901260 to 00901267 has its CatchHandler @ 00901268 */
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    __dest = (void *)((long)puVar9 + 1);
    *(char *)puVar9 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_0090118c;
  }
  else {
    uVar10 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00901158 to 0090115f has its CatchHandler @ 00901268 */
    __dest = operator_new(uVar10);
    *(size_t *)((long)pvVar2 + lVar3 * 8 + 8) = __n;
    *(void **)((long)pvVar2 + lVar3 * 8 + 0x10) = __dest;
    *puVar9 = uVar10 | 1;
  }
  memcpy(__dest,param_1,__n);
LAB_0090118c:
  *(undefined1 *)((long)__dest + __n) = 0;
  pbVar4 = *(byte **)this;
  pbVar7 = *(byte **)(this + 8);
  puVar1 = puVar9 + 3;
  if (pbVar7 == pbVar4) {
    pbVar7 = pbVar4;
  }
  else {
    do {
      puVar9[-1] = *(ulong *)(pbVar7 + -8);
      uVar10 = *(ulong *)(pbVar7 + -0x18);
      puVar9[-2] = *(ulong *)(pbVar7 + -0x10);
      puVar9[-3] = uVar10;
      pbVar7[-0x18] = 0;
      pbVar7[-0x17] = 0;
      pbVar7[-0x16] = 0;
      pbVar7[-0x15] = 0;
      pbVar7[-0x14] = 0;
      pbVar7[-0x13] = 0;
      pbVar7[-0x12] = 0;
      pbVar7[-0x11] = 0;
      pbVar7[-0x10] = 0;
      pbVar7[-0xf] = 0;
      pbVar7[-0xe] = 0;
      pbVar7[-0xd] = 0;
      pbVar7[-0xc] = 0;
      pbVar7[-0xb] = 0;
      pbVar7[-10] = 0;
      pbVar7[-9] = 0;
      pbVar7[-8] = 0;
      pbVar7[-7] = 0;
      pbVar7[-6] = 0;
      pbVar7[-5] = 0;
      pbVar7[-4] = 0;
      pbVar7[-3] = 0;
      pbVar7[-2] = 0;
      pbVar7[-1] = 0;
      pbVar7 = pbVar7 + -0x18;
      puVar9 = puVar9 + -3;
    } while (pbVar4 != pbVar7);
    pbVar4 = *(byte **)(this + 8);
    pbVar7 = *(byte **)this;
  }
  *(ulong **)this = puVar9;
  *(ulong **)(this + 8) = puVar1;
  *(void **)(this + 0x10) = (void *)((long)pvVar2 + uVar11 * 0x18);
  if (pbVar4 != pbVar7) {
    do {
      pbVar8 = pbVar4 + -0x18;
      if ((*pbVar8 & 1) != 0) {
        operator_delete(*(void **)(pbVar4 + -8));
      }
      pbVar4 = pbVar8;
    } while (pbVar7 != pbVar8);
  }
  if (pbVar7 == (byte *)0x0) {
    return;
  }
  operator_delete(pbVar7);
  return;
}

