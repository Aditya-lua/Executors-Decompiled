/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00803774
 */

void FUN_00803774(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x13) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x37;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x71;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0xdb;
    param_1[1] = param_1[1] ^ 0xd53df29ffdb7137;
    *param_1 = *param_1 ^ 0xd53df29ffdb7137;
  }
  return;
}

