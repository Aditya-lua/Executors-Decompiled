/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008036a0
 */

void FUN_008036a0(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x8d;
    param_1[1] = param_1[1] ^ 0xf53e9eb1b253f8d;
    *param_1 = *param_1 ^ 0xf53e9eb1b253f8d;
  }
  return;
}

