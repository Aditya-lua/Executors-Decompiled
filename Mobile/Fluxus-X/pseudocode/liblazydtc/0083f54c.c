/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f54c
 */

void FUN_0083f54c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0xadeb53a18db79771;
    *param_1 = *param_1 ^ 0xadeb53a18db79771;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x8db79771;
  }
  return;
}

