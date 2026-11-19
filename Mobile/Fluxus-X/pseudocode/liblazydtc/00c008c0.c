/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c008c0
 */

/* std::__ndk1::__codecvt_utf16<wchar_t, true>::do_length(mbstate_t&, char const*, char const*,
   unsigned long) const */

int __thiscall
std::__ndk1::__codecvt_utf16<wchar_t,true>::do_length
          (__codecvt_utf16<wchar_t,true> *this,mbstate_t *param_1,char *param_2,char *param_3,
          ulong param_4)

{
  ushort uVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  
  iVar4 = (int)param_2;
  if (((1 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x20) >> 2 & 1) != 0)) &&
     (*param_2 == -1)) {
    param_2 = param_2 + (ulong)(param_2[1] == -2) * 2;
  }
  if ((param_4 == 0) || (param_3 + -1 <= param_2)) {
LAB_00c009ac:
    return (int)param_2 - iVar4;
  }
  uVar5 = *(ulong *)(this + 0x18);
  uVar6 = 1;
  do {
    uVar1 = *(ushort *)param_2;
    uVar2 = *(byte *)((long)param_2 + 1) & 0xfc;
    if (uVar2 == 0xd8) {
      if ((((long)param_3 - (long)param_2 < 4) || ((*(byte *)((long)param_2 + 3) & 0xfc) != 0xdc))
         || (uVar5 < ((uint)(byte)*(ushort *)((long)param_2 + 2) |
                      (*(byte *)((long)param_2 + 3) & 3) << 8 |
                     ((uint)(byte)*(ushort *)param_2 | (*(byte *)((long)param_2 + 1) & 3) << 8) <<
                     10) + 0x10000)) goto LAB_00c009ac;
      param_2 = (char *)((long)param_2 + 4);
    }
    else if ((uVar2 == 0xdc) ||
            (param_2 = (char *)((long)param_2 + (ulong)(uVar1 <= uVar5) * 2), uVar1 > uVar5))
    goto LAB_00c009ac;
    if ((param_3 + -1 <= param_2) || (bVar3 = param_4 <= uVar6, uVar6 = uVar6 + 1, bVar3))
    goto LAB_00c009ac;
  } while( true );
}

