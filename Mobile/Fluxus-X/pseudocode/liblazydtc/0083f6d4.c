/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f6d4
 */

void FUN_0083f6d4(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xa9;
    param_1[1] = param_1[1] ^ 0x5f937352d2b3ba9;
    *param_1 = *param_1 ^ 0x5f937352d2b3ba9;
  }
  return;
}

