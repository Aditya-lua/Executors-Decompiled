/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00837128
 */

void FUN_00837128(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x59;
    param_1[1] = param_1[1] ^ 0x36d5f5901777103;
    *param_1 = *param_1 ^ 0x36d5f5901777103;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x1777103;
  }
  return;
}

