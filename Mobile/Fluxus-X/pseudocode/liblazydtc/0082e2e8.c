/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082e2e8
 */

void FUN_0082e2e8(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0x1b901cb3db53f77;
    *param_1 = *param_1 ^ 0x1b901cb3db53f77;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x3db53f77;
  }
  return;
}

