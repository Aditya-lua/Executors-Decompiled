/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008378c4
 */

void FUN_008378c4(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0x73;
    param_1[1] = param_1[1] ^ 0x7d27a173ddebdf93;
    *param_1 = *param_1 ^ 0x7d27a173ddebdf93;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0xddebdf93;
  }
  return;
}

