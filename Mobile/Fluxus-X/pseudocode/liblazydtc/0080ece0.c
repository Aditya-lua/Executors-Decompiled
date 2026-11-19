/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080ece0
 */

void FUN_0080ece0(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x7d;
    param_1[1] = param_1[1] ^ 0x37fa3f507f7a77d;
    *param_1 = *param_1 ^ 0x37fa3f507f7a77d;
  }
  return;
}

