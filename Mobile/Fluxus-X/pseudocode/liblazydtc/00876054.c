/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00876054
 */

bool FUN_00876054(long param_1,long param_2,int param_3)

{
  uint uVar1;
  
  uVar1 = param_3 + ~(uint)param_2;
  if (uVar1 < 0x100) {
    *(uint *)(*(long *)(param_1 + 0x30) + param_2 * 4) =
         *(uint *)(*(long *)(param_1 + 0x30) + param_2 * 4) | uVar1 * 0x1000000;
  }
  return uVar1 < 0x100;
}

