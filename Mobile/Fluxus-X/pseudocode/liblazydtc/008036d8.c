/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008036d8
 */

void FUN_008036d8(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x13;
    param_1[1] = param_1[1] ^ 0xf5578f1333032df5;
    *param_1 = *param_1 ^ 0xf5578f1333032df5;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x33032df5;
  }
  return;
}

