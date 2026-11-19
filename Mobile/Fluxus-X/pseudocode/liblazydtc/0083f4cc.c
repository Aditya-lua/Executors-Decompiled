/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f4cc
 */

void FUN_0083f4cc(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x7b;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x2f;
    param_1[1] = param_1[1] ^ 0x5d6d1da3657d2f7b;
    *param_1 = *param_1 ^ 0x5d6d1da3657d2f7b;
  }
  return;
}

