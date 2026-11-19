/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c00490
 */

/* std::__ndk1::__codecvt_utf16<wchar_t, false>::do_in(mbstate_t&, char const*, char const*, char
   const*&, wchar_t*, wchar_t*, wchar_t*&) const */

ulong __thiscall
std::__ndk1::__codecvt_utf16<wchar_t,false>::do_in
          (__codecvt_utf16<wchar_t,false> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4,wchar_t *param_5,wchar_t *param_6,wchar_t **param_7)

{
  byte bVar1;
  uint uVar2;
  ulong uVar3;
  wchar_t *pwVar4;
  ulong uVar5;
  wchar_t wVar6;
  
  if (((1 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x20) >> 2 & 1) != 0)) &&
     (*param_2 == -2)) {
    param_2 = param_2 + (ulong)(param_2[1] == -1) * 2;
  }
  if (param_2 < param_3 + -1) {
    uVar5 = *(ulong *)(this + 0x18);
    pwVar4 = param_5;
    do {
      param_5 = pwVar4;
      if (param_6 <= pwVar4) break;
      bVar1 = *param_2;
      wVar6 = (wchar_t)CONCAT11(bVar1,param_2[1]);
      uVar2 = bVar1 & 0xfc;
      if (uVar2 == 0xd8) {
        if ((long)param_3 - (long)param_2 < 4) {
          uVar3 = 1;
          goto LAB_00c00570;
        }
        if ((((byte)param_2[2] & 0xfc) != 0xdc) ||
           (wVar6 = ((uint)(byte)param_2[3] | ((byte)param_2[2] & 3) << 8 |
                    ((uint)(byte)param_2[1] | (bVar1 & 3) << 8) << 10) + L'𐀀',
           uVar5 < (uint)wVar6)) goto LAB_00c0057c;
        uVar3 = 4;
      }
      else {
        if (uVar2 == 0xdc) {
LAB_00c0057c:
          uVar3 = 2;
          goto LAB_00c00570;
        }
        uVar3 = 2;
        if (uVar5 < (uint)wVar6) goto LAB_00c00570;
      }
      param_2 = param_2 + uVar3;
      param_5 = pwVar4 + 1;
      *pwVar4 = wVar6;
      pwVar4 = param_5;
    } while (param_2 < param_3 + -1);
  }
  uVar3 = (ulong)(param_2 < param_3);
  pwVar4 = param_5;
LAB_00c00570:
  *param_4 = param_2;
  *param_7 = pwVar4;
  return uVar3;
}

