/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc860c
 */

/* std::__ndk1::stoull(std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> > const&, unsigned long*, int) */

ulonglong std::__ndk1::stoull(basic_string_conflict *param_1,ulong *param_2,int param_3)

{
  basic_string_conflict *__nptr;
  int iVar1;
  int iVar2;
  int *piVar3;
  ulonglong uVar4;
  undefined8 uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_70;
  undefined4 local_6f;
  undefined2 local_6b;
  undefined1 local_69;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_58;
  undefined4 local_57;
  undefined2 local_53;
  undefined6 local_51;
  undefined1 uStack_4b;
  undefined1 uStack_4a;
  undefined1 uStack_49;
  undefined5 local_48;
  undefined1 uStack_43;
  undefined2 uStack_42;
  wchar_t *local_28;
  
  local_70 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xc;
  local_6f = 0x756f7473;
  local_6b = 0x6c6c;
  local_69 = 0;
  local_28 = (wchar_t *)0x0;
  __nptr = param_1 + 4;
  if (((byte)*param_1 & 1) != 0) {
    __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  }
  piVar3 = (int *)__errno();
  iVar1 = *piVar3;
  *piVar3 = 0;
                    /* try { // try from 00bc8678 to 00bc8687 has its CatchHandler @ 00bc8778 */
  uVar4 = wcstoull((wchar_t *)__nptr,&local_28,param_3);
  iVar2 = *piVar3;
  *piVar3 = iVar1;
  if (iVar2 == 0x22) {
    uStack_43 = 0;
    uStack_42 = 0;
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x28;
    local_57 = 0x756f7473;
    local_53 = 0x6c6c;
    local_51 = 0x2074756f203a;
    uStack_4b = 0x6f;
    uStack_4a = 0x66;
    uStack_49 = 0x20;
    local_48 = 0x65676e6172;
                    /* try { // try from 00bc8718 to 00bc871f has its CatchHandler @ 00bc8768 */
                    /* WARNING: Subroutine does not return */
    FUN_0080c8d0((ulong)&local_58 | 1);
  }
  if ((long)local_28 - (long)__nptr == 0) {
    uStack_42 = 0;
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x2a;
    local_57 = 0x756f7473;
    local_53 = 0x6c6c;
    local_51 = 0x63206f6e203a;
    uStack_4b = 0x6f;
    uStack_4a = 0x6e;
    uStack_49 = 0x76;
    local_48 = 0x6f69737265;
    uStack_43 = 0x6e;
                    /* try { // try from 00bc875c to 00bc8763 has its CatchHandler @ 00bc8764 */
    uVar5 = FUN_00bcab04((ulong)&local_58 | 1);
                    /* catch() { ... } // from try @ 00bc875c with catch @ 00bc8764 */
                    /* catch() { ... } // from try @ 00bc8718 with catch @ 00bc8768 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_58);
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_70);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar5);
  }
  if (param_2 != (ulong *)0x0) {
    *param_2 = (long)local_28 - (long)__nptr >> 2;
  }
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
            (&local_70);
  return uVar4;
}

