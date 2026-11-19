/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00803804
 */

void FUN_00803804(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xd;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0xcd;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0x7f;
    param_1[1] = param_1[1] ^ 0x13bdc327057fcd0d;
    *param_1 = *param_1 ^ 0x13bdc327057fcd0d;
    *(undefined1 *)((long)param_1 + 0x13) = 0;
  }
  return;
}

