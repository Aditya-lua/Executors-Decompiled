/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f590
 */

void FUN_0083f590(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xd1;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x95;
    param_1[1] = param_1[1] ^ 0x55b1e5b363fd95d1;
    *param_1 = *param_1 ^ 0x55b1e5b363fd95d1;
  }
  return;
}

