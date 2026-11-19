/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00836e04
 */

void FUN_00836e04(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x1f;
    param_1[1] = param_1[1] ^ 0xe57fbf1f7b375791;
    *param_1 = *param_1 ^ 0xe57fbf1f7b375791;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x7b375791;
  }
  return;
}

