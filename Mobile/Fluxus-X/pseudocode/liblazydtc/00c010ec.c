/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c010ec
 */

/* std::__ndk1::__codecvt_utf16<char32_t, true>::do_out(mbstate_t&, char32_t const*, char32_t
   const*, char32_t const*&, char*, char*, char*&) const */

undefined8 __thiscall
std::__ndk1::__codecvt_utf16<char32_t,true>::do_out
          (__codecvt_utf16<char32_t,true> *this,mbstate_t *param_1,wchar32 *param_2,wchar32 *param_3
          ,wchar32 **param_4,char *param_5,char *param_6,char **param_7)

{
  int iVar1;
  byte bVar2;
  wchar32 wVar3;
  undefined8 uVar4;
  byte *pbVar5;
  ulong uVar6;
  
  uVar6 = *(ulong *)(this + 0x10);
  if (((byte)this[0x18] >> 1 & 1) != 0) {
    if ((long)param_6 - (long)param_5 < 2) {
LAB_00c01108:
      uVar4 = 1;
      goto LAB_00c011b8;
    }
    param_5[0] = -1;
    param_5[1] = -2;
    param_5 = param_5 + 2;
  }
  for (; param_2 < param_3; param_2 = param_2 + 1) {
    wVar3 = *param_2;
    if ((uint)wVar3 >> 0xb == 0x1b || uVar6 < (uint)wVar3) {
      uVar4 = 2;
      goto LAB_00c011b8;
    }
    bVar2 = (byte)((uint)wVar3 >> 8);
    if ((wVar3 & 0xffff0000U) == 0) {
      if ((long)param_6 - (long)param_5 < 2) goto LAB_00c01108;
      pbVar5 = (byte *)(param_5 + 1);
      *param_5 = (byte)wVar3;
    }
    else {
      if ((long)param_6 - (long)param_5 < 4) goto LAB_00c01108;
      param_5[2] = (byte)wVar3;
      iVar1 = ((uint)wVar3 >> 10 & 0x7c0) + 0x3fc0;
      bVar2 = bVar2 & 3 | 0xdc;
      *param_5 = (byte)iVar1 | (byte)((uint)wVar3 >> 10) & 0x3f;
      pbVar5 = (byte *)(param_5 + 3);
      param_5[1] = (byte)((uint)iVar1 >> 8) | 0xd8;
    }
    *pbVar5 = bVar2;
    param_5 = (char *)(pbVar5 + 1);
  }
  uVar4 = 0;
LAB_00c011b8:
  *param_4 = param_2;
  *param_7 = param_5;
  return uVar4;
}

