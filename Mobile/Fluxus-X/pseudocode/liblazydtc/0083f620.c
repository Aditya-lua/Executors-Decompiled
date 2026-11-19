/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f620
 */

void FUN_0083f620(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x12) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x12) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x4d;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x3b;
    param_1[1] = param_1[1] ^ 0x914d8b51e9fd3b4d;
    *param_1 = *param_1 ^ 0x914d8b51e9fd3b4d;
  }
  return;
}

