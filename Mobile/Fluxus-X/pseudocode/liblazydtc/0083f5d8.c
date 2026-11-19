/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f5d8
 */

void FUN_0083f5d8(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xc5;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x41;
    param_1[1] = param_1[1] ^ 0x36fe57fe7f341c5;
    *param_1 = *param_1 ^ 0x36fe57fe7f341c5;
  }
  return;
}

