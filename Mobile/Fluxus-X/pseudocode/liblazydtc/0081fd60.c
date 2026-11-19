/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081fd60
 */

void FUN_0081fd60(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x89;
    param_1[1] = param_1[1] ^ 0x31f9cd8969038921;
    *param_1 = *param_1 ^ 0x31f9cd8969038921;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x69038921;
  }
  return;
}

