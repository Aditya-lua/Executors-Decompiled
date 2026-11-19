/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa250
 */

uint FUN_008aa250(byte *param_1,long param_2)

{
  uint uVar1;
  
  if (param_2 == 0) {
    return 0x811c9dc5;
  }
  uVar1 = 0x811c9dc5;
  do {
    param_2 = param_2 + -1;
    uVar1 = (uVar1 ^ *param_1) * 0x1000193;
    param_1 = param_1 + 1;
  } while (param_2 != 0);
  return uVar1;
}

