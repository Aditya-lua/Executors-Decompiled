/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088265c
 */

void FUN_0088265c(long *param_1)

{
  if (*param_1 != 0) {
                    /* try { // try from 00882674 to 0088267b has its CatchHandler @ 0088268c */
    FUN_00882bf8(param_1);
  }
  operator_delete((void *)param_1[3]);
  return;
}

