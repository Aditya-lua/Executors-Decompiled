/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f484
 */

void FUN_0083f484(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x75;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 5;
    param_1[1] = param_1[1] ^ 0x4d935583657f0575;
    *param_1 = *param_1 ^ 0x4d935583657f0575;
  }
  return;
}

