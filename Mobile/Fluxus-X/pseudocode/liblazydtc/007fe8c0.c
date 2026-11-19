/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe8c0
 */

void FUN_007fe8c0(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x45;
    param_1[1] = param_1[1] ^ 0x5f694973d3c78945;
    *param_1 = *param_1 ^ 0x5f694973d3c78945;
  }
  return;
}

