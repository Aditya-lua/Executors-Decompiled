/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092bb50
 */

byte FUN_0092bb50(long param_1)

{
  byte bVar1;
  
  bVar1 = 0;
  if (param_1 != 0) {
    bVar1 = *(byte *)(param_1 + 0x231) & 1;
  }
  return bVar1;
}

