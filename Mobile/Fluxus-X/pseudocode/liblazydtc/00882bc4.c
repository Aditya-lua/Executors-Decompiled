/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00882bc4
 */

void FUN_00882bc4(long *param_1)

{
  if (*param_1 != 0) {
                    /* try { // try from 00882bdc to 00882be3 has its CatchHandler @ 00882bf4 */
    FUN_00882ff0(param_1);
  }
  operator_delete((void *)param_1[3]);
  return;
}

