/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00837848
 */

void FUN_00837848(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xbb;
    param_1[1] = param_1[1] ^ 0x9f97fbe36f2d0fbb;
    *param_1 = *param_1 ^ 0x9f97fbe36f2d0fbb;
  }
  return;
}

