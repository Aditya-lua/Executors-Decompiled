/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c003b8
 */

/* std::__ndk1::__codecvt_utf16<wchar_t, false>::do_out(mbstate_t&, wchar_t const*, wchar_t const*,
   wchar_t const*&, char*, char*, char*&) const */

undefined8 __thiscall
std::__ndk1::__codecvt_utf16<wchar_t,false>::do_out
          (__codecvt_utf16<wchar_t,false> *this,mbstate_t *param_1,wchar_t *param_2,wchar_t *param_3
          ,wchar_t **param_4,char *param_5,char *param_6,char **param_7)

{
  int iVar1;
  wchar_t wVar2;
  byte bVar3;
  undefined8 uVar4;
  byte *pbVar5;
  ulong uVar6;
  
  uVar6 = *(ulong *)(this + 0x18);
  if (((byte)this[0x20] >> 1 & 1) != 0) {
    if ((long)param_6 - (long)param_5 < 2) {
LAB_00c003d4:
      uVar4 = 1;
      goto LAB_00c00484;
    }
    param_5[0] = -2;
    param_5[1] = -1;
    param_5 = param_5 + 2;
  }
  for (; param_2 < param_3; param_2 = param_2 + 1) {
    wVar2 = *param_2;
    if ((uint)wVar2 >> 0xb == 0x1b || uVar6 < (uint)wVar2) {
      uVar4 = 2;
      goto LAB_00c00484;
    }
    bVar3 = (byte)((uint)wVar2 >> 8);
    if ((uint)wVar2 >> 0x10 == 0) {
      if ((long)param_6 - (long)param_5 < 2) goto LAB_00c003d4;
      pbVar5 = (byte *)(param_5 + 1);
      *param_5 = bVar3;
    }
    else {
      if ((long)param_6 - (long)param_5 < 4) goto LAB_00c003d4;
      iVar1 = ((uint)wVar2 >> 10 & 0x7c0) + 0x3fc0;
      param_5[2] = bVar3 & 3 | 0xdc;
      param_5[1] = (byte)iVar1 | (byte)((uint)wVar2 >> 10) & 0x3f;
      pbVar5 = (byte *)(param_5 + 3);
      *param_5 = (byte)((uint)iVar1 >> 8) | 0xd8;
    }
    *pbVar5 = (byte)wVar2;
    param_5 = (char *)(pbVar5 + 1);
  }
  uVar4 = 0;
LAB_00c00484:
  *param_4 = param_2;
  *param_7 = param_5;
  return uVar4;
}

