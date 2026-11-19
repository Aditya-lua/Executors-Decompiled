/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080364c
 */

void FUN_0080364c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x23;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x3d;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0x7f;
    param_1[1] = param_1[1] ^ 0x8d8f017d7d7f3d23;
    *param_1 = *param_1 ^ 0x8d8f017d7d7f3d23;
    *(undefined1 *)((long)param_1 + 0x13) = 0;
  }
  return;
}

