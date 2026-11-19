/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c00fdc
 */

/* std::__ndk1::__codecvt_utf16<char32_t, false>::do_length(mbstate_t&, char const*, char const*,
   unsigned long) const */

int __thiscall
std::__ndk1::__codecvt_utf16<char32_t,false>::do_length
          (__codecvt_utf16<char32_t,false> *this,mbstate_t *param_1,char *param_2,char *param_3,
          ulong param_4)

{
  byte bVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  
  iVar4 = (int)param_2;
  if (((1 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x18) >> 2 & 1) != 0)) &&
     (*param_2 == -2)) {
    param_2 = param_2 + (ulong)(param_2[1] == -1) * 2;
  }
  if ((param_4 == 0) || (param_3 + -1 <= param_2)) {
LAB_00c010c8:
    return (int)param_2 - iVar4;
  }
  uVar5 = *(ulong *)(this + 0x10);
  uVar6 = 1;
  do {
    bVar1 = *param_2;
    uVar2 = bVar1 & 0xfc;
    if (uVar2 == 0xd8) {
      if ((((long)param_3 - (long)param_2 < 4) || (((byte)param_2[2] & 0xfc) != 0xdc)) ||
         (uVar5 < ((uint)(byte)param_2[3] | ((byte)param_2[2] & 3) << 8 |
                  ((uint)(byte)param_2[1] | (bVar1 & 3) << 8) << 10) + 0x10000)) goto LAB_00c010c8;
      param_2 = param_2 + 4;
    }
    else if ((uVar2 == 0xdc) ||
            (bVar3 = CONCAT11(bVar1,param_2[1]) <= uVar5, param_2 = param_2 + (ulong)bVar3 * 2,
            !bVar3)) goto LAB_00c010c8;
    if ((param_3 + -1 <= param_2) || (bVar3 = param_4 <= uVar6, uVar6 = uVar6 + 1, bVar3))
    goto LAB_00c010c8;
  } while( true );
}

