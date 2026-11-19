/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc8090
 */

/* std::__ndk1::stoi(std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> > const&, unsigned long*, int) */

ulong std::__ndk1::stoi(basic_string_conflict *param_1,ulong *param_2,int param_3)

{
  basic_string_conflict *__nptr;
  undefined4 *puVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  ulong uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_70;
  undefined4 local_6f;
  undefined1 local_6b;
  byte local_58;
  undefined4 local_57;
  undefined6 local_53;
  undefined2 uStack_4d;
  undefined3 uStack_4b;
  undefined3 local_48;
  undefined5 uStack_45;
  wchar_t *local_28;
  
  local_70 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x8;
  local_6f = 0x696f7473;
  local_6b = 0;
  local_28 = (wchar_t *)0x0;
  __nptr = param_1 + 4;
  if (((byte)*param_1 & 1) != 0) {
    __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  }
  piVar4 = (int *)__errno();
  iVar2 = *piVar4;
  *piVar4 = 0;
                    /* try { // try from 00bc80f4 to 00bc8103 has its CatchHandler @ 00bc81e0 */
  uVar5 = wcstol((wchar_t *)__nptr,&local_28,param_3);
  iVar3 = *piVar4;
  *piVar4 = iVar2;
  if (iVar3 == 0x22) {
                    /* try { // try from 00bc8160 to 00bc8177 has its CatchHandler @ 00bc81e0 */
    FUN_00bcab58(&local_58,&local_70,": out of range");
    puVar1 = (undefined4 *)CONCAT53(uStack_45,local_48);
    if ((local_58 & 1) == 0) {
      puVar1 = &local_57;
    }
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bc8188 to 00bc818b has its CatchHandler @ 00bc81cc */
    FUN_0080c8d0(puVar1);
  }
  if ((long)local_28 - (long)__nptr == 0) {
                    /* try { // try from 00bc818c to 00bc8193 has its CatchHandler @ 00bc81e0 */
    FUN_00bcaab4(&local_70);
  }
  else {
    if (param_2 != (ulong *)0x0) {
      *param_2 = (long)local_28 - (long)__nptr >> 2;
    }
    if (uVar5 == (long)(int)uVar5) {
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
                (&local_70);
      return uVar5 & 0xffffffff;
    }
  }
  local_58 = 0x24;
  uStack_45 = 0;
  local_57 = local_6f;
  local_53 = 0x2074756f203a;
  uStack_4d = 0x666f;
  uStack_4b = 0x617220;
  local_48 = 0x65676e;
                    /* try { // try from 00bc81c4 to 00bc81cb has its CatchHandler @ 00bc81d0 */
                    /* WARNING: Subroutine does not return */
  FUN_0080c8d0((ulong)&local_58 | 1);
}

