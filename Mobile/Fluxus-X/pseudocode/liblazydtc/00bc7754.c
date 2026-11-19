/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc7754
 */

/* std::__ndk1::stol(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned long*, int) */

long std::__ndk1::stol(basic_string_conflict *param_1,ulong *param_2,int param_3)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  long lVar4;
  undefined8 uVar5;
  basic_string_conflict *__nptr;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_70;
  undefined4 local_6f;
  undefined1 local_6b;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_58;
  undefined1 auStack_57 [15];
  undefined1 *local_48;
  char *local_28;
  
  local_70 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x8;
  local_6b = 0;
  local_6f = 0x6c6f7473;
  __nptr = *(basic_string_conflict **)(param_1 + 0x10);
  local_28 = (char *)0x0;
  if (((byte)*param_1 & 1) == 0) {
    __nptr = param_1 + 1;
  }
  piVar3 = (int *)__errno();
  iVar1 = *piVar3;
  *piVar3 = 0;
  lVar4 = strtol((char *)__nptr,&local_28,param_3);
  iVar2 = *piVar3;
  *piVar3 = iVar1;
  if (iVar2 == 0x22) {
                    /* try { // try from 00bc7814 to 00bc782b has its CatchHandler @ 00bc7858 */
    FUN_00bcab58(&local_58,&local_70,": out of range");
    if (((byte)local_58 & 1) == 0) {
      local_48 = auStack_57;
    }
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bc783c to 00bc783f has its CatchHandler @ 00bc7848 */
    FUN_0080c8d0(local_48);
  }
  if ((long)local_28 - (long)__nptr == 0) {
                    /* try { // try from 00bc7840 to 00bc7847 has its CatchHandler @ 00bc7858 */
    uVar5 = FUN_00bcaab4(&local_70);
                    /* catch() { ... } // from try @ 00bc783c with catch @ 00bc7848 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_58);
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
              (&local_70);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar5);
  }
  if (param_2 != (ulong *)0x0) {
    *param_2 = (long)local_28 - (long)__nptr;
  }
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string
            (&local_70);
  return lVar4;
}

