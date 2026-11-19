/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00837918
 */

void FUN_00837918(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x13) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x19;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0xb;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0x43;
    param_1[1] = param_1[1] ^ 0xcff1734fb9430b19;
    *param_1 = *param_1 ^ 0xcff1734fb9430b19;
  }
  return;
}

