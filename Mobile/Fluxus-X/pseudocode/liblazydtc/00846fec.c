/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00846fec
 */

void FUN_00846fec(ulong *param_1)

{
  if ((param_1[3] & 1) != 0) {
    operator_delete((void *)param_1[5],param_1[3] & 0xfffffffffffffffe);
  }
  if ((*param_1 & 1) == 0) {
    return;
  }
  operator_delete((void *)param_1[2],*param_1 & 0xfffffffffffffffe);
  return;
}

