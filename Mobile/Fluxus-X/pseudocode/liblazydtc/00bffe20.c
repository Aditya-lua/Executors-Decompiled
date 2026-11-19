/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bffe20
 */

/* std::__ndk1::__codecvt_utf8<char16_t>::do_out(mbstate_t&, char16_t const*, char16_t const*,
   char16_t const*&, char*, char*, char*&) const */

undefined8 __thiscall
std::__ndk1::__codecvt_utf8<char16_t>::do_out
          (__codecvt_utf8<char16_t> *this,mbstate_t *param_1,wchar16 *param_2,wchar16 *param_3,
          wchar16 **param_4,char *param_5,char *param_6,char **param_7)

{
  wchar16 wVar1;
  byte bVar2;
  undefined8 uVar3;
  byte *pbVar4;
  ulong uVar5;
  
  uVar5 = *(ulong *)(this + 0x10);
  if (((byte)this[0x18] >> 1 & 1) != 0) {
    if ((long)param_6 - (long)param_5 < 3) {
LAB_00bffe3c:
      uVar3 = 1;
      goto LAB_00bfff20;
    }
    param_5[0] = -0x11;
    param_5[1] = -0x45;
    param_5[2] = -0x41;
    param_5 = param_5 + 3;
  }
  for (; param_2 < param_3; param_2 = param_2 + 1) {
    wVar1 = *param_2;
    if ((wVar1 & 0xf800U) == 0xd800 || uVar5 < (ushort)wVar1) {
      uVar3 = 2;
      goto LAB_00bfff20;
    }
    bVar2 = (byte)wVar1;
    if ((ushort)wVar1 < 0x80) {
      if ((long)param_6 - (long)param_5 < 1) goto LAB_00bffe3c;
      pbVar4 = (byte *)(param_5 + 1);
      *param_5 = bVar2;
    }
    else if ((ushort)wVar1 < 0x800) {
      if ((long)param_6 - (long)param_5 < 2) goto LAB_00bffe3c;
      pbVar4 = (byte *)(param_5 + 2);
      *param_5 = (byte)((ushort)wVar1 >> 6) | 0xc0;
      param_5[1] = bVar2 & 0x3f | 0x80;
    }
    else {
      if ((long)param_6 - (long)param_5 < 3) goto LAB_00bffe3c;
      pbVar4 = (byte *)(param_5 + 3);
      *param_5 = (byte)((ushort)wVar1 >> 0xc) | 0xe0;
      param_5[1] = (byte)((ushort)wVar1 >> 6) & 0x3f | 0x80;
      param_5[2] = bVar2 & 0x3f | 0x80;
    }
    param_5 = (char *)pbVar4;
  }
  uVar3 = 0;
LAB_00bfff20:
  *param_4 = param_2;
  *param_7 = param_5;
  return uVar3;
}

