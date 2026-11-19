/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e514
 */

void FUN_0084e514(ulong *param_1)

{
  if (*(char *)((long)param_1 + 9) == '\x01') {
    *(undefined1 *)((long)param_1 + 9) = 0;
    *(byte *)(param_1 + 1) = (byte)param_1[1] ^ 0xbf;
    *param_1 = *param_1 ^ 0xbf7167c7934d83bf;
  }
  return;
}

