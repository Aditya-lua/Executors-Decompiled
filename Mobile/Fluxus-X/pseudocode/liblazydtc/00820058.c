/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00820058
 */

void FUN_00820058(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 9;
    param_1[1] = param_1[1] ^ 0xc33bf109534f19bb;
    *param_1 = *param_1 ^ 0xc33bf109534f19bb;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x534f19bb;
  }
  return;
}

