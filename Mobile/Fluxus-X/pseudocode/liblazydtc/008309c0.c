/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008309c0
 */

void FUN_008309c0(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x16) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x16) = 0;
    *(byte *)((long)param_1 + 0x15) = *(byte *)((long)param_1 + 0x15) ^ 0x89;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0xf;
    param_1[1] = param_1[1] ^ 0xcd15890f1fef9f7d;
    *param_1 = *param_1 ^ 0xcd15890f1fef9f7d;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x1fef9f7d;
  }
  return;
}

