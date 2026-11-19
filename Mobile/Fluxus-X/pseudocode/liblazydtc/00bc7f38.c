/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc7f38
 */

/* std::__ndk1::stold(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned long*) */

undefined1  [16] std::__ndk1::stold(basic_string_conflict *param_1,ulong *param_2)

{
  int iVar1;
  int iVar2;
  undefined1 auVar3 [16];
  int *piVar4;
  undefined8 uVar5;
  basic_string_conflict *__nptr;
  double dVar6;
  undefined8 extraout_var;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_78;
  undefined4 local_77;
  undefined2 local_73;
  char *local_60;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_58;
  undefined4 local_57;
  undefined1 local_53;
  undefined6 local_52;
  undefined1 uStack_4c;
  undefined1 uStack_4b;
  undefined2 uStack_4a;
  undefined4 local_48;
  undefined4 uStack_44;
  
  __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  local_78 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa;
  local_77 = 0x6c6f7473;
  local_73 = 100;
  local_60 = (char *)0x0;
  if (((byte)*param_1 & 1) == 0) {
    __nptr = param_1 + 1;
  }
  piVar4 = (int *)__errno();
  iVar1 = *piVar4;
  *piVar4 = 0;
  dVar6 = strtold((char *)__nptr,&local_60);
  iVar2 = *piVar4;
  *piVar4 = iVar1;
  if (iVar2 == 0x22) {
    uStack_44 = 0;
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x26;
    local_57 = 0x6c6f7473;
    local_53 = 100;
    local_52 = 0x2074756f203a;
    uStack_4c = 0x6f;
    uStack_4b = 0x66;
    uStack_4a = 0x7220;
    local_48 = 0x65676e61;
                    /* try { // try from 00bc8024 to 00bc802b has its CatchHandler @ 00bc8074 */
                    /* WARNING: Subroutine does not return */
    FUN_0080c8d0((ulong)&local_58 | 1);
  }
  if ((long)local_60 - (long)__nptr == 0) {
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x28;
    local_57 = 0x6c6f7473;
    local_53 = 100;
    local_52 = 0x63206f6e203a;
    uStack_4c = 0x6f;
    uStack_4b = 0x6e;
    uStack_4a = 0x6576;
    local_48 = 0x6f697372;
    uStack_44 = 0x6e;
                    /* try { // try from 00bc8068 to 00bc806f has its CatchHandler @ 00bc8070 */
    uVar5 = FUN_00bcab04((ulong)&local_58 | 1);
                    /* catch() { ... } // from try @ 00bc8068 with catch @ 00bc8070 */
                    /* catch() { ... } // from try @ 00bc8024 with catch @ 00bc8074 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_58);
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_78);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar5);
  }
  if (param_2 != (ulong *)0x0) {
    *param_2 = (long)local_60 - (long)__nptr;
  }
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
            (&local_78);
  auVar3._8_8_ = extraout_var;
  auVar3._0_8_ = dVar6;
  return auVar3;
}

