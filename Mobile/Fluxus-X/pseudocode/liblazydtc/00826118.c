/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00826118
 */

void FUN_00826118(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x7b;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0xf9;
    param_1[1] = param_1[1] ^ 0x4971799d23e9f97b;
    *param_1 = *param_1 ^ 0x4971799d23e9f97b;
  }
  return;
}

