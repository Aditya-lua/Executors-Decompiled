/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009416f4
 */

bool curl_strequal(byte *param_1,byte *param_2)

{
  byte bVar1;
  
  if ((param_1 == (byte *)0x0) || (param_2 == (byte *)0x0)) {
    return param_1 == (byte *)0x0 && param_2 == (byte *)0x0;
  }
  bVar1 = *param_1;
  if (bVar1 != 0) {
    do {
      param_1 = param_1 + 1;
      if ((ulong)*param_2 == 0) {
        bVar1 = 0;
        goto LAB_00941754;
      }
      if ((&DAT_007483d4)[bVar1] != (&DAT_007483d4)[*param_2]) {
        return false;
      }
      bVar1 = *param_1;
      param_2 = param_2 + 1;
    } while (bVar1 != 0);
  }
  bVar1 = 1;
LAB_00941754:
  return (bool)(bVar1 ^ *param_2 == 0 ^ 1);
}

