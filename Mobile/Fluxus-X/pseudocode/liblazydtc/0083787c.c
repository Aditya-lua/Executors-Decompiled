/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083787c
 */

void FUN_0083787c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xb9;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x9b;
    param_1[1] = param_1[1] ^ 0x89dd65ef49e19bb9;
    *param_1 = *param_1 ^ 0x89dd65ef49e19bb9;
  }
  return;
}

