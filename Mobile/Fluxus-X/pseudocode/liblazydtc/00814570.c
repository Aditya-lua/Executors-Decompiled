/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00814570
 */

void FUN_00814570(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                  *param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  ulong uVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  long lVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar5;
  ulong local_68;
  ulong local_60;
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  local_60 = 0;
  mbedtls_base64_encode(0,0,&local_60,param_2,param_3);
  uVar2 = local_60;
  if (0xfffffffffffffff7 < local_60) {
    if (*(long *)(lVar4 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    goto LAB_00814714;
  }
  if (local_60 < 0x17) {
    pbVar5 = param_1 + 1;
    *param_1 = SUB41((int)local_60 << 1,0);
    if (local_60 != 0) goto LAB_00814610;
  }
  else {
    uVar1 = 0x1a;
    if ((local_60 | 7) != 0x17) {
      uVar1 = (local_60 | 7) + 1;
    }
    pbVar5 = operator_new(uVar1);
    *(ulong *)(param_1 + 8) = uVar2;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (param_1 + 0x10) = pbVar5;
    *(ulong *)param_1 = uVar1 | 1;
LAB_00814610:
    memset(pbVar5,0,uVar2);
  }
  pbVar5[uVar2] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  uVar2 = *(ulong *)(param_1 + 8);
  pbVar5 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (param_1 + 0x10);
  local_68 = 0;
  if (((byte)*param_1 & 1) == 0) {
    pbVar5 = param_1 + 1;
    uVar2 = (ulong)((byte)*param_1 >> 1);
  }
                    /* try { // try from 00814640 to 0081467b has its CatchHandler @ 008146e0 */
  mbedtls_base64_encode(pbVar5,uVar2,&local_68,param_2,param_3);
  bVar3 = *param_1;
  uVar2 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar2 = *(ulong *)(param_1 + 8);
  }
  if (local_68 < uVar2 || local_68 - uVar2 == 0) {
    if (((byte)bVar3 & 1) == 0) {
      pbVar5 = param_1 + 1;
      *param_1 = SUB41((int)local_68 << 1,0);
    }
    else {
      pbVar5 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (param_1 + 0x10);
      *(ulong *)(param_1 + 8) = local_68;
    }
    pbVar5[local_68] =
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  }
  else {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append(param_1,local_68 - uVar2,'\0');
  }
  if (*(long *)(lVar4 + 0x28) == local_58) {
    return;
  }
LAB_00814714:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

