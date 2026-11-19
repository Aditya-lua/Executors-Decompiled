/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c00d30
 */

/* std::__ndk1::__codecvt_utf16<char16_t, true>::do_length(mbstate_t&, char const*, char const*,
   unsigned long) const */

int __thiscall
std::__ndk1::__codecvt_utf16<char16_t,true>::do_length
          (__codecvt_utf16<char16_t,true> *this,mbstate_t *param_1,char *param_2,char *param_3,
          ulong param_4)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  
  iVar3 = (int)param_2;
  if (((1 < (long)param_3 - (long)param_2) && ((*(uint *)(this + 0x18) >> 2 & 1) != 0)) &&
     (*param_2 == -1)) {
    param_2 = param_2 + (ulong)(param_2[1] == -2) * 2;
  }
  if ((param_4 != 0) && (param_2 < param_3 + -1)) {
    uVar4 = 1;
    do {
      if ((param_2[1] & 0xf8U) == 0xd8) break;
      bVar1 = (ulong)CONCAT11(param_2[1],*param_2) <= *(ulong *)(this + 0x10);
      param_2 = param_2 + (ulong)bVar1 * 2;
      bVar2 = uVar4 < param_4;
      uVar4 = uVar4 + 1;
    } while ((bVar1 && param_2 < param_3 + -1) && bVar2);
  }
  return (int)param_2 - iVar3;
}

