/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00827588
 */

void FUN_00827588(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x13) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xd;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0xf5;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0xc9;
    param_1[1] = param_1[1] ^ 0x435bd9b765c9f50d;
    *param_1 = *param_1 ^ 0x435bd9b765c9f50d;
  }
  return;
}

