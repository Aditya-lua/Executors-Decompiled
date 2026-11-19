/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090eb78
 */

void FUN_0090eb78(long param_1)

{
  if (((*(long **)(param_1 + 0xda0) != (long *)0x0) && (**(long **)(param_1 + 0xda0) != 0)) &&
     ((*(byte *)(param_1 + 0xa82) >> 6 & 1) == 0)) {
    FUN_0090fa8c();
    *(byte *)(param_1 + 0xdb8) = *(byte *)(param_1 + 0xdb8) | 1;
  }
  FUN_0090ea5c(param_1 + 0xd90);
  return;
}

