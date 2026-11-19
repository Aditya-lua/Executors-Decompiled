/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd8dc
 */

uint FUN_008dd8dc(long param_1,uint param_2)

{
  return (uint)(*(ulong *)(param_1 + (ulong)(0x3f < (int)param_2) * 8) >> ((ulong)param_2 & 0x3f)) &
         1;
}

