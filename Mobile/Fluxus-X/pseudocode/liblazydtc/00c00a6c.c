/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c00a6c
 */

/* std::__ndk1::__codecvt_utf16<char16_t, false>::do_in(mbstate_t&, char const*, char const*, char
   const*&, char16_t*, char16_t*, char16_t*&) const */

undefined1 __thiscall
std::__ndk1::__codecvt_utf16<char16_t,false>::do_in
          (__codecvt_utf16<char16_t,false> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4,wchar16 *param_5,wchar16 *param_6,wchar16 **param_7)

{
  wchar16 wVar1;
  undefined1 uVar2;
  wchar16 *pwVar3;
  ulong uVar4;
  
  if (((1 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x18) >> 2 & 1) != 0)) &&
     (*param_2 == -2)) {
    param_2 = param_2 + (ulong)(param_2[1] == -1) * 2;
  }
  if (param_2 < param_3 + -1) {
    uVar4 = *(ulong *)(this + 0x10);
    uVar2 = 2;
    pwVar3 = param_5;
    while (param_5 = pwVar3, pwVar3 < param_6) {
      if (((*param_2 & 0xf8U) == 0xd8) ||
         (wVar1 = CONCAT11(*param_2,param_2[1]), uVar4 < (ushort)wVar1)) goto LAB_00c00af4;
      param_2 = param_2 + 2;
      param_5 = pwVar3 + 1;
      *pwVar3 = wVar1;
      pwVar3 = param_5;
      if (param_3 + -1 <= param_2) break;
    }
  }
  uVar2 = param_2 < param_3;
LAB_00c00af4:
  *param_4 = param_2;
  *param_7 = param_5;
  return uVar2;
}

