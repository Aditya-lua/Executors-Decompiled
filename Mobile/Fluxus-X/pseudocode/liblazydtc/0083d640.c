/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083d640
 */

void FUN_0083d640(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x16) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x16) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x5b;
    *(byte *)((long)param_1 + 0x15) = *(byte *)((long)param_1 + 0x15) ^ 0xc1;
    param_1[1] = param_1[1] ^ 0x2771c15b97cd7b63;
    *param_1 = *param_1 ^ 0x2771c15b97cd7b63;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x97cd7b63;
  }
  return;
}

