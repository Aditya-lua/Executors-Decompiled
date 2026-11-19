/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd8f4
 */

void FUN_008dd8f4(long param_1,uint param_2)

{
  *(ulong *)(param_1 + (ulong)(0x3f < (int)param_2) * 8) =
       *(ulong *)(param_1 + (ulong)(0x3f < (int)param_2) * 8) | 1L << ((ulong)param_2 & 0x3f);
  return;
}

