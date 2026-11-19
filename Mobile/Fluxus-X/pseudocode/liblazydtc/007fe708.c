/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe708
 */

basic_istream *
FUN_007fe708(basic_istream *param_1,
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_2,
            uint param_3)

{
  byte *pbVar1;
  long lVar2;
  uint uVar3;
  long *plVar4;
  long lVar5;
  sentry local_4c [4];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::sentry::sentry
            (local_4c,param_1,true);
  if (local_4c[0] == (sentry)0x1) {
    if (((byte)*param_2 & 1) == 0) {
      *(undefined2 *)param_2 = 0;
    }
    else {
      **(undefined1 **)(param_2 + 0x10) = 0;
      *(undefined8 *)(param_2 + 8) = 0;
    }
    lVar5 = 0;
    do {
      plVar4 = *(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28);
      pbVar1 = (byte *)plVar4[3];
      if (pbVar1 == (byte *)plVar4[4]) {
                    /* try { // try from 007fe7ac to 007fe7b3 has its CatchHandler @ 007fe848 */
        uVar3 = (**(code **)(*plVar4 + 0x50))();
        if (uVar3 == 0xffffffff) {
          uVar3 = 6;
          if (lVar5 != 0) {
            uVar3 = 2;
          }
          goto LAB_007fe804;
        }
      }
      else {
        plVar4[3] = (long)(pbVar1 + 1);
        uVar3 = (uint)*pbVar1;
      }
      if ((param_3 & 0xff) == (uVar3 & 0xff)) {
        uVar3 = 0;
        goto LAB_007fe804;
      }
                    /* try { // try from 007fe7c4 to 007fe7cb has its CatchHandler @ 007fe84c */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      push_back(param_2,(char)uVar3);
      lVar5 = lVar5 + -1;
    } while ((((byte)*param_2 & 1) == 0) || (*(long *)(param_2 + 8) != -9));
    uVar3 = 4;
LAB_007fe804:
    std::__ndk1::ios_base::clear
              ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
               *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | uVar3
              );
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return param_1;
}

