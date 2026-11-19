/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00803604
 */

void FUN_00803604(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x23;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x3d;
    param_1[1] = param_1[1] ^ 0x8d8f017d7d7f3d23;
    *param_1 = *param_1 ^ 0x8d8f017d7d7f3d23;
  }
  return;
}

