/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082e5c4
 */

void FUN_0082e5c4(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0xb834d216d5367e7;
    *param_1 = *param_1 ^ 0xb834d216d5367e7;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x6d5367e7;
  }
  return;
}

