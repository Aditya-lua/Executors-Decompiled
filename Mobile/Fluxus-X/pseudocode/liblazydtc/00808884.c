/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00808884
 */

void FUN_00808884(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xdf;
    param_1[1] = param_1[1] ^ 0xebe1417985296fdf;
    *param_1 = *param_1 ^ 0xebe1417985296fdf;
  }
  return;
}

