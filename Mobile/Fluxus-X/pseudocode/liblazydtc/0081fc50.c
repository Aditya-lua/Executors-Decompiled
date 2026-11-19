/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081fc50
 */

void FUN_0081fc50(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0xa9fb6ded3163673b;
    *param_1 = *param_1 ^ 0xa9fb6ded3163673b;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x3163673b;
  }
  return;
}

