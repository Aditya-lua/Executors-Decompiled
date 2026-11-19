/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc7ca8
 */

/* std::__ndk1::stof(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned long*) */

float std::__ndk1::stof(basic_string_conflict *param_1,ulong *param_2)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  undefined8 uVar4;
  basic_string_conflict *__nptr;
  float fVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_70;
  undefined4 local_6f;
  undefined1 local_6b;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_58;
  undefined4 local_57;
  undefined6 local_53;
  undefined1 uStack_4d;
  undefined4 uStack_4c;
  undefined4 local_48;
  undefined4 uStack_44;
  char *local_38;
  
  local_70 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x8;
  local_6b = 0;
  local_6f = 0x666f7473;
  __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  local_38 = (char *)0x0;
  if (((byte)*param_1 & 1) == 0) {
    __nptr = param_1 + 1;
  }
  piVar3 = (int *)__errno();
  iVar1 = *piVar3;
  *piVar3 = 0;
  fVar5 = strtof((char *)__nptr,&local_38);
  iVar2 = *piVar3;
  *piVar3 = iVar1;
  if (iVar2 == 0x22) {
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x24;
    uStack_44 = 0;
    local_57 = local_6f;
    local_53 = 0x2074756f203a;
    uStack_4d = 0x6f;
    uStack_4c = 0x61722066;
    local_48 = 0x65676e;
                    /* try { // try from 00bc7d90 to 00bc7d97 has its CatchHandler @ 00bc7dd4 */
                    /* WARNING: Subroutine does not return */
    FUN_0080c8d0((ulong)&local_58 | 1);
  }
  if ((long)local_38 - (long)__nptr == 0) {
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x26;
    uStack_44 = 0;
    local_57 = local_6f;
    local_53 = 0x63206f6e203a;
    uStack_4d = 0x6f;
    uStack_4c = 0x7265766e;
    local_48 = 0x6e6f6973;
                    /* try { // try from 00bc7dc8 to 00bc7dcf has its CatchHandler @ 00bc7dd0 */
    uVar4 = FUN_00bcab04((ulong)&local_58 | 1);
                    /* catch() { ... } // from try @ 00bc7dc8 with catch @ 00bc7dd0 */
                    /* catch() { ... } // from try @ 00bc7d90 with catch @ 00bc7dd4 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_58);
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_70);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar4);
  }
  if (param_2 != (ulong *)0x0) {
    *param_2 = (long)local_38 - (long)__nptr;
  }
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
            (&local_70);
  return fVar5;
}

