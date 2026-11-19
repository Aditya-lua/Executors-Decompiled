/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f70c
 */

void FUN_0083f70c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x79;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x4f;
    param_1[1] = param_1[1] ^ 0x7dc1296b7bdb4f79;
    *param_1 = *param_1 ^ 0x7dc1296b7bdb4f79;
  }
  return;
}

