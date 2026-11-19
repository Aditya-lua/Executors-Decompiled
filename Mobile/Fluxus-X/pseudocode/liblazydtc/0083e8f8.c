/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083e8f8
 */

void FUN_0083e8f8(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x1c) == '\x01') {
    *(byte *)(param_1 + 3) = (byte)param_1[3] ^ 0x73;
    *(undefined1 *)((long)param_1 + 0x1c) = 0;
    *(byte *)((long)param_1 + 0x19) = *(byte *)((long)param_1 + 0x19) ^ 0x29;
    *(byte *)((long)param_1 + 0x1a) = *(byte *)((long)param_1 + 0x1a) ^ 0x7f;
    *param_1 = *param_1 ^ 0x8507b7b97b7f2973;
    param_1[1] = param_1[1] ^ 0x8507b7b97b7f2973;
    param_1[2] = param_1[2] ^ 0x8507b7b97b7f2973;
    *(byte *)((long)param_1 + 0x1b) = *(byte *)((long)param_1 + 0x1b) ^ 0x7b;
  }
  return;
}

