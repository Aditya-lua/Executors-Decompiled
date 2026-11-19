/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968c14
 */

bool FUN_00968c14(long *param_1)

{
  return ((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) == 0;
}

