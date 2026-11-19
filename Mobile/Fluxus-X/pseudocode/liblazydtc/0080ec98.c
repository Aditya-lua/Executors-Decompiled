/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080ec98
 */

void FUN_0080ec98(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x7b;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x59;
    param_1[1] = param_1[1] ^ 0xbd135187336b597b;
    *param_1 = *param_1 ^ 0xbd135187336b597b;
  }
  return;
}

