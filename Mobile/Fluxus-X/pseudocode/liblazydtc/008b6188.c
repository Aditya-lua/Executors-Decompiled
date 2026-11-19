/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b6188
 */

void FUN_008b6188(long param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x60);
  if (*(byte *)(lVar1 + 1) - 1 < 3) {
    FUN_008b61bc(lVar1,param_3);
    return;
  }
  *(byte *)(param_2 + 2) = *(byte *)(param_2 + 2) & 0xf8 | *(byte *)(lVar1 + 2) & 3;
  return;
}

