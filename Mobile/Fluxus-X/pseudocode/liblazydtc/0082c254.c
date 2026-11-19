/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082c254
 */

void FUN_0082c254(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x13) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x15;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0xd7;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0x9b;
    param_1[1] = param_1[1] ^ 0x213fa5c5059bd715;
    *param_1 = *param_1 ^ 0x213fa5c5059bd715;
  }
  return;
}

