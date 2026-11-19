/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00836f2c
 */

void FUN_00836f2c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x65;
    param_1[1] = param_1[1] ^ 0x7f0965650969d1c5;
    *param_1 = *param_1 ^ 0x7f0965650969d1c5;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x969d1c5;
  }
  return;
}

