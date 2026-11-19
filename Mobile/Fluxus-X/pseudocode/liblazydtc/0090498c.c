/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090498c
 */

undefined8 FUN_0090498c(long *param_1,ulong param_2)

{
  if ((ulong)param_1[1] < param_2) {
    return 0x2b;
  }
  param_1[1] = param_2;
  *(undefined1 *)(*param_1 + param_2) = 0;
  return 0;
}

