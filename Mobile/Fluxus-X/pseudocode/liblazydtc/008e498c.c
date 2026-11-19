/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e498c
 */

void FUN_008e498c(undefined8 param_1,long param_2,ulong param_3)

{
  FUN_008e4874(param_1,*(uint *)(param_2 + 8) |
                       (uint)(param_3 >> 9) & 0xffffe0 | ((uint)param_3 >> 0xc & 3) << 0x1d |
                       0x90000000);
  return;
}

