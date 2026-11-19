/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946f8c
 */

undefined4 FUN_00946f8c(int param_1)

{
  if (param_1 - 5U < 4) {
    return *(undefined4 *)(&DAT_0029c270 + (long)(int)(param_1 - 5U) * 4);
  }
  return 3;
}

