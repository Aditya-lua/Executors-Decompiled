/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b33a4
 */

bool FUN_008b33a4(long param_1,long param_2)

{
  for (; (param_1 != param_2 && (param_1 != 0)); param_1 = *(long *)(param_1 + 0x20)) {
  }
  return param_1 != 0;
}

