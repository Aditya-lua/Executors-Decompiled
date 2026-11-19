/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc8a3c
 */

/* std::__ndk1::stold(std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> > const&, unsigned long*) */

undefined1  [16] std::__ndk1::stold(basic_string_conflict *param_1,ulong *param_2)

{
  basic_string_conflict *__nptr;
  int iVar1;
  int iVar2;
  undefined1 auVar3 [16];
  int *piVar4;
  undefined8 uVar5;
  double dVar6;
  undefined8 extraout_var;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_68;
  undefined4 local_67;
  undefined2 local_63;
  wchar_t *local_50;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_48;
  undefined4 local_47;
  undefined1 local_43;
  undefined6 local_42;
  undefined1 uStack_3c;
  undefined1 uStack_3b;
  undefined2 uStack_3a;
  undefined4 local_38;
  undefined4 uStack_34;
  
  local_68 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa;
  local_50 = (wchar_t *)0x0;
  local_67 = 0x6c6f7473;
  local_63 = 100;
  __nptr = param_1 + 4;
  if (((byte)*param_1 & 1) != 0) {
    __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  }
  piVar4 = (int *)__errno();
  iVar1 = *piVar4;
  *piVar4 = 0;
                    /* try { // try from 00bc8a9c to 00bc8aa7 has its CatchHandler @ 00bc8b94 */
  dVar6 = wcstold((wchar_t *)__nptr,&local_50);
  iVar2 = *piVar4;
  *piVar4 = iVar1;
  if (iVar2 == 0x22) {
    uStack_34 = 0;
    local_48 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x26;
    local_47 = 0x6c6f7473;
    local_43 = 100;
    local_42 = 0x2074756f203a;
    uStack_3c = 0x6f;
    uStack_3b = 0x66;
    uStack_3a = 0x7220;
    local_38 = 0x65676e61;
                    /* try { // try from 00bc8b34 to 00bc8b3b has its CatchHandler @ 00bc8b84 */
                    /* WARNING: Subroutine does not return */
    FUN_0080c8d0((ulong)&local_48 | 1);
  }
  if ((long)local_50 - (long)__nptr == 0) {
    local_48 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x28;
    local_47 = 0x6c6f7473;
    local_43 = 100;
    local_42 = 0x63206f6e203a;
    uStack_3c = 0x6f;
    uStack_3b = 0x6e;
    uStack_3a = 0x6576;
    local_38 = 0x6f697372;
    uStack_34 = 0x6e;
                    /* try { // try from 00bc8b78 to 00bc8b7f has its CatchHandler @ 00bc8b80 */
    uVar5 = FUN_00bcab04((ulong)&local_48 | 1);
                    /* catch() { ... } // from try @ 00bc8b78 with catch @ 00bc8b80 */
                    /* catch() { ... } // from try @ 00bc8b34 with catch @ 00bc8b84 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_48);
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_68);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar5);
  }
  if (param_2 != (ulong *)0x0) {
    *param_2 = (long)local_50 - (long)__nptr >> 2;
  }
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
            (&local_68);
  auVar3._8_8_ = extraout_var;
  auVar3._0_8_ = dVar6;
  return auVar3;
}

