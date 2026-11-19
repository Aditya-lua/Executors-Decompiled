/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082e9dc
 */

void FUN_0082e9dc(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xe3;
    param_1[1] = param_1[1] ^ 0x531159730ffd5de3;
    *param_1 = *param_1 ^ 0x531159730ffd5de3;
  }
  return;
}

