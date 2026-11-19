/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00837810
 */

void FUN_00837810(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x23;
    param_1[1] = param_1[1] ^ 0x79e9a5d7e9ffe523;
    *param_1 = *param_1 ^ 0x79e9a5d7e9ffe523;
  }
  return;
}

