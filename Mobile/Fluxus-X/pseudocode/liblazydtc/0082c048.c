/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082c048
 */

void FUN_0082c048(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0xf34995d9c52d9dfd;
    *param_1 = *param_1 ^ 0xf34995d9c52d9dfd;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0xc52d9dfd;
  }
  return;
}

