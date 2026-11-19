/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00826230
 */

void FUN_00826230(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xcb;
    param_1[1] = param_1[1] ^ 0xb129a74f0b2f6bcb;
    *param_1 = *param_1 ^ 0xb129a74f0b2f6bcb;
  }
  return;
}

