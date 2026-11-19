/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c000f4
 */

/* std::__ndk1::__codecvt_utf8<char16_t>::do_length(mbstate_t&, char const*, char const*, unsigned
   long) const */

int __thiscall
std::__ndk1::__codecvt_utf8<char16_t>::do_length
          (__codecvt_utf8<char16_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          ulong param_4)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  uint uVar8;
  
  iVar5 = (int)param_2;
  if ((((2 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x18) >> 2 & 1) != 0)) &&
      (*param_2 == -0x11)) && (param_2[1] == -0x45)) {
    lVar1 = 3;
    if (param_2[2] != -0x41) {
      lVar1 = 0;
    }
    param_2 = param_2 + lVar1;
  }
  if ((param_4 == 0) || (param_3 <= param_2)) {
LAB_00c00260:
    return (int)param_2 - iVar5;
  }
  uVar6 = *(ulong *)(this + 0x10);
  uVar7 = 1;
  do {
    bVar3 = *param_2;
    if ((char)bVar3 < '\0') {
      if (bVar3 < 0xc2) goto LAB_00c00260;
      uVar8 = (uint)bVar3;
      if (bVar3 < 0xe0) {
        if ((((long)param_3 - (long)param_2 < 2) || (((byte)param_2[1] & 0xc0) != 0x80)) ||
           (uVar6 < ((byte)param_2[1] & 0x3f | (uVar8 & 0x1f) << 6))) goto LAB_00c00260;
        param_2 = param_2 + 2;
      }
      else {
        if ((0xef < bVar3) || ((long)param_3 - (long)param_2 < 3)) goto LAB_00c00260;
        bVar2 = param_2[1];
        if (bVar3 == 0xed) {
          if (-0x61 < (char)bVar2) goto LAB_00c00260;
        }
        else if (uVar8 == 0xe0) {
          if ((bVar2 & 0xe0) != 0xa0) goto LAB_00c00260;
        }
        else if (-0x41 < (char)bVar2) goto LAB_00c00260;
        if ((((byte)param_2[2] & 0xc0) != 0x80) ||
           (uVar6 < ((uVar8 & 0xf) << 0xc | (bVar2 & 0x3f) << 6 | (byte)param_2[2] & 0x3f)))
        goto LAB_00c00260;
        param_2 = param_2 + 3;
      }
    }
    else {
      if (uVar6 < bVar3) goto LAB_00c00260;
      param_2 = param_2 + 1;
    }
    if ((param_3 <= param_2) || (bVar4 = param_4 <= uVar7, uVar7 = uVar7 + 1, bVar4))
    goto LAB_00c00260;
  } while( true );
}

