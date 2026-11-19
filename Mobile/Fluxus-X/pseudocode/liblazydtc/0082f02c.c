/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082f02c
 */

void FUN_0082f02c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x5f;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x3d;
    param_1[1] = param_1[1] ^ 0xcb93bf57cb393d5f;
    *param_1 = *param_1 ^ 0xcb93bf57cb393d5f;
  }
  return;
}

