/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009683b8
 */

void FUN_009683b8(long param_1)

{
  if ((*(long *)(param_1 + 0xd0) == 0) || ((*(byte *)(*(long *)(param_1 + 0xd0) + 4) >> 4 & 1) == 0)
     ) {
    return;
  }
  FUN_0093f680(param_1,4);
  return;
}

