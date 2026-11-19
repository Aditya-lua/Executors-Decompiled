/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082f0b8
 */

void FUN_0082f0b8(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x3f;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x91;
    param_1[1] = param_1[1] ^ 0xe58d7b2159e3913f;
    *param_1 = *param_1 ^ 0xe58d7b2159e3913f;
  }
  return;
}

