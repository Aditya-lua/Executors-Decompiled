/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bca228
 */

/* std::__ndk1::to_string(float) */

void __thiscall std::__ndk1::to_string(__ndk1 *this,float param_1)

{
  uint uVar1;
  ulong *in_x8;
  ulong uVar2;
  char *pcVar3;
  char *pcVar4;
  ulong uVar5;
  ulong local_58;
  ulong uStack_50;
  char *local_48;
  
  local_58 = 0;
  uStack_50 = 0;
  local_48 = (char *)0x0;
                    /* try { // try from 00bca258 to 00bca26b has its CatchHandler @ 00bca3ac */
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
            ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_58,0x16,'\0');
  pcVar4 = (char *)((ulong)&local_58 | 1);
  uVar5 = (ulong)((byte)local_58._0_1_ >> 1);
  if ((local_58 & 1) != 0) {
    uVar5 = uStack_50;
  }
  do {
    pcVar3 = pcVar4;
    if (((byte)local_58._0_1_ & 1) != 0) {
      pcVar3 = local_48;
    }
    uVar1 = snprintf(pcVar3,uVar5 + 1,"%f",(double)param_1);
    if ((int)uVar1 < 0) {
      uVar2 = uVar5 << 1 | 1;
    }
    else {
      uVar2 = (ulong)uVar1;
      if (uVar2 <= uVar5) {
        uVar5 = (ulong)((byte)local_58._0_1_ >> 1);
        if ((local_58 & 1) != 0) {
          uVar5 = uStack_50;
        }
        if (uVar2 < uVar5 || uVar2 - uVar5 == 0) {
          if ((local_58 & 1) == 0) {
            local_58 = CONCAT71(local_58._1_7_,(char)(uVar1 << 1));
          }
          else {
            pcVar4 = local_48;
            uStack_50 = uVar2;
          }
          pcVar4[uVar2] = '\0';
        }
        else {
                    /* try { // try from 00bca33c to 00bca347 has its CatchHandler @ 00bca3a8 */
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)&local_58,uVar2 - uVar5,'\0');
        }
        pcVar4 = local_48;
        uVar5 = uStack_50;
        uStack_50 = 0;
        local_48 = (char *)0x0;
        in_x8[1] = uVar5;
        *in_x8 = local_58;
        in_x8[2] = (ulong)pcVar4;
        local_58 = 0;
        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
        ~basic_string((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_58);
        return;
      }
    }
    uVar5 = (ulong)((byte)local_58._0_1_ >> 1);
    if ((local_58 & 1) != 0) {
      uVar5 = uStack_50;
    }
    if (uVar2 < uVar5 || uVar2 - uVar5 == 0) {
      if ((local_58 & 1) == 0) {
        local_58 = CONCAT71(local_58._1_7_,(char)((int)uVar2 << 1));
        pcVar3 = pcVar4;
      }
      else {
        pcVar3 = local_48;
        uStack_50 = uVar2;
      }
      pcVar3[uVar2] = '\0';
    }
    else {
                    /* try { // try from 00bca298 to 00bca2a3 has its CatchHandler @ 00bca3b0 */
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_58,uVar2 - uVar5,'\0');
    }
    uVar5 = uVar2;
  } while( true );
}

