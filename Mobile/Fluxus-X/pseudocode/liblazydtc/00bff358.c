/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff358
 */

/* std::__ndk1::codecvt<char32_t, char, mbstate_t>::do_out(mbstate_t&, char32_t const*, char32_t
   const*, char32_t const*&, char*, char*, char*&) const */

undefined8 __thiscall
std::__ndk1::codecvt<char32_t,char,mbstate_t>::do_out
          (codecvt<char32_t,char,mbstate_t> *this,mbstate_t *param_1,wchar32 *param_2,
          wchar32 *param_3,wchar32 **param_4,char *param_5,char *param_6,char **param_7)

{
  wchar32 wVar1;
  byte bVar2;
  undefined8 uVar3;
  byte *pbVar4;
  
  do {
    if (param_3 <= param_2) {
      uVar3 = 0;
LAB_00bff474:
      *param_4 = param_2;
      *param_7 = param_5;
      return uVar3;
    }
    wVar1 = *param_2;
    if (0x10 < (uint)wVar1 >> 0x10 || (wVar1 & 0xfffff800U) == 0xd800) {
      uVar3 = 2;
      goto LAB_00bff474;
    }
    bVar2 = (byte)wVar1;
    if ((uint)wVar1 < 0x80) {
      if ((long)param_6 - (long)param_5 < 1) goto LAB_00bff470;
      pbVar4 = (byte *)(param_5 + 1);
      *param_5 = bVar2;
    }
    else if ((uint)wVar1 < 0x800) {
      if ((long)param_6 - (long)param_5 < 2) goto LAB_00bff470;
      pbVar4 = (byte *)(param_5 + 2);
      *param_5 = (byte)((uint)wVar1 >> 6) | 0xc0;
      param_5[1] = bVar2 & 0x3f | 0x80;
    }
    else if ((uint)wVar1 >> 0x10 == 0) {
      if ((long)param_6 - (long)param_5 < 3) goto LAB_00bff470;
      pbVar4 = (byte *)(param_5 + 3);
      *param_5 = (byte)((uint)wVar1 >> 0xc) | 0xe0;
      param_5[1] = (byte)((uint)wVar1 >> 6) & 0x3f | 0x80;
      param_5[2] = bVar2 & 0x3f | 0x80;
    }
    else {
      if ((long)param_6 - (long)param_5 < 4) {
LAB_00bff470:
        uVar3 = 1;
        goto LAB_00bff474;
      }
      pbVar4 = (byte *)(param_5 + 4);
      *param_5 = (byte)((uint)wVar1 >> 0x12) | 0xf0;
      param_5[1] = (byte)((uint)wVar1 >> 0xc) & 0x3f | 0x80;
      param_5[2] = (byte)((uint)wVar1 >> 6) & 0x3f | 0x80;
      param_5[3] = bVar2 & 0x3f | 0x80;
    }
    param_2 = param_2 + 1;
    param_5 = (char *)pbVar4;
  } while( true );
}

