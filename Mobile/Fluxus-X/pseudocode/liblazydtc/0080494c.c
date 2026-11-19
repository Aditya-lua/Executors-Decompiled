/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080494c
 */

void FUN_0080494c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x6f;
    param_1[1] = param_1[1] ^ 0x4bad89f9137bcf6f;
    *param_1 = *param_1 ^ 0x4bad89f9137bcf6f;
  }
  return;
}

