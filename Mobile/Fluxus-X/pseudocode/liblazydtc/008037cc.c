/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008037cc
 */

void FUN_008037cc(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xc5;
    param_1[1] = param_1[1] ^ 0x7f0965650969d1c5;
    *param_1 = *param_1 ^ 0x7f0965650969d1c5;
  }
  return;
}

