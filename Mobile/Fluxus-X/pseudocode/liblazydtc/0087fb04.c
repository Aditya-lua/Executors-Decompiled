/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087fb04
 */

void FUN_0087fb04(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                  *param_1,char *param_2,size_t param_3)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  char cVar5;
  void *pvVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar7;
  
  pvVar6 = memchr(param_2,0x25,param_3);
  if (pvVar6 == (void *)0x0) {
    uVar4 = *(ulong *)param_1;
    uVar2 = 0x16;
    if (((byte)*param_1 & 1) != 0) {
      uVar2 = (uVar4 & 0xfffffffffffffffe) - 1;
    }
    uVar3 = uVar4 >> 1 & 0x7f;
    if ((uVar4 & 1) != 0) {
      uVar3 = *(ulong *)(param_1 + 8);
    }
    if (uVar2 - uVar3 < param_3) {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      __grow_by_and_replace(param_1,uVar2,(param_3 - uVar2) + uVar3,uVar3,uVar3,0,param_3,param_2);
      return;
    }
    if (param_3 != 0) {
      pbVar7 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (param_1 + 0x10);
      if ((uVar4 & 1) == 0) {
        pbVar7 = param_1 + 1;
      }
      memmove(pbVar7 + uVar3,param_2,param_3);
      lVar1 = uVar3 + param_3;
      if (((byte)*param_1 & 1) == 0) {
        *param_1 = SUB41((int)lVar1 << 1,0);
      }
      else {
        *(long *)(param_1 + 8) = lVar1;
      }
      pbVar7[lVar1] =
           (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
    }
  }
  else {
    for (; param_3 != 0; param_3 = param_3 - 1) {
      cVar5 = *param_2;
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      push_back(param_1,cVar5);
      if (cVar5 == '%') {
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::push_back(param_1,'%');
      }
      param_2 = param_2 + 1;
    }
  }
  return;
}

