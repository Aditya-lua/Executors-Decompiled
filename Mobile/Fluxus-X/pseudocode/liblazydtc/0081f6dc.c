/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081f6dc
 */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *
FUN_0081f6dc(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_1
            ,byte *param_2)

{
  long lVar1;
  ulong __n;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  byte *__src;
  bool bVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  
  __src = *(byte **)(param_2 + 0x10);
  bVar5 = (*param_2 & 1) == 0;
  if (bVar5) {
    __src = param_2 + 1;
  }
  uVar4 = *(ulong *)param_1;
  __n = (ulong)(*param_2 >> 1);
  if (!bVar5) {
    __n = *(ulong *)(param_2 + 8);
  }
  uVar2 = 0x16;
  if (((byte)*param_1 & 1) != 0) {
    uVar2 = (uVar4 & 0xfffffffffffffffe) - 1;
  }
  uVar3 = uVar4 >> 1 & 0x7f;
  if ((uVar4 & 1) != 0) {
    uVar3 = *(ulong *)(param_1 + 8);
  }
  if (uVar2 - uVar3 < __n) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    __grow_by_and_replace(param_1,uVar2,(__n - uVar2) + uVar3,uVar3,uVar3,0,__n,(char *)__src);
  }
  else if (__n != 0) {
    pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (param_1 + 0x10);
    if ((uVar4 & 1) == 0) {
      pbVar6 = param_1 + 1;
    }
    memmove(pbVar6 + uVar3,__src,__n);
    lVar1 = uVar3 + __n;
    if (((byte)*param_1 & 1) == 0) {
      *param_1 = SUB41((int)lVar1 << 1,0);
    }
    else {
      *(long *)(param_1 + 8) = lVar1;
    }
    pbVar6[lVar1] =
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  }
  return param_1;
}

