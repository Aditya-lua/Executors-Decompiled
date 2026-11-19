/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00830e2c
 */

void FUN_00830e2c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xbf;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x83;
    param_1[1] = param_1[1] ^ 0xbf7167c7934d83bf;
    *param_1 = *param_1 ^ 0xbf7167c7934d83bf;
  }
  return;
}

