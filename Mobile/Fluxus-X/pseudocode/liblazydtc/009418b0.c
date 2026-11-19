/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009418b0
 */

byte FUN_009418b0(byte *param_1,byte *param_2)

{
  byte bVar1;
  byte bVar2;
  
  if ((param_1 == (byte *)0x0) || (param_2 == (byte *)0x0)) {
    return param_1 != (byte *)0x0 || param_2 != (byte *)0x0;
  }
  bVar2 = 0;
  do {
    bVar1 = *param_2;
    bVar2 = bVar2 | bVar1 ^ *param_1;
    if (*param_1 == 0) {
      return bVar2;
    }
    param_1 = param_1 + 1;
    param_2 = param_2 + 1;
  } while (bVar1 != 0);
  return bVar2;
}

