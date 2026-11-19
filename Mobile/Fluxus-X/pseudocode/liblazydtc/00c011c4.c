/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c011c4
 */

/* std::__ndk1::__codecvt_utf16<char32_t, true>::do_in(mbstate_t&, char const*, char const*, char
   const*&, char32_t*, char32_t*, char32_t*&) const */

ulong __thiscall
std::__ndk1::__codecvt_utf16<char32_t,true>::do_in
          (__codecvt_utf16<char32_t,true> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4,wchar32 *param_5,wchar32 *param_6,wchar32 **param_7)

{
  uint uVar1;
  ulong uVar2;
  wchar32 *pwVar3;
  ulong uVar4;
  wchar32 wVar5;
  
  if (((1 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x18) >> 2 & 1) != 0)) &&
     (*param_2 == -1)) {
    param_2 = param_2 + (ulong)(param_2[1] == -2) * 2;
  }
  if (param_2 < param_3 + -1) {
    uVar4 = *(ulong *)(this + 0x10);
    pwVar3 = param_5;
    do {
      param_5 = pwVar3;
      if (param_6 <= pwVar3) break;
      wVar5 = (wchar32)*(ushort *)param_2;
      uVar1 = *(byte *)((long)param_2 + 1) & 0xfc;
      if (uVar1 == 0xd8) {
        if ((long)param_3 - (long)param_2 < 4) {
          uVar2 = 1;
          goto LAB_00c012a4;
        }
        if (((*(byte *)((long)param_2 + 3) & 0xfc) != 0xdc) ||
           (wVar5 = ((uint)(byte)*(ushort *)((long)param_2 + 2) |
                     (*(byte *)((long)param_2 + 3) & 3) << 8 |
                    ((uint)(byte)*(ushort *)param_2 | (*(byte *)((long)param_2 + 1) & 3) << 8) << 10
                    ) + L'𐀀', uVar4 < (uint)wVar5)) goto LAB_00c012b0;
        uVar2 = 4;
      }
      else {
        if (uVar1 == 0xdc) {
LAB_00c012b0:
          uVar2 = 2;
          goto LAB_00c012a4;
        }
        uVar2 = 2;
        if (uVar4 < (uint)wVar5) goto LAB_00c012a4;
      }
      param_2 = (char *)((long)param_2 + uVar2);
      param_5 = pwVar3 + 1;
      *pwVar3 = wVar5;
      pwVar3 = param_5;
    } while (param_2 < param_3 + -1);
  }
  uVar2 = (ulong)(param_2 < param_3);
  pwVar3 = param_5;
LAB_00c012a4:
  *param_4 = param_2;
  *param_7 = pwVar3;
  return uVar2;
}

