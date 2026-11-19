/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bca6ec
 */

/* std::__ndk1::to_wstring(float) */

void __thiscall std::__ndk1::to_wstring(__ndk1 *this,float param_1)

{
  wchar_t *pwVar1;
  uint uVar2;
  ulong uVar3;
  ulong *in_x8;
  ulong uVar4;
  ulong local_60;
  ulong uStack_58;
  wchar_t *local_50;
  
  local_50 = operator_new(0x58);
  local_50[0x14] = L'\0';
  uStack_58 = 0x14;
  local_60 = 0x17;
  local_50[2] = L'\0';
  local_50[3] = L'\0';
  local_50[0] = L'\0';
  local_50[1] = L'\0';
  local_50[6] = L'\0';
  local_50[7] = L'\0';
  local_50[4] = L'\0';
  local_50[5] = L'\0';
  local_50[10] = L'\0';
  local_50[0xb] = L'\0';
  local_50[8] = L'\0';
  local_50[9] = L'\0';
  local_50[0xe] = L'\0';
  local_50[0xf] = L'\0';
  local_50[0xc] = L'\0';
  local_50[0xd] = L'\0';
  local_50[0x12] = L'\0';
  local_50[0x13] = L'\0';
  local_50[0x10] = L'\0';
  local_50[0x11] = L'\0';
                    /* try { // try from 00bca740 to 00bca753 has its CatchHandler @ 00bca81c */
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::resize
            ((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
              *)&local_60,0x15,L'\0');
  uVar4 = (ulong)((byte)local_60._0_1_ >> 1);
  if ((local_60 & 1) != 0) {
    uVar4 = uStack_58;
  }
  do {
    pwVar1 = (wchar_t *)((ulong)&local_60 | 4);
    if (((byte)local_60._0_1_ & 1) != 0) {
      pwVar1 = local_50;
    }
                    /* try { // try from 00bca788 to 00bca7c3 has its CatchHandler @ 00bca820 */
    uVar2 = swprintf(pwVar1,uVar4 + 1,L"%f",(double)param_1);
    if ((int)uVar2 < 0) {
      uVar3 = uVar4 << 1 | 1;
    }
    else {
      uVar3 = (ulong)uVar2;
      if (uVar3 <= uVar4) {
                    /* try { // try from 00bca7cc to 00bca7d7 has its CatchHandler @ 00bca818 */
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        resize((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                *)&local_60,uVar3,L'\0');
        pwVar1 = local_50;
        uVar4 = uStack_58;
        uStack_58 = 0;
        local_50 = (wchar_t *)0x0;
        in_x8[1] = uVar4;
        *in_x8 = local_60;
        in_x8[2] = (ulong)pwVar1;
        local_60 = 0;
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        ~basic_string((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                       *)&local_60);
        return;
      }
    }
    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::resize
              ((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                *)&local_60,uVar3,L'\0');
    uVar4 = uVar3;
  } while( true );
}

