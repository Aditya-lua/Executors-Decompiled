/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082c2ac
 */

void FUN_0082c2ac(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0x99c9b36339a13991;
    *param_1 = *param_1 ^ 0x99c9b36339a13991;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x39a13991;
  }
  return;
}

