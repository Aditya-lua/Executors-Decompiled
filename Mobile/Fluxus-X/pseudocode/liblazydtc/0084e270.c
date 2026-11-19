/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e270
 */

void FUN_0084e270(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0xc) == '\x01') {
    *(undefined1 *)((long)param_1 + 0xc) = 0;
    *param_1 = *param_1 ^ 0xf34995d9c52d9dfd;
    *(uint *)(param_1 + 1) = (uint)param_1[1] ^ 0xc52d9dfd;
  }
  return;
}

