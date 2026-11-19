/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3e4c
 */

int FUN_008b3e4c(long param_1,int param_2)

{
  if (*(long *)(param_1 + 0x90) == 0) {
    return 0;
  }
  return *(int *)(*(long *)(param_1 + 8) + (long)(param_2 >> (*(uint *)(param_1 + 0xa8) & 0x1f)) * 4
                 ) + (uint)*(byte *)(*(long *)(param_1 + 0x90) + (long)param_2);
}

