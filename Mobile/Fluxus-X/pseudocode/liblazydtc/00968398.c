/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968398
 */

void FUN_00968398(long param_1)

{
  if ((*(long *)(param_1 + 0xd0) == 0) || ((*(byte *)(*(long *)(param_1 + 0xd0) + 4) >> 4 & 1) == 0)
     ) {
    return;
  }
  FUN_0093f628(param_1,4,2);
  return;
}

