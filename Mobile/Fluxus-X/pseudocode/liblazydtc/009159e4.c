/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009159e4
 */

void FUN_009159e4(byte *param_1,long param_2,char *param_3,ulong param_4)

{
  char *pcVar1;
  
  if (((param_1 == (byte *)0x0) || (param_2 == 0)) || (param_4 < 3)) {
    if (param_4 == 0) {
      return;
    }
  }
  else {
    param_2 = -param_2;
    pcVar1 = param_3;
    do {
      param_2 = param_2 + 1;
      param_4 = param_4 - 2;
      param_3 = pcVar1 + 2;
      *pcVar1 = "0123456789abcdef"[*param_1 >> 4];
      pcVar1[1] = "0123456789abcdef"[(ulong)*param_1 & 0xf];
      if (param_2 == 0) break;
      param_1 = param_1 + 1;
      pcVar1 = param_3;
    } while (2 < param_4);
  }
  *param_3 = '\0';
  return;
}

