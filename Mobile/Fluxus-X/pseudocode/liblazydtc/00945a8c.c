/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945a8c
 */

ushort FUN_00945a8c(long param_1,long param_2)

{
  if (*(long *)(param_2 + 0x12f0) == 0) {
    return (*(ushort *)(param_1 + 0x18) & *(ushort *)(param_1 + 0x1a)) >> 5 & 1;
  }
  return 1;
}

