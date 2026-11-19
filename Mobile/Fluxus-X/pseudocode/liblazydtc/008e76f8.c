/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e76f8
 */

/* void std::__ndk1::vector<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::__emplace_back_slow_path<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&>(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::
vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::
__emplace_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
          (vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
           *this,basic_string_conflict *param_1)

{
  ulong *puVar1;
  void *pvVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  byte *pbVar6;
  ulong uVar7;
  byte *pbVar8;
  ulong *puVar9;
  void *__src;
  void *__dest;
  byte *pbVar10;
  ulong uVar11;
  
  pbVar8 = *(byte **)this;
  pbVar10 = *(byte **)(this + 8);
  lVar3 = (long)pbVar10 - (long)pbVar8 >> 3;
  uVar11 = 0xaaaaaaaaaaaaaaa;
  uVar7 = lVar3 * -0x5555555555555555 + 1;
  if (0xaaaaaaaaaaaaaaa < uVar7) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  lVar5 = *(long *)(this + 0x10) - (long)pbVar8 >> 3;
  if ((ulong)(lVar5 * -0x5555555555555555) < 0x555555555555555) {
    uVar4 = lVar5 * 0x5555555555555556;
    uVar11 = uVar7;
    if (uVar7 <= uVar4) {
      uVar11 = uVar4;
    }
    if (uVar11 != 0) goto LAB_008e777c;
    pvVar2 = (void *)0x0;
  }
  else {
LAB_008e777c:
    pvVar2 = operator_new(uVar11 * 0x18);
  }
  puVar9 = (ulong *)((long)pvVar2 + lVar3 * 8);
  puVar9[1] = 0;
  puVar9[2] = 0;
  *puVar9 = 0;
  if (((byte)*param_1 & 1) == 0) {
    puVar9[2] = *(ulong *)(param_1 + 0x10);
    uVar7 = *(ulong *)param_1;
    puVar9[1] = *(ulong *)(param_1 + 8);
    *puVar9 = uVar7;
    goto LAB_008e7830;
  }
  uVar7 = *(ulong *)(param_1 + 8);
  if (0xffffffffffffffef < uVar7) {
                    /* try { // try from 008e78f0 to 008e78f7 has its CatchHandler @ 008e78f8 */
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_1 + 0x10);
  if (uVar7 < 0x17) {
    __dest = (void *)((long)puVar9 + 1);
    *(char *)puVar9 = (char)((int)uVar7 << 1);
    if (uVar7 != 0) goto LAB_008e7814;
  }
  else {
    uVar4 = uVar7 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e77f0 to 008e77f7 has its CatchHandler @ 008e78f8 */
    __dest = operator_new(uVar4);
    *(ulong *)((long)pvVar2 + lVar3 * 8 + 8) = uVar7;
    *(void **)((long)pvVar2 + lVar3 * 8 + 0x10) = __dest;
    *puVar9 = uVar4 | 1;
LAB_008e7814:
    memcpy(__dest,__src,uVar7);
  }
  *(undefined1 *)((long)__dest + uVar7) = 0;
  pbVar8 = *(byte **)this;
  pbVar10 = *(byte **)(this + 8);
LAB_008e7830:
  puVar1 = puVar9 + 3;
  if (pbVar10 != pbVar8) {
    do {
      puVar9[-1] = *(ulong *)(pbVar10 + -8);
      uVar7 = *(ulong *)(pbVar10 + -0x18);
      puVar9[-2] = *(ulong *)(pbVar10 + -0x10);
      puVar9[-3] = uVar7;
      pbVar10[-0x18] = 0;
      pbVar10[-0x17] = 0;
      pbVar10[-0x16] = 0;
      pbVar10[-0x15] = 0;
      pbVar10[-0x14] = 0;
      pbVar10[-0x13] = 0;
      pbVar10[-0x12] = 0;
      pbVar10[-0x11] = 0;
      pbVar10[-0x10] = 0;
      pbVar10[-0xf] = 0;
      pbVar10[-0xe] = 0;
      pbVar10[-0xd] = 0;
      pbVar10[-0xc] = 0;
      pbVar10[-0xb] = 0;
      pbVar10[-10] = 0;
      pbVar10[-9] = 0;
      pbVar10[-8] = 0;
      pbVar10[-7] = 0;
      pbVar10[-6] = 0;
      pbVar10[-5] = 0;
      pbVar10[-4] = 0;
      pbVar10[-3] = 0;
      pbVar10[-2] = 0;
      pbVar10[-1] = 0;
      pbVar10 = pbVar10 + -0x18;
      puVar9 = puVar9 + -3;
    } while (pbVar8 != pbVar10);
    pbVar8 = *(byte **)this;
    pbVar10 = *(byte **)(this + 8);
  }
  *(ulong **)this = puVar9;
  *(ulong **)(this + 8) = puVar1;
  *(void **)(this + 0x10) = (void *)((long)pvVar2 + uVar11 * 0x18);
  if (pbVar10 != pbVar8) {
    do {
      pbVar6 = pbVar10 + -0x18;
      if ((*pbVar6 & 1) != 0) {
        operator_delete(*(void **)(pbVar10 + -8));
      }
      pbVar10 = pbVar6;
    } while (pbVar8 != pbVar6);
  }
  if (pbVar8 == (byte *)0x0) {
    return;
  }
  operator_delete(pbVar8);
  return;
}

