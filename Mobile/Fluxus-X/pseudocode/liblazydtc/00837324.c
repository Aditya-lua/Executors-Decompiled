/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00837324
 */

void FUN_00837324(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x27;
    param_1[1] = param_1[1] ^ 0x13bdc327057fcd0d;
    *param_1 = *param_1 ^ 0x13bdc327057fcd0d;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x57fcd0d;
  }
  return;
}

