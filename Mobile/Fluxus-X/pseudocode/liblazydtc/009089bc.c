/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009089bc
 */

void FUN_009089bc(long param_1,int param_2)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x20) + (long)param_2 * 0x10;
  *(undefined8 *)(lVar1 + 0x260) = 0;
  *(undefined8 *)(lVar1 + 600) = 0;
  return;
}

