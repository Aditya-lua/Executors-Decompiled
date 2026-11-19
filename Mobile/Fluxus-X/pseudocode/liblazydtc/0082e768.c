/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082e768
 */

void FUN_0082e768(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0xef379d67b145a519;
    *param_1 = *param_1 ^ 0xef379d67b145a519;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0xb145a519;
  }
  return;
}

