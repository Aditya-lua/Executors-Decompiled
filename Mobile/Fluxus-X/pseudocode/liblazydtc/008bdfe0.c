/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bdfe0
 */

long FUN_008bdfe0(long param_1,uint param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = FUN_008bb440(param_1,param_3);
  if (*(int *)(lVar1 + 0xc) == 0) {
    lVar1 = 0;
    *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) | (byte)(1 << (ulong)(param_2 & 0x1f));
  }
  return lVar1;
}

