/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085523c
 */

void FUN_0085523c(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                  *param_1)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar2;
  ulong uVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar5;
  long lVar6;
  ulong uVar7;
  
  bVar5 = *param_1;
  uVar3 = (ulong)((byte)bVar5 >> 1);
  if (((byte)bVar5 & 1) != 0) {
    uVar3 = *(ulong *)(param_1 + 8);
  }
  if (uVar3 == 0) {
    return;
  }
  pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (param_1 + 0x10);
  if (((byte)bVar5 & 1) == 0) {
    pbVar2 = param_1 + 1;
  }
  if ((*pbVar2 ==
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xd) &&
     (pbVar2[1] ==
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa)) {
    uVar3 = 2;
  }
  else {
    uVar3 = (ulong)(*pbVar2 ==
                   (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
                   0xa);
  }
  pbVar1 = pbVar2 + uVar3;
  pbVar4 = pbVar2;
  do {
    bVar5 = *pbVar1;
    if (bVar5 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xd
       ) {
      if (pbVar1[1] !=
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa)
      goto LAB_008552cc;
      bVar5 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa;
      lVar6 = 2;
    }
    else {
      if (bVar5 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
                   0x0) {
        bVar5 = *param_1;
        pbVar1 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **
                  )(param_1 + 0x10);
        uVar3 = (ulong)((byte)bVar5 >> 1);
        pbVar4 = param_1 + 1;
        if (((byte)bVar5 & 1) != 0) {
          uVar3 = *(ulong *)(param_1 + 8);
          pbVar4 = pbVar1;
        }
        uVar7 = (long)pbVar2 - (long)pbVar4;
        if (uVar3 < uVar7) {
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                    (param_1,(ulong)(pbVar2 + (-uVar3 - (long)pbVar4)),'\0');
          return;
        }
        if (((byte)bVar5 & 1) == 0) {
          *param_1 = SUB41((int)uVar7 << 1,0);
          pbVar1 = param_1 + 1;
        }
        else {
          *(ulong *)(param_1 + 8) = uVar7;
        }
        pbVar2[(long)pbVar1 - (long)pbVar4] =
             (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
        return;
      }
LAB_008552cc:
      lVar6 = 1;
    }
    *pbVar4 = bVar5;
    pbVar1 = pbVar1 + lVar6;
    pbVar2 = pbVar2 + 1;
    pbVar4 = pbVar4 + 1;
  } while( true );
}

