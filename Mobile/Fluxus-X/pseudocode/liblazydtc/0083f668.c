/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f668
 */

void FUN_0083f668(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x17;
    param_1[1] = param_1[1] ^ 0xf8df3d1279b4717;
    *param_1 = *param_1 ^ 0xf8df3d1279b4717;
  }
  return;
}

