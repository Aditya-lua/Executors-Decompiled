/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa958
 */

int FUN_008aa958(long param_1,int param_2)

{
  if (0xffffd8ef < param_2 - 1U) {
    param_2 = param_2 + (int)((ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x70)) >> 4) +
              1;
  }
  return param_2;
}

