/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00820284
 */

void FUN_00820284(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xaf;
    param_1[1] = param_1[1] ^ 0xa9c5c59d8ba15baf;
    *param_1 = *param_1 ^ 0xa9c5c59d8ba15baf;
  }
  return;
}

