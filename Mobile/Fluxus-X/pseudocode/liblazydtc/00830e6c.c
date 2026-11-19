/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00830e6c
 */

void FUN_00830e6c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xbb;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x3b;
    param_1[1] = param_1[1] ^ 0x65a9098d09c13bbb;
    *param_1 = *param_1 ^ 0x65a9098d09c13bbb;
  }
  return;
}

