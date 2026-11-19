/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00803858
 */

void FUN_00803858(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x8d;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0xf5;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0xbf;
    param_1[1] = param_1[1] ^ 0xdd3955d9efbff58d;
    *param_1 = *param_1 ^ 0xdd3955d9efbff58d;
    *(undefined1 *)((long)param_1 + 0x13) = 0;
  }
  return;
}

