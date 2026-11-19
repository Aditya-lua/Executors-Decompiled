/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009089d0
 */

bool FUN_009089d0(long param_1,int param_2)

{
  if (*(long *)(*(long *)(param_1 + 0x20) + (long)param_2 * 0x10 + 600) < 1) {
    return 0 < *(int *)(*(long *)(param_1 + 0x20) + (long)param_2 * 0x10 + 0x260);
  }
  return true;
}

