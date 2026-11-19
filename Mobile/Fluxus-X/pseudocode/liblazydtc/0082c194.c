/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082c194
 */

void FUN_0082c194(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xf9;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x15;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0x57;
    param_1[1] = param_1[1] ^ 0x298149372f5715f9;
    *param_1 = *param_1 ^ 0x298149372f5715f9;
    *(undefined1 *)((long)param_1 + 0x13) = 0;
  }
  return;
}

