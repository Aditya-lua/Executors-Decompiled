/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941774
 */

bool curl_strnequal(byte *param_1,byte *param_2,long param_3)

{
  ulong uVar1;
  
  if ((param_1 == (byte *)0x0) || (param_2 == (byte *)0x0)) {
    return (param_1 == (byte *)0x0 && param_2 == (byte *)0x0) && param_3 != 0;
  }
  uVar1 = (ulong)*param_1;
  if (*param_1 != 0) {
    do {
      param_1 = param_1 + 1;
      if ((param_3 == 0) || (*param_2 == 0)) break;
      if ((&DAT_007483d4)[uVar1] != (&DAT_007483d4)[*param_2]) {
        return false;
      }
      uVar1 = (ulong)*param_1;
      param_3 = param_3 + -1;
      param_2 = param_2 + 1;
    } while (*param_1 != 0);
  }
  if (param_3 == 0) {
    return true;
  }
  return (&DAT_007483d4)[uVar1] == (&DAT_007483d4)[*param_2];
}

