/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00882690
 */

void FUN_00882690(long *param_1)

{
  if (*param_1 != 0) {
                    /* try { // try from 008826a8 to 008826af has its CatchHandler @ 008826c0 */
    FUN_00882da0(param_1);
  }
  operator_delete((void *)param_1[3]);
  return;
}

