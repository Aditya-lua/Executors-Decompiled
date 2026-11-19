/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a9f20
 */

void FUN_008a9f20(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                  *param_1,char *param_2,undefined8 *param_3)

{
  ulong uVar1;
  ulong uVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  long lVar4;
  uint uVar5;
  ulong uVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar7;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  uStack_68 = param_3[1];
  local_70 = *param_3;
  uStack_58 = param_3[3];
  uStack_60 = param_3[2];
  uVar5 = vsnprintf((char *)0x0,0,param_2,&local_70);
  uVar6 = (ulong)uVar5;
  if (0 < (int)uVar5) {
    bVar3 = *param_1;
    uVar2 = (ulong)((byte)bVar3 >> 1);
    if (((byte)bVar3 & 1) != 0) {
      uVar2 = *(ulong *)(param_1 + 8);
    }
    uVar1 = uVar2 + uVar6;
    if (uVar2 < uVar1) {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(param_1,uVar6,'\0');
    }
    else {
      if (((byte)bVar3 & 1) == 0) {
        pbVar7 = param_1 + 1;
        *param_1 = SUB41((int)uVar1 << 1,0);
      }
      else {
        pbVar7 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **
                  )(param_1 + 0x10);
        *(ulong *)(param_1 + 8) = uVar1;
      }
      pbVar7[uVar1] =
           (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
    }
    pbVar7 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (param_1 + 0x10);
    uStack_68 = param_3[1];
    local_70 = *param_3;
    uStack_58 = param_3[3];
    uStack_60 = param_3[2];
    if (((byte)*param_1 & 1) == 0) {
      pbVar7 = param_1 + 1;
    }
    uVar5 = vsnprintf((char *)(pbVar7 + uVar2),(ulong)(uVar5 + 1),param_2,&local_70);
    uVar6 = (ulong)uVar5;
  }
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

