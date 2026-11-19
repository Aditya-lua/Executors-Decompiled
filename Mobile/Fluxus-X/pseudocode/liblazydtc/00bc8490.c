/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc8490
 */

/* std::__ndk1::stoll(std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> > const&, unsigned long*, int) */

longlong std::__ndk1::stoll(basic_string_conflict *param_1,ulong *param_2,int param_3)

{
  basic_string_conflict *__nptr;
  int iVar1;
  int iVar2;
  int *piVar3;
  longlong lVar4;
  undefined8 uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_70;
  undefined4 local_6f;
  undefined2 local_6b;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_58;
  undefined4 local_57;
  undefined1 local_53;
  undefined6 local_52;
  undefined1 uStack_4c;
  undefined1 uStack_4b;
  undefined2 uStack_4a;
  undefined4 local_48;
  undefined4 uStack_44;
  wchar_t *local_28;
  
  local_70 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa;
  local_6f = 0x6c6f7473;
  local_6b = 0x6c;
  local_28 = (wchar_t *)0x0;
  __nptr = param_1 + 4;
  if (((byte)*param_1 & 1) != 0) {
    __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  }
  piVar3 = (int *)__errno();
  iVar1 = *piVar3;
  *piVar3 = 0;
                    /* try { // try from 00bc84f8 to 00bc8507 has its CatchHandler @ 00bc85f8 */
  lVar4 = wcstoll((wchar_t *)__nptr,&local_28,param_3);
  iVar2 = *piVar3;
  *piVar3 = iVar1;
  if (iVar2 == 0x22) {
    uStack_44 = 0;
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x26;
    local_57 = 0x6c6f7473;
    local_53 = 0x6c;
    local_52 = 0x2074756f203a;
    uStack_4c = 0x6f;
    uStack_4b = 0x66;
    uStack_4a = 0x7220;
    local_48 = 0x65676e61;
                    /* try { // try from 00bc8598 to 00bc859f has its CatchHandler @ 00bc85e8 */
                    /* WARNING: Subroutine does not return */
    FUN_0080c8d0((ulong)&local_58 | 1);
  }
  if ((long)local_28 - (long)__nptr == 0) {
    local_58 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x28;
    local_57 = 0x6c6f7473;
    local_53 = 0x6c;
    local_52 = 0x63206f6e203a;
    uStack_4c = 0x6f;
    uStack_4b = 0x6e;
    uStack_4a = 0x6576;
    local_48 = 0x6f697372;
    uStack_44 = 0x6e;
                    /* try { // try from 00bc85dc to 00bc85e3 has its CatchHandler @ 00bc85e4 */
    uVar5 = FUN_00bcab04((ulong)&local_58 | 1);
                    /* catch() { ... } // from try @ 00bc85dc with catch @ 00bc85e4 */
                    /* catch() { ... } // from try @ 00bc8598 with catch @ 00bc85e8 */
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
  return lVar4;
}

