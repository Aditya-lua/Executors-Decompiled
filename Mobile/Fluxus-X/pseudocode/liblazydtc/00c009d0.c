/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c009d0
 */

/* std::__ndk1::__codecvt_utf16<char16_t, false>::do_out(mbstate_t&, char16_t const*, char16_t
   const*, char16_t const*&, char*, char*, char*&) const */

undefined8 __thiscall
std::__ndk1::__codecvt_utf16<char16_t,false>::do_out
          (__codecvt_utf16<char16_t,false> *this,mbstate_t *param_1,wchar16 *param_2,
          wchar16 *param_3,wchar16 **param_4,char *param_5,char *param_6,char **param_7)

{
  char *pcVar1;
  wchar16 wVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  
  uVar4 = *(ulong *)(this + 0x10);
  if (((byte)this[0x18] >> 1 & 1) != 0) {
    if ((long)param_6 - (long)param_5 < 2) {
LAB_00c009ec:
      uVar3 = 1;
      goto LAB_00c00a60;
    }
    param_5[0] = -2;
    param_5[1] = -1;
    param_5 = param_5 + 2;
  }
  if (param_2 < param_3) {
    lVar5 = (long)param_6 - (long)param_5;
    do {
      wVar2 = *param_2;
      if ((wVar2 & 0xf800U) == 0xd800 || uVar4 < (ushort)wVar2) {
        uVar3 = 2;
        goto LAB_00c00a60;
      }
      if (lVar5 < 2) goto LAB_00c009ec;
      param_2 = param_2 + 1;
      pcVar1 = param_5 + 2;
      param_5[1] = (char)wVar2;
      *param_5 = (char)((ushort)wVar2 >> 8);
      param_5 = pcVar1;
      lVar5 = lVar5 + -2;
    } while (param_2 < param_3);
    uVar3 = 0;
  }
  else {
    uVar3 = 0;
  }
LAB_00c00a60:
  *param_4 = param_2;
  *param_7 = param_5;
  return uVar3;
}

