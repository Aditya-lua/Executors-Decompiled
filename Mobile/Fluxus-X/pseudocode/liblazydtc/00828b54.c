/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828b54
 */

void FUN_00828b54(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xe9;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x19;
    param_1[1] = param_1[1] ^ 0xdb3f9129e75119e9;
    *param_1 = *param_1 ^ 0xdb3f9129e75119e9;
  }
  return;
}

