/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f198
 */

void FUN_0092f198(long param_1,byte param_2)

{
  long lVar1;
  
  if ((param_1 != 0) && (lVar1 = *(long *)(param_1 + 0xc0), lVar1 != 0)) {
    *(byte *)(lVar1 + 0x231) = *(byte *)(lVar1 + 0x231) & 0xfb | (param_2 & 1) << 2;
  }
  return;
}

