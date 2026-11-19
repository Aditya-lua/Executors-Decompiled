/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082f074
 */

void FUN_0082f074(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0x9f97fbe36f2d0fbb;
    *param_1 = *param_1 ^ 0x9f97fbe36f2d0fbb;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x6f2d0fbb;
  }
  return;
}

