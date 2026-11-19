/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b63a4
 */

void FUN_008b63a4(long param_1,long param_2,undefined8 *param_3)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x60);
  *(byte *)(param_2 + 2) = *(byte *)(param_2 + 2) & 0xfb;
  *param_3 = *(undefined8 *)(lVar1 + 0x60);
  *(long *)(lVar1 + 0x60) = param_2;
  return;
}

