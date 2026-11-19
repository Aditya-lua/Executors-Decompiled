/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc786c
 */

/* std::__ndk1::stoul(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned long*, int) */

ulong std::__ndk1::stoul(basic_string_conflict *param_1,ulong *param_2,int param_3)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  ulong uVar4;
  undefined8 uVar5;
  basic_string_conflict *__nptr;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_80;
  undefined4 local_7f;
  undefined2 local_7b;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_68;
  undefined4 local_67;
  undefined1 local_63;
  undefined6 local_62;
  undefined1 uStack_5c;
  undefined1 uStack_5b;
  undefined2 uStack_5a;
  undefined4 local_58;
  undefined4 uStack_54;
  char *local_38;
  
  __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  local_80 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa;
  local_7f = 0x756f7473;
  local_7b = 0x6c;
  if (((byte)*param_1 & 1) == 0) {
    __nptr = param_1 + 1;
  }
  local_38 = (char *)0x0;
  piVar3 = (int *)__errno();
  iVar1 = *piVar3;
  *piVar3 = 0;
  uVar4 = strtoul((char *)__nptr,&local_38,param_3);
  iVar2 = *piVar3;
  *piVar3 = iVar1;
  if (iVar2 == 0x22) {
    uStack_54 = 0;
    local_68 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x26;
    local_67 = 0x756f7473;
    local_63 = 0x6c;
    local_62 = 0x2074756f203a;
    uStack_5c = 0x6f;
    uStack_5b = 0x66;
    uStack_5a = 0x7220;
    local_58 = 0x65676e61;
                    /* try { // try from 00bc7968 to 00bc796f has its CatchHandler @ 00bc79b8 */
                    /* WARNING: Subroutine does not return */
    FUN_0080c8d0((ulong)&local_68 | 1);
  }
  if ((long)local_38 - (long)__nptr == 0) {
    local_68 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x28;
    local_67 = 0x756f7473;
    local_63 = 0x6c;
    local_62 = 0x63206f6e203a;
    uStack_5c = 0x6f;
    uStack_5b = 0x6e;
    uStack_5a = 0x6576;
    local_58 = 0x6f697372;
    uStack_54 = 0x6e;
                    /* try { // try from 00bc79ac to 00bc79b3 has its CatchHandler @ 00bc79b4 */
    uVar5 = FUN_00bcab04((ulong)&local_68 | 1);
                    /* catch() { ... } // from try @ 00bc79ac with catch @ 00bc79b4 */
                    /* catch() { ... } // from try @ 00bc7968 with catch @ 00bc79b8 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_68);
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_80);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar5);
  }
  if (param_2 != (ulong *)0x0) {
    *param_2 = (long)local_38 - (long)__nptr;
  }
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
            (&local_80);
  return uVar4;
}

