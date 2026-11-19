/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f1bc
 */

byte FUN_0092f1bc(long param_1)

{
  byte bVar1;
  
  bVar1 = 0;
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0xc0) == 0) {
      return 0;
    }
    bVar1 = *(byte *)(*(long *)(param_1 + 0xc0) + 0x231) >> 2 & 1;
  }
  return bVar1;
}

