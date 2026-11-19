/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfff2c
 */

/* std::__ndk1::__codecvt_utf8<char16_t>::do_in(mbstate_t&, char const*, char const*, char const*&,
   char16_t*, char16_t*, char16_t*&) const */

undefined8 __thiscall
std::__ndk1::__codecvt_utf8<char16_t>::do_in
          (__codecvt_utf8<char16_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4,wchar16 *param_5,wchar16 *param_6,wchar16 **param_7)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  uint uVar4;
  undefined8 uVar5;
  ulong uVar6;
  uint uVar7;
  long lVar8;
  wchar16 *pwVar9;
  
  if ((((2 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x18) >> 2 & 1) != 0)) &&
      (*param_2 == -0x11)) && (param_2[1] == -0x45)) {
    lVar8 = 3;
    if (param_2[2] != -0x41) {
      lVar8 = 0;
    }
    param_2 = param_2 + lVar8;
  }
  if (param_2 < param_3) {
    if (param_5 < param_6) {
      uVar6 = *(ulong *)(this + 0x10);
      do {
        bVar3 = *param_2;
        uVar7 = (uint)bVar3;
        if ((char)bVar3 < '\0') {
          if (0xc1 < uVar7) {
            if (uVar7 < 0xe0) {
              if ((long)param_3 - (long)param_2 < 2) goto LAB_00c000a8;
              if ((((byte)param_2[1] & 0xc0) == 0x80) &&
                 (uVar7 = (byte)param_2[1] & 0x3f | (uVar7 & 0x1f) << 6, uVar7 <= uVar6)) {
                lVar8 = 2;
                goto LAB_00c00074;
              }
            }
            else if (uVar7 < 0xf0) {
              if ((long)param_3 - (long)param_2 < 2) goto LAB_00c000a8;
              bVar3 = param_2[1];
              if (uVar7 == 0xed) {
                if ((char)bVar3 < -0x60) goto LAB_00c00040;
              }
              else if (uVar7 == 0xe0) {
                if ((bVar3 & 0xe0) == 0xa0) {
LAB_00c00040:
                  if ((long)param_3 - (long)param_2 == 2) goto LAB_00c000a8;
                  if ((((byte)param_2[2] & 0xc0) == 0x80) &&
                     (uVar4 = uVar7 << 0xc, uVar1 = (bVar3 & 0x3f) << 6,
                     uVar2 = (byte)param_2[2] & 0x3f, uVar7 = uVar4 | uVar1 | uVar2,
                     (uVar4 & 0xffff | uVar1 | uVar2) <= uVar6)) {
                    lVar8 = 3;
                    goto LAB_00c00074;
                  }
                }
              }
              else if ((char)bVar3 < -0x40) goto LAB_00c00040;
            }
          }
LAB_00c000b0:
          uVar5 = 2;
          goto LAB_00c000c0;
        }
        if (uVar6 < bVar3) goto LAB_00c000b0;
        lVar8 = 1;
LAB_00c00074:
        param_2 = param_2 + lVar8;
        pwVar9 = param_5 + 1;
        *param_5 = (wchar16)uVar7;
        if (param_3 <= param_2) {
          uVar5 = 0;
          param_5 = param_5 + 1;
          goto LAB_00c000c0;
        }
        param_5 = pwVar9;
      } while (pwVar9 < param_6);
      uVar5 = 1;
    }
    else {
LAB_00c000a8:
      uVar5 = 1;
    }
  }
  else {
    uVar5 = 0;
  }
LAB_00c000c0:
  *param_4 = param_2;
  *param_7 = param_5;
  return uVar5;
}

