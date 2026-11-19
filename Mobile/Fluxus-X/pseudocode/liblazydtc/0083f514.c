/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f514
 */

void FUN_0083f514(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x93;
    param_1[1] = param_1[1] ^ 0x11df7d4d51f12393;
    *param_1 = *param_1 ^ 0x11df7d4d51f12393;
  }
  return;
}

